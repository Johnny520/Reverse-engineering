package p165l1;

import p121i3.C3185o;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p165l1.InterfaceC4499e;

/* JADX INFO: renamed from: l1.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4500f implements InterfaceC4499e {

    /* JADX INFO: renamed from: b */
    public final float f13045b;

    /* JADX INFO: renamed from: c */
    public final float f13046c;

    /* JADX INFO: renamed from: l1.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC4499e.b {

        /* JADX INFO: renamed from: a */
        public final float f13047a;

        public a(float f10) {
            this.f13047a = f10;
        }

        @Override // p165l1.InterfaceC4499e.b
        /* JADX INFO: renamed from: a */
        public int mo17427a(int i10, int i11, EnumC3191u enumC3191u) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.f13047a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f13047a, ((a) obj).f13047a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f13047a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f13047a + ')';
        }
    }

    public C4500f(float f10, float f11) {
        this.f13045b = f10;
        this.f13046c = f11;
    }

    @Override // p165l1.InterfaceC4499e
    /* JADX INFO: renamed from: a */
    public long mo17411a(long j10, long j11, EnumC3191u enumC3191u) {
        long jM12082c = C3189s.m12082c((((long) (((int) (j11 >> 32)) - ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L));
        float f10 = 1;
        return C3185o.m12044d((((long) Math.round((((int) (jM12082c >> 32)) / 2.0f) * (this.f13045b + f10))) << 32) | (((long) Math.round((((int) (jM12082c & 4294967295L)) / 2.0f) * (f10 + this.f13046c))) & 4294967295L));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4500f)) {
            return false;
        }
        C4500f c4500f = (C4500f) obj;
        return Float.compare(this.f13045b, c4500f.f13045b) == 0 && Float.compare(this.f13046c, c4500f.f13046c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f13045b) * 31) + Float.hashCode(this.f13046c);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f13045b + ", verticalBias=" + this.f13046c + ')';
    }
}
