package p241;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.C3880;
import com.bumptech.glide.request.InterfaceC3883;
import p238.AbstractC8818;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8831 implements InterfaceC8828 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f22443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC3883 f22444;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f22445;

    public AbstractC8831() {
        if (!AbstractC8818.m14036(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            C6755.m11869("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.f22445 = Integer.MIN_VALUE;
        this.f22443 = Integer.MIN_VALUE;
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo7332(InterfaceC3883 interfaceC3883) {
        this.f22444 = interfaceC3883;
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3883 mo7336() {
        return this.f22444;
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7338(C3880 c3880) throws Throwable {
        c3880.m7158(this.f22445, this.f22443);
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335() {
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7337() {
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo7339() {
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo7334(C3880 c3880) {
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo7341(Drawable drawable) {
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo7342(Drawable drawable) {
    }
}
