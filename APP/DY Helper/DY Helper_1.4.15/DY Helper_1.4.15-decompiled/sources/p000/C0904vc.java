package p000;

/* JADX INFO: renamed from: vc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0904vc implements p000.jb2 {

    /* JADX INFO: renamed from: ε */
    public java.lang.Object f11226;

    /* JADX INFO: renamed from: ζ */
    public p000.C0015ae f11227;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.C0942wc f11228;

    public C0904vc(p000.C0942wc r1) {
            r0 = this;
            r0.<init>()
            r0.f11228 = r1
            uy r1 = p000.AbstractC1016yc.f12571
            r0.f11226 = r1
            return
    }

    @Override // p000.jb2
    /* JADX INFO: renamed from: α */
    public final void mo70(p000.sr1 r1, int r2) {
            r0 = this;
            ae r0 = r0.f11227
            if (r0 == 0) goto L7
            r0.mo70(r1, r2)
        L7:
            return
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m6166(p000.AbstractC0695pp r17) {
            r16 = this;
            r5 = r16
            java.lang.Object r0 = r5.f11226
            uy r1 = p000.AbstractC1016yc.f12571
            r6 = 1
            if (r0 == r1) goto Lf
            uy r1 = p000.AbstractC1016yc.f12567
            if (r0 == r1) goto Lf
            goto L138
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0942wc.f11669
            wc r7 = r5.f11228
            java.lang.Object r0 = r0.get(r7)
            ve r0 = (p000.C0906ve) r0
        L19:
            r7.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.C0942wc.f11664
            long r1 = r1.get(r7)
            boolean r1 = r7.m6370(r1, r6)
            if (r1 == 0) goto L38
            uy r0 = p000.AbstractC1016yc.f12567
            r5.f11226 = r0
            java.lang.Throwable r0 = r7.m6367()
            if (r0 != 0) goto L35
            r6 = 0
            goto L138
        L35:
            int r1 = p000.rz1.f9635
            throw r0
        L38:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.C0942wc.f11665
            long r3 = r1.getAndIncrement(r7)
            int r1 = p000.AbstractC1016yc.f12557
            long r1 = (long) r1
            long r8 = r3 / r1
            long r1 = r3 % r1
            int r2 = (int) r1
            long r10 = r0.f10004
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L53
            ve r1 = r7.m6366(r8, r0)
            if (r1 != 0) goto L54
            goto L19
        L53:
            r1 = r0
        L54:
            r12 = 0
            r8 = r1
            r9 = r2
            r10 = r3
            java.lang.Object r0 = r7.m6358(r8, r9, r10, r12)
            uy r8 = p000.AbstractC1016yc.f12568
            r9 = 0
            if (r0 == r8) goto L13d
            uy r10 = p000.AbstractC1016yc.f12570
            if (r0 != r10) goto L72
            long r8 = r7.m6369()
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L70
            r1.m2974()
        L70:
            r0 = r1
            goto L19
        L72:
            uy r11 = p000.AbstractC1016yc.f12569
            if (r0 != r11) goto L133
            wc r0 = r5.f11228
            op r11 = p000.AbstractC0978xb.m6563(r17)
            ae r11 = p000.AbstractC0978xb.m6559(r11)
            r5.f11227 = r11     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r12 = r0.m6358(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L8d
            if (r12 != r8) goto L90
            r5.mo70(r1, r2)     // Catch: java.lang.Throwable -> L8d
            goto L12a
        L8d:
            r0 = move-exception
            goto L12f
        L90:
            if (r12 != r10) goto L11f
            long r12 = r0.m6369()     // Catch: java.lang.Throwable -> L8d
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 >= 0) goto L9d
            r1.m2974()     // Catch: java.lang.Throwable -> L8d
        L9d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0942wc.f11669     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L8d
            ve r1 = (p000.C0906ve) r1     // Catch: java.lang.Throwable -> L8d
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000.C0942wc.f11664     // Catch: java.lang.Throwable -> L8d
            long r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L8d
            boolean r2 = r0.m6370(r2, r6)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto Ld1
            ae r0 = r5.f11227     // Catch: java.lang.Throwable -> L8d
            r0.getClass()     // Catch: java.lang.Throwable -> L8d
            r5.f11227 = r9     // Catch: java.lang.Throwable -> L8d
            uy r1 = p000.AbstractC1016yc.f12567     // Catch: java.lang.Throwable -> L8d
            r5.f11226 = r1     // Catch: java.lang.Throwable -> L8d
            java.lang.Throwable r1 = r7.m6367()     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto Lc8
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8d
            r0.mo75(r1)     // Catch: java.lang.Throwable -> L8d
            goto L12a
        Lc8:
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L8d
            r0.mo75(r2)     // Catch: java.lang.Throwable -> L8d
            goto L12a
        Ld1:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000.C0942wc.f11665     // Catch: java.lang.Throwable -> L8d
            long r3 = r2.getAndIncrement(r0)     // Catch: java.lang.Throwable -> L8d
            int r2 = p000.AbstractC1016yc.f12557     // Catch: java.lang.Throwable -> L8d
            long r12 = (long) r2     // Catch: java.lang.Throwable -> L8d
            long r14 = r3 / r12
            long r12 = r3 % r12
            int r2 = (int) r12     // Catch: java.lang.Throwable -> L8d
            long r12 = r1.f10004     // Catch: java.lang.Throwable -> L8d
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 == 0) goto Led
            ve r8 = r0.m6366(r14, r1)     // Catch: java.lang.Throwable -> L8d
            if (r8 != 0) goto Lec
            goto La5
        Lec:
            r1 = r8
        Led:
            java.lang.Object r8 = r0.m6358(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L8d
            uy r10 = p000.AbstractC1016yc.f12568     // Catch: java.lang.Throwable -> L8d
            if (r8 != r10) goto Lf9
            r5.mo70(r1, r2)     // Catch: java.lang.Throwable -> L8d
            goto L12a
        Lf9:
            uy r2 = p000.AbstractC1016yc.f12570     // Catch: java.lang.Throwable -> L8d
            if (r8 != r2) goto L109
            long r12 = r0.m6369()     // Catch: java.lang.Throwable -> L8d
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 >= 0) goto La5
            r1.m2974()     // Catch: java.lang.Throwable -> L8d
            goto La5
        L109:
            uy r0 = p000.AbstractC1016yc.f12569     // Catch: java.lang.Throwable -> L8d
            if (r8 == r0) goto L117
            r1.m2974()     // Catch: java.lang.Throwable -> L8d
            r5.f11226 = r8     // Catch: java.lang.Throwable -> L8d
            r5.f11227 = r9     // Catch: java.lang.Throwable -> L8d
        L114:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8d
            goto L127
        L117:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        L11f:
            r1.m2974()     // Catch: java.lang.Throwable -> L8d
            r5.f11226 = r12     // Catch: java.lang.Throwable -> L8d
            r5.f11227 = r9     // Catch: java.lang.Throwable -> L8d
            goto L114
        L127:
            r11.m67(r0, r9)     // Catch: java.lang.Throwable -> L8d
        L12a:
            java.lang.Object r0 = r11.m86()
            return r0
        L12f:
            r11.m66()
            throw r0
        L133:
            r1.m2974()
            r5.f11226 = r0
        L138:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L13d:
            java.lang.String r0 = "unreachable"
            p000.C1080.m7279(r0)
            return r9
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object m6167() {
            r2 = this;
            java.lang.Object r0 = r2.f11226
            uy r1 = p000.AbstractC1016yc.f12571
            if (r0 == r1) goto L1f
            r2.f11226 = r1
            uy r1 = p000.AbstractC1016yc.f12567
            if (r0 == r1) goto Ld
            return r0
        Ld:
            wc r2 = r2.f11228
            java.lang.Throwable r2 = r2.m6367()
            if (r2 != 0) goto L1c
            uh r2 = new uh
            java.lang.String r0 = "Channel was closed"
            r2.<init>(r0)
        L1c:
            int r0 = p000.rz1.f9635
            throw r2
        L1f:
            java.lang.String r2 = "`hasNext()` has not been invoked"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }
}
