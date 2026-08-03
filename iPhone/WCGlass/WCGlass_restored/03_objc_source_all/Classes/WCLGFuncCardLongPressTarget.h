#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGFuncCardLongPressTarget : NSObject
+ (id)shared;
- (void)onLongPress:(id)arg0;
- (BOOL)gestureRecognizer:(id)arg0 shouldRecognizeSimultaneouslyWithGestureRecognizer:(id)arg1;
@end
