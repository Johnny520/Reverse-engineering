package net.bytebuddy.description.field;

import net.bytebuddy.description.field.FieldDescription;

/* JADX INFO: loaded from: classes2.dex */
public interface FieldList<T extends net.bytebuddy.description.field.FieldDescription> extends net.bytebuddy.matcher.FilterableList<T, net.bytebuddy.description.field.FieldList<T>> {

    public static abstract class AbstractBase<S extends net.bytebuddy.description.field.FieldDescription> extends net.bytebuddy.matcher.FilterableList.AbstractBase<S, net.bytebuddy.description.field.FieldList<S>> implements net.bytebuddy.description.field.FieldList<S> {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.field.FieldList
        public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> asDefined() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.field.FieldList$Explicit r1 = new net.bytebuddy.description.field.FieldList$Explicit
                r1.<init>(r0)
                return r1
        }

        @Override // net.bytebuddy.description.field.FieldList
        public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.field.FieldDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r4) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r3.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.description.ByteCodeElement$Token r2 = r2.asToken(r4)
                r0.add(r2)
                goto Ld
            L21:
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r4 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                r4.<init>(r0)
                return r4
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public net.bytebuddy.description.field.FieldList<S> wrap(java.util.List<S> r2) {
                r1 = this;
                net.bytebuddy.description.field.FieldList$Explicit r0 = new net.bytebuddy.description.field.FieldList$Explicit
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public /* bridge */ /* synthetic */ net.bytebuddy.matcher.FilterableList wrap(java.util.List r1) {
                r0 = this;
                net.bytebuddy.description.field.FieldList r1 = r0.wrap(r1)
                return r1
        }
    }

    public static class Empty<S extends net.bytebuddy.description.field.FieldDescription> extends net.bytebuddy.matcher.FilterableList.Empty<S, net.bytebuddy.description.field.FieldList<S>> implements net.bytebuddy.description.field.FieldList<S> {
        public Empty() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.field.FieldList
        public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> asDefined() {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.description.field.FieldList
        public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.field.FieldDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2) {
                r1 = this;
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r2 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                r0 = 0
                net.bytebuddy.description.field.FieldDescription$Token[] r0 = new net.bytebuddy.description.field.FieldDescription.Token[r0]
                r2.<init>(r0)
                return r2
        }
    }

    public static class Explicit<S extends net.bytebuddy.description.field.FieldDescription> extends net.bytebuddy.description.field.FieldList.AbstractBase<S> {
        private final java.util.List<? extends S> fieldDescriptions;

        public Explicit(java.util.List<? extends S> r1) {
                r0 = this;
                r0.<init>()
                r0.fieldDescriptions = r1
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
                net.bytebuddy.description.field.FieldDescription r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public S get(int r2) {
                r1 = this;
                java.util.List<? extends S extends net.bytebuddy.description.field.FieldDescription> r0 = r1.fieldDescriptions
                java.lang.Object r2 = r0.get(r2)
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends S extends net.bytebuddy.description.field.FieldDescription> r0 = r1.fieldDescriptions
                int r0 = r0.size()
                return r0
        }
    }

    public static class ForLoadedFields extends net.bytebuddy.description.field.FieldList.AbstractBase<net.bytebuddy.description.field.FieldDescription.InDefinedShape> {
        private final java.util.List<? extends java.lang.reflect.Field> fields;

        public ForLoadedFields(java.util.List<? extends java.lang.reflect.Field> r1) {
                r0 = this;
                r0.<init>()
                r0.fields = r1
                return
        }

        public ForLoadedFields(java.lang.reflect.Field... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.field.FieldDescription.InDefinedShape get(int r3) {
                r2 = this;
                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                java.util.List<? extends java.lang.reflect.Field> r1 = r2.fields
                java.lang.Object r3 = r1.get(r3)
                java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
                r0.<init>(r3)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends java.lang.reflect.Field> r0 = r1.fields
                int r0 = r0.size()
                return r0
        }
    }

    public static class ForTokens extends net.bytebuddy.description.field.FieldList.AbstractBase<net.bytebuddy.description.field.FieldDescription.InDefinedShape> {
        private final net.bytebuddy.description.type.TypeDescription declaringType;
        private final java.util.List<? extends net.bytebuddy.description.field.FieldDescription.Token> tokens;

        public ForTokens(net.bytebuddy.description.type.TypeDescription r1, java.util.List<? extends net.bytebuddy.description.field.FieldDescription.Token> r2) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.tokens = r2
                return
        }

        public ForTokens(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.field.FieldDescription.Token... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.field.FieldDescription.InDefinedShape get(int r4) {
                r3 = this;
                net.bytebuddy.description.field.FieldDescription$Latent r0 = new net.bytebuddy.description.field.FieldDescription$Latent
                net.bytebuddy.description.type.TypeDescription r1 = r3.declaringType
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r2 = r3.tokens
                java.lang.Object r4 = r2.get(r4)
                net.bytebuddy.description.field.FieldDescription$Token r4 = (net.bytebuddy.description.field.FieldDescription.Token) r4
                r0.<init>(r1, r4)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r0 = r1.tokens
                int r0 = r0.size()
                return r0
        }
    }

    public static class TypeSubstituting extends net.bytebuddy.description.field.FieldList.AbstractBase<net.bytebuddy.description.field.FieldDescription.InGenericShape> {
        private final net.bytebuddy.description.type.TypeDescription.Generic declaringType;
        private final java.util.List<? extends net.bytebuddy.description.field.FieldDescription> fieldDescriptions;
        private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

        public TypeSubstituting(net.bytebuddy.description.type.TypeDescription.Generic r1, java.util.List<? extends net.bytebuddy.description.field.FieldDescription> r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.fieldDescriptions = r2
                r0.visitor = r3
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription$InGenericShape r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public net.bytebuddy.description.field.FieldDescription.InGenericShape get(int r4) {
                r3 = this;
                net.bytebuddy.description.field.FieldDescription$TypeSubstituting r0 = new net.bytebuddy.description.field.FieldDescription$TypeSubstituting
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.declaringType
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription> r2 = r3.fieldDescriptions
                java.lang.Object r4 = r2.get(r4)
                net.bytebuddy.description.field.FieldDescription r4 = (net.bytebuddy.description.field.FieldDescription) r4
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r3.visitor
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription> r0 = r1.fieldDescriptions
                int r0 = r0.size()
                return r0
        }
    }

    net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> asDefined();

    net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.field.FieldDescription.Token> asTokenList(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1);
}
