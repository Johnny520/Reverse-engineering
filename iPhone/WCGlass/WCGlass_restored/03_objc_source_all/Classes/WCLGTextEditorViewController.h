#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGTextEditorViewController : NSObject
- (void)dealloc;
- (id)initWithTitle:(id)arg0 text:(id)arg1 placeholder:(id)arg2 handler:(id)arg3;
- (void)viewDidLoad;
- (void)viewDidLayoutSubviews;
- (void)layoutTextEditorViews;
- (void)viewDidAppear:(id)arg0;
- (void)keyboardFrameChanged:(id)arg0;
- (void)saveTapped;
- (id)initialText;
- (void)setInitialText:(id)arg0;
- (id)placeholderText;
- (void)setPlaceholderText:(id)arg0;
- (id)saveHandler;
- (void)setSaveHandler:(id)arg0;
- (id)textView;
- (void)setTextView:(id)arg0;
- (id)hintLabel;
- (void)setHintLabel:(id)arg0;
- (double)keyboardOverlap;
- (void)setKeyboardOverlap:(id)arg0;
- (void).cxx_destruct;
@end
