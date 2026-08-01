package p056;

import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6655 implements InterfaceC6796 {
    public static final C6656 Companion = new C6656();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC5184[] f18054 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(12)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18056;

    public C6655(int i, List list, C7152 c7152) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6653.f18051.getDescriptor());
            throw null;
        }
        this.f18056 = list;
        if ((i & 2) == 0) {
            this.f18055 = AbstractC6602.f17976;
        } else {
            this.f18055 = c7152;
        }
    }
}
