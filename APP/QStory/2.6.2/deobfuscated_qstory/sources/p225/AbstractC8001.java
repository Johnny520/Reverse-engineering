package p225;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.C3047;
import com.bumptech.glide.request.InterfaceC3050;
import p222.AbstractC7988;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8001 implements InterfaceC7998 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f22101;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC3050 f22102;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f22103;

    public AbstractC8001() {
        if (!AbstractC7988.m13449(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            C5919.m11249("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.f22103 = Integer.MIN_VALUE;
        this.f22101 = Integer.MIN_VALUE;
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6727(InterfaceC3050 interfaceC3050) {
        this.f22102 = interfaceC3050;
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3050 mo6731() {
        return this.f22102;
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo6733(C3047 c3047) throws Throwable {
        c3047.m6538(this.f22103, this.f22101);
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6730() {
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6732() {
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo6734() {
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo6729(C3047 c3047) {
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6736(Drawable drawable) {
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo6737(Drawable drawable) {
    }
}
