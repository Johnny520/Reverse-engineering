package androidx.constraintlayout.widget;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7457 extends android.view.View {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int[] f26077;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f26078;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.content.Context f26079;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Yue.InterfaceC3022 f26080;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f26081;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.lang.String f26082;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.lang.String f26083;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public android.view.View[] f26084;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public java.util.HashMap<java.lang.Integer, java.lang.String> f26085;

    public AbstractC7457(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 32
            int[] r0 = new int[r0]
            r2.f26077 = r0
            r0 = 0
            r2.f26081 = r0
            r0 = 0
            r2.f26084 = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.f26085 = r1
            r2.f26079 = r3
            r2.mo14491(r0)
            return
    }

    public AbstractC7457(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 32
            int[] r0 = new int[r0]
            r1.f26077 = r0
            r0 = 0
            r1.f26081 = r0
            r0 = 0
            r1.f26084 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f26085 = r0
            r1.f26079 = r2
            r1.mo14491(r3)
            return
    }

    public AbstractC7457(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 32
            int[] r3 = new int[r3]
            r0.f26077 = r3
            r3 = 0
            r0.f26081 = r3
            r3 = 0
            r0.f26084 = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0.f26085 = r3
            r0.f26079 = r1
            r0.mo14491(r2)
            return
    }

    public int[] getReferencedIds() {
            r2 = this;
            int[] r0 = r2.f26077
            int r1 = r2.f26078
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = r1.f26082
            if (r0 == 0) goto La
            r1.setIds(r0)
        La:
            java.lang.String r0 = r1.f26083
            if (r0 == 0) goto L11
            r1.setReferenceTags(r0)
        L11:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.f26081
            if (r0 == 0) goto L8
            super.onMeasure(r2, r3)
            goto Lc
        L8:
            r2 = 0
            r1.setMeasuredDimension(r2, r2)
        Lc:
            return
    }

    public void setIds(java.lang.String r4) {
            r3 = this;
            r3.f26082 = r4
            if (r4 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.f26078 = r0
        L8:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r0)
            r3.m28527(r4)
            return
        L19:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.m28527(r0)
            int r0 = r1 + 1
            goto L8
    }

    public void setReferenceTags(java.lang.String r4) {
            r3 = this;
            r3.f26083 = r4
            if (r4 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.f26078 = r0
        L8:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r0)
            r3.m28529(r4)
            return
        L19:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.m28529(r0)
            int r0 = r1 + 1
            goto L8
    }

    public void setReferencedIds(int[] r3) {
            r2 = this;
            r0 = 0
            r2.f26082 = r0
            r0 = 0
            r2.f26078 = r0
        L6:
            int r1 = r3.length
            if (r0 >= r1) goto L11
            r1 = r3[r0]
            r2.m28528(r1)
            int r0 = r0 + 1
            goto L6
        L11:
            return
    }

    @Override // android.view.View
    public void setTag(int r1, java.lang.Object r2) {
            r0 = this;
            super.setTag(r1, r2)
            if (r2 != 0) goto Lc
            java.lang.String r2 = r0.f26082
            if (r2 != 0) goto Lc
            r0.m28528(r1)
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m28527(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L4e
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto L4e
        L9:
            android.content.Context r0 = r3.f26079
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.String r4 = r4.trim()
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L20
            android.view.ViewParent r0 = r3.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
        L20:
            int r0 = r3.m28535(r4)
            if (r0 == 0) goto L33
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r3.f26085
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r4)
            r3.m28528(r0)
            goto L4e
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not find id of \""
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "\""
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r4)
        L4e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m28528(int r4) {
            r3 = this;
            int r0 = r3.getId()
            if (r4 != r0) goto L7
            return
        L7:
            int r0 = r3.f26078
            int r0 = r0 + 1
            int[] r1 = r3.f26077
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f26077 = r0
        L19:
            int[] r0 = r3.f26077
            int r1 = r3.f26078
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f26078 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m28529(java.lang.String r8) {
            r7 = this;
            if (r8 == 0) goto L7d
            int r0 = r8.length()
            if (r0 != 0) goto La
            goto L7d
        La:
            android.content.Context r0 = r7.f26079
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r8 = r8.trim()
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L22
            android.view.ViewParent r0 = r7.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L23
        L22:
            r0 = 0
        L23:
            java.lang.String r1 = "ConstraintHelper"
            if (r0 != 0) goto L2d
            java.lang.String r8 = "Parent not a ConstraintLayout"
            android.util.Log.w(r1, r8)
            return
        L2d:
            int r2 = r0.getChildCount()
            r3 = 0
        L32:
            if (r3 >= r2) goto L7d
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r6 = r5 instanceof androidx.constraintlayout.widget.ConstraintLayout.C7450
            if (r6 == 0) goto L7a
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r5 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r5
            java.lang.String r5 = r5.f25970
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L7a
            int r5 = r4.getId()
            r6 = -1
            if (r5 != r6) goto L73
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "to use ConstraintTag view "
            r5.append(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r5.append(r4)
            java.lang.String r4 = " must have an ID"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r1, r4)
            goto L7a
        L73:
            int r4 = r4.getId()
            r7.m28528(r4)
        L7a:
            int r3 = r3 + 1
            goto L32
        L7d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m28530(android.view.View r4) {
            r3 = this;
            if (r4 != r3) goto L3
            return
        L3:
            int r0 = r4.getId()
            r1 = -1
            java.lang.String r2 = "ConstraintHelper"
            if (r0 != r1) goto L12
            java.lang.String r4 = "Views added to a ConstraintHelper need to have an id"
            android.util.Log.e(r2, r4)
            return
        L12:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 != 0) goto L1e
            java.lang.String r4 = "Views added to a ConstraintHelper need to have a parent"
            android.util.Log.e(r2, r4)
            return
        L1e:
            r0 = 0
            r3.f26082 = r0
            int r4 = r4.getId()
            r3.m28528(r4)
            r3.requestLayout()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28531() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto Lf
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto Lf
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r2.m28532(r0)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m28532(androidx.constraintlayout.widget.ConstraintLayout r6) {
            r5 = this;
            int r0 = r5.getVisibility()
            float r1 = r5.getElevation()
            r2 = 0
        L9:
            int r3 = r5.f26078
            if (r2 >= r3) goto L2a
            int[] r3 = r5.f26077
            r3 = r3[r2]
            android.view.View r3 = r6.getViewById(r3)
            if (r3 == 0) goto L27
            r3.setVisibility(r0)
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L27
            float r4 = r3.getTranslationZ()
            float r4 = r4 + r1
            r3.setTranslationZ(r4)
        L27:
            int r2 = r2 + 1
            goto L9
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int[] m28533(android.view.View r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = ","
            java.lang.String[] r6 = r6.split(r0)
            r5.getContext()
            int r5 = r6.length
            int[] r5 = new int[r5]
            r0 = 0
            r1 = r0
        Le:
            int r2 = r6.length
            if (r0 >= r2) goto L25
            r2 = r6[r0]
            java.lang.String r2 = r2.trim()
            int r2 = r4.m28535(r2)
            if (r2 == 0) goto L22
            int r3 = r1 + 1
            r5[r1] = r2
            r1 = r3
        L22:
            int r0 = r0 + 1
            goto Le
        L25:
            int r6 = r6.length
            if (r1 == r6) goto L2c
            int[] r5 = java.util.Arrays.copyOf(r5, r1)
        L2c:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int m28534(androidx.constraintlayout.widget.ConstraintLayout r8, java.lang.String r9) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L39
            if (r8 != 0) goto L6
            goto L39
        L6:
            android.content.Context r1 = r7.f26079
            android.content.res.Resources r1 = r1.getResources()
            if (r1 != 0) goto Lf
            return r0
        Lf:
            int r2 = r8.getChildCount()
            r3 = r0
        L14:
            if (r3 >= r2) goto L39
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L36
            int r5 = r4.getId()     // Catch: android.content.res.Resources.NotFoundException -> L2a
            java.lang.String r5 = r1.getResourceEntryName(r5)     // Catch: android.content.res.Resources.NotFoundException -> L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L36
            int r8 = r4.getId()
            return r8
        L36:
            int r3 = r3 + 1
            goto L14
        L39:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m28535(java.lang.String r6) {
            r5 = this;
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r1 = 0
            if (r0 == 0) goto L10
            android.view.ViewParent r0 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r2 = r5.isInEditMode()
            r3 = 0
            if (r2 == 0) goto L28
            if (r0 == 0) goto L28
            java.lang.Object r2 = r0.getDesignInformation(r3, r6)
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L28
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
        L28:
            if (r3 != 0) goto L30
            if (r0 == 0) goto L30
            int r3 = r5.m28534(r0, r6)
        L30:
            if (r3 != 0) goto L3c
            java.lang.Class<androidx.constraintlayout.widget.ۥ۟۟۟ۥ$ۥ۟۟۟ۡ> r0 = androidx.constraintlayout.widget.C7473.C7480.class
            java.lang.reflect.Field r0 = r0.getField(r6)     // Catch: java.lang.Exception -> L3c
            int r3 = r0.getInt(r1)     // Catch: java.lang.Exception -> L3c
        L3c:
            if (r3 != 0) goto L50
            android.content.Context r0 = r5.f26079
            android.content.res.Resources r0 = r0.getResources()
            android.content.Context r1 = r5.f26079
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "id"
            int r3 = r0.getIdentifier(r6, r2, r1)
        L50:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public android.view.View[] m28536(androidx.constraintlayout.widget.ConstraintLayout r4) {
            r3 = this;
            android.view.View[] r0 = r3.f26084
            if (r0 == 0) goto L9
            int r0 = r0.length
            int r1 = r3.f26078
            if (r0 == r1) goto Lf
        L9:
            int r0 = r3.f26078
            android.view.View[] r0 = new android.view.View[r0]
            r3.f26084 = r0
        Lf:
            r0 = 0
        L10:
            int r1 = r3.f26078
            if (r0 >= r1) goto L23
            int[] r1 = r3.f26077
            r1 = r1[r0]
            android.view.View[] r2 = r3.f26084
            android.view.View r1 = r4.getViewById(r1)
            r2[r0] = r1
            int r0 = r0 + 1
            goto L10
        L23:
            android.view.View[] r4 = r3.f26084
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo14491(android.util.AttributeSet r5) {
            r4 = this;
            if (r5 == 0) goto L38
            android.content.Context r0 = r4.getContext()
            int[] r1 = androidx.constraintlayout.widget.C7473.C7486.f28216
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L11:
            if (r1 >= r0) goto L35
            int r2 = r5.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28236
            if (r2 != r3) goto L25
            java.lang.String r2 = r5.getString(r2)
            r4.f26082 = r2
            r4.setIds(r2)
            goto L32
        L25:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28237
            if (r2 != r3) goto L32
            java.lang.String r2 = r5.getString(r2)
            r4.f26083 = r2
            r4.setReferenceTags(r2)
        L32:
            int r1 = r1 + 1
            goto L11
        L35:
            r5.recycle()
        L38:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo28494(androidx.constraintlayout.widget.C7462.C7463 r3, Yue.C3025 r4, androidx.constraintlayout.widget.ConstraintLayout.C7450 r5, android.util.SparseArray<Yue.C1517> r6) {
            r2 = this;
            androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟ r5 = r3.f26241
            int[] r0 = r5.f26353
            if (r0 == 0) goto La
            r2.setReferencedIds(r0)
            goto L1e
        La:
            java.lang.String r5 = r5.f26354
            if (r5 == 0) goto L1e
            int r5 = r5.length()
            if (r5 <= 0) goto L1e
            androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟ r5 = r3.f26241
            java.lang.String r0 = r5.f26354
            int[] r0 = r2.m28533(r2, r0)
            r5.f26353 = r0
        L1e:
            r4.mo12778()
            androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟ r5 = r3.f26241
            int[] r5 = r5.f26353
            if (r5 == 0) goto L3f
            r5 = 0
        L28:
            androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟ r0 = r3.f26241
            int[] r0 = r0.f26353
            int r1 = r0.length
            if (r5 >= r1) goto L3f
            r0 = r0[r5]
            java.lang.Object r0 = r6.get(r0)
            Yue.ۥ۟ۧ۟ۢ r0 = (Yue.C1517) r0
            if (r0 == 0) goto L3c
            r4.mo12779(r0)
        L3c:
            int r5 = r5 + 1
            goto L28
        L3f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m28537(android.view.View r5) {
            r4 = this;
            int r5 = r5.getId()
            r0 = -1
            if (r5 != r0) goto L8
            return
        L8:
            r0 = 0
            r4.f26082 = r0
            r0 = 0
            r1 = r0
        Ld:
            int r2 = r4.f26078
            if (r1 >= r2) goto L35
            int[] r2 = r4.f26077
            r2 = r2[r1]
            if (r2 != r5) goto L32
        L17:
            int r5 = r4.f26078
            int r2 = r5 + (-1)
            if (r1 >= r2) goto L27
            int[] r5 = r4.f26077
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto L17
        L27:
            int[] r1 = r4.f26077
            int r2 = r5 + (-1)
            r1[r2] = r0
            int r5 = r5 + (-1)
            r4.f26078 = r5
            goto L35
        L32:
            int r1 = r1 + 1
            goto Ld
        L35:
            r4.requestLayout()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo28495(Yue.C1517 r1, boolean r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m28538(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo14492(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m28539(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo14493(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m28540(Yue.C1520 r2, Yue.InterfaceC3022 r3, android.util.SparseArray<Yue.C1517> r4) {
            r1 = this;
            r3.mo12778()
            r2 = 0
        L4:
            int r0 = r1.f26078
            if (r2 >= r0) goto L18
            int[] r0 = r1.f26077
            r0 = r0[r2]
            java.lang.Object r0 = r4.get(r0)
            Yue.ۥ۟ۧ۟ۢ r0 = (Yue.C1517) r0
            r3.mo12779(r0)
            int r2 = r2 + 1
            goto L4
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m28541(androidx.constraintlayout.widget.ConstraintLayout r6) {
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r5.f26082
            r5.setIds(r0)
        Lb:
            Yue.ۥ۠ۤۤ r0 = r5.f26080
            if (r0 != 0) goto L10
            return
        L10:
            r0.mo12778()
            r0 = 0
        L14:
            int r1 = r5.f26078
            if (r0 >= r1) goto L53
            int[] r1 = r5.f26077
            r1 = r1[r0]
            android.view.View r2 = r6.getViewById(r1)
            if (r2 != 0) goto L45
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f26085
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.m28534(r6, r1)
            if (r3 == 0) goto L45
            int[] r2 = r5.f26077
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f26085
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.getViewById(r3)
        L45:
            if (r2 == 0) goto L50
            Yue.ۥ۠ۤۤ r1 = r5.f26080
            Yue.ۥ۟ۧ۟ۢ r2 = r6.getViewWidget(r2)
            r1.mo12779(r2)
        L50:
            int r0 = r0 + 1
            goto L14
        L53:
            Yue.ۥ۠ۤۤ r0 = r5.f26080
            Yue.ۥۣ۟ۧ۟ r6 = r6.mLayoutWidget
            r0.mo12780(r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m28542() {
            r2 = this;
            Yue.ۥ۠ۤۤ r0 = r2.f26080
            if (r0 != 0) goto L5
            return
        L5:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.C7450
            if (r1 == 0) goto L15
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r0
            Yue.ۥ۠ۤۤ r1 = r2.f26080
            Yue.ۥ۟ۧ۟ۢ r1 = (Yue.C1517) r1
            r0.f25988 = r1
        L15:
            return
    }
}
