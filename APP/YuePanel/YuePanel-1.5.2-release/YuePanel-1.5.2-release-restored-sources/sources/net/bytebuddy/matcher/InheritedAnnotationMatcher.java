package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationList;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class InheritedAnnotationMatcher<T extends TypeDescription> extends ElementMatcher.Junction.ForNonNullValues<T> {
    private final ElementMatcher<? super AnnotationList> matcher;

    public InheritedAnnotationMatcher(ElementMatcher<? super AnnotationList> elementMatcher) {
        this.matcher = elementMatcher;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((InheritedAnnotationMatcher) obj).matcher);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return (super.hashCode() * 31) + this.matcher.hashCode();
    }

    public String toString() {
        return "inheritsAnnotations(" + this.matcher + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: doMatch(Ljava/lang/Object;)Z */
    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T t) {
        return this.matcher.matches(t.getInheritedAnnotations());
    }
}
