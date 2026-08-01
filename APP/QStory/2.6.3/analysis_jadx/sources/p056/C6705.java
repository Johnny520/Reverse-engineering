package p056;

import androidx.window.area.C2558;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6705 implements InterfaceC6796 {
    public static final C6701 Companion = new C6701();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5184[] f18120 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C2558(25)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Boolean f18122;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18123;

    public C6705(int i, List list, Boolean bool, C7152 c7152) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6702.f18114.getDescriptor());
            throw null;
        }
        this.f18123 = list;
        if ((i & 2) == 0) {
            this.f18122 = Boolean.FALSE;
        } else {
            this.f18122 = bool;
        }
        if ((i & 4) == 0) {
            this.f18121 = AbstractC6602.f17976;
        } else {
            this.f18121 = c7152;
        }
    }
}
