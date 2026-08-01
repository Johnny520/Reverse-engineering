package defpackage;

/* JADX INFO: renamed from: ᲇᲇᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2148 extends defpackage.C0377 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f9127;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C1032 f9128;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.view.WindowInsets f9129;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.graphics.Rect[][] f9130;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.graphics.Rect[][] f9131;

    public AbstractC2148(defpackage.C2300 r2, android.view.WindowInsets r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.f9128 = r2
            r2 = 10
            android.graphics.Rect[][] r0 = new android.graphics.Rect[r2][]
            r1.f9130 = r0
            android.graphics.Rect[][] r2 = new android.graphics.Rect[r2][]
            r1.f9131 = r2
            r1.f9129 = r3
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    private defpackage.C0750 m3559(android.view.View r12) {
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            android.view.Display r12 = r12.getDisplay()
            if (r12 != 0) goto Lb
            return r0
        Lb:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r12.getRealSize(r0)
            ᲈᛸᛱᲀ r11 = r11.f1956
            ᛲᲇᲀᲈ r11 = r11.f9727
            boolean r11 = r11.mo1119()
            if (r11 == 0) goto L2b
            int r1 = r0.x
            int r2 = r0.y
            r6 = 0
            r7 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            ᛴᲀᛸᛷ r11 = defpackage.C0750.m1666(r1, r2, r3, r4, r5, r6, r7)
            return r11
        L2b:
            r11 = 0
            ᛸᛷᛵᛵ r1 = defpackage.AbstractC0209.m774(r12, r11)
            r2 = 1
            ᛸᛷᛵᛵ r2 = defpackage.AbstractC0209.m774(r12, r2)
            r3 = 2
            ᛸᛷᛵᛵ r3 = defpackage.AbstractC0209.m774(r12, r3)
            r4 = 3
            ᛸᛷᛵᛵ r12 = defpackage.AbstractC0209.m774(r12, r4)
            int r4 = r0.x
            int r5 = r0.y
            if (r1 == 0) goto L49
            int r0 = r1.f6748
            r7 = r0
            goto L4a
        L49:
            r7 = r11
        L4a:
            if (r2 == 0) goto L50
            int r0 = r2.f6748
            r8 = r0
            goto L51
        L50:
            r8 = r11
        L51:
            if (r3 == 0) goto L57
            int r0 = r3.f6748
            r9 = r0
            goto L58
        L57:
            r9 = r11
        L58:
            if (r12 == 0) goto L5c
            int r11 = r12.f6748
        L5c:
            r10 = r11
            r6 = 0
            ᛴᲀᛸᛷ r11 = defpackage.C0750.m1666(r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    private static java.util.List<android.graphics.Rect> m3560(android.graphics.Rect[][] r6, int r7) {
            r0 = 0
            r1 = 1
        L2:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L2b
            r2 = r7 & r1
            if (r2 != 0) goto Lb
            goto L28
        Lb:
            int r2 = defpackage.AbstractC0069.m513(r1)
            r2 = r6[r2]
            if (r2 != 0) goto L14
            goto L28
        L14:
            if (r0 != 0) goto L18
            r0 = r2
            goto L28
        L18:
            int r3 = r0.length
            int r4 = r2.length
            int r3 = r3 + r4
            android.graphics.Rect[] r3 = new android.graphics.Rect[r3]
            int r4 = r0.length
            r5 = 0
            java.lang.System.arraycopy(r0, r5, r3, r5, r4)
            int r0 = r0.length
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r5, r3, r0, r4)
            r0 = r3
        L28:
            int r1 = r1 << 1
            goto L2
        L2b:
            if (r0 != 0) goto L30
            java.util.List r6 = java.util.Collections.EMPTY_LIST
            return r6
        L30:
            java.util.List r6 = java.util.Arrays.asList(r0)
            return r6
    }

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public static boolean m3561(int r0, int r1) {
            r0 = r0 & 6
            r1 = r1 & 6
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    private android.graphics.Rect[] m3562(defpackage.C1032 r6) {
            r5 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r0 = r6.f4597
            int r1 = r6.f4595
            int r2 = r6.f4596
            int r3 = r6.f4598
            r4 = 0
            if (r0 == 0) goto L1a
            android.graphics.Rect r0 = new android.graphics.Rect
            int r6 = r6.f4597
            r0.<init>(r4, r4, r6, r4)
            r5.add(r0)
        L1a:
            if (r3 == 0) goto L24
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r4, r4, r4, r3)
            r5.add(r6)
        L24:
            if (r2 == 0) goto L30
            android.graphics.Rect r6 = new android.graphics.Rect
            int r0 = 0 - r2
            r6.<init>(r0, r4, r4, r4)
            r5.add(r6)
        L30:
            if (r1 == 0) goto L3c
            android.graphics.Rect r6 = new android.graphics.Rect
            int r0 = 0 - r1
            r6.<init>(r4, r0, r4, r4)
            r5.add(r6)
        L3c:
            int r6 = r5.size()
            android.graphics.Rect[] r6 = new android.graphics.Rect[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            android.graphics.Rect[] r5 = (android.graphics.Rect[]) r5
            return r5
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public abstract defpackage.C1032 mo357(int r1);

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public void mo358(android.view.View r1) {
            r0 = this;
            r0.m3559(r1)
            return
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public void mo1115() {
            r4 = this;
            r0 = 1
        L1:
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L28
            int r1 = defpackage.AbstractC0069.m513(r0)
            android.graphics.Rect[][] r2 = r4.f9130
            ᛶᛳᛴᛲ r3 = r4.mo357(r0)
            android.graphics.Rect[] r3 = r4.m3562(r3)
            r2[r1] = r3
            r2 = 8
            if (r0 == r2) goto L25
            android.graphics.Rect[][] r2 = r4.f9131
            ᛶᛳᛴᛲ r3 = r4.mo359(r0)
            android.graphics.Rect[] r3 = r4.m3562(r3)
            r2[r1] = r3
        L25:
            int r0 = r0 << 1
            goto L1
        L28:
            return
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛲᲈᛷᛵ */
    public void mo1117(android.graphics.Rect[][] r1) {
            r0 = this;
            java.lang.Object r1 = r1.clone()
            android.graphics.Rect[][] r1 = (android.graphics.Rect[][]) r1
            r0.f9130 = r1
            return
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ */
    public void mo1118(int r1) {
            r0 = this;
            r0.f9127 = r1
            return
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public boolean mo1119() {
            r0 = this;
            android.view.WindowInsets r0 = r0.f9129
            boolean r0 = r0.isRound()
            return r0
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public void mo1120(defpackage.C2300 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public java.util.List<android.graphics.Rect> mo1121(int r1) {
            r0 = this;
            android.graphics.Rect[][] r0 = r0.f9130
            java.util.List r0 = m3560(r0, r1)
            return r0
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛷᛷᲀᛴ */
    public void mo1124(android.graphics.Rect[][] r1) {
            r0 = this;
            java.lang.Object r1 = r1.clone()
            android.graphics.Rect[][] r1 = (android.graphics.Rect[][]) r1
            r0.f9131 = r1
            return
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final defpackage.C1032 mo1126() {
            r4 = this;
            ᛶᛳᛴᛲ r0 = r4.f9128
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.f9129
            int r1 = r0.getSystemWindowInsetLeft()
            int r2 = r0.getSystemWindowInsetTop()
            int r3 = r0.getSystemWindowInsetRight()
            int r0 = r0.getSystemWindowInsetBottom()
            ᛶᛳᛴᛲ r0 = defpackage.C1032.m1985(r1, r2, r3, r0)
            r4.f9128 = r0
        L1c:
            return r0
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ */
    public void mo1128(defpackage.C0750 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ */
    public void mo1129(defpackage.C1032[] r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ */
    public abstract defpackage.C1032 mo359(int r1);

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public java.util.List<android.graphics.Rect> mo1131(int r1) {
            r0 = this;
            android.graphics.Rect[][] r0 = r0.f9131
            java.util.List r0 = m3560(r0, r1)
            return r0
    }
}
