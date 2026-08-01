package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileBookmarkStore {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore INSTANCE = null;
    private static final java.lang.String KEY_BOOKMARKS = "profile_bookmarks_v1";
    private static final java.lang.String SP_NAME = "dyhelper_profile_bookmark";
    private static final java.lang.String TAG = "r7c84497415b5fd17";
    private static volatile android.content.Context appContext;
    private static final java.util.concurrent.CopyOnWriteArrayList<p000.p70> listeners = null;
    private static final java.lang.Object lock = null;
    private static final java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> records = null;

    static {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.listeners = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.$stable = r0
            return
    }

    private ProfileBookmarkStore() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void load() {
            r6 = this;
            android.content.Context r6 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.appContext
            if (r6 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L64
            r1.clear()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "dyhelper_profile_bookmark"
            r2 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "profile_bookmarks_v1"
            java.lang.String r3 = "[]"
            java.lang.String r6 = r6.getString(r1, r3)     // Catch: java.lang.Throwable -> L21
            if (r6 != 0) goto L23
            java.lang.String r6 = "[]"
            goto L23
        L21:
            r6 = move-exception
            goto L50
        L23:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L21
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L21
            int r6 = r1.length()     // Catch: java.lang.Throwable -> L21
        L2c:
            if (r2 >= r6) goto L4d
            org.json.JSONObject r3 = r1.optJSONObject(r2)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L35
            goto L4a
        L35:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord$Companion r4 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord.Companion     // Catch: java.lang.Throwable -> L21
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r3 = r4.fromJson(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = r3.uniqueKey()     // Catch: java.lang.Throwable -> L21
            boolean r5 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L21
            if (r5 != 0) goto L4a
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r5 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L21
            r5.put(r4, r3)     // Catch: java.lang.Throwable -> L21
        L4a:
            int r2 = r2 + 1
            goto L2c
        L4d:
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L21
            goto L56
        L50:
            eo1 r1 = new eo1     // Catch: java.lang.Throwable -> L64
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L64
            r6 = r1
        L56:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)     // Catch: java.lang.Throwable -> L64
            if (r6 == 0) goto L66
            java.lang.String r1 = "r7c84497415b5fd17"
            java.lang.String r2 = "load failed"
            p000.C0888ux.m5977(r1, r2, r6)     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r6 = move-exception
            goto L68
        L66:
            monitor-exit(r0)
            return
        L68:
            monitor-exit(r0)
            throw r6
    }

    private final void notifyChanged() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<p70> r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.listeners
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
            android.content.Context r4 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.appContext
            if (r4 != 0) goto L5
            goto L64
        L5:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock     // Catch: java.lang.Throwable -> L50
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L50
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L30
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L30
            r2.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L30
        L1c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L32
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L30
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r3 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r3     // Catch: java.lang.Throwable -> L30
            org.json.JSONObject r3 = r3.toJson()     // Catch: java.lang.Throwable -> L30
            r0.put(r3)     // Catch: java.lang.Throwable -> L30
            goto L1c
        L30:
            r4 = move-exception
            goto L4e
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "dyhelper_profile_bookmark"
            r2 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "profile_bookmarks_v1"
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
            java.lang.String r0 = "r7c84497415b5fd17"
            java.lang.String r1 = "save failed"
            p000.C0888ux.m5977(r0, r1, r4)
        L64:
            return
    }

    public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord updateAwemeSnapshot$default(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0, java.lang.String r1, java.util.List r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L8
            int r3 = r2.size()
        L8:
            r5 = r5 & 8
            if (r5 == 0) goto Ld
            r4 = 1
        Ld:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r0.updateAwemeSnapshot(r1, r2, r3, r4)
            return r0
    }

    public final boolean add(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r9) {
            r8 = this;
            r9.getClass()
            java.lang.String r0 = r9.uniqueKey()
            boolean r1 = p000.q02.m4671(r0)
            r2 = 0
            if (r1 == 0) goto Lf
            return r2
        Lf:
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r3 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r3.containsKey(r0)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L1b
            goto L1f
        L1b:
            r3.put(r0, r9)     // Catch: java.lang.Throwable -> L4c
            r2 = 1
        L1f:
            monitor-exit(r1)
            if (r2 == 0) goto L4b
            java.lang.String r1 = "r7c84497415b5fd17"
            java.lang.String r3 = r9.getUid()
            java.lang.String r4 = r9.getSecUid()
            java.lang.String r9 = r9.getNickname()
            java.lang.String r5 = "add profile bookmark key="
            java.lang.String r6 = " uid="
            java.lang.String r7 = ", secUid="
            java.lang.StringBuilder r0 = p000.lz1.m3695(r5, r0, r6, r3, r7)
            java.lang.String r3 = ", nickname="
            java.lang.String r9 = p000.AbstractC0602nx.m4133(r0, r4, r3, r9)
            r0 = 4
            r3 = 0
            p000.C0888ux.m5988(r1, r9, r3, r0, r3)
            r8.save()
            r8.notifyChanged()
        L4b:
            return r2
        L4c:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
    }

    public final void addListener(p000.p70 r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList<p70> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.listeners
            r0.add(r1)
            return
    }

    public final java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> all() {
            r1 = this;
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L14
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
            java.lang.Object r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L10
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

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord get(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L19
            boolean r1 = p000.q02.m4671(r2)
            if (r1 == 0) goto L9
            goto L19
        L9:
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L16
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r2     // Catch: java.lang.Throwable -> L16
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

    public final void init(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.appContext
            if (r0 == 0) goto L8
            return
        L8:
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.appContext = r2
            r1.load()
            return
    }

    public final boolean isBookmarked(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2) {
            r1 = this;
            r1 = 0
            if (r2 != 0) goto L4
            return r1
        L4:
            java.lang.String r2 = r2.uniqueKey()
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto Lf
            return r1
        Lf:
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            return r2
        L1a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final boolean isInitialized() {
            r0 = this;
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.appContext
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void markRead(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L38
            boolean r0 = p000.q02.m4671(r4)
            if (r0 == 0) goto L9
            goto L38
        L9:
            java.lang.Object r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L35
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r4     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L18
            monitor-exit(r0)
            return
        L18:
            r1 = 0
            r4.setHasNewAweme(r1)     // Catch: java.lang.Throwable -> L35
            r4.setNewAwemeCount(r1)     // Catch: java.lang.Throwable -> L35
            java.util.List r1 = r4.getNewAwemeItems()     // Catch: java.lang.Throwable -> L35
            r1.clear()     // Catch: java.lang.Throwable -> L35
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L35
            r4.setLastCheckTimestamp(r1)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)
            r3.save()
            r3.notifyChanged()
            return
        L35:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L38:
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
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L20
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
            java.util.concurrent.CopyOnWriteArrayList<p70> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.listeners
            r0.remove(r1)
            return
    }

    public final int size() {
            r1 = this;
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> Lb
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord updateAwemeSnapshot(java.lang.String r13, java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r14, int r15, boolean r16) {
            r12 = this;
            r14.getClass()
            r0 = 0
            if (r13 == 0) goto L219
            boolean r1 = p000.q02.m4671(r13)
            if (r1 == 0) goto Le
            goto L219
        Le:
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L16
            goto L219
        L16:
            java.lang.Object r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.lock
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.records     // Catch: java.lang.Throwable -> L53
            java.lang.Object r2 = r2.get(r13)     // Catch: java.lang.Throwable -> L53
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r2     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L25
            monitor-exit(r1)
            return r0
        L25:
            java.util.Set r3 = r2.getKnownAwemeIds()     // Catch: java.lang.Throwable -> L53
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L53
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r3)     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r4.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r5 = r14.iterator()     // Catch: java.lang.Throwable -> L53
        L38:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L57
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L53
            r7 = r6
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r7 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r7     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r7.getAwemeId()     // Catch: java.lang.Throwable -> L53
            boolean r7 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L53
            if (r7 != 0) goto L38
            r4.add(r6)     // Catch: java.lang.Throwable -> L53
            goto L38
        L53:
            r0 = move-exception
            r12 = r0
            goto L217
        L57:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r5.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L53
        L60:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L53
            r7 = r6
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r7 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r7     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r7.getAwemeId()     // Catch: java.lang.Throwable -> L53
            boolean r7 = r3.contains(r7)     // Catch: java.lang.Throwable -> L53
            if (r7 != 0) goto L60
            r5.add(r6)     // Catch: java.lang.Throwable -> L53
            goto L60
        L7b:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r3.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Throwable -> L53
        L84:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto La4
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L53
            r6 = r5
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r6 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r6     // Catch: java.lang.Throwable -> L53
            long r6 = r6.getCreateTime()     // Catch: java.lang.Throwable -> L53
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r8 = r2.getCreateTimestamp()     // Catch: java.lang.Throwable -> L53
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L84
            r3.add(r5)     // Catch: java.lang.Throwable -> L53
            goto L84
        La4:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L53
            r4.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r5.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L53
        Lb2:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto Lcd
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L53
            r7 = r6
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r7 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r7     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r7.getAwemeId()     // Catch: java.lang.Throwable -> L53
            boolean r7 = r4.add(r7)     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto Lb2
            r5.add(r6)     // Catch: java.lang.Throwable -> L53
            goto Lb2
        Lcd:
            java.util.Iterator r3 = r14.iterator()     // Catch: java.lang.Throwable -> L53
        Ld1:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto Lf5
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L53
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r4 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r4     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = r4.getAwemeId()     // Catch: java.lang.Throwable -> L53
            boolean r6 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L53
            if (r6 != 0) goto Ld1
            java.util.Set r6 = r2.getKnownAwemeIds()     // Catch: java.lang.Throwable -> L53
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r4.getAwemeId()     // Catch: java.lang.Throwable -> L53
            r6.add(r4)     // Catch: java.lang.Throwable -> L53
            goto Ld1
        Lf5:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r3.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r4 = r14.iterator()     // Catch: java.lang.Throwable -> L53
        Lfe:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L119
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L53
            r7 = r6
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r7 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r7     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r7.getAwemeId()     // Catch: java.lang.Throwable -> L53
            boolean r7 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L53
            if (r7 != 0) goto Lfe
            r3.add(r6)     // Catch: java.lang.Throwable -> L53
            goto Lfe
        L119:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L53
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L125
            r4 = r0
            goto L14e
        L125:
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L53
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r6 != 0) goto L130
            goto L14e
        L130:
            r6 = r4
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r6 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r6     // Catch: java.lang.Throwable -> L53
            long r6 = r6.getCreateTime()     // Catch: java.lang.Throwable -> L53
        L137:
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L53
            r9 = r8
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r9 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r9     // Catch: java.lang.Throwable -> L53
            long r9 = r9.getCreateTime()     // Catch: java.lang.Throwable -> L53
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 >= 0) goto L148
            r4 = r8
            r6 = r9
        L148:
            boolean r8 = r3.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r8 != 0) goto L137
        L14e:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r4 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r4     // Catch: java.lang.Throwable -> L53
            boolean r3 = r5.isEmpty()     // Catch: java.lang.Throwable -> L53
            r6 = 1
            if (r3 != 0) goto L1e1
            r2.setHasNewAweme(r6)     // Catch: java.lang.Throwable -> L53
            int r3 = r2.getNewAwemeCount()     // Catch: java.lang.Throwable -> L53
            int r7 = r5.size()     // Catch: java.lang.Throwable -> L53
            int r3 = r3 + r7
            r2.setNewAwemeCount(r3)     // Catch: java.lang.Throwable -> L53
            java.util.List r3 = r2.getNewAwemeItems()     // Catch: java.lang.Throwable -> L53
            r3.addAll(r5)     // Catch: java.lang.Throwable -> L53
            java.util.List r3 = r2.getNewAwemeItems()     // Catch: java.lang.Throwable -> L53
            java.util.HashSet r7 = new java.util.HashSet     // Catch: java.lang.Throwable -> L53
            r7.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r8.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L53
        L17f:
            boolean r9 = r3.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r9 == 0) goto L19a
            java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L53
            r10 = r9
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r10 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r10     // Catch: java.lang.Throwable -> L53
            java.lang.String r10 = r10.getAwemeId()     // Catch: java.lang.Throwable -> L53
            boolean r10 = r7.add(r10)     // Catch: java.lang.Throwable -> L53
            if (r10 == 0) goto L17f
            r8.add(r9)     // Catch: java.lang.Throwable -> L53
            goto L17f
        L19a:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore$updateAwemeSnapshot$lambda$17$$inlined$sortedByDescending$1 r3 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore$updateAwemeSnapshot$lambda$17$$inlined$sortedByDescending$1     // Catch: java.lang.Throwable -> L53
            r3.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.List r3 = p000.AbstractC0984xh.m6658(r8, r3)     // Catch: java.lang.Throwable -> L53
            r7 = 50
            java.util.List r3 = p000.AbstractC0984xh.m6662(r3, r7)     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L53
            r2.setNewAwemeItems(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = "r7c84497415b5fd17"
            java.lang.String r7 = r2.displayName()     // Catch: java.lang.Throwable -> L53
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r8.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r9 = "new profile aweme key="
            r8.append(r9)     // Catch: java.lang.Throwable -> L53
            r8.append(r13)     // Catch: java.lang.Throwable -> L53
            java.lang.String r13 = ", user="
            r8.append(r13)     // Catch: java.lang.Throwable -> L53
            r8.append(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r13 = ", new="
            r8.append(r13)     // Catch: java.lang.Throwable -> L53
            r8.append(r5)     // Catch: java.lang.Throwable -> L53
            java.lang.String r13 = r8.toString()     // Catch: java.lang.Throwable -> L53
            r5 = 4
            p000.C0888ux.m5988(r3, r13, r0, r5, r0)     // Catch: java.lang.Throwable -> L53
            r0 = r2
        L1e1:
            int r13 = r14.size()     // Catch: java.lang.Throwable -> L53
            int r13 = java.lang.Math.max(r15, r13)     // Catch: java.lang.Throwable -> L53
            r2.setLastAwemeCount(r13)     // Catch: java.lang.Throwable -> L53
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L53
            r2.setLastCheckTimestamp(r13)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L1fc
            java.lang.String r13 = r4.getAwemeId()     // Catch: java.lang.Throwable -> L53
            r2.setLastNewestAwemeId(r13)     // Catch: java.lang.Throwable -> L53
        L1fc:
            monitor-exit(r1)
            if (r0 == 0) goto L213
            r12.save()
            r12.notifyChanged()
            if (r16 == 0) goto L212
            boolean r12 = r0.getNotificationEnabled()
            if (r12 != r6) goto L212
            com.example.dyhelper.hook.comment.bookmark.ProbeNotifier r12 = com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.INSTANCE
            r12.notifyNewProfileAweme(r0)
        L212:
            return r0
        L213:
            r12.save()
            return r0
        L217:
            monitor-exit(r1)
            throw r12
        L219:
            return r0
    }
}
