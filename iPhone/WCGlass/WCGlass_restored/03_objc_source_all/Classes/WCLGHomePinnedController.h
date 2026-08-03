#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGHomePinnedController : NSObject
- (void)refreshUI;
- (void)onSlotTap:(id)arg0;
- (void)onSlotLongPress:(id)arg0;
- (void)presentActionsForUser:(id)arg0 fromController:(id)arg1;
- (void)replaceFriend:(id)arg0 fromController:(id)arg1;
- (void)replaceAvatar:(id)arg0 fromController:(id)arg1;
- (void)removeUser:(id)arg0;
- (void)addContactFromController:(id)arg0 onChange:(id)arg1;
- (void)presentMaskPickerFromController:(id)arg0;
- (void)pickMaskForDark:(id)arg0 fromController:(id)arg1;
- (void)imagePickerController:(id)arg0 didFinishPickingMediaWithInfo:(id)arg1;
- (void)imagePickerControllerDidCancel:(id)arg0;
- (id)pendingAvatarUser;
- (void)setPendingAvatarUser:(id)arg0;
- (id)pendingMaskDark;
- (void)setPendingMaskDark:(id)arg0;
- (void).cxx_destruct;
@end
