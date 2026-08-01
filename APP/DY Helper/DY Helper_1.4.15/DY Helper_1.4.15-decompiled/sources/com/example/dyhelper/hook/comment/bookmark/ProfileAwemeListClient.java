package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileAwemeListClient {
    public static final int $stable = 0;
    private static final java.lang.String CLASS_POST_AWEME_REPO = null;
    private static final java.lang.String CLASS_POST_AWEME_REPO_TAB_API = null;
    public static final com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient INSTANCE = null;
    private static final java.lang.String TAG = "r1b07f0e328a2e9ac";

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class ProfileAwemeListResult {
        public static final int $stable = 8;
        private final boolean hasMore;
        private final java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> items;
        private final long maxCursor;
        private final java.lang.Object rawResponse;
        private final int totalCount;

        public ProfileAwemeListResult(int r1, java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r2, java.lang.Object r3, boolean r4, long r5) {
                r0 = this;
                r2.getClass()
                r0.<init>()
                r0.totalCount = r1
                r0.items = r2
                r0.rawResponse = r3
                r0.hasMore = r4
                r0.maxCursor = r5
                return
        }

        public /* synthetic */ ProfileAwemeListResult(int r8, java.util.List r9, java.lang.Object r10, boolean r11, long r12, int r14, p000.AbstractC1067zq r15) {
                r7 = this;
                r15 = r14 & 8
                if (r15 == 0) goto L5
                r11 = 0
            L5:
                r4 = r11
                r11 = r14 & 16
                if (r11 == 0) goto Lc
                r12 = 0
            Lc:
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.ProfileAwemeListResult copy$default(com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.ProfileAwemeListResult r0, int r1, java.util.List r2, java.lang.Object r3, boolean r4, long r5, int r7, java.lang.Object r8) {
                r8 = r7 & 1
                if (r8 == 0) goto L6
                int r1 = r0.totalCount
            L6:
                r8 = r7 & 2
                if (r8 == 0) goto Lc
                java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r2 = r0.items
            Lc:
                r8 = r7 & 4
                if (r8 == 0) goto L12
                java.lang.Object r3 = r0.rawResponse
            L12:
                r8 = r7 & 8
                if (r8 == 0) goto L18
                boolean r4 = r0.hasMore
            L18:
                r7 = r7 & 16
                if (r7 == 0) goto L1e
                long r5 = r0.maxCursor
            L1e:
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                r2 = r0
                com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r0 = r2.copy(r3, r4, r5, r6, r7)
                return r0
        }

        public final int component1() {
                r0 = this;
                int r0 = r0.totalCount
                return r0
        }

        public final java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> component2() {
                r0 = this;
                java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r0 = r0.items
                return r0
        }

        public final java.lang.Object component3() {
                r0 = this;
                java.lang.Object r0 = r0.rawResponse
                return r0
        }

        public final boolean component4() {
                r0 = this;
                boolean r0 = r0.hasMore
                return r0
        }

        public final long component5() {
                r2 = this;
                long r0 = r2.maxCursor
                return r0
        }

        public final com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.ProfileAwemeListResult copy(int r1, java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r2, java.lang.Object r3, boolean r4, long r5) {
                r0 = this;
                r2.getClass()
                com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.ProfileAwemeListResult
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r6 = (com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.ProfileAwemeListResult) r6
                int r1 = r5.totalCount
                int r3 = r6.totalCount
                if (r1 == r3) goto L13
                return r2
            L13:
                java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r1 = r5.items
                java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r3 = r6.items
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L1e
                return r2
            L1e:
                java.lang.Object r1 = r5.rawResponse
                java.lang.Object r3 = r6.rawResponse
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L29
                return r2
            L29:
                boolean r1 = r5.hasMore
                boolean r3 = r6.hasMore
                if (r1 == r3) goto L30
                return r2
            L30:
                long r3 = r5.maxCursor
                long r5 = r6.maxCursor
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 == 0) goto L39
                return r2
            L39:
                return r0
        }

        public final boolean getHasMore() {
                r0 = this;
                boolean r0 = r0.hasMore
                return r0
        }

        public final java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> getItems() {
                r0 = this;
                java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r0 = r0.items
                return r0
        }

        public final long getMaxCursor() {
                r2 = this;
                long r0 = r2.maxCursor
                return r0
        }

        public final java.lang.Object getRawResponse() {
                r0 = this;
                java.lang.Object r0 = r0.rawResponse
                return r0
        }

        public final int getTotalCount() {
                r0 = this;
                int r0 = r0.totalCount
                return r0
        }

        public int hashCode() {
                r3 = this;
                int r0 = r3.totalCount
                int r0 = java.lang.Integer.hashCode(r0)
                r1 = 31
                int r0 = r0 * r1
                java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r2 = r3.items
                int r0 = p000.a12.m16(r2, r0, r1)
                java.lang.Object r2 = r3.rawResponse
                if (r2 != 0) goto L15
                r2 = 0
                goto L19
            L15:
                int r2 = r2.hashCode()
            L19:
                int r0 = r0 + r2
                int r0 = r0 * r1
                boolean r2 = r3.hasMore
                int r0 = p000.lz1.m3678(r0, r1, r2)
                long r1 = r3.maxCursor
                int r3 = java.lang.Long.hashCode(r1)
                int r3 = r3 + r0
                return r3
        }

        public java.lang.String toString() {
                r7 = this;
                int r0 = r7.totalCount
                java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r1 = r7.items
                java.lang.Object r2 = r7.rawResponse
                boolean r3 = r7.hasMore
                long r4 = r7.maxCursor
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r6 = "ProfileAwemeListResult(totalCount="
                r7.<init>(r6)
                r7.append(r0)
                java.lang.String r0 = ", items="
                r7.append(r0)
                r7.append(r1)
                java.lang.String r0 = ", rawResponse="
                r7.append(r0)
                r7.append(r2)
                java.lang.String r0 = ", hasMore="
                r7.append(r0)
                r7.append(r3)
                java.lang.String r0 = ", maxCursor="
                r7.append(r0)
                r7.append(r4)
                java.lang.String r0 = ")"
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                return r7
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.INSTANCE = r0
            java.lang.String r0 = "~794CAD4569E61E2D43B867359EB6123EE8F803FCDE2CE5CBCC91330CE3009DA61DC422605218FCF90CA7958EF8F016AF848FAD34CDD3"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.CLASS_POST_AWEME_REPO = r0
            java.lang.String r0 = "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836217D34BD7D72D162304DC6918FF1B767CF7B3169CF26E16DB3DB1DCAB2561717E6A7F5DE"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.CLASS_POST_AWEME_REPO_TAB_API = r0
            return
    }

    private ProfileAwemeListClient() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.LinkedHashMap<java.lang.String, java.lang.String> buildQueryMap(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r7, int r8, long r9, int r11, java.lang.String r12) {
            r6 = this;
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r0 = "legacy"
            boolean r1 = p000.ln0.m3626(r12, r0)
            boolean r0 = p000.ln0.m3626(r12, r0)
            java.lang.String r2 = "locate_host"
            boolean r3 = p000.ln0.m3626(r12, r2)
            java.lang.String r4 = "user_id"
            java.lang.String r5 = "sec_user_id"
            if (r3 == 0) goto L3f
            java.lang.String r1 = r7.getSecUid()
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L2d
            java.lang.String r7 = r7.getSecUid()
            r6.put(r5, r7)
            goto L77
        L2d:
            java.lang.String r1 = r7.getUid()
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L77
            java.lang.String r7 = r7.getUid()
            r6.put(r4, r7)
            goto L77
        L3f:
            java.lang.String r3 = r7.getUid()
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L5b
            java.lang.String r3 = r7.getUid()
            r6.put(r4, r3)
            if (r1 == 0) goto L5b
            java.lang.String r3 = "uid"
            java.lang.String r4 = r7.getUid()
            r6.put(r3, r4)
        L5b:
            java.lang.String r3 = r7.getSecUid()
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L77
            java.lang.String r3 = r7.getSecUid()
            r6.put(r5, r3)
            if (r1 == 0) goto L77
            java.lang.String r1 = "sec_uid"
            java.lang.String r7 = r7.getSecUid()
            r6.put(r1, r7)
        L77:
            r7 = 1
            r1 = 50
            int r7 = p000.j81.m2906(r8, r7, r1)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "count"
            r6.put(r8, r7)
            r7 = 0
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 >= 0) goto L8f
            r3 = r7
            goto L90
        L8f:
            r3 = r9
        L90:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "max_cursor"
            r6.put(r4, r3)
            java.lang.String r3 = "0"
            if (r0 == 0) goto Lae
            java.lang.String r0 = "min_cursor"
            r6.put(r0, r3)
            if (r1 >= 0) goto La5
            r9 = r7
        La5:
            java.lang.String r7 = java.lang.String.valueOf(r9)
            java.lang.String r8 = "cursor"
            r6.put(r8, r7)
        Lae:
            java.lang.String r7 = "query_type"
            java.lang.String r8 = java.lang.String.valueOf(r11)
            r6.put(r7, r8)
            int r7 = r12.hashCode()
            java.lang.String r8 = "need_filter"
            java.lang.String r9 = "personal_homepage"
            java.lang.String r10 = "1"
            java.lang.String r11 = "is_familiar"
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = "2"
            java.lang.String r4 = "publish_video_strategy_type"
            java.lang.String r5 = "source"
            switch(r7) {
                case 178027519: goto L12f;
                case 221749176: goto L116;
                case 422863477: goto Ldc;
                case 1064537505: goto Lcf;
                default: goto Lce;
            }
        Lce:
            goto L137
        Lcf:
            java.lang.String r7 = "minimal"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto Ld8
            goto L137
        Ld8:
            r6.put(r5, r3)
            return r6
        Ldc:
            boolean r7 = r12.equals(r2)
            if (r7 != 0) goto Le3
            goto L137
        Le3:
            java.lang.String r7 = "time_list_query"
            r6.put(r7, r3)
            r6.put(r4, r1)
            r6.put(r5, r3)
            java.lang.String r7 = "user_avatar_shrink"
            java.lang.String r8 = "300_300"
            r6.put(r7, r8)
            java.lang.String r7 = "video_cover_shrink"
            java.lang.String r8 = "200_200"
            r6.put(r7, r8)
            java.lang.String r7 = "show_live_replay_strategy"
            r6.put(r7, r10)
            java.lang.String r7 = "is_order_flow"
            r6.put(r7, r3)
            java.lang.String r7 = "page_from"
            r6.put(r7, r1)
            java.lang.String r7 = "location_permission"
            r6.put(r7, r3)
            java.lang.String r7 = "post_serial_strategy"
            r6.put(r7, r3)
            return r6
        L116:
            java.lang.String r7 = "profile_tab_filter"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L11f
            goto L137
        L11f:
            r6.put(r5, r3)
            r6.put(r0, r9)
            r6.put(r11, r3)
            r6.put(r4, r1)
            r6.put(r8, r10)
            return r6
        L12f:
            java.lang.String r7 = "profile_tab"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L149
        L137:
            r6.put(r5, r3)
            java.lang.String r7 = "dyhelper_profile_bookmark"
            r6.put(r0, r7)
            r6.put(r11, r3)
            r6.put(r4, r3)
            r6.put(r8, r3)
            return r6
        L149:
            r6.put(r5, r3)
            r6.put(r0, r9)
            r6.put(r11, r3)
            r6.put(r4, r1)
            return r6
    }

    private final java.lang.Throwable extractThrowableFromFailure(java.lang.Object r8) {
            r7 = this;
            r7 = 0
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L2c
        L5:
            if (r0 == 0) goto L46
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L46
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L2c
            r1.getClass()     // Catch: java.lang.Throwable -> L2c
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2c
            r3 = 0
        L18:
            if (r3 >= r2) goto L2e
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = "exception"
            boolean r5 = p000.ln0.m3626(r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L29
            goto L2f
        L29:
            int r3 = r3 + 1
            goto L18
        L2c:
            r8 = move-exception
            goto L48
        L2e:
            r4 = r7
        L2f:
            if (r4 == 0) goto L41
            r0 = 1
            r4.setAccessible(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = r4.get(r8)     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r8 instanceof java.lang.Throwable     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L40
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch: java.lang.Throwable -> L2c
            return r8
        L40:
            return r7
        L41:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L2c
            goto L5
        L46:
            r0 = r7
            goto L4d
        L48:
            eo1 r0 = new eo1
            r0.<init>(r8)
        L4d:
            if (r0 == 0) goto L50
            goto L51
        L50:
            r7 = r0
        L51:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            return r7
    }

    private final java.lang.reflect.Method findDeferredFeedItemListMethod(java.lang.Class<?> r6, java.lang.String r7) {
            r5 = this;
            java.lang.reflect.Method[] r5 = r6.getMethods()
            r5.getClass()
            ss1 r5 = p000.AbstractC0312g7.m2232(r5)
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            r6.getClass()
            ss1 r6 = p000.AbstractC0312g7.m2232(r6)
            c40 r5 = p000.us1.m5946(r5, r6)
            x30 r6 = new x30
            r6.<init>(r5)
        L1f:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r6.next()
            r0 = r5
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            r2 = 2
            if (r1 != r2) goto L1f
            java.lang.Class[] r1 = r0.getParameterTypes()
            r2 = 0
            r1 = r1[r2]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L1f
            java.lang.Class[] r1 = r0.getParameterTypes()
            r3 = 1
            r1 = r1[r3]
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L1f
            java.lang.Class r1 = r0.getReturnType()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "Deferred"
            boolean r1 = p000.q02.m4654(r1, r3, r2)
            if (r1 == 0) goto L1f
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            r0.getClass()
            int r1 = r0.length
            r3 = r2
        L6b:
            if (r3 >= r1) goto L1f
            r4 = r0[r3]
            java.lang.String r4 = r4.toString()
            boolean r4 = p000.q02.m4654(r4, r7, r2)
            if (r4 == 0) goto L7a
            goto L7e
        L7a:
            int r3 = r3 + 1
            goto L6b
        L7d:
            r5 = 0
        L7e:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            return r5
    }

    private final java.lang.reflect.Method findFetchPublicListInCoroutine(java.lang.Class<?> r10) {
            r9 = this;
            java.lang.reflect.Method[] r9 = r10.getMethods()
            r9.getClass()
            int r0 = r9.length
            r1 = 0
            r2 = r1
        La:
            r3 = 0
            r4 = 2
            java.lang.String r5 = "fetchPublicListInCoroutine"
            if (r2 >= r0) goto L44
            r6 = r9[r2]
            java.lang.String r7 = r6.getName()
            boolean r7 = p000.ln0.m3626(r7, r5)
            if (r7 == 0) goto L41
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r7 = r7.length
            if (r7 != r4) goto L41
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7 = r7[r1]
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L41
            java.lang.Class[] r7 = r6.getParameterTypes()
            r8 = 1
            r7 = r7[r8]
            java.lang.Class<op> r8 = p000.InterfaceC0631op.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L41
            goto L45
        L41:
            int r2 = r2 + 1
            goto La
        L44:
            r6 = r3
        L45:
            if (r6 != 0) goto L69
            java.lang.reflect.Method[] r9 = r10.getDeclaredMethods()
            r9.getClass()
            int r10 = r9.length
        L4f:
            if (r1 >= r10) goto L68
            r0 = r9[r1]
            java.lang.String r2 = r0.getName()
            boolean r2 = p000.ln0.m3626(r2, r5)
            if (r2 == 0) goto L65
            java.lang.Class[] r2 = r0.getParameterTypes()
            int r2 = r2.length
            if (r2 != r4) goto L65
            return r0
        L65:
            int r1 = r1 + 1
            goto L4f
        L68:
            return r3
        L69:
            return r6
    }

    private final java.lang.Object invokeDeferredApi(java.lang.reflect.Method r9, java.lang.Object r10, java.lang.Object[] r11, long r12) {
            r8 = this;
            int r0 = r11.length     // Catch: java.lang.reflect.InvocationTargetException -> L87
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L87
            java.lang.Object r2 = r9.invoke(r10, r11)     // Catch: java.lang.reflect.InvocationTargetException -> L87
            r9 = 0
            if (r2 != 0) goto Ld
            return r9
        Ld:
            java.lang.Class r10 = r2.getClass()
            java.lang.reflect.Method[] r10 = r10.getMethods()
            r10.getClass()
            int r11 = r10.length
            r0 = 0
            r1 = r0
        L1b:
            java.lang.String r3 = "await"
            r4 = 1
            if (r1 >= r11) goto L45
            r5 = r10[r1]
            java.lang.String r6 = r5.getName()
            boolean r6 = p000.ln0.m3626(r6, r3)
            if (r6 == 0) goto L42
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 != r4) goto L42
            java.lang.Class[] r6 = r5.getParameterTypes()
            r6 = r6[r0]
            java.lang.Class<op> r7 = p000.InterfaceC0631op.class
            boolean r6 = r7.isAssignableFrom(r6)
            if (r6 == 0) goto L42
            goto L46
        L42:
            int r1 = r1 + 1
            goto L1b
        L45:
            r5 = r9
        L46:
            if (r5 != 0) goto L7a
            java.lang.Class r10 = r2.getClass()
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()
            r10.getClass()
            int r11 = r10.length
            r1 = r0
        L55:
            if (r1 >= r11) goto L6f
            r5 = r10[r1]
            java.lang.String r6 = r5.getName()
            boolean r6 = p000.ln0.m3626(r6, r3)
            if (r6 == 0) goto L6c
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 != r4) goto L6c
            r9 = r5
            goto L6f
        L6c:
            int r1 = r1 + 1
            goto L55
        L6f:
            if (r9 == 0) goto L73
            r1 = r9
            goto L7b
        L73:
            java.lang.String r8 = "Deferred.await"
            p000.ql1.m4936(r8)
            r8 = 0
            return r8
        L7a:
            r1 = r5
        L7b:
            r1.setAccessible(r4)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r0 = r8
            r4 = r12
            java.lang.Object r8 = r0.invokeSuspendApi(r1, r2, r3, r4)
            return r8
        L87:
            r0 = move-exception
            r8 = r0
            java.lang.Throwable r9 = r8.getTargetException()
            if (r9 != 0) goto L90
            goto L91
        L90:
            r8 = r9
        L91:
            throw r8
    }

    private final java.lang.Object invokeNoArg(java.lang.Object r7, java.lang.String r8) {
            r6 = this;
            r6 = 0
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L31
        L5:
            if (r0 == 0) goto L47
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L47
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L31
            r1.getClass()     // Catch: java.lang.Throwable -> L31
            int r2 = r1.length     // Catch: java.lang.Throwable -> L31
            r3 = 0
        L18:
            if (r3 >= r2) goto L36
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L31
            boolean r5 = p000.ln0.m3626(r5, r8)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L33
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L31
            r5.getClass()     // Catch: java.lang.Throwable -> L31
            int r5 = r5.length     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto L33
            goto L37
        L31:
            r7 = move-exception
            goto L49
        L33:
            int r3 = r3 + 1
            goto L18
        L36:
            r4 = r6
        L37:
            if (r4 == 0) goto L42
            r8 = 1
            r4.setAccessible(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r4.invoke(r7, r6)     // Catch: java.lang.Throwable -> L31
            return r6
        L42:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L31
            goto L5
        L47:
            r8 = r6
            goto L4e
        L49:
            eo1 r8 = new eo1
            r8.<init>(r7)
        L4e:
            if (r8 == 0) goto L51
            goto L52
        L51:
            r6 = r8
        L52:
            return r6
    }

    private final java.lang.Object invokeSuspendApi(java.lang.reflect.Method r17, java.lang.Object r18, java.lang.Object[] r19, long r20) {
            r16 = this;
            r1 = r19
            r2 = r20
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch
            r0 = 1
            r4.<init>(r0)
            um1 r5 = new um1
            r5.<init>()
            um1 r6 = new um1
            r6.<init>()
            java.lang.Class[] r0 = r17.getParameterTypes()
            r0.getClass()
            int r7 = r1.length
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r7, r0)
            r7 = r0
            java.lang.Class r7 = (java.lang.Class) r7
            r8 = 0
            if (r7 == 0) goto L16c
            java.lang.ClassLoader r0 = r7.getClassLoader()
            if (r0 != 0) goto L3c
            java.lang.Class r0 = r18.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 != 0) goto L3c
            java.lang.Class<com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L3c:
            r9 = r0
            boolean r0 = p000.C0888ux.m5984()
            java.lang.String r10 = "r1b07f0e328a2e9ac"
            if (r0 == 0) goto L71
            java.lang.String r0 = r17.getName()
            java.lang.String r11 = r7.getName()
            java.lang.Class r12 = r18.getClass()
            java.lang.ClassLoader r12 = r12.getClassLoader()
            java.lang.String r13 = ", continuationClass="
            java.lang.String r14 = ", continuationLoader="
            java.lang.String r15 = "invokeSuspendApi method="
            java.lang.StringBuilder r0 = p000.lz1.m3695(r15, r0, r13, r11, r14)
            r0.append(r9)
            java.lang.String r11 = ", receiverLoader="
            r0.append(r11)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r10, r0)
        L71:
            java.lang.String r0 = "up"
            r11 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r11, r9)     // Catch: java.lang.Throwable -> L79
            goto L80
        L79:
            r0 = move-exception
            eo1 r11 = new eo1
            r11.<init>(r0)
            r0 = r11
        L80:
            boolean r11 = r0 instanceof p000.eo1
            if (r11 == 0) goto L85
            r0 = r8
        L85:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L98
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            rh0 r11 = new rh0
            r12 = 2
            r11.<init>(r12)
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r9, r0, r11)
            goto L99
        L98:
            r0 = r8
        L99:
            java.lang.Class[] r7 = new java.lang.Class[]{r7}
            lb0 r11 = new lb0
            r11.<init>(r0, r6, r5, r4)
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r9, r7, r11)
            int r7 = r1.length     // Catch: java.lang.reflect.InvocationTargetException -> L162
            int r9 = r7 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L162
            r1[r7] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L162
            int r0 = r1.length     // Catch: java.lang.reflect.InvocationTargetException -> L162
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L162
            r1 = r17
            r7 = r18
            java.lang.Object r0 = r1.invoke(r7, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L162
            boolean r1 = p000.C0888ux.m5984()
            if (r1 == 0) goto Le7
            if (r0 == 0) goto Lcd
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            goto Lce
        Lcd:
            r1 = r8
        Lce:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "invokeSuspendApi immediateClass="
            r7.<init>(r9)
            r7.append(r1)
            java.lang.String r1 = ", immediate="
            r7.append(r1)
            r7.append(r0)
            java.lang.String r1 = r7.toString()
            p000.C0888ux.m5975(r10, r1)
        Le7:
            r1 = r16
            boolean r1 = r1.isCoroutineSuspendedMarker(r0)
            if (r1 != 0) goto Lf0
            return r0
        Lf0:
            boolean r0 = p000.C0888ux.m5984()
            java.lang.String r1 = "ms"
            if (r0 == 0) goto L10c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "invokeSuspendApi suspended, waiting continuation timeout="
            r0.<init>(r7)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r10, r0)
        L10c:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            boolean r0 = r4.await(r2, r0)
            if (r0 == 0) goto L14b
            java.lang.Object r0 = r6.f10912
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L14a
            boolean r0 = p000.C0888ux.m5984()
            if (r0 == 0) goto L147
            java.lang.Object r0 = r5.f10912
            if (r0 == 0) goto L12c
            java.lang.Class r0 = r0.getClass()
            java.lang.String r8 = r0.getName()
        L12c:
            java.lang.Object r0 = r5.f10912
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invokeSuspendApi resumed valueClass="
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = ", value="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5975(r10, r0)
        L147:
            java.lang.Object r0 = r5.f10912
            return r0
        L14a:
            throw r0
        L14b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "suspend api timeout "
            r4.<init>(r5)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L162:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getTargetException()
            if (r1 != 0) goto L16a
            goto L16b
        L16a:
            r0 = r1
        L16b:
            throw r0
        L16c:
            java.lang.String r0 = "missing continuation parameter"
            p000.C1080.m7275(r0)
            return r8
    }

    private static final java.lang.Object invokeSuspendApi$lambda$20$lambda$19(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) {
            java.lang.String r4 = r4.getName()
            r0 = 0
            if (r4 == 0) goto L7a
            int r1 = r4.hashCode()
            r2 = 0
            switch(r1) {
                case -1776922004: goto L6e;
                case -1347835953: goto L64;
                case -1295482945: goto L4d;
                case 102230: goto L47;
                case 3148801: goto L36;
                case 3444122: goto L23;
                case 147696667: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L7a
        L11:
            java.lang.String r5 = "hashCode"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1a
            goto L7a
        L1a:
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L23:
            java.lang.String r1 = "plus"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L2c
            goto L7a
        L2c:
            if (r5 == 0) goto L6d
            java.lang.Object r4 = p000.AbstractC0312g7.m2253(r2, r5)
            if (r4 != 0) goto L35
            goto L6d
        L35:
            return r4
        L36:
            java.lang.String r3 = "fold"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L3f
            goto L7a
        L3f:
            if (r5 == 0) goto L46
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r2, r5)
            return r3
        L46:
            return r0
        L47:
            java.lang.String r3 = "get"
            r4.equals(r3)
            goto L7a
        L4d:
            java.lang.String r1 = "equals"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L56
            goto L7a
        L56:
            if (r5 == 0) goto L5c
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r2, r5)
        L5c:
            if (r3 != r0) goto L5f
            r2 = 1
        L5f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            return r3
        L64:
            java.lang.String r5 = "minusKey"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L6d
            goto L7a
        L6d:
            return r3
        L6e:
            java.lang.String r3 = "toString"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L77
            goto L7a
        L77:
            java.lang.String r3 = "HostEmptyCoroutineContextProxy"
            return r3
        L7a:
            return r0
    }

    private static final java.lang.Object invokeSuspendApi$lambda$22(java.lang.Object r4, p000.um1 r5, p000.um1 r6, java.util.concurrent.CountDownLatch r7, java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
            java.lang.String r0 = "suspend api failure: "
            java.lang.String r1 = "continuation.resumeWith resultClass="
            java.lang.String r9 = r9.getName()
            r2 = 0
            if (r9 == 0) goto Ld3
            int r3 = r9.hashCode()
            switch(r3) {
                case -1776922004: goto Lc7;
                case -1295482945: goto Lae;
                case -556986733: goto L32;
                case 147696667: goto L1f;
                case 1988391289: goto L14;
                default: goto L12;
            }
        L12:
            goto Ld3
        L14:
            java.lang.String r5 = "getContext"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L1e
            goto Ld3
        L1e:
            return r4
        L1f:
            java.lang.String r4 = "hashCode"
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L29
            goto Ld3
        L29:
            int r4 = java.lang.System.identityHashCode(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L32:
            java.lang.String r4 = "resumeWith"
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L3c
            goto Ld3
        L3c:
            if (r10 == 0) goto L45
            java.lang.Object r4 = p000.AbstractC0312g7.m2250(r10)     // Catch: java.lang.Throwable -> L43
            goto L46
        L43:
            r4 = move-exception
            goto La5
        L45:
            r4 = r2
        L46:
            boolean r8 = p000.C0888ux.m5984()     // Catch: java.lang.Throwable -> L43
            if (r8 == 0) goto L71
            java.lang.String r8 = "r1b07f0e328a2e9ac"
            if (r4 == 0) goto L59
            java.lang.Class r9 = r4.getClass()     // Catch: java.lang.Throwable -> L43
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L43
            goto L5a
        L59:
            r9 = r2
        L5a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L43
            r10.append(r9)     // Catch: java.lang.Throwable -> L43
            java.lang.String r9 = ", result="
            r10.append(r9)     // Catch: java.lang.Throwable -> L43
            r10.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L43
            p000.C0888ux.m5975(r8, r9)     // Catch: java.lang.Throwable -> L43
        L71:
            if (r4 != 0) goto L7d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = "resumeWith result is null"
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L43
            r5.f10912 = r4     // Catch: java.lang.Throwable -> L43
            goto La1
        L7d:
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient r8 = com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.INSTANCE     // Catch: java.lang.Throwable -> L43
            boolean r9 = r8.isKotlinResultFailure(r4)     // Catch: java.lang.Throwable -> L43
            if (r9 == 0) goto L9f
            java.lang.Throwable r6 = r8.extractThrowableFromFailure(r4)     // Catch: java.lang.Throwable -> L43
            if (r6 != 0) goto L9c
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L43
            r8.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L43
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L43
        L9c:
            r5.f10912 = r6     // Catch: java.lang.Throwable -> L43
            goto La1
        L9f:
            r6.f10912 = r4     // Catch: java.lang.Throwable -> L43
        La1:
            r7.countDown()
            goto La8
        La5:
            r5.f10912 = r4     // Catch: java.lang.Throwable -> La9
            goto La1
        La8:
            return r2
        La9:
            r4 = move-exception
            r7.countDown()
            throw r4
        Lae:
            java.lang.String r4 = "equals"
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto Lb7
            goto Ld3
        Lb7:
            if (r10 == 0) goto Lbd
            java.lang.Object r2 = p000.AbstractC0312g7.m2250(r10)
        Lbd:
            if (r8 != r2) goto Lc1
            r4 = 1
            goto Lc2
        Lc1:
            r4 = 0
        Lc2:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        Lc7:
            java.lang.String r4 = "toString"
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto Ld0
            goto Ld3
        Ld0:
            java.lang.String r4 = "HostContinuationProxy"
            return r4
        Ld3:
            return r2
    }

    private final boolean isCoroutineSuspendedMarker(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r2 = 0
            return r2
        L4:
            cq r2 = p000.EnumC0184cq.f2716
            r0 = 1
            if (r3 != r2) goto La
            return r0
        La:
            boolean r2 = r3 instanceof java.lang.Enum
            r1 = 0
            if (r2 == 0) goto L13
            r2 = r3
            java.lang.Enum r2 = (java.lang.Enum) r2
            goto L14
        L13:
            r2 = r1
        L14:
            if (r2 == 0) goto L1a
            java.lang.String r1 = r2.name()
        L1a:
            java.lang.String r2 = "COROUTINE_SUSPENDED"
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L23
            return r0
        L23:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "kotlin.coroutines.intrinsics.CoroutineSingletons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            java.lang.String r3 = r3.toString()
            boolean r2 = p000.ln0.m3626(r3, r2)
            return r2
        L3c:
            java.lang.String r3 = r3.toString()
            boolean r2 = p000.ln0.m3626(r3, r2)
            return r2
    }

    private final boolean isKotlinResultFailure(java.lang.Object r6) {
            r5 = this;
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "kotlin.Result$Failure"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L11
            goto L4a
        L11:
            java.lang.String r0 = "Result"
            r1 = 0
            boolean r0 = p000.q02.m4654(r5, r0, r1)
            if (r0 == 0) goto L23
            java.lang.String r0 = "Failure"
            boolean r5 = p000.q02.m4654(r5, r0, r1)
            if (r5 == 0) goto L23
            goto L4a
        L23:
            java.lang.Class r5 = r6.getClass()     // Catch: java.lang.Throwable -> L57
        L27:
            if (r5 == 0) goto L54
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            boolean r6 = r5.equals(r6)     // Catch: java.lang.Throwable -> L57
            if (r6 != 0) goto L54
            java.lang.reflect.Field[] r6 = r5.getDeclaredFields()     // Catch: java.lang.Throwable -> L57
            r6.getClass()     // Catch: java.lang.Throwable -> L57
            int r0 = r6.length     // Catch: java.lang.Throwable -> L57
            r2 = r1
        L3a:
            if (r2 >= r0) goto L4f
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "exception"
            boolean r3 = p000.ln0.m3626(r3, r4)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L4c
        L4a:
            r5 = 1
            return r5
        L4c:
            int r2 = r2 + 1
            goto L3a
        L4f:
            java.lang.Class r5 = r5.getSuperclass()     // Catch: java.lang.Throwable -> L57
            goto L27
        L54:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L57
            goto L5e
        L57:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L5e:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r0 = r5 instanceof p000.eo1
            if (r0 == 0) goto L65
            r5 = r6
        L65:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
    }

    public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.ProfileAwemeListResult loadProfileAwemeList$default(com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient r9, java.lang.ClassLoader r10, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r11, int r12, long r13, int r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.Object r19) {
            r0 = r18 & 4
            if (r0 == 0) goto L6
            r12 = 20
        L6:
            r3 = r12
            r12 = r18 & 8
            if (r12 == 0) goto Ld
            r13 = 0
        Ld:
            r4 = r13
            r12 = r18 & 16
            if (r12 == 0) goto L15
            r12 = 1
            r6 = r12
            goto L16
        L15:
            r6 = r15
        L16:
            r12 = r18 & 32
            if (r12 == 0) goto L1e
            java.lang.String r12 = "legacy"
            r7 = r12
            goto L20
        L1e:
            r7 = r16
        L20:
            r12 = r18 & 64
            if (r12 == 0) goto L2b
            java.lang.String r12 = "public"
            r8 = r12
        L27:
            r0 = r9
            r1 = r10
            r2 = r11
            goto L2e
        L2b:
            r8 = r17
            goto L27
        L2e:
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r9 = r0.loadProfileAwemeList(r1, r2, r3, r4, r6, r7, r8)
            return r9
    }

    private final void logDev(p000.p70 r1) {
            r0 = this;
            boolean r0 = p000.C0888ux.m5984()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r1.invoke()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "r1b07f0e328a2e9ac"
            p000.C0888ux.m5975(r1, r0)
        L11:
            return
    }

    private final java.lang.Object readField(java.lang.Object r7, java.lang.String r8) {
            r6 = this;
            r6 = 0
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L2a
        L5:
            if (r0 == 0) goto L3d
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L3d
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L2a
            r1.getClass()     // Catch: java.lang.Throwable -> L2a
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2a
            r3 = 0
        L18:
            if (r3 >= r2) goto L2c
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L2a
            boolean r5 = p000.ln0.m3626(r5, r8)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L27
            goto L2d
        L27:
            int r3 = r3 + 1
            goto L18
        L2a:
            r7 = move-exception
            goto L3f
        L2c:
            r4 = r6
        L2d:
            if (r4 == 0) goto L38
            r8 = 1
            r4.setAccessible(r8)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r4.get(r7)     // Catch: java.lang.Throwable -> L2a
            return r6
        L38:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L2a
            goto L5
        L3d:
            r8 = r6
            goto L44
        L3f:
            eo1 r8 = new eo1
            r8.<init>(r7)
        L44:
            if (r8 == 0) goto L47
            goto L48
        L47:
            r6 = r8
        L48:
            return r6
    }

    private final boolean readHasMore(java.lang.Object r5) {
            r4 = this;
            java.lang.String r0 = "isHasMore"
            java.lang.Object r0 = r4.invokeNoArg(r5, r0)
            r1 = 0
            if (r0 == 0) goto L19
            boolean r4 = r0 instanceof java.lang.Boolean
            if (r4 == 0) goto L10
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L18
            boolean r4 = r0.booleanValue()
            return r4
        L18:
            return r1
        L19:
            java.lang.String r0 = "getHasMore"
            java.lang.String r2 = "hasMore"
            java.lang.Long r4 = r4.readLong(r5, r0, r2)
            if (r4 == 0) goto L2f
            long r4 = r4.longValue()
            r2 = 1
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            r4 = 1
            return r4
        L2f:
            return r1
    }

    private final java.lang.Long readLong(java.lang.Object r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            java.lang.Object r2 = r0.invokeNoArg(r1, r2)
            if (r2 != 0) goto La
            java.lang.Object r2 = r0.readField(r1, r3)
        La:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L19
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L19:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L26
            java.lang.String r2 = (java.lang.String) r2
            r0 = 10
            java.lang.Long r0 = p000.x02.m6489(r2, r0)
            return r0
        L26:
            r0 = 0
            return r0
    }

    private final java.lang.Object resolveApiFromPostAwemeRepo(java.lang.ClassLoader r3) {
            r2 = this;
            r2 = 0
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.CLASS_POST_AWEME_REPO     // Catch: java.lang.Throwable -> L24
            java.lang.Class r3 = p000.qe0.m4877(r3, r0)     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto Ld
            r3 = r2
            goto L2b
        Ld:
            java.lang.reflect.Constructor r0 = r3.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r0.newInstance(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "LIZ"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L24
            r1 = 1
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L24
            goto L2b
        L24:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L2b:
            boolean r0 = r3 instanceof p000.eo1
            if (r0 == 0) goto L30
            goto L31
        L30:
            r2 = r3
        L31:
            return r2
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ java.lang.Object m1433(java.lang.Object r0, p000.um1 r1, p000.um1 r2, java.util.concurrent.CountDownLatch r3, java.lang.Object r4, java.lang.reflect.Method r5, java.lang.Object[] r6) {
            java.lang.Object r0 = invokeSuspendApi$lambda$22(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ java.lang.Object m1434(java.lang.Object r0, java.lang.reflect.Method r1, java.lang.Object[] r2) {
            java.lang.Object r0 = invokeSuspendApi$lambda$20$lambda$19(r0, r1, r2)
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.ProfileAwemeListResult loadProfileAwemeList(java.lang.ClassLoader r18, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r19, int r20, long r21, int r23, java.lang.String r24, java.lang.String r25) {
            r17 = this;
            r7 = r25
            java.lang.String r8 = "/aweme/v1/locate/post/"
            java.lang.String r9 = ", secUid="
            java.lang.String r10 = "profile aweme response="
            java.lang.String r11 = "parsed aweme items="
            java.lang.String r12 = "invoke profile aweme list uid="
            r18.getClass()
            r19.getClass()
            r24.getClass()
            r7.getClass()
            java.lang.String r0 = r19.getUid()
            boolean r0 = p000.q02.m4671(r0)
            r13 = 0
            java.lang.String r14 = "r1b07f0e328a2e9ac"
            if (r0 == 0) goto L44
            java.lang.String r0 = r19.getSecUid()
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "skip, uid/secUid empty record="
            r0.<init>(r1)
            r1 = r19
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 4
            p000.C0888ux.m5988(r14, r0, r13, r1, r13)
            return r13
        L44:
            r1 = r19
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.CLASS_POST_AWEME_REPO_TAB_API     // Catch: java.lang.Throwable -> L75
            r2 = r18
            java.lang.Class r15 = p000.qe0.m4877(r2, r0)     // Catch: java.lang.Throwable -> L75
            if (r15 == 0) goto L1d5
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.resolveApiInstance(r15)     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L60
            java.lang.Object r0 = r17.resolveApiFromPostAwemeRepo(r18)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L6d
        L60:
            r2 = r20
            r3 = r21
            r5 = r23
            r6 = r24
            r16 = r0
            r0 = r17
            goto L78
        L6d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "PostAwemeRepo.TabApi instance is null"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L75:
            r0 = move-exception
            goto L1db
        L78:
            java.util.LinkedHashMap r2 = r0.buildQueryMap(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L75
            boolean r1 = p000.C0888ux.m5984()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto Lb9
            java.lang.String r1 = r19.getUid()     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = r19.getSecUid()     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L75
            r4.append(r1)     // Catch: java.lang.Throwable -> L75
            r4.append(r9)     // Catch: java.lang.Throwable -> L75
            r4.append(r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = ", endpoint="
            r4.append(r1)     // Catch: java.lang.Throwable -> L75
            r4.append(r7)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = ", variant="
            r4.append(r1)     // Catch: java.lang.Throwable -> L75
            r6 = r24
            r4.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = ", query="
            r4.append(r1)     // Catch: java.lang.Throwable -> L75
            r4.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L75
            p000.C0888ux.m5975(r14, r1)     // Catch: java.lang.Throwable -> L75
        Lb9:
            java.lang.String r1 = "locate"
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Throwable -> L75
            r3 = 1
            if (r1 == 0) goto Lfc
            java.lang.reflect.Method r1 = r0.findDeferredFeedItemListMethod(r15, r8)     // Catch: java.lang.Throwable -> L75
            if (r1 != 0) goto Ldb
            java.lang.Class r1 = r16.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.reflect.Method r1 = r0.findDeferredFeedItemListMethod(r1, r8)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto Ld3
            goto Ldb
        Ld3:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "locatePost"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        Ldb:
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L75
            r3 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L75
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}     // Catch: java.lang.Throwable -> L75
            r3 = 15000(0x3a98, double:7.411E-320)
            r20 = r0
            r21 = r1
            r23 = r2
            r24 = r3
            r22 = r16
            java.lang.Object r0 = r20.invokeDeferredApi(r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L75
            r1 = r20
        Lfa:
            r4 = r0
            goto L130
        Lfc:
            r1 = r0
            r0 = r16
            java.lang.reflect.Method r4 = r1.findFetchPublicListInCoroutine(r15)     // Catch: java.lang.Throwable -> L75
            if (r4 != 0) goto L118
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.reflect.Method r4 = r1.findFetchPublicListInCoroutine(r4)     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L110
            goto L118
        L110:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "fetchPublicListInCoroutine"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L118:
            r4.setAccessible(r3)     // Catch: java.lang.Throwable -> L75
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L75
            r5 = 15000(0x3a98, double:7.411E-320)
            r22 = r0
            r20 = r1
            r23 = r2
            r21 = r4
            r24 = r5
            java.lang.Object r0 = r20.invokeSuspendApi(r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L75
            goto Lfa
        L130:
            if (r4 == 0) goto L1cd
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L75
            java.util.List r3 = r0.findAwemeItems(r4)     // Catch: java.lang.Throwable -> L75
            boolean r5 = r1.readHasMore(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "getMaxCursor"
            java.lang.String r6 = "maxCursor"
            java.lang.Long r1 = r1.readLong(r4, r2, r6)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L14c
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L75
        L14a:
            r6 = r1
            goto L14f
        L14c:
            r1 = 0
            goto L14a
        L14f:
            boolean r1 = p000.C0888ux.m5984()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L184
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.dumpShort(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L75
            r2.append(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = ", hasMore="
            r2.append(r1)     // Catch: java.lang.Throwable -> L75
            r2.append(r5)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = ", maxCursor="
            r2.append(r1)     // Catch: java.lang.Throwable -> L75
            r2.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = ", responseDump="
            r2.append(r1)     // Catch: java.lang.Throwable -> L75
            r2.append(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L75
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L75
        L184:
            boolean r0 = p000.C0888ux.m5984()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L1c3
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L75
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L75
            java.lang.Object r2 = p000.AbstractC0984xh.m6640(r3)     // Catch: java.lang.Throwable -> L75
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r2 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r2     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L1a3
            java.lang.String r2 = r2.getAwemeId()     // Catch: java.lang.Throwable -> L75
            goto L1a4
        L1a3:
            r2 = r13
        L1a4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L75
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = ", items="
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            r8.append(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = ", first="
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            r8.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L75
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L75
        L1c3:
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r1 = new com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult     // Catch: java.lang.Throwable -> L75
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L75
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L75
            goto L1e0
        L1cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "profile aweme list returns null"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L1d5:
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException     // Catch: java.lang.Throwable -> L75
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L75
            throw r1     // Catch: java.lang.Throwable -> L75
        L1db:
            eo1 r1 = new eo1
            r1.<init>(r0)
        L1e0:
            java.lang.Throwable r0 = p000.fo1.m2190(r1)
            if (r0 == 0) goto L1f7
            java.lang.String r2 = r19.getUid()
            java.lang.String r3 = r19.getSecUid()
            java.lang.String r4 = "loadProfileAwemeList failed uid="
            java.lang.String r2 = p000.a12.m18(r4, r2, r9, r3)
            p000.C0888ux.m5977(r14, r2, r0)
        L1f7:
            boolean r0 = r1 instanceof p000.eo1
            if (r0 == 0) goto L1fc
            goto L1fd
        L1fc:
            r13 = r1
        L1fd:
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r13 = (com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.ProfileAwemeListResult) r13
            return r13
    }
}
