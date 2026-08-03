#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGHomeGroupsControllerState : NSObject
- (BOOL)fullscreenRowsBusy;
- (void)setFullscreenRowsBusy:(id)arg0;
- (BOOL)fullscreenCapsulePositionPending;
- (void)setFullscreenCapsulePositionPending:(id)arg0;
- (BOOL)fullscreenCapsulePositionScheduled;
- (void)setFullscreenCapsulePositionScheduled:(id)arg0;
- (NSUInteger)fullscreenCapsulePositionScheduledEpoch;
- (void)setFullscreenCapsulePositionScheduledEpoch:(id)arg0;
- (NSUInteger)fullscreenCapsulePositionAttemptCount;
- (void)setFullscreenCapsulePositionAttemptCount:(id)arg0;
- (NSUInteger)fullscreenCapsulePositionTargetToken;
- (void)setFullscreenCapsulePositionTargetToken:(id)arg0;
- (NSUInteger)fullscreenCapsulePositionEpoch;
- (void)setFullscreenCapsulePositionEpoch:(id)arg0;
@end
