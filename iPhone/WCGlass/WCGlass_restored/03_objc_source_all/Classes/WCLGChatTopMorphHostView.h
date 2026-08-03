#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGChatTopMorphHostView : NSObject
- (id)initWithFrame:(id)arg0;
- (void)updateChrome;
- (void)layoutSubviews;
- (void)traitCollectionDidChange:(id)arg0;
- (void)handleTap:(id)arg0;
- (id)menuContainerView;
- (void)showMenuFromHost;
- (void)hideMenu;
- (void)handleLongPress:(id)arg0;
- (id)controller;
- (void)setController:(id)arg0;
- (BOOL)avatarOnlyMode;
- (void)setAvatarOnlyMode:(id)arg0;
- (id)cachedAvatarImage;
- (void)setCachedAvatarImage:(id)arg0;
- (NSInteger)cachedAvatarToken;
- (void)setCachedAvatarToken:(id)arg0;
- (BOOL)isGroup;
- (void)setIsGroup:(id)arg0;
- (NSInteger)defaultAction;
- (void)setDefaultAction:(id)arg0;
- (BOOL)ready;
- (void)setReady:(id)arg0;
- (id)iconView;
- (void)setIconView:(id)arg0;
- (id)menuView;
- (void)setMenuView:(id)arg0;
- (BOOL)menuVisible;
- (void)setMenuVisible:(id)arg0;
- (BOOL)longPressActive;
- (void)setLongPressActive:(id)arg0;
- (void).cxx_destruct;
@end
