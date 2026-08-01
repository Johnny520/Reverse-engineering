package p056;

import androidx.window.area.C2558;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6693 implements InterfaceC6796 {
    public static final C6689 Companion = new C6689();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5184[] f18102 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C2558(27)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7152 f18103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Boolean f18105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18106;

    public C6693(int i, List list, Boolean bool, C7152 c7152, C7152 c71522) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6690.f18100.getDescriptor());
            throw null;
        }
        this.f18106 = list;
        if ((i & 2) == 0) {
            this.f18105 = Boolean.FALSE;
        } else {
            this.f18105 = bool;
        }
        if ((i & 4) == 0) {
            this.f18104 = AbstractC6602.f17976;
        } else {
            this.f18104 = c7152;
        }
        if ((i & 8) == 0) {
            this.f18103 = AbstractC6602.f17976;
        } else {
            this.f18103 = c71522;
        }
    }
}
