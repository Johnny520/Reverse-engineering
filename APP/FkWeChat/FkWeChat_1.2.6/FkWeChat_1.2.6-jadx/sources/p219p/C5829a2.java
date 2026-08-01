package p219p;

import p024b9.AbstractC1043k;
import p073f2.C2236d0;
import p250r1.C6455e;

/* JADX INFO: renamed from: p.a2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5829a2 {

    /* JADX INFO: renamed from: a */
    public final EnumC5898w0 f18258a;

    /* JADX INFO: renamed from: b */
    public long f18259b;

    public /* synthetic */ C5829a2(EnumC5898w0 enumC5898w0, long j10, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : enumC5898w0, (i10 & 2) != 0 ? C6455e.f20314b.m25569c() : j10, null);
    }

    /* JADX INFO: renamed from: a */
    public final long m23483a(C2236d0 c2236d0, float f10) {
        long jM25563q = C6455e.m25563q(this.f18259b, C6455e.m25562p(c2236d0.m8077h(), c2236d0.m8080k()));
        this.f18259b = jM25563q;
        return (this.f18258a == null ? C6455e.m25557k(jM25563q) : Math.abs(m23486d(jM25563q))) >= f10 ? m23484b(f10) : C6455e.f20314b.m25568b();
    }

    /* JADX INFO: renamed from: b */
    public final long m23484b(float f10) {
        EnumC5898w0 enumC5898w0 = this.f18258a;
        long j10 = this.f18259b;
        if (enumC5898w0 == null) {
            return C6455e.m25562p(this.f18259b, C6455e.m25564r(C6455e.m25554h(j10, C6455e.m25557k(j10)), f10));
        }
        float fM23486d = m23486d(j10) - (Math.signum(m23486d(this.f18259b)) * f10);
        float fM23485c = m23485c(this.f18259b);
        if (this.f18258a == EnumC5898w0.f18787r) {
            return C6455e.m25551e((((long) Float.floatToRawIntBits(fM23486d)) << 32) | (((long) Float.floatToRawIntBits(fM23485c)) & 4294967295L));
        }
        return C6455e.m25551e((((long) Float.floatToRawIntBits(fM23485c)) << 32) | (((long) Float.floatToRawIntBits(fM23486d)) & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public final float m23485c(long j10) {
        return Float.intBitsToFloat((int) (this.f18258a == EnumC5898w0.f18787r ? j10 & 4294967295L : j10 >> 32));
    }

    /* JADX INFO: renamed from: d */
    public final float m23486d(long j10) {
        return Float.intBitsToFloat((int) (this.f18258a == EnumC5898w0.f18787r ? j10 >> 32 : j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: e */
    public final void m23487e() {
        this.f18259b = C6455e.f20314b.m25569c();
    }

    public C5829a2(EnumC5898w0 enumC5898w0, long j10) {
        this.f18258a = enumC5898w0;
        this.f18259b = j10;
    }

    public /* synthetic */ C5829a2(EnumC5898w0 enumC5898w0, long j10, AbstractC1043k abstractC1043k) {
        this(enumC5898w0, j10);
    }
}
