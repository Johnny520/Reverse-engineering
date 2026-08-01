package p166;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import p167.AbstractC7710;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7685 extends AbstractC7710 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final WeakReference f20865;

    public RunnableC7685(EditText editText) {
        this.f20865 = new WeakReference(editText);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7687.m12991((EditText) this.f20865.get(), 1);
    }

    @Override // p167.AbstractC7710
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12990() {
        Handler handler;
        EditText editText = (EditText) this.f20865.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }
}
