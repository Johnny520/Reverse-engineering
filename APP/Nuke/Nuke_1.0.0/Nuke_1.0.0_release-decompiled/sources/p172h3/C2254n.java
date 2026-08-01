package p172h3;

import p011B4.AbstractC0231b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p117X2.AbstractC1676u;

/* JADX INFO: renamed from: h3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2254n extends C2243c {

    /* JADX INFO: renamed from: n */
    public final EnumC2241a f7395n;

    public C2254n(int i5, EnumC2241a enumC2241a) {
        super(i5);
        this.f7395n = enumC2241a;
        if (enumC2241a != EnumC2241a.f7351d) {
            if (i5 < 1) {
                throw new IllegalArgumentException(AbstractC0231b.m397h(i5, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC1676u.m2995a(C2243c.class).m2978b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4109F(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            h3.a r1 = r15.f7395n
            h3.a r2 = p172h3.EnumC2241a.f7353f
            K2.q r8 = p056K2.C0891q.f2780a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.mo4090o(r16)
            boolean r2 = r1 instanceof p172h3.C2249i
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof p172h3.C2248h
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            Y1.n r6 = p172h3.AbstractC2245e.f7372d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p172h3.C2243c.f7362i
            java.lang.Object r1 = r1.get(r15)
            h3.k r1 = (p172h3.C2251k) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p172h3.C2243c.f7358e
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.m4095u(r2, r7)
            int r9 = p172h3.AbstractC2245e.f7370b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f7958c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            h3.k r2 = p172h3.C2243c.m4071b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.m4093r()
            h3.h r2 = new h3.h
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = p172h3.C2243c.m4073e(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.m4385a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p172h3.C2243c.f7359f
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.m4385a()
        L7e:
            java.lang.Throwable r1 = r15.m4093r()
            h3.h r2 = new h3.h
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.m4406h()
            java.lang.Throwable r1 = r15.m4093r()
            h3.h r2 = new h3.h
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof p160f3.InterfaceC2158r0
            if (r3 == 0) goto La6
            f3.r0 r6 = (p160f3.InterfaceC2158r0) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.mo3961a(r1, r12)
        Lae:
            long r3 = r1.f7958c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.m4086k(r3)
        Lb6:
            return r8
        Lb7:
            r1.m4385a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p172h3.C2254n.m4109F(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // p172h3.C2243c, p172h3.InterfaceC2258r
    /* JADX INFO: renamed from: a */
    public final Object mo4079a(InterfaceC1046d interfaceC1046d, Object obj) throws Throwable {
        if (m4109F(obj, true) instanceof C2248h) {
            throw m4093r();
        }
        return C0891q.f2780a;
    }

    @Override // p172h3.C2243c, p172h3.InterfaceC2258r
    /* JADX INFO: renamed from: o */
    public final Object mo4090o(Object obj) {
        return m4109F(obj, false);
    }

    @Override // p172h3.C2243c
    /* JADX INFO: renamed from: v */
    public final boolean mo4096v() {
        return this.f7395n == EnumC2241a.f7352e;
    }
}
