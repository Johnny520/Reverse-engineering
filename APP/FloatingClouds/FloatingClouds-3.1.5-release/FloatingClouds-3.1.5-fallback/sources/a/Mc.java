package a;

/* JADX INFO: loaded from: classes.dex */
public class Mc extends androidx.constraintlayout.widget.ConstraintLayout {
    public final a.M2 q;
    public int r;
    public final a.Ta s;

    public Mc(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Mc(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            int r1 = com.google.android.material.R.layout.material_radial_view_group
            r0.inflate(r1, r3)
            a.Ta r0 = new a.Ta
            r0.<init>()
            r3.s = r0
            a.Xc r1 = new a.Xc
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.<init>(r2)
            a.Ta$b r2 = r0.f278a
            a.Vd r2 = r2.f280a
            a.Vd$a r2 = r2.e()
            r2.e = r1
            r2.f = r1
            r2.g = r1
            r2.h = r1
            a.Vd r1 = r2.a()
            r0.setShapeAppearanceModel(r1)
            a.Ta r0 = r3.s
            r1 = -1
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.k(r1)
            a.Ta r0 = r3.s
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            r3.setBackground(r0)
            int[] r0 = com.google.android.material.R.styleable.RadialViewGroup
            r1 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0, r6, r1)
            int r5 = com.google.android.material.R.styleable.RadialViewGroup_materialCircleRadius
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r3.r = r5
            a.M2 r5 = new a.M2
            r6 = 14
            r5.<init>(r6, r3)
            r3.q = r5
            r4.recycle()
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            int r2 = r1.getId()
            r3 = -1
            if (r2 != r3) goto L13
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            int r2 = android.view.View.generateViewId()
            r1.setId(r2)
        L13:
            android.os.Handler r1 = r0.getHandler()
            if (r1 == 0) goto L21
            a.M2 r2 = r0.q
            r1.removeCallbacks(r2)
            r1.post(r2)
        L21:
            return
    }

    public void f() {
            r11 = this;
            androidx.constraintlayout.widget.e r0 = new androidx.constraintlayout.widget.e
            r0.<init>()
            r0.b(r11)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
        Le:
            int r3 = r11.getChildCount()
            if (r2 >= r3) goto L56
            android.view.View r3 = r11.getChildAt(r2)
            int r4 = r3.getId()
            int r5 = com.google.android.material.R.id.circle_center
            if (r4 == r5) goto L53
            java.lang.String r4 = "skip"
            java.lang.Object r5 = r3.getTag()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2d
            goto L53
        L2d:
            int r4 = com.google.android.material.R.id.material_clock_level
            java.lang.Object r4 = r3.getTag(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L3c
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L3c:
            boolean r5 = r1.containsKey(r4)
            if (r5 != 0) goto L4a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r4, r5)
        L4a:
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            r4.add(r3)
        L53:
            int r2 = r2 + 1
            goto Le
        L56:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L5e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld6
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = 2
            if (r2 != r4) goto L89
            int r2 = r11.r
            float r2 = (float) r2
            r4 = 1059648963(0x3f28f5c3, float:0.66)
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            goto L8b
        L89:
            int r2 = r11.r
        L8b:
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
        L90:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5e
            java.lang.Object r6 = r4.next()
            android.view.View r6 = (android.view.View) r6
            int r6 = r6.getId()
            int r7 = com.google.android.material.R.id.circle_center
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.e$a> r8 = r0.c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r9 = r8.containsKey(r9)
            if (r9 != 0) goto Lba
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            androidx.constraintlayout.widget.e$a r10 = new androidx.constraintlayout.widget.e$a
            r10.<init>()
            r8.put(r9, r10)
        Lba:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r8.get(r6)
            androidx.constraintlayout.widget.e$a r6 = (androidx.constraintlayout.widget.e.a) r6
            androidx.constraintlayout.widget.e$b r6 = r6.d
            r6.w = r7
            r6.x = r2
            r6.y = r5
            int r6 = r3.size()
            float r6 = (float) r6
            r7 = 1135869952(0x43b40000, float:360.0)
            float r7 = r7 / r6
            float r5 = r5 + r7
            goto L90
        Ld6:
            r0.a(r11)
            r0 = 0
            r11.setConstraintSet(r0)
            r11.requestLayout()
            return
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r0 = this;
            super.onFinishInflate()
            r0.f()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(android.view.View r2) {
            r1 = this;
            super.onViewRemoved(r2)
            android.os.Handler r2 = r1.getHandler()
            if (r2 == 0) goto L11
            a.M2 r0 = r1.q
            r2.removeCallbacks(r0)
            r2.post(r0)
        L11:
            return
    }

    @Override // android.view.View
    public final void setBackgroundColor(int r2) {
            r1 = this;
            a.Ta r0 = r1.s
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.k(r2)
            return
    }
}
