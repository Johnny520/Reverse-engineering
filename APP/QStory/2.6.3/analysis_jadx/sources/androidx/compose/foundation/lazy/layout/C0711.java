package androidx.compose.foundation.lazy.layout;

import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import androidx.compose.foundation.C1060;
import androidx.compose.foundation.lazy.C0762;
import androidx.compose.runtime.internal.C1242;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6554;
import p116.InterfaceC7340;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0711 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0236 f2004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0685 f2005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7340 f2006;

    public C0711(InterfaceC7340 interfaceC7340, C0685 c0685) {
        this.f2006 = interfaceC7340;
        this.f2005 = c0685;
        long[] jArr = AbstractC0290.f1007;
        this.f2004 = new C0236();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m1506(Object obj) {
        if (obj == null) {
            return null;
        }
        C0710 c0710 = (C0710) this.f2004.m757(obj);
        if (c0710 != null) {
            return c0710.f2002;
        }
        C0762 c0762 = (C0762) this.f2005.invoke();
        int iM1475 = c0762.f2226.m1475(obj);
        if (iM1475 != -1) {
            return c0762.m1572(iM1475);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6554 m1507(Object obj, int i, Object obj2) {
        C0236 c0236 = this.f2004;
        C0710 c0710 = (C0710) c0236.m757(obj);
        int i2 = 1;
        if (c0710 != null && c0710.f2001 == i && AbstractC4395.m8907(c0710.f2002, obj2)) {
            C1242 c1242 = c0710.f2000;
            if (c1242 != null) {
                return c1242;
            }
            C1242 c12422 = new C1242(818252804, true, new C1060(c0710.f1999, i2, c0710));
            c0710.f2000 = c12422;
            return c12422;
        }
        C0710 c07102 = new C0710(this, i, obj, obj2);
        c0236.m755(obj, c07102);
        C1242 c12423 = c07102.f2000;
        if (c12423 != null) {
            return c12423;
        }
        C1242 c12424 = new C1242(818252804, true, new C1060(this, i2, c07102));
        c07102.f2000 = c12424;
        return c12424;
    }
}
