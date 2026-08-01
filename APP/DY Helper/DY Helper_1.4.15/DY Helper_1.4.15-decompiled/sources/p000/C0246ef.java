package p000;

/* JADX INFO: renamed from: ef */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0246ef implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3527;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f3528;

    public /* synthetic */ C0246ef(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3527 = r1
            r0.f3528 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C0246ef(p000.C0696pq r1, java.lang.Object r2) {
            r0 = this;
            r1 = 6
            r0.f3527 = r1
            r0.<init>()
            r0.f3528 = r2
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f3527
            r1 = 1
            r2 = 0
            java.lang.Object r6 = r6.f3528
            switch(r0) {
                case 0: goto L2ba;
                case 1: goto L28f;
                case 2: goto L269;
                case 3: goto L243;
                case 4: goto L217;
                case 5: goto L1f4;
                case 6: goto L1ce;
                case 7: goto L1a3;
                case 8: goto L12c;
                case 9: goto L10e;
                case 10: goto Lf8;
                case 11: goto Le2;
                case 12: goto Lac;
                case 13: goto L86;
                case 14: goto L74;
                case 15: goto L2f;
                default: goto L9;
            }
        L9:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.getClass()
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r6 = r7.invoke(r6, r2)     // Catch: java.lang.Throwable -> L1c
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1c
            if (r7 == 0) goto L1e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L1c
            goto L26
        L1c:
            r6 = move-exception
            goto L20
        L1e:
            r6 = r2
            goto L26
        L20:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L26:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto L2b
            goto L2c
        L2b:
            r2 = r6
        L2c:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L2f:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L3f
            boolean r7 = r6 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L3f
            if (r7 == 0) goto L41
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r6 = move-exception
            goto L4f
        L41:
            r6 = r2
        L42:
            if (r6 == 0) goto L4d
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L3f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L3f
            goto L55
        L4d:
            r6 = r2
            goto L55
        L4f:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L55:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto L5a
            r6 = r2
        L5a:
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L73
            mi1 r7 = p000.mi1.f7162
            long r6 = r6.longValue()
            long r6 = p000.mi1.m3835(r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L73
            r2 = r0
        L73:
            return r2
        L74:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.util.Set r0 = p000.rg1.f9371
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.Object r6 = r6.opt(r7)
            java.lang.Integer r6 = p000.rg1.m5087(r6)
            return r6
        L86:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L99
            if (r6 == 0) goto L9b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L99
            goto La3
        L99:
            r6 = move-exception
            goto L9d
        L9b:
            r6 = r2
            goto La3
        L9d:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        La3:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto La8
            goto La9
        La8:
            r2 = r6
        La9:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Lac:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> Ld3
            if (r6 != 0) goto Lbc
        Lba:
            r0 = r2
            goto Ld9
        Lbc:
            java.lang.Class r7 = r7.getType()     // Catch: java.lang.Throwable -> Ld3
            r7.getClass()     // Catch: java.lang.Throwable -> Ld3
            int r7 = p000.h62.m2363(r7, r6)     // Catch: java.lang.Throwable -> Ld3
            if (r7 <= 0) goto Lba
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Ld3
            l91 r0 = new l91     // Catch: java.lang.Throwable -> Ld3
            r0.<init>(r7, r6)     // Catch: java.lang.Throwable -> Ld3
            goto Ld9
        Ld3:
            r6 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r6)
        Ld9:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto Lde
            goto Ldf
        Lde:
            r2 = r0
        Ldf:
            l91 r2 = (p000.l91) r2
            return r2
        Le2:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.getClass()
            java.lang.Class r7 = r7.getDeclaringClass()
            java.lang.Class r6 = r6.getClass()
            boolean r6 = r7.isAssignableFrom(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Lf8:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.getClass()
            java.lang.Class r7 = r7.getDeclaringClass()
            java.lang.Class r6 = r6.getClass()
            boolean r6 = r7.isAssignableFrom(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L10e:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            vj0 r0 = p000.vj0.f11310
            java.lang.Object r6 = p000.vj0.m6259(r6, r7)
            boolean r7 = r6 instanceof java.lang.Number
            if (r7 == 0) goto L120
            java.lang.Number r6 = (java.lang.Number) r6
            goto L121
        L120:
            r6 = r2
        L121:
            if (r6 == 0) goto L12b
            int r6 = r6.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L12b:
            return r2
        L12c:
            java.lang.Class r7 = (java.lang.Class) r7
            r7.getClass()
            android.os.Handler r7 = p000.ah0.f229
            java.lang.Class r7 = p000.ah0.m161()
            java.lang.Class r6 = r6.getClass()
            java.util.ArrayList r6 = p000.ah0.m140(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L148:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L183
            java.lang.Object r2 = r6.next()
            r3 = r2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L148
            java.lang.Class r4 = r3.getType()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "~7918AA8396C85B92707DC4C904CF4F6B873956D476D564A4B4FA8249966EA0F63C4AD8"
            java.lang.String r5 = p000.jf0.m2957(r5)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L17f
            if (r7 == 0) goto L148
            java.lang.Class r3 = r3.getType()
            boolean r3 = r7.isAssignableFrom(r3)
            if (r3 == 0) goto L148
        L17f:
            r0.add(r2)
            goto L148
        L183:
            java.util.Iterator r6 = r0.iterator()
        L187:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L197
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> L187
            goto L187
        L197:
            qt r6 = new qt
            r7 = 25
            r6.<init>(r7)
            java.util.List r6 = p000.AbstractC0984xh.m6658(r0, r6)
            return r6
        L1a3:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r6 = r7.invoke(r6, r2)     // Catch: java.lang.Throwable -> L1b3
            boolean r7 = r6 instanceof java.lang.Enum     // Catch: java.lang.Throwable -> L1b3
            if (r7 == 0) goto L1b5
            java.lang.Enum r6 = (java.lang.Enum) r6     // Catch: java.lang.Throwable -> L1b3
            goto L1b6
        L1b3:
            r6 = move-exception
            goto L1bf
        L1b5:
            r6 = r2
        L1b6:
            if (r6 == 0) goto L1bd
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L1b3
            goto L1c5
        L1bd:
            r6 = r2
            goto L1c5
        L1bf:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L1c5:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto L1ca
            goto L1cb
        L1ca:
            r2 = r6
        L1cb:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L1ce:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.lang.Object r6 = p000.qe0.m4879(r6, r7)     // Catch: java.lang.Throwable -> L1d8
            goto L1df
        L1d8:
            r6 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L1df:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto L1e4
            r6 = r2
        L1e4:
            if (r6 == 0) goto L1f3
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L1f3
            boolean r7 = p000.q02.m4671(r6)
            if (r7 != 0) goto L1f3
            r2 = r6
        L1f3:
            return r2
        L1f4:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.lang.Object r6 = p000.qe0.m4879(r6, r7)
            if (r6 == 0) goto L216
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L216
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L216
            boolean r7 = p000.q02.m4671(r6)
            if (r7 != 0) goto L216
            r2 = r6
        L216:
            return r2
        L217:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> L22a
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L22a
            boolean r7 = r6 instanceof android.view.View     // Catch: java.lang.Throwable -> L22a
            if (r7 == 0) goto L22c
            android.view.View r6 = (android.view.View) r6     // Catch: java.lang.Throwable -> L22a
            goto L234
        L22a:
            r6 = move-exception
            goto L22e
        L22c:
            r6 = r2
            goto L234
        L22e:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L234:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto L239
            r6 = r2
        L239:
            android.view.View r6 = (android.view.View) r6
            boolean r7 = r6 instanceof android.widget.FrameLayout
            if (r7 == 0) goto L242
            r2 = r6
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
        L242:
            return r2
        L243:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> L256
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L256
            boolean r7 = r6 instanceof android.util.SparseArray     // Catch: java.lang.Throwable -> L256
            if (r7 == 0) goto L258
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.lang.Throwable -> L256
            goto L260
        L256:
            r6 = move-exception
            goto L25a
        L258:
            r6 = r2
            goto L260
        L25a:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L260:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto L265
            goto L266
        L265:
            r2 = r6
        L266:
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            return r2
        L269:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.getClass()
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> L27c
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L27c
            boolean r7 = r6 instanceof android.util.SparseArray     // Catch: java.lang.Throwable -> L27c
            if (r7 == 0) goto L27e
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.lang.Throwable -> L27c
            goto L286
        L27c:
            r6 = move-exception
            goto L280
        L27e:
            r6 = r2
            goto L286
        L280:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L286:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto L28b
            goto L28c
        L28b:
            r2 = r6
        L28c:
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            return r2
        L28f:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> L29f
            java.lang.Object r6 = r7.invoke(r6, r2)     // Catch: java.lang.Throwable -> L29f
            boolean r7 = r6 instanceof java.lang.Enum     // Catch: java.lang.Throwable -> L29f
            if (r7 == 0) goto L2a1
            java.lang.Enum r6 = (java.lang.Enum) r6     // Catch: java.lang.Throwable -> L29f
            goto L2a2
        L29f:
            r6 = move-exception
            goto L2ab
        L2a1:
            r6 = r2
        L2a2:
            if (r6 == 0) goto L2a9
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L29f
            goto L2b1
        L2a9:
            r6 = r2
            goto L2b1
        L2ab:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L2b1:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto L2b6
            goto L2b7
        L2b6:
            r2 = r6
        L2b7:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L2ba:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            kf r0 = p000.C0467kf.f5879
            r7.getClass()
            java.lang.Object r6 = p000.C0467kf.m3230(r6, r7)
            boolean r7 = r6 instanceof java.lang.Number
            if (r7 == 0) goto L2cc
            java.lang.Number r6 = (java.lang.Number) r6
            goto L2cd
        L2cc:
            r6 = r2
        L2cd:
            if (r6 == 0) goto L2d7
            long r6 = r6.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
        L2d7:
            return r2
    }
}
