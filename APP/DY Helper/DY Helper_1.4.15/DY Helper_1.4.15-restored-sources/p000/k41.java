package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k41 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5755;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f5756;

    public /* synthetic */ k41(java.lang.ClassLoader r1, int r2) {
            r0 = this;
            r0.f5755 = r2
            r0.f5756 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r11 = this;
            int r0 = r11.f5755
            jz r1 = p000.C0450jz.f5672
            r2 = 0
            r3 = 0
            s62 r4 = p000.s62.f9751
            r5 = 1
            java.lang.ClassLoader r6 = r11.f5756
            switch(r0) {
                case 0: goto L2da;
                case 1: goto L2d4;
                case 2: goto L2ce;
                case 3: goto L2ad;
                case 4: goto L28a;
                case 5: goto L267;
                case 6: goto L244;
                case 7: goto L20c;
                case 8: goto L1df;
                case 9: goto L1d9;
                case 10: goto L1d3;
                case 11: goto L1cd;
                case 12: goto L1c7;
                case 13: goto L1c1;
                case 14: goto L1bb;
                case 15: goto L1b5;
                case 16: goto L1ae;
                case 17: goto L1a7;
                case 18: goto L137;
                case 19: goto L2c;
                case 20: goto L26;
                case 21: goto L20;
                case 22: goto L1a;
                case 23: goto L14;
                default: goto Le;
            }
        Le:
            m82 r11 = p000.m82.f7014
            r11.m3798(r6, r5)
            return r4
        L14:
            ry1 r11 = p000.ry1.f9602
            p000.ry1.m5239(r6, r5)
            return r4
        L1a:
            ry1 r11 = p000.ry1.f9602
            p000.ry1.m5241(r6, r5)
            return r4
        L20:
            ry1 r11 = p000.ry1.f9602
            p000.ry1.m5240(r6, r5)
            return r4
        L26:
            ry1 r11 = p000.ry1.f9602
            r11.m5304(r6, r5)
            return r4
        L2c:
            ry1 r11 = p000.ry1.f9602
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L43
            r11.<init>()     // Catch: java.lang.Throwable -> L43
            java.util.concurrent.atomic.AtomicReference r0 = p000.ry1.f9624     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L47
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L43
            r11.add(r0)     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r0 = move-exception
            r11 = r0
            goto L122
        L47:
            java.lang.String[] r4 = p000.ry1.f9605     // Catch: java.lang.Throwable -> L43
            int r7 = r4.length     // Catch: java.lang.Throwable -> L43
            r8 = r3
        L4b:
            if (r8 >= r7) goto L6a
            r0 = r4[r8]     // Catch: java.lang.Throwable -> L43
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r6)     // Catch: java.lang.Throwable -> L54
            goto L5b
        L54:
            r0 = move-exception
            eo1 r9 = new eo1     // Catch: java.lang.Throwable -> L43
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L43
            r0 = r9
        L5b:
            boolean r9 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L43
            if (r9 == 0) goto L60
            r0 = r2
        L60:
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L67
            r11.add(r0)     // Catch: java.lang.Throwable -> L43
        L67:
            int r8 = r8 + 1
            goto L4b
        L6a:
            java.lang.String r0 = p000.ry1.f9606     // Catch: java.lang.Throwable -> L43
            java.lang.Class r0 = r6.loadClass(r0)     // Catch: java.lang.Throwable -> L43
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L43
        L79:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L90
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L43
            r4 = r3
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L43
            boolean r4 = p000.ry1.m5261(r4)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L79
            r2.add(r3)     // Catch: java.lang.Throwable -> L43
            goto L79
        L90:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L43
            r11.<init>()     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L43
        L99:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L43
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L43
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L43
            r4.<init>()     // Catch: java.lang.Throwable -> L43
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L43
            r6.<init>()     // Catch: java.lang.Throwable -> L43
            p000.ry1.m5207(r6, r4, r3)     // Catch: java.lang.Throwable -> L43
            p000.AbstractC0984xh.m6660(r11, r4)     // Catch: java.lang.Throwable -> L43
            goto L99
        Lb6:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L43
        Lbf:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto Ld9
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L43
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L43
            r0.getClass()     // Catch: java.lang.Throwable -> L43
            boolean r4 = p000.ry1.m5269(r0, r4)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto Lbf
            r2.add(r3)     // Catch: java.lang.Throwable -> L43
            goto Lbf
        Ld9:
            qy1 r11 = new qy1     // Catch: java.lang.Throwable -> L43
            ry1 r0 = p000.ry1.f9602     // Catch: java.lang.Throwable -> L43
            r0 = 2
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L43
            java.util.List r11 = p000.AbstractC0984xh.m6658(r2, r11)     // Catch: java.lang.Throwable -> L43
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L43
        Lf3:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L10e
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L43
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = p000.ry1.m5284(r4)     // Catch: java.lang.Throwable -> L43
            boolean r4 = r0.add(r4)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto Lf3
            r2.add(r3)     // Catch: java.lang.Throwable -> L43
            goto Lf3
        L10e:
            java.util.Iterator r11 = r2.iterator()     // Catch: java.lang.Throwable -> L43
        L112:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L127
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L43
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L43
            goto L112
        L122:
            eo1 r2 = new eo1
            r2.<init>(r11)
        L127:
            java.lang.Throwable r11 = p000.fo1.m2190(r2)
            if (r11 != 0) goto L12f
            r1 = r2
            goto L134
        L12f:
            java.lang.String r0 = "火花 Message 发送入口反射兜底失败"
            p000.ry1.m5275(r0, r11)
        L134:
            java.util.List r1 = (java.util.List) r1
            return r1
        L137:
            java.lang.String r11 = p000.ry1.f9609     // Catch: java.lang.Throwable -> L176
            java.lang.Class r11 = r6.loadClass(r11)     // Catch: java.lang.Throwable -> L176
            java.lang.String r0 = p000.ry1.f9610     // Catch: java.lang.Throwable -> L176
            java.lang.Class r0 = r6.loadClass(r0)     // Catch: java.lang.Throwable -> L176
            java.lang.reflect.Method[] r11 = r11.getDeclaredMethods()     // Catch: java.lang.Throwable -> L176
            r11.getClass()     // Catch: java.lang.Throwable -> L176
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L176
            r2.<init>()     // Catch: java.lang.Throwable -> L176
            int r4 = r11.length     // Catch: java.lang.Throwable -> L176
        L150:
            if (r3 >= r4) goto L17c
            r6 = r11[r3]     // Catch: java.lang.Throwable -> L176
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L176
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)     // Catch: java.lang.Throwable -> L176
            if (r7 != 0) goto L179
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L176
            r7.getClass()     // Catch: java.lang.Throwable -> L176
            int r7 = r7.length     // Catch: java.lang.Throwable -> L176
            if (r7 != 0) goto L179
            java.lang.Class r7 = r6.getReturnType()     // Catch: java.lang.Throwable -> L176
            boolean r7 = r0.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L176
            if (r7 == 0) goto L179
            r2.add(r6)     // Catch: java.lang.Throwable -> L176
            goto L179
        L176:
            r0 = move-exception
            r11 = r0
            goto L190
        L179:
            int r3 = r3 + 1
            goto L150
        L17c:
            java.util.Iterator r11 = r2.iterator()     // Catch: java.lang.Throwable -> L176
        L180:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> L176
            if (r0 == 0) goto L195
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Throwable -> L176
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L176
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L176
            goto L180
        L190:
            eo1 r2 = new eo1
            r2.<init>(r11)
        L195:
            java.lang.Throwable r11 = p000.fo1.m2190(r2)
            if (r11 != 0) goto L19d
            r1 = r2
            goto L1a4
        L19d:
            ry1 r0 = p000.ry1.f9602
            java.lang.String r0 = "Conversation#getCoreInfo 反射兜底失败"
            p000.ry1.m5275(r0, r11)
        L1a4:
            java.util.List r1 = (java.util.List) r1
            return r1
        L1a7:
            ry1 r11 = p000.ry1.f9602
            java.lang.Object r11 = r11.m5302(r6)
            return r11
        L1ae:
            ry1 r11 = p000.ry1.f9602
            java.lang.Object r11 = r11.m5302(r6)
            return r11
        L1b5:
            fk1 r11 = p000.fk1.f3997
            r11.m2145(r6, r5)
            return r4
        L1bb:
            ck1 r11 = p000.ck1.f2177
            r11.m1253(r6, r5)
            return r4
        L1c1:
            ki1 r11 = p000.ki1.f5936
            r11.m3279(r6, r5)
            return r4
        L1c7:
            ki1 r11 = p000.ki1.f5936
            r11.m3280(r6, r5)
            return r4
        L1cd:
            mi1 r11 = p000.mi1.f7162
            p000.mi1.m3836(r6, r5)
            return r4
        L1d3:
            p81 r11 = p000.p81.f8454
            r11.m4405(r6, r5)
            return r4
        L1d9:
            p81 r11 = p000.p81.f8454
            r11.m4404(r6, r5)
            return r4
        L1df:
            l41 r11 = p000.l41.f6416
            java.lang.String r11 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"
            java.lang.String r11 = p000.jf0.m2957(r11)
            java.lang.Class r11 = p000.l41.m3483(r6, r11)
            if (r11 == 0) goto L1f1
            java.lang.reflect.Method[] r2 = r11.getDeclaredMethods()
        L1f1:
            if (r2 != 0) goto L1f5
            java.lang.reflect.Method[] r2 = new java.lang.reflect.Method[r3]
        L1f5:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r0 = r2.length
        L1fb:
            if (r3 >= r0) goto L20b
            r1 = r2[r3]
            boolean r4 = p000.l41.m3487(r1)
            if (r4 == 0) goto L208
            r11.add(r1)
        L208:
            int r3 = r3 + 1
            goto L1fb
        L20b:
            return r11
        L20c:
            l41 r11 = p000.l41.f6416
            java.lang.String r11 = "X.C0IIU"
            java.lang.Class r11 = p000.l41.m3483(r6, r11)
            if (r11 == 0) goto L21a
            java.lang.reflect.Method[] r2 = r11.getDeclaredMethods()
        L21a:
            if (r2 != 0) goto L21e
            java.lang.reflect.Method[] r2 = new java.lang.reflect.Method[r3]
        L21e:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r0 = r2.length
        L224:
            if (r3 >= r0) goto L243
            r1 = r2[r3]
            r1.getClass()
            boolean r4 = p000.l41.m3490(r1)
            if (r4 == 0) goto L240
            java.util.Set r4 = p000.l41.f6418
            java.lang.String r5 = r1.getName()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L240
            r11.add(r1)
        L240:
            int r3 = r3 + 1
            goto L224
        L243:
            return r11
        L244:
            l41 r0 = p000.l41.f6416
            java.lang.ClassLoader r6 = r11.f5756
            r6.getClass()
            sv0 r8 = new sv0
            r11 = 11
            r8.<init>(r11)
            r20 r9 = new r20
            r11 = 29
            r9.<init>(r6, r11)
            t20 r10 = new t20
            r11 = 16
            r10.<init>(r6, r11)
            kx r5 = p000.EnumC0491kx.f6261
            r7 = 1
            p000.l41.m3492(r5, r6, r7, r8, r9, r10)
            return r4
        L267:
            l41 r0 = p000.l41.f6416
            java.lang.ClassLoader r6 = r11.f5756
            r6.getClass()
            sv0 r8 = new sv0
            r11 = 19
            r8.<init>(r11)
            k41 r9 = new k41
            r11 = 8
            r9.<init>(r6, r11)
            t20 r10 = new t20
            r11 = 20
            r10.<init>(r6, r11)
            kx r5 = p000.EnumC0491kx.f6260
            r7 = 1
            p000.l41.m3492(r5, r6, r7, r8, r9, r10)
            return r4
        L28a:
            l41 r0 = p000.l41.f6416
            java.lang.ClassLoader r6 = r11.f5756
            r6.getClass()
            sv0 r8 = new sv0
            r11 = 22
            r8.<init>(r11)
            r20 r9 = new r20
            r11 = 28
            r9.<init>(r6, r11)
            t20 r10 = new t20
            r11 = 15
            r10.<init>(r6, r11)
            kx r5 = p000.EnumC0491kx.f6259
            r7 = 1
            p000.l41.m3492(r5, r6, r7, r8, r9, r10)
            return r4
        L2ad:
            l41 r0 = p000.l41.f6416
            java.lang.ClassLoader r6 = r11.f5756
            r6.getClass()
            sv0 r8 = new sv0
            r11 = 12
            r8.<init>(r11)
            k41 r9 = new k41
            r9.<init>(r6, r3)
            t20 r10 = new t20
            r11 = 17
            r10.<init>(r6, r11)
            kx r5 = p000.EnumC0491kx.f6258
            r7 = 1
            p000.l41.m3492(r5, r6, r7, r8, r9, r10)
            return r4
        L2ce:
            l41 r11 = p000.l41.f6416
            r11.m3495(r6, r5)
            return r4
        L2d4:
            l41 r11 = p000.l41.f6416
            r11.m3494(r6, r5)
            return r4
        L2da:
            l41 r11 = p000.l41.f6416
            java.lang.String r11 = "~78F7D766E6AD8F2F174318E7D62B7C5A33BB7F4AE8124A81AFC66CE9CAF1612AB0CC190D4DE79087AC9AA6387725E92C44671B8A1F53B7D95FD0FC4A146F6E9C4118321BB624C9457379A394FC87165DFAF1C84EA1F2939C"
            java.lang.String r11 = p000.jf0.m2957(r11)
            java.lang.Class r11 = p000.l41.m3483(r6, r11)
            if (r11 == 0) goto L2ec
            java.lang.reflect.Method[] r2 = r11.getDeclaredMethods()
        L2ec:
            if (r2 != 0) goto L2f0
            java.lang.reflect.Method[] r2 = new java.lang.reflect.Method[r3]
        L2f0:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r0 = r2.length
        L2f6:
            if (r3 >= r0) goto L315
            r1 = r2[r3]
            r1.getClass()
            boolean r4 = p000.l41.m3488(r1)
            if (r4 == 0) goto L312
            java.util.Set r4 = p000.l41.f6419
            java.lang.String r5 = r1.getName()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L312
            r11.add(r1)
        L312:
            int r3 = r3 + 1
            goto L2f6
        L315:
            return r11
    }
}
