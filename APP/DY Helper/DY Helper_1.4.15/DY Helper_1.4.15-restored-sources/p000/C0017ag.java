package p000;

/* JADX INFO: renamed from: ag */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0017ag {

    /* JADX INFO: renamed from: α */
    public static final p000.C0017ag f217 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f218 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f219 = null;

    static {
            ag r0 = new ag
            r0.<init>()
            p000.C0017ag.f217 = r0
            java.lang.String r0 = "~78F34A746881AA3660EE86BE622F7993067D6CB566F11858AD9BF4EAEB5473E5B761566D88B7E9F0D235FFB471D623EECFB06F520B92CDFE6FB8E0A201745D8D76B2FEFFCBD4200CA4E520CE580E45E9520A0B4D880891FA5E"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~78E319B3AFE068530105B43DA61D1F01660D161F30123896CF063AF8C57AAB277F9106B66D102507008CF09DFE7ABA532ECFD554C6DCCF69B17B27B09EE45FAB8BDDE47ECB13758433A8BE8FC1FFB80571C33ED77D757929A9AB549FCF"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.C0017ag.f218 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C0017ag.f219 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.Class m104(org.luckypray.dexkit.result.ClassData r9, java.lang.ClassLoader r10) {
            r0 = 0
            if (r9 != 0) goto L4
            goto L3f
        L4:
            java.lang.Class<org.luckypray.dexkit.result.ClassData> r1 = org.luckypray.dexkit.result.ClassData.class
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L37
            r1.getClass()     // Catch: java.lang.Throwable -> L37
            int r2 = r1.length     // Catch: java.lang.Throwable -> L37
            r3 = 0
            r4 = r3
        L10:
            r5 = 1
            if (r4 >= r2) goto L3c
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = "getInstance"
            boolean r7 = p000.ln0.m3626(r7, r8)     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L39
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L37
            int r7 = r7.length     // Catch: java.lang.Throwable -> L37
            if (r7 != r5) goto L39
            java.lang.Class<java.lang.ClassLoader> r7 = java.lang.ClassLoader.class
            java.lang.Class[] r8 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L37
            r8 = r8[r3]     // Catch: java.lang.Throwable -> L37
            boolean r7 = r7.isAssignableFrom(r8)     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L39
            goto L3d
        L37:
            r9 = move-exception
            goto L54
        L39:
            int r4 = r4 + 1
            goto L10
        L3c:
            r6 = r0
        L3d:
            if (r6 != 0) goto L40
        L3f:
            return r0
        L40:
            r6.setAccessible(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L37
            java.lang.Object r9 = r6.invoke(r9, r10)     // Catch: java.lang.Throwable -> L37
            boolean r10 = r9 instanceof java.lang.Class     // Catch: java.lang.Throwable -> L37
            if (r10 == 0) goto L52
            java.lang.Class r9 = (java.lang.Class) r9     // Catch: java.lang.Throwable -> L37
            goto L5a
        L52:
            r9 = r0
            goto L5a
        L54:
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        L5a:
            boolean r10 = r9 instanceof p000.eo1
            if (r10 == 0) goto L5f
            goto L60
        L5f:
            r0 = r9
        L60:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static boolean m105(java.lang.Class r5) {
            java.lang.String r0 = m107(r5)
            r1 = 0
            if (r0 != 0) goto L8
            goto L35
        L8:
            java.lang.String r2 = "BOTTOM_BAR_CONTAINER"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L18
            java.lang.String r2 = "BUTTON_CONTAINER"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L35
        L18:
            java.lang.reflect.Method[] r5 = r5.getDeclaredMethods()
            r5.getClass()
            int r0 = r5.length
            r2 = r1
            r3 = r2
        L22:
            if (r2 >= r0) goto L31
            r4 = r5[r2]
            boolean r4 = m106(r4)
            if (r4 == 0) goto L2e
            int r3 = r3 + 1
        L2e:
            int r2 = r2 + 1
            goto L22
        L31:
            r5 = 1
            if (r3 != r5) goto L35
            return r5
        L35:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m106(java.lang.reflect.Method r3) {
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L41
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L15
            goto L41
        L15:
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.Class r1 = r3.getReturnType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L22
            goto L41
        L22:
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r0 = r3.length
            r1 = 3
            if (r0 != r1) goto L41
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r1 = 1
            r2 = r3[r1]
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L41
            r0 = 2
            r3 = r3[r0]
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            boolean r3 = r0.isAssignableFrom(r3)
            if (r3 == 0) goto L41
            return r1
        L41:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m107(java.lang.Class r8) {
            java.lang.String r0 = "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A314028F5A6C96A968724110CE5DD878D6654DCD64D754A5F498DF2F177829ACF900101545BD428"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.add(r8)
        L13:
            boolean r3 = r1.isEmpty()
            r4 = 0
            if (r3 != 0) goto Lf7
            java.lang.Object r3 = r1.removeFirst()
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r5 = r2.add(r3)
            if (r5 == 0) goto L13
            java.lang.String r5 = r3.getName()
            boolean r5 = r5.equals(r0)
            r6 = 0
            if (r5 == 0) goto Lda
            r0 = 1
            java.lang.reflect.Method[] r1 = r8.getDeclaredMethods()     // Catch: java.lang.Throwable -> L5d
            r1.getClass()     // Catch: java.lang.Throwable -> L5d
            int r2 = r1.length     // Catch: java.lang.Throwable -> L5d
        L3a:
            if (r6 >= r2) goto L62
            r3 = r1[r6]     // Catch: java.lang.Throwable -> L5d
            int r5 = r3.getModifiers()     // Catch: java.lang.Throwable -> L5d
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L5f
            java.lang.Class[] r5 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L5d
            r5.getClass()     // Catch: java.lang.Throwable -> L5d
            int r5 = r5.length     // Catch: java.lang.Throwable -> L5d
            if (r5 != 0) goto L5f
            java.lang.Class r5 = r3.getReturnType()     // Catch: java.lang.Throwable -> L5d
            boolean r5 = p000.ln0.m3626(r5, r8)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L5f
            goto L63
        L5d:
            r1 = move-exception
            goto L79
        L5f:
            int r6 = r6 + 1
            goto L3a
        L62:
            r3 = r4
        L63:
            if (r3 == 0) goto L6d
            r3.setAccessible(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = r3.invoke(r4, r4)     // Catch: java.lang.Throwable -> L5d
            goto L7f
        L6d:
            java.lang.reflect.Constructor r1 = r8.getDeclaredConstructor(r4)     // Catch: java.lang.Throwable -> L5d
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = r1.newInstance(r4)     // Catch: java.lang.Throwable -> L5d
            goto L7f
        L79:
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L7f:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L84
            r1 = r4
        L84:
            if (r1 != 0) goto L87
            goto Lf7
        L87:
            java.lang.reflect.Method[] r8 = r8.getMethods()
            r8.getClass()
            ss1 r8 = p000.AbstractC0312g7.m2232(r8)
            we r2 = new we
            r3 = 20
            r2.<init>(r3)
            y30 r3 = new y30
            r3.<init>(r8, r0, r2)
            tf r8 = new tf
            r0 = 1
            r8.<init>(r0)
            cu r0 = new cu
            r2 = 3
            r0.<init>(r3, r2, r8)
            ef r8 = new ef
            r2 = 1
            r8.<init>(r2, r1)
            y30 r8 = p000.us1.m5943(r0, r8)
            x30 r0 = new x30
            r0.<init>(r8)
        Lb9:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto Ld7
            java.lang.Object r8 = r0.next()
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "BOTTOM_BAR_CONTAINER"
            boolean r2 = p000.ln0.m3626(r1, r2)
            if (r2 != 0) goto Ld6
            java.lang.String r2 = "BUTTON_CONTAINER"
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto Lb9
        Ld6:
            r4 = r8
        Ld7:
            java.lang.String r4 = (java.lang.String) r4
            return r4
        Lda:
            java.lang.Class[] r4 = r3.getInterfaces()
            r4.getClass()
            int r5 = r4.length
        Le2:
            if (r6 >= r5) goto Lec
            r7 = r4[r6]
            r1.addLast(r7)
            int r6 = r6 + 1
            goto Le2
        Lec:
            java.lang.Class r3 = r3.getSuperclass()
            if (r3 == 0) goto L13
            r1.addLast(r3)
            goto L13
        Lf7:
            return r4
    }

    /* JADX INFO: renamed from: δ */
    public final java.util.ArrayList m108(java.lang.ClassLoader r14, boolean r15) {
            r13 = this;
            r14.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6263
            java.util.List r1 = p000.C0666ox.m4321(r0, r14)
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto L10
            r1 = r2
        L10:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r5 = m105(r5)
            if (r5 == 0) goto L19
            r3.add(r4)
            goto L19
        L30:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L3e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.String r6 = r6.getName()
            boolean r6 = r1.add(r6)
            if (r6 == 0) goto L3e
            r4.add(r5)
            goto L3e
        L59:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L60
            return r4
        L60:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r3 = p000.C0017ag.f218
            java.util.Iterator r4 = r3.iterator()
        L6b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class r5 = p000.AbstractC0093bx.m1082(r14, r5)
            if (r5 == 0) goto L6b
            r1.add(r5)
            goto L6b
        L81:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L8a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto La1
            java.lang.Object r5 = r1.next()
            r6 = r5
            java.lang.Class r6 = (java.lang.Class) r6
            boolean r6 = m105(r6)
            if (r6 == 0) goto L8a
            r4.add(r5)
            goto L8a
        La1:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        Laf:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lca
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r7 = r7.getName()
            boolean r7 = r1.add(r7)
            if (r7 == 0) goto Laf
            r5.add(r6)
            goto Laf
        Lca:
            r1 = 4
            java.lang.String r4 = "rb3b4f1f2616781f"
            r12 = 0
            if (r15 == 0) goto L1a8
            java.lang.Object r15 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r15 = p000.C0666ox.f8305
            boolean r15 = r15.get()
            if (r15 != 0) goto Ldc
            goto L1a8
        Ldc:
            java.lang.String r15 = "定位清爽模式底栏杂项注册器"
            bb r3 = new bb     // Catch: java.lang.Throwable -> Lea
            r6 = 8
            r3.<init>(r14, r13, r6)     // Catch: java.lang.Throwable -> Lea
            java.util.List r13 = p000.C0666ox.m4314(r0, r14, r15, r3)     // Catch: java.lang.Throwable -> Lea
            goto Lf2
        Lea:
            r0 = move-exception
            r13 = r0
            eo1 r14 = new eo1
            r14.<init>(r13)
            r13 = r14
        Lf2:
            java.lang.Throwable r14 = p000.fo1.m2190(r13)
            if (r14 == 0) goto L105
            java.lang.String r14 = r14.getMessage()
            java.lang.String r15 = "DexKit 定位底栏注册器失败: "
            java.lang.String r14 = p000.lz1.m3687(r15, r14)
            p000.C0888ux.m5988(r4, r14, r12, r1, r12)
        L105:
            boolean r14 = r13 instanceof p000.eo1
            if (r14 == 0) goto L10a
            goto L10b
        L10a:
            r12 = r13
        L10b:
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L110
            goto L111
        L110:
            r2 = r12
        L111:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r2.iterator()
        L11a:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L131
            java.lang.Object r15 = r14.next()
            r0 = r15
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = m105(r0)
            if (r0 == 0) goto L11a
            r13.add(r15)
            goto L11a
        L131:
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r13 = r13.iterator()
        L13f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L15a
            java.lang.Object r0 = r13.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            boolean r1 = r14.add(r1)
            if (r1 == 0) goto L13f
            r15.add(r0)
            goto L13f
        L15a:
            java.util.ArrayList r13 = p000.AbstractC0984xh.m6651(r5, r15)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L167:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L17e
            java.lang.Object r15 = r13.next()
            r0 = r15
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = m105(r0)
            if (r0 == 0) goto L167
            r14.add(r15)
            goto L167
        L17e:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L18c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L1a7
            java.lang.Object r0 = r14.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            boolean r1 = r13.add(r1)
            if (r1 == 0) goto L18c
            r15.add(r0)
            goto L18c
        L1a7:
            return r15
        L1a8:
            int r13 = r5.size()
            int r14 = r3.size()
            if (r13 != r14) goto L1fd
            boolean r13 = r5.isEmpty()
            if (r13 == 0) goto L1b9
            goto L1fd
        L1b9:
            java.lang.Object r13 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L1c1
            p000.C0666ox.m4325(r0, r5)     // Catch: java.lang.Throwable -> L1c1
            s62 r13 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1c1
            goto L1c9
        L1c1:
            r0 = move-exception
            r13 = r0
            eo1 r14 = new eo1
            r14.<init>(r13)
            r13 = r14
        L1c9:
            boolean r14 = r13 instanceof p000.eo1
            if (r14 != 0) goto L1ea
            r14 = r13
            s62 r14 = (p000.s62) r14
            we r10 = new we
            r14 = 15
            r10.<init>(r14)
            r11 = 31
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r14 = p000.AbstractC0984xh.m6644(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r15 = "保存底栏注册器缓存成功 reason=reflection_fallback classes="
            java.lang.String r14 = r15.concat(r14)
            p000.C0888ux.m5988(r4, r14, r12, r1, r12)
        L1ea:
            java.lang.Throwable r13 = p000.fo1.m2190(r13)
            if (r13 == 0) goto L1fd
            java.lang.String r13 = r13.getMessage()
            java.lang.String r14 = "保存底栏注册器缓存失败: "
            java.lang.String r13 = p000.lz1.m3687(r14, r13)
            p000.C0888ux.m5988(r4, r13, r12, r1, r12)
        L1fd:
            return r5
    }
}
