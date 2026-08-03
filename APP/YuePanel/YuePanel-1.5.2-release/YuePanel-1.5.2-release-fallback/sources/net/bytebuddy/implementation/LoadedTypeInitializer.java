package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
public interface LoadedTypeInitializer {

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Serialization is considered opt-in for a rare use case", value = {"SE_BAD_FIELD"})
    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements net.bytebuddy.implementation.LoadedTypeInitializer, java.io.Serializable {
        private static final long serialVersionUID = 1;
        private final java.util.List<net.bytebuddy.implementation.LoadedTypeInitializer> loadedTypeInitializers;

        public Compound(java.util.List<? extends net.bytebuddy.implementation.LoadedTypeInitializer> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.loadedTypeInitializers = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r3.next()
                net.bytebuddy.implementation.LoadedTypeInitializer r0 = (net.bytebuddy.implementation.LoadedTypeInitializer) r0
                boolean r1 = r0 instanceof net.bytebuddy.implementation.LoadedTypeInitializer.Compound
                if (r1 == 0) goto L28
                java.util.List<net.bytebuddy.implementation.LoadedTypeInitializer> r1 = r2.loadedTypeInitializers
                net.bytebuddy.implementation.LoadedTypeInitializer$Compound r0 = (net.bytebuddy.implementation.LoadedTypeInitializer.Compound) r0
                java.util.List<net.bytebuddy.implementation.LoadedTypeInitializer> r0 = r0.loadedTypeInitializers
                r1.addAll(r0)
                goto Le
            L28:
                boolean r1 = r0 instanceof net.bytebuddy.implementation.LoadedTypeInitializer.NoOp
                if (r1 != 0) goto Le
                java.util.List<net.bytebuddy.implementation.LoadedTypeInitializer> r1 = r2.loadedTypeInitializers
                r1.add(r0)
                goto Le
            L32:
                return
        }

        public Compound(net.bytebuddy.implementation.LoadedTypeInitializer... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                java.util.List<net.bytebuddy.implementation.LoadedTypeInitializer> r2 = r4.loadedTypeInitializers
                net.bytebuddy.implementation.LoadedTypeInitializer$Compound r5 = (net.bytebuddy.implementation.LoadedTypeInitializer.Compound) r5
                java.util.List<net.bytebuddy.implementation.LoadedTypeInitializer> r5 = r5.loadedTypeInitializers
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.implementation.LoadedTypeInitializer> r1 = r2.loadedTypeInitializers
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        public boolean isAlive() {
                r2 = this;
                java.util.List<net.bytebuddy.implementation.LoadedTypeInitializer> r0 = r2.loadedTypeInitializers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                net.bytebuddy.implementation.LoadedTypeInitializer r1 = (net.bytebuddy.implementation.LoadedTypeInitializer) r1
                boolean r1 = r1.isAlive()
                if (r1 == 0) goto L6
                r0 = 1
                return r0
            L1a:
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        public void onLoad(java.lang.Class<?> r3) {
                r2 = this;
                java.util.List<net.bytebuddy.implementation.LoadedTypeInitializer> r0 = r2.loadedTypeInitializers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                net.bytebuddy.implementation.LoadedTypeInitializer r1 = (net.bytebuddy.implementation.LoadedTypeInitializer) r1
                r1.onLoad(r3)
                goto L6
            L16:
                return
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForStaticField implements net.bytebuddy.implementation.LoadedTypeInitializer, java.io.Serializable {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final long serialVersionUID = 1;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
        private final transient java.lang.Object accessControlContext;
        private final java.lang.String fieldName;
        private final java.lang.Object value;

        static {
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.implementation.LoadedTypeInitializer.ForStaticField.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.implementation.LoadedTypeInitializer.ForStaticField.ACCESS_CONTROLLER = r0
            L19:
                return
        }

        public ForStaticField(java.lang.String r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                r0.fieldName = r1
                r0.value = r2
                java.lang.Object r1 = getContext()
                r0.accessControlContext = r1
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                boolean r0 = net.bytebuddy.implementation.LoadedTypeInitializer.ForStaticField.ACCESS_CONTROLLER
                if (r0 == 0) goto Lb
                java.security.AccessControlContext r2 = (java.security.AccessControlContext) r2
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1, r2)
                return r1
            Lb:
                java.lang.Object r1 = r1.run()
                return r1
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static java.lang.Object getContext() {
                boolean r0 = net.bytebuddy.implementation.LoadedTypeInitializer.ForStaticField.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.security.AccessControlContext r0 = java.security.AccessController.getContext()
                return r0
            L9:
                r0 = 0
                return r0
        }

        private java.lang.Object readResolve() {
                r3 = this;
                net.bytebuddy.implementation.LoadedTypeInitializer$ForStaticField r0 = new net.bytebuddy.implementation.LoadedTypeInitializer$ForStaticField
                java.lang.String r1 = r3.fieldName
                java.lang.Object r2 = r3.value
                r0.<init>(r1, r2)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                java.lang.String r2 = r4.fieldName
                net.bytebuddy.implementation.LoadedTypeInitializer$ForStaticField r5 = (net.bytebuddy.implementation.LoadedTypeInitializer.ForStaticField) r5
                java.lang.String r3 = r5.fieldName
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.lang.Object r2 = r4.value
                java.lang.Object r5 = r5.value
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2b
                return r1
            L2b:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.fieldName
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Object r1 = r2.value
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        public boolean isAlive() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Modules are assumed available when module system is supported", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public void onLoad(java.lang.Class<?> r5) {
                r4 = this;
                java.lang.String r0 = r4.fieldName     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                java.lang.reflect.Field r0 = r5.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                int r1 = r0.getModifiers()     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                if (r1 == 0) goto L41
                java.lang.Class r1 = r0.getDeclaringClass()     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                int r1 = r1.getModifiers()     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                if (r1 == 0) goto L41
                boolean r1 = net.bytebuddy.utility.JavaModule.isSupported()     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                if (r1 == 0) goto L4b
                net.bytebuddy.utility.JavaModule r1 = net.bytebuddy.utility.JavaModule.ofType(r5)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r5)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                net.bytebuddy.description.type.PackageDescription r2 = r2.getPackage()     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                java.lang.Class<net.bytebuddy.implementation.LoadedTypeInitializer$ForStaticField> r3 = net.bytebuddy.implementation.LoadedTypeInitializer.ForStaticField.class
                net.bytebuddy.utility.JavaModule r3 = net.bytebuddy.utility.JavaModule.ofType(r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                boolean r1 = r1.isExported(r2, r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                if (r1 != 0) goto L4b
                goto L41
            L3d:
                r0 = move-exception
                goto L52
            L3f:
                r0 = move-exception
                goto L73
            L41:
                net.bytebuddy.utility.privilege.SetAccessibleAction r1 = new net.bytebuddy.utility.privilege.SetAccessibleAction     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                r1.<init>(r0)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                java.lang.Object r2 = r4.accessControlContext     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                doPrivileged(r1, r2)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
            L4b:
                java.lang.Object r1 = r4.value     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                r2 = 0
                r0.set(r2, r1)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.IllegalAccessException -> L3f
                return
            L52:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "There is no field "
                r2.append(r3)
                java.lang.String r3 = r4.fieldName
                r2.append(r3)
                java.lang.String r3 = " defined on "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5, r0)
                throw r1
            L73:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot access "
                r2.append(r3)
                java.lang.String r3 = r4.fieldName
                r2.append(r3)
                java.lang.String r3 = " from "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5, r0)
                throw r1
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.implementation.LoadedTypeInitializer.NoOp> implements net.bytebuddy.implementation.LoadedTypeInitializer {
        private static final /* synthetic */ net.bytebuddy.implementation.LoadedTypeInitializer.NoOp[] $VALUES = null;
        public static final net.bytebuddy.implementation.LoadedTypeInitializer.NoOp INSTANCE = null;

        static {
                net.bytebuddy.implementation.LoadedTypeInitializer$NoOp r0 = new net.bytebuddy.implementation.LoadedTypeInitializer$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.LoadedTypeInitializer.NoOp.INSTANCE = r0
                net.bytebuddy.implementation.LoadedTypeInitializer$NoOp[] r0 = new net.bytebuddy.implementation.LoadedTypeInitializer.NoOp[]{r0}
                net.bytebuddy.implementation.LoadedTypeInitializer.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.LoadedTypeInitializer.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.LoadedTypeInitializer$NoOp> r0 = net.bytebuddy.implementation.LoadedTypeInitializer.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.LoadedTypeInitializer$NoOp r1 = (net.bytebuddy.implementation.LoadedTypeInitializer.NoOp) r1
                return r1
        }

        public static net.bytebuddy.implementation.LoadedTypeInitializer.NoOp[] values() {
                net.bytebuddy.implementation.LoadedTypeInitializer$NoOp[] r0 = net.bytebuddy.implementation.LoadedTypeInitializer.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.LoadedTypeInitializer$NoOp[] r0 = (net.bytebuddy.implementation.LoadedTypeInitializer.NoOp[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        public boolean isAlive() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        public void onLoad(java.lang.Class<?> r1) {
                r0 = this;
                return
        }
    }

    boolean isAlive();

    void onLoad(java.lang.Class<?> r1);
}
