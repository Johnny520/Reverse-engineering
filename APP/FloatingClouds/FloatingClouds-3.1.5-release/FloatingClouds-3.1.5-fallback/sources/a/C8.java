package a;

/* JADX INFO: loaded from: classes.dex */
public final class C8 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46a;
    public final /* synthetic */ java.util.HashSet b;

    public /* synthetic */ C8(a.D8 r1, java.util.HashSet r2, int r3) {
            r0 = this;
            r0.f46a = r3
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r17) {
            r16 = this;
            r1 = r16
            r2 = r17
            int r0 = r1.f46a
            switch(r0) {
                case 0: goto L4b;
                default: goto L9;
            }
        L9:
            if (r2 != 0) goto Le
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L4a
        Le:
            java.lang.String r0 = a.D8.a(r2)
            java.util.HashSet r2 = r1.b
            r3 = 1
            if (r0 == 0) goto L3c
            boolean r4 = r2.contains(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "HideTextStatus: [StoreK] item wxid="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = " masked="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r3)
            a.C0453x1.b(r4)
        L3c:
            if (r0 == 0) goto L45
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L45
            goto L46
        L45:
            r3 = 0
        L46:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        L4a:
            return r0
        L4b:
            if (r2 != 0) goto L51
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L185
        L51:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 1
            r6 = 0
            java.lang.Class r7 = r2.getClass()     // Catch: java.lang.Throwable -> Ldc
        L5b:
            if (r7 == 0) goto L153
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            boolean r8 = r7.equals(r8)     // Catch: java.lang.Throwable -> Ldc
            if (r8 != 0) goto L153
            java.lang.reflect.Field[] r8 = r7.getDeclaredFields()     // Catch: java.lang.Throwable -> Ldc
            a.G1 r8 = a.C0435w1.I(r8)     // Catch: java.lang.Throwable -> Ldc
        L6d:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> Ldc
            if (r9 == 0) goto L14c
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> Ldc
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9     // Catch: java.lang.Throwable -> Ldc
            int r10 = r9.getModifiers()     // Catch: java.lang.Throwable -> Ldc
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)     // Catch: java.lang.Throwable -> Ldc
            if (r10 != 0) goto L6d
            java.lang.Class r10 = r9.getType()     // Catch: java.lang.Throwable -> Ldc
            boolean r10 = r10.isPrimitive()     // Catch: java.lang.Throwable -> Ldc
            if (r10 != 0) goto L6d
            java.lang.Class r10 = r9.getType()     // Catch: java.lang.Throwable -> Ldc
            boolean r10 = a.C0193i9.a(r10, r3)     // Catch: java.lang.Throwable -> Ldc
            if (r10 == 0) goto L98
            goto L6d
        L98:
            java.lang.Class r10 = r9.getType()     // Catch: java.lang.Throwable -> Ldc
            boolean r10 = r0.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> Ldc
            if (r10 != 0) goto L6d
            r9.setAccessible(r4)     // Catch: java.lang.Throwable -> Ldc
            java.lang.Object r9 = r9.get(r2)     // Catch: java.lang.Throwable -> Ldc
            if (r9 != 0) goto Lac
            goto L6d
        Lac:
            java.lang.Class r10 = r9.getClass()     // Catch: java.lang.Throwable -> Ldc
            java.lang.reflect.Field[] r10 = r10.getDeclaredFields()     // Catch: java.lang.Throwable -> Ldc
            a.G1 r10 = a.C0435w1.I(r10)     // Catch: java.lang.Throwable -> Ldc
        Lb8:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> Ldc
            if (r11 == 0) goto L6d
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> Ldc
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11     // Catch: java.lang.Throwable -> Ldc
            java.lang.Class r12 = r11.getType()     // Catch: java.lang.Throwable -> Ldc
            boolean r12 = r0.isAssignableFrom(r12)     // Catch: java.lang.Throwable -> Ldc
            if (r12 == 0) goto Lb8
            r11.setAccessible(r4)     // Catch: java.lang.Throwable -> Ldc
            java.lang.Object r11 = r11.get(r9)     // Catch: java.lang.Throwable -> Ldc
            boolean r12 = r11 instanceof java.util.Collection     // Catch: java.lang.Throwable -> Ldc
            if (r12 == 0) goto Ldf
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.Throwable -> Ldc
            goto Le0
        Ldc:
            r0 = move-exception
            goto L158
        Ldf:
            r11 = r6
        Le0:
            if (r11 != 0) goto Le3
            goto Lb8
        Le3:
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Ldc
        Le7:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> Ldc
            if (r12 == 0) goto Lf4
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> Ldc
            if (r12 == 0) goto Le7
            goto Lf5
        Lf4:
            r12 = r6
        Lf5:
            if (r12 != 0) goto Lf8
            goto Lb8
        Lf8:
            java.lang.Class r11 = r12.getClass()     // Catch: java.lang.Throwable -> Ldc
            java.lang.reflect.Method[] r11 = r11.getMethods()     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r13 = "getMethods(...)"
            a.C0193i9.d(r11, r13)     // Catch: java.lang.Throwable -> Ldc
            int r13 = r11.length     // Catch: java.lang.Throwable -> Ldc
            r14 = 0
        L107:
            if (r14 >= r13) goto L132
            r15 = r11[r14]     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r4 = r15.getName()     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r5 = "o"
            boolean r4 = a.C0193i9.a(r4, r5)     // Catch: java.lang.Throwable -> Ldc
            if (r4 == 0) goto L12e
            java.lang.Class r4 = r15.getReturnType()     // Catch: java.lang.Throwable -> Ldc
            boolean r4 = a.C0193i9.a(r4, r3)     // Catch: java.lang.Throwable -> Ldc
            if (r4 == 0) goto L12e
            java.lang.Class[] r4 = r15.getParameterTypes()     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r5 = "getParameterTypes(...)"
            a.C0193i9.d(r4, r5)     // Catch: java.lang.Throwable -> Ldc
            int r4 = r4.length     // Catch: java.lang.Throwable -> Ldc
            if (r4 != 0) goto L12e
            goto L133
        L12e:
            int r14 = r14 + 1
            r4 = 1
            goto L107
        L132:
            r15 = r6
        L133:
            if (r15 == 0) goto L149
            java.lang.Object r4 = r15.invoke(r12, r6)     // Catch: java.lang.Throwable -> Ldc
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> Ldc
            if (r5 == 0) goto L140
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Ldc
            goto L141
        L140:
            r4 = r6
        L141:
            if (r4 == 0) goto L149
            boolean r5 = a.Be.P(r4)     // Catch: java.lang.Throwable -> Ldc
            if (r5 == 0) goto L165
        L149:
            r4 = 1
            goto Lb8
        L14c:
            java.lang.Class r7 = r7.getSuperclass()     // Catch: java.lang.Throwable -> Ldc
            r4 = 1
            goto L5b
        L153:
            java.lang.String r0 = a.D8.a(r2)     // Catch: java.lang.Throwable -> Ldc
            goto L15c
        L158:
            a.wd$a r0 = a.C0465xd.a(r0)
        L15c:
            boolean r3 = r0 instanceof a.C0447wd.a
            if (r3 == 0) goto L161
            goto L162
        L161:
            r6 = r0
        L162:
            r4 = r6
            java.lang.String r4 = (java.lang.String) r4
        L165:
            java.util.HashSet r0 = r1.b
            if (r4 == 0) goto L172
            boolean r3 = r0.contains(r4)
            if (r3 == 0) goto L172
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L185
        L172:
            java.lang.String r2 = a.D8.a(r2)
            if (r2 == 0) goto L180
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L180
            r4 = 1
            goto L181
        L180:
            r4 = 0
        L181:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L185:
            return r0
    }
}
