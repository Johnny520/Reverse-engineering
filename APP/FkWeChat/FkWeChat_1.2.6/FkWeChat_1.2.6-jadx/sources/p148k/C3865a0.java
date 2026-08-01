package p148k;

import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: k.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3865a0 {

    /* JADX INFO: renamed from: a */
    public final float f11061a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3175e f11062b;

    /* JADX INFO: renamed from: c */
    public final float f11063c;

    /* JADX INFO: renamed from: k.a0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final float f11064a;

        /* JADX INFO: renamed from: b */
        public final float f11065b;

        /* JADX INFO: renamed from: c */
        public final long f11066c;

        public a(float f10, float f11, long j10) {
            this.f11064a = f10;
            this.f11065b = f11;
            this.f11066c = j10;
        }

        /* JADX INFO: renamed from: a */
        public final float m15319a(long j10) {
            long j11 = this.f11066c;
            return this.f11065b * Math.signum(this.f11064a) * C3864a.f11055a.m15311b(j11 > 0 ? j10 / j11 : 1.0f).m15312a();
        }

        /* JADX INFO: renamed from: b */
        public final float m15320b(long j10) {
            long j11 = this.f11066c;
            return (((C3864a.f11055a.m15311b(j11 > 0 ? j10 / j11 : 1.0f).m15313b() * Math.signum(this.f11064a)) * this.f11065b) / this.f11066c) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f11064a, aVar.f11064a) == 0 && Float.compare(this.f11065b, aVar.f11065b) == 0 && this.f11066c == aVar.f11066c;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f11064a) * 31) + Float.hashCode(this.f11065b)) * 31) + Long.hashCode(this.f11066c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f11064a + ", distance=" + this.f11065b + ", duration=" + this.f11066c + ')';
        }
    }

    public C3865a0(float f10, InterfaceC3175e interfaceC3175e) {
        this.f11061a = f10;
        this.f11062b = interfaceC3175e;
        this.f11063c = m15314a(interfaceC3175e);
    }

    /* JADX INFO: renamed from: a */
    public final float m15314a(InterfaceC3175e interfaceC3175e) {
        return AbstractC3867b0.m15341c(0.84f, interfaceC3175e.getDensity());
    }

    /* JADX INFO: renamed from: b */
    public final float m15315b(float f10) {
        return (float) (((double) (this.f11061a * this.f11063c)) * Math.exp((((double) AbstractC3867b0.f11111a) / (((double) AbstractC3867b0.f11111a) - 1.0d)) * m15318e(f10)));
    }

    /* JADX INFO: renamed from: c */
    public final long m15316c(float f10) {
        return (long) (Math.exp(m15318e(f10) / (((double) AbstractC3867b0.f11111a) - 1.0d)) * 1000.0d);
    }

    /* JADX INFO: renamed from: d */
    public final a m15317d(float f10) {
        double dM15318e = m15318e(f10);
        double d10 = ((double) AbstractC3867b0.f11111a) - 1.0d;
        return new a(f10, (float) (((double) (this.f11061a * this.f11063c)) * Math.exp((((double) AbstractC3867b0.f11111a) / d10) * dM15318e)), (long) (Math.exp(dM15318e / d10) * 1000.0d));
    }

    /* JADX INFO: renamed from: e */
    public final double m15318e(float f10) {
        return C3864a.f11055a.m15310a(f10, this.f11061a * this.f11063c);
    }
}
