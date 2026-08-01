package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkHook {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook INSTANCE = null;
    private static final java.lang.String TAG = "rfdffda28262874f1";
    private static final java.util.Set<java.lang.Integer> bindHookedLoaders = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.util.List<java.lang.reflect.Field>> fieldsCache = null;
    private static final java.util.Set<java.lang.String> hookedMethods = null;
    private static volatile android.content.Context hostContext;
    private static volatile boolean providerRegistered;
    private static final java.util.Set<java.lang.Integer> replyHookedLoaders = null;

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.INSTANCE = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.hookedMethods = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.bindHookedLoaders = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.replyHookedLoaders = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.fieldsCache = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.$stable = r0
            return
    }

    private CommentBookmarkHook() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ void access$handleAfterBind(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook r0, p000.k01 r1) {
            r0.handleAfterBind(r1)
            return
    }

    public static final /* synthetic */ void access$handleAfterReplyQuery(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook r0, p000.k01 r1) {
            r0.handleAfterReplyQuery(r1)
            return
    }

    private final java.util.List<java.lang.reflect.Field> allFields(java.lang.Class<?> r4) {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.util.List<java.lang.reflect.Field>> r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.fieldsCache
            java.lang.Object r0 = r3.get(r4)
            if (r0 != 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r4
        Le:
            if (r1 == 0) goto L27
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L27
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L22
            r2.getClass()     // Catch: java.lang.Throwable -> L22
            p000.AbstractC0984xh.m6659(r0, r2)     // Catch: java.lang.Throwable -> L22
        L22:
            java.lang.Class r1 = r1.getSuperclass()
            goto Le
        L27:
            java.lang.Object r3 = r3.putIfAbsent(r4, r0)
            if (r3 != 0) goto L2e
            goto L2f
        L2e:
            r0 = r3
        L2f:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private final java.lang.Object findCommentByAdapterPosition(java.lang.Object r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L10
            if (r3 >= 0) goto L5
            goto L10
        L5:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            r0 = 0
            java.lang.Object r1 = findCommentByAdapterPosition$dfs(r1, r3, r2, r0)
            return r1
        L10:
            r1 = 0
            return r1
    }

    private static final java.lang.Object findCommentByAdapterPosition$dfs(java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean> r6, int r7, java.lang.Object r8, int r9) {
            r0 = 0
            if (r8 != 0) goto L5
            goto Lc1
        L5:
            r1 = 3
            if (r9 <= r1) goto La
            goto Lc1
        La:
            boolean r1 = r6.containsKey(r8)
            if (r1 == 0) goto L12
            goto Lc1
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.put(r8, r1)
            boolean r1 = r8 instanceof android.view.View
            if (r1 == 0) goto L1c
            return r0
        L1c:
            boolean r1 = r8 instanceof java.lang.CharSequence
            if (r1 == 0) goto L21
            return r0
        L21:
            java.lang.Class r1 = r8.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "java.lang."
            r3 = 0
            boolean r2 = p000.x02.m6485(r1, r2, r3)
            if (r2 != 0) goto Lc1
            java.lang.String r2 = "kotlin."
            boolean r2 = p000.x02.m6485(r1, r2, r3)
            if (r2 != 0) goto Lc1
            java.lang.String r2 = "android."
            boolean r2 = p000.x02.m6485(r1, r2, r3)
            if (r2 != 0) goto Lc1
            java.lang.String r2 = "androidx."
            boolean r1 = p000.x02.m6485(r1, r2, r3)
            if (r1 == 0) goto L4c
            goto Lc1
        L4c:
            boolean r1 = r8 instanceof java.util.List
            r2 = 1
            if (r1 == 0) goto L81
            int r1 = r7 + (-3)
            if (r1 >= 0) goto L56
            goto L57
        L56:
            r3 = r1
        L57:
            int r1 = r7 + 3
            java.util.List r8 = (java.util.List) r8
            int r4 = r8.size()
            int r4 = r4 - r2
            if (r1 <= r4) goto L63
            r1 = r4
        L63:
            if (r3 > r1) goto Lc1
        L65:
            java.lang.Object r4 = p000.AbstractC0984xh.m6641(r3, r8)
            java.lang.Object r4 = findCommentByAdapterPosition$tryCandidate(r4)
            if (r4 != 0) goto L79
            java.lang.Object r4 = p000.AbstractC0984xh.m6641(r3, r8)
            int r5 = r9 + 1
            java.lang.Object r4 = findCommentByAdapterPosition$dfs(r6, r7, r4, r5)
        L79:
            if (r4 == 0) goto L7c
            return r4
        L7c:
            if (r3 == r1) goto Lc1
            int r3 = r3 + 1
            goto L65
        L81:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.INSTANCE
            java.lang.Class r3 = r8.getClass()
            java.util.List r1 = r1.allFields(r3)
            r3 = 24
            java.util.List r1 = p000.AbstractC0984xh.m6662(r1, r3)
            java.util.Iterator r1 = r1.iterator()
        L95:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc1
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            int r4 = r3.getModifiers()     // Catch: java.lang.Exception -> L95
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Exception -> L95
            if (r4 != 0) goto L95
            r3.setAccessible(r2)     // Catch: java.lang.Exception -> L95
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Exception -> L95
            java.lang.Object r4 = findCommentByAdapterPosition$tryCandidate(r3)     // Catch: java.lang.Exception -> L95
            if (r4 != 0) goto Lbe
            int r4 = r9 + 1
            java.lang.Object r4 = findCommentByAdapterPosition$dfs(r6, r7, r3, r4)     // Catch: java.lang.Exception -> L95
        Lbe:
            if (r4 == 0) goto L95
            return r4
        Lc1:
            return r0
    }

    private static final java.lang.Object findCommentByAdapterPosition$tryCandidate(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object r1 = r0.findCommentObject(r1)
            return r1
    }

    private final java.lang.reflect.Field findField(java.lang.Class<?> r6, java.lang.String r7) {
            r5 = this;
        L0:
            r5 = 0
            if (r6 == 0) goto L2f
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L2f
            java.lang.reflect.Field[] r0 = r6.getDeclaredFields()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = p000.ln0.m3626(r4, r7)
            if (r4 == 0) goto L24
            r5 = r3
            goto L27
        L24:
            int r2 = r2 + 1
            goto L14
        L27:
            if (r5 == 0) goto L2a
            return r5
        L2a:
            java.lang.Class r6 = r6.getSuperclass()
            goto L0
        L2f:
            return r5
    }

    private final android.view.View getItemView(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "itemView"
            java.lang.reflect.Field r3 = r3.findField(r1, r2)     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto Le
            return r0
        Le:
            r1 = 1
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L1d
            boolean r4 = r3 instanceof android.view.View     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L1f
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L1d
            goto L27
        L1d:
            r3 = move-exception
            goto L21
        L1f:
            r3 = r0
            goto L27
        L21:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L27:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L2c
            goto L2d
        L2c:
            r0 = r3
        L2d:
            android.view.View r0 = (android.view.View) r0
            return r0
    }

    private final void handleAfterBind(p000.k01 r9) {
            r8 = this;
            java.lang.String r0 = "rfdffda28262874f1"
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L29
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto Lb8
            java.lang.Object r1 = r9.f5691     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r9 = r9.f5692     // Catch: java.lang.Throwable -> L29
            boolean r2 = r8.shouldSkipBind(r1)     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto Lb8
            r9.getClass()     // Catch: java.lang.Throwable -> L29
            int r2 = r9.length     // Catch: java.lang.Throwable -> L29
            r3 = 0
            r4 = r3
        L1a:
            r5 = 0
            if (r4 >= r2) goto L2c
            r6 = r9[r4]     // Catch: java.lang.Throwable -> L29
            boolean r7 = r8.isRecyclerViewHolderLike(r6)     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L26
            goto L2d
        L26:
            int r4 = r4 + 1
            goto L1a
        L29:
            r8 = move-exception
            goto Lbb
        L2c:
            r6 = r5
        L2d:
            if (r6 == 0) goto L32
            r8.getItemView(r6)     // Catch: java.lang.Throwable -> L29
        L32:
            int r2 = r9.length     // Catch: java.lang.Throwable -> L29
        L33:
            if (r3 >= r2) goto L3f
            r4 = r9[r3]     // Catch: java.lang.Throwable -> L29
            boolean r7 = r4 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L3c
            goto L40
        L3c:
            int r3 = r3 + 1
            goto L33
        L3f:
            r4 = r5
        L40:
            boolean r2 = r4 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L47
            r5 = r4
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L29
        L47:
            if (r5 == 0) goto L4e
            int r2 = r5.intValue()     // Catch: java.lang.Throwable -> L29
            goto L4f
        L4e:
            r2 = -1
        L4f:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r4 = new java.lang.Object[]{r9, r6, r1}     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r3.findCommentObject(r4)     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L5f
            java.lang.Object r4 = r8.findCommentByAdapterPosition(r1, r2)     // Catch: java.lang.Throwable -> L29
        L5f:
            if (r4 == 0) goto Lb8
            java.lang.String r8 = r3.getCommentId(r4)     // Catch: java.lang.Throwable -> L29
            if (r8 == 0) goto Lb8
            boolean r2 = p000.q02.m4671(r8)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L6e
            goto Lb8
        L6e:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L29
            boolean r5 = r2.isBookmarked(r8)     // Catch: java.lang.Throwable -> L29
            if (r5 != 0) goto L77
            goto Lb8
        L77:
            int r5 = r3.getReplyCount(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r7 = new java.lang.Object[]{r9, r6, r1}     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = r3.findAwemeObject(r7)     // Catch: java.lang.Throwable -> L29
            com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump r7 = com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump.INSTANCE     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r6, r1}     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList r9 = p000.AbstractC0312g7.m2248(r9)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r7.findVideoCommentPageParam(r9)     // Catch: java.lang.Throwable -> L29
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNativeObjectCache.INSTANCE     // Catch: java.lang.Throwable -> L29
            r1.put(r8, r3, r4, r9)     // Catch: java.lang.Throwable -> L29
            if (r5 < 0) goto Lb8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r9.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "bind update bookmarked comment, cid="
            r9.append(r1)     // Catch: java.lang.Throwable -> L29
            r9.append(r8)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = ", replyCount="
            r9.append(r1)     // Catch: java.lang.Throwable -> L29
            r9.append(r5)     // Catch: java.lang.Throwable -> L29
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L29
            p000.C0888ux.m5975(r0, r9)     // Catch: java.lang.Throwable -> L29
            r9 = 1
            r2.updateReplyCount(r8, r5, r9)     // Catch: java.lang.Throwable -> L29
        Lb8:
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L29
            goto Lc1
        Lbb:
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        Lc1:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto Lcc
            java.lang.String r9 = "handleAfterBind failed"
            p000.C0888ux.m5977(r0, r9, r8)
        Lcc:
            return
    }

    private final void handleAfterReplyQuery(p000.k01 r3) {
            r2 = this;
            java.lang.Object[] r2 = r3.f5692     // Catch: java.lang.Throwable -> L2e
            r2.getClass()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = p000.AbstractC0312g7.m2250(r2)     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L10
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2e
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L14
            goto L42
        L14:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r0.isBookmarked(r2)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L1d
            goto L42
        L1d:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r3.f5694     // Catch: java.lang.Throwable -> L2e
            int r3 = r1.extractReplyCountFromResult(r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 < 0) goto L2b
            r1 = 1
            r0.updateReplyCount(r2, r3, r1)     // Catch: java.lang.Throwable -> L2e
        L2b:
            s62 r2 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2e
            goto L35
        L2e:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L35:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto L42
            java.lang.String r3 = "rfdffda28262874f1"
            java.lang.String r0 = "handleAfterReplyQuery failed"
            p000.C0888ux.m5977(r3, r0, r2)
        L42:
            return
    }

    public static /* synthetic */ void init$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook r0, java.lang.ClassLoader r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.init(r1, r2)
            return
    }

    private final void installBindHooks(java.lang.ClassLoader r11, boolean r12) {
            r10 = this;
            int r10 = java.lang.System.identityHashCode(r11)
            java.util.Set<java.lang.Integer> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.bindHookedLoaders
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            boolean r1 = r0.add(r1)
            if (r1 != 0) goto L11
            return
        L11:
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r1 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.util.List r11 = r1.resolveBindMethods(r11, r12)
            boolean r1 = r11.isEmpty()
            java.lang.String r2 = "rfdffda28262874f1"
            if (r1 == 0) goto L38
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0.remove(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "bind methods empty, allowDexKitScan="
            r10.<init>(r11)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            p000.C0888ux.m5975(r2, r10)
            return
        L38:
            java.util.Iterator r10 = r11.iterator()
            r12 = 0
            r0 = r12
            r1 = r0
            r3 = r1
        L40:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto Lae
            java.lang.Object r4 = r10.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.INSTANCE
            java.lang.String r6 = r5.stableKey(r4)
            java.util.Set<java.lang.String> r7 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.hookedMethods
            boolean r8 = r7.add(r6)
            if (r8 != 0) goto L5d
            int r0 = r0 + 1
            goto L40
        L5d:
            int r8 = r4.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isAbstract(r8)
            if (r8 == 0) goto L6d
            int r1 = r1 + 1
            r7.remove(r6)
            goto L40
        L6d:
            r7 = 1
            r4.setAccessible(r7)     // Catch: java.lang.Throwable -> L84
            xq0 r7 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L84
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook$installBindHooks$1$1$1 r8 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook$installBindHooks$1$1$1     // Catch: java.lang.Throwable -> L84
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L84
            r7.m6775(r4, r8)     // Catch: java.lang.Throwable -> L84
            int r4 = r12 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L82
            goto L8e
        L82:
            r12 = move-exception
            goto L88
        L84:
            r4 = move-exception
            r9 = r4
            r4 = r12
            r12 = r9
        L88:
            eo1 r5 = new eo1
            r5.<init>(r12)
            r12 = r5
        L8e:
            java.lang.Throwable r12 = p000.fo1.m2190(r12)
            if (r12 == 0) goto Lac
            int r3 = r3 + 1
            java.util.Set<java.lang.String> r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.hookedMethods
            r5.remove(r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "hook bind failed: "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            p000.C0888ux.m5977(r2, r5, r12)
        Lac:
            r12 = r4
            goto L40
        Lae:
            int r10 = r11.size()
            java.lang.String r11 = ", hooked="
            java.lang.String r4 = ", duplicate="
            java.lang.String r5 = "bind hooks installed: resolved="
            java.lang.StringBuilder r10 = p000.AbstractC0602nx.m4136(r5, r10, r11, r12, r4)
            java.lang.String r11 = ", abstract="
            java.lang.String r12 = ", failed="
            p000.AbstractC0602nx.m4117(r10, r0, r11, r1, r12)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            p000.C0888ux.m5975(r2, r10)
            return
    }

    private final void installReplyQueryHooks(java.lang.ClassLoader r11, boolean r12) {
            r10 = this;
            int r10 = java.lang.System.identityHashCode(r11)
            java.util.Set<java.lang.Integer> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.replyHookedLoaders
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            boolean r1 = r0.add(r1)
            if (r1 != 0) goto L11
            return
        L11:
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r1 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.util.List r11 = r1.resolveReplyQueryMethods(r11, r12)
            boolean r1 = r11.isEmpty()
            java.lang.String r2 = "rfdffda28262874f1"
            if (r1 == 0) goto L38
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0.remove(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "reply query methods empty, allowDexKitScan="
            r10.<init>(r11)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            p000.C0888ux.m5975(r2, r10)
            return
        L38:
            java.util.Iterator r10 = r11.iterator()
            r12 = 0
            r0 = r12
            r1 = r0
            r3 = r1
        L40:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto Lae
            java.lang.Object r4 = r10.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.INSTANCE
            java.lang.String r6 = r5.stableKey(r4)
            java.util.Set<java.lang.String> r7 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.hookedMethods
            boolean r8 = r7.add(r6)
            if (r8 != 0) goto L5d
            int r0 = r0 + 1
            goto L40
        L5d:
            int r8 = r4.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isAbstract(r8)
            if (r8 == 0) goto L6d
            int r1 = r1 + 1
            r7.remove(r6)
            goto L40
        L6d:
            r7 = 1
            r4.setAccessible(r7)     // Catch: java.lang.Throwable -> L84
            xq0 r7 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L84
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook$installReplyQueryHooks$1$1$1 r8 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook$installReplyQueryHooks$1$1$1     // Catch: java.lang.Throwable -> L84
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L84
            r7.m6775(r4, r8)     // Catch: java.lang.Throwable -> L84
            int r4 = r12 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L82
            goto L8e
        L82:
            r12 = move-exception
            goto L88
        L84:
            r4 = move-exception
            r9 = r4
            r4 = r12
            r12 = r9
        L88:
            eo1 r5 = new eo1
            r5.<init>(r12)
            r12 = r5
        L8e:
            java.lang.Throwable r12 = p000.fo1.m2190(r12)
            if (r12 == 0) goto Lac
            int r3 = r3 + 1
            java.util.Set<java.lang.String> r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.hookedMethods
            r5.remove(r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "hook reply query failed: "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            p000.C0888ux.m5977(r2, r5, r12)
        Lac:
            r12 = r4
            goto L40
        Lae:
            int r10 = r11.size()
            java.lang.String r11 = ", hooked="
            java.lang.String r4 = ", duplicate="
            java.lang.String r5 = "reply query hooks installed: resolved="
            java.lang.StringBuilder r10 = p000.AbstractC0602nx.m4136(r5, r10, r11, r12, r4)
            java.lang.String r11 = ", abstract="
            java.lang.String r12 = ", failed="
            p000.AbstractC0602nx.m4117(r10, r0, r11, r1, r12)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            p000.C0888ux.m5975(r2, r10)
            return
    }

    private final boolean isRecyclerViewHolderLike(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            android.view.View r1 = r1.getItemView(r2)
            r0 = 1
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "ViewHolder"
            boolean r1 = p000.q02.m4654(r1, r2, r0)
            return r1
    }

    private final boolean shouldSkipBind(java.lang.Object r2) {
            r1 = this;
            r1 = 1
            if (r2 == 0) goto L31
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C8D6DCD4277D127BBF909EFE932E738094BD5B01F9BC1085A3D0B97EBE25855005CBEB7C451AE0AE81B4"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L31
            java.lang.String r0 = ".profile."
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L31
            java.lang.String r0 = ".familiar.tab."
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L31
            java.lang.String r0 = "SocialTab"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto L30
            goto L31
        L30:
            r1 = 0
        L31:
            return r1
    }

    private final java.lang.String stableKey(java.lang.reflect.Method r6) {
            r5 = this;
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            r0 = 35
            r5.append(r0)
            java.lang.String r0 = r6.getName()
            r5.append(r0)
            r0 = 40
            r5.append(r0)
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0.getClass()
            uj r1 = new uj
            r2 = 8
            r1.<init>(r2)
            r2 = 30
            java.lang.String r3 = ","
            r4 = 0
            java.lang.String r0 = p000.AbstractC0312g7.m2256(r0, r3, r4, r1, r2)
            java.lang.String r1 = "):"
            java.lang.String r5 = p000.lz1.m3692(r5, r0, r1, r6)
            return r5
    }

    private static final java.lang.CharSequence stableKey$lambda$21$lambda$20(java.lang.Class r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ java.lang.CharSequence m1412(java.lang.Class r0) {
            java.lang.CharSequence r0 = stableKey$lambda$21$lambda$20(r0)
            return r0
    }

    public final void init(java.lang.ClassLoader r1, boolean r2) {
            r0 = this;
            r1.getClass()
            r0.installBindHooks(r1, r2)
            r0.installReplyQueryHooks(r1, r2)
            return
    }

    public final void onHostContext(android.content.Context r1) {
            r0 = this;
            r1.getClass()
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.hostContext
            if (r0 == 0) goto L8
            return
        L8:
            android.content.Context r0 = r1.getApplicationContext()
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r1 = r0
        L10:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.hostContext = r1
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE
            r0.init(r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier.INSTANCE
            r0.init(r1)
            return
    }

    public final void registerDexKitPrewarmProvider() {
            r1 = this;
            boolean r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.providerRegistered
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r1)
            boolean r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.providerRegistered     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto Lc
            monitor-exit(r1)
            return
        Lc:
            r0 = 1
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.providerRegistered = r0     // Catch: java.lang.Throwable -> L16
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE     // Catch: java.lang.Throwable -> L16
            r0.registerDexKitPrewarmProvider()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return
        L16:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
