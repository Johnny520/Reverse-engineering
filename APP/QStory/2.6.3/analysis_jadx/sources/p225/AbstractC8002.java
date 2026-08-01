package p225;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.C3048;
import com.bumptech.glide.request.InterfaceC3051;
import p222.AbstractC7989;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8002 implements InterfaceC7999 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f22098;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC3051 f22099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f22100;

    public AbstractC8002() {
        if (!AbstractC7989.m13477(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            C5925.m11310("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.f22100 = Integer.MIN_VALUE;
        this.f22098 = Integer.MIN_VALUE;
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6772(InterfaceC3051 interfaceC3051) {
        this.f22099 = interfaceC3051;
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3051 mo6776() {
        return this.f22099;
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo6778(C3048 c3048) throws Throwable {
        c3048.m6598(this.f22100, this.f22098);
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6775() {
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6777() {
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo6779() {
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo6774(C3048 c3048) {
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6781(Drawable drawable) {
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo6782(Drawable drawable) {
    }
}
