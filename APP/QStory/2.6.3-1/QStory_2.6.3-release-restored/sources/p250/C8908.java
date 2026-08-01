package p250;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import p241.AbstractC8831;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8908 extends AbstractC8831 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f22613;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Handler f22614;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f22615;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Bitmap f22616;

    public C8908(Handler handler, int i, long j) {
        this.f22614 = handler;
        this.f22613 = i;
        this.f22615 = j;
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7333(Object obj) {
        this.f22616 = (Bitmap) obj;
        Handler handler = this.f22614;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f22615);
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7340(Drawable drawable) {
        this.f22616 = null;
    }
}
