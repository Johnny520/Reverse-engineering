package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cd2 implements p000.fr0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.C0557mp f2073;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.C0455k3 f2074;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.kl1 f2075;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.um1 f2076;

    public cd2(p000.C0557mp r1, p000.C0455k3 r2, p000.kl1 r3, p000.um1 r4) {
            r0 = this;
            r0.<init>()
            r0.f2073 = r1
            r0.f2074 = r2
            r0.f2075 = r3
            r0.f2076 = r4
            return
    }

    @Override // p000.fr0
    /* JADX INFO: renamed from: κ */
    public final void mo743(p000.hr0 r10, p000.br0 r11) {
            r9 = this;
            int[] r0 = p000.bd2.f1669
            int r11 = r11.ordinal()
            r11 = r0[r11]
            r0 = 0
            r1 = 1
            switch(r11) {
                case 1: goto L8a;
                case 2: goto L24;
                case 3: goto L17;
                case 4: goto L11;
                case 5: goto L87;
                case 6: goto L87;
                case 7: goto L87;
                default: goto Ld;
            }
        Ld:
            p000.C1080.m7272()
            return
        L11:
            kl1 r9 = r9.f2075
            r9.m3332()
            return
        L17:
            kl1 r9 = r9.f2075
            java.lang.Object r10 = r9.f6003
            monitor-enter(r10)
            r9.f6020 = r1     // Catch: java.lang.Throwable -> L20
            monitor-exit(r10)
            return
        L20:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)
            throw r9
        L24:
            k3 r10 = r9.f2074
            r11 = 0
            if (r10 == 0) goto L6a
            java.lang.Object r10 = r10.f5723
            zz r10 = (p000.C1076zz) r10
            java.lang.Object r2 = r10.f13380
            monitor-enter(r2)
            java.lang.Object r3 = r10.f13380     // Catch: java.lang.Throwable -> L5d
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L5d
            boolean r4 = r10.f13379     // Catch: java.lang.Throwable -> L64
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L3a
        L38:
            monitor-exit(r2)
            goto L6a
        L3a:
            java.lang.Object r3 = r10.f13381     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r10.f13382     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L5d
            r10.f13381 = r4     // Catch: java.lang.Throwable -> L5d
            r10.f13382 = r3     // Catch: java.lang.Throwable -> L5d
            r10.f13379 = r1     // Catch: java.lang.Throwable -> L5d
            int r10 = r3.size()     // Catch: java.lang.Throwable -> L5d
            r1 = r11
        L4d:
            if (r1 >= r10) goto L60
            java.lang.Object r4 = r3.get(r1)     // Catch: java.lang.Throwable -> L5d
            op r4 = (p000.InterfaceC0631op) r4     // Catch: java.lang.Throwable -> L5d
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5d
            r4.mo75(r5)     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + 1
            goto L4d
        L5d:
            r0 = move-exception
            r9 = r0
            goto L68
        L60:
            r3.clear()     // Catch: java.lang.Throwable -> L5d
            goto L38
        L64:
            r0 = move-exception
            r9 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5d
        L68:
            monitor-exit(r2)
            throw r9
        L6a:
            kl1 r9 = r9.f2075
            java.lang.Object r10 = r9.f6003
            monitor-enter(r10)
            boolean r1 = r9.f6020     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L7d
            r9.f6020 = r11     // Catch: java.lang.Throwable -> L7a
            yd r0 = r9.m3333()     // Catch: java.lang.Throwable -> L7a
            goto L7d
        L7a:
            r0 = move-exception
            r9 = r0
            goto L88
        L7d:
            monitor-exit(r10)
            if (r0 == 0) goto L87
            s62 r9 = p000.s62.f9751
            ae r0 = (p000.C0015ae) r0
            r0.mo75(r9)
        L87:
            return
        L88:
            monitor-exit(r10)
            throw r9
        L8a:
            mp r11 = r9.f2073
            q3 r2 = new q3
            um1 r3 = r9.f2076
            kl1 r4 = r9.f2075
            r7 = 0
            r8 = 3
            r6 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            p000.ln0.m3610(r11, r0, r2, r1)
            return
    }
}
