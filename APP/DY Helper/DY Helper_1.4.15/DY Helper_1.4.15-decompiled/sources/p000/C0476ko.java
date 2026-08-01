package p000;

/* JADX INFO: renamed from: ko */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0476ko extends p000.C0942wc {

    /* JADX INFO: renamed from: ο */
    public final p000.EnumC0867uc f6059;

    public C0476ko(int r1, p000.EnumC0867uc r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f6059 = r2
            uc r0 = p000.EnumC0867uc.f10687
            if (r2 == r0) goto L1a
            r0 = 1
            if (r1 < r0) goto Ld
            return
        Ld:
            java.lang.String r0 = "Buffered channel capacity must be at least 1, but "
            java.lang.String r2 = " was specified"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r0, r1, r2)
            p000.C1080.m7266(r0)
            r0 = 0
            throw r0
        L1a:
            java.lang.Class<wc> r0 = p000.C0942wc.class
            wf r0 = p000.vm1.m6272(r0)
            java.lang.String r0 = r0.m6378()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This implementation does not support suspension for senders, use "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " instead"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: Ζ */
    public final java.lang.Object m3383(java.lang.Object r16, boolean r17) {
            r15 = this;
            uc r1 = r15.f6059
            uc r2 = p000.EnumC0867uc.f10689
            s62 r8 = p000.s62.f9751
            if (r1 != r2) goto L17
            java.lang.Object r0 = super.mo3385(r16)
            boolean r1 = r0 instanceof p000.C0869ue
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof p000.C0832te
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r0
        L17:
            uy r6 = p000.AbstractC1016yc.f12559
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0942wc.f11668
            java.lang.Object r1 = r1.get(r15)
            ve r1 = (p000.C0906ve) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000.C0942wc.f11664
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.m6370(r2, r7)
            int r9 = p000.AbstractC1016yc.f12557
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f10004
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            ve r2 = p000.C0942wc.m6353(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r0 = r15.m6368()
            te r1 = new te
            r1.<init>(r0)
            return r1
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = p000.C0942wc.m6355(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb6
            r3 = 1
            if (r12 == r3) goto Lb5
            r3 = 2
            if (r12 == r3) goto L8f
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.m2974()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000.C0942wc.f11665
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.m2974()
        L7e:
            java.lang.Throwable r0 = r15.m6368()
            te r1 = new te
            r1.<init>(r0)
            return r1
        L88:
            java.lang.String r0 = "unexpected"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L8f:
            if (r7 == 0) goto L9e
            r1.m5531()
            java.lang.Throwable r0 = r15.m6368()
            te r1 = new te
            r1.<init>(r0)
            return r1
        L9e:
            boolean r3 = r6 instanceof p000.jb2
            if (r3 == 0) goto La5
            jb2 r6 = (p000.jb2) r6
            goto La6
        La5:
            r6 = 0
        La6:
            if (r6 == 0) goto Lad
            int r12 = r2 + r9
            r6.mo70(r1, r12)
        Lad:
            long r3 = r1.f10004
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.m6364(r3)
        Lb5:
            return r8
        Lb6:
            r1.m2974()
            return r8
    }

    @Override // p000.C0942wc, p000.qs1
    /* JADX INFO: renamed from: α */
    public final java.lang.Object mo3384(p000.InterfaceC0631op r1, java.lang.Object r2) {
            r0 = this;
            r1 = 1
            java.lang.Object r1 = r0.m3383(r2, r1)
            boolean r1 = r1 instanceof p000.C0832te
            if (r1 != 0) goto Lc
            s62 r0 = p000.s62.f9751
            return r0
        Lc:
            java.lang.Throwable r0 = r0.m6368()
            throw r0
    }

    @Override // p000.C0942wc, p000.qs1
    /* JADX INFO: renamed from: μ */
    public final java.lang.Object mo3385(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r1 = r1.m3383(r2, r0)
            return r1
    }

    @Override // p000.C0942wc
    /* JADX INFO: renamed from: υ */
    public final boolean mo3386() {
            r1 = this;
            uc r1 = r1.f6059
            uc r0 = p000.EnumC0867uc.f10688
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }
}
