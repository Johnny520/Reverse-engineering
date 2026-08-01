package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5429;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.nd0 f5430;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.util.ArrayList f5431;

    public /* synthetic */ jd0(java.util.ArrayList r2, p000.nd0 r3) {
            r1 = this;
            r0 = 0
            r1.f5429 = r0
            r1.<init>()
            r1.f5431 = r2
            r1.f5430 = r3
            return
    }

    public /* synthetic */ jd0(p000.nd0 r2, java.util.ArrayList r3) {
            r1 = this;
            r0 = 1
            r1.f5429 = r0
            r1.<init>()
            r1.f5430 = r2
            r1.f5431 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f5429
            switch(r0) {
                case 0: goto L20;
                default: goto L5;
            }
        L5:
            nd0 r0 = r5.f5430
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f7537
            boolean r1 = r1.get()
            if (r1 != 0) goto L1f
            java.util.LinkedHashSet r1 = r0.f7526
            java.util.ArrayList r5 = r5.f5431
            java.util.Set r5 = p000.AbstractC0984xh.m6671(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            r1.removeAll(r5)
            r0.m4030()
        L1f:
            return
        L20:
            java.util.ArrayList r0 = r5.f5431
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            st r3 = p000.C0810st.f10010     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = ""
            pt r1 = r3.m5565(r1, r4)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L46:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L4b
            r1 = 0
        L4b:
            pt r1 = (p000.C0699pt) r1
            if (r1 == 0) goto L26
            cd0 r2 = new cd0
            r3 = 2
            nd0 r4 = r5.f5430
            r2.<init>(r4, r1, r3)
            r4.m4029(r2)
            goto L26
        L5b:
            return
    }
}
