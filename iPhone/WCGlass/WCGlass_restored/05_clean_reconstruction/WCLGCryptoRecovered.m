#import "WCLGCryptoRecovered.h"
#import <CommonCrypto/CommonCrypto.h>

NSData *WCLGAES256CBC(NSData *data, NSData *key, NSData *iv, BOOL decrypt) {
    if(data.length == 0 || key.length != kCCKeySizeAES256 || iv.length != kCCBlockSizeAES128) {
        return nil;
    }
    NSMutableData *output = [NSMutableData dataWithLength:data.length + kCCBlockSizeAES128];
    size_t moved = 0;
    CCCryptorStatus status = CCCrypt(decrypt ? kCCDecrypt : kCCEncrypt,
                                     kCCAlgorithmAES,
                                     kCCOptionPKCS7Padding,
                                     key.bytes, key.length,
                                     iv.bytes,
                                     data.bytes, data.length,
                                     output.mutableBytes, output.length,
                                     &moved);
    if(status != kCCSuccess) return nil;
    output.length = moved;
    return output;
}

NSData *WCLGHMACSHA256(NSData *data, NSData *key) {
    unsigned char digest[CC_SHA256_DIGEST_LENGTH] = {0};
    CCHmac(kCCHmacAlgSHA256, key.bytes, key.length, data.bytes, data.length, digest);
    return [NSData dataWithBytes:digest length:sizeof(digest)];
}

NSData *WCLGSHA256(NSData *data) {
    unsigned char digest[CC_SHA256_DIGEST_LENGTH] = {0};
    CC_SHA256(data.bytes, (CC_LONG)data.length, digest);
    return [NSData dataWithBytes:digest length:sizeof(digest)];
}

BOOL WCLGVerifyRSAPSSSHA256(SecKeyRef publicKey, NSData *message, NSData *signature, NSError **error) {
    if(!publicKey || !message || !signature) return NO;
    return SecKeyVerifySignature(publicKey,
                                 kSecKeyAlgorithmRSASignatureMessagePSSSHA256,
                                 (__bridge CFDataRef)message,
                                 (__bridge CFDataRef)signature,
                                 (CFErrorRef *)error);
}

NSData *WCLGEncryptRSAOAEP_SHA256(SecKeyRef publicKey, NSData *data, NSError **error) {
    if(!publicKey || !data) return nil;
    CFDataRef result = SecKeyCreateEncryptedData(publicKey,
                                                 kSecKeyAlgorithmRSAEncryptionOAEPSHA256,
                                                 (__bridge CFDataRef)data,
                                                 (CFErrorRef *)error);
    return CFBridgingRelease(result);
}
