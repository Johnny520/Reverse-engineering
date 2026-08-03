package m2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3.w f8687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2.a f8688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.e f8689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m2.h f8690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m.a f8691e;

    public e(l3.w r6, m2.a r7) {
            r5 = this;
            b.e r0 = m2.f.f8692a
            m2.h r1 = new m2.h
            b.e r2 = m2.f.f8692a
            r1.<init>()
            m2.g r2 = m2.h.f8693a
            rg.e r3 = q2.h.f10631a
            r2.getClass()
            wf.g r2 = f8.i.q0(r2, r3)
            wf.h r3 = wf.h.f20786g
            wf.g r2 = r2.e(r3)
            qg.g1 r3 = new qg.g1
            r4 = 0
            r3.<init>(r4)
            wf.g r2 = r2.e(r3)
            qg.v.a(r2)
            m.a r2 = new m.a
            r3 = 1
            r2.<init>(r3)
            r5.<init>()
            r5.f8687a = r6
            r5.f8688b = r7
            r5.f8689c = r0
            r5.f8690d = r1
            r5.f8691e = r2
            b0.d0 r6 = new b0.d0
            r7 = 28
            r6.<init>(r5, r7)
            return
    }

    public final m2.r a(m2.q r7) {
            r6 = this;
            b.e r0 = r6.f8689c
            java.lang.Object r1 = r0.f332h
            l3.w r1 = (l3.w) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.f333i     // Catch: java.lang.Throwable -> L3e
            f.r r2 = (f.r) r2     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L3e
            m2.r r2 = (m2.r) r2     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L43
            boolean r3 = r2.f8712h     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.f333i     // Catch: java.lang.Throwable -> L3e
            f.r r2 = (f.r) r2     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r2.f2894g     // Catch: java.lang.Throwable -> L3e
            a2.a r3 = (a2.a) r3     // Catch: java.lang.Throwable -> L3e
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = r2.f2893f     // Catch: java.lang.Throwable -> L38
            androidx.lifecycle.e0 r4 = (androidx.lifecycle.e0) r4     // Catch: java.lang.Throwable -> L38
            r4.getClass()     // Catch: java.lang.Throwable -> L38
            java.util.LinkedHashMap r4 = r4.f284a     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r4.remove(r7)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L3a
            int r5 = r2.f2890c     // Catch: java.lang.Throwable -> L38
            int r5 = r5 + (-1)
            r2.f2890c = r5     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r7 = move-exception
            goto L41
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3e
            m2.r r4 = (m2.r) r4     // Catch: java.lang.Throwable -> L3e
            goto L43
        L3e:
            r7 = move-exception
            goto Lb3
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3e
            throw r7     // Catch: java.lang.Throwable -> L3e
        L43:
            monitor-exit(r1)
            m2.h r1 = r6.f8690d     // Catch: java.lang.Exception -> Laa
            r1.getClass()     // Catch: java.lang.Exception -> Laa
            m2.p r1 = r7.f8706a     // Catch: java.lang.Exception -> Laa
            m.a r2 = r6.f8691e     // Catch: java.lang.Exception -> Laa
            java.lang.Object r2 = r2.f8069h     // Catch: java.lang.Exception -> Laa
            l3.w r2 = (l3.w) r2     // Catch: java.lang.Exception -> Laa
            int r3 = r7.f8708c     // Catch: java.lang.Exception -> Laa
            m2.k r4 = r7.f8707b     // Catch: java.lang.Exception -> Laa
            if (r1 == 0) goto L69
            boolean r5 = r1 instanceof m2.b     // Catch: java.lang.Exception -> Laa
            if (r5 == 0) goto L5c
            goto L69
        L5c:
            boolean r5 = r1 instanceof m2.m     // Catch: java.lang.Exception -> Laa
            if (r5 == 0) goto L67
            m2.m r1 = (m2.m) r1     // Catch: java.lang.Exception -> Laa
            android.graphics.Typeface r1 = r2.i(r1, r4, r3)     // Catch: java.lang.Exception -> Laa
            goto L79
        L67:
            r1 = 0
            goto L7f
        L69:
            int r1 = r2.f7835g     // Catch: java.lang.Exception -> Laa
            switch(r1) {
                case 6: goto L74;
                default: goto L6e;
            }     // Catch: java.lang.Exception -> Laa
        L6e:
            r1 = 0
            android.graphics.Typeface r1 = l3.w.h(r1, r4, r3)     // Catch: java.lang.Exception -> Laa
            goto L79
        L74:
            r1 = 0
            android.graphics.Typeface r1 = l3.w.g(r1, r4, r3)     // Catch: java.lang.Exception -> Laa
        L79:
            m2.r r2 = new m2.r     // Catch: java.lang.Exception -> Laa
            r2.<init>(r1)     // Catch: java.lang.Exception -> Laa
            r1 = r2
        L7f:
            if (r1 == 0) goto La2
            java.lang.Object r2 = r0.f332h
            l3.w r2 = (l3.w) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f333i     // Catch: java.lang.Throwable -> L9c
            f.r r3 = (f.r) r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r3 = r3.a(r7)     // Catch: java.lang.Throwable -> L9c
            if (r3 != 0) goto L9e
            boolean r3 = r1.f8712h     // Catch: java.lang.Throwable -> L9c
            if (r3 == 0) goto L9e
            java.lang.Object r0 = r0.f333i     // Catch: java.lang.Throwable -> L9c
            f.r r0 = (f.r) r0     // Catch: java.lang.Throwable -> L9c
            r0.b(r7, r1)     // Catch: java.lang.Throwable -> L9c
            goto L9e
        L9c:
            r7 = move-exception
            goto La0
        L9e:
            monitor-exit(r2)
            return r1
        La0:
            monitor-exit(r2)
            throw r7
        La2:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Laa
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0)     // Catch: java.lang.Exception -> Laa
            throw r7     // Catch: java.lang.Exception -> Laa
        Laa:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r7)
            throw r0
        Lb3:
            monitor-exit(r1)
            throw r7
    }

    public final m2.r b(m2.p r7, m2.k r8, int r9, int r10) {
            r6 = this;
            m2.q r0 = new m2.q
            m2.a r1 = r6.f8688b
            r1.getClass()
            int r1 = r1.f8686g
            if (r1 == 0) goto L22
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L11
            goto L22
        L11:
            int r8 = r8.f8701g
            int r8 = r8 + r1
            r1 = 1
            r2 = 1000(0x3e8, float:1.401E-42)
            int r8 = r9.e0.r(r8, r1, r2)
            m2.k r1 = new m2.k
            r1.<init>(r8)
            r2 = r1
            goto L23
        L22:
            r2 = r8
        L23:
            l3.w r8 = r6.f8687a
            r8.getClass()
            r5 = 0
            r1 = r7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            m2.r r7 = r6.a(r0)
            return r7
    }
}
