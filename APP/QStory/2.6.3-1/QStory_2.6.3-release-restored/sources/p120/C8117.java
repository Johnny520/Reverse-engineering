package p120;

import androidx.activity.AbstractC0900;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5397;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8117 extends AbstractC8119 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f19736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f19737 = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8117(int i) {
        StringBuilder sbM710 = AbstractC0900.m710(i, "must have at least ", " value parameter");
        sbM710.append(i > 1 ? "s" : "");
        super(sbM710.toString(), 1);
        this.f19736 = i;
    }

    @Override // p120.InterfaceC8109
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13056(C5397 c5397) {
        int i = this.f19737;
        int i2 = this.f19736;
        switch (i) {
            case 0:
                if (c5397.mo9594().size() >= i2) {
                }
                break;
            default:
                if (c5397.mo9594().size() == i2) {
                }
                break;
        }
        return true;
    }

    public C8117() {
        super("must have exactly 2 value parameters", 1);
        this.f19736 = 2;
    }
}
