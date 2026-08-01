package defpackage;

/* JADX INFO: renamed from: ᲀᛴᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1662 implements defpackage.InterfaceC1297 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0055 f7409;

    public /* synthetic */ C1662(defpackage.C0055 r1) {
            r0 = this;
            r0.f7409 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public void m3054(defpackage.AbstractC2316 r8, defpackage.C0088 r9, defpackage.C0088 r10) {
            r7 = this;
            ᛱᛳᛶᛱ r7 = r7.f7409
            ᲀᛲᲁᛳ r0 = r7.f637
            r0.m3001(r8)
            r7.m465(r8)
            r0 = 0
            r8.m3791(r0)
            ᛱᛳᛸᛶ r0 = r7.f658
            r1 = r0
            ᛵᛳᲁᛳ r1 = (defpackage.C0857) r1
            r1.getClass()
            int r3 = r9.f840
            int r4 = r9.f841
            android.view.View r9 = r8.f9791
            if (r10 != 0) goto L24
            int r0 = r9.getLeft()
        L22:
            r5 = r0
            goto L27
        L24:
            int r0 = r10.f840
            goto L22
        L27:
            if (r10 != 0) goto L2f
            int r10 = r9.getTop()
        L2d:
            r6 = r10
            goto L32
        L2f:
            int r10 = r10.f841
            goto L2d
        L32:
            boolean r10 = r8.m3785()
            if (r10 != 0) goto L3d
            if (r3 != r5) goto L3f
            if (r4 == r6) goto L3d
            goto L3f
        L3d:
            r2 = r8
            goto L52
        L3f:
            int r10 = r9.getWidth()
            int r10 = r10 + r5
            int r0 = r9.getHeight()
            int r0 = r0 + r6
            r9.layout(r5, r6, r10, r0)
            r2 = r8
            boolean r8 = r1.m1811(r2, r3, r4, r5, r6)
            goto L5b
        L52:
            r1.m1808(r2)
            java.util.ArrayList r8 = r1.f3898
            r8.add(r2)
            r8 = 1
        L5b:
            if (r8 == 0) goto L60
            r7.m417()
        L60:
            return
    }

    @Override // defpackage.InterfaceC1297
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public float mo2292() {
            r1 = this;
            ᛱᛳᛶᛱ r1 = r1.f7409
            ᛷᛵᛱᲀ r0 = r1.f682
            boolean r0 = r0.mo170()
            if (r0 == 0) goto Le
            float r1 = r1.f673
        Lc:
            float r1 = -r1
            return r1
        Le:
            ᛷᛵᛱᲀ r0 = r1.f682
            boolean r0 = r0.mo172()
            if (r0 == 0) goto L19
            float r1 = r1.f631
            goto Lc
        L19:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public void m3055(int r2) {
            r1 = this;
            ᛱᛳᛶᛱ r1 = r1.f7409
            android.view.View r0 = r1.getChildAt(r2)
            if (r0 == 0) goto Le
            r1.m462(r0)
            r0.clearAnimation()
        Le:
            r1.removeViewAt(r2)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public void m3056(int r14, int r15) {
            r13 = this;
            ᛱᛳᛶᛱ r13 = r13.f7409
            ᲈᛷᲀᲀ r0 = r13.f611
            int r0 = r0.m3723()
            r1 = -1
            r2 = 1
            if (r14 >= r15) goto L10
            r3 = r14
            r4 = r15
            r5 = r1
            goto L13
        L10:
            r4 = r14
            r3 = r15
            r5 = r2
        L13:
            r6 = 0
            r7 = r6
        L15:
            java.lang.String r8 = " holder "
            java.lang.String r9 = "RecyclerView"
            if (r7 >= r0) goto L5d
            ᲈᛷᲀᲀ r10 = r13.f611
            android.view.View r10 = r10.m3718(r7)
            ᲈᛸᲈᛷ r10 = defpackage.C0055.m405(r10)
            if (r10 == 0) goto L5a
            int r11 = r10.f9790
            if (r11 < r3) goto L5a
            if (r11 <= r4) goto L2e
            goto L5a
        L2e:
            boolean r11 = defpackage.C0055.f605
            if (r11 == 0) goto L49
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "offsetPositionRecordsForMove attached child "
            r11.<init>(r12)
            r11.append(r7)
            r11.append(r8)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            android.util.Log.d(r9, r8)
        L49:
            int r8 = r10.f9790
            if (r8 != r14) goto L53
            int r8 = r15 - r14
            r10.m3786(r8, r6)
            goto L56
        L53:
            r10.m3786(r5, r6)
        L56:
            ᛵᲈᲁᲀ r8 = r13.f623
            r8.f4457 = r2
        L5a:
            int r7 = r7 + 1
            goto L15
        L5d:
            ᲀᛲᲁᛳ r0 = r13.f637
            java.util.ArrayList r0 = r0.f7312
            if (r14 >= r15) goto L66
            r3 = r14
            r4 = r15
            goto L69
        L66:
            r4 = r14
            r3 = r15
            r1 = r2
        L69:
            int r5 = r0.size()
            r7 = r6
        L6e:
            if (r7 >= r5) goto La8
            java.lang.Object r10 = r0.get(r7)
            ᲈᛸᲈᛷ r10 = (defpackage.AbstractC2316) r10
            if (r10 == 0) goto La5
            int r11 = r10.f9790
            if (r11 < r3) goto La5
            if (r11 <= r4) goto L7f
            goto La5
        L7f:
            if (r11 != r14) goto L87
            int r11 = r15 - r14
            r10.m3786(r11, r6)
            goto L8a
        L87:
            r10.m3786(r1, r6)
        L8a:
            boolean r11 = defpackage.C0055.f605
            if (r11 == 0) goto La5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "offsetPositionRecordsForMove cached child "
            r11.<init>(r12)
            r11.append(r7)
            r11.append(r8)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.d(r9, r10)
        La5:
            int r7 = r7 + 1
            goto L6e
        La8:
            r13.requestLayout()
            r13.f640 = r2
            return
    }

    @Override // defpackage.InterfaceC1297
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public void mo2295() {
            r0 = this;
            ᛱᛳᛶᛱ r0 = r0.f7409
            r0.m423()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public void m3057(int r12, int r13) {
            r11 = this;
            ᛱᛳᛶᛱ r11 = r11.f7409
            ᲈᛷᲀᲀ r0 = r11.f611
            int r0 = r0.m3723()
            r1 = 0
            r2 = r1
        La:
            java.lang.String r3 = " now at position "
            java.lang.String r4 = " holder "
            java.lang.String r5 = "RecyclerView"
            r6 = 1
            if (r2 >= r0) goto L57
            ᲈᛷᲀᲀ r7 = r11.f611
            android.view.View r7 = r7.m3718(r2)
            ᲈᛸᲈᛷ r7 = defpackage.C0055.m405(r7)
            if (r7 == 0) goto L54
            boolean r8 = r7.m3787()
            if (r8 != 0) goto L54
            int r8 = r7.f9790
            if (r8 < r12) goto L54
            boolean r8 = defpackage.C0055.f605
            if (r8 == 0) goto L4d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "offsetPositionRecordsForInsert attached child "
            r8.<init>(r9)
            r8.append(r2)
            r8.append(r4)
            r8.append(r7)
            r8.append(r3)
            int r3 = r7.f9790
            int r3 = r3 + r13
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            android.util.Log.d(r5, r3)
        L4d:
            r7.m3786(r13, r1)
            ᛵᲈᲁᲀ r3 = r11.f623
            r3.f4457 = r6
        L54:
            int r2 = r2 + 1
            goto La
        L57:
            ᲀᛲᲁᛳ r0 = r11.f637
            java.util.ArrayList r0 = r0.f7312
            int r2 = r0.size()
            r7 = r1
        L60:
            if (r7 >= r2) goto L98
            java.lang.Object r8 = r0.get(r7)
            ᲈᛸᲈᛷ r8 = (defpackage.AbstractC2316) r8
            if (r8 == 0) goto L95
            int r9 = r8.f9790
            if (r9 < r12) goto L95
            boolean r9 = defpackage.C0055.f605
            if (r9 == 0) goto L92
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "offsetPositionRecordsForInsert cached "
            r9.<init>(r10)
            r9.append(r7)
            r9.append(r4)
            r9.append(r8)
            r9.append(r3)
            int r10 = r8.f9790
            int r10 = r10 + r13
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r5, r9)
        L92:
            r8.m3786(r13, r1)
        L95:
            int r7 = r7 + 1
            goto L60
        L98:
            r11.requestLayout()
            r11.f640 = r6
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void m3058(int r8, int r9, java.lang.Object r10) {
            r7 = this;
            ᛱᛳᛶᛱ r7 = r7.f7409
            ᲈᛷᲀᲀ r0 = r7.f611
            int r0 = r0.m3723()
            int r9 = r9 + r8
            r1 = 0
        La:
            r2 = 2
            r3 = 1
            if (r1 >= r0) goto L58
            ᲈᛷᲀᲀ r4 = r7.f611
            android.view.View r4 = r4.m3718(r1)
            ᲈᛸᲈᛷ r5 = defpackage.C0055.m405(r4)
            if (r5 == 0) goto L55
            boolean r6 = r5.m3787()
            if (r6 == 0) goto L21
            goto L55
        L21:
            int r6 = r5.f9790
            if (r6 < r8) goto L55
            if (r6 >= r9) goto L55
            r5.m3784(r2)
            r2 = 1024(0x400, float:1.435E-42)
            if (r10 != 0) goto L32
            r5.m3784(r2)
            goto L4d
        L32:
            int r6 = r5.f9792
            r2 = r2 & r6
            if (r2 != 0) goto L4d
            java.util.ArrayList r2 = r5.f9782
            if (r2 != 0) goto L48
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.f9782 = r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r5.f9783 = r2
        L48:
            java.util.ArrayList r2 = r5.f9782
            r2.add(r10)
        L4d:
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            ᛵᛲᲁᛴ r2 = (defpackage.C0840) r2
            r2.f3862 = r3
        L55:
            int r1 = r1 + 1
            goto La
        L58:
            ᲀᛲᲁᛳ r10 = r7.f637
            java.util.ArrayList r0 = r10.f7312
            int r1 = r0.size()
            int r1 = r1 - r3
        L61:
            if (r1 < 0) goto L7b
            java.lang.Object r4 = r0.get(r1)
            ᲈᛸᲈᛷ r4 = (defpackage.AbstractC2316) r4
            if (r4 != 0) goto L6c
            goto L78
        L6c:
            int r5 = r4.f9790
            if (r5 < r8) goto L78
            if (r5 >= r9) goto L78
            r4.m3784(r2)
            r10.m3011(r1)
        L78:
            int r1 = r1 + (-1)
            goto L61
        L7b:
            r7.f674 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m3059(defpackage.C1669 r3) {
            r2 = this;
            int r0 = r3.f7453
            r1 = 1
            ᛱᛳᛶᛱ r2 = r2.f7409
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L26
            r1 = 4
            if (r0 == r1) goto L1c
            r1 = 8
            if (r0 == r1) goto L12
            return
        L12:
            ᛷᛵᛱᲀ r2 = r2.f682
            int r0 = r3.f7454
            int r3 = r3.f7451
            r2.mo150(r0, r3)
            return
        L1c:
            ᛷᛵᛱᲀ r2 = r2.f682
            int r0 = r3.f7454
            int r3 = r3.f7451
            r2.mo118(r0, r3)
            return
        L26:
            ᛷᛵᛱᲀ r2 = r2.f682
            int r0 = r3.f7454
            int r3 = r3.f7451
            r2.mo147(r0, r3)
            return
        L30:
            ᛷᛵᛱᲀ r2 = r2.f682
            int r0 = r3.f7454
            int r3 = r3.f7451
            r2.mo146(r0, r3)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public defpackage.AbstractC2316 m3060(int r7) {
            r6 = this;
            ᛱᛳᛶᛱ r6 = r6.f7409
            ᲈᛷᲀᲀ r0 = r6.f611
            int r0 = r0.m3723()
            r1 = 0
            r2 = 0
            r3 = r1
        Lb:
            if (r2 >= r0) goto L39
            ᲈᛷᲀᲀ r4 = r6.f611
            android.view.View r4 = r4.m3718(r2)
            ᲈᛸᲈᛷ r4 = defpackage.C0055.m405(r4)
            if (r4 == 0) goto L36
            boolean r5 = r4.m3785()
            if (r5 != 0) goto L36
            int r5 = r4.f9790
            if (r5 == r7) goto L24
            goto L36
        L24:
            ᲈᛷᲀᲀ r3 = r6.f611
            android.view.View r5 = r4.f9791
            java.lang.Object r3 = r3.f9714
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L34
            r3 = r4
            goto L36
        L34:
            r3 = r4
            goto L39
        L36:
            int r2 = r2 + 1
            goto Lb
        L39:
            if (r3 != 0) goto L3c
            goto L55
        L3c:
            ᲈᛷᲀᲀ r6 = r6.f611
            android.view.View r7 = r3.f9791
            java.lang.Object r6 = r6.f9714
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L56
            boolean r6 = defpackage.C0055.f605
            if (r6 == 0) goto L55
            java.lang.String r6 = "RecyclerView"
            java.lang.String r7 = "assuming view holder cannot be find because it is hidden"
            android.util.Log.d(r6, r7)
        L55:
            return r1
        L56:
            return r3
    }

    @Override // defpackage.InterfaceC1297
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public boolean mo2299(float r4) {
            r3 = this;
            ᛱᛳᛶᛱ r3 = r3.f7409
            ᛷᛵᛱᲀ r0 = r3.f682
            boolean r0 = r0.mo170()
            r1 = 0
            if (r0 == 0) goto Lf
            int r4 = (int) r4
            r0 = r4
            r4 = r1
            goto L1c
        Lf:
            ᛷᛵᛱᲀ r0 = r3.f682
            boolean r0 = r0.mo172()
            if (r0 == 0) goto L1a
            int r4 = (int) r4
            r0 = r1
            goto L1c
        L1a:
            r4 = r1
            r0 = r4
        L1c:
            if (r4 != 0) goto L21
            if (r0 != 0) goto L21
            return r1
        L21:
            r3.m423()
            r2 = 2147483647(0x7fffffff, float:NaN)
            boolean r3 = r3.m442(r4, r0, r1, r2)
            return r3
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public void m3061(defpackage.AbstractC2316 r8, defpackage.C0088 r9, defpackage.C0088 r10) {
            r7 = this;
            r0 = 0
            r8.m3791(r0)
            ᛱᛳᛶᛱ r7 = r7.f7409
            ᛱᛳᛸᛶ r0 = r7.f658
            r1 = r0
            ᛵᛳᲁᛳ r1 = (defpackage.C0857) r1
            if (r9 == 0) goto L1d
            r1.getClass()
            int r3 = r9.f840
            int r5 = r10.f840
            if (r3 != r5) goto L1f
            int r0 = r9.f841
            int r2 = r10.f841
            if (r0 == r2) goto L1d
            goto L1f
        L1d:
            r2 = r8
            goto L29
        L1f:
            int r4 = r9.f841
            int r6 = r10.f841
            r2 = r8
            boolean r8 = r1.m1811(r2, r3, r4, r5, r6)
            goto L38
        L29:
            r1.m1808(r2)
            android.view.View r8 = r2.f9791
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.f3901
            r8.add(r2)
            r8 = 1
        L38:
            if (r8 == 0) goto L3d
            r7.m417()
        L3d:
            return
    }
}
