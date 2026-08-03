package bsh.security;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MainSecurityGuard {
    private final java.util.Set<bsh.security.SecurityGuard> securityGuards;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public class BasicSecurityGuard implements bsh.security.SecurityGuard {
        final /* synthetic */ bsh.security.MainSecurityGuard this$0;

        private BasicSecurityGuard(bsh.security.MainSecurityGuard r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ BasicSecurityGuard(bsh.security.MainSecurityGuard r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // bsh.security.SecurityGuard
        public boolean canConstruct(java.lang.Class<?> r2, java.lang.Object[] r3) {
                r1 = this;
                java.lang.Class<bsh.security.MainSecurityGuard> r3 = bsh.security.MainSecurityGuard.class
                boolean r3 = r3.isAssignableFrom(r2)
                r0 = 0
                if (r3 == 0) goto La
                return r0
            La:
                java.lang.Class<bsh.security.SecurityGuard> r3 = bsh.security.SecurityGuard.class
                boolean r2 = r3.isAssignableFrom(r2)
                if (r2 == 0) goto L13
                return r0
            L13:
                r2 = 1
                return r2
        }

        @Override // bsh.security.SecurityGuard
        public boolean canGetStaticField(java.lang.Class<?> r2, java.lang.String r3) {
                r1 = this;
                java.lang.Class<bsh.Interpreter> r0 = bsh.Interpreter.class
                if (r2 != r0) goto Le
                java.lang.String r2 = "mainSecurityGuard"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto Le
                r2 = 0
                return r2
            Le:
                r2 = 1
                return r2
        }

        @Override // bsh.security.SecurityGuard
        public boolean canImplements(java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<bsh.security.SecurityGuard> r0 = bsh.security.SecurityGuard.class
                if (r2 == r0) goto L6
                r2 = 1
                return r2
            L6:
                r2 = 0
                return r2
        }

        @Override // bsh.security.SecurityGuard
        public boolean canInvokeMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object[] r3) {
                r0 = this;
                boolean r1 = r1 instanceof bsh.security.MainSecurityGuard
                r1 = r1 ^ 1
                return r1
        }

        @Override // bsh.security.SecurityGuard
        public boolean canSetField(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
                r0 = this;
                boolean r1 = r1 instanceof bsh.security.MainSecurityGuard
                r1 = r1 ^ 1
                return r1
        }

        @Override // bsh.security.SecurityGuard
        public boolean canSetStaticField(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object r3) {
                r0 = this;
                java.lang.Class<bsh.Interpreter> r3 = bsh.Interpreter.class
                if (r1 != r3) goto Le
                java.lang.String r1 = "mainSecurityGuard"
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto Le
                r1 = 0
                return r1
            Le:
                r1 = 1
                return r1
        }
    }

    public MainSecurityGuard() {
            r3 = this;
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.securityGuards = r0
            bsh.security.MainSecurityGuard$BasicSecurityGuard r1 = new bsh.security.MainSecurityGuard$BasicSecurityGuard
            r2 = 0
            r1.<init>(r3, r2)
            r0.add(r1)
            return
    }

    private final void canInvokeMethodImpl(java.lang.Object r3, java.lang.String r4, java.lang.Object[] r5) {
            r2 = this;
            java.util.Set<bsh.security.SecurityGuard> r0 = r2.securityGuards
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            bsh.security.SecurityGuard r1 = (bsh.security.SecurityGuard) r1
            boolean r1 = r1.canInvokeMethod(r3, r4, r5)
            if (r1 == 0) goto L19
            goto L6
        L19:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.cantInvokeMethod(r3, r4, r5)
            throw r3
        L1e:
            return
    }

    private final void canInvokeMethodImplToReflectionCanConstruct(java.lang.Object r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Class
            r1 = 0
            java.lang.String r2 = "newInstance"
            if (r0 == 0) goto L1a
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L1a
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r3.canConstruct(r4, r5)     // Catch: bsh.security.SecurityError -> L15
            return
        L15:
            bsh.security.SecurityError r4 = bsh.security.SecurityError.reflectCantConstruct(r4, r5)
            throw r4
        L1a:
            boolean r0 = r4 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L40
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L40
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.Class r4 = r4.getDeclaringClass()
            int r5 = r6.length
            r0 = 1
            if (r5 != r0) goto L37
            r5 = r6[r1]
            boolean r0 = r5 instanceof java.lang.Object[]
            if (r0 == 0) goto L37
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
        L37:
            r3.canConstruct(r4, r6)     // Catch: bsh.security.SecurityError -> L3b
            return
        L3b:
            bsh.security.SecurityError r4 = bsh.security.SecurityError.reflectCantConstruct(r4, r6)
            throw r4
        L40:
            return
    }

    private final void canInvokeMethodImplToReflectionCanGetField(java.lang.Object r2, java.lang.String r3, java.lang.Object[] r4) {
            r1 = this;
            java.lang.String r0 = "get"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L36
            int r3 = r4.length
            r0 = 1
            if (r3 != r0) goto L36
            boolean r3 = r2 instanceof java.lang.reflect.Field
            if (r3 != 0) goto L11
            goto L36
        L11:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.String r3 = r2.getName()
            boolean r0 = bsh.Reflect.isStatic(r2)
            if (r0 == 0) goto L2a
            java.lang.Class r2 = r2.getDeclaringClass()
            r1.canGetStaticField(r2, r3)     // Catch: bsh.security.SecurityError -> L25
            return
        L25:
            bsh.security.SecurityError r2 = bsh.security.SecurityError.reflectCantGetStaticField(r2, r3)
            throw r2
        L2a:
            r2 = 0
            r2 = r4[r2]
            r1.canGetField(r2, r3)     // Catch: bsh.security.SecurityError -> L31
            return
        L31:
            bsh.security.SecurityError r2 = bsh.security.SecurityError.reflectCantGetField(r2, r3)
            throw r2
        L36:
            return
    }

    private final void canInvokeMethodImplToReflectionCanInvokeMethod(java.lang.Object r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            java.lang.String r0 = "invoke"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L48
            int r5 = r6.length
            if (r5 == 0) goto L48
            boolean r5 = r4 instanceof java.lang.reflect.Method
            if (r5 != 0) goto L10
            goto L48
        L10:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r5 = r4.getName()
            int r0 = r6.length
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L24
            r0 = r6[r2]
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L24
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L29
        L24:
            int r0 = r6.length
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r6, r2, r0)
        L29:
            boolean r1 = bsh.Reflect.isStatic(r4)
            if (r1 == 0) goto L3c
            java.lang.Class r4 = r4.getDeclaringClass()
            r3.canInvokeStaticMethod(r4, r5, r0)     // Catch: bsh.security.SecurityError -> L37
            return
        L37:
            bsh.security.SecurityError r4 = bsh.security.SecurityError.reflectCantInvokeStaticMethod(r4, r5, r0)
            throw r4
        L3c:
            r4 = 0
            r4 = r6[r4]
            r3.canInvokeMethod(r4, r5, r0)     // Catch: bsh.security.SecurityError -> L43
            return
        L43:
            bsh.security.SecurityError r4 = bsh.security.SecurityError.reflectCantInvokeMethod(r4, r5, r0)
            throw r4
        L48:
            return
    }

    private final void canInvokeMethodImplToReflectionCanSetField(java.lang.Object r3, java.lang.String r4, java.lang.Object[] r5) {
            r2 = this;
            java.lang.String r0 = "set"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L39
            int r4 = r5.length
            r0 = 2
            if (r4 != r0) goto L39
            boolean r4 = r3 instanceof java.lang.reflect.Field
            if (r4 != 0) goto L11
            goto L39
        L11:
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r4 = r3.getName()
            r0 = 1
            r0 = r5[r0]
            boolean r1 = bsh.Reflect.isStatic(r3)
            if (r1 == 0) goto L2d
            java.lang.Class r3 = r3.getDeclaringClass()
            r2.canSetStaticField(r3, r4, r0)     // Catch: bsh.security.SecurityError -> L28
            return
        L28:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.reflectCantSetStaticField(r3, r4, r0)
            throw r3
        L2d:
            r3 = 0
            r3 = r5[r3]
            r2.canSetField(r3, r4, r0)     // Catch: bsh.security.SecurityError -> L34
            return
        L34:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.reflectCantSetField(r3, r4, r0)
            throw r3
        L39:
            return
    }

    private void canInvokeStaticMethodImpl(java.lang.Class<?> r3, java.lang.String r4, java.lang.Object[] r5) {
            r2 = this;
            java.util.Set<bsh.security.SecurityGuard> r0 = r2.securityGuards
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            bsh.security.SecurityGuard r1 = (bsh.security.SecurityGuard) r1
            boolean r1 = r1.canInvokeStaticMethod(r3, r4, r5)
            if (r1 == 0) goto L19
            goto L6
        L19:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.cantInvokeStaticMethod(r3, r4, r5)
            throw r3
        L1e:
            return
    }

    private void canInvokeStaticMethodImplToReflectionCanGetArrayLength(java.lang.Class<?> r3, java.lang.String r4, java.lang.Object[] r5) {
            r2 = this;
            java.lang.String r0 = "length"
            java.lang.String r1 = "getLength"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L23
            int r4 = r5.length
            r1 = 1
            if (r4 != r1) goto L23
            java.lang.Class<java.lang.reflect.Array> r4 = java.lang.reflect.Array.class
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 != 0) goto L17
            goto L23
        L17:
            r3 = 0
            r3 = r5[r3]
            r2.canGetField(r3, r0)     // Catch: bsh.security.SecurityError -> L1e
            return
        L1e:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.reflectCantGetField(r3, r0)
            throw r3
        L23:
            return
    }

    public void add(bsh.security.SecurityGuard r2) {
            r1 = this;
            java.util.Set<bsh.security.SecurityGuard> r0 = r1.securityGuards
            r0.add(r2)
            return
    }

    public void canConstruct(java.lang.Class<?> r3, java.lang.Object[] r4) {
            r2 = this;
            java.lang.Object[] r4 = bsh.Primitive.unwrap(r4)
            java.util.Set<bsh.security.SecurityGuard> r0 = r2.securityGuards
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            bsh.security.SecurityGuard r1 = (bsh.security.SecurityGuard) r1
            boolean r1 = r1.canConstruct(r3, r4)
            if (r1 == 0) goto L1d
            goto La
        L1d:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.cantConstruct(r3, r4)
            throw r3
        L22:
            return
    }

    public void canExtends(java.lang.Class<?> r3) {
            r2 = this;
            java.util.Set<bsh.security.SecurityGuard> r0 = r2.securityGuards
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            bsh.security.SecurityGuard r1 = (bsh.security.SecurityGuard) r1
            boolean r1 = r1.canExtends(r3)
            if (r1 == 0) goto L19
            goto L6
        L19:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.cantExtends(r3)
            throw r3
        L1e:
            return
    }

    public void canGetField(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            java.util.Set<bsh.security.SecurityGuard> r0 = r2.securityGuards
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            bsh.security.SecurityGuard r1 = (bsh.security.SecurityGuard) r1
            boolean r1 = r1.canGetField(r3, r4)
            if (r1 == 0) goto L19
            goto L6
        L19:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.cantGetField(r3, r4)
            throw r3
        L1e:
            return
    }

    public void canGetStaticField(java.lang.Class<?> r3, java.lang.String r4) {
            r2 = this;
            java.util.Set<bsh.security.SecurityGuard> r0 = r2.securityGuards
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            bsh.security.SecurityGuard r1 = (bsh.security.SecurityGuard) r1
            boolean r1 = r1.canGetStaticField(r3, r4)
            if (r1 == 0) goto L19
            goto L6
        L19:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.cantGetStaticField(r3, r4)
            throw r3
        L1e:
            return
    }

    public void canImplements(java.lang.Class<?> r3) {
            r2 = this;
            java.util.Set<bsh.security.SecurityGuard> r0 = r2.securityGuards
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            bsh.security.SecurityGuard r1 = (bsh.security.SecurityGuard) r1
            boolean r1 = r1.canImplements(r3)
            if (r1 == 0) goto L19
            goto L6
        L19:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.cantImplements(r3)
            throw r3
        L1e:
            return
    }

    public void canInvokeLocalMethod(java.lang.String r3, java.lang.Object[] r4) {
            r2 = this;
            java.lang.Object[] r4 = bsh.Primitive.unwrap(r4)
            java.util.Set<bsh.security.SecurityGuard> r0 = r2.securityGuards
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            bsh.security.SecurityGuard r1 = (bsh.security.SecurityGuard) r1
            boolean r1 = r1.canInvokeLocalMethod(r3, r4)
            if (r1 == 0) goto L1d
            goto La
        L1d:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.cantInvokeLocalMethod(r3, r4)
            throw r3
        L22:
            return
    }

    public void canInvokeMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object[] r3) {
            r0 = this;
            java.lang.Object[] r3 = bsh.Primitive.unwrap(r3)
            r0.canInvokeMethodImpl(r1, r2, r3)
            r0.canInvokeMethodImplToReflectionCanSetField(r1, r2, r3)
            r0.canInvokeMethodImplToReflectionCanGetField(r1, r2, r3)
            r0.canInvokeMethodImplToReflectionCanConstruct(r1, r2, r3)
            r0.canInvokeMethodImplToReflectionCanInvokeMethod(r1, r2, r3)
            return
    }

    public void canInvokeStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object[] r3) {
            r0 = this;
            java.lang.Object[] r3 = bsh.Primitive.unwrap(r3)
            r0.canInvokeStaticMethodImpl(r1, r2, r3)
            r0.canInvokeStaticMethodImplToReflectionCanGetArrayLength(r1, r2, r3)
            return
    }

    public void canSetField(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            java.lang.Object r5 = bsh.Primitive.unwrap(r5)
            java.util.Set<bsh.security.SecurityGuard> r0 = r2.securityGuards
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            bsh.security.SecurityGuard r1 = (bsh.security.SecurityGuard) r1
            boolean r1 = r1.canSetField(r3, r4, r5)
            if (r1 == 0) goto L1d
            goto La
        L1d:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.cantSetField(r3, r4, r5)
            throw r3
        L22:
            return
    }

    public void canSetStaticField(java.lang.Class<?> r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            java.lang.Object r5 = bsh.Primitive.unwrap(r5)
            java.util.Set<bsh.security.SecurityGuard> r0 = r2.securityGuards
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            bsh.security.SecurityGuard r1 = (bsh.security.SecurityGuard) r1
            boolean r1 = r1.canSetStaticField(r3, r4, r5)
            if (r1 == 0) goto L1d
            goto La
        L1d:
            bsh.security.SecurityError r3 = bsh.security.SecurityError.cantSetStaticField(r3, r4, r5)
            throw r3
        L22:
            return
    }

    public void remove(bsh.security.SecurityGuard r2) {
            r1 = this;
            java.util.Set<bsh.security.SecurityGuard> r0 = r1.securityGuards
            r0.remove(r2)
            return
    }
}
