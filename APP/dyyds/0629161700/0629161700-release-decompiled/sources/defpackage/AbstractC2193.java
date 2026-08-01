package defpackage;

/* JADX INFO: renamed from: ᲈᛲᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2193 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final int[] f9301 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final int[] f9302 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C2054 f9303 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final int[] f9304 = null;

    static {
            ᲇᛵᲀᲇ r0 = new ᲇᛵᲀᲇ
            r1 = 9
            r0.<init>(r1)
            defpackage.AbstractC2193.f9303 = r0
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r1 = new int[]{r0}
            defpackage.AbstractC2193.f9304 = r1
            r1 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r0 = new int[]{r1, r0}
            defpackage.AbstractC2193.f9302 = r0
            int[] r0 = new int[]{r1}
            defpackage.AbstractC2193.f9301 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static void m3590(android.view.inputmethod.EditorInfo r0, android.view.inputmethod.InputConnection r1, android.widget.TextView r2) {
            if (r1 == 0) goto L13
            java.lang.CharSequence r0 = r0.hintText
            if (r0 != 0) goto L13
            android.view.ViewParent r0 = r2.getParent()
        La:
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L13
            android.view.ViewParent r0 = r0.getParent()
            goto La
        L13:
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static void m3591(android.app.Activity r3, android.view.View r4) {
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r3)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L16
            android.view.ViewParent r1 = r4.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r4)
        L16:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.addView(r4, r1)
            java.lang.String r4 = "window"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.WindowManager$LayoutParams r4 = new android.view.WindowManager$LayoutParams
            r4.<init>()
            r1 = 16
            r4.gravity = r1
            r2 = -2
            r4.format = r2
            r2 = 1003(0x3eb, float:1.406E-42)
            r4.type = r2
            r2 = 201327872(0xc000500, float:9.862266E-32)
            r4.flags = r2
            r4.softInputMode = r1
            r1 = 1
            r4.layoutInDisplayCutoutMode = r1
            r3.addView(r0, r4)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final java.lang.Object m3592(com.ss.android.ugc.awemes.WardDatabase r8, defpackage.InterfaceC0598 r9) {
            java.lang.ThreadLocal r0 = r8.f432
            r8.m307()
            boolean r1 = r8.m299()
            r6 = 0
            if (r1 == 0) goto L2e
            boolean r1 = r8.m302()
            if (r1 != 0) goto L2e
            java.lang.Object r1 = r0.get()
            ᛳᛵᲈᛵ r1 = (defpackage.InterfaceC0493) r1
            if (r1 == 0) goto L23
            ᲁᲁᛷᲈ r2 = defpackage.C2283.f9639
            ᛶᲁᛳᲈ r1 = r1.mo970(r2)
            ᲈᛷᛵᲀ r1 = (defpackage.C2283) r1
            goto L24
        L23:
            r1 = r6
        L24:
            if (r1 != 0) goto L27
            goto L2e
        L27:
            java.lang.String r8 = "Cannot access database on a different coroutine context inherited from a suspending transaction."
            defpackage.C2264.m3676(r8)
            r8 = 0
            return r8
        L2e:
            java.lang.Object r0 = r0.get()
            ᛳᛵᲈᛵ r0 = (defpackage.InterfaceC0493) r0
            ᛲᛶᛳᛱ r1 = defpackage.C0303.f1620
            if (r0 != 0) goto L3a
            r3 = r1
            goto L3b
        L3a:
            r3 = r0
        L3b:
            ᲁᲀᲇᛱ r2 = new ᲁᲀᲇᛱ
            r7 = 2
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Thread.interrupted()
            ᲇᛶᲁᲇ r8 = new ᲇᛶᲁᲇ
            r8.<init>(r2, r6)
            java.lang.Object r8 = defpackage.AbstractC0498.m1270(r1, r8)
            return r8
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static android.content.Intent m3593(android.content.Context r5, defpackage.AbstractC1793... r6) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "package:"
            r1.<init>(r2)
            java.lang.String r5 = r5.getPackageName()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r0.setData(r5)
            if (r6 == 0) goto L54
            int r5 = r6.length
            if (r5 <= 0) goto L54
            int r5 = defpackage.AbstractC1536.f6760
            r1 = -1680767897(0xffffffff9bd18467, float:-3.4661713E-22)
            if (r5 != r1) goto L54
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r6.length
            r3 = 0
        L38:
            if (r3 >= r2) goto L46
            r4 = r6[r3]
            java.lang.String r4 = r4.mo1205()
            r1.add(r4)
            int r3 = r3 + 1
            goto L38
        L46:
            java.lang.String r6 = "permissionList"
            r5.putStringArrayList(r6, r1)
            r0.putExtras(r5)
            java.lang.String r5 = "isGetPermission"
            r6 = 1
            r0.putExtra(r5, r6)
        L54:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final void m3594(int r1) {
            r0 = 1
            if (r1 < r0) goto L4
            return
        L4:
            java.lang.String r0 = "Expected positive parallelism level, but got "
            java.lang.String r1 = defpackage.AbstractC1124.m2145(r1, r0)
            defpackage.C2264.m3678(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3595(java.lang.Throwable r2, java.lang.Throwable r3) {
            if (r2 == r3) goto L1e
            java.lang.Integer r0 = defpackage.AbstractC2134.f9106
            if (r0 == 0) goto L1b
            int r0 = r0.intValue()
            r1 = 19
            if (r0 < r1) goto Lf
            goto L1b
        Lf:
            java.lang.reflect.Method r0 = defpackage.AbstractC0839.f3860
            if (r0 == 0) goto L1e
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.invoke(r2, r3)
            return
        L1b:
            r2.addSuppressed(r3)
        L1e:
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final java.lang.Object m3596(defpackage.InterfaceC0140 r14, defpackage.InterfaceC0598 r15, com.ss.android.ugc.awemes.WardDatabase r16, boolean r17, boolean r18) {
            boolean r0 = r14 instanceof defpackage.C0324
            if (r0 == 0) goto L14
            r0 = r14
            ᛲᛷᲀᛴ r0 = (defpackage.C0324) r0
            int r1 = r0.f1689
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f1689 = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            ᛲᛷᲀᛴ r0 = new ᛲᛷᲀᛴ
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.f1691
            int r1 = r14.f1689
            r2 = 3
            r3 = 2
            r6 = 1
            r4 = 0
            ᛴᛵ r7 = defpackage.EnumC0670.f3246
            if (r1 == 0) goto L4b
            if (r1 == r6) goto L47
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            defpackage.AbstractC0762.m1680(r0)
            return r0
        L30:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r14)
            return r4
        L36:
            boolean r1 = r14.f1690
            boolean r3 = r14.f1688
            ᛳᲈᲇᛳ r5 = r14.f1693
            com.ss.android.ugc.awemes.WardDatabase r6 = r14.f1692
            defpackage.AbstractC0762.m1680(r0)
            r12 = r3
            r10 = r5
            r11 = r6
        L44:
            r13 = r1
            goto Ld7
        L47:
            defpackage.AbstractC0762.m1680(r0)
            return r0
        L4b:
            defpackage.AbstractC0762.m1680(r0)
            boolean r0 = r16.m299()
            if (r0 == 0) goto L7a
            boolean r0 = r16.m300()
            if (r0 == 0) goto L7a
            boolean r0 = r16.m302()
            if (r0 == 0) goto L7a
            ᛸᛶᛸᛱ r0 = new ᛸᛶᛸᛱ
            r1 = 0
            r2 = r15
            r3 = r16
            r5 = r17
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r0 = r3
            r14.f1689 = r6
            java.lang.Object r14 = r0.m304(r5, r1, r14)
            if (r14 != r7) goto L79
            goto Leb
        L79:
            return r14
        L7a:
            r0 = r16
            r5 = r17
            r1 = r18
            r14.f1692 = r0
            r14.f1693 = r15
            r14.f1688 = r5
            r14.f1690 = r1
            r14.f1689 = r3
            ᛳᛵᲈᛵ r3 = r14.f4527
            ᲁᲁᛷᲈ r8 = defpackage.C2283.f9639
            ᛶᲁᛳᲈ r3 = r3.mo970(r8)
            ᲈᛷᛵᲀ r3 = (defpackage.C2283) r3
            if (r3 == 0) goto L99
            ᲁᛲᛱᛵ r3 = r3.f9640
            goto L9a
        L99:
            r3 = r4
        L9a:
            boolean r8 = r0.m299()
            if (r8 == 0) goto Lbe
            if (r3 == 0) goto Lae
            ᛳᲁᛳᛴ r8 = r0.f436
            if (r8 != 0) goto La7
            r8 = r4
        La7:
            ᛳᛵᲈᛵ r8 = r8.f2727
            ᛳᛵᲈᛵ r3 = r8.mo971(r3)
            goto Lce
        Lae:
            if (r1 == 0) goto Lb6
            ᛳᛵᲈᛵ r3 = r0.f438
            if (r3 != 0) goto Lce
            r3 = r4
            goto Lce
        Lb6:
            ᛳᲁᛳᛴ r3 = r0.f436
            if (r3 != 0) goto Lbb
            r3 = r4
        Lbb:
            ᛳᛵᲈᛵ r3 = r3.f2727
            goto Lce
        Lbe:
            ᛳᲁᛳᛴ r8 = r0.f436
            if (r8 != 0) goto Lc3
            r8 = r4
        Lc3:
            ᛳᛵᲈᛵ r8 = r8.f2727
            if (r3 == 0) goto Lc8
            goto Lca
        Lc8:
            ᛲᛶᛳᛱ r3 = defpackage.C0303.f1620
        Lca:
            ᛳᛵᲈᛵ r3 = r8.mo971(r3)
        Lce:
            if (r3 != r7) goto Ld1
            goto Leb
        Ld1:
            r10 = r15
            r11 = r0
            r0 = r3
            r12 = r5
            goto L44
        Ld7:
            ᛳᛵᲈᛵ r0 = (defpackage.InterfaceC0493) r0
            ᛵᛸᛶᛴ r8 = new ᛵᛸᛶᛴ
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14.f1692 = r4
            r14.f1693 = r4
            r14.f1689 = r2
            java.lang.Object r14 = defpackage.AbstractC0397.m1144(r0, r8, r14)
            if (r14 != r7) goto Lec
        Leb:
            return r7
        Lec:
            return r14
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m3597(java.lang.String r2) {
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

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final int m3598(defpackage.InterfaceC0270 r7, java.lang.String r8) {
            int r0 = defpackage.AbstractC1592.m2880(r7, r8)
            if (r0 < 0) goto L7
            return r0
        L7:
            int r0 = r7.getColumnCount()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L11:
            if (r2 >= r0) goto L1d
            java.lang.String r3 = r7.getColumnName(r2)
            r1.add(r3)
            int r2 = r2 + 1
            goto L11
        L1d:
            r5 = 0
            r6 = 63
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r7 = defpackage.AbstractC1107.m2125(r1, r2, r3, r4, r5, r6)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Column '"
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = "' does not exist. Available columns: ["
            r1.append(r8)
            r1.append(r7)
            r7 = 93
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static java.util.ArrayList m3599(android.app.Activity r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r1 = 0
            android.content.Intent r2 = m3593(r2, r1)
            r0.add(r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r1 = "android.settings.MANAGE_APPLICATIONS_SETTINGS"
            r2.<init>(r1)
            r0.add(r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_SETTINGS"
            r2.<init>(r1)
            r0.add(r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r1 = "android.settings.SETTINGS"
            r2.<init>(r1)
            r0.add(r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public abstract java.util.List mo1625(java.util.List r1, java.lang.String r2);
}
