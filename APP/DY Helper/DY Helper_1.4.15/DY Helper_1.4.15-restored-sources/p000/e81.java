package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class e81 {
    /* JADX INFO: renamed from: α */
    public static final void m1871(p000.m11 r3, int r4) {
            int r0 = r3.f6888
            if (r0 == 0) goto L16
            r0 = 0
            int r0 = r3.m3702(r0)
            if (r0 == r4) goto L15
            int r0 = r3.f6888
            int r0 = r0 + (-1)
            int r0 = r3.m3702(r0)
            if (r0 != r4) goto L16
        L15:
            return
        L16:
            int r0 = r3.f6888
            r3.m3701(r4)
        L1b:
            if (r0 <= 0) goto L2e
            int r1 = r0 + 1
            int r1 = r1 >>> 1
            int r1 = r1 + (-1)
            int r2 = r3.m3702(r1)
            if (r4 <= r2) goto L2e
            r3.m3704(r0, r2)
            r0 = r1
            goto L1b
        L2e:
            r3.m3704(r0, r4)
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m1872(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L9
            goto Le
        L9:
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
        Le:
            android.os.Trace.beginSection(r2)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static int m1873(android.content.Context r6, java.lang.String r7) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            int r0 = r6.checkPermission(r7, r0, r1)
            r3 = -1
            if (r0 != r3) goto L14
            goto L2f
        L14:
            java.lang.String r7 = android.app.AppOpsManager.permissionToOp(r7)
            r0 = 0
            if (r7 != 0) goto L1c
            goto L71
        L1c:
            if (r2 != 0) goto L30
            android.content.pm.PackageManager r2 = r6.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L2f
            int r4 = r2.length
            if (r4 > 0) goto L2c
            goto L2f
        L2c:
            r2 = r2[r0]
            goto L30
        L2f:
            return r3
        L30:
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = r6.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            if (r3 != r1) goto L65
            boolean r3 = java.util.Objects.equals(r4, r2)
            if (r3 == 0) goto L65
            java.lang.Object r3 = r6.getSystemService(r5)
            android.app.AppOpsManager r3 = (android.app.AppOpsManager) r3
            int r4 = android.os.Binder.getCallingUid()
            r5 = 1
            if (r3 != 0) goto L51
            r2 = r5
            goto L55
        L51:
            int r2 = r3.checkOpNoThrow(r7, r4, r2)
        L55:
            if (r2 == 0) goto L58
            goto L6f
        L58:
            java.lang.String r6 = r6.getOpPackageName()
            if (r3 != 0) goto L5f
            goto L63
        L5f:
            int r5 = r3.checkOpNoThrow(r7, r1, r6)
        L63:
            r2 = r5
            goto L6f
        L65:
            java.lang.Object r6 = r6.getSystemService(r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = r6.noteProxyOpNoThrow(r7, r2)
        L6f:
            if (r2 != 0) goto L72
        L71:
            return r0
        L72:
            r6 = -2
            return r6
    }

    /* JADX INFO: renamed from: δ */
    public static android.text.StaticLayout m1874(java.lang.CharSequence r1, android.text.TextPaint r2, int r3, int r4, android.text.TextDirectionHeuristic r5, android.text.Layout.Alignment r6, int r7, android.text.TextUtils.TruncateAt r8, int r9, int r10, boolean r11, int r12, int r13, int r14, int r15) {
            if (r4 < 0) goto L3
            goto L8
        L3:
            java.lang.String r0 = "invalid start value"
            p000.bm0.m982(r0)
        L8:
            int r0 = r1.length()
            if (r4 < 0) goto L11
            if (r4 > r0) goto L11
            goto L16
        L11:
            java.lang.String r0 = "invalid end value"
            p000.bm0.m982(r0)
        L16:
            if (r7 < 0) goto L19
            goto L1e
        L19:
            java.lang.String r0 = "invalid maxLines value"
            p000.bm0.m982(r0)
        L1e:
            if (r3 < 0) goto L21
            goto L26
        L21:
            java.lang.String r0 = "invalid width value"
            p000.bm0.m982(r0)
        L26:
            if (r9 < 0) goto L29
            goto L2e
        L29:
            java.lang.String r0 = "invalid ellipsizedWidth value"
            p000.bm0.m982(r0)
        L2e:
            r0 = 0
            android.text.StaticLayout$Builder r1 = android.text.StaticLayout.Builder.obtain(r1, r0, r4, r2, r3)
            r1.setTextDirection(r5)
            r1.setAlignment(r6)
            r1.setMaxLines(r7)
            r1.setEllipsize(r8)
            r1.setEllipsizedWidth(r9)
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setLineSpacing(r2, r3)
            r1.setIncludePad(r11)
            r1.setBreakStrategy(r12)
            r1.setHyphenationFrequency(r15)
            r2 = 0
            r1.setIndents(r2, r2)
            r1.setJustificationMode(r10)
            r2 = 1
            r1.setUseLineSpacingFromFallbacks(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L75
            android.graphics.text.LineBreakConfig$Builder r3 = p000.AbstractC1124.m7322()
            android.graphics.text.LineBreakConfig$Builder r3 = p000.AbstractC1124.m7323(r3, r13)
            android.graphics.text.LineBreakConfig$Builder r3 = p000.AbstractC1124.m7318(r3, r14)
            android.graphics.text.LineBreakConfig r3 = p000.AbstractC1124.m7324(r3)
            p000.AbstractC1124.m7338(r1, r3)
        L75:
            r3 = 35
            if (r2 < r3) goto L7c
            p000.l02.m3433(r1)
        L7c:
            android.text.StaticLayout r1 = r1.build()
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static final java.lang.String m1875(java.lang.Object r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static final p000.kq1 m1876(android.view.View r3) {
        L0:
            r0 = 0
            if (r3 == 0) goto L22
            r1 = 2131297160(0x7f090388, float:1.8212257E38)
            java.lang.Object r1 = r3.getTag(r1)
            boolean r2 = r1 instanceof p000.kq1
            if (r2 == 0) goto L11
            kq1 r1 = (p000.kq1) r1
            goto L12
        L11:
            r1 = r0
        L12:
            if (r1 == 0) goto L15
            return r1
        L15:
            android.view.ViewParent r3 = p000.p91.m4429(r3)
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L20
            android.view.View r3 = (android.view.View) r3
            goto L0
        L20:
            r3 = r0
            goto L0
        L22:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static p000.tw1 m1877() {
            m6 r0 = p000.ax1.f1361
            java.lang.Object r0 = r0.m3786()
            tw1 r0 = (p000.tw1) r0
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static final android.os.Bundle m1878(android.os.Bundle r1, java.lang.String r2) {
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 == 0) goto L7
            return r1
        L7:
            java.lang.String r1 = "No valid saved state was found for the key '"
            java.lang.String r0 = "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."
            java.lang.String r1 = p000.lz1.m3674(r1, r2, r0)
            p000.C1080.m7275(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static p000.ts1 m1879(p000.e80 r1) {
            ts1 r0 = new ts1
            r0.<init>()
            op r1 = p000.AbstractC0978xb.m6590(r0, r0, r1)
            r0.f10444 = r1
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static p000.tw1 m1880(p000.tw1 r6) {
            boolean r0 = r6 instanceof p000.u52
            r1 = 0
            if (r0 == 0) goto L15
            r0 = r6
            u52 r0 = (p000.u52) r0
            long r2 = r0.f10604
            long r4 = p000.i91.m2680()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L15
            r0.f10602 = r1
            return r6
        L15:
            boolean r0 = r6 instanceof p000.v52
            if (r0 == 0) goto L29
            r0 = r6
            v52 r0 = (p000.v52) r0
            long r2 = r0.f11113
            long r4 = p000.i91.m2680()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L29
            r0.f11112 = r1
            return r6
        L29:
            r0 = 0
            tw1 r6 = p000.ax1.m625(r6, r1, r0)
            r6.m5760()
            return r6
    }

    /* JADX INFO: renamed from: λ */
    public static boolean m1881(java.lang.String r3, java.lang.String r4) {
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            ss1 r3 = p000.AbstractC0312g7.m2232(r3)
            cf1 r4 = new cf1
            r0 = 8
            r4.<init>(r0)
            y30 r3 = p000.us1.m5943(r3, r4)
            java.util.List r3 = p000.us1.m5948(r3)
            boolean r4 = r3.isEmpty()
            r0 = 0
            if (r4 != 0) goto L67
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L25
            goto L3e
        L25:
            java.util.Iterator r4 = r3.iterator()
        L29:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "多闪"
            boolean r1 = p000.q02.m4654(r1, r2, r0)
            if (r1 == 0) goto L29
            goto L67
        L3e:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L45
            goto L67
        L45:
            java.util.Iterator r3 = r3.iterator()
        L49:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "互发"
            boolean r1 = p000.q02.m4654(r4, r1, r0)
            if (r1 == 0) goto L49
            java.lang.String r1 = "消息"
            boolean r4 = p000.q02.m4654(r4, r1, r0)
            if (r4 == 0) goto L49
            r3 = 1
            return r3
        L67:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static final long m1882(long r1, float r3) {
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L16
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Ld
            goto L16
        Ld:
            float r0 = p000.C0114ci.m1193(r1)
            float r0 = r0 * r3
            long r1 = p000.C0114ci.m1191(r1, r0)
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public static java.lang.Object m1883(p000.C0222ds r6, p000.p70 r7) {
            m6 r0 = p000.ax1.f1361
            java.lang.Object r0 = r0.m3786()
            tw1 r0 = (p000.tw1) r0
            boolean r1 = r0 instanceof p000.u52
            if (r1 == 0) goto L3b
            r1 = r0
            u52 r1 = (p000.u52) r1
            long r2 = r1.f10604
            long r4 = p000.i91.m2680()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L3b
            a80 r2 = r1.f10602
            a80 r3 = r1.f10603
            r4 = r0
            u52 r4 = (p000.u52) r4     // Catch: java.lang.Throwable -> L34
            r5 = 1
            a80 r6 = p000.ax1.m629(r6, r2, r5)     // Catch: java.lang.Throwable -> L34
            r4.f10602 = r6     // Catch: java.lang.Throwable -> L34
            u52 r0 = (p000.u52) r0     // Catch: java.lang.Throwable -> L34
            r0.f10603 = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r6 = r7.invoke()     // Catch: java.lang.Throwable -> L34
            r1.f10602 = r2
            r1.f10603 = r3
            return r6
        L34:
            r0 = move-exception
            r6 = r0
            r1.f10602 = r2
            r1.f10603 = r3
            throw r6
        L3b:
            if (r0 == 0) goto L41
            boolean r1 = r0 instanceof p000.f21
            if (r1 == 0) goto L43
        L41:
            r1 = r0
            goto L48
        L43:
            tw1 r6 = r0.mo2011(r6)
            goto L5a
        L48:
            u52 r0 = new u52
            boolean r2 = r1 instanceof p000.f21
            if (r2 == 0) goto L51
            f21 r1 = (p000.f21) r1
            goto L52
        L51:
            r1 = 0
        L52:
            r4 = 1
            r5 = 0
            r3 = 0
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6 = r0
        L5a:
            tw1 r1 = r6.m5760()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r7.invoke()     // Catch: java.lang.Throwable -> L6c
            p000.tw1.m5756(r1)     // Catch: java.lang.Throwable -> L69
            r6.mo2000()
            return r7
        L69:
            r0 = move-exception
            r7 = r0
            goto L72
        L6c:
            r0 = move-exception
            r7 = r0
            p000.tw1.m5756(r1)     // Catch: java.lang.Throwable -> L69
            throw r7     // Catch: java.lang.Throwable -> L69
        L72:
            r6.mo2000()
            throw r7
    }

    /* JADX INFO: renamed from: ξ */
    public static final void m1884(p000.v80 r2, p000.a80 r3) {
            cc r0 = new cc
            r1 = 13
            r0.<init>(r1, r3)
            s62 r3 = p000.s62.f9751
            r2.m6087(r0, r3)
            return
    }

    /* JADX INFO: renamed from: ο */
    public static void m1885(p000.tw1 r0, p000.tw1 r1, p000.a80 r2) {
            if (r0 != r1) goto L1a
            boolean r1 = r0 instanceof p000.u52
            if (r1 == 0) goto Lb
            u52 r0 = (p000.u52) r0
            r0.f10602 = r2
            return
        Lb:
            boolean r1 = r0 instanceof p000.v52
            if (r1 == 0) goto L14
            v52 r0 = (p000.v52) r0
            r0.f11112 = r2
            return
        L14:
            java.lang.String r1 = "Non-transparent snapshot was reused: "
            p000.C1080.m7278(r0, r1)
            return
        L1a:
            r1.getClass()
            p000.tw1.m5756(r0)
            r1.mo2000()
            return
    }

    /* JADX INFO: renamed from: π */
    public static void m1886(java.util.List r2) {
            r2.getClass()
            r0 = 24
            java.util.List r2 = p000.AbstractC0984xh.m6662(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L18
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L40
            java.util.List r0 = p000.w71.f11592
            p000.AbstractC0984xh.m6660(r2, r0)
        L40:
            int r0 = r2.size()
            int r0 = r0 % 4
            if (r0 == 0) goto L4e
            java.lang.String r0 = ""
            r2.add(r0)
            goto L40
        L4e:
            java.lang.Object r0 = p000.ui1.f10844
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r2)
            java.lang.String r2 = r0.toString()
            r2.getClass()
            java.lang.String r0 = "operation_quick_actions"
            p000.ui1.m5875(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ρ */
    public static final void m1887(p000.e80 r1, p000.v80 r2, java.lang.Object r3) {
            boolean r0 = r2.f11154
            if (r0 != 0) goto L10
            java.lang.Object r0 = r2.m6073()
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            r2.m6115(r3)
            r2.m6087(r1, r3)
            return
    }

    /* JADX INFO: renamed from: σ */
    public static final int m1888(p000.m11 r10) {
            int r0 = r10.f6888
            r0 = 0
            int r1 = r10.m3702(r0)
        L7:
            int r2 = r10.f6888
            if (r2 == 0) goto L5e
            int r2 = r10.m3702(r0)
            if (r2 != r1) goto L5e
            int r2 = r10.f6888
            if (r2 == 0) goto L56
            int[] r3 = r10.f6887
            int r2 = r2 + (-1)
            r2 = r3[r2]
            r10.m3704(r0, r2)
            int r2 = r10.f6888
            int r2 = r2 + (-1)
            r10.m3703(r2)
            int r2 = r10.f6888
            int r3 = r2 >>> 1
            r4 = r0
        L2a:
            if (r4 >= r3) goto L7
            int r5 = r10.m3702(r4)
            int r6 = r4 + 1
            int r6 = r6 * 2
            int r7 = r6 + (-1)
            int r8 = r10.m3702(r7)
            if (r6 >= r2) goto L4c
            int r9 = r10.m3702(r6)
            if (r9 <= r8) goto L4c
            if (r9 <= r5) goto L7
            r10.m3704(r4, r9)
            r10.m3704(r6, r5)
            r4 = r6
            goto L2a
        L4c:
            if (r8 <= r5) goto L7
            r10.m3704(r4, r8)
            r10.m3704(r7, r5)
            r4 = r7
            goto L2a
        L56:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r0 = "IntList is empty."
            r10.<init>(r0)
            throw r10
        L5e:
            return r1
    }
}
