package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fd0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3897;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.nd0 f3898;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.util.List f3899;

    public /* synthetic */ fd0(java.util.List r2, p000.nd0 r3) {
            r1 = this;
            r0 = 0
            r1.f3897 = r0
            r1.<init>()
            r1.f3899 = r2
            r1.f3898 = r3
            return
    }

    public /* synthetic */ fd0(p000.nd0 r2, java.util.List r3) {
            r1 = this;
            r0 = 1
            r1.f3897 = r0
            r1.<init>()
            r1.f3898 = r2
            r1.f3899 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f3897
            java.util.List r1 = r11.f3899
            nd0 r11 = r11.f3898
            r2 = 1
            switch(r0) {
                case 0: goto La3;
                default: goto La;
            }
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f7537
            boolean r0 = r0.get()
            if (r0 != 0) goto La2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r1.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            java.lang.String r7 = java.lang.String.valueOf(r5)
            be0 r8 = p000.be0.f1670
            java.util.List r8 = r8.m943()
            xc0 r9 = p000.xc0.f12128
            java.util.List r9 = r9.m6609()
            java.util.ArrayList r8 = p000.AbstractC0984xh.m6651(r8, r9)
            f7 r9 = new f7
            r9.<init>(r2, r8)
            s9 r8 = new s9
            r10 = 26
            r8.<init>(r7, r10)
            y30 r7 = new y30
            r7.<init>(r9, r2, r8)
            x30 r8 = new x30
            r8.<init>(r7)
        L56:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r8.next()
            xd0 r7 = (p000.xd0) r7
            st r9 = p000.C0810st.f10010
            java.lang.String r7 = r7.f12137
            java.lang.String r7 = p000.C0810st.m5548(r5, r7)
            if (r7 == 0) goto L56
            goto L1b
        L6d:
            r0.add(r4)
            goto L1b
        L71:
            boolean r2 = r0.isEmpty()
            java.util.LinkedHashSet r3 = r11.f7526
            if (r2 == 0) goto L86
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r3.removeAll(r0)
            r11.m4030()
            goto La2
        L86:
            p000.AbstractC0984xh.m6660(r3, r0)
            r11.m4030()
            java.util.concurrent.ExecutorService r1 = p000.pd0.f8508
            jd0 r2 = new jd0
            r2.<init>(r0, r11)
            r1.execute(r2)
            android.os.Handler r1 = r11.f7536
            jd0 r2 = new jd0
            r2.<init>(r11, r0)
            r3 = 12000(0x2ee0, double:5.929E-320)
            r1.postDelayed(r2, r3)
        La2:
            return
        La3:
            java.util.Iterator r0 = r1.iterator()
        La7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld9
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            st r1 = p000.C0810st.f10010     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r5 = ""
            pt r1 = r1.m5568(r3, r5)     // Catch: java.lang.Throwable -> Lc0
            goto Lc7
        Lc0:
            r1 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        Lc7:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto Lcc
            r1 = 0
        Lcc:
            pt r1 = (p000.C0699pt) r1
            if (r1 == 0) goto La7
            cd0 r3 = new cd0
            r3.<init>(r11, r1, r2)
            r11.m4029(r3)
            goto La7
        Ld9:
            return
    }
}
