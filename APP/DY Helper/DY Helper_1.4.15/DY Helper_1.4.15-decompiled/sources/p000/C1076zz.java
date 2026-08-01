package p000;

/* JADX INFO: renamed from: zz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1076zz {

    /* JADX INFO: renamed from: α */
    public boolean f13379;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f13380;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object f13381;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object f13382;

    public C1076zz() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f13380 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f13381 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f13382 = r0
            r0 = 1
            r1.f13379 = r0
            return
    }

    public C1076zz(p000.uk1 r1, p000.c00 r2, p000.b00 r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f13380 = r1
            r0.f13381 = r2
            r0.f13382 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.io.IOException m7252(p000.C1076zz r11, boolean r12, java.io.IOException r13, int r14) {
            r0 = r14 & 4
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r14 = r14 & 8
            if (r14 == 0) goto Lf
            r14 = r2
            goto L10
        Lf:
            r14 = r1
        L10:
            if (r13 == 0) goto L15
            r11.m7255(r13)
        L15:
            java.lang.Object r3 = r11.f13380
            r4 = r3
            uk1 r4 = (p000.uk1) r4
            if (r14 == 0) goto L20
            if (r12 != 0) goto L20
            r6 = r1
            goto L21
        L20:
            r6 = r2
        L21:
            if (r0 == 0) goto L27
            if (r12 != 0) goto L27
            r7 = r1
            goto L28
        L27:
            r7 = r2
        L28:
            if (r14 == 0) goto L2e
            if (r12 == 0) goto L2e
            r9 = r1
            goto L2f
        L2e:
            r9 = r2
        L2f:
            if (r0 == 0) goto L37
            if (r12 == 0) goto L37
            r8 = r1
        L34:
            r5 = r11
            r10 = r13
            goto L39
        L37:
            r8 = r2
            goto L34
        L39:
            java.io.IOException r11 = r4.m5933(r5, r6, r7, r8, r9, r10)
            return r11
    }

    /* JADX INFO: renamed from: β */
    public p000.vk1 m7253() {
            r1 = this;
            java.lang.Object r1 = r1.f13382
            b00 r1 = (p000.b00) r1
            a00 r1 = r1.mo650()
            boolean r0 = r1 instanceof p000.vk1
            if (r0 == 0) goto Lf
            vk1 r1 = (p000.vk1) r1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L13
            return r1
        L13:
            java.lang.String r1 = "no connection for CONNECT tunnels"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public p000.yn1 m7254(boolean r2) {
            r1 = this;
            java.lang.Object r0 = r1.f13382     // Catch: java.io.IOException -> Ld
            b00 r0 = (p000.b00) r0     // Catch: java.io.IOException -> Ld
            yn1 r2 = r0.mo653(r2)     // Catch: java.io.IOException -> Ld
            if (r2 == 0) goto Lf
            r2.f12704 = r1     // Catch: java.io.IOException -> Ld
            return r2
        Ld:
            r2 = move-exception
            goto L10
        Lf:
            return r2
        L10:
            r1.m7255(r2)
            throw r2
    }

    /* JADX INFO: renamed from: δ */
    public void m7255(java.io.IOException r2) {
            r1 = this;
            r0 = 1
            r1.f13379 = r0
            java.lang.Object r0 = r1.f13382
            b00 r0 = (p000.b00) r0
            a00 r0 = r0.mo650()
            java.lang.Object r1 = r1.f13380
            uk1 r1 = (p000.uk1) r1
            r0.mo1(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ε */
    public p000.C0574n5 m7256() {
            r3 = this;
            java.lang.Object r0 = r3.f13380
            uk1 r0 = (p000.uk1) r0
            boolean r1 = r0.f10896
            if (r1 != 0) goto L6c
            r1 = 1
            r0.f10896 = r1
            tk1 r2 = r0.f10891
            r2.m2629()
            monitor-enter(r0)
            zz r2 = r0.f10904     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L62
            boolean r2 = r0.f10900     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L5a
            boolean r2 = r0.f10901     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L5a
            boolean r2 = r0.f10898     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L52
            boolean r2 = r0.f10899     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4a
            r2 = 0
            r0.f10899 = r2     // Catch: java.lang.Throwable -> L48
            r0.f10900 = r1     // Catch: java.lang.Throwable -> L48
            r0.f10901 = r1     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)
            java.lang.Object r0 = r3.f13382
            b00 r0 = (p000.b00) r0
            a00 r0 = r0.mo650()
            r0.getClass()
            vk1 r0 = (p000.vk1) r0
            java.net.Socket r1 = r0.f11327
            r1.setSoTimeout(r2)
            r0.mo3()
            n5 r0 = new n5
            r0.<init>(r3)
            return r0
        L48:
            r3 = move-exception
            goto L6a
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.Throwable -> L48
        L52:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.Throwable -> L48
        L5a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.Throwable -> L48
        L62:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.Throwable -> L48
        L6a:
            monitor-exit(r0)
            throw r3
        L6c:
            java.lang.String r3 = "Check failed."
            p000.C1080.m7279(r3)
            r3 = 0
            return r3
    }
}
