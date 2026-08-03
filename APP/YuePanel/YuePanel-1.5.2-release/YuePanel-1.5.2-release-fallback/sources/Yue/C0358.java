package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0358 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final android.view.ViewGroup.MarginLayoutParams f854 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public androidx.recyclerview.widget.LinearLayoutManager f855;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦ$ۥ, reason: contains not printable characters */
    public class C0359 implements java.util.Comparator<int[]> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0358 f856;

        public C0359(Yue.C0358 r1) {
                r0 = this;
                r0.f856 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(int[] r1, int[] r2) {
                r0 = this;
                int[] r1 = (int[]) r1
                int[] r2 = (int[]) r2
                int r1 = r0.m1444(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m1444(int[] r2, int[] r3) {
                r1 = this;
                r0 = 0
                r2 = r2[r0]
                r3 = r3[r0]
                int r2 = r2 - r3
                return r2
        }
    }

    static {
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            Yue.C0358.f854 = r0
            r1 = 0
            r0.setMargins(r1, r1, r1, r1)
            return
    }

    public C0358(@Yue.InterfaceC4410 androidx.recyclerview.widget.LinearLayoutManager r1) {
            r0 = this;
            r0.<init>()
            r0.f855 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m1440(android.view.View r5) {
            boolean r0 = r5 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L2a
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.animation.LayoutTransition r0 = r5.getLayoutTransition()
            r2 = 1
            if (r0 == 0) goto L15
            boolean r0 = r0.isChangingLayout()
            if (r0 == 0) goto L15
            return r2
        L15:
            int r0 = r5.getChildCount()
            r3 = r1
        L1a:
            if (r3 >= r0) goto L2a
            android.view.View r4 = r5.getChildAt(r3)
            boolean r4 = m1440(r4)
            if (r4 == 0) goto L27
            return r2
        L27:
            int r3 = r3 + 1
            goto L1a
        L2a:
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m1441() {
            r11 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r11.f855
            int r0 = r0.getChildCount()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r11.f855
            int r2 = r2.getOrientation()
            r3 = 0
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r3
        L16:
            r4 = 2
            int[] r5 = new int[r4]
            r5[r1] = r4
            r5[r3] = r0
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
            int[][] r4 = (int[][]) r4
            r5 = r3
        L26:
            if (r5 >= r0) goto L72
            androidx.recyclerview.widget.LinearLayoutManager r6 = r11.f855
            android.view.View r6 = r6.getChildAt(r5)
            if (r6 == 0) goto L6a
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L3b
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L3d
        L3b:
            android.view.ViewGroup$MarginLayoutParams r7 = Yue.C0358.f854
        L3d:
            r8 = r4[r5]
            if (r2 == 0) goto L49
            int r9 = r6.getLeft()
            int r10 = r7.leftMargin
        L47:
            int r9 = r9 - r10
            goto L50
        L49:
            int r9 = r6.getTop()
            int r10 = r7.topMargin
            goto L47
        L50:
            r8[r3] = r9
            r8 = r4[r5]
            if (r2 == 0) goto L5e
            int r6 = r6.getRight()
            int r7 = r7.rightMargin
        L5c:
            int r6 = r6 + r7
            goto L65
        L5e:
            int r6 = r6.getBottom()
            int r7 = r7.bottomMargin
            goto L5c
        L65:
            r8[r1] = r6
            int r5 = r5 + 1
            goto L26
        L6a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L72:
            Yue.ۥ۟۠ۦ$ۥ r2 = new Yue.ۥ۟۠ۦ$ۥ
            r2.<init>(r11)
            java.util.Arrays.sort(r4, r2)
            r2 = r1
        L7b:
            if (r2 >= r0) goto L8d
            int r5 = r2 + (-1)
            r5 = r4[r5]
            r5 = r5[r1]
            r6 = r4[r2]
            r6 = r6[r3]
            if (r5 == r6) goto L8a
            return r3
        L8a:
            int r2 = r2 + 1
            goto L7b
        L8d:
            r2 = r4[r3]
            r5 = r2[r1]
            r2 = r2[r3]
            int r5 = r5 - r2
            if (r2 > 0) goto L9f
            int r0 = r0 - r1
            r0 = r4[r0]
            r0 = r0[r1]
            if (r0 >= r5) goto L9e
            goto L9f
        L9e:
            return r1
        L9f:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m1442() {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r4.f855
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1b
            androidx.recyclerview.widget.LinearLayoutManager r3 = r4.f855
            android.view.View r3 = r3.getChildAt(r2)
            boolean r3 = m1440(r3)
            if (r3 == 0) goto L18
            r0 = 1
            return r0
        L18:
            int r2 = r2 + 1
            goto L8
        L1b:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m1443() {
            r2 = this;
            boolean r0 = r2.m1441()
            r1 = 1
            if (r0 == 0) goto Lf
            androidx.recyclerview.widget.LinearLayoutManager r0 = r2.f855
            int r0 = r0.getChildCount()
            if (r0 > r1) goto L16
        Lf:
            boolean r0 = r2.m1442()
            if (r0 == 0) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }
}
