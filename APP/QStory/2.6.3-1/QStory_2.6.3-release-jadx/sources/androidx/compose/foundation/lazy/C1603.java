package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.AbstractC1563;
import androidx.compose.foundation.lazy.layout.C1519;
import androidx.compose.foundation.lazy.layout.C1561;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1603 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1519 f2571;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1586 f2572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1601 f2573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1582 f2574;

    public C1603(C1582 c1582, C1601 c1601, C1586 c1586, C1519 c1519) {
        this.f2574 = c1582;
        this.f2573 = c1601;
        this.f2572 = c1586;
        this.f2571 = c1519;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1603)) {
            return false;
        }
        return AbstractC5227.m9466(this.f2573, ((C1603) obj).f2573);
    }

    public final int hashCode() {
        return this.f2573.hashCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m2130(int i) {
        C1519 c1519 = this.f2571;
        Object[] objArr = (Object[]) c1519.f2237;
        int i2 = i - c1519.f2239;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.f2573.m2088(i) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m2131() {
        C1601 c1601 = this.f2573;
        c1601.getClass();
        return c1601.f2569.f2239;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m2132(int i) {
        C1601 c1601 = this.f2573;
        c1601.getClass();
        C1561 c1561M2036 = c1601.f2569.m2036(i);
        return ((InterfaceC7387) c1561M2036.f2372.f665).invoke(Integer.valueOf(i - c1561M2036.f2374));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2133(int i, Object obj, InterfaceC2208 interfaceC2208, int i2) {
        int i3;
        Object obj2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-462424778);
        int i4 = (c2159.m2922(i) ? 4 : 2) | i2 | (c2159.m2938(obj) ? 32 : 16) | (c2159.m2920(this) ? 256 : 128);
        int i5 = 0;
        if (c2159.m2903(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            AbstractC1563.m2080(obj2, i3, this.f2574.f2456, AbstractC2089.m2749(-824725566, new C1605(this, i, i5), c2159), c2159, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1606(this, i3, obj2, i2);
        }
    }
}
