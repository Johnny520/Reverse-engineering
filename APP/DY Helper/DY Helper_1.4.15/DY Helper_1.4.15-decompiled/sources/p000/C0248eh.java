package p000;

/* JADX INFO: renamed from: eh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0248eh {

    /* JADX INFO: renamed from: α */
    public static final p000.C0248eh f3550 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f3551 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f3552 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f3553 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.Map f3554 = null;

    /* JADX INFO: renamed from: ζ */
    public static volatile boolean f3555;

    /* JADX INFO: renamed from: η */
    public static volatile java.lang.reflect.Method f3556;

    /* JADX INFO: renamed from: θ */
    public static volatile p000.C0930w0 f3557;

    static {
            eh r0 = new eh
            r0.<init>()
            p000.C0248eh.f3550 = r0
            dh r0 = new dh
            java.lang.String r1 = "~78A74DB286A5B58D592E394EF41C63DE20BC788EDC43993D9FE55BEEB53651A3D9FCA8F6DFFFA7C43B5D51C35C040DA683C463A6A38124B5FB87EE6088DA06E7332125C97D9CF2CC318B6F73"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r2 = "唱片"
            java.lang.String r3 = "3903 music cover"
            r0.<init>(r1, r2, r3)
            dh r1 = new dh
            java.lang.String r2 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B6D0672FD037E761E35B71F3B4E52AFBBE6B6AF8A56E29C8DCEEACC2ECCC88C7C8DD3FC35789B8235F2BE07881D34EC212579"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.String r3 = "听音乐"
            java.lang.String r4 = "3903 listen cover"
            r1.<init>(r2, r3, r4)
            dh[] r0 = new p000.C0212dh[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.C0248eh.f3551 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.C0248eh.f3552 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.C0248eh.f3553 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.C0248eh.f3554 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m1920() {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.C0248eh.f3553
            int r2 = r1.size()
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            r3 = 1
            if (r2 != 0) goto L26
            r2 = r3
            goto L2a
        L26:
            r0.add(r2)
            r2 = 0
        L2a:
            if (r2 != r3) goto Lf
            r1.remove()
            goto Lf
        L30:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static void m1921(java.lang.ClassLoader r16) {
            s62 r1 = p000.s62.f9751
            boolean r0 = p000.C0248eh.f3555
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "~78DBC59980EBBAB6E9CCD251AC4B8380FEA2F16AC26F2F72557622D1948C9C49C53378AB91649ED6CBF2598FFB50FA29875946BA0235B57F6A8007CB465B6B8313D1AFF15C31EDFED19A2993F74B0E421D5A3F"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L16
            r2 = r16
            java.lang.Class r0 = p000.qe0.m4876(r2, r0)     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L1d:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)
            r3 = 4
            java.lang.String r4 = "r9151163aa4084a59"
            r5 = 0
            if (r2 != 0) goto L20a
            r2 = r0
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.reflect.Method[] r0 = r2.getDeclaredMethods()
            r0.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r0.length
            r9 = 0
        L38:
            if (r9 >= r7) goto L7e
            r10 = r0[r9]
            int r11 = r10.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 != 0) goto L7b
            int r11 = r10.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isAbstract(r11)
            if (r11 != 0) goto L7b
            boolean r11 = r10.isBridge()
            if (r11 != 0) goto L7b
            boolean r11 = r10.isSynthetic()
            if (r11 != 0) goto L7b
            java.lang.Class r11 = r10.getReturnType()
            java.lang.Class r12 = java.lang.Integer.TYPE
            boolean r11 = p000.ln0.m3626(r11, r12)
            if (r11 == 0) goto L7b
            java.lang.Class[] r11 = r10.getParameterTypes()
            java.lang.Class<android.graphics.Bitmap> r12 = android.graphics.Bitmap.class
            java.lang.Class[] r12 = new java.lang.Class[]{r12}
            boolean r11 = java.util.Arrays.equals(r11, r12)
            if (r11 == 0) goto L7b
            r6.add(r10)
        L7b:
            int r9 = r9 + 1
            goto L38
        L7e:
            java.lang.reflect.Method[] r0 = r2.getDeclaredMethods()
            r0.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r9 = r0.length
            r10 = 0
        L8c:
            java.lang.Class r11 = java.lang.Void.TYPE
            if (r10 >= r9) goto Ld2
            r12 = r0[r10]
            int r13 = r12.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)
            if (r13 != 0) goto Lcf
            int r13 = r12.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isAbstract(r13)
            if (r13 != 0) goto Lcf
            boolean r13 = r12.isBridge()
            if (r13 != 0) goto Lcf
            boolean r13 = r12.isSynthetic()
            if (r13 != 0) goto Lcf
            java.lang.Class r13 = r12.getReturnType()
            boolean r11 = p000.ln0.m3626(r13, r11)
            if (r11 == 0) goto Lcf
            java.lang.Class[] r11 = r12.getParameterTypes()
            java.lang.Class r13 = java.lang.Boolean.TYPE
            java.lang.Class[] r13 = new java.lang.Class[]{r13, r13, r13}
            boolean r11 = java.util.Arrays.equals(r11, r13)
            if (r11 == 0) goto Lcf
            r7.add(r12)
        Lcf:
            int r10 = r10 + 1
            goto L8c
        Ld2:
            java.lang.Object r0 = p000.AbstractC0984xh.m6656(r7)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r9 = 1
            if (r0 == 0) goto Ldf
            r0.setAccessible(r9)
            goto Le0
        Ldf:
            r0 = r5
        Le0:
            p000.C0248eh.f3556 = r0
            int r0 = r7.size()
            if (r0 == r9) goto L109
            java.lang.String r0 = r2.getName()
            int r7 = r7.size()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "GL 唱片停止入口不唯一: class="
            r10.<init>(r12)
            r10.append(r0)
            java.lang.String r0 = ", count="
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = r10.toString()
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
        L109:
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
        L10e:
            boolean r0 = r6.hasNext()
            java.lang.String r10 = ", "
            if (r0 == 0) goto L165
            java.lang.Object r0 = r6.next()
            r12 = r0
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r12.setAccessible(r9)     // Catch: java.lang.Throwable -> L147
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L147
            xe r13 = new xe     // Catch: java.lang.Throwable -> L147
            r14 = 2
            r13.<init>(r14, r12)     // Catch: java.lang.Throwable -> L147
            r0.m6775(r12, r13)     // Catch: java.lang.Throwable -> L147
            int r7 = r7 + 1
            java.lang.String r0 = m1923(r12)     // Catch: java.lang.Throwable -> L147
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L147
            r13.<init>()     // Catch: java.lang.Throwable -> L147
            java.lang.String r14 = "GL 唱片启动 Hook 已安装: "
            r13.append(r14)     // Catch: java.lang.Throwable -> L147
            r13.append(r0)     // Catch: java.lang.Throwable -> L147
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L147
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)     // Catch: java.lang.Throwable -> L147
            r13 = r1
            goto L14d
        L147:
            r0 = move-exception
            eo1 r13 = new eo1
            r13.<init>(r0)
        L14d:
            java.lang.Throwable r0 = p000.fo1.m2190(r13)
            if (r0 == 0) goto L10e
            java.lang.String r12 = r12.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r13 = "GL 唱片启动 Hook 失败: "
            java.lang.String r0 = p000.a12.m18(r13, r12, r10, r0)
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
            goto L10e
        L165:
            java.lang.reflect.Method[] r0 = r2.getDeclaredMethods()
            r0.getClass()
            int r2 = r0.length
            r13 = r5
            r6 = 0
            r12 = 0
        L170:
            if (r6 >= r2) goto L1b1
            r14 = r0[r6]
            java.lang.String r15 = r14.getName()
            java.lang.String r8 = "LIZJ"
            boolean r8 = p000.ln0.m3626(r15, r8)
            if (r8 == 0) goto L1ae
            int r8 = r14.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L1ae
            int r8 = r14.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isAbstract(r8)
            if (r8 != 0) goto L1ae
            java.lang.Class r8 = r14.getReturnType()
            boolean r8 = p000.ln0.m3626(r8, r11)
            if (r8 == 0) goto L1ae
            java.lang.Class[] r8 = r14.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L1ae
            if (r12 == 0) goto L1ac
        L1aa:
            r13 = r5
            goto L1b4
        L1ac:
            r12 = r9
            r13 = r14
        L1ae:
            int r6 = r6 + 1
            goto L170
        L1b1:
            if (r12 != 0) goto L1b4
            goto L1aa
        L1b4:
            if (r13 == 0) goto L1fd
            r13.setAccessible(r9)     // Catch: java.lang.Throwable -> L1df
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L1df
            xe r2 = new xe     // Catch: java.lang.Throwable -> L1df
            r6 = 3
            r2.<init>(r6, r13)     // Catch: java.lang.Throwable -> L1df
            r0.m6775(r13, r2)     // Catch: java.lang.Throwable -> L1df
            int r7 = r7 + 1
            java.lang.String r0 = m1923(r13)     // Catch: java.lang.Throwable -> L1df
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1df
            r2.<init>()     // Catch: java.lang.Throwable -> L1df
            java.lang.String r6 = "GL 唱片恢复 Hook 已安装: "
            r2.append(r6)     // Catch: java.lang.Throwable -> L1df
            r2.append(r0)     // Catch: java.lang.Throwable -> L1df
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1df
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)     // Catch: java.lang.Throwable -> L1df
            goto L1e5
        L1df:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
        L1e5:
            java.lang.Throwable r0 = p000.fo1.m2190(r1)
            if (r0 == 0) goto L202
            java.lang.String r1 = r13.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "GL 唱片恢复 Hook 失败: "
            java.lang.String r0 = p000.a12.m18(r2, r1, r10, r0)
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
            goto L202
        L1fd:
            java.lang.String r0 = "GL 唱片恢复入口未命中: LIZJ"
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
        L202:
            if (r7 <= 0) goto L206
            r8 = r9
            goto L207
        L206:
            r8 = 0
        L207:
            p000.C0248eh.f3555 = r8
            return
        L20a:
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "GL 唱片类未命中: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m1922() {
            w0 r0 = p000.C0248eh.f3557     // Catch: java.lang.Throwable -> L18
            r1 = 0
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L18
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            if (r0 != r2) goto L13
            r1 = r2
        L13:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L1f:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L26
            goto L39
        L26:
            java.lang.String r0 = r1.getMessage()
            java.lang.String r1 = "GL 唱片策略读取失败: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            r1 = 4
            java.lang.String r2 = "r9151163aa4084a59"
            r3 = 0
            p000.C0888ux.m5988(r2, r0, r3, r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L39:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m1923(java.lang.reflect.Method r7) {
            java.lang.Class r0 = r7.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r7.getName()
            java.lang.Class[] r2 = r7.getParameterTypes()
            r2.getClass()
            we r3 = new we
            r4 = 27
            r3.<init>(r4)
            r4 = 30
            java.lang.String r5 = ","
            r6 = 0
            java.lang.String r2 = p000.AbstractC0312g7.m2256(r2, r5, r6, r3, r4)
            java.lang.Class r7 = r7.getReturnType()
            java.lang.String r7 = r7.getName()
            java.lang.String r3 = "#"
            java.lang.String r4 = "("
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r0, r3, r1, r4, r2)
            java.lang.String r1 = "):"
            java.lang.String r7 = p000.lz1.m3691(r0, r1, r7)
            return r7
    }

    /* JADX INFO: renamed from: ζ */
    public static void m1924(java.lang.Object r3, java.lang.String r4) {
            java.util.Map r0 = p000.C0248eh.f3554
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L61
            boolean r1 = p000.ln0.m3626(r1, r2)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L11
            r1 = 0
            goto L15
        L11:
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L61
            r1 = 1
        L15:
            monitor-exit(r0)
            if (r1 != 0) goto L19
            goto L60
        L19:
            java.lang.reflect.Method r1 = p000.C0248eh.f3556
            if (r1 != 0) goto L28
            monitor-enter(r0)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L25
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            return
        L25:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L33
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r2}     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch: java.lang.Throwable -> L33
            goto L3a
        L33:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L3a:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L60
            java.util.Map r1 = p000.C0248eh.f3554
            monitor-enter(r1)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5d
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r1)
            java.lang.String r3 = "r9151163aa4084a59"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "GL 唱片停止失败: reason="
            java.lang.String r2 = ", "
            java.lang.String r4 = p000.a12.m18(r1, r4, r2, r0)
            r0 = 4
            r1 = 0
            p000.C0888ux.m5988(r3, r4, r1, r0, r1)
            goto L60
        L5d:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
        L60:
            return
        L61:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: γ */
    public final void m1925(java.lang.ClassLoader r17, p000.C0212dh r18, p000.C0394ig r19) {
            r16 = this;
            r1 = r18
            java.lang.String r2 = r1.f3157
            java.lang.String r3 = r1.f3158
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = p000.C0248eh.f3552
            boolean r0 = r4.contains(r2)
            if (r0 == 0) goto L10
            goto L112
        L10:
            r0 = r17
            java.lang.Class r0 = p000.qe0.m4876(r0, r2)     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L1e:
            java.lang.Throwable r5 = p000.fo1.m2190(r0)
            java.lang.String r7 = "r9151163aa4084a59"
            r8 = 0
            if (r5 != 0) goto L113
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.Method[] r5 = r0.getDeclaredMethods()
            r5.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r5.length
            r11 = 0
        L37:
            r12 = 1
            if (r11 >= r10) goto L8e
            r13 = r5[r11]
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isStatic(r14)
            if (r14 != 0) goto L8b
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isAbstract(r14)
            if (r14 == 0) goto L51
            goto L8b
        L51:
            boolean r14 = r13.isBridge()
            if (r14 != 0) goto L8b
            boolean r14 = r13.isSynthetic()
            if (r14 == 0) goto L5e
            goto L8b
        L5e:
            java.lang.Class<android.view.View> r14 = android.view.View.class
            java.lang.Class r15 = r13.getReturnType()
            boolean r14 = r14.isAssignableFrom(r15)
            if (r14 != 0) goto L6b
            goto L8b
        L6b:
            java.lang.Class[] r14 = r13.getParameterTypes()
            int r15 = r14.length
            r6 = 3
            if (r15 != r6) goto L8b
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r12 = r14[r12]
            boolean r6 = r6.isAssignableFrom(r12)
            if (r6 == 0) goto L8b
            r6 = 2
            r6 = r14[r6]
            java.lang.Class<android.view.ViewGroup> r12 = android.view.ViewGroup.class
            boolean r6 = r12.isAssignableFrom(r6)
            if (r6 == 0) goto L8b
            r9.add(r13)
        L8b:
            int r11 = r11 + 1
            goto L37
        L8e:
            int r5 = r9.size()
            if (r5 == r12) goto Lbd
            java.lang.String r0 = r0.getName()
            int r1 = r9.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "创建入口不唯一，拒绝安装: class="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", count="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r1 = 4
            p000.C0888ux.m5988(r7, r0, r8, r1, r8)
            return
        Lbd:
            java.lang.Object r0 = p000.AbstractC0984xh.m6655(r9)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.setAccessible(r12)     // Catch: java.lang.Throwable -> Lf7
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Lf7
            qg r6 = new qg     // Catch: java.lang.Throwable -> Lf7
            r9 = 2
            r10 = r16
            r11 = r19
            r6.<init>(r10, r11, r1, r9)     // Catch: java.lang.Throwable -> Lf7
            r5.m6775(r0, r6)     // Catch: java.lang.Throwable -> Lf7
            r4.add(r2)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = m1923(r0)     // Catch: java.lang.Throwable -> Lf7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf7
            r1.<init>()     // Catch: java.lang.Throwable -> Lf7
            r1.append(r3)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r2 = "创建 Hook 已安装: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lf7
            r1.append(r0)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lf7
            r1 = 4
            p000.C0888ux.m5988(r7, r0, r8, r1, r8)     // Catch: java.lang.Throwable -> Lf7
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lf7
            goto Lfe
        Lf7:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lfe:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L112
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "创建 Hook 失败: "
            java.lang.String r0 = p000.lz1.m3688(r3, r1, r0)
            r1 = 4
            p000.C0888ux.m5988(r7, r0, r8, r1, r8)
        L112:
            return
        L113:
            r1 = 4
            java.lang.String r0 = r5.getMessage()
            java.lang.String r2 = "注册类未命中: "
            java.lang.String r0 = p000.lz1.m3688(r3, r2, r0)
            p000.C0888ux.m5988(r7, r0, r8, r1, r8)
            return
    }
}
