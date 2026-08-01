package p056;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6668 implements InterfaceC6795 {
    public static final C6669 Companion = new C6669();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5183[] f18074 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(9)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18076;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18077;

    public C6668(int i, String str, List list, C7151 c7151) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6665.f18072.getDescriptor());
            throw null;
        }
        this.f18077 = list;
        if ((i & 2) == 0) {
            this.f18076 = null;
        } else {
            this.f18076 = str;
        }
        if ((i & 4) == 0) {
            this.f18075 = AbstractC6601.f17981;
        } else {
            this.f18075 = c7151;
        }
    }

    public C6668(ArrayList arrayList) {
        C7151 c7151 = AbstractC6601.f17981;
        c7151.getClass();
        this.f18077 = arrayList;
        this.f18076 = null;
        this.f18075 = c7151;
    }
}
