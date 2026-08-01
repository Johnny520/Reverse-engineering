package p056;

import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏世哲兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6829 implements InterfaceC6796 {
    public static final C6830 Companion = new C6830();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC5184[] f18268 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(22)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18269;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18270;

    public C6829(int i, List list, C7152 c7152) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6831.f18271.getDescriptor());
            throw null;
        }
        this.f18270 = list;
        if ((i & 2) == 0) {
            this.f18269 = AbstractC6602.f17976;
        } else {
            this.f18269 = c7152;
        }
    }
}
