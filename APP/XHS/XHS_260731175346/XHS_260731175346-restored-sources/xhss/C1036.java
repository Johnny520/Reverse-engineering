package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛴᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1036 implements xhss.InterfaceC0645 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3345;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f3346;

    public /* synthetic */ C1036(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3345 = r1
            r0.f3346 = r2
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0645
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final java.lang.Object mo112(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            int r2 = r0.f3345
            r3 = -278112479053893(0xffff030ee47a77bb, double:NaN)
            r5 = -278078119315525(0xffff0316e47a77bb, double:NaN)
            r7 = -278176903563333(0xffff02ffe47a77bb, double:NaN)
            r9 = 0
            r10 = 0
            switch(r2) {
                case 0: goto L32e;
                case 1: goto L31f;
                case 2: goto L2da;
                case 3: goto L2c6;
                case 4: goto L2b7;
                case 5: goto L149;
                case 6: goto L12d;
                default: goto L1a;
            }
        L1a:
            java.lang.Object r0 = r0.f3346
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            xhss.ᛵᛴᛲᛵ r1 = (xhss.C0466) r1
            xhss.ᛵᛷᲈᛶ r2 = xhss.C0500.f1817
            r11 = -337825409370181(0xfffeccbfe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            java.lang.Object r11 = r1.f1683
            boolean r12 = r11 instanceof android.view.View
            if (r12 == 0) goto L33
            r9 = r11
            android.view.View r9 = (android.view.View) r9
        L33:
            if (r9 != 0) goto L37
            goto L12c
        L37:
            java.lang.Object r1 = r1.f1684
            if (r1 != 0) goto L3d
            goto L12c
        L3d:
            java.util.List r11 = xhss.AbstractC0990.f3209
            if (r11 == 0) goto L49
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L49
        L47:
            r11 = r10
            goto L74
        L49:
            java.util.Iterator r11 = r11.iterator()
        L4d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L47
            java.lang.Object r12 = r11.next()
            xhss.ᲀᛴᛳᛸ r12 = (xhss.C0857) r12
            java.lang.Class r13 = r1.getClass()
            java.lang.String r13 = r13.getName()
            r14 = -260296954710085(0xffff1342e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            java.lang.Object r12 = r12.f2768
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = xhss.AbstractC0120.m339(r13, r12, r10)
            if (r12 == 0) goto L4d
            r11 = 1
        L74:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r12 = 8
            if (r11 == 0) goto Ldc
            java.lang.ref.WeakReference r0 = xhss.AbstractC0990.f3211
            r3 = -260352789284933(0xffff1335e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᛳᛱᛲᛲ r0 = xhss.C0229.f861
            r0.getClass()
            xhss.ᛶᛳᲀᲇ r0 = xhss.C0229.f877
            xhss.ᛴᛲᛱᲇ[] r3 = xhss.C0229.f847
            r3 = r3[r10]
            java.lang.Object r0 = r0.m981(r3)
            java.lang.String r0 = (java.lang.String) r0
            r3 = -260369969154117(0xffff1331e47a77bb, double:NaN)
            java.lang.String r3 = "|"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.util.List r0 = xhss.AbstractC0120.m356(r0, r3)
            java.util.List r3 = xhss.AbstractC0990.f3209
            if (r3 == 0) goto Lb8
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Lb8
            goto L12c
        Lb8:
            java.util.Iterator r3 = r3.iterator()
        Lbc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L12c
            java.lang.Object r4 = r3.next()
            xhss.ᲀᛴᛳᛸ r4 = (xhss.C0857) r4
            java.lang.Object r5 = r4.f2768
            boolean r5 = xhss.AbstractC0007.m97(r5, r1)
            if (r5 == 0) goto Lbc
            java.lang.Object r4 = r4.f2767
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lbc
            r9.setVisibility(r12)
            goto L12c
        Ldc:
            boolean r9 = r0.contains(r1)
            if (r9 != 0) goto L12c
            xhss.ᛳᛱᛲᛲ r9 = xhss.C0229.f861
            r9.getClass()
            xhss.ᛶᛳᲀᲇ r9 = xhss.C0229.f862
            xhss.ᛴᛲᛱᲇ[] r11 = xhss.C0229.f847
            r11 = r11[r12]
            java.lang.Object r9 = r9.m981(r11)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L12c
            r0.add(r1)
            r11 = -337894128846917(0xfffeccafe47a77bb, double:NaN)
            java.lang.String r0 = "VideoHook: "
            java.lang.String r0 = r0.concat(r1)
            int r1 = xhss.AbstractC0390.m780(r7, r0, r5)
            if (r1 != 0) goto L110
            goto L12c
        L110:
            int r1 = r0.length()
        L114:
            if (r10 >= r1) goto L12c
            int r5 = r10 + 2000
            if (r5 <= r1) goto L11b
            r5 = r1
        L11b:
            java.lang.String r6 = r0.substring(r10, r5)
            xhss.AbstractC0775.m1313(r3)
            xhss.ᲇᲁᛱᛸ r7 = xhss.C1085.f3497
            r7.getClass()
            xhss.C1085.m1750(r6)
            r10 = r5
            goto L114
        L12c:
            return r2
        L12d:
            java.lang.Object r0 = r0.f3346
            xhss.ᲁᲀᛸᛶ r0 = (xhss.C0982) r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            android.widget.EditText r0 = r0.f3192
            r0.setEnabled(r1)
            if (r1 == 0) goto L141
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L143
        L141:
            r1 = 1056964608(0x3f000000, float:0.5)
        L143:
            r0.setAlpha(r1)
            xhss.ᛵᛷᲈᛶ r0 = xhss.C0500.f1817
            return r0
        L149:
            java.lang.Object r0 = r0.f3346
            xhss.ᲇᛶᛳᛵ r0 = (xhss.C1047) r0
            xhss.ᛵᛴᛲᛵ r1 = (xhss.C0466) r1
            xhss.ᛵᛷᲈᛶ r2 = xhss.C0500.f1817
            r11 = -319610453067845(0xfffedd50e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r11 = xhss.C1085.f3497
            java.lang.Object r12 = r1.f1684
            r13 = -319661992675397(0xfffedd44e47a77bb, double:NaN)
            java.lang.String r13 = "linker"
            r11.getClass()
            java.lang.Object r11 = xhss.C1085.m1768(r12, r13)
            r13 = -319692057446469(0xfffedd3de47a77bb, double:NaN)
            java.lang.String r13 = "getView"
            java.lang.Object[] r14 = new java.lang.Object[r10]
            if (r11 == 0) goto L1a7
            int r15 = xhss.AbstractC1080.f3479
            xhss.ᲇᛵᛲᲁ r11 = xhss.C0915.m1509(r11)
            java.lang.Object r15 = r11.f3349
            xhss.ᛸᛵᲇᲈ r15 = (xhss.C0772) r15
            r16 = r3
            r3 = 2
            r15.f2551 = r3
            xhss.ᛷᛴᲀᛳ r3 = r11.m1687()
            r3.m898()
            r3.f1795 = r13
            java.util.List r3 = r3.m1144()
            java.lang.Object r3 = xhss.AbstractC0713.m1240(r3)
            xhss.ᛲᲀᛱ r3 = (xhss.C0200) r3
            if (r3 == 0) goto L1a9
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r14, r10)
            java.lang.Object r3 = r3.m462(r4)
            goto L1aa
        L1a7:
            r16 = r3
        L1a9:
            r3 = r9
        L1aa:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 != 0) goto L1af
            goto L1b0
        L1af:
            r9 = r3
        L1b0:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            if (r9 != 0) goto L1b6
            goto L2b6
        L1b6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r13 = -319726417184837(0xfffedd35e47a77bb, double:NaN)
            java.lang.String r4 = "resultViewGroup = "
            r3.<init>(r4)
            int r4 = r9.getChildCount()
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            int r11 = xhss.AbstractC0390.m780(r7, r3, r5)
            if (r11 != 0) goto L1de
            goto L1fb
        L1de:
            int r11 = r3.length()
            r13 = r10
        L1e3:
            if (r13 >= r11) goto L1fb
            int r14 = r13 + 2000
            if (r14 <= r11) goto L1ea
            r14 = r11
        L1ea:
            java.lang.String r13 = r3.substring(r13, r14)
            xhss.AbstractC0775.m1313(r16)
            xhss.ᲇᲁᛱᛸ r15 = xhss.C1085.f3497
            r15.getClass()
            xhss.C1085.m1750(r13)
            r13 = r14
            goto L1e3
        L1fb:
            android.content.Context r3 = r9.getContext()
            int r11 = xhss.AbstractC1080.f3479
            xhss.ᲇᛵᛲᲁ r11 = xhss.C0915.m1509(r12)
            xhss.ᛵᛸᲈᛲ r11 = r11.m1695()
            java.lang.String r0 = r0.f3370
            r11.f1862 = r0
            java.util.List r0 = r11.m920()
            java.lang.Object r0 = xhss.AbstractC0713.m1240(r0)
            xhss.ᛸᛴᲁᛸ r0 = (xhss.C0759) r0
            int r11 = r9.getChildCount()
            r12 = r10
        L21c:
            if (r12 >= r11) goto L27a
            android.view.View r13 = r9.getChildAt(r12)
            r14 = -319808021563461(0xfffedd22e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r18 = -319876741040197(0xfffedd12e47a77bb, double:NaN)
            java.lang.String r15 = "child = "
            r14.<init>(r15)
            r14.append(r13)
            r14.append(r4)
            int r13 = r13.getVisibility()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            xhss.AbstractC0775.m1313(r7)
            xhss.AbstractC0775.m1313(r5)
            int r14 = r13.length()
            if (r14 != 0) goto L256
            goto L275
        L256:
            int r14 = r13.length()
            r15 = r10
        L25b:
            if (r15 >= r14) goto L275
            int r4 = r15 + 2000
            if (r4 <= r14) goto L262
            r4 = r14
        L262:
            java.lang.String r15 = r13.substring(r15, r4)
            xhss.AbstractC0775.m1313(r16)
            xhss.ᲇᲁᛱᛸ r18 = xhss.C1085.f3497
            r18.getClass()
            xhss.C1085.m1750(r15)
            r15 = r4
            r4 = 32
            goto L25b
        L275:
            int r12 = r12 + 1
            r4 = 32
            goto L21c
        L27a:
            xhss.ᲇᲁᛱᛸ r4 = xhss.C1085.f3497
            r4.getClass()
            xhss.C1085.m1752(r3)
            r4 = -319915395745861(0xfffedd09e47a77bb, double:NaN)
            java.lang.String r4 = "com.xingin.widgets.XYImageView"
            android.view.View r4 = xhss.C0614.m1071(r9, r4)
            xhss.ᛱᛷᛶᛸ r5 = xhss.C0063.f350
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = -320048539732037(0xfffedceae47a77bb, double:NaN)
            java.lang.String r7 = "firstImageView = "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r5.getClass()
            xhss.AbstractC1008.m1653(r6)
            if (r4 == 0) goto L2b6
            xhss.ᲇᛱᛵᲁ r5 = new xhss.ᲇᛱᛵᲁ
            r5.<init>(r1, r0, r3)
            r4.setOnLongClickListener(r5)
        L2b6:
            return r2
        L2b7:
            java.lang.Object r0 = r0.f3346
            xhss.ᲀᛸᛸᲁ r0 = (xhss.C0886) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            xhss.ᛷᛴᲇᲀ r0 = r0.m1451(r1)
            return r0
        L2c6:
            java.lang.Object r0 = r0.f3346
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            return r0
        L2da:
            xhss.ᛵᛷᲈᛶ r2 = xhss.C0500.f1817
            java.lang.Object r0 = r0.f3346
            java.util.Set r0 = (java.util.Set) r0
            xhss.ᛵᛴᛲᛵ r1 = (xhss.C0466) r1
            r3 = -348219230226501(0xfffec34be47a77bb, double:NaN)
        /* removed unused decoded string */ 
            java.lang.Object r3 = r1.f1684
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L2f3
            r9 = r3
            android.view.View r9 = (android.view.View) r9
        L2f3:
            if (r9 != 0) goto L2f6
            goto L31b
        L2f6:
            java.util.ArrayList r1 = r1.f1682
            java.lang.Object r1 = xhss.AbstractC0713.m1246(r1, r10)
            if (r1 != 0) goto L2ff
            goto L31b
        L2ff:
            java.lang.Class r3 = r1.getClass()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L30a
            goto L31b
        L30a:
            xhss.ᲈᲁᲈᲁ r0 = xhss.C1191.f3844
            r0.getClass()
            java.util.WeakHashMap r3 = xhss.C1191.f3842
            monitor-enter(r3)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L31c
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L31c
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L31c
            monitor-exit(r3)
        L31b:
            return r2
        L31c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L31f:
            java.lang.Object r0 = r0.f3346
            xhss.ᛶᛵᲈᛱ r0 = (xhss.C0565) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.f1997 = r1
            xhss.ᛵᛷᲈᛶ r0 = xhss.C0500.f1817
            return r0
        L32e:
            java.lang.Object r0 = r0.f3346
            xhss.ᛷᛴᛷᛱ r0 = (xhss.AbstractC0652) r0
            if (r1 != r0) goto L337
            java.lang.String r0 = "(this Collection)"
            goto L33b
        L337:
            java.lang.String r0 = java.lang.String.valueOf(r1)
        L33b:
            return r0
    }
}
