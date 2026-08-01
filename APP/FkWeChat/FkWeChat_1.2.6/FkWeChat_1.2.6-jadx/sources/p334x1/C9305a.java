package p334x1;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.AbstractC3190t;
import p121i3.C3185o;
import p121i3.C3189s;
import p265s1.AbstractC7054b2;
import p265s1.AbstractC7133r1;
import p265s1.InterfaceC7089i2;
import p290u1.InterfaceC8487f;
import p376zd.C9987e;

/* JADX INFO: renamed from: x1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9305a extends AbstractC9307c {

    /* JADX INFO: renamed from: g */
    public final InterfaceC7089i2 f31849g;

    /* JADX INFO: renamed from: h */
    public final long f31850h;

    /* JADX INFO: renamed from: i */
    public final long f31851i;

    /* JADX INFO: renamed from: j */
    public int f31852j;

    /* JADX INFO: renamed from: k */
    public final long f31853k;

    /* JADX INFO: renamed from: l */
    public float f31854l;

    /* JADX INFO: renamed from: m */
    public AbstractC7133r1 f31855m;

    public /* synthetic */ C9305a(InterfaceC7089i2 interfaceC7089i2, long j10, long j11, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC7089i2, (i10 & 2) != 0 ? C3185o.f8471b.m12058b() : j10, (i10 & 4) != 0 ? C3189s.m12082c((((long) interfaceC7089i2.mo27905a()) & 4294967295L) | (((long) interfaceC7089i2.mo27908e()) << 32)) : j11, null);
    }

    @Override // p334x1.AbstractC9307c
    /* JADX INFO: renamed from: a */
    public boolean mo36267a(float f10) {
        this.f31854l = f10;
        return true;
    }

    @Override // p334x1.AbstractC9307c
    /* JADX INFO: renamed from: b */
    public boolean mo36268b(AbstractC7133r1 abstractC7133r1) {
        this.f31855m = abstractC7133r1;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9305a)) {
            return false;
        }
        C9305a c9305a = (C9305a) obj;
        return AbstractC1061t.m3842c(this.f31849g, c9305a.f31849g) && C3185o.m12048h(this.f31850h, c9305a.f31850h) && C3189s.m12084e(this.f31851i, c9305a.f31851i) && AbstractC7054b2.m27765d(this.f31852j, c9305a.f31852j);
    }

    @Override // p334x1.AbstractC9307c
    /* JADX INFO: renamed from: h */
    public long mo36269h() {
        return AbstractC3190t.m12092d(this.f31853k);
    }

    public int hashCode() {
        return (((((this.f31849g.hashCode() * 31) + C3185o.m12051k(this.f31850h)) * 31) + C3189s.m12085f(this.f31851i)) * 31) + AbstractC7054b2.m27766e(this.f31852j);
    }

    @Override // p334x1.AbstractC9307c
    /* JADX INFO: renamed from: j */
    public void mo36270j(InterfaceC8487f interfaceC8487f) {
        InterfaceC8487f.m32647F0(interfaceC8487f, this.f31849g, this.f31850h, this.f31851i, 0L, C3189s.m12082c((((long) Math.round(Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() >> 32)))) << 32)), this.f31854l, null, this.f31855m, 0, this.f31852j, 328, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m36271k(int i10) {
        this.f31852j = i10;
    }

    /* JADX INFO: renamed from: l */
    public final long m36272l(long j10, long j11) {
        int i10;
        int i11;
        if (C3185o.m12049i(j10) >= 0 && C3185o.m12050j(j10) >= 0 && (i10 = (int) (j11 >> 32)) >= 0 && (i11 = (int) (4294967295L & j11)) >= 0 && i10 <= this.f31849g.mo27908e() && i11 <= this.f31849g.mo27905a()) {
            return j11;
        }
        C9987e.m38645a("Failed requirement.");
        return 0L;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f31849g + ", srcOffset=" + ((Object) C3185o.m12054n(this.f31850h)) + ", srcSize=" + ((Object) C3189s.m12086g(this.f31851i)) + ", filterQuality=" + ((Object) AbstractC7054b2.m27767f(this.f31852j)) + ')';
    }

    public C9305a(InterfaceC7089i2 interfaceC7089i2, long j10, long j11) {
        this.f31849g = interfaceC7089i2;
        this.f31850h = j10;
        this.f31851i = j11;
        this.f31852j = AbstractC7054b2.f23487a.m27768a();
        this.f31853k = m36272l(j10, j11);
        this.f31854l = 1.0f;
    }

    public /* synthetic */ C9305a(InterfaceC7089i2 interfaceC7089i2, long j10, long j11, AbstractC1043k abstractC1043k) {
        this(interfaceC7089i2, j10, j11);
    }
}
