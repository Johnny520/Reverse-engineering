package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class BooleanMatcher<T> extends ElementMatcher.Junction.AbstractBase<T> {
    protected final boolean matches;
    private static final BooleanMatcher<?> TRUE = new BooleanMatcher<>(true);
    private static final BooleanMatcher<?> FALSE = new BooleanMatcher<>(false);

    public BooleanMatcher(boolean z) {
        this.matches = z;
    }

    public static <T> ElementMatcher.Junction<T> of(boolean z) {
        return z ? TRUE : FALSE;
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matches == ((BooleanMatcher) obj).matches;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + (this.matches ? 1 : 0);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@MaybeNull T t) {
        return this.matches;
    }

    public String toString() {
        return Boolean.toString(this.matches);
    }
}
