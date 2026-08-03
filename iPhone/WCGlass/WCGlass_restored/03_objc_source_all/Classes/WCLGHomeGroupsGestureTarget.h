#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGHomeGroupsGestureTarget : NSObject
- (BOOL)gestureRecognizerShouldBegin:(id)arg0;
- (BOOL)gestureRecognizer:(id)arg0 shouldRecognizeSimultaneouslyWithGestureRecognizer:(id)arg1;
- (void)wclgHandleLongPress:(id)arg0;
@end
