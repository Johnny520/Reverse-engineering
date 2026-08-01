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
import kotlin.time.AbstractC5157;
import kotlin.time.AbstractC5159;
import kotlin.time.C5156;
import kotlin.time.DurationUnit;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p205.C7897;
import p305.C8631;
import p316.C8675;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0730 implements InterfaceC0697 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1662 f2043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC1718 f2044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7897 f2045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6557 f2046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0108 f2047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2048;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public long f2049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f2050;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f2051;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C0734 f2052;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public long f2053;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f2054;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f2055;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f2056;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f2057;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C0731 f2058;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f2059;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object f2060;

    public C0730(C0734 c0734, int i, C0108 c0108, InterfaceC6557 interfaceC6557) {
        this.f2052 = c0734;
        this.f2048 = i;
        this.f2047 = c0108;
        this.f2046 = interfaceC6557;
        int i2 = AbstractC5157.f14715;
        this.f2054 = System.nanoTime() - AbstractC5157.f14716;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0697
    public final void cancel() {
        if (this.f2055) {
            return;
        }
        this.f2055 = true;
        m1523();
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f2048 + ", constraints = " + this.f2045 + ", isComposed = " + m1520() + ", isMeasured = " + this.f2056 + ", isCanceled = " + this.f2055 + " }";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1519(Object obj, Object obj2, C0705 c0705) {
        C1662 c1662;
        C1662 c16622 = this.f2043;
        int i = 0;
        if (c16622 == null) {
            C0734 c0734 = this.f2052;
            InterfaceC6553 interfaceC6553M1497 = ((C0711) c0734.f2070).m1497(obj, this.f2048, obj2);
            C1661 c1661M3126 = ((C1719) c0734.f2069).m3126();
            if (c1661M3126.f4873.m3233()) {
                c1661M3126.m3059(obj, interfaceC6553M1497, true);
                c1662 = new C1662(c1661M3126, obj, 1);
            } else {
                c1662 = new C1662(c1661M3126, obj, i);
            }
            c16622 = c1662;
            this.f2043 = c16622;
            this.f2060 = obj;
        }
        this.f2051 = false;
        while (!c16622.m3064() && !this.f2051) {
            C0679 c0679 = new C0679(this, i, c0705);
            switch (c16622.f4876) {
                case 0:
                    break;
                default:
                    C1665 c1665M3065 = c16622.m3065();
                    C1391 c1391 = c1665M3065 != null ? c1665M3065.f4880 : null;
                    if (c1391 != null && !c1391.m2524()) {
                        AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
                        InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
                        AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
                        try {
                            c1391.m2522(c0679);
                        } finally {
                        }
                    }
                    break;
            }
        }
        m1524();
        boolean z = this.f2051;
        long j = this.f2053;
        if (z) {
            c0705.f1984 = C0705.m1493(j, c0705.f1984);
        } else {
            c0705.f1985 = C0705.m1493(j, c0705.f1985);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m1520() {
        C1662 c1662;
        return this.f2059 || ((c1662 = this.f2043) != null && c1662.m3064());
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
    public final boolean m1521(androidx.appcompat.app.C0109 r20) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C0730.m1521(androidx.appcompat.app.飘花落叶言子苏楪世哲兰):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m1522(C0109 c0109) {
        boolean zM1521;
        if (!this.f2052.f2071) {
            return false;
        }
        if (this.f2050) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM1521 = m1521(c0109);
            } finally {
                Trace.endSection();
            }
        } else {
            zM1521 = m1521(c0109);
        }
        C8675.m14343(-1L, "compose:lazy:prefetch:execute:item");
        return zM1521;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1523() {
        C1662 c1662 = this.f2043;
        if (c1662 != null) {
            switch (c1662.f4876) {
                case 0:
                    break;
                default:
                    C1665 c1665M3065 = c1662.m3065();
                    if ((c1665M3065 != null ? c1665M3065.f4880 : null) != null) {
                        C1661.m3052(c1662.f4875, c1662.f4874);
                    }
                    break;
            }
        }
        this.f2043 = null;
        InterfaceC1718 interfaceC1718 = this.f2044;
        if (interfaceC1718 != null) {
            interfaceC1718.dispose();
        }
        this.f2044 = null;
        this.f2058 = null;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0697
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1488() {
        this.f2050 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1524() {
        int i = AbstractC5157.f14715;
        long jNanoTime = System.nanoTime() - AbstractC5157.f14716;
        long j = this.f2054;
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        durationUnit.getClass();
        long jM10203 = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j) {
                C8631 c8631 = C5156.f14712;
            } else {
                jM10203 = C5156.m10189(j < 0 ? C5156.f14711 : C5156.f14713);
            }
        } else if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
            jM10203 = jNanoTime < 0 ? C5156.f14711 : C5156.f14713;
        } else {
            long j2 = jNanoTime - j;
            if (((~(j2 ^ j)) & (j2 ^ jNanoTime)) < 0) {
                DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
                if (durationUnit.compareTo(durationUnit2) < 0) {
                    durationUnit2.getClass();
                    long jConvert = durationUnit.getTimeUnit().convert(1L, durationUnit2.getTimeUnit());
                    long j3 = (jNanoTime / jConvert) - (j / jConvert);
                    long j4 = (jNanoTime % jConvert) - (j % jConvert);
                    C8631 c86312 = C5156.f14712;
                    jM10203 = C5156.m10190(AbstractC5159.m10203(j3, durationUnit2), AbstractC5159.m10203(j4, durationUnit));
                } else {
                    jM10203 = C5156.m10189(j2 < 0 ? C5156.f14711 : C5156.f14713);
                }
            } else {
                jM10203 = AbstractC5159.m10203(j2, durationUnit);
            }
        }
        long j5 = jM10203 >> 1;
        C8631 c86313 = C5156.f14712;
        long j6 = (1 & ((int) jM10203)) == 0 ? j5 : j5 > 9223372036854L ? Long.MAX_VALUE : j5 < -9223372036854L ? Long.MIN_VALUE : j5 * 1000000;
        this.f2053 = j6;
        long j7 = this.f2049 - j6;
        this.f2049 = j7;
        this.f2054 = jNanoTime;
        C8675.m14343(j7, "compose:lazy:prefetch:available_time_nanos");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m1525(long j, long j2) {
        if (this.f2050) {
            j2 = 0;
        }
        return j > j2;
    }
}
