package androidx.compose.foundation.lazy.layout;

import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import androidx.compose.foundation.C1060;
import androidx.compose.foundation.lazy.C0762;
import androidx.compose.runtime.internal.C1242;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6553;
import p116.InterfaceC7339;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0711 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0236 f2003;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0685 f2004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7339 f2005;

    public C0711(InterfaceC7339 interfaceC7339, C0685 c0685) {
        this.f2005 = interfaceC7339;
        this.f2004 = c0685;
        long[] jArr = AbstractC0290.f1007;
        this.f2003 = new C0236();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m1496(Object obj) {
        if (obj == null) {
            return null;
        }
        C0710 c0710 = (C0710) this.f2003.m756(obj);
        if (c0710 != null) {
            return c0710.f2001;
        }
        C0762 c0762 = (C0762) this.f2004.invoke();
        int iM1465 = c0762.f2225.m1465(obj);
        if (iM1465 != -1) {
            return c0762.m1562(iM1465);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6553 m1497(Object obj, int i, Object obj2) {
        C0236 c0236 = this.f2003;
        C0710 c0710 = (C0710) c0236.m756(obj);
        int i2 = 1;
        if (c0710 != null && c0710.f2000 == i && AbstractC4394.m8917(c0710.f2001, obj2)) {
            C1242 c1242 = c0710.f1999;
            if (c1242 != null) {
                return c1242;
            }
            C1242 c12422 = new C1242(818252804, true, new C1060(c0710.f1998, i2, c0710));
            c0710.f1999 = c12422;
            return c12422;
        }
        C0710 c07102 = new C0710(this, i, obj, obj2);
        c0236.m754(obj, c07102);
        C1242 c12423 = c07102.f1999;
        if (c12423 != null) {
            return c12423;
        }
        C1242 c12424 = new C1242(818252804, true, new C1060(this, i2, c07102));
        c07102.f1999 = c12424;
        return c12424;
    }
}
