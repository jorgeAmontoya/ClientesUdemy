package com.crud.clientes.demo.auth;

public class JwtConfig {

    public static final String LLAVE_SECRETA = "alguna.clave.secreta.importante.12345678";
    public static final String RSA_PRIVADA = "-----BEGIN PRIVATE KEY-----\n" +
            "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDNyr2V4dPSay2g\n" +
            "hypxi6r0tR8um0AlhEMuQvGMQ8oW5FiweLHEGioR49BXelIXuRe9Fv+7nXT5lE33\n" +
            "GIxI5U7jH+uEJ3M8vwXA71S5dwopnkUxYLyBqI/1gmb2UYZf66au0FH3IZYfmkA/\n" +
            "mlwCPh0fCA1w0X4tSLoCv+UHSroebBsk3h4hw2TlJISg6dVH2SkfcTJLHbQJ0E9A\n" +
            "gpzBbhZcxA3VJjL9XfjYhCCN66dA1CALmemscNyRvkLo8bct1bpxNsA/PZOtWwFM\n" +
            "wvAsxWa52SQWwWxHtCRKdalzI9LVJhvrOMb+mtebjcnRNV9W1vWoCqI7Jj9TPRSU\n" +
            "3k8uQprPAgMBAAECggEAA898ujE/yFYmtqG6Ffcll7lg1e6W/frYeZtQuK2qqMja\n" +
            "oY3ikMSBQeqLeYswyPKq71vlKVati0+FMA2az2C7mLYHGN/YIOhSlXN5CKQdIo8l\n" +
            "LdhiNS5nV/7tpCL3T4BgCj2ePuq2ymgDR4o2qO34gRIXmZ6vbOw7UYC3H27xSk3i\n" +
            "pJm3VoiCQSi2Oxz7YJw3F7WylaJu+Zlhz2CBcSdM81oZ0hVQNHGhx/1m1Klq1Cit\n" +
            "DGUkW/mdeGotGWbzgwGa7kmz+fsVbyD1rDPqYm1+bV56BWaWbHFsERUq6b6wV2iK\n" +
            "G96vez8PphTjaam7gjOSR3sWVMhL2sp6vvAwWJBKMQKBgQDoTo+n2ECTKCbzZQjG\n" +
            "iYmhf8opAdrmKVXLwzySu34vXmmIyco4g3Uo0xY9UIGX96H0IxalPCsaQJM/4z7I\n" +
            "GFxt6SBV0qAVVSY4VREFiYnGWBZJUySFZ33IoKCvtoqWH8oaRa4OmYV7WtOskRvL\n" +
            "wTru34LsQ14tzl9ZbEBpJq1lPwKBgQDix+KsqYe3VTSLriywUcCPwu1UUWENynah\n" +
            "SRmQlQW2982P3raGZNkMb4Dpcygi/p7gr55tchIw2pPbImD+fjDY8rMaboBLJFUa\n" +
            "kydnIxmxSaBiwPP1vfbAZVNybJ+MOEkEMoGuLXyKvUqEgSaDq75Pw7TKWmDhS9Yg\n" +
            "9tgQRhqWcQKBgBd2T8X47lSuenicnK1ImNDp0iYgHNagGB0zQ7viGdV46Jm7H6Rj\n" +
            "ioKsBxP8PIp3pTC+FnxrvkKxgO2z6tRUuYkUQYLJegeNiQWpecWgZXzVyrJvJkIe\n" +
            "+LI5nuEAQ7Dz1vqeTP0Gfle+DaDhKviCNIyJoHRyPWHM9Q5YA41bLaoLAoGAGlRs\n" +
            "y/Eu8akx3ZnOVHZZbheKqIR+STSdi2JKVpAGxtSEiFSqSnZBAQGdLP2SxmVbmuio\n" +
            "8zoQRJ3MFuAp9MI/96BODR6RRKgmPVyicYYQwJW0ymJusLRqhrH8+0cDSytpxtP6\n" +
            "XHepgw4xLas1BoqVIPuu7OOLZf0BEni2Y0VQZvECgYBPn9TF4dt7oHMzBkzvTZlj\n" +
            "dVry/xn2zutQ1ly4AIlMOmelGSrqEzIakEhysLrIw9tKc5hYjgpszTgoV54srVaV\n" +
            "pnxVljsr8liiIPyWd6Gv4dIyRBjvrOp2zkZB4uxBCUpcIKr0vSa5b5TlygFisenE\n" +
            "8i5kFpTcVZrSQ7Q71Sm5Aw==\n" +
            "-----END PRIVATE KEY-----";

    public static final String RSA_PUBLICA="-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcq9leHT0mstoIcqcYuq\n" +
            "9LUfLptAJYRDLkLxjEPKFuRYsHixxBoqEePQV3pSF7kXvRb/u510+ZRN9xiMSOVO\n" +
            "4x/rhCdzPL8FwO9UuXcKKZ5FMWC8gaiP9YJm9lGGX+umrtBR9yGWH5pAP5pcAj4d\n" +
            "HwgNcNF+LUi6Ar/lB0q6HmwbJN4eIcNk5SSEoOnVR9kpH3EySx20CdBPQIKcwW4W\n" +
            "XMQN1SYy/V342IQgjeunQNQgC5nprHDckb5C6PG3LdW6cTbAPz2TrVsBTMLwLMVm\n" +
            "udkkFsFsR7QkSnWpcyPS1SYb6zjG/prXm43J0TVfVtb1qAqiOyY/Uz0UlN5PLkKa\n" +
            "zwIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}
