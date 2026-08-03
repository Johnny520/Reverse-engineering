package net.bytebuddy.matcher;

import net.bytebuddy.matcher.FilterableList;

/* JADX INFO: loaded from: classes2.dex */
public interface FilterableList<T, S extends net.bytebuddy.matcher.FilterableList<T, S>> extends java.util.List<T> {

    public static abstract class AbstractBase<T, S extends net.bytebuddy.matcher.FilterableList<T, S>> extends java.util.AbstractList<T> implements net.bytebuddy.matcher.FilterableList<T, S> {
        private static final int ONLY = 0;

        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.matcher.FilterableList
        public S filter(net.bytebuddy.matcher.ElementMatcher<? super T> r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r4.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r4.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                boolean r3 = r5.matches(r2)
                if (r3 == 0) goto Ld
                r0.add(r2)
                goto Ld
            L21:
                int r5 = r0.size()
                int r1 = r4.size()
                if (r5 != r1) goto L2d
                r5 = r4
                goto L31
            L2d:
                net.bytebuddy.matcher.FilterableList r5 = r4.wrap(r0)
            L31:
                return r5
        }

        @Override // net.bytebuddy.matcher.FilterableList
        public T getOnly() {
                r3 = this;
                int r0 = r3.size()
                r1 = 1
                if (r0 != r1) goto Ld
                r0 = 0
                java.lang.Object r0 = r3.get(r0)
                return r0
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "size = "
                r1.append(r2)
                int r2 = r3.size()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
                r0 = this;
                net.bytebuddy.matcher.FilterableList r1 = r0.subList(r1, r2)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List, net.bytebuddy.matcher.FilterableList
        public S subList(int r1, int r2) {
                r0 = this;
                java.util.List r1 = super.subList(r1, r2)
                net.bytebuddy.matcher.FilterableList r1 = r0.wrap(r1)
                return r1
        }

        public abstract S wrap(java.util.List<T> r1);
    }

    public static class Empty<T, S extends net.bytebuddy.matcher.FilterableList<T, S>> extends java.util.AbstractList<T> implements net.bytebuddy.matcher.FilterableList<T, S> {
        public Empty() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.matcher.FilterableList
        public S filter(net.bytebuddy.matcher.ElementMatcher<? super T> r1) {
                r0 = this;
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int r4) {
                r3 = this;
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "index = "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // net.bytebuddy.matcher.FilterableList
        public T getOnly() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "size = 0"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
                r0 = this;
                net.bytebuddy.matcher.FilterableList r1 = r0.subList(r1, r2)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List, net.bytebuddy.matcher.FilterableList
        public S subList(int r4, int r5) {
                r3 = this;
                if (r4 != r5) goto L5
                if (r5 != 0) goto L5
                return r3
            L5:
                if (r4 <= r5) goto L2b
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "fromIndex("
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ") > toIndex("
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = ")"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            L2b:
                java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "fromIndex = "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
        }
    }

    S filter(net.bytebuddy.matcher.ElementMatcher<? super T> r1);

    T getOnly();

    @Override // java.util.List
    S subList(int r1, int r2);
}
