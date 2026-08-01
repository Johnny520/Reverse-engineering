package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkReflect {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect INSTANCE = null;
    private static final java.lang.String TAG = "ra71aa3b096f9ff6b";
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.util.List<java.lang.reflect.Field>> fieldsCache = null;
    private static final java.util.Set<java.lang.String> primitiveNames = null;

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE = r0
            java.lang.String r8 = "java.lang.Byte"
            java.lang.String r9 = "java.lang.Character"
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "java.lang.Integer"
            java.lang.String r3 = "java.lang.Long"
            java.lang.String r4 = "java.lang.Boolean"
            java.lang.String r5 = "java.lang.Float"
            java.lang.String r6 = "java.lang.Double"
            java.lang.String r7 = "java.lang.Short"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.primitiveNames = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.fieldsCache = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.$stable = r0
            return
    }

    private CommentBookmarkReflect() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.List<java.lang.reflect.Field> allFields(java.lang.Class<?> r4) {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.util.List<java.lang.reflect.Field>> r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.fieldsCache
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

    private final java.util.List<java.lang.reflect.Field> allFieldsForBookmark(java.lang.Class<?> r2) {
            r1 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L5:
            if (r2 == 0) goto L14
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L14
            java.lang.Class r2 = p000.lz1.m3684(r2, r1)
            goto L5
        L14:
            return r1
    }

    private static final void extractReplyItems$walk(java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean> r8, java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r9, java.lang.Object r10, int r11) {
            if (r10 == 0) goto Lc0
            r0 = 8
            if (r11 <= r0) goto L8
            goto Lc0
        L8:
            java.lang.Class r0 = r10.getClass()
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto Lc0
            boolean r0 = r10 instanceof java.lang.String
            if (r0 != 0) goto Lc0
            boolean r0 = r10 instanceof java.lang.Number
            if (r0 != 0) goto Lc0
            boolean r0 = r10 instanceof java.lang.Boolean
            if (r0 == 0) goto L1f
            return
        L1f:
            boolean r0 = r8.containsKey(r10)
            if (r0 == 0) goto L27
            goto Lc0
        L27:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.put(r10, r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            boolean r1 = r0.looksLikeCommentObject(r10)
            if (r1 == 0) goto L63
            java.lang.String r3 = r0.getCommentId(r10)
            java.lang.String r5 = r0.getContent(r10)
            java.lang.String r1 = r0.getAuthorName(r10)
            long r6 = r0.getCreateTime(r10)
            if (r3 == 0) goto L63
            boolean r2 = p000.q02.m4671(r3)
            if (r2 == 0) goto L4d
            goto L63
        L4d:
            if (r5 == 0) goto L63
            boolean r2 = p000.q02.m4671(r5)
            if (r2 == 0) goto L56
            goto L63
        L56:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r2 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem
            if (r1 != 0) goto L5c
            java.lang.String r1 = ""
        L5c:
            r4 = r1
            r2.<init>(r3, r4, r5, r6)
            r9.add(r2)
        L63:
            boolean r1 = r10 instanceof java.lang.Iterable
            r2 = 1
            if (r1 == 0) goto L7e
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L6e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r10.next()
            int r1 = r11 + 1
            extractReplyItems$walk(r8, r9, r0, r1)
            goto L6e
        L7e:
            java.lang.Class r1 = r10.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L9b
            int r0 = java.lang.reflect.Array.getLength(r10)
            r1 = 0
        L8d:
            if (r1 >= r0) goto Lc0
            java.lang.Object r3 = java.lang.reflect.Array.get(r10, r1)
            int r4 = r11 + 1
            extractReplyItems$walk(r8, r9, r3, r4)
            int r1 = r1 + 1
            goto L8d
        L9b:
            java.lang.Class r1 = r10.getClass()
            java.util.List r0 = r0.allFields(r1)
            java.util.Iterator r0 = r0.iterator()
        La7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc0
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> La7
            int r3 = r11 + 1
            extractReplyItems$walk(r8, r9, r1, r3)     // Catch: java.lang.Throwable -> La7
            goto La7
        Lc0:
            return
    }

    private static final java.lang.Object findAwemeObject$dfs$12(java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean> r6, java.lang.Object r7, int r8) {
            r0 = 0
            if (r7 != 0) goto L5
            goto Lef
        L5:
            r1 = 6
            if (r8 <= r1) goto La
            goto Lef
        La:
            boolean r1 = r6.containsKey(r7)
            if (r1 == 0) goto L12
            goto Lef
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.put(r7, r1)
            boolean r1 = findAwemeObject$isAwemeLike(r7)
            if (r1 == 0) goto L1e
            return r7
        L1e:
            boolean r1 = r7 instanceof android.view.View
            r2 = 1
            if (r1 == 0) goto L2f
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r7 = r7.getTag()
            int r8 = r8 + r2
            java.lang.Object r6 = findAwemeObject$dfs$12(r6, r7, r8)
            return r6
        L2f:
            boolean r1 = r7 instanceof java.lang.CharSequence
            if (r1 == 0) goto L34
            return r0
        L34:
            boolean r1 = r7 instanceof java.lang.Number
            if (r1 == 0) goto L39
            return r0
        L39:
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L3e
            return r0
        L3e:
            boolean r1 = r7 instanceof java.lang.Class
            if (r1 == 0) goto L43
            return r0
        L43:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "java."
            r4 = 0
            boolean r3 = p000.x02.m6485(r1, r3, r4)
            if (r3 != 0) goto Lef
            java.lang.String r3 = "kotlin."
            boolean r3 = p000.x02.m6485(r1, r3, r4)
            if (r3 != 0) goto Lef
            java.lang.String r3 = "android."
            boolean r3 = p000.x02.m6485(r1, r3, r4)
            if (r3 != 0) goto Lef
            java.lang.String r3 = "androidx."
            boolean r1 = p000.x02.m6485(r1, r3, r4)
            if (r1 == 0) goto L6e
            goto Lef
        L6e:
            boolean r1 = r7 instanceof java.lang.Iterable
            r3 = 80
            if (r1 == 0) goto L91
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = p000.AbstractC0984xh.m6662(r7, r3)
            java.util.Iterator r7 = r7.iterator()
        L7e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lef
            java.lang.Object r1 = r7.next()
            int r3 = r8 + 1
            java.lang.Object r1 = findAwemeObject$dfs$12(r6, r1, r3)
            if (r1 == 0) goto L7e
            return r1
        L91:
            java.lang.Class r1 = r7.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto Lb5
            int r1 = java.lang.reflect.Array.getLength(r7)
            if (r1 <= r3) goto La2
            goto La3
        La2:
            r3 = r1
        La3:
            if (r4 >= r3) goto Lef
            java.lang.Object r1 = java.lang.reflect.Array.get(r7, r4)
            int r5 = r8 + 1
            java.lang.Object r1 = findAwemeObject$dfs$12(r6, r1, r5)
            if (r1 == 0) goto Lb2
            return r1
        Lb2:
            int r4 = r4 + 1
            goto La3
        Lb5:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Class r3 = r7.getClass()
            java.util.List r1 = r1.allFields(r3)
            r3 = 120(0x78, float:1.68E-43)
            java.util.List r1 = p000.AbstractC0984xh.m6662(r1, r3)
            java.util.Iterator r1 = r1.iterator()
        Lc9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lef
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            int r4 = r3.getModifiers()     // Catch: java.lang.Throwable -> Lc9
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Throwable -> Lc9
            if (r4 != 0) goto Lc9
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> Lc9
            int r4 = r8 + 1
            java.lang.Object r3 = findAwemeObject$dfs$12(r6, r3, r4)     // Catch: java.lang.Throwable -> Lc9
            if (r3 == 0) goto Lc9
            return r3
        Lef:
            return r0
    }

    private static final boolean findAwemeObject$isAwemeLike(java.lang.Object r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 == 0) goto L1a
            return r3
        L1a:
            java.lang.String r2 = "Aweme"
            boolean r2 = p000.q02.m4654(r1, r2, r3)
            if (r2 == 0) goto L2b
            java.lang.String r2 = "feed"
            boolean r1 = p000.q02.m4654(r1, r2, r3)
            if (r1 == 0) goto L2b
            return r3
        L2b:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.String r2 = "getAwemeId"
            java.lang.String r4 = "getGroupId"
            java.lang.String r5 = "getAid"
            java.lang.String[] r2 = new java.lang.String[]{r5, r2, r4}
            java.lang.String r4 = "awemeId"
            java.lang.String r5 = "groupId"
            java.lang.String r6 = "aid"
            java.lang.String[] r4 = new java.lang.String[]{r6, r4, r5}
            java.lang.String r2 = r1.getStringByCandidateNamesForAweme(r7, r2, r4)
            java.lang.String r4 = "getDesc"
            java.lang.String r5 = "getDescription"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r5 = "desc"
            java.lang.String r6 = "description"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.lang.String r7 = r1.getStringByCandidateNamesForAweme(r7, r4, r5)
            if (r2 == 0) goto L65
            boolean r1 = p000.q02.m4671(r2)
            if (r1 == 0) goto L62
            goto L65
        L62:
            if (r7 == 0) goto L65
            return r3
        L65:
            return r0
    }

    private static final java.lang.Object findBookmarkSourceObject$dfs$23(java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean> r6, java.lang.Object r7, int r8) {
            r0 = 0
            if (r7 != 0) goto L5
            goto Le6
        L5:
            r1 = 5
            if (r8 <= r1) goto La
            goto Le6
        La:
            boolean r1 = r6.containsKey(r7)
            if (r1 == 0) goto L12
            goto Le6
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.put(r7, r1)
            int r1 = findBookmarkSourceObject$score(r7)
            r2 = 900(0x384, float:1.261E-42)
            if (r1 < r2) goto L20
            return r7
        L20:
            boolean r1 = r7 instanceof android.view.View
            r2 = 1
            if (r1 == 0) goto L35
            android.view.View r7 = (android.view.View) r7     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r7 = r7.getTag()     // Catch: java.lang.Throwable -> Le6
            if (r7 == 0) goto Le6
            int r8 = r8 + r2
            java.lang.Object r6 = findBookmarkSourceObject$dfs$23(r6, r7, r8)     // Catch: java.lang.Throwable -> Le6
            if (r6 == 0) goto Le6
            return r6
        L35:
            boolean r1 = r7 instanceof java.lang.CharSequence
            if (r1 == 0) goto L3a
            return r0
        L3a:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "java."
            r4 = 0
            boolean r3 = p000.x02.m6485(r1, r3, r4)
            if (r3 != 0) goto Le6
            java.lang.String r3 = "kotlin."
            boolean r3 = p000.x02.m6485(r1, r3, r4)
            if (r3 != 0) goto Le6
            java.lang.String r3 = "android."
            boolean r3 = p000.x02.m6485(r1, r3, r4)
            if (r3 != 0) goto Le6
            java.lang.String r3 = "androidx."
            boolean r1 = p000.x02.m6485(r1, r3, r4)
            if (r1 == 0) goto L65
            goto Le6
        L65:
            boolean r1 = r7 instanceof java.lang.Iterable
            r3 = 30
            if (r1 == 0) goto L88
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = p000.AbstractC0984xh.m6662(r7, r3)
            java.util.Iterator r7 = r7.iterator()
        L75:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Le6
            java.lang.Object r1 = r7.next()
            int r3 = r8 + 1
            java.lang.Object r1 = findBookmarkSourceObject$dfs$23(r6, r1, r3)
            if (r1 == 0) goto L75
            return r1
        L88:
            java.lang.Class r1 = r7.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto Lac
            int r1 = java.lang.reflect.Array.getLength(r7)
            if (r1 <= r3) goto L99
            goto L9a
        L99:
            r3 = r1
        L9a:
            if (r4 >= r3) goto Le6
            java.lang.Object r1 = java.lang.reflect.Array.get(r7, r4)
            int r5 = r8 + 1
            java.lang.Object r1 = findBookmarkSourceObject$dfs$23(r6, r1, r5)
            if (r1 == 0) goto La9
            return r1
        La9:
            int r4 = r4 + 1
            goto L9a
        Lac:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Class r3 = r7.getClass()
            java.util.List r1 = r1.allFieldsForBookmark(r3)
            r3 = 80
            java.util.List r1 = p000.AbstractC0984xh.m6662(r1, r3)
            java.util.Iterator r1 = r1.iterator()
        Lc0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Le6
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            int r4 = r3.getModifiers()     // Catch: java.lang.Throwable -> Lc0
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Throwable -> Lc0
            if (r4 != 0) goto Lc0
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> Lc0
            int r4 = r8 + 1
            java.lang.Object r3 = findBookmarkSourceObject$dfs$23(r6, r3, r4)     // Catch: java.lang.Throwable -> Lc0
            if (r3 == 0) goto Lc0
            return r3
        Le6:
            return r0
    }

    private static final int findBookmarkSourceObject$score(java.lang.Object r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.String r2 = r1.getBookmarkId(r4)
            java.lang.String r3 = r1.getBookmarkContent(r4)
            java.lang.String r1 = r1.getBookmarkAuthorName(r4)
            if (r2 == 0) goto L1e
            boolean r2 = p000.q02.m4671(r2)
            if (r2 == 0) goto L1b
            goto L1e
        L1b:
            r2 = 500(0x1f4, float:7.0E-43)
            goto L1f
        L1e:
            r2 = r0
        L1f:
            if (r3 == 0) goto L2a
            boolean r3 = p000.q02.m4671(r3)
            if (r3 == 0) goto L28
            goto L2a
        L28:
            int r2 = r2 + 500
        L2a:
            if (r1 == 0) goto L35
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L33
            goto L35
        L33:
            int r2 = r2 + 120
        L35:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            r4.getClass()
            java.lang.String r1 = "comment"
            boolean r1 = p000.q02.m4654(r4, r1, r0)
            if (r1 == 0) goto L50
            int r2 = r2 + 250
        L50:
            java.lang.String r1 = "message"
            boolean r1 = p000.q02.m4654(r4, r1, r0)
            if (r1 == 0) goto L5a
            int r2 = r2 + 160
        L5a:
            java.lang.String r1 = "publicscreen"
            boolean r1 = p000.q02.m4654(r4, r1, r0)
            if (r1 == 0) goto L64
            int r2 = r2 + 120
        L64:
            java.lang.String r1 = "item"
            boolean r4 = p000.q02.m4654(r4, r1, r0)
            if (r4 == 0) goto L6e
            int r2 = r2 + 80
        L6e:
            return r2
    }

    private static final java.lang.Object findCommentObject$dfs(java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean> r6, java.lang.Object r7, int r8) {
            r0 = 0
            if (r7 != 0) goto L5
            goto Lf3
        L5:
            r1 = 3
            if (r8 <= r1) goto La
            goto Lf3
        La:
            boolean r1 = r6.containsKey(r7)
            if (r1 == 0) goto L12
            goto Lf3
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.put(r7, r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            boolean r2 = r1.isCommentLike(r7)
            if (r2 == 0) goto L2d
            java.lang.String r2 = r1.getCommentId(r7)
            if (r2 == 0) goto L2d
            boolean r2 = p000.q02.m4671(r2)
            if (r2 == 0) goto L2c
            goto L2d
        L2c:
            return r7
        L2d:
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L32
            return r0
        L32:
            boolean r2 = r7 instanceof java.lang.CharSequence
            if (r2 == 0) goto L37
            return r0
        L37:
            java.util.Set<java.lang.String> r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.primitiveNames
            java.lang.Class r3 = r7.getClass()
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L49
            goto Lf3
        L49:
            boolean r2 = r7 instanceof java.lang.Iterable
            r3 = 20
            r4 = 1
            if (r2 == 0) goto L6d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = p000.AbstractC0984xh.m6662(r7, r3)
            java.util.Iterator r7 = r7.iterator()
        L5a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lf3
            java.lang.Object r1 = r7.next()
            int r2 = r8 + 1
            java.lang.Object r1 = findCommentObject$dfs(r6, r1, r2)
            if (r1 == 0) goto L5a
            return r1
        L6d:
            java.lang.Class r2 = r7.getClass()
            boolean r2 = r2.isArray()
            r5 = 0
            if (r2 == 0) goto L92
            int r1 = java.lang.reflect.Array.getLength(r7)
            if (r1 <= r3) goto L7f
            goto L80
        L7f:
            r3 = r1
        L80:
            if (r5 >= r3) goto Lf3
            java.lang.Object r1 = java.lang.reflect.Array.get(r7, r5)
            int r2 = r8 + 1
            java.lang.Object r1 = findCommentObject$dfs(r6, r1, r2)
            if (r1 == 0) goto L8f
            return r1
        L8f:
            int r5 = r5 + 1
            goto L80
        L92:
            java.lang.Class r2 = r7.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "android."
            boolean r3 = p000.x02.m6485(r2, r3, r5)
            if (r3 != 0) goto Lf3
            java.lang.String r3 = "java."
            boolean r3 = p000.x02.m6485(r2, r3, r5)
            if (r3 != 0) goto Lf3
            java.lang.String r3 = "kotlin."
            boolean r3 = p000.x02.m6485(r2, r3, r5)
            if (r3 != 0) goto Lf3
            java.lang.String r3 = "androidx."
            boolean r2 = p000.x02.m6485(r2, r3, r5)
            if (r2 == 0) goto Lbb
            goto Lf3
        Lbb:
            java.lang.Class r2 = r7.getClass()
            java.util.List r1 = r1.allFields(r2)
            r2 = 48
            java.util.List r1 = p000.AbstractC0984xh.m6662(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        Lcd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r3 = r2.getModifiers()     // Catch: java.lang.Throwable -> Lcd
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> Lcd
            if (r3 != 0) goto Lcd
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> Lcd
            int r3 = r8 + 1
            java.lang.Object r2 = findCommentObject$dfs(r6, r2, r3)     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto Lcd
            return r2
        Lf3:
            return r0
    }

    private static final java.lang.Object findCommentObjectById$dfs$32(java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean> r6, java.lang.String r7, java.lang.Object r8, int r9) {
            r0 = 0
            if (r8 != 0) goto L5
            goto Le4
        L5:
            r1 = 6
            if (r9 <= r1) goto La
            goto Le4
        La:
            boolean r1 = r6.containsKey(r8)
            if (r1 == 0) goto L12
            goto Le4
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.put(r8, r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            boolean r2 = r1.isCommentLike(r8)
            if (r2 == 0) goto L2a
            java.lang.String r2 = r1.getCommentId(r8)
            boolean r2 = p000.ln0.m3626(r2, r7)
            if (r2 == 0) goto L2a
            return r8
        L2a:
            boolean r2 = r8 instanceof android.view.View
            if (r2 == 0) goto L2f
            return r0
        L2f:
            boolean r2 = r8 instanceof java.lang.CharSequence
            if (r2 == 0) goto L34
            return r0
        L34:
            boolean r2 = r8 instanceof java.lang.Class
            if (r2 == 0) goto L39
            return r0
        L39:
            java.lang.Class r2 = r8.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "java.lang."
            r4 = 0
            boolean r3 = p000.x02.m6485(r2, r3, r4)
            if (r3 != 0) goto Le4
            java.lang.String r3 = "kotlin."
            boolean r3 = p000.x02.m6485(r2, r3, r4)
            if (r3 != 0) goto Le4
            java.lang.String r3 = "android."
            boolean r3 = p000.x02.m6485(r2, r3, r4)
            if (r3 != 0) goto Le4
            java.lang.String r3 = "androidx."
            boolean r2 = p000.x02.m6485(r2, r3, r4)
            if (r2 == 0) goto L64
            goto Le4
        L64:
            boolean r2 = r8 instanceof java.lang.Iterable
            r3 = 80
            r5 = 1
            if (r2 == 0) goto L88
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = p000.AbstractC0984xh.m6662(r8, r3)
            java.util.Iterator r8 = r8.iterator()
        L75:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Le4
            java.lang.Object r1 = r8.next()
            int r2 = r9 + 1
            java.lang.Object r1 = findCommentObjectById$dfs$32(r6, r7, r1, r2)
            if (r1 == 0) goto L75
            return r1
        L88:
            java.lang.Class r2 = r8.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto Lac
            int r1 = java.lang.reflect.Array.getLength(r8)
            if (r1 <= r3) goto L99
            goto L9a
        L99:
            r3 = r1
        L9a:
            if (r4 >= r3) goto Le4
            java.lang.Object r1 = java.lang.reflect.Array.get(r8, r4)
            int r2 = r9 + 1
            java.lang.Object r1 = findCommentObjectById$dfs$32(r6, r7, r1, r2)
            if (r1 == 0) goto La9
            return r1
        La9:
            int r4 = r4 + 1
            goto L9a
        Lac:
            java.lang.Class r2 = r8.getClass()
            java.util.List r1 = r1.allFields(r2)
            r2 = 120(0x78, float:1.68E-43)
            java.util.List r1 = p000.AbstractC0984xh.m6662(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        Lbe:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le4
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r3 = r2.getModifiers()     // Catch: java.lang.Throwable -> Lbe
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> Lbe
            if (r3 != 0) goto Lbe
            r2.setAccessible(r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Throwable -> Lbe
            int r3 = r9 + 1
            java.lang.Object r2 = findCommentObjectById$dfs$32(r6, r7, r2, r3)     // Catch: java.lang.Throwable -> Lbe
            if (r2 == 0) goto Lbe
            return r2
        Le4:
            return r0
    }

    private static final void findCommentObjects$walk$72(java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean> r5, java.util.ArrayList<java.lang.Object> r6, java.lang.Object r7, int r8) {
            if (r7 == 0) goto Ld7
            r0 = 6
            if (r8 <= r0) goto L7
            goto Ld7
        L7:
            boolean r0 = r5.containsKey(r7)
            if (r0 == 0) goto Lf
            goto Ld7
        Lf:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.put(r7, r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            boolean r1 = r0.isCommentLike(r7)
            if (r1 == 0) goto L2d
            java.lang.String r1 = r0.getCommentId(r7)
            if (r1 == 0) goto L2d
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L29
            goto L2d
        L29:
            r6.add(r7)
            return
        L2d:
            boolean r1 = r7 instanceof java.lang.CharSequence
            if (r1 == 0) goto L32
            return
        L32:
            boolean r1 = r7 instanceof java.lang.Number
            if (r1 == 0) goto L37
            return
        L37:
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L3c
            return
        L3c:
            boolean r1 = r7 instanceof java.lang.Iterable
            r2 = 1
            if (r1 == 0) goto L57
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L47:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Ld7
            java.lang.Object r0 = r7.next()
            int r1 = r8 + 1
            findCommentObjects$walk$72(r5, r6, r0, r1)
            goto L47
        L57:
            java.lang.Class r1 = r7.getClass()
            boolean r1 = r1.isArray()
            r3 = 0
            if (r1 == 0) goto L79
            int r0 = java.lang.reflect.Array.getLength(r7)
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 <= r1) goto L6b
            r0 = r1
        L6b:
            if (r3 >= r0) goto Ld7
            java.lang.Object r1 = java.lang.reflect.Array.get(r7, r3)
            int r4 = r8 + 1
            findCommentObjects$walk$72(r5, r6, r1, r4)
            int r3 = r3 + 1
            goto L6b
        L79:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "java."
            boolean r4 = p000.x02.m6485(r1, r4, r3)
            if (r4 != 0) goto Ld7
            java.lang.String r4 = "kotlin."
            boolean r4 = p000.x02.m6485(r1, r4, r3)
            if (r4 != 0) goto Ld7
            java.lang.String r4 = "android."
            boolean r4 = p000.x02.m6485(r1, r4, r3)
            if (r4 != 0) goto Ld7
            java.lang.String r4 = "androidx."
            boolean r1 = p000.x02.m6485(r1, r4, r3)
            if (r1 == 0) goto La2
            goto Ld7
        La2:
            java.lang.Class r1 = r7.getClass()
            java.util.List r0 = r0.allFields(r1)
            r1 = 80
            java.util.List r0 = p000.AbstractC0984xh.m6662(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        Lb4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld7
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r3 = r1.getModifiers()     // Catch: java.lang.Throwable -> Lb4
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> Lb4
            if (r3 != 0) goto Lb4
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> Lb4
            int r3 = r8 + 1
            findCommentObjects$walk$72(r5, r6, r1, r3)     // Catch: java.lang.Throwable -> Lb4
            goto Lb4
        Ld7:
            return
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

    private final java.lang.reflect.Field findFieldForBookmark(java.lang.Class<?> r6, java.lang.String r7) {
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

    private final java.lang.reflect.Method findMethod(java.lang.Class<?> r6, java.lang.String r7) {
            r5 = this;
        L0:
            r5 = 0
            if (r6 == 0) goto L39
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L39
            java.lang.reflect.Method[] r0 = r6.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L31
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = p000.ln0.m3626(r4, r7)
            if (r4 == 0) goto L2e
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L2e
            r5 = r3
            goto L31
        L2e:
            int r2 = r2 + 1
            goto L14
        L31:
            if (r5 == 0) goto L34
            return r5
        L34:
            java.lang.Class r6 = r6.getSuperclass()
            goto L0
        L39:
            return r5
    }

    private final java.lang.reflect.Method findNoArgMethodForBookmark(java.lang.Class<?> r6, java.lang.String r7) {
            r5 = this;
        L0:
            r5 = 0
            if (r6 == 0) goto L39
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L39
            java.lang.reflect.Method[] r0 = r6.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L31
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = p000.ln0.m3626(r4, r7)
            if (r4 == 0) goto L2e
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L2e
            r5 = r3
            goto L31
        L2e:
            int r2 = r2 + 1
            goto L14
        L31:
            if (r5 == 0) goto L34
            return r5
        L34:
            java.lang.Class r6 = r6.getSuperclass()
            goto L0
        L39:
            return r5
    }

    public static /* synthetic */ java.util.List findRealCommentObjectsDeep$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r0, java.lang.ClassLoader r1, java.lang.Object r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L6
            r3 = 8
        L6:
            java.util.List r0 = r0.findRealCommentObjectsDeep(r1, r2, r3)
            return r0
    }

    private static final boolean findRealCommentObjectsDeep$isSkippable(java.lang.Object r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r1 = r0.getName()
            boolean r0 = r0.isPrimitive()
            r2 = 1
            if (r0 == 0) goto L10
            goto L44
        L10:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L15
            return r2
        L15:
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L1f
            return r2
        L1f:
            boolean r0 = r3 instanceof java.lang.CharSequence
            if (r0 == 0) goto L24
            return r2
        L24:
            boolean r3 = r3 instanceof java.lang.Class
            if (r3 == 0) goto L29
            return r2
        L29:
            java.lang.String r3 = "java.lang.reflect."
            r0 = 0
            boolean r3 = p000.x02.m6485(r1, r3, r0)
            if (r3 == 0) goto L33
            goto L44
        L33:
            java.lang.String r3 = "android."
            boolean r3 = p000.x02.m6485(r1, r3, r0)
            if (r3 == 0) goto L3c
            goto L44
        L3c:
            java.lang.String r3 = "kotlin."
            boolean r3 = p000.x02.m6485(r1, r3, r0)
            if (r3 == 0) goto L45
        L44:
            return r2
        L45:
            return r0
    }

    private static final void findRealCommentObjectsDeep$walk$77(int r11, java.util.Set<java.lang.Object> r12, java.lang.Class<?> r13, java.util.ArrayList<java.lang.Object> r14, java.lang.Object r15, int r16) {
            r1 = r16
            if (r15 != 0) goto L6
            goto Ld1
        L6:
            if (r1 <= r11) goto La
            goto Ld1
        La:
            boolean r3 = findRealCommentObjectsDeep$isSkippable(r15)
            if (r3 == 0) goto L12
            goto Ld1
        L12:
            boolean r4 = r12.add(r15)
            if (r4 != 0) goto L1a
            goto Ld1
        L1a:
            boolean r5 = r13.isInstance(r15)
            if (r5 == 0) goto L24
            r14.add(r15)
            return
        L24:
            boolean r5 = r15 instanceof java.lang.Iterable
            r8 = 1
            if (r5 == 0) goto L44
            r0 = r15
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Ld1
            java.lang.Object r6 = r0.next()
            int r7 = r1 + 1
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            findRealCommentObjectsDeep$walk$77(r2, r3, r4, r5, r6, r7)
            goto L30
        L44:
            java.lang.Class r2 = r15.getClass()
            boolean r2 = r2.isArray()
            r3 = 0
            if (r2 == 0) goto L6d
            int r2 = java.lang.reflect.Array.getLength(r15)
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 <= r4) goto L59
            r9 = r4
            goto L5a
        L59:
            r9 = r2
        L5a:
            r10 = r3
        L5b:
            if (r10 >= r9) goto Ld1
            java.lang.Object r6 = java.lang.reflect.Array.get(r15, r10)
            int r7 = r1 + 1
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            findRealCommentObjectsDeep$walk$77(r2, r3, r4, r5, r6, r7)
            int r10 = r10 + 1
            goto L5b
        L6d:
            java.lang.Class r2 = r15.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "java."
            boolean r4 = p000.x02.m6485(r2, r4, r3)
            if (r4 != 0) goto Ld1
            java.lang.String r4 = "kotlin."
            boolean r4 = p000.x02.m6485(r2, r4, r3)
            if (r4 != 0) goto Ld1
            java.lang.String r4 = "android."
            boolean r4 = p000.x02.m6485(r2, r4, r3)
            if (r4 != 0) goto Ld1
            java.lang.String r4 = "androidx."
            boolean r2 = p000.x02.m6485(r2, r4, r3)
            if (r2 == 0) goto L96
            goto Ld1
        L96:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Class r3 = r15.getClass()
            java.util.List r2 = r2.allFields(r3)
            r3 = 80
            java.util.List r2 = p000.AbstractC0984xh.m6662(r2, r3)
            java.util.Iterator r9 = r2.iterator()
        Laa:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r9.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r3 = r2.getModifiers()     // Catch: java.lang.Throwable -> Laa
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> Laa
            if (r3 != 0) goto Laa
            r2.setAccessible(r8)     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r6 = r2.get(r15)     // Catch: java.lang.Throwable -> Laa
            int r7 = r1 + 1
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            findRealCommentObjectsDeep$walk$77(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Laa
            goto Laa
        Ld1:
            return
    }

    private final java.lang.String getBookmarkAuthorName(java.lang.Object r10) {
            r9 = this;
            if (r10 != 0) goto L4
            r9 = 0
            return r9
        L4:
            java.lang.String r0 = r9.getAuthorName(r10)
            if (r0 == 0) goto L11
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L11
            return r0
        L11:
            java.lang.String r0 = "getAuthor"
            java.lang.String r1 = "getSender"
            java.lang.String r2 = "getUser"
            java.lang.String r3 = "getCommentUser"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.lang.String r1 = "author"
            java.lang.String r2 = "sender"
            java.lang.String r3 = "user"
            java.lang.String r4 = "commentUser"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            java.lang.Object r0 = r9.getObjectByCandidateNames(r10, r0, r1)
            if (r0 == 0) goto L61
            java.lang.String r6 = "getUniqueId"
            java.lang.String r7 = "getShortId"
            java.lang.String r1 = "getNickname"
            java.lang.String r2 = "getNickName"
            java.lang.String r3 = "getDisplayName"
            java.lang.String r4 = "getName"
            java.lang.String r5 = "getUserName"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            java.lang.String r7 = "uniqueId"
            java.lang.String r8 = "shortId"
            java.lang.String r2 = "nickname"
            java.lang.String r3 = "nickName"
            java.lang.String r4 = "displayName"
            java.lang.String r5 = "name"
            java.lang.String r6 = "userName"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8}
            java.lang.String r0 = r9.getStringByCandidateNames(r0, r1, r2)
            if (r0 == 0) goto L61
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L60
            goto L61
        L60:
            return r0
        L61:
            java.lang.String r0 = "getUserName"
            java.lang.String r1 = "getAuthorName"
            java.lang.String r2 = "getNickname"
            java.lang.String r3 = "getNickName"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.lang.String r1 = "userName"
            java.lang.String r2 = "authorName"
            java.lang.String r3 = "nickname"
            java.lang.String r4 = "nickName"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            java.lang.String r9 = r9.getStringByCandidateNames(r10, r0, r1)
            return r9
    }

    private final java.lang.String getBookmarkContent(java.lang.Object r9) {
            r8 = this;
            if (r9 != 0) goto L4
            r8 = 0
            return r8
        L4:
            java.lang.String r0 = r8.getContent(r9)
            if (r0 == 0) goto L11
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L11
            return r0
        L11:
            java.lang.String r6 = "getCommentText"
            java.lang.String r7 = "getDisplayText"
            java.lang.String r2 = "getContent"
            java.lang.String r3 = "getText"
            java.lang.String r4 = "getMsg"
            java.lang.String r5 = "getMessage"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            java.lang.String r5 = "commentText"
            java.lang.String r6 = "displayText"
            java.lang.String r1 = "content"
            java.lang.String r2 = "text"
            java.lang.String r3 = "msg"
            java.lang.String r4 = "message"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            java.lang.String r8 = r8.getStringByCandidateNames(r9, r0, r1)
            return r8
    }

    private final java.lang.String getBookmarkId(java.lang.Object r10) {
            r9 = this;
            if (r10 != 0) goto L4
            r9 = 0
            return r9
        L4:
            java.lang.String r0 = r9.getCommentId(r10)
            if (r0 == 0) goto L11
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L11
            return r0
        L11:
            java.lang.String r7 = "getCommentMsgId"
            java.lang.String r8 = "getItemId"
            java.lang.String r2 = "getCid"
            java.lang.String r3 = "getCommentId"
            java.lang.String r4 = "getId"
            java.lang.String r5 = "getMsgId"
            java.lang.String r6 = "getMessageId"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8}
            java.lang.String r6 = "commentMsgId"
            java.lang.String r7 = "itemId"
            java.lang.String r1 = "cid"
            java.lang.String r2 = "commentId"
            java.lang.String r3 = "id"
            java.lang.String r4 = "msgId"
            java.lang.String r5 = "messageId"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            java.lang.String r9 = r9.getStringByCandidateNames(r10, r0, r1)
            return r9
    }

    private final java.lang.Object getFieldValue(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Field r2 = r2.findField(r1, r4)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto Lc
            return r0
        Lc:
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L1c:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L21
            goto L22
        L21:
            r0 = r2
        L22:
            return r0
    }

    private final java.lang.Object getFieldValueForBookmark(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Field r2 = r2.findFieldForBookmark(r1, r4)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto Lc
            return r0
        Lc:
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L1c:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L21
            goto L22
        L21:
            r0 = r2
        L22:
            return r0
    }

    private final java.lang.Integer getIntByCandidateNames(java.lang.Object r5, java.lang.String[] r6, java.lang.String[] r7) {
            r4 = this;
            int r4 = r6.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r4) goto L1f
            r2 = r6[r1]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r2 = r3.invokeNoArgForBookmark(r5, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L1c
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L1c:
            int r1 = r1 + 1
            goto L3
        L1f:
            int r4 = r7.length
        L20:
            if (r0 >= r4) goto L3c
            r6 = r7[r0]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r6 = r1.getFieldValueForBookmark(r5, r6)
            boolean r1 = r6 instanceof java.lang.Number
            if (r1 == 0) goto L39
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L39:
            int r0 = r0 + 1
            goto L20
        L3c:
            r4 = 0
            return r4
    }

    private final java.lang.Integer getIntByNames(java.lang.Object r5, java.lang.String[] r6, java.lang.String[] r7) {
            r4 = this;
            int r4 = r6.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r4) goto L1f
            r2 = r6[r1]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r2 = r3.invokeNoArg(r5, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L1c
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L1c:
            int r1 = r1 + 1
            goto L3
        L1f:
            int r4 = r7.length
        L20:
            if (r0 >= r4) goto L3c
            r6 = r7[r0]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r6 = r1.getFieldValue(r5, r6)
            boolean r1 = r6 instanceof java.lang.Number
            if (r1 == 0) goto L39
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L39:
            int r0 = r0 + 1
            goto L20
        L3c:
            r4 = 0
            return r4
    }

    private final java.lang.Long getLongByCandidateNames(java.lang.Object r5, java.lang.String[] r6, java.lang.String[] r7) {
            r4 = this;
            int r4 = r6.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r4) goto L1f
            r2 = r6[r1]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r2 = r3.invokeNoArgForBookmark(r5, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L1c
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L1c:
            int r1 = r1 + 1
            goto L3
        L1f:
            int r4 = r7.length
        L20:
            if (r0 >= r4) goto L3c
            r6 = r7[r0]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r6 = r1.getFieldValueForBookmark(r5, r6)
            boolean r1 = r6 instanceof java.lang.Number
            if (r1 == 0) goto L39
            java.lang.Number r6 = (java.lang.Number) r6
            long r4 = r6.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L39:
            int r0 = r0 + 1
            goto L20
        L3c:
            r4 = 0
            return r4
    }

    private final java.lang.Long getLongByNames(java.lang.Object r5, java.lang.String[] r6, java.lang.String[] r7) {
            r4 = this;
            int r4 = r6.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r4) goto L1f
            r2 = r6[r1]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r2 = r3.invokeNoArg(r5, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L1c
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L1c:
            int r1 = r1 + 1
            goto L3
        L1f:
            int r4 = r7.length
        L20:
            if (r0 >= r4) goto L3c
            r6 = r7[r0]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r6 = r1.getFieldValue(r5, r6)
            boolean r1 = r6 instanceof java.lang.Number
            if (r1 == 0) goto L39
            java.lang.Number r6 = (java.lang.Number) r6
            long r4 = r6.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L39:
            int r0 = r0 + 1
            goto L20
        L3c:
            r4 = 0
            return r4
    }

    private final java.lang.Object getObjectByCandidateNames(java.lang.Object r5, java.lang.String[] r6, java.lang.String[] r7) {
            r4 = this;
            int r4 = r6.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r4) goto L13
            r2 = r6[r1]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r2 = r3.invokeNoArgForBookmark(r5, r2)
            if (r2 == 0) goto L10
            return r2
        L10:
            int r1 = r1 + 1
            goto L3
        L13:
            int r4 = r7.length
        L14:
            if (r0 >= r4) goto L24
            r6 = r7[r0]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r6 = r1.getFieldValueForBookmark(r5, r6)
            if (r6 == 0) goto L21
            return r6
        L21:
            int r0 = r0 + 1
            goto L14
        L24:
            r4 = 0
            return r4
    }

    private final java.lang.Object getObjectByNames(java.lang.Object r5, java.lang.String[] r6, java.lang.String[] r7) {
            r4 = this;
            int r4 = r6.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r4) goto L13
            r2 = r6[r1]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r2 = r3.invokeNoArg(r5, r2)
            if (r2 == 0) goto L10
            return r2
        L10:
            int r1 = r1 + 1
            goto L3
        L13:
            int r4 = r7.length
        L14:
            if (r0 >= r4) goto L24
            r6 = r7[r0]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r6 = r1.getFieldValue(r5, r6)
            if (r6 == 0) goto L21
            return r6
        L21:
            int r0 = r0 + 1
            goto L14
        L24:
            r4 = 0
            return r4
    }

    private final java.lang.String getStringByCandidateNames(java.lang.Object r5, java.lang.String[] r6, java.lang.String[] r7) {
            r4 = this;
            int r4 = r6.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r4) goto L1d
            r2 = r6[r1]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r2 = r3.invokeNoArgForBookmark(r5, r2)
            if (r2 == 0) goto L1a
            java.lang.String r2 = r2.toString()
            boolean r3 = p000.q02.m4671(r2)
            if (r3 != 0) goto L1a
            return r2
        L1a:
            int r1 = r1 + 1
            goto L3
        L1d:
            int r4 = r7.length
        L1e:
            if (r0 >= r4) goto L38
            r6 = r7[r0]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r6 = r1.getFieldValueForBookmark(r5, r6)
            if (r6 == 0) goto L35
            java.lang.String r6 = r6.toString()
            boolean r1 = p000.q02.m4671(r6)
            if (r1 != 0) goto L35
            return r6
        L35:
            int r0 = r0 + 1
            goto L1e
        L38:
            r4 = 0
            return r4
    }

    private final java.lang.String getStringByCandidateNamesForAweme(java.lang.Object r8, java.lang.String[] r9, java.lang.String[] r10) {
            r7 = this;
            int r7 = r9.length
            r0 = 0
            r1 = r0
        L3:
            r2 = 0
            r3 = 1
            if (r1 >= r7) goto L30
            r4 = r9[r1]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Class r6 = r8.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Method r4 = r5.findMethod(r6, r4)     // Catch: java.lang.Throwable -> L2d
            if (r4 != 0) goto L16
            goto L2d
        L16:
            r4.setAccessible(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.invoke(r8, r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L23
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2d
        L23:
            if (r2 == 0) goto L2d
            boolean r3 = p000.q02.m4671(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2c
            goto L2d
        L2c:
            return r2
        L2d:
            int r1 = r1 + 1
            goto L3
        L30:
            int r7 = r10.length
        L31:
            if (r0 >= r7) goto L5e
            r9 = r10[r0]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Class r4 = r8.getClass()     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Field r9 = r1.findField(r4, r9)     // Catch: java.lang.Throwable -> L5b
            if (r9 != 0) goto L42
            goto L5b
        L42:
            r9.setAccessible(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r9 = r9.get(r8)     // Catch: java.lang.Throwable -> L5b
            if (r9 == 0) goto L50
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L5b
            goto L51
        L50:
            r9 = r2
        L51:
            if (r9 == 0) goto L5b
            boolean r1 = p000.q02.m4671(r9)     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5a
            goto L5b
        L5a:
            return r9
        L5b:
            int r0 = r0 + 1
            goto L31
        L5e:
            return r2
    }

    private final java.lang.String getStringByNames(java.lang.Object r5, java.lang.String[] r6, java.lang.String[] r7) {
            r4 = this;
            int r4 = r6.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r4) goto L1d
            r2 = r6[r1]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r2 = r3.invokeNoArg(r5, r2)
            if (r2 == 0) goto L1a
            java.lang.String r2 = r2.toString()
            boolean r3 = p000.q02.m4671(r2)
            if (r3 != 0) goto L1a
            return r2
        L1a:
            int r1 = r1 + 1
            goto L3
        L1d:
            int r4 = r7.length
        L1e:
            if (r0 >= r4) goto L38
            r6 = r7[r0]
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.Object r6 = r1.getFieldValue(r5, r6)
            if (r6 == 0) goto L35
            java.lang.String r6 = r6.toString()
            boolean r1 = p000.q02.m4671(r6)
            if (r1 != 0) goto L35
            return r6
        L35:
            int r0 = r0 + 1
            goto L1e
        L38:
            r4 = 0
            return r4
    }

    private final java.lang.Object invokeNoArg(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Method r2 = r2.findMethod(r1, r4)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto Lc
            return r0
        Lc:
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.invoke(r3, r0)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L1c:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L21
            goto L22
        L21:
            r0 = r2
        L22:
            return r0
    }

    private final java.lang.Object invokeNoArgForBookmark(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Method r2 = r2.findNoArgMethodForBookmark(r1, r4)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto Lc
            return r0
        Lc:
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.invoke(r3, r0)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L1c:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L21
            goto L22
        L21:
            r0 = r2
        L22:
            return r0
    }

    private final boolean looksLikeCommentObject(java.lang.Object r7) {
            r6 = this;
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "commentitemlist"
            r2 = 0
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            if (r1 != 0) goto L73
            java.lang.String r1 = "commentlist"
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            if (r1 != 0) goto L73
            java.lang.String r1 = "response"
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            if (r1 != 0) goto L73
            java.lang.String r1 = "result"
            boolean r0 = p000.q02.m4654(r0, r1, r2)
            if (r0 == 0) goto L33
            goto L73
        L33:
            java.lang.String r0 = "getId"
            java.lang.String r1 = "getReplyId"
            java.lang.String r3 = "getCid"
            java.lang.String r4 = "getCommentId"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r0, r1}
            java.lang.String r1 = "id"
            java.lang.String r3 = "replyId"
            java.lang.String r4 = "cid"
            java.lang.String r5 = "commentId"
            java.lang.String[] r1 = new java.lang.String[]{r4, r5, r1, r3}
            java.lang.String r0 = r6.getStringByNames(r7, r0, r1)
            r1 = 1
            if (r0 == 0) goto L54
            r0 = r1
            goto L55
        L54:
            r0 = r2
        L55:
            java.lang.String r3 = "getContent"
            java.lang.String r4 = "getText"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.String r4 = "content"
            java.lang.String r5 = "text"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r6 = r6.getStringByNames(r7, r3, r4)
            if (r6 == 0) goto L6d
            r6 = r1
            goto L6e
        L6d:
            r6 = r2
        L6e:
            if (r0 == 0) goto L73
            if (r6 == 0) goto L73
            return r1
        L73:
            return r2
    }

    public final int extractReplyCountFromResult(java.lang.Object r2) {
            r1 = this;
            r1 = -1
            if (r2 != 0) goto L4
            return r1
        L4:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto Lf
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            return r1
        Lf:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L1a
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            return r1
        L1a:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L24
            java.util.Collection r2 = (java.util.Collection) r2
            int r1 = r2.size()
        L24:
            return r1
    }

    public final java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> extractReplyItems(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L5
            jz r3 = p000.C0450jz.f5672
            return r3
        L5:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1 = 0
            extractReplyItems$walk(r0, r3, r4, r1)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L21:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r3.next()
            r2 = r1
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r2 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r2
            java.lang.String r2 = r2.getReplyId()
            boolean r2 = r4.add(r2)
            if (r2 == 0) goto L21
            r0.add(r1)
            goto L21
        L3c:
            return r0
    }

    public final java.lang.Object findAwemeObject(java.lang.Object... r5) {
            r4 = this;
            r5.getClass()
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap
            r4.<init>()
            int r0 = r5.length
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r0) goto L19
            r3 = r5[r2]
            java.lang.Object r3 = findAwemeObject$dfs$12(r4, r3, r1)
            if (r3 == 0) goto L16
            return r3
        L16:
            int r2 = r2 + 1
            goto Lb
        L19:
            r4 = 0
            return r4
    }

    public final java.lang.Object findBookmarkSourceObject(java.lang.Object... r5) {
            r4 = this;
            r5.getClass()
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap
            r4.<init>()
            int r0 = r5.length
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r0) goto L19
            r3 = r5[r2]
            java.lang.Object r3 = findBookmarkSourceObject$dfs$23(r4, r3, r1)
            if (r3 == 0) goto L16
            return r3
        L16:
            int r2 = r2 + 1
            goto Lb
        L19:
            r4 = 0
            return r4
    }

    public final java.lang.Object findCommentObject(java.lang.Object... r5) {
            r4 = this;
            r5.getClass()
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap
            r4.<init>()
            int r0 = r5.length
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r0) goto L19
            r3 = r5[r2]
            java.lang.Object r3 = findCommentObject$dfs(r4, r3, r1)
            if (r3 == 0) goto L16
            return r3
        L16:
            int r2 = r2 + 1
            goto Lb
        L19:
            r4 = 0
            return r4
    }

    public final java.lang.Object findCommentObjectById(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L16
            if (r3 == 0) goto L16
            boolean r1 = p000.q02.m4671(r3)
            if (r1 == 0) goto Lb
            goto L16
        Lb:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            r0 = 0
            java.lang.Object r1 = findCommentObjectById$dfs$32(r1, r3, r2, r0)
            return r1
        L16:
            r1 = 0
            return r1
    }

    public final java.util.List<java.lang.Object> findCommentObjects(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L5
            jz r2 = p000.C0450jz.f5672
            return r2
        L5:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1 = 0
            findCommentObjects$walk$72(r0, r2, r3, r1)
            return r2
    }

    public final java.util.List<java.lang.Object> findRealCommentObjectsDeep(java.lang.ClassLoader r9, java.lang.Object r10, int r11) {
            r8 = this;
            r9.getClass()
            jz r8 = p000.C0450jz.f5672
            if (r10 != 0) goto L8
            return r8
        L8:
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943129306BB91C862D3C2CDFB95A02E64AF3D92229B8488"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r3 = p000.qe0.m4877(r9, r0)
            r9 = 4
            java.lang.String r0 = "ra71aa3b096f9ff6b"
            r7 = 0
            if (r3 != 0) goto L20
            java.lang.String r10 = "Comment class not found"
            p000.C0888ux.m5988(r0, r10, r7, r9, r7)
            return r8
        L20:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.IdentityHashMap r8 = new java.util.IdentityHashMap
            r8.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r8)
            r6 = 0
            r5 = r10
            r1 = r11
            findRealCommentObjectsDeep$walk$77(r1, r2, r3, r4, r5, r6)
            int r8 = r4.size()
            java.lang.String r10 = "findRealCommentObjectsDeep found "
            java.lang.String r11 = " real Comment objects"
            java.lang.String r8 = p000.AbstractC0602nx.m4127(r10, r8, r11)
            p000.C0888ux.m5988(r0, r8, r7, r9, r7)
            return r4
    }

    public final java.lang.String getAuthorName(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "getCommentUser"
            java.lang.String r2 = "getAuthor"
            java.lang.String r3 = "getUser"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.lang.String r2 = "commentUser"
            java.lang.String r3 = "author"
            java.lang.String r4 = "user"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            java.lang.Object r6 = r5.getObjectByNames(r6, r1, r2)
            if (r6 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r0 = "getUniqueId"
            java.lang.String r1 = "getShortId"
            java.lang.String r2 = "getNickname"
            java.lang.String r3 = "getNickName"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.lang.String r1 = "uniqueId"
            java.lang.String r2 = "shortId"
            java.lang.String r3 = "nickname"
            java.lang.String r4 = "nickName"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            java.lang.String r5 = r5.getStringByNames(r6, r0, r1)
            return r5
    }

    public final java.lang.String getAwemeId(java.lang.Object r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.String r0 = "getAwemeId"
            java.lang.String r1 = "getAid"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r1 = "aid"
            java.lang.String r2 = "groupId"
            java.lang.String r3 = "awemeId"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.lang.String r4 = r4.getStringByNames(r5, r0, r1)
            return r4
    }

    public final java.lang.String getCommentId(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof android.view.View
            if (r1 == 0) goto L9
            return r0
        L9:
            boolean r1 = r5 instanceof java.lang.CharSequence
            if (r1 == 0) goto Le
            return r0
        Le:
            boolean r1 = r5 instanceof java.lang.Number
            if (r1 == 0) goto L13
            return r0
        L13:
            boolean r1 = r5 instanceof java.lang.Boolean
            if (r1 == 0) goto L18
            return r0
        L18:
            java.lang.String r0 = "getCommentId"
            java.lang.String r1 = "getId"
            java.lang.String r2 = "getCid"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.lang.String r1 = "commentId"
            java.lang.String r2 = "id"
            java.lang.String r3 = "cid"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.lang.String r4 = r4.getStringByNames(r5, r0, r1)
            return r4
    }

    public final java.lang.String getCommentSecUid(java.lang.Object r8) {
            r7 = this;
            if (r8 != 0) goto L4
            r7 = 0
            return r7
        L4:
            java.lang.String r0 = "getCommentUser"
            java.lang.String r1 = "getAuthor"
            java.lang.String r2 = "getUser"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.lang.String r1 = "commentUser"
            java.lang.String r2 = "author"
            java.lang.String r3 = "user"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.lang.Object r0 = r7.getObjectByNames(r8, r0, r1)
            java.lang.String r1 = "sec_uid"
            java.lang.String r2 = "secUid"
            java.lang.String r3 = "getSecUid"
            if (r0 == 0) goto L3f
            java.lang.String r4 = "getSecAuthorUid"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4}
            java.lang.String r5 = "secAuthorUid"
            java.lang.String r6 = "sec_author_uid"
            java.lang.String[] r5 = new java.lang.String[]{r2, r1, r5, r6}
            java.lang.String r0 = r7.getStringByNames(r0, r4, r5)
            if (r0 == 0) goto L3f
            boolean r4 = p000.q02.m4671(r0)
            if (r4 != 0) goto L3f
            return r0
        L3f:
            java.lang.String r0 = "getCommentSecUid"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0}
            java.lang.String r3 = "commentSecUid"
            java.lang.String r4 = "comment_secuid"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1, r3, r4}
            java.lang.String r7 = r7.getStringByNames(r8, r0, r1)
            return r7
    }

    public final java.lang.String getContent(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = "getContent"
            java.lang.String r1 = "getText"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r1 = "content"
            java.lang.String r2 = "text"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r3 = r3.getStringByNames(r4, r0, r1)
            return r3
    }

    public final long getCreateTime(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L5
            return r0
        L5:
            java.lang.String r2 = "getCreateTime"
            java.lang.String r3 = "getCreateTimeStamp"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String r3 = "createTimestamp"
            java.lang.String r4 = "createTimeStamp"
            java.lang.String r5 = "createTime"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            java.lang.Long r6 = r6.getLongByNames(r7, r2, r3)
            if (r6 == 0) goto L22
            long r6 = r6.longValue()
            return r6
        L22:
            return r0
    }

    public final int getReplyCount(java.lang.Object r9) {
            r8 = this;
            r0 = -1
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "getCommentReplyCount"
            java.lang.String r2 = "getChildCommentCount"
            java.lang.String r3 = "getReplyCount"
            java.lang.String r4 = "getReplyCommentTotal"
            java.lang.String r5 = "getReplyCommentCount"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r1, r2}
            java.lang.String r6 = "childCommentCount"
            java.lang.String r7 = "replyCommentCnt"
            java.lang.String r2 = "replyCount"
            java.lang.String r3 = "replyCommentTotal"
            java.lang.String r4 = "replyCommentCount"
            java.lang.String r5 = "commentReplyCount"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            java.lang.Integer r8 = r8.getIntByNames(r9, r1, r2)
            if (r8 == 0) goto L2d
            int r8 = r8.intValue()
            return r8
        L2d:
            return r0
    }

    public final boolean isCommentLike(java.lang.Object r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L5
            goto La8
        L5:
            boolean r1 = r8 instanceof android.view.View
            if (r1 == 0) goto La
            return r0
        La:
            boolean r1 = r8 instanceof java.lang.CharSequence
            if (r1 == 0) goto Lf
            return r0
        Lf:
            boolean r1 = r8 instanceof java.lang.Number
            if (r1 == 0) goto L14
            return r0
        L14:
            boolean r1 = r8 instanceof java.lang.Boolean
            if (r1 == 0) goto L19
            return r0
        L19:
            java.lang.Class r1 = r8.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "CommentItemList"
            boolean r2 = p000.x02.m6479(r1, r2, r0)
            if (r2 != 0) goto La8
            java.lang.String r2 = "CommentList"
            r3 = 1
            boolean r2 = p000.q02.m4654(r1, r2, r3)
            if (r2 != 0) goto La8
            java.lang.String r2 = "Response"
            boolean r2 = p000.q02.m4654(r1, r2, r3)
            if (r2 != 0) goto La8
            java.lang.String r2 = "Result"
            boolean r2 = p000.q02.m4654(r1, r2, r3)
            if (r2 == 0) goto L43
            goto La8
        L43:
            java.lang.String r2 = "getCommentId"
            java.lang.String r4 = "getId"
            java.lang.String r5 = "getCid"
            java.lang.String[] r2 = new java.lang.String[]{r5, r2, r4}
            java.lang.String r4 = "commentId"
            java.lang.String r5 = "id"
            java.lang.String r6 = "cid"
            java.lang.String[] r4 = new java.lang.String[]{r6, r4, r5}
            java.lang.String r2 = r7.getStringByNames(r8, r2, r4)
            if (r2 == 0) goto La8
            boolean r2 = p000.q02.m4671(r2)
            if (r2 == 0) goto L64
            goto La8
        L64:
            java.lang.String r2 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943129306BB91C862D3C2CDFB95A02E64AF3D92229B8488"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L71
            goto La7
        L71:
            java.lang.String r1 = "getContent"
            java.lang.String r2 = "getText"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r2 = "content"
            java.lang.String r4 = "text"
            java.lang.String[] r2 = new java.lang.String[]{r2, r4}
            java.lang.String r1 = r7.getStringByNames(r8, r1, r2)
            java.lang.String r2 = "getCommentUser"
            java.lang.String r4 = "getAuthor"
            java.lang.String r5 = "getUser"
            java.lang.String[] r2 = new java.lang.String[]{r5, r2, r4}
            java.lang.String r4 = "commentUser"
            java.lang.String r5 = "author"
            java.lang.String r6 = "user"
            java.lang.String[] r4 = new java.lang.String[]{r6, r4, r5}
            java.lang.Object r2 = r7.getObjectByNames(r8, r2, r4)
            int r7 = r7.getReplyCount(r8)
            if (r1 != 0) goto La7
            if (r2 != 0) goto La7
            if (r7 < 0) goto La8
        La7:
            return r3
        La8:
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem toNewReplyItem(java.lang.Object r7) {
            r6 = this;
            r7.getClass()
            java.lang.String r1 = r6.getCommentId(r7)
            if (r1 != 0) goto Lb
            r6 = 0
            return r6
        Lb:
            java.lang.String r0 = r6.getContent(r7)
            java.lang.String r2 = ""
            if (r0 != 0) goto L15
            r3 = r2
            goto L16
        L15:
            r3 = r0
        L16:
            long r4 = r6.getCreateTime(r7)
            java.lang.String r6 = r6.getAuthorName(r7)
            if (r6 != 0) goto L21
            goto L22
        L21:
            r2 = r6
        L22:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord toRecord(java.lang.Object r28) {
            r27 = this;
            r28.getClass()
            java.lang.String r1 = r27.getCommentId(r28)
            if (r1 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            java.lang.String r0 = r27.getAwemeId(r28)
            java.lang.String r2 = ""
            if (r0 != 0) goto L14
            r0 = r2
        L14:
            java.lang.String r3 = r27.getContent(r28)
            if (r3 != 0) goto L1b
            r3 = r2
        L1b:
            java.lang.String r4 = r27.getAuthorName(r28)
            if (r4 != 0) goto L22
            r4 = r2
        L22:
            long r5 = r27.getCreateTime(r28)
            int r2 = r27.getReplyCount(r28)
            if (r2 >= 0) goto L2d
            r2 = 0
        L2d:
            r14 = r2
            long r12 = java.lang.System.currentTimeMillis()
            r2 = r0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord
            r25 = 2095584(0x1ff9e0, float:2.936539E-39)
            r26 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord toRecordFromAny(java.lang.Object r33) {
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            java.lang.String r3 = r32.getBookmarkId(r33)
            if (r3 == 0) goto Lcc
            boolean r4 = p000.q02.m4671(r3)
            if (r4 != 0) goto L16
            r6 = r3
            goto L17
        L16:
            r6 = r2
        L17:
            if (r6 != 0) goto L1b
            goto Lcc
        L1b:
            java.lang.String r2 = r32.getBookmarkContent(r33)
            java.lang.String r3 = ""
            if (r2 != 0) goto L25
            r8 = r3
            goto L26
        L25:
            r8 = r2
        L26:
            java.lang.String r2 = r32.getBookmarkAuthorName(r33)
            if (r2 != 0) goto L2e
            r9 = r3
            goto L2f
        L2e:
            r9 = r2
        L2f:
            java.lang.String r2 = "getRoomId"
            java.lang.String r4 = "getRoomID"
            java.lang.String r5 = "getAwemeId"
            java.lang.String r7 = "getAid"
            java.lang.String r10 = "getGroupId"
            java.lang.String[] r2 = new java.lang.String[]{r5, r7, r10, r2, r4}
            java.lang.String r4 = "roomId"
            java.lang.String r5 = "roomID"
            java.lang.String r7 = "awemeId"
            java.lang.String r10 = "aid"
            java.lang.String r11 = "groupId"
            java.lang.String[] r4 = new java.lang.String[]{r7, r10, r11, r4, r5}
            java.lang.String r2 = r0.getStringByCandidateNames(r1, r2, r4)
            if (r2 != 0) goto L53
            r7 = r3
            goto L54
        L53:
            r7 = r2
        L54:
            java.lang.String r2 = "getTimestamp"
            java.lang.String r3 = "getCreateTimestamp"
            java.lang.String r4 = "getCreateTime"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            java.lang.String r3 = "timestamp"
            java.lang.String r4 = "createTimestamp"
            java.lang.String r5 = "createTime"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            java.lang.Long r2 = r0.getLongByCandidateNames(r1, r2, r3)
            if (r2 == 0) goto L74
            long r2 = r2.longValue()
        L72:
            r10 = r2
            goto L77
        L74:
            r2 = 0
            goto L72
        L77:
            java.lang.String r2 = "getReplyCommentCount"
            java.lang.String r3 = "getChildCommentCount"
            java.lang.String r4 = "getReplyCount"
            java.lang.String r5 = "getReplyCommentTotal"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r2, r3}
            java.lang.String r3 = "replyCommentCount"
            java.lang.String r4 = "childCommentCount"
            java.lang.String r5 = "replyCount"
            java.lang.String r12 = "replyCommentTotal"
            java.lang.String[] r3 = new java.lang.String[]{r5, r12, r3, r4}
            java.lang.Integer r0 = r0.getIntByCandidateNames(r1, r2, r3)
            r1 = 0
            if (r0 == 0) goto L9b
            int r0 = r0.intValue()
            goto L9c
        L9b:
            r0 = r1
        L9c:
            if (r0 >= 0) goto La1
            r19 = r1
            goto La3
        La1:
            r19 = r0
        La3:
            long r17 = java.lang.System.currentTimeMillis()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r5 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord
            r30 = 2095584(0x1ff9e0, float:2.936539E-39)
            r31 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r5.<init>(r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r5
        Lcc:
            return r2
    }
}
