package p115X0;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import p007B0.C0172E;
import p051J.InputConnectionC0830v;

/* JADX INFO: renamed from: X0.n */
/* JADX INFO: loaded from: classes.dex */
public class InputConnectionC1639n implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0172E f5634a;

    /* JADX INFO: renamed from: b */
    public InputConnectionC0830v f5635b;

    public InputConnectionC1639n(InputConnectionC0830v inputConnectionC0830v, C0172E c0172e) {
        this.f5634a = c0172e;
        this.f5635b = inputConnectionC0830v;
    }

    /* JADX INFO: renamed from: a */
    public final void m2940a(InputConnectionC0830v inputConnectionC0830v) {
        inputConnectionC0830v.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i5) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.clearMetaKeyStates(i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            if (inputConnectionC0830v != null) {
                m2940a(inputConnectionC0830v);
                this.f5635b = null;
            }
            this.f5634a.mo1h(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i5, Bundle bundle) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.commitContent(inputContentInfo, i5, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i5) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.commitText(charSequence, i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i5, int i6) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.deleteSurroundingText(i5, i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.deleteSurroundingTextInCodePoints(i5, i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.m1473b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i5) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.getCursorCapsMode(i5);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i5) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.getExtractedText(extractedTextRequest, i5);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i5) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.getSelectedText(i5);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i5, int i6) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.getTextAfterCursor(i5, i6);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i5, int i6) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.getTextBeforeCursor(i5, i6);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i5) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.performContextMenuAction(i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i5) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.performEditorAction(i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z5) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i5) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.requestCursorUpdates(i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i5, int i6) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.setComposingRegion(i5, i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i5) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.setComposingText(charSequence, i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i5, int i6) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.setSelection(i5, i6);
        }
        return false;
    }
}
