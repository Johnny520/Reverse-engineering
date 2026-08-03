package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4383 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.view.ViewParent f13930;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.view.ViewParent f13931;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.view.View f13932;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f13933;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int[] f13934;

    public C4383(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.f13932 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m17231(float r3, float r4, boolean r5) {
            r2 = this;
            boolean r0 = r2.m17243()
            r1 = 0
            if (r0 == 0) goto L14
            android.view.ViewParent r0 = r2.m17239(r1)
            if (r0 == 0) goto L14
            android.view.View r1 = r2.f13932
            boolean r3 = Yue.C6901.m26694(r0, r1, r3, r4, r5)
            return r3
        L14:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m17232(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.m17243()
            r1 = 0
            if (r0 == 0) goto L14
            android.view.ViewParent r0 = r2.m17239(r1)
            if (r0 == 0) goto L14
            android.view.View r1 = r2.f13932
            boolean r3 = Yue.C6901.m26695(r0, r1, r3, r4)
            return r3
        L14:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m17233(int r7, int r8, @Yue.InterfaceC4544 int[] r9, @Yue.InterfaceC4544 int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.m17234(r1, r2, r3, r4, r5)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m17234(int r11, int r12, @Yue.InterfaceC4544 int[] r13, @Yue.InterfaceC4544 int[] r14, int r15) {
            r10 = this;
            boolean r0 = r10.m17243()
            r1 = 0
            if (r0 == 0) goto L58
            android.view.ViewParent r2 = r10.m17239(r15)
            if (r2 != 0) goto Le
            return r1
        Le:
            r0 = 1
            if (r11 != 0) goto L1b
            if (r12 == 0) goto L14
            goto L1b
        L14:
            if (r14 == 0) goto L58
            r14[r1] = r1
            r14[r0] = r1
            goto L58
        L1b:
            if (r14 == 0) goto L29
            android.view.View r3 = r10.f13932
            r3.getLocationInWindow(r14)
            r3 = r14[r1]
            r4 = r14[r0]
            r8 = r3
            r9 = r4
            goto L2b
        L29:
            r8 = r1
            r9 = r8
        L2b:
            if (r13 != 0) goto L31
            int[] r13 = r10.m17240()
        L31:
            r13[r1] = r1
            r13[r0] = r1
            android.view.View r3 = r10.f13932
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r15
            Yue.C6901.m26697(r2, r3, r4, r5, r6, r7)
            if (r14 == 0) goto L4f
            android.view.View r11 = r10.f13932
            r11.getLocationInWindow(r14)
            r11 = r14[r1]
            int r11 = r11 - r8
            r14[r1] = r11
            r11 = r14[r0]
            int r11 = r11 - r9
            r14[r0] = r11
        L4f:
            r11 = r13[r1]
            if (r11 != 0) goto L57
            r11 = r13[r0]
            if (r11 == 0) goto L58
        L57:
            r1 = r0
        L58:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m17235(int r1, int r2, int r3, int r4, @Yue.InterfaceC4544 int[] r5, int r6, @Yue.InterfaceC4544 int[] r7) {
            r0 = this;
            r0.m17238(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m17236(int r9, int r10, int r11, int r12, @Yue.InterfaceC4544 int[] r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r9 = r0.m17238(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m17237(int r9, int r10, int r11, int r12, @Yue.InterfaceC4544 int[] r13, int r14) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            boolean r9 = r0.m17238(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m17238(int r16, int r17, int r18, int r19, @Yue.InterfaceC4544 int[] r20, int r21, @Yue.InterfaceC4544 int[] r22) {
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r15.m17243()
            r3 = 0
            if (r2 == 0) goto L63
            r2 = r21
            android.view.ViewParent r4 = r15.m17239(r2)
            if (r4 != 0) goto L13
            return r3
        L13:
            r12 = 1
            if (r16 != 0) goto L24
            if (r17 != 0) goto L24
            if (r18 != 0) goto L24
            if (r19 == 0) goto L1d
            goto L24
        L1d:
            if (r1 == 0) goto L63
            r1[r3] = r3
            r1[r12] = r3
            goto L63
        L24:
            if (r1 == 0) goto L32
            android.view.View r5 = r0.f13932
            r5.getLocationInWindow(r1)
            r5 = r1[r3]
            r6 = r1[r12]
            r13 = r5
            r14 = r6
            goto L34
        L32:
            r13 = r3
            r14 = r13
        L34:
            if (r22 != 0) goto L40
            int[] r5 = r15.m17240()
            r5[r3] = r3
            r5[r12] = r3
            r11 = r5
            goto L42
        L40:
            r11 = r22
        L42:
            android.view.View r5 = r0.f13932
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r21
            Yue.C6901.m26700(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r1 == 0) goto L62
            android.view.View r2 = r0.f13932
            r2.getLocationInWindow(r1)
            r2 = r1[r3]
            int r2 = r2 - r13
            r1[r3] = r2
            r2 = r1[r12]
            int r2 = r2 - r14
            r1[r12] = r2
        L62:
            return r12
        L63:
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final android.view.ViewParent m17239(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r2 = 0
            return r2
        L7:
            android.view.ViewParent r2 = r1.f13931
            return r2
        La:
            android.view.ViewParent r2 = r1.f13930
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int[] m17240() {
            r1 = this;
            int[] r0 = r1.f13934
            if (r0 != 0) goto L9
            r0 = 2
            int[] r0 = new int[r0]
            r1.f13934 = r0
        L9:
            int[] r0 = r1.f13934
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m17241() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.m17242(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m17242(int r1) {
            r0 = this;
            android.view.ViewParent r1 = r0.m17239(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m17243() {
            r1 = this;
            boolean r0 = r1.f13933
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m17244() {
            r1 = this;
            android.view.View r0 = r1.f13932
            Yue.C6794.m26283(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m17245(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            android.view.View r1 = r0.f13932
            Yue.C6794.m26283(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m17246(boolean r2) {
            r1 = this;
            boolean r0 = r1.f13933
            if (r0 == 0) goto L9
            android.view.View r0 = r1.f13932
            Yue.C6794.m26283(r0)
        L9:
            r1.f13933 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m17247(int r2, android.view.ViewParent r3) {
            r1 = this;
            if (r2 == 0) goto L9
            r0 = 1
            if (r2 == r0) goto L6
            goto Lb
        L6:
            r1.f13931 = r3
            goto Lb
        L9:
            r1.f13930 = r3
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m17248(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.m17249(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m17249(int r5, int r6) {
            r4 = this;
            boolean r0 = r4.m17242(r6)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r4.m17243()
            if (r0 == 0) goto L35
            android.view.View r0 = r4.f13932
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r2 = r4.f13932
        L16:
            if (r0 == 0) goto L35
            android.view.View r3 = r4.f13932
            boolean r3 = Yue.C6901.m26704(r0, r2, r3, r5, r6)
            if (r3 == 0) goto L29
            r4.m17247(r6, r0)
            android.view.View r3 = r4.f13932
            Yue.C6901.m26702(r0, r2, r3, r5, r6)
            return r1
        L29:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L30
            r2 = r0
            android.view.View r2 = (android.view.View) r2
        L30:
            android.view.ViewParent r0 = r0.getParent()
            goto L16
        L35:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m17250() {
            r1 = this;
            r0 = 0
            r1.m17251(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m17251(int r3) {
            r2 = this;
            android.view.ViewParent r0 = r2.m17239(r3)
            if (r0 == 0) goto Lf
            android.view.View r1 = r2.f13932
            Yue.C6901.m26706(r0, r1, r3)
            r0 = 0
            r2.m17247(r3, r0)
        Lf:
            return
    }
}
