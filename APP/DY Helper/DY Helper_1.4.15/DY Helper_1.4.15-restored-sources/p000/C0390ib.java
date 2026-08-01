package p000;

/* JADX INFO: renamed from: ib */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0390ib implements io.github.libxposed.api.XposedInterface.Hooker {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f4979;

    public /* synthetic */ C0390ib(int r1) {
            r0 = this;
            r0.f4979 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final java.lang.Object m2701(io.github.libxposed.api.XposedInterface.Chain r5) {
            r4 = this;
            sb r4 = p000.C0792sb.f9786
            java.lang.String r0 = "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7000C6ADBCAD99044D3E8549548CF07CFE2D"
            r5.getClass()
            r1 = 0
            java.lang.Object r2 = r5.proceed()     // Catch: java.lang.Throwable -> L56
            java.lang.Object r5 = r5.getThisObject()
            boolean r3 = r5 instanceof android.app.Activity
            if (r3 == 0) goto L17
            android.app.Activity r5 = (android.app.Activity) r5
            goto L18
        L17:
            r5 = r1
        L18:
            if (r5 == 0) goto L55
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L55
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            p000.C0792sb.f9808 = r0
            r4.m5430(r5)
            p000.C0792sb.m5409(r5)
            boolean r0 = p000.C0792sb.f9798
            if (r0 == 0) goto L55
            r4.m5431()
            android.view.Window r4 = r5.getWindow()
            if (r4 == 0) goto L4a
            android.view.View r1 = r4.getDecorView()
        L4a:
            if (r1 == 0) goto L55
            hb r4 = new hb
            r5 = 1
            r4.<init>(r1, r5)
            p000.C0792sb.m5401(r4)
        L55:
            return r2
        L56:
            r2 = move-exception
            java.lang.Object r5 = r5.getThisObject()
            boolean r3 = r5 instanceof android.app.Activity
            if (r3 == 0) goto L62
            android.app.Activity r5 = (android.app.Activity) r5
            goto L63
        L62:
            r5 = r1
        L63:
            if (r5 == 0) goto La0
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto La0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            p000.C0792sb.f9808 = r0
            r4.m5430(r5)
            p000.C0792sb.m5409(r5)
            boolean r0 = p000.C0792sb.f9798
            if (r0 == 0) goto La0
            r4.m5431()
            android.view.Window r4 = r5.getWindow()
            if (r4 == 0) goto L95
            android.view.View r1 = r4.getDecorView()
        L95:
            if (r1 == 0) goto La0
            hb r4 = new hb
            r5 = 1
            r4.<init>(r1, r5)
            p000.C0792sb.m5401(r4)
        La0:
            throw r2
    }

    public final java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r15) {
            r14 = this;
            int r0 = r14.f4979
            r1 = 2131606042(0x7f0dba1a, float:1.8838744E38)
            r2 = 2131606033(0x7f0dba11, float:1.8838726E38)
            r3 = 2131606035(0x7f0dba13, float:1.883873E38)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = 10
            r7 = 7
            r8 = 0
            r9 = 8
            r10 = 3
            r11 = 0
            switch(r0) {
                case 0: goto La66;
                case 1: goto L954;
                case 2: goto L7d6;
                case 3: goto L706;
                case 4: goto L69a;
                case 5: goto L652;
                case 6: goto L5f4;
                case 7: goto L5ac;
                case 8: goto L545;
                case 9: goto L51d;
                case 10: goto L49f;
                case 11: goto L44c;
                case 12: goto L406;
                case 13: goto L3c1;
                case 14: goto L37d;
                case 15: goto L337;
                case 16: goto L2d9;
                case 17: goto L27b;
                case 18: goto L1b5;
                case 19: goto L15b;
                case 20: goto Ldd;
                case 21: goto L62;
                case 22: goto L5d;
                default: goto L19;
            }
        L19:
            java.lang.String r14 = "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7000C6ADBCAD99044D3E8549548CF07CFE2D"
            r15.getClass()
            java.lang.Object r0 = r15.proceed()     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.app.Activity
            if (r1 == 0) goto L2d
            r11 = r15
            android.app.Activity r11 = (android.app.Activity) r11
        L2d:
            if (r11 == 0) goto L3e
            java.lang.Class r15 = r11.getClass()
            java.lang.String r15 = r15.getName()
            java.lang.String r14 = p000.jf0.m2957(r14)
            r15.equals(r14)
        L3e:
            return r0
        L3f:
            r0 = move-exception
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.app.Activity
            if (r1 == 0) goto L4b
            r11 = r15
            android.app.Activity r11 = (android.app.Activity) r11
        L4b:
            if (r11 == 0) goto L5c
            java.lang.Class r15 = r11.getClass()
            java.lang.String r15 = r15.getName()
            java.lang.String r14 = p000.jf0.m2957(r14)
            r15.equals(r14)
        L5c:
            throw r0
        L5d:
            java.lang.Object r14 = r14.m2701(r15)
            return r14
        L62:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            java.lang.Object r14 = r15.proceed()     // Catch: java.lang.Throwable -> Lc0
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto Lbf
            boolean r0 = p000.C0792sb.f9800
            if (r0 == 0) goto Lbf
            java.lang.Object r15 = r15.getThisObject()
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto L7e
            android.view.View r15 = (android.view.View) r15
            goto L7f
        L7e:
            r15 = r11
        L7f:
            if (r15 == 0) goto Lbf
            p000.C0792sb.m5393(r15, r9)
            p000.C0792sb.m5416(r15)
            boolean r15 = r14 instanceof android.view.View
            if (r15 == 0) goto L8e
            r11 = r14
            android.view.View r11 = (android.view.View) r11
        L8e:
            if (r11 == 0) goto Lbf
            int r15 = p000.C0792sb.f9804
            int r15 = r15 + 1
            p000.C0792sb.f9804 = r15
            p000.C0792sb.m5417(r11)     // Catch: java.lang.Throwable -> L9a
            goto Lb0
        L9a:
            r15 = move-exception
            java.lang.String r15 = r15.getMessage()     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = "r45c6ac9dd9e8fd7"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb7
            r0.append(r15)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r15 = r0.toString()     // Catch: java.lang.Throwable -> Lb7
            p000.C0888ux.m5985(r15)     // Catch: java.lang.Throwable -> Lb7
        Lb0:
            int r15 = p000.C0792sb.f9804
            int r15 = r15 + (-1)
            p000.C0792sb.f9804 = r15
            goto Lbf
        Lb7:
            r14 = move-exception
            int r15 = p000.C0792sb.f9804
            int r15 = r15 + (-1)
            p000.C0792sb.f9804 = r15
            throw r14
        Lbf:
            return r14
        Lc0:
            r14 = move-exception
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto Ldc
            boolean r0 = p000.C0792sb.f9800
            if (r0 == 0) goto Ldc
            java.lang.Object r15 = r15.getThisObject()
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto Ld4
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        Ld4:
            if (r11 == 0) goto Ldc
            p000.C0792sb.m5393(r11, r9)
            p000.C0792sb.m5416(r11)
        Ldc:
            throw r14
        Ldd:
            java.lang.String r14 = "rcba09e631c0d0743"
            sb r0 = p000.C0792sb.f9786
            r15.getClass()
            java.lang.Object r0 = r15.proceed()     // Catch: java.lang.Throwable -> L121
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto Lf3
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        Lf3:
            if (r11 == 0) goto L120
            p000.C0792sb.m5393(r11, r9)
            boolean r15 = p000.C0792sb.f9800
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r14)
            r2.append(r15)
            r2.append(r1)
            java.lang.String r14 = r2.toString()
            p000.C0888ux.m5985(r14)
            boolean r14 = p000.C0792sb.f9800
            if (r14 == 0) goto L120
            hb r14 = new hb
            r14.<init>(r11, r9)
            p000.C0792sb.m5401(r14)
        L120:
            return r0
        L121:
            r0 = move-exception
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L12d
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L12d:
            if (r11 == 0) goto L15a
            p000.C0792sb.m5393(r11, r9)
            boolean r15 = p000.C0792sb.f9800
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r14)
            r2.append(r15)
            r2.append(r1)
            java.lang.String r14 = r2.toString()
            p000.C0888ux.m5985(r14)
            boolean r14 = p000.C0792sb.f9800
            if (r14 == 0) goto L15a
            hb r14 = new hb
            r14.<init>(r11, r9)
            p000.C0792sb.m5401(r14)
        L15a:
            throw r0
        L15b:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            java.lang.Object r14 = r15.proceed()     // Catch: java.lang.Throwable -> L18c
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto L18b
            boolean r0 = p000.C0792sb.f9798
            if (r0 == 0) goto L18b
            java.lang.Object r15 = r15.getThisObject()
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto L177
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L177:
            if (r11 == 0) goto L18b
            boolean r15 = p000.C0792sb.m5389(r11)
            if (r15 == 0) goto L18b
            p000.C0792sb.m5393(r11, r10)
            boolean r15 = p000.C0792sb.m5387()
            if (r15 == 0) goto L18b
            p000.C0792sb.m5427(r11)
        L18b:
            return r14
        L18c:
            r14 = move-exception
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto L1b4
            boolean r0 = p000.C0792sb.f9798
            if (r0 == 0) goto L1b4
            java.lang.Object r15 = r15.getThisObject()
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto L1a0
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L1a0:
            if (r11 == 0) goto L1b4
            boolean r15 = p000.C0792sb.m5389(r11)
            if (r15 == 0) goto L1b4
            p000.C0792sb.m5393(r11, r10)
            boolean r15 = p000.C0792sb.m5387()
            if (r15 == 0) goto L1b4
            p000.C0792sb.m5427(r11)
        L1b4:
            throw r14
        L1b5:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            int r14 = p000.C0792sb.f9804
            if (r14 > 0) goto L276
            boolean r14 = p000.C0792sb.m5387()
            if (r14 != 0) goto L1c6
            goto L276
        L1c6:
            java.lang.Object r14 = r15.getThisObject()
            boolean r0 = r14 instanceof android.view.View
            if (r0 == 0) goto L1d1
            r11 = r14
            android.view.View r11 = (android.view.View) r11
        L1d1:
            if (r11 != 0) goto L1d9
            java.lang.Object r14 = r15.proceed()
            goto L27a
        L1d9:
            boolean r14 = p000.C0792sb.m5390(r11)
            if (r14 != 0) goto L271
            boolean r14 = p000.C0792sb.m5389(r11)
            if (r14 != 0) goto L1e7
            goto L271
        L1e7:
            p000.C0792sb.m5393(r11, r10)
            java.util.List r14 = r15.getArgs()
            r14.getClass()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Object[] r14 = r14.toArray(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r14[r8] = r0
            java.lang.Object r14 = r15.proceed(r14)     // Catch: java.lang.Throwable -> L238
            int r15 = p000.C0792sb.f9804
            if (r15 > 0) goto L27a
            boolean r15 = p000.C0792sb.m5387()
            if (r15 == 0) goto L27a
            boolean r15 = p000.C0792sb.m5390(r11)
            if (r15 != 0) goto L27a
            boolean r15 = p000.C0792sb.m5389(r11)
            if (r15 == 0) goto L27a
            float r15 = r11.getTranslationY()
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 != 0) goto L220
            goto L27a
        L220:
            int r15 = p000.C0792sb.f9804
            int r15 = r15 + 1
            p000.C0792sb.f9804 = r15
            r11.setTranslationY(r5)     // Catch: java.lang.Throwable -> L230
            int r15 = p000.C0792sb.f9804
            int r15 = r15 + (-1)
            p000.C0792sb.f9804 = r15
            goto L27a
        L230:
            r14 = move-exception
            int r15 = p000.C0792sb.f9804
            int r15 = r15 + (-1)
            p000.C0792sb.f9804 = r15
            throw r14
        L238:
            r14 = move-exception
            int r15 = p000.C0792sb.f9804
            if (r15 > 0) goto L270
            boolean r15 = p000.C0792sb.m5387()
            if (r15 == 0) goto L270
            boolean r15 = p000.C0792sb.m5390(r11)
            if (r15 != 0) goto L270
            boolean r15 = p000.C0792sb.m5389(r11)
            if (r15 == 0) goto L270
            float r15 = r11.getTranslationY()
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 != 0) goto L258
            goto L270
        L258:
            int r15 = p000.C0792sb.f9804
            int r15 = r15 + 1
            p000.C0792sb.f9804 = r15
            r11.setTranslationY(r5)     // Catch: java.lang.Throwable -> L268
            int r15 = p000.C0792sb.f9804
            int r15 = r15 + (-1)
            p000.C0792sb.f9804 = r15
            goto L270
        L268:
            r14 = move-exception
            int r15 = p000.C0792sb.f9804
            int r15 = r15 + (-1)
            p000.C0792sb.f9804 = r15
            throw r14
        L270:
            throw r14
        L271:
            java.lang.Object r14 = r15.proceed()
            goto L27a
        L276:
            java.lang.Object r14 = r15.proceed()
        L27a:
            return r14
        L27b:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            int r14 = p000.C0792sb.f9804
            if (r14 > 0) goto L2d4
            boolean r14 = p000.C0792sb.f9798
            if (r14 != 0) goto L289
            goto L2d4
        L289:
            java.lang.Object r14 = r15.getThisObject()
            boolean r0 = r14 instanceof android.view.View
            if (r0 == 0) goto L294
            r11 = r14
            android.view.View r11 = (android.view.View) r11
        L294:
            if (r11 != 0) goto L29b
            java.lang.Object r14 = r15.proceed()
            goto L2d8
        L29b:
            p000.C0792sb.m5393(r11, r10)
            java.util.List r14 = r15.getArgs()
            r14.getClass()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Object[] r14 = r14.toArray(r0)
            boolean r0 = p000.C0792sb.m5387()
            if (r0 == 0) goto L2b7
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            r14[r8] = r0
        L2b7:
            java.lang.Object r14 = r15.proceed(r14)     // Catch: java.lang.Throwable -> L2c7
            int r15 = p000.C0792sb.f9804
            if (r15 > 0) goto L2d8
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L2d8
            p000.C0792sb.m5427(r11)
            goto L2d8
        L2c7:
            r14 = move-exception
            int r15 = p000.C0792sb.f9804
            if (r15 > 0) goto L2d3
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L2d3
            p000.C0792sb.m5427(r11)
        L2d3:
            throw r14
        L2d4:
            java.lang.Object r14 = r15.proceed()
        L2d8:
            return r14
        L2d9:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            int r14 = p000.C0792sb.f9804
            if (r14 > 0) goto L332
            boolean r14 = p000.C0792sb.f9798
            if (r14 != 0) goto L2e7
            goto L332
        L2e7:
            java.lang.Object r14 = r15.getThisObject()
            boolean r0 = r14 instanceof android.view.View
            if (r0 == 0) goto L2f2
            r11 = r14
            android.view.View r11 = (android.view.View) r11
        L2f2:
            if (r11 != 0) goto L2f9
            java.lang.Object r14 = r15.proceed()
            goto L336
        L2f9:
            p000.C0792sb.m5393(r11, r10)
            java.util.List r14 = r15.getArgs()
            r14.getClass()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Object[] r14 = r14.toArray(r0)
            boolean r0 = p000.C0792sb.m5387()
            if (r0 == 0) goto L315
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r14[r8] = r0
        L315:
            java.lang.Object r14 = r15.proceed(r14)     // Catch: java.lang.Throwable -> L325
            int r15 = p000.C0792sb.f9804
            if (r15 > 0) goto L336
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L336
            p000.C0792sb.m5427(r11)
            goto L336
        L325:
            r14 = move-exception
            int r15 = p000.C0792sb.f9804
            if (r15 > 0) goto L331
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L331
            p000.C0792sb.m5427(r11)
        L331:
            throw r14
        L332:
            java.lang.Object r14 = r15.proceed()
        L336:
            return r14
        L337:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            r14 = 9
            java.lang.Object r0 = r15.proceed()     // Catch: java.lang.Throwable -> L35f
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L34d
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L34d:
            if (r11 == 0) goto L35e
            p000.C0792sb.m5393(r11, r10)
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L35e
            jb r15 = new jb
            r15.<init>(r11, r14)
            r11.post(r15)
        L35e:
            return r0
        L35f:
            r0 = move-exception
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L36b
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L36b:
            if (r11 == 0) goto L37c
            p000.C0792sb.m5393(r11, r10)
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L37c
            jb r15 = new jb
            r15.<init>(r11, r14)
            r11.post(r15)
        L37c:
            throw r0
        L37d:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            java.lang.Object r14 = r15.proceed()     // Catch: java.lang.Throwable -> L3a3
            java.lang.Object r15 = r15.getThisObject()
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto L391
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L391:
            if (r11 == 0) goto L3a2
            p000.C0792sb.m5393(r11, r10)
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L3a2
            jb r15 = new jb
            r15.<init>(r11, r6)
            r11.post(r15)
        L3a2:
            return r14
        L3a3:
            r14 = move-exception
            java.lang.Object r15 = r15.getThisObject()
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto L3af
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L3af:
            if (r11 == 0) goto L3c0
            p000.C0792sb.m5393(r11, r10)
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L3c0
            jb r15 = new jb
            r15.<init>(r11, r6)
            r11.post(r15)
        L3c0:
            throw r14
        L3c1:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            r14 = 6
            java.lang.Object r0 = r15.proceed()     // Catch: java.lang.Throwable -> L3e8
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L3d6
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L3d6:
            if (r11 == 0) goto L3e7
            p000.C0792sb.m5393(r11, r10)
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L3e7
            jb r15 = new jb
            r15.<init>(r11, r14)
            r11.post(r15)
        L3e7:
            return r0
        L3e8:
            r0 = move-exception
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L3f4
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L3f4:
            if (r11 == 0) goto L405
            p000.C0792sb.m5393(r11, r10)
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L405
            jb r15 = new jb
            r15.<init>(r11, r14)
            r11.post(r15)
        L405:
            throw r0
        L406:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            r14 = 11
            java.lang.Object r0 = r15.proceed()     // Catch: java.lang.Throwable -> L42e
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L41c
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L41c:
            if (r11 == 0) goto L42d
            p000.C0792sb.m5393(r11, r10)
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L42d
            hb r15 = new hb
            r15.<init>(r11, r14)
            p000.C0792sb.m5401(r15)
        L42d:
            return r0
        L42e:
            r0 = move-exception
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L43a
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L43a:
            if (r11 == 0) goto L44b
            p000.C0792sb.m5393(r11, r10)
            boolean r15 = p000.C0792sb.f9798
            if (r15 == 0) goto L44b
            hb r15 = new hb
            r15.<init>(r11, r14)
            p000.C0792sb.m5401(r15)
        L44b:
            throw r0
        L44c:
            r15.getClass()
            boolean r14 = p000.C0792sb.f9800
            if (r14 != 0) goto L458
            java.lang.Object r14 = r15.proceed()
            goto L49e
        L458:
            java.lang.Object r14 = r15.getThisObject()
            boolean r0 = r14 instanceof android.view.View
            if (r0 == 0) goto L463
            r11 = r14
            android.view.View r11 = (android.view.View) r11
        L463:
            if (r11 != 0) goto L46a
            java.lang.Object r14 = r15.proceed()
            goto L49e
        L46a:
            sb r14 = p000.C0792sb.f9786
            p000.C0792sb.m5393(r11, r9)
            p000.C0792sb.m5416(r11)
            java.lang.reflect.Executable r14 = r15.getExecutable()
            r14.getClass()
            boolean r0 = r14 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L49a
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.Class r0 = r14.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L497
            java.lang.Class r14 = r14.getReturnType()
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r14 = p000.ln0.m3626(r14, r0)
            if (r14 == 0) goto L49a
        L497:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            goto L49e
        L49a:
            java.lang.Object r14 = r15.proceed()
        L49e:
            return r14
        L49f:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            java.lang.Object r0 = r15.proceed()     // Catch: java.lang.Throwable -> L4e2
            int r1 = p000.C0792sb.f9804
            if (r1 > 0) goto L4e1
            boolean r1 = p000.C0792sb.m5387()
            if (r1 == 0) goto L4e1
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L4bd
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L4bd:
            if (r11 == 0) goto L4e1
            boolean r15 = p000.C0792sb.m5390(r11)
            if (r15 != 0) goto L4e1
            boolean r15 = p000.C0792sb.m5389(r11)
            if (r15 == 0) goto L4d2
            p000.C0792sb.m5393(r11, r10)
            p000.C0792sb.m5406(r11)
            goto L4e1
        L4d2:
            android.view.View r15 = p000.C0792sb.m5411(r14, r11)
            if (r15 == 0) goto L4e1
            boolean r14 = r14.m5429(r11)
            if (r14 == 0) goto L4e1
            p000.C0792sb.m5405(r11)
        L4e1:
            return r0
        L4e2:
            r0 = move-exception
            int r1 = p000.C0792sb.f9804
            if (r1 > 0) goto L51c
            boolean r1 = p000.C0792sb.m5387()
            if (r1 == 0) goto L51c
            java.lang.Object r15 = r15.getThisObject()
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L4f8
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L4f8:
            if (r11 == 0) goto L51c
            boolean r15 = p000.C0792sb.m5390(r11)
            if (r15 != 0) goto L51c
            boolean r15 = p000.C0792sb.m5389(r11)
            if (r15 != 0) goto L516
            android.view.View r15 = p000.C0792sb.m5411(r14, r11)
            if (r15 == 0) goto L51c
            boolean r14 = r14.m5429(r11)
            if (r14 == 0) goto L51c
            p000.C0792sb.m5405(r11)
            goto L51c
        L516:
            p000.C0792sb.m5393(r11, r10)
            p000.C0792sb.m5406(r11)
        L51c:
            throw r0
        L51d:
            r15.getClass()
            sb r14 = p000.C0792sb.f9786
            boolean r14 = p000.C0792sb.m5387()
            if (r14 != 0) goto L52d
            java.lang.Object r14 = r15.proceed()
            goto L544
        L52d:
            java.lang.Object r14 = r15.getThisObject()
            boolean r0 = r14 instanceof android.view.View
            if (r0 == 0) goto L538
            r11 = r14
            android.view.View r11 = (android.view.View) r11
        L538:
            if (r11 != 0) goto L53f
            java.lang.Object r14 = r15.proceed()
            goto L544
        L53f:
            p000.C0792sb.m5393(r11, r7)
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
        L544:
            return r14
        L545:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            int r14 = p000.C0792sb.f9804
            if (r14 > 0) goto L5a7
            boolean r14 = p000.C0792sb.m5387()
            if (r14 != 0) goto L555
            goto L5a7
        L555:
            java.lang.Object r14 = r15.getThisObject()
            boolean r0 = r14 instanceof android.view.View
            if (r0 == 0) goto L560
            android.view.View r14 = (android.view.View) r14
            goto L561
        L560:
            r14 = r11
        L561:
            if (r14 != 0) goto L568
            java.lang.Object r14 = r15.proceed()
            goto L5ab
        L568:
            p000.C0792sb.m5393(r14, r7)
            java.util.List r0 = r15.getArgs()
            r0.getClass()
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Object[] r0 = r0.toArray(r1)
            r1 = r0[r8]
            boolean r2 = r1 instanceof android.view.ViewGroup.LayoutParams
            if (r2 == 0) goto L581
            r11 = r1
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
        L581:
            if (r11 == 0) goto L585
            r11.height = r8
        L585:
            java.lang.Object r15 = r15.proceed(r0)     // Catch: java.lang.Throwable -> L598
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto L596
            boolean r0 = p000.C0792sb.m5387()
            if (r0 == 0) goto L596
            p000.C0792sb.m5415(r14)
        L596:
            r14 = r15
            goto L5ab
        L598:
            r15 = move-exception
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto L5a6
            boolean r0 = p000.C0792sb.m5387()
            if (r0 == 0) goto L5a6
            p000.C0792sb.m5415(r14)
        L5a6:
            throw r15
        L5a7:
            java.lang.Object r14 = r15.proceed()
        L5ab:
            return r14
        L5ac:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            java.lang.Object r14 = r15.proceed()     // Catch: java.lang.Throwable -> L5d4
            java.lang.Object r15 = r15.getThisObject()
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto L5c0
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L5c0:
            if (r11 == 0) goto L5d3
            p000.C0792sb.m5393(r11, r7)
            boolean r15 = p000.C0792sb.m5387()
            if (r15 == 0) goto L5d3
            jb r15 = new jb
            r15.<init>(r11, r9)
            r11.post(r15)
        L5d3:
            return r14
        L5d4:
            r14 = move-exception
            java.lang.Object r15 = r15.getThisObject()
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto L5e0
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L5e0:
            if (r11 == 0) goto L5f3
            p000.C0792sb.m5393(r11, r7)
            boolean r15 = p000.C0792sb.m5387()
            if (r15 == 0) goto L5f3
            jb r15 = new jb
            r15.<init>(r11, r9)
            r11.post(r15)
        L5f3:
            throw r14
        L5f4:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            int r14 = p000.C0792sb.f9804
            if (r14 > 0) goto L64d
            boolean r14 = p000.C0792sb.m5387()
            if (r14 != 0) goto L604
            goto L64d
        L604:
            java.lang.Object r14 = r15.getThisObject()
            boolean r0 = r14 instanceof android.view.View
            if (r0 == 0) goto L60f
            r11 = r14
            android.view.View r11 = (android.view.View) r11
        L60f:
            if (r11 != 0) goto L616
            java.lang.Object r14 = r15.proceed()
            goto L651
        L616:
            p000.C0792sb.m5393(r11, r7)
            java.util.List r14 = r15.getArgs()
            r14.getClass()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Object[] r14 = r14.toArray(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r14[r8] = r0
            java.lang.Object r14 = r15.proceed(r14)     // Catch: java.lang.Throwable -> L63e
            int r15 = p000.C0792sb.f9804
            if (r15 > 0) goto L651
            boolean r15 = p000.C0792sb.m5387()
            if (r15 == 0) goto L651
            p000.C0792sb.m5415(r11)
            goto L651
        L63e:
            r14 = move-exception
            int r15 = p000.C0792sb.f9804
            if (r15 > 0) goto L64c
            boolean r15 = p000.C0792sb.m5387()
            if (r15 == 0) goto L64c
            p000.C0792sb.m5415(r11)
        L64c:
            throw r14
        L64d:
            java.lang.Object r14 = r15.proceed()
        L651:
            return r14
        L652:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            java.lang.Object r14 = r15.proceed()     // Catch: java.lang.Throwable -> L67a
            java.lang.Object r15 = r15.getThisObject()
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto L666
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L666:
            if (r11 == 0) goto L679
            p000.C0792sb.m5393(r11, r7)
            boolean r15 = p000.C0792sb.m5387()
            if (r15 == 0) goto L679
            hb r15 = new hb
            r15.<init>(r11, r6)
            p000.C0792sb.m5401(r15)
        L679:
            return r14
        L67a:
            r14 = move-exception
            java.lang.Object r15 = r15.getThisObject()
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto L686
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L686:
            if (r11 == 0) goto L699
            p000.C0792sb.m5393(r11, r7)
            boolean r15 = p000.C0792sb.m5387()
            if (r15 == 0) goto L699
            hb r15 = new hb
            r15.<init>(r11, r6)
            p000.C0792sb.m5401(r15)
        L699:
            throw r14
        L69a:
            r15.getClass()
            int r14 = p000.C0792sb.f9804
            if (r14 > 0) goto L701
            sb r14 = p000.C0792sb.f9786
            boolean r14 = p000.C0792sb.m5387()
            if (r14 != 0) goto L6aa
            goto L701
        L6aa:
            java.lang.Object r14 = r15.getThisObject()
            boolean r0 = r14 instanceof android.view.View
            if (r0 == 0) goto L6b5
            android.view.View r14 = (android.view.View) r14
            goto L6b6
        L6b5:
            r14 = r11
        L6b6:
            if (r14 != 0) goto L6bd
            java.lang.Object r11 = r15.proceed()
            goto L705
        L6bd:
            boolean r0 = p000.C0792sb.m5388(r14)
            if (r0 != 0) goto L6c8
            java.lang.Object r11 = r15.proceed()
            goto L705
        L6c8:
            p000.C0792sb.m5393(r14, r7)
            java.util.List r15 = r15.getArgs()
            java.lang.Object r15 = r15.get(r8)
            r15.getClass()
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            java.lang.Class r0 = java.lang.Integer.TYPE
            r0.getClass()
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r0}
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "setMeasuredDimension"
            java.lang.reflect.Method r0 = p000.C0792sb.m5413(r1, r2, r0)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r15 = new java.lang.Object[]{r15, r1}
            r0.invoke(r14, r15)
            goto L705
        L701:
            java.lang.Object r11 = r15.proceed()
        L705:
            return r11
        L706:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            java.lang.Object r14 = r15.proceed()     // Catch: java.lang.Throwable -> L772
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto L771
            boolean r0 = p000.C0792sb.f9800
            if (r0 == 0) goto L771
            java.lang.Object r0 = r15.getThisObject()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L722
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L723
        L722:
            r0 = r11
        L723:
            java.util.List r15 = r15.getArgs()
            r15.getClass()
            java.lang.Object r15 = p000.AbstractC0984xh.m6640(r15)
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L735
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L735:
            if (r0 == 0) goto L771
            if (r11 == 0) goto L771
            boolean r15 = p000.C0792sb.m5390(r0)
            if (r15 != 0) goto L771
            boolean r15 = p000.C0792sb.m5390(r11)
            if (r15 != 0) goto L771
            boolean r15 = p000.C0792sb.m5391(r11)
            if (r15 == 0) goto L752
            p000.C0792sb.m5393(r11, r9)
            p000.C0792sb.m5416(r11)
            goto L771
        L752:
            boolean r15 = p000.C0792sb.m5391(r0)
            if (r15 == 0) goto L75f
            p000.C0792sb.m5393(r0, r9)
            p000.C0792sb.m5416(r0)
            goto L771
        L75f:
            android.view.View r15 = p000.C0792sb.m5414(r0)
            if (r15 != 0) goto L769
            android.view.View r15 = p000.C0792sb.m5414(r11)
        L769:
            if (r15 == 0) goto L771
            p000.C0792sb.m5393(r15, r9)
            p000.C0792sb.m5416(r15)
        L771:
            return r14
        L772:
            r14 = move-exception
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto L7d5
            boolean r0 = p000.C0792sb.f9800
            if (r0 == 0) goto L7d5
            java.lang.Object r0 = r15.getThisObject()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L786
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L787
        L786:
            r0 = r11
        L787:
            java.util.List r15 = r15.getArgs()
            r15.getClass()
            java.lang.Object r15 = p000.AbstractC0984xh.m6640(r15)
            boolean r1 = r15 instanceof android.view.View
            if (r1 == 0) goto L799
            r11 = r15
            android.view.View r11 = (android.view.View) r11
        L799:
            if (r0 == 0) goto L7d5
            if (r11 == 0) goto L7d5
            boolean r15 = p000.C0792sb.m5390(r0)
            if (r15 != 0) goto L7d5
            boolean r15 = p000.C0792sb.m5390(r11)
            if (r15 != 0) goto L7d5
            boolean r15 = p000.C0792sb.m5391(r11)
            if (r15 != 0) goto L7cf
            boolean r15 = p000.C0792sb.m5391(r0)
            if (r15 != 0) goto L7c8
            android.view.View r15 = p000.C0792sb.m5414(r0)
            if (r15 != 0) goto L7bf
            android.view.View r15 = p000.C0792sb.m5414(r11)
        L7bf:
            if (r15 == 0) goto L7d5
            p000.C0792sb.m5393(r15, r9)
            p000.C0792sb.m5416(r15)
            goto L7d5
        L7c8:
            p000.C0792sb.m5393(r0, r9)
            p000.C0792sb.m5416(r0)
            goto L7d5
        L7cf:
            p000.C0792sb.m5393(r11, r9)
            p000.C0792sb.m5416(r11)
        L7d5:
            throw r14
        L7d6:
            java.lang.Float r14 = java.lang.Float.valueOf(r5)
            r15.getClass()
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto L94f
            boolean r0 = p000.C0792sb.f9798
            if (r0 != 0) goto L7e7
            goto L94f
        L7e7:
            java.lang.Object r0 = r15.getThisObject()
            boolean r6 = r0 instanceof android.view.View
            if (r6 == 0) goto L7f2
            android.view.View r0 = (android.view.View) r0
            goto L7f3
        L7f2:
            r0 = r11
        L7f3:
            if (r0 != 0) goto L7fb
            java.lang.Object r14 = r15.proceed()
            goto L953
        L7fb:
            sb r6 = p000.C0792sb.f9786
            boolean r6 = p000.C0792sb.m5390(r0)
            if (r6 == 0) goto L809
            java.lang.Object r14 = r15.proceed()
            goto L953
        L809:
            java.util.List r6 = r15.getArgs()
            r6.getClass()
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Object[] r6 = r6.toArray(r12)
            boolean r12 = p000.C0792sb.m5387()
            if (r12 == 0) goto L838
            r12 = r6[r8]
            r12.getClass()
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            java.lang.Object r1 = r0.getTag(r1)
            boolean r13 = r1 instanceof p000.C0316gb
            if (r13 == 0) goto L832
            gb r1 = (p000.C0316gb) r1
            goto L833
        L832:
            r1 = r11
        L833:
            if (r1 != 0) goto L836
            goto L838
        L836:
            r1.f4301 = r12
        L838:
            boolean r1 = p000.C0792sb.f9800
            if (r1 == 0) goto L84d
            boolean r1 = p000.C0792sb.m5391(r0)
            if (r1 == 0) goto L84d
            p000.C0792sb.m5393(r0, r9)
            r6[r8] = r14
            java.lang.Object r14 = r15.proceed(r6)
            goto L953
        L84d:
            boolean r1 = p000.C0792sb.f9800
            if (r1 == 0) goto L867
            android.view.View r1 = p000.C0792sb.m5414(r0)
            if (r1 == 0) goto L867
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setTag(r2, r1)
            r0.setTag(r3, r1)
            r6[r8] = r14
            java.lang.Object r14 = r15.proceed(r6)
            goto L953
        L867:
            java.lang.Object r1 = r0.getTag(r3)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r9)
            if (r1 == 0) goto L885
            boolean r1 = p000.C0792sb.f9800
            if (r1 == 0) goto L87f
            r6[r8] = r14
            java.lang.Object r14 = r15.proceed(r6)
            goto L953
        L87f:
            r0.setTag(r3, r11)
            r0.setTag(r2, r11)
        L885:
            java.lang.Object r1 = r0.getTag(r2)
            boolean r1 = p000.ln0.m3626(r1, r9)
            if (r1 == 0) goto L8a0
            boolean r1 = p000.C0792sb.m5387()
            if (r1 == 0) goto L89d
            r6[r8] = r14
            java.lang.Object r14 = r15.proceed(r6)
            goto L953
        L89d:
            r0.setTag(r2, r11)
        L8a0:
            boolean r1 = p000.C0792sb.m5387()
            if (r1 == 0) goto L904
            r1 = 2131606034(0x7f0dba12, float:1.8838728E38)
            java.lang.Object r1 = r0.getTag(r1)
            boolean r1 = p000.ln0.m3626(r1, r9)
            if (r1 == 0) goto L904
            r14 = r6[r8]
            r14.getClass()
            java.lang.Float r14 = (java.lang.Float) r14
            float r1 = r14.floatValue()
            r2 = 2131606043(0x7f0dba1b, float:1.8838746E38)
            java.lang.Object r3 = r0.getTag(r2)
            boolean r7 = r3 instanceof java.lang.Float
            if (r7 == 0) goto L8cc
            r11 = r3
            java.lang.Float r11 = (java.lang.Float) r11
        L8cc:
            boolean r3 = p000.C0792sb.f9801
            r7 = 1120403456(0x42c80000, float:100.0)
            r9 = 100
            if (r3 == 0) goto L8ec
            if (r11 == 0) goto L8ec
            r0.setTag(r2, r14)
            int r14 = p000.C0792sb.f9806
            int r14 = p000.j81.m2906(r14, r8, r9)
            float r14 = (float) r14
            float r14 = r14 / r7
            float r14 = p000.j81.m2905(r14, r5, r4)
            float r0 = p000.j81.m2905(r1, r5, r4)
            float r5 = r0 * r14
            goto L8f9
        L8ec:
            boolean r14 = p000.C0792sb.f9801
            if (r14 == 0) goto L8f9
            int r14 = p000.C0792sb.f9806
            int r14 = p000.j81.m2906(r14, r8, r9)
            float r14 = (float) r14
            float r5 = r14 / r7
        L8f9:
            java.lang.Float r14 = java.lang.Float.valueOf(r5)
            r6[r8] = r14
            java.lang.Object r14 = r15.proceed(r6)
            goto L953
        L904:
            boolean r1 = p000.C0792sb.m5387()
            if (r1 != 0) goto L90f
            java.lang.Object r14 = r15.proceed(r6)
            goto L953
        L90f:
            boolean r1 = p000.C0792sb.m5389(r0)
            if (r1 == 0) goto L92f
            p000.C0792sb.m5393(r0, r10)
            r14 = r6[r8]
            r14.getClass()
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 != 0) goto L928
            goto L94a
        L928:
            java.lang.Float r14 = java.lang.Float.valueOf(r4)
            r6[r8] = r14
            goto L94a
        L92f:
            boolean r1 = p000.C0792sb.m5388(r0)
            if (r1 == 0) goto L94a
            p000.C0792sb.m5393(r0, r7)
            r0 = r6[r8]
            r0.getClass()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L948
            goto L94a
        L948:
            r6[r8] = r14
        L94a:
            java.lang.Object r14 = r15.proceed(r6)
            goto L953
        L94f:
            java.lang.Object r14 = r15.proceed()
        L953:
            return r14
        L954:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            r15.getClass()
            int r0 = p000.C0792sb.f9804
            if (r0 > 0) goto La61
            boolean r0 = p000.C0792sb.f9798
            if (r0 != 0) goto L965
            goto La61
        L965:
            java.lang.Object r0 = r15.getThisObject()
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L970
            android.view.View r0 = (android.view.View) r0
            goto L971
        L970:
            r0 = r11
        L971:
            if (r0 != 0) goto L979
            java.lang.Object r14 = r15.proceed()
            goto La65
        L979:
            sb r4 = p000.C0792sb.f9786
            boolean r4 = p000.C0792sb.m5390(r0)
            if (r4 == 0) goto L987
            java.lang.Object r14 = r15.proceed()
            goto La65
        L987:
            java.util.List r4 = r15.getArgs()
            r4.getClass()
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.Object[] r4 = r4.toArray(r5)
            boolean r5 = p000.C0792sb.m5387()
            if (r5 == 0) goto L9b6
            r5 = r4[r8]
            r5.getClass()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r1 = r0.getTag(r1)
            boolean r6 = r1 instanceof p000.C0316gb
            if (r6 == 0) goto L9b0
            gb r1 = (p000.C0316gb) r1
            goto L9b1
        L9b0:
            r1 = r11
        L9b1:
            if (r1 != 0) goto L9b4
            goto L9b6
        L9b4:
            r1.f4300 = r5
        L9b6:
            boolean r1 = p000.C0792sb.f9800
            if (r1 == 0) goto L9cb
            boolean r1 = p000.C0792sb.m5391(r0)
            if (r1 == 0) goto L9cb
            p000.C0792sb.m5393(r0, r9)
            r4[r8] = r14
            java.lang.Object r14 = r15.proceed(r4)
            goto La65
        L9cb:
            boolean r1 = p000.C0792sb.f9800
            if (r1 == 0) goto L9e5
            android.view.View r1 = p000.C0792sb.m5414(r0)
            if (r1 == 0) goto L9e5
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setTag(r2, r1)
            r0.setTag(r3, r1)
            r4[r8] = r14
            java.lang.Object r14 = r15.proceed(r4)
            goto La65
        L9e5:
            java.lang.Object r1 = r0.getTag(r3)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r5)
            if (r1 == 0) goto La02
            boolean r1 = p000.C0792sb.f9800
            if (r1 == 0) goto L9fc
            r4[r8] = r14
            java.lang.Object r14 = r15.proceed(r4)
            goto La65
        L9fc:
            r0.setTag(r3, r11)
            r0.setTag(r2, r11)
        La02:
            java.lang.Object r1 = r0.getTag(r2)
            boolean r1 = p000.ln0.m3626(r1, r5)
            if (r1 == 0) goto La1c
            boolean r1 = p000.C0792sb.m5387()
            if (r1 == 0) goto La19
            r4[r8] = r14
            java.lang.Object r14 = r15.proceed(r4)
            goto La65
        La19:
            r0.setTag(r2, r11)
        La1c:
            boolean r1 = p000.C0792sb.m5387()
            if (r1 != 0) goto La27
            java.lang.Object r14 = r15.proceed(r4)
            goto La65
        La27:
            boolean r1 = p000.C0792sb.m5389(r0)
            if (r1 == 0) goto La44
            p000.C0792sb.m5393(r0, r10)
            r14 = r4[r8]
            r14.getClass()
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r14 == 0) goto La5c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r4[r8] = r14
            goto La5c
        La44:
            boolean r1 = p000.C0792sb.m5388(r0)
            if (r1 == 0) goto La5c
            p000.C0792sb.m5393(r0, r7)
            r0 = r4[r8]
            r0.getClass()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == r9) goto La5c
            r4[r8] = r14
        La5c:
            java.lang.Object r14 = r15.proceed(r4)
            goto La65
        La61:
            java.lang.Object r14 = r15.proceed()
        La65:
            return r14
        La66:
            sb r14 = p000.C0792sb.f9786
            r15.getClass()
            r0 = 5
            r1 = 4
            java.lang.Object r2 = r15.proceed()     // Catch: java.lang.Throwable -> Lac0
            boolean r3 = p000.C0792sb.f9798
            if (r3 == 0) goto Labf
            java.lang.Object r15 = r15.getThisObject()
            boolean r3 = r15 instanceof android.view.View
            if (r3 == 0) goto La80
            android.view.View r15 = (android.view.View) r15
            goto La81
        La80:
            r15 = r11
        La81:
            if (r15 == 0) goto Labf
            boolean r3 = p000.C0792sb.m5390(r15)
            if (r3 != 0) goto Labf
            java.lang.Integer r3 = p000.C0792sb.m5408(r15)
            if (r3 == 0) goto La98
            w1 r14 = new w1
            r14.<init>(r15, r10, r3)
            r15.post(r14)
            goto Labf
        La98:
            boolean r3 = p000.C0792sb.f9800
            if (r3 == 0) goto Laa0
            android.view.View r11 = p000.C0792sb.m5414(r15)
        Laa0:
            if (r11 == 0) goto Laae
            p000.C0792sb.m5393(r11, r9)
            jb r14 = new jb
            r14.<init>(r11, r1)
            r11.post(r14)
            goto Labf
        Laae:
            android.view.View r14 = p000.C0792sb.m5411(r14, r15)
            if (r14 == 0) goto Labf
            p000.C0792sb.m5393(r14, r10)
            jb r15 = new jb
            r15.<init>(r14, r0)
            r14.post(r15)
        Labf:
            return r2
        Lac0:
            r2 = move-exception
            boolean r3 = p000.C0792sb.f9798
            if (r3 == 0) goto Lb0f
            java.lang.Object r15 = r15.getThisObject()
            boolean r3 = r15 instanceof android.view.View
            if (r3 == 0) goto Lad0
            android.view.View r15 = (android.view.View) r15
            goto Lad1
        Lad0:
            r15 = r11
        Lad1:
            if (r15 == 0) goto Lb0f
            boolean r3 = p000.C0792sb.m5390(r15)
            if (r3 != 0) goto Lb0f
            java.lang.Integer r3 = p000.C0792sb.m5408(r15)
            if (r3 != 0) goto Lb07
            boolean r3 = p000.C0792sb.f9800
            if (r3 == 0) goto Lae7
            android.view.View r11 = p000.C0792sb.m5414(r15)
        Lae7:
            if (r11 != 0) goto Lafb
            android.view.View r14 = p000.C0792sb.m5411(r14, r15)
            if (r14 == 0) goto Lb0f
            p000.C0792sb.m5393(r14, r10)
            jb r15 = new jb
            r15.<init>(r14, r0)
            r14.post(r15)
            goto Lb0f
        Lafb:
            p000.C0792sb.m5393(r11, r9)
            jb r14 = new jb
            r14.<init>(r11, r1)
            r11.post(r14)
            goto Lb0f
        Lb07:
            w1 r14 = new w1
            r14.<init>(r15, r10, r3)
            r15.post(r14)
        Lb0f:
            throw r2
    }
}
