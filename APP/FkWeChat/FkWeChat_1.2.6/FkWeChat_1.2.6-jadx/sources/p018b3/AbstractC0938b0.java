package p018b3;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: b3.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0938b0 implements InterfaceInputConnectionC0935a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f2903a;

    /* JADX INFO: renamed from: b */
    public InputConnection f2904b;

    public AbstractC0938b0(InputConnection inputConnection, InterfaceC0184l interfaceC0184l) {
        this.f2903a = interfaceC0184l;
        this.f2904b = inputConnection;
    }

    @Override // p018b3.InterfaceInputConnectionC0935a0
    /* JADX INFO: renamed from: a */
    public final void mo3447a() {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            mo3457b(inputConnection);
            this.f2904b = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo3457b(InputConnection inputConnection);

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final InputConnection m3458c() {
        return this.f2904b;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f2904b != null) {
            mo3447a();
            this.f2903a.mo27m(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i10);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        InputConnection inputConnection = this.f2904b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i10, i11);
        }
        return false;
    }
}
