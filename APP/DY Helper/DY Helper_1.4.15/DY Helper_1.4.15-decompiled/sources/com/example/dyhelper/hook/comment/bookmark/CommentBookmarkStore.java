package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkStore {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore INSTANCE = null;
    private static final java.lang.String KEY_BOOKMARKS = "bookmarks_v1";
    private static final java.lang.String KEY_CATEGORIES = "categories_v1";
    private static final java.lang.String SP_NAME = "dyhelper_comment_bookmark";
    private static final java.lang.String TAG = "r1870ea96169c6d87";
    private static volatile android.content.Context appContext;
    private static final java.util.List<java.lang.String> categories = null;
    private static final java.util.concurrent.CopyOnWriteArrayList<p000.p70> listeners = null;
    private static final java.lang.Object lock = null;
    private static final java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> records = null;

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.categories = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.listeners = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.$stable = r0
            return
    }

    private CommentBookmarkStore() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void load() {
            r8 = this;
            android.content.Context r8 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.appContext
            if (r8 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L9a
            r1.clear()     // Catch: java.lang.Throwable -> L9a
            java.util.List<java.lang.String> r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.categories     // Catch: java.lang.Throwable -> L9a
            r1.clear()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = "dyhelper_comment_bookmark"
            r2 = 0
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "bookmarks_v1"
            java.lang.String r3 = "[]"
            java.lang.String r1 = r8.getString(r1, r3)     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L28
            java.lang.String r1 = "[]"
            goto L28
        L26:
            r8 = move-exception
            goto L86
        L28:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L26
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L26
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L26
            r4 = r2
        L32:
            if (r4 >= r1) goto L57
            org.json.JSONObject r5 = r3.optJSONObject(r4)     // Catch: java.lang.Throwable -> L26
            if (r5 != 0) goto L3b
            goto L54
        L3b:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord$Companion r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord.Companion     // Catch: java.lang.Throwable -> L26
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r5 = r6.fromJson(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = r5.getCommentId()     // Catch: java.lang.Throwable -> L26
            boolean r6 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L26
            if (r6 != 0) goto L54
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r5.getCommentId()     // Catch: java.lang.Throwable -> L26
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> L26
        L54:
            int r4 = r4 + 1
            goto L32
        L57:
            java.lang.String r1 = "categories_v1"
            java.lang.String r3 = "[]"
            java.lang.String r8 = r8.getString(r1, r3)     // Catch: java.lang.Throwable -> L26
            if (r8 != 0) goto L63
            java.lang.String r8 = "[]"
        L63:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L26
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L26
            int r8 = r1.length()     // Catch: java.lang.Throwable -> L26
        L6c:
            if (r2 >= r8) goto L83
            java.lang.String r3 = r1.optString(r2)     // Catch: java.lang.Throwable -> L26
            r3.getClass()     // Catch: java.lang.Throwable -> L26
            boolean r4 = p000.q02.m4671(r3)     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L80
            java.util.List<java.lang.String> r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.categories     // Catch: java.lang.Throwable -> L26
            r4.add(r3)     // Catch: java.lang.Throwable -> L26
        L80:
            int r2 = r2 + 1
            goto L6c
        L83:
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L26
            goto L8c
        L86:
            eo1 r1 = new eo1     // Catch: java.lang.Throwable -> L9a
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L9a
            r8 = r1
        L8c:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)     // Catch: java.lang.Throwable -> L9a
            if (r8 == 0) goto L9c
            java.lang.String r1 = "r1870ea96169c6d87"
            java.lang.String r2 = "load failed"
            p000.C0888ux.m5977(r1, r2, r8)     // Catch: java.lang.Throwable -> L9a
            goto L9c
        L9a:
            r8 = move-exception
            goto L9e
        L9c:
            monitor-exit(r0)
            return
        L9e:
            monitor-exit(r0)
            throw r8
    }

    private final void notifyChanged() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<p70> r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.listeners
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            p70 r0 = (p000.p70) r0
            r0.invoke()     // Catch: java.lang.Throwable -> L6
            goto L6
        L16:
            return
    }

    private final void save() {
            r4 = this;
            android.content.Context r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.appContext
            if (r4 != 0) goto L5
            goto L64
        L5:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock     // Catch: java.lang.Throwable -> L50
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L50
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L30
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L30
            r2.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L30
        L1c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L32
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L30
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r3 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r3     // Catch: java.lang.Throwable -> L30
            org.json.JSONObject r3 = r3.toJson()     // Catch: java.lang.Throwable -> L30
            r0.put(r3)     // Catch: java.lang.Throwable -> L30
            goto L1c
        L30:
            r4 = move-exception
            goto L4e
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "dyhelper_comment_bookmark"
            r2 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "bookmarks_v1"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r4 = r4.putString(r1, r0)     // Catch: java.lang.Throwable -> L50
            r4.apply()     // Catch: java.lang.Throwable -> L50
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L50
            goto L57
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            throw r4     // Catch: java.lang.Throwable -> L50
        L50:
            r4 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r4)
            r4 = r0
        L57:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L64
            java.lang.String r0 = "r1870ea96169c6d87"
            java.lang.String r1 = "save failed"
            p000.C0888ux.m5977(r0, r1, r4)
        L64:
            return
    }

    private final void saveCategories() {
            r4 = this;
            android.content.Context r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.appContext
            if (r4 != 0) goto L5
            goto L57
        L5:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock     // Catch: java.lang.Throwable -> L43
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L43
            java.util.List<java.lang.String> r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.categories     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L23
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L23
            r0.put(r3)     // Catch: java.lang.Throwable -> L23
            goto L13
        L23:
            r4 = move-exception
            goto L41
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "dyhelper_comment_bookmark"
            r2 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L43
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "categories_v1"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L43
            android.content.SharedPreferences$Editor r4 = r4.putString(r1, r0)     // Catch: java.lang.Throwable -> L43
            r4.apply()     // Catch: java.lang.Throwable -> L43
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L43
            goto L4a
        L41:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            throw r4     // Catch: java.lang.Throwable -> L43
        L43:
            r4 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r4)
            r4 = r0
        L4a:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L57
            java.lang.String r0 = "r1870ea96169c6d87"
            java.lang.String r1 = "save categories failed"
            p000.C0888ux.m5977(r0, r1, r4)
        L57:
            return
    }

    public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord updateReplyCount$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0, java.lang.String r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 1
        L5:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = r0.updateReplyCount(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord updateReplyCountAndReplies$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0, java.lang.String r1, int r2, java.util.List r3, boolean r4, int r5, java.lang.Object r6) {
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 1
        L5:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = r0.updateReplyCountAndReplies(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ boolean updateReplyItems$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0, java.lang.String r1, int r2, java.util.List r3, boolean r4, int r5, java.lang.Object r6) {
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 1
        L5:
            boolean r0 = r0.updateReplyItems(r1, r2, r3, r4)
            return r0
    }

    public final boolean add(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r9) {
            r8 = this;
            r9.getClass()
            java.lang.String r0 = r9.getCommentId()
            boolean r0 = p000.q02.m4671(r0)
            r1 = 0
            if (r0 == 0) goto Lf
            return r1
        Lf:
            java.lang.Object r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r9.getCommentId()     // Catch: java.lang.Throwable -> L67
            boolean r3 = r2.containsKey(r3)     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L1f
            goto L27
        L1f:
            java.lang.String r1 = r9.getCommentId()     // Catch: java.lang.Throwable -> L67
            r2.put(r1, r9)     // Catch: java.lang.Throwable -> L67
            r1 = 1
        L27:
            monitor-exit(r0)
            if (r1 == 0) goto L66
            java.lang.String r0 = "r1870ea96169c6d87"
            java.lang.String r2 = r9.getCommentId()
            java.lang.String r3 = r9.getAwemeId()
            int r4 = r9.getLastKnownReplyCount()
            java.lang.String r9 = r9.getContent()
            r5 = 20
            java.lang.String r9 = p000.q02.m4693(r9, r5)
            java.lang.String r5 = "add bookmark cid="
            java.lang.String r6 = ", awemeId="
            java.lang.String r7 = ", replyCount="
            java.lang.StringBuilder r2 = p000.lz1.m3695(r5, r2, r6, r3, r7)
            r2.append(r4)
            java.lang.String r3 = ", content="
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r2 = 4
            r3 = 0
            p000.C0888ux.m5988(r0, r9, r3, r2, r3)
            r8.save()
            r8.notifyChanged()
        L66:
            return r1
        L67:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
    }

    public final void addCategory(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            boolean r2 = p000.q02.m4671(r3)
            if (r2 == 0) goto La
            return
        La:
            java.lang.Object r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r2)
            java.util.List<java.lang.String> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.categories     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r0.contains(r3)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L20
            r0.add(r3)     // Catch: java.lang.Throwable -> L1e
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L1e
            r3.saveCategories()     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r3 = move-exception
            goto L22
        L20:
            monitor-exit(r2)
            return
        L22:
            monitor-exit(r2)
            throw r3
    }

    public final void addListener(p000.p70 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList<p70> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.listeners
            r0.add(r1)
            return
    }

    public final java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> all() {
            r1 = this;
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L14
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L14
            r0.getClass()     // Catch: java.lang.Throwable -> L14
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L14
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void clear() {
            r2 = this;
            java.lang.Object r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L10
            r1.clear()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            r2.save()
            r2.notifyChanged()
            return
        L10:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord get(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L19
            boolean r1 = p000.q02.m4671(r2)
            if (r1 == 0) goto L9
            goto L19
        L9:
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L16
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r2 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r2     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L19:
            r1 = 0
            return r1
    }

    public final java.util.List<java.lang.String> getCategories() {
            r4 = this;
            java.lang.Object r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r4)
            java.util.List<java.lang.String> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.categories     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            java.lang.String r0 = "默认"
            java.lang.String r1 = "重要"
            java.lang.String r2 = "有趣"
            java.lang.String r3 = "待办"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}     // Catch: java.lang.Throwable -> L1d
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return r0
        L1d:
            r0 = move-exception
            goto L25
        L1f:
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return r0
        L25:
            monitor-exit(r4)
            throw r0
    }

    public final void init(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.appContext
            if (r0 == 0) goto L8
            return
        L8:
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.appContext = r2
            r1.load()
            return
    }

    public final boolean isBookmarked(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L17
            boolean r1 = p000.q02.m4671(r2)
            if (r1 == 0) goto L9
            goto L17
        L9:
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L14
            boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return r2
        L14:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L17:
            r1 = 0
            return r1
    }

    public final boolean isInitialized() {
            r0 = this;
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.appContext
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void markRead(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L63
            boolean r0 = p000.q02.m4671(r5)
            if (r0 == 0) goto L9
            goto L63
        L9:
            java.lang.Object r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L42
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Throwable -> L42
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r5 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r5     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L18
            monitor-exit(r0)
            return
        L18:
            java.util.List r1 = r5.getNewReplyItems()     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
        L20:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L42
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r2 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r2     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r2.getReplyId()     // Catch: java.lang.Throwable -> L42
            boolean r3 = p000.q02.m4671(r3)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L20
            java.util.Set r3 = r5.getKnownReplyIds()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = r2.getReplyId()     // Catch: java.lang.Throwable -> L42
            r3.add(r2)     // Catch: java.lang.Throwable -> L42
            goto L20
        L42:
            r4 = move-exception
            goto L61
        L44:
            r1 = 0
            r5.setHasNewReplies(r1)     // Catch: java.lang.Throwable -> L42
            r5.setNewReplyCount(r1)     // Catch: java.lang.Throwable -> L42
            java.util.List r1 = r5.getNewReplyItems()     // Catch: java.lang.Throwable -> L42
            r1.clear()     // Catch: java.lang.Throwable -> L42
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L42
            r5.setLastCheckTimestamp(r1)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            r4.save()
            r4.notifyChanged()
            return
        L61:
            monitor-exit(r0)
            throw r4
        L63:
            return
    }

    public final boolean remove(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L23
            boolean r1 = p000.q02.m4671(r4)
            if (r1 == 0) goto La
            goto L23
        La:
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r2.remove(r4)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L16
            r0 = 1
        L16:
            monitor-exit(r1)
            if (r0 == 0) goto L1f
            r3.save()
            r3.notifyChanged()
        L1f:
            return r0
        L20:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
        L23:
            return r0
    }

    public final void removeListener(p000.p70 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList<p70> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.listeners
            r0.remove(r1)
            return
    }

    public final int size() {
            r1 = this;
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> Lb
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord updateReplyCount(java.lang.String r9, int r10, boolean r11) {
            r8 = this;
            java.lang.String r0 = "new replies cid="
            r1 = 0
            if (r9 == 0) goto L8b
            boolean r2 = p000.q02.m4671(r9)
            if (r2 == 0) goto Ld
            goto L8b
        Ld:
            if (r10 >= 0) goto L10
            return r1
        L10:
            java.lang.Object r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r2)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L69
            java.lang.Object r3 = r3.get(r9)     // Catch: java.lang.Throwable -> L69
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r3 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r3     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L1f
            monitor-exit(r2)
            return r1
        L1f:
            int r4 = r3.getLastKnownReplyCount()     // Catch: java.lang.Throwable -> L69
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L69
            r3.setLastCheckTimestamp(r5)     // Catch: java.lang.Throwable -> L69
            if (r10 <= r4) goto L6b
            java.lang.String r5 = "r1870ea96169c6d87"
            int r6 = r10 - r4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L69
            r7.append(r9)     // Catch: java.lang.Throwable -> L69
            java.lang.String r9 = ", old="
            r7.append(r9)     // Catch: java.lang.Throwable -> L69
            r7.append(r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r9 = ", new="
            r7.append(r9)     // Catch: java.lang.Throwable -> L69
            r7.append(r10)     // Catch: java.lang.Throwable -> L69
            java.lang.String r9 = ", diff="
            r7.append(r9)     // Catch: java.lang.Throwable -> L69
            r7.append(r6)     // Catch: java.lang.Throwable -> L69
            java.lang.String r9 = r7.toString()     // Catch: java.lang.Throwable -> L69
            r0 = 4
            p000.C0888ux.m5988(r5, r9, r1, r0, r1)     // Catch: java.lang.Throwable -> L69
            r9 = 1
            r3.setHasNewReplies(r9)     // Catch: java.lang.Throwable -> L69
            int r9 = r3.getNewReplyCount()     // Catch: java.lang.Throwable -> L69
            int r9 = r9 + r6
            r3.setNewReplyCount(r9)     // Catch: java.lang.Throwable -> L69
            r3.setLastKnownReplyCount(r10)     // Catch: java.lang.Throwable -> L69
            r1 = r3
            goto L74
        L69:
            r8 = move-exception
            goto L89
        L6b:
            int r9 = r3.getLastKnownReplyCount()     // Catch: java.lang.Throwable -> L69
            if (r10 <= r9) goto L74
            r3.setLastKnownReplyCount(r10)     // Catch: java.lang.Throwable -> L69
        L74:
            monitor-exit(r2)
            if (r1 == 0) goto L85
            r8.save()
            r8.notifyChanged()
            if (r11 == 0) goto L84
            com.example.dyhelper.hook.comment.bookmark.ProbeNotifier r8 = com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.INSTANCE
            r8.notifyNewCommentReply(r1)
        L84:
            return r1
        L85:
            r8.save()
            return r1
        L89:
            monitor-exit(r2)
            throw r8
        L8b:
            return r1
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord updateReplyCountAndReplies(java.lang.String r12, int r13, java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r14, boolean r15) {
            r11 = this;
            r14.getClass()
            r0 = 0
            if (r12 == 0) goto L153
            boolean r1 = p000.q02.m4671(r12)
            if (r1 == 0) goto Le
            goto L153
        Le:
            if (r13 >= 0) goto L11
            return r0
        L11:
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r2 = r2.get(r12)     // Catch: java.lang.Throwable -> L6a
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r2 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r2     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto L20
            monitor-exit(r1)
            return r0
        L20:
            int r3 = r2.getLastKnownReplyCount()     // Catch: java.lang.Throwable -> L6a
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6a
            r2.setLastCheckTimestamp(r4)     // Catch: java.lang.Throwable -> L6a
            boolean r4 = r14.isEmpty()     // Catch: java.lang.Throwable -> L6a
            r5 = 4
            r6 = 1
            if (r4 != 0) goto Lea
            r2.setHasNewReplies(r6)     // Catch: java.lang.Throwable -> L6a
            java.util.List r4 = r2.getNewReplyItems()     // Catch: java.lang.Throwable -> L6a
            r4.addAll(r14)     // Catch: java.lang.Throwable -> L6a
            java.util.List r4 = r2.getNewReplyItems()     // Catch: java.lang.Throwable -> L6a
            java.util.HashSet r7 = new java.util.HashSet     // Catch: java.lang.Throwable -> L6a
            r7.<init>()     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6a
            r8.<init>()     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L6a
        L4f:
            boolean r9 = r4.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r9 == 0) goto L6d
            java.lang.Object r9 = r4.next()     // Catch: java.lang.Throwable -> L6a
            r10 = r9
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r10 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r10     // Catch: java.lang.Throwable -> L6a
            java.lang.String r10 = r10.getReplyId()     // Catch: java.lang.Throwable -> L6a
            boolean r10 = r7.add(r10)     // Catch: java.lang.Throwable -> L6a
            if (r10 == 0) goto L4f
            r8.add(r9)     // Catch: java.lang.Throwable -> L6a
            goto L4f
        L6a:
            r11 = move-exception
            goto L151
        L6d:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore$updateReplyCountAndReplies$lambda$22$$inlined$sortedByDescending$1 r4 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore$updateReplyCountAndReplies$lambda$22$$inlined$sortedByDescending$1     // Catch: java.lang.Throwable -> L6a
            r4.<init>()     // Catch: java.lang.Throwable -> L6a
            java.util.List r4 = p000.AbstractC0984xh.m6658(r8, r4)     // Catch: java.lang.Throwable -> L6a
            r7 = 50
            java.util.List r4 = p000.AbstractC0984xh.m6662(r4, r7)     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6a
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L6a
            r2.setNewReplyItems(r7)     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r4 = r14.iterator()     // Catch: java.lang.Throwable -> L6a
        L88:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto Laa
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> L6a
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r7 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r7     // Catch: java.lang.Throwable -> L6a
            java.lang.String r8 = r7.getReplyId()     // Catch: java.lang.Throwable -> L6a
            boolean r8 = p000.q02.m4671(r8)     // Catch: java.lang.Throwable -> L6a
            if (r8 != 0) goto L88
            java.util.Set r8 = r2.getKnownReplyIds()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = r7.getReplyId()     // Catch: java.lang.Throwable -> L6a
            r8.add(r7)     // Catch: java.lang.Throwable -> L6a
            goto L88
        Laa:
            int r4 = r2.getNewReplyCount()     // Catch: java.lang.Throwable -> L6a
            int r7 = r14.size()     // Catch: java.lang.Throwable -> L6a
            int r4 = r4 + r7
            r2.setNewReplyCount(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "r1870ea96169c6d87"
            int r7 = r14.size()     // Catch: java.lang.Throwable -> L6a
            java.util.List r8 = r2.getNewReplyItems()     // Catch: java.lang.Throwable -> L6a
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r9.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r10 = "new reply items cid="
            r9.append(r10)     // Catch: java.lang.Throwable -> L6a
            r9.append(r12)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r10 = ", count="
            r9.append(r10)     // Catch: java.lang.Throwable -> L6a
            r9.append(r7)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = ", total="
            r9.append(r7)     // Catch: java.lang.Throwable -> L6a
            r9.append(r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L6a
            p000.C0888ux.m5988(r4, r7, r0, r5, r0)     // Catch: java.lang.Throwable -> L6a
            r4 = r2
            goto Leb
        Lea:
            r4 = r0
        Leb:
            if (r13 <= r3) goto L132
            java.lang.String r4 = "r1870ea96169c6d87"
            int r7 = r13 - r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r8.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r9 = "reply count increased cid="
            r8.append(r9)     // Catch: java.lang.Throwable -> L6a
            r8.append(r12)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r12 = ", old="
            r8.append(r12)     // Catch: java.lang.Throwable -> L6a
            r8.append(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r12 = ", new="
            r8.append(r12)     // Catch: java.lang.Throwable -> L6a
            r8.append(r13)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r12 = ", diff="
            r8.append(r12)     // Catch: java.lang.Throwable -> L6a
            r8.append(r7)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r12 = r8.toString()     // Catch: java.lang.Throwable -> L6a
            p000.C0888ux.m5988(r4, r12, r0, r5, r0)     // Catch: java.lang.Throwable -> L6a
            r2.setHasNewReplies(r6)     // Catch: java.lang.Throwable -> L6a
            boolean r12 = r14.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r12 == 0) goto L12e
            int r12 = r2.getNewReplyCount()     // Catch: java.lang.Throwable -> L6a
            int r12 = r12 + r7
            r2.setNewReplyCount(r12)     // Catch: java.lang.Throwable -> L6a
        L12e:
            r2.setLastKnownReplyCount(r13)     // Catch: java.lang.Throwable -> L6a
            goto L13c
        L132:
            int r12 = r2.getLastKnownReplyCount()     // Catch: java.lang.Throwable -> L6a
            if (r13 == r12) goto L13b
            r2.setLastKnownReplyCount(r13)     // Catch: java.lang.Throwable -> L6a
        L13b:
            r2 = r4
        L13c:
            monitor-exit(r1)
            if (r2 == 0) goto L14d
            r11.save()
            r11.notifyChanged()
            if (r15 == 0) goto L14c
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier r11 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier.INSTANCE
            r11.notifyNewReply(r2)
        L14c:
            return r2
        L14d:
            r11.save()
            return r2
        L151:
            monitor-exit(r1)
            throw r11
        L153:
            return r0
    }

    public final boolean updateReplyItems(java.lang.String r9, int r10, java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r11, boolean r12) {
            r8 = this;
            r11.getClass()
            r0 = 0
            if (r9 == 0) goto L191
            boolean r1 = p000.q02.m4671(r9)
            if (r1 == 0) goto Le
            goto L191
        Le:
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L18
            if (r10 >= 0) goto L18
            goto L191
        L18:
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.records     // Catch: java.lang.Throwable -> L55
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L55
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r2 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r2     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L27
            monitor-exit(r1)
            return r0
        L27:
            java.util.Set r3 = r2.getKnownReplyIds()     // Catch: java.lang.Throwable -> L55
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L55
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r3)     // Catch: java.lang.Throwable -> L55
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r4.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r5 = r11.iterator()     // Catch: java.lang.Throwable -> L55
        L3a:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L58
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L55
            r7 = r6
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r7 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r7     // Catch: java.lang.Throwable -> L55
            java.lang.String r7 = r7.getReplyId()     // Catch: java.lang.Throwable -> L55
            boolean r7 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L55
            if (r7 != 0) goto L3a
            r4.add(r6)     // Catch: java.lang.Throwable -> L55
            goto L3a
        L55:
            r8 = move-exception
            goto L18f
        L58:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L55
        L61:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L7c
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L55
            r7 = r6
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r7 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r7     // Catch: java.lang.Throwable -> L55
            java.lang.String r7 = r7.getReplyId()     // Catch: java.lang.Throwable -> L55
            boolean r7 = r3.contains(r7)     // Catch: java.lang.Throwable -> L55
            if (r7 != 0) goto L61
            r5.add(r6)     // Catch: java.lang.Throwable -> L55
            goto L61
        L7c:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r4.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L55
        L8a:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto La5
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L55
            r7 = r6
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r7 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r7     // Catch: java.lang.Throwable -> L55
            java.lang.String r7 = r7.getReplyId()     // Catch: java.lang.Throwable -> L55
            boolean r7 = r3.add(r7)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L8a
            r4.add(r6)     // Catch: java.lang.Throwable -> L55
            goto L8a
        La5:
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L55
        La9:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L55
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r3 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r3     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r3.getReplyId()     // Catch: java.lang.Throwable -> L55
            boolean r5 = p000.q02.m4671(r5)     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto La9
            java.util.Set r5 = r2.getKnownReplyIds()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r3.getReplyId()     // Catch: java.lang.Throwable -> L55
            r5.add(r3)     // Catch: java.lang.Throwable -> L55
            goto La9
        Lcb:
            boolean r11 = r4.isEmpty()     // Catch: java.lang.Throwable -> L55
            r3 = 1
            if (r11 != 0) goto L161
            r2.setHasNewReplies(r3)     // Catch: java.lang.Throwable -> L55
            java.util.List r11 = r2.getNewReplyItems()     // Catch: java.lang.Throwable -> L55
            r11.addAll(r4)     // Catch: java.lang.Throwable -> L55
            java.util.List r11 = r2.getNewReplyItems()     // Catch: java.lang.Throwable -> L55
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L55
        Lee:
            boolean r6 = r11.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L109
            java.lang.Object r6 = r11.next()     // Catch: java.lang.Throwable -> L55
            r7 = r6
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r7 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r7     // Catch: java.lang.Throwable -> L55
            java.lang.String r7 = r7.getReplyId()     // Catch: java.lang.Throwable -> L55
            boolean r7 = r0.add(r7)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto Lee
            r5.add(r6)     // Catch: java.lang.Throwable -> L55
            goto Lee
        L109:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore$updateReplyItems$lambda$18$$inlined$sortedByDescending$1 r11 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore$updateReplyItems$lambda$18$$inlined$sortedByDescending$1     // Catch: java.lang.Throwable -> L55
            r11.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.List r11 = p000.AbstractC0984xh.m6658(r5, r11)     // Catch: java.lang.Throwable -> L55
            r0 = 50
            java.util.List r11 = p000.AbstractC0984xh.m6662(r11, r0)     // Catch: java.lang.Throwable -> L55
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L55
            r2.setNewReplyItems(r0)     // Catch: java.lang.Throwable -> L55
            int r11 = r2.getNewReplyCount()     // Catch: java.lang.Throwable -> L55
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L55
            int r11 = r11 + r0
            r2.setNewReplyCount(r11)     // Catch: java.lang.Throwable -> L55
            java.lang.String r11 = "r1870ea96169c6d87"
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L55
            java.util.List r4 = r2.getNewReplyItems()     // Catch: java.lang.Throwable -> L55
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = "new reply items cid="
            r5.append(r6)     // Catch: java.lang.Throwable -> L55
            r5.append(r9)     // Catch: java.lang.Throwable -> L55
            java.lang.String r9 = ", count="
            r5.append(r9)     // Catch: java.lang.Throwable -> L55
            r5.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r9 = ", total="
            r5.append(r9)     // Catch: java.lang.Throwable -> L55
            r5.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Throwable -> L55
            r0 = 4
            r4 = 0
            p000.C0888ux.m5988(r11, r9, r4, r0, r4)     // Catch: java.lang.Throwable -> L55
            r0 = r3
        L161:
            if (r10 < 0) goto L16d
            int r9 = r2.getLastKnownReplyCount()     // Catch: java.lang.Throwable -> L55
            if (r10 == r9) goto L16d
            r2.setLastKnownReplyCount(r10)     // Catch: java.lang.Throwable -> L55
            r0 = r3
        L16d:
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L55
            r2.setLastCheckTimestamp(r9)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r1)
            if (r0 == 0) goto L18b
            r8.save()
            r8.notifyChanged()
            if (r12 == 0) goto L18a
            boolean r8 = r2.getHasNewReplies()
            if (r8 != r3) goto L18a
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier r8 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier.INSTANCE
            r8.notifyNewReply(r2)
        L18a:
            return r0
        L18b:
            r8.save()
            return r0
        L18f:
            monitor-exit(r1)
            throw r8
        L191:
            return r0
    }
}
