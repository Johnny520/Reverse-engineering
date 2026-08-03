package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h6.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k6.i f7349d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f7350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f7351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f7352c;

    static {
            k6.i r0 = new k6.i
            r0.<init>()
            k6.j.f7349d = r0
            return
    }

    public j(java.lang.Class r12) {
            r11 = this;
            r11.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r11.f7350a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r11.f7351b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r11.f7352c = r0
            java.lang.reflect.Field[] r12 = r12.getDeclaredFields()     // Catch: java.lang.IllegalAccessException -> L30
            int r0 = r12.length     // Catch: java.lang.IllegalAccessException -> L30
            r1 = 0
            r2 = r1
            r3 = r2
        L20:
            if (r2 >= r0) goto L35
            r4 = r12[r2]     // Catch: java.lang.IllegalAccessException -> L30
            boolean r5 = r4.isEnumConstant()     // Catch: java.lang.IllegalAccessException -> L30
            if (r5 == 0) goto L32
            int r5 = r3 + 1
            r12[r3] = r4     // Catch: java.lang.IllegalAccessException -> L30
            r3 = r5
            goto L32
        L30:
            r12 = move-exception
            goto L87
        L32:
            int r2 = r2 + 1
            goto L20
        L35:
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r3)     // Catch: java.lang.IllegalAccessException -> L30
            java.lang.reflect.Field[] r12 = (java.lang.reflect.Field[]) r12     // Catch: java.lang.IllegalAccessException -> L30
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r12, r0)     // Catch: java.lang.IllegalAccessException -> L30
            int r0 = r12.length     // Catch: java.lang.IllegalAccessException -> L30
            r2 = r1
        L41:
            if (r2 >= r0) goto L86
            r3 = r12[r2]     // Catch: java.lang.IllegalAccessException -> L30
            r4 = 0
            java.lang.Object r4 = r3.get(r4)     // Catch: java.lang.IllegalAccessException -> L30
            java.lang.Enum r4 = (java.lang.Enum) r4     // Catch: java.lang.IllegalAccessException -> L30
            java.lang.String r5 = r4.name()     // Catch: java.lang.IllegalAccessException -> L30
            java.lang.String r6 = r4.toString()     // Catch: java.lang.IllegalAccessException -> L30
            java.lang.Class<i6.b> r7 = i6.b.class
            java.lang.annotation.Annotation r3 = r3.getAnnotation(r7)     // Catch: java.lang.IllegalAccessException -> L30
            i6.b r3 = (i6.b) r3     // Catch: java.lang.IllegalAccessException -> L30
            if (r3 == 0) goto L74
            java.lang.String r5 = r3.value()     // Catch: java.lang.IllegalAccessException -> L30
            java.lang.String[] r3 = r3.alternate()     // Catch: java.lang.IllegalAccessException -> L30
            int r7 = r3.length     // Catch: java.lang.IllegalAccessException -> L30
            r8 = r1
        L68:
            if (r8 >= r7) goto L74
            r9 = r3[r8]     // Catch: java.lang.IllegalAccessException -> L30
            java.util.HashMap r10 = r11.f7350a     // Catch: java.lang.IllegalAccessException -> L30
            r10.put(r9, r4)     // Catch: java.lang.IllegalAccessException -> L30
            int r8 = r8 + 1
            goto L68
        L74:
            java.util.HashMap r3 = r11.f7350a     // Catch: java.lang.IllegalAccessException -> L30
            r3.put(r5, r4)     // Catch: java.lang.IllegalAccessException -> L30
            java.util.HashMap r3 = r11.f7351b     // Catch: java.lang.IllegalAccessException -> L30
            r3.put(r6, r4)     // Catch: java.lang.IllegalAccessException -> L30
            java.util.HashMap r3 = r11.f7352c     // Catch: java.lang.IllegalAccessException -> L30
            r3.put(r4, r5)     // Catch: java.lang.IllegalAccessException -> L30
            int r2 = r2 + 1
            goto L41
        L86:
            return
        L87:
            j8.o.f(r12)
            r12 = 0
            throw r12
    }

    @Override // h6.n
    public final void b(o6.a r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Enum r3 = (java.lang.Enum) r3
            if (r3 != 0) goto L6
            r3 = 0
            goto Le
        L6:
            java.util.HashMap r0 = r1.f7352c
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
        Le:
            r2.x(r3)
            return
    }
}
