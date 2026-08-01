package p165l1;

import p121i3.C3185o;
import p121i3.EnumC3191u;
import p165l1.InterfaceC4499e;

/* JADX INFO: renamed from: l1.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4501g implements InterfaceC4499e {

    /* JADX INFO: renamed from: b */
    public final float f13048b;

    /* JADX INFO: renamed from: c */
    public final float f13049c;

    /* JADX INFO: renamed from: l1.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC4499e.b {

        /* JADX INFO: renamed from: a */
        public final float f13050a;

        public a(float f10) {
            this.f13050a = f10;
        }

        @Override // p165l1.InterfaceC4499e.b
        /* JADX INFO: renamed from: a */
        public int mo17427a(int i10, int i11, EnumC3191u enumC3191u) {
            float f10 = (i11 - i10) / 2.0f;
            EnumC3191u enumC3191u2 = EnumC3191u.f8484q;
            float f11 = this.f13050a;
            if (enumC3191u != enumC3191u2) {
                f11 *= -1;
            }
            return Math.round(f10 * (1 + f11));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f13050a, ((a) obj).f13050a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f13050a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f13050a + ')';
        }
    }

    /* JADX INFO: renamed from: l1.g$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC4499e.c {

        /* JADX INFO: renamed from: a */
        public final float f13051a;

        public b(float f10) {
            this.f13051a = f10;
        }

        @Override // p165l1.InterfaceC4499e.c
        /* JADX INFO: renamed from: a */
        public int mo17428a(int i10, int i11) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.f13051a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f13051a, ((b) obj).f13051a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f13051a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f13051a + ')';
        }
    }

    public C4501g(float f10, float f11) {
        this.f13048b = f10;
        this.f13049c = f11;
    }

    @Override // p165l1.InterfaceC4499e
    /* JADX INFO: renamed from: a */
    public long mo17411a(long j10, long j11, EnumC3191u enumC3191u) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        EnumC3191u enumC3191u2 = EnumC3191u.f8484q;
        float f12 = this.f13048b;
        if (enumC3191u != enumC3191u2) {
            f12 *= -1;
        }
        float f13 = 1;
        return C3185o.m12044d((((long) Math.round(f10 * (f12 + f13))) << 32) | (((long) Math.round(f11 * (f13 + this.f13049c))) & 4294967295L));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4501g)) {
            return false;
        }
        C4501g c4501g = (C4501g) obj;
        return Float.compare(this.f13048b, c4501g.f13048b) == 0 && Float.compare(this.f13049c, c4501g.f13049c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f13048b) * 31) + Float.hashCode(this.f13049c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f13048b + ", verticalBias=" + this.f13049c + ')';
    }
}
