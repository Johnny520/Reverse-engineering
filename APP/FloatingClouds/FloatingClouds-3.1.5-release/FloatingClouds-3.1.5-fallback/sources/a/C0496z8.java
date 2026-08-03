package a;

/* JADX INFO: renamed from: a.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0496z8 implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static android.widget.TextView a(android.view.View r5) {
            boolean r0 = r5 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L25
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r2 = r0.getText()
            if (r2 == 0) goto L14
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            java.lang.String r3 = "缓存"
            boolean r4 = r2.equals(r3)
            if (r4 != 0) goto L24
            boolean r2 = a.Ae.H(r2, r3, r1)
            if (r2 == 0) goto L25
        L24:
            return r0
        L25:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L44
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
        L2f:
            if (r1 >= r0) goto L44
            android.view.View r2 = r5.getChildAt(r1)
            java.lang.String r3 = "getChildAt(...)"
            a.C0193i9.d(r2, r3)
            android.widget.TextView r2 = a(r2)
            if (r2 == 0) goto L41
            return r2
        L41:
            int r1 = r1 + 1
            goto L2f
        L44:
            r5 = 0
            return r5
    }

    public static boolean c() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L15
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.e
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final void b(android.app.Activity r8, int r9) {
            r7 = this;
            r0 = 3
            if (r9 < r0) goto L5
            goto Lfb
        L5:
            android.view.Window r1 = r8.getWindow()
            if (r1 == 0) goto Lb5
            android.view.View r1 = r1.getDecorView()
            if (r1 != 0) goto L13
            goto Lb5
        L13:
            android.widget.TextView r1 = a(r1)
            if (r1 != 0) goto L29
            java.lang.String r0 = "HideStorageCache: '缓存' label not found"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            goto Lb5
        L29:
            android.view.ViewParent r2 = r1.getParent()
            boolean r3 = r2 instanceof android.view.View
            r4 = 0
            if (r3 == 0) goto L35
            android.view.View r2 = (android.view.View) r2
            goto L36
        L35:
            r2 = r4
        L36:
            if (r2 != 0) goto L3a
            goto L90
        L3a:
            r3 = 0
        L3b:
            android.view.ViewParent r5 = r2.getParent()
            if (r5 == 0) goto L65
            if (r3 >= r0) goto L65
            android.graphics.drawable.Drawable r5 = r2.getBackground()
            if (r5 == 0) goto L53
            int r5 = r2.getHeight()
            r6 = 600(0x258, float:8.41E-43)
            if (r5 >= r6) goto L53
            r4 = r2
            goto L90
        L53:
            android.view.ViewParent r2 = r2.getParent()
            boolean r5 = r2 instanceof android.view.View
            if (r5 == 0) goto L5e
            android.view.View r2 = (android.view.View) r2
            goto L5f
        L5e:
            r2 = r4
        L5f:
            if (r2 != 0) goto L62
            goto L65
        L62:
            int r3 = r3 + 1
            goto L3b
        L65:
            android.view.ViewParent r0 = r1.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L70
            android.view.View r0 = (android.view.View) r0
            goto L71
        L70:
            r0 = r4
        L71:
            if (r0 == 0) goto L78
            android.view.ViewParent r0 = r0.getParent()
            goto L79
        L78:
            r0 = r4
        L79:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L80
            android.view.View r0 = (android.view.View) r0
            goto L81
        L80:
            r0 = r4
        L81:
            if (r0 != 0) goto L8f
            android.view.ViewParent r0 = r1.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L90
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            goto L90
        L8f:
            r4 = r0
        L90:
            if (r4 == 0) goto Lb5
            int r0 = r4.getVisibility()
            r1 = 8
            if (r0 == r1) goto Lb5
            r4.setVisibility(r1)
            java.lang.Class r8 = r4.getClass()
            java.lang.String r8 = r8.getSimpleName()
            java.lang.String r9 = "HideStorageCache: cache section hidden (card="
            java.lang.String r0 = ")"
            java.lang.String r8 = a.C0487z.g(r9, r8, r0)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            a.C0282n9.m(r8)
            return
        Lb5:
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 800(0x320, double:3.953E-321)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1500(0x5dc, double:7.41E-321)
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Long[] r0 = new java.lang.Long[]{r0, r1, r4}
            java.util.List r0 = a.C0294o3.d0(r0)
            android.view.Window r1 = r8.getWindow()
            if (r1 == 0) goto Lfb
            android.view.View r1 = r1.getDecorView()
            if (r1 == 0) goto Lfb
            a.k0 r4 = new a.k0
            r5 = 3
            r4.<init>(r7, r8, r9, r5)
            if (r9 < 0) goto Lee
            int r8 = r0.size()
            if (r9 >= r8) goto Lee
            java.lang.Object r8 = r0.get(r9)
            goto Lf2
        Lee:
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
        Lf2:
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            r1.postDelayed(r4, r8)
        Lfb:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r24) {
            r23 = this;
            r1 = r23
            r2 = r24
            r8 = 2
            r9 = 0
            r10 = 1
            java.lang.String r11 = "F020"
            java.lang.String r12 = "J"
            java.lang.String r13 = "HideStorageCache: hooked refresh method via rule: "
            java.lang.String r0 = "session"
            a.C0193i9.e(r2, r0)
            a.ld r0 = a.C0250ld.f560a
            r0.a()
            a.fd r14 = new a.fd
            int r0 = a.B1.f21a
            r3 = -1
            if (r0 != r3) goto L3e
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L30
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L30
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L30
            java.lang.String r4 = "com.tencent.mm"
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r9)     // Catch: java.lang.Exception -> L30
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> L30
            goto L3c
        L30:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)
            a.C0453x1.a(r0)
        L3c:
            a.B1.f21a = r3
        L3e:
            int r0 = a.B1.f21a
            java.lang.ClassLoader r3 = r2.f136a
            r14.<init>(r0, r3)
            a.hd r0 = a.C0179hd.f499a
            r0.getClass()
            java.lang.String r0 = "F019_clean_new_ui"
            a.gd r0 = a.C0179hd.a(r0, r14)
            boolean r3 = r0.f485a
            if (r3 == 0) goto L193
            java.lang.Class<?> r15 = r0.b
            if (r15 != 0) goto L5a
            goto L193
        L5a:
            java.lang.String r0 = r15.getName()
            java.lang.String r3 = "HideStorageCache: CleanNewUI → "
            java.lang.String r0 = r3.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.String r4 = r15.getName()
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.Class[] r6 = new java.lang.Class[]{r0}
            a.y8 r7 = new a.y8
            r7.<init>(r1, r9)
            java.lang.String r3 = "F020"
            java.lang.String r5 = "onCreate"
            a.J8.d(r2, r3, r4, r5, r6, r7)
            r3 = 0
            a.Cd r0 = a.Cd.f49a     // Catch: java.lang.Throwable -> Lec
            a.qb r16 = new a.qb     // Catch: java.lang.Throwable -> Lec
            java.lang.String r17 = "F020_update_cache_root"
            java.lang.String r18 = "void"
            java.lang.String[] r4 = new java.lang.String[]{r12, r12}     // Catch: java.lang.Throwable -> Lec
            java.util.List r19 = a.C0294o3.d0(r4)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r20 = ""
            java.lang.String r21 = "F019_clean_new_ui"
            r22 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> Lec
            r4 = r16
            a.gd r0 = r0.b(r4, r14)     // Catch: java.lang.Throwable -> Lec
            java.lang.reflect.Method r0 = r0.f     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto Lef
            a.y8 r4 = new a.y8     // Catch: java.lang.Throwable -> Lec
            r4.<init>(r1, r10)     // Catch: java.lang.Throwable -> Lec
            a.J8.h(r2, r11, r0, r4)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r4 = r0.getName()     // Catch: java.lang.Throwable -> Le9
            java.lang.Class[] r0 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> Le9
            java.lang.String r5 = "getParameterTypes(...)"
            a.C0193i9.d(r0, r5)     // Catch: java.lang.Throwable -> Le9
            a.l8 r5 = new a.l8     // Catch: java.lang.Throwable -> Le9
            r6 = 14
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Le9
            r6 = 31
            java.lang.String r0 = a.N1.e0(r0, r3, r5, r6)     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le9
            r5.<init>(r13)     // Catch: java.lang.Throwable -> Le9
            r5.append(r4)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r4 = "("
            r5.append(r4)     // Catch: java.lang.Throwable -> Le9
            r5.append(r0)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Le9
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Le9
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> Le9
            r4 = r10
            goto Lf0
        Le9:
            r0 = move-exception
            r4 = r10
            goto Lf4
        Lec:
            r0 = move-exception
            r4 = r9
            goto Lf4
        Lef:
            r4 = r9
        Lf0:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lf3
            goto Lf8
        Lf3:
            r0 = move-exception
        Lf4:
            a.wd$a r0 = a.C0465xd.a(r0)
        Lf8:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L107
            java.lang.String r5 = "HideStorageCache: rule-based updateCacheRoot hook failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}
            a.C0453x1.e(r0)
        L107:
            if (r4 != 0) goto L192
            java.lang.String r0 = "updateCacheRoot"
            java.lang.String r4 = "U6"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r4 = r0.iterator()
        L119:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L192
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Method[] r5 = r15.getDeclaredMethods()     // Catch: java.lang.Throwable -> L160
            java.lang.String r6 = "getDeclaredMethods(...)"
            a.C0193i9.d(r5, r6)     // Catch: java.lang.Throwable -> L160
            int r6 = r5.length     // Catch: java.lang.Throwable -> L160
            r7 = r9
        L130:
            if (r7 >= r6) goto L164
            r12 = r5[r7]     // Catch: java.lang.Throwable -> L160
            java.lang.String r13 = r12.getName()     // Catch: java.lang.Throwable -> L160
            boolean r13 = a.C0193i9.a(r13, r0)     // Catch: java.lang.Throwable -> L160
            if (r13 != 0) goto L165
            java.lang.Class[] r13 = r12.getParameterTypes()     // Catch: java.lang.Throwable -> L160
            int r13 = r13.length     // Catch: java.lang.Throwable -> L160
            if (r13 != r8) goto L162
            java.lang.Class[] r13 = r12.getParameterTypes()     // Catch: java.lang.Throwable -> L160
            r13 = r13[r9]     // Catch: java.lang.Throwable -> L160
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L160
            boolean r13 = a.C0193i9.a(r13, r14)     // Catch: java.lang.Throwable -> L160
            if (r13 == 0) goto L162
            java.lang.Class[] r13 = r12.getParameterTypes()     // Catch: java.lang.Throwable -> L160
            r13 = r13[r10]     // Catch: java.lang.Throwable -> L160
            boolean r13 = a.C0193i9.a(r13, r14)     // Catch: java.lang.Throwable -> L160
            if (r13 == 0) goto L162
            goto L165
        L160:
            r0 = move-exception
            goto L18e
        L162:
            int r7 = r7 + r10
            goto L130
        L164:
            r12 = r3
        L165:
            if (r12 == 0) goto L18b
            a.y8 r0 = new a.y8     // Catch: java.lang.Throwable -> L160
            r0.<init>(r1, r8)     // Catch: java.lang.Throwable -> L160
            a.J8.h(r2, r11, r12, r0)     // Catch: java.lang.Throwable -> L160
            java.lang.String r0 = r12.getName()     // Catch: java.lang.Throwable -> L160
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L160
            r5.<init>()     // Catch: java.lang.Throwable -> L160
            java.lang.String r6 = "HideStorageCache: hooked refresh method: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L160
            r5.append(r0)     // Catch: java.lang.Throwable -> L160
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L160
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L160
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L160
        L18b:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L160
            goto L119
        L18e:
            a.C0465xd.a(r0)
            goto L119
        L192:
            return
        L193:
            java.lang.String r0 = "HideStorageCache: CleanNewUI not resolved"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.e(r0)
            return
    }
}
