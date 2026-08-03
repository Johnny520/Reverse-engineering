#import <Foundation/Foundation.h>
#import <Security/Security.h>
#import "WCLGCryptoRecovered.h"

/* 原始入口：buildRequest=0x2F198C，decryptResponse=0x2F3140。 */
NSDictionary *WCLGBuildEncryptedRequest(NSDictionary *payload, SecKeyRef apiPublicKey,
                                        NSData **requestKeyOut, NSData **nonceOut, NSError **error) {
    NSData *json = [NSJSONSerialization dataWithJSONObject:payload options:0 error:error];
    if(!json) return nil;
    NSMutableData *key = [NSMutableData dataWithLength:32];
    NSMutableData *nonce = [NSMutableData dataWithLength:16];
    SecRandomCopyBytes(kSecRandomDefault, key.length, key.mutableBytes);
    SecRandomCopyBytes(kSecRandomDefault, nonce.length, nonce.mutableBytes);
    NSData *ciphertext = WCLGAES256CBC(json, key, nonce, NO);
    NSData *wrappedKey = WCLGEncryptRSAOAEP_SHA256(apiPublicKey, key, error);
    NSData *mac = WCLGHMACSHA256(ciphertext, key);
    if(!ciphertext || !wrappedKey) return nil;
    if(requestKeyOut) *requestKeyOut = key;
    if(nonceOut) *nonceOut = nonce;
    return @{ @"data": [ciphertext base64EncodedStringWithOptions:0],
              @"key": [wrappedKey base64EncodedStringWithOptions:0],
              @"nonce": [nonce base64EncodedStringWithOptions:0],
              @"mac": [mac base64EncodedStringWithOptions:0] };
}

NSDictionary *WCLGDecryptEncryptedResponse(NSDictionary *response, NSData *requestKey,
                                           NSData *nonce, SecKeyRef signatureKey, NSError **error) {
    NSData *ciphertext = [[NSData alloc] initWithBase64EncodedString:response[@"data"] options:0];
    NSData *signature = [[NSData alloc] initWithBase64EncodedString:response[@"signature"] options:0];
    if(!WCLGVerifyRSAPSSSHA256(signatureKey, ciphertext, signature, error)) return nil;
    NSData *plain = WCLGAES256CBC(ciphertext, requestKey, nonce, YES);
    if(!plain) return nil;
    id object = [NSJSONSerialization JSONObjectWithData:plain options:0 error:error];
    return [object isKindOfClass:NSDictionary.class] ? object : nil;
}
