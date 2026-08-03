package net.bytebuddy.description.method;

import net.bytebuddy.description.method.ParameterDescription;

/* JADX INFO: loaded from: classes2.dex */
public interface ParameterList<T extends net.bytebuddy.description.method.ParameterDescription> extends net.bytebuddy.matcher.FilterableList<T, net.bytebuddy.description.method.ParameterList<T>> {

    public static abstract class AbstractBase<S extends net.bytebuddy.description.method.ParameterDescription> extends net.bytebuddy.matcher.FilterableList.AbstractBase<S, net.bytebuddy.description.method.ParameterList<S>> implements net.bytebuddy.description.method.ParameterList<S> {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.method.ParameterList
        public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> asDefined() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.method.ParameterDescription r2 = (net.bytebuddy.description.method.ParameterDescription) r2
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.method.ParameterList$Explicit r1 = new net.bytebuddy.description.method.ParameterList$Explicit
                r1.<init>(r0)
                return r1
        }

        @Override // net.bytebuddy.description.method.ParameterList
        public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.method.ParameterDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r4) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.method.ParameterDescription r2 = (net.bytebuddy.description.method.ParameterDescription) r2
                net.bytebuddy.description.ByteCodeElement$Token r2 = r2.asToken(r4)
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r4 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                r4.<init>(r0)
                return r4
        }

        @Override // net.bytebuddy.description.method.ParameterList
        public net.bytebuddy.description.type.TypeList.Generic asTypeList() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.method.ParameterDescription r2 = (net.bytebuddy.description.method.ParameterDescription) r2
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                r1.<init>(r0)
                return r1
        }

        @Override // net.bytebuddy.description.method.ParameterList
        public boolean hasExplicitMetaData() {
                r3 = this;
                java.util.Iterator r0 = r3.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.method.ParameterDescription r1 = (net.bytebuddy.description.method.ParameterDescription) r1
                boolean r2 = r1.isNamed()
                if (r2 == 0) goto L1c
                boolean r1 = r1.hasModifiers()
                if (r1 != 0) goto L4
            L1c:
                r0 = 0
                return r0
            L1e:
                r0 = 1
                return r0
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public net.bytebuddy.description.method.ParameterList<S> wrap(java.util.List<S> r2) {
                r1 = this;
                net.bytebuddy.description.method.ParameterList$Explicit r0 = new net.bytebuddy.description.method.ParameterList$Explicit
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public /* bridge */ /* synthetic */ net.bytebuddy.matcher.FilterableList wrap(java.util.List r1) {
                r0 = this;
                net.bytebuddy.description.method.ParameterList r1 = r0.wrap(r1)
                return r1
        }
    }

    public static class Empty<S extends net.bytebuddy.description.method.ParameterDescription> extends net.bytebuddy.matcher.FilterableList.Empty<S, net.bytebuddy.description.method.ParameterList<S>> implements net.bytebuddy.description.method.ParameterList<S> {
        public Empty() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.method.ParameterList
        public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> asDefined() {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterList
        public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.method.ParameterDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2) {
                r1 = this;
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r2 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                r0 = 0
                net.bytebuddy.description.method.ParameterDescription$Token[] r0 = new net.bytebuddy.description.method.ParameterDescription.Token[r0]
                r2.<init>(r0)
                return r2
        }

        @Override // net.bytebuddy.description.method.ParameterList
        public net.bytebuddy.description.type.TypeList.Generic asTypeList() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterList
        public boolean hasExplicitMetaData() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public static class Explicit<S extends net.bytebuddy.description.method.ParameterDescription> extends net.bytebuddy.description.method.ParameterList.AbstractBase<S> {
        private final java.util.List<? extends S> parameterDescriptions;

        public static class ForTypes extends net.bytebuddy.description.method.ParameterList.AbstractBase<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> {
            private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
            private final java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> typeDefinitions;

            public ForTypes(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.methodDescription = r1
                    r0.typeDefinitions = r2
                    return
            }

            public ForTypes(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDefinition... r2) {
                    r0 = this;
                    java.util.List r2 = java.util.Arrays.asList(r2)
                    r0.<init>(r1, r2)
                    return
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.method.ParameterDescription$InDefinedShape r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.method.ParameterDescription.InDefinedShape get(int r5) {
                    r4 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r4.methodDescription
                    boolean r0 = r0.isStatic()
                    r0 = r0 ^ 1
                    r1 = 0
                L9:
                    if (r1 >= r5) goto L1f
                    java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r2 = r4.typeDefinitions
                    java.lang.Object r2 = r2.get(r1)
                    net.bytebuddy.description.type.TypeDefinition r2 = (net.bytebuddy.description.type.TypeDefinition) r2
                    net.bytebuddy.implementation.bytecode.StackSize r2 = r2.getStackSize()
                    int r2 = r2.getSize()
                    int r0 = r0 + r2
                    int r1 = r1 + 1
                    goto L9
                L1f:
                    net.bytebuddy.description.method.ParameterDescription$Latent r1 = new net.bytebuddy.description.method.ParameterDescription$Latent
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.methodDescription
                    java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r3 = r4.typeDefinitions
                    java.lang.Object r3 = r3.get(r5)
                    net.bytebuddy.description.type.TypeDefinition r3 = (net.bytebuddy.description.type.TypeDefinition) r3
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                    r1.<init>(r2, r3, r5, r0)
                    return r1
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r0 = r1.typeDefinitions
                    int r0 = r0.size()
                    return r0
            }
        }

        public Explicit(java.util.List<? extends S> r1) {
                r0 = this;
                r0.<init>()
                r0.parameterDescriptions = r1
                return
        }

        public Explicit(S... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.method.ParameterDescription r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public S get(int r2) {
                r1 = this;
                java.util.List<? extends S extends net.bytebuddy.description.method.ParameterDescription> r0 = r1.parameterDescriptions
                java.lang.Object r2 = r0.get(r2)
                net.bytebuddy.description.method.ParameterDescription r2 = (net.bytebuddy.description.method.ParameterDescription) r2
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends S extends net.bytebuddy.description.method.ParameterDescription> r0 = r1.parameterDescriptions
                int r0 = r0.size()
                return r0
        }
    }

    public static abstract class ForLoadedExecutable<T> extends net.bytebuddy.description.method.ParameterList.AbstractBase<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> {
        private static final boolean ACCESS_CONTROLLER = false;
        protected static final net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.Executable EXECUTABLE = null;
        protected final T executable;
        protected final net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource;

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.Executable")
        public interface Executable {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getParameterCount")
            int getParameterCount(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getParameters")
            java.lang.Object[] getParameters(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isInstance")
            boolean isInstance(java.lang.Object r1);
        }

        public static class OfConstructor extends net.bytebuddy.description.method.ParameterList.ForLoadedExecutable<java.lang.reflect.Constructor<?>> {
            public OfConstructor(java.lang.reflect.Constructor<?> r1, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.method.ParameterDescription$InDefinedShape r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.method.ParameterDescription.InDefinedShape get(int r4) {
                    r3 = this;
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$OfConstructor r0 = new net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$OfConstructor
                    T r1 = r3.executable
                    java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource r2 = r3.parameterAnnotationSource
                    r0.<init>(r1, r4, r2)
                    return r0
            }
        }

        public static class OfLegacyVmConstructor extends net.bytebuddy.description.method.ParameterList.AbstractBase<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> {
            private final java.lang.reflect.Constructor<?> constructor;
            private final net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource;
            private final java.lang.Class<?>[] parameterType;

            public OfLegacyVmConstructor(java.lang.reflect.Constructor<?> r1, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r2) {
                    r0 = this;
                    r0.<init>()
                    r0.constructor = r1
                    java.lang.Class[] r1 = r1.getParameterTypes()
                    r0.parameterType = r1
                    r0.parameterAnnotationSource = r2
                    return
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.method.ParameterDescription$InDefinedShape r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.method.ParameterDescription.InDefinedShape get(int r5) {
                    r4 = this;
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$OfLegacyVmConstructor r0 = new net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$OfLegacyVmConstructor
                    java.lang.reflect.Constructor<?> r1 = r4.constructor
                    java.lang.Class<?>[] r2 = r4.parameterType
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource r3 = r4.parameterAnnotationSource
                    r0.<init>(r1, r5, r2, r3)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.lang.Class<?>[] r0 = r1.parameterType
                    int r0 = r0.length
                    return r0
            }
        }

        public static class OfLegacyVmMethod extends net.bytebuddy.description.method.ParameterList.AbstractBase<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> {
            private final java.lang.reflect.Method method;
            private final net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource;
            private final java.lang.Class<?>[] parameterType;

            public OfLegacyVmMethod(java.lang.reflect.Method r1, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r2) {
                    r0 = this;
                    r0.<init>()
                    r0.method = r1
                    java.lang.Class[] r1 = r1.getParameterTypes()
                    r0.parameterType = r1
                    r0.parameterAnnotationSource = r2
                    return
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.method.ParameterDescription$InDefinedShape r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.method.ParameterDescription.InDefinedShape get(int r5) {
                    r4 = this;
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$OfLegacyVmMethod r0 = new net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$OfLegacyVmMethod
                    java.lang.reflect.Method r1 = r4.method
                    java.lang.Class<?>[] r2 = r4.parameterType
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource r3 = r4.parameterAnnotationSource
                    r0.<init>(r1, r5, r2, r3)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.lang.Class<?>[] r0 = r1.parameterType
                    int r0 = r0.length
                    return r0
            }
        }

        public static class OfMethod extends net.bytebuddy.description.method.ParameterList.ForLoadedExecutable<java.lang.reflect.Method> {
            public OfMethod(java.lang.reflect.Method r1, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.method.ParameterDescription$InDefinedShape r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.method.ParameterDescription.InDefinedShape get(int r4) {
                    r3 = this;
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$OfMethod r0 = new net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$OfMethod
                    T r1 = r3.executable
                    java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource r2 = r3.parameterAnnotationSource
                    r0.<init>(r1, r4, r2)
                    return r0
            }
        }

        static {
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.ACCESS_CONTROLLER = r0
            L19:
                java.lang.Class<net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Executable> r0 = net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.Executable.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Executable r0 = (net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.Executable) r0
                net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.EXECUTABLE = r0
                return
        }

        public ForLoadedExecutable(T r1, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r2) {
                r0 = this;
                r0.<init>()
                r0.executable = r1
                r0.parameterAnnotationSource = r2
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> of(java.lang.reflect.Constructor<?> r1) {
                net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource$ForLoadedConstructor r0 = new net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource$ForLoadedConstructor
                r0.<init>(r1)
                net.bytebuddy.description.method.ParameterList r1 = of(r1, r0)
                return r1
        }

        public static net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> of(java.lang.reflect.Constructor<?> r1, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r2) {
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Executable r0 = net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.EXECUTABLE
                boolean r0 = r0.isInstance(r1)
                if (r0 == 0) goto Le
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$OfConstructor r0 = new net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$OfConstructor
                r0.<init>(r1, r2)
                goto L13
            Le:
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$OfLegacyVmConstructor r0 = new net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$OfLegacyVmConstructor
                r0.<init>(r1, r2)
            L13:
                return r0
        }

        public static net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> of(java.lang.reflect.Method r1) {
                net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource$ForLoadedMethod r0 = new net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource$ForLoadedMethod
                r0.<init>(r1)
                net.bytebuddy.description.method.ParameterList r1 = of(r1, r0)
                return r1
        }

        public static net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> of(java.lang.reflect.Method r1, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r2) {
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Executable r0 = net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.EXECUTABLE
                boolean r0 = r0.isInstance(r1)
                if (r0 == 0) goto Le
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$OfMethod r0 = new net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$OfMethod
                r0.<init>(r1, r2)
                goto L13
            Le:
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$OfLegacyVmMethod r0 = new net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$OfLegacyVmMethod
                r0.<init>(r1, r2)
            L13:
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r2 = this;
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Executable r0 = net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.EXECUTABLE
                T r1 = r2.executable
                int r0 = r0.getParameterCount(r1)
                return r0
        }
    }

    public static class ForTokens extends net.bytebuddy.description.method.ParameterList.AbstractBase<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> {
        private final net.bytebuddy.description.method.MethodDescription.InDefinedShape declaringMethod;
        private final java.util.List<? extends net.bytebuddy.description.method.ParameterDescription.Token> tokens;

        public ForTokens(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.util.List<? extends net.bytebuddy.description.method.ParameterDescription.Token> r2) {
                r0 = this;
                r0.<init>()
                r0.declaringMethod = r1
                r0.tokens = r2
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.method.ParameterDescription$InDefinedShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.method.ParameterDescription.InDefinedShape get(int r5) {
                r4 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r4.declaringMethod
                boolean r0 = r0.isStatic()
                r0 = r0 ^ 1
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r1 = r4.tokens
                r2 = 0
                java.util.List r1 = r1.subList(r2, r5)
                java.util.Iterator r1 = r1.iterator()
            L13:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.method.ParameterDescription$Token r2 = (net.bytebuddy.description.method.ParameterDescription.Token) r2
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                net.bytebuddy.implementation.bytecode.StackSize r2 = r2.getStackSize()
                int r2 = r2.getSize()
                int r0 = r0 + r2
                goto L13
            L2d:
                net.bytebuddy.description.method.ParameterDescription$Latent r1 = new net.bytebuddy.description.method.ParameterDescription$Latent
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.declaringMethod
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r3 = r4.tokens
                java.lang.Object r3 = r3.get(r5)
                net.bytebuddy.description.method.ParameterDescription$Token r3 = (net.bytebuddy.description.method.ParameterDescription.Token) r3
                r1.<init>(r2, r3, r5, r0)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r0 = r1.tokens
                int r0 = r0.size()
                return r0
        }
    }

    public static class TypeSubstituting extends net.bytebuddy.description.method.ParameterList.AbstractBase<net.bytebuddy.description.method.ParameterDescription.InGenericShape> {
        private final net.bytebuddy.description.method.MethodDescription.InGenericShape declaringMethod;
        private final java.util.List<? extends net.bytebuddy.description.method.ParameterDescription> parameterDescriptions;
        private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

        public TypeSubstituting(net.bytebuddy.description.method.MethodDescription.InGenericShape r1, java.util.List<? extends net.bytebuddy.description.method.ParameterDescription> r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                r0 = this;
                r0.<init>()
                r0.declaringMethod = r1
                r0.parameterDescriptions = r2
                r0.visitor = r3
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.method.ParameterDescription$InGenericShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.method.ParameterDescription.InGenericShape get(int r4) {
                r3 = this;
                net.bytebuddy.description.method.ParameterDescription$TypeSubstituting r0 = new net.bytebuddy.description.method.ParameterDescription$TypeSubstituting
                net.bytebuddy.description.method.MethodDescription$InGenericShape r1 = r3.declaringMethod
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription> r2 = r3.parameterDescriptions
                java.lang.Object r4 = r2.get(r4)
                net.bytebuddy.description.method.ParameterDescription r4 = (net.bytebuddy.description.method.ParameterDescription) r4
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r3.visitor
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription> r0 = r1.parameterDescriptions
                int r0 = r0.size()
                return r0
        }
    }

    net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> asDefined();

    net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.method.ParameterDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1);

    net.bytebuddy.description.type.TypeList.Generic asTypeList();

    boolean hasExplicitMetaData();
}
