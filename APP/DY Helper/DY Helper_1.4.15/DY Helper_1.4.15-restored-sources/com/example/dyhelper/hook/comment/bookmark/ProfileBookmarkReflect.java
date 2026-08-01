package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileBookmarkReflect {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect INSTANCE = null;
    private static final java.lang.String TAG = "r9d0527b9ba13b0db";
    private static final java.util.Set<java.lang.String> primitiveNames = null;

    static {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE = r0
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
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.primitiveNames = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.$stable = r0
            return
    }

    private ProfileBookmarkReflect() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.List<java.lang.reflect.Field> allFields(java.lang.Class<?> r2) {
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

    private final java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> extractAwemeItemsFromKnownContainer(java.lang.Object r8) {
            r7 = this;
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            jz r7 = p000.C0450jz.f5672
            return r7
        L17:
            java.lang.String r0 = "getItemsNotNull"
            java.lang.Object r0 = r7.invokeNoArg(r8, r0)
            java.lang.String r1 = "getItems"
            java.lang.Object r1 = r7.invokeNoArg(r8, r1)
            java.lang.String r2 = "items"
            java.lang.Object r2 = r7.getFieldValue(r8, r2)
            java.lang.String r3 = "preloadAwemes"
            java.lang.Object r3 = r7.getFieldValue(r8, r3)
            java.lang.String r4 = "preloadAds"
            java.lang.Object r7 = r7.getFieldValue(r8, r4)
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r1, r2, r3, r7}
            java.util.ArrayList r7 = p000.AbstractC0312g7.m2248(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r7.iterator()
        L46:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof java.lang.Iterable
            if (r2 == 0) goto L78
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L5a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            if (r2 == 0) goto L5a
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            boolean r4 = r3.looksLikeAweme(r2)
            if (r4 == 0) goto L5a
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r2 = r3.toAwemeItem(r2)
            if (r2 == 0) goto L5a
            r8.add(r2)
            goto L5a
        L78:
            boolean r2 = r1 instanceof java.lang.Object[]
            if (r2 == 0) goto L46
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r1.length
            r3 = 0
        L80:
            if (r3 >= r2) goto L46
            r4 = r1[r3]
            if (r4 == 0) goto L97
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r5 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            boolean r6 = r5.looksLikeAweme(r4)
            if (r6 == 0) goto L97
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r4 = r5.toAwemeItem(r4)
            if (r4 == 0) goto L97
            r8.add(r4)
        L97:
            int r3 = r3 + 1
            goto L80
        L9a:
            int r7 = r7.size()
            int r0 = r8.size()
            java.lang.String r1 = "FeedItemList direct candidates="
            java.lang.String r2 = ", extracted="
            java.lang.String r7 = p000.AbstractC0602nx.m4125(r7, r0, r1, r2)
            r0 = 4
            java.lang.String r1 = "r9d0527b9ba13b0db"
            r2 = 0
            p000.C0888ux.m5988(r1, r7, r2, r0, r2)
            return r8
    }

    private static final void findAwemeItems$walk(java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean> r5, java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r6, java.lang.Object r7, int r8) {
            if (r7 != 0) goto L4
            goto Lde
        L4:
            r0 = 8
            if (r8 <= r0) goto La
            goto Lde
        La:
            boolean r0 = r5.containsKey(r7)
            if (r0 == 0) goto L12
            goto Lde
        L12:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.put(r7, r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            boolean r1 = r0.looksLikeAweme(r7)
            if (r1 == 0) goto L29
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r5 = r0.toAwemeItem(r7)
            if (r5 == 0) goto Lde
            r6.add(r5)
            return
        L29:
            boolean r1 = r7 instanceof java.lang.CharSequence
            if (r1 == 0) goto L2e
            return
        L2e:
            boolean r1 = r7 instanceof java.lang.Number
            if (r1 == 0) goto L33
            return
        L33:
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L38
            return
        L38:
            boolean r1 = r7 instanceof android.view.View
            if (r1 == 0) goto L3d
            return
        L3d:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "java."
            r3 = 0
            boolean r2 = p000.x02.m6485(r1, r2, r3)
            if (r2 != 0) goto Lde
            java.lang.String r2 = "kotlin."
            boolean r2 = p000.x02.m6485(r1, r2, r3)
            if (r2 != 0) goto Lde
            java.lang.String r2 = "android."
            boolean r2 = p000.x02.m6485(r1, r2, r3)
            if (r2 != 0) goto Lde
            java.lang.String r2 = "androidx."
            boolean r1 = p000.x02.m6485(r1, r2, r3)
            if (r1 == 0) goto L68
            goto Lde
        L68:
            boolean r1 = r7 instanceof java.lang.Iterable
            r2 = 200(0xc8, float:2.8E-43)
            r4 = 1
            if (r1 == 0) goto L89
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = p000.AbstractC0984xh.m6662(r7, r2)
            java.util.Iterator r7 = r7.iterator()
        L79:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lde
            java.lang.Object r0 = r7.next()
            int r1 = r8 + 1
            findAwemeItems$walk(r5, r6, r0, r1)
            goto L79
        L89:
            java.lang.Class r1 = r7.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto La9
            int r0 = java.lang.reflect.Array.getLength(r7)
            if (r0 <= r2) goto L9a
            goto L9b
        L9a:
            r2 = r0
        L9b:
            if (r3 >= r2) goto Lde
            java.lang.Object r0 = java.lang.reflect.Array.get(r7, r3)
            int r1 = r8 + 1
            findAwemeItems$walk(r5, r6, r0, r1)
            int r3 = r3 + 1
            goto L9b
        La9:
            java.lang.Class r1 = r7.getClass()
            java.util.List r0 = r0.allFields(r1)
            r1 = 120(0x78, float:1.68E-43)
            java.util.List r0 = p000.AbstractC0984xh.m6662(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        Lbb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lde
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> Lbb
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> Lbb
            if (r2 != 0) goto Lbb
            r1.setAccessible(r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> Lbb
            int r2 = r8 + 1
            findAwemeItems$walk(r5, r6, r1, r2)     // Catch: java.lang.Throwable -> Lbb
            goto Lbb
        Lde:
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

    private static final java.lang.Object findProfileRecordFromRoots$dfs(java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean> r6, java.lang.Object r7, int r8) {
            r0 = 0
            if (r7 != 0) goto L5
            goto L123
        L5:
            r1 = 7
            if (r8 <= r1) goto La
            goto L123
        La:
            boolean r1 = r6.containsKey(r7)
            if (r1 == 0) goto L12
            goto L123
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.put(r7, r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            boolean r2 = r1.looksLikeUser(r7)
            if (r2 == 0) goto L20
            return r7
        L20:
            boolean r2 = r7 instanceof android.view.View
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L59
            r1 = r7
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r1 = r1.getTag()
            if (r1 == 0) goto L38
            int r2 = r8 + 1
            java.lang.Object r1 = findProfileRecordFromRoots$dfs(r6, r1, r2)
            if (r1 == 0) goto L38
            return r1
        L38:
            boolean r1 = r7 instanceof android.view.ViewGroup
            if (r1 == 0) goto L123
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r1 = r7.getChildCount()
            r2 = 80
            if (r1 <= r2) goto L47
            r1 = r2
        L47:
            if (r3 >= r1) goto L123
            android.view.View r2 = r7.getChildAt(r3)
            int r5 = r8 + 1
            java.lang.Object r2 = findProfileRecordFromRoots$dfs(r6, r2, r5)
            if (r2 == 0) goto L56
            return r2
        L56:
            int r3 = r3 + 1
            goto L47
        L59:
            boolean r2 = r7 instanceof android.content.Intent
            if (r2 == 0) goto L5e
            return r0
        L5e:
            boolean r2 = r7 instanceof java.lang.CharSequence
            if (r2 == 0) goto L63
            return r0
        L63:
            boolean r2 = r7 instanceof java.lang.Number
            if (r2 == 0) goto L68
            return r0
        L68:
            boolean r2 = r7 instanceof java.lang.Boolean
            if (r2 == 0) goto L6d
            return r0
        L6d:
            boolean r2 = r7 instanceof java.lang.Class
            if (r2 == 0) goto L72
            return r0
        L72:
            java.lang.Class r2 = r7.getClass()
            java.lang.String r2 = r2.getName()
            java.util.Set<java.lang.String> r5 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.primitiveNames
            boolean r5 = r5.contains(r2)
            if (r5 != 0) goto L123
            java.lang.String r5 = "java."
            boolean r5 = p000.x02.m6485(r2, r5, r3)
            if (r5 != 0) goto L123
            java.lang.String r5 = "kotlin."
            boolean r5 = p000.x02.m6485(r2, r5, r3)
            if (r5 != 0) goto L123
            java.lang.String r5 = "android."
            boolean r5 = p000.x02.m6485(r2, r5, r3)
            if (r5 != 0) goto L123
            java.lang.String r5 = "androidx."
            boolean r2 = p000.x02.m6485(r2, r5, r3)
            if (r2 == 0) goto La4
            goto L123
        La4:
            boolean r2 = r7 instanceof java.lang.Iterable
            r5 = 50
            if (r2 == 0) goto Lc7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = p000.AbstractC0984xh.m6662(r7, r5)
            java.util.Iterator r7 = r7.iterator()
        Lb4:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L123
            java.lang.Object r1 = r7.next()
            int r2 = r8 + 1
            java.lang.Object r1 = findProfileRecordFromRoots$dfs(r6, r1, r2)
            if (r1 == 0) goto Lb4
            return r1
        Lc7:
            java.lang.Class r2 = r7.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto Leb
            int r1 = java.lang.reflect.Array.getLength(r7)
            if (r1 <= r5) goto Ld8
            goto Ld9
        Ld8:
            r5 = r1
        Ld9:
            if (r3 >= r5) goto L123
            java.lang.Object r1 = java.lang.reflect.Array.get(r7, r3)
            int r2 = r8 + 1
            java.lang.Object r1 = findProfileRecordFromRoots$dfs(r6, r1, r2)
            if (r1 == 0) goto Le8
            return r1
        Le8:
            int r3 = r3 + 1
            goto Ld9
        Leb:
            java.lang.Class r2 = r7.getClass()
            java.util.List r1 = r1.allFields(r2)
            r2 = 160(0xa0, float:2.24E-43)
            java.util.List r1 = p000.AbstractC0984xh.m6662(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        Lfd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L123
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r3 = r2.getModifiers()     // Catch: java.lang.Throwable -> Lfd
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> Lfd
            if (r3 != 0) goto Lfd
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> Lfd
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> Lfd
            int r3 = r8 + 1
            java.lang.Object r2 = findProfileRecordFromRoots$dfs(r6, r2, r3)     // Catch: java.lang.Throwable -> Lfd
            if (r2 == 0) goto Lfd
            return r2
        L123:
            return r0
    }

    private static final java.lang.CharSequence findProfileRecordFromRoots$lambda$10(java.lang.Object r0) {
            if (r0 == 0) goto Lb
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            return r0
        Lb:
            java.lang.String r0 = "null"
            return r0
    }

    private final java.lang.String firstNonBlank(java.lang.String... r4) {
            r3 = this;
            int r3 = r4.length
            r0 = 0
        L2:
            java.lang.String r1 = ""
            if (r0 >= r3) goto L2a
            r2 = r4[r0]
            if (r2 == 0) goto L13
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 != 0) goto L17
            goto L18
        L17:
            r1 = r2
        L18:
            boolean r2 = p000.q02.m4671(r1)
            if (r2 != 0) goto L27
            java.lang.String r2 = "null"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L27
            return r1
        L27:
            int r0 = r0 + 1
            goto L2
        L2a:
            return r1
    }

    private final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord fromIntent(android.content.Intent r31) {
            r30 = this;
            r1 = r30
            r2 = r31
            r3 = 0
            if (r2 != 0) goto L8
            return r3
        L8:
            java.lang.String r8 = "authorId"
            java.lang.String r9 = "id"
            java.lang.String r4 = "uid"
            java.lang.String r5 = "user_id"
            java.lang.String r6 = "userId"
            java.lang.String r7 = "author_id"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            java.lang.String r0 = "secUid"
            java.lang.String r5 = "sec_author_uid"
            java.lang.String r6 = "sec_uid"
            java.lang.String r7 = "sec_user_id"
            java.lang.String r8 = "secUserId"
            java.lang.String[] r5 = new java.lang.String[]{r6, r7, r8, r0, r5}
            java.lang.String r11 = "short_id"
            java.lang.String r12 = "shortId"
            java.lang.String r6 = "nickname"
            java.lang.String r7 = "nick_name"
            java.lang.String r8 = "nickName"
            java.lang.String r9 = "unique_id"
            java.lang.String r10 = "uniqueId"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}
            android.net.Uri r0 = r2.getData()
            java.lang.String r0 = fromIntent$pathProfileId(r0)
            boolean r7 = p000.q02.m4671(r0)
            java.lang.String r8 = ""
            if (r7 == 0) goto L65
            java.lang.String r0 = "_real_deeplink_"
            java.lang.String r0 = fromIntent$extraValue(r2, r0)     // Catch: java.lang.Throwable -> L57
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = fromIntent$pathProfileId(r0)     // Catch: java.lang.Throwable -> L57
            goto L5e
        L57:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        L5e:
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto L63
            r0 = r8
        L63:
            java.lang.String r0 = (java.lang.String) r0
        L65:
            boolean r7 = p000.q02.m4671(r0)
            if (r7 == 0) goto L88
            java.lang.String r0 = "uri_string"
            java.lang.String r0 = fromIntent$extraValue(r2, r0)     // Catch: java.lang.Throwable -> L7a
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = fromIntent$pathProfileId(r0)     // Catch: java.lang.Throwable -> L7a
            goto L81
        L7a:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        L81:
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto L86
            r0 = r8
        L86:
            java.lang.String r0 = (java.lang.String) r0
        L88:
            java.lang.String r4 = fromIntent$value(r2, r4)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r7 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            boolean r9 = r7.isNumericUid(r0)
            if (r9 == 0) goto L96
            r9 = r0
            goto L97
        L96:
            r9 = r3
        L97:
            java.lang.String[] r4 = new java.lang.String[]{r4, r9}
            java.lang.String r4 = r1.firstNonBlank(r4)
            java.lang.String r5 = fromIntent$value(r2, r5)
            boolean r9 = p000.q02.m4671(r0)
            if (r9 != 0) goto Lb1
            boolean r7 = r7.isNumericUid(r0)
            if (r7 != 0) goto Lb1
            r7 = r0
            goto Lb2
        Lb1:
            r7 = r3
        Lb2:
            java.lang.String[] r5 = new java.lang.String[]{r5, r7}
            java.lang.String r5 = r1.firstNonBlank(r5)
            java.lang.String r6 = fromIntent$value(r2, r6)
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r12 = r1.firstNonBlank(r6)
            boolean r6 = r1.isNumericUid(r4)
            if (r6 == 0) goto Lce
            r6 = r4
            goto Lcf
        Lce:
            r6 = r8
        Lcf:
            boolean r7 = p000.q02.m4671(r6)
            if (r7 == 0) goto Le2
            boolean r7 = p000.q02.m4671(r5)
            if (r7 == 0) goto Le2
            boolean r7 = p000.q02.m4671(r4)
            if (r7 != 0) goto Le2
            goto Le3
        Le2:
            r4 = r5
        Le3:
            boolean r5 = p000.q02.m4671(r6)
            if (r5 == 0) goto Lf2
            boolean r5 = r1.isNumericUid(r4)
            if (r5 == 0) goto Lf2
            r10 = r4
            r11 = r8
            goto Lf4
        Lf2:
            r11 = r4
            r10 = r6
        Lf4:
            java.lang.String r1 = r30.dumpIntent(r31)
            java.lang.String r2 = ", secUid="
            java.lang.String r4 = ", nickname="
            java.lang.String r5 = "fromIntent uid="
            java.lang.StringBuilder r2 = p000.lz1.m3695(r5, r10, r2, r11, r4)
            java.lang.String r4 = ", pathId="
            java.lang.String r5 = ", dump="
            p000.AbstractC0602nx.m4119(r2, r12, r4, r0, r5)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r1 = 4
            java.lang.String r2 = "r9d0527b9ba13b0db"
            p000.C0888ux.m5988(r2, r0, r3, r1, r3)
            boolean r0 = p000.q02.m4671(r10)
            if (r0 == 0) goto L123
            boolean r0 = p000.q02.m4671(r11)
            if (r0 == 0) goto L123
            return r3
        L123:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r9 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
            r28 = 65528(0xfff8, float:9.1824E-41)
            r29 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r9
    }

    private static final java.lang.String fromIntent$extraValue(android.content.Intent r3, java.lang.String r4) {
            java.lang.String r0 = "null"
            java.lang.String r1 = r3.getStringExtra(r4)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L16
            boolean r2 = p000.q02.m4671(r1)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto Lf
            goto L16
        Lf:
            boolean r2 = p000.ln0.m3626(r1, r0)     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L16
            return r1
        L16:
            android.os.Bundle r3 = r3.getExtras()     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L1d
            goto L34
        L1d:
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L34
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L34
            boolean r4 = p000.q02.m4671(r3)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L34
            boolean r4 = p000.ln0.m3626(r3, r0)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L34
            return r3
        L34:
            java.lang.String r3 = ""
            return r3
    }

    private static final java.lang.String fromIntent$pathProfileId(android.net.Uri r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            java.util.List r3 = r3.getPathSegments()     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto Lc
            goto L24
        Lc:
            java.lang.String r1 = "profile"
            int r1 = r3.indexOf(r1)     // Catch: java.lang.Throwable -> L26
            if (r1 < 0) goto L28
            int r1 = r1 + 1
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L26
            if (r1 >= r2) goto L28
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L37
        L24:
            r3 = r0
            goto L37
        L26:
            r3 = move-exception
            goto L31
        L28:
            java.lang.Object r3 = p000.AbstractC0984xh.m6646(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L37
            goto L24
        L31:
            eo1 r1 = new eo1
            r1.<init>(r3)
            r3 = r1
        L37:
            boolean r1 = r3 instanceof p000.eo1
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r3
        L3d:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private static final java.lang.String fromIntent$uriParam(android.net.Uri r5, java.lang.String[] r6) {
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L33
            r3 = r6[r2]
            java.lang.String r3 = r5.getQueryParameter(r3)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L17:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L1c
            r3 = 0
        L1c:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L30
            boolean r4 = p000.q02.m4671(r3)
            if (r4 == 0) goto L27
            goto L30
        L27:
            java.lang.String r4 = "null"
            boolean r4 = p000.ln0.m3626(r3, r4)
            if (r4 != 0) goto L30
            return r3
        L30:
            int r2 = r2 + 1
            goto L7
        L33:
            return r0
    }

    private static final java.lang.String fromIntent$uriParamFromString(java.lang.String r2, java.lang.String[] r3) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L2c
            boolean r1 = p000.q02.m4671(r2)
            if (r1 == 0) goto Lb
            goto L2c
        Lb:
            java.lang.String r1 = "null"
            boolean r1 = p000.ln0.m3626(r2, r1)
            if (r1 == 0) goto L14
            goto L2c
        L14:
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = fromIntent$uriParam(r2, r3)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L24:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L29
            goto L2a
        L29:
            r0 = r2
        L2a:
            java.lang.String r0 = (java.lang.String) r0
        L2c:
            return r0
    }

    private static final java.lang.String fromIntent$value(android.content.Intent r10, java.lang.String[] r11) {
            int r0 = r11.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L15
            r3 = r11[r2]
            java.lang.String r3 = fromIntent$extraValue(r10, r3)
            boolean r4 = p000.q02.m4671(r3)
            if (r4 != 0) goto L12
            return r3
        L12:
            int r2 = r2 + 1
            goto L3
        L15:
            android.net.Uri r0 = r10.getData()
            java.lang.String r0 = fromIntent$uriParam(r0, r11)
            boolean r2 = p000.q02.m4671(r0)
            r3 = 0
            if (r2 != 0) goto L25
            goto L26
        L25:
            r0 = r3
        L26:
            if (r0 == 0) goto L29
            return r0
        L29:
            java.lang.String r0 = r10.getDataString()
            java.lang.String r0 = fromIntent$uriParamFromString(r0, r11)
            boolean r2 = p000.q02.m4671(r0)
            if (r2 != 0) goto L38
            goto L39
        L38:
            r0 = r3
        L39:
            if (r0 == 0) goto L3c
            return r0
        L3c:
            java.lang.String r8 = "_real_deeplink_"
            java.lang.String r9 = "hp_original_uri"
            java.lang.String r4 = "uri_string"
            java.lang.String r5 = "original_url"
            java.lang.String r6 = "schema"
            java.lang.String r7 = "_origin_deeplink_"
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
        L4c:
            r2 = 6
            if (r1 >= r2) goto L67
            r2 = r0[r1]
            java.lang.String r2 = fromIntent$extraValue(r10, r2)
            java.lang.String r2 = fromIntent$uriParamFromString(r2, r11)
            boolean r4 = p000.q02.m4671(r2)
            if (r4 != 0) goto L60
            goto L61
        L60:
            r2 = r3
        L61:
            if (r2 == 0) goto L64
            return r2
        L64:
            int r1 = r1 + 1
            goto L4c
        L67:
            java.lang.String r10 = ""
            return r10
    }

    private final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord fromKnownProfileContainer(java.lang.Object r28) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = 0
            if (r1 != 0) goto L9
            goto L175
        L9:
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            java.lang.String r4 = "profile"
            r5 = 0
            boolean r3 = p000.q02.m4654(r3, r4, r5)
            if (r3 != 0) goto L25
            goto L175
        L25:
            java.lang.String r11 = "mUser"
            java.lang.String r12 = "curUser"
            java.lang.String r6 = "B"
            java.lang.String r7 = "n"
            java.lang.String r8 = "w"
            java.lang.String r9 = "r"
            java.lang.String r10 = "user"
            java.lang.String[] r3 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}
            r4 = r5
        L38:
            r6 = 7
            if (r4 >= r6) goto L5f
            r6 = r3[r4]
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r7 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            java.lang.Object r6 = r7.getFieldValue(r1, r6)
            if (r6 == 0) goto L5c
            boolean r8 = r7.looksLikeUser(r6)
            if (r8 == 0) goto L5c
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r6 = r7.toProfileRecord(r6)
            if (r6 == 0) goto L5c
            java.lang.String r7 = r6.uniqueKey()
            boolean r7 = p000.q02.m4671(r7)
            if (r7 != 0) goto L5c
            return r6
        L5c:
            int r4 = r4 + 1
            goto L38
        L5f:
            java.lang.String r3 = "y"
            java.lang.Object r3 = r0.getFieldValue(r1, r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L6c
            java.lang.String r3 = (java.lang.String) r3
            goto L6d
        L6c:
            r3 = r2
        L6d:
            java.lang.String r4 = "uid"
            java.lang.Object r4 = r0.getFieldValue(r1, r4)
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L7a
            java.lang.String r4 = (java.lang.String) r4
            goto L7b
        L7a:
            r4 = r2
        L7b:
            java.lang.String r6 = "userId"
            java.lang.Object r6 = r0.getFieldValue(r1, r6)
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L88
            java.lang.String r6 = (java.lang.String) r6
            goto L89
        L88:
            r6 = r2
        L89:
            java.lang.String r7 = "user_id"
            java.lang.Object r7 = r0.getFieldValue(r1, r7)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L96
            java.lang.String r7 = (java.lang.String) r7
            goto L97
        L96:
            r7 = r2
        L97:
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r6, r7}
            java.lang.String r3 = r0.firstNonBlank(r3)
            java.lang.String r4 = "C"
            java.lang.Object r4 = r0.getFieldValue(r1, r4)
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto Lac
            java.lang.String r4 = (java.lang.String) r4
            goto Lad
        Lac:
            r4 = r2
        Lad:
            java.lang.String r6 = "secUid"
            java.lang.Object r6 = r0.getFieldValue(r1, r6)
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto Lba
            java.lang.String r6 = (java.lang.String) r6
            goto Lbb
        Lba:
            r6 = r2
        Lbb:
            java.lang.String r7 = "secUserId"
            java.lang.Object r7 = r0.getFieldValue(r1, r7)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto Lc8
            java.lang.String r7 = (java.lang.String) r7
            goto Lc9
        Lc8:
            r7 = r2
        Lc9:
            java.lang.String r8 = "sec_user_id"
            java.lang.Object r8 = r0.getFieldValue(r1, r8)
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto Ld6
            java.lang.String r8 = (java.lang.String) r8
            goto Ld7
        Ld6:
            r8 = r2
        Ld7:
            java.lang.String[] r4 = new java.lang.String[]{r4, r6, r7, r8}
            java.lang.String r4 = r0.firstNonBlank(r4)
            java.lang.String r6 = "nickname"
            java.lang.Object r6 = r0.getFieldValue(r1, r6)
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto Lec
            java.lang.String r6 = (java.lang.String) r6
            goto Led
        Lec:
            r6 = r2
        Led:
            java.lang.String r7 = "nickName"
            java.lang.Object r7 = r0.getFieldValue(r1, r7)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto Lfa
            java.lang.String r7 = (java.lang.String) r7
            goto Lfb
        Lfa:
            r7 = r2
        Lfb:
            java.lang.String r8 = "uniqueId"
            java.lang.Object r1 = r0.getFieldValue(r1, r8)
            boolean r8 = r1 instanceof java.lang.String
            if (r8 == 0) goto L108
            java.lang.String r1 = (java.lang.String) r1
            goto L109
        L108:
            r1 = r2
        L109:
            java.lang.String[] r1 = new java.lang.String[]{r6, r7, r1}
            java.lang.String r9 = r0.firstNonBlank(r1)
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto L11e
            boolean r0 = p000.q02.m4671(r4)
            if (r0 == 0) goto L11e
            goto L175
        L11e:
            boolean r0 = p000.q02.m4671(r3)
            if (r0 != 0) goto L13a
            r0 = r5
        L125:
            int r1 = r3.length()
            if (r0 >= r1) goto L13a
            char r1 = r3.charAt(r0)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L137
            r3 = r2
            goto L13a
        L137:
            int r0 = r0 + 1
            goto L125
        L13a:
            java.lang.String r0 = ""
            if (r3 != 0) goto L140
            r7 = r0
            goto L141
        L140:
            r7 = r3
        L141:
            boolean r1 = p000.q02.m4671(r4)
            if (r1 != 0) goto L164
        L147:
            int r1 = r4.length()
            if (r5 >= r1) goto L163
            char r1 = r4.charAt(r5)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L160
            int r1 = r4.length()
            r3 = 8
            if (r1 < r3) goto L163
            goto L164
        L160:
            int r5 = r5 + 1
            goto L147
        L163:
            r4 = r2
        L164:
            if (r4 != 0) goto L168
            r8 = r0
            goto L169
        L168:
            r8 = r4
        L169:
            boolean r0 = p000.q02.m4671(r7)
            if (r0 == 0) goto L176
            boolean r0 = p000.q02.m4671(r8)
            if (r0 == 0) goto L176
        L175:
            return r2
        L176:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r6 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
            r25 = 65528(0xfff8, float:9.1824E-41)
            r26 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r6
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

    private final java.lang.Long getLongByNames(java.lang.Object r6, java.lang.String[] r7, java.lang.String[] r8) {
            r5 = this;
            int r5 = r7.length
            r0 = 0
            r1 = r0
        L3:
            r2 = 10
            if (r1 >= r5) goto L36
            r3 = r7[r1]
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r4 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            java.lang.Object r3 = r4.invokeNoArg(r6, r3)
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            long r5 = r3.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            return r5
        L1e:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L33
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Long r2 = p000.x02.m6489(r3, r2)
            if (r2 == 0) goto L33
            long r5 = r2.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            return r5
        L33:
            int r1 = r1 + 1
            goto L3
        L36:
            int r5 = r8.length
        L37:
            if (r0 >= r5) goto L68
            r7 = r8[r0]
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            java.lang.Object r7 = r1.getFieldValue(r6, r7)
            boolean r1 = r7 instanceof java.lang.Number
            if (r1 == 0) goto L50
            java.lang.Number r7 = (java.lang.Number) r7
            long r5 = r7.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            return r5
        L50:
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto L65
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Long r7 = p000.x02.m6489(r7, r2)
            if (r7 == 0) goto L65
            long r5 = r7.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            return r5
        L65:
            int r0 = r0 + 1
            goto L37
        L68:
            r5 = 0
            return r5
    }

    private final java.lang.String getStringByNames(java.lang.Object r6, java.lang.String[] r7, java.lang.String[] r8) {
            r5 = this;
            int r5 = r7.length
            r0 = 0
            r1 = r0
        L3:
            java.lang.String r2 = "null"
            if (r1 >= r5) goto L25
            r3 = r7[r1]
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r4 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            java.lang.Object r3 = r4.invokeNoArg(r6, r3)
            if (r3 == 0) goto L22
            java.lang.String r3 = r3.toString()
            boolean r4 = p000.q02.m4671(r3)
            if (r4 != 0) goto L22
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 != 0) goto L22
            return r3
        L22:
            int r1 = r1 + 1
            goto L3
        L25:
            int r5 = r8.length
        L26:
            if (r0 >= r5) goto L46
            r7 = r8[r0]
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            java.lang.Object r7 = r1.getFieldValue(r6, r7)
            if (r7 == 0) goto L43
            java.lang.String r7 = r7.toString()
            boolean r1 = p000.q02.m4671(r7)
            if (r1 != 0) goto L43
            boolean r1 = p000.ln0.m3626(r7, r2)
            if (r1 != 0) goto L43
            return r7
        L43:
            int r0 = r0 + 1
            goto L26
        L46:
            r5 = 0
            return r5
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

    private final boolean isNumericUid(java.lang.String r3) {
            r2 = this;
            r2 = 0
            if (r3 == 0) goto L20
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto La
            goto L20
        La:
            r0 = r2
        Lb:
            int r1 = r3.length()
            if (r0 >= r1) goto L1f
            char r1 = r3.charAt(r0)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L1c
            goto L20
        L1c:
            int r0 = r0 + 1
            goto Lb
        L1f:
            r2 = 1
        L20:
            return r2
    }

    private final boolean looksLikeAweme(java.lang.Object r6) {
            r5 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L16
            return r1
        L16:
            java.lang.String r0 = "getAwemeId"
            java.lang.String r2 = "getGroupId"
            java.lang.String r3 = "getAid"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0, r2}
            java.lang.String r2 = "awemeId"
            java.lang.String r3 = "groupId"
            java.lang.String r4 = "aid"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            java.lang.String r0 = r5.getStringByNames(r6, r0, r2)
            java.lang.String r2 = "getDesc"
            java.lang.String r3 = "getDescription"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String r3 = "desc"
            java.lang.String r4 = "description"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.String r5 = r5.getStringByNames(r6, r2, r3)
            if (r0 == 0) goto L4e
            boolean r6 = p000.q02.m4671(r0)
            if (r6 == 0) goto L4b
            goto L4e
        L4b:
            if (r5 == 0) goto L4e
            return r1
        L4e:
            r5 = 0
            return r5
    }

    private final boolean looksLikeUser(java.lang.Object r9) {
            r8 = this;
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "getUid"
            java.lang.String r2 = "getUserId"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r2 = "userId"
            java.lang.String r3 = "user_id"
            java.lang.String r4 = "uid"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            java.lang.String r1 = r8.getStringByNames(r9, r1, r2)
            java.lang.String r2 = "getSecUid"
            java.lang.String r3 = "getSecUserId"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String r3 = "sec_user_id"
            java.lang.String r4 = "secUserId"
            java.lang.String r5 = "secUid"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            java.lang.String r2 = r8.getStringByNames(r9, r2, r3)
            java.lang.String r3 = "getUniqueId"
            java.lang.String r4 = "getShortId"
            java.lang.String r5 = "getNickname"
            java.lang.String r6 = "getNickName"
            java.lang.String[] r3 = new java.lang.String[]{r5, r6, r3, r4}
            java.lang.String r4 = "uniqueId"
            java.lang.String r5 = "shortId"
            java.lang.String r6 = "nickname"
            java.lang.String r7 = "nickName"
            java.lang.String[] r4 = new java.lang.String[]{r6, r7, r4, r5}
            java.lang.String r8 = r8.getStringByNames(r9, r3, r4)
            java.lang.String r9 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD991981847A"
            java.lang.String r9 = p000.jf0.m2957(r9)
            boolean r9 = r0.equals(r9)
            r3 = 0
            if (r9 != 0) goto L80
            java.lang.String r9 = ".user"
            boolean r9 = p000.x02.m6479(r0, r9, r3)
            if (r9 != 0) goto L80
            java.lang.String r9 = "profile.model.user"
            boolean r9 = p000.q02.m4654(r0, r9, r3)
            if (r9 == 0) goto L77
            goto L80
        L77:
            if (r8 == 0) goto L93
            boolean r8 = p000.q02.m4671(r8)
            if (r8 == 0) goto L80
            goto L93
        L80:
            if (r1 == 0) goto L88
            boolean r8 = p000.q02.m4671(r1)
            if (r8 == 0) goto L91
        L88:
            if (r2 == 0) goto L93
            boolean r8 = p000.q02.m4671(r2)
            if (r8 == 0) goto L91
            goto L93
        L91:
            r8 = 1
            return r8
        L93:
            return r3
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ java.lang.CharSequence m1459(java.lang.Object r0) {
            java.lang.CharSequence r0 = findProfileRecordFromRoots$lambda$10(r0)
            return r0
    }

    public final java.lang.String dumpIntent(android.content.Intent r6) {
            r5 = this;
            if (r6 != 0) goto L5
            java.lang.String r5 = "intent=null"
            return r5
        L5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r5.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = "action="
            r5.append(r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r6.getAction()     // Catch: java.lang.Throwable -> Laa
            r5.append(r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = ", data="
            r5.append(r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r6.getDataString()     // Catch: java.lang.Throwable -> Laa
            r5.append(r0)     // Catch: java.lang.Throwable -> Laa
            android.os.Bundle r6 = r6.getExtras()     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L9a
            java.lang.String r0 = ", extras={"
            r5.append(r0)     // Catch: java.lang.Throwable -> Laa
            java.util.Set r0 = r6.keySet()     // Catch: java.lang.Throwable -> Laa
            r0.getClass()     // Catch: java.lang.Throwable -> Laa
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> Laa
            r1 = 80
            java.util.List r0 = p000.AbstractC0984xh.m6662(r0, r1)     // Catch: java.lang.Throwable -> Laa
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Laa
        L40:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L94
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r3 = r6.get(r2)     // Catch: java.lang.Throwable -> L51
            goto L58
        L51:
            r3 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> Laa
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Laa
            r3 = r4
        L58:
            boolean r4 = r3 instanceof p000.eo1     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto L5d
            r3 = 0
        L5d:
            if (r3 != 0) goto L62
            java.lang.String r3 = "null"
            goto L83
        L62:
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto L6d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = p000.q02.m4693(r3, r1)     // Catch: java.lang.Throwable -> Laa
            goto L83
        L6d:
            boolean r4 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Laa
            if (r4 != 0) goto L7f
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto L76
            goto L7f
        L76:
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> Laa
            goto L83
        L7f:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Laa
        L83:
            r5.append(r2)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = "="
            r5.append(r2)     // Catch: java.lang.Throwable -> Laa
            r5.append(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = ", "
            r5.append(r2)     // Catch: java.lang.Throwable -> Laa
            goto L40
        L94:
            java.lang.String r6 = "}"
            r5.append(r6)     // Catch: java.lang.Throwable -> Laa
            goto L9f
        L9a:
            java.lang.String r6 = ", extras=null"
            r5.append(r6)     // Catch: java.lang.Throwable -> Laa
        L9f:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Laa
            r6 = 2500(0x9c4, float:3.503E-42)
            java.lang.String r5 = p000.q02.m4693(r5, r6)     // Catch: java.lang.Throwable -> Laa
            goto Lb1
        Laa:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        Lb1:
            java.lang.Throwable r6 = p000.fo1.m2190(r5)
            if (r6 != 0) goto Lb8
            goto Lc2
        Lb8:
            java.lang.String r5 = r6.getMessage()
            java.lang.String r6 = "dumpIntent failed: "
            java.lang.String r5 = p000.lz1.m3687(r6, r5)
        Lc2:
            java.lang.String r5 = (java.lang.String) r5
            return r5
    }

    public final java.lang.String dumpShort(java.lang.Object r6) {
            r5 = this;
            if (r6 != 0) goto L5
            java.lang.String r5 = "null"
            return r5
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r0.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L72
            r0.append(r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = " {"
            r0.append(r1)     // Catch: java.lang.Throwable -> L72
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L72
            java.util.List r5 = r5.allFields(r1)     // Catch: java.lang.Throwable -> L72
            r1 = 40
            java.util.List r5 = p000.AbstractC0984xh.m6662(r5, r1)     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L72
            r1 = 0
        L2d:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L68
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L72
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L72
            r3 = 20
            if (r1 >= r3) goto L2d
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r3 = r2.get(r6)     // Catch: java.lang.Throwable -> L72
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L72
            if (r4 != 0) goto L51
            boolean r4 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L72
            if (r4 != 0) goto L51
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L2d
        L51:
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L72
            r0.append(r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "="
            r0.append(r2)     // Catch: java.lang.Throwable -> L72
            r0.append(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = ", "
            r0.append(r2)     // Catch: java.lang.Throwable -> L72
            int r1 = r1 + 1
            goto L2d
        L68:
            java.lang.String r5 = "}"
            r0.append(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L72
            goto L79
        L72:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L79:
            java.lang.Throwable r6 = p000.fo1.m2190(r5)
            if (r6 != 0) goto L80
            goto L8a
        L80:
            java.lang.String r5 = r6.getMessage()
            java.lang.String r6 = "dump failed: "
            java.lang.String r5 = p000.lz1.m3687(r6, r5)
        L8a:
            java.lang.String r5 = (java.lang.String) r5
            return r5
    }

    public final java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> findAwemeItems(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L5
            jz r3 = p000.C0450jz.f5672
            return r3
        L5:
            java.util.List r3 = r3.extractAwemeItemsFromKnownContainer(r4)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L39
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            int r0 = r3.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "direct extract hit root="
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", items="
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r0 = 4
            java.lang.String r1 = "r9d0527b9ba13b0db"
            r2 = 0
            p000.C0888ux.m5988(r1, r4, r2, r0, r2)
            return r3
        L39:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1 = 0
            findAwemeItems$walk(r0, r3, r4, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L50:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r3.next()
            r1 = r0
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r1 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r1
            java.lang.String r1 = r1.getAwemeId()
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L50
            r4.add(r0)
            goto L50
        L6b:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L79:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r4.next()
            r2 = r1
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r2 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r2
            java.lang.String r2 = r2.getAwemeId()
            boolean r2 = r3.add(r2)
            if (r2 == 0) goto L79
            r0.add(r1)
            goto L79
        L94:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect$findAwemeItems$$inlined$sortedByDescending$1 r3 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect$findAwemeItems$$inlined$sortedByDescending$1
            r3.<init>()
            java.util.List r3 = p000.AbstractC0984xh.m6658(r0, r3)
            return r3
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord findProfileRecordFromRoots(java.lang.Object... r18) {
            r17 = this;
            r0 = r18
            r0.getClass()
            int r1 = r0.length
            r3 = 0
        L7:
            java.lang.String r4 = ", uid="
            java.lang.String r5 = ", nickname="
            java.lang.String r6 = ", secUid="
            java.lang.String r8 = "r9d0527b9ba13b0db"
            if (r3 >= r1) goto Ld8
            r10 = r0[r3]
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r11 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            boolean r12 = r10 instanceof android.content.Intent
            if (r12 == 0) goto L1d
            r12 = r10
            android.content.Intent r12 = (android.content.Intent) r12
            goto L1e
        L1d:
            r12 = 0
        L1e:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r12 = r11.fromIntent(r12)
            java.lang.String r13 = ", key="
            if (r12 == 0) goto L50
            java.lang.String r14 = r12.getUid()
            java.lang.String r15 = r12.getSecUid()
            java.lang.String r2 = r12.getNickname()
            java.lang.String r7 = r12.uniqueKey()
            java.lang.String r9 = "hit from intent uid="
            java.lang.StringBuilder r9 = p000.lz1.m3695(r9, r14, r6, r15, r5)
            java.lang.String r2 = p000.AbstractC0602nx.m4133(r9, r2, r13, r7)
            r7 = 4
            r9 = 0
            p000.C0888ux.m5988(r8, r2, r9, r7, r9)
            java.lang.String r2 = r12.uniqueKey()
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto L50
            return r12
        L50:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = r11.fromKnownProfileContainer(r10)
            if (r2 == 0) goto L94
            if (r10 == 0) goto L61
            java.lang.Class r7 = r10.getClass()
            java.lang.String r7 = r7.getName()
            goto L62
        L61:
            r7 = 0
        L62:
            java.lang.String r9 = r2.getUid()
            java.lang.String r12 = r2.getSecUid()
            java.lang.String r14 = r2.getNickname()
            java.lang.String r15 = r2.uniqueKey()
            r16 = r1
            java.lang.String r1 = "hit from known profile container="
            java.lang.StringBuilder r1 = p000.lz1.m3695(r1, r7, r4, r9, r6)
            p000.AbstractC0602nx.m4119(r1, r12, r5, r14, r13)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r7 = 4
            r9 = 0
            p000.C0888ux.m5988(r8, r1, r9, r7, r9)
            java.lang.String r1 = r2.uniqueKey()
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L96
            return r2
        L94:
            r16 = r1
        L96:
            if (r10 == 0) goto Ld2
            boolean r1 = r11.looksLikeUser(r10)
            if (r1 == 0) goto Ld2
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r11.toProfileRecord(r10)
            if (r1 == 0) goto Ld2
            java.lang.Class r2 = r10.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r7 = r1.getUid()
            java.lang.String r9 = r1.getSecUid()
            java.lang.String r10 = r1.getNickname()
            java.lang.String r11 = "hit root user="
            java.lang.StringBuilder r2 = p000.lz1.m3695(r11, r2, r4, r7, r6)
            java.lang.String r2 = p000.AbstractC0602nx.m4133(r2, r9, r5, r10)
            r7 = 4
            r9 = 0
            p000.C0888ux.m5988(r8, r2, r9, r7, r9)
            java.lang.String r2 = r1.uniqueKey()
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto Ld2
            return r1
        Ld2:
            int r3 = r3 + 1
            r1 = r16
            goto L7
        Ld8:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        Ldf:
            if (r3 >= r2) goto L124
            r7 = r0[r3]
            r9 = 0
            java.lang.Object r7 = findProfileRecordFromRoots$dfs(r1, r7, r9)
            if (r7 != 0) goto Leb
            goto L121
        Leb:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r10 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r10 = r10.toProfileRecord(r7)
            if (r10 == 0) goto L121
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r11 = r10.getUid()
            java.lang.String r12 = r10.getSecUid()
            java.lang.String r13 = r10.getNickname()
            java.lang.String r14 = "hit dfs user="
            java.lang.StringBuilder r7 = p000.lz1.m3695(r14, r7, r4, r11, r6)
            java.lang.String r7 = p000.AbstractC0602nx.m4133(r7, r12, r5, r13)
            r11 = 4
            r12 = 0
            p000.C0888ux.m5988(r8, r7, r12, r11, r12)
            java.lang.String r7 = r10.uniqueKey()
            boolean r7 = p000.q02.m4671(r7)
            if (r7 != 0) goto L121
            return r10
        L121:
            int r3 = r3 + 1
            goto Ldf
        L124:
            li1 r1 = new li1
            r2 = 5
            r1.<init>(r2)
            r2 = 31
            r9 = 0
            java.lang.String r0 = p000.AbstractC0312g7.m2256(r0, r9, r9, r1, r2)
            java.lang.String r1 = "no profile record from roots="
            java.lang.String r0 = r1.concat(r0)
            r7 = 4
            p000.C0888ux.m5988(r8, r0, r9, r7, r9)
            return r9
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem toAwemeItem(java.lang.Object r11) {
            r10 = this;
            r11.getClass()
            java.lang.String r0 = "getAwemeId"
            java.lang.String r1 = "getGroupId"
            java.lang.String r2 = "getAid"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.lang.String r1 = "awemeId"
            java.lang.String r2 = "groupId"
            java.lang.String r3 = "aid"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.lang.String r3 = r10.getStringByNames(r11, r0, r1)
            if (r3 != 0) goto L1f
            r10 = 0
            return r10
        L1f:
            java.lang.String r0 = "getDesc"
            java.lang.String r1 = "getDescription"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r1 = "desc"
            java.lang.String r2 = "description"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r0 = r10.getStringByNames(r11, r0, r1)
            if (r0 != 0) goto L37
            java.lang.String r0 = ""
        L37:
            r4 = r0
            java.lang.String r0 = "getCreateTime"
            java.lang.String r1 = "getCreateTimeStamp"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r1 = "createTimestamp"
            java.lang.String r2 = "createTimeStamp"
            java.lang.String r5 = "createTime"
            java.lang.String[] r1 = new java.lang.String[]{r5, r1, r2}
            java.lang.Long r10 = r10.getLongByNames(r11, r0, r1)
            if (r10 == 0) goto L56
            long r10 = r10.longValue()
        L54:
            r5 = r10
            goto L59
        L56:
            r10 = 0
            goto L54
        L59:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r2 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem
            r8 = 8
            r9 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r7, r8, r9)
            return r2
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord toProfileRecord(java.lang.Object r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            r1.getClass()
            java.lang.String r2 = "getUid"
            java.lang.String r3 = "getUserId"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String r3 = "userId"
            java.lang.String r4 = "user_id"
            java.lang.String r5 = "uid"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            java.lang.String r2 = r0.getStringByNames(r1, r2, r3)
            java.lang.String r3 = ""
            if (r2 != 0) goto L23
            r5 = r3
            goto L24
        L23:
            r5 = r2
        L24:
            java.lang.String r2 = "getSecUid"
            java.lang.String r4 = "getSecUserId"
            java.lang.String[] r2 = new java.lang.String[]{r2, r4}
            java.lang.String r4 = "sec_user_id"
            java.lang.String r6 = "secUserId"
            java.lang.String r7 = "secUid"
            java.lang.String[] r4 = new java.lang.String[]{r7, r4, r6}
            java.lang.String r2 = r0.getStringByNames(r1, r2, r4)
            if (r2 != 0) goto L3e
            r6 = r3
            goto L3f
        L3e:
            r6 = r2
        L3f:
            java.lang.String r2 = "getUniqueId"
            java.lang.String r4 = "getShortId"
            java.lang.String r7 = "getNickname"
            java.lang.String r8 = "getNickName"
            java.lang.String[] r2 = new java.lang.String[]{r7, r8, r2, r4}
            java.lang.String r4 = "uniqueId"
            java.lang.String r7 = "shortId"
            java.lang.String r8 = "nickname"
            java.lang.String r9 = "nickName"
            java.lang.String[] r4 = new java.lang.String[]{r8, r9, r4, r7}
            java.lang.String r2 = r0.getStringByNames(r1, r2, r4)
            if (r2 != 0) goto L5f
            r7 = r3
            goto L60
        L5f:
            r7 = r2
        L60:
            java.lang.String r2 = "getSignature"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r4 = "signature"
            java.lang.String r8 = "signatureExtra"
            java.lang.String[] r4 = new java.lang.String[]{r4, r8}
            java.lang.String r2 = r0.getStringByNames(r1, r2, r4)
            if (r2 != 0) goto L76
            r8 = r3
            goto L77
        L76:
            r8 = r2
        L77:
            java.lang.String r2 = "getAvatarMedium"
            java.lang.String r4 = "getAvatarThumb"
            java.lang.String r9 = "getAvatarUrl"
            java.lang.String[] r2 = new java.lang.String[]{r9, r2, r4}
            java.lang.String r4 = "avatarMedium"
            java.lang.String r9 = "avatarThumb"
            java.lang.String r10 = "avatarUrl"
            java.lang.String[] r4 = new java.lang.String[]{r10, r4, r9}
            java.lang.String r0 = r0.getStringByNames(r1, r2, r4)
            if (r0 != 0) goto L93
            r9 = r3
            goto L94
        L93:
            r9 = r0
        L94:
            boolean r0 = p000.q02.m4671(r5)
            if (r0 == 0) goto La2
            boolean r0 = p000.q02.m4671(r6)
            if (r0 == 0) goto La2
            r0 = 0
            return r0
        La2:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
            r23 = 65504(0xffe0, float:9.179E-41)
            r24 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r4
    }
}
