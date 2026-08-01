package p104;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4565;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7288 extends AbstractC7290 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f19391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f19392 = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7288(int i) {
        StringBuilder sbM150 = AbstractC0053.m150(i, "must have at least ", " value parameter");
        sbM150.append(i > 1 ? "s" : "");
        super(sbM150.toString(), 1);
        this.f19391 = i;
    }

    @Override // p104.InterfaceC7280
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12497(C4565 c4565) {
        int i = this.f19392;
        int i2 = this.f19391;
        switch (i) {
            case 0:
                if (c4565.mo9035().size() >= i2) {
                }
                break;
            default:
                if (c4565.mo9035().size() == i2) {
                }
                break;
        }
        return true;
    }

    public C7288() {
        super("must have exactly 2 value parameters", 1);
        this.f19391 = 2;
    }
}
