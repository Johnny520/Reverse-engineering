package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodGraph {

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Safe initialization is implied.", value = {"IC_SUPERCLASS_USES_SUBCLASS_DURING_INITIALIZATION"})
    public interface Compiler {
        public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler DEFAULT = null;

        public static abstract class AbstractBase implements net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler {
            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDefinition r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r2.asErasure()
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r2 = r1.compile(r2, r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            @java.lang.Deprecated
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r0.compile(r1, r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            @java.lang.Deprecated
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                    r0 = this;
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r0.compile(r1, r2)
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Default<T> extends net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.AbstractBase {
            private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<T> harmonizer;
            private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
            private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger merger;
            private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

            public interface Harmonizer<S> {

                public enum ForJVMMethod extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod> implements net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod.Token> {
                    private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod INSTANCE = null;

                    public static class Token {
                        private final int hashCode;
                        private final net.bytebuddy.description.method.MethodDescription.TypeToken typeToken;

                        public Token(net.bytebuddy.description.method.MethodDescription.TypeToken r2) {
                                r1 = this;
                                r1.<init>()
                                r1.typeToken = r2
                                net.bytebuddy.description.type.TypeDescription r0 = r2.getReturnType()
                                int r0 = r0.hashCode()
                                java.util.List r2 = r2.getParameterTypes()
                                int r2 = r2.hashCode()
                                int r2 = r2 * 31
                                int r0 = r0 + r2
                                r1.hashCode = r0
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                boolean r1 = r5 instanceof net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod.Token
                                r2 = 0
                                if (r1 != 0) goto La
                                return r2
                            La:
                                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod$Token r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod.Token) r5
                                net.bytebuddy.description.method.MethodDescription$TypeToken r1 = r4.typeToken
                                net.bytebuddy.description.type.TypeDescription r1 = r1.getReturnType()
                                net.bytebuddy.description.method.MethodDescription$TypeToken r3 = r5.typeToken
                                net.bytebuddy.description.type.TypeDescription r3 = r3.getReturnType()
                                boolean r1 = r1.equals(r3)
                                if (r1 == 0) goto L31
                                net.bytebuddy.description.method.MethodDescription$TypeToken r1 = r4.typeToken
                                java.util.List r1 = r1.getParameterTypes()
                                net.bytebuddy.description.method.MethodDescription$TypeToken r5 = r5.typeToken
                                java.util.List r5 = r5.getParameterTypes()
                                boolean r5 = r1.equals(r5)
                                if (r5 == 0) goto L31
                                goto L32
                            L31:
                                r0 = r2
                            L32:
                                return r0
                        }

                        public int hashCode() {
                                r1 = this;
                                int r0 = r1.hashCode
                                return r0
                        }

                        public java.lang.String toString() {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$TypeToken r0 = r1.typeToken
                                java.lang.String r0 = r0.toString()
                                return r0
                        }
                    }

                    static {
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod.INSTANCE = r0
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod[] r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod[]{r0}
                            net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod.$VALUES = r0
                            return
                    }

                    ForJVMMethod(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod> r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod r1 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod[] values() {
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod[] r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod[] r0 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer
                    public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod.Token harmonize(net.bytebuddy.description.method.MethodDescription.TypeToken r1) {
                            r0 = this;
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod$Token r1 = r0.harmonize2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer
                    /* JADX INFO: renamed from: harmonize, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod.Token harmonize2(net.bytebuddy.description.method.MethodDescription.TypeToken r2) {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod$Token r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod$Token
                            r0.<init>(r2)
                            return r0
                    }
                }

                public enum ForJavaMethod extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod> implements net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod.Token> {
                    private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod INSTANCE = null;

                    public static class Token {
                        private final int hashCode;
                        private final net.bytebuddy.description.method.MethodDescription.TypeToken typeToken;

                        public Token(net.bytebuddy.description.method.MethodDescription.TypeToken r1) {
                                r0 = this;
                                r0.<init>()
                                r0.typeToken = r1
                                java.util.List r1 = r1.getParameterTypes()
                                int r1 = r1.hashCode()
                                r0.hashCode = r1
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                                r1 = this;
                                if (r1 == r2) goto L1d
                                boolean r0 = r2 instanceof net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod.Token
                                if (r0 == 0) goto L1b
                                net.bytebuddy.description.method.MethodDescription$TypeToken r0 = r1.typeToken
                                java.util.List r0 = r0.getParameterTypes()
                                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod$Token r2 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod.Token) r2
                                net.bytebuddy.description.method.MethodDescription$TypeToken r2 = r2.typeToken
                                java.util.List r2 = r2.getParameterTypes()
                                boolean r2 = r0.equals(r2)
                                if (r2 == 0) goto L1b
                                goto L1d
                            L1b:
                                r2 = 0
                                goto L1e
                            L1d:
                                r2 = 1
                            L1e:
                                return r2
                        }

                        public int hashCode() {
                                r1 = this;
                                int r0 = r1.hashCode
                                return r0
                        }

                        public java.lang.String toString() {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$TypeToken r0 = r1.typeToken
                                java.util.List r0 = r0.getParameterTypes()
                                java.lang.String r0 = r0.toString()
                                return r0
                        }
                    }

                    static {
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod.INSTANCE = r0
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod[] r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod[]{r0}
                            net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod.$VALUES = r0
                            return
                    }

                    ForJavaMethod(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod> r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod r1 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod[] values() {
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod[] r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod[] r0 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer
                    public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod.Token harmonize(net.bytebuddy.description.method.MethodDescription.TypeToken r1) {
                            r0 = this;
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod$Token r1 = r0.harmonize2(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer
                    /* JADX INFO: renamed from: harmonize, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod.Token harmonize2(net.bytebuddy.description.method.MethodDescription.TypeToken r2) {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod$Token r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod$Token
                            r0.<init>(r2)
                            return r0
                    }
                }

                S harmonize(net.bytebuddy.description.method.MethodDescription.TypeToken r1);
            }

            public static abstract class Key<S> {
                protected final java.lang.String internalName;
                protected final int parameterCount;

                public static class Detached extends net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key<net.bytebuddy.description.method.MethodDescription.TypeToken> {
                    private final java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> identifiers;

                    public Detached(java.lang.String r1, int r2, java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            r0.identifiers = r3
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Detached of(net.bytebuddy.description.method.MethodDescription.SignatureToken r3) {
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached
                            java.lang.String r1 = r3.getName()
                            java.util.List r2 = r3.getParameterTypes()
                            int r2 = r2.size()
                            net.bytebuddy.description.method.MethodDescription$TypeToken r3 = r3.asTypeToken()
                            java.util.Set r3 = java.util.Collections.singleton(r3)
                            r0.<init>(r1, r2, r3)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key
                    public java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> getIdentifiers() {
                            r1 = this;
                            java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken> r0 = r1.identifiers
                            return r0
                    }
                }

                public static class Harmonized<V> extends net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key<V> {
                    private final java.util.Map<V, java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken>> identifiers;

                    public Harmonized(java.lang.String r1, int r2, java.util.Map<V, java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken>> r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            r0.identifiers = r3
                            return
                    }

                    public static <Q> net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<Q> of(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<Q> r4) {
                            net.bytebuddy.description.method.MethodDescription$TypeToken r0 = r3.asTypeToken()
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized
                            java.lang.String r2 = r3.getInternalName()
                            net.bytebuddy.description.method.ParameterList r3 = r3.getParameters()
                            int r3 = r3.size()
                            java.lang.Object r4 = r4.harmonize(r0)
                            java.util.Set r0 = java.util.Collections.emptySet()
                            java.util.Map r4 = java.util.Collections.singletonMap(r4, r0)
                            r1.<init>(r2, r3, r4)
                            return r1
                    }

                    public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<V> combineWith(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<V> r5) {
                            r4 = this;
                            java.util.HashMap r0 = new java.util.HashMap
                            java.util.Map<V, java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken>> r1 = r4.identifiers
                            r0.<init>(r1)
                            java.util.Map<V, java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken>> r5 = r5.identifiers
                            java.util.Set r5 = r5.entrySet()
                            java.util.Iterator r5 = r5.iterator()
                        L11:
                            boolean r1 = r5.hasNext()
                            if (r1 == 0) goto L4b
                            java.lang.Object r1 = r5.next()
                            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                            java.lang.Object r2 = r1.getKey()
                            java.lang.Object r2 = r0.get(r2)
                            java.util.Set r2 = (java.util.Set) r2
                            if (r2 != 0) goto L35
                            java.lang.Object r2 = r1.getKey()
                            java.lang.Object r1 = r1.getValue()
                            r0.put(r2, r1)
                            goto L11
                        L35:
                            java.util.HashSet r3 = new java.util.HashSet
                            r3.<init>(r2)
                            java.lang.Object r2 = r1.getValue()
                            java.util.Collection r2 = (java.util.Collection) r2
                            r3.addAll(r2)
                            java.lang.Object r1 = r1.getKey()
                            r0.put(r1, r3)
                            goto L11
                        L4b:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r5 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized
                            java.lang.String r1 = r4.internalName
                            int r2 = r4.parameterCount
                            r5.<init>(r1, r2, r0)
                            return r5
                    }

                    public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Detached detach(net.bytebuddy.description.method.MethodDescription.TypeToken r4) {
                            r3 = this;
                            java.util.HashSet r0 = new java.util.HashSet
                            r0.<init>()
                            java.util.Map<V, java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken>> r1 = r3.identifiers
                            java.util.Collection r1 = r1.values()
                            java.util.Iterator r1 = r1.iterator()
                        Lf:
                            boolean r2 = r1.hasNext()
                            if (r2 == 0) goto L1f
                            java.lang.Object r2 = r1.next()
                            java.util.Set r2 = (java.util.Set) r2
                            r0.addAll(r2)
                            goto Lf
                        L1f:
                            r0.add(r4)
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r4 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached
                            java.lang.String r1 = r3.internalName
                            int r2 = r3.parameterCount
                            r4.<init>(r1, r2, r0)
                            return r4
                    }

                    public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<V> extend(net.bytebuddy.description.method.MethodDescription.InDefinedShape r4, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<V> r5) {
                            r3 = this;
                            java.util.HashMap r0 = new java.util.HashMap
                            java.util.Map<V, java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken>> r1 = r3.identifiers
                            r0.<init>(r1)
                            net.bytebuddy.description.method.MethodDescription$TypeToken r4 = r4.asTypeToken()
                            java.lang.Object r5 = r5.harmonize(r4)
                            java.lang.Object r1 = r0.get(r5)
                            java.util.Set r1 = (java.util.Set) r1
                            if (r1 != 0) goto L1f
                            java.util.Set r4 = java.util.Collections.singleton(r4)
                            r0.put(r5, r4)
                            goto L2a
                        L1f:
                            java.util.HashSet r2 = new java.util.HashSet
                            r2.<init>(r1)
                            r2.add(r4)
                            r0.put(r5, r2)
                        L2a:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r4 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized
                            java.lang.String r5 = r3.internalName
                            int r1 = r3.parameterCount
                            r4.<init>(r5, r1, r0)
                            return r4
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key
                    public java.util.Set<V> getIdentifiers() {
                            r1 = this;
                            java.util.Map<V, java.util.Set<net.bytebuddy.description.method.MethodDescription$TypeToken>> r0 = r1.identifiers
                            java.util.Set r0 = r0.keySet()
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Store<V> {
                    private final java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<V>> entries;

                    public interface Entry<W> {

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class Ambiguous<U> implements net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> {
                            private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<U> key;
                            private final java.util.LinkedHashSet<net.bytebuddy.description.method.MethodDescription> methodDescriptions;
                            private final net.bytebuddy.description.modifier.Visibility visibility;

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Node implements net.bytebuddy.dynamic.scaffold.MethodGraph.Node {
                                private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Detached key;
                                private final net.bytebuddy.description.method.MethodDescription methodDescription;
                                private final net.bytebuddy.description.modifier.Visibility visibility;

                                public Node(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Detached r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.modifier.Visibility r3) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.key = r1
                                        r0.methodDescription = r2
                                        r0.visibility = r3
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
                                        net.bytebuddy.description.modifier.Visibility r2 = r4.visibility
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous$Node r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry.Ambiguous.Node) r5
                                        net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r2 = r4.key
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r3 = r5.key
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L2b
                                        return r1
                                    L2b:
                                        net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                                        net.bytebuddy.description.method.MethodDescription r5 = r5.methodDescription
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L36
                                        return r1
                                    L36:
                                        return r0
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> getMethodTypes() {
                                        r1 = this;
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r0 = r1.key
                                        java.util.Set r0 = r0.getIdentifiers()
                                        return r0
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public net.bytebuddy.description.method.MethodDescription getRepresentative() {
                                        r1 = this;
                                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                                        return r0
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort getSort() {
                                        r1 = this;
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.AMBIGUOUS
                                        return r0
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public net.bytebuddy.description.modifier.Visibility getVisibility() {
                                        r1 = this;
                                        net.bytebuddy.description.modifier.Visibility r0 = r1.visibility
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r1 = r2.key
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.modifier.Visibility r1 = r2.visibility
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            public Ambiguous(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<U> r1, java.util.LinkedHashSet<net.bytebuddy.description.method.MethodDescription> r2, net.bytebuddy.description.modifier.Visibility r3) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.key = r1
                                    r0.methodDescriptions = r2
                                    r0.visibility = r3
                                    return
                            }

                            public static <Q> net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<Q> of(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<Q> r4, net.bytebuddy.description.method.MethodDescription r5, net.bytebuddy.description.method.MethodDescription r6, net.bytebuddy.description.modifier.Visibility r7) {
                                    r0 = 0
                                    net.bytebuddy.description.modifier.Visibility r1 = r5.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r7 = r7.expandTo(r1)
                                    net.bytebuddy.description.modifier.Visibility r1 = r6.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r7 = r7.expandTo(r1)
                                    boolean r1 = r5.isBridge()
                                    boolean r2 = r6.isBridge()
                                    r1 = r1 ^ r2
                                    if (r1 == 0) goto L29
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved
                                    boolean r2 = r5.isBridge()
                                    if (r2 == 0) goto L25
                                    r5 = r6
                                L25:
                                    r1.<init>(r4, r5, r7, r0)
                                    goto L3f
                                L29:
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous
                                    java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
                                    r3 = 2
                                    net.bytebuddy.description.method.MethodDescription[] r3 = new net.bytebuddy.description.method.MethodDescription[r3]
                                    r3[r0] = r5
                                    r5 = 1
                                    r3[r5] = r6
                                    java.util.List r5 = java.util.Arrays.asList(r3)
                                    r2.<init>(r5)
                                    r1.<init>(r4, r2, r7)
                                L3f:
                                    return r1
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Node asNode(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger r4) {
                                    r3 = this;
                                    java.util.LinkedHashSet<net.bytebuddy.description.method.MethodDescription> r0 = r3.methodDescriptions
                                    java.util.Iterator r0 = r0.iterator()
                                    java.lang.Object r1 = r0.next()
                                    net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                                Lc:
                                    boolean r2 = r0.hasNext()
                                    if (r2 == 0) goto L1d
                                    java.lang.Object r2 = r0.next()
                                    net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                                    net.bytebuddy.description.method.MethodDescription r1 = r4.merge(r1, r2)
                                    goto Lc
                                L1d:
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous$Node r4 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous$Node
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r0 = r3.key
                                    net.bytebuddy.description.method.MethodDescription$TypeToken r2 = r1.asTypeToken()
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r0 = r0.detach(r2)
                                    net.bytebuddy.description.modifier.Visibility r2 = r3.visibility
                                    r4.<init>(r0, r1, r2)
                                    return r4
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
                                    net.bytebuddy.description.modifier.Visibility r2 = r4.visibility
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry.Ambiguous) r5
                                    net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L20
                                    return r1
                                L20:
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r2 = r4.key
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r3 = r5.key
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L2b
                                    return r1
                                L2b:
                                    java.util.LinkedHashSet<net.bytebuddy.description.method.MethodDescription> r2 = r4.methodDescriptions
                                    java.util.LinkedHashSet<net.bytebuddy.description.method.MethodDescription> r5 = r5.methodDescriptions
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L36
                                    return r1
                                L36:
                                    return r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> extendBy(net.bytebuddy.description.method.MethodDescription r8, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<U> r9) {
                                    r7 = this;
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r0 = r7.key
                                    net.bytebuddy.description.ByteCodeElement$TypeDependant r1 = r8.asDefined()
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r9 = r0.extend(r1, r9)
                                    java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                                    r0.<init>()
                                    net.bytebuddy.description.type.TypeDefinition r1 = r8.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                                    boolean r2 = r8.isBridge()
                                    net.bytebuddy.description.modifier.Visibility r3 = r7.visibility
                                    java.util.LinkedHashSet<net.bytebuddy.description.method.MethodDescription> r4 = r7.methodDescriptions
                                    java.util.Iterator r4 = r4.iterator()
                                L25:
                                    boolean r5 = r4.hasNext()
                                    if (r5 == 0) goto L5e
                                    java.lang.Object r5 = r4.next()
                                    net.bytebuddy.description.method.MethodDescription r5 = (net.bytebuddy.description.method.MethodDescription) r5
                                    net.bytebuddy.description.type.TypeDefinition r6 = r5.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription r6 = r6.asErasure()
                                    boolean r6 = r6.equals(r1)
                                    if (r6 == 0) goto L55
                                    boolean r6 = r5.isBridge()
                                    r6 = r6 ^ r2
                                    if (r6 == 0) goto L4f
                                    if (r2 == 0) goto L4a
                                    r6 = r5
                                    goto L4b
                                L4a:
                                    r6 = r8
                                L4b:
                                    r0.add(r6)
                                    goto L55
                                L4f:
                                    r0.add(r8)
                                    r0.add(r5)
                                L55:
                                    net.bytebuddy.description.modifier.Visibility r5 = r5.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r3 = r3.expandTo(r5)
                                    goto L25
                                L5e:
                                    boolean r1 = r0.isEmpty()
                                    if (r1 == 0) goto L6a
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved
                                    r0.<init>(r9, r8, r3, r2)
                                    return r0
                                L6a:
                                    int r8 = r0.size()
                                    r1 = 1
                                    if (r8 != r1) goto L82
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r8 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved
                                    java.util.Iterator r0 = r0.iterator()
                                    java.lang.Object r0 = r0.next()
                                    net.bytebuddy.description.method.MethodDescription r0 = (net.bytebuddy.description.method.MethodDescription) r0
                                    r1 = 0
                                    r8.<init>(r9, r0, r3, r1)
                                    return r8
                                L82:
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous r8 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous
                                    r8.<init>(r9, r0, r3)
                                    return r8
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public java.util.Set<net.bytebuddy.description.method.MethodDescription> getCandidates() {
                                    r1 = this;
                                    java.util.LinkedHashSet<net.bytebuddy.description.method.MethodDescription> r0 = r1.methodDescriptions
                                    return r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<U> getKey() {
                                    r1 = this;
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r0 = r1.key
                                    return r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.description.modifier.Visibility getVisibility() {
                                    r1 = this;
                                    net.bytebuddy.description.modifier.Visibility r0 = r1.visibility
                                    return r0
                            }

                            public int hashCode() {
                                    r2 = this;
                                    java.lang.Class r0 = r2.getClass()
                                    int r0 = r0.hashCode()
                                    int r0 = r0 * 31
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r1 = r2.key
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    java.util.LinkedHashSet<net.bytebuddy.description.method.MethodDescription> r1 = r2.methodDescriptions
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.description.modifier.Visibility r1 = r2.visibility
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> inject(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> r8) {
                                    r7 = this;
                                    java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                                    r0.<init>()
                                    java.util.LinkedHashSet<net.bytebuddy.description.method.MethodDescription> r1 = r7.methodDescriptions
                                    java.util.Iterator r1 = r1.iterator()
                                Lb:
                                    boolean r2 = r1.hasNext()
                                    if (r2 == 0) goto L4c
                                    java.lang.Object r2 = r1.next()
                                    net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                                    net.bytebuddy.description.type.TypeDefinition r3 = r2.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                                    java.util.Set r4 = r8.getCandidates()
                                    java.util.Iterator r4 = r4.iterator()
                                L27:
                                    boolean r5 = r4.hasNext()
                                    if (r5 == 0) goto L48
                                    java.lang.Object r5 = r4.next()
                                    net.bytebuddy.description.method.MethodDescription r5 = (net.bytebuddy.description.method.MethodDescription) r5
                                    net.bytebuddy.description.type.TypeDefinition r5 = r5.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                                    boolean r6 = r5.equals(r3)
                                    if (r6 != 0) goto L27
                                    boolean r5 = r5.isAssignableTo(r3)
                                    if (r5 == 0) goto L27
                                    goto Lb
                                L48:
                                    r0.add(r2)
                                    goto Lb
                                L4c:
                                    java.util.Set r1 = r8.getCandidates()
                                    java.util.Iterator r1 = r1.iterator()
                                L54:
                                    boolean r2 = r1.hasNext()
                                    if (r2 == 0) goto L8d
                                    java.lang.Object r2 = r1.next()
                                    net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                                    net.bytebuddy.description.type.TypeDefinition r3 = r2.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                                    java.util.LinkedHashSet<net.bytebuddy.description.method.MethodDescription> r4 = r7.methodDescriptions
                                    java.util.Iterator r4 = r4.iterator()
                                L6e:
                                    boolean r5 = r4.hasNext()
                                    if (r5 == 0) goto L89
                                    java.lang.Object r5 = r4.next()
                                    net.bytebuddy.description.method.MethodDescription r5 = (net.bytebuddy.description.method.MethodDescription) r5
                                    net.bytebuddy.description.type.TypeDefinition r5 = r5.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                                    boolean r5 = r5.isAssignableTo(r3)
                                    if (r5 == 0) goto L6e
                                    goto L54
                                L89:
                                    r0.add(r2)
                                    goto L54
                                L8d:
                                    int r1 = r0.size()
                                    r2 = 1
                                    if (r1 != r2) goto Lb8
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r2 = r7.key
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r3 = r8.getKey()
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r2.combineWith(r3)
                                    java.util.Iterator r0 = r0.iterator()
                                    java.lang.Object r0 = r0.next()
                                    net.bytebuddy.description.method.MethodDescription r0 = (net.bytebuddy.description.method.MethodDescription) r0
                                    net.bytebuddy.description.modifier.Visibility r3 = r7.visibility
                                    net.bytebuddy.description.modifier.Visibility r8 = r8.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r8 = r3.expandTo(r8)
                                    r1.<init>(r2, r0, r8)
                                    goto Ld1
                                Lb8:
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r2 = r7.key
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r3 = r8.getKey()
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r2.combineWith(r3)
                                    net.bytebuddy.description.modifier.Visibility r3 = r7.visibility
                                    net.bytebuddy.description.modifier.Visibility r8 = r8.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r8 = r3.expandTo(r8)
                                    r1.<init>(r2, r0, r8)
                                Ld1:
                                    return r1
                            }
                        }

                        public static class Initial<U> implements net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> {
                            private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<U> key;

                            public Initial(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<U> r1) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.key = r1
                                    return
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Node asNode(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger r3) {
                                    r2 = this;
                                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                    r0.<init>()
                                    java.lang.String r1 = "Cannot transform initial entry without a registered method: "
                                    r0.append(r1)
                                    r0.append(r2)
                                    java.lang.String r0 = r0.toString()
                                    r3.<init>(r0)
                                    throw r3
                            }

                            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3) {
                                    r2 = this;
                                    if (r2 != r3) goto L4
                                    r3 = 1
                                    return r3
                                L4:
                                    if (r3 == 0) goto L1c
                                    java.lang.Class r0 = r2.getClass()
                                    java.lang.Class r1 = r3.getClass()
                                    if (r0 == r1) goto L11
                                    goto L1c
                                L11:
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Initial r3 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry.Initial) r3
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r0 = r2.key
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r3 = r3.key
                                    boolean r3 = r0.equals(r3)
                                    return r3
                                L1c:
                                    r3 = 0
                                    return r3
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> extendBy(net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<U> r5) {
                                    r3 = this;
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r1 = r3.key
                                    net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r4.asDefined()
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r5 = r1.extend(r2, r5)
                                    net.bytebuddy.description.modifier.Visibility r1 = r4.getVisibility()
                                    r2 = 0
                                    r0.<init>(r5, r4, r1, r2)
                                    return r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public java.util.Set<net.bytebuddy.description.method.MethodDescription> getCandidates() {
                                    r3 = this;
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                    r1.<init>()
                                    java.lang.String r2 = "Cannot extract method from initial entry:"
                                    r1.append(r2)
                                    r1.append(r3)
                                    java.lang.String r1 = r1.toString()
                                    r0.<init>(r1)
                                    throw r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<U> getKey() {
                                    r3 = this;
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                    r1.<init>()
                                    java.lang.String r2 = "Cannot extract key from initial entry:"
                                    r1.append(r2)
                                    r1.append(r3)
                                    java.lang.String r1 = r1.toString()
                                    r0.<init>(r1)
                                    throw r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.description.modifier.Visibility getVisibility() {
                                    r3 = this;
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                    r1.<init>()
                                    java.lang.String r2 = "Cannot extract visibility from initial entry:"
                                    r1.append(r2)
                                    r1.append(r3)
                                    java.lang.String r1 = r1.toString()
                                    r0.<init>(r1)
                                    throw r0
                            }

                            public int hashCode() {
                                    r1 = this;
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r0 = r1.key
                                    int r0 = r0.hashCode()
                                    return r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> inject(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> r3) {
                                    r2 = this;
                                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                    r0.<init>()
                                    java.lang.String r1 = "Cannot inject into initial entry without a registered method: "
                                    r0.append(r1)
                                    r0.append(r2)
                                    java.lang.String r0 = r0.toString()
                                    r3.<init>(r0)
                                    throw r3
                            }
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class Resolved<U> implements net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> {
                            private static final int MADE_VISIBLE = 5;
                            private static final boolean NOT_MADE_VISIBLE = false;
                            private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<U> key;
                            private final boolean madeVisible;
                            private final net.bytebuddy.description.method.MethodDescription methodDescription;
                            private final net.bytebuddy.description.modifier.Visibility visibility;

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Node implements net.bytebuddy.dynamic.scaffold.MethodGraph.Node {
                                private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Detached key;
                                private final net.bytebuddy.description.method.MethodDescription methodDescription;
                                private final net.bytebuddy.description.modifier.Visibility visibility;
                                private final boolean visible;

                                public Node(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Detached r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.modifier.Visibility r3, boolean r4) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.key = r1
                                        r0.methodDescription = r2
                                        r0.visibility = r3
                                        r0.visible = r4
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
                                        boolean r2 = r4.visible
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved$Node r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry.Resolved.Node) r5
                                        boolean r3 = r5.visible
                                        if (r2 == r3) goto L1c
                                        return r1
                                    L1c:
                                        net.bytebuddy.description.modifier.Visibility r2 = r4.visibility
                                        net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L27
                                        return r1
                                    L27:
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r2 = r4.key
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r3 = r5.key
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L32
                                        return r1
                                    L32:
                                        net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                                        net.bytebuddy.description.method.MethodDescription r5 = r5.methodDescription
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L3d
                                        return r1
                                    L3d:
                                        return r0
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> getMethodTypes() {
                                        r1 = this;
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r0 = r1.key
                                        java.util.Set r0 = r0.getIdentifiers()
                                        return r0
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public net.bytebuddy.description.method.MethodDescription getRepresentative() {
                                        r1 = this;
                                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                                        return r0
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort getSort() {
                                        r1 = this;
                                        boolean r0 = r1.visible
                                        if (r0 == 0) goto L7
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.VISIBLE
                                        goto L9
                                    L7:
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.RESOLVED
                                    L9:
                                        return r0
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public net.bytebuddy.description.modifier.Visibility getVisibility() {
                                        r1 = this;
                                        net.bytebuddy.description.modifier.Visibility r0 = r1.visibility
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r1 = r2.key
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.modifier.Visibility r1 = r2.visibility
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        boolean r1 = r2.visible
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            public Resolved(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<U> r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.modifier.Visibility r4) {
                                    r1 = this;
                                    r0 = 0
                                    r1.<init>(r2, r3, r4, r0)
                                    return
                            }

                            public Resolved(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<U> r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.modifier.Visibility r3, boolean r4) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.key = r1
                                    r0.methodDescription = r2
                                    r0.visibility = r3
                                    r0.madeVisible = r4
                                    return
                            }

                            private static <V> net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<V> of(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<V> r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.description.modifier.Visibility r5) {
                                    net.bytebuddy.description.modifier.Visibility r0 = r4.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r5 = r5.expandTo(r0)
                                    net.bytebuddy.description.modifier.Visibility r0 = r3.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r5 = r5.expandTo(r0)
                                    boolean r0 = r3.isBridge()
                                    r1 = 0
                                    if (r0 == 0) goto L2a
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r3 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved
                                    net.bytebuddy.description.type.TypeDefinition r0 = r4.getDeclaringType()
                                    int r0 = r0.getModifiers()
                                    r0 = r0 & 5
                                    if (r0 != 0) goto L26
                                    r1 = 1
                                L26:
                                    r3.<init>(r2, r4, r5, r1)
                                    goto L30
                                L2a:
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r4 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved
                                    r4.<init>(r2, r3, r5, r1)
                                    r3 = r4
                                L30:
                                    return r3
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Node asNode(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger r5) {
                                    r4 = this;
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved$Node r5 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved$Node
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r0 = r4.key
                                    net.bytebuddy.description.method.MethodDescription r1 = r4.methodDescription
                                    net.bytebuddy.description.method.MethodDescription$TypeToken r1 = r1.asTypeToken()
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r0 = r0.detach(r1)
                                    net.bytebuddy.description.method.MethodDescription r1 = r4.methodDescription
                                    net.bytebuddy.description.modifier.Visibility r2 = r4.visibility
                                    boolean r3 = r4.madeVisible
                                    r5.<init>(r0, r1, r2, r3)
                                    return r5
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
                                    boolean r2 = r4.madeVisible
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry.Resolved) r5
                                    boolean r3 = r5.madeVisible
                                    if (r2 == r3) goto L1c
                                    return r1
                                L1c:
                                    net.bytebuddy.description.modifier.Visibility r2 = r4.visibility
                                    net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L27
                                    return r1
                                L27:
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r2 = r4.key
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r3 = r5.key
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L32
                                    return r1
                                L32:
                                    net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                                    net.bytebuddy.description.method.MethodDescription r5 = r5.methodDescription
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L3d
                                    return r1
                                L3d:
                                    return r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> extendBy(net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<U> r5) {
                                    r3 = this;
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r0 = r3.key
                                    net.bytebuddy.description.ByteCodeElement$TypeDependant r1 = r4.asDefined()
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r5 = r0.extend(r1, r5)
                                    net.bytebuddy.description.modifier.Visibility r0 = r3.visibility
                                    net.bytebuddy.description.modifier.Visibility r1 = r4.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r0 = r0.expandTo(r1)
                                    net.bytebuddy.description.type.TypeDefinition r1 = r4.getDeclaringType()
                                    net.bytebuddy.description.method.MethodDescription r2 = r3.methodDescription
                                    net.bytebuddy.description.type.TypeDefinition r2 = r2.getDeclaringType()
                                    boolean r1 = r1.equals(r2)
                                    if (r1 == 0) goto L2d
                                    net.bytebuddy.description.method.MethodDescription r1 = r3.methodDescription
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r4 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry.Ambiguous.of(r5, r4, r1, r0)
                                    goto L33
                                L2d:
                                    net.bytebuddy.description.method.MethodDescription r1 = r3.methodDescription
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r4 = of(r5, r4, r1, r0)
                                L33:
                                    return r4
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public java.util.Set<net.bytebuddy.description.method.MethodDescription> getCandidates() {
                                    r1 = this;
                                    net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                                    java.util.Set r0 = java.util.Collections.singleton(r0)
                                    return r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<U> getKey() {
                                    r1 = this;
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r0 = r1.key
                                    return r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.description.modifier.Visibility getVisibility() {
                                    r1 = this;
                                    net.bytebuddy.description.modifier.Visibility r0 = r1.visibility
                                    return r0
                            }

                            public int hashCode() {
                                    r2 = this;
                                    java.lang.Class r0 = r2.getClass()
                                    int r0 = r0.hashCode()
                                    int r0 = r0 * 31
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r1 = r2.key
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.description.modifier.Visibility r1 = r2.visibility
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    boolean r1 = r2.madeVisible
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> inject(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<U> r6) {
                                    r5 = this;
                                    net.bytebuddy.description.method.MethodDescription r0 = r5.methodDescription
                                    net.bytebuddy.description.type.TypeDefinition r0 = r0.getDeclaringType()
                                    boolean r0 = r0.isInterface()
                                    if (r0 == 0) goto La4
                                    java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                                    r0.<init>()
                                    net.bytebuddy.description.method.MethodDescription r1 = r5.methodDescription
                                    r0.add(r1)
                                    net.bytebuddy.description.method.MethodDescription r1 = r5.methodDescription
                                    net.bytebuddy.description.type.TypeDefinition r1 = r1.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                                    java.util.Set r2 = r6.getCandidates()
                                    java.util.Iterator r2 = r2.iterator()
                                L28:
                                    boolean r3 = r2.hasNext()
                                    if (r3 == 0) goto L5d
                                    java.lang.Object r3 = r2.next()
                                    net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
                                    net.bytebuddy.description.type.TypeDefinition r4 = r3.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                                    boolean r4 = r4.isAssignableTo(r1)
                                    if (r4 == 0) goto L4b
                                    net.bytebuddy.description.method.MethodDescription r4 = r5.methodDescription
                                    r0.remove(r4)
                                    r0.add(r3)
                                    goto L28
                                L4b:
                                    net.bytebuddy.description.type.TypeDefinition r4 = r3.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                                    boolean r4 = r4.isAssignableFrom(r1)
                                    if (r4 != 0) goto L28
                                    r0.add(r3)
                                    goto L28
                                L5d:
                                    int r1 = r0.size()
                                    r2 = 1
                                    if (r1 != r2) goto L8a
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r2 = r5.key
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r3 = r6.getKey()
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r2.combineWith(r3)
                                    java.util.Iterator r0 = r0.iterator()
                                    java.lang.Object r0 = r0.next()
                                    net.bytebuddy.description.method.MethodDescription r0 = (net.bytebuddy.description.method.MethodDescription) r0
                                    net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                                    net.bytebuddy.description.modifier.Visibility r6 = r6.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r6 = r3.expandTo(r6)
                                    boolean r3 = r5.madeVisible
                                    r1.<init>(r2, r0, r6, r3)
                                    goto La3
                                L8a:
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r2 = r5.key
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r3 = r6.getKey()
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r2.combineWith(r3)
                                    net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                                    net.bytebuddy.description.modifier.Visibility r6 = r6.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r6 = r3.expandTo(r6)
                                    r1.<init>(r2, r0, r6)
                                La3:
                                    return r1
                                La4:
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<U> r1 = r5.key
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r6.getKey()
                                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r1 = r1.combineWith(r2)
                                    net.bytebuddy.description.method.MethodDescription r2 = r5.methodDescription
                                    net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                                    net.bytebuddy.description.modifier.Visibility r6 = r6.getVisibility()
                                    net.bytebuddy.description.modifier.Visibility r6 = r3.expandTo(r6)
                                    boolean r3 = r5.madeVisible
                                    r0.<init>(r1, r2, r6, r3)
                                    return r0
                            }
                        }

                        net.bytebuddy.dynamic.scaffold.MethodGraph.Node asNode(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger r1);

                        net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<W> extendBy(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<W> r2);

                        java.util.Set<net.bytebuddy.description.method.MethodDescription> getCandidates();

                        net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<W> getKey();

                        net.bytebuddy.description.modifier.Visibility getVisibility();

                        net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<W> inject(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<W> r1);
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Graph implements net.bytebuddy.dynamic.scaffold.MethodGraph {
                        private final java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key<net.bytebuddy.description.method.MethodDescription.TypeToken>, net.bytebuddy.dynamic.scaffold.MethodGraph.Node> entries;

                        public Graph(java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key<net.bytebuddy.description.method.MethodDescription.TypeToken>, net.bytebuddy.dynamic.scaffold.MethodGraph.Node> r1) {
                                r0 = this;
                                r0.<init>()
                                r0.entries = r1
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
                                java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key<net.bytebuddy.description.method.MethodDescription$TypeToken>, net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r2 = r4.entries
                                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Graph r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Graph) r5
                                java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key<net.bytebuddy.description.method.MethodDescription$TypeToken>, net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r5 = r5.entries
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
                                java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key<net.bytebuddy.description.method.MethodDescription$TypeToken>, net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r1 = r2.entries
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
                        public net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList listNodes() {
                                r3 = this;
                                net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList
                                java.util.ArrayList r1 = new java.util.ArrayList
                                java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key<net.bytebuddy.description.method.MethodDescription$TypeToken>, net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r2 = r3.entries
                                java.util.Collection r2 = r2.values()
                                r1.<init>(r2)
                                r0.<init>(r1)
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
                        public net.bytebuddy.dynamic.scaffold.MethodGraph.Node locate(net.bytebuddy.description.method.MethodDescription.SignatureToken r2) {
                                r1 = this;
                                java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key<net.bytebuddy.description.method.MethodDescription$TypeToken>, net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r0 = r1.entries
                                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r2 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Detached.of(r2)
                                java.lang.Object r2 = r0.get(r2)
                                net.bytebuddy.dynamic.scaffold.MethodGraph$Node r2 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Node) r2
                                if (r2 != 0) goto L10
                                net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Unresolved r2 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved.INSTANCE
                            L10:
                                return r2
                        }
                    }

                    public Store() {
                            r1 = this;
                            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                            r0.<init>()
                            r1.<init>(r0)
                            return
                    }

                    private Store(java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<V>> r1) {
                            r0 = this;
                            r0.<init>()
                            r0.entries = r1
                            return
                    }

                    private static <W> net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<W> combine(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<W> r9, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry<W> r10) {
                            java.util.Set r0 = r9.getCandidates()
                            java.util.Set r1 = r10.getCandidates()
                            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
                            r2.<init>()
                            r2.addAll(r0)
                            r2.addAll(r1)
                            java.util.Iterator r0 = r0.iterator()
                        L17:
                            boolean r3 = r0.hasNext()
                            if (r3 == 0) goto L5e
                            java.lang.Object r3 = r0.next()
                            net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
                            net.bytebuddy.description.type.TypeDefinition r4 = r3.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                            java.util.Iterator r5 = r1.iterator()
                        L2f:
                            boolean r6 = r5.hasNext()
                            if (r6 == 0) goto L17
                            java.lang.Object r6 = r5.next()
                            net.bytebuddy.description.method.MethodDescription r6 = (net.bytebuddy.description.method.MethodDescription) r6
                            net.bytebuddy.description.type.TypeDefinition r7 = r6.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                            boolean r8 = r4.equals(r7)
                            if (r8 == 0) goto L4a
                            goto L17
                        L4a:
                            boolean r8 = r4.isAssignableTo(r7)
                            if (r8 == 0) goto L54
                            r2.remove(r6)
                            goto L17
                        L54:
                            boolean r6 = r4.isAssignableFrom(r7)
                            if (r6 == 0) goto L2f
                            r2.remove(r3)
                            goto L17
                        L5e:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r0 = r9.getKey()
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r1 = r10.getKey()
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r0 = r0.combineWith(r1)
                            net.bytebuddy.description.modifier.Visibility r9 = r9.getVisibility()
                            net.bytebuddy.description.modifier.Visibility r10 = r10.getVisibility()
                            net.bytebuddy.description.modifier.Visibility r9 = r9.expandTo(r10)
                            int r10 = r2.size()
                            r1 = 1
                            if (r10 != r1) goto L8e
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved r10 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Resolved
                            java.util.Iterator r1 = r2.iterator()
                            java.lang.Object r1 = r1.next()
                            net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                            r2 = 0
                            r10.<init>(r0, r1, r9, r2)
                            goto L93
                        L8e:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous r10 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Ambiguous
                            r10.<init>(r0, r2, r9)
                        L93:
                            return r10
                    }

                    public net.bytebuddy.dynamic.scaffold.MethodGraph asGraph(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger r6) {
                            r5 = this;
                            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                            r0.<init>()
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r1 = r5.entries
                            java.util.Collection r1 = r1.values()
                            java.util.Iterator r1 = r1.iterator()
                        Lf:
                            boolean r2 = r1.hasNext()
                            if (r2 == 0) goto L33
                            java.lang.Object r2 = r1.next()
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r2 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry) r2
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Node r3 = r2.asNode(r6)
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r2.getKey()
                            net.bytebuddy.description.method.MethodDescription r4 = r3.getRepresentative()
                            net.bytebuddy.description.method.MethodDescription$TypeToken r4 = r4.asTypeToken()
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Detached r2 = r2.detach(r4)
                            r0.put(r2, r3)
                            goto Lf
                        L33:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Graph r6 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Graph
                            r6.<init>(r0)
                            return r6
                    }

                    public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<V> combineWith(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<V> r4) {
                            r3 = this;
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r0 = r3.entries
                            boolean r0 = r0.isEmpty()
                            if (r0 == 0) goto L9
                            return r4
                        L9:
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r0 = r4.entries
                            boolean r0 = r0.isEmpty()
                            if (r0 == 0) goto L12
                            return r3
                        L12:
                            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r1 = r3.entries
                            r0.<init>(r1)
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r4 = r4.entries
                            java.util.Collection r4 = r4.values()
                            java.util.Iterator r4 = r4.iterator()
                        L23:
                            boolean r1 = r4.hasNext()
                            if (r1 == 0) goto L48
                            java.lang.Object r1 = r4.next()
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r1 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry) r1
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r1.getKey()
                            java.lang.Object r2 = r0.remove(r2)
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r2 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry) r2
                            if (r2 != 0) goto L3c
                            goto L40
                        L3c:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r1 = combine(r2, r1)
                        L40:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r1.getKey()
                            r0.put(r2, r1)
                            goto L23
                        L48:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r4 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store
                            r4.<init>(r0)
                            return r4
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
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r2 = r4.entries
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store) r5
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r5 = r5.entries
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
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r1 = r2.entries
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<V> inject(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<V> r4) {
                            r3 = this;
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r0 = r3.entries
                            boolean r0 = r0.isEmpty()
                            if (r0 == 0) goto L9
                            return r4
                        L9:
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r0 = r4.entries
                            boolean r0 = r0.isEmpty()
                            if (r0 == 0) goto L12
                            return r3
                        L12:
                            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r1 = r3.entries
                            r0.<init>(r1)
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r4 = r4.entries
                            java.util.Collection r4 = r4.values()
                            java.util.Iterator r4 = r4.iterator()
                        L23:
                            boolean r1 = r4.hasNext()
                            if (r1 == 0) goto L48
                            java.lang.Object r1 = r4.next()
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r1 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry) r1
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r1.getKey()
                            java.lang.Object r2 = r0.remove(r2)
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r2 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry) r2
                            if (r2 != 0) goto L3c
                            goto L40
                        L3c:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r1 = r2.inject(r1)
                        L40:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r1.getKey()
                            r0.put(r2, r1)
                            goto L23
                        L48:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r4 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store
                            r4.<init>(r0)
                            return r4
                    }

                    public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<V> registerTopLevel(java.util.List<? extends net.bytebuddy.description.method.MethodDescription> r5, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<V> r6) {
                            r4 = this;
                            boolean r0 = r5.isEmpty()
                            if (r0 == 0) goto L7
                            return r4
                        L7:
                            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                            java.util.LinkedHashMap<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized<V>, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry<V>> r1 = r4.entries
                            r0.<init>(r1)
                            java.util.Iterator r5 = r5.iterator()
                        L12:
                            boolean r1 = r5.hasNext()
                            if (r1 == 0) goto L3b
                            java.lang.Object r1 = r5.next()
                            net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Harmonized.of(r1, r6)
                            java.lang.Object r3 = r0.remove(r2)
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r3 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry) r3
                            if (r3 != 0) goto L2f
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Initial r3 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry$Initial
                            r3.<init>(r2)
                        L2f:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store$Entry r1 = r3.extendBy(r1, r6)
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Harmonized r2 = r1.getKey()
                            r0.put(r2, r1)
                            goto L12
                        L3b:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r5 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store
                            r5.<init>(r0)
                            return r5
                    }
                }

                public Key(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>()
                        r0.internalName = r1
                        r0.parameterCount = r2
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        boolean r1 = r5 instanceof net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key
                        r2 = 0
                        if (r1 != 0) goto La
                        return r2
                    La:
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key) r5
                        java.lang.String r1 = r4.internalName
                        java.lang.String r3 = r5.internalName
                        boolean r1 = r1.equals(r3)
                        if (r1 == 0) goto L2b
                        int r1 = r4.parameterCount
                        int r3 = r5.parameterCount
                        if (r1 != r3) goto L2b
                        java.util.Set r1 = r4.getIdentifiers()
                        java.util.Set r5 = r5.getIdentifiers()
                        boolean r5 = java.util.Collections.disjoint(r1, r5)
                        if (r5 != 0) goto L2b
                        goto L2c
                    L2b:
                        r0 = r2
                    L2c:
                        return r0
                }

                public abstract java.util.Set<S> getIdentifiers();

                public int hashCode() {
                        r2 = this;
                        java.lang.String r0 = r2.internalName
                        int r0 = r0.hashCode()
                        int r1 = r2.parameterCount
                        int r1 = r1 * 31
                        int r0 = r0 + r1
                        return r0
                }
            }

            public interface Merger {

                public enum Directional extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional> implements net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger {
                    private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional LEFT = null;
                    public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional RIGHT = null;
                    private final boolean left;

                    static {
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional
                            java.lang.String r1 = "LEFT"
                            r2 = 0
                            r3 = 1
                            r0.<init>(r1, r2, r3)
                            net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional.LEFT = r0
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional
                            java.lang.String r4 = "RIGHT"
                            r1.<init>(r4, r3, r2)
                            net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional.RIGHT = r1
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional[] r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional[]{r0, r1}
                            net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional.$VALUES = r0
                            return
                    }

                    Directional(java.lang.String r1, int r2, boolean r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            r0.left = r3
                            return
                    }

                    public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional> r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional r1 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional[] values() {
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional[] r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional[] r0 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger
                    public net.bytebuddy.description.method.MethodDescription merge(net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.MethodDescription r3) {
                            r1 = this;
                            boolean r0 = r1.left
                            if (r0 == 0) goto L5
                            goto L6
                        L5:
                            r2 = r3
                        L6:
                            return r2
                    }
                }

                net.bytebuddy.description.method.MethodDescription merge(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.method.MethodDescription r2);
            }

            public Default(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<T> r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger r3, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r4) {
                    r1 = this;
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.any()
                    r1.<init>(r2, r3, r4, r0)
                    return
            }

            public Default(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<T> r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4) {
                    r0 = this;
                    r0.<init>()
                    r0.harmonizer = r1
                    r0.merger = r2
                    r0.visitor = r3
                    r0.matcher = r4
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler forJVMHierarchy() {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJVMMethod r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJVMMethod.INSTANCE
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional r1 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional.LEFT
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = of(r0, r1)
                    return r0
            }

            public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler forJavaHierarchy() {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer$ForJavaMethod r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer.ForJavaMethod.INSTANCE
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger$Directional r1 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger.Directional.LEFT
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = of(r0, r1)
                    return r0
            }

            public static <S> net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler of(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<S> r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger r3) {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.INITIATING
                    r0.<init>(r2, r3, r1)
                    return r0
            }

            public static <S> net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler of(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<S> r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default
                    r0.<init>(r1, r2, r3)
                    return r0
            }

            public static <S> net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler of(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer<S> r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4) {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reifying r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.INITIATING
                    r0.<init>(r2, r3, r1, r4)
                    return r0
            }

            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<T> analyze(net.bytebuddy.description.type.TypeDefinition r2, net.bytebuddy.description.type.TypeDefinition r3, java.util.Map<net.bytebuddy.description.type.TypeDefinition, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<T>> r4, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5) {
                    r1 = this;
                    java.lang.Object r0 = r4.get(r3)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r0 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store) r0
                    if (r0 != 0) goto Lf
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r0 = r1.doAnalyze(r2, r4, r5)
                    r4.put(r3, r0)
                Lf:
                    return r0
            }

            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<T> analyzeNullable(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r2, java.util.Map<net.bytebuddy.description.type.TypeDefinition, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<T>> r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4) {
                    r1 = this;
                    if (r2 != 0) goto L8
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r2 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store
                    r2.<init>()
                    goto L14
                L8:
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r0 = r1.visitor
                    java.lang.Object r0 = r2.accept(r0)
                    net.bytebuddy.description.type.TypeDefinition r0 = (net.bytebuddy.description.type.TypeDefinition) r0
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r2 = r1.analyze(r0, r2, r3, r4)
                L14:
                    return r2
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDefinition r7, net.bytebuddy.description.type.TypeDescription r8) {
                    r6 = this;
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isVirtual()
                    net.bytebuddy.matcher.ElementMatcher$Junction r8 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r8)
                    net.bytebuddy.matcher.ElementMatcher$Junction r8 = r1.and(r8)
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r6.matcher
                    net.bytebuddy.matcher.ElementMatcher$Junction r8 = r8.and(r1)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r8 = r6.doAnalyze(r7, r0, r8)
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r7.getSuperClass()
                    net.bytebuddy.description.type.TypeList$Generic r7 = r7.getInterfaces()
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L2c:
                    boolean r3 = r7.hasNext()
                    java.lang.String r4 = " from "
                    if (r3 == 0) goto L71
                    java.lang.Object r3 = r7.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                    java.lang.Object r5 = r0.get(r3)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store) r5
                    if (r5 == 0) goto L50
                    net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger r4 = r6.merger
                    net.bytebuddy.dynamic.scaffold.MethodGraph r4 = r5.asGraph(r4)
                    r2.put(r3, r4)
                    goto L2c
                L50:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r1 = "Failed to resolve interface type "
                    r8.append(r1)
                    r8.append(r3)
                    r8.append(r4)
                    java.util.Set r0 = r0.keySet()
                    r8.append(r0)
                    java.lang.String r8 = r8.toString()
                    r7.<init>(r8)
                    throw r7
                L71:
                    if (r1 != 0) goto L75
                    r7 = 0
                    goto L7d
                L75:
                    java.lang.Object r7 = r0.get(r1)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r7 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store) r7
                    if (r7 == 0) goto L94
                L7d:
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked$Delegation r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Linked$Delegation
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger r1 = r6.merger
                    net.bytebuddy.dynamic.scaffold.MethodGraph r8 = r8.asGraph(r1)
                    if (r7 != 0) goto L8a
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Empty r7 = net.bytebuddy.dynamic.scaffold.MethodGraph.Empty.INSTANCE
                    goto L90
                L8a:
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger r1 = r6.merger
                    net.bytebuddy.dynamic.scaffold.MethodGraph r7 = r7.asGraph(r1)
                L90:
                    r0.<init>(r8, r7, r2)
                    return r0
                L94:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r2 = "Failed to resolve super class "
                    r8.append(r2)
                    r8.append(r1)
                    r8.append(r4)
                    java.util.Set r0 = r0.keySet()
                    r8.append(r0)
                    java.lang.String r8 = r8.toString()
                    r7.<init>(r8)
                    throw r7
            }

            public net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<T> doAnalyze(net.bytebuddy.description.type.TypeDefinition r6, java.util.Map<net.bytebuddy.description.type.TypeDefinition, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store<T>> r7, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r8) {
                    r5 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r6.getSuperClass()
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r0 = r5.analyzeNullable(r0, r7, r8)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store
                    r1.<init>()
                    net.bytebuddy.description.type.TypeList$Generic r2 = r6.getInterfaces()
                    java.util.Iterator r2 = r2.iterator()
                L15:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L32
                    java.lang.Object r3 = r2.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r4 = r5.visitor
                    java.lang.Object r4 = r3.accept(r4)
                    net.bytebuddy.description.type.TypeDefinition r4 = (net.bytebuddy.description.type.TypeDefinition) r4
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r3 = r5.analyze(r4, r3, r7, r8)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r1 = r1.combineWith(r3)
                    goto L15
                L32:
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r7 = r0.inject(r1)
                    net.bytebuddy.description.method.MethodList r6 = r6.getDeclaredMethods()
                    net.bytebuddy.matcher.FilterableList r6 = r6.filter(r8)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer<T> r8 = r5.harmonizer
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Key$Store r6 = r7.registerTopLevel(r6, r8)
                    return r6
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
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer<T> r2 = r4.harmonizer
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default) r5
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer<T> r3 = r5.harmonizer
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger r2 = r4.merger
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger r3 = r5.merger
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r4.visitor
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r3 = r5.visitor
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L36
                    return r1
                L36:
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r5.matcher
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L41
                    return r1
                L41:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Harmonizer<T> r1 = r2.harmonizer
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$Merger r1 = r2.merger
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.visitor
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public enum ForDeclaredMethods extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods> implements net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$ForDeclaredMethods r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$ForDeclaredMethods
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$ForDeclaredMethods[] r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods[]{r0}
                    net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods.$VALUES = r0
                    return
            }

            ForDeclaredMethods(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$ForDeclaredMethods> r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$ForDeclaredMethods r1 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods[] values() {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$ForDeclaredMethods[] r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$ForDeclaredMethods[] r0 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.ForDeclaredMethods[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDefinition r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r2.asErasure()
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r2 = r1.compile(r2, r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDefinition r4, net.bytebuddy.description.type.TypeDescription r5) {
                    r3 = this;
                    java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                    r0.<init>()
                    net.bytebuddy.description.method.MethodList r4 = r4.getDeclaredMethods()
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isVirtual()
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isBridge()
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.not(r2)
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
                    net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r5)
                    net.bytebuddy.matcher.ElementMatcher$Junction r5 = r1.and(r5)
                    net.bytebuddy.matcher.FilterableList r4 = r4.filter(r5)
                    net.bytebuddy.description.method.MethodList r4 = (net.bytebuddy.description.method.MethodList) r4
                    java.util.Iterator r4 = r4.iterator()
                L2b:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L44
                    java.lang.Object r5 = r4.next()
                    net.bytebuddy.description.method.MethodDescription r5 = (net.bytebuddy.description.method.MethodDescription) r5
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = r5.asSignatureToken()
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Simple r2 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Simple
                    r2.<init>(r5)
                    r0.put(r1, r2)
                    goto L2b
                L44:
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked$Delegation r4 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Linked$Delegation
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Simple r5 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Simple
                    r5.<init>(r0)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Empty r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Empty.INSTANCE
                    java.util.Map r1 = java.util.Collections.emptyMap()
                    r4.<init>(r5, r0, r1)
                    return r4
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            @java.lang.Deprecated
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r0.compile(r1, r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            @java.lang.Deprecated
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                    r0 = this;
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r0.compile(r1, r2)
                    return r1
            }
        }

        static {
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.forJavaHierarchy()
                net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT = r0
                return
        }

        net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDefinition r1);

        net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDefinition r1, net.bytebuddy.description.type.TypeDescription r2);

        @java.lang.Deprecated
        net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDescription r1);

        @java.lang.Deprecated
        net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2);
    }

    public enum Empty extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.MethodGraph.Empty> implements net.bytebuddy.dynamic.scaffold.MethodGraph.Linked, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler {
        private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodGraph.Empty[] $VALUES = null;
        public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Empty INSTANCE = null;

        static {
                net.bytebuddy.dynamic.scaffold.MethodGraph$Empty r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Empty
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.scaffold.MethodGraph.Empty.INSTANCE = r0
                net.bytebuddy.dynamic.scaffold.MethodGraph$Empty[] r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph.Empty[]{r0}
                net.bytebuddy.dynamic.scaffold.MethodGraph.Empty.$VALUES = r0
                return
        }

        Empty(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.scaffold.MethodGraph.Empty valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.scaffold.MethodGraph$Empty> r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Empty.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.scaffold.MethodGraph$Empty r1 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Empty) r1
                return r1
        }

        public static net.bytebuddy.dynamic.scaffold.MethodGraph.Empty[] values() {
                net.bytebuddy.dynamic.scaffold.MethodGraph$Empty[] r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Empty.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.scaffold.MethodGraph$Empty[] r0 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Empty[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDefinition r1) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDefinition r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        @java.lang.Deprecated
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        @java.lang.Deprecated
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Linked
        public net.bytebuddy.dynamic.scaffold.MethodGraph getInterfaceGraph(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Linked
        public net.bytebuddy.dynamic.scaffold.MethodGraph getSuperClassGraph() {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
        public net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList listNodes() {
                r2 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList
                java.util.List r1 = java.util.Collections.emptyList()
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Node locate(net.bytebuddy.description.method.MethodDescription.SignatureToken r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Unresolved r1 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved.INSTANCE
                return r1
        }
    }

    public interface Linked extends net.bytebuddy.dynamic.scaffold.MethodGraph {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Delegation implements net.bytebuddy.dynamic.scaffold.MethodGraph.Linked {
            private final java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.dynamic.scaffold.MethodGraph> interfaceGraphs;
            private final net.bytebuddy.dynamic.scaffold.MethodGraph methodGraph;
            private final net.bytebuddy.dynamic.scaffold.MethodGraph superClassGraph;

            public Delegation(net.bytebuddy.dynamic.scaffold.MethodGraph r1, net.bytebuddy.dynamic.scaffold.MethodGraph r2, java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.dynamic.scaffold.MethodGraph> r3) {
                    r0 = this;
                    r0.<init>()
                    r0.methodGraph = r1
                    r0.superClassGraph = r2
                    r0.interfaceGraphs = r3
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
                    net.bytebuddy.dynamic.scaffold.MethodGraph r2 = r4.methodGraph
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked$Delegation r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Linked.Delegation) r5
                    net.bytebuddy.dynamic.scaffold.MethodGraph r3 = r5.methodGraph
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.dynamic.scaffold.MethodGraph r2 = r4.superClassGraph
                    net.bytebuddy.dynamic.scaffold.MethodGraph r3 = r5.superClassGraph
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.dynamic.scaffold.MethodGraph> r2 = r4.interfaceGraphs
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.dynamic.scaffold.MethodGraph> r5 = r5.interfaceGraphs
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L36
                    return r1
                L36:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Linked
            public net.bytebuddy.dynamic.scaffold.MethodGraph getInterfaceGraph(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.dynamic.scaffold.MethodGraph> r0 = r1.interfaceGraphs
                    java.lang.Object r2 = r0.get(r2)
                    net.bytebuddy.dynamic.scaffold.MethodGraph r2 = (net.bytebuddy.dynamic.scaffold.MethodGraph) r2
                    if (r2 != 0) goto Lc
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Empty r2 = net.bytebuddy.dynamic.scaffold.MethodGraph.Empty.INSTANCE
                Lc:
                    return r2
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Linked
            public net.bytebuddy.dynamic.scaffold.MethodGraph getSuperClassGraph() {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.MethodGraph r0 = r1.superClassGraph
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.MethodGraph r1 = r2.methodGraph
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.MethodGraph r1 = r2.superClassGraph
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.dynamic.scaffold.MethodGraph> r1 = r2.interfaceGraphs
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
            public net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList listNodes() {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.MethodGraph r0 = r1.methodGraph
                    net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r0 = r0.listNodes()
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Node locate(net.bytebuddy.description.method.MethodDescription.SignatureToken r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.MethodGraph r0 = r1.methodGraph
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node r2 = r0.locate(r2)
                    return r2
            }
        }

        net.bytebuddy.dynamic.scaffold.MethodGraph getInterfaceGraph(net.bytebuddy.description.type.TypeDescription r1);

        net.bytebuddy.dynamic.scaffold.MethodGraph getSuperClassGraph();
    }

    public interface Node {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements net.bytebuddy.dynamic.scaffold.MethodGraph.Node {
            private final net.bytebuddy.description.method.MethodDescription methodDescription;

            public Simple(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.methodDescription = r1
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
                    net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Simple r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Simple) r5
                    net.bytebuddy.description.method.MethodDescription r5 = r5.methodDescription
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> getMethodTypes() {
                    r1 = this;
                    java.util.Set r0 = java.util.Collections.emptySet()
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public net.bytebuddy.description.method.MethodDescription getRepresentative() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort getSort() {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.RESOLVED
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public net.bytebuddy.description.modifier.Visibility getVisibility() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                    net.bytebuddy.description.modifier.Visibility r0 = r0.getVisibility()
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public enum Sort extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort> {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort AMBIGUOUS = null;
            public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort RESOLVED = null;
            public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort UNRESOLVED = null;
            public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort VISIBLE = null;
            private final boolean madeVisible;
            private final boolean resolved;
            private final boolean unique;

            static {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r6 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort
                    r4 = 1
                    r5 = 1
                    java.lang.String r1 = "VISIBLE"
                    r2 = 0
                    r3 = 1
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.VISIBLE = r6
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort
                    r11 = 1
                    r12 = 0
                    java.lang.String r8 = "RESOLVED"
                    r9 = 1
                    r10 = 1
                    r7 = r0
                    r7.<init>(r8, r9, r10, r11, r12)
                    net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.RESOLVED = r0
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort
                    r17 = 0
                    r18 = 0
                    java.lang.String r14 = "AMBIGUOUS"
                    r15 = 2
                    r16 = 1
                    r13 = r1
                    r13.<init>(r14, r15, r16, r17, r18)
                    net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.AMBIGUOUS = r1
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r2 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort
                    r11 = 0
                    java.lang.String r8 = "UNRESOLVED"
                    r9 = 3
                    r10 = 0
                    r7 = r2
                    r7.<init>(r8, r9, r10, r11, r12)
                    net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.UNRESOLVED = r2
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort[] r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort[]{r6, r0, r1, r2}
                    net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.$VALUES = r0
                    return
            }

            Sort(java.lang.String r1, int r2, boolean r3, boolean r4, boolean r5) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.resolved = r3
                    r0.unique = r4
                    r0.madeVisible = r5
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort> r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r1 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort[] values() {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort[] r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort[] r0 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort[]) r0
                    return r0
            }

            public boolean isMadeVisible() {
                    r1 = this;
                    boolean r0 = r1.madeVisible
                    return r0
            }

            public boolean isResolved() {
                    r1 = this;
                    boolean r0 = r1.resolved
                    return r0
            }

            public boolean isUnique() {
                    r1 = this;
                    boolean r0 = r1.unique
                    return r0
            }
        }

        public enum Unresolved extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved> implements net.bytebuddy.dynamic.scaffold.MethodGraph.Node {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Unresolved r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Unresolved
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Unresolved[] r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved[]{r0}
                    net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved.$VALUES = r0
                    return
            }

            Unresolved(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Unresolved> r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Unresolved r1 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved[] values() {
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Unresolved[] r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Unresolved[] r0 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> getMethodTypes() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot resolve bridge method of an illegal node"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public net.bytebuddy.description.method.MethodDescription getRepresentative() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot resolve the method of an illegal node"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort getSort() {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort.UNRESOLVED
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public net.bytebuddy.description.modifier.Visibility getVisibility() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Cannot resolve visibility of an illegal node"
                    r0.<init>(r1)
                    throw r0
            }
        }

        java.util.Set<net.bytebuddy.description.method.MethodDescription.TypeToken> getMethodTypes();

        net.bytebuddy.description.method.MethodDescription getRepresentative();

        net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort getSort();

        net.bytebuddy.description.modifier.Visibility getVisibility();
    }

    public static class NodeList extends net.bytebuddy.matcher.FilterableList.AbstractBase<net.bytebuddy.dynamic.scaffold.MethodGraph.Node, net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList> {
        private final java.util.List<? extends net.bytebuddy.dynamic.scaffold.MethodGraph.Node> nodes;

        public NodeList(java.util.List<? extends net.bytebuddy.dynamic.scaffold.MethodGraph.Node> r1) {
                r0 = this;
                r0.<init>()
                r0.nodes = r1
                return
        }

        public net.bytebuddy.description.method.MethodList<?> asMethodList() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.List<? extends net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r1 = r3.nodes
                java.util.Iterator r1 = r1.iterator()
            Lf:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L23
                java.lang.Object r2 = r1.next()
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node r2 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Node) r2
                net.bytebuddy.description.method.MethodDescription r2 = r2.getRepresentative()
                r0.add(r2)
                goto Lf
            L23:
                net.bytebuddy.description.method.MethodList$Explicit r1 = new net.bytebuddy.description.method.MethodList$Explicit
                r1.<init>(r0)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Node get(int r2) {
                r1 = this;
                java.util.List<? extends net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r0 = r1.nodes
                java.lang.Object r2 = r0.get(r2)
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node r2 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Node) r2
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r0 = r1.nodes
                int r0 = r0.size()
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList wrap(java.util.List<net.bytebuddy.dynamic.scaffold.MethodGraph.Node> r2) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public /* bridge */ /* synthetic */ net.bytebuddy.matcher.FilterableList wrap(java.util.List<net.bytebuddy.dynamic.scaffold.MethodGraph.Node> r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r1 = r0.wrap(r1)
                return r1
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements net.bytebuddy.dynamic.scaffold.MethodGraph {
        private final java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription.SignatureToken, net.bytebuddy.dynamic.scaffold.MethodGraph.Node> nodes;

        public Simple(java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription.SignatureToken, net.bytebuddy.dynamic.scaffold.MethodGraph.Node> r1) {
                r0 = this;
                r0.<init>()
                r0.nodes = r1
                return
        }

        public static net.bytebuddy.dynamic.scaffold.MethodGraph of(java.util.List<? extends net.bytebuddy.description.method.MethodDescription> r4) {
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Iterator r4 = r4.iterator()
            L9:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r4.next()
                net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r1.asSignatureToken()
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Simple r3 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Simple
                r3.<init>(r1)
                r0.put(r2, r3)
                goto L9
            L22:
                net.bytebuddy.dynamic.scaffold.MethodGraph$Simple r4 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Simple
                r4.<init>(r0)
                return r4
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
                java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription$SignatureToken, net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r2 = r4.nodes
                net.bytebuddy.dynamic.scaffold.MethodGraph$Simple r5 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Simple) r5
                java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription$SignatureToken, net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r5 = r5.nodes
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
                java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription$SignatureToken, net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r1 = r2.nodes
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
        public net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList listNodes() {
                r3 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription$SignatureToken, net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r2 = r3.nodes
                java.util.Collection r2 = r2.values()
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Node locate(net.bytebuddy.description.method.MethodDescription.SignatureToken r2) {
                r1 = this;
                java.util.LinkedHashMap<net.bytebuddy.description.method.MethodDescription$SignatureToken, net.bytebuddy.dynamic.scaffold.MethodGraph$Node> r0 = r1.nodes
                java.lang.Object r2 = r0.get(r2)
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node r2 = (net.bytebuddy.dynamic.scaffold.MethodGraph.Node) r2
                if (r2 != 0) goto Lc
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Unresolved r2 = net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Unresolved.INSTANCE
            Lc:
                return r2
        }
    }

    net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList listNodes();

    net.bytebuddy.dynamic.scaffold.MethodGraph.Node locate(net.bytebuddy.description.method.MethodDescription.SignatureToken r1);
}
