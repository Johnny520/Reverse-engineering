package net.bytebuddy.description.type;

import net.bytebuddy.description.type.RecordComponentDescription;

/* JADX INFO: loaded from: classes2.dex */
public interface RecordComponentList<T extends net.bytebuddy.description.type.RecordComponentDescription> extends net.bytebuddy.matcher.FilterableList<T, net.bytebuddy.description.type.RecordComponentList<T>> {

    public static abstract class AbstractBase<S extends net.bytebuddy.description.type.RecordComponentDescription> extends net.bytebuddy.matcher.FilterableList.AbstractBase<S, net.bytebuddy.description.type.RecordComponentList<S>> implements net.bytebuddy.description.type.RecordComponentList<S> {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.type.RecordComponentList
        public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> asDefined() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.type.RecordComponentDescription r2 = (net.bytebuddy.description.type.RecordComponentDescription) r2
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.type.RecordComponentList$Explicit r1 = new net.bytebuddy.description.type.RecordComponentList$Explicit
                r1.<init>(r0)
                return r1
        }

        @Override // net.bytebuddy.description.type.RecordComponentList
        public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.type.RecordComponentDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r4) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.type.RecordComponentDescription r2 = (net.bytebuddy.description.type.RecordComponentDescription) r2
                net.bytebuddy.description.type.RecordComponentDescription$Token r2 = r2.asToken(r4)
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r4 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                r4.<init>(r0)
                return r4
        }

        @Override // net.bytebuddy.description.type.RecordComponentList
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
                net.bytebuddy.description.type.RecordComponentDescription r2 = (net.bytebuddy.description.type.RecordComponentDescription) r2
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                r1.<init>(r0)
                return r1
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public net.bytebuddy.description.type.RecordComponentList<S> wrap(java.util.List<S> r2) {
                r1 = this;
                net.bytebuddy.description.type.RecordComponentList$Explicit r0 = new net.bytebuddy.description.type.RecordComponentList$Explicit
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public /* bridge */ /* synthetic */ net.bytebuddy.matcher.FilterableList wrap(java.util.List r1) {
                r0 = this;
                net.bytebuddy.description.type.RecordComponentList r1 = r0.wrap(r1)
                return r1
        }
    }

    public static class Empty<S extends net.bytebuddy.description.type.RecordComponentDescription> extends net.bytebuddy.matcher.FilterableList.Empty<S, net.bytebuddy.description.type.RecordComponentList<S>> implements net.bytebuddy.description.type.RecordComponentList<S> {
        public Empty() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.type.RecordComponentList
        public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> asDefined() {
                r1 = this;
                net.bytebuddy.description.type.RecordComponentList$Empty r0 = new net.bytebuddy.description.type.RecordComponentList$Empty
                r0.<init>()
                return r0
        }

        @Override // net.bytebuddy.description.type.RecordComponentList
        public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.type.RecordComponentDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2) {
                r1 = this;
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r2 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                r0 = 0
                net.bytebuddy.description.type.RecordComponentDescription$Token[] r0 = new net.bytebuddy.description.type.RecordComponentDescription.Token[r0]
                r2.<init>(r0)
                return r2
        }

        @Override // net.bytebuddy.description.type.RecordComponentList
        public net.bytebuddy.description.type.TypeList.Generic asTypeList() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                r0.<init>()
                return r0
        }
    }

    public static class Explicit<S extends net.bytebuddy.description.type.RecordComponentDescription> extends net.bytebuddy.description.type.RecordComponentList.AbstractBase<S> {
        private final java.util.List<? extends S> recordComponents;

        public Explicit(java.util.List<? extends S> r1) {
                r0 = this;
                r0.<init>()
                r0.recordComponents = r1
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
                net.bytebuddy.description.type.RecordComponentDescription r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public S get(int r2) {
                r1 = this;
                java.util.List<? extends S extends net.bytebuddy.description.type.RecordComponentDescription> r0 = r1.recordComponents
                java.lang.Object r2 = r0.get(r2)
                net.bytebuddy.description.type.RecordComponentDescription r2 = (net.bytebuddy.description.type.RecordComponentDescription) r2
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends S extends net.bytebuddy.description.type.RecordComponentDescription> r0 = r1.recordComponents
                int r0 = r0.size()
                return r0
        }
    }

    public static class ForLoadedRecordComponents extends net.bytebuddy.description.type.RecordComponentList.AbstractBase<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> {
        private final java.util.List<?> recordComponents;

        public ForLoadedRecordComponents(java.util.List<?> r1) {
                r0 = this;
                r0.<init>()
                r0.recordComponents = r1
                return
        }

        public ForLoadedRecordComponents(java.lang.Object... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape get(int r3) {
                r2 = this;
                net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent r0 = new net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent
                java.util.List<?> r1 = r2.recordComponents
                java.lang.Object r3 = r1.get(r3)
                java.lang.reflect.AnnotatedElement r3 = (java.lang.reflect.AnnotatedElement) r3
                r0.<init>(r3)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<?> r0 = r1.recordComponents
                int r0 = r0.size()
                return r0
        }
    }

    public static class ForTokens extends net.bytebuddy.description.type.RecordComponentList.AbstractBase<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> {
        private final java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription.Token> tokens;
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        public ForTokens(net.bytebuddy.description.type.TypeDescription r1, java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription.Token> r2) {
                r0 = this;
                r0.<init>()
                r0.typeDescription = r1
                r0.tokens = r2
                return
        }

        public ForTokens(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.RecordComponentDescription.Token... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape get(int r4) {
                r3 = this;
                net.bytebuddy.description.type.RecordComponentDescription$Latent r0 = new net.bytebuddy.description.type.RecordComponentDescription$Latent
                net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r2 = r3.tokens
                java.lang.Object r4 = r2.get(r4)
                net.bytebuddy.description.type.RecordComponentDescription$Token r4 = (net.bytebuddy.description.type.RecordComponentDescription.Token) r4
                r0.<init>(r1, r4)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r0 = r1.tokens
                int r0 = r0.size()
                return r0
        }
    }

    public static class TypeSubstituting extends net.bytebuddy.description.type.RecordComponentList.AbstractBase<net.bytebuddy.description.type.RecordComponentDescription.InGenericShape> {
        private final net.bytebuddy.description.type.TypeDescription.Generic declaringType;
        private final java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription> recordComponentDescriptions;
        private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

        public TypeSubstituting(net.bytebuddy.description.type.TypeDescription.Generic r1, java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription> r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.recordComponentDescriptions = r2
                r0.visitor = r3
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.type.RecordComponentDescription$InGenericShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.type.RecordComponentDescription.InGenericShape get(int r4) {
                r3 = this;
                net.bytebuddy.description.type.RecordComponentDescription$TypeSubstituting r0 = new net.bytebuddy.description.type.RecordComponentDescription$TypeSubstituting
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.declaringType
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription> r2 = r3.recordComponentDescriptions
                java.lang.Object r4 = r2.get(r4)
                net.bytebuddy.description.type.RecordComponentDescription r4 = (net.bytebuddy.description.type.RecordComponentDescription) r4
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r3.visitor
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription> r0 = r1.recordComponentDescriptions
                int r0 = r0.size()
                return r0
        }
    }

    net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> asDefined();

    net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.type.RecordComponentDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1);

    net.bytebuddy.description.type.TypeList.Generic asTypeList();
}
