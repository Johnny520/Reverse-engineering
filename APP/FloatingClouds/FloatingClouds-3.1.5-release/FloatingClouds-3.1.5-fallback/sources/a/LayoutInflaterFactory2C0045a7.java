package a;

/* JADX INFO: renamed from: a.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0045a7 implements android.view.LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.AbstractC0119e7 f397a;

    /* JADX INFO: renamed from: a.a7$a */
    public class a implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.e f398a;
        public final /* synthetic */ a.LayoutInflaterFactory2C0045a7 b;

        public a(a.LayoutInflaterFactory2C0045a7 r1, androidx.fragment.app.e r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.f398a = r2
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(android.view.View r2) {
                r1 = this;
                androidx.fragment.app.e r2 = r1.f398a
                r2.k()
                androidx.fragment.app.b r2 = r2.c
                android.view.View r2 = r2.G
                android.view.ViewParent r2 = r2.getParent()
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                a.a7 r0 = r1.b
                a.e7 r0 = r0.f397a
                androidx.fragment.app.f r2 = androidx.fragment.app.f.i(r2, r0)
                r2.h()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }
    }

    public LayoutInflaterFactory2C0045a7(a.AbstractC0119e7 r1) {
            r0 = this;
            r0.<init>()
            r0.f397a = r1
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r17, java.lang.String r18, android.content.Context r19, android.util.AttributeSet r20) {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = -1
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r5 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r5 = r5.getName()
            boolean r5 = r5.equals(r1)
            a.e7 r6 = r0.f397a
            if (r5 == 0) goto L1d
            androidx.fragment.app.FragmentContainerView r1 = new androidx.fragment.app.FragmentContainerView
            r1.<init>(r2, r3, r6)
            return r1
        L1d:
            java.lang.String r5 = "fragment"
            boolean r1 = r5.equals(r1)
            r5 = 0
            if (r1 != 0) goto L28
            goto L224
        L28:
            java.lang.String r1 = "class"
            java.lang.String r1 = r3.getAttributeValue(r5, r1)
            int[] r7 = androidx.fragment.R.styleable.Fragment
            android.content.res.TypedArray r7 = r2.obtainStyledAttributes(r3, r7)
            if (r1 != 0) goto L3c
            int r1 = androidx.fragment.R.styleable.Fragment_android_name
            java.lang.String r1 = r7.getString(r1)
        L3c:
            int r8 = androidx.fragment.R.styleable.Fragment_android_id
            int r8 = r7.getResourceId(r8, r4)
            int r9 = androidx.fragment.R.styleable.Fragment_android_tag
            java.lang.String r9 = r7.getString(r9)
            r7.recycle()
            if (r1 == 0) goto L224
            java.lang.ClassLoader r7 = r2.getClassLoader()
            r10 = 0
            java.lang.Class r7 = androidx.fragment.app.d.b(r7, r1)     // Catch: java.lang.ClassNotFoundException -> L5d
            java.lang.Class<androidx.fragment.app.b> r11 = androidx.fragment.app.b.class
            boolean r7 = r11.isAssignableFrom(r7)     // Catch: java.lang.ClassNotFoundException -> L5d
            goto L5e
        L5d:
            r7 = r10
        L5e:
            if (r7 != 0) goto L62
            goto L224
        L62:
            if (r17 == 0) goto L68
            int r10 = r17.getId()
        L68:
            if (r10 != r4) goto L8d
            if (r8 != r4) goto L8d
            if (r9 == 0) goto L6f
            goto L8d
        L6f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r4.append(r3)
            java.lang.String r3 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L8d:
            if (r8 == r4) goto L94
            androidx.fragment.app.b r7 = r6.C(r8)
            goto L95
        L94:
            r7 = r5
        L95:
            r11 = 1
            if (r7 != 0) goto Le2
            if (r9 == 0) goto Le2
            a.A2 r7 = r6.c
            java.lang.Object r12 = r7.f7a
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r13 = r12.size()
            int r13 = r13 - r11
        La5:
            if (r13 < 0) goto Lbb
            java.lang.Object r14 = r12.get(r13)
            androidx.fragment.app.b r14 = (androidx.fragment.app.b) r14
            if (r14 == 0) goto Lb9
            java.lang.String r15 = r14.z
            boolean r15 = r9.equals(r15)
            if (r15 == 0) goto Lb9
            r7 = r14
            goto Le2
        Lb9:
            int r13 = r13 + r4
            goto La5
        Lbb:
            java.lang.Object r7 = r7.b
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        Lc7:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto Le1
            java.lang.Object r12 = r7.next()
            androidx.fragment.app.e r12 = (androidx.fragment.app.e) r12
            if (r12 == 0) goto Lc7
            androidx.fragment.app.b r12 = r12.c
            java.lang.String r13 = r12.z
            boolean r13 = r9.equals(r13)
            if (r13 == 0) goto Lc7
            r7 = r12
            goto Le2
        Le1:
            r7 = r5
        Le2:
            if (r7 != 0) goto Lea
            if (r10 == r4) goto Lea
            androidx.fragment.app.b r7 = r6.C(r10)
        Lea:
            java.lang.String r4 = "Fragment "
            java.lang.String r12 = "FragmentManager"
            r13 = 2
            if (r7 != 0) goto L144
            androidx.fragment.app.d r3 = r6.G()
            r2.getClassLoader()
            androidx.fragment.app.b r7 = r3.a(r1)
            r7.n = r11
            if (r8 == 0) goto L102
            r2 = r8
            goto L103
        L102:
            r2 = r10
        L103:
            r7.x = r2
            r7.y = r10
            r7.z = r9
            r7.o = r11
            r7.t = r6
            a.X6$a r2 = r6.v
            r7.u = r2
            a.X6 r3 = r2.b
            r7.E = r11
            if (r2 != 0) goto L118
            goto L11a
        L118:
            a.X6 r5 = r2.f370a
        L11a:
            if (r5 == 0) goto L11e
            r7.E = r11
        L11e:
            androidx.fragment.app.e r2 = r6.a(r7)
            boolean r3 = a.AbstractC0119e7.J(r13)
            if (r3 == 0) goto L184
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r5 = " has been inflated via the <fragment> tag: id=0x"
            r3.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r8)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r12, r3)
            goto L184
        L144:
            boolean r2 = r7.o
            if (r2 != 0) goto L1e6
            r7.o = r11
            r7.t = r6
            a.X6$a r2 = r6.v
            r7.u = r2
            a.X6 r3 = r2.b
            r7.E = r11
            if (r2 != 0) goto L157
            goto L159
        L157:
            a.X6 r5 = r2.f370a
        L159:
            if (r5 == 0) goto L15d
            r7.E = r11
        L15d:
            androidx.fragment.app.e r2 = r6.g(r7)
            boolean r3 = a.AbstractC0119e7.J(r13)
            if (r3 == 0) goto L184
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Retained Fragment "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r5 = " has been re-attached via the <fragment> tag: id=0x"
            r3.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r8)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r12, r3)
        L184:
            r3 = r17
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            a.o7$b r5 = a.C0298o7.f620a
            a.m7 r5 = new a.m7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "Attempting to use <fragment> tag to add fragment "
            r6.<init>(r10)
            r6.append(r7)
            java.lang.String r10 = " to container "
            r6.append(r10)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r5.<init>(r7, r6)
            a.C0298o7.b(r5)
            a.o7$b r5 = a.C0298o7.a(r7)
            r5.getClass()
            r7.F = r3
            r2.k()
            r2.j()
            android.view.View r3 = r7.G
            if (r3 == 0) goto L1da
            if (r8 == 0) goto L1c0
            r3.setId(r8)
        L1c0:
            android.view.View r1 = r7.G
            java.lang.Object r1 = r1.getTag()
            if (r1 != 0) goto L1cd
            android.view.View r1 = r7.G
            r1.setTag(r9)
        L1cd:
            android.view.View r1 = r7.G
            a.a7$a r3 = new a.a7$a
            r3.<init>(r0, r2)
            r1.addOnAttachStateChangeListener(r3)
            android.view.View r1 = r7.G
            return r1
        L1da:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = " did not create a view."
            java.lang.String r1 = a.C0487z.g(r4, r1, r3)
            r2.<init>(r1)
            throw r2
        L1e6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r4.append(r3)
            java.lang.String r3 = ": Duplicate id 0x"
            r4.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r8)
            r4.append(r3)
            java.lang.String r3 = ", tag "
            r4.append(r3)
            r4.append(r9)
            java.lang.String r3 = ", or parent id 0x"
            r4.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r10)
            r4.append(r3)
            java.lang.String r3 = " with another fragment for "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L224:
            return r5
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }
}
