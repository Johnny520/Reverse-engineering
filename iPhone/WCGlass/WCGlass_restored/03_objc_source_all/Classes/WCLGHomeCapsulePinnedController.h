#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGHomeCapsulePinnedController : NSObject
- (void)refresh;
- (void)presentActionsForUser:(id)arg0;
- (void)presentNicknameEditorForUser:(id)arg0;
- (void)replaceFriend:(id)arg0;
- (void)replaceAvatar:(id)arg0;
- (void)removeUser:(id)arg0;
- (void)imagePickerController:(id)arg0 didFinishPickingMediaWithInfo:(id)arg1;
- (void)imagePickerControllerDidCancel:(id)arg0;
- (id)pendingAvatarUser;
- (void)setPendingAvatarUser:(id)arg0;
- (void).cxx_destruct;
@end
