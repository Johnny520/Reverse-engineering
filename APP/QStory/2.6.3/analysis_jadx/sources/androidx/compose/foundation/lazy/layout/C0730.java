package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0109;
import androidx.compose.runtime.C1391;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.layout.C1661;
import androidx.compose.ui.layout.C1662;
import androidx.compose.ui.layout.C1665;
import androidx.compose.ui.layout.C1719;
import androidx.compose.ui.layout.InterfaceC1718;
import com.bumptech.glide.AbstractC3057;
import kotlin.time.AbstractC5158;
import kotlin.time.AbstractC5160;
import kotlin.time.C5157;
import kotlin.time.DurationUnit;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p205.C7898;
import p305.C8623;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0730 implements InterfaceC0697 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1662 f2044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC1718 f2045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7898 f2046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6558 f2047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0108 f2048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public long f2050;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f2051;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f2052;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0734 f2053;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public long f2054;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f2055;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f2056;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f2057;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f2058;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C0731 f2059;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2060;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object f2061;

    public C0730(C0734 c0734, int i, C0108 c0108, InterfaceC6558 interfaceC6558) {
        this.f2053 = c0734;
        this.f2049 = i;
        this.f2048 = c0108;
        this.f2047 = interfaceC6558;
        int i2 = AbstractC5158.f14715;
        this.f2055 = System.nanoTime() - AbstractC5158.f14716;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0697
    public final void cancel() {
        if (this.f2056) {
            return;
        }
        this.f2056 = true;
        m1533();
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f2049 + ", constraints = " + this.f2046 + ", isComposed = " + m1530() + ", isMeasured = " + this.f2057 + ", isCanceled = " + this.f2056 + " }";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1529(Object obj, Object obj2, C0705 c0705) {
        C1662 c1662;
        C1662 c16622 = this.f2044;
        int i = 0;
        if (c16622 == null) {
            C0734 c0734 = this.f2053;
            InterfaceC6554 interfaceC6554M1507 = ((C0711) c0734.f2071).m1507(obj, this.f2049, obj2);
            C1661 c1661M3136 = ((C1719) c0734.f2070).m3136();
            if (c1661M3136.f4874.m3243()) {
                c1661M3136.m3069(obj, interfaceC6554M1507, true);
                c1662 = new C1662(c1661M3136, obj, 1);
            } else {
                c1662 = new C1662(c1661M3136, obj, i);
            }
            c16622 = c1662;
            this.f2044 = c16622;
            this.f2061 = obj;
        }
        this.f2052 = false;
        while (!c16622.m3074() && !this.f2052) {
            C0679 c0679 = new C0679(this, i, c0705);
            switch (c16622.f4877) {
                case 0:
                    break;
                default:
                    C1665 c1665M3075 = c16622.m3075();
                    C1391 c1391 = c1665M3075 != null ? c1665M3075.f4881 : null;
                    if (c1391 != null && !c1391.m2534()) {
                        AbstractC1286 abstractC1286M2231 = AbstractC1274.m2231();
                        InterfaceC6558 interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
                        AbstractC1286 abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
                        try {
                            c1391.m2532(c0679);
                        } finally {
                        }
                    }
                    break;
            }
        }
        m1534();
        boolean z = this.f2052;
        long j = this.f2054;
        if (z) {
            c0705.f1985 = C0705.m1503(j, c0705.f1985);
        } else {
            c0705.f1986 = C0705.m1503(j, c0705.f1986);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m1530() {
        C1662 c1662;
        return this.f2060 || ((c1662 = this.f2044) != null && c1662.m3074());
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1531(androidx.appcompat.app.C0109 r20) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C0730.m1531(androidx.appcompat.app.飘花落叶言子苏楪世哲兰):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m1532(C0109 c0109) {
        boolean zM1531;
        if (!this.f2053.f2072) {
            return false;
        }
        if (this.f2051) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM1531 = m1531(c0109);
            } finally {
                Trace.endSection();
            }
        } else {
            zM1531 = m1531(c0109);
        }
        AbstractC3057.m6733(-1L, "compose:lazy:prefetch:execute:item");
        return zM1531;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1533() {
        C1662 c1662 = this.f2044;
        if (c1662 != null) {
            switch (c1662.f4877) {
                case 0:
                    break;
                default:
                    C1665 c1665M3075 = c1662.m3075();
                    if ((c1665M3075 != null ? c1665M3075.f4881 : null) != null) {
                        C1661.m3062(c1662.f4876, c1662.f4875);
                    }
                    break;
            }
        }
        this.f2044 = null;
        InterfaceC1718 interfaceC1718 = this.f2045;
        if (interfaceC1718 != null) {
            interfaceC1718.dispose();
        }
        this.f2045 = null;
        this.f2059 = null;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0697
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1498() {
        this.f2051 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1534() {
        int i = AbstractC5158.f14715;
        long jNanoTime = System.nanoTime() - AbstractC5158.f14716;
        long j = this.f2055;
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        durationUnit.getClass();
        long jM10207 = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j) {
                C8623 c8623 = C5157.f14712;
            } else {
                jM10207 = C5157.m10193(j < 0 ? C5157.f14711 : C5157.f14713);
            }
        } else if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
            jM10207 = jNanoTime < 0 ? C5157.f14711 : C5157.f14713;
        } else {
            long j2 = jNanoTime - j;
            if (((~(j2 ^ j)) & (j2 ^ jNanoTime)) < 0) {
                DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
                if (durationUnit.compareTo(durationUnit2) < 0) {
                    durationUnit2.getClass();
                    long jConvert = durationUnit.getTimeUnit().convert(1L, durationUnit2.getTimeUnit());
                    long j3 = (jNanoTime / jConvert) - (j / jConvert);
                    long j4 = (jNanoTime % jConvert) - (j % jConvert);
                    C8623 c86232 = C5157.f14712;
                    jM10207 = C5157.m10194(AbstractC5160.m10207(j3, durationUnit2), AbstractC5160.m10207(j4, durationUnit));
                } else {
                    jM10207 = C5157.m10193(j2 < 0 ? C5157.f14711 : C5157.f14713);
                }
            } else {
                jM10207 = AbstractC5160.m10207(j2, durationUnit);
            }
        }
        long j5 = jM10207 >> 1;
        C8623 c86233 = C5157.f14712;
        long j6 = (1 & ((int) jM10207)) == 0 ? j5 : j5 > 9223372036854L ? Long.MAX_VALUE : j5 < -9223372036854L ? Long.MIN_VALUE : j5 * 1000000;
        this.f2054 = j6;
        long j7 = this.f2050 - j6;
        this.f2050 = j7;
        this.f2055 = jNanoTime;
        AbstractC3057.m6733(j7, "compose:lazy:prefetch:available_time_nanos");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m1535(long j, long j2) {
        if (this.f2051) {
            j2 = 0;
        }
        return j > j2;
    }
}
