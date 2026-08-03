package net.bytebuddy.dynamic.loading;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassFilePostProcessor {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForClassFileTransformer implements net.bytebuddy.dynamic.loading.ClassFilePostProcessor {
        protected static final java.security.ProtectionDomain ALL_PRIVILEGES = null;

        @net.bytebuddy.utility.nullability.AlwaysNull
        private static final java.lang.Class<?> UNLOADED_TYPE = null;
        private final java.lang.instrument.ClassFileTransformer classFileTransformer;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class AllPermissionsCollection extends java.security.PermissionCollection {
            private static final long serialVersionUID = 1;

            public AllPermissionsCollection() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.security.PermissionCollection
            public void add(java.security.Permission r2) {
                    r1 = this;
                    java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                    java.lang.String r0 = "add"
                    r2.<init>(r0)
                    throw r2
            }

            @Override // java.security.PermissionCollection
            public java.util.Enumeration<java.security.Permission> elements() {
                    r1 = this;
                    java.security.AllPermission r0 = new java.security.AllPermission
                    r0.<init>()
                    java.util.Set r0 = java.util.Collections.singleton(r0)
                    java.util.Enumeration r0 = java.util.Collections.enumeration(r0)
                    return r0
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r4 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r3.getClass()
                    java.lang.Class r4 = r4.getClass()
                    if (r2 == r4) goto L13
                    return r1
                L13:
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    java.lang.Class r0 = r1.getClass()
                    int r0 = r0.hashCode()
                    return r0
            }

            @Override // java.security.PermissionCollection
            public boolean implies(java.security.Permission r1) {
                    r0 = this;
                    r1 = 1
                    return r1
            }
        }

        static {
                java.security.ProtectionDomain r0 = new java.security.ProtectionDomain
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor$ForClassFileTransformer$AllPermissionsCollection r1 = new net.bytebuddy.dynamic.loading.ClassFilePostProcessor$ForClassFileTransformer$AllPermissionsCollection
                r1.<init>()
                r2 = 0
                r0.<init>(r2, r1)
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor.ForClassFileTransformer.ALL_PRIVILEGES = r0
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor.ForClassFileTransformer.UNLOADED_TYPE = r2
                return
        }

        public ForClassFileTransformer(java.lang.instrument.ClassFileTransformer r1) {
                r0 = this;
                r0.<init>()
                r0.classFileTransformer = r1
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
                java.lang.instrument.ClassFileTransformer r2 = r4.classFileTransformer
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor$ForClassFileTransformer r5 = (net.bytebuddy.dynamic.loading.ClassFilePostProcessor.ForClassFileTransformer) r5
                java.lang.instrument.ClassFileTransformer r5 = r5.classFileTransformer
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
                java.lang.instrument.ClassFileTransformer r1 = r2.classFileTransformer
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassFilePostProcessor
        public byte[] transform(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r7, java.lang.String r8, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r9, byte[] r10) {
                r6 = this;
                java.lang.instrument.ClassFileTransformer r0 = r6.classFileTransformer     // Catch: java.lang.instrument.IllegalClassFormatException -> L12
                r1 = 46
                r2 = 47
                java.lang.String r2 = r8.replace(r1, r2)     // Catch: java.lang.instrument.IllegalClassFormatException -> L12
                java.lang.Class<?> r3 = net.bytebuddy.dynamic.loading.ClassFilePostProcessor.ForClassFileTransformer.UNLOADED_TYPE     // Catch: java.lang.instrument.IllegalClassFormatException -> L12
                if (r9 != 0) goto L10
                java.security.ProtectionDomain r9 = net.bytebuddy.dynamic.loading.ClassFilePostProcessor.ForClassFileTransformer.ALL_PRIVILEGES     // Catch: java.lang.instrument.IllegalClassFormatException -> L12
            L10:
                r4 = r9
                goto L14
            L12:
                r7 = move-exception
                goto L1f
            L14:
                r1 = r7
                r5 = r10
                byte[] r7 = r0.transform(r1, r2, r3, r4, r5)     // Catch: java.lang.instrument.IllegalClassFormatException -> L12
                if (r7 != 0) goto L1d
                goto L1e
            L1d:
                r10 = r7
            L1e:
                return r10
            L1f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "Failed to transform "
                r10.append(r0)
                r10.append(r8)
                java.lang.String r8 = r10.toString()
                r9.<init>(r8, r7)
                throw r9
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp> implements net.bytebuddy.dynamic.loading.ClassFilePostProcessor {
        private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp[] $VALUES = null;
        public static final net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp INSTANCE = null;

        static {
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor$NoOp r0 = new net.bytebuddy.dynamic.loading.ClassFilePostProcessor$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp.INSTANCE = r0
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor$NoOp[] r0 = new net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp[]{r0}
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassFilePostProcessor$NoOp> r0 = net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor$NoOp r1 = (net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp) r1
                return r1
        }

        public static net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp[] values() {
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor$NoOp[] r0 = net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor$NoOp[] r0 = (net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassFilePostProcessor
        public byte[] transform(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r3, byte[] r4) {
                r0 = this;
                return r4
        }
    }

    byte[] transform(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r3, byte[] r4);
}
