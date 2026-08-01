package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.AbstractC0722;
import androidx.compose.foundation.lazy.layout.C0678;
import androidx.compose.foundation.lazy.layout.C0720;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0762 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0678 f2225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0745 f2226;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0760 f2227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0741 f2228;

    public C0762(C0741 c0741, C0760 c0760, C0745 c0745, C0678 c0678) {
        this.f2228 = c0741;
        this.f2227 = c0760;
        this.f2226 = c0745;
        this.f2225 = c0678;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0762)) {
            return false;
        }
        return AbstractC4394.m8917(this.f2227, ((C0762) obj).f2227);
    }

    public final int hashCode() {
        return this.f2227.hashCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m1560(int i) {
        C0678 c0678 = this.f2225;
        Object[] objArr = (Object[]) c0678.f1891;
        int i2 = i - c0678.f1893;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.f2227.m1518(i) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m1561() {
        C0760 c0760 = this.f2227;
        c0760.getClass();
        return c0760.f2223.f1893;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m1562(int i) {
        C0760 c0760 = this.f2227;
        c0760.getClass();
        C0720 c0720M1466 = c0760.f2223.m1466(i);
        return ((InterfaceC6557) c0720M1466.f2026.f320).invoke(Integer.valueOf(i - c0720M1466.f2028));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1563(int i, Object obj, InterfaceC1373 interfaceC1373, int i2) {
        int i3;
        Object obj2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-462424778);
        int i4 = (c1324.m2352(i) ? 4 : 2) | i2 | (c1324.m2368(obj) ? 32 : 16) | (c1324.m2350(this) ? 256 : 128);
        int i5 = 0;
        if (c1324.m2333(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            AbstractC0722.m1510(obj2, i3, this.f2228.f2110, AbstractC1254.m2179(-824725566, new C0764(this, i, i5), c1324), c1324, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0765(this, i3, obj2, i2);
        }
    }
}
