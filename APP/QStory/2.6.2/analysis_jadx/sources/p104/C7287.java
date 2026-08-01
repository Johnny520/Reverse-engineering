package p104;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4564;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7287 extends AbstractC7289 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f19396;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f19397 = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7287(int i) {
        StringBuilder sbM148 = AbstractC0053.m148(i, "must have at least ", " value parameter");
        sbM148.append(i > 1 ? "s" : "");
        super(sbM148.toString(), 1);
        this.f19396 = i;
    }

    @Override // p104.InterfaceC7279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12470(C4564 c4564) {
        int i = this.f19397;
        int i2 = this.f19396;
        switch (i) {
            case 0:
                if (c4564.mo9045().size() >= i2) {
                }
                break;
            default:
                if (c4564.mo9045().size() == i2) {
                }
                break;
        }
        return true;
    }

    public C7287() {
        super("must have exactly 2 value parameters", 1);
        this.f19396 = 2;
    }
}
