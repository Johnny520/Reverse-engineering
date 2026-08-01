package p056;

import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6707 implements InterfaceC6796 {
    public static final C6708 Companion = new C6708();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5184[] f18125 = {null, AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(6)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f18127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18128;

    public C6707(int i, String str, List list, C7152 c7152) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6709.f18129.getDescriptor());
            throw null;
        }
        this.f18128 = str;
        this.f18127 = list;
        if ((i & 4) == 0) {
            this.f18126 = AbstractC6602.f17976;
        } else {
            this.f18126 = c7152;
        }
    }
}
