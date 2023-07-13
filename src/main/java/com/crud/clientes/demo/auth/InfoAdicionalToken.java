package com.crud.clientes.demo.auth;

import com.crud.clientes.demo.models.entity.Usuario;
import com.crud.clientes.demo.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class InfoAdicionalToken implements TokenEnhancer {

    @Autowired
    private IUsuarioService usuarioService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication oAuth2Authentication) {
       Usuario usuario = usuarioService.findByUsername(oAuth2Authentication.getName());
        Map<String,Object> info = new HashMap<>();
        info.put("info_adicional", "Hola que tal!".concat(oAuth2Authentication.getName()));
//        info.put("nombre_usuario", ": " + usuario.getUsername());

        info.put("nombre", usuario.getNombre());
        info.put("apellido", usuario.getApellido());
        info.put("email", usuario.getEmail());

        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
        return accessToken;
    }
}
