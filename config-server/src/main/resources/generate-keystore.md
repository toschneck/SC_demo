To generate a new keystore use:


   ```

   keytool -genkeypair -alias demokeystore -keyalg RSA -dname "CN=Tobias Schneck, OU=Dev, O=ConSol, L=Munich,S=Bavaria,C=DE" -keypass consol -keystore ~/sc-keystore.jks -storepass consol


   ```