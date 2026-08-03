#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGChatTextTarget : NSObject
- (id)view;
- (void)setView:(id)arg0;
- (BOOL)richText;
- (void)setRichText:(id)arg0;
- (BOOL)explicitExternalTarget;
- (void)setExplicitExternalTarget:(id)arg0;
- (id)lastAppliedColor;
- (void)setLastAppliedColor:(id)arg0;
- (id)originalTextColor;
- (void)setOriginalTextColor:(id)arg0;
- (id)originalRichTextColor;
- (void)setOriginalRichTextColor:(id)arg0;
- (id)originalAttributedText;
- (void)setOriginalAttributedText:(id)arg0;
- (BOOL)capturedLabelOriginals;
- (void)setCapturedLabelOriginals:(id)arg0;
- (BOOL)capturedRichTextOriginal;
- (void)setCapturedRichTextOriginal:(id)arg0;
- (NSUInteger)lastTextObject;
- (void)setLastTextObject:(id)arg0;
- (NSUInteger)lastAttributedObject;
- (void)setLastAttributedObject:(id)arg0;
- (NSUInteger)lastTextLength;
- (void)setLastTextLength:(id)arg0;
- (NSUInteger)lastAttributedLength;
- (void)setLastAttributedLength:(id)arg0;
- (void).cxx_destruct;
@end
