package net.bytebuddy.description.field;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.description.ByteCodeElement;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.FilterableList;

/* JADX INFO: loaded from: classes2.dex */
public interface FieldList<T extends FieldDescription> extends FilterableList<T, FieldList<T>> {

    public static abstract class AbstractBase<S extends FieldDescription> extends FilterableList.AbstractBase<S, FieldList<S>> implements FieldList<S> {
        @Override // net.bytebuddy.description.field.FieldList
        public FieldList<FieldDescription.InDefinedShape> asDefined() {
            ArrayList arrayList = new ArrayList(size());
            Iterator<S> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().asDefined());
            }
            return new Explicit(arrayList);
        }

        @Override // net.bytebuddy.description.field.FieldList
        public ByteCodeElement.Token.TokenList<FieldDescription.Token> asTokenList(ElementMatcher<? super TypeDescription> elementMatcher) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<S> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().asToken(elementMatcher));
            }
            return new ByteCodeElement.Token.TokenList<>(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: wrap(Ljava/util/List;)Lnet/bytebuddy/matcher/FilterableList; */
        @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
        public FieldList<S> wrap(List<S> list) {
            return new Explicit(list);
        }
    }

    public static class Empty<S extends FieldDescription> extends FilterableList.Empty<S, FieldList<S>> implements FieldList<S> {
        @Override // net.bytebuddy.description.field.FieldList
        public FieldList<FieldDescription.InDefinedShape> asDefined() {
            return this;
        }

        @Override // net.bytebuddy.description.field.FieldList
        public ByteCodeElement.Token.TokenList<FieldDescription.Token> asTokenList(ElementMatcher<? super TypeDescription> elementMatcher) {
            return new ByteCodeElement.Token.TokenList<>(new FieldDescription.Token[0]);
        }
    }

    public static class Explicit<S extends FieldDescription> extends AbstractBase<S> {
        private final List<? extends S> fieldDescriptions;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Explicit(S... sArr) {
            this(Arrays.asList(sArr));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fieldDescriptions.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Explicit(List<? extends S> list) {
            this.fieldDescriptions = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // java.util.AbstractList, java.util.List
        public S get(int i) {
            return this.fieldDescriptions.get(i);
        }
    }

    public static class ForLoadedFields extends AbstractBase<FieldDescription.InDefinedShape> {
        private final List<? extends Field> fields;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ForLoadedFields(Field... fieldArr) {
            this((List<? extends Field>) Arrays.asList(fieldArr));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fields.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ForLoadedFields(List<? extends Field> list) {
            this.fields = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // java.util.AbstractList, java.util.List
        public FieldDescription.InDefinedShape get(int i) {
            return new FieldDescription.ForLoadedField(this.fields.get(i));
        }
    }

    public static class ForTokens extends AbstractBase<FieldDescription.InDefinedShape> {
        private final TypeDescription declaringType;
        private final List<? extends FieldDescription.Token> tokens;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ForTokens(TypeDescription typeDescription, FieldDescription.Token... tokenArr) {
            this(typeDescription, (List<? extends FieldDescription.Token>) Arrays.asList(tokenArr));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.tokens.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ForTokens(TypeDescription typeDescription, List<? extends FieldDescription.Token> list) {
            this.declaringType = typeDescription;
            this.tokens = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // java.util.AbstractList, java.util.List
        public FieldDescription.InDefinedShape get(int i) {
            return new FieldDescription.Latent(this.declaringType, this.tokens.get(i));
        }
    }

    public static class TypeSubstituting extends AbstractBase<FieldDescription.InGenericShape> {
        private final TypeDescription.Generic declaringType;
        private final List<? extends FieldDescription> fieldDescriptions;
        private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

        public TypeSubstituting(TypeDescription.Generic generic, List<? extends FieldDescription> list, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
            this.declaringType = generic;
            this.fieldDescriptions = list;
            this.visitor = visitor;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fieldDescriptions.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // java.util.AbstractList, java.util.List
        public FieldDescription.InGenericShape get(int i) {
            return new FieldDescription.TypeSubstituting(this.declaringType, this.fieldDescriptions.get(i), this.visitor);
        }
    }

    FieldList<FieldDescription.InDefinedShape> asDefined();

    ByteCodeElement.Token.TokenList<FieldDescription.Token> asTokenList(ElementMatcher<? super TypeDescription> elementMatcher);
}
