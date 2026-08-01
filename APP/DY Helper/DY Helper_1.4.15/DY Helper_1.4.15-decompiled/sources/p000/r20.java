package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r20 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9235;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f9236;

    public /* synthetic */ r20(java.lang.ClassLoader r1, int r2) {
            r0 = this;
            r0.f9235 = r2
            r0.f9236 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: β */
    private final java.lang.Object m5051() {
            r18 = this;
            f01 r2 = p000.f01.f3708
            r0 = r18
            java.lang.ClassLoader r1 = r0.f9236
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.f01.f3709
            r8 = 0
            r9 = 1
            boolean r0 = r0.compareAndSet(r8, r9)
            if (r0 != 0) goto L15
            goto L381
        L15:
            java.lang.String r0 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654A1A43A865BA113B69A131136202342FD5D6812BE2CB147B1C77B0708E61CA59B"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0, r8, r1)
            r0.getClass()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            int r3 = r0.length
            r5 = r8
            r6 = r5
            r7 = 0
        L2d:
            r10 = 2
            java.lang.Class<java.util.List> r11 = java.util.List.class
            java.lang.Class r12 = java.lang.Void.TYPE
            if (r5 >= r3) goto La8
            r13 = r0[r5]
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isStatic(r14)
            if (r14 != 0) goto La5
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isAbstract(r14)
            if (r14 == 0) goto La5
            boolean r14 = r13.isSynthetic()
            if (r14 != 0) goto La5
            boolean r14 = r13.isBridge()
            if (r14 != 0) goto La5
            java.lang.Class r14 = r13.getReturnType()
            boolean r14 = p000.ln0.m3626(r14, r12)
            if (r14 == 0) goto La5
            java.lang.Class[] r14 = r13.getParameterTypes()
            int r14 = r14.length
            r15 = 4
            if (r14 != r15) goto La5
            java.lang.Class[] r14 = r13.getParameterTypes()
            r14 = r14[r8]
            boolean r14 = r11.isAssignableFrom(r14)
            if (r14 == 0) goto La5
            java.lang.Class[] r14 = r13.getParameterTypes()
            r14 = r14[r9]
            java.lang.Class r15 = java.lang.Boolean.TYPE
            boolean r14 = p000.ln0.m3626(r14, r15)
            if (r14 == 0) goto La5
            java.lang.Class[] r14 = r13.getParameterTypes()
            r14 = r14[r10]
            java.lang.Class r15 = java.lang.Integer.TYPE
            boolean r14 = p000.ln0.m3626(r14, r15)
            if (r14 == 0) goto La5
            java.lang.Class[] r14 = r13.getParameterTypes()
            r15 = 3
            r14 = r14[r15]
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            boolean r14 = p000.ln0.m3626(r14, r15)
            if (r14 == 0) goto La5
            if (r6 == 0) goto La3
        La1:
            r7 = 0
            goto Lab
        La3:
            r6 = r9
            r7 = r13
        La5:
            int r5 = r5 + 1
            goto L2d
        La8:
            if (r6 != 0) goto Lab
            goto La1
        Lab:
            if (r7 == 0) goto L384
            r7.setAccessible(r9)
            java.lang.String r0 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620E3A3A1D1AE4984B0130504FE636AADD1ED8EE6AA121D6AFA1339BC461EA309AE889F"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r3 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B6C0A72FA07773D416EAB18344453BCB2FDEB9DC152E1B796D8F9C834EA89AE768FDFFD34619A8965D78C34830911F0322968"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.String r5 = "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E111C1B4BB7F14343F5C6CD5FDD30A372798B4288A83191C624025628F15585AEF37BDE93DDE9B58FB6F6F29F55"
            java.lang.String r5 = p000.jf0.m2957(r5)
            java.lang.String[] r0 = new java.lang.String[]{r0, r3, r5}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r0.iterator()
        Ld3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L16e
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r0 = java.lang.Class.forName(r0, r8, r1)     // Catch: java.lang.Throwable -> Le7
            r0.getClass()     // Catch: java.lang.Throwable -> Le7
            goto Lee
        Le7:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        Lee:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto Lf3
            r0 = 0
        Lf3:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L165
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            int r6 = r0.length
            r13 = r8
            r14 = r13
            r15 = 0
        L102:
            if (r13 >= r6) goto L15b
            r16 = r0[r13]
            int r17 = r16.getModifiers()
            boolean r17 = java.lang.reflect.Modifier.isStatic(r17)
            if (r17 != 0) goto L157
            int r17 = r16.getModifiers()
            boolean r17 = java.lang.reflect.Modifier.isAbstract(r17)
            if (r17 != 0) goto L157
            boolean r17 = r16.isSynthetic()
            if (r17 != 0) goto L157
            boolean r17 = r16.isBridge()
            if (r17 != 0) goto L157
            java.lang.String r4 = r16.getName()
            java.lang.String r10 = r7.getName()
            boolean r4 = p000.ln0.m3626(r4, r10)
            if (r4 == 0) goto L157
            java.lang.Class r4 = r16.getReturnType()
            java.lang.Class r10 = r7.getReturnType()
            boolean r4 = p000.ln0.m3626(r4, r10)
            if (r4 == 0) goto L157
            java.lang.Class[] r4 = r16.getParameterTypes()
            java.lang.Class[] r10 = r7.getParameterTypes()
            boolean r4 = java.util.Arrays.equals(r4, r10)
            if (r4 == 0) goto L157
            if (r14 == 0) goto L154
        L152:
            r15 = 0
            goto L15e
        L154:
            r14 = r9
            r15 = r16
        L157:
            int r13 = r13 + 1
            r10 = 2
            goto L102
        L15b:
            if (r14 != 0) goto L15e
            goto L152
        L15e:
            if (r15 != 0) goto L161
            goto L165
        L161:
            r15.setAccessible(r9)
            goto L166
        L165:
            r15 = 0
        L166:
            if (r15 == 0) goto L16b
            r3.add(r15)
        L16b:
            r10 = 2
            goto Ld3
        L16e:
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r3)
            java.util.List r10 = p000.AbstractC0984xh.m6666(r0)
            java.lang.String r0 = "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E111C1B4BB7F14343F5C6CD5FDD30A372798B4288A83191C624025628F15595A8E552FC96C7F391A7B8E1EF9915"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0, r8, r1)     // Catch: java.lang.Throwable -> L184
            r0.getClass()     // Catch: java.lang.Throwable -> L184
            goto L18b
        L184:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L18b:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L190
            r0 = 0
        L190:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L2ca
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            r1.getClass()
            int r3 = r1.length
            r4 = r8
            r5 = r4
            r6 = 0
        L19f:
            if (r4 >= r3) goto L1c6
            r7 = r1[r4]
            int r13 = r7.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)
            if (r13 != 0) goto L1c3
            java.lang.Class r13 = r7.getType()
            java.lang.String r13 = r13.getName()
            java.lang.String r14 = "androidx.recyclerview.widget.AsyncListDiffer"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L1c3
            if (r5 == 0) goto L1c1
        L1bf:
            r6 = 0
            goto L1c9
        L1c1:
            r6 = r7
            r5 = r9
        L1c3:
            int r4 = r4 + 1
            goto L19f
        L1c6:
            if (r5 != 0) goto L1c9
            goto L1bf
        L1c9:
            if (r6 != 0) goto L1ce
        L1cb:
            r4 = 0
            goto L2c8
        L1ce:
            java.lang.Class r1 = r6.getType()
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            r1.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.length
            r5 = r8
        L1e0:
            if (r5 >= r4) goto L23f
            r7 = r1[r5]
            int r13 = r7.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)
            if (r13 != 0) goto L20e
            boolean r13 = r7.isSynthetic()
            if (r13 != 0) goto L20e
            boolean r13 = r7.isBridge()
            if (r13 != 0) goto L20e
            java.lang.Class r13 = r7.getReturnType()
            boolean r13 = p000.ln0.m3626(r13, r12)
            if (r13 == 0) goto L20e
            java.lang.Class[] r13 = r7.getParameterTypes()
            r13.getClass()
            int r13 = r13.length
            if (r13 != 0) goto L210
        L20e:
            r14 = 2
            goto L23c
        L210:
            java.lang.Class[] r13 = r7.getParameterTypes()
            int r13 = r13.length
            r14 = 2
            if (r13 > r14) goto L23c
            java.lang.Class[] r13 = r7.getParameterTypes()
            r13 = r13[r8]
            boolean r13 = r11.isAssignableFrom(r13)
            if (r13 == 0) goto L23c
            java.lang.Class[] r13 = r7.getParameterTypes()
            int r13 = r13.length
            if (r13 == r9) goto L239
            java.lang.Class[] r13 = r7.getParameterTypes()
            r13 = r13[r9]
            java.lang.Class<java.lang.Runnable> r15 = java.lang.Runnable.class
            boolean r13 = r15.isAssignableFrom(r13)
            if (r13 == 0) goto L23c
        L239:
            r3.add(r7)
        L23c:
            int r5 = r5 + 1
            goto L1e0
        L23f:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L246
            goto L1cb
        L246:
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()
            r1.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
            r7 = r8
        L254:
            if (r7 >= r5) goto L297
            r11 = r1[r7]
            int r13 = r11.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)
            if (r13 != 0) goto L294
            boolean r13 = r11.isSynthetic()
            if (r13 != 0) goto L294
            boolean r13 = r11.isBridge()
            if (r13 != 0) goto L294
            java.lang.Class r13 = r11.getReturnType()
            boolean r13 = p000.ln0.m3626(r13, r12)
            if (r13 == 0) goto L294
            java.lang.Class[] r13 = r11.getParameterTypes()
            int r13 = r13.length
            if (r13 != r9) goto L294
            java.lang.Class[] r13 = r11.getParameterTypes()
            r13 = r13[r8]
            java.lang.String r13 = r13.getName()
            java.lang.String r14 = "androidx.recyclerview.widget.RecyclerView"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L294
            r4.add(r11)
        L294:
            int r7 = r7 + 1
            goto L254
        L297:
            r6.setAccessible(r9)
            java.util.Iterator r1 = r4.iterator()
        L29e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L2ae
            java.lang.Object r5 = r1.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.setAccessible(r9)
            goto L29e
        L2ae:
            java.util.Iterator r1 = r3.iterator()
        L2b2:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L2c2
            java.lang.Object r5 = r1.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.setAccessible(r9)
            goto L2b2
        L2c2:
            de0 r1 = new de0
            r1.<init>(r0, r6, r4, r3)
            r4 = r1
        L2c8:
            r11 = r4
            goto L2cb
        L2ca:
            r11 = 0
        L2cb:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L2db
            if (r11 == 0) goto L2d4
            goto L2db
        L2d4:
            java.lang.String r0 = "未找到消息顶部状态联系人提交入口"
            p000.ql1.m4936(r0)
        L2d9:
            r0 = 0
            return r0
        L2db:
            java.util.Iterator r0 = r10.iterator()
        L2df:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f9
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            xq0 r3 = p000.xq0.f12253
            xe r4 = new xe
            r5 = 9
            r6 = 0
            r4.<init>(r1, r5, r6)
            r3.m6775(r1, r4)
            goto L2df
        L2f9:
            if (r11 == 0) goto L346
            xq0 r0 = p000.xq0.f12253
            java.lang.Class r1 = r11.f3102
            e01 r3 = new e01
            r4 = 0
            r3.<init>(r11, r4)
            r0.m6773(r1, r3)
            java.util.ArrayList r0 = r11.f3104
            java.util.Iterator r0 = r0.iterator()
        L30e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L326
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            xq0 r3 = p000.xq0.f12253
            e01 r4 = new e01
            r5 = 1
            r4.<init>(r11, r5)
            r3.m6775(r1, r4)
            goto L30e
        L326:
            java.util.ArrayList r0 = r11.f3105
            java.util.Iterator r0 = r0.iterator()
        L32c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L346
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            xq0 r3 = p000.xq0.f12253
            xe r4 = new xe
            r5 = 8
            r6 = 0
            r4.<init>(r1, r5, r6)
            r3.m6775(r1, r4)
            goto L32c
        L346:
            be0 r12 = p000.be0.f1670
            w0 r0 = new w0
            r6 = 0
            r7 = 6
            r1 = 0
            java.lang.Class<f01> r3 = p000.f01.class
            java.lang.String r4 = "refreshActiveLists"
            java.lang.String r5 = "refreshActiveLists()V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12.m937()
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.be0.f1672
            r1.add(r0)
            int r0 = r10.size()
            if (r11 != 0) goto L365
            goto L366
        L365:
            r8 = r9
        L366:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "installed legacy="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " refactor="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "rd1fe9f51c470bd02"
            p000.C0888ux.m5975(r1, r0)
        L381:
            s62 r0 = p000.s62.f9751
            return r0
        L384:
            java.lang.String r0 = "未找到唯一消息顶部状态提交契约"
            p000.ql1.m4936(r0)
            goto L2d9
    }

    /* JADX INFO: renamed from: γ */
    private final java.lang.Object m5052() {
            r18 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.c72.f1985
            r0 = r18
            java.lang.ClassLoader r0 = r0.f9236
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.c72.f1985
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            s62 r4 = p000.s62.f9751
            if (r1 != 0) goto L16
            return r4
        L16:
            java.lang.String r1 = "~78BF3716A2F49FBB709742322D9206C6AF9F18144C2A212389359066D1B172F00485F222B90469CED248BF09C5C325293750AB1B2C2D95917FE2E821077EB3883B4360DCF5CCF9A7D0B8"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = p000.AbstractC0978xb.m6568(r0, r1)
            java.lang.String r5 = "~78AF64D165955DDE117C70B1E9A06054CFEF62BE1AC901EDEBA85E74FF9FAA32CC75A2F95CA3A5370AE3B02D480FB09CCD293109FD34B708C5136502B2CCACA3D7315477E30BA7256FF9626599C7"
            java.lang.String r5 = p000.jf0.m2957(r5)
            java.lang.Class r5 = p000.AbstractC0978xb.m6568(r0, r5)
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r5}
            java.util.ArrayList r1 = p000.AbstractC0312g7.m2248(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r1.next()
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            r6.getClass()
            ss1 r6 = p000.AbstractC0312g7.m2232(r6)
            zb0 r7 = new zb0
            r8 = 19
            r7.<init>(r8)
            y30 r8 = new y30
            r8.<init>(r6, r2, r7)
            zb0 r6 = new zb0
            r7 = 20
            r6.<init>(r7)
            y30 r7 = new y30
            r7.<init>(r8, r3, r6)
            zb0 r6 = new zb0
            r8 = 21
            r6.<init>(r8)
            t52 r8 = new t52
            r8.<init>(r7, r6)
            java.util.List r6 = p000.us1.m5948(r8)
            p000.AbstractC0984xh.m6660(r5, r6)
            goto L3b
        L7e:
            java.util.Set r1 = p000.AbstractC0984xh.m6670(r5)
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L8f:
            boolean r6 = r1.hasNext()
            java.lang.Class<java.util.List> r7 = java.util.List.class
            if (r6 == 0) goto Le3
            java.lang.Object r6 = r1.next()
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            r6.getClass()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r6.length
            r10 = r2
        Lab:
            if (r10 >= r9) goto Ldf
            r11 = r6[r10]
            int r12 = r11.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 != 0) goto Ldc
            boolean r12 = r11.isSynthetic()
            if (r12 != 0) goto Ldc
            boolean r12 = r11.isBridge()
            if (r12 != 0) goto Ldc
            java.lang.Class[] r12 = r11.getParameterTypes()
            r12.getClass()
            int r12 = r12.length
            if (r12 != 0) goto Ldc
            java.lang.Class r12 = r11.getReturnType()
            boolean r12 = r7.isAssignableFrom(r12)
            if (r12 == 0) goto Ldc
            r8.add(r11)
        Ldc:
            int r10 = r10 + 1
            goto Lab
        Ldf:
            p000.AbstractC0984xh.m6660(r5, r8)
            goto L8f
        Le3:
            java.util.Iterator r1 = r5.iterator()
        Le7:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Lf7
            java.lang.Object r6 = r1.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r3)
            goto Le7
        Lf7:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L105:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L120
            java.lang.Object r8 = r5.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r9 = p000.AbstractC0978xb.m6570(r9)
            boolean r9 = r1.add(r9)
            if (r9 == 0) goto L105
            r6.add(r8)
            goto L105
        L120:
            java.lang.String r1 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EAAFA1C1A05884F0130B0EF37A70ADCFAAAEF7E5341172E00E30A7691F8E16BD848E"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = p000.AbstractC0978xb.m6568(r0, r1)
            if (r1 == 0) goto L195
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = r1
        L132:
            if (r9 == 0) goto L148
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L148
            java.util.ArrayList r10 = p000.AbstractC0978xb.m6557(r9)
            p000.AbstractC0984xh.m6660(r8, r10)
            java.lang.Class r9 = r9.getSuperclass()
            goto L132
        L148:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L156:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L171
            java.lang.Object r11 = r8.next()
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.String r12 = p000.AbstractC0978xb.m6570(r12)
            boolean r12 = r9.add(r12)
            if (r12 == 0) goto L156
            r10.add(r11)
            goto L156
        L171:
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = p000.AbstractC1021yh.m6889(r10, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r10.iterator()
        L180:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L196
            java.lang.Object r10 = r9.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            fe0 r11 = new fe0
            r11.<init>(r1, r10)
            r8.add(r11)
            goto L180
        L195:
            r8 = 0
        L196:
            jz r1 = p000.C0450jz.f5672
            if (r8 != 0) goto L19b
            r8 = r1
        L19b:
            java.lang.String r9 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B73EB2FC055B4FF3BF52343C3E41D4B71FE679E18DDCFF5097664554D1C21787EB"
            java.lang.String r9 = p000.jf0.m2957(r9)
            java.lang.Class r9 = p000.AbstractC0978xb.m6568(r0, r9)
            java.lang.Class r10 = java.lang.Void.TYPE
            if (r9 == 0) goto L23c
            java.lang.reflect.Method[] r11 = r9.getDeclaredMethods()
            r11.getClass()
            int r12 = r11.length
            r13 = r2
            r14 = r13
            r15 = 0
        L1b4:
            if (r13 >= r12) goto L221
            r16 = r11[r13]
            int r17 = r16.getModifiers()
            boolean r17 = java.lang.reflect.Modifier.isStatic(r17)
            if (r17 != 0) goto L218
            boolean r17 = r16.isSynthetic()
            if (r17 != 0) goto L218
            boolean r17 = r16.isBridge()
            if (r17 != 0) goto L218
            r18 = 0
            java.lang.Class r5 = r16.getReturnType()
            boolean r5 = p000.ln0.m3626(r5, r10)
            if (r5 == 0) goto L215
            java.lang.Class[] r5 = r16.getParameterTypes()
            int r5 = r5.length
            r17 = r2
            r2 = 2
            if (r5 != r2) goto L21c
            java.lang.Class[] r2 = r16.getParameterTypes()
            r2 = r2[r17]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r2 = p000.ln0.m3626(r2, r5)
            if (r2 == 0) goto L21c
            java.lang.Class[] r2 = r16.getParameterTypes()
            r2 = r2[r3]
            boolean r2 = r7.isAssignableFrom(r2)
            if (r2 == 0) goto L21c
            java.lang.Class[] r2 = r16.getParameterTypes()
            r2 = r2[r3]
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            boolean r2 = r2.isAssignableFrom(r5)
            if (r2 == 0) goto L21c
            if (r14 == 0) goto L211
        L20e:
            r15 = r18
            goto L228
        L211:
            r14 = r3
            r15 = r16
            goto L21c
        L215:
            r17 = r2
            goto L21c
        L218:
            r17 = r2
            r18 = 0
        L21c:
            int r13 = r13 + 1
            r2 = r17
            goto L1b4
        L221:
            r17 = r2
            r18 = 0
            if (r14 != 0) goto L228
            goto L20e
        L228:
            if (r15 != 0) goto L22d
            r2 = r18
            goto L235
        L22d:
            r15.setAccessible(r3)
            fe0 r2 = new fe0
            r2.<init>(r9, r15)
        L235:
            if (r2 == 0) goto L240
            java.util.List r2 = p000.AbstractC1021yh.m6896(r2)
            goto L242
        L23c:
            r17 = r2
            r18 = 0
        L240:
            r2 = r18
        L242:
            if (r2 != 0) goto L245
            goto L246
        L245:
            r1 = r2
        L246:
            java.lang.String r2 = "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CECCA21FDEA59E6D1E697316E64ED89B0A30DD15E164C9063C01C2F6CC0352"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.Class r0 = p000.AbstractC0978xb.m6568(r0, r2)
            if (r0 == 0) goto L2b2
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            int r2 = r0.length
            r9 = r18
            r5 = r17
            r7 = r5
        L25f:
            if (r5 >= r2) goto L2a9
            r11 = r0[r5]
            int r12 = r11.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 != 0) goto L2a6
            boolean r12 = r11.isSynthetic()
            if (r12 != 0) goto L2a6
            boolean r12 = r11.isBridge()
            if (r12 != 0) goto L2a6
            java.lang.String r12 = r11.getName()
            java.lang.String r13 = "onCreate"
            boolean r12 = p000.ln0.m3626(r12, r13)
            if (r12 == 0) goto L2a6
            java.lang.Class r12 = r11.getReturnType()
            boolean r12 = p000.ln0.m3626(r12, r10)
            if (r12 == 0) goto L2a6
            java.lang.Class[] r12 = r11.getParameterTypes()
            java.lang.Class<android.os.Bundle> r13 = android.os.Bundle.class
            java.lang.Class[] r13 = new java.lang.Class[]{r13}
            boolean r12 = java.util.Arrays.equals(r12, r13)
            if (r12 == 0) goto L2a6
            if (r7 == 0) goto L2a4
        L2a1:
            r9 = r18
            goto L2ac
        L2a4:
            r7 = r3
            r9 = r11
        L2a6:
            int r5 = r5 + 1
            goto L25f
        L2a9:
            if (r7 != 0) goto L2ac
            goto L2a1
        L2ac:
            if (r9 == 0) goto L2b2
            r9.setAccessible(r3)
            goto L2b4
        L2b2:
            r9 = r18
        L2b4:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L2cf
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L2cf
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L2cf
            if (r9 == 0) goto L2c9
            goto L2cf
        L2c9:
            java.lang.String r0 = "未找到评论提及、Feed 用户搜索、输入联想或用户主页入口"
            p000.C1080.m7275(r0)
            return r18
        L2cf:
            java.util.Iterator r2 = r6.iterator()
            r5 = r17
        L2d5:
            boolean r0 = r2.hasNext()
            java.lang.String r6 = " hook unavailable: "
            java.lang.String r7 = "r3912affb67f40e11"
            if (r0 == 0) goto L331
            java.lang.Object r0 = r2.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class r10 = r0.getDeclaringClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "mention:"
            java.lang.String r10 = r11.concat(r10)
            xq0 r11 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L301
            py1 r12 = new py1     // Catch: java.lang.Throwable -> L301
            r13 = 15
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L301
            r11.m6775(r0, r12)     // Catch: java.lang.Throwable -> L301
            r11 = r4
            goto L307
        L301:
            r0 = move-exception
            eo1 r11 = new eo1
            r11.<init>(r0)
        L307:
            java.lang.Throwable r0 = p000.fo1.m2190(r11)
            if (r0 != 0) goto L311
            s62 r11 = (p000.s62) r11
            r0 = r3
            goto L32c
        L311:
            java.lang.String r11 = r0.getMessage()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r6)
            r12.append(r11)
            java.lang.String r6 = r12.toString()
            p000.C0888ux.m5977(r7, r6, r0)
            r0 = r17
        L32c:
            if (r0 == 0) goto L2d5
            int r5 = r5 + 1
            goto L2d5
        L331:
            java.util.Iterator r2 = r8.iterator()
            r8 = r17
        L337:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L394
            java.lang.Object r0 = r2.next()
            fe0 r0 = (p000.fe0) r0
            java.lang.reflect.Method r10 = r0.f3910
            java.lang.Class r10 = r10.getDeclaringClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "search:"
            java.lang.String r10 = r11.concat(r10)
            xq0 r11 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L365
            java.lang.reflect.Method r12 = r0.f3910     // Catch: java.lang.Throwable -> L365
            b72 r13 = new b72     // Catch: java.lang.Throwable -> L365
            r14 = r17
            r13.<init>(r0, r14)     // Catch: java.lang.Throwable -> L363
            r11.m6775(r12, r13)     // Catch: java.lang.Throwable -> L363
            r11 = r4
            goto L36d
        L363:
            r0 = move-exception
            goto L368
        L365:
            r0 = move-exception
            r14 = r17
        L368:
            eo1 r11 = new eo1
            r11.<init>(r0)
        L36d:
            java.lang.Throwable r0 = p000.fo1.m2190(r11)
            if (r0 != 0) goto L378
            s62 r11 = (p000.s62) r11
            int r8 = r8 + 1
            goto L391
        L378:
            java.lang.String r11 = r0.getMessage()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r6)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            p000.C0888ux.m5977(r7, r10, r0)
        L391:
            r17 = r14
            goto L337
        L394:
            r14 = r17
            java.util.Iterator r1 = r1.iterator()
            r2 = r14
        L39b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3f0
            java.lang.Object r0 = r1.next()
            fe0 r0 = (p000.fe0) r0
            java.lang.reflect.Method r10 = r0.f3910
            java.lang.Class r10 = r10.getDeclaringClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "suggestion:"
            java.lang.String r10 = r11.concat(r10)
            xq0 r11 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L3c5
            java.lang.reflect.Method r12 = r0.f3910     // Catch: java.lang.Throwable -> L3c5
            b72 r13 = new b72     // Catch: java.lang.Throwable -> L3c5
            r13.<init>(r0, r3)     // Catch: java.lang.Throwable -> L3c5
            r11.m6775(r12, r13)     // Catch: java.lang.Throwable -> L3c5
            r11 = r4
            goto L3cb
        L3c5:
            r0 = move-exception
            eo1 r11 = new eo1
            r11.<init>(r0)
        L3cb:
            java.lang.Throwable r0 = p000.fo1.m2190(r11)
            if (r0 != 0) goto L3d6
            s62 r11 = (p000.s62) r11
            int r2 = r2 + 1
            goto L39b
        L3d6:
            java.lang.String r11 = r0.getMessage()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r6)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            p000.C0888ux.m5977(r7, r10, r0)
            goto L39b
        L3f0:
            if (r9 == 0) goto L436
            java.lang.Class r0 = r9.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "profile:"
            java.lang.String r1 = r1.concat(r0)
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L40e
            py1 r10 = new py1     // Catch: java.lang.Throwable -> L40e
            r11 = 16
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L40e
            r0.m6775(r9, r10)     // Catch: java.lang.Throwable -> L40e
            r9 = r4
            goto L414
        L40e:
            r0 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r0)
        L414:
            java.lang.Throwable r0 = p000.fo1.m2190(r9)
            if (r0 != 0) goto L41d
            s62 r9 = (p000.s62) r9
            goto L437
        L41d:
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r6)
            r9.append(r3)
            java.lang.String r1 = r9.toString()
            p000.C0888ux.m5977(r7, r1, r0)
        L436:
            r3 = r14
        L437:
            int r0 = r5 + r8
            int r0 = r0 + r2
            int r0 = r0 + r3
            if (r0 <= 0) goto L45a
            java.lang.String r0 = " search="
            java.lang.String r1 = " suggestion="
            java.lang.String r6 = "installed mention="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r6, r5, r0, r8, r1)
            r0.append(r2)
            java.lang.String r1 = " profile="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r7, r0)
            return r4
        L45a:
            java.lang.String r0 = "发现与导航目标均未能安装"
            p000.C1080.m7279(r0)
            return r18
    }

    /* JADX INFO: renamed from: δ */
    private final java.lang.Object m5053() {
            r6 = this;
            l41 r0 = p000.l41.f6416
            java.lang.String r0 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.ClassLoader r6 = r6.f9236
            java.lang.Class r6 = p000.l41.m3483(r6, r0)
            if (r6 == 0) goto L15
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            goto L16
        L15:
            r6 = 0
        L16:
            r0 = 0
            if (r6 != 0) goto L1b
            java.lang.reflect.Method[] r6 = new java.lang.reflect.Method[r0]
        L1b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r6.length
        L21:
            if (r0 >= r2) goto L40
            r3 = r6[r0]
            r3.getClass()
            boolean r4 = p000.l41.m3488(r3)
            if (r4 == 0) goto L3d
            java.util.Set r4 = p000.l41.f6420
            java.lang.String r5 = r3.getName()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L3d
            r1.add(r3)
        L3d:
            int r0 = r0 + 1
            goto L21
        L40:
            return r1
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r29 = this;
            r0 = r29
            int r1 = r0.f9235
            java.lang.String r2 = "LJJJJLL"
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Class r4 = java.lang.Boolean.TYPE
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r8 = 6
            r9 = 8
            jz r11 = p000.C0450jz.f5672
            java.lang.Class r13 = java.lang.Void.TYPE
            r14 = 7
            r15 = 0
            s62 r17 = p000.s62.f9751
            r10 = 1
            java.lang.ClassLoader r12 = r0.f9236
            switch(r1) {
                case 0: goto Lc78;
                case 1: goto Lc5e;
                case 2: goto Lbeb;
                case 3: goto Lbe6;
                case 4: goto Lb06;
                case 5: goto La85;
                case 6: goto L9d9;
                case 7: goto L9d2;
                case 8: goto L9cb;
                case 9: goto L9c6;
                case 10: goto L53d;
                case 11: goto L328;
                case 12: goto L323;
                case 13: goto L14e;
                case 14: goto L149;
                case 15: goto L10f;
                case 16: goto L109;
                case 17: goto Lf7;
                case 18: goto Le7;
                case 19: goto Ld7;
                case 20: goto Lc7;
                case 21: goto Lb6;
                case 22: goto Lb2;
                case 23: goto Lac;
                case 24: goto La6;
                case 25: goto La2;
                case 26: goto L9e;
                case 27: goto L64;
                case 28: goto L5f;
                default: goto L21;
            }
        L21:
            l41 r0 = p000.l41.f6416
            java.lang.String r0 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r0 = p000.l41.m3483(r12, r0)
            if (r0 == 0) goto L34
            java.lang.reflect.Method[] r12 = r0.getDeclaredMethods()
            goto L35
        L34:
            r12 = 0
        L35:
            if (r12 != 0) goto L39
            java.lang.reflect.Method[] r12 = new java.lang.reflect.Method[r15]
        L39:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r12.length
        L3f:
            if (r15 >= r1) goto L5e
            r2 = r12[r15]
            r2.getClass()
            boolean r3 = p000.l41.m3488(r2)
            if (r3 == 0) goto L5b
            java.util.Set r3 = p000.l41.f6421
            java.lang.String r4 = r2.getName()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L5b
            r0.add(r2)
        L5b:
            int r15 = r15 + 1
            goto L3f
        L5e:
            return r0
        L5f:
            java.lang.Object r0 = r0.m5053()
            return r0
        L64:
            l41 r0 = p000.l41.f6416
            java.lang.String r0 = "X.C0IIU"
            java.lang.Class r0 = p000.l41.m3483(r12, r0)
            if (r0 == 0) goto L73
            java.lang.reflect.Method[] r12 = r0.getDeclaredMethods()
            goto L74
        L73:
            r12 = 0
        L74:
            if (r12 != 0) goto L78
            java.lang.reflect.Method[] r12 = new java.lang.reflect.Method[r15]
        L78:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r12.length
        L7e:
            if (r15 >= r1) goto L9d
            r2 = r12[r15]
            r2.getClass()
            boolean r3 = p000.l41.m3489(r2)
            if (r3 == 0) goto L9a
            java.util.Set r3 = p000.l41.f6417
            java.lang.String r4 = r2.getName()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L9a
            r0.add(r2)
        L9a:
            int r15 = r15 + 1
            goto L7e
        L9d:
            return r0
        L9e:
            p000.uv0.m5959(r12, r10)
            return r17
        La2:
            p000.uv0.m5958(r12, r10)
            return r17
        La6:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.tu0.f10462
            p000.tu0.m5745(r12, r10)
            return r17
        Lac:
            java.util.Set r0 = p000.cp0.f2703
            p000.cp0.m1605(r12, r10)
            return r17
        Lb2:
            p000.bk0.m971(r12, r10)
            return r17
        Lb6:
            r12.getClass()
            t20 r0 = new t20
            r1 = 5
            r0.<init>(r12, r1)
            kx r1 = p000.EnumC0491kx.f6281
            java.lang.String r2 = "适配互动消息数字清零入口"
            p000.C0966x.m6445(r1, r12, r2, r0)
            return r17
        Lc7:
            r12.getClass()
            t20 r0 = new t20
            r0.<init>(r12, r14)
            kx r1 = p000.EnumC0491kx.f6280
            java.lang.String r2 = "适配互动消息清未读入口"
            p000.C0966x.m6445(r1, r12, r2, r0)
            return r17
        Ld7:
            r12.getClass()
            t20 r0 = new t20
            r0.<init>(r12, r9)
            kx r1 = p000.EnumC0491kx.f6279
            java.lang.String r2 = "适配互动消息服务入口"
            p000.C0966x.m6445(r1, r12, r2, r0)
            return r17
        Le7:
            r12.getClass()
            t20 r0 = new t20
            r0.<init>(r12, r8)
            kx r1 = p000.EnumC0491kx.f6237
            java.lang.String r2 = "适配消息底栏未读同步入口"
            p000.C0966x.m6445(r1, r12, r2, r0)
            return r17
        Lf7:
            r12.getClass()
            t20 r0 = new t20
            r1 = 9
            r0.<init>(r12, r1)
            kx r1 = p000.EnumC0491kx.f6282
            java.lang.String r2 = "适配互动消息未读分组入口"
            p000.C0966x.m6445(r1, r12, r2, r0)
            return r17
        L109:
            wi0 r0 = p000.wi0.f11726
            r0.m6395(r12, r10)
            return r17
        L10f:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.a01.f4
            r12.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.a01.f4
            boolean r0 = r1.compareAndSet(r15, r10)
            if (r0 != 0) goto L11d
            goto L148
        L11d:
            p000.a01.m8(r12)     // Catch: java.lang.Throwable -> L132
            be0 r0 = p000.be0.f1670     // Catch: java.lang.Throwable -> L132
            kt0 r2 = new kt0     // Catch: java.lang.Throwable -> L132
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L132
            r0.m937()     // Catch: java.lang.Throwable -> L132
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.be0.f1672     // Catch: java.lang.Throwable -> L132
            r0.add(r2)     // Catch: java.lang.Throwable -> L132
            r2 = r17
            goto L138
        L132:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
        L138:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            if (r0 == 0) goto L148
            r1.set(r15)
            java.lang.String r1 = "rbe3d87ed96de26de"
            java.lang.String r2 = "安装消息页双击显示 Hook 失败"
            p000.C0888ux.m5977(r1, r2, r0)
        L148:
            return r17
        L149:
            java.lang.Object r0 = r0.m5052()
            return r0
        L14e:
            lv1 r3 = p000.lv1.f6813
            java.util.concurrent.ConcurrentHashMap$KeySetView r9 = p000.lv1.f6816
            r12.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.lv1.f6814
            boolean r0 = r0.compareAndSet(r15, r10)
            if (r0 != 0) goto L15f
            goto L320
        L15f:
            fk1 r0 = p000.fk1.f3997
            uu1 r1 = new uu1
            r7 = 0
            r8 = 7
            r2 = 1
            java.lang.Class<lv1> r4 = p000.lv1.class
            java.lang.String r5 = "installQuickShareTarget"
            java.lang.String r6 = "installQuickShareTarget(Ljava/lang/Class;)V"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.fk1.f4000
            r0.add(r1)
            java.util.concurrent.ConcurrentHashMap r0 = p000.fk1.f3999
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L183:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L198
            java.lang.Object r2 = r0.next()
            java.lang.Class r2 = (java.lang.Class) r2
            fk1 r3 = p000.fk1.f3997
            r2.getClass()
            p000.fk1.m2143(r1, r2)
            goto L183
        L198:
            fk1 r0 = p000.fk1.f3997
            r0.m2145(r12, r15)
            ge0 r0 = p000.AbstractC0978xb.m6575(r12)     // Catch: java.lang.Throwable -> L1a2
            goto L1a9
        L1a2:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L1a9:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            java.lang.String r2 = "rac25e39d95f0abcc"
            if (r1 == 0) goto L1ba
            java.lang.String r1 = r1.getMessage()
            java.lang.String r3 = "extended share targets unavailable: "
            p000.AbstractC0602nx.m4143(r3, r1, r2)
        L1ba:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L1bf
            r0 = 0
        L1bf:
            ge0 r0 = (p000.ge0) r0
            java.lang.String r1 = "installed quick="
            if (r0 != 0) goto L1f0
            r9.getClass()
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L1e8
            int r0 = r9.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r0)
            java.lang.String r0 = " extended=0"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p000.C0888ux.m5975(r2, r0)
            goto L320
        L1e8:
            java.lang.String r0 = "未找到可用的视频分享联系人目标"
            p000.C1080.m7279(r0)
            r12 = 0
            goto L322
        L1f0:
            java.util.List r3 = r0.f4344
            java.util.ArrayList r4 = r0.f4343
            java.util.ArrayList r5 = r0.f4342
            java.util.ArrayList r6 = r0.f4340
            java.util.ArrayList r7 = r0.f4339
            java.util.ArrayList r8 = r0.f4338
            java.util.ArrayList r11 = r0.f4336
            java.util.Iterator r12 = r11.iterator()
        L202:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L21c
            java.lang.Object r13 = r12.next()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            xq0 r14 = p000.xq0.f12253
            ad1 r15 = new ad1
            r10 = 24
            r15.<init>(r10)
            r14.m6775(r13, r15)
            r10 = 1
            goto L202
        L21c:
            java.util.Iterator r10 = r8.iterator()
        L220:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L23d
            java.lang.Object r12 = r10.next()
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            xq0 r13 = p000.xq0.f12253
            ak0 r14 = new ak0
            r16 = r3
            r3 = 1
            r15 = 0
            r14.<init>(r15, r12, r3)
            r13.m6775(r12, r14)
            r3 = r16
            goto L220
        L23d:
            r16 = r3
            java.util.Iterator r3 = r7.iterator()
        L243:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L25d
            java.lang.Object r10 = r3.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Class r12 = r0.f4337
            xq0 r13 = p000.xq0.f12253
            ak0 r14 = new ak0
            r15 = 1
            r14.<init>(r12, r10, r15)
            r13.m6775(r10, r14)
            goto L243
        L25d:
            r15 = 1
            java.util.Iterator r3 = r6.iterator()
        L262:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L27b
            java.lang.Object r10 = r3.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            xq0 r12 = p000.xq0.f12253
            ak0 r13 = new ak0
            r14 = 0
            r13.<init>(r14, r10, r15)
            r12.m6775(r10, r13)
            r15 = 1
            goto L262
        L27b:
            java.util.Iterator r3 = r5.iterator()
        L27f:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L298
            java.lang.Object r10 = r3.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Class r12 = r0.f4341
            xq0 r13 = p000.xq0.f12253
            ak0 r14 = new ak0
            r14.<init>(r12, r10)
            r13.m6775(r10, r14)
            goto L27f
        L298:
            java.util.Iterator r0 = r4.iterator()
        L29c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2b8
            java.lang.Object r3 = r0.next()
            fe0 r3 = (p000.fe0) r3
            java.lang.reflect.Method r10 = r3.f3910
            java.lang.Class r3 = r3.f3911
            xq0 r12 = p000.xq0.f12253
            ak0 r13 = new ak0
            r15 = 1
            r13.<init>(r3, r10, r15)
            r12.m6775(r10, r13)
            goto L29c
        L2b8:
            java.util.Iterator r0 = r16.iterator()
        L2bc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2d8
            java.lang.Object r3 = r0.next()
            fe0 r3 = (p000.fe0) r3
            java.lang.reflect.Method r10 = r3.f3910
            java.lang.Class r3 = r3.f3911
            xq0 r12 = p000.xq0.f12253
            ak0 r13 = new ak0
            r15 = 1
            r13.<init>(r3, r10, r15)
            r12.m6775(r10, r13)
            goto L2bc
        L2d8:
            int r0 = r9.size()
            int r3 = r11.size()
            int r8 = r8.size()
            int r7 = r7.size()
            int r6 = r6.size()
            int r5 = r5.size()
            int r4 = r4.size()
            int r9 = r16.size()
            java.lang.String r10 = " search="
            java.lang.String r11 = " select="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r1, r0, r10, r3, r11)
            java.lang.String r1 = " inherited="
            java.lang.String r3 = " fragment="
            p000.AbstractC0602nx.m4117(r0, r8, r1, r7, r3)
            java.lang.String r1 = " state="
            java.lang.String r3 = " sideSlip="
            p000.AbstractC0602nx.m4117(r0, r6, r1, r5, r3)
            r0.append(r4)
            java.lang.String r1 = " picker="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r2, r0)
        L320:
            r12 = r17
        L322:
            return r12
        L323:
            java.lang.Object r0 = r0.m5051()
            return r0
        L328:
            r19 = 0
            yz0 r23 = p000.yz0.f12886
            r12.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.yz0.f12887
            r3 = 1
            boolean r0 = r0.compareAndSet(r15, r3)
            if (r0 != 0) goto L33a
            goto L51f
        L33a:
            java.lang.String r0 = "~78ABF9C3EBB978C766D1EEE85DA4659DFA297141942A5334E9F5CC3DD42CA3B4D6DFF0D8D1EFDF53634CE4A40DAB271173B27391F0B8FB18B34C3CFA84E8948EC59BA598A7D46A70A968FC28657F83"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r12)
            r0.getClass()
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()
            r1.getClass()
            int r2 = r1.length
            r4 = r15
            r8 = r4
            r3 = r19
        L353:
            if (r8 >= r2) goto L39f
            r9 = r1[r8]
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L39c
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isAbstract(r10)
            if (r10 == 0) goto L39c
            boolean r10 = r9.isSynthetic()
            if (r10 != 0) goto L39c
            boolean r10 = r9.isBridge()
            if (r10 != 0) goto L39c
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            r11 = 1
            if (r10 != r11) goto L39c
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10 = r10[r15]
            boolean r10 = r10.isPrimitive()
            if (r10 != 0) goto L39c
            java.lang.Class r10 = r9.getReturnType()
            boolean r10 = r6.isAssignableFrom(r10)
            if (r10 == 0) goto L39c
            if (r4 == 0) goto L39a
        L397:
            r3 = r19
            goto L3a2
        L39a:
            r3 = r9
            r4 = 1
        L39c:
            int r8 = r8 + 1
            goto L353
        L39f:
            if (r4 != 0) goto L3a2
            goto L397
        L3a2:
            if (r3 == 0) goto L536
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
            r4 = r15
            r8 = r4
            r2 = r19
        L3b0:
            if (r8 >= r1) goto L416
            r9 = r0[r8]
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L413
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isAbstract(r10)
            if (r10 != 0) goto L413
            boolean r10 = r9.isSynthetic()
            if (r10 != 0) goto L413
            boolean r10 = r9.isBridge()
            if (r10 != 0) goto L413
            java.lang.Class r10 = r9.getReturnType()
            boolean r10 = p000.ln0.m3626(r10, r13)
            if (r10 == 0) goto L413
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            r11 = 2
            if (r10 != r11) goto L413
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10 = r10[r15]
            java.lang.Class[] r11 = r3.getParameterTypes()
            r11 = r11[r15]
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L413
            java.lang.Class[] r10 = r9.getParameterTypes()
            r20 = 1
            r10 = r10[r20]
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "kotlin.jvm.functions.Function0"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L413
            if (r4 == 0) goto L411
        L40e:
            r2 = r19
            goto L419
        L411:
            r2 = r9
            r4 = 1
        L413:
            int r8 = r8 + 1
            goto L3b0
        L416:
            if (r4 != 0) goto L419
            goto L40e
        L419:
            if (r2 == 0) goto L530
            r11 = 1
            r3.setAccessible(r11)
            r2.setAccessible(r11)
            java.lang.String r0 = "~7897B8FB4A9E8F3BF9B516DDE3F6FCD5574085CBE8B4160971D84C17A47E9E5D6FDC85A6F2DF47FADA98133A5045DBCD68E09AE32FB8CA375BF004475E41AAD7"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r12)
            r0.getClass()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
            r8 = r15
            r9 = r8
            r4 = r19
        L43b:
            if (r9 >= r1) goto L46d
            r10 = r0[r9]
            int r11 = r10.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 != 0) goto L46a
            java.lang.Class[] r11 = r10.getParameterTypes()
            java.lang.Class<java.lang.Integer> r12 = java.lang.Integer.class
            java.lang.Class[] r12 = new java.lang.Class[]{r12, r7}
            boolean r11 = java.util.Arrays.equals(r11, r12)
            if (r11 == 0) goto L46a
            java.lang.Class r11 = r10.getReturnType()
            boolean r11 = p000.ln0.m3626(r11, r13)
            if (r11 != 0) goto L46a
            if (r8 == 0) goto L468
        L465:
            r4 = r19
            goto L470
        L468:
            r4 = r10
            r8 = 1
        L46a:
            int r9 = r9 + 1
            goto L43b
        L46d:
            if (r8 != 0) goto L470
            goto L465
        L470:
            if (r4 == 0) goto L52a
            java.lang.Class r0 = r4.getReturnType()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
            r8 = r15
            r9 = r8
            r4 = r19
        L482:
            if (r9 >= r1) goto L4e0
            r10 = r0[r9]
            int r11 = r10.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 != 0) goto L4dd
            java.lang.Class r11 = r10.getReturnType()
            boolean r11 = p000.ln0.m3626(r11, r13)
            if (r11 == 0) goto L4dd
            java.lang.Class[] r11 = r10.getParameterTypes()
            int r11 = r11.length
            r12 = 3
            if (r11 != r12) goto L4dd
            java.lang.Class[] r11 = r10.getParameterTypes()
            r11 = r11[r15]
            boolean r11 = p000.ln0.m3626(r11, r7)
            if (r11 == 0) goto L4dd
            java.lang.Class[] r11 = r10.getParameterTypes()
            r20 = 1
            r11 = r11[r20]
            boolean r11 = r6.isAssignableFrom(r11)
            if (r11 == 0) goto L4dd
            java.lang.Class[] r11 = r10.getParameterTypes()
            r11 = r11[r20]
            boolean r11 = r11.isAssignableFrom(r5)
            if (r11 == 0) goto L4dd
            java.lang.Class[] r11 = r10.getParameterTypes()
            r18 = 2
            r11 = r11[r18]
            boolean r11 = r11.isEnum()
            if (r11 == 0) goto L4dd
            if (r8 == 0) goto L4db
        L4d8:
            r4 = r19
            goto L4e3
        L4db:
            r4 = r10
            r8 = 1
        L4dd:
            int r9 = r9 + 1
            goto L482
        L4e0:
            if (r8 != 0) goto L4e3
            goto L4d8
        L4e3:
            if (r4 == 0) goto L522
            r11 = 1
            r4.setAccessible(r11)
            xq0 r0 = p000.xq0.f12253
            qg r1 = new qg
            r1.<init>(r14, r2, r3)
            r0.m6775(r2, r1)
            xe r1 = new xe
            r1.<init>(r4, r14, r15)
            r0.m6775(r4, r1)
            be0 r0 = p000.be0.f1670
            w0 r21 = new w0
            r27 = 0
            r28 = 5
            r22 = 0
            java.lang.Class<yz0> r24 = p000.yz0.class
            java.lang.String r25 = "refreshActiveAdapters"
            java.lang.String r26 = "refreshActiveAdapters()V"
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r1 = r21
            r0.m937()
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.be0.f1672
            r0.add(r1)
            java.lang.String r0 = "r1e0d2867edbb56e0"
            java.lang.String r1 = "installed session_pipeline=1 search=1"
            p000.C0888ux.m5975(r0, r1)
        L51f:
            r12 = r17
            goto L53c
        L522:
            java.lang.String r0 = "未找到统一搜索结果发布方法"
            p000.ql1.m4936(r0)
        L527:
            r12 = r19
            goto L53c
        L52a:
            java.lang.String r0 = "未找到 ImSearchViewModelV2 搜索器工厂"
            p000.ql1.m4936(r0)
            goto L527
        L530:
            java.lang.String r0 = "未找到唯一会话列表 Diff 刷新入口"
            p000.ql1.m4936(r0)
            goto L527
        L536:
            java.lang.String r0 = "未找到唯一会话列表构建契约"
            p000.ql1.m4936(r0)
            goto L527
        L53c:
            return r12
        L53d:
            r19 = 0
            cn1 r2 = p000.cn1.f2212
            r12.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.cn1.f2213
            r11 = 1
            boolean r0 = r0.compareAndSet(r15, r11)
            if (r0 != 0) goto L54f
            goto L9bb
        L54f:
            java.lang.String r0 = "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059549CEEC8160D1645A93B03AD7181CF83CE4C7181C5CDC2A39C54C607876AD7E5AC80E6F5922D3B13B"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~789325E9C4B2AA228E18888457F2F91C62869634665744D0738ADF4686D18B8D617FDC9F3DD0608AAC394ABD089B3D7CD772D3263A57B23E74B13C816C44A1B74D"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r3 = "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C8D8DDD124631A67F6CA8AF59329658089AC491CA591519CA6919D74AF1F815D23C9E17C451AE0AE81B4"
            java.lang.String r8 = p000.jf0.m2957(r3)
            java.lang.String r9 = "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059554CBE58073CB245CD9A4238D1C0AB71EF1D52C5377DA2A3CCB494F647884794DCF0E6F5922D3B13B"
            java.lang.String r9 = p000.jf0.m2957(r9)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r8, r9}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L578:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L5a6
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Class r8 = p000.AbstractC0978xb.m6568(r12, r8)
            if (r8 != 0) goto L58d
        L58a:
            r10 = r19
            goto L5a0
        L58d:
            java.util.ArrayList r9 = p000.AbstractC0978xb.m6557(r8)
            java.lang.Object r9 = p000.AbstractC0984xh.m6656(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 != 0) goto L59a
            goto L58a
        L59a:
            ee0 r10 = new ee0
            r11 = 1
            r10.<init>(r9, r8, r15, r11)
        L5a0:
            if (r10 == 0) goto L578
            r1.add(r10)
            goto L578
        L5a6:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L5af:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L5cd
            java.lang.Object r8 = r1.next()
            r9 = r8
            ee0 r9 = (p000.ee0) r9
            java.lang.Class r9 = r9.f3519
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = p000.jf0.m2957(r3)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L5af
            goto L5cf
        L5cd:
            r8 = r19
        L5cf:
            ee0 r8 = (p000.ee0) r8
            java.lang.String r1 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134A8047955A5084AA23D57E17339D0A0C270D1781D47F429F9219E1F2DEEB97CD2DD45AEADF9D95A748226E"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r3 = "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836377D32BE7A7AC7622548C5CF9AE4AC67D9662B78E035F753B3E80AD9B5332717F492E0C5"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L5ee:
            boolean r9 = r1.hasNext()
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            if (r9 == 0) goto L6d0
            java.lang.Object r9 = r1.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Class r9 = p000.AbstractC0978xb.m6568(r12, r9)
            if (r9 != 0) goto L60c
        L602:
            r29 = r1
            r23 = r2
            r26 = r8
        L608:
            r15 = r19
            goto L6c1
        L60c:
            if (r8 == 0) goto L602
            java.lang.reflect.Method r11 = r8.f3518
            java.lang.Class r13 = r9.getSuperclass()
        L614:
            if (r13 == 0) goto L6ae
            boolean r21 = r13.equals(r10)
            if (r21 != 0) goto L6ae
            java.lang.reflect.Method[] r14 = r13.getDeclaredMethods()
            r14.getClass()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r29 = r1
            int r1 = r14.length
            r23 = r2
            r2 = 0
        L62e:
            if (r2 >= r1) goto L687
            r24 = r1
            r1 = r14[r2]
            int r25 = r1.getModifiers()
            boolean r25 = java.lang.reflect.Modifier.isStatic(r25)
            if (r25 != 0) goto L67c
            boolean r25 = r1.isSynthetic()
            if (r25 != 0) goto L67c
            boolean r25 = r1.isBridge()
            if (r25 != 0) goto L67c
            r25 = r2
            java.lang.String r2 = r1.getName()
            r26 = r8
            java.lang.String r8 = r11.getName()
            boolean r2 = p000.ln0.m3626(r2, r8)
            if (r2 == 0) goto L680
            java.lang.Class r2 = r1.getReturnType()
            java.lang.Class r8 = r11.getReturnType()
            boolean r2 = p000.ln0.m3626(r2, r8)
            if (r2 == 0) goto L680
            java.lang.Class[] r2 = r1.getParameterTypes()
            java.lang.Class[] r8 = r11.getParameterTypes()
            boolean r2 = java.util.Arrays.equals(r2, r8)
            if (r2 == 0) goto L680
            r15.add(r1)
            goto L680
        L67c:
            r25 = r2
            r26 = r8
        L680:
            int r2 = r25 + 1
            r1 = r24
            r8 = r26
            goto L62e
        L687:
            r26 = r8
            int r1 = r15.size()
            r2 = 1
            if (r1 <= r2) goto L693
        L690:
            r15 = r19
            goto L6b6
        L693:
            java.lang.Object r1 = p000.AbstractC0984xh.m6656(r15)
            r15 = r1
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            if (r15 == 0) goto L6a0
            r15.setAccessible(r2)
            goto L6b6
        L6a0:
            java.lang.Class r13 = r13.getSuperclass()
            r1 = r29
            r2 = r23
            r8 = r26
            r14 = 7
            r15 = 0
            goto L614
        L6ae:
            r29 = r1
            r23 = r2
            r26 = r8
            r2 = 1
            goto L690
        L6b6:
            if (r15 != 0) goto L6ba
            goto L608
        L6ba:
            ee0 r1 = new ee0
            r8 = 0
            r1.<init>(r15, r9, r8, r2)
            r15 = r1
        L6c1:
            if (r15 == 0) goto L6c6
            r3.add(r15)
        L6c6:
            r1 = r29
            r2 = r23
            r8 = r26
            r14 = 7
            r15 = 0
            goto L5ee
        L6d0:
            r23 = r2
            java.util.Iterator r1 = r3.iterator()
        L6d6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6e6
            java.lang.Object r2 = r1.next()
            ee0 r2 = (p000.ee0) r2
            r0.add(r2)
            goto L6d6
        L6e6:
            java.lang.String r1 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BE36B5FA44404BF5F45F392E3A1BDDAC42C132CD9ECBF24F8B727074D1C602B4D4"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r2 = "~788FC25F6ECFA50DD00C6DA13A7899CDD863E55178DDAE17670389C4CBEEA21BB6A89E77DB2ED9E42D8EECF2C9A0F474D904794CA12D6D1EFEA81D30FEE224C276466ED6F571"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L703:
            boolean r3 = r1.hasNext()
            java.lang.String r8 = "kotlin.coroutines.Continuation"
            if (r3 == 0) goto L7c6
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class r3 = p000.AbstractC0978xb.m6568(r12, r3)
            if (r3 != 0) goto L71d
            r29 = r1
        L719:
            r15 = r19
            goto L7bd
        L71d:
            java.lang.reflect.Method[] r9 = r3.getDeclaredMethods()
            r9.getClass()
            int r11 = r9.length
            r15 = r19
            r13 = 0
            r14 = 0
        L729:
            if (r14 >= r11) goto L7a9
            r24 = r9[r14]
            int r25 = r24.getModifiers()
            boolean r25 = java.lang.reflect.Modifier.isStatic(r25)
            if (r25 != 0) goto L79f
            boolean r25 = r24.isSynthetic()
            if (r25 != 0) goto L79f
            boolean r25 = r24.isBridge()
            if (r25 != 0) goto L79f
            r29 = r1
            java.lang.Class r1 = r24.getReturnType()
            boolean r1 = p000.ln0.m3626(r1, r10)
            if (r1 == 0) goto L79c
            java.lang.Class[] r1 = r24.getParameterTypes()
            int r1 = r1.length
            r25 = r9
            r9 = 3
            if (r1 != r9) goto L7a2
            java.lang.Class[] r1 = r24.getParameterTypes()
            r22 = 0
            r1 = r1[r22]
            boolean r1 = p000.ln0.m3626(r1, r7)
            if (r1 == 0) goto L7a2
            java.lang.Class[] r1 = r24.getParameterTypes()
            r20 = 1
            r1 = r1[r20]
            boolean r1 = r6.isAssignableFrom(r1)
            if (r1 == 0) goto L7a2
            java.lang.Class[] r1 = r24.getParameterTypes()
            r1 = r1[r20]
            boolean r1 = r1.isAssignableFrom(r5)
            if (r1 == 0) goto L7a2
            java.lang.Class[] r1 = r24.getParameterTypes()
            r18 = 2
            r1 = r1[r18]
            java.lang.String r1 = r1.getName()
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L7a2
            if (r13 == 0) goto L798
        L795:
            r15 = r19
            goto L7ae
        L798:
            r15 = r24
            r13 = 1
            goto L7a2
        L79c:
            r25 = r9
            goto L7a2
        L79f:
            r29 = r1
            goto L79c
        L7a2:
            int r14 = r14 + 1
            r1 = r29
            r9 = r25
            goto L729
        L7a9:
            r29 = r1
            if (r13 != 0) goto L7ae
            goto L795
        L7ae:
            if (r15 != 0) goto L7b2
            goto L719
        L7b2:
            r11 = 1
            r15.setAccessible(r11)
            ee0 r1 = new ee0
            r8 = 0
            r1.<init>(r15, r3, r11, r8)
            r15 = r1
        L7bd:
            if (r15 == 0) goto L7c2
            r2.add(r15)
        L7c2:
            r1 = r29
            goto L703
        L7c6:
            java.lang.String r1 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BE36B5FA44404BF5F45F392E3A1BC2A050C77FE8D1F2F67787526151C2D10BB4D4"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = p000.AbstractC0978xb.m6568(r12, r1)
            if (r1 != 0) goto L7d6
        L7d2:
            r15 = r19
            goto L86b
        L7d6:
            java.lang.reflect.Method[] r3 = r1.getDeclaredMethods()
            r3.getClass()
            int r7 = r3.length
            r15 = r19
            r9 = 0
            r11 = 0
        L7e2:
            if (r11 >= r7) goto L859
            r13 = r3[r11]
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isStatic(r14)
            if (r14 != 0) goto L852
            boolean r14 = r13.isSynthetic()
            if (r14 != 0) goto L852
            boolean r14 = r13.isBridge()
            if (r14 != 0) goto L852
            java.lang.Class r14 = r13.getReturnType()
            boolean r14 = p000.ln0.m3626(r14, r10)
            if (r14 == 0) goto L852
            java.lang.Class[] r14 = r13.getParameterTypes()
            int r14 = r14.length
            r29 = r3
            r3 = 3
            if (r14 != r3) goto L854
            java.lang.Class[] r3 = r13.getParameterTypes()
            r22 = 0
            r3 = r3[r22]
            boolean r3 = r6.isAssignableFrom(r3)
            if (r3 == 0) goto L854
            java.lang.Class[] r3 = r13.getParameterTypes()
            r3 = r3[r22]
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L854
            java.lang.Class[] r3 = r13.getParameterTypes()
            r20 = 1
            r3 = r3[r20]
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L854
            java.lang.Class[] r3 = r13.getParameterTypes()
            r18 = 2
            r3 = r3[r18]
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L854
            if (r9 == 0) goto L84f
        L84c:
            r15 = r19
            goto L85c
        L84f:
            r15 = r13
            r9 = 1
            goto L854
        L852:
            r29 = r3
        L854:
            int r11 = r11 + 1
            r3 = r29
            goto L7e2
        L859:
            if (r9 != 0) goto L85c
            goto L84c
        L85c:
            if (r15 != 0) goto L860
            goto L7d2
        L860:
            r11 = 1
            r15.setAccessible(r11)
            ee0 r3 = new ee0
            r8 = 0
            r3.<init>(r15, r1, r8, r8)
            r15 = r3
        L86b:
            java.util.List r1 = p000.AbstractC1021yh.m6898(r15)
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r2, r1)
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6651(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L885:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8c6
            java.lang.Object r2 = r0.next()
            r3 = r2
            ee0 r3 = (p000.ee0) r3
            java.lang.reflect.Method r4 = r3.f3518
            java.lang.String r4 = p000.AbstractC0978xb.m6570(r4)
            java.lang.Class r5 = r3.f3519
            java.lang.String r5 = r5.getName()
            int r3 = r3.f3520
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = "@"
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = ":"
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            boolean r3 = r1.add(r3)
            if (r3 == 0) goto L885
            r8.add(r2)
            goto L885
        L8c6:
            java.lang.String r0 = "~788FC25F6ECFA50DD00C6DA13A7899CDD863E55178DDAE17670887DCC2AFB813ACAAC36CD338D4E23588EDA885A8FA63D3591A60BA3A5B35E6AC053ADCC832DA5E6576D8C057"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572BB9CBA168999EC19B64CD4B34ABBFA246174AEFAB1EA23FD1714D0CFBED7F41E218105755558A1760623620D811B30D0186C91DC054E0A392"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L8e3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L913
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r0 = p000.AbstractC0978xb.m6568(r12, r0)
            if (r0 != 0) goto L8f8
            r15 = r19
            goto L90d
        L8f8:
            java.lang.reflect.Method r0 = p000.AbstractC0978xb.m6556(r0)     // Catch: java.lang.Throwable -> L8fe
            r15 = r0
            goto L905
        L8fe:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r15 = r3
        L905:
            boolean r0 = r15 instanceof p000.eo1
            if (r0 == 0) goto L90b
            r15 = r19
        L90b:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
        L90d:
            if (r15 == 0) goto L8e3
            r1.add(r15)
            goto L8e3
        L913:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r1 = r1.iterator()
        L921:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L93c
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = p000.AbstractC0978xb.m6570(r3)
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto L921
            r9.add(r2)
            goto L921
        L93c:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L9be
            java.util.Iterator r0 = r8.iterator()
        L946:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L960
            java.lang.Object r1 = r0.next()
            ee0 r1 = (p000.ee0) r1
            xq0 r2 = p000.xq0.f12253
            java.lang.reflect.Method r3 = r1.f3518
            nh r4 = new nh
            r5 = 7
            r4.<init>(r5, r1)
            r2.m6775(r3, r4)
            goto L946
        L960:
            java.util.Iterator r0 = r9.iterator()
        L964:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L97d
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            xq0 r2 = p000.xq0.f12253
            ad1 r3 = new ad1
            r4 = 15
            r3.<init>(r4)
            r2.m6775(r1, r3)
            goto L964
        L97d:
            be0 r10 = p000.be0.f1670
            w0 r0 = new w0
            r6 = 0
            r7 = 9
            r1 = 0
            java.lang.Class<cn1> r3 = p000.cn1.class
            java.lang.String r4 = "refreshActiveAdapters"
            java.lang.String r5 = "refreshActiveAdapters()V"
            r2 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.m937()
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.be0.f1672
            r1.add(r0)
            int r0 = r8.size()
            int r1 = r9.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "installed submit="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " bind="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "reae2c2e0c445b34d"
            p000.C0888ux.m5975(r1, r0)
        L9bb:
            r12 = r17
            goto L9c5
        L9be:
            java.lang.String r0 = "未找到任何已知关系列表提交入口"
            p000.C1080.m7275(r0)
            r12 = r19
        L9c5:
            return r12
        L9c6:
            r11 = r10
            p000.h30.m2349(r12, r11)
            return r17
        L9cb:
            r11 = r10
            b30 r0 = p000.b30.f1438
            r0.m708(r12, r11)
            return r17
        L9d2:
            r11 = r10
            b30 r0 = p000.b30.f1438
            r0.m710(r12, r11)
            return r17
        L9d9:
            r19 = 0
            java.lang.String r0 = "~791C379109EE249A17C75D97B08A46A1FBF5443CB34C0F44BBA61A1BA3C0B72730E4"
            java.lang.String r1 = p000.jf0.m2957(r0)
            r8 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r8, r12)     // Catch: java.lang.Throwable -> L9e8
            r15 = r0
            goto L9ef
        L9e8:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r15 = r2
        L9ef:
            boolean r0 = r15 instanceof p000.eo1
            if (r0 == 0) goto L9f5
            r15 = r19
        L9f5:
            java.lang.Class r15 = (java.lang.Class) r15
            if (r15 != 0) goto La10
            java.lang.Class r0 = r12.loadClass(r1)     // Catch: java.lang.Throwable -> L9fe
            goto La05
        L9fe:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        La05:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto La0c
            r12 = r19
            goto La0d
        La0c:
            r12 = r0
        La0d:
            r15 = r12
            java.lang.Class r15 = (java.lang.Class) r15
        La10:
            if (r15 != 0) goto La14
            goto La84
        La14:
            java.lang.reflect.Method[] r0 = r15.getDeclaredMethods()
            r0.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r0.length
            r15 = 0
        La22:
            if (r15 >= r1) goto La84
            r2 = r0[r15]
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto La31
            goto La81
        La31:
            java.lang.String r3 = r2.getName()
            if (r3 == 0) goto La81
            int r4 = r3.hashCode()
            switch(r4) {
                case -1749596860: goto La75;
                case -1393259383: goto La6c;
                case -1323224481: goto La63;
                case -1161550205: goto La5a;
                case -1148589626: goto La51;
                case 556873908: goto La48;
                case 1760690519: goto La3f;
                default: goto La3e;
            }
        La3e:
            goto La81
        La3f:
            java.lang.String r4 = "addPreloadMedias"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La7e
            goto La81
        La48:
            java.lang.String r4 = "insertPreloadMedia"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La7e
            goto La81
        La51:
            java.lang.String r4 = "addTask"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La81
            goto La7e
        La5a:
            java.lang.String r4 = "addPreloadModelMedia"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La7e
            goto La81
        La63:
            java.lang.String r4 = "startDataLoader"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La7e
            goto La81
        La6c:
            java.lang.String r4 = "addPriorityPreloadTask"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La7e
            goto La81
        La75:
            java.lang.String r4 = "setIntValue"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La7e
            goto La81
        La7e:
            r11.add(r2)
        La81:
            int r15 = r15 + 1
            goto La22
        La84:
            return r11
        La85:
            r19 = 0
            java.lang.String r0 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950A26F12973BD1F55377227BCD8D5E99"
            java.lang.String r1 = p000.jf0.m2957(r0)
            r8 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r8, r12)     // Catch: java.lang.Throwable -> La94
            r15 = r0
            goto La9b
        La94:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r15 = r4
        La9b:
            boolean r0 = r15 instanceof p000.eo1
            if (r0 == 0) goto Laa1
            r15 = r19
        Laa1:
            java.lang.Class r15 = (java.lang.Class) r15
            if (r15 != 0) goto Labc
            java.lang.Class r0 = r12.loadClass(r1)     // Catch: java.lang.Throwable -> Laaa
            goto Lab1
        Laaa:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lab1:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto Lab8
            r12 = r19
            goto Lab9
        Lab8:
            r12 = r0
        Lab9:
            r15 = r12
            java.lang.Class r15 = (java.lang.Class) r15
        Labc:
            if (r15 != 0) goto Labf
            goto Lb05
        Labf:
            java.lang.reflect.Method[] r0 = r15.getDeclaredMethods()
            r0.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r0.length
            r15 = 0
        Lacd:
            if (r15 >= r1) goto Lb05
            r4 = r0[r15]
            java.lang.Class r5 = r4.getReturnType()
            boolean r5 = p000.ln0.m3626(r5, r13)
            if (r5 == 0) goto Lb02
            java.lang.Class[] r5 = r4.getParameterTypes()
            java.lang.Class[] r6 = new java.lang.Class[]{r3}
            boolean r5 = java.util.Arrays.equals(r5, r6)
            if (r5 == 0) goto Lb02
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "onViewHolderSelected"
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 != 0) goto Laff
            java.lang.String r5 = r4.getName()
            boolean r5 = p000.ln0.m3626(r5, r2)
            if (r5 == 0) goto Lb02
        Laff:
            r11.add(r4)
        Lb02:
            int r15 = r15 + 1
            goto Lacd
        Lb05:
            return r11
        Lb06:
            r19 = 0
            java.lang.String r0 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114A712E5C4081A28670C45E2406907F30C98529BCD560A07F329B080"
            java.lang.String r1 = p000.jf0.m2957(r0)
            r8 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r8, r12)     // Catch: java.lang.Throwable -> Lb15
            r15 = r0
            goto Lb1c
        Lb15:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r15 = r2
        Lb1c:
            boolean r0 = r15 instanceof p000.eo1
            if (r0 == 0) goto Lb22
            r15 = r19
        Lb22:
            java.lang.Class r15 = (java.lang.Class) r15
            if (r15 != 0) goto Lb3d
            java.lang.Class r0 = r12.loadClass(r1)     // Catch: java.lang.Throwable -> Lb2b
            goto Lb32
        Lb2b:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lb32:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto Lb39
            r12 = r19
            goto Lb3a
        Lb39:
            r12 = r0
        Lb3a:
            r15 = r12
            java.lang.Class r15 = (java.lang.Class) r15
        Lb3d:
            if (r15 != 0) goto Lb41
            goto Lbe5
        Lb41:
            java.lang.reflect.Method[] r0 = r15.getDeclaredMethods()
            r0.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r0.length
            r8 = 0
        Lb4f:
            if (r8 >= r1) goto Lbe5
            r2 = r0[r8]
            java.lang.Class[] r5 = r2.getParameterTypes()
            java.lang.Class r6 = r2.getReturnType()
            boolean r6 = p000.ln0.m3626(r6, r4)
            if (r6 == 0) goto Lb7b
            int r6 = r5.length
            r7 = 2
            if (r6 != r7) goto Lb7b
            r22 = 0
            r6 = r5[r22]
            boolean r6 = p000.ln0.m3626(r6, r3)
            if (r6 == 0) goto Lb7b
            r20 = 1
            r6 = r5[r20]
            boolean r6 = p000.ln0.m3626(r6, r4)
            if (r6 == 0) goto Lb7b
            r6 = 1
            goto Lb7c
        Lb7b:
            r6 = 0
        Lb7c:
            java.lang.Class r7 = r2.getReturnType()
            java.lang.String r7 = r7.getName()
            java.lang.String r9 = "android.view.View"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto Lbb6
            int r7 = r5.length
            r9 = 3
            if (r7 != r9) goto Lbb6
            r22 = 0
            r7 = r5[r22]
            boolean r7 = p000.ln0.m3626(r7, r3)
            if (r7 == 0) goto Lbb6
            r20 = 1
            r7 = r5[r20]
            java.lang.String r7 = r7.getName()
            java.lang.String r9 = "android.view.ViewGroup"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto Lbb6
            r18 = 2
            r7 = r5[r18]
            boolean r7 = p000.ln0.m3626(r7, r4)
            if (r7 == 0) goto Lbb8
            r7 = 1
            goto Lbb9
        Lbb6:
            r18 = 2
        Lbb8:
            r7 = 0
        Lbb9:
            java.lang.Class r9 = r2.getReturnType()
            boolean r9 = p000.ln0.m3626(r9, r13)
            if (r9 == 0) goto Lbd7
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto Lbd7
            java.lang.String r5 = r2.getName()
            java.lang.String r9 = "preloadTypeConfig"
            boolean r5 = p000.ln0.m3626(r5, r9)
            if (r5 == 0) goto Lbd7
            r5 = 1
            goto Lbd8
        Lbd7:
            r5 = 0
        Lbd8:
            if (r6 != 0) goto Lbde
            if (r7 != 0) goto Lbde
            if (r5 == 0) goto Lbe1
        Lbde:
            r11.add(r2)
        Lbe1:
            int r8 = r8 + 1
            goto Lb4f
        Lbe5:
            return r11
        Lbe6:
            java.util.List r0 = p000.pd2.m4467(r12)
            return r0
        Lbeb:
            r19 = 0
            java.lang.String r0 = "~78B38367CFE852F14F689594842A0085750A11DB0443EB2AFF250DFFBABD88BD10A5BD02F440065394451D69947F04BBCE04B57E6716670F470E23AF1A7836C1D4E3DA9F3C8C5B0E78"
            java.lang.String r1 = p000.jf0.m2957(r0)
            r8 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r8, r12)     // Catch: java.lang.Throwable -> Lbfa
            r15 = r0
            goto Lc01
        Lbfa:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r15 = r3
        Lc01:
            boolean r0 = r15 instanceof p000.eo1
            if (r0 == 0) goto Lc07
            r15 = r19
        Lc07:
            java.lang.Class r15 = (java.lang.Class) r15
            if (r15 != 0) goto Lc22
            java.lang.Class r0 = r12.loadClass(r1)     // Catch: java.lang.Throwable -> Lc10
            goto Lc17
        Lc10:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lc17:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto Lc1e
            r12 = r19
            goto Lc1f
        Lc1e:
            r12 = r0
        Lc1f:
            r15 = r12
            java.lang.Class r15 = (java.lang.Class) r15
        Lc22:
            if (r15 != 0) goto Lc25
            goto Lc5d
        Lc25:
            java.lang.reflect.Method[] r0 = r15.getDeclaredMethods()
            r0.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r0.length
            r15 = r8
        Lc33:
            if (r15 >= r1) goto Lc5d
            r3 = r0[r15]
            java.lang.Class r4 = r3.getReturnType()
            boolean r4 = p000.ln0.m3626(r4, r13)
            if (r4 == 0) goto Lc5a
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "LJJJJZ"
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto Lc57
            java.lang.String r4 = r3.getName()
            boolean r4 = p000.ln0.m3626(r4, r2)
            if (r4 == 0) goto Lc5a
        Lc57:
            r11.add(r3)
        Lc5a:
            int r15 = r15 + 1
            goto Lc33
        Lc5d:
            return r11
        Lc5e:
            java.lang.ClassLoader r1 = r0.f9236
            r1.getClass()
            r20 r4 = new r20
            r9 = 3
            r4.<init>(r1, r9)
            bb r5 = new bb
            r0 = 28
            r5.<init>(r1, r0)
            kx r0 = p000.EnumC0491kx.f6254
            r2 = 1
            r3 = 6
            p000.pd2.m4469(r0, r1, r2, r3, r4, r5)
            return r17
        Lc78:
            java.lang.ClassLoader r7 = r0.f9236
            r7.getClass()
            r20 r10 = new r20
            r10.<init>(r7, r8)
            t20 r11 = new t20
            r15 = 1
            r11.<init>(r7, r15)
            kx r6 = p000.EnumC0491kx.f6253
            r8 = 1
            r9 = 8
            p000.pd2.m4469(r6, r7, r8, r9, r10, r11)
            return r17
    }
}
