package net.bytebuddy.description;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.description.DeclaredByType;
import net.bytebuddy.description.ModifierReviewable;
import net.bytebuddy.description.NamedElement;
import net.bytebuddy.description.annotation.AnnotationSource;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.FilterableList;

/* JADX INFO: loaded from: classes2.dex */
public interface ByteCodeElement extends NamedElement.WithRuntimeName, NamedElement.WithDescriptor, ModifierReviewable.OfByteCodeElement, DeclaredByType, AnnotationSource {

    public interface Member extends DeclaredByType.WithMandatoryDeclaration, ByteCodeElement, NamedElement.WithGenericName {
    }

    public interface Token<T extends Token<T>> {

        public static class TokenList<S extends Token<S>> extends FilterableList.AbstractBase<S, TokenList<S>> {
            private final List<? extends S> tokens;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public TokenList(S... sArr) {
                this(Arrays.asList(sArr));
            }

            public TokenList<S> accept(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                ArrayList arrayList = new ArrayList(this.tokens.size());
                Iterator<? extends S> it = this.tokens.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().accept(visitor));
                }
                return new TokenList<>(arrayList);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.tokens.size();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public TokenList(List<? extends S> list) {
                this.tokens = list;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
            @Override // java.util.AbstractList, java.util.List
            public S get(int i) {
                return this.tokens.get(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: wrap(Ljava/util/List;)Lnet/bytebuddy/matcher/FilterableList; */
            @Override // net.bytebuddy.matcher.FilterableList.AbstractBase
            public TokenList<S> wrap(List<S> list) {
                return new TokenList<>(list);
            }
        }

        T accept(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor);
    }

    public interface TypeDependant<T extends TypeDependant<?, S>, S extends Token<S>> {
        T asDefined();

        S asToken(ElementMatcher<? super TypeDescription> elementMatcher);
    }

    boolean isAccessibleTo(TypeDescription typeDescription);

    boolean isVisibleTo(TypeDescription typeDescription);
}
