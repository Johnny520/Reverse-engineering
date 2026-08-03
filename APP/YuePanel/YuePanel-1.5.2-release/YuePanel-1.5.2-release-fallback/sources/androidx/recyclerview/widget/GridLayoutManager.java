package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean f29532 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f29533 = "GridLayoutManager";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f29534 = -1;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f29535;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f29536;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int[] f29537;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.view.View[] f29538;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.util.SparseIntArray f29539;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final android.util.SparseIntArray f29540;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public androidx.recyclerview.widget.GridLayoutManager.AbstractC7666 f29541;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final android.graphics.Rect f29542;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f29543;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$ۥ, reason: contains not printable characters */
    public static final class C7664 extends androidx.recyclerview.widget.GridLayoutManager.AbstractC7666 {
        public C7664() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC7666
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int mo29602(int r1, int r2) {
                r0 = this;
                int r1 = r1 % r2
                return r1
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC7666
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int mo29603(int r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$ۥ۟, reason: contains not printable characters */
    public static class C7665 extends androidx.recyclerview.widget.RecyclerView.C7696 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f29544 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29545;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29546;

        public C7665(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.f29545 = r1
                r1 = 0
                r0.f29546 = r1
                return
        }

        public C7665(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.f29545 = r1
                r1 = 0
                r0.f29546 = r1
                return
        }

        public C7665(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.f29545 = r1
                r1 = 0
                r0.f29546 = r1
                return
        }

        public C7665(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.f29545 = r1
                r1 = 0
                r0.f29546 = r1
                return
        }

        public C7665(androidx.recyclerview.widget.RecyclerView.C7696 r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.f29545 = r1
                r1 = 0
                r0.f29546 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int m29604() {
                r1 = this;
                int r0 = r1.f29545
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int m29605() {
                r1 = this;
                int r0 = r1.f29546
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7666 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.util.SparseIntArray f29547;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.util.SparseIntArray f29548;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f29549;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29550;

        public AbstractC7666() {
                r1 = this;
                r1.<init>()
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.f29547 = r0
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.f29548 = r0
                r0 = 0
                r1.f29549 = r0
                r1.f29550 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m29606(android.util.SparseIntArray r4, int r5) {
                int r0 = r4.size()
                int r0 = r0 + (-1)
                r1 = 0
            L7:
                if (r1 > r0) goto L1b
                int r2 = r1 + r0
                int r2 = r2 >>> 1
                int r3 = r4.keyAt(r2)
                if (r3 >= r5) goto L17
                int r2 = r2 + 1
                r1 = r2
                goto L7
            L17:
                int r2 = r2 + (-1)
                r0 = r2
                goto L7
            L1b:
                int r1 = r1 + (-1)
                if (r1 < 0) goto L2a
                int r5 = r4.size()
                if (r1 >= r5) goto L2a
                int r4 = r4.keyAt(r1)
                return r4
            L2a:
                r4 = -1
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int m29607(int r3, int r4) {
                r2 = this;
                boolean r0 = r2.f29550
                if (r0 != 0) goto L9
                int r3 = r2.m29609(r3, r4)
                return r3
            L9:
                android.util.SparseIntArray r0 = r2.f29548
                r1 = -1
                int r0 = r0.get(r3, r1)
                if (r0 == r1) goto L13
                return r0
            L13:
                int r4 = r2.m29609(r3, r4)
                android.util.SparseIntArray r0 = r2.f29548
                r0.put(r3, r4)
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m29608(int r3, int r4) {
                r2 = this;
                boolean r0 = r2.f29549
                if (r0 != 0) goto L9
                int r3 = r2.mo29602(r3, r4)
                return r3
            L9:
                android.util.SparseIntArray r0 = r2.f29547
                r1 = -1
                int r0 = r0.get(r3, r1)
                if (r0 == r1) goto L13
                return r0
            L13:
                int r4 = r2.mo29602(r3, r4)
                android.util.SparseIntArray r0 = r2.f29547
                r0.put(r3, r4)
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m29609(int r7, int r8) {
                r6 = this;
                boolean r0 = r6.f29550
                r1 = 0
                if (r0 == 0) goto L25
                android.util.SparseIntArray r0 = r6.f29548
                int r0 = m29606(r0, r7)
                r2 = -1
                if (r0 == r2) goto L25
                android.util.SparseIntArray r2 = r6.f29548
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.m29608(r0, r8)
                int r0 = r6.mo29603(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L28
                int r2 = r2 + 1
                r4 = r1
                goto L28
            L25:
                r2 = r1
                r3 = r2
                r4 = r3
            L28:
                int r0 = r6.mo29603(r7)
            L2c:
                if (r3 >= r7) goto L41
                int r5 = r6.mo29603(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L39
                int r2 = r2 + 1
                r4 = r1
                goto L3e
            L39:
                if (r4 <= r8) goto L3e
                int r2 = r2 + 1
                r4 = r5
            L3e:
                int r3 = r3 + 1
                goto L2c
            L41:
                int r4 = r4 + r0
                if (r4 <= r8) goto L46
                int r2 = r2 + 1
            L46:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public int mo29602(int r6, int r7) {
                r5 = this;
                int r0 = r5.mo29603(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f29549
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f29547
                int r2 = m29606(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f29547
                int r3 = r3.get(r2)
                int r4 = r5.mo29603(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.mo29603(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public abstract int mo29603(int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m29610() {
                r1 = this;
                android.util.SparseIntArray r0 = r1.f29548
                r0.clear()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m29611() {
                r1 = this;
                android.util.SparseIntArray r0 = r1.f29547
                r0.clear()
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean m29612() {
                r1 = this;
                boolean r0 = r1.f29550
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean m29613() {
                r1 = this;
                boolean r0 = r1.f29549
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m29614(boolean r2) {
                r1 = this;
                if (r2 != 0) goto L7
                android.util.SparseIntArray r0 = r1.f29548
                r0.clear()
            L7:
                r1.f29550 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m29615(boolean r2) {
                r1 = this;
                if (r2 != 0) goto L7
                android.util.SparseIntArray r0 = r1.f29548
                r0.clear()
            L7:
                r1.f29549 = r2
                return
        }
    }

    public GridLayoutManager(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f29535 = r1
            r1 = -1
            r0.f29536 = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.f29539 = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.f29540 = r1
            androidx.recyclerview.widget.GridLayoutManager$ۥ r1 = new androidx.recyclerview.widget.GridLayoutManager$ۥ
            r1.<init>()
            r0.f29541 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f29542 = r1
            r0.m29598(r2)
            return
    }

    public GridLayoutManager(android.content.Context r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r1 = 0
            r0.f29535 = r1
            r1 = -1
            r0.f29536 = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.f29539 = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.f29540 = r1
            androidx.recyclerview.widget.GridLayoutManager$ۥ r1 = new androidx.recyclerview.widget.GridLayoutManager$ۥ
            r1.<init>()
            r0.f29541 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f29542 = r1
            r0.m29598(r2)
            return
    }

    public GridLayoutManager(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            r0 = 0
            r1.f29535 = r0
            r0 = -1
            r1.f29536 = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.f29539 = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.f29540 = r0
            androidx.recyclerview.widget.GridLayoutManager$ۥ r0 = new androidx.recyclerview.widget.GridLayoutManager$ۥ
            r0.<init>()
            r1.f29541 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f29542 = r0
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟۟۟ r2 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.getProperties(r2, r3, r4, r5)
            int r2 = r2.f29612
            r1.m29598(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static int[] m29579(int[] r5, int r6, int r7) {
            r0 = 1
            if (r5 == 0) goto Le
            int r1 = r5.length
            int r2 = r6 + 1
            if (r1 != r2) goto Le
            int r1 = r5.length
            int r1 = r1 - r0
            r1 = r5[r1]
            if (r1 == r7) goto L12
        Le:
            int r5 = r6 + 1
            int[] r5 = new int[r5]
        L12:
            r1 = 0
            r5[r1] = r1
            int r2 = r7 / r6
            int r7 = r7 % r6
            r3 = r1
        L19:
            if (r0 > r6) goto L2d
            int r1 = r1 + r7
            if (r1 <= 0) goto L26
            int r4 = r6 - r1
            if (r4 >= r7) goto L26
            int r4 = r2 + 1
            int r1 = r1 - r6
            goto L27
        L26:
            r4 = r2
        L27:
            int r3 = r3 + r4
            r5[r0] = r3
            int r0 = r0 + 1
            goto L19
        L2d:
            return r5
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.C7696 r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager.C7665
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(androidx.recyclerview.widget.RecyclerView.C7713 r6, androidx.recyclerview.widget.LinearLayoutManager.C7669 r7, androidx.recyclerview.widget.RecyclerView.AbstractC7691.InterfaceC7694 r8) {
            r5 = this;
            int r0 = r5.f29536
            r1 = 0
            r2 = r1
        L4:
            int r3 = r5.f29536
            if (r2 >= r3) goto L2c
            boolean r3 = r7.m29652(r6)
            if (r3 == 0) goto L2c
            if (r0 <= 0) goto L2c
            int r3 = r7.f29570
            int r4 = r7.f29573
            int r4 = java.lang.Math.max(r1, r4)
            r8.mo29770(r3, r4)
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r4 = r5.f29541
            int r3 = r4.mo29603(r3)
            int r0 = r0 - r3
            int r3 = r7.f29570
            int r4 = r7.f29571
            int r3 = r3 + r4
            r7.f29570 = r3
            int r2 = r2 + 1
            goto L4
        L2c:
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.C7713 r2) {
            r1 = this;
            boolean r0 = r1.f29543
            if (r0 == 0) goto L9
            int r2 = r1.m29584(r2)
            return r2
        L9:
            int r2 = super.computeHorizontalScrollOffset(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.C7713 r2) {
            r1 = this;
            boolean r0 = r1.f29543
            if (r0 == 0) goto L9
            int r2 = r1.m29585(r2)
            return r2
        L9:
            int r2 = super.computeHorizontalScrollRange(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.C7713 r2) {
            r1 = this;
            boolean r0 = r1.f29543
            if (r0 == 0) goto L9
            int r2 = r1.m29584(r2)
            return r2
        L9:
            int r2 = super.computeVerticalScrollOffset(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.C7713 r2) {
            r1 = this;
            boolean r0 = r1.f29543
            if (r0 == 0) goto L9
            int r2 = r1.m29585(r2)
            return r2
        L9:
            int r2 = super.computeVerticalScrollRange(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public android.view.View findReferenceChild(androidx.recyclerview.widget.RecyclerView.C7704 r8, androidx.recyclerview.widget.RecyclerView.C7713 r9, int r10, int r11, int r12) {
            r7 = this;
            r7.ensureLayoutState()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r7.mOrientationHelper
            int r0 = r0.mo30252()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r7.mOrientationHelper
            int r1 = r1.mo30247()
            if (r11 <= r10) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = -1
        L14:
            r3 = 0
            r4 = r3
        L16:
            if (r10 == r11) goto L52
            android.view.View r5 = r7.getChildAt(r10)
            int r6 = r7.getPosition(r5)
            if (r6 < 0) goto L50
            if (r6 >= r12) goto L50
            int r6 = r7.m29591(r8, r9, r6)
            if (r6 == 0) goto L2b
            goto L50
        L2b:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r6 = (androidx.recyclerview.widget.RecyclerView.C7696) r6
            boolean r6 = r6.m29775()
            if (r6 == 0) goto L3b
            if (r4 != 0) goto L50
            r4 = r5
            goto L50
        L3b:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r7.mOrientationHelper
            int r6 = r6.mo30245(r5)
            if (r6 >= r1) goto L4d
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r7.mOrientationHelper
            int r6 = r6.mo30242(r5)
            if (r6 >= r0) goto L4c
            goto L4d
        L4c:
            return r5
        L4d:
            if (r3 != 0) goto L50
            r3 = r5
        L50:
            int r10 = r10 + r2
            goto L16
        L52:
            if (r3 == 0) goto L55
            goto L56
        L55:
            r3 = r4
        L56:
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public androidx.recyclerview.widget.RecyclerView.C7696 generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = -1
            r2 = -2
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r0 = new androidx.recyclerview.widget.GridLayoutManager$ۥ۟
            r0.<init>(r2, r1)
            return r0
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r0 = new androidx.recyclerview.widget.GridLayoutManager$ۥ۟
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public androidx.recyclerview.widget.RecyclerView.C7696 generateLayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r0 = new androidx.recyclerview.widget.GridLayoutManager$ۥ۟
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public androidx.recyclerview.widget.RecyclerView.C7696 generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r0 = new androidx.recyclerview.widget.GridLayoutManager$ۥ۟
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r0 = new androidx.recyclerview.widget.GridLayoutManager$ۥ۟
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int getColumnCountForAccessibility(androidx.recyclerview.widget.RecyclerView.C7704 r3, androidx.recyclerview.widget.RecyclerView.C7713 r4) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L8
            int r3 = r2.f29536
            return r3
        L8:
            int r0 = r4.m29858()
            if (r0 >= r1) goto L10
            r3 = 0
            return r3
        L10:
            int r0 = r4.m29858()
            int r0 = r0 - r1
            int r3 = r2.m29590(r3, r4, r0)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int getRowCountForAccessibility(androidx.recyclerview.widget.RecyclerView.C7704 r3, androidx.recyclerview.widget.RecyclerView.C7713 r4) {
            r2 = this;
            int r0 = r2.mOrientation
            if (r0 != 0) goto L7
            int r3 = r2.f29536
            return r3
        L7:
            int r0 = r4.m29858()
            r1 = 1
            if (r0 >= r1) goto L10
            r3 = 0
            return r3
        L10:
            int r0 = r4.m29858()
            int r0 = r0 - r1
            int r3 = r2.m29590(r3, r4, r0)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void layoutChunk(androidx.recyclerview.widget.RecyclerView.C7704 r18, androidx.recyclerview.widget.RecyclerView.C7713 r19, androidx.recyclerview.widget.LinearLayoutManager.C7669 r20, androidx.recyclerview.widget.LinearLayoutManager.C7668 r21) {
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r6.mOrientationHelper
            int r3 = r3.mo30251()
            r8 = 1
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 == r5) goto L18
            r9 = r8
            goto L19
        L18:
            r9 = r4
        L19:
            int r10 = r17.getChildCount()
            if (r10 <= 0) goto L26
            int[] r10 = r6.f29537
            int r11 = r6.f29536
            r10 = r10[r11]
            goto L27
        L26:
            r10 = r4
        L27:
            if (r9 == 0) goto L2c
            r17.m29601()
        L2c:
            int r11 = r2.f29571
            if (r11 != r8) goto L32
            r11 = r8
            goto L33
        L32:
            r11 = r4
        L33:
            int r12 = r6.f29536
            if (r11 != 0) goto L44
            int r12 = r2.f29570
            int r12 = r6.m29591(r0, r1, r12)
            int r13 = r2.f29570
            int r13 = r6.m29592(r0, r1, r13)
            int r12 = r12 + r13
        L44:
            r13 = r4
        L45:
            int r14 = r6.f29536
            if (r13 >= r14) goto L9d
            boolean r14 = r2.m29652(r1)
            if (r14 == 0) goto L9d
            if (r12 <= 0) goto L9d
            int r14 = r2.f29570
            int r15 = r6.m29592(r0, r1, r14)
            int r5 = r6.f29536
            if (r15 > r5) goto L6f
            int r12 = r12 - r15
            if (r12 >= 0) goto L5f
            goto L9d
        L5f:
            android.view.View r5 = r2.m29654(r0)
            if (r5 != 0) goto L66
            goto L9d
        L66:
            android.view.View[] r14 = r6.f29538
            r14[r13] = r5
            int r13 = r13 + 1
            r5 = 1073741824(0x40000000, float:2.0)
            goto L45
        L6f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f29536
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9d:
            if (r13 != 0) goto La2
            r7.f29557 = r8
            return
        La2:
            r6.m29580(r0, r1, r13, r11)
            r0 = 0
            r1 = r4
            r5 = r1
        La8:
            if (r1 >= r13) goto Lf2
            android.view.View[] r12 = r6.f29538
            r12 = r12[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r14 = r2.f29578
            if (r14 != 0) goto Lbc
            if (r11 == 0) goto Lb8
            r6.addView(r12)
            goto Lc5
        Lb8:
            r6.addView(r12, r4)
            goto Lc5
        Lbc:
            if (r11 == 0) goto Lc2
            r6.addDisappearingView(r12)
            goto Lc5
        Lc2:
            r6.addDisappearingView(r12, r4)
        Lc5:
            android.graphics.Rect r14 = r6.f29542
            r6.calculateItemDecorationsForChild(r12, r14)
            r6.m29596(r12, r3, r4)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r14 = r6.mOrientationHelper
            int r14 = r14.mo30243(r12)
            if (r14 <= r5) goto Ld6
            r5 = r14
        Ld6:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r14 = (androidx.recyclerview.widget.GridLayoutManager.C7665) r14
            androidx.recyclerview.widget.ۥ۟۟۠۠ r15 = r6.mOrientationHelper
            int r12 = r15.mo30244(r12)
            float r12 = (float) r12
            r15 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 * r15
            int r14 = r14.f29546
            float r14 = (float) r14
            float r12 = r12 / r14
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 <= 0) goto Lef
            r0 = r12
        Lef:
            int r1 = r1 + 1
            goto La8
        Lf2:
            if (r9 == 0) goto L110
            r6.m29594(r0, r10)
            r0 = r4
            r5 = r0
        Lf9:
            if (r0 >= r13) goto L110
            android.view.View[] r1 = r6.f29538
            r1 = r1[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r6.m29596(r1, r3, r8)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r6.mOrientationHelper
            int r1 = r3.mo30243(r1)
            if (r1 <= r5) goto L10d
            r5 = r1
        L10d:
            int r0 = r0 + 1
            goto Lf9
        L110:
            r0 = r4
        L111:
            if (r0 >= r13) goto L170
            android.view.View[] r1 = r6.f29538
            r1 = r1[r0]
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r6.mOrientationHelper
            int r3 = r3.mo30243(r1)
            if (r3 == r5) goto L16b
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r3 = (androidx.recyclerview.widget.GridLayoutManager.C7665) r3
            android.graphics.Rect r9 = r3.f29616
            int r10 = r9.top
            int r11 = r9.bottom
            int r10 = r10 + r11
            int r11 = r3.topMargin
            int r10 = r10 + r11
            int r11 = r3.bottomMargin
            int r10 = r10 + r11
            int r11 = r9.left
            int r9 = r9.right
            int r11 = r11 + r9
            int r9 = r3.leftMargin
            int r11 = r11 + r9
            int r9 = r3.rightMargin
            int r11 = r11 + r9
            int r9 = r3.f29545
            int r12 = r3.f29546
            int r9 = r6.m29588(r9, r12)
            int r12 = r6.mOrientation
            if (r12 != r8) goto L158
            int r3 = r3.width
            r12 = 1073741824(0x40000000, float:2.0)
            int r3 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.getChildMeasureSpec(r9, r12, r11, r3, r4)
            int r9 = r5 - r10
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r12)
            goto L167
        L158:
            r12 = 1073741824(0x40000000, float:2.0)
            int r11 = r5 - r11
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            int r3 = r3.height
            int r9 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.getChildMeasureSpec(r9, r12, r10, r3, r4)
            r3 = r11
        L167:
            r6.m29597(r1, r3, r9, r8)
            goto L16d
        L16b:
            r12 = 1073741824(0x40000000, float:2.0)
        L16d:
            int r0 = r0 + 1
            goto L111
        L170:
            r7.f29556 = r5
            int r0 = r6.mOrientation
            r1 = -1
            if (r0 != r8) goto L188
            int r0 = r2.f29572
            if (r0 != r1) goto L183
            int r0 = r2.f29568
            int r1 = r0 - r5
        L17f:
            r2 = r1
            r1 = r4
            r3 = r1
            goto L19a
        L183:
            int r1 = r2.f29568
            int r0 = r1 + r5
            goto L17f
        L188:
            int r0 = r2.f29572
            if (r0 != r1) goto L195
            int r0 = r2.f29568
            int r1 = r0 - r5
        L190:
            r3 = r1
            r2 = r4
            r1 = r0
            r0 = r2
            goto L19a
        L195:
            int r1 = r2.f29568
            int r0 = r1 + r5
            goto L190
        L19a:
            r9 = r4
        L19b:
            if (r9 >= r13) goto L227
            android.view.View[] r4 = r6.f29538
            r10 = r4[r9]
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            r11 = r4
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r11 = (androidx.recyclerview.widget.GridLayoutManager.C7665) r11
            int r4 = r6.mOrientation
            if (r4 != r8) goto L1e6
            boolean r1 = r17.isLayoutRTL()
            if (r1 == 0) goto L1ce
            int r1 = r17.getPaddingLeft()
            int[] r3 = r6.f29537
            int r4 = r6.f29536
            int r5 = r11.f29545
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r6.mOrientationHelper
            int r3 = r3.mo30244(r10)
            int r3 = r1 - r3
            r12 = r0
            r14 = r1
            r15 = r2
        L1cb:
            r16 = r3
            goto L1fc
        L1ce:
            int r1 = r17.getPaddingLeft()
            int[] r3 = r6.f29537
            int r4 = r11.f29545
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r6.mOrientationHelper
            int r3 = r3.mo30244(r10)
            int r3 = r3 + r1
            r12 = r0
            r16 = r1
            r15 = r2
            r14 = r3
            goto L1fc
        L1e6:
            int r0 = r17.getPaddingTop()
            int[] r2 = r6.f29537
            int r4 = r11.f29545
            r2 = r2[r4]
            int r0 = r0 + r2
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r6.mOrientationHelper
            int r2 = r2.mo30244(r10)
            int r2 = r2 + r0
            r15 = r0
            r14 = r1
            r12 = r2
            goto L1cb
        L1fc:
            r0 = r17
            r1 = r10
            r2 = r16
            r3 = r15
            r4 = r14
            r5 = r12
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            boolean r0 = r11.m29775()
            if (r0 != 0) goto L213
            boolean r0 = r11.m29774()
            if (r0 == 0) goto L215
        L213:
            r7.f29558 = r8
        L215:
            boolean r0 = r7.f29559
            boolean r1 = r10.hasFocusable()
            r0 = r0 | r1
            r7.f29559 = r0
            int r9 = r9 + 1
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            goto L19b
        L227:
            android.view.View[] r0 = r6.f29538
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3, androidx.recyclerview.widget.LinearLayoutManager.C7667 r4, int r5) {
            r1 = this;
            super.onAnchorReady(r2, r3, r4, r5)
            r1.m29601()
            int r0 = r3.m29858()
            if (r0 <= 0) goto L15
            boolean r0 = r3.m29864()
            if (r0 != 0) goto L15
            r1.m29586(r2, r3, r4, r5)
        L15:
            r1.m29587()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C7704 r26, androidx.recyclerview.widget.RecyclerView.C7713 r27) {
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.findContainingItemView(r24)
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r5 = (androidx.recyclerview.widget.GridLayoutManager.C7665) r5
            int r6 = r5.f29545
            int r5 = r5.f29546
            int r5 = r5 + r6
            android.view.View r7 = super.onFocusSearchFailed(r24, r25, r26, r27)
            if (r7 != 0) goto L20
            return r4
        L20:
            r7 = r25
            int r7 = r0.convertFocusDirectionToLayoutDirection(r7)
            r9 = 1
            if (r7 != r9) goto L2b
            r7 = r9
            goto L2c
        L2b:
            r7 = 0
        L2c:
            boolean r10 = r0.mShouldReverseLayout
            r11 = -1
            if (r7 == r10) goto L39
            int r7 = r23.getChildCount()
            int r7 = r7 - r9
            r10 = r11
            r12 = r10
            goto L40
        L39:
            int r7 = r23.getChildCount()
            r10 = r7
            r12 = r9
            r7 = 0
        L40:
            int r13 = r0.mOrientation
            if (r13 != r9) goto L4c
            boolean r13 = r23.isLayoutRTL()
            if (r13 == 0) goto L4c
            r13 = r9
            goto L4d
        L4c:
            r13 = 0
        L4d:
            int r14 = r0.m29590(r1, r2, r7)
            r15 = r11
            r16 = r15
            r8 = 0
            r17 = 0
            r11 = r7
            r7 = r4
        L59:
            if (r11 == r10) goto L65
            int r9 = r0.m29590(r1, r2, r11)
            android.view.View r1 = r0.getChildAt(r11)
            if (r1 != r3) goto L69
        L65:
            r21 = r7
            goto L137
        L69:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L82
            if (r9 == r14) goto L82
            if (r4 == 0) goto L74
            goto L65
        L74:
            r18 = r3
            r21 = r7
        L78:
            r19 = r8
            r20 = r10
        L7c:
            r7 = r16
            r8 = r17
            goto L123
        L82:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r9 = (androidx.recyclerview.widget.GridLayoutManager.C7665) r9
            int r2 = r9.f29545
            r18 = r3
            int r3 = r9.f29546
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L9a
            if (r2 != r6) goto L9a
            if (r3 != r5) goto L9a
            return r1
        L9a:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto La2
            if (r4 == 0) goto Laa
        La2:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto Lb5
            if (r7 != 0) goto Lb5
        Laa:
            r21 = r7
        Lac:
            r19 = r8
            r20 = r10
            r7 = r16
            r8 = r17
            goto Lf3
        Lb5:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Ld4
            if (r7 <= r8) goto Lca
        Lc9:
            goto Lac
        Lca:
            if (r7 != r8) goto L78
            if (r2 <= r15) goto Ld0
            r7 = 1
            goto Ld1
        Ld0:
            r7 = 0
        Ld1:
            if (r13 != r7) goto L78
            goto Lc9
        Ld4:
            if (r4 != 0) goto L78
            r19 = r8
            r20 = r10
            r8 = 0
            r10 = 1
            boolean r22 = r0.isViewPartiallyVisible(r1, r8, r10)
            if (r22 == 0) goto L7c
            r8 = r17
            if (r7 <= r8) goto Le9
            r7 = r16
            goto Lf3
        Le9:
            if (r7 != r8) goto L121
            r7 = r16
            if (r2 <= r7) goto Lf0
            goto Lf1
        Lf0:
            r10 = 0
        Lf1:
            if (r13 != r10) goto L123
        Lf3:
            boolean r10 = r1.hasFocusable()
            if (r10 == 0) goto L10f
            int r4 = r9.f29545
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L12b
        L10f:
            int r7 = r9.f29545
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L12b
        L121:
            r7 = r16
        L123:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L12b:
            int r11 = r11 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r10 = r20
            r9 = 1
            goto L59
        L137:
            if (r4 == 0) goto L13a
            goto L13c
        L13a:
            r4 = r21
        L13c:
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.RecyclerView.C7704 r8, androidx.recyclerview.widget.RecyclerView.C7713 r9, android.view.View r10, Yue.C0140 r11) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager.C7665
            if (r1 != 0) goto Lc
            super.onInitializeAccessibilityNodeInfoForItem(r10, r11)
            return
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r0 = (androidx.recyclerview.widget.GridLayoutManager.C7665) r0
            int r10 = r0.m29772()
            int r8 = r7.m29590(r8, r9, r10)
            int r9 = r7.mOrientation
            if (r9 != 0) goto L2e
            int r1 = r0.m29604()
            int r2 = r0.m29605()
            r5 = 0
            r6 = 0
            r4 = 1
            r3 = r8
            Yue.ۥ۟۟ۥۧ$ۥ۟۟۟ۡ r8 = Yue.C0140.C0147.m830(r1, r2, r3, r4, r5, r6)
            r11.m736(r8)
            goto L41
        L2e:
            int r3 = r0.m29604()
            int r4 = r0.m29605()
            r5 = 0
            r6 = 0
            r2 = 1
            r1 = r8
            Yue.ۥ۟۟ۥۧ$ۥ۟۟۟ۡ r8 = Yue.C0140.C0147.m830(r1, r2, r3, r4, r5, r6)
            r11.m736(r8)
        L41:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            r1.m29611()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            r1.m29610()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            r1.m29611()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            r1.m29610()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, int r4) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            r1.m29611()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            r1.m29610()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            r1.m29611()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            r1.m29610()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            r1.m29611()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            r1.m29610()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3) {
            r1 = this;
            boolean r0 = r3.m29864()
            if (r0 == 0) goto L9
            r1.m29581()
        L9:
            super.onLayoutChildren(r2, r3)
            r1.m29583()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.C7713 r1) {
            r0 = this;
            super.onLayoutCompleted(r1)
            r1 = 0
            r0.f29535 = r1
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int scrollHorizontallyBy(int r1, androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3) {
            r0 = this;
            r0.m29601()
            r0.m29587()
            int r1 = super.scrollHorizontallyBy(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int scrollVerticallyBy(int r1, androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3) {
            r0 = this;
            r0.m29601()
            r0.m29587()
            int r1 = super.scrollVerticallyBy(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void setMeasuredDimension(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.f29537
            if (r0 != 0) goto L7
            super.setMeasuredDimension(r5, r6, r7)
        L7:
            int r0 = r4.getPaddingLeft()
            int r1 = r4.getPaddingRight()
            int r0 = r0 + r1
            int r1 = r4.getPaddingTop()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 + r2
            int r2 = r4.mOrientation
            r3 = 1
            if (r2 != r3) goto L3b
            int r5 = r5.height()
            int r5 = r5 + r1
            int r1 = r4.getMinimumHeight()
            int r5 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.chooseSize(r7, r5, r1)
            int[] r7 = r4.f29537
            int r1 = r7.length
            int r1 = r1 - r3
            r7 = r7[r1]
            int r7 = r7 + r0
            int r0 = r4.getMinimumWidth()
            int r6 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.chooseSize(r6, r7, r0)
            goto L57
        L3b:
            int r5 = r5.width()
            int r5 = r5 + r0
            int r0 = r4.getMinimumWidth()
            int r6 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.chooseSize(r6, r5, r0)
            int[] r5 = r4.f29537
            int r0 = r5.length
            int r0 = r0 - r3
            r5 = r5[r0]
            int r5 = r5 + r1
            int r0 = r4.getMinimumHeight()
            int r5 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.chooseSize(r7, r5, r0)
        L57:
            r4.setMeasuredDimension(r6, r5)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.setStackFromEnd(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "GridLayoutManager does not support stack from end. Consider using reverse layout"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public boolean supportsPredictiveItemAnimations() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = r1.mPendingSavedState
            if (r0 != 0) goto La
            boolean r0 = r1.f29535
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m29580(androidx.recyclerview.widget.RecyclerView.C7704 r5, androidx.recyclerview.widget.RecyclerView.C7713 r6, int r7, boolean r8) {
            r4 = this;
            r0 = 0
            if (r8 == 0) goto L8
            r8 = 1
            r1 = r8
            r8 = r7
            r7 = r0
            goto Lc
        L8:
            int r7 = r7 + (-1)
            r8 = -1
            r1 = r8
        Lc:
            if (r7 == r8) goto L27
            android.view.View[] r2 = r4.f29538
            r2 = r2[r7]
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r3 = (androidx.recyclerview.widget.GridLayoutManager.C7665) r3
            int r2 = r4.getPosition(r2)
            int r2 = r4.m29592(r5, r6, r2)
            r3.f29546 = r2
            r3.f29545 = r0
            int r0 = r0 + r2
            int r7 = r7 + r1
            goto Lc
        L27:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m29581() {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2a
            android.view.View r2 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r2 = (androidx.recyclerview.widget.GridLayoutManager.C7665) r2
            int r3 = r2.m29772()
            android.util.SparseIntArray r4 = r6.f29539
            int r5 = r2.m29605()
            r4.put(r3, r5)
            android.util.SparseIntArray r4 = r6.f29540
            int r2 = r2.m29604()
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto L5
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m29582(int r3) {
            r2 = this;
            int[] r0 = r2.f29537
            int r1 = r2.f29536
            int[] r3 = m29579(r0, r1, r3)
            r2.f29537 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final void m29583() {
            r1 = this;
            android.util.SparseIntArray r0 = r1.f29539
            r0.clear()
            android.util.SparseIntArray r0 = r1.f29540
            r0.clear()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final int m29584(androidx.recyclerview.widget.RecyclerView.C7713 r10) {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 == 0) goto Lad
            int r0 = r10.m29858()
            if (r0 != 0) goto Lf
            goto Lad
        Lf:
            r9.ensureLayoutState()
            boolean r0 = r9.isSmoothScrollbarEnabled()
            r2 = r0 ^ 1
            r3 = 1
            android.view.View r2 = r9.findFirstVisibleChildClosestToStart(r2, r3)
            r4 = r0 ^ 1
            android.view.View r4 = r9.findFirstVisibleChildClosestToEnd(r4, r3)
            if (r2 == 0) goto Lad
            if (r4 != 0) goto L29
            goto Lad
        L29:
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r5 = r9.f29541
            int r6 = r9.getPosition(r2)
            int r7 = r9.f29536
            int r5 = r5.m29607(r6, r7)
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r6 = r9.f29541
            int r7 = r9.getPosition(r4)
            int r8 = r9.f29536
            int r6 = r6.m29607(r7, r8)
            int r7 = java.lang.Math.min(r5, r6)
            int r5 = java.lang.Math.max(r5, r6)
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r6 = r9.f29541
            int r10 = r10.m29858()
            int r10 = r10 - r3
            int r8 = r9.f29536
            int r10 = r6.m29607(r10, r8)
            int r10 = r10 + r3
            boolean r6 = r9.mShouldReverseLayout
            if (r6 == 0) goto L62
            int r10 = r10 - r5
            int r10 = r10 - r3
            int r10 = java.lang.Math.max(r1, r10)
            goto L66
        L62:
            int r10 = java.lang.Math.max(r1, r7)
        L66:
            if (r0 != 0) goto L69
            return r10
        L69:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r9.mOrientationHelper
            int r0 = r0.mo30242(r4)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r9.mOrientationHelper
            int r1 = r1.mo30245(r2)
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r9.f29541
            int r5 = r9.getPosition(r2)
            int r6 = r9.f29536
            int r1 = r1.m29607(r5, r6)
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r5 = r9.f29541
            int r4 = r9.getPosition(r4)
            int r6 = r9.f29536
            int r4 = r5.m29607(r4, r6)
            int r4 = r4 - r1
            int r4 = r4 + r3
            float r0 = (float) r0
            float r1 = (float) r4
            float r0 = r0 / r1
            float r10 = (float) r10
            float r10 = r10 * r0
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r9.mOrientationHelper
            int r0 = r0.mo30252()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r9.mOrientationHelper
            int r1 = r1.mo30245(r2)
            int r0 = r0 - r1
            float r0 = (float) r0
            float r10 = r10 + r0
            int r10 = java.lang.Math.round(r10)
            return r10
        Lad:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final int m29585(androidx.recyclerview.widget.RecyclerView.C7713 r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            if (r0 == 0) goto L7a
            int r0 = r7.m29858()
            if (r0 != 0) goto Le
            goto L7a
        Le:
            r6.ensureLayoutState()
            boolean r0 = r6.isSmoothScrollbarEnabled()
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r0 = r6.findFirstVisibleChildClosestToStart(r0, r2)
            boolean r3 = r6.isSmoothScrollbarEnabled()
            r3 = r3 ^ r2
            android.view.View r3 = r6.findFirstVisibleChildClosestToEnd(r3, r2)
            if (r0 == 0) goto L7a
            if (r3 != 0) goto L29
            goto L7a
        L29:
            boolean r1 = r6.isSmoothScrollbarEnabled()
            if (r1 != 0) goto L3e
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r0 = r6.f29541
            int r7 = r7.m29858()
            int r7 = r7 - r2
            int r1 = r6.f29536
            int r7 = r0.m29607(r7, r1)
            int r7 = r7 + r2
            return r7
        L3e:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r6.mOrientationHelper
            int r1 = r1.mo30242(r3)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r6.mOrientationHelper
            int r4 = r4.mo30245(r0)
            int r1 = r1 - r4
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r4 = r6.f29541
            int r0 = r6.getPosition(r0)
            int r5 = r6.f29536
            int r0 = r4.m29607(r0, r5)
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r4 = r6.f29541
            int r3 = r6.getPosition(r3)
            int r5 = r6.f29536
            int r3 = r4.m29607(r3, r5)
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r4 = r6.f29541
            int r7 = r7.m29858()
            int r7 = r7 - r2
            int r5 = r6.f29536
            int r7 = r4.m29607(r7, r5)
            int r7 = r7 + r2
            int r3 = r3 - r0
            int r3 = r3 + r2
            float r0 = (float) r1
            float r1 = (float) r3
            float r0 = r0 / r1
            float r7 = (float) r7
            float r0 = r0 * r7
            int r7 = (int) r0
            return r7
        L7a:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m29586(androidx.recyclerview.widget.RecyclerView.C7704 r5, androidx.recyclerview.widget.RecyclerView.C7713 r6, androidx.recyclerview.widget.LinearLayoutManager.C7667 r7, int r8) {
            r4 = this;
            r0 = 1
            if (r8 != r0) goto L5
            r8 = r0
            goto L6
        L5:
            r8 = 0
        L6:
            int r1 = r7.f29552
            int r1 = r4.m29591(r5, r6, r1)
            if (r8 == 0) goto L1d
        Le:
            if (r1 <= 0) goto L33
            int r8 = r7.f29552
            if (r8 <= 0) goto L33
            int r8 = r8 + (-1)
            r7.f29552 = r8
            int r1 = r4.m29591(r5, r6, r8)
            goto Le
        L1d:
            int r8 = r6.m29858()
            int r8 = r8 - r0
            int r0 = r7.f29552
        L24:
            if (r0 >= r8) goto L31
            int r2 = r0 + 1
            int r3 = r4.m29591(r5, r6, r2)
            if (r3 <= r1) goto L31
            r0 = r2
            r1 = r3
            goto L24
        L31:
            r7.f29552 = r0
        L33:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final void m29587() {
            r2 = this;
            android.view.View[] r0 = r2.f29538
            if (r0 == 0) goto L9
            int r0 = r0.length
            int r1 = r2.f29536
            if (r0 == r1) goto Lf
        L9:
            int r0 = r2.f29536
            android.view.View[] r0 = new android.view.View[r0]
            r2.f29538 = r0
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public int m29588(int r4, int r5) {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = 1
            if (r0 != r1) goto L19
            boolean r0 = r3.isLayoutRTL()
            if (r0 == 0) goto L19
            int[] r0 = r3.f29537
            int r1 = r3.f29536
            int r2 = r1 - r4
            r2 = r0[r2]
            int r1 = r1 - r4
            int r1 = r1 - r5
            r4 = r0[r1]
            int r2 = r2 - r4
            return r2
        L19:
            int[] r0 = r3.f29537
            int r5 = r5 + r4
            r5 = r0[r5]
            r4 = r0[r4]
            int r5 = r5 - r4
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public int m29589() {
            r1 = this;
            int r0 = r1.f29536
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final int m29590(androidx.recyclerview.widget.RecyclerView.C7704 r1, androidx.recyclerview.widget.RecyclerView.C7713 r2, int r3) {
            r0 = this;
            boolean r2 = r2.m29864()
            if (r2 != 0) goto Lf
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r1 = r0.f29541
            int r2 = r0.f29536
            int r1 = r1.m29607(r3, r2)
            return r1
        Lf:
            int r1 = r1.m29802(r3)
            r2 = -1
            if (r1 != r2) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find span size for pre layout position. "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GridLayoutManager"
            android.util.Log.w(r2, r1)
            r1 = 0
            return r1
        L2e:
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r2 = r0.f29541
            int r3 = r0.f29536
            int r1 = r2.m29607(r1, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final int m29591(androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3, int r4) {
            r1 = this;
            boolean r3 = r3.m29864()
            if (r3 != 0) goto Lf
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r2 = r1.f29541
            int r3 = r1.f29536
            int r2 = r2.m29608(r4, r3)
            return r2
        Lf:
            android.util.SparseIntArray r3 = r1.f29540
            r0 = -1
            int r3 = r3.get(r4, r0)
            if (r3 == r0) goto L19
            return r3
        L19:
            int r2 = r2.m29802(r4)
            if (r2 != r0) goto L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
        L37:
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r3 = r1.f29541
            int r4 = r1.f29536
            int r2 = r3.m29608(r2, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final int m29592(androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3, int r4) {
            r1 = this;
            boolean r3 = r3.m29864()
            if (r3 != 0) goto Ld
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r2 = r1.f29541
            int r2 = r2.mo29603(r4)
            return r2
        Ld:
            android.util.SparseIntArray r3 = r1.f29539
            r0 = -1
            int r3 = r3.get(r4, r0)
            if (r3 == r0) goto L17
            return r3
        L17:
            int r2 = r2.m29802(r4)
            if (r2 != r0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 1
            return r2
        L35:
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r3 = r1.f29541
            int r2 = r3.mo29603(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public androidx.recyclerview.widget.GridLayoutManager.AbstractC7666 m29593() {
            r1 = this;
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r0 = r1.f29541
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m29594(float r2, int r3) {
            r1 = this;
            int r0 = r1.f29536
            float r0 = (float) r0
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            int r2 = java.lang.Math.max(r2, r3)
            r1.m29582(r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m29595() {
            r1 = this;
            boolean r0 = r1.f29543
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m29596(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟ r0 = (androidx.recyclerview.widget.GridLayoutManager.C7665) r0
            android.graphics.Rect r1 = r0.f29616
            int r2 = r1.top
            int r3 = r1.bottom
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r3 = r1.left
            int r1 = r1.right
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r1 = r0.f29545
            int r4 = r0.f29546
            int r1 = r8.m29588(r1, r4)
            int r4 = r8.mOrientation
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L43
            int r4 = r0.width
            int r10 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.getChildMeasureSpec(r1, r10, r3, r4, r5)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r8.mOrientationHelper
            int r1 = r1.mo30253()
            int r3 = r8.getHeightMode()
            int r0 = r0.height
            int r0 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.getChildMeasureSpec(r1, r3, r2, r0, r6)
            goto L5c
        L43:
            int r4 = r0.height
            int r10 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.getChildMeasureSpec(r1, r10, r2, r4, r5)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r8.mOrientationHelper
            int r1 = r1.mo30253()
            int r2 = r8.getWidthMode()
            int r0 = r0.width
            int r0 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.getChildMeasureSpec(r1, r2, r3, r0, r6)
            r7 = r0
            r0 = r10
            r10 = r7
        L5c:
            r8.m29597(r9, r10, r0, r11)
            return
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final void m29597(android.view.View r2, int r3, int r4, boolean r5) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
            if (r5 == 0) goto Ld
            boolean r5 = r1.shouldReMeasureChild(r2, r3, r4, r0)
            goto L11
        Ld:
            boolean r5 = r1.shouldMeasureChild(r2, r3, r4, r0)
        L11:
            if (r5 == 0) goto L16
            r2.measure(r3, r4)
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m29598(int r4) {
            r3 = this;
            int r0 = r3.f29536
            if (r4 != r0) goto L5
            return
        L5:
            r0 = 1
            r3.f29535 = r0
            if (r4 < r0) goto L15
            r3.f29536 = r4
            androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟ r4 = r3.f29541
            r4.m29611()
            r3.requestLayout()
            return
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Span count should be at least 1. Provided "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m29599(androidx.recyclerview.widget.GridLayoutManager.AbstractC7666 r1) {
            r0 = this;
            r0.f29541 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public void m29600(boolean r1) {
            r0 = this;
            r0.f29543 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final void m29601() {
            r2 = this;
            int r0 = r2.getOrientation()
            r1 = 1
            if (r0 != r1) goto L16
            int r0 = r2.getWidth()
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r2.getPaddingLeft()
        L14:
            int r0 = r0 - r1
            goto L24
        L16:
            int r0 = r2.getHeight()
            int r1 = r2.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r2.getPaddingTop()
            goto L14
        L24:
            r2.m29582(r0)
            return
    }
}
