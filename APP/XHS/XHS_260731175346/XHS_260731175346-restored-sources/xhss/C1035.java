package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛴᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1035 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f3340;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.ArrayList f3341;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0380 f3342;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f3343;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.String f3344;

    public C1035(java.lang.String r9) {
            r8 = this;
            r8.<init>()
            xhss.ᛸᛱᲁᲁ r0 = new xhss.ᛸᛱᲁᲁ
            r1 = 2
            r0.<init>(r1, r8)
            xhss.ᛴᛷᛱ r2 = new xhss.ᛴᛷᛱ
            r2.<init>(r0)
            r8.f3342 = r2
            java.lang.String r0 = "->"
            r2 = 6
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r9, r0, r3, r3, r2)
            int r2 = r0 + 1
            java.lang.String r4 = "("
            r5 = 4
            int r2 = xhss.AbstractC0120.m350(r9, r4, r2, r3, r5)
            int r4 = r2 + 1
            java.lang.String r6 = ")"
            int r6 = xhss.AbstractC0120.m350(r9, r6, r4, r3, r5)
            r7 = -1
            if (r0 == r7) goto L90
            if (r2 == r7) goto L90
            if (r6 == r7) goto L90
            java.lang.String r7 = r9.substring(r3, r0)
            java.lang.String r7 = xhss.AbstractC0021.m121(r7)
            r8.f3343 = r7
            int r0 = r0 + r1
            java.lang.String r0 = r9.substring(r0, r2)
            r8.f3340 = r0
            java.lang.String r0 = r9.substring(r4, r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L4a:
            r2 = r3
        L4b:
            int r4 = r0.length()
            if (r3 >= r4) goto L74
            char r4 = r0.charAt(r3)
            r7 = 91
            if (r4 != r7) goto L5c
            int r3 = r3 + 1
            goto L4b
        L5c:
            r7 = 76
            if (r4 != r7) goto L66
            r4 = 59
            int r3 = xhss.AbstractC0120.m351(r0, r4, r3, r5)
        L66:
            int r3 = r3 + 1
            java.lang.String r2 = r0.substring(r2, r3)
            java.lang.String r2 = xhss.AbstractC0021.m121(r2)
            r1.add(r2)
            goto L4a
        L74:
            if (r2 != r3) goto L85
            r8.f3341 = r1
            int r6 = r6 + 1
            java.lang.String r9 = r9.substring(r6)
            java.lang.String r9 = xhss.AbstractC0021.m121(r9)
            r8.f3344 = r9
            return
        L85:
            java.lang.String r8 = "Unknown signString: "
            java.lang.String r8 = r8.concat(r0)
            xhss.C0532.m950(r8)
            r8 = 0
            throw r8
        L90:
            java.lang.IllegalAccessError r8 = new java.lang.IllegalAccessError
            java.lang.String r0 = "not method descriptor: "
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.lang.reflect.Method m1684(xhss.C1035 r14, java.lang.ClassLoader r15) {
            r14.getClass()
            xhss.ᛴᛷᛱ r0 = r14.f3342
            xhss.ᲇᛸᛶ r1 = xhss.AbstractC0545.f1965
            java.lang.String r1 = r14.f3340
            java.lang.String r2 = "<clinit>"
            boolean r2 = xhss.AbstractC0007.m97(r1, r2)
            if (r2 != 0) goto L132
            java.lang.String r2 = "<init>"
            boolean r2 = xhss.AbstractC0007.m97(r1, r2)
            if (r2 != 0) goto L132
            java.lang.String r2 = r14.f3343
            java.lang.Class r2 = xhss.AbstractC0545.m977(r15, r2)
            java.util.ArrayList r3 = r14.f3341
            java.io.Serializable r3 = xhss.AbstractC0545.m976(r15, r3)
            java.lang.Throwable r4 = xhss.AbstractC0134.m364(r3)
            java.lang.String r5 = "Method "
            if (r4 != 0) goto L118
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            java.lang.String r4 = r14.f3344
            java.lang.Class r15 = xhss.AbstractC0545.m977(r15, r4)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r15 = move-exception
            xhss.ᲈᛳᛱᲇ r4 = new xhss.ᲈᛳᛱᲇ
            r4.<init>(r15)
            r15 = r4
        L3d:
            java.lang.Throwable r4 = xhss.AbstractC0134.m364(r15)
            if (r4 != 0) goto Lfe
            java.lang.Class r15 = (java.lang.Class) r15
            r4 = r2
        L46:
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L7a
            int r8 = r3.length     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r3, r8)     // Catch: java.lang.Throwable -> L59
            java.lang.Class[] r8 = (java.lang.Class[]) r8     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r8 = r4.getDeclaredMethod(r1, r8)     // Catch: java.lang.Throwable -> L59
            r8.setAccessible(r7)     // Catch: java.lang.Throwable -> L59
            goto L5f
        L59:
            r7 = move-exception
            xhss.ᲈᛳᛱᲇ r8 = new xhss.ᲈᛳᛱᲇ
            r8.<init>(r7)
        L5f:
            boolean r7 = r8 instanceof xhss.C1129
            if (r7 == 0) goto L64
            goto L65
        L64:
            r6 = r8
        L65:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L75
            java.lang.Class r7 = r6.getReturnType()
            boolean r7 = xhss.AbstractC0007.m97(r7, r15)
            if (r7 == 0) goto L75
            goto Le6
        L75:
            java.lang.Class r4 = r4.getSuperclass()
            goto L46
        L7a:
            r15 = r2
        L7b:
            if (r15 == 0) goto Ld4
            java.lang.reflect.Method[] r3 = r15.getDeclaredMethods()     // Catch: java.lang.Throwable -> Ld4
            int r4 = r3.length     // Catch: java.lang.Throwable -> Ld4
            r8 = 0
        L83:
            if (r8 >= r4) goto Lcf
            r9 = r3[r8]     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r10 = r9.getName()     // Catch: java.lang.Throwable -> Ld4
            boolean r10 = xhss.AbstractC0007.m97(r10, r1)     // Catch: java.lang.Throwable -> Ld4
            if (r10 == 0) goto Lcc
            java.lang.Object r10 = r0.m734()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Ld4
            java.util.LinkedHashMap r11 = xhss.AbstractC0021.f202     // Catch: java.lang.Throwable -> Ld4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r12 = "("
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Ld4
            java.lang.Class[] r12 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> Ld4
            xhss.ᲀᲈᲇᛱ r13 = xhss.C0919.f2961     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r12 = xhss.AbstractC0193.m456(r12, r13)     // Catch: java.lang.Throwable -> Ld4
            r11.append(r12)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r12 = ")"
            r11.append(r12)     // Catch: java.lang.Throwable -> Ld4
            java.lang.Class r12 = r9.getReturnType()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r12 = xhss.AbstractC0021.m122(r12)     // Catch: java.lang.Throwable -> Ld4
            r11.append(r12)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Ld4
            boolean r10 = xhss.AbstractC0007.m97(r10, r11)     // Catch: java.lang.Throwable -> Ld4
            if (r10 == 0) goto Lcc
            r9.setAccessible(r7)     // Catch: java.lang.Throwable -> Ld4
            r6 = r9
            goto Le6
        Lcc:
            int r8 = r8 + 1
            goto L83
        Lcf:
            java.lang.Class r15 = r15.getSuperclass()     // Catch: java.lang.Throwable -> Ld4
            goto L7b
        Ld4:
            java.lang.Object r15 = r0.m734()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Member r15 = org.luckypray.dexkit.util.NativeReflect.getReflectedMethod(r2, r1, r15, r6)
            if (r15 == 0) goto Le7
            r6 = r15
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r7)
        Le6:
            return r6
        Le7:
            java.lang.NoSuchMethodException r15 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r14)
            java.lang.String r14 = " not found"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        Lfe:
            java.lang.NoSuchMethodException r15 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r14)
            java.lang.String r14 = " not available: return type missing"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            r15.initCause(r4)
            throw r15
        L118:
            java.lang.NoSuchMethodException r15 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r14)
            java.lang.String r14 = " not available: parameter type(s) missing"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            r15.initCause(r4)
            throw r15
        L132:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            java.lang.String r14 = " not a method"
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r15.<init>(r14)
            throw r15
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L32
        L3:
            boolean r0 = r3 instanceof xhss.C1035
            if (r0 != 0) goto L8
            goto L34
        L8:
            xhss.ᲇᛴᲇᛴ r3 = (xhss.C1035) r3
            java.lang.String r0 = r3.f3343
            java.lang.String r1 = r2.f3343
            boolean r0 = xhss.AbstractC0007.m97(r1, r0)
            if (r0 == 0) goto L34
            java.lang.String r0 = r2.f3340
            java.lang.String r1 = r3.f3340
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L34
            java.util.ArrayList r0 = r2.f3341
            java.util.ArrayList r1 = r3.f3341
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L34
            java.lang.String r2 = r2.f3344
            java.lang.String r3 = r3.f3344
            boolean r2 = xhss.AbstractC0007.m97(r2, r3)
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
            java.lang.String r0 = r2.f3343
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f3340
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            java.util.ArrayList r0 = r2.f3341
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            java.lang.String r2 = r2.f3344
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.f3343
            java.lang.String r1 = xhss.AbstractC0021.m124(r1)
            r0.<init>(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.f3340
            r0.append(r1)
            xhss.ᛴᛷᛱ r2 = r2.f3342
            java.lang.Object r2 = r2.m734()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.String m1685() {
            r0 = this;
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.reflect.Constructor m1686(java.lang.ClassLoader r13) {
            r12 = this;
            xhss.ᛴᛷᛱ r0 = r12.f3342
            xhss.ᲇᛸᛶ r1 = xhss.AbstractC0545.f1965
            java.lang.String r1 = "<init>"
            java.lang.String r2 = r12.f3340
            boolean r1 = xhss.AbstractC0007.m97(r2, r1)
            if (r1 == 0) goto Lc7
            java.lang.String r1 = r12.f3343
            java.lang.Class r1 = xhss.AbstractC0545.m977(r13, r1)
            java.util.ArrayList r3 = r12.f3341
            java.io.Serializable r13 = xhss.AbstractC0545.m976(r13, r3)
            java.lang.Throwable r3 = xhss.AbstractC0134.m364(r13)
            java.lang.String r4 = "Constructor "
            if (r3 != 0) goto Lad
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
            xhss.ᲈᛳᛱᲇ r5 = new xhss.ᲈᛳᛱᲇ
            r5.<init>(r13)
            r13 = r5
        L3b:
            boolean r5 = r13 instanceof xhss.C1129
            if (r5 == 0) goto L40
            r13 = 0
        L40:
            java.lang.reflect.Constructor r13 = (java.lang.reflect.Constructor) r13
            if (r13 == 0) goto L45
            goto L95
        L45:
            java.lang.reflect.Constructor[] r13 = r1.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L82
            int r5 = r13.length     // Catch: java.lang.Throwable -> L82
            r6 = 0
        L4b:
            if (r6 >= r5) goto L82
            r7 = r13[r6]     // Catch: java.lang.Throwable -> L82
            java.lang.Object r8 = r0.m734()     // Catch: java.lang.Throwable -> L82
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L82
            java.util.LinkedHashMap r9 = xhss.AbstractC0021.f202     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            java.lang.String r10 = "("
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L82
            java.lang.Class[] r10 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L82
            xhss.ᲀᲈᲇᛱ r11 = xhss.C0919.f2963     // Catch: java.lang.Throwable -> L82
            java.lang.String r10 = xhss.AbstractC0193.m456(r10, r11)     // Catch: java.lang.Throwable -> L82
            r9.append(r10)     // Catch: java.lang.Throwable -> L82
            java.lang.String r10 = ")V"
            r9.append(r10)     // Catch: java.lang.Throwable -> L82
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L82
            boolean r8 = xhss.AbstractC0007.m97(r8, r9)     // Catch: java.lang.Throwable -> L82
            if (r8 == 0) goto L7f
            r7.setAccessible(r3)     // Catch: java.lang.Throwable -> L82
            r13 = r7
            goto L95
        L7f:
            int r6 = r6 + 1
            goto L4b
        L82:
            java.lang.Object r13 = r0.m734()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.reflect.Member r13 = org.luckypray.dexkit.util.NativeReflect.getReflectedMethod(r1, r2, r13, r0)
            if (r13 == 0) goto L96
            java.lang.reflect.Constructor r13 = (java.lang.reflect.Constructor) r13
            r13.setAccessible(r3)
        L95:
            return r13
        L96:
            java.lang.NoSuchMethodException r13 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r12)
            java.lang.String r12 = " not found"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        Lad:
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
        Lc7:
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
