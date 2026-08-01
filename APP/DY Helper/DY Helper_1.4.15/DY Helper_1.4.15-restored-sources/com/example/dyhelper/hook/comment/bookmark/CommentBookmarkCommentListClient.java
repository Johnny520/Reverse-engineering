package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkCommentListClient {
    public static final int $stable = 0;
    private static final long CAPTURE_PROFILE_VALID_MS = 1800000;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient INSTANCE = null;
    private static final java.lang.String TAG = "r20776a48cef66734";
    private static final java.util.Set<java.lang.Integer> captureHookedLoaders = null;
    private static volatile com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.CapturedLoadMoreProfile capturedProfile;
    private static final java.util.Set<java.lang.String> hookedProxyMethods = null;
    private static volatile long lastCaptureLogAt;
    private static final java.util.List<java.lang.String> loadMoreParamNames = null;
    private static final java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.OfficialFallbackMode> officialFallbackModes = null;
    private static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$selfInvoking$1 selfInvoking = null;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class ArgPlan {
        private final java.lang.Object[] args;
        private final java.lang.String name;

        public ArgPlan(java.lang.String r1, java.lang.Object[] r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r0.<init>()
                r0.name = r1
                r0.args = r2
                return
        }

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.ArgPlan copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.ArgPlan r0, java.lang.String r1, java.lang.Object[] r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.name
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.Object[] r2 = r0.args
            Lc:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$ArgPlan r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r0 = this;
                java.lang.String r0 = r0.name
                return r0
        }

        public final java.lang.Object[] component2() {
                r0 = this;
                java.lang.Object[] r0 = r0.args
                return r0
        }

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.ArgPlan copy(java.lang.String r1, java.lang.Object[] r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$ArgPlan r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$ArgPlan
                r0.<init>(r1, r2)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.ArgPlan
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$ArgPlan r5 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.ArgPlan) r5
                java.lang.String r1 = r4.name
                java.lang.String r3 = r5.name
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.Object[] r4 = r4.args
                java.lang.Object[] r5 = r5.args
                boolean r4 = p000.ln0.m3626(r4, r5)
                if (r4 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final java.lang.Object[] getArgs() {
                r0 = this;
                java.lang.Object[] r0 = r0.args
                return r0
        }

        public final java.lang.String getName() {
                r0 = this;
                java.lang.String r0 = r0.name
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Object[] r1 = r1.args
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.String r0 = r4.name
                java.lang.Object[] r4 = r4.args
                java.lang.String r4 = java.util.Arrays.toString(r4)
                java.lang.String r1 = ", args="
                java.lang.String r2 = ")"
                java.lang.String r3 = "ArgPlan(name="
                java.lang.String r4 = p000.lz1.m3689(r3, r0, r1, r4, r2)
                return r4
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class CapturedLoadMoreProfile {
        private final java.util.List<java.lang.Object> args;
        private final java.lang.String methodKey;
        private final java.util.List<java.lang.String> paramNames;
        private final long timestamp;

        public CapturedLoadMoreProfile(java.lang.String r1, java.util.List<? extends java.lang.Object> r2, java.util.List<java.lang.String> r3, long r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r3.getClass()
                r0.<init>()
                r0.methodKey = r1
                r0.args = r2
                r0.paramNames = r3
                r0.timestamp = r4
                return
        }

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.CapturedLoadMoreProfile copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.CapturedLoadMoreProfile r0, java.lang.String r1, java.util.List r2, java.util.List r3, long r4, int r6, java.lang.Object r7) {
                r7 = r6 & 1
                if (r7 == 0) goto L6
                java.lang.String r1 = r0.methodKey
            L6:
                r7 = r6 & 2
                if (r7 == 0) goto Lc
                java.util.List<java.lang.Object> r2 = r0.args
            Lc:
                r7 = r6 & 4
                if (r7 == 0) goto L12
                java.util.List<java.lang.String> r3 = r0.paramNames
            L12:
                r6 = r6 & 8
                if (r6 == 0) goto L18
                long r4 = r0.timestamp
            L18:
                r6 = r4
                r4 = r2
                r5 = r3
                r2 = r0
                r3 = r1
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$CapturedLoadMoreProfile r0 = r2.copy(r3, r4, r5, r6)
                return r0
        }

        public final java.lang.String component1() {
                r0 = this;
                java.lang.String r0 = r0.methodKey
                return r0
        }

        public final java.util.List<java.lang.Object> component2() {
                r0 = this;
                java.util.List<java.lang.Object> r0 = r0.args
                return r0
        }

        public final java.util.List<java.lang.String> component3() {
                r0 = this;
                java.util.List<java.lang.String> r0 = r0.paramNames
                return r0
        }

        public final long component4() {
                r2 = this;
                long r0 = r2.timestamp
                return r0
        }

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.CapturedLoadMoreProfile copy(java.lang.String r1, java.util.List<? extends java.lang.Object> r2, java.util.List<java.lang.String> r3, long r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r3.getClass()
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$CapturedLoadMoreProfile r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$CapturedLoadMoreProfile
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.CapturedLoadMoreProfile
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$CapturedLoadMoreProfile r6 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.CapturedLoadMoreProfile) r6
                java.lang.String r1 = r5.methodKey
                java.lang.String r3 = r6.methodKey
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.util.List<java.lang.Object> r1 = r5.args
                java.util.List<java.lang.Object> r3 = r6.args
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.util.List<java.lang.String> r1 = r5.paramNames
                java.util.List<java.lang.String> r3 = r6.paramNames
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                long r3 = r5.timestamp
                long r5 = r6.timestamp
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 == 0) goto L36
                return r2
            L36:
                return r0
        }

        public final java.util.List<java.lang.Object> getArgs() {
                r0 = this;
                java.util.List<java.lang.Object> r0 = r0.args
                return r0
        }

        public final java.lang.String getMethodKey() {
                r0 = this;
                java.lang.String r0 = r0.methodKey
                return r0
        }

        public final java.util.List<java.lang.String> getParamNames() {
                r0 = this;
                java.util.List<java.lang.String> r0 = r0.paramNames
                return r0
        }

        public final long getTimestamp() {
                r2 = this;
                long r0 = r2.timestamp
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.methodKey
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.util.List<java.lang.Object> r2 = r3.args
                int r0 = p000.a12.m16(r2, r0, r1)
                java.util.List<java.lang.String> r2 = r3.paramNames
                int r0 = p000.a12.m16(r2, r0, r1)
                long r1 = r3.timestamp
                int r3 = java.lang.Long.hashCode(r1)
                int r3 = r3 + r0
                return r3
        }

        public java.lang.String toString() {
                r6 = this;
                java.lang.String r0 = r6.methodKey
                java.util.List<java.lang.Object> r1 = r6.args
                java.util.List<java.lang.String> r2 = r6.paramNames
                long r3 = r6.timestamp
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r5 = "CapturedLoadMoreProfile(methodKey="
                r6.<init>(r5)
                r6.append(r0)
                java.lang.String r0 = ", args="
                r6.append(r0)
                r6.append(r1)
                java.lang.String r0 = ", paramNames="
                r6.append(r0)
                r6.append(r2)
                java.lang.String r0 = ", timestamp="
                r6.append(r0)
                r6.append(r3)
                java.lang.String r0 = ")"
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                return r6
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class OfficialFallbackMode {
        private final boolean accessAsNull;
        private final boolean includeGroupId;
        private final java.lang.String name;
        private final boolean unknownChannelAsMinusOne;
        private final java.lang.String userAvatarShrink;

        public OfficialFallbackMode(java.lang.String r1, boolean r2, boolean r3, java.lang.String r4, boolean r5) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.name = r1
                r0.accessAsNull = r2
                r0.unknownChannelAsMinusOne = r3
                r0.userAvatarShrink = r4
                r0.includeGroupId = r5
                return
        }

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.OfficialFallbackMode copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.OfficialFallbackMode r0, java.lang.String r1, boolean r2, boolean r3, java.lang.String r4, boolean r5, int r6, java.lang.Object r7) {
                r7 = r6 & 1
                if (r7 == 0) goto L6
                java.lang.String r1 = r0.name
            L6:
                r7 = r6 & 2
                if (r7 == 0) goto Lc
                boolean r2 = r0.accessAsNull
            Lc:
                r7 = r6 & 4
                if (r7 == 0) goto L12
                boolean r3 = r0.unknownChannelAsMinusOne
            L12:
                r7 = r6 & 8
                if (r7 == 0) goto L18
                java.lang.String r4 = r0.userAvatarShrink
            L18:
                r6 = r6 & 16
                if (r6 == 0) goto L1e
                boolean r5 = r0.includeGroupId
            L1e:
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r2 = r0
                r3 = r1
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode r0 = r2.copy(r3, r4, r5, r6, r7)
                return r0
        }

        public final java.lang.String component1() {
                r0 = this;
                java.lang.String r0 = r0.name
                return r0
        }

        public final boolean component2() {
                r0 = this;
                boolean r0 = r0.accessAsNull
                return r0
        }

        public final boolean component3() {
                r0 = this;
                boolean r0 = r0.unknownChannelAsMinusOne
                return r0
        }

        public final java.lang.String component4() {
                r0 = this;
                java.lang.String r0 = r0.userAvatarShrink
                return r0
        }

        public final boolean component5() {
                r0 = this;
                boolean r0 = r0.includeGroupId
                return r0
        }

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.OfficialFallbackMode copy(java.lang.String r1, boolean r2, boolean r3, java.lang.String r4, boolean r5) {
                r0 = this;
                r1.getClass()
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.OfficialFallbackMode
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode r5 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.OfficialFallbackMode) r5
                java.lang.String r1 = r4.name
                java.lang.String r3 = r5.name
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                boolean r1 = r4.accessAsNull
                boolean r3 = r5.accessAsNull
                if (r1 == r3) goto L1e
                return r2
            L1e:
                boolean r1 = r4.unknownChannelAsMinusOne
                boolean r3 = r5.unknownChannelAsMinusOne
                if (r1 == r3) goto L25
                return r2
            L25:
                java.lang.String r1 = r4.userAvatarShrink
                java.lang.String r3 = r5.userAvatarShrink
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L30
                return r2
            L30:
                boolean r4 = r4.includeGroupId
                boolean r5 = r5.includeGroupId
                if (r4 == r5) goto L37
                return r2
            L37:
                return r0
        }

        public final boolean getAccessAsNull() {
                r0 = this;
                boolean r0 = r0.accessAsNull
                return r0
        }

        public final boolean getIncludeGroupId() {
                r0 = this;
                boolean r0 = r0.includeGroupId
                return r0
        }

        public final java.lang.String getName() {
                r0 = this;
                java.lang.String r0 = r0.name
                return r0
        }

        public final boolean getUnknownChannelAsMinusOne() {
                r0 = this;
                boolean r0 = r0.unknownChannelAsMinusOne
                return r0
        }

        public final java.lang.String getUserAvatarShrink() {
                r0 = this;
                java.lang.String r0 = r0.userAvatarShrink
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.name
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                boolean r2 = r3.accessAsNull
                int r0 = p000.lz1.m3678(r0, r1, r2)
                boolean r2 = r3.unknownChannelAsMinusOne
                int r0 = p000.lz1.m3678(r0, r1, r2)
                java.lang.String r2 = r3.userAvatarShrink
                if (r2 != 0) goto L1b
                r2 = 0
                goto L1f
            L1b:
                int r2 = r2.hashCode()
            L1f:
                int r0 = r0 + r2
                int r0 = r0 * r1
                boolean r3 = r3.includeGroupId
                int r3 = java.lang.Boolean.hashCode(r3)
                int r3 = r3 + r0
                return r3
        }

        public java.lang.String toString() {
                r6 = this;
                java.lang.String r0 = r6.name
                boolean r1 = r6.accessAsNull
                boolean r2 = r6.unknownChannelAsMinusOne
                java.lang.String r3 = r6.userAvatarShrink
                boolean r6 = r6.includeGroupId
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "OfficialFallbackMode(name="
                r4.<init>(r5)
                r4.append(r0)
                java.lang.String r0 = ", accessAsNull="
                r4.append(r0)
                r4.append(r1)
                java.lang.String r0 = ", unknownChannelAsMinusOne="
                r4.append(r0)
                r4.append(r2)
                java.lang.String r0 = ", userAvatarShrink="
                r4.append(r0)
                r4.append(r3)
                java.lang.String r0 = ", includeGroupId="
                r4.append(r0)
                java.lang.String r0 = ")"
                java.lang.String r6 = p000.lz1.m3693(r4, r6, r0)
                return r6
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.INSTANCE = r0
            java.lang.String r60 = "is_need_reply_list_exposure"
            java.lang.String r61 = "common_group_id"
            java.lang.String r1 = "aweme_id"
            java.lang.String r2 = "cursor"
            java.lang.String r3 = "count"
            java.lang.String r4 = "insert_ids"
            java.lang.String r5 = "address_book_access"
            java.lang.String r6 = "gps_access"
            java.lang.String r7 = "forward_page_type"
            java.lang.String r8 = "ad_creative_id"
            java.lang.String r9 = "channel_id"
            java.lang.String r10 = "city"
            java.lang.String r11 = "hotsoon_filtered_count"
            java.lang.String r12 = "hotsoon_has_more"
            java.lang.String r13 = "follower_count"
            java.lang.String r14 = "is_familiar"
            java.lang.String r15 = "page_source"
            java.lang.String r16 = "is_fold_list"
            java.lang.String r17 = "user_avatar_shrink"
            java.lang.String r18 = "aweme_author"
            java.lang.String r19 = "item_type"
            java.lang.String r20 = "__extra_info__"
            java.lang.String r21 = "comment_aggregation"
            java.lang.String r22 = "top_query_word"
            java.lang.String r23 = "is_preload"
            java.lang.String r24 = "favorite_comment_timestamp"
            java.lang.String r25 = "channel_ext"
            java.lang.String r26 = "authentication_token"
            java.lang.String r27 = "use_url_optimize"
            java.lang.String r28 = "current_l1_comment_count"
            java.lang.String r29 = "service_id"
            java.lang.String r30 = "group_id"
            java.lang.String r31 = "comment_scene"
            java.lang.String r32 = "hotspot_id"
            java.lang.String r33 = "ad_info"
            java.lang.String r34 = "preload_type"
            java.lang.String r35 = "comment_count"
            java.lang.String r36 = "medium_shrink"
            java.lang.String r37 = "need_management_hint"
            java.lang.String r38 = "highlight_item_id"
            java.lang.String r39 = "highlight_auth_token"
            java.lang.String r40 = "use_light_optimize"
            java.lang.String r41 = "comment_common_aweme_data"
            java.lang.String r42 = "comment_common_user_data"
            java.lang.String r43 = "comment_common_comment_data"
            java.lang.String r44 = "friend_interaction"
            java.lang.String r45 = "session_id"
            java.lang.String r46 = "session_show_cids"
            java.lang.String r47 = "ai_cmt_exposure"
            java.lang.String r48 = "language"
            java.lang.String r49 = "is_familiar_waterfall"
            java.lang.String r50 = "need_whale_async"
            java.lang.String r51 = "is_24_story"
            java.lang.String r52 = "is_25_story"
            java.lang.String r53 = "aweme_type"
            java.lang.String r54 = "rhap_retriever_names"
            java.lang.String r55 = "merge_service_id"
            java.lang.String r56 = "insert_merge_ids"
            java.lang.String r57 = "product_id"
            java.lang.String r58 = "common_flags"
            java.lang.String r59 = "common_data"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.loadMoreParamNames = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.hookedProxyMethods = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.captureHookedLoaders = r0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$selfInvoking$1 r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$selfInvoking$1
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.selfInvoking = r0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode r1 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode
            r5 = 0
            r6 = 0
            java.lang.String r2 = "official_unknown_scene_no_group"
            r3 = 1
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode r2 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode
            r6 = 0
            r7 = 1
            java.lang.String r3 = "official_unknown_scene_with_group"
            r5 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode r3 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode
            java.lang.String r7 = "96_96"
            r8 = 0
            java.lang.String r4 = "official_zero_scene_no_group"
            r5 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode r4 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode
            java.lang.String r8 = "96_96"
            r9 = 1
            java.lang.String r5 = "official_zero_scene_with_group"
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode[] r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.OfficialFallbackMode[]{r1, r2, r3, r4}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.officialFallbackModes = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.$stable = r0
            return
    }

    private CommentBookmarkCommentListClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ long access$getLastCaptureLogAt$p() {
            long r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.lastCaptureLogAt
            return r0
    }

    public static final /* synthetic */ java.util.List access$getLoadMoreParamNames$p() {
            java.util.List<java.lang.String> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.loadMoreParamNames
            return r0
    }

    public static final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$selfInvoking$1 access$getSelfInvoking$p() {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$selfInvoking$1 r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.selfInvoking
            return r0
    }

    public static final /* synthetic */ void access$setCapturedProfile$p(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.CapturedLoadMoreProfile r0) {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.capturedProfile = r0
            return
    }

    public static final /* synthetic */ void access$setLastCaptureLogAt$p(long r0) {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.lastCaptureLogAt = r0
            return
    }

    private final java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.ArgPlan> buildArgPlans(java.lang.reflect.Method r7, java.util.List<java.lang.String> r8, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r9) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$CapturedLoadMoreProfile r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.capturedProfile
            if (r1 == 0) goto L36
            java.util.List r2 = r1.getArgs()
            int r2 = r2.size()
            java.lang.Class[] r3 = r7.getParameterTypes()
            int r3 = r3.length
            if (r2 != r3) goto L36
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.getTimestamp()
            long r2 = r2 - r4
            r4 = 1800000(0x1b7740, double:8.89318E-318)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L36
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$ArgPlan r2 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$ArgPlan
            java.lang.String r3 = "captured_host_profile"
            java.lang.Object[] r6 = r6.buildArgsFromCapturedProfile(r7, r8, r1, r9)
            r2.<init>(r3, r6)
            r0.add(r2)
        L36:
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode> r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.officialFallbackModes
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r6.next()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$OfficialFallbackMode r1 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.OfficialFallbackMode) r1
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$ArgPlan r2 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$ArgPlan
            java.lang.String r3 = r1.getName()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.INSTANCE
            java.lang.Object[] r1 = r4.buildArgsByOfficialSignature(r7, r8, r9, r1)
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L3c
        L5b:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r0.iterator()
        L69:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L94
            java.lang.Object r9 = r8.next()
            r0 = r9
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$ArgPlan r0 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.ArgPlan) r0
            java.lang.Object[] r0 = r0.getArgs()
            gh r1 = new gh
            r2 = 26
            r1.<init>(r2)
            r2 = 30
            java.lang.String r3 = "|"
            r4 = 0
            java.lang.String r0 = p000.AbstractC0312g7.m2256(r0, r3, r4, r1, r2)
            boolean r0 = r6.add(r0)
            if (r0 == 0) goto L69
            r7.add(r9)
            goto L69
        L94:
            return r7
    }

    private static final java.lang.CharSequence buildArgPlans$lambda$18$lambda$17(java.lang.Object r0) {
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.String r0 = "null"
            return r0
    }

    private final java.lang.Object[] buildArgsByOfficialSignature(java.lang.reflect.Method r9, java.util.List<java.lang.String> r10, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r11, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.OfficialFallbackMode r12) {
            r8 = this;
            java.lang.Class[] r8 = r9.getParameterTypes()
            r9 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            int r1 = r8.length
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = r9
        Ld:
            if (r3 >= r1) goto L1fd
            r4 = r8[r3]
            java.lang.Object r5 = p000.AbstractC0984xh.m6641(r3, r10)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            if (r5 == 0) goto L1ee
            int r7 = r5.hashCode()
            switch(r7) {
                case -2141142810: goto L1e6;
                case -2107390546: goto L1e2;
                case -2103723089: goto L1d2;
                case -2053735379: goto L1c9;
                case -2050392689: goto L1c5;
                case -1930808873: goto L1ae;
                case -1925252738: goto L1aa;
                case -1893136453: goto L1a1;
                case -1759186947: goto L19d;
                case -1724763419: goto L199;
                case -1692286118: goto L195;
                case -1637091285: goto L191;
                case -1613589672: goto L18d;
                case -1512022125: goto L17d;
                case -1353964622: goto L173;
                case -1349119146: goto L161;
                case -1252702862: goto L15d;
                case -1247409345: goto L153;
                case -1216595471: goto L14f;
                case -1166231698: goto L145;
                case -1152569526: goto L141;
                case -1120985297: goto L13d;
                case -1106581844: goto L139;
                case -1019096117: goto L12f;
                case -977092112: goto L125;
                case -924492542: goto L11b;
                case -909002181: goto L10b;
                case -876989915: goto L107;
                case -828722786: goto Lfd;
                case -789327545: goto Lef;
                case -710058221: goto Le5;
                case -332433405: goto Le1;
                case -313618100: goto Ldd;
                case -166886555: goto Ld3;
                case -71926506: goto Ld0;
                case -35226582: goto Lcd;
                case 3053931: goto Lc9;
                case 21393713: goto Lbf;
                case 52377082: goto Lbc;
                case 94851343: goto Laa;
                case 274463973: goto La7;
                case 448864051: goto La4;
                case 506361563: goto L8e;
                case 507244185: goto L84;
                case 577252491: goto L81;
                case 658270590: goto L7a;
                case 758301438: goto L70;
                case 767391407: goto L6d;
                case 966493234: goto L5d;
                case 1024781139: goto L5a;
                case 1128053005: goto L57;
                case 1181833204: goto L4d;
                case 1474396491: goto L4a;
                case 1508505916: goto L47;
                case 1545098771: goto L44;
                case 1599944624: goto L41;
                case 1661853540: goto L3e;
                case 1661971725: goto L3b;
                case 1753008747: goto L38;
                case 1759347982: goto L30;
                case 2120910269: goto L23;
                default: goto L21;
            }
        L21:
            goto L1ee
        L23:
            java.lang.String r7 = "need_whale_async"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L2d:
            r6 = r0
            goto L1ee
        L30:
            java.lang.String r7 = "session_show_cids"
        L32:
            boolean r7 = r5.equals(r7)
            goto L1ee
        L38:
            java.lang.String r7 = "product_id"
            goto L32
        L3b:
            java.lang.String r7 = "highlight_auth_token"
            goto L32
        L3e:
            java.lang.String r7 = "session_id"
            goto L32
        L41:
            java.lang.String r7 = "preload_type"
            goto L32
        L44:
            java.lang.String r7 = "medium_shrink"
            goto L32
        L47:
            java.lang.String r7 = "highlight_item_id"
            goto L32
        L4a:
            java.lang.String r7 = "top_query_word"
            goto L32
        L4d:
            java.lang.String r7 = "is_preload"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L57:
            java.lang.String r7 = "is_familiar_waterfall"
            goto L32
        L5a:
            java.lang.String r7 = "favorite_comment_timestamp"
            goto L32
        L5d:
            java.lang.String r7 = "insert_ids"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L67
            goto L1ee
        L67:
            java.lang.String r6 = r11.getCommentId()
            goto L1ee
        L6d:
            java.lang.String r7 = "common_group_id"
            goto L32
        L70:
            java.lang.String r7 = "hotsoon_filtered_count"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L7a:
            java.lang.String r7 = "comment_common_comment_data"
        L7c:
            r5.equals(r7)
            goto L1ee
        L81:
            java.lang.String r7 = "hotspot_id"
            goto L32
        L84:
            java.lang.String r7 = "gps_access"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L1db
            goto L1ee
        L8e:
            java.lang.String r7 = "group_id"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L98
            goto L1ee
        L98:
            boolean r7 = r12.getIncludeGroupId()
            if (r7 == 0) goto L1ee
            java.lang.String r6 = r11.getAwemeId()
            goto L1ee
        La4:
            java.lang.String r7 = "common_flags"
            goto L32
        La7:
            java.lang.String r7 = "channel_ext"
            goto L32
        Laa:
            java.lang.String r7 = "count"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto Lb4
            goto L1ee
        Lb4:
            r6 = 20
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L1ee
        Lbc:
            java.lang.String r7 = "is_familiar"
            goto L7c
        Lbf:
            java.lang.String r7 = "hotsoon_has_more"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        Lc9:
            java.lang.String r7 = "city"
            goto L32
        Lcd:
            java.lang.String r7 = "comment_common_user_data"
            goto L7c
        Ld0:
            java.lang.String r7 = "comment_common_aweme_data"
            goto L7c
        Ld3:
            java.lang.String r7 = "use_url_optimize"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        Ldd:
            java.lang.String r7 = "merge_service_id"
            goto L32
        Le1:
            java.lang.String r7 = "aweme_author"
            goto L32
        Le5:
            java.lang.String r7 = "ai_cmt_exposure"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        Lef:
            java.lang.String r7 = "is_fold_list"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto Lf9
            goto L1ee
        Lf9:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L1ee
        Lfd:
            java.lang.String r7 = "use_light_optimize"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L107:
            java.lang.String r7 = "rhap_retriever_names"
            goto L32
        L10b:
            java.lang.String r7 = "user_avatar_shrink"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L115
            goto L1ee
        L115:
            java.lang.String r6 = r12.getUserAvatarShrink()
            goto L1ee
        L11b:
            java.lang.String r7 = "comment_aggregation"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L125:
            java.lang.String r7 = "forward_page_type"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L1b7
            goto L1ee
        L12f:
            java.lang.String r7 = "page_source"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L139:
            java.lang.String r7 = "comment_scene"
            goto L32
        L13d:
            java.lang.String r7 = "comment_count"
            goto L32
        L141:
            java.lang.String r7 = "ad_info"
            goto L32
        L145:
            java.lang.String r7 = "is_25_story"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L14f:
            java.lang.String r7 = "friend_interaction"
            goto L32
        L153:
            java.lang.String r7 = "is_need_reply_list_exposure"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L15d:
            java.lang.String r7 = "authentication_token"
            goto L32
        L161:
            java.lang.String r7 = "cursor"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L16b
            goto L1ee
        L16b:
            r6 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L1ee
        L173:
            java.lang.String r7 = "aweme_type"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L17d:
            java.lang.String r7 = "aweme_id"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L187
            goto L1ee
        L187:
            java.lang.String r6 = r11.getAwemeId()
            goto L1ee
        L18d:
            java.lang.String r7 = "language"
            goto L32
        L191:
            java.lang.String r7 = "insert_merge_ids"
            goto L32
        L195:
            java.lang.String r7 = "need_management_hint"
            goto L32
        L199:
            java.lang.String r7 = "service_id"
            goto L32
        L19d:
            java.lang.String r7 = "__extra_info__"
            goto L32
        L1a1:
            java.lang.String r7 = "current_l1_comment_count"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L1aa:
            java.lang.String r7 = "common_data"
            goto L32
        L1ae:
            java.lang.String r7 = "channel_id"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L1b7
            goto L1ee
        L1b7:
            boolean r6 = r12.getUnknownChannelAsMinusOne()
            if (r6 == 0) goto L1bf
            r6 = -1
            goto L1c0
        L1bf:
            r6 = r9
        L1c0:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L1ee
        L1c5:
            java.lang.String r7 = "ad_creative_id"
            goto L32
        L1c9:
            java.lang.String r7 = "is_24_story"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
            goto L1ee
        L1d2:
            java.lang.String r7 = "address_book_access"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L1db
            goto L1ee
        L1db:
            boolean r7 = r12.getAccessAsNull()
            if (r7 == 0) goto L2d
            goto L1ee
        L1e2:
            java.lang.String r7 = "follower_count"
            goto L7c
        L1e6:
            java.lang.String r7 = "item_type"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L2d
        L1ee:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r7 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            r4.getClass()
            java.lang.Object r4 = r7.coerceValue(r6, r4, r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto Ld
        L1fd:
            return r2
    }

    private final java.lang.Object[] buildArgsFromCapturedProfile(java.lang.reflect.Method r8, java.util.List<java.lang.String> r9, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.CapturedLoadMoreProfile r10, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r11) {
            r7 = this;
            java.lang.Class[] r7 = r8.getParameterTypes()
            int r8 = r7.length
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r1 = 0
            r2 = r1
        L9:
            if (r2 >= r8) goto Lb7
            r3 = r7[r2]
            java.lang.Object r4 = p000.AbstractC0984xh.m6641(r2, r9)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto La0
            int r5 = r4.hashCode()
            switch(r5) {
                case -1759186947: goto L95;
                case -1512022125: goto L87;
                case -1349119146: goto L77;
                case -332433405: goto L6e;
                case 94851343: goto L5e;
                case 506361563: goto L50;
                case 966493234: goto L42;
                case 1024781139: goto L38;
                case 1181833204: goto L28;
                case 1474396491: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto La0
        L1e:
            java.lang.String r5 = "top_query_word"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L9e
            goto La0
        L28:
            java.lang.String r5 = "is_preload"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L32
            goto La0
        L32:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            goto La8
        L38:
            java.lang.String r5 = "favorite_comment_timestamp"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L9e
            goto La0
        L42:
            java.lang.String r5 = "insert_ids"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L4b
            goto La0
        L4b:
            java.lang.String r5 = r11.getCommentId()
            goto La8
        L50:
            java.lang.String r5 = "group_id"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L59
            goto La0
        L59:
            java.lang.String r5 = r11.getAwemeId()
            goto La8
        L5e:
            java.lang.String r5 = "count"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L67
            goto La0
        L67:
            r5 = 20
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto La8
        L6e:
            java.lang.String r5 = "aweme_author"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L9e
            goto La0
        L77:
            java.lang.String r5 = "cursor"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L80
            goto La0
        L80:
            r5 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto La8
        L87:
            java.lang.String r5 = "aweme_id"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L90
            goto La0
        L90:
            java.lang.String r5 = r11.getAwemeId()
            goto La8
        L95:
            java.lang.String r5 = "__extra_info__"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L9e
            goto La0
        L9e:
            r5 = 0
            goto La8
        La0:
            java.util.List r5 = r10.getArgs()
            java.lang.Object r5 = p000.AbstractC0984xh.m6641(r2, r5)
        La8:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            r3.getClass()
            java.lang.Object r3 = r6.coerceValue(r5, r3, r4)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L9
        Lb7:
            return r0
    }

    private final void installProxyCaptureHook(java.lang.reflect.Method r11, java.lang.Object r12) {
            r10 = this;
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r10.add(r11)
            java.lang.Class r12 = r12.getClass()
            java.lang.reflect.Method[] r12 = r12.getMethods()
            r12.getClass()
            int r0 = r12.length
            r1 = 0
            r2 = r1
        L16:
            if (r2 >= r0) goto L3a
            r3 = r12[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = r11.getName()
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L37
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.Class[] r5 = r11.getParameterTypes()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L37
            goto L3b
        L37:
            int r2 = r2 + 1
            goto L16
        L3a:
            r3 = 0
        L3b:
            if (r3 == 0) goto L40
            r10.add(r3)
        L40:
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L4e:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r10.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.String r3 = r4.stableKey(r3)
            boolean r3 = r12.add(r3)
            if (r3 == 0) goto L4e
            r0.add(r2)
            goto L4e
        L6b:
            java.util.Iterator r10 = r0.iterator()
            r12 = r1
            r0 = r12
            r2 = r0
        L72:
            boolean r3 = r10.hasNext()
            java.lang.String r4 = "r20776a48cef66734"
            if (r3 == 0) goto Le4
            java.lang.Object r3 = r10.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.String r5 = r5.stableKey(r3)
            java.util.Set<java.lang.String> r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.hookedProxyMethods
            boolean r7 = r6.add(r5)
            if (r7 != 0) goto L91
            int r0 = r0 + 1
            goto L72
        L91:
            int r7 = r3.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isAbstract(r7)
            if (r7 == 0) goto La1
            int r12 = r12 + 1
            r6.remove(r5)
            goto L72
        La1:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.INSTANCE
            r7 = 1
            r3.setAccessible(r7)     // Catch: java.lang.Throwable -> Lba
            xq0 r7 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Lba
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1 r8 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$installProxyCaptureHook$4$1$1     // Catch: java.lang.Throwable -> Lba
            r8.<init>(r11, r6)     // Catch: java.lang.Throwable -> Lba
            r7.m6775(r3, r8)     // Catch: java.lang.Throwable -> Lba
            int r3 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lb8
            goto Lc4
        Lb8:
            r1 = move-exception
            goto Lbe
        Lba:
            r3 = move-exception
            r9 = r3
            r3 = r1
            r1 = r9
        Lbe:
            eo1 r6 = new eo1
            r6.<init>(r1)
            r1 = r6
        Lc4:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto Le2
            int r2 = r2 + 1
            java.util.Set<java.lang.String> r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.hookedProxyMethods
            r6.remove(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "hook loadMore capture failed: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            p000.C0888ux.m5977(r4, r5, r1)
        Le2:
            r1 = r3
            goto L72
        Le4:
            if (r1 > 0) goto Lea
            if (r12 > 0) goto Lea
            if (r2 <= 0) goto L119
        Lea:
            java.lang.Class r10 = r11.getDeclaringClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = r11.getName()
            java.lang.String r3 = "#"
            java.lang.String r5 = ", hooked="
            java.lang.String r6 = "proxy capture hook summary: target="
            java.lang.StringBuilder r10 = p000.lz1.m3695(r6, r10, r3, r11, r5)
            java.lang.String r11 = ", duplicate="
            java.lang.String r3 = ", abstract="
            p000.AbstractC0602nx.m4117(r10, r1, r11, r0, r3)
            r10.append(r12)
            java.lang.String r11 = ", failed="
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            p000.C0888ux.m5975(r4, r10)
        L119:
            return
    }

    private final java.lang.Object invokeLoadMore(java.lang.reflect.Method r3, java.lang.Object r4, java.lang.Object[] r5) {
            r2 = this;
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$selfInvoking$1 r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.selfInvoking
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.set(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE     // Catch: java.lang.Throwable -> L18
            int r1 = r5.length     // Catch: java.lang.Throwable -> L18
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r0.invokeUnwrap(r3, r4, r5)     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r2.set(r4)
            return r3
        L18:
            r2 = move-exception
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$selfInvoking$1 r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.selfInvoking
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.set(r4)
            throw r2
    }

    private static final java.lang.CharSequence loadInsertedCommentList$lambda$5(java.lang.reflect.Method r5) {
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

    private final void logInvokePlan(java.lang.reflect.Method r8, java.util.List<java.lang.String> r9, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.ArgPlan r10) {
            r7 = this;
            java.lang.String r7 = r10.getName()
            java.lang.Class r0 = r8.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r8.getName()
            java.lang.Class r2 = r8.getReturnType()
            java.lang.String r2 = r2.getName()
            java.lang.Class[] r8 = r8.getParameterTypes()
            r8.getClass()
            gh r3 = new gh
            r4 = 25
            r3.<init>(r4)
            r4 = 31
            r5 = 0
            java.lang.String r8 = p000.AbstractC0312g7.m2256(r8, r5, r5, r3, r4)
            java.lang.String r3 = ", method="
            java.lang.String r4 = "#"
            java.lang.String r6 = "invoke loadMore plan="
            java.lang.StringBuilder r7 = p000.lz1.m3695(r6, r7, r3, r0, r4)
            java.lang.String r0 = ", return="
            java.lang.String r3 = ", paramTypes="
            p000.AbstractC0602nx.m4119(r7, r1, r0, r2, r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 4
            java.lang.String r0 = "r20776a48cef66734"
            p000.C0888ux.m5988(r0, r7, r5, r8, r5)
            java.lang.Object[] r7 = r10.getArgs()
            int r8 = r7.length
            r10 = 0
            r0 = r10
        L52:
            if (r10 >= r8) goto L67
            r1 = r7[r10]
            int r2 = r0 + 1
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.INSTANCE
            java.lang.Object r0 = p000.AbstractC0984xh.m6641(r0, r9)
            java.lang.String r0 = (java.lang.String) r0
            r3.maskArg(r0, r1)
            int r10 = r10 + 1
            r0 = r2
            goto L52
        L67:
            return
    }

    private static final java.lang.CharSequence logInvokePlan$lambda$19(java.lang.Class r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    private final java.lang.Object maskArg(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            if (r3 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r2 == 0) goto L4e
            int r1 = r2.hashCode()
            switch(r1) {
                case -1951220275: goto L29;
                case -1252702862: goto L20;
                case -1105295335: goto L17;
                case 1661971725: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L4e
        Le:
            java.lang.String r1 = "highlight_auth_token"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L31
            goto L4e
        L17:
            java.lang.String r1 = "comment_token"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L31
            goto L4e
        L20:
            java.lang.String r1 = "authentication_token"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L31
            goto L4e
        L29:
            java.lang.String r1 = "item_token"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L4e
        L31:
            java.lang.String r1 = r3.toString()
            int r2 = r1.length()
            r3 = 12
            java.lang.String r0 = "***"
            if (r2 > r3) goto L40
            return r0
        L40:
            r2 = 6
            java.lang.String r2 = p000.q02.m4693(r1, r2)
            java.lang.String r1 = p000.q02.m4659(r1)
            java.lang.String r1 = p000.lz1.m3688(r2, r0, r1)
            return r1
        L4e:
            return r3
    }

    private final java.util.List<java.lang.reflect.Method> sortMethodsByCapturedProfile(java.util.List<java.lang.reflect.Method> r2) {
            r1 = this;
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$CapturedLoadMoreProfile r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.capturedProfile
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1 r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1
            r0.<init>(r1)
            java.util.List r1 = p000.AbstractC0984xh.m6658(r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ java.lang.CharSequence m1409(java.lang.Object r0) {
            java.lang.CharSequence r0 = buildArgPlans$lambda$18$lambda$17(r0)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ java.lang.CharSequence m1410(java.lang.Class r0) {
            java.lang.CharSequence r0 = logInvokePlan$lambda$19(r0)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ java.lang.CharSequence m1411(java.lang.reflect.Method r0) {
            java.lang.CharSequence r0 = loadInsertedCommentList$lambda$5(r0)
            return r0
    }

    public final void installCaptureHooks(java.lang.ClassLoader r10, boolean r11) {
            r9 = this;
            r10.getClass()
            int r9 = java.lang.System.identityHashCode(r10)
            java.util.Set<java.lang.Integer> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.captureHookedLoaders
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            boolean r1 = r0.add(r1)
            if (r1 != 0) goto L14
            return
        L14:
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r1 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.util.List r10 = r1.resolveLoadMoreCommentMethods(r10, r11)
            boolean r1 = r10.isEmpty()
            java.lang.String r2 = "r20776a48cef66734"
            if (r1 == 0) goto L3b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.remove(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "loadMore capture methods empty, allowDexKitScan="
            r9.<init>(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            p000.C0888ux.m5975(r2, r9)
            return
        L3b:
            java.util.Iterator r11 = r10.iterator()
            r0 = 0
            r1 = r0
            r3 = r1
        L42:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L95
            java.lang.Object r4 = r11.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.INSTANCE
            r6 = 1
            r4.setAccessible(r6)     // Catch: java.lang.Throwable -> L6e
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE     // Catch: java.lang.Throwable -> L6e
            java.lang.Class r7 = r4.getDeclaringClass()     // Catch: java.lang.Throwable -> L6e
            r7.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r6.resolveApiInstance(r7)     // Catch: java.lang.Throwable -> L6e
            if (r6 != 0) goto L66
            int r1 = r1 + 1
            goto L42
        L66:
            int r0 = r0 + 1
            r5.installProxyCaptureHook(r4, r6)     // Catch: java.lang.Throwable -> L6e
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L6e
            goto L75
        L6e:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L75:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L42
            java.lang.Class r6 = r4.getDeclaringClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r4 = r4.getName()
            java.lang.String r7 = "install capture hook failed for "
            java.lang.String r8 = "#"
            java.lang.String r4 = p000.a12.m18(r7, r6, r8, r4)
            p000.C0888ux.m5977(r2, r4, r5)
            int r3 = r3 + 1
            goto L42
        L95:
            if (r0 != 0) goto La0
            java.util.Set<java.lang.Integer> r11 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.captureHookedLoaders
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.remove(r9)
        La0:
            int r9 = r10.size()
            java.lang.String r10 = ", apiResolved="
            java.lang.String r11 = ", apiMissing="
            java.lang.String r4 = "loadMore capture hooks installed: resolved="
            java.lang.StringBuilder r9 = p000.AbstractC0602nx.m4136(r4, r9, r10, r0, r11)
            r9.append(r1)
            java.lang.String r10 = ", failed="
            r9.append(r10)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            p000.C0888ux.m5975(r2, r9)
            return
    }

    public final boolean isInvalidRequestError(java.lang.Throwable r1) {
            r0 = this;
            r1.getClass()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            boolean r0 = r0.isInvalidParamServerError(r1)
            return r0
    }

    public final java.lang.Object loadInsertedCommentList(java.lang.ClassLoader r19, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = ", response="
            java.lang.String r3 = "#"
            java.lang.String r4 = ", method="
            java.lang.String r5 = ", plan="
            r1.getClass()
            r20.getClass()
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r6 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            r7 = 1
            java.util.List r6 = r6.resolveLoadMoreCommentMethods(r1, r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L22:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L3f
            java.lang.Object r9 = r6.next()
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "fetchCommentListV2Stream"
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 != 0) goto L22
            r8.add(r9)
            goto L22
        L3f:
            int r6 = r8.size()
            gh r13 = new gh
            r9 = 27
            r13.<init>(r9)
            r14 = 23
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 8
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r8, r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "loadInsertedCommentList methods="
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r6 = ", "
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = r10.toString()
            java.lang.String r9 = "r20776a48cef66734"
            r10 = 0
            r11 = 4
            p000.C0888ux.m5988(r9, r6, r10, r11, r10)
            boolean r6 = r8.isEmpty()
            if (r6 != 0) goto L1ec
            r6 = 0
            r0.installCaptureHooks(r1, r6)
            java.util.List r0 = r0.sortMethodsByCapturedProfile(r8)
            java.util.Iterator r1 = r0.iterator()
            r0 = r10
        L85:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L1e2
            java.lang.Object r6 = r1.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r7)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r8 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.Class r12 = r6.getDeclaringClass()
            r12.getClass()
            java.lang.Object r12 = r8.resolveApiInstance(r12)
            if (r12 != 0) goto Lba
            java.lang.Class r6 = r6.getDeclaringClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = "resolveApiInstance failed for "
            java.lang.String r6 = r8.concat(r6)
            p000.C0888ux.m5988(r9, r6, r10, r11, r10)
            r14 = r20
        Lb6:
            r19 = r1
            goto L1db
        Lba:
            java.util.List<java.lang.String> r13 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.loadMoreParamNames
            java.util.List r8 = r8.resolveParamNames(r6, r13)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient r13 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.INSTANCE
            r14 = r20
            java.util.List r13 = r13.buildArgPlans(r6, r8, r14)
            java.util.Iterator r13 = r13.iterator()
        Lcc:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto Lb6
            java.lang.Object r15 = r13.next()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient$ArgPlan r15 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.ArgPlan) r15
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient r7 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkCommentListClient.INSTANCE
            r7.logInvokePlan(r6, r8, r15)
            java.lang.Object[] r10 = r15.getArgs()     // Catch: java.lang.Throwable -> L129
            java.lang.Object r7 = r7.invokeLoadMore(r6, r12, r10)     // Catch: java.lang.Throwable -> L129
            if (r7 != 0) goto Lef
            r19 = r1
            r16 = r6
            r17 = r8
            goto L1d0
        Lef:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE     // Catch: java.lang.Throwable -> L129
            java.lang.Object r0 = r0.awaitNetworkResult(r7)     // Catch: java.lang.Throwable -> L129
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r7 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L129
            java.lang.String r10 = r14.getCommentId()     // Catch: java.lang.Throwable -> L129
            java.lang.Object r7 = r7.findCommentObjectById(r0, r10)     // Catch: java.lang.Throwable -> L129
            if (r7 == 0) goto L102
            return r0
        L102:
            java.lang.String r7 = r14.getCommentId()     // Catch: java.lang.Throwable -> L129
            java.lang.Class r10 = r6.getDeclaringClass()     // Catch: java.lang.Throwable -> L129
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> L129
            java.lang.String r11 = r6.getName()     // Catch: java.lang.Throwable -> L129
            r18 = r0
            java.lang.String r0 = r15.getName()     // Catch: java.lang.Throwable -> L129
            if (r18 == 0) goto L132
            java.lang.Class r16 = r18.getClass()     // Catch: java.lang.Throwable -> L129
            java.lang.String r16 = r16.getName()     // Catch: java.lang.Throwable -> L129
            r19 = r1
            r1 = r16
        L126:
            r16 = r6
            goto L136
        L129:
            r0 = move-exception
            r19 = r1
            r16 = r6
        L12e:
            r17 = r8
            goto L1ab
        L132:
            r19 = r1
            r1 = 0
            goto L126
        L136:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a9
            r6.<init>()     // Catch: java.lang.Throwable -> L1a9
            r17 = r8
            java.lang.String r8 = "comment not found in this response, continue fallback, cid="
            r6.append(r8)     // Catch: java.lang.Throwable -> L17f
            r6.append(r7)     // Catch: java.lang.Throwable -> L17f
            r6.append(r4)     // Catch: java.lang.Throwable -> L17f
            r6.append(r10)     // Catch: java.lang.Throwable -> L17f
            r6.append(r3)     // Catch: java.lang.Throwable -> L17f
            r6.append(r11)     // Catch: java.lang.Throwable -> L17f
            r6.append(r5)     // Catch: java.lang.Throwable -> L17f
            r6.append(r0)     // Catch: java.lang.Throwable -> L17f
            r6.append(r2)     // Catch: java.lang.Throwable -> L17f
            r6.append(r1)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L17f
            r1 = 4
            r6 = 0
            p000.C0888ux.m5988(r9, r0, r6, r1, r6)     // Catch: java.lang.Throwable -> L17f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17f
            java.lang.String r7 = r14.getCommentId()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r8 = r16.getName()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r10 = r15.getName()     // Catch: java.lang.Throwable -> L17f
            if (r18 == 0) goto L181
            java.lang.Class r11 = r18.getClass()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r11 = r11.getName()     // Catch: java.lang.Throwable -> L17f
            goto L182
        L17f:
            r0 = move-exception
            goto L1ab
        L181:
            r11 = r6
        L182:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17f
            r1.<init>()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "comment not found in response, cid="
            r1.append(r6)     // Catch: java.lang.Throwable -> L17f
            r1.append(r7)     // Catch: java.lang.Throwable -> L17f
            r1.append(r4)     // Catch: java.lang.Throwable -> L17f
            r1.append(r8)     // Catch: java.lang.Throwable -> L17f
            r1.append(r5)     // Catch: java.lang.Throwable -> L17f
            r1.append(r10)     // Catch: java.lang.Throwable -> L17f
            r1.append(r2)     // Catch: java.lang.Throwable -> L17f
            r1.append(r11)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17f
            goto L1d0
        L1a9:
            r0 = move-exception
            goto L12e
        L1ab:
            java.lang.Class r1 = r16.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r6 = r16.getName()
            java.lang.String r7 = r15.getName()
            java.lang.String r8 = "loadMore failed, method="
            java.lang.StringBuilder r1 = p000.lz1.m3695(r8, r1, r3, r6, r5)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            p000.C0888ux.m5977(r9, r1, r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            r1.isInvalidParamServerError(r0)
        L1d0:
            r1 = r19
            r6 = r16
            r8 = r17
            r7 = 1
            r10 = 0
            r11 = 4
            goto Lcc
        L1db:
            r1 = r19
            r7 = 1
            r10 = 0
            r11 = 4
            goto L85
        L1e2:
            if (r0 != 0) goto L1eb
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "loadMoreComments failed"
            r0.<init>(r1)
        L1eb:
            throw r0
        L1ec:
            java.lang.String r0 = "comment list api method not found"
            p000.ql1.m4936(r0)
            r0 = 0
            return r0
    }
}
