package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkNativeObjectCache {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache INSTANCE = null;
    private static final long MAX_AGE_MS = 600000;
    private static final java.lang.String TAG = "ra24a4e3347fe86ec";
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.Entry> cache = null;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Entry {
        public static final int $stable = 8;
        private final java.lang.ref.WeakReference<java.lang.Object> awemeRef;
        private final java.lang.ref.WeakReference<java.lang.Object> commentRef;
        private final java.lang.ref.WeakReference<java.lang.Object> pageParamRef;
        private final long saveTime;

        public Entry(java.lang.ref.WeakReference<java.lang.Object> r1, java.lang.ref.WeakReference<java.lang.Object> r2, java.lang.ref.WeakReference<java.lang.Object> r3, long r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r0.<init>()
                r0.awemeRef = r1
                r0.commentRef = r2
                r0.pageParamRef = r3
                r0.saveTime = r4
                return
        }

        public /* synthetic */ Entry(java.lang.ref.WeakReference r7, java.lang.ref.WeakReference r8, java.lang.ref.WeakReference r9, long r10, int r12, p000.AbstractC1067zq r13) {
                r6 = this;
                r12 = r12 & 8
                if (r12 == 0) goto L8
                long r10 = java.lang.System.currentTimeMillis()
            L8:
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4)
                return
        }

        private final java.lang.ref.WeakReference<java.lang.Object> component1() {
                r0 = this;
                java.lang.ref.WeakReference<java.lang.Object> r0 = r0.awemeRef
                return r0
        }

        private final java.lang.ref.WeakReference<java.lang.Object> component2() {
                r0 = this;
                java.lang.ref.WeakReference<java.lang.Object> r0 = r0.commentRef
                return r0
        }

        private final java.lang.ref.WeakReference<java.lang.Object> component3() {
                r0 = this;
                java.lang.ref.WeakReference<java.lang.Object> r0 = r0.pageParamRef
                return r0
        }

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.Entry copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.Entry r0, java.lang.ref.WeakReference r1, java.lang.ref.WeakReference r2, java.lang.ref.WeakReference r3, long r4, int r6, java.lang.Object r7) {
                r7 = r6 & 1
                if (r7 == 0) goto L6
                java.lang.ref.WeakReference<java.lang.Object> r1 = r0.awemeRef
            L6:
                r7 = r6 & 2
                if (r7 == 0) goto Lc
                java.lang.ref.WeakReference<java.lang.Object> r2 = r0.commentRef
            Lc:
                r7 = r6 & 4
                if (r7 == 0) goto L12
                java.lang.ref.WeakReference<java.lang.Object> r3 = r0.pageParamRef
            L12:
                r6 = r6 & 8
                if (r6 == 0) goto L18
                long r4 = r0.saveTime
            L18:
                r6 = r4
                r4 = r2
                r5 = r3
                r2 = r0
                r3 = r1
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry r0 = r2.copy(r3, r4, r5, r6)
                return r0
        }

        public final long component4() {
                r2 = this;
                long r0 = r2.saveTime
                return r0
        }

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.Entry copy(java.lang.ref.WeakReference<java.lang.Object> r1, java.lang.ref.WeakReference<java.lang.Object> r2, java.lang.ref.WeakReference<java.lang.Object> r3, long r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.Entry
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry r6 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.Entry) r6
                java.lang.ref.WeakReference<java.lang.Object> r1 = r5.awemeRef
                java.lang.ref.WeakReference<java.lang.Object> r3 = r6.awemeRef
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.ref.WeakReference<java.lang.Object> r1 = r5.commentRef
                java.lang.ref.WeakReference<java.lang.Object> r3 = r6.commentRef
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.ref.WeakReference<java.lang.Object> r1 = r5.pageParamRef
                java.lang.ref.WeakReference<java.lang.Object> r3 = r6.pageParamRef
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                long r3 = r5.saveTime
                long r5 = r6.saveTime
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 == 0) goto L36
                return r2
            L36:
                return r0
        }

        public final java.lang.Object getAweme() {
                r0 = this;
                java.lang.ref.WeakReference<java.lang.Object> r0 = r0.awemeRef
                java.lang.Object r0 = r0.get()
                return r0
        }

        public final java.lang.Object getComment() {
                r0 = this;
                java.lang.ref.WeakReference<java.lang.Object> r0 = r0.commentRef
                java.lang.Object r0 = r0.get()
                return r0
        }

        public final java.lang.Object getPageParam() {
                r0 = this;
                java.lang.ref.WeakReference<java.lang.Object> r0 = r0.pageParamRef
                if (r0 == 0) goto L9
                java.lang.Object r0 = r0.get()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public final long getSaveTime() {
                r2 = this;
                long r0 = r2.saveTime
                return r0
        }

        public int hashCode() {
                r4 = this;
                java.lang.ref.WeakReference<java.lang.Object> r0 = r4.awemeRef
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.ref.WeakReference<java.lang.Object> r1 = r4.commentRef
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.ref.WeakReference<java.lang.Object> r0 = r4.pageParamRef
                if (r0 != 0) goto L17
                r0 = 0
                goto L1b
            L17:
                int r0 = r0.hashCode()
            L1b:
                int r1 = r1 + r0
                int r1 = r1 * 31
                long r2 = r4.saveTime
                int r4 = java.lang.Long.hashCode(r2)
                int r4 = r4 + r1
                return r4
        }

        public java.lang.String toString() {
                r6 = this;
                java.lang.ref.WeakReference<java.lang.Object> r0 = r6.awemeRef
                java.lang.ref.WeakReference<java.lang.Object> r1 = r6.commentRef
                java.lang.ref.WeakReference<java.lang.Object> r2 = r6.pageParamRef
                long r3 = r6.saveTime
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r5 = "Entry(awemeRef="
                r6.<init>(r5)
                r6.append(r0)
                java.lang.String r0 = ", commentRef="
                r6.append(r0)
                r6.append(r1)
                java.lang.String r0 = ", pageParamRef="
                r6.append(r0)
                r6.append(r2)
                java.lang.String r0 = ", saveTime="
                r6.append(r0)
                r6.append(r3)
                java.lang.String r0 = ")"
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                return r6
        }

        public final boolean valid() {
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r4.saveTime
                long r0 = r0 - r2
                r2 = 600000(0x927c0, double:2.964394E-318)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r1 = 0
                if (r0 <= 0) goto L10
                return r1
            L10:
                java.lang.Object r0 = r4.getAweme()
                if (r0 == 0) goto L1e
                java.lang.Object r4 = r4.getComment()
                if (r4 == 0) goto L1e
                r4 = 1
                return r4
            L1e:
                return r1
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.INSTANCE = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.cache = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.$stable = r0
            return
    }

    private CommentBookmarkNativeObjectCache() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void clear() {
            r0 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.cache
            r0.clear()
            return
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.Entry get(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry> r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.cache
            java.lang.Object r0 = r3.get(r4)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry r0 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.Entry) r0
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            boolean r2 = r0.valid()
            if (r2 != 0) goto L19
            r3.remove(r4)
            return r1
        L19:
            return r0
    }

    public final void put(java.lang.String r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r9 = this;
            r10.getClass()
            boolean r9 = p000.q02.m4671(r10)
            if (r9 == 0) goto La
            goto L71
        La:
            if (r11 == 0) goto L71
            if (r12 != 0) goto Lf
            goto L71
        Lf:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry> r9 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.cache
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r11)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r12)
            r8 = 0
            if (r13 == 0) goto L25
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r13)
            r3 = r0
            goto L26
        L25:
            r3 = r8
        L26:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry
            r4 = 0
            r6 = 8
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r9.put(r10, r0)
            boolean r9 = p000.C0888ux.m5984()
            if (r9 == 0) goto L71
            java.lang.Class r9 = r11.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.Class r11 = r12.getClass()
            java.lang.String r11 = r11.getName()
            if (r13 == 0) goto L53
            java.lang.Class r12 = r13.getClass()
            java.lang.String r8 = r12.getName()
        L53:
            java.lang.String r12 = ", aweme="
            java.lang.String r13 = ", comment="
            java.lang.String r0 = "put cid="
            java.lang.StringBuilder r9 = p000.lz1.m3695(r0, r10, r12, r9, r13)
            r9.append(r11)
            java.lang.String r10 = ", pageParam="
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "ra24a4e3347fe86ec"
            p000.C0888ux.m5975(r10, r9)
        L71:
            return
    }

    public final void remove(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache$Entry> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.cache
            r0.remove(r1)
            return
    }
}
