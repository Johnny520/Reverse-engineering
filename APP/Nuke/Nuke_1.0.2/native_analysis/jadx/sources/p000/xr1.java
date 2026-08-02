package p000;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class xr1 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0798v5 f13144a;

    /* JADX INFO: renamed from: b */
    public l62 f13145b;

    public xr1(l62 l62Var, C0798v5 c0798v5) {
        this.f13144a = c0798v5;
        this.f13145b = l62Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() throws j90 {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            if (l62Var != null) {
                l62Var.closeConnection();
                this.f13145b = null;
            }
            this.f13144a.mo5j(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.m2847b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        l62 l62Var = this.f13145b;
        if (l62Var != null) {
            return l62Var.setSelection(i, i2);
        }
        return false;
    }
}
