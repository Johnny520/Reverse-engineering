package p011ab;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: ab.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0047g extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final C0045e f164a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0047g(InputConnection inputConnection, C0045e c0045e) {
        super(inputConnection, true);
        this.f164a = c0045e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i9, int i10) {
        if (i9 > 0 && i10 == 0 && ((Boolean) this.f164a.invoke()).booleanValue()) {
            return true;
        }
        return super.deleteSurroundingText(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i9, int i10) {
        if (i9 > 0 && i10 == 0 && ((Boolean) this.f164a.invoke()).booleanValue()) {
            return true;
        }
        return super.deleteSurroundingTextInCodePoints(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && ((Boolean) this.f164a.invoke()).booleanValue()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
