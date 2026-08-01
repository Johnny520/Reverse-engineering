package p224q2;

import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p252v2.C3352a;

/* JADX INFO: renamed from: q2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2912c extends AbstractC2770B {

    /* JADX INFO: renamed from: a */
    public volatile AbstractC2770B f9201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f9202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f9203c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2785n f9204d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3352a f9205e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2913d f9206f;

    public C2912c(C2913d c2913d, boolean z5, boolean z6, C2785n c2785n, C3352a c3352a) {
        this.f9206f = c2913d;
        this.f9202b = z5;
        this.f9203c = z6;
        this.f9204d = c2785n;
        this.f9205e = c3352a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[SYNTHETIC] */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo4964b(p258w2.C3390a r11) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.f9202b
            if (r0 == 0) goto L9
            r11.m5636P()
            r11 = 0
            return r11
        L9:
            o2.B r0 = r10.f9201a
            if (r0 != 0) goto La0
            o2.n r0 = r10.f9204d
            q2.d r1 = r10.f9206f
            v2.a r2 = r10.f9205e
            r2.l r3 = r0.f8798d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.f9875e
            r2.k r5 = p230r2.C3136l.f9873f
            r6 = 1
            if (r1 != r5) goto L20
            goto L61
        L20:
            java.lang.Class r5 = r2.f10417a
            java.lang.Object r7 = r4.get(r5)
            o2.C r7 = (p213o2.InterfaceC2771C) r7
            if (r7 == 0) goto L2d
            if (r7 != r1) goto L62
            goto L61
        L2d:
            java.lang.Class<p2.a> r7 = p219p2.InterfaceC2890a.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            p2.a r7 = (p219p2.InterfaceC2890a) r7
            if (r7 != 0) goto L38
            goto L62
        L38:
            java.lang.Class r7 = r7.value()
            java.lang.Class<o2.C> r8 = p213o2.InterfaceC2771C.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L45
            goto L62
        L45:
            e2.h r8 = r3.f9874d
            v2.a r9 = new v2.a
            r9.<init>(r7)
            q2.o r7 = r8.m3725c(r9, r6)
            java.lang.Object r7 = r7.mo602c()
            o2.C r7 = (p213o2.InterfaceC2771C) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            o2.C r4 = (p213o2.InterfaceC2771C) r4
            if (r4 == 0) goto L5f
            r7 = r4
        L5f:
            if (r7 != r1) goto L62
        L61:
            r1 = r3
        L62:
            java.util.List r3 = r0.f8799e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L69:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r3.next()
            o2.C r5 = (p213o2.InterfaceC2771C) r5
            if (r4 != 0) goto L7b
            if (r5 != r1) goto L69
            r4 = r6
            goto L69
        L7b:
            o2.B r5 = r5.mo4967a(r0, r2)
            if (r5 == 0) goto L69
            r0 = r5
            goto L89
        L83:
            if (r4 != 0) goto L8c
            o2.B r0 = r0.m4973b(r2)
        L89:
            r10.f9201a = r0
            goto La0
        L8c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        La0:
            java.lang.Object r11 = r0.mo4964b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p224q2.C2912c.mo4964b(w2.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[SYNTHETIC] */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4965c(p258w2.C3391b r11, java.lang.Object r12) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.f9203c
            if (r0 == 0) goto L8
            r11.m5666n()
            return
        L8:
            o2.B r0 = r10.f9201a
            if (r0 != 0) goto L9f
            o2.n r0 = r10.f9204d
            q2.d r1 = r10.f9206f
            v2.a r2 = r10.f9205e
            r2.l r3 = r0.f8798d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.f9875e
            r2.k r5 = p230r2.C3136l.f9873f
            r6 = 1
            if (r1 != r5) goto L1f
            goto L60
        L1f:
            java.lang.Class r5 = r2.f10417a
            java.lang.Object r7 = r4.get(r5)
            o2.C r7 = (p213o2.InterfaceC2771C) r7
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L61
            goto L60
        L2c:
            java.lang.Class<p2.a> r7 = p219p2.InterfaceC2890a.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            p2.a r7 = (p219p2.InterfaceC2890a) r7
            if (r7 != 0) goto L37
            goto L61
        L37:
            java.lang.Class r7 = r7.value()
            java.lang.Class<o2.C> r8 = p213o2.InterfaceC2771C.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L44
            goto L61
        L44:
            e2.h r8 = r3.f9874d
            v2.a r9 = new v2.a
            r9.<init>(r7)
            q2.o r7 = r8.m3725c(r9, r6)
            java.lang.Object r7 = r7.mo602c()
            o2.C r7 = (p213o2.InterfaceC2771C) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            o2.C r4 = (p213o2.InterfaceC2771C) r4
            if (r4 == 0) goto L5e
            r7 = r4
        L5e:
            if (r7 != r1) goto L61
        L60:
            r1 = r3
        L61:
            java.util.List r3 = r0.f8799e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L68:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r3.next()
            o2.C r5 = (p213o2.InterfaceC2771C) r5
            if (r4 != 0) goto L7a
            if (r5 != r1) goto L68
            r4 = r6
            goto L68
        L7a:
            o2.B r5 = r5.mo4967a(r0, r2)
            if (r5 == 0) goto L68
            r0 = r5
            goto L88
        L82:
            if (r4 != 0) goto L8b
            o2.B r0 = r0.m4973b(r2)
        L88:
            r10.f9201a = r0
            goto L9f
        L8b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            r12.<init>(r0)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L9f:
            r0.mo4965c(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p224q2.C2912c.mo4965c(w2.b, java.lang.Object):void");
    }
}
