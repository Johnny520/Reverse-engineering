#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCGMultiDownloader : NSObject
- (void)start;
- (void)fetchRange:(id)arg0 session:(id)arg1;
- (void)emit;
- (void)finishOnMain:(id)arg0;
- (id)base;
- (void)setBase:(id)arg0;
- (id)token;
- (void)setToken:(id)arg0;
- (NSInteger)size;
- (void)setSize:(id)arg0;
- (NSInteger)threads;
- (void)setThreads:(id)arg0;
- (id)buffer;
- (void)setBuffer:(id)arg0;
- (NSInteger)received;
- (void)setReceived:(id)arg0;
- (NSInteger)pending;
- (void)setPending:(id)arg0;
- (BOOL)failed;
- (void)setFailed:(id)arg0;
- (id)lock;
- (void)setLock:(id)arg0;
- (id)speedTimer;
- (void)setSpeedTimer:(id)arg0;
- (NSInteger)lastSampleBytes;
- (void)setLastSampleBytes:(id)arg0;
- (double)lastSampleTime;
- (void)setLastSampleTime:(id)arg0;
- (id)progress;
- (void)setProgress:(id)arg0;
- (id)done;
- (void)setDone:(id)arg0;
- (void).cxx_destruct;
@end
