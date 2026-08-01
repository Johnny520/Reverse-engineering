package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ak0 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f299;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Class f300;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.reflect.Method f301;

    public ak0(java.lang.Class r2, java.lang.reflect.Method r3) {
            r1 = this;
            r0 = 2
            r1.f299 = r0
            r1.f301 = r3
            r1.f300 = r2
            r1.<init>()
            return
    }

    public /* synthetic */ ak0(java.lang.Class r1, java.lang.reflect.Method r2, int r3) {
            r0 = this;
            r0.f299 = r3
            r0.f300 = r1
            r0.f301 = r2
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void beforeHookedMethod(p000.k01 r15) {
            r14 = this;
            int r0 = r14.f299
            r1 = 0
            s62 r2 = p000.s62.f9751
            java.lang.reflect.Method r3 = r14.f301
            java.lang.String r4 = "rac25e39d95f0abcc"
            java.lang.Class r5 = r14.f300
            r6 = 0
            r15.getClass()
            switch(r0) {
                case 0: goto L10b;
                case 1: goto L74;
                default: goto L12;
            }
        L12:
            be0 r14 = p000.be0.f1670
            boolean r14 = r14.m939()
            if (r14 != 0) goto L1b
            goto L73
        L1b:
            java.lang.Object[] r14 = r15.f5692     // Catch: java.lang.Throwable -> L32
            r14.getClass()     // Catch: java.lang.Throwable -> L32
            int r15 = r14.length     // Catch: java.lang.Throwable -> L32
            r0 = r6
        L22:
            if (r6 >= r15) goto L38
            r1 = r14[r6]     // Catch: java.lang.Throwable -> L32
            boolean r7 = r5.isInstance(r1)     // Catch: java.lang.Throwable -> L32
            if (r7 == 0) goto L35
            int r1 = p000.vd0.m6177(r1)     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + r1
            goto L35
        L32:
            r0 = move-exception
            r14 = r0
            goto L5f
        L35:
            int r6 = r6 + 1
            goto L22
        L38:
            if (r0 <= 0) goto L64
            java.lang.Class r14 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L32
            java.lang.String r14 = r14.getSimpleName()     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r15.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "contact state filtered owner="
            r15.append(r1)     // Catch: java.lang.Throwable -> L32
            r15.append(r14)     // Catch: java.lang.Throwable -> L32
            java.lang.String r14 = " removed="
            r15.append(r14)     // Catch: java.lang.Throwable -> L32
            r15.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r14 = r15.toString()     // Catch: java.lang.Throwable -> L32
            p000.C0888ux.m5975(r4, r14)     // Catch: java.lang.Throwable -> L32
            goto L64
        L5f:
            eo1 r2 = new eo1
            r2.<init>(r14)
        L64:
            java.lang.Throwable r14 = p000.fo1.m2190(r2)
            if (r14 == 0) goto L73
            java.lang.String r14 = r14.getMessage()
            java.lang.String r15 = "contact state callback failed: "
            p000.AbstractC0602nx.m4143(r15, r14, r4)
        L73:
            return
        L74:
            java.lang.Object[] r0 = r15.f5692
            be0 r3 = p000.be0.f1670
            boolean r3 = r3.m939()
            if (r3 != 0) goto L80
            goto L10a
        L80:
            if (r5 == 0) goto L8c
            java.lang.Object r3 = r15.f5691
            boolean r3 = r5.isInstance(r3)
            if (r3 != 0) goto L8c
            goto L10a
        L8c:
            java.lang.reflect.Method r7 = r14.f301
            r0.getClass()     // Catch: java.lang.Throwable -> La1
            int r14 = r0.length     // Catch: java.lang.Throwable -> La1
            r9 = r6
        L93:
            if (r6 >= r14) goto Lfb
            r3 = r0[r6]     // Catch: java.lang.Throwable -> La1
            int r5 = r9 + 1
            boolean r8 = r3 instanceof java.util.List     // Catch: java.lang.Throwable -> La1
            if (r8 == 0) goto La4
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> La1
            r10 = r3
            goto La5
        La1:
            r0 = move-exception
            r14 = r0
            goto Lf6
        La4:
            r10 = r1
        La5:
            if (r10 != 0) goto La8
            goto Lf2
        La8:
            java.lang.Class[] r3 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> La1
            r3.getClass()     // Catch: java.lang.Throwable -> La1
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r9, r3)     // Catch: java.lang.Throwable -> La1
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto Lb8
            goto Lf2
        Lb8:
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            boolean r3 = r3.isAssignableFrom(r8)     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto Lc1
            goto Lf2
        Lc1:
            td0 r3 = p000.vd0.m6178(r10)     // Catch: java.lang.Throwable -> La1
            java.util.ArrayList r8 = r3.f10321     // Catch: java.lang.Throwable -> La1
            boolean r3 = r3.f10322     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto Lcc
            goto Lcd
        Lcc:
            r8 = r1
        Lcd:
            if (r8 != 0) goto Ld9
            lv1 r3 = p000.lv1.f6813     // Catch: java.lang.Throwable -> La1
            java.lang.Object r8 = r15.f5691     // Catch: java.lang.Throwable -> La1
            r11 = 0
            r12 = 0
            p000.lv1.m3664(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La1
            goto Lf2
        Ld9:
            int r3 = r10.size()     // Catch: java.lang.Throwable -> La1
            int r11 = r8.size()     // Catch: java.lang.Throwable -> La1
            int r12 = r3 - r11
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La1
            r3.<init>(r8)     // Catch: java.lang.Throwable -> La1
            r0[r9] = r3     // Catch: java.lang.Throwable -> La1
            lv1 r3 = p000.lv1.f6813     // Catch: java.lang.Throwable -> La1
            java.lang.Object r8 = r15.f5691     // Catch: java.lang.Throwable -> La1
            r11 = 1
            p000.lv1.m3664(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La1
        Lf2:
            int r6 = r6 + 1
            r9 = r5
            goto L93
        Lf6:
            eo1 r2 = new eo1
            r2.<init>(r14)
        Lfb:
            java.lang.Throwable r14 = p000.fo1.m2190(r2)
            if (r14 == 0) goto L10a
            java.lang.String r14 = r14.getMessage()
            java.lang.String r15 = "contact select callback failed: "
            p000.AbstractC0602nx.m4143(r15, r14, r4)
        L10a:
            return
        L10b:
            java.util.concurrent.atomic.AtomicBoolean r14 = p000.bk0.f1755
            r14 = 1
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L14b
            if (r0 != 0) goto L144
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r2 = "currentApplication"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L12e
            r0.setAccessible(r14)     // Catch: java.lang.Throwable -> L12e
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Throwable -> L12e
            boolean r2 = r0 instanceof android.app.Application     // Catch: java.lang.Throwable -> L12e
            if (r2 == 0) goto L130
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L12e
            goto L138
        L12e:
            r0 = move-exception
            goto L132
        L130:
            r0 = r1
            goto L138
        L132:
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L14b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L14b
            r0 = r2
        L138:
            boolean r2 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L14b
            if (r2 == 0) goto L13d
            r0 = r1
        L13d:
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L14b
            if (r0 == 0) goto L144
            p000.ui1.m5896(r0)     // Catch: java.lang.Throwable -> L14b
        L144:
            java.lang.String r0 = "im_disable_read_receipt_report"
            boolean r0 = p000.ui1.m5887(r0, r6)     // Catch: java.lang.Throwable -> L14b
            goto L14c
        L14b:
            r0 = r6
        L14c:
            if (r0 != 0) goto L150
            goto L308
        L150:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.bk0.f1755
            java.lang.Object[] r0 = r15.f5692
            r5.getClass()
            if (r0 != 0) goto L15a
            goto L16e
        L15a:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            int r4 = r0.length
            r7 = r6
        L161:
            if (r7 >= r4) goto L16e
            r8 = r0[r7]
            java.lang.Object r8 = p000.bk0.m967(r8, r5, r6, r2)
            if (r8 != 0) goto L16f
            int r7 = r7 + 1
            goto L161
        L16e:
            r8 = r1
        L16f:
            if (r8 != 0) goto L173
            goto L308
        L173:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.bk0.f1755
            java.lang.Class r0 = r8.getClass()
            java.util.List r0 = p000.bk0.m966(r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L186
        L183:
            r14 = r6
            goto L20a
        L186:
            java.util.Iterator r2 = r0.iterator()
        L18a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L183
            java.lang.Object r0 = r2.next()
            r4 = r0
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Object r0 = r4.get(r8)     // Catch: java.lang.Throwable -> L19c
            goto L1a3
        L19c:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L1a3:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L1a8
            r0 = r1
        L1a8:
            if (r0 != 0) goto L1ab
            goto L18a
        L1ab:
            java.util.Set r5 = p000.bk0.f1767
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L20a
            java.lang.String r0 = r4.getName()
            r0.getClass()
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r0 = p000.AbstractC0602nx.m4134(r4, r0, r4)
            java.util.Set r4 = p000.bk0.f1766
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L20a
            java.lang.String r4 = "batch_mark_read"
            boolean r4 = p000.q02.m4654(r0, r4, r6)
            if (r4 == 0) goto L1d9
            goto L20a
        L1d9:
            java.lang.String r4 = "unread"
            boolean r4 = p000.q02.m4654(r0, r4, r6)
            if (r4 == 0) goto L1e2
            goto L18a
        L1e2:
            java.lang.String r4 = "mark"
            boolean r4 = p000.q02.m4654(r0, r4, r6)
            if (r4 == 0) goto L18a
            java.lang.String r4 = "read"
            boolean r4 = p000.q02.m4654(r0, r4, r6)
            if (r4 == 0) goto L18a
            java.lang.String r4 = "conversation"
            boolean r4 = p000.q02.m4654(r0, r4, r6)
            if (r4 != 0) goto L20a
            java.lang.String r4 = "stranger"
            boolean r4 = p000.q02.m4654(r0, r4, r6)
            if (r4 != 0) goto L20a
            java.lang.String r4 = "message"
            boolean r0 = p000.q02.m4654(r0, r4, r6)
            if (r0 == 0) goto L18a
        L20a:
            if (r14 != 0) goto L20e
            goto L308
        L20e:
            java.util.concurrent.atomic.AtomicInteger r14 = p000.bk0.f1756
            int r14 = r14.incrementAndGet()
            r0 = 20
            if (r14 <= r0) goto L21c
            int r0 = r14 % 50
            if (r0 != 0) goto L288
        L21c:
            java.lang.Class r0 = r8.getClass()
            java.util.List r0 = p000.bk0.m966(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r0.iterator()
        L22d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L25b
            java.lang.Object r0 = r4.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Object r5 = r0.get(r8)     // Catch: java.lang.Throwable -> L244
            if (r5 == 0) goto L246
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L244
            goto L24e
        L244:
            r0 = move-exception
            goto L248
        L246:
            r0 = r1
            goto L24e
        L248:
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L24e:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L253
            r0 = r1
        L253:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L22d
            r2.add(r0)
            goto L22d
        L25b:
            r0 = 8
            java.util.List r7 = p000.AbstractC0984xh.m6662(r2, r0)
            r12 = 0
            r13 = 62
            java.lang.String r8 = ","
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "已拦截已读上报 #"
            r2.<init>(r4)
            r2.append(r14)
            java.lang.String r14 = " fields="
            r2.append(r14)
            r2.append(r0)
            java.lang.String r14 = r2.toString()
            java.lang.String r0 = "DYHelperIMPrivacyStatusHook"
            p000.C0888ux.m5975(r0, r14)
        L288:
            java.util.concurrent.atomic.AtomicBoolean r14 = p000.bk0.f1755
            java.lang.Class r14 = r3.getReturnType()
            r14.getClass()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L29b
            goto L305
        L29b:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L2a6
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L305
        L2a6:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L2b3
            java.lang.Byte r1 = java.lang.Byte.valueOf(r6)
            goto L305
        L2b3:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L2c0
            java.lang.Short r1 = java.lang.Short.valueOf(r6)
            goto L305
        L2c0:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L2cd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L305
        L2cd:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L2dc
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L305
        L2dc:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L2ea
            r14 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r14)
            goto L305
        L2ea:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L2f9
            r0 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            goto L305
        L2f9:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L305
            java.lang.Character r1 = java.lang.Character.valueOf(r6)
        L305:
            r15.m3107(r1)
        L308:
            return
    }
}
