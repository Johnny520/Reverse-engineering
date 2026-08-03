package net.bytebuddy.description.method;

import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodList<T extends net.bytebuddy.description.method.MethodDescription> extends net.bytebuddy.matcher.FilterableList<T, net.bytebuddy.description.method.MethodList<T>> {

    public static abstract class AbstractBase<S extends net.bytebuddy.description.method.MethodDescription> extends net.bytebuddy.matcher.FilterableList.AbstractBase<S, net.bytebuddy.description.method.MethodList<S>> implements net.bytebuddy.description.method.MethodList<S> {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.method.MethodList
        public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> asDefined() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.method.MethodList$Explicit r1 = new net.bytebuddy.description.method.MethodList$Explicit
                r1.<init>(r0)
                return r1
        }

        @Override // net.bytebuddy.description.method.MethodList
        public java.util.List<net.bytebuddy.description.method.MethodDescription.SignatureToken> asSignatureTokenList() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r2.asSignatureToken()
                r0.add(r2)
                goto Ld
            L21:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodList
        public java.util.List<net.bytebuddy.description.method.MethodDescription.SignatureToken> asSignatureTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r4, net.bytebuddy.description.type.TypeDescription r5) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L27
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.description.ByteCodeElement$Token r2 = r2.asToken(r4)
                net.bytebuddy.description.method.MethodDescription$Token r2 = (net.bytebuddy.description.method.MethodDescription.Token) r2
                net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r2.asSignatureToken(r5)
                r0.add(r2)
                goto Ld
            L27:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodList
        public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.method.MethodDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r4) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.description.ByteCodeElement$Token r2 = r2.asToken(r4)
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r4 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                r4.<init>(r0)
                return r4
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public net.bytebuddy.description.method.MethodList<S> wrap(java.util.List<S> r2) {
                r1 = this;
                net.bytebuddy.description.method.MethodList$Explicit r0 = new net.bytebuddy.description.method.MethodList$Explicit
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public /* bridge */ /* synthetic */ net.bytebuddy.matcher.FilterableList wrap(java.util.List r1) {
                r0 = this;
                net.bytebuddy.description.method.MethodList r1 = r0.wrap(r1)
                return r1
        }
    }

    public static class Empty<S extends net.bytebuddy.description.method.MethodDescription> extends net.bytebuddy.matcher.FilterableList.Empty<S, net.bytebuddy.description.method.MethodList<S>> implements net.bytebuddy.description.method.MethodList<S> {
        public Empty() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.method.MethodList
        public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> asDefined() {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodList
        public java.util.List<net.bytebuddy.description.method.MethodDescription.SignatureToken> asSignatureTokenList() {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodList
        public java.util.List<net.bytebuddy.description.method.MethodDescription.SignatureToken> asSignatureTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                java.util.List r1 = java.util.Collections.emptyList()
                return r1
        }

        @Override // net.bytebuddy.description.method.MethodList
        public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.method.MethodDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2) {
                r1 = this;
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r2 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                r0 = 0
                net.bytebuddy.description.method.MethodDescription$Token[] r0 = new net.bytebuddy.description.method.MethodDescription.Token[r0]
                r2.<init>(r0)
                return r2
        }
    }

    public static class Explicit<S extends net.bytebuddy.description.method.MethodDescription> extends net.bytebuddy.description.method.MethodList.AbstractBase<S> {
        private final java.util.List<? extends S> methodDescriptions;

        public Explicit(java.util.List<? extends S> r1) {
                r0 = this;
                r0.<init>()
                r0.methodDescriptions = r1
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
                net.bytebuddy.description.method.MethodDescription r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public S get(int r2) {
                r1 = this;
                java.util.List<? extends S extends net.bytebuddy.description.method.MethodDescription> r0 = r1.methodDescriptions
                java.lang.Object r2 = r0.get(r2)
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends S extends net.bytebuddy.description.method.MethodDescription> r0 = r1.methodDescriptions
                int r0 = r0.size()
                return r0
        }
    }

    public static class ForLoadedMethods extends net.bytebuddy.description.method.MethodList.AbstractBase<net.bytebuddy.description.method.MethodDescription.InDefinedShape> {
        private final java.util.List<? extends java.lang.reflect.Constructor<?>> constructors;
        private final java.util.List<? extends java.lang.reflect.Method> methods;

        public ForLoadedMethods(java.lang.Class<?> r4) {
                r3 = this;
                net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.getCurrent()
                java.lang.reflect.Constructor[] r1 = r4.getDeclaredConstructors()
                net.bytebuddy.utility.ConstructorComparator r2 = net.bytebuddy.utility.ConstructorComparator.INSTANCE
                java.lang.Object[] r0 = r0.sorted(r1, r2)
                java.lang.reflect.Constructor[] r0 = (java.lang.reflect.Constructor[]) r0
                net.bytebuddy.utility.GraalImageCode r1 = net.bytebuddy.utility.GraalImageCode.getCurrent()
                java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
                net.bytebuddy.utility.MethodComparator r2 = net.bytebuddy.utility.MethodComparator.INSTANCE
                java.lang.Object[] r4 = r1.sorted(r4, r2)
                java.lang.reflect.Method[] r4 = (java.lang.reflect.Method[]) r4
                r3.<init>(r0, r4)
                return
        }

        public ForLoadedMethods(java.util.List<? extends java.lang.reflect.Constructor<?>> r1, java.util.List<? extends java.lang.reflect.Method> r2) {
                r0 = this;
                r0.<init>()
                r0.constructors = r1
                r0.methods = r2
                return
        }

        public ForLoadedMethods(java.lang.reflect.Constructor<?>[] r1, java.lang.reflect.Method[] r2) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                java.util.List r2 = java.util.Arrays.asList(r2)
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape get(int r4) {
                r3 = this;
                java.util.List<? extends java.lang.reflect.Constructor<?>> r0 = r3.constructors
                int r0 = r0.size()
                if (r4 >= r0) goto L16
                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                java.util.List<? extends java.lang.reflect.Constructor<?>> r1 = r3.constructors
                java.lang.Object r4 = r1.get(r4)
                java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
                r0.<init>(r4)
                goto L2a
            L16:
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                java.util.List<? extends java.lang.reflect.Method> r1 = r3.methods
                java.util.List<? extends java.lang.reflect.Constructor<?>> r2 = r3.constructors
                int r2 = r2.size()
                int r4 = r4 - r2
                java.lang.Object r4 = r1.get(r4)
                java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
                r0.<init>(r4)
            L2a:
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r2 = this;
                java.util.List<? extends java.lang.reflect.Constructor<?>> r0 = r2.constructors
                int r0 = r0.size()
                java.util.List<? extends java.lang.reflect.Method> r1 = r2.methods
                int r1 = r1.size()
                int r0 = r0 + r1
                return r0
        }
    }

    public static class ForTokens extends net.bytebuddy.description.method.MethodList.AbstractBase<net.bytebuddy.description.method.MethodDescription.InDefinedShape> {
        private final net.bytebuddy.description.type.TypeDescription declaringType;
        private final java.util.List<? extends net.bytebuddy.description.method.MethodDescription.Token> tokens;

        public ForTokens(net.bytebuddy.description.type.TypeDescription r1, java.util.List<? extends net.bytebuddy.description.method.MethodDescription.Token> r2) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.tokens = r2
                return
        }

        public ForTokens(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription.Token... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape get(int r4) {
                r3 = this;
                net.bytebuddy.description.method.MethodDescription$Latent r0 = new net.bytebuddy.description.method.MethodDescription$Latent
                net.bytebuddy.description.type.TypeDescription r1 = r3.declaringType
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r2 = r3.tokens
                java.lang.Object r4 = r2.get(r4)
                net.bytebuddy.description.method.MethodDescription$Token r4 = (net.bytebuddy.description.method.MethodDescription.Token) r4
                r0.<init>(r1, r4)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r0 = r1.tokens
                int r0 = r0.size()
                return r0
        }
    }

    public static class TypeSubstituting extends net.bytebuddy.description.method.MethodList.AbstractBase<net.bytebuddy.description.method.MethodDescription.InGenericShape> {
        protected final net.bytebuddy.description.type.TypeDescription.Generic declaringType;
        protected final java.util.List<? extends net.bytebuddy.description.method.MethodDescription> methodDescriptions;
        protected final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

        public TypeSubstituting(net.bytebuddy.description.type.TypeDescription.Generic r1, java.util.List<? extends net.bytebuddy.description.method.MethodDescription> r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.methodDescriptions = r2
                r0.visitor = r3
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.method.MethodDescription$InGenericShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.method.MethodDescription.InGenericShape get(int r4) {
                r3 = this;
                net.bytebuddy.description.method.MethodDescription$TypeSubstituting r0 = new net.bytebuddy.description.method.MethodDescription$TypeSubstituting
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.declaringType
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription> r2 = r3.methodDescriptions
                java.lang.Object r4 = r2.get(r4)
                net.bytebuddy.description.method.MethodDescription r4 = (net.bytebuddy.description.method.MethodDescription) r4
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r3.visitor
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription> r0 = r1.methodDescriptions
                int r0 = r0.size()
                return r0
        }
    }

    net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> asDefined();

    java.util.List<net.bytebuddy.description.method.MethodDescription.SignatureToken> asSignatureTokenList();

    java.util.List<net.bytebuddy.description.method.MethodDescription.SignatureToken> asSignatureTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1, net.bytebuddy.description.type.TypeDescription r2);

    net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.method.MethodDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1);
}
