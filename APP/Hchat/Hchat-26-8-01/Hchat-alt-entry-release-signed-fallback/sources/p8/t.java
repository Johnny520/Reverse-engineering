package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p8.t f10418a = null;

    static {
            p8.t r0 = new p8.t
            r0.<init>()
            p8.t.f10418a = r0
            return
    }

    public static final boolean a(p8.t r1, java.lang.reflect.Method r2) {
            r1.getClass()
            int r1 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r0 = 0
            if (r1 == 0) goto L2c
            java.lang.Class[] r1 = r2.getParameterTypes()
            r1.getClass()
            int r1 = r1.length
            if (r1 != 0) goto L2c
            java.lang.Class r1 = r2.getReturnType()
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto L2c
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model."
            boolean r1 = eh.a.A(r2, r0, r1)
            if (r1 == 0) goto L2c
            r1 = 1
            return r1
        L2c:
            return r0
    }

    public static final boolean b(p8.t r3, java.lang.reflect.Method r4) {
            r3.getClass()
            java.lang.Class[] r3 = r4.getParameterTypes()
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto L3c
            java.lang.Class r0 = r4.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "com.tencent.mm.plugin.sns.model."
            boolean r4 = eh.a.A(r4, r1, r0)
            if (r4 == 0) goto L3c
            int r4 = r3.length
            r0 = 2
            if (r4 != r0) goto L3c
            r4 = r3[r1]
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L3c
            r4 = 1
            r3 = r3[r4]
            boolean r3 = r3.isPrimitive()
            if (r3 != 0) goto L3c
            return r4
        L3c:
            return r1
    }

    public final java.lang.reflect.Method c(r8.g r7, java.lang.String r8, java.util.List r9, fg.l r10, fg.p r11) {
            r6 = this;
            android.content.Context r0 = r7.f11620a
            java.lang.String r1 = "Hchat_sns_forward_native_media_method_cache"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            android.content.Context r1 = r7.f11620a
            java.lang.ClassLoader r2 = r7.f11622c
            java.lang.String r1 = e8.b.g(r1, r2)
            java.lang.reflect.Method r2 = e8.b.c(r0, r1, r2, r8)
            r3 = 0
            if (r2 == 0) goto L28
            java.lang.Object r4 = r10.invoke(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L24
            goto L25
        L24:
            r2 = r3
        L25:
            if (r2 == 0) goto L28
            return r2
        L28:
            org.luckypray.dexkit.DexKitBridge r2 = r7.f11623d     // Catch: java.lang.Throwable -> L67
            ch.e r4 = new ch.e     // Catch: java.lang.Throwable -> L67
            r4.<init>()     // Catch: java.lang.Throwable -> L67
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> L67
            r5.<init>()     // Catch: java.lang.Throwable -> L67
            fh.k.u0(r5, r9)     // Catch: java.lang.Throwable -> L67
            r4.f1666h = r5     // Catch: java.lang.Throwable -> L67
            hh.p r2 = r2.findMethod(r4)     // Catch: java.lang.Throwable -> L67
            dg.n r2 = tf.m.m1(r2)     // Catch: java.lang.Throwable -> L67
            c9.o1 r4 = new c9.o1     // Catch: java.lang.Throwable -> L67
            r5 = 2
            r4.<init>(r6, r7, r5)     // Catch: java.lang.Throwable -> L67
            ng.i r7 = ng.m.X(r2, r4)     // Catch: java.lang.Throwable -> L67
            ng.h r2 = new ng.h     // Catch: java.lang.Throwable -> L67
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L67
        L50:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L69
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r10.invoke(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L67
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L50
            goto L6a
        L67:
            r7 = move-exception
            goto L6d
        L69:
            r7 = r3
        L6a:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L67
            goto L73
        L6d:
            sf.f r10 = new sf.f
            r10.<init>(r7)
            r7 = r10
        L73:
            java.lang.Throwable r10 = sf.g.b(r7)
            java.lang.String r2 = ""
            if (r10 == 0) goto L8d
            java.lang.Object r9 = tf.m.v1(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L84
            r9 = r2
        L84:
            java.lang.String r4 = "定位朋友圈原生媒体方法失败: "
            java.lang.String r9 = r4.concat(r9)
            r11.invoke(r9, r10)
        L8d:
            boolean r9 = r7 instanceof sf.f
            if (r9 == 0) goto L92
            goto L93
        L92:
            r3 = r7
        L93:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto Lb6
            java.lang.String r7 = "cache.key"
            android.content.SharedPreferences$Editor r9 = r0.edit()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r10 = r0.getString(r7, r2)     // Catch: java.lang.Throwable -> Lb9
            boolean r10 = gg.l.a(r10, r1)     // Catch: java.lang.Throwable -> Lb9
            if (r10 != 0) goto Lae
            android.content.SharedPreferences$Editor r10 = r9.clear()     // Catch: java.lang.Throwable -> Lb9
            r10.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb9
        Lae:
            android.content.SharedPreferences$Editor r7 = r9.remove(r8)     // Catch: java.lang.Throwable -> Lb9
            r7.apply()     // Catch: java.lang.Throwable -> Lb9
            goto Lb9
        Lb6:
            e8.b.h(r0, r1, r8, r3)
        Lb9:
            return r3
    }
}
