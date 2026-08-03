package Yue;

import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۢۡ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4774.class})
@InterfaceC7470(version = "1.9")
@InterfaceC7507({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
public final class C7744 extends AbstractC2989 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f23281;

    public C7744() {
        super(EnumC4559.f9810);
        mo44();
    }

    @Override // Yue.AbstractC2989
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public long mo5798() {
        return this.f23281;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m24623(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f23281 + C4562.m13604(m5796()) + " is advanced by " + ((Object) C4555.m13455(j)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m24624(long j) {
        long jM13452 = C4555.m13452(j, m5796());
        if (((jM13452 - 1) | 1) != Long.MAX_VALUE) {
            long j2 = this.f23281;
            long j3 = j2 + jM13452;
            if ((jM13452 ^ j2) >= 0 && (j2 ^ j3) < 0) {
                m24623(j);
            }
            this.f23281 = j3;
            return;
        }
        long jM13398 = C4555.m13398(j, 2);
        if ((1 | (C4555.m13452(jM13398, m5796()) - 1)) == Long.MAX_VALUE) {
            m24623(j);
            return;
        }
        long j4 = this.f23281;
        try {
            m24624(jM13398);
            m24624(C4555.m13441(j, jM13398));
        } catch (IllegalStateException e) {
            this.f23281 = j4;
            throw e;
        }
    }
}
