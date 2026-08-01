package defpackage;

/* JADX INFO: renamed from: ᛵᛳᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0857 extends defpackage.AbstractC0059 {

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static android.animation.TimeInterpolator f3897;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.util.ArrayList f3898;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public java.util.ArrayList f3899;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public java.util.ArrayList f3900;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public java.util.ArrayList f3901;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public java.util.ArrayList f3902;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public java.util.ArrayList f3903;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public java.util.ArrayList f3904;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public java.util.ArrayList f3905;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public java.util.ArrayList f3906;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public java.util.ArrayList f3907;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public java.util.ArrayList f3908;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f3909;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static void m1806(java.util.ArrayList r2) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.get(r0)
            ᲈᛸᲈᛷ r1 = (defpackage.AbstractC2316) r1
            android.view.View r1 = r1.f9791
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.cancel()
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final boolean m1807(defpackage.C2162 r3, defpackage.AbstractC2316 r4) {
            r2 = this;
            ᲈᛸᲈᛷ r0 = r3.f9216
            r1 = 0
            if (r0 != r4) goto L8
            r3.f9216 = r1
            goto Le
        L8:
            ᲈᛸᲈᛷ r0 = r3.f9215
            if (r0 != r4) goto L23
            r3.f9215 = r1
        Le:
            android.view.View r3 = r4.f9791
            android.view.View r0 = r4.f9791
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r1)
            r3 = 0
            r0.setTranslationX(r3)
            r0.setTranslationY(r3)
            r2.m473(r4)
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m1808(defpackage.AbstractC2316 r3) {
            r2 = this;
            android.animation.TimeInterpolator r0 = defpackage.C0857.f3897
            if (r0 != 0) goto Lf
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            defpackage.C0857.f3897 = r0
        Lf:
            android.view.View r0 = r3.f9791
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r1 = defpackage.C0857.f3897
            r0.setInterpolator(r1)
            r2.mo472(r3)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m1809() {
            r1 = this;
            boolean r0 = r1.mo475()
            if (r0 != 0) goto L1d
            java.util.ArrayList r1 = r1.f693
            int r0 = r1.size()
            if (r0 > 0) goto L12
            r1.clear()
            return
        L12:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            r1.getClass()
            defpackage.C2264.m3679()
        L1d:
            return
    }

    @Override // defpackage.AbstractC0059
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo471() {
            r11 = this;
            java.util.ArrayList r0 = r11.f3899
            java.util.ArrayList r1 = r11.f3905
            java.util.ArrayList r2 = r11.f3900
            java.util.ArrayList r3 = r11.f3903
            java.util.ArrayList r4 = r11.f3901
            java.util.ArrayList r5 = r11.f3898
            java.util.ArrayList r6 = r11.f3904
            int r7 = r6.size()
            int r7 = r7 + (-1)
        L14:
            r8 = 0
            if (r7 < 0) goto L32
            java.lang.Object r9 = r6.get(r7)
            ᛳᛵᛴᛶ r9 = (defpackage.C0479) r9
            ᲈᛸᲈᛷ r10 = r9.f2408
            android.view.View r10 = r10.f9791
            r10.setTranslationY(r8)
            r10.setTranslationX(r8)
            ᲈᛸᲈᛷ r8 = r9.f2408
            r11.m473(r8)
            r6.remove(r7)
            int r7 = r7 + (-1)
            goto L14
        L32:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L38:
            if (r6 < 0) goto L49
            java.lang.Object r7 = r5.get(r6)
            ᲈᛸᲈᛷ r7 = (defpackage.AbstractC2316) r7
            r11.m473(r7)
            r5.remove(r6)
            int r6 = r6 + (-1)
            goto L38
        L49:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L4f:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 < 0) goto L67
            java.lang.Object r7 = r4.get(r5)
            ᲈᛸᲈᛷ r7 = (defpackage.AbstractC2316) r7
            android.view.View r9 = r7.f9791
            r9.setAlpha(r6)
            r11.m473(r7)
            r4.remove(r5)
            int r5 = r5 + (-1)
            goto L4f
        L67:
            int r4 = r0.size()
            int r4 = r4 + (-1)
        L6d:
            if (r4 < 0) goto L86
            java.lang.Object r5 = r0.get(r4)
            ᲇᲈᛶᛵ r5 = (defpackage.C2162) r5
            ᲈᛸᲈᛷ r7 = r5.f9215
            if (r7 == 0) goto L7c
            r11.m1807(r5, r7)
        L7c:
            ᲈᛸᲈᛷ r7 = r5.f9216
            if (r7 == 0) goto L83
            r11.m1807(r5, r7)
        L83:
            int r4 = r4 + (-1)
            goto L6d
        L86:
            r0.clear()
            boolean r0 = r11.mo475()
            if (r0 != 0) goto L90
            return
        L90:
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L96:
            if (r0 < 0) goto Lcd
            java.lang.Object r4 = r3.get(r0)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r5 = r5 + (-1)
        La4:
            if (r5 < 0) goto Lca
            java.lang.Object r7 = r4.get(r5)
            ᛳᛵᛴᛶ r7 = (defpackage.C0479) r7
            ᲈᛸᲈᛷ r9 = r7.f2408
            android.view.View r9 = r9.f9791
            r9.setTranslationY(r8)
            r9.setTranslationX(r8)
            ᲈᛸᲈᛷ r7 = r7.f2408
            r11.m473(r7)
            r4.remove(r5)
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto Lc7
            r3.remove(r4)
        Lc7:
            int r5 = r5 + (-1)
            goto La4
        Lca:
            int r0 = r0 + (-1)
            goto L96
        Lcd:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        Ld3:
            if (r0 < 0) goto L103
            java.lang.Object r3 = r2.get(r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            int r4 = r4 + (-1)
        Le1:
            if (r4 < 0) goto L100
            java.lang.Object r5 = r3.get(r4)
            ᲈᛸᲈᛷ r5 = (defpackage.AbstractC2316) r5
            android.view.View r7 = r5.f9791
            r7.setAlpha(r6)
            r11.m473(r5)
            r3.remove(r4)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto Lfd
            r2.remove(r3)
        Lfd:
            int r4 = r4 + (-1)
            goto Le1
        L100:
            int r0 = r0 + (-1)
            goto Ld3
        L103:
            int r0 = r1.size()
            int r0 = r0 + (-1)
        L109:
            if (r0 < 0) goto L13c
            java.lang.Object r2 = r1.get(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L117:
            if (r3 < 0) goto L139
            java.lang.Object r4 = r2.get(r3)
            ᲇᲈᛶᛵ r4 = (defpackage.C2162) r4
            ᲈᛸᲈᛷ r5 = r4.f9215
            if (r5 == 0) goto L126
            r11.m1807(r4, r5)
        L126:
            ᲈᛸᲈᛷ r5 = r4.f9216
            if (r5 == 0) goto L12d
            r11.m1807(r4, r5)
        L12d:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L136
            r1.remove(r2)
        L136:
            int r3 = r3 + (-1)
            goto L117
        L139:
            int r0 = r0 + (-1)
            goto L109
        L13c:
            java.util.ArrayList r0 = r11.f3906
            m1806(r0)
            java.util.ArrayList r0 = r11.f3908
            m1806(r0)
            java.util.ArrayList r0 = r11.f3902
            m1806(r0)
            java.util.ArrayList r0 = r11.f3907
            m1806(r0)
            java.util.ArrayList r11 = r11.f693
            int r0 = r11.size()
            if (r0 > 0) goto L15c
            r11.clear()
            return
        L15c:
            r0 = 0
            java.lang.Object r11 = r11.get(r0)
            r11.getClass()
            defpackage.C2264.m3679()
            return
    }

    @Override // defpackage.AbstractC0059
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo472(defpackage.AbstractC2316 r10) {
            r9 = this;
            java.util.ArrayList r0 = r9.f3900
            java.util.ArrayList r1 = r9.f3903
            java.util.ArrayList r2 = r9.f3905
            android.view.View r3 = r10.f9791
            android.view.ViewPropertyAnimator r4 = r3.animate()
            r4.cancel()
            java.util.ArrayList r4 = r9.f3904
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L17:
            r6 = 0
            if (r5 < 0) goto L33
            java.lang.Object r7 = r4.get(r5)
            ᛳᛵᛴᛶ r7 = (defpackage.C0479) r7
            ᲈᛸᲈᛷ r7 = r7.f2408
            if (r7 != r10) goto L30
            r3.setTranslationY(r6)
            r3.setTranslationX(r6)
            r9.m473(r10)
            r4.remove(r5)
        L30:
            int r5 = r5 + (-1)
            goto L17
        L33:
            java.util.ArrayList r4 = r9.f3899
            r9.m1810(r4, r10)
            java.util.ArrayList r4 = r9.f3898
            boolean r4 = r4.remove(r10)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L48
            r3.setAlpha(r5)
            r9.m473(r10)
        L48:
            java.util.ArrayList r4 = r9.f3901
            boolean r4 = r4.remove(r10)
            if (r4 == 0) goto L56
            r3.setAlpha(r5)
            r9.m473(r10)
        L56:
            int r4 = r2.size()
            int r4 = r4 + (-1)
        L5c:
            if (r4 < 0) goto L73
            java.lang.Object r7 = r2.get(r4)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r9.m1810(r7, r10)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L70
            r2.remove(r4)
        L70:
            int r4 = r4 + (-1)
            goto L5c
        L73:
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L79:
            if (r2 < 0) goto Laf
            java.lang.Object r4 = r1.get(r2)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r7 = r4.size()
            int r7 = r7 + (-1)
        L87:
            if (r7 < 0) goto Lac
            java.lang.Object r8 = r4.get(r7)
            ᛳᛵᛴᛶ r8 = (defpackage.C0479) r8
            ᲈᛸᲈᛷ r8 = r8.f2408
            if (r8 != r10) goto La9
            r3.setTranslationY(r6)
            r3.setTranslationX(r6)
            r9.m473(r10)
            r4.remove(r7)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Lac
            r1.remove(r2)
            goto Lac
        La9:
            int r7 = r7 + (-1)
            goto L87
        Lac:
            int r2 = r2 + (-1)
            goto L79
        Laf:
            int r1 = r0.size()
            int r1 = r1 + (-1)
        Lb5:
            if (r1 < 0) goto Ld5
            java.lang.Object r2 = r0.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r4 = r2.remove(r10)
            if (r4 == 0) goto Ld2
            r3.setAlpha(r5)
            r9.m473(r10)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Ld2
            r0.remove(r1)
        Ld2:
            int r1 = r1 + (-1)
            goto Lb5
        Ld5:
            java.util.ArrayList r0 = r9.f3906
            r0.remove(r10)
            java.util.ArrayList r0 = r9.f3902
            r0.remove(r10)
            java.util.ArrayList r0 = r9.f3907
            r0.remove(r10)
            java.util.ArrayList r0 = r9.f3908
            r0.remove(r10)
            r9.m1809()
            return
    }

    @Override // defpackage.AbstractC0059
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo474(defpackage.AbstractC2316 r9, defpackage.AbstractC2316 r10, defpackage.C0088 r11, defpackage.C0088 r12) {
            r8 = this;
            int r2 = r11.f840
            int r3 = r11.f841
            boolean r0 = r10.m3787()
            if (r0 == 0) goto L11
            int r12 = r11.f840
            int r11 = r11.f841
            r5 = r11
            r4 = r12
            goto L17
        L11:
            int r11 = r12.f840
            int r12 = r12.f841
            r4 = r11
            r5 = r12
        L17:
            if (r9 != r10) goto L20
            r0 = r8
            r1 = r9
            boolean r8 = r0.m1811(r1, r2, r3, r4, r5)
            return r8
        L20:
            r0 = r8
            r1 = r9
            android.view.View r8 = r1.f9791
            float r9 = r8.getTranslationX()
            float r11 = r8.getTranslationY()
            float r12 = r8.getAlpha()
            r0.m1808(r1)
            int r6 = r4 - r2
            float r6 = (float) r6
            float r6 = r6 - r9
            int r6 = (int) r6
            int r7 = r5 - r3
            float r7 = (float) r7
            float r7 = r7 - r11
            int r7 = (int) r7
            r8.setTranslationX(r9)
            r8.setTranslationY(r11)
            r8.setAlpha(r12)
            android.view.View r8 = r10.f9791
            r0.m1808(r10)
            int r9 = -r6
            float r9 = (float) r9
            r8.setTranslationX(r9)
            int r9 = -r7
            float r9 = (float) r9
            r8.setTranslationY(r9)
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r0.f3899
            ᲇᲈᛶᛵ r9 = new ᲇᲈᛶᛵ
            r9.<init>()
            r9.f9215 = r1
            r9.f9216 = r10
            r9.f9214 = r2
            r9.f9213 = r3
            r9.f9212 = r4
            r9.f9217 = r5
            r8.add(r9)
            r8 = 1
            return r8
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final void m1810(java.util.ArrayList r4, defpackage.AbstractC2316 r5) {
            r3 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L22
            java.lang.Object r1 = r4.get(r0)
            ᲇᲈᛶᛵ r1 = (defpackage.C2162) r1
            boolean r2 = r3.m1807(r1, r5)
            if (r2 == 0) goto L1f
            ᲈᛸᲈᛷ r2 = r1.f9215
            if (r2 != 0) goto L1f
            ᲈᛸᲈᛷ r2 = r1.f9216
            if (r2 != 0) goto L1f
            r4.remove(r1)
        L1f:
            int r0 = r0 + (-1)
            goto L6
        L22:
            return
    }

    @Override // defpackage.AbstractC0059
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final boolean mo475() {
            r1 = this;
            java.util.ArrayList r0 = r1.f3901
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f3899
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f3904
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f3898
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f3908
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f3906
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f3902
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f3907
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f3903
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f3900
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r1 = r1.f3905
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L59
            goto L5b
        L59:
            r1 = 0
            return r1
        L5b:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean m1811(defpackage.AbstractC2316 r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.View r0 = r4.f9791
            float r1 = r0.getTranslationX()
            int r1 = (int) r1
            int r5 = r5 + r1
            android.view.View r1 = r4.f9791
            float r1 = r1.getTranslationY()
            int r1 = (int) r1
            int r6 = r6 + r1
            r3.m1808(r4)
            int r1 = r7 - r5
            int r2 = r8 - r6
            if (r1 != 0) goto L20
            if (r2 != 0) goto L20
            r3.m473(r4)
            r3 = 0
            return r3
        L20:
            if (r1 == 0) goto L27
            int r1 = -r1
            float r1 = (float) r1
            r0.setTranslationX(r1)
        L27:
            if (r2 == 0) goto L2e
            int r1 = -r2
            float r1 = (float) r1
            r0.setTranslationY(r1)
        L2e:
            java.util.ArrayList r3 = r3.f3904
            ᛳᛵᛴᛶ r0 = new ᛳᛵᛴᛶ
            r0.<init>()
            r0.f2408 = r4
            r0.f2409 = r5
            r0.f2407 = r6
            r0.f2406 = r7
            r0.f2405 = r8
            r3.add(r0)
            r3 = 1
            return r3
    }
}
