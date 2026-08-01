package net.bytebuddy.matcher;

import android.R;
import io.ktor.util.C5043;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.matcher.FilterableList;
import p025.AbstractC7012;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface FilterableList<T, S extends FilterableList<T, S>> extends List<T> {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            C6755.m11864(size(), "size = ");
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

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Empty<T, S extends FilterableList<T, S>> extends AbstractList<T> implements FilterableList<T, S> {
        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            throw new IndexOutOfBoundsException(AbstractC7012.m12147(i, "index = "));
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
                C5043.m9169("fromIndex(", i, ") > toIndex(", i2, ")");
                return null;
            }
            C8376.m13331(AbstractC7012.m12147(i, "fromIndex = "));
            return null;
        }

        @Override // net.bytebuddy.matcher.FilterableList
        public S filter(ElementMatcher<? super T> elementMatcher) {
            return this;
        }
    }
}
