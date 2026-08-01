package p091g2;

import java.util.List;
import p024b9.AbstractC1043k;
import p073f2.AbstractC2263r;
import p073f2.C2235d;
import p073f2.C2236d0;
import p091g2.C2509f;
import p120i2.AbstractC3167a;
import p121i3.AbstractC3171a0;
import p121i3.C3196z;
import p250r1.C6455e;

/* JADX INFO: renamed from: g2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2505b implements InterfaceC2506c {

    /* JADX INFO: renamed from: a */
    public final C2509f.a f6761a;

    /* JADX INFO: renamed from: b */
    public final C2509f f6762b;

    /* JADX INFO: renamed from: c */
    public final C2509f f6763c;

    /* JADX INFO: renamed from: d */
    public long f6764d;

    /* JADX INFO: renamed from: e */
    public long f6765e;

    public C2505b() {
        C2509f.a aVar = C2509f.a.f6776q;
        this.f6761a = aVar;
        boolean z10 = false;
        int i10 = 1;
        AbstractC1043k abstractC1043k = null;
        this.f6762b = new C2509f(z10, aVar, i10, abstractC1043k);
        this.f6763c = new C2509f(z10, aVar, i10, abstractC1043k);
        this.f6764d = C6455e.f20314b.m25569c();
    }

    @Override // p091g2.InterfaceC2506c
    /* JADX INFO: renamed from: a */
    public long mo8984a(long j10) {
        if (!(C3196z.m12137h(j10) > 0.0f && C3196z.m12138i(j10) > 0.0f)) {
            AbstractC3167a.m11956b("maximumVelocity should be a positive value. You specified=" + ((Object) C3196z.m12143n(j10)));
        }
        return AbstractC3171a0.m11961a(this.f6762b.m9004d(C3196z.m12137h(j10)), this.f6763c.m9004d(C3196z.m12138i(j10)));
    }

    @Override // p091g2.InterfaceC2506c
    /* JADX INFO: renamed from: b */
    public void mo8985b(C2236d0 c2236d0, long j10) {
        if (AbstractC2511h.m9016g()) {
            m8988e(c2236d0, j10);
        } else {
            m8987d(c2236d0, j10);
        }
    }

    @Override // p091g2.InterfaceC2506c
    /* JADX INFO: renamed from: c */
    public void mo8986c() {
        this.f6762b.m9005e();
        this.f6763c.m9005e();
        this.f6765e = 0L;
    }

    /* JADX INFO: renamed from: d */
    public final void m8987d(C2236d0 c2236d0, long j10) {
        if (AbstractC2263r.m8229b(c2236d0)) {
            this.f6764d = c2236d0.m8077h();
            mo8986c();
        }
        long jM8080k = c2236d0.m8080k();
        List listM8074e = c2236d0.m8074e();
        int size = listM8074e.size();
        int i10 = 0;
        while (i10 < size) {
            C2235d c2235d = (C2235d) listM8074e.get(i10);
            long jM25562p = C6455e.m25562p(c2235d.m8068b(), jM8080k);
            long jM8068b = c2235d.m8068b();
            this.f6764d = C6455e.m25563q(this.f6764d, jM25562p);
            m8989f(c2235d.m8069c(), C6455e.m25563q(this.f6764d, j10));
            i10++;
            jM8080k = jM8068b;
        }
        this.f6764d = C6455e.m25563q(this.f6764d, C6455e.m25562p(c2236d0.m8077h(), jM8080k));
        m8989f(c2236d0.m8084o(), C6455e.m25563q(this.f6764d, j10));
    }

    /* JADX INFO: renamed from: e */
    public final void m8988e(C2236d0 c2236d0, long j10) {
        if (AbstractC2263r.m8229b(c2236d0)) {
            mo8986c();
        }
        if (!AbstractC2263r.m8231d(c2236d0)) {
            List listM8074e = c2236d0.m8074e();
            int size = listM8074e.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2235d c2235d = (C2235d) listM8074e.get(i10);
                m8989f(c2235d.m8069c(), C6455e.m25563q(c2235d.m8067a(), j10));
            }
            m8989f(c2236d0.m8084o(), C6455e.m25563q(c2236d0.m8076g(), j10));
        }
        if (AbstractC2263r.m8231d(c2236d0) && c2236d0.m8084o() - this.f6765e > 40) {
            mo8986c();
        }
        this.f6765e = c2236d0.m8084o();
    }

    /* JADX INFO: renamed from: f */
    public void m8989f(long j10, long j11) {
        this.f6762b.m9001a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        this.f6763c.m9001a(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }
}
