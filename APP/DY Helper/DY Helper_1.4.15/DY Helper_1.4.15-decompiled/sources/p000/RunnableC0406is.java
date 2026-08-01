package p000;

/* JADX INFO: renamed from: is */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0406is implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5174;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ boolean f5175;

    public /* synthetic */ RunnableC0406is(int r1, boolean r2) {
            r0 = this;
            r0.f5174 = r1
            r0.f5175 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f5174
            boolean r11 = r11.f5175
            switch(r0) {
                case 0: goto L90;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "background update check finished"
            java.lang.String r1 = "r5f3b6ae7236977e4"
            java.lang.String r2 = "update check failed: "
            java.lang.String r3 = "no update remote="
            java.lang.String r4 = "new version found remote="
            java.lang.String r5 = "background update check started force="
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L39
            r9.append(r11)     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = r9.toString()     // Catch: java.lang.Throwable -> L39
            p000.C0888ux.m5988(r1, r11, r8, r7, r8)     // Catch: java.lang.Throwable -> L39
            t72 r11 = p000.u72.m5794()     // Catch: java.lang.Throwable -> L39
            if (r11 != 0) goto L3b
            java.lang.String r11 = "update json unavailable or invalid"
            p000.C0888ux.m5988(r1, r11, r8, r7, r8)     // Catch: java.lang.Throwable -> L39
        L30:
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.u72.f10631
            r11.set(r6)
            p000.C0888ux.m5988(r1, r0, r8, r7, r8)
            goto L85
        L39:
            r11 = move-exception
            goto L71
        L3b:
            p000.u72.m5797(r11)     // Catch: java.lang.Throwable -> L39
            int r5 = r11.f10235     // Catch: java.lang.Throwable -> L39
            r9 = 60
            java.lang.String r10 = " current=60"
            if (r5 <= r9) goto L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L39
            r3.append(r5)     // Catch: java.lang.Throwable -> L39
            r3.append(r10)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L39
            p000.C0888ux.m5988(r1, r3, r8, r7, r8)     // Catch: java.lang.Throwable -> L39
            android.app.Activity r3 = p000.u72.f10636     // Catch: java.lang.Throwable -> L39
            p000.u72.m5799(r11, r3)     // Catch: java.lang.Throwable -> L39
            goto L30
        L5e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r11.<init>(r3)     // Catch: java.lang.Throwable -> L39
            r11.append(r5)     // Catch: java.lang.Throwable -> L39
            r11.append(r10)     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L39
            p000.C0888ux.m5988(r1, r11, r8, r7, r8)     // Catch: java.lang.Throwable -> L39
            goto L30
        L71:
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L86
            r3.append(r11)     // Catch: java.lang.Throwable -> L86
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L86
            p000.C0888ux.m5988(r1, r11, r8, r7, r8)     // Catch: java.lang.Throwable -> L86
            goto L30
        L85:
            return
        L86:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.u72.f10631
            r2.set(r6)
            p000.C0888ux.m5988(r1, r0, r8, r7, r8)
            throw r11
        L90:
            android.os.Handler r0 = p000.C0661os.f8210
            p000.C0661os.m4273()
            if (r11 == 0) goto La7
            android.widget.ScrollView r11 = p000.C0661os.f8204
            if (r11 == 0) goto La7
            s0 r0 = new s0
            r1 = 16
            r0.<init>(r1)
            r1 = 50
            r11.postDelayed(r0, r1)
        La7:
            return
    }
}
