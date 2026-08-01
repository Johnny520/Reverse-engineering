package p056;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6644 implements InterfaceC6795 {
    public static final C6645 Companion = new C6645();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5183[] f18043 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(13)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18046;

    public C6644(int i, String str, List list, C7151 c7151) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6641.f18041.getDescriptor());
            throw null;
        }
        this.f18046 = list;
        this.f18045 = str;
        if ((i & 4) == 0) {
            this.f18044 = AbstractC6601.f17981;
        } else {
            this.f18044 = c7151;
        }
    }

    public C6644(ArrayList arrayList) {
        C7151 c7151 = AbstractC6601.f17981;
        c7151.getClass();
        this.f18046 = arrayList;
        this.f18045 = null;
        this.f18044 = c7151;
    }
}
