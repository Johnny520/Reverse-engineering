#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGFuncCardMediaController : NSObject
- (id)init;
- (id)keyForSchemeTask:(id)arg0;
- (BOOL)isSchemeTaskCancelled:(id)arg0;
- (void)finishSchemeTask:(id)arg0;
- (BOOL)performSchemeTaskCallback:(id)arg0 block:(id)arg1;
- (void)failSchemeTask:(id)arg0 code:(id)arg1;
- (void)userContentController:(id)arg0 didReceiveScriptMessage:(id)arg1;
- (id)contentTypesForAccept:(id)arg0;
- (id)presenterForWebView:(id)arg0;
- (void)deliver:(id)arg0 expectedScope:(id)arg1;
- (void)clearPendingPicker;
- (void)updateScope:(id)arg0;
- (void)documentPicker:(id)arg0 didPickDocumentsAtURLs:(id)arg1;
- (void)documentPickerWasCancelled:(id)arg0;
- (void)presentationControllerDidDismiss:(id)arg0;
- (void)webView:(id)arg0 startURLSchemeTask:(id)arg1;
- (void)webView:(id)arg0 stopURLSchemeTask:(id)arg1;
- (id)webView;
- (void)setWebView:(id)arg0;
- (id)scope;
- (void)setScope:(id)arg0;
- (id)ioQueue;
- (void)setIoQueue:(id)arg0;
- (id)stateQueue;
- (void)setStateQueue:(id)arg0;
- (id)activeTasks;
- (void)setActiveTasks:(id)arg0;
- (id)cancelledTasks;
- (void)setCancelledTasks:(id)arg0;
- (id)pageScopes;
- (void)setPageScopes:(id)arg0;
- (id)pendingPicker;
- (void)setPendingPicker:(id)arg0;
- (id)pendingRequestId;
- (void)setPendingRequestId:(id)arg0;
- (id)pendingToken;
- (void)setPendingToken:(id)arg0;
- (id)pendingScope;
- (void)setPendingScope:(id)arg0;
- (NSUInteger)pendingStorageGeneration;
- (void)setPendingStorageGeneration:(id)arg0;
- (void).cxx_destruct;
@end
