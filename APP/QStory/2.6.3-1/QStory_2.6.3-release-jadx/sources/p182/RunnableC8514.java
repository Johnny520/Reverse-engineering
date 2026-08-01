package p182;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import p183.AbstractC8539;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8514 extends AbstractC8539 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final WeakReference f21210;

    public RunnableC8514(EditText editText) {
        this.f21210 = new WeakReference(editText);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8516.m13550((EditText) this.f21210.get(), 1);
    }

    @Override // p183.AbstractC8539
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo13549() {
        Handler handler;
        EditText editText = (EditText) this.f21210.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }
}
