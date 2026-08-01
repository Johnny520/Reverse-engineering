package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛶᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0370 implements xhss.InterfaceC0030 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1350;

    public /* synthetic */ C0370(int r1) {
            r0 = this;
            r0.f1350 = r1
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0030
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Object mo136() {
            r5 = this;
            int r5 = r5.f1350
            r0 = 4
            r1 = 2
            r2 = 0
            switch(r5) {
                case 0: goto L1bc;
                case 1: goto L1ae;
                case 2: goto L19a;
                case 3: goto L170;
                case 4: goto L146;
                case 5: goto L125;
                case 6: goto L116;
                case 7: goto L10e;
                case 8: goto L107;
                case 9: goto Ldb;
                case 10: goto Lbe;
                case 11: goto Lb4;
                case 12: goto L64;
                case 13: goto L3f;
                case 14: goto L33;
                case 15: goto L20;
                default: goto L8;
            }
        L8:
            xhss.ᛶᲀᛴᲁ r5 = new xhss.ᛶᲀᛴᲁ
            io.github.libxposed.api.XposedModuleInterface$PackageLoadedParam r0 = xhss.C1085.f3496
            if (r0 == 0) goto L13
            r5.<init>(r0)
            r2 = r5
            goto L1f
        L13:
            r0 = -228857794103365(0xffff2fdae47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r0)
            xhss.C0532.m950(r5)
        L1f:
            return r2
        L20:
            com.xingin.xhss.ModuleMain r5 = xhss.C1085.f3504
            if (r5 == 0) goto L26
            r2 = r5
            goto L32
        L26:
            r0 = -228741829986373(0xffff2ff5e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r0)
            xhss.C0532.m950(r5)
        L32:
            return r2
        L33:
            xhss.ᲇᲁᛱᛸ r5 = xhss.C1085.f3497
            r5.getClass()
            android.content.pm.ApplicationInfo r5 = xhss.C1085.m1760()
            java.lang.String r5 = r5.sourceDir
            return r5
        L3f:
            xhss.ᛲᛱᛶᲇ r5 = xhss.AbstractC0326.f1237
            xhss.ᛳᛲᛳᛲ r5 = xhss.ExecutorC0237.f902
            xhss.ᲇᛸᲈᛳ r0 = new xhss.ᲇᛸᲈᛳ
            r0.<init>()
            xhss.ᛴᛵᛳᛵ r5 = xhss.AbstractC0060.m188(r5, r0)
            xhss.ᛶᛸᲀᛷ r0 = new xhss.ᛶᛸᲀᛷ
            xhss.ᛳᛴᲀᲁ r1 = xhss.C0263.f977
            xhss.ᛳᛵᲈᛲ r1 = r5.mo442(r1)
            if (r1 == 0) goto L57
            goto L60
        L57:
            xhss.ᲁᛳᛶᛴ r1 = new xhss.ᲁᛳᛶᛴ
            r1.<init>()
            xhss.ᛴᛵᛳᛵ r5 = r5.mo599(r1)
        L60:
            r0.<init>(r5)
            return r0
        L64:
            xhss.ᲈᛵᲈᛶ r5 = xhss.C1144.f3704
            java.lang.ClassLoader r5 = r5.m1655()     // Catch: java.lang.Throwable -> L8b
            r0 = -307588839606341(0xfffee83fe47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.Class r5 = r5.loadClass(r0)     // Catch: java.lang.Throwable -> L8b
            r0 = -307691918821445(0xfffee827e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L8b
            java.lang.reflect.Method r5 = r5.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L8b
            goto L92
        L8b:
            r5 = move-exception
            xhss.ᲈᛳᛱᲇ r0 = new xhss.ᲈᛳᛱᲇ
            r0.<init>(r5)
            r5 = r0
        L92:
            java.lang.Throwable r0 = xhss.AbstractC0134.m364(r5)
            if (r0 == 0) goto Lab
            r3 = -307713393657925(0xfffee822e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r3)
            r0.getMessage()
            r0 = -278211263301701(0xffff02f7e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
        Lab:
            boolean r0 = r5 instanceof xhss.C1129
            if (r0 == 0) goto Lb0
            goto Lb1
        Lb0:
            r2 = r5
        Lb1:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            return r2
        Lb4:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            return r5
        Lbe:
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            long r0 = r5.maxMemory()
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r2
            int r5 = (int) r0
            int r5 = r5 / 16
            r0 = 8192(0x2000, float:1.148E-41)
            r1 = 32768(0x8000, float:4.5918E-41)
            int r5 = xhss.AbstractC0473.m865(r5, r0, r1)
            xhss.ᲀᛶᲇᛴ r0 = new xhss.ᲀᛶᲇᛴ
            r0.<init>(r5)
            return r0
        Ldb:
            java.lang.Class<xhss.ᲁᛴᛱᛱ> r5 = xhss.AbstractC0943.class
            java.lang.ClassLoader r5 = r5.getClassLoader()
            java.lang.String r0 = "android.os.Build"
            int r1 = xhss.AbstractC0025.f204
            java.lang.Class r5 = r5.loadClass(r0)     // Catch: java.lang.Throwable -> Lee
            if (r5 == 0) goto Lec
            goto Lf5
        Lec:
            r5 = r2
            goto Lf5
        Lee:
            r5 = move-exception
            xhss.ᲈᛳᛱᲇ r0 = new xhss.ᲈᛳᛱᲇ
            r0.<init>(r5)
            r5 = r0
        Lf5:
            boolean r0 = r5 instanceof xhss.C1129
            if (r0 == 0) goto Lfa
            goto Lfb
        Lfa:
            r2 = r5
        Lfb:
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto L101
            r5 = 1
            goto L102
        L101:
            r5 = 0
        L102:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L107:
            java.lang.String r5 = "KavaRef"
            xhss.ᲀᛶᛶᲀ r5 = xhss.AbstractC0993.m1629(r5)
            return r5
        L10e:
            xhss.ᲈᛲᛶᛴ r5 = new xhss.ᲈᛲᛶᛴ
            xhss.ᛵᛶᛱᛸ r0 = xhss.C0477.f1721
            r5.<init>(r0)
            return r5
        L116:
            xhss.ᛵᛶᛱᛸ r5 = new xhss.ᛵᛶᛱᛸ
            r5.<init>()
            xhss.ᛱᲀᛸᛸ r0 = xhss.C0089.f434
            r5.f1727 = r0
            xhss.ᲈᛲᛶᛴ r0 = new xhss.ᲈᛲᛶᛴ
            r0.<init>(r5)
            return r0
        L125:
            xhss.ᛷᛶᛱᛶ r5 = new xhss.ᛷᛶᛱᛶ
            r5.<init>()
            r0 = 10
            int r0 = xhss.AbstractC0559.m986(r0)
            r5.f2263 = r0
            r0 = 30
            int r2 = xhss.AbstractC0559.m986(r0)
            r5.f2267 = r2
            int r0 = xhss.AbstractC0559.m986(r0)
            r5.f2260 = r0
            xhss.ᛵᛸᛷᛲ r0 = new xhss.ᛵᛸᛷᛲ
            r0.<init>(r5)
            return r0
        L146:
            r2 = -233041092249669(0xffff2c0ce47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r2)
            r2 = -233071157020741(0xffff2c05e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.util.EnumMap r3 = com.tencent.mmkv.MMKV.f129
            xhss.ᛱᲇᛴᲇ r3 = new xhss.ᛱᲇᛴᲇ
            r3.<init>(r0)
            r3.f485 = r1
            r3.f486 = r2
            com.tencent.mmkv.MMKV r5 = com.tencent.mmkv.MMKV.m74(r5, r3)
            r0 = -233212890941509(0xffff2be4e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            return r5
        L170:
            r2 = -232800574081093(0xffff2c44e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r2)
            r2 = -232830638852165(0xffff2c3de47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.util.EnumMap r3 = com.tencent.mmkv.MMKV.f129
            xhss.ᛱᲇᛴᲇ r3 = new xhss.ᛱᲇᛴᲇ
            r3.<init>(r0)
            r3.f485 = r1
            r3.f486 = r2
            com.tencent.mmkv.MMKV r5 = com.tencent.mmkv.MMKV.m74(r5, r3)
            r0 = -232972372772933(0xffff2c1ce47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            return r5
        L19a:
            xhss.ᲇᲁᛱᛸ r5 = xhss.C1085.f3497
            r5.getClass()
            xhss.ᛴᛷᛱ r5 = xhss.C1085.f3501
            java.lang.Object r5 = r5.m734()
            xhss.ᛶᲀᛴᲁ r5 = (xhss.C0589) r5
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            java.lang.String r5 = r5.sourceDir
            return r5
        L1ae:
            xhss.ᲇᲁᛱᛸ r5 = xhss.C1085.f3497
            r5.getClass()
            xhss.ᛴᛷᛱ r5 = xhss.C1085.f3501
            java.lang.Object r5 = r5.m734()
            xhss.ᛶᲀᛴᲁ r5 = (xhss.C0589) r5
            return r5
        L1bc:
            xhss.ᲇᲁᛱᛸ r5 = xhss.C1085.f3497
            r5.getClass()
            xhss.ᛴᛷᛱ r5 = xhss.C1085.f3501
            java.lang.Object r5 = r5.m734()
            xhss.ᛶᲀᛴᲁ r5 = (xhss.C0589) r5
            java.lang.ClassLoader r5 = r5.getDefaultClassLoader()
            return r5
    }
}
