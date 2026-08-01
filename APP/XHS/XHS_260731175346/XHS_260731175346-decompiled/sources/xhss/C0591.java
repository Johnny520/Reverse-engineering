package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲀᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0591 implements xhss.InterfaceC0645 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2048;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2049;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2050;

    public /* synthetic */ C0591(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.f2048 = r1
            r0.f2049 = r2
            r0.f2050 = r3
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0645
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final java.lang.Object mo112(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f2048
            r1 = 0
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L307;
                case 1: goto L2f0;
                case 2: goto L15f;
                case 3: goto Lf6;
                default: goto L8;
            }
        L8:
            java.lang.Object r0 = r14.f2049
            xhss.ᛳᛲᲀᲈ r0 = (xhss.C0246) r0
            java.lang.Object r14 = r14.f2050
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.String r15 = (java.lang.String) r15
            r4 = -7606848817221(0xfffff914e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r4)
            java.lang.Object r1 = r0.f916
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r4 = r15.length()
            r5 = 8
            if (r4 != 0) goto L28
            r4 = r5
            goto L29
        L28:
            r4 = r2
        L29:
            r1.setVisibility(r4)
            java.lang.CharSequence r15 = xhss.AbstractC0120.m346(r15)
            java.lang.String r15 = r15.toString()
            int r1 = r15.length()
            if (r1 <= 0) goto L3c
            r1 = r3
            goto L3d
        L3c:
            r1 = r2
        L3d:
            java.util.Iterator r14 = r14.iterator()
        L41:
            r4 = r2
        L42:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto Ldc
            java.lang.Object r6 = r14.next()
            xhss.ᛵᛷᛷᛲ r6 = (xhss.C0493) r6
            java.util.List r7 = r6.f1806
            java.util.Iterator r7 = r7.iterator()
            r8 = r2
        L55:
            r9 = r8
        L56:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Lbc
            java.lang.Object r10 = r7.next()
            xhss.ᛷᛱᲁᲀ r10 = (xhss.C0628) r10
            r10.getClass()
            r11 = -10372807755845(0xfffff690e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r11)
            boolean r11 = xhss.AbstractC0120.m342(r15)
            if (r11 == 0) goto L75
        L73:
            r11 = r3
            goto La0
        L75:
            java.lang.String r11 = r10.f2160
            java.util.List r11 = java.util.Collections.singletonList(r11)
            java.util.List r12 = r10.f2158
            java.util.ArrayList r11 = xhss.AbstractC0713.m1237(r11, r12)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L89
        L87:
            r11 = r2
            goto La0
        L89:
            java.util.Iterator r11 = r11.iterator()
        L8d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L87
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = xhss.AbstractC0120.m339(r12, r15, r3)
            if (r12 == 0) goto L8d
            goto L73
        La0:
            android.widget.LinearLayout r12 = r10.f2159
            if (r11 == 0) goto La6
            r13 = r2
            goto La7
        La6:
            r13 = r5
        La7:
            r12.setVisibility(r13)
            android.view.View r10 = r10.f2161
            if (r10 == 0) goto Lb8
            if (r11 == 0) goto Lb4
            if (r9 == 0) goto Lb4
            r12 = r2
            goto Lb5
        Lb4:
            r12 = r5
        Lb5:
            r10.setVisibility(r12)
        Lb8:
            if (r11 == 0) goto L56
            r8 = r3
            goto L55
        Lbc:
            android.widget.TextView r7 = r6.f1803
            if (r1 == 0) goto Lc2
            r9 = r5
            goto Lc3
        Lc2:
            r9 = r2
        Lc3:
            r7.setVisibility(r9)
            android.widget.LinearLayout r7 = r6.f1804
            r7.setVisibility(r2)
            android.widget.LinearLayout r6 = r6.f1805
            if (r8 == 0) goto Ld1
            r7 = r2
            goto Ld2
        Ld1:
            r7 = r5
        Ld2:
            r6.setVisibility(r7)
            if (r4 != 0) goto Ld9
            if (r8 == 0) goto L41
        Ld9:
            r4 = r3
            goto L42
        Ldc:
            java.lang.Object r14 = r0.f915
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r4 == 0) goto Le4
            r15 = r5
            goto Le5
        Le4:
            r15 = r2
        Le5:
            r14.setVisibility(r15)
            java.lang.Object r14 = r0.f920
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            if (r4 == 0) goto Lef
            goto Lf0
        Lef:
            r2 = r5
        Lf0:
            r14.setVisibility(r2)
            xhss.ᛵᛷᲈᛶ r14 = xhss.C0500.f1817
            return r14
        Lf6:
            java.lang.Object r0 = r14.f2049
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r14 = r14.f2050
            xhss.ᛵᲇᲀᛳ r14 = (xhss.C0523) r14
            android.view.View r15 = (android.view.View) r15
            r4 = -7581079013445(0xfffff91ae47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r4)
            r15 = r0
        L109:
            boolean r2 = r15 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L11c
            boolean r2 = r15 instanceof android.app.Activity
            if (r2 == 0) goto L115
            r1 = r15
            android.app.Activity r1 = (android.app.Activity) r1
            goto L11c
        L115:
            android.content.ContextWrapper r15 = (android.content.ContextWrapper) r15
            android.content.Context r15 = r15.getBaseContext()
            goto L109
        L11c:
            xhss.ᛱᛴᛳᛴ r15 = xhss.C0036.m143(r0)
            r4 = -4011961190469(0xfffffc59e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r4)
            r15.f228 = r0
            r15.mo148()
            r4 = -4024846092357(0xfffffc56e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r4)
            r15.f235 = r0
            r15.mo148()
            r4 = -4110745438277(0xfffffc42e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r4)
            xhss.ᛲᛱᛷᛲ r2 = new xhss.ᛲᛱᛷᛲ
            r2.<init>(r3, r14, r1)
            r15.mo150(r0, r2)
            r0 = -4123630340165(0xfffffc3fe47a77bb, double:NaN)
            java.lang.String r14 = xhss.AbstractC0775.m1313(r0)
            r15.mo147(r14)
            r15.m151()
            xhss.ᛵᛷᲈᛶ r14 = xhss.C0500.f1817
            return r14
        L15f:
            xhss.ᛵᛷᲈᛶ r4 = xhss.C0500.f1817
            java.lang.Object r0 = r14.f2049
            r8 = r0
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.Object r14 = r14.f2050
            java.util.Set r14 = (java.util.Set) r14
            r9 = r15
            xhss.ᛸᲀᲇᛱ r9 = (xhss.C0803) r9
            r5 = -350791915636805(0xfffec0f4e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r5)
            xhss.ᲈᲁᲈᲁ r15 = xhss.C1191.f3844
            r15.getClass()
            boolean r15 = xhss.C1191.m1900()
            if (r15 == 0) goto L182
            goto L2ef
        L182:
            java.lang.Object r15 = r9.f2620
            if (r15 == 0) goto L2ef
            java.lang.Class r15 = r15.getClass()
            xhss.ᲈᛱᛱᲀ r15 = xhss.C1191.m1904(r15)
            java.util.Iterator r15 = r15.iterator()
        L192:
            r0 = r15
            xhss.ᛸᛴᲇᲁ r0 = (xhss.C0761) r0
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L1c8
            java.lang.Object r0 = r0.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r5 = r9.f2620     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L1b9
            if (r0 == 0) goto L1b7
            java.lang.Class r5 = r0.getClass()     // Catch: java.lang.Throwable -> L1b9
            boolean r5 = r14.contains(r5)     // Catch: java.lang.Throwable -> L1b9
            if (r5 == 0) goto L1b7
            goto L1c0
        L1b7:
            r0 = r1
            goto L1c0
        L1b9:
            r0 = move-exception
            xhss.ᲈᛳᛱᲇ r5 = new xhss.ᲈᛳᛱᲇ
            r5.<init>(r0)
            r0 = r5
        L1c0:
            boolean r5 = r0 instanceof xhss.C1129
            if (r5 == 0) goto L1c5
            r0 = r1
        L1c5:
            if (r0 == 0) goto L192
            goto L1c9
        L1c8:
            r0 = r1
        L1c9:
            if (r0 != 0) goto L1cd
            goto L2ef
        L1cd:
            r14 = -350864930080837(0xfffec0e3e47a77bb, double:NaN)
            java.lang.String r7 = xhss.AbstractC0775.m1313(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r5 = -350920764655685(0xfffec0d6e47a77bb, double:NaN)
            java.lang.String r15 = xhss.AbstractC0775.m1313(r5)
            r14.<init>(r15)
            java.lang.Class r15 = r8.getDeclaringClass()
            java.lang.String r15 = r15.getName()
            r14.append(r15)
            r15 = 46
            r14.append(r15)
            java.lang.String r15 = r8.getName()
            r14.append(r15)
            r5 = -350998074067013(0xfffec0c4e47a77bb, double:NaN)
            java.lang.String r15 = xhss.AbstractC0775.m1313(r5)
            r14.append(r15)
            java.lang.Class r15 = r0.getClass()
            java.lang.String r15 = r15.getName()
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            xhss.AbstractC0485.m882(r14)
            xhss.ᲈᲁᲈᲁ r14 = xhss.C1191.f3844
            r14.getClass()
            xhss.ᲇᛲᛲᛲ r14 = xhss.C1191.m1899(r7)
            xhss.ᲇᛲᛲᛲ r15 = xhss.EnumC1010.f3302
            if (r14 != r15) goto L228
            goto L2ef
        L228:
            java.lang.Object r15 = r9.f2620
            if (r15 != 0) goto L22e
            r15 = r1
            goto L24f
        L22e:
            java.util.WeakHashMap r3 = xhss.C1191.f3842
            monitor-enter(r3)
            java.lang.Object r15 = r3.get(r15)     // Catch: java.lang.Throwable -> L24a
            java.lang.ref.WeakReference r15 = (java.lang.ref.WeakReference) r15     // Catch: java.lang.Throwable -> L24a
            if (r15 == 0) goto L248
            java.lang.Object r15 = r15.get()     // Catch: java.lang.Throwable -> L24a
            android.view.View r15 = (android.view.View) r15     // Catch: java.lang.Throwable -> L24a
            if (r15 == 0) goto L248
            boolean r0 = xhss.C1191.m1901(r15)     // Catch: java.lang.Throwable -> L24a
            if (r0 == 0) goto L248
            goto L24e
        L248:
            r15 = r1
            goto L24e
        L24a:
            r0 = move-exception
            r14 = r0
            goto L2ed
        L24e:
            monitor-exit(r3)
        L24f:
            if (r15 != 0) goto L26b
            r14 = -351049613674565(0xfffec0b8e47a77bb, double:NaN)
            java.lang.String r14 = xhss.AbstractC0775.m1313(r14)
            java.lang.Class r15 = r8.getDeclaringClass()
            java.lang.String r15 = r15.getName()
            java.lang.String r14 = r14.concat(r15)
            xhss.AbstractC0485.m882(r14)
            goto L2ef
        L26b:
            xhss.ᛱᛶᛳ r6 = new xhss.ᛱᛶᛳ
            android.content.Context r0 = r15.getContext()
            java.util.List r15 = java.util.Collections.singletonList(r15)
            r6.<init>(r0, r15)
            boolean r15 = xhss.C1191.m1907(r6, r7)
            if (r15 != 0) goto L280
            goto L2ef
        L280:
            xhss.ᲇᛲᛲᛲ r15 = xhss.EnumC1010.f3303
            if (r14 != r15) goto L2a0
            r14 = -351195642562629(0xfffec096e47a77bb, double:NaN)
            java.lang.String r14 = xhss.AbstractC0775.m1313(r14)
            java.lang.Class r15 = r8.getDeclaringClass()
            java.lang.String r15 = r15.getName()
            java.lang.String r14 = r14.concat(r15)
            xhss.AbstractC0485.m882(r14)
            r9.m1375(r1)
            goto L2ef
        L2a0:
            android.content.Context r14 = r6.f330
            if (r14 != 0) goto L2b4
            xhss.C1191.m1906(r6, r7)
            r14 = -351290131843141(0xfffec080e47a77bb, double:NaN)
            java.lang.String r14 = xhss.AbstractC0775.m1313(r14)
            xhss.AbstractC0485.m882(r14)
            goto L2ef
        L2b4:
            java.util.ArrayList r15 = r9.f2618
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = xhss.AbstractC0249.m554(r15)
            r0.<init>(r3)
            java.util.Iterator r15 = r15.iterator()
        L2c3:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L2d1
            java.lang.Object r3 = r15.next()
            r0.add(r3)
            goto L2c3
        L2d1:
            java.lang.Object[] r15 = new java.lang.Object[r2]
            java.lang.Object[] r10 = r0.toArray(r15)
            xhss.ᲈᲁᲈᲁ r15 = xhss.C1191.f3844
            xhss.ᲈᛸᛳᛲ r5 = new xhss.ᲈᛸᛳᛲ
            r11 = 1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r14 = r15.m1914(r14, r7, r5)
            if (r14 != 0) goto L2e9
            xhss.C1191.m1906(r6, r7)
            goto L2ef
        L2e9:
            r9.m1375(r1)
            goto L2ef
        L2ed:
            monitor-exit(r3)
            throw r14
        L2ef:
            return r4
        L2f0:
            java.lang.Object r0 = r14.f2049
            xhss.ᛶᛳᲀᲇ r0 = (xhss.C0553) r0
            java.lang.Object r14 = r14.f2050
            xhss.ᛴᛲᛱᲇ r14 = (xhss.InterfaceC0336) r14
            java.lang.System.currentTimeMillis()
            xhss.ᛵᲇᛱᛴ r0 = r0.f1974
            xhss.ᛱᛱᛶᲁ r14 = (xhss.AbstractC0006) r14
            java.lang.String r14 = r14.f144
            r0.mo115(r14, r15)
            xhss.ᛵᛷᲈᛶ r14 = xhss.C0500.f1817
            return r14
        L307:
            java.lang.Object r0 = r14.f2049
            xhss.ᛵᛷᲈᛲ r0 = (xhss.C0499) r0
            java.lang.Object r14 = r14.f2050
            xhss.ᛳᛵᛲᲇ r14 = (xhss.RunnableC0269) r14
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            android.os.Handler r15 = r0.f1814
            r15.removeCallbacks(r14)
            xhss.ᛵᛷᲈᛶ r14 = xhss.C0500.f1817
            return r14
    }
}
