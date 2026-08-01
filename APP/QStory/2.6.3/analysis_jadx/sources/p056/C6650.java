package p056;

import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6650 implements InterfaceC6796 {
    public static final C6649 Companion = new C6649();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5184[] f18043 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(10)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18046;

    public C6650(int i, String str, List list, C7152 c7152) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6652.f18050.getDescriptor());
            throw null;
        }
        this.f18046 = list;
        if ((i & 2) == 0) {
            this.f18045 = null;
        } else {
            this.f18045 = str;
        }
        if ((i & 4) == 0) {
            this.f18044 = AbstractC6602.f17976;
        } else {
            this.f18044 = c7152;
        }
    }

    public C6650(EmptyList emptyList) {
        C7152 c7152 = AbstractC6602.f17976;
        emptyList.getClass();
        c7152.getClass();
        this.f18046 = emptyList;
        this.f18045 = null;
        this.f18044 = c7152;
    }
}
