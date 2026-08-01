package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class db2 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3045;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.ib2 f3046;

    public /* synthetic */ db2(p000.ib2 r1, int r2) {
            r0 = this;
            r0.f3045 = r2
            r0.f3046 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r2) {
            r1 = this;
            int r0 = r1.f3045
            switch(r0) {
                case 5: goto L14;
                case 6: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r2)
            return
        L9:
            r2.getClass()
            ib2 r1 = r1.f3046
            java.lang.Object r2 = r2.f5691
            p000.ib2.m2716(r1, r2)
            return
        L14:
            r2.getClass()
            ib2 r1 = r1.f3046
            java.lang.Object r2 = r2.f5691
            p000.ib2.m2716(r1, r2)
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r10) {
            r9 = this;
            int r0 = r9.f3045
            switch(r0) {
                case 0: goto L148;
                case 1: goto L7c;
                case 2: goto L51;
                case 3: goto L2d;
                case 4: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r10)
            return
        L9:
            r10.getClass()
            boolean r0 = p000.ib2.m2728()
            if (r0 == 0) goto L13
            goto L2c
        L13:
            ib2 r9 = r9.f3046
            boolean r9 = p000.ib2.m2717(r9, r10)
            if (r9 != 0) goto L1c
            goto L2c
        L1c:
            java.lang.Object[] r9 = r10.f5692
            java.lang.Object r9 = p000.ib2.m2724(r9)
            if (r9 != 0) goto L25
            goto L2c
        L25:
            ya2 r0 = p000.ya2.f12542
            java.lang.String r1 = "im"
            p000.ib2.m2725(r10, r0, r9, r1)
        L2c:
            return
        L2d:
            r10.getClass()
            boolean r0 = p000.ib2.m2728()
            if (r0 == 0) goto L37
            goto L50
        L37:
            ib2 r9 = r9.f3046
            boolean r9 = p000.ib2.m2717(r9, r10)
            if (r9 != 0) goto L40
            goto L50
        L40:
            java.lang.Object[] r9 = r10.f5692
            java.lang.Object r9 = p000.ib2.m2724(r9)
            if (r9 != 0) goto L49
            goto L50
        L49:
            ya2 r0 = p000.ya2.f12542
            java.lang.String r1 = "im-runtime"
            p000.ib2.m2725(r10, r0, r9, r1)
        L50:
            return
        L51:
            r10.getClass()
            boolean r0 = p000.ib2.m2728()
            if (r0 == 0) goto L5b
            goto L7b
        L5b:
            ib2 r9 = r9.f3046
            boolean r9 = p000.ib2.m2717(r9, r10)
            if (r9 != 0) goto L64
            goto L7b
        L64:
            java.lang.Object[] r9 = r10.f5692
            java.lang.Object r9 = p000.ib2.m2724(r9)
            if (r9 != 0) goto L74
            java.lang.String r9 = "rb360b99c73f2f647"
            java.lang.String r10 = "skip comment voice replace: info arg missing"
            p000.C0888ux.m5975(r9, r10)
            goto L7b
        L74:
            ya2 r0 = p000.ya2.f12541
            java.lang.String r1 = "comment"
            p000.ib2.m2725(r10, r0, r9, r1)
        L7b:
            return
        L7c:
            r10.getClass()
            java.lang.Object[] r10 = r10.f5692
            r10.getClass()
            r0 = 0
            java.lang.Object r10 = p000.AbstractC0312g7.m2253(r0, r10)
            if (r10 != 0) goto L8d
            goto L147
        L8d:
            ib2 r9 = r9.f3046
            p000.ib2.m2715(r9, r10)
            java.lang.Class r10 = r10.getClass()
            java.lang.reflect.Method[] r1 = r10.getDeclaredMethods()     // Catch: java.lang.Throwable -> Led
            r1.getClass()     // Catch: java.lang.Throwable -> Led
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Led
            r2.<init>()     // Catch: java.lang.Throwable -> Led
            int r3 = r1.length     // Catch: java.lang.Throwable -> Led
            r4 = r0
        La4:
            r5 = 1
            if (r4 >= r3) goto Lf2
            r6 = r1[r4]     // Catch: java.lang.Throwable -> Led
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> Led
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)     // Catch: java.lang.Throwable -> Led
            if (r7 != 0) goto Lef
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> Led
            boolean r7 = java.lang.reflect.Modifier.isAbstract(r7)     // Catch: java.lang.Throwable -> Led
            if (r7 != 0) goto Lef
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> Led
            boolean r7 = java.lang.reflect.Modifier.isNative(r7)     // Catch: java.lang.Throwable -> Led
            if (r7 != 0) goto Lef
            java.lang.Class r7 = r6.getReturnType()     // Catch: java.lang.Throwable -> Led
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> Led
            boolean r7 = p000.ln0.m3626(r7, r8)     // Catch: java.lang.Throwable -> Led
            if (r7 == 0) goto Lef
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> Led
            int r7 = r7.length     // Catch: java.lang.Throwable -> Led
            if (r7 != r5) goto Lef
            java.lang.Class[] r5 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> Led
            r5 = r5[r0]     // Catch: java.lang.Throwable -> Led
            r5.getClass()     // Catch: java.lang.Throwable -> Led
            ra2 r5 = p000.ib2.m2722(r5)     // Catch: java.lang.Throwable -> Led
            if (r5 == 0) goto Lef
            r2.add(r6)     // Catch: java.lang.Throwable -> Led
            goto Lef
        Led:
            r9 = move-exception
            goto L12c
        Lef:
            int r4 = r4 + 1
            goto La4
        Lf2:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> Led
        Lf6:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Led
            if (r1 == 0) goto L106
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Led
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> Led
            r1.setAccessible(r5)     // Catch: java.lang.Throwable -> Led
            goto Lf6
        L106:
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> Led
            if (r0 != 0) goto L129
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> Led
        L110:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Led
            if (r1 == 0) goto L129
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Led
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> Led
            r1.getClass()     // Catch: java.lang.Throwable -> Led
            ia2 r2 = new ia2     // Catch: java.lang.Throwable -> Led
            r3 = 0
            r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> Led
            p000.ib2.m2726(r1, r2)     // Catch: java.lang.Throwable -> Led
            goto L110
        L129:
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> Led
            goto L132
        L12c:
            eo1 r0 = new eo1
            r0.<init>(r9)
            r9 = r0
        L132:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L147
            java.lang.String r10 = r10.getName()
            java.lang.String r0 = "install comment audio event consumer hook failed "
            java.lang.String r10 = r0.concat(r10)
            java.lang.String r0 = "rb360b99c73f2f647"
            p000.C0888ux.m5977(r0, r10, r9)
        L147:
            return
        L148:
            r10.getClass()
            java.lang.Object[] r10 = r10.f5692
            r10.getClass()
            r0 = 0
            java.lang.Object r10 = p000.AbstractC0312g7.m2253(r0, r10)
            if (r10 != 0) goto L158
            goto L15d
        L158:
            ib2 r9 = r9.f3046
            p000.ib2.m2715(r9, r10)
        L15d:
            return
    }
}
