package net.bytebuddy.matcher;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class CollectionOneToOneMatcher<T> extends ElementMatcher.Junction.ForNonNullValues<Iterable<? extends T>> {
    private final List<? extends ElementMatcher<? super T>> matchers;

    public CollectionOneToOneMatcher(List<? extends ElementMatcher<? super T>> list) {
        this.matchers = list;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(Iterable<? extends T> iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() != this.matchers.size()) {
            return false;
        }
        Iterator<? extends ElementMatcher<? super T>> it = this.matchers.iterator();
        for (T t : iterable) {
            if (!it.hasNext() || !it.next().matches(t)) {
                return false;
            }
        }
        return true;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matchers.equals(((CollectionOneToOneMatcher) obj).matchers);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return this.matchers.hashCode() + (super.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("containing(");
        boolean z = true;
        for (ElementMatcher<? super T> elementMatcher : this.matchers) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(elementMatcher);
        }
        sb.append(')');
        return sb.toString();
    }
}
