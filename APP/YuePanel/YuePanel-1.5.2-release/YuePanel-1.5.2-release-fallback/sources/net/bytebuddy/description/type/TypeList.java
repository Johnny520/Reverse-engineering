package net.bytebuddy.description.type;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeList extends net.bytebuddy.matcher.FilterableList<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeList> {

    @net.bytebuddy.utility.nullability.AlwaysNull
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Null reference cannot be mutated.", value = {"MS_MUTABLE_ARRAY", "MS_OOI_PKGPROTECT"})
    public static final java.lang.String[] NO_INTERFACES = null;

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final net.bytebuddy.description.type.TypeList UNDEFINED = null;

    /* JADX INFO: renamed from: net.bytebuddy.description.type.TypeList$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract class AbstractBase extends net.bytebuddy.matcher.FilterableList.AbstractBase<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeList> implements net.bytebuddy.description.type.TypeList {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.type.TypeList
        public int getStackSize() {
                r1 = this;
                int r0 = net.bytebuddy.implementation.bytecode.StackSize.of(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeList
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.String[] toInternalNames() {
                r6 = this;
                int r0 = r6.size()
                java.lang.String[] r1 = new java.lang.String[r0]
                java.util.Iterator r2 = r6.iterator()
                r3 = 0
            Lb:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L21
                java.lang.Object r4 = r2.next()
                net.bytebuddy.description.type.TypeDescription r4 = (net.bytebuddy.description.type.TypeDescription) r4
                int r5 = r3 + 1
                java.lang.String r4 = r4.getInternalName()
                r1[r3] = r4
                r3 = r5
                goto Lb
            L21:
                if (r0 != 0) goto L25
                java.lang.String[] r1 = net.bytebuddy.description.type.TypeList.NO_INTERFACES
            L25:
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public net.bytebuddy.description.type.TypeList wrap(java.util.List<net.bytebuddy.description.type.TypeDescription> r2) {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Explicit r0 = new net.bytebuddy.description.type.TypeList$Explicit
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public /* bridge */ /* synthetic */ net.bytebuddy.matcher.FilterableList wrap(java.util.List<net.bytebuddy.description.type.TypeDescription> r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeList r1 = r0.wrap(r1)
                return r1
        }
    }

    public static class Empty extends net.bytebuddy.matcher.FilterableList.Empty<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeList> implements net.bytebuddy.description.type.TypeList {
        public Empty() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.type.TypeList
        public int getStackSize() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeList
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Value is null", value = {"EI_EXPOSE_REP"})
        public java.lang.String[] toInternalNames() {
                r1 = this;
                java.lang.String[] r0 = net.bytebuddy.description.type.TypeList.NO_INTERFACES
                return r0
        }
    }

    public static class Explicit extends net.bytebuddy.description.type.TypeList.AbstractBase {
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription> typeDescriptions;

        public Explicit(java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1) {
                r0 = this;
                r0.<init>()
                r0.typeDescriptions = r1
                return
        }

        public Explicit(net.bytebuddy.description.type.TypeDescription... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        public static net.bytebuddy.description.type.TypeList of(java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2) {
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r2.size()
                r0.<init>(r1)
                java.util.Iterator r2 = r2.iterator()
            Ld:
                boolean r1 = r2.hasNext()
                if (r1 == 0) goto L21
                java.lang.Object r1 = r2.next()
                net.bytebuddy.utility.JavaConstant r1 = (net.bytebuddy.utility.JavaConstant) r1
                net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeDescription()
                r0.add(r1)
                goto Ld
            L21:
                net.bytebuddy.description.type.TypeList$Explicit r2 = new net.bytebuddy.description.type.TypeList$Explicit
                r2.<init>(r0)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.type.TypeDescription get(int r2) {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r0 = r1.typeDescriptions
                java.lang.Object r2 = r0.get(r2)
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r0 = r1.typeDescriptions
                int r0 = r0.size()
                return r0
        }
    }

    public static class ForLoadedTypes extends net.bytebuddy.description.type.TypeList.AbstractBase {
        private final java.util.List<? extends java.lang.Class<?>> types;

        public ForLoadedTypes(java.util.List<? extends java.lang.Class<?>> r1) {
                r0 = this;
                r0.<init>()
                r0.types = r1
                return
        }

        public ForLoadedTypes(java.lang.Class<?>... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.type.TypeDescription get(int r2) {
                r1 = this;
                java.util.List<? extends java.lang.Class<?>> r0 = r1.types
                java.lang.Object r2 = r0.get(r2)
                java.lang.Class r2 = (java.lang.Class) r2
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends java.lang.Class<?>> r0 = r1.types
                int r0 = r0.size()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeList.AbstractBase, net.bytebuddy.description.type.TypeList
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.String[] toInternalNames() {
                r6 = this;
                java.util.List<? extends java.lang.Class<?>> r0 = r6.types
                int r0 = r0.size()
                java.lang.String[] r1 = new java.lang.String[r0]
                java.util.List<? extends java.lang.Class<?>> r2 = r6.types
                java.util.Iterator r2 = r2.iterator()
                r3 = 0
            Lf:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L25
                java.lang.Object r4 = r2.next()
                java.lang.Class r4 = (java.lang.Class) r4
                int r5 = r3 + 1
                java.lang.String r4 = net.bytebuddy.jar.asm.Type.getInternalName(r4)
                r1[r3] = r4
                r3 = r5
                goto Lf
            L25:
                if (r0 != 0) goto L29
                java.lang.String[] r1 = net.bytebuddy.description.type.TypeList.NO_INTERFACES
            L29:
                return r1
        }
    }

    public interface Generic extends net.bytebuddy.matcher.FilterableList<net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeList.Generic> {

        public static abstract class AbstractBase extends net.bytebuddy.matcher.FilterableList.AbstractBase<net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeList.Generic> implements net.bytebuddy.description.type.TypeList.Generic {
            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.type.TypeList.Generic accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r4) {
                    r3 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r3.size()
                    r0.<init>(r1)
                    java.util.Iterator r1 = r3.iterator()
                Ld:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L21
                    java.lang.Object r2 = r1.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    java.lang.Object r2 = r2.accept(r4)
                    r0.add(r2)
                    goto Ld
                L21:
                    net.bytebuddy.description.type.TypeList$Generic$Explicit r4 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                    r4.<init>(r0)
                    return r4
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.type.TypeList asErasures() {
                    r3 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r3.size()
                    r0.<init>(r1)
                    java.util.Iterator r1 = r3.iterator()
                Ld:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L21
                    java.lang.Object r2 = r1.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    r0.add(r2)
                    goto Ld
                L21:
                    net.bytebuddy.description.type.TypeList$Explicit r1 = new net.bytebuddy.description.type.TypeList$Explicit
                    r1.<init>(r0)
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.type.TypeList.Generic asRawTypes() {
                    r3 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r3.size()
                    r0.<init>(r1)
                    java.util.Iterator r1 = r3.iterator()
                Ld:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L21
                    java.lang.Object r2 = r1.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asRawType()
                    r0.add(r2)
                    goto Ld
                L21:
                    net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                    r1.<init>(r0)
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.type.TypeVariableToken> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r4) {
                    r3 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r3.size()
                    r0.<init>(r1)
                    java.util.Iterator r1 = r3.iterator()
                Ld:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L21
                    java.lang.Object r2 = r1.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    net.bytebuddy.description.type.TypeVariableToken r2 = net.bytebuddy.description.type.TypeVariableToken.of(r2, r4)
                    r0.add(r2)
                    goto Ld
                L21:
                    net.bytebuddy.description.ByteCodeElement$Token$TokenList r4 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                    r4.<init>(r0)
                    return r4
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic
            public int getStackSize() {
                    r3 = this;
                    java.util.Iterator r0 = r3.iterator()
                    r1 = 0
                L5:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L1b
                    java.lang.Object r2 = r0.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    net.bytebuddy.implementation.bytecode.StackSize r2 = r2.getStackSize()
                    int r2 = r2.getSize()
                    int r1 = r1 + r2
                    goto L5
                L1b:
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
            public net.bytebuddy.description.type.TypeList.Generic wrap(java.util.List<net.bytebuddy.description.type.TypeDescription.Generic> r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$Generic$Explicit r0 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                    r0.<init>(r2)
                    return r0
            }

            @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
            public /* bridge */ /* synthetic */ net.bytebuddy.matcher.FilterableList wrap(java.util.List<net.bytebuddy.description.type.TypeDescription.Generic> r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeList$Generic r1 = r0.wrap(r1)
                    return r1
            }
        }

        public static class Empty extends net.bytebuddy.matcher.FilterableList.Empty<net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeList.Generic> implements net.bytebuddy.description.type.TypeList.Generic {
            public Empty() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.type.TypeList.Generic accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeList$Generic$Empty r1 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                    r1.<init>()
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.type.TypeList asErasures() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$Empty r0 = new net.bytebuddy.description.type.TypeList$Empty
                    r0.<init>()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.type.TypeList.Generic asRawTypes() {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.type.TypeVariableToken> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2) {
                    r1 = this;
                    net.bytebuddy.description.ByteCodeElement$Token$TokenList r2 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                    r0 = 0
                    net.bytebuddy.description.type.TypeVariableToken[] r0 = new net.bytebuddy.description.type.TypeVariableToken[r0]
                    r2.<init>(r0)
                    return r2
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic
            public int getStackSize() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        public static class Explicit extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
            private final java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> typeDefinitions;

            public Explicit(java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.typeDefinitions = r1
                    return
            }

            public Explicit(net.bytebuddy.description.type.TypeDefinition... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    r0.<init>(r1)
                    return
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.type.TypeDescription.Generic get(int r2) {
                    r1 = this;
                    java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r0 = r1.typeDefinitions
                    java.lang.Object r2 = r0.get(r2)
                    net.bytebuddy.description.type.TypeDefinition r2 = (net.bytebuddy.description.type.TypeDefinition) r2
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                    return r2
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r0 = r1.typeDefinitions
                    int r0 = r0.size()
                    return r0
            }
        }

        public static class ForDetachedTypes extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
            private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> detachedTypes;
            private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

            public static class OfTypeVariables extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                private final java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> detachedTypeVariables;
                private final net.bytebuddy.description.TypeVariableSource typeVariableSource;
                private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

                public static class AttachedTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable {
                    private final net.bytebuddy.description.TypeVariableSource typeVariableSource;
                    private final net.bytebuddy.description.type.TypeVariableToken typeVariableToken;
                    private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

                    public AttachedTypeVariable(net.bytebuddy.description.TypeVariableSource r1, net.bytebuddy.description.type.TypeVariableToken r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                            r0 = this;
                            r0.<init>()
                            r0.typeVariableSource = r1
                            r0.typeVariableToken = r2
                            r0.visitor = r3
                            return
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeVariableToken r0 = r1.typeVariableToken
                            net.bytebuddy.description.annotation.AnnotationList r0 = r0.getAnnotations()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public java.lang.String getSymbol() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeVariableToken r0 = r1.typeVariableToken
                            java.lang.String r0 = r0.getSymbol()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                            r1 = this;
                            net.bytebuddy.description.TypeVariableSource r0 = r1.typeVariableSource
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                            r2 = this;
                            net.bytebuddy.description.type.TypeVariableToken r0 = r2.typeVariableToken
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.getBounds()
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.visitor
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.accept(r1)
                            return r0
                    }
                }

                public OfTypeVariables(net.bytebuddy.description.TypeVariableSource r1, java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                        r0 = this;
                        r0.<init>()
                        r0.typeVariableSource = r1
                        r0.detachedTypeVariables = r2
                        r0.visitor = r3
                        return
                }

                @Override // java.util.AbstractList, java.util.List
                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                        return r1
                }

                @Override // java.util.AbstractList, java.util.List
                public net.bytebuddy.description.type.TypeDescription.Generic get(int r4) {
                        r3 = this;
                        net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable
                        net.bytebuddy.description.TypeVariableSource r1 = r3.typeVariableSource
                        java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r2 = r3.detachedTypeVariables
                        java.lang.Object r4 = r2.get(r4)
                        net.bytebuddy.description.type.TypeVariableToken r4 = (net.bytebuddy.description.type.TypeVariableToken) r4
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r3.visitor
                        r0.<init>(r1, r4, r2)
                        return r0
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                        r1 = this;
                        java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r0 = r1.detachedTypeVariables
                        int r0 = r0.size()
                        return r0
                }
            }

            public static class WithResolvedErasure extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> detachedTypes;
                private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

                public WithResolvedErasure(java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r1, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r2) {
                        r0 = this;
                        r0.<init>()
                        r0.detachedTypes = r1
                        r0.visitor = r2
                        return
                }

                @Override // java.util.AbstractList, java.util.List
                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                        return r1
                }

                @Override // java.util.AbstractList, java.util.List
                public net.bytebuddy.description.type.TypeDescription.Generic get(int r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure
                        java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.detachedTypes
                        java.lang.Object r3 = r1.get(r3)
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.visitor
                        r0.<init>(r3, r1)
                        return r0
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                        r1 = this;
                        java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r0 = r1.detachedTypes
                        int r0 = r0.size()
                        return r0
                }
            }

            public ForDetachedTypes(java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r1, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.detachedTypes = r1
                    r0.visitor = r2
                    return
            }

            public static net.bytebuddy.description.type.TypeList.Generic attach(net.bytebuddy.description.field.FieldDescription r1, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r2) {
                    net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r1)
                    r0.<init>(r2, r1)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeList.Generic attach(net.bytebuddy.description.method.MethodDescription r1, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r2) {
                    net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r1)
                    r0.<init>(r2, r1)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeList.Generic attach(net.bytebuddy.description.method.ParameterDescription r1, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r2) {
                    net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r1)
                    r0.<init>(r2, r1)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeList.Generic attachVariables(net.bytebuddy.description.method.MethodDescription r2, java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r3) {
                    net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$OfTypeVariables r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$OfTypeVariables
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r2)
                    r0.<init>(r2, r3, r1)
                    return r0
            }

            public static net.bytebuddy.description.type.TypeList.Generic attachVariables(net.bytebuddy.description.type.TypeDescription r2, java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r3) {
                    net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$OfTypeVariables r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$OfTypeVariables
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r2)
                    r0.<init>(r2, r3, r1)
                    return r0
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.type.TypeDescription.Generic get(int r2) {
                    r1 = this;
                    java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r0 = r1.detachedTypes
                    java.lang.Object r2 = r0.get(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r0 = r1.visitor
                    java.lang.Object r2 = r2.accept(r0)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    return r2
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r0 = r1.detachedTypes
                    int r0 = r0.size()
                    return r0
            }
        }

        public static class ForLoadedTypes extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
            private final java.util.List<? extends java.lang.reflect.Type> types;

            public static class OfTypeVariables extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                private final java.util.List<java.lang.reflect.TypeVariable<?>> typeVariables;

                public OfTypeVariables(java.util.List<java.lang.reflect.TypeVariable<?>> r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeVariables = r1
                        return
                }

                public OfTypeVariables(java.lang.reflect.TypeVariable<?>... r1) {
                        r0 = this;
                        java.util.List r1 = java.util.Arrays.asList(r1)
                        r0.<init>(r1)
                        return
                }

                public static net.bytebuddy.description.type.TypeList.Generic of(java.lang.reflect.GenericDeclaration r1) {
                        net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes$OfTypeVariables r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes$OfTypeVariables
                        java.lang.reflect.TypeVariable[] r1 = r1.getTypeParameters()
                        r0.<init>(r1)
                        return r0
                }

                @Override // java.util.AbstractList, java.util.List
                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                        return r1
                }

                @Override // java.util.AbstractList, java.util.List
                public net.bytebuddy.description.type.TypeDescription.Generic get(int r2) {
                        r1 = this;
                        java.util.List<java.lang.reflect.TypeVariable<?>> r0 = r1.typeVariables
                        java.lang.Object r2 = r0.get(r2)
                        java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedTypeVariable r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedTypeVariable
                        r0.<init>(r2)
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2, r0)
                        return r2
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                        r1 = this;
                        java.util.List<java.lang.reflect.TypeVariable<?>> r0 = r1.typeVariables
                        int r0 = r0.size()
                        return r0
                }
            }

            public ForLoadedTypes(java.util.List<? extends java.lang.reflect.Type> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.types = r1
                    return
            }

            public ForLoadedTypes(java.lang.reflect.Type... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    r0.<init>(r1)
                    return
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.type.TypeDescription.Generic get(int r2) {
                    r1 = this;
                    java.util.List<? extends java.lang.reflect.Type> r0 = r1.types
                    java.lang.Object r2 = r0.get(r2)
                    java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                    return r2
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.util.List<? extends java.lang.reflect.Type> r0 = r1.types
                    int r0 = r0.size()
                    return r0
            }
        }

        public static class OfConstructorExceptionTypes extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
            private final java.lang.reflect.Constructor<?> constructor;

            public static class TypeProjection extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {
                private final java.lang.reflect.Constructor<?> constructor;
                private final java.lang.Class<?>[] erasure;
                private final int index;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;

                private TypeProjection(java.lang.reflect.Constructor<?> r1, int r2, java.lang.Class<?>[] r3) {
                        r0 = this;
                        r0.<init>()
                        r0.constructor = r1
                        r0.index = r2
                        r0.erasure = r3
                        return
                }

                public /* synthetic */ TypeProjection(java.lang.reflect.Constructor r1, int r2, java.lang.Class[] r3, net.bytebuddy.description.type.TypeList.AnonymousClass1 r4) {
                        r0 = this;
                        r0.<init>(r1, r2, r3)
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r2 = this;
                        java.lang.Class<?>[] r0 = r2.erasure
                        int r1 = r2.index
                        r0 = r0[r1]
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType
                        java.lang.reflect.Constructor<?> r1 = r3.constructor
                        int r2 = r3.index
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.resolved
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L23
                    L6:
                        java.lang.reflect.Constructor<?> r0 = r3.constructor
                        java.lang.reflect.Type[] r0 = r0.getGenericExceptionTypes()
                        java.lang.Class<?>[] r1 = r3.erasure
                        int r1 = r1.length
                        int r2 = r0.length
                        if (r1 != r2) goto L1f
                        int r1 = r3.index
                        r0 = r0[r1]
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r3.getAnnotationReader()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                        goto L23
                    L1f:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.asRawType()
                    L23:
                        if (r0 != 0) goto L28
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.resolved
                        goto L2a
                    L28:
                        r3.resolved = r0
                    L2a:
                        return r0
                }
            }

            public OfConstructorExceptionTypes(java.lang.reflect.Constructor<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.constructor = r1
                    return
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic.AbstractBase, net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.type.TypeList asErasures() {
                    r2 = this;
                    net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                    java.lang.reflect.Constructor<?> r1 = r2.constructor
                    java.lang.Class[] r1 = r1.getExceptionTypes()
                    r0.<init>(r1)
                    return r0
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.type.TypeDescription.Generic get(int r5) {
                    r4 = this;
                    net.bytebuddy.description.type.TypeList$Generic$OfConstructorExceptionTypes$TypeProjection r0 = new net.bytebuddy.description.type.TypeList$Generic$OfConstructorExceptionTypes$TypeProjection
                    java.lang.reflect.Constructor<?> r1 = r4.constructor
                    java.lang.Class[] r2 = r1.getExceptionTypes()
                    r3 = 0
                    r0.<init>(r1, r5, r2, r3)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.lang.reflect.Constructor<?> r0 = r1.constructor
                    java.lang.Class[] r0 = r0.getExceptionTypes()
                    int r0 = r0.length
                    return r0
            }
        }

        public static class OfLoadedInterfaceTypes extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
            private final java.lang.Class<?> type;

            public static class TypeProjection extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation.OfAnnotatedElement {
                private final java.lang.Class<?>[] erasure;
                private final int index;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;
                private final java.lang.Class<?> type;

                private TypeProjection(java.lang.Class<?> r1, int r2, java.lang.Class<?>[] r3) {
                        r0 = this;
                        r0.<init>()
                        r0.type = r1
                        r0.index = r2
                        r0.erasure = r3
                        return
                }

                public /* synthetic */ TypeProjection(java.lang.Class r1, int r2, java.lang.Class[] r3, net.bytebuddy.description.type.TypeList.AnonymousClass1 r4) {
                        r0 = this;
                        r0.<init>(r1, r2, r3)
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r2 = this;
                        java.lang.Class<?>[] r0 = r2.erasure
                        int r1 = r2.index
                        r0 = r0[r1]
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation.OfAnnotatedElement
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedInterface r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedInterface
                        java.lang.Class<?> r1 = r3.type
                        int r2 = r3.index
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.resolved
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L23
                    L6:
                        java.lang.Class<?> r0 = r3.type
                        java.lang.reflect.Type[] r0 = r0.getGenericInterfaces()
                        java.lang.Class<?>[] r1 = r3.erasure
                        int r1 = r1.length
                        int r2 = r0.length
                        if (r1 != r2) goto L1f
                        int r1 = r3.index
                        r0 = r0[r1]
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r3.getAnnotationReader()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                        goto L23
                    L1f:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.asRawType()
                    L23:
                        if (r0 != 0) goto L28
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.resolved
                        goto L2a
                    L28:
                        r3.resolved = r0
                    L2a:
                        return r0
                }
            }

            public OfLoadedInterfaceTypes(java.lang.Class<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.type = r1
                    return
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic.AbstractBase, net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.type.TypeList asErasures() {
                    r2 = this;
                    net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                    java.lang.Class<?> r1 = r2.type
                    java.lang.Class[] r1 = r1.getInterfaces()
                    r0.<init>(r1)
                    return r0
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.type.TypeDescription.Generic get(int r5) {
                    r4 = this;
                    net.bytebuddy.description.type.TypeList$Generic$OfLoadedInterfaceTypes$TypeProjection r0 = new net.bytebuddy.description.type.TypeList$Generic$OfLoadedInterfaceTypes$TypeProjection
                    java.lang.Class<?> r1 = r4.type
                    java.lang.Class[] r2 = r1.getInterfaces()
                    r3 = 0
                    r0.<init>(r1, r5, r2, r3)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.lang.Class<?> r0 = r1.type
                    java.lang.Class[] r0 = r0.getInterfaces()
                    int r0 = r0.length
                    return r0
            }
        }

        public static class OfMethodExceptionTypes extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
            private final java.lang.reflect.Method method;

            public static class TypeProjection extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {
                private final java.lang.Class<?>[] erasure;
                private final int index;
                private final java.lang.reflect.Method method;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;

                public TypeProjection(java.lang.reflect.Method r1, int r2, java.lang.Class<?>[] r3) {
                        r0 = this;
                        r0.<init>()
                        r0.method = r1
                        r0.index = r2
                        r0.erasure = r3
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r2 = this;
                        java.lang.Class<?>[] r0 = r2.erasure
                        int r1 = r2.index
                        r0 = r0[r1]
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                public net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType
                        java.lang.reflect.Method r1 = r3.method
                        int r2 = r3.index
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.resolved
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L23
                    L6:
                        java.lang.reflect.Method r0 = r3.method
                        java.lang.reflect.Type[] r0 = r0.getGenericExceptionTypes()
                        java.lang.Class<?>[] r1 = r3.erasure
                        int r1 = r1.length
                        int r2 = r0.length
                        if (r1 != r2) goto L1f
                        int r1 = r3.index
                        r0 = r0[r1]
                        net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader r1 = r3.getAnnotationReader()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r0, r1)
                        goto L23
                    L1f:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.asRawType()
                    L23:
                        if (r0 != 0) goto L28
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.resolved
                        goto L2a
                    L28:
                        r3.resolved = r0
                    L2a:
                        return r0
                }
            }

            public OfMethodExceptionTypes(java.lang.reflect.Method r1) {
                    r0 = this;
                    r0.<init>()
                    r0.method = r1
                    return
            }

            @Override // net.bytebuddy.description.type.TypeList.Generic.AbstractBase, net.bytebuddy.description.type.TypeList.Generic
            public net.bytebuddy.description.type.TypeList asErasures() {
                    r2 = this;
                    net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                    java.lang.reflect.Method r1 = r2.method
                    java.lang.Class[] r1 = r1.getExceptionTypes()
                    r0.<init>(r1)
                    return r0
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.type.TypeDescription.Generic get(int r4) {
                    r3 = this;
                    net.bytebuddy.description.type.TypeList$Generic$OfMethodExceptionTypes$TypeProjection r0 = new net.bytebuddy.description.type.TypeList$Generic$OfMethodExceptionTypes$TypeProjection
                    java.lang.reflect.Method r1 = r3.method
                    java.lang.Class[] r2 = r1.getExceptionTypes()
                    r0.<init>(r1, r4, r2)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.lang.reflect.Method r0 = r1.method
                    java.lang.Class[] r0 = r0.getExceptionTypes()
                    int r0 = r0.length
                    return r0
            }
        }

        net.bytebuddy.description.type.TypeList.Generic accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r1);

        net.bytebuddy.description.type.TypeList asErasures();

        net.bytebuddy.description.type.TypeList.Generic asRawTypes();

        net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.type.TypeVariableToken> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1);

        int getStackSize();
    }

    static {
            return
    }

    int getStackSize();

    @net.bytebuddy.utility.nullability.MaybeNull
    java.lang.String[] toInternalNames();
}
