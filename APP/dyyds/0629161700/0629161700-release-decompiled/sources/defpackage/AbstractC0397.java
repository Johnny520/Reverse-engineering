package defpackage;

/* JADX INFO: renamed from: ᛲᲈᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0397 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static defpackage.C1326 f2036;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1326 f2037 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.Object f2038 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.util.concurrent.ExecutorService f2039;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.AbstractC0397.f2038 = r0
            ᛷᛸᛱᛸ r0 = new ᛷᛸᛱᛸ
            r1 = 0
            r2 = 21
            r0.<init>(r1, r1, r1, r2)
            defpackage.AbstractC0397.f2037 = r0
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static defpackage.InterfaceC0140 m1142(defpackage.InterfaceC0140 r2) {
            boolean r0 = r2 instanceof defpackage.AbstractC1016
            if (r0 == 0) goto L8
            r0 = r2
            ᛶᛱᲀᛶ r0 = (defpackage.AbstractC1016) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L25
            ᛱᛸᛲᲀ r2 = r0.f4526
            if (r2 != 0) goto L25
            ᛳᛵᲈᛵ r2 = r0.f4527
            ᲀᛴᛱᛱ r1 = defpackage.C1654.f7364
            ᛶᲁᛳᲈ r2 = r2.mo970(r1)
            ᲁᛲᛱᛵ r2 = (defpackage.AbstractC1805) r2
            if (r2 == 0) goto L21
            ᛷᲇᲇᲇ r1 = new ᛷᲇᲇᲇ
            r1.<init>(r2, r0)
            goto L22
        L21:
            r1 = r0
        L22:
            r0.f4526 = r1
            return r1
        L25:
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static boolean m1143(android.view.MotionEvent r0, int r1) {
            int r0 = r0.getSource()
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static final java.lang.Object m1144(defpackage.InterfaceC0493 r8, defpackage.InterfaceC2087 r9, defpackage.InterfaceC0140 r10) {
            ᛳᛵᲈᛵ r0 = r10.mo663()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ᲇᲈᛱᛸ r2 = new ᲇᲈᛱᛸ
            r3 = 5
            r2.<init>(r3)
            java.lang.Object r1 = r8.mo969(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L1d
            ᛳᛵᲈᛵ r8 = r0.mo971(r8)
            goto L22
        L1d:
            r1 = 0
            ᛳᛵᲈᛵ r8 = defpackage.AbstractC0762.m1678(r0, r8, r1)
        L22:
            ᛷᲈᲀ r1 = defpackage.C1403.f6097
            ᛶᲁᛳᲈ r1 = r8.mo970(r1)
            ᲇᛳᛸᛳ r1 = (defpackage.InterfaceC2023) r1
            if (r1 == 0) goto L3a
            boolean r2 = r1.mo1449()
            if (r2 == 0) goto L33
            goto L3a
        L33:
            ᛴᛲᛵᛵ r1 = (defpackage.AbstractC0624) r1
            java.util.concurrent.CancellationException r8 = r1.m1448()
            throw r8
        L3a:
            if (r8 != r0) goto L46
            ᛵᛱᲀᲈ r0 = new ᛵᛱᲀᲈ
            r0.<init>(r8, r10)
            java.lang.Object r8 = defpackage.AbstractC2346.m3847(r0, r0, r9)
            return r8
        L46:
            ᲀᛴᛱᛱ r1 = defpackage.C1654.f7364
            ᛶᲁᛳᲈ r2 = r8.mo970(r1)
            ᛶᲁᛳᲈ r0 = r0.mo970(r1)
            boolean r0 = defpackage.AbstractC0498.m1280(r2, r0)
            r1 = 0
            if (r0 == 0) goto L70
            ᲈᛷᛸᛸ r0 = new ᲈᛷᛸᛸ
            r0.<init>(r8, r10)
            ᛳᛵᲈᛵ r8 = r0.f1569
            java.lang.Object r10 = defpackage.C1825.m3215(r8, r1)
            java.lang.Object r9 = defpackage.AbstractC2346.m3847(r0, r0, r9)     // Catch: java.lang.Throwable -> L6a
            defpackage.C1825.m3216(r8, r10)
            return r9
        L6a:
            r0 = move-exception
            r9 = r0
            defpackage.C1825.m3216(r8, r10)
            throw r9
        L70:
            ᛵᲇᛳᲀ r3 = new ᛵᲇᛳᲀ
            r3.<init>(r8, r10)
            ᛴᛴᲈᛶ r9 = (defpackage.AbstractC0668) r9     // Catch: java.lang.Throwable -> Lb4
            ᛱᛸᛲᲀ r8 = r9.mo389(r3, r3)     // Catch: java.lang.Throwable -> Lb4
            ᛱᛸᛲᲀ r8 = m1142(r8)     // Catch: java.lang.Throwable -> Lb4
            ᲁᲀᛱᲁ r9 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> Lb4
            defpackage.AbstractC1592.m2876(r8, r9)     // Catch: java.lang.Throwable -> Lb4
        L84:
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569
            long r4 = defpackage.C0979.f4389
            int r8 = r2.getIntVolatile(r3, r4)
            if (r8 == 0) goto La9
            r9 = 2
            if (r8 != r9) goto La3
            java.lang.Object r8 = r3.m1442()
            java.lang.Object r8 = defpackage.AbstractC1754.m3154(r8)
            boolean r9 = r8 instanceof defpackage.C0142
            if (r9 != 0) goto L9e
            return r8
        L9e:
            ᛱᛸᛳᛱ r8 = (defpackage.C0142) r8
            java.lang.Throwable r8 = r8.f1092
            throw r8
        La3:
            java.lang.String r8 = "Already suspended"
            defpackage.C2264.m3676(r8)
            return r1
        La9:
            r6 = 0
            r7 = 1
            boolean r8 = r2.compareAndSwapInt(r3, r4, r6, r7)
            if (r8 == 0) goto L84
            ᛴᛵ r8 = defpackage.EnumC0670.f3246
            return r8
        Lb4:
            r0 = move-exception
            r8 = r0
            ᛴᛸᛲᲀ r9 = new ᛴᛸᛲᲀ
            r9.<init>(r8)
            r3.mo662(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public static void m1145(android.widget.TextView r3) {
            r0 = -156173885414958(0xffff71f5ef0961d2, double:NaN)
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r0.getClass()
            boolean r0 = defpackage.C1141.m2214()
            r1 = 8
            if (r0 == 0) goto L2c
            boolean r0 = defpackage.C1141.m2208()
            r2 = 0
            if (r0 == 0) goto L20
            r3.setVisibility(r2)
            return
        L20:
            boolean r0 = defpackage.C1500.f6605
            if (r0 == 0) goto L28
            r3.setVisibility(r1)
            return
        L28:
            r3.setVisibility(r2)
            return
        L2c:
            r3.setVisibility(r1)
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static defpackage.InterfaceC0493 m1146(defpackage.InterfaceC0493 r2, defpackage.InterfaceC0493 r3) {
            ᛲᛶᛳᛱ r0 = defpackage.C0303.f1620
            if (r3 != r0) goto L5
            return r2
        L5:
            ᲇᲈᛱᛸ r0 = new ᲇᲈᛱᛸ
            r1 = 4
            r0.<init>(r1)
            java.lang.Object r2 = r3.mo969(r2, r0)
            ᛳᛵᲈᛵ r2 = (defpackage.InterfaceC0493) r2
            return r2
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static int m1147(java.lang.String r7, int r8, int r9) {
            r9 = r9 & 8
            if (r9 == 0) goto L8
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto Lb
        L8:
            r9 = 2097150(0x1ffffe, float:2.938733E-39)
        Lb:
            long r1 = (long) r8
            r3 = 1
            long r5 = (long) r9
            r0 = r7
            long r7 = m1150(r0, r1, r3, r5)
            int r7 = (int) r7
            return r7
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m1148(android.widget.TextView r2) {
            r0 = -156122345807406(0xffff7201ef0961d2, double:NaN)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L13
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L17
            return
        L17:
            java.util.LinkedHashMap r1 = defpackage.AbstractC2093.f8943
            ᛶᲀᛵ r1 = defpackage.C1141.f5173
            r1.getClass()
            int r1 = defpackage.C1141.m2199()
            int r1 = defpackage.AbstractC2093.m3510(r1)
            r0.setMarginStart(r1)
            int r1 = defpackage.C1141.m2211()
            int r1 = defpackage.AbstractC2093.m3510(r1)
            r0.bottomMargin = r1
            r2.setLayoutParams(r0)
            return
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static defpackage.C1001 m1149(defpackage.InterfaceC1399 r1, defpackage.InterfaceC0493 r2, defpackage.InterfaceC2087 r3, int r4) {
            r0 = 1
            r4 = r4 & r0
            if (r4 == 0) goto L6
            ᛲᛶᛳᛱ r2 = defpackage.C0303.f1620
        L6:
            ᛳᛵᲈᛵ r1 = r1.mo105()
            ᛳᛵᲈᛵ r1 = defpackage.AbstractC0762.m1678(r1, r2, r0)
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948
            if (r1 == r2) goto L1e
            ᲀᛴᛱᛱ r4 = defpackage.C1654.f7364
            ᛶᲁᛳᲈ r4 = r1.mo970(r4)
            if (r4 != 0) goto L1e
            ᛳᛵᲈᛵ r1 = r1.mo971(r2)
        L1e:
            ᛵᲈᲇᛵ r2 = new ᛵᲈᲇᛵ
            r2.<init>(r1, r0)
            r2.m918(r0, r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public static final long m1150(java.lang.String r4, long r5, long r7, long r9) {
            int r0 = defpackage.AbstractC1249.f5578
            java.lang.String r0 = java.lang.System.getProperty(r4)     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lb
            return r5
        Lb:
            java.lang.Long r5 = defpackage.AbstractC0056.m466(r0)
            r6 = 39
            java.lang.String r1 = "System property '"
            if (r5 == 0) goto L53
            long r2 = r5.longValue()
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 > 0) goto L22
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 > 0) goto L22
            return r2
        L22:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "' should be in range "
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = ".."
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = ", but is '"
            r0.append(r4)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r4)
            java.lang.String r4 = "' has unrecognized value '"
            r7.append(r4)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0907 m1151(defpackage.InterfaceC1399 r3, defpackage.InterfaceC2087 r4) {
            ᛲᛶᛳᛱ r0 = defpackage.C0303.f1620
            ᛳᛵᲈᛵ r3 = r3.mo105()
            r1 = 1
            ᛳᛵᲈᛵ r3 = defpackage.AbstractC0762.m1678(r3, r0, r1)
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            if (r3 == r0) goto L1b
            ᲀᛴᛱᛱ r2 = defpackage.C1654.f7364
            ᛶᲁᛳᲈ r2 = r3.mo970(r2)
            if (r2 != 0) goto L1b
            ᛳᛵᲈᛵ r3 = r3.mo971(r0)
        L1b:
            ᛵᛶᛲᛳ r0 = new ᛵᛶᛲᛳ
            r0.<init>(r3, r1)
            r0.m918(r1, r0, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static android.view.ViewGroup m1152() {
            java.lang.Object r0 = defpackage.AbstractC0472.f2365
            r1 = 0
            if (r0 == 0) goto L2e
            int r2 = defpackage.AbstractC0233.f1405
            ᛶᲈᛱᲈ r0 = defpackage.AbstractC2279.m3695(r0)
            ᛶᛶᛲᛱ r0 = r0.m2298()
            r2 = -446015458418222(0xfffe6a59ef0961d2, double:NaN)
            java.lang.String r2 = "getCurrentViewHolder"
            r0.f4431 = r2
            java.util.List r0 = r0.mo1885()
            java.lang.Object r0 = defpackage.AbstractC1107.m2124(r0)
            ᛱᲁᛲᲁ r0 = (defpackage.C0178) r0
            if (r0 == 0) goto L2e
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.m716(r2)
            goto L2f
        L2e:
            r0 = r1
        L2f:
            if (r0 != 0) goto L33
        L31:
            r0 = r1
            goto L65
        L33:
            int r2 = defpackage.AbstractC0233.f1405
            ᛶᲈᛱᲈ r0 = defpackage.AbstractC2279.m3695(r0)
            ᛵᛷᛶᲇ r0 = r0.m2300()
            r2 = -159785952910894(0xffff6eacef0961d2, double:NaN)
            java.lang.String r2 = "com.ss.android.ugc.aweme.feed.ui.PenetrateTouchRelativeLayout"
            r0.f4197 = r2
            r0.m1954()
            java.util.List r0 = r0.mo1885()
            java.lang.Object r0 = defpackage.AbstractC1107.m2124(r0)
            ᲀᛳᲇᲁ r0 = (defpackage.C1652) r0
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r0.m3037()
            android.view.View r0 = (android.view.View) r0
            goto L5f
        L5e:
            r0 = r1
        L5f:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L31
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L65:
            if (r0 != 0) goto L68
            return r1
        L68:
            android.view.ViewGroup r1 = defpackage.AbstractC2093.m3515(r0)
            if (r1 != 0) goto L6f
            return r0
        L6f:
            return r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static android.view.View m1153(int r5) {
            r0 = -1
            if (r5 == r0) goto L11
            if (r5 == 0) goto L11
            android.view.ViewGroup r0 = m1152()
            if (r0 != 0) goto Lc
            goto L5f
        Lc:
            android.view.View r5 = r0.findViewById(r5)
            return r5
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -160073715719726(0xffff6e69ef0961d2, double:NaN)
            java.lang.String r1 = "viewId is null "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r0 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r0 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r0 = r5.length()
            if (r0 != 0) goto L3d
            goto L5f
        L3d:
            int r0 = r5.length()
            r1 = 0
        L42:
            if (r1 >= r0) goto L5f
            int r2 = r1 + 2000
            if (r2 <= r0) goto L49
            r2 = r0
        L49:
            java.lang.String r1 = r5.substring(r1, r2)
            r3 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1040(r1)
            r1 = r2
            goto L42
        L5f:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public abstract java.lang.reflect.Method mo1138(java.lang.Class r1, java.lang.reflect.Field r2);

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public abstract java.lang.reflect.Constructor mo1139(java.lang.Class r1);

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public abstract boolean mo1154(defpackage.AbstractFutureC2017 r1, defpackage.C2246 r2, defpackage.C2246 r3);

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public abstract boolean mo1140(java.lang.Class r1);

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public abstract boolean mo1155(defpackage.AbstractFutureC2017 r1, java.lang.Object r2, java.lang.Object r3);

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public abstract boolean mo1156(defpackage.AbstractFutureC2017 r1, defpackage.C1317 r2);

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public abstract java.lang.String[] mo1141(java.lang.Class r1);

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public abstract void mo1157(defpackage.C2246 r1, java.lang.Thread r2);

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public abstract void mo1158(defpackage.C2246 r1, defpackage.C2246 r2);
}
