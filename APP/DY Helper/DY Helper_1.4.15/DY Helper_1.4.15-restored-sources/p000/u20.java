package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u20 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10569;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.ViewGroup f10570;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f10571;

    public /* synthetic */ u20(android.view.ViewGroup r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f10569 = r3
            r0.f10570 = r1
            r0.f10571 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.f10569
            java.lang.String r1 = "post:"
            java.lang.String r2 = r9.f10571
            android.view.ViewGroup r9 = r9.f10570
            switch(r0) {
                case 0: goto La2;
                case 1: goto L98;
                default: goto Lb;
            }
        Lb:
            r0 = 2117337096(0x7e340008, float:5.98153E37)
            r1 = 0
            r9.setTag(r0, r1)
            android.os.Handler r0 = p000.ah0.f229
            java.lang.String r0 = "getAdapter"
            java.lang.Object r0 = p000.ah0.m143(r9, r0)     // Catch: java.lang.Throwable -> L85
            int r3 = r9.getChildCount()     // Catch: java.lang.Throwable -> L85
            r4 = 0
        L1f:
            if (r4 >= r3) goto L82
            android.view.View r5 = r9.getChildAt(r4)     // Catch: java.lang.Throwable -> L85
            if (r5 != 0) goto L28
            goto L7f
        L28:
            java.lang.String r6 = "getChildViewHolder"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L33
            java.lang.Object r5 = p000.qe0.m4869(r9, r6, r5)     // Catch: java.lang.Throwable -> L33
            goto L3a
        L33:
            r5 = move-exception
            eo1 r6 = new eo1     // Catch: java.lang.Throwable -> L85
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L85
            r5 = r6
        L3a:
            boolean r6 = r5 instanceof p000.eo1     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L3f
            r5 = r1
        L3f:
            if (r5 != 0) goto L42
            goto L7f
        L42:
            java.lang.String r6 = "getBindingAdapterPosition"
            java.lang.Integer r6 = p000.ah0.m141(r5, r6)     // Catch: java.lang.Throwable -> L85
            if (r6 != 0) goto L60
            java.lang.String r6 = "getAbsoluteAdapterPosition"
            java.lang.Integer r6 = p000.ah0.m141(r5, r6)     // Catch: java.lang.Throwable -> L85
            if (r6 != 0) goto L60
            java.lang.String r6 = "getAdapterPosition"
            java.lang.Integer r6 = p000.ah0.m141(r5, r6)     // Catch: java.lang.Throwable -> L85
            if (r6 != 0) goto L60
            java.lang.String r6 = "getLayoutPosition"
            java.lang.Integer r6 = p000.ah0.m141(r5, r6)     // Catch: java.lang.Throwable -> L85
        L60:
            if (r6 == 0) goto L6a
            int r7 = r6.intValue()     // Catch: java.lang.Throwable -> L85
            r8 = -1
            if (r7 == r8) goto L6a
            goto L6b
        L6a:
            r6 = r1
        L6b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r7.<init>()     // Catch: java.lang.Throwable -> L85
            r7.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = "/visible"
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L85
            p000.ah0.m117(r0, r5, r6, r7)     // Catch: java.lang.Throwable -> L85
        L7f:
            int r4 = r4 + 1
            goto L1f
        L82:
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L85
            goto L8c
        L85:
            r9 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r9)
            r9 = r0
        L8c:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L97
            java.lang.String r0 = "visible-children"
            p000.ah0.m138(r0, r9)
        L97:
            return
        L98:
            z20 r0 = p000.z20.f12945
            java.lang.String r0 = r1.concat(r2)
            p000.z20.m7079(r9, r0)
            return
        La2:
            z20 r0 = p000.z20.f12945
            java.lang.String r0 = r1.concat(r2)
            p000.z20.m7079(r9, r0)
            return
    }
}
