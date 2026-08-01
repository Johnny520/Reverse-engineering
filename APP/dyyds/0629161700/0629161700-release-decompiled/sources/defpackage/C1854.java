package defpackage;

/* JADX INFO: renamed from: ᲁᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1854 implements defpackage.InterfaceC1631 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0389 f8095;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f8096;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f8097;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f8098;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f8099;

    public C1854(java.lang.String r9) {
            r8 = this;
            r8.<init>()
            ᛲᲀ r0 = new ᛲᲀ
            r1 = 5
            r0.<init>(r1, r8)
            ᛲᲈᛶᲈ r1 = new ᛲᲈᛶᲈ
            r1.<init>(r0)
            r8.f8095 = r1
            java.lang.String r0 = "->"
            r1 = 6
            r2 = 0
            int r0 = defpackage.AbstractC1347.m2517(r9, r0, r2, r2, r1)
            int r1 = r0 + 1
            java.lang.String r3 = "("
            r4 = 4
            int r1 = defpackage.AbstractC1347.m2517(r9, r3, r1, r2, r4)
            int r3 = r1 + 1
            java.lang.String r5 = ")"
            int r5 = defpackage.AbstractC1347.m2517(r9, r5, r3, r2, r4)
            r6 = -1
            if (r0 == r6) goto L92
            if (r1 == r6) goto L92
            if (r5 == r6) goto L92
            java.lang.String r6 = r9.substring(r2, r0)
            java.lang.String r6 = defpackage.AbstractC0859.m1820(r6)
            r8.f8098 = r6
            int r0 = r0 + 2
            java.lang.String r0 = r9.substring(r0, r1)
            r8.f8099 = r0
            java.lang.String r0 = r9.substring(r3, r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L4b:
            r3 = r2
        L4c:
            int r6 = r0.length()
            if (r2 >= r6) goto L76
            char r6 = r0.charAt(r2)
            r7 = 76
            if (r6 == r7) goto L62
            r7 = 91
            if (r6 == r7) goto L5f
            goto L68
        L5f:
            int r2 = r2 + 1
            goto L4c
        L62:
            r6 = 59
            int r2 = defpackage.AbstractC1347.m2514(r0, r6, r2, r4)
        L68:
            int r2 = r2 + 1
            java.lang.String r3 = r0.substring(r3, r2)
            java.lang.String r3 = defpackage.AbstractC0859.m1820(r3)
            r1.add(r3)
            goto L4b
        L76:
            if (r3 != r2) goto L87
            r8.f8097 = r1
            int r5 = r5 + 1
            java.lang.String r9 = r9.substring(r5)
            java.lang.String r9 = defpackage.AbstractC0859.m1820(r9)
            r8.f8096 = r9
            return
        L87:
            java.lang.String r8 = "Unknown signString: "
            java.lang.String r8 = r8.concat(r0)
            defpackage.C2264.m3676(r8)
            r8 = 0
            throw r8
        L92:
            java.lang.IllegalAccessError r8 = new java.lang.IllegalAccessError
            java.lang.String r0 = "not method descriptor: "
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.reflect.Method m3270(defpackage.C1854 r11, java.lang.ClassLoader r12) {
            r11.getClass()
            ᛲᲈᛶᲈ r0 = r11.f8095
            ᛲᛶᛲᲁ r1 = defpackage.AbstractC0576.f2848
            java.lang.String r1 = r11.f8099
            java.lang.String r2 = "<clinit>"
            boolean r2 = defpackage.AbstractC0498.m1280(r1, r2)
            if (r2 != 0) goto L117
            java.lang.String r2 = "<init>"
            boolean r2 = defpackage.AbstractC0498.m1280(r1, r2)
            if (r2 != 0) goto L117
            java.lang.String r2 = r11.f8098
            java.lang.Class r2 = defpackage.AbstractC0576.m1370(r12, r2)
            java.util.ArrayList r3 = r11.f8097
            java.io.Serializable r3 = defpackage.AbstractC0576.m1371(r12, r3)
            java.lang.Throwable r4 = defpackage.C2165.m3569(r3)
            java.lang.String r5 = "Method "
            if (r4 != 0) goto Lfd
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            java.lang.String r4 = r11.f8096
            java.lang.Class r12 = defpackage.AbstractC0576.m1370(r12, r4)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r12 = move-exception
            ᛴᛸᛲᲀ r4 = new ᛴᛸᛲᲀ
            r4.<init>(r12)
            r12 = r4
        L3d:
            java.lang.Throwable r4 = defpackage.C2165.m3569(r12)
            if (r4 != 0) goto Le3
            java.lang.Class r12 = (java.lang.Class) r12
            r4 = r2
        L46:
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L79
            int r8 = r3.length     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r3, r8)     // Catch: java.lang.Throwable -> L59
            java.lang.Class[] r8 = (java.lang.Class[]) r8     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r8 = r4.getDeclaredMethod(r1, r8)     // Catch: java.lang.Throwable -> L59
            r8.setAccessible(r7)     // Catch: java.lang.Throwable -> L59
            goto L5f
        L59:
            r7 = move-exception
            ᛴᛸᛲᲀ r8 = new ᛴᛸᛲᲀ
            r8.<init>(r7)
        L5f:
            boolean r7 = r8 instanceof defpackage.C0723
            if (r7 == 0) goto L64
            goto L65
        L64:
            r6 = r8
        L65:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L74
            java.lang.Class r7 = r6.getReturnType()
            boolean r7 = defpackage.AbstractC0498.m1280(r7, r12)
            if (r7 == 0) goto L74
            goto Lcb
        L74:
            java.lang.Class r4 = r4.getSuperclass()
            goto L46
        L79:
            r12 = r2
        L7a:
            if (r12 == 0) goto Lb9
            java.lang.reflect.Method[] r3 = r12.getDeclaredMethods()     // Catch: java.lang.Throwable -> Lb9
            r4 = 0
        L81:
            int r8 = r3.length     // Catch: java.lang.Throwable -> Lb9
            if (r4 >= r8) goto Lb4
            int r8 = r4 + 1
            r4 = r3[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La9 java.lang.Throwable -> Lb9
            java.lang.String r9 = r4.getName()     // Catch: java.lang.Throwable -> Lb9
            boolean r9 = defpackage.AbstractC0498.m1280(r9, r1)     // Catch: java.lang.Throwable -> Lb9
            if (r9 == 0) goto La7
            java.lang.Object r9 = r0.getValue()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r10 = defpackage.AbstractC0859.m1819(r4)     // Catch: java.lang.Throwable -> Lb9
            boolean r9 = defpackage.AbstractC0498.m1280(r9, r10)     // Catch: java.lang.Throwable -> Lb9
            if (r9 == 0) goto La7
            r4.setAccessible(r7)     // Catch: java.lang.Throwable -> Lb9
            r6 = r4
            goto Lcb
        La7:
            r4 = r8
            goto L81
        La9:
            r12 = move-exception
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> Lb9
            r3.<init>(r12)     // Catch: java.lang.Throwable -> Lb9
            throw r3     // Catch: java.lang.Throwable -> Lb9
        Lb4:
            java.lang.Class r12 = r12.getSuperclass()     // Catch: java.lang.Throwable -> Lb9
            goto L7a
        Lb9:
            java.lang.Object r12 = r0.getValue()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Member r12 = org.luckypray.dexkit.util.NativeReflect.getReflectedMethod(r2, r1, r12, r6)
            if (r12 == 0) goto Lcc
            r6 = r12
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r7)
        Lcb:
            return r6
        Lcc:
            java.lang.NoSuchMethodException r12 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r11)
            java.lang.String r11 = " not found"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r12.<init>(r11)
            throw r12
        Le3:
            java.lang.NoSuchMethodException r12 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r11)
            java.lang.String r11 = " not available: return type missing"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r12.<init>(r11)
            r12.initCause(r4)
            throw r12
        Lfd:
            java.lang.NoSuchMethodException r12 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r11)
            java.lang.String r11 = " not available: parameter type(s) missing"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r12.<init>(r11)
            r12.initCause(r4)
            throw r12
        L117:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = " not a method"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L32
        L3:
            boolean r0 = r3 instanceof defpackage.C1854
            if (r0 != 0) goto L8
            goto L34
        L8:
            ᲁᛵᛳ r3 = (defpackage.C1854) r3
            java.lang.String r0 = r3.f8098
            java.lang.String r1 = r2.f8098
            boolean r0 = defpackage.AbstractC0498.m1280(r1, r0)
            if (r0 == 0) goto L34
            java.lang.String r0 = r2.f8099
            java.lang.String r1 = r3.f8099
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L34
            java.util.ArrayList r0 = r2.f8097
            java.util.ArrayList r1 = r3.f8097
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L34
            java.lang.String r2 = r2.f8096
            java.lang.String r3 = r3.f8096
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)
            if (r2 == 0) goto L34
        L32:
            r2 = 1
            return r2
        L34:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f8098
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f8099
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            java.util.ArrayList r0 = r2.f8097
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            java.lang.String r2 = r2.f8096
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.f8098
            java.lang.String r1 = defpackage.AbstractC0859.m1817(r1)
            r0.<init>(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.f8099
            r0.append(r1)
            ᛲᲈᛶᲈ r2 = r2.f8095
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.reflect.Constructor m3271(java.lang.ClassLoader r13) {
            r12 = this;
            ᛲᲈᛶᲈ r0 = r12.f8095
            ᛲᛶᛲᲁ r1 = defpackage.AbstractC0576.f2848
            java.lang.String r1 = "<init>"
            java.lang.String r2 = r12.f8099
            boolean r1 = defpackage.AbstractC0498.m1280(r2, r1)
            if (r1 == 0) goto Ld8
            java.lang.String r1 = r12.f8098
            java.lang.Class r1 = defpackage.AbstractC0576.m1370(r13, r1)
            java.util.ArrayList r3 = r12.f8097
            java.io.Serializable r13 = defpackage.AbstractC0576.m1371(r13, r3)
            java.lang.Throwable r3 = defpackage.C2165.m3569(r13)
            java.lang.String r4 = "Constructor "
            if (r3 != 0) goto Lbe
            java.lang.Class[] r13 = (java.lang.Class[]) r13
            r3 = 1
            int r5 = r13.length     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r5)     // Catch: java.lang.Throwable -> L34
            java.lang.Class[] r13 = (java.lang.Class[]) r13     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Constructor r13 = r1.getDeclaredConstructor(r13)     // Catch: java.lang.Throwable -> L34
            r13.setAccessible(r3)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r13 = move-exception
            ᛴᛸᛲᲀ r5 = new ᛴᛸᛲᲀ
            r5.<init>(r13)
            r13 = r5
        L3b:
            boolean r5 = r13 instanceof defpackage.C0723
            if (r5 == 0) goto L40
            r13 = 0
        L40:
            java.lang.reflect.Constructor r13 = (java.lang.reflect.Constructor) r13
            if (r13 == 0) goto L45
            goto La6
        L45:
            java.lang.reflect.Constructor[] r13 = r1.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L93
            r5 = 0
        L4a:
            int r6 = r13.length     // Catch: java.lang.Throwable -> L93
            if (r5 >= r6) goto L93
            int r6 = r5 + 1
            r5 = r13[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L88 java.lang.Throwable -> L93
            java.lang.Object r7 = r0.getValue()     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L93
            java.util.LinkedHashMap r8 = defpackage.AbstractC0859.f3913     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = "("
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.Class[] r9 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L93
            ᛷᛸᛶᲁ r10 = new ᛷᛸᛶᲁ     // Catch: java.lang.Throwable -> L93
            r11 = 16
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = defpackage.AbstractC2315.m3769(r9, r10)     // Catch: java.lang.Throwable -> L93
            r8.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = ")V"
            r8.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L93
            boolean r7 = defpackage.AbstractC0498.m1280(r7, r8)     // Catch: java.lang.Throwable -> L93
            if (r7 == 0) goto L86
            r5.setAccessible(r3)     // Catch: java.lang.Throwable -> L93
            r13 = r5
            goto La6
        L86:
            r5 = r6
            goto L4a
        L88:
            r13 = move-exception
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L93
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L93
            r5.<init>(r13)     // Catch: java.lang.Throwable -> L93
            throw r5     // Catch: java.lang.Throwable -> L93
        L93:
            java.lang.Object r13 = r0.getValue()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.reflect.Member r13 = org.luckypray.dexkit.util.NativeReflect.getReflectedMethod(r1, r2, r13, r0)
            if (r13 == 0) goto La7
            java.lang.reflect.Constructor r13 = (java.lang.reflect.Constructor) r13
            r13.setAccessible(r3)
        La6:
            return r13
        La7:
            java.lang.NoSuchMethodException r13 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r12)
            java.lang.String r12 = " not found"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        Lbe:
            java.lang.NoSuchMethodException r13 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r12)
            java.lang.String r12 = " not available: parameter type(s) missing"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            r13.initCause(r3)
            throw r13
        Ld8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r12 = " not a constructor"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }
}
