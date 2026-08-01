package p000;

/* JADX INFO: renamed from: o9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0615o9 implements java.util.Comparator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f7990;

    public /* synthetic */ C0615o9(int r1) {
            r0 = this;
            r0.f7990 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r7 = r7.f7990
            switch(r7) {
                case 0: goto La8;
                case 1: goto L66;
                case 2: goto L48;
                case 3: goto L3b;
                case 4: goto L2b;
                default: goto L5;
            }
        L5:
            yp0 r8 = (p000.yp0) r8
            yp0 r9 = (p000.yp0) r9
            bq0 r7 = r8.f12734
            ox0 r7 = r7.f1815
            float r7 = r7.f8323
            bq0 r0 = r9.f12734
            ox0 r0 = r0.f1815
            float r0 = r0.f8323
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 != 0) goto L26
            int r7 = r8.m7006()
            int r8 = r9.m7006()
            int r7 = p000.ln0.m3632(r7, r8)
            goto L2a
        L26:
            int r7 = java.lang.Float.compare(r7, r0)
        L2a:
            return r7
        L2b:
            xm0 r8 = (p000.xm0) r8
            xm0 r9 = (p000.xm0) r9
            int r7 = r8.f11348
            int r8 = r8.f11347
            int r7 = r7 - r8
            int r8 = r9.f11348
            int r9 = r9.f11347
            int r8 = r8 - r9
            int r7 = r7 - r8
            return r7
        L3b:
            rn0 r8 = (p000.rn0) r8
            rn0 r9 = (p000.rn0) r9
            int r7 = r8.f9418
            int r8 = r9.f9418
            int r7 = p000.ln0.m3632(r7, r8)
            return r7
        L48:
            byte[] r8 = (byte[]) r8
            byte[] r9 = (byte[]) r9
            int r7 = r8.length
            int r0 = r9.length
            if (r7 == r0) goto L54
            int r7 = r8.length
            int r8 = r9.length
            int r7 = r7 - r8
            goto L65
        L54:
            r7 = 0
            r0 = r7
        L56:
            int r1 = r8.length
            if (r0 >= r1) goto L65
            r1 = r8[r0]
            r2 = r9[r0]
            if (r1 == r2) goto L62
            int r7 = r1 - r2
            goto L65
        L62:
            int r0 = r0 + 1
            goto L56
        L65:
            return r7
        L66:
            java.lang.String r7 = "yyyy-MM-dd"
            p9 r8 = (p000.C0679p9) r8
            p9 r9 = (p000.C0679p9) r9
            android.os.Handler r0 = p000.C0753r9.f9291
            java.lang.String r0 = r9.f8457
            r1 = 0
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L84
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L84
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L84
            java.util.Date r0 = r3.parse(r0)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L84
            long r3 = r0.getTime()     // Catch: java.lang.Throwable -> L84
            goto L85
        L84:
            r3 = r1
        L85:
            java.lang.String r0 = r8.f8457
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L98
            java.util.Locale r6 = java.util.Locale.US     // Catch: java.lang.Throwable -> L98
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L98
            java.util.Date r7 = r5.parse(r0)     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L98
            long r1 = r7.getTime()     // Catch: java.lang.Throwable -> L98
        L98:
            int r7 = p000.ln0.m3633(r3, r1)
            if (r7 == 0) goto L9f
            goto La7
        L9f:
            long r0 = r9.f8460
            long r7 = r8.f8460
            int r7 = p000.ln0.m3633(r0, r7)
        La7:
            return r7
        La8:
            p9 r8 = (p000.C0679p9) r8
            p9 r9 = (p000.C0679p9) r9
            long r0 = r9.f8460
            long r7 = r8.f8460
            int r7 = p000.ln0.m3633(r0, r7)
            return r7
    }
}
