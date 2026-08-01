package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class au implements defpackage.qw {
    public final java.lang.Object a;
    public int b;
    public int c;

    public au(android.content.Context r7, android.content.res.XmlResourceParser r8) {
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.a = r0
            r0 = -1
            r6.c = r0
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r8)
            int[] r0 = defpackage.ry.g
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r0)
            int r0 = r8.getIndexCount()
            r1 = 0
        L1c:
            if (r1 >= r0) goto L65
            int r2 = r8.getIndex(r1)
            if (r2 != 0) goto L2d
            int r3 = r6.b
            int r2 = r8.getResourceId(r2, r3)
            r6.b = r2
            goto L62
        L2d:
            r3 = 1
            if (r2 != r3) goto L62
            int r3 = r6.c
            int r2 = r8.getResourceId(r2, r3)
            r6.c = r2
            android.content.res.Resources r3 = r7.getResources()
            java.lang.String r3 = r3.getResourceTypeName(r2)
            android.content.res.Resources r4 = r7.getResources()
            r4.getResourceName(r2)
            java.lang.String r4 = "layout"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L62
            oc r3 = new oc
            r3.<init>()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r7)
            r5 = 0
            android.view.View r2 = r4.inflate(r2, r5)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r3.b(r2)
        L62:
            int r1 = r1 + 1
            goto L1c
        L65:
            r8.recycle()
            return
    }

    public au(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public au(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.b = r2
            r0.a = r1
            r0.c = r3
            return
    }

    @Override // defpackage.qw
    public defpackage.wc0 d(android.view.View r5, defpackage.wc0 r6) {
            r4 = this;
            java.lang.Object r5 = r4.a
            android.view.View r5 = (android.view.View) r5
            r0 = 7
            tc0 r1 = r6.a
            ep r0 = r1.f(r0)
            int r0 = r0.b
            int r1 = r4.b
            if (r1 < 0) goto L1f
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            int r1 = r1 + r0
            r2.height = r1
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            r5.setLayoutParams(r1)
        L1f:
            int r1 = r5.getPaddingLeft()
            int r2 = r4.c
            int r2 = r2 + r0
            int r0 = r5.getPaddingRight()
            int r3 = r5.getPaddingBottom()
            r5.setPadding(r1, r2, r0, r3)
            return r6
    }
}
