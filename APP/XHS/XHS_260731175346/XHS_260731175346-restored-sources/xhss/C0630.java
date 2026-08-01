package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛲᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0630 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f2167;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.String f2168;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f2169;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0380 f2170;

    public C0630(java.lang.String r7) {
            r6 = this;
            r6.<init>()
            xhss.ᛸᛱᲁᲁ r0 = new xhss.ᛸᛱᲁᲁ
            r1 = 1
            r0.<init>(r1, r6)
            xhss.ᛴᛷᛱ r2 = new xhss.ᛴᛷᛱ
            r2.<init>(r0)
            r6.f2170 = r2
            r0 = 6
            java.lang.String r2 = "->"
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r7, r2, r3, r3, r0)
            int r2 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r2 = xhss.AbstractC0120.m350(r7, r5, r2, r3, r4)
            r4 = -1
            if (r0 == r4) goto L44
            if (r2 == r4) goto L44
            java.lang.String r3 = r7.substring(r3, r0)
            java.lang.String r3 = xhss.AbstractC0021.m121(r3)
            r6.f2169 = r3
            int r0 = r0 + 2
            java.lang.String r0 = r7.substring(r0, r2)
            r6.f2167 = r0
            int r2 = r2 + r1
            java.lang.String r7 = r7.substring(r2)
            java.lang.String r7 = xhss.AbstractC0021.m121(r7)
            r6.f2168 = r7
            return
        L44:
            java.lang.IllegalAccessError r6 = new java.lang.IllegalAccessError
            java.lang.String r0 = "not field descriptor: "
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            throw r6
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static java.lang.reflect.Field m1102(xhss.C0630 r12, java.lang.ClassLoader r13) {
            xhss.ᛴᛷᛱ r0 = r12.f2170
            xhss.ᲇᛸᛶ r1 = xhss.AbstractC0545.f1965
            java.lang.String r1 = r12.f2167
            java.lang.String r2 = r12.f2169
            java.lang.Class r2 = xhss.AbstractC0545.m977(r13, r2)
            java.lang.String r3 = r12.f2168
            java.lang.Class r13 = xhss.AbstractC0545.m977(r13, r3)     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r13 = move-exception
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r13)
            r13 = r3
        L1a:
            java.lang.Throwable r3 = xhss.AbstractC0134.m364(r13)
            java.lang.String r4 = "Field "
            if (r3 != 0) goto Lb0
            java.lang.Class r13 = (java.lang.Class) r13
            r3 = r2
        L25:
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L51
            java.lang.reflect.Field r7 = r3.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L31
            r7.setAccessible(r6)     // Catch: java.lang.Throwable -> L31
            goto L37
        L31:
            r6 = move-exception
            xhss.ᲈᛳᛱᲇ r7 = new xhss.ᲈᛳᛱᲇ
            r7.<init>(r6)
        L37:
            boolean r6 = r7 instanceof xhss.C1129
            if (r6 == 0) goto L3c
            goto L3d
        L3c:
            r5 = r7
        L3d:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            if (r5 == 0) goto L4c
            java.lang.Class r6 = r5.getType()
            boolean r6 = xhss.AbstractC0007.m97(r6, r13)
            if (r6 == 0) goto L4c
            goto L98
        L4c:
            java.lang.Class r3 = r3.getSuperclass()
            goto L25
        L51:
            r13 = r2
        L52:
            if (r13 == 0) goto L89
            java.lang.reflect.Field[] r3 = r13.getDeclaredFields()     // Catch: java.lang.Throwable -> L89
            int r7 = r3.length     // Catch: java.lang.Throwable -> L89
            r8 = 0
        L5a:
            if (r8 >= r7) goto L84
            r9 = r3[r8]     // Catch: java.lang.Throwable -> L89
            java.lang.String r10 = r9.getName()     // Catch: java.lang.Throwable -> L89
            boolean r10 = xhss.AbstractC0007.m97(r1, r10)     // Catch: java.lang.Throwable -> L89
            if (r10 == 0) goto L81
            java.lang.Object r10 = r0.m734()     // Catch: java.lang.Throwable -> L89
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L89
            java.lang.Class r11 = r9.getType()     // Catch: java.lang.Throwable -> L89
            java.lang.String r11 = xhss.AbstractC0021.m122(r11)     // Catch: java.lang.Throwable -> L89
            boolean r10 = xhss.AbstractC0007.m97(r10, r11)     // Catch: java.lang.Throwable -> L89
            if (r10 == 0) goto L81
            r9.setAccessible(r6)     // Catch: java.lang.Throwable -> L89
            r5 = r9
            goto L98
        L81:
            int r8 = r8 + 1
            goto L5a
        L84:
            java.lang.Class r13 = r13.getSuperclass()     // Catch: java.lang.Throwable -> L89
            goto L52
        L89:
            java.lang.Object r13 = r0.m734()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r5 = org.luckypray.dexkit.util.NativeReflect.getReflectedField(r2, r1, r13, r5)
            if (r5 == 0) goto L99
            r5.setAccessible(r6)
        L98:
            return r5
        L99:
            java.lang.NoSuchFieldException r13 = new java.lang.NoSuchFieldException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r12)
            java.lang.String r12 = " not found"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        Lb0:
            java.lang.NoSuchFieldException r13 = new java.lang.NoSuchFieldException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r12)
            java.lang.String r12 = " not available: type missing"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            r13.initCause(r3)
            throw r13
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof xhss.C0630
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᛷᛲᛲᛲ r5 = (xhss.C0630) r5
            java.lang.String r1 = r5.f2169
            java.lang.String r3 = r4.f2169
            boolean r1 = xhss.AbstractC0007.m97(r3, r1)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.f2167
            java.lang.String r3 = r5.f2167
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r4 = r4.f2168
            java.lang.String r5 = r5.f2168
            boolean r4 = xhss.AbstractC0007.m97(r4, r5)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f2169
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f2167
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            java.lang.String r2 = r2.f2168
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.f2169
            java.lang.String r1 = xhss.AbstractC0021.m124(r1)
            r0.<init>(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.f2167
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            xhss.ᛴᛷᛱ r2 = r2.f2170
            java.lang.Object r2 = r2.m734()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
