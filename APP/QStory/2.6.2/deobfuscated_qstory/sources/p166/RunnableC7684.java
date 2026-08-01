package p166;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import p167.AbstractC7709;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7684 extends AbstractC7709 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final WeakReference f20870;

    public RunnableC7684(EditText editText) {
        this.f20870 = new WeakReference(editText);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7686.m12959((EditText) this.f20870.get(), 1);
    }

    @Override // p167.AbstractC7709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12958() {
        Handler handler;
        EditText editText = (EditText) this.f20870.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }
}
