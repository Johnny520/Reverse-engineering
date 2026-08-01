package net.bytebuddy.matcher;

import java.lang.annotation.ElementType;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class AnnotationTargetMatcher<T extends AnnotationDescription> extends ElementMatcher.Junction.ForNonNullValues<T> {
    private final ElementType elementType;

    public AnnotationTargetMatcher(ElementType elementType) {
        this.elementType = elementType;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.elementType.equals(((AnnotationTargetMatcher) obj).elementType);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return this.elementType.hashCode() + (super.hashCode() * 31);
    }

    public String toString() {
        return "targetsElement(" + this.elementType + ")";
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T t) {
        return t.isSupportedOn(this.elementType);
    }
}
