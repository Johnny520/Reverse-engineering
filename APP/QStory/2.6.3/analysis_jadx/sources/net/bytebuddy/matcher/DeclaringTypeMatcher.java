package net.bytebuddy.matcher;

import androidx.profileinstaller.AbstractC2442;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.DeclaredByType;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class DeclaringTypeMatcher<T extends DeclaredByType> extends ElementMatcher.Junction.ForNonNullValues<T> {
    private final ElementMatcher<? super TypeDescription.Generic> matcher;

    public DeclaringTypeMatcher(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        this.matcher = elementMatcher;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T t) {
        TypeDefinition declaringType = t.getDeclaringType();
        return declaringType != null && this.matcher.matches(declaringType.asGenericType());
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((DeclaringTypeMatcher) obj).matcher);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return this.matcher.hashCode() + (super.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2442.m4574(new StringBuilder("declaredBy("), this.matcher, ")");
    }
}
