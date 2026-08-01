package net.bytebuddy.matcher;

import androidx.profileinstaller.AbstractC2442;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance(permitSubclassEquality = true)
public class CachingMatcher<T> extends ElementMatcher.Junction.AbstractBase<T> {
    private static final Object NULL_VALUE = new Object();

    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
    protected final ConcurrentMap<? super T, Boolean> map;
    private final ElementMatcher<? super T> matcher;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class WithInlineEviction<S> extends CachingMatcher<S> {
        private final int evictionSize;

        public WithInlineEviction(ElementMatcher<? super S> elementMatcher, ConcurrentMap<? super S, Boolean> concurrentMap, int i) {
            super(elementMatcher, concurrentMap);
            this.evictionSize = i;
        }

        @Override // net.bytebuddy.matcher.CachingMatcher
        public boolean onCacheMiss(@MaybeNull S s) {
            if (this.map.size() >= this.evictionSize) {
                Iterator<Map.Entry<? super T, Boolean>> it = this.map.entrySet().iterator();
                it.next();
                it.remove();
            }
            return super.onCacheMiss(s);
        }
    }

    public CachingMatcher(ElementMatcher<? super T> elementMatcher, ConcurrentMap<? super T, Boolean> concurrentMap) {
        this.matcher = elementMatcher;
        this.map = concurrentMap;
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CachingMatcher) && this.matcher.equals(((CachingMatcher) obj).matcher);
    }

    public int hashCode() {
        return this.matcher.hashCode() + (CachingMatcher.class.hashCode() * 31);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@MaybeNull T t) {
        Boolean boolValueOf = this.map.get(t == null ? NULL_VALUE : t);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(onCacheMiss(t));
        }
        return boolValueOf.booleanValue();
    }

    public boolean onCacheMiss(@MaybeNull T t) {
        boolean zMatches = this.matcher.matches(t);
        ConcurrentMap<? super T, Boolean> concurrentMap = this.map;
        if (t == null) {
            t = (Object) NULL_VALUE;
        }
        concurrentMap.put(t, Boolean.valueOf(zMatches));
        return zMatches;
    }

    public String toString() {
        return AbstractC2442.m4574(new StringBuilder("cached("), this.matcher, ")");
    }
}
