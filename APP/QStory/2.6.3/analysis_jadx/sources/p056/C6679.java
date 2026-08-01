package p056;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6679 implements InterfaceC6661 {
    public static final C6680 Companion = new C6680();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5184[] f18085 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(8)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6674 f18086;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6796 f18087;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18088;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6836 f18089;

    public /* synthetic */ C6679(int i, InterfaceC6836 interfaceC6836, String str, InterfaceC6796 interfaceC6796, C6674 c6674) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6677.f18079.getDescriptor());
            throw null;
        }
        this.f18089 = interfaceC6836;
        if ((i & 2) == 0) {
            this.f18088 = "2.0";
        } else {
            this.f18088 = str;
        }
        if ((i & 4) == 0) {
            this.f18087 = null;
        } else {
            this.f18087 = interfaceC6796;
        }
        if ((i & 8) == 0) {
            this.f18086 = null;
        } else {
            this.f18086 = c6674;
        }
    }

    public C6679(InterfaceC6836 interfaceC6836, InterfaceC6796 interfaceC6796, C6674 c6674, int i) {
        interfaceC6796 = (i & 4) != 0 ? null : interfaceC6796;
        c6674 = (i & 8) != 0 ? null : c6674;
        interfaceC6836.getClass();
        this.f18089 = interfaceC6836;
        this.f18088 = "2.0";
        this.f18087 = interfaceC6796;
        this.f18086 = c6674;
    }
}
