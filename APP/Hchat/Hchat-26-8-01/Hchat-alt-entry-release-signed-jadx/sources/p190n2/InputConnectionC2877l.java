package p190n2;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import p016b1.C0166f;
import p070f0.InputConnectionC0990v;

/* JADX INFO: renamed from: n2.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class InputConnectionC2877l implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0166f f9300a;

    /* JADX INFO: renamed from: b */
    public InputConnectionC0990v f9301b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputConnectionC2877l(InputConnectionC0990v inputConnectionC0990v, C0166f c0166f) {
        this.f9300a = c0166f;
        this.f9301b = inputConnectionC0990v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.beginBatchEdit();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i9) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.clearMetaKeyStates(i9);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            if (inputConnectionC0990v != null) {
                inputConnectionC0990v.closeConnection();
                this.f9301b = null;
            }
            this.f9300a.invoke(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.commitCompletion(completionInfo);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i9, Bundle bundle) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.commitContent(inputContentInfo, i9, bundle);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.commitCorrection(correctionInfo);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i9) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.commitText(charSequence, i9);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i9, int i10) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.deleteSurroundingText(i9, i10);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i9, int i10) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.deleteSurroundingTextInCodePoints(i9, i10);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.m2448b();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.finishComposingText();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i9) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.getCursorCapsMode(i9);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i9) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.getExtractedText(extractedTextRequest, i9);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i9) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.getSelectedText(i9);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i9, int i10) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.getTextAfterCursor(i9, i10);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i9, int i10) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.getTextBeforeCursor(i9, i10);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i9) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.performContextMenuAction(i9);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i9) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.performEditorAction(i9);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.performPrivateCommand(str, bundle);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z9) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i9) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.requestCursorUpdates(i9);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.sendKeyEvent(keyEvent);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i9, int i10) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.setComposingRegion(i9, i10);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i9) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.setComposingText(charSequence, i9);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i9, int i10) {
        InputConnectionC0990v inputConnectionC0990v = this.f9301b;
        if (inputConnectionC0990v != null) {
            return inputConnectionC0990v.setSelection(i9, i10);
        }
        return false;
    }
}
