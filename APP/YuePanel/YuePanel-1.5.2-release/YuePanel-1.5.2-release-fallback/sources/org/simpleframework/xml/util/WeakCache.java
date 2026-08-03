package org.simpleframework.xml.util;

/* JADX INFO: loaded from: classes2.dex */
public class WeakCache<T> implements org.simpleframework.xml.util.Cache<T> {
    private org.simpleframework.xml.util.WeakCache<T>.SegmentList list;

    /* JADX INFO: renamed from: org.simpleframework.xml.util.WeakCache$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class Segment extends java.util.WeakHashMap<java.lang.Object, T> {
        final /* synthetic */ org.simpleframework.xml.util.WeakCache this$0;

        private Segment(org.simpleframework.xml.util.WeakCache r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ Segment(org.simpleframework.xml.util.WeakCache r1, org.simpleframework.xml.util.WeakCache.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public synchronized void cache(java.lang.Object r1, T r2) {
                r0 = this;
                monitor-enter(r0)
                r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6
                monitor-exit(r0)
                return
            L6:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
                throw r1
        }

        public synchronized boolean contains(java.lang.Object r1) {
                r0 = this;
                monitor-enter(r0)
                boolean r1 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)
                return r1
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }

        public synchronized T fetch(java.lang.Object r1) {
                r0 = this;
                monitor-enter(r0)
                java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)
                return r1
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }

        public synchronized T take(java.lang.Object r1) {
                r0 = this;
                monitor-enter(r0)
                java.lang.Object r1 = r0.remove(r1)     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)
                return r1
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }
    }

    public class SegmentList implements java.lang.Iterable<org.simpleframework.xml.util.WeakCache<T>.Segment> {
        private java.util.List<org.simpleframework.xml.util.WeakCache<T>.Segment> list;
        private int size;
        final /* synthetic */ org.simpleframework.xml.util.WeakCache this$0;

        public SegmentList(org.simpleframework.xml.util.WeakCache r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.list = r1
                r0.size = r2
                r0.create(r2)
                return
        }

        private void create(int r5) {
                r4 = this;
            L0:
                int r0 = r5 + (-1)
                if (r5 <= 0) goto L13
                java.util.List<org.simpleframework.xml.util.WeakCache<T>$Segment> r5 = r4.list
                org.simpleframework.xml.util.WeakCache$Segment r1 = new org.simpleframework.xml.util.WeakCache$Segment
                org.simpleframework.xml.util.WeakCache r2 = r4.this$0
                r3 = 0
                r1.<init>(r2, r3)
                r5.add(r1)
                r5 = r0
                goto L0
            L13:
                return
        }

        private int segment(java.lang.Object r2) {
                r1 = this;
                int r2 = r2.hashCode()
                int r0 = r1.size
                int r2 = r2 % r0
                int r2 = java.lang.Math.abs(r2)
                return r2
        }

        public org.simpleframework.xml.util.WeakCache<T>.Segment get(java.lang.Object r2) {
                r1 = this;
                int r2 = r1.segment(r2)
                int r0 = r1.size
                if (r2 >= r0) goto L11
                java.util.List<org.simpleframework.xml.util.WeakCache<T>$Segment> r0 = r1.list
                java.lang.Object r2 = r0.get(r2)
                org.simpleframework.xml.util.WeakCache$Segment r2 = (org.simpleframework.xml.util.WeakCache.Segment) r2
                return r2
            L11:
                r2 = 0
                return r2
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<org.simpleframework.xml.util.WeakCache<T>.Segment> iterator() {
                r1 = this;
                java.util.List<org.simpleframework.xml.util.WeakCache<T>$Segment> r0 = r1.list
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    public WeakCache() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public WeakCache(int r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.WeakCache$SegmentList r0 = new org.simpleframework.xml.util.WeakCache$SegmentList
            r0.<init>(r1, r2)
            r1.list = r0
            return
    }

    private org.simpleframework.xml.util.WeakCache<T>.Segment map(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.util.WeakCache<T>$SegmentList r0 = r1.list
            org.simpleframework.xml.util.WeakCache$Segment r2 = r0.get(r2)
            return r2
    }

    @Override // org.simpleframework.xml.util.Cache
    public void cache(java.lang.Object r2, T r3) {
            r1 = this;
            org.simpleframework.xml.util.WeakCache$Segment r0 = r1.map(r2)
            r0.cache(r2, r3)
            return
    }

    @Override // org.simpleframework.xml.util.Cache
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.util.WeakCache$Segment r0 = r1.map(r2)
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // org.simpleframework.xml.util.Cache
    public T fetch(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.util.WeakCache$Segment r0 = r1.map(r2)
            java.lang.Object r2 = r0.fetch(r2)
            return r2
    }

    @Override // org.simpleframework.xml.util.Cache
    public boolean isEmpty() {
            r2 = this;
            org.simpleframework.xml.util.WeakCache<T>$SegmentList r0 = r2.list
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            org.simpleframework.xml.util.WeakCache$Segment r1 = (org.simpleframework.xml.util.WeakCache.Segment) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L1a:
            r0 = 1
            return r0
    }

    @Override // org.simpleframework.xml.util.Cache
    public T take(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.util.WeakCache$Segment r0 = r1.map(r2)
            java.lang.Object r2 = r0.take(r2)
            return r2
    }
}
