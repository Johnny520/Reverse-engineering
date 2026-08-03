package net.bytebuddy.dynamic.loading;

/* JADX INFO: loaded from: classes2.dex */
public class MultipleParentClassLoader extends net.bytebuddy.dynamic.loading.InjectionClassLoader {
    private final java.util.List<? extends java.lang.ClassLoader> parents;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Builder {
        private final java.util.List<? extends java.lang.ClassLoader> classLoaders;
        private final boolean sealed;

        public Builder() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        private Builder(java.util.List<? extends java.lang.ClassLoader> r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.classLoaders = r1
                r0.sealed = r2
                return
        }

        public Builder(boolean r2) {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r1.<init>(r0, r2)
                return
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
        private java.lang.ClassLoader doBuild(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4) {
                r3 = this;
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader r0 = new net.bytebuddy.dynamic.loading.MultipleParentClassLoader
                java.util.List<? extends java.lang.ClassLoader> r1 = r3.classLoaders
                boolean r2 = r3.sealed
                r0.<init>(r4, r1, r2)
                return r0
        }

        public net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder append(java.util.Collection<? extends java.lang.Class<?>> r3) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r3 = r3.iterator()
            Ld:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L21
                java.lang.Object r1 = r3.next()
                java.lang.Class r1 = (java.lang.Class) r1
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r0.add(r1)
                goto Ld
            L21:
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r3 = r2.append(r0)
                return r3
        }

        public net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder append(java.util.List<? extends java.lang.ClassLoader> r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<? extends java.lang.ClassLoader> r1 = r4.classLoaders
                int r1 = r1.size()
                int r2 = r5.size()
                int r1 = r1 + r2
                r0.<init>(r1)
                java.util.List<? extends java.lang.ClassLoader> r1 = r4.classLoaders
                r0.addAll(r1)
                java.util.HashSet r1 = new java.util.HashSet
                java.util.List<? extends java.lang.ClassLoader> r2 = r4.classLoaders
                r1.<init>(r2)
                java.util.Iterator r5 = r5.iterator()
            L20:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L38
                java.lang.Object r2 = r5.next()
                java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
                if (r2 == 0) goto L20
                boolean r3 = r1.add(r2)
                if (r3 == 0) goto L20
                r0.add(r2)
                goto L20
            L38:
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r5 = new net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder
                boolean r1 = r4.sealed
                r5.<init>(r0, r1)
                return r5
        }

        public net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder append(java.lang.Class<?>... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r1 = r0.append(r1)
                return r1
        }

        public net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder append(java.lang.ClassLoader... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r1 = r0.append(r1)
                return r1
        }

        public net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder appendMostSpecific(java.util.Collection<? extends java.lang.Class<?>> r3) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r3 = r3.iterator()
            Ld:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L21
                java.lang.Object r1 = r3.next()
                java.lang.Class r1 = (java.lang.Class) r1
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r0.add(r1)
                goto Ld
            L21:
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r3 = r2.appendMostSpecific(r0)
                return r3
        }

        public net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder appendMostSpecific(java.util.List<? extends java.lang.ClassLoader> r6) {
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<? extends java.lang.ClassLoader> r1 = r5.classLoaders
                int r1 = r1.size()
                int r2 = r6.size()
                int r1 = r1 + r2
                r0.<init>(r1)
                java.util.List<? extends java.lang.ClassLoader> r1 = r5.classLoaders
                r0.addAll(r1)
                java.util.Iterator r6 = r6.iterator()
            L19:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L6b
                java.lang.Object r1 = r6.next()
                java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
                if (r1 != 0) goto L28
                goto L19
            L28:
                r2 = r1
            L29:
                java.util.Iterator r3 = r0.iterator()
            L2d:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L43
                java.lang.Object r4 = r3.next()
                java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4
                boolean r4 = r4.equals(r2)
                if (r4 == 0) goto L2d
                r3.remove()
                goto L2d
            L43:
                java.lang.ClassLoader r2 = r2.getParent()
                if (r2 != 0) goto L29
                java.util.Iterator r2 = r0.iterator()
            L4d:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L67
                java.lang.Object r3 = r2.next()
                java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            L59:
                boolean r4 = r3.equals(r1)
                if (r4 == 0) goto L60
                goto L19
            L60:
                java.lang.ClassLoader r3 = r3.getParent()
                if (r3 != 0) goto L59
                goto L4d
            L67:
                r0.add(r1)
                goto L19
            L6b:
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r6 = new net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder
                boolean r1 = r5.sealed
                r6.<init>(r0, r1)
                return r6
        }

