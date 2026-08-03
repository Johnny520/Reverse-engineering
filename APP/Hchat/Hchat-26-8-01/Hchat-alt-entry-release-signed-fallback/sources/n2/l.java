package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class l implements android.view.inputmethod.InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1.f f8960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f0.v f8961b;

    public l(f0.v r1, b1.f r2) {
            r0 = this;
            r0.<init>()
            r0.f8960a = r2
            r0.f8961b = r1
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r0 = r0.beginBatchEdit()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int r2) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.clearMetaKeyStates(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L11
            if (r0 == 0) goto Lc
            r0.closeConnection()
            r0 = 0
            r1.f8961b = r0
        Lc:
            b1.f r0 = r1.f8960a
            r0.invoke(r1)
        L11:
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo r2) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.commitCompletion(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo r2, int r3, android.os.Bundle r4) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.commitContent(r2, r3, r4)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo r2) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.commitCorrection(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence r2, int r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.commitText(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r2, int r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.deleteSurroundingText(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r2, int r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.deleteSurroundingTextInCodePoints(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r0 = r0.finishComposingText()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int r2) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            int r2 = r0.getCursorCapsMode(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest r2, int r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            android.view.inputmethod.ExtractedText r2 = r0.getExtractedText(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int r2) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            java.lang.CharSequence r2 = r0.getSelectedText(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int r2, int r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            java.lang.CharSequence r2 = r0.getTextAfterCursor(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int r2, int r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            java.lang.CharSequence r2 = r0.getTextBeforeCursor(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int r2) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.performContextMenuAction(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int r2) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.performEditorAction(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.performPrivateCommand(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int r2) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.requestCursorUpdates(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.sendKeyEvent(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int r2, int r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.setComposingRegion(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence r2, int r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.setComposingText(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int r2, int r3) {
            r1 = this;
            f0.v r0 = r1.f8961b
            if (r0 == 0) goto L9
            boolean r2 = r0.setSelection(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }
}
