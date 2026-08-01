package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ql implements android.view.LayoutInflater.Factory2 {
    public final defpackage.yl a;

    public ql(defpackage.yl r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r19, java.lang.String r20, android.content.Context r21, android.util.AttributeSet r22) {
            r18 = this;
            r1 = r18
            r0 = r20
            r2 = r21
            r3 = r22
            yl r4 = r1.a
            r5 r5 = r4.c
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r6 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r6 = r6.getName()
            boolean r6 = r6.equals(r0)
            java.lang.String r7 = "Fragment "
            r8 = 0
            r9 = -1
            r10 = 0
            r11 = 1
            if (r6 == 0) goto L1cf
            androidx.fragment.app.FragmentContainerView r0 = new androidx.fragment.app.FragmentContainerView
            r0.<init>(r2, r3)
            r0.d = r11
            java.lang.String r6 = r3.getClassAttribute()
            int[] r12 = defpackage.uy.b
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r12)
            if (r6 != 0) goto L35
            java.lang.String r6 = r3.getString(r8)
        L35:
            java.lang.String r12 = r3.getString(r11)
            r3.recycle()
            int r3 = r0.getId()
            ml r13 = r4.v(r3)
            if (r6 == 0) goto L1a2
            if (r13 != 0) goto L1a2
            java.lang.String r13 = " with tag "
            if (r3 > 0) goto L61
            if (r12 == 0) goto L53
            java.lang.String r0 = r13.concat(r12)
            goto L55
        L53:
            java.lang.String r0 = ""
        L55:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "FragmentContainerView must have an android:id to add Fragment "
            java.lang.String r0 = defpackage.z30.j(r3, r6, r0)
            r2.<init>(r0)
            throw r2
        L61:
            tl r3 = r4.x()
            r2.getClassLoader()
            ml r2 = r3.a(r6)
            r2.C = r11
            nl r3 = r2.s
            if (r3 != 0) goto L74
            r3 = r10
            goto L76
        L74:
            androidx.fragment.app.FragmentActivity r3 = r3.C
        L76:
            if (r3 == 0) goto L7a
            r2.C = r11
        L7a:
            b7 r3 = new b7
            r3.<init>(r4)
            r3.o = r11
            r2.D = r0
            int r4 = r0.getId()
            java.lang.Class r6 = r2.getClass()
            int r14 = r6.getModifiers()
            boolean r15 = r6.isAnonymousClass()
            if (r15 != 0) goto L187
            boolean r15 = java.lang.reflect.Modifier.isPublic(r14)
            if (r15 == 0) goto L187
            boolean r15 = r6.isMemberClass()
            if (r15 == 0) goto La7
            boolean r14 = java.lang.reflect.Modifier.isStatic(r14)
            if (r14 == 0) goto L187
        La7:
            java.lang.String r6 = " now "
            java.lang.String r7 = ": was "
            if (r12 == 0) goto Ldc
            java.lang.String r14 = r2.x
            if (r14 == 0) goto Lda
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto Lb8
            goto Lda
        Lb8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't change tag of fragment "
            r3.<init>(r4)
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r2.x
            r3.append(r2)
            r3.append(r6)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        Lda:
            r2.x = r12
        Ldc:
            if (r4 == 0) goto L12d
            if (r4 == r9) goto L10e
            int r9 = r2.v
            if (r9 == 0) goto L109
            if (r9 != r4) goto Le7
            goto L109
        Le7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't change container ID of fragment "
            r3.<init>(r5)
            r3.append(r2)
            r3.append(r7)
            int r2 = r2.v
            r3.append(r2)
            r3.append(r6)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L109:
            r2.v = r4
            r2.w = r4
            goto L12d
        L10e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't add fragment "
            r3.<init>(r4)
            r3.append(r2)
            r3.append(r13)
            r3.append(r12)
            java.lang.String r2 = " to container view with no id"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L12d:
            em r4 = new em
            r4.<init>(r11, r2)
            r3.b(r4)
            yl r4 = r3.p
            r2.r = r4
            boolean r2 = r3.g
            if (r2 != 0) goto L17f
            nl r2 = r4.n
            if (r2 == 0) goto L1a2
            boolean r2 = r4.A
            if (r2 == 0) goto L146
            goto L1a2
        L146:
            r4.s(r11)
            java.util.ArrayList r2 = r4.C
            java.util.ArrayList r6 = r4.D
            r3.a(r2, r6)
            r4.b = r11
            java.util.ArrayList r2 = r4.C     // Catch: java.lang.Throwable -> L17a
            java.util.ArrayList r3 = r4.D     // Catch: java.lang.Throwable -> L17a
            r4.J(r2, r3)     // Catch: java.lang.Throwable -> L17a
            r4.d()
            r4.T()
            boolean r2 = r4.B
            if (r2 == 0) goto L168
            r4.B = r8
            r4.S()
        L168:
            r5 r2 = r4.c
            java.lang.Object r2 = r2.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r2 = r2.values()
            java.util.Set r3 = java.util.Collections.singleton(r10)
            r2.removeAll(r3)
            goto L1a2
        L17a:
            r0 = move-exception
            r4.d()
            throw r0
        L17f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "This transaction is already being added to the back stack"
            r0.<init>(r2)
            throw r0
        L187:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            java.lang.String r3 = r6.getCanonicalName()
            r2.append(r3)
            java.lang.String r3 = " must be a public static class to be  properly recreated from instance state."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L1a2:
            java.util.ArrayList r2 = r5.i()
            int r3 = r2.size()
        L1aa:
            if (r8 >= r3) goto L1ce
            java.lang.Object r4 = r2.get(r8)
            int r8 = r8 + 1
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            ml r5 = r4.c
            int r6 = r5.w
            int r7 = r0.getId()
            if (r6 != r7) goto L1aa
            android.view.View r6 = r5.E
            if (r6 == 0) goto L1aa
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L1aa
            r5.D = r0
            r4.b()
            goto L1aa
        L1ce:
            return r0
        L1cf:
            java.lang.String r6 = "fragment"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L1db
        L1d7:
            r17 = r10
            goto L3bb
        L1db:
            java.lang.String r0 = "class"
            java.lang.String r0 = r3.getAttributeValue(r10, r0)
            int[] r6 = defpackage.uy.a
            android.content.res.TypedArray r6 = r2.obtainStyledAttributes(r3, r6)
            if (r0 != 0) goto L1ed
            java.lang.String r0 = r6.getString(r8)
        L1ed:
            int r12 = r6.getResourceId(r11, r9)
            r13 = 2
            java.lang.String r14 = r6.getString(r13)
            r6.recycle()
            if (r0 == 0) goto L1d7
            java.lang.ClassLoader r6 = r2.getClassLoader()
            java.lang.Class r6 = defpackage.tl.b(r6, r0)     // Catch: java.lang.ClassNotFoundException -> L20a
            java.lang.Class<ml> r15 = defpackage.ml.class
            boolean r6 = r15.isAssignableFrom(r6)     // Catch: java.lang.ClassNotFoundException -> L20a
            goto L20b
        L20a:
            r6 = r8
        L20b:
            if (r6 != 0) goto L20e
            goto L1d7
        L20e:
            if (r19 == 0) goto L214
            int r8 = r19.getId()
        L214:
            if (r8 != r9) goto L239
            if (r12 != r9) goto L239
            if (r14 == 0) goto L21b
            goto L239
        L21b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r4.append(r3)
            java.lang.String r3 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        L239:
            if (r12 == r9) goto L240
            ml r6 = r4.v(r12)
            goto L241
        L240:
            r6 = r10
        L241:
            if (r6 != 0) goto L29b
            if (r14 == 0) goto L29b
            java.lang.Object r6 = r5.c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r15 = r6.size()
            int r15 = r15 - r11
        L24e:
            if (r15 < 0) goto L26f
            java.lang.Object r16 = r6.get(r15)
            r17 = r10
            r10 = r16
            ml r10 = (defpackage.ml) r10
            r20 = r13
            if (r10 == 0) goto L268
            java.lang.String r13 = r10.x
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L268
            r6 = r10
            goto L29f
        L268:
            int r15 = r15 + (-1)
            r13 = r20
            r10 = r17
            goto L24e
        L26f:
            r17 = r10
            r20 = r13
            java.lang.Object r5 = r5.b
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L27f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L298
            java.lang.Object r6 = r5.next()
            androidx.fragment.app.a r6 = (androidx.fragment.app.a) r6
            if (r6 == 0) goto L27f
            ml r6 = r6.c
            java.lang.String r10 = r6.x
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L27f
            goto L29f
        L298:
            r6 = r17
            goto L29f
        L29b:
            r17 = r10
            r20 = r13
        L29f:
            if (r6 != 0) goto L2a7
            if (r8 == r9) goto L2a7
            ml r6 = r4.v(r8)
        L2a7:
            java.lang.String r5 = "FragmentManager"
            if (r6 != 0) goto L300
            tl r3 = r4.x()
            r2.getClassLoader()
            ml r6 = r3.a(r0)
            r6.m = r11
            if (r12 == 0) goto L2bc
            r2 = r12
            goto L2bd
        L2bc:
            r2 = r8
        L2bd:
            r6.v = r2
            r6.w = r8
            r6.x = r14
            r6.n = r11
            r6.r = r4
            nl r2 = r4.n
            r6.s = r2
            androidx.fragment.app.FragmentActivity r3 = r2.D
            r6.C = r11
            if (r2 != 0) goto L2d4
            r10 = r17
            goto L2d6
        L2d4:
            androidx.fragment.app.FragmentActivity r10 = r2.C
        L2d6:
            if (r10 == 0) goto L2da
            r6.C = r11
        L2da:
            androidx.fragment.app.a r2 = r4.a(r6)
            boolean r3 = defpackage.yl.A(r20)
            if (r3 == 0) goto L342
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            r3.append(r6)
            java.lang.String r4 = " has been inflated via the <fragment> tag: id=0x"
            r3.append(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r12)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r5, r3)
            goto L342
        L300:
            boolean r2 = r6.n
            if (r2 != 0) goto L37d
            r6.n = r11
            r6.r = r4
            nl r2 = r4.n
            r6.s = r2
            androidx.fragment.app.FragmentActivity r3 = r2.D
            r6.C = r11
            if (r2 != 0) goto L315
            r10 = r17
            goto L317
        L315:
            androidx.fragment.app.FragmentActivity r10 = r2.C
        L317:
            if (r10 == 0) goto L31b
            r6.C = r11
        L31b:
            androidx.fragment.app.a r2 = r4.f(r6)
            boolean r3 = defpackage.yl.A(r20)
            if (r3 == 0) goto L342
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Retained Fragment "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = " has been re-attached via the <fragment> tag: id=0x"
            r3.append(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r12)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r5, r3)
        L342:
            r3 = r19
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r6.D = r3
            r2.k()
            r2.j()
            android.view.View r3 = r6.E
            if (r3 == 0) goto L371
            if (r12 == 0) goto L357
            r3.setId(r12)
        L357:
            android.view.View r0 = r6.E
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L364
            android.view.View r0 = r6.E
            r0.setTag(r14)
        L364:
            android.view.View r0 = r6.E
            pl r3 = new pl
            r3.<init>(r1, r2)
            r0.addOnAttachStateChangeListener(r3)
            android.view.View r0 = r6.E
            return r0
        L371:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = " did not create a view."
            java.lang.String r0 = defpackage.z30.j(r7, r0, r3)
            r2.<init>(r0)
            throw r2
        L37d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r4.append(r3)
            java.lang.String r3 = ": Duplicate id 0x"
            r4.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r12)
            r4.append(r3)
            java.lang.String r3 = ", tag "
            r4.append(r3)
            r4.append(r14)
            java.lang.String r3 = ", or parent id 0x"
            r4.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r8)
            r4.append(r3)
            java.lang.String r3 = " with another fragment for "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        L3bb:
            return r17
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }
}
