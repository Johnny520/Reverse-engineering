package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class VideoBookmarkStore {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore INSTANCE = null;
    private static final java.lang.String KEY_BOOKMARKS = "bookmarks_v1";
    private static final java.lang.String SP_NAME = "dyhelper_video_bookmark";
    private static final java.lang.String TAG = "re27cd0e5ed7f835";
    private static volatile android.content.Context appContext;
    private static final java.util.concurrent.CopyOnWriteArrayList<p000.p70> listeners = null;
    private static final java.lang.Object lock = null;
    private static final java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> records = null;

    static {
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore r0 = new com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.INSTANCE = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.lock = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.records = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.listeners = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.$stable = r0
            return
    }

    private VideoBookmarkStore() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void load() {
            r6 = this;
            android.content.Context r6 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.appContext
            if (r6 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.lock
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.records     // Catch: java.lang.Throwable -> L68
            r1.clear()     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "dyhelper_video_bookmark"
            r2 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "bookmarks_v1"
            java.lang.String r3 = "[]"
            java.lang.String r6 = r6.getString(r1, r3)     // Catch: java.lang.Throwable -> L21
            if (r6 != 0) goto L23
            java.lang.String r6 = "[]"
            goto L23
        L21:
            r6 = move-exception
            goto L54
        L23:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L21
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L21
            int r6 = r1.length()     // Catch: java.lang.Throwable -> L21
        L2c:
            if (r2 >= r6) goto L51
            org.json.JSONObject r3 = r1.optJSONObject(r2)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L35
            goto L4e
        L35:
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord$Companion r4 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord.Companion     // Catch: java.lang.Throwable -> L21
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r3 = r4.fromJson(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = r3.getAwemeId()     // Catch: java.lang.Throwable -> L21
            boolean r4 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L4e
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r4 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.records     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r3.getAwemeId()     // Catch: java.lang.Throwable -> L21
            r4.put(r5, r3)     // Catch: java.lang.Throwable -> L21
        L4e:
            int r2 = r2 + 1
            goto L2c
        L51:
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L21
            goto L5a
        L54:
            eo1 r1 = new eo1     // Catch: java.lang.Throwable -> L68
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L68
            r6 = r1
        L5a:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L6a
            java.lang.String r1 = "re27cd0e5ed7f835"
            java.lang.String r2 = "load failed"
            p000.C0888ux.m5977(r1, r2, r6)     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r6 = move-exception
            goto L6c
        L6a:
            monitor-exit(r0)
            return
        L6c:
            monitor-exit(r0)
            throw r6
    }

    private final void notifyChanged() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<p70> r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.listeners
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
            android.content.Context r4 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.appContext
            if (r4 != 0) goto L5
            goto L64
        L5:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.lock     // Catch: java.lang.Throwable -> L50
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L50
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r2 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.records     // Catch: java.lang.Throwable -> L30
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L30
            r2.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L30
        L1c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L32
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L30
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r3 = (com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord) r3     // Catch: java.lang.Throwable -> L30
            org.json.JSONObject r3 = r3.toJson()     // Catch: java.lang.Throwable -> L30
            r0.put(r3)     // Catch: java.lang.Throwable -> L30
            goto L1c
        L30:
            r4 = move-exception
            goto L4e
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "dyhelper_video_bookmark"
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
            java.lang.String r0 = "re27cd0e5ed7f835"
            java.lang.String r1 = "save failed"
            p000.C0888ux.m5977(r0, r1, r4)
        L64:
            return
    }

    public final boolean add(com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r5) {
            r4 = this;
            r5.getClass()
            java.lang.String r0 = r5.getAwemeId()
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto Lf
            r4 = 0
            return r4
        Lf:
            java.lang.Object r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.lock
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.records     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r5.getAwemeId()     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r5.getAwemeId()     // Catch: java.lang.Throwable -> L4e
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> L4e
            r1 = r2 ^ 1
            monitor-exit(r0)
            r4.save()
            r4.notifyChanged()
            java.lang.String r4 = "re27cd0e5ed7f835"
            java.lang.String r5 = r5.getAwemeId()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "save video bookmark awemeId="
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r5 = ", added="
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            r0 = 4
            r2 = 0
            p000.C0888ux.m5988(r4, r5, r2, r0, r2)
            return r1
        L4e:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public final void addListener(p000.p70 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList<p70> r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.listeners
            r0.add(r1)
            return
    }

    public final java.util.List<com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> all() {
            r1 = this;
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.records     // Catch: java.lang.Throwable -> L14
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
            java.lang.Object r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.lock
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.records     // Catch: java.lang.Throwable -> L10
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

    public final void init(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.appContext
            if (r0 == 0) goto L8
            return
        L8:
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.appContext = r2
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
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.records     // Catch: java.lang.Throwable -> L14
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

    public final boolean remove(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L23
            boolean r1 = p000.q02.m4671(r4)
            if (r1 == 0) goto La
            goto L23
        La:
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r2 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.records     // Catch: java.lang.Throwable -> L20
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
            java.util.concurrent.CopyOnWriteArrayList<p70> r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.listeners
            r0.remove(r1)
            return
    }
}
