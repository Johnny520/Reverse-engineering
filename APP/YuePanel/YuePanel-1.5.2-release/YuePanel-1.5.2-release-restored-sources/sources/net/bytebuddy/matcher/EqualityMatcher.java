package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class EqualityMatcher<T> extends ElementMatcher.Junction.AbstractBase<T> {
    private final Object value;

    public EqualityMatcher(Object obj) {
        this.value = obj;
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.value.equals(((EqualityMatcher) obj).value);
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.value.hashCode();
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@MaybeNull T t) {
        return this.value.equals(t);
    }

    public String toString() {
        return "is(" + this.value + ")";
    }
}
