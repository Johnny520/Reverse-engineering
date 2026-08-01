package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ec extends android.view.View {
    public int[] a;
    public int b;
    public android.content.Context c;
    public defpackage.oo d;
    public java.lang.String e;
    public java.util.HashMap f;

    public final void a(java.lang.String r6) {
            r5 = this;
            android.content.Context r0 = r5.c
            if (r6 == 0) goto La6
            int r1 = r6.length()
            if (r1 != 0) goto Lc
            goto La6
        Lc:
            if (r0 != 0) goto L10
            goto La6
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L22
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L22:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L32
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L33
        L32:
            r1 = r2
        L33:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5a
            if (r1 == 0) goto L5a
            if (r6 == 0) goto L4e
            java.util.HashMap r3 = r1.m
            if (r3 == 0) goto L4e
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4e
            java.util.HashMap r3 = r1.m
            java.lang.Object r3 = r3.get(r6)
            goto L4f
        L4e:
            r3 = r2
        L4f:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5a
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5b
        L5a:
            r3 = 0
        L5b:
            if (r3 != 0) goto L63
            if (r1 == 0) goto L63
            int r3 = r5.d(r1, r6)
        L63:
            if (r3 != 0) goto L6f
            java.lang.Class<qy> r1 = defpackage.qy.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L6f
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L6f
        L6f:
            if (r3 != 0) goto L7f
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L7f:
            if (r3 == 0) goto L8e
            java.util.HashMap r0 = r5.f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.b(r3)
            goto La6
        L8e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La6:
            return
    }

    public final void b(int r4) {
            r3 = this;
            int r0 = r3.getId()
            if (r4 != r0) goto L7
            return
        L7:
            int r0 = r3.b
            int r0 = r0 + 1
            int[] r1 = r3.a
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.a = r0
        L19:
            int[] r0 = r3.a
            int r1 = r3.b
            r0[r1] = r4
            int r1 = r1 + 1
            r3.b = r1
            return
    }

    public final void c() {
            r6 = this;
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L3a
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L3a
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            int r1 = r6.getVisibility()
            float r2 = r6.getElevation()
            r3 = 0
        L15:
            int r4 = r6.b
            if (r3 >= r4) goto L3a
            int[] r4 = r6.a
            r4 = r4[r3]
            android.util.SparseArray r5 = r0.a
            java.lang.Object r4 = r5.get(r4)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L37
            r4.setVisibility(r1)
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L37
            float r5 = r4.getTranslationZ()
            float r5 = r5 + r2
            r4.setTranslationZ(r5)
        L37:
            int r3 = r3 + 1
            goto L15
        L3a:
            return
    }

    public final int d(androidx.constraintlayout.widget.ConstraintLayout r8, java.lang.String r9) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L36
            android.content.Context r1 = r7.c
            android.content.res.Resources r1 = r1.getResources()
            if (r1 != 0) goto Lc
            goto L36
        Lc:
            int r2 = r8.getChildCount()
            r3 = r0
        L11:
            if (r3 >= r2) goto L36
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L33
            int r5 = r4.getId()     // Catch: android.content.res.Resources.NotFoundException -> L27
            java.lang.String r5 = r1.getResourceEntryName(r5)     // Catch: android.content.res.Resources.NotFoundException -> L27
            goto L28
        L27:
            r5 = 0
        L28:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L33
            int r8 = r4.getId()
            return r8
        L33:
            int r3 = r3 + 1
            goto L11
        L36:
            return r0
    }

    public void e(android.util.AttributeSet r5) {
            r4 = this;
            if (r5 == 0) goto L27
            android.content.Context r0 = r4.getContext()
            int[] r1 = defpackage.ry.b
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L11:
            if (r1 >= r0) goto L27
            int r2 = r5.getIndex(r1)
            r3 = 19
            if (r2 != r3) goto L24
            java.lang.String r2 = r5.getString(r2)
            r4.e = r2
            r4.setIds(r2)
        L24:
            int r1 = r1 + 1
            goto L11
        L27:
            return
    }

    public abstract void f(defpackage.pc r1, boolean r2);

    public final void g() {
            r2 = this;
            oo r0 = r2.d
            if (r0 != 0) goto L5
            goto L13
        L5:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r1 = r0 instanceof defpackage.gc
            if (r1 == 0) goto L13
            gc r0 = (defpackage.gc) r0
            oo r1 = r2.d
            r0.k0 = r1
        L13:
            return
    }

    public int[] getReferencedIds() {
            r2 = this;
            int[] r0 = r2.a
            int r1 = r2.b
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = r1.e
            if (r0 == 0) goto La
            r1.setIds(r0)
        La:
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setIds(java.lang.String r4) {
            r3 = this;
            r3.e = r4
            if (r4 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.b = r0
        L8:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r0)
            r3.a(r4)
            return
        L19:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.a(r0)
            int r0 = r1 + 1
            goto L8
    }

    public void setReferencedIds(int[] r3) {
            r2 = this;
            r0 = 0
            r2.e = r0
            r0 = 0
            r2.b = r0
        L6:
            int r1 = r3.length
            if (r0 >= r1) goto L11
            r1 = r3[r0]
            r2.b(r1)
            int r0 = r0 + 1
            goto L6
        L11:
            return
    }
}
