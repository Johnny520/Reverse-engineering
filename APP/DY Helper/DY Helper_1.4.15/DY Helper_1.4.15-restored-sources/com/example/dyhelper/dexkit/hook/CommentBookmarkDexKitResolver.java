package com.example.dyhelper.dexkit.hook;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkDexKitResolver {
    public static final int $stable = 0;
    private static final int BIND_METHOD_MIN_SCORE = 800;
    private static final java.util.List<java.lang.String> COMMENT_LIST_METHOD_NAMES = null;
    private static final java.util.List<java.lang.String> COMMENT_LIST_URLS = null;
    public static final com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver INSTANCE = null;
    private static final java.util.List<java.lang.String> REPLY_LIST_METHOD_NAMES = null;
    private static final java.util.List<java.lang.String> REPLY_LIST_URLS = null;
    private static final java.lang.String TAG = "rdf70e25084e5dfd3";

    static {
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0 = new com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver
            r0.<init>()
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE = r0
            java.lang.String r0 = "/aweme/v1/comment/list/"
            java.lang.String r1 = "aweme/v1/comment/list"
            java.lang.String r2 = "/aweme/v2/comment/list/"
            java.lang.String r3 = "aweme/v2/comment/list"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.COMMENT_LIST_URLS = r0
            java.lang.String r5 = "loadMoreComments"
            java.lang.String r6 = "loadMoreCommentList"
            java.lang.String r1 = "fetchCommentListV2Post"
            java.lang.String r2 = "fetchCommentListV2Stream"
            java.lang.String r3 = "fetchCommentListPost"
            java.lang.String r4 = "fetchCommentList"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.COMMENT_LIST_METHOD_NAMES = r0
            java.lang.String r0 = "/aweme/v2/comment/list/reply/"
            java.lang.String r1 = "aweme/v2/comment/list/reply"
            java.lang.String r2 = "/aweme/v1/comment/list/reply/"
            java.lang.String r3 = "aweme/v1/comment/list/reply"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.REPLY_LIST_URLS = r0
            java.lang.String r0 = "loadMoreReplyList"
            java.lang.String r1 = "fetchCommentReplyList"
            java.lang.String r2 = "fetchReplyTreeListPOST"
            java.lang.String r3 = "fetchReplyTreeList"
            java.lang.String r4 = "loadMoreCommentListPOST"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.REPLY_LIST_METHOD_NAMES = r0
            r0 = 8
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.$stable = r0
            return
    }

    private CommentBookmarkDexKitResolver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int access$scoreBindMethod(com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0, java.lang.reflect.Method r1) {
            int r0 = r0.scoreBindMethod(r1)
            return r0
    }

    public static final /* synthetic */ int access$scoreLoadMoreCommentMethod(com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0, java.lang.reflect.Method r1) {
            int r0 = r0.scoreLoadMoreCommentMethod(r1)
            return r0
    }

    public static final /* synthetic */ int access$scoreReplyListMethod(com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0, java.lang.reflect.Method r1) {
            int r0 = r0.scoreReplyListMethod(r1)
            return r0
    }

    public static final /* synthetic */ int access$scoreReplyMethod(com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0, java.lang.reflect.Method r1) {
            int r0 = r0.scoreReplyMethod(r1)
            return r0
    }

    private final java.lang.String annotationText(java.lang.reflect.Method r9) {
            r8 = this;
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.annotation.Annotation[] r0 = r9.getAnnotations()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lf:
            r4 = 10
            if (r3 >= r1) goto L22
            r5 = r0[r3]
            java.lang.String r5 = r5.toString()
            r8.append(r5)
            r8.append(r4)
            int r3 = r3 + 1
            goto Lf
        L22:
            java.lang.annotation.Annotation[][] r9 = r9.getParameterAnnotations()
            r9.getClass()
            int r0 = r9.length
            r1 = r2
        L2b:
            if (r1 >= r0) goto L4a
            r3 = r9[r1]
            java.lang.annotation.Annotation[] r3 = (java.lang.annotation.Annotation[]) r3
            r3.getClass()
            int r5 = r3.length
            r6 = r2
        L36:
            if (r6 >= r5) goto L47
            r7 = r3[r6]
            java.lang.String r7 = r7.toString()
            r8.append(r7)
            r8.append(r4)
            int r6 = r6 + 1
            goto L36
        L47:
            int r1 = r1 + 1
            goto L2b
        L4a:
            java.lang.String r8 = r8.toString()
            return r8
    }

    private final java.util.List<java.lang.reflect.Method> dexKitFindBindMethods(org.luckypray.dexkit.DexKitBridge r4, java.lang.ClassLoader r5) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            uj r1 = new uj     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            org.luckypray.dexkit.result.MethodDataList r4 = r4.findMethod(r1)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2d
        L13:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L2d
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Method r1 = r1.getMethodInstance(r5)     // Catch: java.lang.Throwable -> L13
            boolean r2 = r3.isRecyclerBindMethod(r1)     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L13
            r0.add(r1)     // Catch: java.lang.Throwable -> L13
            goto L13
        L2d:
            r3 = move-exception
            goto L32
        L2f:
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2d
            goto L38
        L32:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L38:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L45
            java.lang.String r4 = "rdf70e25084e5dfd3"
            java.lang.String r5 = "dexKitFindBindMethods failed"
            p000.C0888ux.m5977(r4, r5, r3)
        L45:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L53:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r2 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.lang.String r1 = r2.stableKey(r1)
            boolean r1 = r3.add(r1)
            if (r1 == 0) goto L53
            r4.add(r0)
            goto L53
        L70:
            tf r3 = new tf
            r5 = 8
            r3.<init>(r5)
            java.util.List r3 = p000.AbstractC0984xh.m6658(r4, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L84:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L9f
            java.lang.Object r5 = r3.next()
            r0 = r5
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r1 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            int r0 = r1.scoreBindMethod(r0)
            r1 = 800(0x320, float:1.121E-42)
            if (r0 < r1) goto L84
            r4.add(r5)
            goto L84
        L9f:
            r3 = 600(0x258, float:8.41E-43)
            java.util.List r3 = p000.AbstractC0984xh.m6662(r4, r3)
            return r3
    }

    private static final p000.s62 dexKitFindBindMethods$lambda$97$lambda$94(org.luckypray.dexkit.query.FindMethod r2) {
            r2.getClass()
            uj r0 = new uj
            r1 = 4
            r0.<init>(r1)
            r2.matcher(r0)
            s62 r2 = p000.s62.f9751
            return r2
    }

    private static final p000.s62 dexKitFindBindMethods$lambda$97$lambda$94$lambda$93(org.luckypray.dexkit.query.matchers.MethodMatcher r12) {
            r12.getClass()
            r4 = 6
            r5 = 0
            java.lang.String r1 = "onBindViewHolder"
            r2 = 0
            r3 = 0
            r0 = r12
            org.luckypray.dexkit.query.matchers.MethodMatcher.name$default(r0, r1, r2, r3, r4, r5)
            r10 = 6
            r11 = 0
            java.lang.String r7 = "void"
            r8 = 0
            r9 = 0
            r6 = r0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r6, r7, r8, r9, r10, r11)
            s62 r12 = p000.s62.f9751
            return r12
    }

    private final java.util.List<java.lang.reflect.Method> dexKitFindLoadMoreCommentMethods(org.luckypray.dexkit.DexKitBridge r9, java.lang.ClassLoader r10) {
            r8 = this;
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List<java.lang.String> r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.COMMENT_LIST_URLS
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "rdf70e25084e5dfd3"
            s62 r3 = p000.s62.f9751
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r4 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            s9 r5 = new s9     // Catch: java.lang.Throwable -> L45
            r6 = 7
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L45
            org.luckypray.dexkit.result.MethodDataList r5 = r9.findMethod(r5)     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L45
        L2b:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L45
            org.luckypray.dexkit.result.MethodData r6 = (org.luckypray.dexkit.result.MethodData) r6     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method r6 = r6.getMethodInstance(r10)     // Catch: java.lang.Throwable -> L2b
            boolean r7 = r4.isLoadMoreCommentMethod(r6)     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto L2b
            r8.add(r6)     // Catch: java.lang.Throwable -> L2b
            goto L2b
        L45:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L4c:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto Lb
            java.lang.String r4 = "find comment list by url failed url="
            p000.AbstractC0602nx.m4145(r4, r1, r2, r3)
            goto Lb
        L58:
            java.util.List<java.lang.String> r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.COMMENT_LIST_METHOD_NAMES
            java.util.Iterator r0 = r0.iterator()
        L5e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r4 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            s9 r5 = new s9     // Catch: java.lang.Throwable -> L95
            r6 = 8
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L95
            org.luckypray.dexkit.result.MethodDataList r5 = r9.findMethod(r5)     // Catch: java.lang.Throwable -> L95
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L95
        L7b:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L97
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L95
            org.luckypray.dexkit.result.MethodData r6 = (org.luckypray.dexkit.result.MethodData) r6     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Method r6 = r6.getMethodInstance(r10)     // Catch: java.lang.Throwable -> L7b
            boolean r7 = r4.isLoadMoreCommentMethod(r6)     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L7b
            r8.add(r6)     // Catch: java.lang.Throwable -> L7b
            goto L7b
        L95:
            r4 = move-exception
            goto L99
        L97:
            r5 = r3
            goto L9e
        L99:
            eo1 r5 = new eo1
            r5.<init>(r4)
        L9e:
            java.lang.Throwable r4 = p000.fo1.m2190(r5)
            if (r4 == 0) goto L5e
            java.lang.String r5 = "find comment method name failed name="
            p000.AbstractC0602nx.m4145(r5, r1, r2, r4)
            goto L5e
        Laa:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        Lb8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Ld5
            java.lang.Object r0 = r8.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r2 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.lang.String r1 = r2.stableKey(r1)
            boolean r1 = r9.add(r1)
            if (r1 == 0) goto Lb8
            r10.add(r0)
            goto Lb8
        Ld5:
            tf r8 = new tf
            r9 = 9
            r8.<init>(r9)
            java.util.List r8 = p000.AbstractC0984xh.m6658(r10, r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        Le9:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L104
            java.lang.Object r10 = r8.next()
            r0 = r10
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r1 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            int r0 = r1.scoreLoadMoreCommentMethod(r0)
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto Le9
            r9.add(r10)
            goto Le9
        L104:
            r8 = 30
            java.util.List r8 = p000.AbstractC0984xh.m6662(r9, r8)
            return r8
    }

    private static final p000.s62 dexKitFindLoadMoreCommentMethods$lambda$26$lambda$24$lambda$21(java.lang.String r2, org.luckypray.dexkit.query.FindMethod r3) {
            r3.getClass()
            s9 r0 = new s9
            r1 = 12
            r0.<init>(r2, r1)
            r3.matcher(r0)
            s62 r2 = p000.s62.f9751
            return r2
    }

    /* JADX INFO: renamed from: dexKitFindLoadMoreCommentMethods$lambda$26$lambda$24$lambda$21$lambda$20 */
    private static final p000.s62 m1317x64fbac6d(java.lang.String r0, org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            r1.getClass()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.usingStrings(r0)
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final p000.s62 dexKitFindLoadMoreCommentMethods$lambda$33$lambda$31$lambda$28(java.lang.String r2, org.luckypray.dexkit.query.FindMethod r3) {
            r3.getClass()
            s9 r0 = new s9
            r1 = 11
            r0.<init>(r2, r1)
            r3.matcher(r0)
            s62 r2 = p000.s62.f9751
            return r2
    }

    /* JADX INFO: renamed from: dexKitFindLoadMoreCommentMethods$lambda$33$lambda$31$lambda$28$lambda$27 */
    private static final p000.s62 m1318x216d50f3(java.lang.String r6, org.luckypray.dexkit.query.matchers.MethodMatcher r7) {
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r6
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher.name$default(r0, r1, r2, r3, r4, r5)
            s62 r6 = p000.s62.f9751
            return r6
    }

    private final java.util.List<java.lang.reflect.Method> dexKitFindReplyListMethods(org.luckypray.dexkit.DexKitBridge r9, java.lang.ClassLoader r10) {
            r8 = this;
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List<java.lang.String> r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.REPLY_LIST_URLS
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "rdf70e25084e5dfd3"
            s62 r3 = p000.s62.f9751
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r4 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            s9 r5 = new s9     // Catch: java.lang.Throwable -> L46
            r6 = 13
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L46
            org.luckypray.dexkit.result.MethodDataList r5 = r9.findMethod(r5)     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        L2c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L46
            org.luckypray.dexkit.result.MethodData r6 = (org.luckypray.dexkit.result.MethodData) r6     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r6 = r6.getMethodInstance(r10)     // Catch: java.lang.Throwable -> L2c
            boolean r7 = r4.isReplyListMethod(r6)     // Catch: java.lang.Throwable -> L2c
            if (r7 == 0) goto L2c
            r8.add(r6)     // Catch: java.lang.Throwable -> L2c
            goto L2c
        L46:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L4d:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto Lb
            java.lang.String r4 = "find reply list by url failed url="
            p000.AbstractC0602nx.m4145(r4, r1, r2, r3)
            goto Lb
        L59:
            java.util.List<java.lang.String> r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.REPLY_LIST_METHOD_NAMES
            java.util.Iterator r0 = r0.iterator()
        L5f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lab
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r4 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            s9 r5 = new s9     // Catch: java.lang.Throwable -> L96
            r6 = 14
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L96
            org.luckypray.dexkit.result.MethodDataList r5 = r9.findMethod(r5)     // Catch: java.lang.Throwable -> L96
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L96
        L7c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r6 == 0) goto L98
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L96
            org.luckypray.dexkit.result.MethodData r6 = (org.luckypray.dexkit.result.MethodData) r6     // Catch: java.lang.Throwable -> L96
            java.lang.reflect.Method r6 = r6.getMethodInstance(r10)     // Catch: java.lang.Throwable -> L7c
            boolean r7 = r4.isReplyListMethod(r6)     // Catch: java.lang.Throwable -> L7c
            if (r7 == 0) goto L7c
            r8.add(r6)     // Catch: java.lang.Throwable -> L7c
            goto L7c
        L96:
            r4 = move-exception
            goto L9a
        L98:
            r5 = r3
            goto L9f
        L9a:
            eo1 r5 = new eo1
            r5.<init>(r4)
        L9f:
            java.lang.Throwable r4 = p000.fo1.m2190(r5)
            if (r4 == 0) goto L5f
            java.lang.String r5 = "find reply method name failed name="
            p000.AbstractC0602nx.m4145(r5, r1, r2, r4)
            goto L5f
        Lab:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        Lb9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Ld6
            java.lang.Object r0 = r8.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r2 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.lang.String r1 = r2.stableKey(r1)
            boolean r1 = r9.add(r1)
            if (r1 == 0) goto Lb9
            r10.add(r0)
            goto Lb9
        Ld6:
            tf r8 = new tf
            r9 = 10
            r8.<init>(r9)
            java.util.List r8 = p000.AbstractC0984xh.m6658(r10, r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        Lea:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L105
            java.lang.Object r10 = r8.next()
            r0 = r10
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r1 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            int r0 = r1.scoreReplyListMethod(r0)
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto Lea
            r9.add(r10)
            goto Lea
        L105:
            r8 = 15
            java.util.List r8 = p000.AbstractC0984xh.m6662(r9, r8)
            return r8
    }

    private static final p000.s62 dexKitFindReplyListMethods$lambda$77$lambda$75$lambda$72(java.lang.String r2, org.luckypray.dexkit.query.FindMethod r3) {
            r3.getClass()
            s9 r0 = new s9
            r1 = 9
            r0.<init>(r2, r1)
            r3.matcher(r0)
            s62 r2 = p000.s62.f9751
            return r2
    }

    /* JADX INFO: renamed from: dexKitFindReplyListMethods$lambda$77$lambda$75$lambda$72$lambda$71 */
    private static final p000.s62 m1319xfa1e0039(java.lang.String r0, org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            r1.getClass()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.usingStrings(r0)
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final p000.s62 dexKitFindReplyListMethods$lambda$84$lambda$82$lambda$79(java.lang.String r2, org.luckypray.dexkit.query.FindMethod r3) {
            r3.getClass()
            s9 r0 = new s9
            r1 = 10
            r0.<init>(r2, r1)
            r3.matcher(r0)
            s62 r2 = p000.s62.f9751
            return r2
    }

    /* JADX INFO: renamed from: dexKitFindReplyListMethods$lambda$84$lambda$82$lambda$79$lambda$78 */
    private static final p000.s62 m1320xb68fa4bf(java.lang.String r6, org.luckypray.dexkit.query.matchers.MethodMatcher r7) {
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r6
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher.name$default(r0, r1, r2, r3, r4, r5)
            s62 r6 = p000.s62.f9751
            return r6
    }

    private final java.util.List<java.lang.reflect.Method> dexKitFindReplyQueryMethods(org.luckypray.dexkit.DexKitBridge r6, java.lang.ClassLoader r7) {
            r5 = this;
            s62 r0 = p000.s62.f9751
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            gh r2 = new gh     // Catch: java.lang.Throwable -> L30
            r3 = 28
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            org.luckypray.dexkit.result.MethodDataList r2 = r6.findMethod(r2)     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L30
        L16:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L32
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L30
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> L30
            java.lang.reflect.Method r3 = r3.getMethodInstance(r7)     // Catch: java.lang.Throwable -> L16
            boolean r4 = r5.isReplyQueryMethod(r3)     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L16
            r1.add(r3)     // Catch: java.lang.Throwable -> L16
            goto L16
        L30:
            r2 = move-exception
            goto L34
        L32:
            r3 = r0
            goto L39
        L34:
            eo1 r3 = new eo1
            r3.<init>(r2)
        L39:
            java.lang.Throwable r2 = p000.fo1.m2190(r3)
            java.lang.String r3 = "rdf70e25084e5dfd3"
            if (r2 == 0) goto L46
            java.lang.String r4 = "find List reply methods failed"
            p000.C0888ux.m5977(r3, r4, r2)
        L46:
            uj r2 = new uj     // Catch: java.lang.Throwable -> L6e
            r4 = 1
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L6e
            org.luckypray.dexkit.result.MethodDataList r6 = r6.findMethod(r2)     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L6e
        L54:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L74
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L6e
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2     // Catch: java.lang.Throwable -> L6e
            java.lang.reflect.Method r2 = r2.getMethodInstance(r7)     // Catch: java.lang.Throwable -> L54
            boolean r4 = r5.isReplyQueryMethod(r2)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L54
            r1.add(r2)     // Catch: java.lang.Throwable -> L54
            goto L54
        L6e:
            r5 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r5)
        L74:
            java.lang.Throwable r5 = p000.fo1.m2190(r0)
            if (r5 == 0) goto L7f
            java.lang.String r6 = "find int reply methods failed"
            p000.C0888ux.m5977(r3, r6, r5)
        L7f:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L8d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r2 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.lang.String r1 = r2.stableKey(r1)
            boolean r1 = r5.add(r1)
            if (r1 == 0) goto L8d
            r6.add(r0)
            goto L8d
        Laa:
            tf r5 = new tf
            r7 = 11
            r5.<init>(r7)
            java.util.List r5 = p000.AbstractC0984xh.m6658(r6, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lbe:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Ld9
            java.lang.Object r7 = r5.next()
            r0 = r7
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r1 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            int r0 = r1.scoreReplyMethod(r0)
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 < r1) goto Lbe
            r6.add(r7)
            goto Lbe
        Ld9:
            r5 = 80
            java.util.List r5 = p000.AbstractC0984xh.m6662(r6, r5)
            return r5
    }

    private static final p000.s62 dexKitFindReplyQueryMethods$lambda$106$lambda$103(org.luckypray.dexkit.query.FindMethod r2) {
            r2.getClass()
            gh r0 = new gh
            r1 = 29
            r0.<init>(r1)
            r2.matcher(r0)
            s62 r2 = p000.s62.f9751
            return r2
    }

    private static final p000.s62 dexKitFindReplyQueryMethods$lambda$106$lambda$103$lambda$102(org.luckypray.dexkit.query.matchers.MethodMatcher r7) {
            r7.getClass()
            java.lang.String r0 = "java.lang.String"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r7.paramTypes(r0)
            r5 = 6
            r6 = 0
            java.lang.String r2 = "java.util.List"
            r3 = 0
            r4 = 0
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r1, r2, r3, r4, r5, r6)
            s62 r7 = p000.s62.f9751
            return r7
    }

    private static final p000.s62 dexKitFindReplyQueryMethods$lambda$112$lambda$109(org.luckypray.dexkit.query.FindMethod r2) {
            r2.getClass()
            uj r0 = new uj
            r1 = 7
            r0.<init>(r1)
            r2.matcher(r0)
            s62 r2 = p000.s62.f9751
            return r2
    }

    private static final p000.s62 dexKitFindReplyQueryMethods$lambda$112$lambda$109$lambda$108(org.luckypray.dexkit.query.matchers.MethodMatcher r7) {
            r7.getClass()
            java.lang.String r0 = "java.lang.String"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r7.paramTypes(r0)
            r5 = 6
            r6 = 0
            java.lang.String r2 = "int"
            r3 = 0
            r4 = 0
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r1, r2, r3, r4, r5, r6)
            s62 r7 = p000.s62.f9751
            return r7
    }

    private final boolean isLoadMoreCommentMethod(java.lang.reflect.Method r12) {
            r11 = this;
            int r0 = r12.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            goto L95
        Ld:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.Class r2 = r12.getReturnType()
            r2.getClass()
            boolean r0 = r0.isNetworkReturn(r2)
            if (r0 != 0) goto L1e
            goto L95
        L1e:
            java.lang.Class[] r0 = r12.getParameterTypes()
            int r2 = r0.length
            r3 = 4
            if (r2 >= r3) goto L28
            goto L95
        L28:
            r0 = r0[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L33
            goto L95
        L33:
            java.lang.String r11 = r11.annotationText(r12)
            java.lang.String r0 = "/aweme/v1/comment/list/"
            java.lang.String r2 = "aweme/v1/comment/list"
            java.lang.String r3 = "/aweme/v2/comment/list/"
            java.lang.String r4 = "aweme/v2/comment/list"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r0, r2}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            boolean r2 = r0.isEmpty()
            r3 = 1
            if (r2 == 0) goto L50
        L4e:
            r0 = r1
            goto L67
        L50:
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = p000.q02.m4654(r11, r2, r1)
            if (r2 == 0) goto L54
            r0 = r3
        L67:
            java.lang.String r2 = "aweme_id"
            boolean r2 = p000.q02.m4654(r11, r2, r1)
            java.lang.String r4 = "insert_ids"
            p000.q02.m4654(r11, r4, r1)
            java.lang.String r9 = "loadMoreComments"
            java.lang.String r10 = "loadMoreCommentList"
            java.lang.String r5 = "fetchCommentListV2Post"
            java.lang.String r6 = "fetchCommentListV2Stream"
            java.lang.String r7 = "fetchCommentListPost"
            java.lang.String r8 = "fetchCommentList"
            java.lang.String[] r11 = new java.lang.String[]{r5, r6, r7, r8, r9, r10}
            java.util.Set r11 = p000.AbstractC0312g7.m2263(r11)
            java.lang.String r12 = r12.getName()
            boolean r11 = r11.contains(r12)
            if (r0 != 0) goto L96
            if (r11 == 0) goto L95
            if (r2 == 0) goto L95
            goto L96
        L95:
            return r1
        L96:
            return r3
    }

    private final boolean isNetworkReturn(java.lang.reflect.Method r1) {
            r0 = this;
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.Class r1 = r1.getReturnType()
            r1.getClass()
            boolean r0 = r0.isNetworkReturn(r1)
            return r0
    }

    private final boolean isRecyclerBindMethod(java.lang.reflect.Method r4) {
            r3 = this;
            java.lang.String r3 = r4.getName()
            java.lang.String r0 = "onBindViewHolder"
            boolean r3 = p000.ln0.m3626(r3, r0)
            r0 = 0
            if (r3 != 0) goto Le
            return r0
        Le:
            java.lang.Class r3 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r3 = p000.ln0.m3626(r3, r1)
            if (r3 != 0) goto L1b
            return r0
        L1b:
            int r3 = r4.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 == 0) goto L26
            return r0
        L26:
            java.lang.Class[] r3 = r4.getParameterTypes()
            int r4 = r3.length
            r1 = 2
            if (r4 >= r1) goto L2f
            return r0
        L2f:
            r4 = 1
            r1 = r3[r4]
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 != 0) goto L3b
            return r0
        L3b:
            r3 = r3[r0]
            java.lang.String r3 = r3.getName()
            java.lang.String r1 = "RecyclerView"
            boolean r1 = p000.q02.m4654(r3, r1, r4)
            if (r1 != 0) goto L53
            java.lang.String r1 = "ViewHolder"
            boolean r3 = p000.q02.m4654(r3, r1, r4)
            if (r3 == 0) goto L52
            goto L53
        L52:
            return r0
        L53:
            return r4
    }

    private final boolean isReplyListMethod(java.lang.reflect.Method r12) {
            r11 = this;
            int r0 = r12.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            goto Lc4
        Ld:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.Class r2 = r12.getReturnType()
            r2.getClass()
            boolean r2 = r0.isNetworkReturn(r2)
            if (r2 != 0) goto L1e
            goto Lc4
        L1e:
            java.lang.Class[] r2 = r12.getParameterTypes()
            int r3 = r2.length
            r4 = 5
            if (r3 >= r4) goto L28
            goto Lc4
        L28:
            r3 = r2[r1]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L34
            goto Lc4
        L34:
            r3 = 1
            r4 = r2[r3]
            r4.getClass()
            boolean r4 = r0.isLongCompat(r4)
            if (r4 != 0) goto L42
            goto Lc4
        L42:
            r4 = 2
            r2 = r2[r4]
            r2.getClass()
            boolean r0 = r0.isIntCompat(r2)
            if (r0 != 0) goto L50
            goto Lc4
        L50:
            java.lang.String r11 = r11.annotationText(r12)
            java.lang.String r0 = "/aweme/v2/comment/list/reply/"
            java.lang.String r2 = "aweme/v2/comment/list/reply"
            java.lang.String r4 = "/aweme/v1/comment/list/reply/"
            java.lang.String r5 = "aweme/v1/comment/list/reply"
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r0, r2}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L6c
        L6a:
            r0 = r1
            goto L83
        L6c:
            java.util.Iterator r0 = r0.iterator()
        L70:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = p000.q02.m4654(r11, r2, r1)
            if (r2 == 0) goto L70
            r0 = r3
        L83:
            java.lang.String r2 = "comment_id"
            boolean r2 = p000.q02.m4654(r11, r2, r1)
            java.lang.String r4 = "item_id"
            boolean r4 = p000.q02.m4654(r11, r4, r1)
            java.lang.String r5 = "cursor"
            boolean r5 = p000.q02.m4654(r11, r5, r1)
            java.lang.String r6 = "count"
            boolean r11 = p000.q02.m4654(r11, r6, r1)
            java.lang.String r6 = "loadMoreReplyList"
            java.lang.String r7 = "fetchCommentReplyList"
            java.lang.String r8 = "fetchReplyTreeListPOST"
            java.lang.String r9 = "fetchReplyTreeList"
            java.lang.String r10 = "loadMoreCommentListPOST"
            java.lang.String[] r6 = new java.lang.String[]{r8, r9, r10, r6, r7}
            java.util.Set r6 = p000.AbstractC0312g7.m2263(r6)
            java.lang.String r12 = r12.getName()
            boolean r12 = r6.contains(r12)
            if (r0 != 0) goto Lc5
            if (r12 == 0) goto Lbd
            if (r2 == 0) goto Lbd
            if (r4 != 0) goto Lc5
        Lbd:
            if (r2 == 0) goto Lc4
            if (r5 == 0) goto Lc4
            if (r11 == 0) goto Lc4
            goto Lc5
        Lc4:
            return r1
        Lc5:
            return r3
    }

    private final boolean isReplyQueryMethod(java.lang.reflect.Method r5) {
            r4 = this;
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.Class[] r0 = r5.getParameterTypes()
            int r2 = r0.length
            r3 = 1
            if (r2 == r3) goto L15
            return r1
        L15:
            r0 = r0[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L20
            return r1
        L20:
            java.lang.Class r0 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 != 0) goto L3e
            java.lang.Class<java.lang.Number> r2 = java.lang.Number.class
            boolean r2 = r2.isAssignableFrom(r0)
            if (r2 != 0) goto L3e
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r0 = r2.isAssignableFrom(r0)
            if (r0 == 0) goto L3d
            goto L3e
        L3d:
            return r1
        L3e:
            int r4 = r4.scoreReplyMethod(r5)
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 < r5) goto L47
            return r3
        L47:
            return r1
    }

    private final java.util.List<java.lang.reflect.Method> reflectionFindLoadMoreCommentMethods(java.lang.ClassLoader r9) {
            r8 = this;
            java.lang.String r8 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC42710FFB8744BED68D3A8A78D91E7DEF8CD323579B4298E07A5C"
            java.lang.String r8 = p000.jf0.m2957(r8)
            java.lang.String r0 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134F80469450558EA16A886F15339F01003A1C1C8796505E87D017E6F29ECFABC521C357F6D29087A37D3775"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String[] r8 = new java.lang.String[]{r8, r0}
            java.util.List r8 = p000.AbstractC1021yh.m6897(r8)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r1 = p000.qe0.m4877(r9, r1)
            if (r1 != 0) goto L30
            goto L1d
        L30:
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            r1.getClass()
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r2 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.length
            r5 = 0
        L40:
            if (r5 >= r4) goto L50
            r6 = r1[r5]
            boolean r7 = r2.isLoadMoreCommentMethod(r6)
            if (r7 == 0) goto L4d
            r3.add(r6)
        L4d:
            int r5 = r5 + 1
            goto L40
        L50:
            java.util.Iterator r1 = r3.iterator()
        L54:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r3 = 1
            r2.setAccessible(r3)
            r0.add(r2)
            goto L54
        L68:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        L76:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r3 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.lang.String r2 = r3.stableKey(r2)
            boolean r2 = r8.add(r2)
            if (r2 == 0) goto L76
            r9.add(r1)
            goto L76
        L93:
            tf r8 = new tf
            r0 = 12
            r8.<init>(r0)
            java.util.List r1 = p000.AbstractC0984xh.m6658(r9, r8)
            int r8 = r1.size()
            uj r6 = new uj
            r9 = 5
            r6.<init>(r9)
            r7 = 23
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 10
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r1, r2, r3, r4, r5, r6, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "reflectionFindLoadMoreCommentMethods result="
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r8 = ", "
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            r9 = 4
            java.lang.String r0 = "rdf70e25084e5dfd3"
            r2 = 0
            p000.C0888ux.m5988(r0, r8, r2, r9, r2)
            return r1
    }

    private static final java.lang.CharSequence reflectionFindLoadMoreCommentMethods$lambda$19(java.lang.reflect.Method r5) {
            java.lang.String r0 = p000.lz1.m3694(r5)
            java.lang.String r1 = r5.getName()
            java.lang.Class r2 = r5.getReturnType()
            java.lang.String r2 = r2.getName()
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r5 = r5.length
            java.lang.String r3 = "#"
            java.lang.String r4 = ":"
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r0, r3, r1, r4, r2)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    private final java.util.List<java.lang.reflect.Method> reflectionFindReplyListMethods(java.lang.ClassLoader r6) {
            r5 = this;
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC42710FFB8744BED68D3A8A78D91E7DEF8CD323579B4298E07A5C"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r6 = p000.qe0.m4877(r6, r0)
            if (r6 != 0) goto L11
            jz r5 = p000.C0450jz.f5672
            return r5
        L11:
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L1f:
            if (r2 >= r1) goto L2f
            r3 = r6[r2]
            boolean r4 = r5.isReplyListMethod(r3)
            if (r4 == 0) goto L2c
            r0.add(r3)
        L2c:
            int r2 = r2 + 1
            goto L1f
        L2f:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r3 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            r2.getClass()
            java.lang.String r2 = r3.stableKey(r2)
            boolean r2 = r5.add(r2)
            if (r2 == 0) goto L3d
            r6.add(r1)
            goto L3d
        L5d:
            tf r5 = new tf
            r0 = 13
            r5.<init>(r0)
            java.util.List r5 = p000.AbstractC0984xh.m6658(r6, r5)
            java.util.Iterator r6 = r5.iterator()
        L6c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r6.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r1 = 1
            r0.setAccessible(r1)
            goto L6c
        L7d:
            return r5
    }

    private static final java.util.List registerDexKitPrewarmProvider$lambda$4(java.lang.ClassLoader r7) {
            r7.getClass()
            qx r0 = new qx
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6233
            java.lang.String r1 = p000.C0666ox.m4320(r1, r7)
            cb r2 = new cb
            r3 = 14
            r2.<init>(r7, r3)
            java.lang.String r3 = "定位评论书签：评论列表绑定方法"
            r0.<init>(r1, r3, r2)
            qx r1 = new qx
            kx r2 = p000.EnumC0491kx.f6234
            java.lang.String r2 = p000.C0666ox.m4320(r2, r7)
            cb r3 = new cb
            r4 = 15
            r3.<init>(r7, r4)
            java.lang.String r4 = "定位评论书签：回复查询方法"
            r1.<init>(r2, r4, r3)
            qx r2 = new qx
            kx r3 = p000.EnumC0491kx.f6229
            java.lang.String r3 = p000.C0666ox.m4320(r3, r7)
            cb r4 = new cb
            r5 = 16
            r4.<init>(r7, r5)
            java.lang.String r5 = "定位评论书签主动查询接口"
            r2.<init>(r3, r5, r4)
            qx r3 = new qx
            kx r4 = p000.EnumC0491kx.f6218
            java.lang.String r4 = p000.C0666ox.m4320(r4, r7)
            cb r5 = new cb
            r6 = 17
            r5.<init>(r7, r6)
            java.lang.String r7 = "定位评论书签回复列表接口"
            r3.<init>(r4, r7, r5)
            qx[] r7 = new p000.C0740qx[]{r0, r1, r2, r3}
            java.util.List r7 = p000.AbstractC1021yh.m6897(r7)
            return r7
    }

    private static final p000.s62 registerDexKitPrewarmProvider$lambda$4$lambda$0(java.lang.ClassLoader r2) {
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            r1 = 1
            r0.resolveBindMethods(r2, r1)
            s62 r2 = p000.s62.f9751
            return r2
    }

    private static final p000.s62 registerDexKitPrewarmProvider$lambda$4$lambda$1(java.lang.ClassLoader r2) {
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            r1 = 1
            r0.resolveReplyQueryMethods(r2, r1)
            s62 r2 = p000.s62.f9751
            return r2
    }

    private static final p000.s62 registerDexKitPrewarmProvider$lambda$4$lambda$2(java.lang.ClassLoader r2) {
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            r1 = 1
            r0.resolveLoadMoreCommentMethods(r2, r1)
            s62 r2 = p000.s62.f9751
            return r2
    }

    private static final p000.s62 registerDexKitPrewarmProvider$lambda$4$lambda$3(java.lang.ClassLoader r2) {
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            r1 = 1
            r0.resolveReplyListMethods(r2, r1)
            s62 r2 = p000.s62.f9751
            return r2
    }

    private static final p000.s62 registerDexKitPrewarmProvider$lambda$5(java.lang.ClassLoader r2) {
            r2.getClass()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.INSTANCE
            r1 = 0
            r0.init(r2, r1)
            s62 r2 = p000.s62.f9751
            return r2
    }

    private static final java.util.List resolveBindMethods$lambda$49(java.lang.ClassLoader r1, org.luckypray.dexkit.DexKitBridge r2) {
            r2.getClass()
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.util.List r1 = r0.dexKitFindBindMethods(r2, r1)
            return r1
    }

    private static final java.util.List resolveLoadMoreCommentMethods$lambda$9(java.lang.ClassLoader r1, org.luckypray.dexkit.DexKitBridge r2) {
            r2.getClass()
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.util.List r1 = r0.dexKitFindLoadMoreCommentMethods(r2, r1)
            return r1
    }

    private static final java.util.List resolveReplyListMethods$lambda$62(java.lang.ClassLoader r1, org.luckypray.dexkit.DexKitBridge r2) {
            r2.getClass()
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.util.List r1 = r0.dexKitFindReplyListMethods(r2, r1)
            return r1
    }

    private static final java.util.List resolveReplyQueryMethods$lambda$55(java.lang.ClassLoader r1, org.luckypray.dexkit.DexKitBridge r2) {
            r2.getClass()
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.util.List r1 = r0.dexKitFindReplyQueryMethods(r2, r1)
            return r1
    }

    private final int scoreBindMethod(java.lang.reflect.Method r4) {
            r3 = this;
            java.lang.Class r3 = r4.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            r3.getClass()
            java.lang.String r0 = "comment"
            r1 = 0
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L1d
            r0 = 800(0x320, float:1.121E-42)
            goto L1e
        L1d:
            r0 = r1
        L1e:
            java.lang.String r2 = "reply"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L28
            int r0 = r0 + 500
        L28:
            java.lang.String r2 = "adapter"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L32
            int r0 = r0 + 300
        L32:
            java.lang.String r2 = "holder"
            boolean r3 = p000.q02.m4654(r3, r2, r1)
            if (r3 == 0) goto L3c
            int r0 = r0 + 200
        L3c:
            java.lang.Class[] r3 = r4.getParameterTypes()
            int r3 = r3.length
            r1 = 2
            if (r3 != r1) goto L46
            int r0 = r0 + 100
        L46:
            java.lang.Class[] r3 = r4.getParameterTypes()
            int r3 = r3.length
            r4 = 3
            if (r3 != r4) goto L50
            int r0 = r0 + 60
        L50:
            return r0
    }

    private final int scoreLoadMoreCommentMethod(java.lang.reflect.Method r13) {
            r12 = this;
            java.lang.Class r12 = r13.getDeclaringClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r0 = r13.getName()
            java.lang.Class r1 = r13.getReturnType()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.annotation.Annotation[] r3 = r13.getAnnotations()
            r3.getClass()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L23:
            r7 = 10
            if (r6 >= r4) goto L36
            r8 = r3[r6]
            java.lang.String r8 = r8.toString()
            r2.append(r8)
            r2.append(r7)
            int r6 = r6 + 1
            goto L23
        L36:
            java.lang.annotation.Annotation[][] r3 = r13.getParameterAnnotations()
            r3.getClass()
            int r4 = r3.length
            r6 = r5
        L3f:
            if (r6 >= r4) goto L5e
            r8 = r3[r6]
            java.lang.annotation.Annotation[] r8 = (java.lang.annotation.Annotation[]) r8
            r8.getClass()
            int r9 = r8.length
            r10 = r5
        L4a:
            if (r10 >= r9) goto L5b
            r11 = r8[r10]
            java.lang.String r11 = r11.toString()
            r2.append(r11)
            r2.append(r7)
            int r10 = r10 + 1
            goto L4a
        L5b:
            int r6 = r6 + 1
            goto L3f
        L5e:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC42710FFB8744BED68D3A8A78D91E7DEF8CD323579B4298E07A5C"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r3 = r12.equals(r3)
            if (r3 == 0) goto L71
            r3 = 8000(0x1f40, float:1.121E-41)
            goto L72
        L71:
            r3 = r5
        L72:
            java.lang.String r4 = "fetchCommentListV2Post"
            boolean r4 = p000.ln0.m3626(r0, r4)
            if (r4 == 0) goto L7c
            int r3 = r3 + 5000
        L7c:
            java.lang.String r4 = "fetchCommentListV2Stream"
            boolean r0 = p000.ln0.m3626(r0, r4)
            if (r0 == 0) goto L86
            int r3 = r3 + 500
        L86:
            java.lang.String r0 = "/aweme/v2/comment/list/"
            boolean r0 = p000.q02.m4654(r2, r0, r5)
            if (r0 == 0) goto L90
            int r3 = r3 + 3000
        L90:
            java.lang.String r0 = "aweme/v2/comment/list"
            boolean r0 = p000.q02.m4654(r2, r0, r5)
            if (r0 == 0) goto L9a
            int r3 = r3 + 2500
        L9a:
            java.lang.String r0 = "aweme_id"
            boolean r0 = p000.q02.m4654(r2, r0, r5)
            if (r0 == 0) goto La4
            int r3 = r3 + 500
        La4:
            java.lang.String r0 = "insert_ids"
            boolean r0 = p000.q02.m4654(r2, r0, r5)
            if (r0 == 0) goto Lae
            int r3 = r3 + 500
        Lae:
            java.lang.String r0 = "cursor"
            boolean r0 = p000.q02.m4654(r2, r0, r5)
            if (r0 == 0) goto Lb8
            int r3 = r3 + 200
        Lb8:
            java.lang.String r0 = "count"
            boolean r0 = p000.q02.m4654(r2, r0, r5)
            if (r0 == 0) goto Lc2
            int r3 = r3 + 200
        Lc2:
            java.lang.String r0 = "bolts.Task"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lcc
            int r3 = r3 + 500
        Lcc:
            java.lang.String r0 = "Observable"
            boolean r0 = p000.q02.m4654(r1, r0, r5)
            if (r0 == 0) goto Ld6
            int r3 = r3 + 300
        Ld6:
            java.lang.Class[] r0 = r13.getParameterTypes()
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2250(r0)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto Leb
            int r3 = r3 + 200
        Leb:
            java.lang.Class[] r13 = r13.getParameterTypes()
            int r13 = r13.length
            r0 = 20
            if (r13 < r0) goto Lf6
            int r3 = r3 + 200
        Lf6:
            java.lang.String r13 = "commerce.sdk.commentlist"
            r0 = 1
            boolean r13 = p000.q02.m4654(r12, r13, r0)
            if (r13 == 0) goto L101
            int r3 = r3 + (-6000)
        L101:
            java.lang.String r13 = ".comment."
            boolean r13 = p000.q02.m4654(r12, r13, r0)
            if (r13 == 0) goto L10b
            int r3 = r3 + 300
        L10b:
            java.lang.String r13 = "aweme.comment"
            boolean r12 = p000.q02.m4654(r12, r13, r0)
            if (r12 == 0) goto L115
            int r3 = r3 + 300
        L115:
            return r3
    }

    private final int scoreReplyListMethod(java.lang.reflect.Method r13) {
            r12 = this;
            java.lang.Class r12 = r13.getDeclaringClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r0 = r13.getName()
            java.lang.Class r1 = r13.getReturnType()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.annotation.Annotation[] r3 = r13.getAnnotations()
            r3.getClass()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L23:
            r7 = 10
            if (r6 >= r4) goto L36
            r8 = r3[r6]
            java.lang.String r8 = r8.toString()
            r2.append(r8)
            r2.append(r7)
            int r6 = r6 + 1
            goto L23
        L36:
            java.lang.annotation.Annotation[][] r3 = r13.getParameterAnnotations()
            r3.getClass()
            int r4 = r3.length
            r6 = r5
        L3f:
            if (r6 >= r4) goto L5e
            r8 = r3[r6]
            java.lang.annotation.Annotation[] r8 = (java.lang.annotation.Annotation[]) r8
            r8.getClass()
            int r9 = r8.length
            r10 = r5
        L4a:
            if (r10 >= r9) goto L5b
            r11 = r8[r10]
            java.lang.String r11 = r11.toString()
            r2.append(r11)
            r2.append(r7)
            int r10 = r10 + 1
            goto L4a
        L5b:
            int r6 = r6 + 1
            goto L3f
        L5e:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC42710FFB8744BED68D3A8A78D91E7DEF8CD323579B4298E07A5C"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L71
            r12 = 5000(0x1388, float:7.006E-42)
            goto L72
        L71:
            r12 = r5
        L72:
            java.lang.String r3 = "/aweme/v1/comment/list/reply/"
            boolean r3 = p000.q02.m4654(r2, r3, r5)
            if (r3 == 0) goto L7c
            int r12 = r12 + 4000
        L7c:
            java.lang.String r3 = "comment_id"
            boolean r3 = p000.q02.m4654(r2, r3, r5)
            if (r3 == 0) goto L86
            int r12 = r12 + 500
        L86:
            java.lang.String r3 = "item_id"
            boolean r3 = p000.q02.m4654(r2, r3, r5)
            if (r3 == 0) goto L90
            int r12 = r12 + 500
        L90:
            java.lang.String r3 = "top_ids"
            boolean r3 = p000.q02.m4654(r2, r3, r5)
            if (r3 == 0) goto L9a
            int r12 = r12 + 300
        L9a:
            java.lang.String r3 = "insert_ids"
            boolean r3 = p000.q02.m4654(r2, r3, r5)
            if (r3 == 0) goto La4
            int r12 = r12 + 200
        La4:
            java.lang.String r3 = "cursor"
            boolean r3 = p000.q02.m4654(r2, r3, r5)
            if (r3 == 0) goto Lae
            int r12 = r12 + 200
        Lae:
            java.lang.String r3 = "count"
            boolean r2 = p000.q02.m4654(r2, r3, r5)
            if (r2 == 0) goto Lb8
            int r12 = r12 + 200
        Lb8:
            java.lang.String r2 = "fetchReplyTreeListPOST"
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 == 0) goto Lc2
            int r12 = r12 + 1000
        Lc2:
            java.lang.String r2 = "loadMoreCommentListPOST"
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto Lcc
            int r12 = r12 + 800
        Lcc:
            java.lang.String r0 = "Observable"
            boolean r0 = p000.q02.m4654(r1, r0, r5)
            if (r0 == 0) goto Ld6
            int r12 = r12 + 500
        Ld6:
            java.lang.String r0 = "bolts.Task"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le0
            int r12 = r12 + 300
        Le0:
            java.lang.Class[] r13 = r13.getParameterTypes()
            int r13 = r13.length
            r0 = 30
            if (r0 > r13) goto Lef
            r0 = 46
            if (r13 >= r0) goto Lef
            int r12 = r12 + 200
        Lef:
            return r12
    }

    private final int scoreReplyMethod(java.lang.reflect.Method r7) {
            r6 = this;
            java.lang.Class r6 = r7.getDeclaringClass()
            java.lang.String r6 = r6.getName()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            r6.getClass()
            java.lang.String r1 = r7.getName()
            r1.getClass()
            java.lang.String r0 = r1.toLowerCase(r0)
            r0.getClass()
            java.lang.String r1 = "comment"
            r2 = 0
            boolean r3 = p000.q02.m4654(r6, r1, r2)
            if (r3 == 0) goto L2b
            r3 = 500(0x1f4, float:7.0E-43)
            goto L2c
        L2b:
            r3 = r2
        L2c:
            java.lang.String r4 = "reply"
            boolean r5 = p000.q02.m4654(r6, r4, r2)
            if (r5 == 0) goto L36
            int r3 = r3 + 500
        L36:
            java.lang.String r5 = "manager"
            boolean r5 = p000.q02.m4654(r6, r5, r2)
            if (r5 == 0) goto L40
            int r3 = r3 + 250
        L40:
            java.lang.String r5 = "data"
            boolean r5 = p000.q02.m4654(r6, r5, r2)
            if (r5 == 0) goto L4a
            int r3 = r3 + 150
        L4a:
            java.lang.String r5 = "list"
            boolean r6 = p000.q02.m4654(r6, r5, r2)
            if (r6 == 0) goto L54
            int r3 = r3 + 100
        L54:
            boolean r6 = p000.q02.m4654(r0, r4, r2)
            if (r6 == 0) goto L5c
            int r3 = r3 + 300
        L5c:
            boolean r6 = p000.q02.m4654(r0, r1, r2)
            if (r6 == 0) goto L64
            int r3 = r3 + 200
        L64:
            java.lang.String r6 = "count"
            boolean r6 = p000.q02.m4654(r0, r6, r2)
            if (r6 == 0) goto L6e
            int r3 = r3 + 150
        L6e:
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class r0 = r7.getReturnType()
            boolean r6 = r6.isAssignableFrom(r0)
            if (r6 == 0) goto L7c
            int r3 = r3 + 200
        L7c:
            java.lang.Class r6 = r7.getReturnType()
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L8a
            int r3 = r3 + 120
        L8a:
            return r3
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
            r2 = 6
            r1.<init>(r2)
            r2 = 30
            java.lang.String r3 = ","
            r4 = 0
            java.lang.String r0 = p000.AbstractC0312g7.m2256(r0, r3, r4, r1, r2)
            java.lang.String r1 = "):"
            java.lang.String r5 = p000.lz1.m3692(r5, r0, r1, r6)
            return r5
    }

    private static final java.lang.CharSequence stableKey$lambda$118$lambda$117(java.lang.Class r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    /* JADX INFO: renamed from: Α */
    public static /* synthetic */ p000.s62 m1321(org.luckypray.dexkit.query.FindMethod r0) {
            s62 r0 = dexKitFindBindMethods$lambda$97$lambda$94(r0)
            return r0
    }

    /* JADX INFO: renamed from: Β */
    public static /* synthetic */ p000.s62 m1322(java.lang.String r0, org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            s62 r0 = m1319xfa1e0039(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ p000.s62 m1323(java.lang.String r0, org.luckypray.dexkit.query.FindMethod r1) {
            s62 r0 = dexKitFindReplyListMethods$lambda$77$lambda$75$lambda$72(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ p000.s62 m1324(org.luckypray.dexkit.query.matchers.MethodMatcher r0) {
            s62 r0 = dexKitFindReplyQueryMethods$lambda$106$lambda$103$lambda$102(r0)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ java.util.List m1325(java.lang.ClassLoader r0, org.luckypray.dexkit.DexKitBridge r1) {
            java.util.List r0 = resolveReplyListMethods$lambda$62(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ p000.s62 m1326(org.luckypray.dexkit.query.matchers.MethodMatcher r0) {
            s62 r0 = dexKitFindReplyQueryMethods$lambda$112$lambda$109$lambda$108(r0)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static /* synthetic */ java.util.List m1327(java.lang.ClassLoader r0) {
            java.util.List r0 = registerDexKitPrewarmProvider$lambda$4(r0)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static /* synthetic */ p000.s62 m1328(java.lang.ClassLoader r0) {
            s62 r0 = registerDexKitPrewarmProvider$lambda$4$lambda$2(r0)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static /* synthetic */ p000.s62 m1329(java.lang.String r0, org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            s62 r0 = m1317x64fbac6d(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static /* synthetic */ p000.s62 m1330(org.luckypray.dexkit.query.matchers.MethodMatcher r0) {
            s62 r0 = dexKitFindBindMethods$lambda$97$lambda$94$lambda$93(r0)
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static /* synthetic */ p000.s62 m1331(java.lang.String r0, org.luckypray.dexkit.query.FindMethod r1) {
            s62 r0 = dexKitFindReplyListMethods$lambda$84$lambda$82$lambda$79(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static /* synthetic */ java.util.List m1332(java.lang.ClassLoader r0, org.luckypray.dexkit.DexKitBridge r1) {
            java.util.List r0 = resolveLoadMoreCommentMethods$lambda$9(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static /* synthetic */ java.lang.CharSequence m1333(java.lang.Class r0) {
            java.lang.CharSequence r0 = stableKey$lambda$118$lambda$117(r0)
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static /* synthetic */ p000.s62 m1334(org.luckypray.dexkit.query.FindMethod r0) {
            s62 r0 = dexKitFindReplyQueryMethods$lambda$112$lambda$109(r0)
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static /* synthetic */ p000.s62 m1335(java.lang.String r0, org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            s62 r0 = m1318x216d50f3(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static /* synthetic */ p000.s62 m1336(java.lang.ClassLoader r0) {
            s62 r0 = registerDexKitPrewarmProvider$lambda$4$lambda$0(r0)
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static /* synthetic */ p000.s62 m1337(java.lang.String r0, org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            s62 r0 = m1320xb68fa4bf(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static /* synthetic */ p000.s62 m1338(java.lang.ClassLoader r0) {
            s62 r0 = registerDexKitPrewarmProvider$lambda$5(r0)
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static /* synthetic */ p000.s62 m1339(java.lang.String r0, org.luckypray.dexkit.query.FindMethod r1) {
            s62 r0 = dexKitFindLoadMoreCommentMethods$lambda$33$lambda$31$lambda$28(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static /* synthetic */ p000.s62 m1340(java.lang.String r0, org.luckypray.dexkit.query.FindMethod r1) {
            s62 r0 = dexKitFindLoadMoreCommentMethods$lambda$26$lambda$24$lambda$21(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static /* synthetic */ java.util.List m1341(java.lang.ClassLoader r0, org.luckypray.dexkit.DexKitBridge r1) {
            java.util.List r0 = resolveReplyQueryMethods$lambda$55(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static /* synthetic */ java.util.List m1342(java.lang.ClassLoader r0, org.luckypray.dexkit.DexKitBridge r1) {
            java.util.List r0 = resolveBindMethods$lambda$49(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public static /* synthetic */ p000.s62 m1343(java.lang.ClassLoader r0) {
            s62 r0 = registerDexKitPrewarmProvider$lambda$4$lambda$1(r0)
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public static /* synthetic */ p000.s62 m1344(java.lang.ClassLoader r0) {
            s62 r0 = registerDexKitPrewarmProvider$lambda$4$lambda$3(r0)
            return r0
    }

    /* JADX INFO: renamed from: ψ */
    public static /* synthetic */ p000.s62 m1345(org.luckypray.dexkit.query.FindMethod r0) {
            s62 r0 = dexKitFindReplyQueryMethods$lambda$106$lambda$103(r0)
            return r0
    }

    /* JADX INFO: renamed from: ω */
    public static /* synthetic */ java.lang.CharSequence m1346(java.lang.reflect.Method r0) {
            java.lang.CharSequence r0 = reflectionFindLoadMoreCommentMethods$lambda$19(r0)
            return r0
    }

    public final void registerDexKitPrewarmProvider() {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap r2 = p000.C0777rx.f9562
            uj r2 = new uj
            r0 = 2
            r2.<init>(r0)
            java.lang.String r0 = "comment_bookmark"
            p000.C0777rx.m5178(r0, r2)
            uj r2 = new uj
            r1 = 3
            r2.<init>(r1)
            p000.C0777rx.m5177(r0, r2)
            return
    }

    public final java.util.List<java.lang.reflect.Method> resolveBindMethods(java.lang.ClassLoader r6, boolean r7) {
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6233
            java.util.List r1 = p000.C0666ox.m4323(r0, r6)
            r2 = 1
            r3 = 800(0x320, float:1.121E-42)
            if (r1 == 0) goto L6e
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L17
            goto L6e
        L17:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L20:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = r5.isRecyclerBindMethod(r1)
            if (r1 == 0) goto L20
            r6.add(r0)
            goto L20
        L37:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L40:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L59
            java.lang.Object r7 = r6.next()
            r0 = r7
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r1 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            int r0 = r1.scoreBindMethod(r0)
            if (r0 < r3) goto L40
            r5.add(r7)
            goto L40
        L59:
            java.util.Iterator r6 = r5.iterator()
        L5d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.setAccessible(r2)
            goto L5d
        L6d:
            return r5
        L6e:
            if (r7 == 0) goto Ldd
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 != 0) goto L79
            goto Ldd
        L79:
            bb r7 = new bb
            r1 = 15
            r7.<init>(r6, r1)
            java.lang.String r1 = "定位评论书签：评论列表绑定方法"
            java.util.List r6 = p000.C0666ox.m4316(r0, r6, r1, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L8f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r6.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = r5.isRecyclerBindMethod(r1)
            if (r1 == 0) goto L8f
            r7.add(r0)
            goto L8f
        La6:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r7.iterator()
        Laf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc8
            java.lang.Object r7 = r6.next()
            r0 = r7
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r1 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            int r0 = r1.scoreBindMethod(r0)
            if (r0 < r3) goto Laf
            r5.add(r7)
            goto Laf
        Lc8:
            java.util.Iterator r6 = r5.iterator()
        Lcc:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Ldc
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.setAccessible(r2)
            goto Lcc
        Ldc:
            return r5
        Ldd:
            jz r5 = p000.C0450jz.f5672
            return r5
    }

    public final java.util.List<java.lang.reflect.Method> resolveLoadMoreCommentMethods(java.lang.ClassLoader r9, boolean r10) {
            r8 = this;
            r9.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6229
            java.util.List r1 = p000.C0666ox.m4323(r0, r9)
            r2 = 1
            if (r1 == 0) goto L87
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L16
            goto L87
        L16:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = r8.isLoadMoreCommentMethod(r5)
            if (r5 == 0) goto L1f
            r3.add(r4)
            goto L1f
        L36:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L44:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L61
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r7 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.lang.String r6 = r7.stableKey(r6)
            boolean r6 = r1.add(r6)
            if (r6 == 0) goto L44
            r4.add(r5)
            goto L44
        L61:
            tf r1 = new tf
            r3 = 14
            r1.<init>(r3)
            java.util.List r1 = p000.AbstractC0984xh.m6658(r4, r1)
            java.util.Iterator r3 = r1.iterator()
        L70:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L80
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.setAccessible(r2)
            goto L70
        L80:
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L87
            return r1
        L87:
            java.util.List r1 = r8.reflectionFindLoadMoreCommentMethods(r9)
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L99
            if (r10 == 0) goto L98
            java.lang.Object r8 = p000.C0666ox.f8297
            p000.C0666ox.m4327(r0, r1)
        L98:
            return r1
        L99:
            if (r10 == 0) goto L11f
            java.lang.Object r10 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.C0666ox.f8305
            boolean r10 = r10.get()
            if (r10 != 0) goto La7
            goto L11f
        La7:
            bb r10 = new bb
            r1 = 12
            r10.<init>(r9, r1)
            java.lang.String r1 = "定位评论书签主动查询接口"
            java.util.List r9 = p000.C0666ox.m4316(r0, r9, r1, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        Lbd:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Ld4
            java.lang.Object r0 = r9.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = r8.isLoadMoreCommentMethod(r1)
            if (r1 == 0) goto Lbd
            r10.add(r0)
            goto Lbd
        Ld4:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        Le2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lff
            java.lang.Object r0 = r10.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r3 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.lang.String r1 = r3.stableKey(r1)
            boolean r1 = r8.add(r1)
            if (r1 == 0) goto Le2
            r9.add(r0)
            goto Le2
        Lff:
            tf r8 = new tf
            r10 = 15
            r8.<init>(r10)
            java.util.List r8 = p000.AbstractC0984xh.m6658(r9, r8)
            java.util.Iterator r9 = r8.iterator()
        L10e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L11e
            java.lang.Object r10 = r9.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            r10.setAccessible(r2)
            goto L10e
        L11e:
            return r8
        L11f:
            jz r8 = p000.C0450jz.f5672
            return r8
    }

    public final java.util.List<java.lang.reflect.Method> resolveReplyListMethods(java.lang.ClassLoader r5, boolean r6) {
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6218
            java.util.List r1 = p000.C0666ox.m4323(r0, r5)
            r2 = 1
            if (r1 == 0) goto L80
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L15
            goto L80
        L15:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r1.iterator()
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r6.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = r4.isReplyListMethod(r1)
            if (r1 == 0) goto L1e
            r5.add(r0)
            goto L1e
        L35:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L43:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r3 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.lang.String r1 = r3.stableKey(r1)
            boolean r1 = r4.add(r1)
            if (r1 == 0) goto L43
            r6.add(r0)
            goto L43
        L60:
            tf r4 = new tf
            r5 = 16
            r4.<init>(r5)
            java.util.List r4 = p000.AbstractC0984xh.m6658(r6, r4)
            java.util.Iterator r5 = r4.iterator()
        L6f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r2)
            goto L6f
        L7f:
            return r4
        L80:
            java.util.List r1 = r4.reflectionFindReplyListMethods(r5)
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L90
            if (r6 == 0) goto L8f
            p000.C0666ox.m4327(r0, r1)
        L8f:
            return r1
        L90:
            if (r6 == 0) goto L114
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.C0666ox.f8305
            boolean r6 = r6.get()
            if (r6 != 0) goto L9c
            goto L114
        L9c:
            bb r6 = new bb
            r1 = 14
            r6.<init>(r5, r1)
            java.lang.String r1 = "定位评论书签回复列表接口"
            java.util.List r5 = p000.C0666ox.m4316(r0, r5, r1, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lb2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = r4.isReplyListMethod(r1)
            if (r1 == 0) goto Lb2
            r6.add(r0)
            goto Lb2
        Lc9:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        Ld7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lf4
            java.lang.Object r0 = r6.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r3 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.lang.String r1 = r3.stableKey(r1)
            boolean r1 = r4.add(r1)
            if (r1 == 0) goto Ld7
            r5.add(r0)
            goto Ld7
        Lf4:
            tf r4 = new tf
            r6 = 17
            r4.<init>(r6)
            java.util.List r4 = p000.AbstractC0984xh.m6658(r5, r4)
            java.util.Iterator r5 = r4.iterator()
        L103:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L113
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r2)
            goto L103
        L113:
            return r4
        L114:
            jz r4 = p000.C0450jz.f5672
            return r4
    }

    public final java.util.List<java.lang.reflect.Method> resolveReplyQueryMethods(java.lang.ClassLoader r5, boolean r6) {
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6234
            java.util.List r1 = p000.C0666ox.m4323(r0, r5)
            r2 = 1
            if (r1 == 0) goto L4a
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L15
            goto L4a
        L15:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r1.iterator()
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r6.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = r4.isReplyQueryMethod(r1)
            if (r1 == 0) goto L1e
            r5.add(r0)
            goto L1e
        L35:
            java.util.Iterator r4 = r5.iterator()
        L39:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r4.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r2)
            goto L39
        L49:
            return r5
        L4a:
            if (r6 == 0) goto L97
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.C0666ox.f8305
            boolean r6 = r6.get()
            if (r6 != 0) goto L55
            goto L97
        L55:
            bb r6 = new bb
            r1 = 13
            r6.<init>(r5, r1)
            java.lang.String r1 = "定位评论书签：回复查询方法"
            java.util.List r5 = p000.C0666ox.m4316(r0, r5, r1, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L6b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = r4.isReplyQueryMethod(r1)
            if (r1 == 0) goto L6b
            r6.add(r0)
            goto L6b
        L82:
            java.util.Iterator r4 = r6.iterator()
        L86:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L96
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.setAccessible(r2)
            goto L86
        L96:
            return r6
        L97:
            jz r4 = p000.C0450jz.f5672
            return r4
    }
}
