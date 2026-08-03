#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGKeyboardObserver : NSObject
+ (id)sharedObserver;
- (void)updateFromNote:(id)arg0 visibleHint:(id)arg1;
- (void)keyboardWillShow:(id)arg0;
- (void)keyboardWillHide:(id)arg0;
- (void)keyboardDidShow:(id)arg0;
- (void)keyboardDidHide:(id)arg0;
- (void)keyboardWillChangeFrame:(id)arg0;
- (void)keyboardDidChangeFrame:(id)arg0;
@end
