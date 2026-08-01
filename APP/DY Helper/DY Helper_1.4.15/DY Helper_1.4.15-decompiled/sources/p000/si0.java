package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class si0 implements java.lang.reflect.InvocationHandler {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9922;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.String f9923;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.Object f9924;

    public /* synthetic */ si0(java.lang.ClassLoader r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.f9922 = r0
            r1.<init>()
            r1.f9924 = r2
            r1.f9923 = r3
            return
    }

    public /* synthetic */ si0(java.lang.String r2, p000.C0379i0 r3) {
            r1 = this;
            r0 = 0
            r1.f9922 = r0
            r1.<init>()
            r1.f9923 = r2
            r1.f9924 = r3
            return
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object r15, java.lang.reflect.Method r16, java.lang.Object[] r17) {
            r14 = this;
            r1 = r17
            int r0 = r14.f9922
            java.lang.String r2 = ""
            r3 = 0
            r4 = 0
            r5 = 1
            java.lang.String r6 = r14.f9923
            java.lang.Object r14 = r14.f9924
            switch(r0) {
                case 0: goto L1ec;
                default: goto L10;
            }
        L10:
            java.lang.ClassLoader r14 = (java.lang.ClassLoader) r14
            java.lang.String r7 = p000.ry1.f9606
            java.lang.String r8 = p000.ry1.f9609
            ry1 r0 = p000.ry1.f9602
            java.lang.Class r9 = java.lang.Void.TYPE
            r10 = 2
            if (r16 == 0) goto Lb3
            java.lang.Class r0 = r16.getReturnType()
            boolean r0 = p000.ln0.m3626(r0, r9)
            if (r0 == 0) goto Lb3
            java.lang.Class[] r0 = r16.getParameterTypes()
            int r0 = r0.length
            if (r0 == r10) goto L30
            goto Lb3
        L30:
            java.lang.Class r0 = r14.loadClass(r8)     // Catch: java.lang.Throwable -> L35
            goto L3c
        L35:
            r0 = move-exception
            eo1 r11 = new eo1
            r11.<init>(r0)
            r0 = r11
        L3c:
            boolean r11 = r0 instanceof p000.eo1
            if (r11 == 0) goto L41
            r0 = r4
        L41:
            r11 = r0
            java.lang.Class r11 = (java.lang.Class) r11
            if (r11 != 0) goto L48
            goto Lb3
        L48:
            java.lang.Class r0 = r14.loadClass(r7)     // Catch: java.lang.Throwable -> L4d
            goto L54
        L4d:
            r0 = move-exception
            eo1 r12 = new eo1
            r12.<init>(r0)
            r0 = r12
        L54:
            boolean r12 = r0 instanceof p000.eo1
            if (r12 == 0) goto L59
            r0 = r4
        L59:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L5e
            goto Lb3
        L5e:
            java.lang.Class[] r12 = r16.getParameterTypes()
            r12 = r12[r3]
            boolean r11 = p000.ry1.m5295(r12, r11)
            if (r11 == 0) goto Lb3
            java.lang.Class[] r11 = r16.getParameterTypes()
            r11 = r11[r5]
            boolean r0 = p000.ry1.m5295(r11, r0)
            if (r0 == 0) goto Lb3
            if (r1 == 0) goto L7d
            java.lang.Object r14 = p000.AbstractC0312g7.m2253(r5, r1)
            goto L7e
        L7d:
            r14 = r4
        L7e:
            if (r14 == 0) goto L8d
            java.lang.String r0 = "getUuid"
            java.lang.Object r14 = p000.ry1.m5214(r14, r0)
            boolean r0 = r14 instanceof java.lang.String
            if (r0 == 0) goto L8d
            java.lang.String r14 = (java.lang.String) r14
            goto L8e
        L8d:
            r14 = r4
        L8e:
            if (r14 != 0) goto L91
            goto L92
        L91:
            r2 = r14
        L92:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "官方发送成功回调 conv="
            r14.<init>(r0)
            r14.append(r6)
            java.lang.String r0 = " uuid="
            r14.append(r0)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            p000.ry1.m5276(r14)
            p000.ry1.m5238(r6)
            p000.ry1.m5250(r6)
            goto L1eb
        Lb3:
            java.lang.String r2 = " err="
            r11 = 3
            if (r16 == 0) goto L157
            java.lang.Class r0 = r16.getReturnType()
            boolean r0 = p000.ln0.m3626(r0, r9)
            if (r0 == 0) goto L157
            java.lang.Class[] r0 = r16.getParameterTypes()
            int r0 = r0.length
            if (r0 == r11) goto Lcb
            goto L157
        Lcb:
            java.lang.Class r0 = r14.loadClass(r8)     // Catch: java.lang.Throwable -> Ld0
            goto Ld7
        Ld0:
            r0 = move-exception
            eo1 r12 = new eo1
            r12.<init>(r0)
            r0 = r12
        Ld7:
            boolean r12 = r0 instanceof p000.eo1
            if (r12 == 0) goto Ldc
            r0 = r4
        Ldc:
            r12 = r0
            java.lang.Class r12 = (java.lang.Class) r12
            if (r12 != 0) goto Le3
            goto L157
        Le3:
            java.lang.Class r0 = r14.loadClass(r7)     // Catch: java.lang.Throwable -> Le8
            goto Lef
        Le8:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        Lef:
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto Lf4
            r0 = r4
        Lf4:
            r7 = r0
            java.lang.Class r7 = (java.lang.Class) r7
            if (r7 != 0) goto Lfa
            goto L157
        Lfa:
            java.lang.String r0 = p000.ry1.f9612     // Catch: java.lang.Throwable -> L101
            java.lang.Class r0 = r14.loadClass(r0)     // Catch: java.lang.Throwable -> L101
            goto L108
        L101:
            r0 = move-exception
            eo1 r13 = new eo1
            r13.<init>(r0)
            r0 = r13
        L108:
            boolean r13 = r0 instanceof p000.eo1
            if (r13 == 0) goto L10d
            r0 = r4
        L10d:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L112
            goto L157
        L112:
            java.lang.Class[] r13 = r16.getParameterTypes()
            r13 = r13[r3]
            boolean r12 = p000.ry1.m5295(r13, r12)
            if (r12 == 0) goto L157
            java.lang.Class[] r12 = r16.getParameterTypes()
            r12 = r12[r5]
            boolean r7 = p000.ry1.m5295(r12, r7)
            if (r7 == 0) goto L157
            java.lang.Class[] r7 = r16.getParameterTypes()
            r7 = r7[r10]
            boolean r0 = p000.ry1.m5295(r7, r0)
            if (r0 == 0) goto L157
            if (r1 == 0) goto L13d
            java.lang.Object r14 = p000.AbstractC0312g7.m2253(r10, r1)
            goto L13e
        L13d:
            r14 = r4
        L13e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "官方发送失败回调 conv="
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r2)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            p000.ry1.m5275(r14, r4)
            goto L1eb
        L157:
            if (r16 == 0) goto L1eb
            java.lang.Class r0 = r16.getReturnType()
            boolean r0 = p000.ln0.m3626(r0, r9)
            if (r0 == 0) goto L1eb
            java.lang.Class[] r0 = r16.getParameterTypes()
            int r0 = r0.length
            if (r0 == r11) goto L16c
            goto L1eb
        L16c:
            java.lang.Class r14 = r14.loadClass(r8)     // Catch: java.lang.Throwable -> L171
            goto L179
        L171:
            r0 = move-exception
            r14 = r0
            eo1 r0 = new eo1
            r0.<init>(r14)
            r14 = r0
        L179:
            boolean r0 = r14 instanceof p000.eo1
            if (r0 == 0) goto L17e
            r14 = r4
        L17e:
            java.lang.Class r14 = (java.lang.Class) r14
            if (r14 != 0) goto L183
            goto L1eb
        L183:
            java.lang.Class[] r0 = r16.getParameterTypes()
            r0 = r0[r3]
            boolean r14 = p000.ry1.m5295(r0, r14)
            if (r14 == 0) goto L1eb
            java.lang.Class[] r14 = r16.getParameterTypes()
            r14 = r14[r5]
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r14 = r0.isAssignableFrom(r14)
            if (r14 == 0) goto L1eb
            java.lang.Class[] r14 = r16.getParameterTypes()
            r14 = r14[r10]
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r14 = r0.isAssignableFrom(r14)
            if (r14 == 0) goto L1eb
            if (r1 == 0) goto L1b2
            java.lang.Object r14 = p000.AbstractC0312g7.m2253(r10, r1)
            goto L1b3
        L1b2:
            r14 = r4
        L1b3:
            boolean r0 = r14 instanceof java.util.Map
            if (r0 == 0) goto L1ba
            java.util.Map r14 = (java.util.Map) r14
            goto L1bb
        L1ba:
            r14 = r4
        L1bb:
            if (r14 == 0) goto L1dc
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L1c4
            goto L1dc
        L1c4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "官方批量发送失败回调 conv="
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r2)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            p000.ry1.m5275(r14, r4)
            goto L1eb
        L1dc:
            java.lang.String r14 = "官方批量发送成功回调 conv="
            java.lang.String r14 = r14.concat(r6)
            p000.ry1.m5276(r14)
            p000.ry1.m5238(r6)
            p000.ry1.m5250(r6)
        L1eb:
            return r4
        L1ec:
            i0 r14 = (p000.C0379i0) r14
            java.lang.Object r0 = r14.f4860
            r11 = r0
            xi0 r11 = (p000.xi0) r11
            java.lang.Object r0 = r14.f4859
            r10 = r0
            java.util.concurrent.atomic.AtomicBoolean r10 = (java.util.concurrent.atomic.AtomicBoolean) r10
            java.lang.Object r0 = r14.f4857
            r8 = r0
            dj0 r8 = (p000.dj0) r8
            java.util.concurrent.ConcurrentHashMap r0 = p000.wi0.f11733
            wi0 r7 = p000.wi0.f11726
            java.lang.Class r7 = r16.getDeclaringClass()
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            boolean r7 = p000.ln0.m3626(r7, r9)
            if (r7 == 0) goto L26e
            r15.getClass()
            java.lang.String r14 = r16.getName()
            if (r14 == 0) goto L261
            int r0 = r14.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r0 == r2) goto L255
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r0 == r2) goto L23d
            r1 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r0 == r1) goto L22a
            goto L261
        L22a:
            java.lang.String r0 = "hashCode"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L233
            goto L261
        L233:
            int r14 = java.lang.System.identityHashCode(r15)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L3aa
        L23d:
            java.lang.String r0 = "equals"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L246
            goto L261
        L246:
            if (r1 == 0) goto L24c
            java.lang.Object r4 = p000.AbstractC0312g7.m2253(r3, r1)
        L24c:
            if (r15 != r4) goto L24f
            r3 = r5
        L24f:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            goto L3aa
        L255:
            java.lang.String r0 = "toString"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L261
            java.lang.String r14 = "DyHelperConversationDeleteListener"
            goto L3aa
        L261:
            java.lang.Class r14 = r16.getReturnType()
            r14.getClass()
            java.lang.Object r14 = p000.wi0.m6386(r14)
            goto L3aa
        L26e:
            java.lang.String r5 = r16.getName()
            java.lang.String r7 = "onSuccess"
            boolean r5 = p000.ln0.m3626(r5, r7)
            if (r5 == 0) goto L29a
            r0.remove(r6)
            java.util.concurrent.ScheduledExecutorService r0 = r8.f3187
            java.lang.Object r14 = r14.f4858
            r9 = r14
            cj0 r9 = (p000.cj0) r9
            aj0 r7 = new aj0
            r12 = 1
            r7.<init>(r8, r9, r10, r11, r12)
            r0.execute(r7)
            java.lang.Class r14 = r16.getReturnType()
            r14.getClass()
            java.lang.Object r14 = p000.wi0.m6386(r14)
            goto L3aa
        L29a:
            java.lang.String r5 = r16.getName()
            java.lang.String r7 = "onFailure"
            boolean r5 = p000.ln0.m3626(r5, r7)
            if (r5 == 0) goto L39f
            r0.remove(r6)
            if (r1 == 0) goto L2b0
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r3, r1)
            goto L2b1
        L2b0:
            r0 = r4
        L2b1:
            if (r0 != 0) goto L2b8
            java.lang.String r0 = "宿主删除接口返回未知错误"
        L2b5:
            r12 = r0
            goto L383
        L2b8:
            java.lang.String r1 = "getCode"
            java.lang.String r3 = "getStatus"
            java.lang.String r5 = "getErrorCode"
            java.lang.String[] r1 = new java.lang.String[]{r5, r1, r3}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.Iterator r1 = r1.iterator()
        L2ca:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2e5
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = p000.wi0.m6387(r0, r3)
            boolean r5 = r3 instanceof java.lang.Number
            if (r5 == 0) goto L2e1
            java.lang.Number r3 = (java.lang.Number) r3
            goto L2e2
        L2e1:
            r3 = r4
        L2e2:
            if (r3 == 0) goto L2ca
            goto L2e6
        L2e5:
            r3 = r4
        L2e6:
            if (r3 == 0) goto L2f1
            long r5 = r3.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            goto L2f2
        L2f1:
            r1 = r4
        L2f2:
            java.lang.String r3 = "getMessage"
            java.lang.String r5 = "getStatusMsg"
            java.lang.String r6 = "getErrorMsg"
            java.lang.String[] r3 = new java.lang.String[]{r6, r3, r5}
            java.util.List r3 = p000.AbstractC1021yh.m6897(r3)
            java.util.Iterator r3 = r3.iterator()
        L304:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L31f
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = p000.wi0.m6387(r0, r5)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L31b
            java.lang.String r5 = (java.lang.String) r5
            goto L31c
        L31b:
            r5 = r4
        L31c:
            if (r5 == 0) goto L304
            r4 = r5
        L31f:
            if (r4 != 0) goto L322
            goto L323
        L322:
            r2 = r4
        L323:
            r0 = 10
            r3 = 32
            java.lang.String r0 = r2.replace(r0, r3)
            r0.getClass()
            r2 = 13
            java.lang.String r0 = r0.replace(r2, r3)
            r0.getClass()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            r2 = 180(0xb4, float:2.52E-43)
            java.lang.String r0 = p000.q02.m4693(r0, r2)
            if (r1 == 0) goto L365
            boolean r2 = p000.q02.m4671(r0)
            if (r2 != 0) goto L365
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "错误码 "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "："
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L2b5
        L365:
            if (r1 == 0) goto L377
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "宿主删除失败，错误码 "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L2b5
        L377:
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L37f
            goto L2b5
        L37f:
            java.lang.String r0 = "宿主删除接口返回失败"
            goto L2b5
        L383:
            java.util.concurrent.ScheduledExecutorService r0 = r8.f3187
            java.lang.Object r14 = r14.f4858
            r9 = r14
            cj0 r9 = (p000.cj0) r9
            bj0 r7 = new bj0
            r13 = 1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.execute(r7)
            java.lang.Class r14 = r16.getReturnType()
            r14.getClass()
            java.lang.Object r14 = p000.wi0.m6386(r14)
            goto L3aa
        L39f:
            java.lang.Class r14 = r16.getReturnType()
            r14.getClass()
            java.lang.Object r14 = p000.wi0.m6386(r14)
        L3aa:
            return r14
    }
}
