package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class InstanceTypeMatcher<T> extends ElementMatcher.Junction.ForNonNullValues<T> {
    private final ElementMatcher<? super TypeDescription> matcher;

    public InstanceTypeMatcher(ElementMatcher<? super TypeDescription> elementMatcher) {
        this.matcher = elementMatcher;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T t) {
        return this.matcher.matches(TypeDescription.ForLoadedType.m5238of(t.getClass()));
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((InstanceTypeMatcher) obj).matcher);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return (super.hashCode() * 31) + this.matcher.hashCode();
    }

    public String toString() {
        return "ofType(" + this.matcher + ")";
    }
}
