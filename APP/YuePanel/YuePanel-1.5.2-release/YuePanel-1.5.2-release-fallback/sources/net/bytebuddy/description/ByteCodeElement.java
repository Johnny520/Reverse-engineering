package net.bytebuddy.description;

/* JADX INFO: loaded from: classes2.dex */
public interface ByteCodeElement extends net.bytebuddy.description.NamedElement.WithRuntimeName, net.bytebuddy.description.NamedElement.WithDescriptor, net.bytebuddy.description.ModifierReviewable.OfByteCodeElement, net.bytebuddy.description.DeclaredByType, net.bytebuddy.description.annotation.AnnotationSource {

    public interface Member extends net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.ByteCodeElement, net.bytebuddy.description.NamedElement.WithGenericName {
    }

    public interface Token<T extends net.bytebuddy.description.ByteCodeElement.Token<T>> {

        public static class TokenList<S extends net.bytebuddy.description.ByteCodeElement.Token<S>> extends net.bytebuddy.matcher.FilterableList.AbstractBase<S, net.bytebuddy.description.ByteCodeElement.Token.TokenList<S>> {
            private final java.util.List<? extends S> tokens;

            public TokenList(java.util.List<? extends S> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.tokens = r1
                    return
            }

            public TokenList(S... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    r0.<init>(r1)
                    return
            }

            public net.bytebuddy.description.ByteCodeElement.Token.TokenList<S> accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r4) {
                    r3 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    java.util.List<? extends S extends net.bytebuddy.description.ByteCodeElement$Token<S>> r1 = r3.tokens
                    int r1 = r1.size()
                    r0.<init>(r1)
                    java.util.List<? extends S extends net.bytebuddy.description.ByteCodeElement$Token<S>> r1 = r3.tokens
                    java.util.Iterator r1 = r1.iterator()
                L11:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L25
                    java.lang.Object r2 = r1.next()
                    net.bytebuddy.description.ByteCodeElement$Token r2 = (net.bytebuddy.description.ByteCodeElement.Token) r2
                    net.bytebuddy.description.ByteCodeElement$Token r2 = r2.accept(r4)
                    r0.add(r2)
                    goto L11
                L25:
                    net.bytebuddy.description.ByteCodeElement$Token$TokenList r4 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                    r4.<init>(r0)
                    return r4
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.ByteCodeElement$Token r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public S get(int r2) {
                    r1 = this;
                    java.util.List<? extends S extends net.bytebuddy.description.ByteCodeElement$Token<S>> r0 = r1.tokens
                    java.lang.Object r2 = r0.get(r2)
                    net.bytebuddy.description.ByteCodeElement$Token r2 = (net.bytebuddy.description.ByteCodeElement.Token) r2
                    return r2
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.util.List<? extends S extends net.bytebuddy.description.ByteCodeElement$Token<S>> r0 = r1.tokens
                    int r0 = r0.size()
                    return r0
            }

            @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
            public net.bytebuddy.description.ByteCodeElement.Token.TokenList<S> wrap(java.util.List<S> r2) {
                    r1 = this;
                    net.bytebuddy.description.ByteCodeElement$Token$TokenList r0 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                    r0.<init>(r2)
                    return r0
            }

            @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
            public /* bridge */ /* synthetic */ net.bytebuddy.matcher.FilterableList wrap(java.util.List r1) {
                    r0 = this;
                    net.bytebuddy.description.ByteCodeElement$Token$TokenList r1 = r0.wrap(r1)
                    return r1
            }
        }

        T accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r1);
    }

    public interface TypeDependant<T extends net.bytebuddy.description.ByteCodeElement.TypeDependant<?, S>, S extends net.bytebuddy.description.ByteCodeElement.Token<S>> {
        T asDefined();

        S asToken(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1);
    }

    boolean isAccessibleTo(net.bytebuddy.description.type.TypeDescription r1);

    boolean isVisibleTo(net.bytebuddy.description.type.TypeDescription r1);
}
