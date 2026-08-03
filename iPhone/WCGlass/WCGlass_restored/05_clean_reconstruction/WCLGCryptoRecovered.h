#import <Foundation/Foundation.h>
#import <Security/Security.h>

NS_ASSUME_NONNULL_BEGIN
NSData * _Nullable WCLGAES256CBC(NSData *data, NSData *key, NSData *iv, BOOL decrypt);
NSData *WCLGHMACSHA256(NSData *data, NSData *key);
NSData *WCLGSHA256(NSData *data);
BOOL WCLGVerifyRSAPSSSHA256(SecKeyRef publicKey, NSData *message, NSData *signature, NSError **error);
NSData * _Nullable WCLGEncryptRSAOAEP_SHA256(SecKeyRef publicKey, NSData *data, NSError **error);
NS_ASSUME_NONNULL_END
