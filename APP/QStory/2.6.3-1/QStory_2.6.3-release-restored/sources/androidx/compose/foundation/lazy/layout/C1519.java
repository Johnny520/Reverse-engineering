package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0955;
import androidx.collection.AbstractC1081;
import androidx.collection.C1099;
import androidx.compose.foundation.lazy.C1601;
import androidx.compose.runtime.collection.C2059;
import p064.C7348;
import p068.InterfaceC7387;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1519 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f2237;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f2238;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f2239;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[LOOP:1: B:28:0x00bb->B:34:0x00dd, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1519(C7348 c7348, C1601 c1601) {
        Object defaultLazyKey;
        C1519 c1519 = c1601.f2569;
        int i = c7348.f18163;
        if (i < 0) {
            AbstractC8570.m13654("negative nearestRange.first");
        }
        int iMin = Math.min(c7348.f18161, c1519.f2239 - 1);
        if (iMin < i) {
            C1099 c1099 = AbstractC1081.f1219;
            c1099.getClass();
            this.f2238 = c1099;
            this.f2237 = new Object[0];
            this.f2239 = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.f2237 = new Object[i2];
        this.f2239 = i;
        C1099 c10992 = new C1099(i2);
        C2059 c2059 = (C2059) c1519.f2238;
        if (i < 0 || i >= c1519.f2239) {
            StringBuilder sbM710 = AbstractC0900.m710(i, "Index ", ", size ");
            sbM710.append(c1519.f2239);
            AbstractC8570.m13652(sbM710.toString());
        }
        if (iMin < 0 || iMin >= c1519.f2239) {
            StringBuilder sbM7102 = AbstractC0900.m710(iMin, "Index ", ", size ");
            sbM7102.append(c1519.f2239);
            AbstractC8570.m13652(sbM7102.toString());
        }
        if (iMin < i) {
            AbstractC8570.m13656("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iM2077 = AbstractC1563.m2077(i, c2059);
        int i3 = ((C1561) c2059.f3866[iM2077]).f2374;
        while (i3 <= iMin) {
            C1561 c1561 = (C1561) c2059.f3866[iM2077];
            InterfaceC7387 interfaceC7387 = (InterfaceC7387) c1561.f2372.f664;
            int i4 = c1561.f2374;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (c1561.f2373 + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (interfaceC7387 == null) {
                        defaultLazyKey = new DefaultLazyKey(iMax);
                        c10992.m1368(iMax, defaultLazyKey);
                        ((Object[]) this.f2237)[iMax - this.f2239] = defaultLazyKey;
                        iMax = iMax == iMin2 ? iMax + 1 : iMax;
                    } else {
                        defaultLazyKey = interfaceC7387.invoke(Integer.valueOf(iMax - i4));
                        if (defaultLazyKey == null) {
                        }
                        c10992.m1368(iMax, defaultLazyKey);
                        ((Object[]) this.f2237)[iMax - this.f2239] = defaultLazyKey;
                        if (iMax == iMin2) {
                            break;
                        }
                    }
                }
            }
            i3 += c1561.f2373;
            iM2077++;
        }
        this.f2238 = c10992;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m2035(Object obj) {
        C1099 c1099 = (C1099) this.f2238;
        int iM1364 = c1099.m1364(obj);
        if (iM1364 >= 0) {
            return c1099.f1261[iM1364];
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1561 m2036(int i) {
        if (i < 0 || i >= this.f2239) {
            StringBuilder sbM710 = AbstractC0900.m710(i, "Index ", ", size ");
            sbM710.append(this.f2239);
            AbstractC8570.m13652(sbM710.toString());
        }
        C1561 c1561 = (C1561) this.f2237;
        if (c1561 != null) {
            int i2 = c1561.f2374;
            if (i < c1561.f2373 + i2 && i2 <= i) {
                return c1561;
            }
        }
        C2059 c2059 = (C2059) this.f2238;
        C1561 c15612 = (C1561) c2059.f3866[AbstractC1563.m2077(i, c2059)];
        this.f2237 = c15612;
        return c15612;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2037(int i, C0955 c0955) {
        if (i < 0) {
            AbstractC8570.m13656("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        C1561 c1561 = new C1561(this.f2239, i, c0955);
        this.f2239 += i;
        ((C2059) this.f2238).m2607(c1561);
    }

    public C1519() {
        this.f2238 = new C2059(0, new C1561[16]);
    }
}
