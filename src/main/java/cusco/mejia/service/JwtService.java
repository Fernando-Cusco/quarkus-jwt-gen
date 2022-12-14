package cusco.mejia.service;

import java.util.Set;

import javax.inject.Singleton;

import io.smallrye.jwt.build.Jwt;

@Singleton
public class JwtService {
    
    public String generateJwt() {
        Set<String> roles = Set.of("writer", "admin");
        return Jwt.issuer("product-jwt")
            .subject("product-jwt")
            .groups(roles)
            .expiresAt(System.currentTimeMillis() + 3600)
            .sign();
    }


}
