package defpackage;

/* JADX INFO: renamed from: ᛱᲇᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0196 implements defpackage.InterfaceC0464, defpackage.InterfaceC1753, defpackage.InterfaceC0429 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1265;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1266;

    public /* synthetic */ C0196(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1266 = r1
            r0.f1265 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0429
    public java.lang.Object get() {
            r0 = this;
            ᲈᲁᛲ r0 = new ᲈᲁᛲ
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean m739(android.view.MotionEvent r7) {
            r6 = this;
            java.lang.Object r6 = r6.f1265
            ᛳᲁᛶᲀ r6 = (defpackage.C0559) r6
            android.view.View r0 = r6.f2764
            boolean r1 = r6.f2753
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            float r1 = r7.getX()
            float r3 = r7.getY()
            android.graphics.Rect r4 = r6.m1351()
            int r7 = r7.getAction()
            r5 = 1
            if (r7 == 0) goto L86
            if (r7 == r5) goto L82
            r1 = 2
            if (r7 == r1) goto L29
            r0 = 3
            if (r7 == r0) goto L82
            goto La2
        L29:
            boolean r7 = r6.f2758
            if (r7 != 0) goto L72
            android.view.View r7 = r6.f2754
            float r1 = r6.f2765
            float r2 = r6.f2757
            boolean r7 = r6.m1349(r7, r1, r2)
            if (r7 == 0) goto L72
            float r7 = r6.f2757
            float r7 = r3 - r7
            float r7 = java.lang.Math.abs(r7)
            int r1 = r6.f2768
            float r1 = (float) r1
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L72
            float r7 = r6.f2765
            float r1 = r6.f2757
            boolean r7 = r6.m1349(r0, r7, r1)
            if (r7 == 0) goto L5b
            float r7 = r6.f2770
            r6.f2766 = r7
            int r7 = r6.f2760
            r6.f2767 = r7
            goto L6f
        L5b:
            r6.f2766 = r3
            int r7 = r4.top
            float r7 = (float) r7
            float r7 = r3 - r7
            int r0 = r6.f2751
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r7 = r7 - r0
            int r7 = (int) r7
            r6.f2767 = r7
            r6.m1354(r7)
        L6f:
            r6.m1346(r5)
        L72:
            boolean r7 = r6.f2758
            if (r7 == 0) goto La2
            int r7 = r6.f2767
            float r0 = r6.f2766
            float r0 = r3 - r0
            int r0 = (int) r0
            int r7 = r7 + r0
            r6.m1354(r7)
            goto La2
        L82:
            r6.m1346(r2)
            goto La2
        L86:
            r6.f2765 = r1
            r6.f2757 = r3
            float r7 = r0.getAlpha()
            r2 = 0
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto La2
            boolean r7 = r6.m1349(r0, r1, r3)
            if (r7 == 0) goto La2
            r6.f2766 = r3
            int r7 = r6.f2760
            r6.f2767 = r7
            r6.m1346(r5)
        La2:
            r6.f2770 = r3
            boolean r6 = r6.f2758
            return r6
    }

    @Override // defpackage.InterfaceC1753
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void mo740(com.kongzue.dialogx.interfaces.AbstractC0008 r1) {
            r0 = this;
            java.lang.Object r0 = r0.f1265
            ᛳᲁᛳᛴ r0 = (defpackage.C0554) r0
            ᛱᲁᲀᲁ r1 = (defpackage.C0185) r1
            defpackage.AbstractC1628.m2976(r0)
            return
    }

    @Override // defpackage.InterfaceC0464
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.Object mo741() {
            r5 = this;
            int r0 = r5.f1266
            java.lang.Object r5 = r5.f1265
            switch(r0) {
                case 0: goto L2a;
                default: goto L7;
            }
        L7:
            java.lang.Class r5 = (java.lang.Class) r5
            ᛲᛷᲇᲇ r0 = defpackage.AbstractC0330.f1704     // Catch: java.lang.Exception -> L10
            java.lang.Object r5 = r0.mo707(r5)     // Catch: java.lang.Exception -> L10
            return r5
        L10:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create instance of "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L2a:
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.String r0 = "' with no args"
            java.lang.String r1 = "Failed to invoke constructor '"
            r2 = 0
            java.lang.Object r2 = r5.newInstance(r2)     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L5b
            goto L5a
        L36:
            r5 = move-exception
            ᛲᲈᲀᲈ r0 = defpackage.AbstractC2026.f8732
            java.lang.String r0 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            defpackage.C0086.m548(r0, r5)
            goto L5a
        L3f:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r5 = defpackage.AbstractC2026.m3416(r5)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = r4.toString()
            java.lang.Throwable r0 = r3.getCause()
            defpackage.C0086.m548(r5, r0)
        L5a:
            return r2
        L5b:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r5 = defpackage.AbstractC2026.m3416(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = r4.toString()
            r3.<init>(r5, r2)
            throw r3
    }
}
