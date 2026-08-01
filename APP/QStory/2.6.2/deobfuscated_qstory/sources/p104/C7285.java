package p104;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4564;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7285 extends AbstractC7289 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f19393;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7285 f19392 = new C7285("must have no value parameters", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7285 f19391 = new C7285("must have a single value parameter", 1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7285(String str, int i) {
        super(str, 1);
        this.f19393 = i;
    }

    @Override // p104.InterfaceC7279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12470(C4564 c4564) {
        switch (this.f19393) {
            case 0:
                return c4564.mo9045().isEmpty();
            default:
                return c4564.mo9045().size() == 1;
        }
    }
}
