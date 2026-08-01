package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ve0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11250;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.z81 f11251;

    public /* synthetic */ ve0(p000.z81 r1, int r2) {
            r0 = this;
            r0.f11250 = r2
            r0.f11251 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: β */
    private final java.lang.Object m6203() {
            r7 = this;
            z81 r7 = r7.f11251
            java.lang.String r0 = "String"
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r1 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> Lf1
            java.lang.ClassLoader r7 = r7.f13011     // Catch: java.lang.Throwable -> Lf1
            java.lang.Class r7 = p000.qe0.m4876(r7, r1)     // Catch: java.lang.Throwable -> Lf1
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf1
            r1.<init>()     // Catch: java.lang.Throwable -> Lf1
            r2 = r7
        L18:
            if (r2 == 0) goto L50
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lf1
            if (r3 != 0) goto L50
            java.lang.reflect.Field[] r3 = r2.getDeclaredFields()     // Catch: java.lang.Throwable -> Lf1
            τ r3 = p000.h62.m2434(r3)     // Catch: java.lang.Throwable -> Lf1
        L2a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lf1
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lf1
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> Lf1
            java.lang.Class r4 = r4.getType()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> Lf1
            l91 r6 = new l91     // Catch: java.lang.Throwable -> Lf1
            r6.<init>(r5, r4)     // Catch: java.lang.Throwable -> Lf1
            r1.add(r6)     // Catch: java.lang.Throwable -> Lf1
            goto L2a
        L4b:
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.Throwable -> Lf1
            goto L18
        L50:
            java.lang.String r2 = "desc"
            java.lang.String r3 = "description"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> Lf1
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = p000.AbstractC0073bd.m881(r1, r2, r0)     // Catch: java.lang.Throwable -> Lf1
            p000.AbstractC0073bd.f1655 = r2     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = "author"
            java.util.List r2 = p000.AbstractC1021yh.m6896(r2)     // Catch: java.lang.Throwable -> Lf1
            r3 = 0
            java.lang.String r2 = p000.AbstractC0073bd.m881(r1, r2, r3)     // Catch: java.lang.Throwable -> Lf1
            p000.AbstractC0073bd.f1656 = r2     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = "video"
            java.util.List r2 = p000.AbstractC1021yh.m6896(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = p000.AbstractC0073bd.m881(r1, r2, r3)     // Catch: java.lang.Throwable -> Lf1
            p000.AbstractC0073bd.f1657 = r2     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = "imageList"
            java.lang.String r4 = "images"
            java.lang.String r5 = "image_list"
            java.lang.String r6 = "imagePostInfo"
            java.lang.String[] r2 = new java.lang.String[]{r2, r4, r5, r6}     // Catch: java.lang.Throwable -> Lf1
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = p000.AbstractC0073bd.m881(r1, r2, r3)     // Catch: java.lang.Throwable -> Lf1
            p000.AbstractC0073bd.f1658 = r2     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = "aid"
            java.lang.String r3 = "awemeId"
            java.lang.String r4 = "id"
            java.lang.String r5 = "aweme_id"
            java.lang.String r6 = "aId"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6}     // Catch: java.lang.Throwable -> Lf1
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)     // Catch: java.lang.Throwable -> Lf1
            p000.AbstractC0073bd.m881(r1, r2, r0)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = "shareUrl"
            java.lang.String r3 = "share_url"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> Lf1
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)     // Catch: java.lang.Throwable -> Lf1
            p000.AbstractC0073bd.m881(r1, r2, r0)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = p000.AbstractC0073bd.f1655     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r1 = p000.AbstractC0073bd.f1656     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = p000.AbstractC0073bd.f1657     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r3 = p000.AbstractC0073bd.f1658     // Catch: java.lang.Throwable -> Lf1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1
            r4.<init>()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r5 = "DYHelper: 字段匹配: desc="
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf1
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = ", author="
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf1
            r4.append(r1)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = ", video="
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf1
            r4.append(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = ", imageList="
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf1
            r4.append(r3)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lf1
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = p000.AbstractC0073bd.f1657     // Catch: java.lang.Throwable -> Lf1
            if (r0 == 0) goto Lfb
            p000.AbstractC0073bd.m856(r7)     // Catch: java.lang.Throwable -> Lf1
            goto Lfb
        Lf1:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            java.lang.String r0 = "DYHelper: Aweme 探测失败: "
            p000.AbstractC0602nx.m4142(r0, r7)
        Lfb:
            s62 r7 = p000.s62.f9751
            return r7
    }

    /* JADX INFO: renamed from: γ */
    private final java.lang.Object m6204() {
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.qr1.f9091
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.qr1.f9091
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Le
            goto L94
        Le:
            java.lang.String r0 = "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"
            java.lang.String r0 = p000.jf0.m2957(r0)
            z81 r7 = r7.f11251
            java.lang.ClassLoader r7 = r7.f13011
            java.lang.Class r7 = p000.qe0.m4876(r7, r0)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r7 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r7)
            r7 = r0
        L24:
            boolean r0 = r7 instanceof p000.eo1
            r1 = 0
            if (r0 == 0) goto L2a
            r7 = r1
        L2a:
            java.lang.Class r7 = (java.lang.Class) r7
            r0 = 4
            java.lang.String r2 = "DYHelper: SeekBarVisibility"
            if (r7 != 0) goto L37
            java.lang.String r7 = "ProSeekBarView not found"
            p000.C0888ux.m5988(r2, r7, r1, r0, r1)
            goto L94
        L37:
            java.lang.Object r3 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L4f
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r4 = android.util.AttributeSet.class
            ad1 r5 = new ad1     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.qr1.f9091     // Catch: java.lang.Throwable -> L4f
            r6 = 20
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L4f
            l01 r3 = p000.qe0.m4872(r7, r3)     // Catch: java.lang.Throwable -> L4f
            goto L56
        L4f:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L56:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L6b
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.qr1.f9091
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "hook constructor failed: "
            java.lang.String r3 = p000.lz1.m3687(r4, r3)
            p000.C0888ux.m5988(r2, r3, r1, r0, r1)
        L6b:
            ad1 r3 = new ad1
            r4 = 21
            r3.<init>(r4)
            java.lang.String r4 = "setVisibility"
            p000.qr1.m4944(r7, r4, r3)
            ad1 r3 = new ad1
            r4 = 22
            r3.<init>(r4)
            java.lang.String r4 = "setProgress"
            p000.qr1.m4944(r7, r4, r3)
            ad1 r3 = new ad1
            r4 = 23
            r3.<init>(r4)
            java.lang.String r4 = "onDraw"
            p000.qr1.m4944(r7, r4, r3)
            java.lang.String r7 = "ProSeekBarView visibility hook installed"
            p000.C0888ux.m5988(r2, r7, r1, r0, r1)
        L94:
            s62 r7 = p000.s62.f9751
            return r7
    }

    /* JADX INFO: renamed from: δ */
    private final java.lang.Object m6205() {
            r3 = this;
            z81 r3 = r3.f11251
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jb0.f5399
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Ld
            goto L36
        Ld:
            java.lang.ClassLoader r3 = r3.f13011
            p000.jb0.f5404 = r3
            java.lang.Object r3 = p000.ui1.f10844
            s20 r3 = p000.jb0.f5408
            p000.ui1.m5882(r3)
            java.lang.ref.WeakReference r3 = p000.AbstractC0378i.f4853
            ib0 r3 = p000.jb0.f5409
            r3.getClass()
            java.util.concurrent.CopyOnWriteArraySet r0 = p000.AbstractC0378i.f4855
            r0.add(r3)
            android.app.Activity r3 = p000.AbstractC0378i.m2546()
            if (r3 == 0) goto L2d
            p000.jb0.m2919(r3)
        L2d:
            java.lang.String r3 = "自动审批调度器已注册"
            r0 = 4
            java.lang.String r1 = "rb22c2f83ae9ef877"
            r2 = 0
            p000.C0888ux.m5988(r1, r3, r2, r0, r2)
        L36:
            s62 r3 = p000.s62.f9751
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    private final java.lang.Object m6206() {
            r12 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pr1.f8671
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pr1.f8671
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Le
            goto L1a2
        Le:
            z81 r12 = r12.f11251
            java.lang.ClassLoader r0 = r12.f13011
            java.lang.String r3 = "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.Class r0 = p000.pr1.m4577(r0, r3)
            if (r0 != 0) goto L24
            java.lang.String r0 = "ProSeekBarView not found"
            p000.pr1.m4584(r0)
            goto L41
        L24:
            ad1 r3 = new ad1
            r4 = 18
            r3.<init>(r4)
            java.lang.String r4 = "onDraw"
            p000.pr1.m4583(r0, r4, r3)
            ad1 r3 = new ad1
            r4 = 19
            r3.<init>(r4)
            java.lang.String r4 = "setProgress"
            p000.pr1.m4583(r0, r4, r3)
            java.lang.String r0 = "ProSeekBarView hook installed"
            p000.pr1.m4584(r0)
        L41:
            java.lang.ClassLoader r0 = r12.f13011
            java.lang.String r3 = "~78E784A121CC4D4A76A82A6412191AC853CB05E0BEF16A4FCD52E9EDE594B1EB7A26029BA8545F3C7E30A101FAD966DF810DCD83CF069660D5377A43BED0508D947414BCADFE80D1D63722F51F5BE5BECF12C2F147A77F50B5412A90"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.Class r0 = p000.pr1.m4577(r0, r3)
            java.lang.Class r3 = java.lang.Void.TYPE
            if (r0 != 0) goto L58
            java.lang.String r0 = "ProSeekBarPlayerProgressComponent not found"
            p000.pr1.m4584(r0)
            goto L128
        L58:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r0.length
            r6 = r1
        L66:
            if (r6 >= r5) goto Lb9
            r7 = r0[r6]
            r7.getClass()
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 == 0) goto L78
            goto Lb6
        L78:
            java.lang.Class r8 = r7.getReturnType()
            boolean r8 = p000.ln0.m3626(r8, r3)
            if (r8 != 0) goto L83
            goto Lb6
        L83:
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r9 = r8.length
            r10 = 2
            if (r9 != r10) goto Lb6
            r9 = r8[r1]
            java.lang.Class r10 = java.lang.Float.TYPE
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 != 0) goto L9f
            r9 = r8[r1]
            java.lang.Class<java.lang.Float> r10 = java.lang.Float.class
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 == 0) goto Lb6
        L9f:
            r9 = r8[r2]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 != 0) goto Lb3
            r8 = r8[r2]
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto Lb6
        Lb3:
            r4.add(r7)
        Lb6:
            int r6 = r6 + 1
            goto L66
        Lb9:
            java.util.Iterator r0 = r4.iterator()
            r4 = r1
        Lbe:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L117
            java.lang.Object r5 = r0.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.setAccessible(r2)
            xq0 r6 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Le4
            ad1 r7 = new ad1     // Catch: java.lang.Throwable -> Le4
            java.util.concurrent.atomic.AtomicBoolean r8 = p000.pr1.f8671     // Catch: java.lang.Throwable -> Le4
            r8 = 17
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Le4
            r6.m6775(r5, r7)     // Catch: java.lang.Throwable -> Le4
            int r6 = r4 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Le2
            goto Lee
        Le2:
            r4 = move-exception
            goto Le8
        Le4:
            r6 = move-exception
            r11 = r6
            r6 = r4
            r4 = r11
        Le8:
            eo1 r7 = new eo1
            r7.<init>(r4)
            r4 = r7
        Lee:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L115
            java.lang.String r5 = r5.getName()
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "hook progress update failed: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = ", "
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            p000.pr1.m4584(r4)
        L115:
            r4 = r6
            goto Lbe
        L117:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "ProSeekBarPlayerProgressComponent progress hook count="
            r0.<init>(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            p000.pr1.m4584(r0)
        L128:
            java.lang.ClassLoader r12 = r12.f13011
            java.lang.String r0 = "~78C7222F2A96B599B7D83774C1C1E3514447820FDCE5C5B541FD315DD1B9B5C000F722126CC42AE4415DE1C47B613731957AADC7925C7378F4980D27F9E4E3C0120A3F38898F23E5E80C1EA4B93B83F0D2C11DDA"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r12 = p000.pr1.m4577(r12, r0)
            if (r12 != 0) goto L137
            goto L1a2
        L137:
            java.lang.reflect.Method[] r12 = r12.getDeclaredMethods()
            r12.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r4 = r12.length
            r5 = r1
        L145:
            if (r5 >= r4) goto L16d
            r6 = r12[r5]
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L16a
            java.lang.Class r7 = r6.getReturnType()
            boolean r7 = p000.ln0.m3626(r7, r3)
            if (r7 == 0) goto L16a
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7.getClass()
            int r7 = r7.length
            if (r7 != 0) goto L16a
            r0.add(r6)
        L16a:
            int r5 = r5 + 1
            goto L145
        L16d:
            java.util.Iterator r12 = r0.iterator()
        L171:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L191
            java.lang.Object r0 = r12.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.setAccessible(r2)
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L171
            ad1 r4 = new ad1     // Catch: java.lang.Throwable -> L171
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.pr1.f8671     // Catch: java.lang.Throwable -> L171
            r5 = 16
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L171
            r3.m6775(r0, r4)     // Catch: java.lang.Throwable -> L171
            int r1 = r1 + 1
            goto L171
        L191:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "ProTimeDescViewComponent fallback hook count="
            r12.<init>(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            p000.pr1.m4584(r12)
        L1a2:
            s62 r12 = p000.s62.f9751
            return r12
    }

    /* JADX INFO: renamed from: η */
    private final java.lang.Object m6207() {
            r6 = this;
            z81 r6 = r6.f11251
            qj1 r0 = p000.qj1.f9022
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.qj1.f9023
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            s62 r4 = p000.s62.f9751
            if (r1 != 0) goto L12
            goto L132
        L12:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.nj1.f7649
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 != 0) goto L1b
            goto L62
        L1b:
            p000.nj1.m4076()
            p000.nj1.m4075()
            java.lang.Object r1 = p000.ui1.f10844     // Catch: java.lang.Throwable -> L2a
            li1 r1 = p000.nj1.f7656     // Catch: java.lang.Throwable -> L2a
            p000.ui1.m5882(r1)     // Catch: java.lang.Throwable -> L2a
            r2 = r4
            goto L30
        L2a:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
        L30:
            java.lang.Throwable r1 = p000.fo1.m2190(r2)
            if (r1 == 0) goto L3f
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "ProfileVideoOverlayAlpha: 配置监听注册失败，保留页面绑定时读取的默认值: "
            p000.AbstractC0602nx.m4142(r2, r1)
        L3f:
            java.lang.Object r1 = p000.ui1.f10844     // Catch: java.lang.Throwable -> L4d
            li1 r1 = p000.nj1.f7657     // Catch: java.lang.Throwable -> L4d
            r1.getClass()     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.CopyOnWriteArrayList r2 = p000.ui1.f10852     // Catch: java.lang.Throwable -> L4d
            r2.add(r1)     // Catch: java.lang.Throwable -> L4d
            r2 = r4
            goto L53
        L4d:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
        L53:
            java.lang.Throwable r1 = p000.fo1.m2190(r2)
            if (r1 == 0) goto L62
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "ProfileVideoOverlayAlpha: 账号配置切换监听注册失败，将在下次页面绑定时重读: "
            p000.AbstractC0602nx.m4142(r2, r1)
        L62:
            java.lang.ClassLoader r1 = r6.f13011     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r0.m4890(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L6d
            goto L74
        L6d:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L74:
            java.lang.Throwable r2 = p000.fo1.m2190(r1)
            if (r2 != 0) goto L7b
            goto L94
        L7b:
            java.lang.String r1 = r2.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "search 分支安装已降级: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "branch_search"
            p000.qj1.m4888(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L94:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.ClassLoader r2 = r6.f13011     // Catch: java.lang.Throwable -> La5
            boolean r2 = r0.m4889(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> La5
            goto Lac
        La5:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        Lac:
            java.lang.Throwable r3 = p000.fo1.m2190(r2)
            if (r3 != 0) goto Lb3
            goto Lcc
        Lb3:
            java.lang.String r2 = r3.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "comment_input 分支安装已降级: "
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "branch_comment_input"
            p000.qj1.m4888(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        Lcc:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Ld6
            int r1 = r1 + 1
        Ld6:
            java.lang.ClassLoader r6 = r6.f13011     // Catch: java.lang.Throwable -> Le1
            boolean r6 = r0.m4891(r6)     // Catch: java.lang.Throwable -> Le1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> Le1
            goto Le8
        Le1:
            r6 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        Le8:
            java.lang.Throwable r0 = p000.fo1.m2190(r6)
            if (r0 != 0) goto Lef
            goto L108
        Lef:
            java.lang.String r6 = r0.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ultra_comment 分支安装已降级: "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "branch_ultra_comment"
            p000.qj1.m4888(r0, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L108:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L112
            int r1 = r1 + 1
        L112:
            if (r1 != 0) goto L11c
            java.lang.String r6 = "no_hook"
            java.lang.String r0 = "当前宿主未命中任何透明度边界，已保持原界面"
            p000.qj1.m4888(r6, r0)
            goto L132
        L11c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "ProfileVideoOverlayAlphaHook: 已安装 "
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r0 = " 组作者主页视频透明度边界"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            p000.C0888ux.m5985(r6)
        L132:
            return r4
    }

    /* JADX INFO: renamed from: θ */
    private final java.lang.Object m6208() {
            r4 = this;
            kf r0 = p000.C0467kf.f5879
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0467kf.f5880
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Ld
            goto L79
        Ld:
            z81 r4 = r4.f11251
            java.lang.ClassLoader r0 = r4.f13011
            java.lang.String r1 = "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E842756DA5E8CF875623AE519F07DFAD42004186D37B9EBBCC2E6698BA9A46908228635487F32694"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r0 = p000.C0467kf.m3216(r0, r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "FeedSyncPresenter not found"
            p000.C0467kf.m3226(r0)
            goto L2e
        L23:
            h r1 = new h
            r2 = 2
            r1.<init>(r2)
            java.lang.String r2 = "onBind"
            p000.C0467kf.m3224(r0, r2, r1)
        L2e:
            java.lang.ClassLoader r0 = r4.f13011
            java.lang.String r1 = "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r0 = p000.C0467kf.m3216(r0, r1)
            java.lang.String r1 = "setProgress"
            if (r0 != 0) goto L44
            java.lang.String r0 = "ProSeekBarView not found"
            p000.C0467kf.m3226(r0)
            goto L52
        L44:
            h r2 = new h
            r3 = 4
            r2.<init>(r3)
            p000.C0467kf.m3224(r0, r1, r2)
            java.lang.String r0 = "ProSeekBarView segment skip hook installed"
            p000.C0467kf.m3226(r0)
        L52:
            java.lang.ClassLoader r4 = r4.f13011
            java.lang.String r0 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F7353FACB1B2D4E37F4031BB4E143F99F5369ADBB467DF3A6526DA150A61A2"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r4 = p000.C0467kf.m3216(r4, r0)
            if (r4 != 0) goto L66
            java.lang.String r4 = "ChapterOuterSeekBar not found"
            p000.C0467kf.m3226(r4)
            goto L74
        L66:
            h r0 = new h
            r2 = 3
            r0.<init>(r2)
            p000.C0467kf.m3224(r4, r1, r0)
            java.lang.String r4 = "ChapterOuterSeekBar segment observer installed"
            p000.C0467kf.m3226(r4)
        L74:
            java.lang.String r4 = "segment skip hook installed"
            p000.C0467kf.m3226(r4)
        L79:
            s62 r4 = p000.s62.f9751
            return r4
    }

    /* JADX INFO: renamed from: ι */
    private final java.lang.Object m6209() {
            r6 = this;
            java.lang.String r0 = "DYHelper:AntiRecall"
            java.util.concurrent.ConcurrentHashMap r1 = p000.sg0.f9894
            z81 r6 = r6.f11251
            java.lang.ClassLoader r6 = r6.f13011
            r1 = 4
            r2 = 0
            java.lang.Object r3 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "~7918AA8396C85B92707DC4C904CF4F6B873956D476D564A4B4FA8249966EA0F63C4AD8"
            java.lang.String r3 = p000.jf0.m2957(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.Class r6 = p000.qe0.m4876(r6, r3)     // Catch: java.lang.Throwable -> L5a
            xq0 r3 = p000.xq0.f12253
            f10 r4 = new f10
            r5 = 16
            r4.<init>(r5)
            java.lang.String r5 = "isRecalled"
            r3.m6774(r6, r5, r4)
            f10 r4 = new f10
            r5 = 17
            r4.<init>(r5)
            java.lang.String r5 = "getMsgStatus"
            r3.m6774(r6, r5, r4)
            f10 r4 = new f10
            r5 = 18
            r4.<init>(r5)
            java.lang.String r5 = "setContent"
            r3.m6774(r6, r5, r4)
            f10 r4 = new f10
            r5 = 19
            r4.<init>(r5)
            java.lang.String r5 = "getContent"
            r3.m6774(r6, r5, r4)
            f10 r4 = new f10
            r5 = 20
            r4.<init>(r5)
            java.lang.String r5 = "getContentByte"
            r3.m6774(r6, r5, r4)
            java.lang.String r6 = "防撤回已安装"
            p000.C0888ux.m5988(r0, r6, r2, r1, r2)
            goto L5f
        L5a:
            java.lang.String r6 = "rc4f62a03697beec1"
            p000.C0888ux.m5988(r0, r6, r2, r1, r2)
        L5f:
            s62 r6 = p000.s62.f9751
            return r6
    }

    /* JADX INFO: renamed from: κ */
    private final java.lang.Object m6210() {
            r3 = this;
            z81 r3 = r3.f11251
            zj0 r0 = p000.zj0.f13118
            java.lang.ClassLoader r1 = r3.f13011
            p000.zj0.f13121 = r1
            java.lang.ClassLoader r1 = r3.f13011
            r0.m7160(r1)
            java.lang.ClassLoader r0 = r3.f13011
            p000.zj0.m7147(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.zj0.f13124
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L1d
            goto L37
        L1d:
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0777rx.f9562
            fj0 r0 = new fj0
            r1 = 17
            r0.<init>(r1)
            java.lang.String r1 = "IMMarkAllReadHelper"
            p000.C0777rx.m5178(r1, r0)
            fj0 r0 = new fj0
            r1 = 18
            r0.<init>(r1)
            java.lang.String r1 = "IMMarkAllReadHelper_bottom_sync"
            p000.C0777rx.m5177(r1, r0)
        L37:
            int r0 = p000.C0410ix.f5220
            p000.C0410ix.m2819(r3)
            java.lang.String r3 = "DYHelperIMMarkAllReadHelper: IMMarkAllReadHelper 初始化完成"
            p000.C0888ux.m5985(r3)
            s62 r3 = p000.s62.f9751
            return r3
    }

    /* JADX INFO: renamed from: λ */
    private final java.lang.Object m6211() {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ri0.f9382
            wi0 r0 = p000.wi0.f11726
            z81 r4 = r4.f11251
            java.lang.ClassLoader r1 = r4.f13011
            r0.m6392(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ri0.f9382
            r1 = 1
            r2 = 0
            boolean r1 = r0.compareAndSet(r2, r1)
            s62 r3 = p000.s62.f9751
            if (r1 != 0) goto L18
            goto L35
        L18:
            java.lang.ClassLoader r4 = r4.f13011     // Catch: java.lang.Throwable -> L1f
            p000.ri0.m5096(r4)     // Catch: java.lang.Throwable -> L1f
            r1 = r3
            goto L25
        L1f:
            r4 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r4)
        L25:
            java.lang.Throwable r4 = p000.fo1.m2190(r1)
            if (r4 == 0) goto L35
            r0.set(r2)
            java.lang.String r0 = "rbb4637c919e2110c"
            java.lang.String r1 = "安装消息页会话删除入口失败"
            p000.C0888ux.m5977(r0, r1, r4)
        L35:
            return r3
    }

    /* JADX INFO: renamed from: μ */
    private final java.lang.Object m6212() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.bk0.f1755
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lb
            goto L3a
        Lb:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.bk0.f1757
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L14
            goto L2c
        L14:
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0777rx.f9562
            wj0 r0 = new wj0
            r1 = 16
            r0.<init>(r1)
            java.lang.String r1 = "IMPrivacyStatusHook"
            p000.C0777rx.m5178(r1, r0)
            wj0 r0 = new wj0
            r2 = 17
            r0.<init>(r2)
            p000.C0777rx.m5177(r1, r0)
        L2c:
            z81 r3 = r3.f11251
            java.lang.ClassLoader r3 = r3.f13011
            p000.bk0.m968(r3)
            java.lang.String r3 = "DYHelperIMPrivacyStatusHook"
            java.lang.String r0 = "IMPrivacyStatusHook 初始化完成，仅拦截已读上报"
            p000.C0888ux.m5975(r3, r0)
        L3a:
            s62 r3 = p000.s62.f9751
            return r3
    }

    /* JADX INFO: renamed from: ν */
    private final java.lang.Object m6213() {
            r14 = this;
            z81 r14 = r14.f11251
            s62 r1 = p000.s62.f9751
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pj0.f8581
            java.lang.String r2 = "DYHelper"
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pj0.f8581
            r3 = 1
            r4 = 0
            boolean r0 = r0.compareAndSet(r4, r3)
            if (r0 != 0) goto L13
            return r1
        L13:
            java.lang.ClassLoader r0 = r14.f13011
            p000.pj0.f8583 = r0
            java.lang.ClassLoader r14 = r14.f13011
            java.lang.String r0 = "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13465F36685DE700F208610F00484FDC242593DAB7C63FD6BF226A9E1C77A5F232FB29534"
            java.lang.String r3 = p000.jf0.m2957(r0)
            r5 = 4
            r6 = 0
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "LJIIL"
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L43
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L43
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L43
            f10 r13 = new f10     // Catch: java.lang.Throwable -> L43
            r8 = 29
            r13.<init>(r8)     // Catch: java.lang.Throwable -> L43
            r8 = r7
            r9 = r7
            r10 = r7
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> L43
            p000.qe0.m4874(r3, r14, r0, r7)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "已 Hook MessageTabDotHelperNew.LJIIL"
            p000.C0888ux.m5988(r2, r0, r6, r5, r6)     // Catch: java.lang.Throwable -> L43
            r7 = r1
            goto L49
        L43:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
        L49:
            java.lang.Throwable r0 = p000.fo1.m2190(r7)
            if (r0 == 0) goto L60
            java.lang.Throwable r0 = p000.pj0.m4550(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r7 = "Hook MessageTabDotHelperNew.LJIIL 失败: "
            java.lang.String r0 = p000.lz1.m3687(r7, r0)
            p000.C0888ux.m5988(r2, r0, r6, r5, r6)
        L60:
            java.lang.String r0 = "X.C2244071Ckh"
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r14)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r7 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = "LIZ"
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L83
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            oj0 r10 = new oj0     // Catch: java.lang.Throwable -> L83
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.pj0.f8581     // Catch: java.lang.Throwable -> L83
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L83
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r9, r0, r10}     // Catch: java.lang.Throwable -> L83
            p000.qe0.m4874(r3, r14, r7, r0)     // Catch: java.lang.Throwable -> L83
            java.lang.String r14 = "已 Hook MessageTabDotHelperNew.LIZ"
            p000.C0888ux.m5988(r2, r14, r6, r5, r6)     // Catch: java.lang.Throwable -> L83
            r0 = r1
            goto L8a
        L83:
            r0 = move-exception
            r14 = r0
            eo1 r0 = new eo1
            r0.<init>(r14)
        L8a:
            java.lang.Throwable r14 = p000.fo1.m2190(r0)
            if (r14 == 0) goto La1
            java.lang.Throwable r14 = p000.pj0.m4550(r14)
            java.lang.String r14 = r14.getMessage()
            java.lang.String r0 = "Hook MessageTabDotHelperNew.LIZ 失败: "
            java.lang.String r14 = p000.lz1.m3687(r0, r14)
            p000.C0888ux.m5988(r2, r14, r6, r5, r6)
        La1:
            java.lang.String r14 = "IMDndUnreadHook 初始化完成"
            p000.C0888ux.m5988(r2, r14, r6, r5, r6)
            return r1
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r17 = this;
            r0 = r17
            int r1 = r0.f11250
            r2 = 11
            r3 = 10
            r4 = 3
            r5 = 28
            r6 = 2
            r7 = 0
            r8 = 4
            r9 = 1
            r10 = 0
            switch(r1) {
                case 0: goto L81a;
                case 1: goto L7cb;
                case 2: goto L76c;
                case 3: goto L763;
                case 4: goto L73a;
                case 5: goto L72f;
                case 6: goto L724;
                case 7: goto L5dd;
                case 8: goto L566;
                case 9: goto L511;
                case 10: goto L4e6;
                case 11: goto L457;
                case 12: goto L3f6;
                case 13: goto L1c1;
                case 14: goto L19e;
                case 15: goto L192;
                case 16: goto L134;
                case 17: goto L12f;
                case 18: goto L12a;
                case 19: goto L125;
                case 20: goto L120;
                case 21: goto L11b;
                case 22: goto L116;
                case 23: goto L111;
                case 24: goto L10c;
                case 25: goto L107;
                case 26: goto L102;
                case 27: goto Lfd;
                case 28: goto Le8;
                default: goto L13;
            }
        L13:
            z81 r0 = r0.f11251
            sh1 r1 = p000.sh1.f9903
            java.lang.String r1 = r0.f13009
            java.lang.String r0 = r0.f13010
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "init called, packageName="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = ", processName="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            p000.sh1.m5510(r2)
            java.lang.String r2 = "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L4b
            java.lang.String r0 = "rf08a45e43722957e"
            java.lang.String r0 = r0.concat(r1)
            p000.sh1.m5510(r0)
            goto Le5
        L4b:
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "init skipped: processName mismatch ("
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " != "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p000.sh1.m5510(r0)
            goto Le5
        L70:
            java.lang.String r0 = "init proceeding..."
            p000.sh1.m5510(r0)
            java.lang.String r0 = "feed_auto_scroll_content_resolver"
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.s00.f9638
            boolean r1 = r1.compareAndSet(r10, r9)
            if (r1 != 0) goto L80
            goto L94
        L80:
            java.util.concurrent.ConcurrentHashMap r1 = p000.C0777rx.f9562
            hm r1 = new hm
            r1.<init>(r5)
            p000.C0777rx.m5178(r0, r1)
            hm r1 = new hm
            r2 = 29
            r1.<init>(r2)
            p000.C0777rx.m5177(r0, r1)
        L94:
            x00 r0 = p000.x00.f11959
            p000.x00.m6468()
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.sh1.f9905
            boolean r1 = r1.compareAndSet(r10, r9)
            if (r1 != 0) goto La4
            goto Lca
        La4:
            xq0 r1 = p000.xq0.f12253
            java.lang.String r2 = "onResume"
            ad1 r3 = new ad1
            r3.<init>(r6)
            r1.m6774(r0, r2, r3)
            java.lang.String r2 = "onPause"
            ad1 r3 = new ad1
            r3.<init>(r4)
            r1.m6774(r0, r2, r3)
            java.lang.String r1 = "dispatchTouchEvent"
            java.lang.Class<android.view.MotionEvent> r2 = android.view.MotionEvent.class
            ad1 r3 = new ad1
            r3.<init>(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            p000.qe0.m4873(r0, r1, r2)
        Lca:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.sh1.f9906
            boolean r0 = r0.compareAndSet(r10, r9)
            if (r0 == 0) goto Le5
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            java.lang.String r1 = "attach"
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            ad1 r3 = new ad1
            r4 = 7
            r3.<init>(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            p000.qe0.m4873(r0, r1, r2)
        Le5:
            s62 r0 = p000.s62.f9751
            return r0
        Le8:
            z81 r0 = r0.f11251
            boolean r1 = p000.pu0.f8718
            if (r1 == 0) goto Lef
            goto Lfa
        Lef:
            p000.pu0.f8718 = r9
            java.lang.ClassLoader r1 = p000.j41.f5313
            java.lang.ClassLoader r0 = r0.f13011
            r0.getClass()
            p000.j41.f5313 = r0
        Lfa:
            s62 r0 = p000.s62.f9751
            return r0
        Lfd:
            java.lang.Object r0 = r0.m6213()
            return r0
        L102:
            java.lang.Object r0 = r0.m6212()
            return r0
        L107:
            java.lang.Object r0 = r0.m6211()
            return r0
        L10c:
            java.lang.Object r0 = r0.m6203()
            return r0
        L111:
            java.lang.Object r0 = r0.m6210()
            return r0
        L116:
            java.lang.Object r0 = r0.m6209()
            return r0
        L11b:
            java.lang.Object r0 = r0.m6208()
            return r0
        L120:
            java.lang.Object r0 = r0.m6207()
            return r0
        L125:
            java.lang.Object r0 = r0.m6206()
            return r0
        L12a:
            java.lang.Object r0 = r0.m6205()
            return r0
        L12f:
            java.lang.Object r0 = r0.m6204()
            return r0
        L134:
            z81 r0 = r0.f11251
            c82 r1 = p000.c82.f1991
            s62 r1 = p000.s62.f9751
            java.lang.ClassLoader r2 = r0.f13011
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = p000.c82.f1992
            boolean r0 = r0.add(r2)
            if (r0 != 0) goto L145
            goto L191
        L145:
            p000.c82.m1152(r2)     // Catch: java.lang.Throwable -> L14a
            r3 = r1
            goto L150
        L14a:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
        L150:
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            if (r0 == 0) goto L16b
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Feed 解码 Hook 安装失败: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p000.c82.m1159(r0)
        L16b:
            p000.c82.m1153(r2)     // Catch: java.lang.Throwable -> L170
            r2 = r1
            goto L176
        L170:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
        L176:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            if (r0 == 0) goto L191
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Feed 列表 setter Hook 安装失败: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p000.c82.m1159(r0)
        L191:
            return r1
        L192:
            z81 r0 = r0.f11251
            fj r1 = p000.C0287fj.f3949
            java.lang.ClassLoader r0 = r0.f13011
            r1.m2142(r0)
        L19b:
            s62 r0 = p000.s62.f9751
            return r0
        L19e:
            z81 r0 = r0.f11251
            ql r1 = p000.C0728ql.f9031
            monitor-enter(r1)
            boolean r2 = p000.C0728ql.f9033     // Catch: java.lang.Throwable -> L1be
            if (r2 == 0) goto L1a9
            monitor-exit(r1)
            goto L1bb
        L1a9:
            p000.C0728ql.f9033 = r9     // Catch: java.lang.Throwable -> L1be
            java.lang.ClassLoader r2 = r0.f13011     // Catch: java.lang.Throwable -> L1be
            r1.m4930(r2)     // Catch: java.lang.Throwable -> L1be
            java.lang.ClassLoader r2 = r0.f13011     // Catch: java.lang.Throwable -> L1be
            r1.m4931(r2)     // Catch: java.lang.Throwable -> L1be
            r1.m4932(r0)     // Catch: java.lang.Throwable -> L1be
            int r0 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> L1be
            monitor-exit(r1)
        L1bb:
            s62 r0 = p000.s62.f9751
            return r0
        L1be:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1be
            throw r0
        L1c1:
            z81 r1 = r0.f11251
            android.util.LruCache r0 = p000.C0839tl.f10408
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "DYHelper_ImageWatermark"
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L1de
            java.lang.String r0 = "android.net.Uri"
            java.lang.ClassLoader r7 = r1.f13011     // Catch: java.lang.Throwable -> L1de
            java.lang.String r8 = "parse"
            h r11 = new h     // Catch: java.lang.Throwable -> L1de
            r11.<init>(r5)     // Catch: java.lang.Throwable -> L1de
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r11}     // Catch: java.lang.Throwable -> L1de
            p000.qe0.m4874(r0, r7, r8, r5)     // Catch: java.lang.Throwable -> L1de
            goto L1e8
        L1de:
            r0 = move-exception
            java.lang.String r5 = r0.getMessage()
            java.lang.String r7 = "Hook Uri.parse 失败: "
            p000.AbstractC0602nx.m4145(r7, r5, r3, r0)
        L1e8:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L205
            java.lang.String r0 = "java.net.URL"
            java.lang.ClassLoader r5 = r1.f13011     // Catch: java.lang.Throwable -> L205
            h r7 = new h     // Catch: java.lang.Throwable -> L205
            r8 = 27
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L205
            java.lang.Object[] r7 = new java.lang.Object[]{r2, r7}     // Catch: java.lang.Throwable -> L205
            java.lang.Class r0 = p000.qe0.m4876(r5, r0)     // Catch: java.lang.Throwable -> L205
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r6)     // Catch: java.lang.Throwable -> L205
            p000.qe0.m4872(r0, r5)     // Catch: java.lang.Throwable -> L205
            goto L20f
        L205:
            r0 = move-exception
            java.lang.String r5 = r0.getMessage()
            java.lang.String r7 = "Hook java.net.URL 失败: "
            p000.AbstractC0602nx.m4145(r7, r5, r3, r0)
        L20f:
            java.lang.ClassLoader r0 = r1.f13011
            java.lang.Object r5 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L2a5
            java.lang.String r5 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAD9131B3F256364FE597603FE0C975A9FCE723D12F128B686"
            java.lang.String r5 = p000.jf0.m2957(r5)     // Catch: java.lang.Throwable -> L2a5
            java.lang.Class r5 = p000.qe0.m4877(r0, r5)     // Catch: java.lang.Throwable -> L2a5
            if (r5 != 0) goto L220
            goto L235
        L220:
            java.lang.String r7 = "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"
            java.lang.String r7 = p000.jf0.m2957(r7)     // Catch: java.lang.Throwable -> L2a5
            java.lang.Class r0 = p000.qe0.m4877(r0, r7)     // Catch: java.lang.Throwable -> L2a5
            if (r0 != 0) goto L22d
            goto L235
        L22d:
            java.lang.String r7 = "download_url"
            java.lang.reflect.Field r7 = p000.C0839tl.m5716(r5, r7)     // Catch: java.lang.Throwable -> L2a5
            if (r7 != 0) goto L239
        L235:
            r16 = r10
            goto L2b1
        L239:
            java.lang.String r8 = "origin_url"
            java.lang.reflect.Field r8 = p000.C0839tl.m5716(r5, r8)     // Catch: java.lang.Throwable -> L2a5
            java.lang.String r11 = "medium_url"
            java.lang.reflect.Field r11 = p000.C0839tl.m5716(r5, r11)     // Catch: java.lang.Throwable -> L2a5
            java.lang.String r12 = "crop_url"
            java.lang.reflect.Field r12 = p000.C0839tl.m5716(r5, r12)     // Catch: java.lang.Throwable -> L2a5
            java.lang.reflect.Method[] r5 = r5.getDeclaredMethods()     // Catch: java.lang.Throwable -> L2a5
            r5.getClass()     // Catch: java.lang.Throwable -> L2a5
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a5
            r13.<init>()     // Catch: java.lang.Throwable -> L2a5
            int r14 = r5.length     // Catch: java.lang.Throwable -> L2a5
            r15 = r10
        L259:
            if (r15 >= r14) goto L27f
            r16 = r10
            r10 = r5[r15]     // Catch: java.lang.Throwable -> L277
            java.lang.Class[] r4 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L277
            r4.getClass()     // Catch: java.lang.Throwable -> L277
            int r4 = r4.length     // Catch: java.lang.Throwable -> L277
            if (r4 != 0) goto L279
            java.lang.Class r4 = r10.getReturnType()     // Catch: java.lang.Throwable -> L277
            boolean r4 = r0.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L277
            if (r4 == 0) goto L279
            r13.add(r10)     // Catch: java.lang.Throwable -> L277
            goto L279
        L277:
            r0 = move-exception
            goto L2a8
        L279:
            int r15 = r15 + 1
            r10 = r16
            r4 = 3
            goto L259
        L27f:
            r16 = r10
            java.util.Iterator r0 = r13.iterator()     // Catch: java.lang.Throwable -> L277
        L285:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L277
            if (r4 == 0) goto L29f
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L277
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L277
            r4.setAccessible(r9)     // Catch: java.lang.Throwable -> L277
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L277
            sl r10 = new sl     // Catch: java.lang.Throwable -> L277
            r10.<init>(r7, r8, r11, r12)     // Catch: java.lang.Throwable -> L277
            r5.m6775(r4, r10)     // Catch: java.lang.Throwable -> L277
            goto L285
        L29f:
            java.lang.String r0 = "评论图片模型保存源 Hook 已安装"
            p000.C0888ux.m5975(r3, r0)     // Catch: java.lang.Throwable -> L277
            goto L2b1
        L2a5:
            r0 = move-exception
            r16 = r10
        L2a8:
            java.lang.String r4 = r0.getMessage()
            java.lang.String r5 = "评论图片模型 Hook 失败: "
            p000.AbstractC0602nx.m4145(r5, r4, r3, r0)
        L2b1:
            java.lang.ClassLoader r0 = r1.f13011
            java.lang.Object r4 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L2f8
            java.lang.String r4 = "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059049CFED8B79CC2450D2A13695573BF621FDC7044653DE2732CF77606074B77E4DD920584C20D2B73D"
            java.lang.String r4 = p000.jf0.m2957(r4)     // Catch: java.lang.Throwable -> L2f8
            java.lang.Class r0 = p000.qe0.m4877(r0, r4)     // Catch: java.lang.Throwable -> L2f8
            if (r0 != 0) goto L2c2
            goto L32a
        L2c2:
            java.lang.String r4 = "url_list"
            java.lang.reflect.Field r4 = p000.C0839tl.m5716(r0, r4)     // Catch: java.lang.Throwable -> L2f8
            if (r4 != 0) goto L2cb
            goto L32a
        L2cb:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L2f8
            r0.getClass()     // Catch: java.lang.Throwable -> L2f8
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f8
            r5.<init>()     // Catch: java.lang.Throwable -> L2f8
            int r7 = r0.length     // Catch: java.lang.Throwable -> L2f8
            r8 = r16
        L2da:
            if (r8 >= r7) goto L2fd
            r10 = r0[r8]     // Catch: java.lang.Throwable -> L2f8
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L2f8
            r11.getClass()     // Catch: java.lang.Throwable -> L2f8
            int r11 = r11.length     // Catch: java.lang.Throwable -> L2f8
            if (r11 != 0) goto L2fa
            java.lang.Class<java.util.List> r11 = java.util.List.class
            java.lang.Class r12 = r10.getReturnType()     // Catch: java.lang.Throwable -> L2f8
            boolean r11 = r11.isAssignableFrom(r12)     // Catch: java.lang.Throwable -> L2f8
            if (r11 == 0) goto L2fa
            r5.add(r10)     // Catch: java.lang.Throwable -> L2f8
            goto L2fa
        L2f8:
            r0 = move-exception
            goto L321
        L2fa:
            int r8 = r8 + 1
            goto L2da
        L2fd:
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L2f8
        L301:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L2f8
            if (r5 == 0) goto L31b
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L2f8
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L2f8
            r5.setAccessible(r9)     // Catch: java.lang.Throwable -> L2f8
            xq0 r7 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L2f8
            nh r8 = new nh     // Catch: java.lang.Throwable -> L2f8
            r8.<init>(r6, r4)     // Catch: java.lang.Throwable -> L2f8
            r7.m6775(r5, r8)     // Catch: java.lang.Throwable -> L2f8
            goto L301
        L31b:
            java.lang.String r0 = "评论动图模型保存源 Hook 已安装"
            p000.C0888ux.m5975(r3, r0)     // Catch: java.lang.Throwable -> L2f8
            goto L32a
        L321:
            java.lang.String r4 = r0.getMessage()
            java.lang.String r5 = "评论动图模型 Hook 失败: "
            p000.AbstractC0602nx.m4145(r5, r4, r3, r0)
        L32a:
            java.lang.ClassLoader r0 = r1.f13011
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L372
            java.lang.String r1 = "~790C6456DF85BCEE663B681374F92433989E3F9AAFD50EBB9E0AF620A1EC6DD9E218D80B4AA6"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> L372
            java.lang.Class r0 = p000.qe0.m4877(r0, r1)     // Catch: java.lang.Throwable -> L372
            if (r0 != 0) goto L33c
            goto L3f3
        L33c:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L372
            r0.getClass()     // Catch: java.lang.Throwable -> L372
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L372
            r1.<init>()     // Catch: java.lang.Throwable -> L372
            int r4 = r0.length     // Catch: java.lang.Throwable -> L372
            r5 = r16
        L34b:
            if (r5 >= r4) goto L3b1
            r7 = r0[r5]     // Catch: java.lang.Throwable -> L372
            int r8 = r7.getModifiers()     // Catch: java.lang.Throwable -> L372
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)     // Catch: java.lang.Throwable -> L372
            if (r8 == 0) goto L370
            java.lang.Class r8 = r7.getReturnType()     // Catch: java.lang.Throwable -> L372
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L372
            boolean r8 = p000.ln0.m3626(r8, r10)     // Catch: java.lang.Throwable -> L372
            if (r8 != 0) goto L375
            java.lang.Class r8 = r7.getReturnType()     // Catch: java.lang.Throwable -> L372
            boolean r8 = p000.ln0.m3626(r8, r10)     // Catch: java.lang.Throwable -> L372
            if (r8 == 0) goto L370
            goto L375
        L370:
            r10 = 3
            goto L3ae
        L372:
            r0 = move-exception
            goto L3ea
        L375:
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L372
            int r8 = r8.length     // Catch: java.lang.Throwable -> L372
            r10 = 3
            if (r8 != r10) goto L3ae
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L372
            r8 = r8[r16]     // Catch: java.lang.Throwable -> L372
            boolean r8 = p000.ln0.m3626(r8, r2)     // Catch: java.lang.Throwable -> L372
            if (r8 == 0) goto L3ae
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L372
            r8 = r8[r9]     // Catch: java.lang.Throwable -> L372
            boolean r8 = p000.ln0.m3626(r8, r2)     // Catch: java.lang.Throwable -> L372
            if (r8 == 0) goto L3ae
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L372
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L372
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L372
            java.lang.String r11 = "~7908F94451A999F71196F64AC0FD22E4AC4B6D6F206A5D2BC66D4B109B0B5F28FEB88301ABE47A"
            java.lang.String r11 = p000.jf0.m2957(r11)     // Catch: java.lang.Throwable -> L372
            boolean r8 = r8.equals(r11)     // Catch: java.lang.Throwable -> L372
            if (r8 == 0) goto L3ae
            r1.add(r7)     // Catch: java.lang.Throwable -> L372
        L3ae:
            int r5 = r5 + 1
            goto L34b
        L3b1:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L372
        L3b5:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L372
            if (r2 == 0) goto L3d1
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L372
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L372
            r2.setAccessible(r9)     // Catch: java.lang.Throwable -> L372
            xq0 r4 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L372
            h r5 = new h     // Catch: java.lang.Throwable -> L372
            r6 = 26
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L372
            r4.m6775(r2, r5)     // Catch: java.lang.Throwable -> L372
            goto L3b5
        L3d1:
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L372
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L372
            r1.<init>()     // Catch: java.lang.Throwable -> L372
            java.lang.String r2 = "评论图片用户下载目录 Hook 已安装: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L372
            r1.append(r0)     // Catch: java.lang.Throwable -> L372
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L372
            p000.C0888ux.m5975(r3, r0)     // Catch: java.lang.Throwable -> L372
            goto L3f3
        L3ea:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "评论图片用户下载目录 Hook 安装失败: "
            p000.AbstractC0602nx.m4145(r2, r1, r3, r0)
        L3f3:
            s62 r0 = p000.s62.f9751
            return r0
        L3f6:
            r16 = r10
            z81 r0 = r0.f11251
            h22 r1 = p000.AbstractC0551mj.f7171
            java.lang.ClassLoader r1 = r0.f13011
            r1.getClass()
            int r0 = java.lang.System.identityHashCode(r1)
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.AbstractC0551mj.f7172
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.add(r0)
            if (r0 != 0) goto L412
            goto L454
        L412:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.AbstractC0551mj.f7174
            r2 = r16
            boolean r0 = r0.compareAndSet(r2, r9)
            if (r0 != 0) goto L41d
            goto L440
        L41d:
            gh r0 = new gh     // Catch: java.lang.Throwable -> L42a
            r2 = 13
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L42a
            java.util.concurrent.CopyOnWriteArrayList r2 = p000.ui1.f10852     // Catch: java.lang.Throwable -> L42a
            r2.add(r0)     // Catch: java.lang.Throwable -> L42a
            goto L440
        L42a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "install profile listener failed: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p000.AbstractC0551mj.m3859(r0)
        L440:
            p000.AbstractC0551mj.m3853(r1)     // Catch: java.lang.Throwable -> L44c
            p000.AbstractC0551mj.m3854(r1)     // Catch: java.lang.Throwable -> L44c
            java.lang.String r0 = "installed"
            p000.AbstractC0551mj.m3859(r0)     // Catch: java.lang.Throwable -> L44c
            goto L454
        L44c:
            r0 = move-exception
            java.lang.String r1 = "r31ea4ef8bcca40f9"
            java.lang.String r2 = "install failed"
            p000.C0888ux.m5977(r1, r2, r0)
        L454:
            s62 r0 = p000.s62.f9751
            return r0
        L457:
            z81 r0 = r0.f11251
            java.util.ArrayList r1 = p000.e72.f3439
            java.lang.String r1 = "r3d7af71c7d5f3398"
            java.lang.ClassLoader r0 = r0.f13011
            java.lang.String r4 = "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7000C6ADBCAD99044D3E8549548CF07CFE2D"
            java.lang.String r4 = p000.jf0.m2957(r4)
            java.lang.String r5 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943128319BA9DDE6489BFD0F890B62A0B8F269639979E85"
            java.lang.String r5 = p000.jf0.m2957(r5)
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = p000.AbstractC1021yh.m6897(r4)
            java.util.Iterator r4 = r4.iterator()
        L477:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4b0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class r6 = p000.qe0.m4876(r0, r5)     // Catch: java.lang.Throwable -> L477
            java.lang.String r9 = "onResume"
            bm r10 = new bm     // Catch: java.lang.Throwable -> L477
            r11 = 0
            r10.<init>(r3, r0, r11)     // Catch: java.lang.Throwable -> L477
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L477
            p000.qe0.m4873(r6, r9, r10)     // Catch: java.lang.Throwable -> L477
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L477
            r6.<init>()     // Catch: java.lang.Throwable -> L477
            java.lang.String r9 = "已 hook "
            r6.append(r9)     // Catch: java.lang.Throwable -> L477
            r6.append(r5)     // Catch: java.lang.Throwable -> L477
            java.lang.String r5 = ".onResume()"
            r6.append(r5)     // Catch: java.lang.Throwable -> L477
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L477
            p000.C0888ux.m5988(r1, r5, r7, r8, r7)     // Catch: java.lang.Throwable -> L477
            goto L477
        L4b0:
            java.lang.Object r3 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L4d1
            java.lang.String r3 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD993981847A"
            java.lang.String r3 = p000.jf0.m2957(r3)     // Catch: java.lang.Throwable -> L4d1
            java.lang.Class r3 = p000.qe0.m4876(r0, r3)     // Catch: java.lang.Throwable -> L4d1
            java.lang.String r4 = "getUid"
            bm r5 = new bm     // Catch: java.lang.Throwable -> L4d1
            r11 = 0
            r5.<init>(r2, r0, r11)     // Catch: java.lang.Throwable -> L4d1
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L4d1
            p000.qe0.m4873(r3, r4, r0)     // Catch: java.lang.Throwable -> L4d1
            java.lang.String r0 = "已 hook User.getUid() (备用)"
            p000.C0888ux.m5988(r1, r0, r7, r8, r7)     // Catch: java.lang.Throwable -> L4d1
            goto L4df
        L4d1:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "User.getUid() hook 失败: "
            java.lang.String r0 = p000.lz1.m3687(r2, r0)
            p000.C0888ux.m5988(r1, r0, r7, r8, r7)
        L4df:
            java.lang.String r0 = "初始化完成"
            p000.C0888ux.m5988(r1, r0, r7, r8, r7)
            goto L19b
        L4e6:
            z81 r0 = r0.f11251
            java.lang.ref.WeakReference r1 = p000.AbstractC0378i.f4853
            java.lang.Object r1 = p000.qe0.f8982
            java.lang.String r1 = "android.app.Activity"
            java.lang.ClassLoader r2 = r0.f13011
            java.lang.String r3 = "onResume"
            h r4 = new h
            r11 = 0
            r4.<init>(r11)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            p000.qe0.m4874(r1, r2, r3, r4)
            java.lang.ClassLoader r0 = r0.f13011
            java.lang.String r2 = "onDestroy"
            h r3 = new h
            r3.<init>(r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            p000.qe0.m4874(r1, r0, r2, r3)
            goto L19b
        L511:
            z81 r1 = r0.f11251
            android.os.Handler r0 = p000.f82.f3821
            java.lang.String r2 = "DYHelper: VideoLengthAlert"
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L52f
            if (r0 == 0) goto L51e
            goto L53d
        L51e:
            android.app.Activity r0 = p000.AbstractC0378i.m2546()     // Catch: java.lang.Throwable -> L52f
            if (r0 == 0) goto L53d
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L52f
            r0.getClass()     // Catch: java.lang.Throwable -> L52f
            p000.ui1.m5896(r0)     // Catch: java.lang.Throwable -> L52f
            goto L53d
        L52f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "PrefsManager 初始化失败: "
            java.lang.String r0 = p000.lz1.m3687(r3, r0)
            p000.C0888ux.m5988(r2, r0, r7, r8, r7)
        L53d:
            java.lang.ClassLoader r0 = r1.f13011
            x00 r1 = p000.x00.f11959     // Catch: java.lang.Throwable -> L545
            r1.m6471(r0)     // Catch: java.lang.Throwable -> L545
            goto L553
        L545:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "当前作品选中态 Hook 安装失败，跳过长视频提醒: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            p000.C0888ux.m5988(r2, r0, r7, r8, r7)
        L553:
            j72 r0 = new j72
            r1 = 12
            r0.<init>(r1)
            java.util.concurrent.CopyOnWriteArraySet r1 = p000.C0696pq.f8659
            r1.add(r0)
            java.lang.String r0 = "已订阅当前作品选中态"
            p000.C0888ux.m5988(r2, r0, r7, r8, r7)
            goto L19b
        L566:
            z81 r1 = r0.f11251
            java.util.concurrent.atomic.AtomicInteger r0 = p000.C0187ct.f2739
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.String r3 = "nextInt"
            java.lang.ClassLoader r0 = r1.f13011
            java.lang.String r4 = "rf839340cfbdf7ea6"
            java.lang.String r5 = "kotlin.random.Random$Default"
            java.lang.String r6 = "Kotlin Random"
            bt r9 = new bt     // Catch: java.lang.Throwable -> L585
            r11 = 0
            r9.<init>(r6, r11)     // Catch: java.lang.Throwable -> L585
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r9}     // Catch: java.lang.Throwable -> L585
            l01 r0 = p000.qe0.m4874(r5, r0, r3, r6)     // Catch: java.lang.Throwable -> L585
            goto L58c
        L585:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L58c:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 != 0) goto L598
            r5 = r0
            l01 r5 = (p000.l01) r5
            java.lang.String r5 = "骰子 Kotlin Random Hook 已部署"
            p000.C0888ux.m5988(r4, r5, r7, r8, r7)
        L598:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L5a3
            java.lang.String r5 = "骰子 Kotlin Random Hook 安装失败，保留宿主随机行为"
            p000.C0888ux.m5977(r4, r5, r0)
        L5a3:
            java.lang.ClassLoader r0 = r1.f13011
            java.lang.String r1 = "java.util.Random"
            java.lang.String r5 = "Java Random"
            bt r6 = new bt     // Catch: java.lang.Throwable -> L5b8
            r11 = 0
            r6.<init>(r5, r11)     // Catch: java.lang.Throwable -> L5b8
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r6}     // Catch: java.lang.Throwable -> L5b8
            l01 r0 = p000.qe0.m4874(r1, r0, r3, r2)     // Catch: java.lang.Throwable -> L5b8
            goto L5bf
        L5b8:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L5bf:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 != 0) goto L5cb
            r1 = r0
            l01 r1 = (p000.l01) r1
            java.lang.String r1 = "骰子 Java Random 兼容 Hook 已部署"
            p000.C0888ux.m5988(r4, r1, r7, r8, r7)
        L5cb:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L5d6
            java.lang.String r1 = "骰子 Java Random Hook 安装失败，保留宿主随机行为"
            p000.C0888ux.m5977(r4, r1, r0)
        L5d6:
            java.lang.String r0 = "骰子控制Hook初始化完成"
            p000.C0888ux.m5988(r4, r0, r7, r8, r7)
            goto L19b
        L5dd:
            z81 r1 = r0.f11251
            s62 r2 = p000.s62.f9751
            ry1 r3 = p000.ry1.f9602
            java.lang.ClassLoader r0 = r1.f13011
            p000.ry1.f9622 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ry1.f9591
            r11 = 0
            boolean r0 = r0.compareAndSet(r11, r9)
            r4 = 25
            if (r0 != 0) goto L5f3
            goto L625
        L5f3:
            eu1 r0 = new eu1
            r0.<init>(r4)
            java.util.concurrent.CopyOnWriteArrayList r5 = p000.ui1.f10852
            r5.add(r0)
            java.lang.String r0 = p000.ui1.m5890()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Long r0 = p000.x02.m6488(r0)
            if (r0 == 0) goto L625
            long r5 = r0.longValue()
            r10 = 0
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L61a
            r7 = r0
        L61a:
            if (r7 == 0) goto L625
            long r5 = r7.longValue()
            java.lang.String r0 = "PrefsManager.currentUid"
            p000.ry1.m5288(r5, r0)
        L625:
            java.util.Set r0 = p000.bd1.f1661
            java.lang.ClassLoader r5 = r1.f13011
            java.lang.String r6 = "rc2954fec18baf260"
            r5.getClass()
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.bd1.f1662
            r11 = 0
            boolean r0 = r7.compareAndSet(r11, r9)
            if (r0 != 0) goto L639
            goto L6f4
        L639:
            java.lang.String r0 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BB36ACF30F5904E8FC433C73395AC3A9559B49EE96CBEE40836D687DDFD6168EFC"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L678
            java.lang.Class r0 = java.lang.Class.forName(r0, r11, r5)     // Catch: java.lang.Throwable -> L678
            java.lang.reflect.Method[] r10 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L678
            r10.getClass()     // Catch: java.lang.Throwable -> L678
            java.util.List r10 = p000.AbstractC0312g7.m2262(r10)     // Catch: java.lang.Throwable -> L678
            java.lang.reflect.Method r10 = p000.bd1.m924(r10)     // Catch: java.lang.Throwable -> L678
            if (r10 == 0) goto L6e4
            r10.setAccessible(r9)     // Catch: java.lang.Throwable -> L678
            xq0 r11 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L678
            oj0 r12 = new oj0     // Catch: java.lang.Throwable -> L678
            r12.<init>(r4)     // Catch: java.lang.Throwable -> L678
            r11.m6775(r10, r12)     // Catch: java.lang.Throwable -> L678
            p000.bd1.m919(r0)     // Catch: java.lang.Throwable -> L666
            r4 = r2
            goto L66c
        L666:
            r0 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L678
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L678
        L66c:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L678
            if (r0 == 0) goto L67c
            java.lang.String r4 = "世界会话观察不可用，营地缓存将保持未绑定"
            p000.C0888ux.m5977(r6, r4, r0)     // Catch: java.lang.Throwable -> L678
            goto L67c
        L678:
            r0 = move-exception
            r11 = 0
            goto L6ec
        L67c:
            p000.bd1.m916(r5)     // Catch: java.lang.Throwable -> L681
            r4 = r2
            goto L687
        L681:
            r0 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L678
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L678
        L687:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L678
            if (r0 == 0) goto L692
            java.lang.String r4 = "公共参数观察不可用，继续使用世界启动与 Unity 兜底"
            p000.C0888ux.m5977(r6, r4, r0)     // Catch: java.lang.Throwable -> L678
        L692:
            p000.bd1.m918(r5)     // Catch: java.lang.Throwable -> L697
            r4 = r2
            goto L69d
        L697:
            r0 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L678
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L678
        L69d:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L678
            if (r0 == 0) goto L6a8
            java.lang.String r4 = "世界启动观察不可用，继续使用公共参数兜底"
            p000.C0888ux.m5977(r6, r4, r0)     // Catch: java.lang.Throwable -> L678
        L6a8:
            java.lang.Class[] r0 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L6b6
            r0 = r0[r8]     // Catch: java.lang.Throwable -> L6b6
            r0.getClass()     // Catch: java.lang.Throwable -> L6b6
            p000.bd1.m915(r0)     // Catch: java.lang.Throwable -> L6b6
            r4 = r2
            goto L6bc
        L6b6:
            r0 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L678
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L678
        L6bc:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L678
            if (r0 == 0) goto L6c7
            java.lang.String r4 = "桥接回调 Hook 不可用，已保留请求观察"
            p000.C0888ux.m5977(r6, r4, r0)     // Catch: java.lang.Throwable -> L678
        L6c7:
            p000.bd1.m917(r5)     // Catch: java.lang.Throwable -> L6cc
            r4 = r2
            goto L6d2
        L6cc:
            r0 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L678
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L678
        L6d2:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L678
            if (r0 == 0) goto L6dd
            java.lang.String r4 = "响应监控 Hook 不可用，已降级为桥接回调观察"
            p000.C0888ux.m5977(r6, r4, r0)     // Catch: java.lang.Throwable -> L678
        L6dd:
            java.lang.String r0 = "rfd9083af6ee7091f"
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> L678
            r11 = 0
            goto L6f4
        L6e4:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L678
            java.lang.String r4 = "未找到唯一的 Hamlet HTTP 桥接方法"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L678
            throw r0     // Catch: java.lang.Throwable -> L678
        L6ec:
            r7.set(r11)
            java.lang.String r4 = "安装 DEV 只读请求观察器失败"
            p000.C0888ux.m5977(r6, r4, r0)
        L6f4:
            java.lang.ClassLoader r0 = r1.f13011
            p000.ry1.m5258(r0)
            java.lang.ClassLoader r0 = r1.f13011
            r3.m5297(r0, r9)
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ry1.f9586
            boolean r0 = r0.compareAndSet(r11, r9)
            if (r0 != 0) goto L707
            goto L723
        L707:
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r3 = "onResume"
            hx r4 = new hx     // Catch: java.lang.Throwable -> L71d
            r4.<init>(r1, r9)     // Catch: java.lang.Throwable -> L71d
            java.lang.Object[] r1 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L71d
            p000.qe0.m4873(r0, r3, r1)     // Catch: java.lang.Throwable -> L71d
            java.lang.String r0 = "Activity.onResume 监听已部署"
            p000.ry1.m5274(r0)     // Catch: java.lang.Throwable -> L71d
            goto L723
        L71d:
            r0 = move-exception
            java.lang.String r1 = "Activity Hook 失败"
            p000.ry1.m5275(r1, r0)
        L723:
            return r2
        L724:
            z81 r0 = r0.f11251
            x10 r1 = p000.x10.f11972
            java.lang.ClassLoader r0 = r0.f13011
            r1.m6502(r0)
            goto L19b
        L72f:
            z81 r0 = r0.f11251
            com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook r1 = com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook.INSTANCE
            java.lang.ClassLoader r0 = r0.f13011
            r1.init(r0)
            goto L19b
        L73a:
            z81 r0 = r0.f11251
            java.util.Set r1 = p000.AbstractC0081bl.f1772
            java.lang.String r1 = "comment_control"
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.C0472kk.f5954
            r11 = 0
            boolean r4 = r4.compareAndSet(r11, r9)
            if (r4 != 0) goto L74a
            goto L75c
        L74a:
            java.util.concurrent.ConcurrentHashMap r4 = p000.C0777rx.f9562
            wj r4 = new wj
            r4.<init>(r3)
            p000.C0777rx.m5178(r1, r4)
            wj r3 = new wj
            r3.<init>(r2)
            p000.C0777rx.m5177(r1, r3)
        L75c:
            java.lang.ClassLoader r0 = r0.f13011
            p000.AbstractC0081bl.m977(r0)
            goto L19b
        L763:
            z81 r0 = r0.f11251
            java.lang.ClassLoader r0 = r0.f13011
            p000.AbstractC0782s1.m5336(r0)
            goto L19b
        L76c:
            z81 r0 = r0.f11251
            s62 r1 = p000.s62.f9751
            i10 r2 = p000.i10.f4867
            java.lang.ClassLoader r0 = r0.f13011
            r0.getClass()
            p000.i10.f4870 = r0
            q00 r3 = p000.i10.f4872
            q00 r4 = p000.i10.f4871
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.i10.f4868
            r11 = 0
            boolean r0 = r5.compareAndSet(r11, r9)
            if (r0 != 0) goto L787
            goto L7c7
        L787:
            p000.ui1.m5882(r4)     // Catch: java.lang.Throwable -> L794
            r3.getClass()     // Catch: java.lang.Throwable -> L794
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.ui1.f10852     // Catch: java.lang.Throwable -> L794
            r0.add(r3)     // Catch: java.lang.Throwable -> L794
            r6 = r1
            goto L79a
        L794:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
        L79a:
            java.lang.Throwable r0 = p000.fo1.m2190(r6)
            if (r0 == 0) goto L7c7
            r11 = 0
            r5.set(r11)
            java.lang.Object r5 = p000.ui1.f10844     // Catch: java.lang.Throwable -> L7ae
            r4.getClass()     // Catch: java.lang.Throwable -> L7ae
            java.util.concurrent.CopyOnWriteArrayList r5 = p000.ui1.f10853     // Catch: java.lang.Throwable -> L7ae
            r5.remove(r4)     // Catch: java.lang.Throwable -> L7ae
        L7ae:
            java.lang.Object r4 = p000.ui1.f10844     // Catch: java.lang.Throwable -> L7b8
            r3.getClass()     // Catch: java.lang.Throwable -> L7b8
            java.util.concurrent.CopyOnWriteArrayList r4 = p000.ui1.f10852     // Catch: java.lang.Throwable -> L7b8
            r4.remove(r3)     // Catch: java.lang.Throwable -> L7b8
        L7b8:
            java.lang.String r3 = "r884b4b855564017b"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "注册配置监听失败: "
            java.lang.String r0 = p000.lz1.m3687(r4, r0)
            p000.C0888ux.m5988(r3, r0, r7, r8, r7)
        L7c7:
            r2.m2580()
            return r1
        L7cb:
            z81 r0 = r0.f11251
            s62 r1 = p000.s62.f9751
            ht0 r2 = p000.ht0.f4800
            java.lang.String r3 = "r887cfbb8e325e13c"
            java.lang.String r4 = "attach-stage 已使用最终 ClassLoader 重试底栏发现: "
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.ht0.f4803     // Catch: java.lang.Throwable -> L7e1
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L7e1
            if (r5 != 0) goto L7e3
            r2.m2540(r0)     // Catch: java.lang.Throwable -> L7e1
            goto L7e3
        L7e1:
            r0 = move-exception
            goto L809
        L7e3:
            p000.ht0.m2534()     // Catch: java.lang.Throwable -> L7e1
            java.lang.ClassLoader r2 = r0.f13011     // Catch: java.lang.Throwable -> L7e1
            p000.ht0.m2536(r2)     // Catch: java.lang.Throwable -> L7e1
            android.os.Handler r2 = p000.ht0.f4806     // Catch: java.lang.Throwable -> L7e1
            fb0 r5 = new fb0     // Catch: java.lang.Throwable -> L7e1
            r6 = 6
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7e1
            r2.post(r5)     // Catch: java.lang.Throwable -> L7e1
            java.lang.ClassLoader r0 = r0.f13011     // Catch: java.lang.Throwable -> L7e1
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L7e1
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L7e1
            java.lang.String r0 = r4.concat(r0)     // Catch: java.lang.Throwable -> L7e1
            p000.C0888ux.m5988(r3, r0, r7, r8, r7)     // Catch: java.lang.Throwable -> L7e1
            r2 = r1
            goto L80e
        L809:
            eo1 r2 = new eo1
            r2.<init>(r0)
        L80e:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            if (r0 == 0) goto L819
            java.lang.String r2 = "attach-stage 重试液态玻璃底栏失败，保留宿主原底栏"
            p000.C0888ux.m5977(r3, r2, r0)
        L819:
            return r1
        L81a:
            z81 r0 = r0.f11251
            com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook r1 = com.example.dyhelper.hook.comment.bookmark.CommentRouterTraceHook.INSTANCE
            java.lang.ClassLoader r0 = r0.f13011
            r1.init(r0)
            goto L19b
    }
}