        public net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder appendMostSpecific(java.lang.Class<?>... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r1 = r0.appendMostSpecific(r1)
                return r1
        }

        public net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder appendMostSpecific(java.lang.ClassLoader... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r1 = r0.appendMostSpecific(r1)
                return r1
        }

        public java.lang.ClassLoader build() {
                r2 = this;
                java.util.List<? extends java.lang.ClassLoader> r0 = r2.classLoaders
                int r0 = r0.size()
                r1 = 1
                if (r0 != r1) goto L13
                java.util.List<? extends java.lang.ClassLoader> r0 = r2.classLoaders
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
                goto L19
            L13:
                java.lang.ClassLoader r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                java.lang.ClassLoader r0 = r2.doBuild(r0)
            L19:
                return r0
        }

        public java.lang.ClassLoader build(java.lang.ClassLoader r3) {
                r2 = this;
                java.util.List<? extends java.lang.ClassLoader> r0 = r2.classLoaders
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L2a
                java.util.List<? extends java.lang.ClassLoader> r0 = r2.classLoaders
                int r0 = r0.size()
                r1 = 1
                if (r0 != r1) goto L1a
                java.util.List<? extends java.lang.ClassLoader> r0 = r2.classLoaders
                boolean r0 = r0.contains(r3)
                if (r0 == 0) goto L1a
                goto L2a
            L1a:
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.is(r3)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.not(r0)
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r0 = r2.filter(r0)
                java.lang.ClassLoader r3 = r0.doBuild(r3)
            L2a:
                return r3
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
                boolean r2 = r4.sealed
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r5 = (net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder) r5
                boolean r3 = r5.sealed
                if (r2 == r3) goto L1c
                return r1
            L1c:
                java.util.List<? extends java.lang.ClassLoader> r2 = r4.classLoaders
                java.util.List<? extends java.lang.ClassLoader> r5 = r5.classLoaders
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        public net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder filter(net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<? extends java.lang.ClassLoader> r1 = r4.classLoaders
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.List<? extends java.lang.ClassLoader> r1 = r4.classLoaders
                java.util.Iterator r1 = r1.iterator()
            L11:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L27
                java.lang.Object r2 = r1.next()
                java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
                boolean r3 = r5.matches(r2)
                if (r3 == 0) goto L11
                r0.add(r2)
                goto L11
            L27:
                net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder r5 = new net.bytebuddy.dynamic.loading.MultipleParentClassLoader$Builder
                boolean r1 = r4.sealed
                r5.<init>(r0, r1)
                return r5
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                boolean r1 = r2.sealed
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends java.lang.ClassLoader> r1 = r2.classLoaders
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public static class CompoundEnumeration implements java.util.Enumeration<java.net.URL> {
        private static final int FIRST = 0;

        @net.bytebuddy.utility.nullability.UnknownNull
        private java.util.Enumeration<java.net.URL> current;
        private final java.util.List<java.util.Enumeration<java.net.URL>> enumerations;

        public CompoundEnumeration(java.util.List<java.util.Enumeration<java.net.URL>> r1) {
                r0 = this;
                r0.<init>()
                r0.enumerations = r1
                return
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
                r2 = this;
                java.util.Enumeration<java.net.URL> r0 = r2.current
                if (r0 == 0) goto Lc
                boolean r0 = r0.hasMoreElements()
                if (r0 == 0) goto Lc
                r0 = 1
                return r0
            Lc:
                java.util.List<java.util.Enumeration<java.net.URL>> r0 = r2.enumerations
                boolean r0 = r0.isEmpty()
                r1 = 0
                if (r0 != 0) goto L24
                java.util.List<java.util.Enumeration<java.net.URL>> r0 = r2.enumerations
                java.lang.Object r0 = r0.remove(r1)
                java.util.Enumeration r0 = (java.util.Enumeration) r0
                r2.current = r0
                boolean r0 = r2.hasMoreElements()
                return r0
            L24:
                return r1
        }

        @Override // java.util.Enumeration
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Null reference is avoided by element check.", value = {"UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR"})
        public /* bridge */ /* synthetic */ java.net.URL nextElement() {
                r1 = this;
                java.net.URL r0 = r1.nextElement2()
                return r0
        }

        @Override // java.util.Enumeration
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Null reference is avoided by element check.", value = {"UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR"})
        /* JADX INFO: renamed from: nextElement, reason: avoid collision after fix types in other method */
        public java.net.URL nextElement2() {
                r1 = this;
                boolean r0 = r1.hasMoreElements()
                if (r0 == 0) goto Lf
                java.util.Enumeration<java.net.URL> r0 = r1.current
                java.lang.Object r0 = r0.nextElement()
                java.net.URL r0 = (java.net.URL) r0
                return r0
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    static {
            doRegisterAsParallelCapable()
            return
    }

    public MultipleParentClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, java.util.List<? extends java.lang.ClassLoader> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public MultipleParentClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.util.List<? extends java.lang.ClassLoader> r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.parents = r2
            return
    }

    public MultipleParentClassLoader(java.util.List<? extends java.lang.ClassLoader> r2) {
            r1 = this;
            java.lang.ClassLoader r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
            r1.<init>(r0, r2)
            return
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Must be invoked from targeting class loader type.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
    private static void doRegisterAsParallelCapable() {
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            java.lang.String r1 = "registerAsParallelCapable"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L10
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L10
            r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    @Override // net.bytebuddy.dynamic.loading.InjectionClassLoader
    public java.util.Map<java.lang.String, java.lang.Class<?>> doDefineClasses(java.util.Map<java.lang.String, byte[]> r7) {
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Ld:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.getValue()
            byte[] r4 = (byte[]) r4
            java.lang.Object r1 = r1.getValue()
            byte[] r1 = (byte[]) r1
            int r1 = r1.length
            r5 = 0
            java.lang.Class r1 = r6.defineClass(r3, r4, r5, r1)
            r0.put(r2, r1)
            goto Ld
        L39:
            return r0
    }

    @Override // java.lang.ClassLoader
    public java.net.URL getResource(java.lang.String r3) {
            r2 = this;
            java.util.List<? extends java.lang.ClassLoader> r0 = r2.parents
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            java.net.URL r1 = r1.getResource(r3)
            if (r1 == 0) goto L6
            return r1
        L19:
            java.net.URL r3 = super.getResource(r3)
            return r3
    }

    @Override // java.lang.ClassLoader
    public java.util.Enumeration<java.net.URL> getResources(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<? extends java.lang.ClassLoader> r1 = r3.parents
            int r1 = r1.size()
            int r1 = r1 + 1
            r0.<init>(r1)
            java.util.List<? extends java.lang.ClassLoader> r1 = r3.parents
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
            java.util.Enumeration r2 = r2.getResources(r4)
            r0.add(r2)
            goto L13
        L27:
            java.util.Enumeration r4 = super.getResources(r4)
            r0.add(r4)
            net.bytebuddy.dynamic.loading.MultipleParentClassLoader$CompoundEnumeration r4 = new net.bytebuddy.dynamic.loading.MultipleParentClassLoader$CompoundEnumeration
            r4.<init>(r0)
            return r4
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class<?> loadClass(java.lang.String r3, boolean r4) throws java.lang.ClassNotFoundException {
            r2 = this;
            java.util.List<? extends java.lang.ClassLoader> r0 = r2.parents
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            java.lang.Class r1 = r1.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L6
            if (r4 == 0) goto L1b
            r2.resolveClass(r1)     // Catch: java.lang.ClassNotFoundException -> L6
        L1b:
            return r1
        L1c:
            java.lang.Class r3 = super.loadClass(r3, r4)
            return r3
    }
}
