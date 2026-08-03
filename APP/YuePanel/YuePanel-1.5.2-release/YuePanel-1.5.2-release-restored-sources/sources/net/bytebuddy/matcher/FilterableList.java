package net.bytebuddy.matcher;

import Yue.C2954;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.matcher.FilterableList;

/* JADX INFO: loaded from: classes2.dex */
public interface FilterableList<T, S extends FilterableList<T, S>> extends List<T> {

    public static abstract class AbstractBase<T, S extends FilterableList<T, S>> extends AbstractList<T> implements FilterableList<T, S> {
        private static final int ONLY = 0;

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Yue.ۥ۟۟۟ۢ$ۥ۟ */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.bytebuddy.matcher.FilterableList
        public S filter(ElementMatcher<? super T> elementMatcher) {
            List<T> arrayList = new ArrayList<>(size());
            Iterator it = iterator();
            while (it.hasNext()) {
                C2954.C0003 c0003 = (Object) it.next();
                if (elementMatcher.matches(c0003)) {
                    arrayList.add(c0003);
                }
            }
            return arrayList.size() == size() ? this : (S) wrap(arrayList);
        }

        @Override // net.bytebuddy.matcher.FilterableList
        public T getOnly() {
            if (size() == 1) {
                return get(0);
            }
            throw new IllegalStateException("size = " + size());
        }

        public abstract S wrap(List<T> list);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
        @Override // java.util.AbstractList, java.util.List
        public S subList(int i, int i2) {
            return (S) wrap(super.subList(i, i2));
        }
    }

    public static class Empty<T, S extends FilterableList<T, S>> extends AbstractList<T> implements FilterableList<T, S> {
        @Override // net.bytebuddy.matcher.FilterableList
        public S filter(ElementMatcher<? super T> elementMatcher) {
            return this;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            throw new IndexOutOfBoundsException("index = " + i);
        }

        @Override // net.bytebuddy.matcher.FilterableList
        public T getOnly() {
            throw new IllegalStateException("size = 0");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
        @Override // java.util.AbstractList, java.util.List
        public S subList(int i, int i2) {
            if (i == i2 && i2 == 0) {
                return this;
            }
            if (i <= i2) {
                throw new IndexOutOfBoundsException("fromIndex = " + i);
            }
            throw new IllegalArgumentException("fromIndex(" + i + ") > toIndex(" + i2 + ")");
        }
    }

    S filter(ElementMatcher<? super T> elementMatcher);

    T getOnly();

    @Override // java.util.List
    S subList(int i, int i2);
}
