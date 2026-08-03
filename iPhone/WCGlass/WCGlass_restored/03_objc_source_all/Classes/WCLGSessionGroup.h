#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGSessionGroup : NSObject
+ (id)groupWithDictionary:(id)arg0;
- (id)init;
- (BOOL)isAllGroup;
- (BOOL)containsSessionUsername:(id)arg0;
- (BOOL)containsSessionUsername:(id)arg0 unreadCount:(id)arg1 muted:(id)arg2 showMutedUnread:(id)arg3;
- (id)dictionaryRepresentation;
- (id)groupID;
- (void)setGroupID:(id)arg0;
- (id)title;
- (void)setTitle:(id)arg0;
- (id)members;
- (void)setMembers:(id)arg0;
- (NSInteger)rule;
- (void)setRule:(id)arg0;
- (void).cxx_destruct;
@end
