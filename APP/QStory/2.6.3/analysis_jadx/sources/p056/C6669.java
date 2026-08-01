package p056;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6669 implements InterfaceC6796 {
    public static final C6670 Companion = new C6670();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5184[] f18069 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(9)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18071;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18072;

    public C6669(int i, String str, List list, C7152 c7152) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6666.f18067.getDescriptor());
            throw null;
        }
        this.f18072 = list;
        if ((i & 2) == 0) {
            this.f18071 = null;
        } else {
            this.f18071 = str;
        }
        if ((i & 4) == 0) {
            this.f18070 = AbstractC6602.f17976;
        } else {
            this.f18070 = c7152;
        }
    }

    public C6669(ArrayList arrayList) {
        C7152 c7152 = AbstractC6602.f17976;
        c7152.getClass();
        this.f18072 = arrayList;
        this.f18071 = null;
        this.f18070 = c7152;
    }
}
