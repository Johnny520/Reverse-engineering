package p234;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import p225.AbstractC8001;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8078 extends AbstractC8001 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f22270;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Handler f22271;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f22272;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Bitmap f22273;

    public C8078(Handler handler, int i, long j) {
        this.f22271 = handler;
        this.f22270 = i;
        this.f22272 = j;
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6728(Object obj) {
        this.f22273 = (Bitmap) obj;
        Handler handler = this.f22271;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f22272);
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6735(Drawable drawable) {
        this.f22273 = null;
    }
}
