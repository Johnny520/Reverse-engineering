package org.simpleframework.xml.util;

import org.simpleframework.xml.util.Match;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class Resolver<M extends org.simpleframework.xml.util.Match> extends java.util.AbstractSet<M> {
    protected final org.simpleframework.xml.util.Resolver<M>.Cache cache;
    protected final org.simpleframework.xml.util.Resolver<M>.Stack stack;

    /* JADX INFO: renamed from: org.simpleframework.xml.util.Resolver$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public class Cache extends org.simpleframework.xml.util.LimitedCache<java.util.List<M>> {
        final /* synthetic */ org.simpleframework.xml.util.Resolver this$0;

        public Cache(org.simpleframework.xml.util.Resolver r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 1024(0x400, float:1.435E-42)
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public class Stack extends java.util.LinkedList<M> {
        final /* synthetic */ org.simpleframework.xml.util.Resolver this$0;

        /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
        public class Sequence implements java.util.Iterator<M> {
            private int cursor;
            final /* synthetic */ org.simpleframework.xml.util.Resolver.Stack this$1;

            public Sequence(org.simpleframework.xml.util.Resolver.Stack r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    int r1 = r1.size()
                    r0.cursor = r1
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r0 = this;
                    int r0 = r0.cursor
                    if (r0 <= 0) goto L6
                    r0 = 1
                    return r0
                L6:
                    r0 = 0
                    return r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ java.lang.Object next() {
                    r0 = this;
                    org.simpleframework.xml.util.Match r0 = r0.next()
                    return r0
            }

            @Override // java.util.Iterator
            public M next() {
                    r2 = this;
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L15
                    org.simpleframework.xml.util.Resolver$Stack r0 = r2.this$1
                    int r1 = r2.cursor
                    int r1 = r1 + (-1)
                    r2.cursor = r1
                    java.lang.Object r2 = r0.get(r1)
                    org.simpleframework.xml.util.Match r2 = (org.simpleframework.xml.util.Match) r2
                    return r2
                L15:
                    r2 = 0
                    return r2
            }

            @Override // java.util.Iterator
            public void remove() {
                    r1 = this;
                    org.simpleframework.xml.util.Resolver$Stack r0 = r1.this$1
                    int r1 = r1.cursor
                    r0.purge(r1)
                    return
            }
        }

        private Stack(org.simpleframework.xml.util.Resolver r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ Stack(org.simpleframework.xml.util.Resolver r1, org.simpleframework.xml.util.Resolver.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void purge(int r2) {
                r1 = this;
                org.simpleframework.xml.util.Resolver r0 = r1.this$0
                org.simpleframework.xml.util.Resolver<M>$Cache r0 = r0.cache
                r0.clear()
                r1.remove(r2)
                return
        }

        @Override // java.util.LinkedList, java.util.Deque
        public /* bridge */ /* synthetic */ void push(java.lang.Object r1) {
                r0 = this;
                org.simpleframework.xml.util.Match r1 = (org.simpleframework.xml.util.Match) r1
                r0.push(r1)
                return
        }

        public void push(M r2) {
                r1 = this;
                org.simpleframework.xml.util.Resolver r0 = r1.this$0
                org.simpleframework.xml.util.Resolver<M>$Cache r0 = r0.cache
                r0.clear()
                r1.addFirst(r2)
                return
        }

        public java.util.Iterator<M> sequence() {
                r1 = this;
                org.simpleframework.xml.util.Resolver$Stack$Sequence r0 = new org.simpleframework.xml.util.Resolver$Stack$Sequence
                r0.<init>(r1)
                return r0
        }
    }

    public Resolver() {
            r2 = this;
            r2.<init>()
            org.simpleframework.xml.util.Resolver$Stack r0 = new org.simpleframework.xml.util.Resolver$Stack
            r1 = 0
            r0.<init>(r2, r1)
            r2.stack = r0
            org.simpleframework.xml.util.Resolver$Cache r0 = new org.simpleframework.xml.util.Resolver$Cache
            r0.<init>(r2)
            r2.cache = r0
            return
    }

    private boolean match(char[] r6, int r7, char[] r8, int r9) {
            r5 = this;
        L0:
            int r0 = r8.length
            r1 = 42
            r2 = 0
            r3 = 1
            if (r9 >= r0) goto L53
            int r0 = r6.length
            if (r7 >= r0) goto L53
            char r0 = r8[r9]
            r4 = 63
            if (r0 != r1) goto L41
        L10:
            char r0 = r8[r9]
            if (r0 != r1) goto L1a
            int r9 = r9 + 1
            int r0 = r8.length
            if (r9 < r0) goto L10
            return r3
        L1a:
            if (r0 != r4) goto L22
            int r9 = r9 + 1
            int r0 = r8.length
            if (r9 < r0) goto L22
            return r3
        L22:
            int r0 = r6.length
            if (r7 >= r0) goto L3d
            char r0 = r6[r7]
            char r1 = r8[r9]
            if (r0 == r1) goto L2d
            if (r1 != r4) goto L3a
        L2d:
            int r0 = r9 + (-1)
            char r0 = r8[r0]
            if (r0 == r4) goto L3d
            boolean r0 = r5.match(r6, r7, r8, r9)
            if (r0 == 0) goto L3a
            return r3
        L3a:
            int r7 = r7 + 1
            goto L22
        L3d:
            int r0 = r6.length
            if (r0 != r7) goto L41
            return r2
        L41:
            int r0 = r7 + 1
            char r7 = r6[r7]
            int r1 = r9 + 1
            char r3 = r8[r9]
            if (r7 == r3) goto L50
            char r7 = r8[r9]
            if (r7 == r4) goto L50
            return r2
        L50:
            r7 = r0
            r9 = r1
            goto L0
        L53:
            int r5 = r8.length
            if (r5 != r9) goto L5b
            int r5 = r6.length
            if (r5 != r7) goto L5a
            return r3
        L5a:
            return r2
        L5b:
            char r5 = r8[r9]
            if (r5 != r1) goto L65
            int r9 = r9 + 1
            int r5 = r8.length
            if (r9 < r5) goto L5b
            return r3
        L65:
            return r2
    }

    private boolean match(char[] r2, char[] r3) {
            r1 = this;
            r0 = 0
            boolean r1 = r1.match(r2, r0, r3, r0)
            return r1
    }

    private java.util.List<M> resolveAll(java.lang.String r5, char[] r6) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.simpleframework.xml.util.Resolver<M>$Stack r1 = r4.stack
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            org.simpleframework.xml.util.Match r2 = (org.simpleframework.xml.util.Match) r2
            java.lang.String r3 = r2.getPattern()
            char[] r3 = r3.toCharArray()
            boolean r3 = r4.match(r6, r3)
            if (r3 == 0) goto Lb
            org.simpleframework.xml.util.Resolver<M>$Cache r3 = r4.cache
            r3.put(r5, r0)
            r0.add(r2)
            goto Lb
        L2e:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            org.simpleframework.xml.util.Match r1 = (org.simpleframework.xml.util.Match) r1
            boolean r0 = r0.add(r1)
            return r0
    }

    public boolean add(M r1) {
            r0 = this;
            org.simpleframework.xml.util.Resolver<M>$Stack r0 = r0.stack
            r0.push(r1)
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            org.simpleframework.xml.util.Resolver<M>$Cache r0 = r1.cache
            r0.clear()
            org.simpleframework.xml.util.Resolver<M>$Stack r1 = r1.stack
            r1.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<M> iterator() {
            r0 = this;
            org.simpleframework.xml.util.Resolver<M>$Stack r0 = r0.stack
            java.util.Iterator r0 = r0.sequence()
            return r0
    }

    public boolean remove(M r2) {
            r1 = this;
            org.simpleframework.xml.util.Resolver<M>$Cache r0 = r1.cache
            r0.clear()
            org.simpleframework.xml.util.Resolver<M>$Stack r1 = r1.stack
            boolean r1 = r1.remove(r2)
            return r1
    }

    public M resolve(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.util.Resolver<M>$Cache r0 = r1.cache
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Le
            java.util.List r0 = r1.resolveAll(r2)
        Le:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            r1 = 0
            return r1
        L16:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            org.simpleframework.xml.util.Match r1 = (org.simpleframework.xml.util.Match) r1
            return r1
    }

    public java.util.List<M> resolveAll(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.util.Resolver<M>$Cache r0 = r1.cache
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            char[] r0 = r2.toCharArray()
            if (r0 != 0) goto L13
            r1 = 0
            return r1
        L13:
            java.util.List r1 = r1.resolveAll(r2, r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r0 = this;
            org.simpleframework.xml.util.Resolver<M>$Stack r0 = r0.stack
            int r0 = r0.size()
            return r0
    }
}
