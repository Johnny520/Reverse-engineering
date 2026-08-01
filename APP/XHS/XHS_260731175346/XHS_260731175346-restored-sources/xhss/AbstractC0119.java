package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛱᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0119 extends xhss.C0501 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final android.view.WindowInsets f540;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C0921 f541;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public android.graphics.Rect[][] f542;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f543;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public android.graphics.Rect[][] f544;

    public AbstractC0119(xhss.C0847 r2, android.view.WindowInsets r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.f541 = r2
            r2 = 10
            android.graphics.Rect[][] r0 = new android.graphics.Rect[r2][]
            r1.f542 = r0
            android.graphics.Rect[][] r2 = new android.graphics.Rect[r2][]
            r1.f544 = r2
            r1.f540 = r3
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public static boolean m319(int r0, int r1) {
            r0 = r0 & 6
            r1 = r1 & 6
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    private android.graphics.Rect[] m320(xhss.C0921 r6) {
            r5 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r0 = r6.f2970
            int r1 = r6.f2971
            int r2 = r6.f2969
            int r3 = r6.f2968
            r4 = 0
            if (r0 == 0) goto L1a
            android.graphics.Rect r0 = new android.graphics.Rect
            int r6 = r6.f2970
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

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    private static java.util.List<android.graphics.Rect> m321(android.graphics.Rect[][] r6, int r7) {
            r0 = 0
            r1 = 1
        L2:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L2b
            r2 = r7 & r1
            if (r2 != 0) goto Lb
            goto L28
        Lb:
            int r2 = xhss.C0915.m1495(r1)
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

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    private xhss.C0822 m322(android.view.View r12) {
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
            xhss.ᲀᛳᛲᛶ r11 = r11.f1818
            xhss.ᛵᛸᛱ r11 = r11.f2754
            boolean r11 = r11.mo335()
            if (r11 == 0) goto L2b
            int r1 = r0.x
            int r2 = r0.y
            r6 = 0
            r7 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            xhss.ᛸᲇᲈᛴ r11 = xhss.C0822.m1391(r1, r2, r3, r4, r5, r6, r7)
            return r11
        L2b:
            r11 = 0
            xhss.ᛷᲈᲇᛸ r1 = xhss.AbstractC0485.m883(r12, r11)
            r2 = 1
            xhss.ᛷᲈᲇᛸ r2 = xhss.AbstractC0485.m883(r12, r2)
            r3 = 2
            xhss.ᛷᲈᲇᛸ r3 = xhss.AbstractC0485.m883(r12, r3)
            r4 = 3
            xhss.ᛷᲈᲇᛸ r12 = xhss.AbstractC0485.m883(r12, r4)
            int r4 = r0.x
            int r5 = r0.y
            if (r1 == 0) goto L49
            int r0 = r1.f2410
            r7 = r0
            goto L4a
        L49:
            r7 = r11
        L4a:
            if (r2 == 0) goto L50
            int r0 = r2.f2410
            r8 = r0
            goto L51
        L50:
            r8 = r11
        L51:
            if (r3 == 0) goto L57
            int r0 = r3.f2410
            r9 = r0
            goto L58
        L57:
            r9 = r11
        L58:
            if (r12 == 0) goto L5c
            int r11 = r12.f2410
        L5c:
            r10 = r11
            r6 = 0
            xhss.ᛸᲇᲈᛴ r11 = xhss.C0822.m1391(r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public abstract xhss.C0921 mo323(int r1);

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public void mo324(android.graphics.Rect[][] r1) {
            r0 = this;
            java.lang.Object r1 = r1.clone()
            android.graphics.Rect[][] r1 = (android.graphics.Rect[][]) r1
            r0.f542 = r1
            return
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public void mo325(int r1) {
            r0 = this;
            r0.f543 = r1
            return
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public void mo326(xhss.C0822 r1) {
            r0 = this;
            return
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public java.util.List<android.graphics.Rect> mo327(int r1) {
            r0 = this;
            android.graphics.Rect[][] r0 = r0.f542
            java.util.List r0 = m321(r0, r1)
            return r0
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public void mo328() {
            r4 = this;
            r0 = 1
        L1:
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L28
            int r1 = xhss.C0915.m1495(r0)
            android.graphics.Rect[][] r2 = r4.f542
            xhss.ᲀᲈᲈᛸ r3 = r4.mo330(r0)
            android.graphics.Rect[] r3 = r4.m320(r3)
            r2[r1] = r3
            r2 = 8
            if (r0 == r2) goto L25
            android.graphics.Rect[][] r2 = r4.f544
            xhss.ᲀᲈᲈᛸ r3 = r4.mo323(r0)
            android.graphics.Rect[] r3 = r4.m320(r3)
            r2[r1] = r3
        L25:
            int r0 = r0 << 1
            goto L1
        L28:
            return
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public void mo329(xhss.C0847 r1) {
            r0 = this;
            return
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public abstract xhss.C0921 mo330(int r1);

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public void mo331(xhss.C0921[] r1) {
            r0 = this;
            return
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.C0921 mo332() {
            r4 = this;
            xhss.ᲀᲈᲈᛸ r0 = r4.f541
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.f540
            int r1 = r0.getSystemWindowInsetLeft()
            int r2 = r0.getSystemWindowInsetTop()
            int r3 = r0.getSystemWindowInsetRight()
            int r0 = r0.getSystemWindowInsetBottom()
            xhss.ᲀᲈᲈᛸ r0 = xhss.C0921.m1515(r1, r2, r3, r0)
            r4.f541 = r0
        L1c:
            return r0
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public void mo333(android.graphics.Rect[][] r1) {
            r0 = this;
            java.lang.Object r1 = r1.clone()
            android.graphics.Rect[][] r1 = (android.graphics.Rect[][]) r1
            r0.f544 = r1
            return
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public java.util.List<android.graphics.Rect> mo334(int r1) {
            r0 = this;
            android.graphics.Rect[][] r0 = r0.f544
            java.util.List r0 = m321(r0, r1)
            return r0
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public boolean mo335() {
            r0 = this;
            android.view.WindowInsets r0 = r0.f540
            boolean r0 = r0.isRound()
            return r0
    }

    @Override // xhss.C0501
    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public void mo336(android.view.View r1) {
            r0 = this;
            r0.m322(r1)
            return
    }
}
