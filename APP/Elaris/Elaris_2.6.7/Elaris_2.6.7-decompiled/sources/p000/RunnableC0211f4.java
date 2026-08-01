package p000;

import android.text.Editable;
import android.widget.EditText;

/* JADX INFO: renamed from: f4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0211f4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f254b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0211f4(EditText editText, int i) {
        this.f253a = i;
        this.f254b = editText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f253a;
        int length = 0;
        EditText editText = this.f254b;
        switch (i) {
            case 0:
                try {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 1:
                try {
                    if (editText.getText() != null) {
                        length = editText.getText().length();
                    }
                    editText.setSelection(length);
                } catch (Throwable unused2) {
                    return;
                }
                break;
            default:
                try {
                    if (editText.getText() != null) {
                        length = editText.getText().length();
                    }
                    editText.setSelection(length);
                } catch (Throwable unused3) {
                    return;
                }
                break;
        }
    }
}
