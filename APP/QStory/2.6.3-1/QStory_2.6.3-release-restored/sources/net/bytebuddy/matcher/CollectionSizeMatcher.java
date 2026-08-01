package net.bytebuddy.matcher;

import androidx.activity.AbstractC0900;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class CollectionSizeMatcher<T extends Iterable<?>> extends ElementMatcher.Junction.ForNonNullValues<T> {
    private final int size;

    public CollectionSizeMatcher(int i) {
        this.size = i;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T t) {
        if (t instanceof Collection) {
            return ((Collection) t).size() == this.size;
        }
        Iterator it = t.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i == this.size;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.size == ((CollectionSizeMatcher) obj).size;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return (super.hashCode() * 31) + this.size;
    }

    public String toString() {
        return AbstractC0900.m716(new StringBuilder("ofSize("), this.size, ')');
    }
}
