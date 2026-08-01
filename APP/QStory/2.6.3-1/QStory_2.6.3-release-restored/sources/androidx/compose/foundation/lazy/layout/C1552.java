package androidx.compose.foundation.lazy.layout;

import androidx.collection.AbstractC1137;
import androidx.collection.C1083;
import androidx.compose.foundation.C1898;
import androidx.compose.foundation.lazy.C1603;
import androidx.compose.runtime.internal.C2077;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7383;
import p132.InterfaceC8169;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1552 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1083 f2349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1526 f2350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8169 f2351;

    public C1552(InterfaceC8169 interfaceC8169, C1526 c1526) {
        this.f2351 = interfaceC8169;
        this.f2350 = c1526;
        long[] jArr = AbstractC1137.f1352;
        this.f2349 = new C1083();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m2066(Object obj) {
        if (obj == null) {
            return null;
        }
        C1551 c1551 = (C1551) this.f2349.m1317(obj);
        if (c1551 != null) {
            return c1551.f2347;
        }
        C1603 c1603 = (C1603) this.f2350.invoke();
        int iM2035 = c1603.f2571.m2035(obj);
        if (iM2035 != -1) {
            return c1603.m2132(iM2035);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7383 m2067(Object obj, int i, Object obj2) {
        C1083 c1083 = this.f2349;
        C1551 c1551 = (C1551) c1083.m1317(obj);
        int i2 = 1;
        if (c1551 != null && c1551.f2346 == i && AbstractC5227.m9466(c1551.f2347, obj2)) {
            C2077 c2077 = c1551.f2345;
            if (c2077 != null) {
                return c2077;
            }
            C2077 c20772 = new C2077(818252804, true, new C1898(c1551.f2344, i2, c1551));
            c1551.f2345 = c20772;
            return c20772;
        }
        C1551 c15512 = new C1551(this, i, obj, obj2);
        c1083.m1315(obj, c15512);
        C2077 c20773 = c15512.f2345;
        if (c20773 != null) {
            return c20773;
        }
        C2077 c20774 = new C2077(818252804, true, new C1898(this, i2, c15512));
        c15512.f2345 = c20774;
        return c20774;
    }
}
