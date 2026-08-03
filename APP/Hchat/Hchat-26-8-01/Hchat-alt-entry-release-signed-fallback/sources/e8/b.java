package e8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e8.b f2358a = null;

    static {
            e8.b r0 = new e8.b
            r0.<init>()
            e8.b.f2358a = r0
            return
    }

    public static void a(android.content.SharedPreferences r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "cache.key"
            r3.getClass()
            android.content.SharedPreferences$Editor r1 = r3.edit()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = ""
            java.lang.String r3 = r3.getString(r0, r2)     // Catch: java.lang.Throwable -> L23
            boolean r3 = gg.l.a(r3, r4)     // Catch: java.lang.Throwable -> L23
            if (r3 != 0) goto L1c
            android.content.SharedPreferences$Editor r3 = r1.clear()     // Catch: java.lang.Throwable -> L23
            r3.putString(r0, r4)     // Catch: java.lang.Throwable -> L23
        L1c:
            android.content.SharedPreferences$Editor r3 = r1.remove(r5)     // Catch: java.lang.Throwable -> L23
            r3.apply()     // Catch: java.lang.Throwable -> L23
        L23:
            return
    }

    public static boolean b(android.content.SharedPreferences r7, java.lang.String r8) {
            boolean r0 = og.m.t0(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "cache.key"
            java.lang.String r2 = ""
            java.lang.String r3 = r7.getString(r0, r2)
            boolean r3 = gg.l.a(r3, r8)
            r4 = 1
            if (r3 == 0) goto L18
            return r4
        L18:
            android.content.SharedPreferences$Editor r3 = r7.edit()     // Catch: java.lang.Throwable -> L2d
            android.content.SharedPreferences$Editor r3 = r3.clear()     // Catch: java.lang.Throwable -> L2d
            android.content.SharedPreferences$Editor r3 = r3.putString(r0, r8)     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.commit()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r3 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r3)
            r3 = r5
        L34:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r6 = r3 instanceof sf.f
            if (r6 == 0) goto L3b
            r3 = r5
        L3b:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L4e
            java.lang.String r7 = r7.getString(r0, r2)
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L4e
            r1 = r4
        L4e:
            return r1
    }

    public static java.lang.reflect.Method c(android.content.SharedPreferences r2, java.lang.String r3, java.lang.ClassLoader r4, java.lang.String r5) {
            r2.getClass()
            r4.getClass()
            boolean r0 = og.m.t0(r3)
            r1 = 0
            if (r0 == 0) goto Le
            goto L41
        Le:
            boolean r3 = b(r2, r3)
            if (r3 != 0) goto L15
            goto L41
        L15:
            java.lang.String r3 = ""
            java.lang.String r2 = r2.getString(r5, r3)
            if (r2 == 0) goto L41
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L24
            goto L25
        L24:
            r2 = r1
        L25:
            if (r2 == 0) goto L41
            lh.d r3 = new lh.d     // Catch: java.lang.Throwable -> L31
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r2 = r3.b(r4)     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L38:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L3e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
        L41:
            return r1
    }

    public static java.lang.reflect.Constructor d(android.content.SharedPreferences r2, java.lang.String r3, java.lang.ClassLoader r4, java.lang.String r5) {
            r2.getClass()
            r4.getClass()
            boolean r0 = og.m.t0(r3)
            r1 = 0
            if (r0 == 0) goto Le
            goto L41
        Le:
            boolean r3 = b(r2, r3)
            if (r3 != 0) goto L15
            goto L41
        L15:
            java.lang.String r3 = ""
            java.lang.String r2 = r2.getString(r5, r3)
            if (r2 == 0) goto L41
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L24
            goto L25
        L24:
            r2 = r1
        L25:
            if (r2 == 0) goto L41
            lh.d r3 = new lh.d     // Catch: java.lang.Throwable -> L31
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Constructor r2 = r3.a(r4)     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L38:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L3e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
        L41:
            return r1
    }

    public static java.lang.reflect.Method e(android.content.SharedPreferences r4, java.lang.String r5, java.lang.ClassLoader r6, java.lang.String r7) {
            r6.getClass()
            boolean r0 = og.m.t0(r5)
            r1 = 0
            if (r0 == 0) goto Lb
            goto L6a
        Lb:
            java.lang.String r0 = "cache.key"
            java.lang.String r2 = ""
            java.lang.String r0 = r4.getString(r0, r2)
            if (r0 != 0) goto L16
            r0 = r2
        L16:
            boolean r3 = og.m.t0(r0)
            if (r3 != 0) goto L6a
            boolean r3 = og.m.t0(r5)
            if (r3 == 0) goto L23
            goto L6a
        L23:
            boolean r3 = r0.equals(r5)
            if (r3 == 0) goto L2a
            goto L40
        L2a:
            r3 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = og.m.O0(r0, r3, r2)
            java.lang.String r5 = og.m.O0(r5, r3, r2)
            boolean r3 = og.m.t0(r0)
            if (r3 != 0) goto L6a
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L6a
        L40:
            java.lang.String r4 = r4.getString(r7, r2)
            if (r4 == 0) goto L6a
            boolean r5 = og.m.t0(r4)
            if (r5 != 0) goto L4d
            goto L4e
        L4d:
            r4 = r1
        L4e:
            if (r4 == 0) goto L6a
            lh.d r5 = new lh.d     // Catch: java.lang.Throwable -> L5a
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Method r4 = r5.b(r6)     // Catch: java.lang.Throwable -> L5a
            goto L61
        L5a:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L61:
            boolean r5 = r4 instanceof sf.f
            if (r5 == 0) goto L67
            goto L68
        L67:
            r1 = r4
        L68:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
        L6a:
            return r1
    }

    public static java.util.List f(android.content.SharedPreferences r2, java.lang.String r3, java.lang.ClassLoader r4, java.lang.String r5) {
            r2.getClass()
            r4.getClass()
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto Le
            goto L77
        Le:
            boolean r3 = b(r2, r3)
            if (r3 != 0) goto L16
            goto L77
        L16:
            java.lang.String r3 = ""
            java.lang.String r2 = r2.getString(r5, r3)
            if (r2 == 0) goto L77
            boolean r3 = og.m.t0(r2)
            r5 = 0
            if (r3 != 0) goto L26
            goto L27
        L26:
            r2 = r5
        L27:
            if (r2 == 0) goto L77
            r3 = 1
            char[] r3 = new char[r3]
            r0 = 10
            r1 = 0
            r3[r1] = r0
            r0 = 6
            java.util.List r2 = og.m.F0(r2, r3, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L52
            goto L53
        L52:
            r0 = r5
        L53:
            if (r0 == 0) goto L6f
            lh.d r1 = new lh.d     // Catch: java.lang.Throwable -> L5f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Method r0 = r1.b(r4)     // Catch: java.lang.Throwable -> L5f
            goto L66
        L5f:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L66:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L6c
            r0 = r5
        L6c:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto L70
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L3f
            r3.add(r0)
            goto L3f
        L76:
            return r3
        L77:
            tf.t r2 = tf.t.f13167g
            return r2
    }

    public static java.lang.String g(android.content.Context r0, java.lang.ClassLoader r1) {
            r0.getClass()
            r1.getClass()
            l8.i r0 = o8.k.a(r0, r1)
            java.lang.String r0 = r0.f7933h
            return r0
    }

    public static void h(android.content.SharedPreferences r3, java.lang.String r4, java.lang.String r5, java.lang.reflect.Method r6) {
            java.lang.String r0 = "cache.key"
            r3.getClass()
            boolean r1 = og.m.t0(r4)
            if (r1 != 0) goto L30
            if (r6 != 0) goto Le
            goto L30
        Le:
            android.content.SharedPreferences$Editor r1 = r3.edit()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = ""
            java.lang.String r3 = r3.getString(r0, r2)     // Catch: java.lang.Throwable -> L30
            boolean r3 = gg.l.a(r3, r4)     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L21
            r1.clear()     // Catch: java.lang.Throwable -> L30
        L21:
            android.content.SharedPreferences$Editor r3 = r1.putString(r0, r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = l(r6)     // Catch: java.lang.Throwable -> L30
            android.content.SharedPreferences$Editor r3 = r3.putString(r5, r4)     // Catch: java.lang.Throwable -> L30
            r3.apply()     // Catch: java.lang.Throwable -> L30
        L30:
            return
    }

    public static void i(android.content.SharedPreferences r3, java.lang.String r4, java.lang.String r5, java.lang.reflect.Constructor r6) {
            java.lang.String r0 = "cache.key"
            r3.getClass()
            boolean r1 = og.m.t0(r4)
            if (r1 != 0) goto L2d
            android.content.SharedPreferences$Editor r1 = r3.edit()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = ""
            java.lang.String r3 = r3.getString(r0, r2)     // Catch: java.lang.Throwable -> L2d
            boolean r3 = gg.l.a(r3, r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L1e
            r1.clear()     // Catch: java.lang.Throwable -> L2d
        L1e:
            android.content.SharedPreferences$Editor r3 = r1.putString(r0, r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = k(r6)     // Catch: java.lang.Throwable -> L2d
            android.content.SharedPreferences$Editor r3 = r3.putString(r5, r4)     // Catch: java.lang.Throwable -> L2d
            r3.apply()     // Catch: java.lang.Throwable -> L2d
        L2d:
            return
    }

    public static java.lang.String k(java.lang.reflect.Constructor r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r0.<init>(r1)
            java.lang.Class r1 = r4.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            r1.getClass()
            r0.append(r1)
            java.lang.String r1 = ";-><init>("
            r0.append(r1)
            java.lang.Class[] r4 = r4.getParameterTypes()
            r4.getClass()
            int r1 = r4.length
            r2 = 0
        L2b:
            if (r2 >= r1) goto L3c
            r3 = r4[r2]
            r3.getClass()
            java.lang.String r3 = m(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto L2b
        L3c:
            java.lang.String r4 = ")V"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.lang.String l(java.lang.reflect.Method r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r0.<init>(r1)
            java.lang.Class r1 = r5.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            r1.getClass()
            r0.append(r1)
            java.lang.String r1 = ";->"
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r1 = r5.getParameterTypes()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
        L37:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            r4.getClass()
            java.lang.String r4 = m(r4)
            r0.append(r4)
            int r3 = r3 + 1
            goto L37
        L48:
            r1 = 41
            r0.append(r1)
            java.lang.Class r5 = r5.getReturnType()
            r5.getClass()
            java.lang.String r5 = m(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String m(java.lang.Class r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto L6a
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            goto L67
        Lf:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1a
            java.lang.String r3 = "Z"
            return r3
        L1a:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L25
            java.lang.String r3 = "B"
            return r3
        L25:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L30
            java.lang.String r3 = "C"
            return r3
        L30:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3b
            java.lang.String r3 = "S"
            return r3
        L3b:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L46
            java.lang.String r3 = "I"
            return r3
        L46:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L51
            java.lang.String r3 = "J"
            return r3
        L51:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5c
            java.lang.String r3 = "F"
            return r3
        L5c:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L67
            java.lang.String r3 = "D"
            return r3
        L67:
            java.lang.String r3 = "V"
            return r3
        L6a:
            boolean r0 = r3.isArray()
            r1 = 47
            r2 = 46
            if (r0 == 0) goto L80
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = r3.replace(r2, r1)
            r3.getClass()
            return r3
        L80:
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = r3.replace(r2, r1)
            r3.getClass()
            java.lang.String r0 = "L"
            java.lang.String r1 = ";"
            java.lang.String r3 = eh.a.n(r0, r3, r1)
            return r3
    }

    public final void j(android.content.SharedPreferences r7, java.lang.String r8, java.lang.String r9, java.util.List r10) {
            r6 = this;
            java.lang.String r0 = "cache.key"
            r7.getClass()
            boolean r1 = og.m.t0(r8)
            if (r1 != 0) goto L68
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L12
            goto L68
        L12:
            android.content.SharedPreferences$Editor r1 = r7.edit()     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = ""
            java.lang.String r7 = r7.getString(r0, r2)     // Catch: java.lang.Throwable -> L68
            boolean r7 = gg.l.a(r7, r8)     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L25
            r1.clear()     // Catch: java.lang.Throwable -> L68
        L25:
            android.content.SharedPreferences$Editor r7 = r1.putString(r0, r8)     // Catch: java.lang.Throwable -> L68
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> L68
            r8.<init>()     // Catch: java.lang.Throwable -> L68
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L68
            r0.<init>()     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L68
        L37:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L52
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L68
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r2.toGenericString()     // Catch: java.lang.Throwable -> L68
            boolean r2 = r8.add(r2)     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L37
            r0.add(r1)     // Catch: java.lang.Throwable -> L68
            goto L37
        L52:
            java.lang.String r1 = "\n"
            b4.b r4 = new b4.b     // Catch: java.lang.Throwable -> L68
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L68
            r5 = 30
            r2 = 0
            r3 = 0
            java.lang.String r8 = tf.m.A1(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L68
            android.content.SharedPreferences$Editor r7 = r7.putString(r9, r8)     // Catch: java.lang.Throwable -> L68
            r7.apply()     // Catch: java.lang.Throwable -> L68
        L68:
            return
    }
}
