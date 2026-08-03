#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGChatAvatarMenuDelegate : NSObject
- (id)contextMenuInteraction:(id)arg0 configurationForMenuAtLocation:(id)arg1;
- (void)contextMenuInteraction:(id)arg0 willEndForConfiguration:(id)arg1 animator:(id)arg2;
- (id)cell;
- (void)setCell:(id)arg0;
- (id)headView;
- (void)setHeadView:(id)arg0;
- (id)frozenWxid;
- (void)setFrozenWxid:(id)arg0;
- (id)frozenChatRoomId;
- (void)setFrozenChatRoomId:(id)arg0;
- (id)frozenWrap;
- (void)setFrozenWrap:(id)arg0;
- (void).cxx_destruct;
@end
