package p234;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import p225.AbstractC8002;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8079 extends AbstractC8002 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f22268;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Handler f22269;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f22270;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Bitmap f22271;

    public C8079(Handler handler, int i, long j) {
        this.f22269 = handler;
        this.f22268 = i;
        this.f22270 = j;
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6773(Object obj) {
        this.f22271 = (Bitmap) obj;
        Handler handler = this.f22269;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f22270);
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6780(Drawable drawable) {
        this.f22271 = null;
    }
}
