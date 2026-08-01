package net.bytebuddy.matcher;

import android.R;
import io.ktor.util.C4210;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.matcher.FilterableList;
import p007.AbstractC6136;
import p144.C7546;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface FilterableList<T, S extends FilterableList<T, S>> extends List<T> {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class AbstractBase<T, S extends FilterableList<T, S>> extends AbstractList<T> implements FilterableList<T, S> {
        private static final int ONLY = 0;

        @Override // net.bytebuddy.matcher.FilterableList
        public S filter(ElementMatcher<? super T> elementMatcher) {
            ArrayList arrayList = new ArrayList(size());
            Iterator it = iterator();
            while (it.hasNext()) {
                R.color colorVar = (Object) it.next();
                if (elementMatcher.matches(colorVar)) {
                    arrayList.add(colorVar);
                }
            }
            return arrayList.size() == size() ? this : (S) wrap(arrayList);
        }

        @Override // net.bytebuddy.matcher.FilterableList
        public T getOnly() {
            if (size() == 1) {
                return get(0);
            }
            C5919.m11244(size(), "size = ");
            return null;
        }

        @Override // java.util.AbstractList, java.util.List
        public S subList(int i, int i2) {
            return (S) wrap(super.subList(i, i2));
        }

        public abstract S wrap(List<T> list);
    }

    S filter(ElementMatcher<? super T> elementMatcher);

    T getOnly();

    @Override // java.util.List
    S subList(int i, int i2);

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class Empty<T, S extends FilterableList<T, S>> extends AbstractList<T> implements FilterableList<T, S> {
        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            throw new IndexOutOfBoundsException(AbstractC6136.m11556(i, "index = "));
        }

        @Override // net.bytebuddy.matcher.FilterableList
        public T getOnly() {
            throw new IllegalStateException("size = 0");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public S subList(int i, int i2) {
            if (i == i2 && i2 == 0) {
                return this;
            }
            if (i > i2) {
                C4210.m8620("fromIndex(", i, ") > toIndex(", i2, ")");
                return null;
            }
            C7546.m12743(AbstractC6136.m11556(i, "fromIndex = "));
            return null;
        }

        @Override // net.bytebuddy.matcher.FilterableList
        public S filter(ElementMatcher<? super T> elementMatcher) {
            return this;
        }
    }
}
