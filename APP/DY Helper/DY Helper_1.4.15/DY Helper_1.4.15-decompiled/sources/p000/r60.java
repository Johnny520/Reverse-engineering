package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r60 implements android.view.LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ε */
    public final p000.b70 f9270;

    public r60(p000.b70 r1) {
            r0 = this;
            r0.<init>()
            r0.f9270 = r1
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r17, java.lang.String r18, android.content.Context r19, android.util.AttributeSet r20) {
            r16 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r3 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r0)
            r4 = r16
            b70 r4 = r4.f9270
            if (r3 == 0) goto L1c
            androidx.fragment.app.FragmentContainerView r0 = new androidx.fragment.app.FragmentContainerView
            r0.<init>(r1, r2, r4)
            return r0
        L1c:
            java.lang.String r3 = "fragment"
            boolean r0 = r3.equals(r0)
            r3 = 0
            if (r0 != 0) goto L27
            goto L1fc
        L27:
            java.lang.String r0 = "class"
            java.lang.String r0 = r2.getAttributeValue(r3, r0)
            int[] r5 = p000.ik1.f5106
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r2, r5)
            r6 = 0
            if (r0 != 0) goto L3a
            java.lang.String r0 = r5.getString(r6)
        L3a:
            r7 = 1
            r8 = -1
            int r9 = r5.getResourceId(r7, r8)
            r10 = 2
            java.lang.String r11 = r5.getString(r10)
            r5.recycle()
            if (r0 == 0) goto L1fc
            java.lang.ClassLoader r5 = r1.getClassLoader()
            java.lang.Class r5 = p000.w60.m6322(r5, r0)     // Catch: java.lang.ClassNotFoundException -> L59
            java.lang.Class<n60> r12 = p000.n60.class
            boolean r5 = r12.isAssignableFrom(r5)     // Catch: java.lang.ClassNotFoundException -> L59
            goto L5a
        L59:
            r5 = r6
        L5a:
            if (r5 != 0) goto L5e
            goto L1fc
        L5e:
            if (r17 == 0) goto L64
            int r6 = r17.getId()
        L64:
            if (r6 != r8) goto L89
            if (r9 != r8) goto L89
            if (r11 == 0) goto L6b
            goto L89
        L6b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.getPositionDescription()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L89:
            if (r9 == r8) goto L90
            n60 r5 = r4.m757(r9)
            goto L91
        L90:
            r5 = r3
        L91:
            if (r5 != 0) goto Lde
            if (r11 == 0) goto Lde
            i0 r5 = r4.f1520
            java.lang.Object r12 = r5.f4857
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r13 = r12.size()
            int r13 = r13 - r7
        La0:
            if (r13 < 0) goto Lb7
            java.lang.Object r14 = r12.get(r13)
            n60 r14 = (p000.n60) r14
            if (r14 == 0) goto Lb4
            java.lang.String r15 = r14.f7403
            boolean r15 = r11.equals(r15)
            if (r15 == 0) goto Lb4
            r5 = r14
            goto Lde
        Lb4:
            int r13 = r13 + (-1)
            goto La0
        Lb7:
            java.lang.Object r5 = r5.f4858
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        Lc3:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto Ldd
            java.lang.Object r12 = r5.next()
            i70 r12 = (p000.i70) r12
            if (r12 == 0) goto Lc3
            n60 r12 = r12.f4942
            java.lang.String r13 = r12.f7403
            boolean r13 = r11.equals(r13)
            if (r13 == 0) goto Lc3
            r5 = r12
            goto Lde
        Ldd:
            r5 = r3
        Lde:
            if (r5 != 0) goto Le6
            if (r6 == r8) goto Le6
            n60 r5 = r4.m757(r6)
        Le6:
            java.lang.String r8 = "Fragment "
            java.lang.String r12 = "FragmentManager"
            if (r5 != 0) goto L140
            w60 r2 = r4.m759()
            r1.getClassLoader()
            n60 r5 = r2.m6324(r0)
            r5.f7434 = r7
            if (r9 == 0) goto Lfd
            r1 = r9
            goto Lfe
        Lfd:
            r1 = r6
        Lfe:
            r5.f7401 = r1
            r5.f7402 = r6
            r5.f7403 = r11
            r5.f7435 = r7
            r5.f7439 = r4
            p60 r1 = r4.f1537
            r5.f7440 = r1
            androidx.fragment.app.FragmentActivity r2 = r1.f8431
            r5.f7408 = r7
            if (r1 != 0) goto L114
            r1 = r3
            goto L116
        L114:
            androidx.fragment.app.FragmentActivity r1 = r1.f8430
        L116:
            if (r1 == 0) goto L11a
            r5.f7408 = r7
        L11a:
            i70 r1 = r4.m776(r5)
            boolean r2 = p000.b70.m751(r10)
            if (r2 == 0) goto L181
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            r2.append(r5)
            java.lang.String r4 = " has been inflated via the <fragment> tag: id=0x"
            r2.append(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r9)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r12, r2)
            goto L181
        L140:
            boolean r1 = r5.f7435
            if (r1 != 0) goto L1be
            r5.f7435 = r7
            r5.f7439 = r4
            p60 r1 = r4.f1537
            r5.f7440 = r1
            androidx.fragment.app.FragmentActivity r2 = r1.f8431
            r5.f7408 = r7
            if (r1 != 0) goto L154
            r1 = r3
            goto L156
        L154:
            androidx.fragment.app.FragmentActivity r1 = r1.f8430
        L156:
            if (r1 == 0) goto L15a
            r5.f7408 = r7
        L15a:
            i70 r1 = r4.m781(r5)
            boolean r2 = p000.b70.m751(r10)
            if (r2 == 0) goto L181
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Retained Fragment "
            r2.<init>(r4)
            r2.append(r5)
            java.lang.String r4 = " has been re-attached via the <fragment> tag: id=0x"
            r2.append(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r9)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r12, r2)
        L181:
            r2 = r17
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            j70 r4 = p000.k70.f5785
            g70 r4 = new g70
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Attempting to use <fragment> tag to add fragment "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r7 = " to container "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r4.<init>(r5, r6)
            p000.k70.m3176(r4)
            j70 r4 = p000.k70.m3175(r5)
            r4.getClass()
            r5.f7409 = r2
            r1.m2641()
            r1.m2640()
            java.lang.String r1 = " did not create a view."
            java.lang.String r0 = p000.lz1.m3674(r8, r0, r1)
            p000.C1080.m7279(r0)
            return r3
        L1be:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.getPositionDescription()
            java.lang.String r3 = java.lang.Integer.toHexString(r9)
            java.lang.String r4 = java.lang.Integer.toHexString(r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = ": Duplicate id 0x"
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = ", tag "
            r5.append(r2)
            r5.append(r11)
            java.lang.String r2 = ", or parent id 0x"
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = " with another fragment for "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r1.<init>(r0)
            throw r1
        L1fc:
            return r3
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r1 = r1.onCreateView(r0, r2, r3, r4)
            return r1
    }
}
