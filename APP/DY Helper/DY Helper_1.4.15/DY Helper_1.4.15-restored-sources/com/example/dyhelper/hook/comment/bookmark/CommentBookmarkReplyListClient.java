package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkReplyListClient {
    public static final int $stable = 0;
    private static final long CAPTURE_PROFILE_VALID_MS = 1800000;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient INSTANCE = null;
    private static final java.lang.String TAG = "r70ac498a2ca77555";
    private static volatile com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.CapturedLoadMoreProfile capturedProfile;
    private static final java.util.Set<java.lang.String> hookedProxyMethods = null;
    private static volatile long lastCaptureLogAt;
    private static final java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode> officialFallbackModes = null;
    private static final java.util.List<java.lang.String> replyListParamNames = null;
    private static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$selfInvoking$1 selfInvoking = null;

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

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan r0, java.lang.String r1, java.lang.Object[] r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.name
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.Object[] r2 = r0.args
            Lc:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r0 = r0.copy(r1, r2)
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

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan copy(java.lang.String r1, java.lang.Object[] r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan
                r0.<init>(r1, r2)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r5 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan) r5
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

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.CapturedLoadMoreProfile copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.CapturedLoadMoreProfile r0, java.lang.String r1, java.util.List r2, java.util.List r3, long r4, int r6, java.lang.Object r7) {
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
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$CapturedLoadMoreProfile r0 = r2.copy(r3, r4, r5, r6)
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

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.CapturedLoadMoreProfile copy(java.lang.String r1, java.util.List<? extends java.lang.Object> r2, java.util.List<java.lang.String> r3, long r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r3.getClass()
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$CapturedLoadMoreProfile r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$CapturedLoadMoreProfile
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.CapturedLoadMoreProfile
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$CapturedLoadMoreProfile r6 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.CapturedLoadMoreProfile) r6
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

        public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode r0, java.lang.String r1, boolean r2, boolean r3, java.lang.String r4, boolean r5, int r6, java.lang.Object r7) {
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
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode r0 = r2.copy(r3, r4, r5, r6, r7)
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

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode copy(java.lang.String r1, boolean r2, boolean r3, java.lang.String r4, boolean r5) {
                r0 = this;
                r1.getClass()
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode r5 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode) r5
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
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE = r0
            java.lang.String r44 = "common_data"
            java.lang.String r45 = "merge_cursor"
            java.lang.String r1 = "comment_id"
            java.lang.String r2 = "cursor"
            java.lang.String r3 = "count"
            java.lang.String r4 = "top_ids"
            java.lang.String r5 = "item_id"
            java.lang.String r6 = "insert_ids"
            java.lang.String r7 = "two_level_insert_ids"
            java.lang.String r8 = "channel_id"
            java.lang.String r9 = "city"
            java.lang.String r10 = "follower_count"
            java.lang.String r11 = "is_familiar"
            java.lang.String r12 = "user_avatar_shrink"
            java.lang.String r13 = "aweme_author"
            java.lang.String r14 = "item_type"
            java.lang.String r15 = "top_query_word"
            java.lang.String r16 = "comment_level"
            java.lang.String r17 = "channel_ext"
            java.lang.String r18 = "authentication_token"
            java.lang.String r19 = "use_url_optimize"
            java.lang.String r20 = "comment_uid"
            java.lang.String r21 = "service_id"
            java.lang.String r22 = "group_id"
            java.lang.String r23 = "comment_scene"
            java.lang.String r24 = "hotspot_id"
            java.lang.String r25 = "ad_info"
            java.lang.String r26 = "medium_shrink"
            java.lang.String r27 = "viewed_comments"
            java.lang.String r28 = "highlight_item_id"
            java.lang.String r29 = "highlight_auth_token"
            java.lang.String r30 = "comment_token"
            java.lang.String r31 = "preload_type"
            java.lang.String r32 = "use_light_optimize"
            java.lang.String r33 = "comment_common_aweme_data"
            java.lang.String r34 = "comment_common_user_data"
            java.lang.String r35 = "comment_common_comment_data"
            java.lang.String r36 = "ai_cmt_exposure"
            java.lang.String r37 = "language"
            java.lang.String r38 = "need_whale_async"
            java.lang.String r39 = "is_24_story"
            java.lang.String r40 = "is_25_story"
            java.lang.String r41 = "aweme_type"
            java.lang.String r42 = "rhap_retriever_names"
            java.lang.String r43 = "common_flags"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.replyListParamNames = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.hookedProxyMethods = r0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$selfInvoking$1 r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$selfInvoking$1
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.selfInvoking = r0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode r1 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode
            r5 = 0
            r6 = 0
            java.lang.String r2 = "official_unknown_scene_no_group"
            r3 = 1
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode r2 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode
            r6 = 0
            r7 = 1
            java.lang.String r3 = "official_unknown_scene_with_group"
            r5 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode r3 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode
            java.lang.String r7 = "96_96"
            r8 = 0
            java.lang.String r4 = "official_zero_scene_no_group"
            r5 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode r4 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode
            java.lang.String r8 = "96_96"
            r9 = 1
            java.lang.String r5 = "official_zero_scene_with_group"
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode[] r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode[]{r1, r2, r3, r4}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.officialFallbackModes = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.$stable = r0
            return
    }

    private CommentBookmarkReplyListClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ long access$getLastCaptureLogAt$p() {
            long r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.lastCaptureLogAt
            return r0
    }

    public static final /* synthetic */ java.util.List access$getReplyListParamNames$p() {
            java.util.List<java.lang.String> r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.replyListParamNames
            return r0
    }

    public static final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$selfInvoking$1 access$getSelfInvoking$p() {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$selfInvoking$1 r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.selfInvoking
            return r0
    }

    public static final /* synthetic */ void access$setCapturedProfile$p(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.CapturedLoadMoreProfile r0) {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.capturedProfile = r0
            return
    }

    public static final /* synthetic */ void access$setLastCaptureLogAt$p(long r0) {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.lastCaptureLogAt = r0
            return
    }

    private final java.lang.Object awaitNetworkResult(java.lang.Object r1) {
            r0 = this;
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.Object r0 = r0.awaitNetworkResult(r1)
            return r0
    }

    private final java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan> buildArgPlans(java.lang.reflect.Method r7, java.util.List<java.lang.String> r8, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r9) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$CapturedLoadMoreProfile r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.capturedProfile
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
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r2 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan
            java.lang.String r3 = "captured_host_profile"
            java.lang.Object[] r6 = r6.buildArgsFromCapturedProfile(r7, r8, r1, r9)
            r2.<init>(r3, r6)
            r0.add(r2)
        L36:
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode> r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.officialFallbackModes
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r6.next()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode r1 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode) r1
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r2 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan
            java.lang.String r3 = r1.getName()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
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
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r0 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan) r0
            java.lang.Object[] r0 = r0.getArgs()
            uj r1 = new uj
            r2 = 15
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

    private static final java.lang.CharSequence buildArgPlans$lambda$17$lambda$16(java.lang.Object r0) {
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.String r0 = "null"
            return r0
    }

    private final java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan> buildArgPlansForReplyList(java.lang.reflect.Method r10, java.util.List<java.lang.String> r11, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r12, int r13) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$CapturedLoadMoreProfile r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.capturedProfile
            if (r4 == 0) goto L3e
            java.util.List r1 = r4.getArgs()
            int r1 = r1.size()
            java.lang.Class[] r2 = r10.getParameterTypes()
            int r2 = r2.length
            if (r1 != r2) goto L3e
            long r1 = java.lang.System.currentTimeMillis()
            long r5 = r4.getTimestamp()
            long r1 = r1 - r5
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L3e
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r7 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan
            java.lang.String r8 = "captured_host_profile_reply"
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            java.lang.Object[] r9 = r1.buildArgsFromCapturedProfileForReply(r2, r3, r4, r5, r6)
            r4 = r5
            r5 = r6
            r7.<init>(r8, r9)
            r0.add(r7)
            goto L42
        L3e:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
        L42:
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode> r9 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.officialFallbackModes
            java.util.Iterator r9 = r9.iterator()
        L48:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L6e
            java.lang.Object r10 = r9.next()
            r6 = r10
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$OfficialFallbackMode r6 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode) r6
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r10 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan
            java.lang.String r11 = r6.getName()
            java.lang.String r12 = "_reply"
            java.lang.String r11 = p000.AbstractC0602nx.m4129(r11, r12)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            java.lang.Object[] r12 = r1.buildArgsByOfficialSignatureForReply(r2, r3, r4, r5, r6)
            r10.<init>(r11, r12)
            r0.add(r10)
            goto L48
        L6e:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r0.iterator()
        L7c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto La7
            java.lang.Object r12 = r11.next()
            r13 = r12
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r13 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan) r13
            java.lang.Object[] r13 = r13.getArgs()
            uj r0 = new uj
            r1 = 16
            r0.<init>(r1)
            r1 = 30
            java.lang.String r2 = "|"
            r3 = 0
            java.lang.String r13 = p000.AbstractC0312g7.m2256(r13, r2, r3, r0, r1)
            boolean r13 = r9.add(r13)
            if (r13 == 0) goto L7c
            r10.add(r12)
            goto L7c
        La7:
            return r10
    }

    private static final java.lang.CharSequence buildArgPlansForReplyList$lambda$34$lambda$33(java.lang.Object r0) {
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.String r0 = "null"
            return r0
    }

    private final java.lang.Object[] buildArgsByOfficialSignature(java.lang.reflect.Method r9, java.util.List<java.lang.String> r10, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r11, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode r12) {
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

    private final java.lang.Object[] buildArgsByOfficialSignatureForReply(java.lang.reflect.Method r30, java.util.List<java.lang.String> r31, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r32, int r33, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.OfficialFallbackMode r34) {
            r29 = this;
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Class[] r1 = r30.getParameterTypes()
            java.lang.String r2 = r30.getName()
            java.lang.String r3 = "fetchReplyTreeListPOST"
            boolean r2 = p000.ln0.m3626(r2, r3)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            int r5 = r1.length
            java.lang.Object[] r6 = new java.lang.Object[r5]
        L1c:
            if (r3 >= r5) goto L3b0
            r7 = r1[r3]
            r8 = r31
            java.lang.Object r9 = p000.AbstractC0984xh.m6641(r3, r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "aweme_author"
            java.lang.String r11 = "use_url_optimize"
            java.lang.String r12 = "comment_common_aweme_data"
            java.lang.String r13 = "comment_common_user_data"
            java.lang.String r14 = "city"
            java.lang.String r15 = "is_familiar"
            r29 = r0
            java.lang.String r0 = "count"
            r33 = r1
            java.lang.String r1 = "channel_ext"
            r34 = r2
            java.lang.String r2 = "group_id"
            r16 = r3
            java.lang.String r3 = "hotspot_id"
            r17 = r4
            java.lang.String r4 = "comment_common_comment_data"
            r18 = r5
            java.lang.String r5 = "comment_id"
            r19 = r6
            java.lang.String r6 = "insert_ids"
            java.lang.String r8 = "top_query_word"
            r20 = r7
            java.lang.String r7 = "medium_shrink"
            r21 = r10
            java.lang.String r10 = "item_id"
            r22 = r11
            java.lang.String r11 = "need_whale_async"
            java.lang.String r23 = "1"
            java.lang.String r24 = ""
            r25 = 0
            if (r34 == 0) goto L1f9
            if (r9 == 0) goto Lb4
            int r26 = r9.hashCode()
            switch(r26) {
                case -2141142810: goto L1ef;
                case -2107390546: goto L1e5;
                case -2053735379: goto L1db;
                case -1930808873: goto L1d1;
                case -1724763419: goto L1c7;
                case -1613589672: goto L1c3;
                case -1353964622: goto L1b9;
                case -1349119146: goto L1a7;
                case -1252702862: goto L19d;
                case -1166231698: goto L193;
                case -1152569526: goto L18f;
                case -1139551026: goto L185;
                case -1112970844: goto L181;
                case -1106581844: goto L177;
                case -1105295335: goto L16d;
                case -909002181: goto L150;
                case -828722786: goto L146;
                case -332433405: goto L120;
                case -166886555: goto L117;
                case -71926506: goto L112;
                case -35226582: goto L10d;
                case 3053931: goto Lf3;
                case 52377082: goto Lec;
                case 94851343: goto Le1;
                case 274463973: goto Ldc;
                case 506361563: goto Ld5;
                case 577252491: goto Ld0;
                case 658270590: goto Lcb;
                case 899150587: goto Lbf;
                case 966493234: goto Lb8;
                case 1178969440: goto Lae;
                case 1474396491: goto La3;
                case 1545098771: goto L8a;
                case 2116204999: goto L7b;
                case 2120910269: goto L70;
                default: goto L6f;
            }
        L6f:
            goto Lb4
        L70:
            boolean r0 = r9.equals(r11)
            if (r0 != 0) goto L77
            goto Lb4
        L77:
            r0 = r17
            goto L393
        L7b:
            boolean r0 = r9.equals(r10)
            if (r0 != 0) goto L82
            goto Lb4
        L82:
            java.lang.String r23 = r32.getAwemeId()
        L86:
            r0 = r23
            goto L393
        L8a:
            boolean r0 = r9.equals(r7)
            if (r0 != 0) goto L91
            goto Lb4
        L91:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            java.lang.Class r1 = r30.getDeclaringClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r1.getClass()
            java.lang.String r23 = r0.getHostCommonInfoOrEmpty(r1)
            goto L86
        La3:
            boolean r0 = r9.equals(r8)
            if (r0 != 0) goto Laa
            goto Lb4
        Laa:
            r0 = r24
            goto L393
        Lae:
            java.lang.String r0 = "two_level_insert_ids"
        Lb0:
            boolean r0 = r9.equals(r0)
        Lb4:
            r0 = r25
            goto L393
        Lb8:
            boolean r0 = r9.equals(r6)
            if (r0 != 0) goto Laa
            goto Lb4
        Lbf:
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto Lc6
            goto Lb4
        Lc6:
            java.lang.String r23 = r32.getCommentId()
            goto L86
        Lcb:
            boolean r0 = r9.equals(r4)
            goto Lb4
        Ld0:
            boolean r0 = r9.equals(r3)
            goto Lb4
        Ld5:
            boolean r0 = r9.equals(r2)
            if (r0 != 0) goto L86
            goto Lb4
        Ldc:
            boolean r0 = r9.equals(r1)
            goto Lb4
        Le1:
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Le8
            goto Lb4
        Le8:
            r0 = r29
            goto L393
        Lec:
            boolean r0 = r9.equals(r15)
            if (r0 != 0) goto L77
            goto Lb4
        Lf3:
            boolean r0 = r9.equals(r14)
            if (r0 != 0) goto Lfa
            goto Lb4
        Lfa:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            java.lang.Class r1 = r30.getDeclaringClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r1.getClass()
            java.lang.String r23 = r0.getHostCityOrNull(r1)
            goto L86
        L10d:
            boolean r0 = r9.equals(r13)
            goto Lb4
        L112:
            boolean r0 = r9.equals(r12)
            goto Lb4
        L117:
            r0 = r22
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L120:
            r0 = r21
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L129
            goto Lb4
        L129:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            java.lang.Class r1 = r30.getDeclaringClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r1.getClass()
            java.lang.String r2 = r32.getAwemeId()
            java.lang.Object r1 = r0.findAwemeById(r1, r2)
            java.lang.String r23 = r0.findAwemeAuthorId(r1)
            if (r23 != 0) goto L86
            goto Laa
        L146:
            java.lang.String r0 = "use_light_optimize"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L150:
            java.lang.String r0 = "user_avatar_shrink"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L15a
            goto Lb4
        L15a:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            java.lang.Class r1 = r30.getDeclaringClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r1.getClass()
            java.lang.String r23 = r0.getHostAvatarShrink(r1)
            goto L86
        L16d:
            java.lang.String r0 = "comment_token"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Laa
            goto Lb4
        L177:
            java.lang.String r0 = "comment_scene"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L86
            goto Lb4
        L181:
            java.lang.String r0 = "comment_level"
            goto Lb0
        L185:
            java.lang.String r0 = "top_ids"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Laa
            goto Lb4
        L18f:
            java.lang.String r0 = "ad_info"
            goto Lb0
        L193:
            java.lang.String r0 = "is_25_story"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L19d:
            java.lang.String r0 = "authentication_token"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Laa
            goto Lb4
        L1a7:
            java.lang.String r0 = "cursor"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L1b1
            goto Lb4
        L1b1:
            r0 = 0
            java.lang.Long r23 = java.lang.Long.valueOf(r0)
            goto L86
        L1b9:
            java.lang.String r0 = "aweme_type"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L1c3:
            java.lang.String r0 = "language"
            goto Lb0
        L1c7:
            java.lang.String r0 = "service_id"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L86
            goto Lb4
        L1d1:
            java.lang.String r0 = "channel_id"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L1db:
            java.lang.String r0 = "is_24_story"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L1e5:
            java.lang.String r0 = "follower_count"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L1ef:
            java.lang.String r0 = "item_type"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L1f9:
            r27 = r21
            r28 = r22
            if (r9 == 0) goto Lb4
            int r21 = r9.hashCode()
            switch(r21) {
                case -2141142810: goto L389;
                case -2107390546: goto L37f;
                case -2053735379: goto L375;
                case -1930808873: goto L36b;
                case -1925252738: goto L367;
                case -1724763419: goto L35d;
                case -1613589672: goto L359;
                case -1353964622: goto L34f;
                case -1349119146: goto L33d;
                case -1252702862: goto L333;
                case -1166231698: goto L329;
                case -1152569526: goto L325;
                case -1139551026: goto L31b;
                case -1112970844: goto L317;
                case -1106581844: goto L30d;
                case -1105295335: goto L303;
                case -1040728771: goto L2ff;
                case -909002181: goto L2e2;
                case -876989915: goto L2de;
                case -828722786: goto L2d4;
                case -710058221: goto L2ca;
                case -332433405: goto L2c0;
                case -166886555: goto L2b6;
                case -71926506: goto L2b0;
                case -35226582: goto L2aa;
                case 3053931: goto L28f;
                case 52377082: goto L287;
                case 94851343: goto L27f;
                case 274463973: goto L279;
                case 448864051: goto L276;
                case 506361563: goto L26e;
                case 577252491: goto L268;
                case 658270590: goto L262;
                case 899150587: goto L254;
                case 966493234: goto L24c;
                case 1474396491: goto L244;
                case 1545098771: goto L229;
                case 1599944624: goto L226;
                case 2103876208: goto L21e;
                case 2116204999: goto L210;
                case 2120910269: goto L208;
                default: goto L206;
            }
        L206:
            goto Lb4
        L208:
            boolean r0 = r9.equals(r11)
            if (r0 != 0) goto L77
            goto Lb4
        L210:
            boolean r0 = r9.equals(r10)
            if (r0 != 0) goto L218
            goto Lb4
        L218:
            java.lang.String r23 = r32.getAwemeId()
            goto L86
        L21e:
            java.lang.String r0 = "comment_uid"
        L220:
            boolean r0 = r9.equals(r0)
            goto Lb4
        L226:
            java.lang.String r0 = "preload_type"
            goto L220
        L229:
            boolean r0 = r9.equals(r7)
            if (r0 != 0) goto L231
            goto Lb4
        L231:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            java.lang.Class r1 = r30.getDeclaringClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r1.getClass()
            java.lang.String r23 = r0.getHostCommonInfoOrEmpty(r1)
            goto L86
        L244:
            boolean r0 = r9.equals(r8)
            if (r0 != 0) goto Laa
            goto Lb4
        L24c:
            boolean r0 = r9.equals(r6)
            if (r0 != 0) goto Laa
            goto Lb4
        L254:
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto L25c
            goto Lb4
        L25c:
            java.lang.String r23 = r32.getCommentId()
            goto L86
        L262:
            boolean r0 = r9.equals(r4)
            goto Lb4
        L268:
            boolean r0 = r9.equals(r3)
            goto Lb4
        L26e:
            boolean r0 = r9.equals(r2)
            if (r0 != 0) goto L86
            goto Lb4
        L276:
            java.lang.String r0 = "common_flags"
            goto L220
        L279:
            boolean r0 = r9.equals(r1)
            goto Lb4
        L27f:
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Le8
            goto Lb4
        L287:
            boolean r0 = r9.equals(r15)
            if (r0 != 0) goto L77
            goto Lb4
        L28f:
            boolean r0 = r9.equals(r14)
            if (r0 != 0) goto L297
            goto Lb4
        L297:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            java.lang.Class r1 = r30.getDeclaringClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r1.getClass()
            java.lang.String r23 = r0.getHostCityOrNull(r1)
            goto L86
        L2aa:
            boolean r0 = r9.equals(r13)
            goto Lb4
        L2b0:
            boolean r0 = r9.equals(r12)
            goto Lb4
        L2b6:
            r0 = r28
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L2c0:
            r0 = r27
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Laa
            goto Lb4
        L2ca:
            java.lang.String r0 = "ai_cmt_exposure"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L2d4:
            java.lang.String r0 = "use_light_optimize"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L2de:
            java.lang.String r0 = "rhap_retriever_names"
            goto L220
        L2e2:
            java.lang.String r0 = "user_avatar_shrink"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L2ec
            goto Lb4
        L2ec:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            java.lang.Class r1 = r30.getDeclaringClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r1.getClass()
            java.lang.String r23 = r0.getHostAvatarShrink(r1)
            goto L86
        L2ff:
            java.lang.String r0 = "merge_cursor"
            goto L220
        L303:
            java.lang.String r0 = "comment_token"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Laa
            goto Lb4
        L30d:
            java.lang.String r0 = "comment_scene"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L86
            goto Lb4
        L317:
            java.lang.String r0 = "comment_level"
            goto L220
        L31b:
            java.lang.String r0 = "top_ids"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Laa
            goto Lb4
        L325:
            java.lang.String r0 = "ad_info"
            goto L220
        L329:
            java.lang.String r0 = "is_25_story"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L333:
            java.lang.String r0 = "authentication_token"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Laa
            goto Lb4
        L33d:
            java.lang.String r0 = "cursor"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L347
            goto Lb4
        L347:
            r0 = 0
            java.lang.Long r23 = java.lang.Long.valueOf(r0)
            goto L86
        L34f:
            java.lang.String r0 = "aweme_type"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L359:
            java.lang.String r0 = "language"
            goto L220
        L35d:
            java.lang.String r0 = "service_id"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L86
            goto Lb4
        L367:
            java.lang.String r0 = "common_data"
            goto L220
        L36b:
            java.lang.String r0 = "channel_id"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L375:
            java.lang.String r0 = "is_24_story"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L37f:
            java.lang.String r0 = "follower_count"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L389:
            java.lang.String r0 = "item_type"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto Lb4
        L393:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            r20.getClass()
            r2 = r20
            java.lang.Object r0 = r1.coerceValue(r0, r2, r9)
            r19[r16] = r0
            int r3 = r16 + 1
            r0 = r29
            r1 = r33
            r2 = r34
            r4 = r17
            r5 = r18
            r6 = r19
            goto L1c
        L3b0:
            r19 = r6
            return r19
    }

    private final java.lang.Object[] buildArgsFromCapturedProfile(java.lang.reflect.Method r8, java.util.List<java.lang.String> r9, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.CapturedLoadMoreProfile r10, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r11) {
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

    private final java.lang.Object[] buildArgsFromCapturedProfileForReply(java.lang.reflect.Method r7, java.util.List<java.lang.String> r8, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.CapturedLoadMoreProfile r9, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r10, int r11) {
            r6 = this;
            java.lang.Class[] r6 = r7.getParameterTypes()
            int r7 = r6.length
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r1 = 0
        L8:
            if (r1 >= r7) goto L98
            r2 = r6[r1]
            java.lang.Object r3 = p000.AbstractC0984xh.m6641(r1, r8)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L81
            int r4 = r3.hashCode()
            r5 = 0
            switch(r4) {
                case -1349119146: goto L71;
                case -1139551026: goto L68;
                case 94851343: goto L5a;
                case 506361563: goto L4c;
                case 899150587: goto L3e;
                case 966493234: goto L35;
                case 1178969440: goto L2c;
                case 2116204999: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L81
        L1e:
            java.lang.String r4 = "item_id"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L27
            goto L81
        L27:
            java.lang.String r5 = r10.getAwemeId()
            goto L89
        L2c:
            java.lang.String r4 = "two_level_insert_ids"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L89
            goto L81
        L35:
            java.lang.String r4 = "insert_ids"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L89
            goto L81
        L3e:
            java.lang.String r4 = "comment_id"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L47
            goto L81
        L47:
            java.lang.String r5 = r10.getCommentId()
            goto L89
        L4c:
            java.lang.String r4 = "group_id"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L55
            goto L81
        L55:
            java.lang.String r5 = r10.getAwemeId()
            goto L89
        L5a:
            java.lang.String r4 = "count"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L63
            goto L81
        L63:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            goto L89
        L68:
            java.lang.String r4 = "top_ids"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L89
            goto L81
        L71:
            java.lang.String r4 = "cursor"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L7a
            goto L81
        L7a:
            r4 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
            goto L89
        L81:
            java.util.List r4 = r9.getArgs()
            java.lang.Object r5 = p000.AbstractC0984xh.m6641(r1, r4)
        L89:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            r2.getClass()
            java.lang.Object r2 = r4.coerceValue(r5, r2, r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L98:
            return r0
    }

    private final java.lang.String findAwemeAuthorId(java.lang.Object r4) {
            r3 = this;
            r3 = 0
            if (r4 != 0) goto L4
            return r3
        L4:
            r0 = 0
            java.lang.String r1 = "getAuthor"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = p000.qe0.m4869(r4, r1, r2)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r1 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L30
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L30
            r1 = r2
        L15:
            boolean r2 = r1 instanceof p000.eo1     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L1a
            r1 = r3
        L1a:
            if (r1 != 0) goto L33
            java.lang.String r1 = "author"
            java.lang.Object r4 = p000.qe0.m4879(r4, r1)     // Catch: java.lang.Throwable -> L24
            r1 = r4
            goto L2a
        L24:
            r4 = move-exception
            eo1 r1 = new eo1     // Catch: java.lang.Throwable -> L30
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L30
        L2a:
            boolean r4 = r1 instanceof p000.eo1     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L33
            r1 = r3
            goto L33
        L30:
            r4 = move-exception
            goto Lcf
        L33:
            if (r1 == 0) goto Lcd
            java.lang.String r4 = "getUid"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L44
            java.lang.Object r4 = p000.qe0.m4869(r1, r4, r2)     // Catch: java.lang.Throwable -> L44
            boolean r2 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L46
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L44
            goto L4e
        L44:
            r4 = move-exception
            goto L48
        L46:
            r4 = r3
            goto L4e
        L48:
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L30
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L30
            r4 = r2
        L4e:
            boolean r2 = r4 instanceof p000.eo1     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L53
            r4 = r3
        L53:
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L75
            java.lang.String r4 = "uid"
            java.lang.Object r4 = p000.qe0.m4879(r1, r4)     // Catch: java.lang.Throwable -> L64
            boolean r2 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L66
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L64
            goto L6e
        L64:
            r4 = move-exception
            goto L68
        L66:
            r4 = r3
            goto L6e
        L68:
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L30
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L30
            r4 = r2
        L6e:
            boolean r2 = r4 instanceof p000.eo1     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L73
            r4 = r3
        L73:
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L30
        L75:
            java.lang.String r2 = "getSecUid"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = p000.qe0.m4869(r1, r2, r0)     // Catch: java.lang.Throwable -> L84
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L86
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L84
            goto L8e
        L84:
            r0 = move-exception
            goto L88
        L86:
            r0 = r3
            goto L8e
        L88:
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L30
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r0 = r2
        L8e:
            boolean r2 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L93
            r0 = r3
        L93:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lb5
            java.lang.String r0 = "secUid"
            java.lang.Object r0 = p000.qe0.m4879(r1, r0)     // Catch: java.lang.Throwable -> La4
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto La6
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La4
            goto Lae
        La4:
            r0 = move-exception
            goto La8
        La6:
            r0 = r3
            goto Lae
        La8:
            eo1 r1 = new eo1     // Catch: java.lang.Throwable -> L30
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r0 = r1
        Lae:
            boolean r1 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto Lb3
            r0 = r3
        Lb3:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L30
        Lb5:
            if (r4 == 0) goto Lc4
            boolean r1 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto Lbe
            goto Lbf
        Lbe:
            r4 = r3
        Lbf:
            if (r4 != 0) goto Lc2
            goto Lc4
        Lc2:
            r0 = r4
            goto Ld4
        Lc4:
            if (r0 == 0) goto Lcd
            boolean r4 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto Lcd
            goto Ld4
        Lcd:
            r0 = r3
            goto Ld4
        Lcf:
            eo1 r0 = new eo1
            r0.<init>(r4)
        Ld4:
            java.lang.Throwable r4 = p000.fo1.m2190(r0)
            if (r4 == 0) goto Le1
            java.lang.String r1 = "r70ac498a2ca77555"
            java.lang.String r2 = "findAwemeAuthorId failed"
            p000.C0888ux.m5977(r1, r2, r4)
        Le1:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto Le6
            goto Le7
        Le6:
            r3 = r0
        Le7:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    private final java.lang.Object findAwemeById(java.lang.ClassLoader r3, java.lang.String r4) {
            r2 = this;
            boolean r2 = p000.q02.m4671(r4)
            r0 = 0
            if (r2 == 0) goto L8
            return r0
        L8:
            java.lang.Object r2 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "~795CFE82AE87DC48225355B65A8474AC8888795688CFC505AE1DF814C6225A6489367ABAFCF0011E9F31908A6435981074F0"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r2 = p000.qe0.m4877(r3, r2)     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L18
        L16:
            r2 = r0
            goto L36
        L18:
            java.lang.String r3 = "LIZIZ"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = p000.qe0.m4870(r2, r3, r1)     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L24
            goto L16
        L24:
            java.lang.String r3 = "getAwemeById"
            java.lang.Object[] r1 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = p000.qe0.m4869(r2, r3, r1)     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L36:
            java.lang.Throwable r3 = p000.fo1.m2190(r2)
            if (r3 == 0) goto L47
            java.lang.String r1 = "findAwemeById failed awemeId="
            java.lang.String r4 = r1.concat(r4)
            java.lang.String r1 = "r70ac498a2ca77555"
            p000.C0888ux.m5977(r1, r4, r3)
        L47:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L4c
            goto L4d
        L4c:
            r0 = r2
        L4d:
            return r0
    }

    private final java.lang.Class<?> findClassAny(java.lang.ClassLoader r8, java.lang.String... r9) {
            r7 = this;
            int r7 = r9.length
            r0 = 0
        L2:
            r1 = 4
            java.lang.String r2 = "r70ac498a2ca77555"
            r3 = 0
            if (r0 >= r7) goto L32
            r4 = r9[r0]
            java.lang.Class r5 = p000.qe0.m4877(r8, r4)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L16:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L1b
            r5 = r3
        L1b:
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 == 0) goto L2f
            java.lang.String r7 = r5.getName()
            java.lang.String r8 = "findClassAny hit "
            java.lang.String r9 = " -> "
            java.lang.String r7 = p000.a12.m18(r8, r4, r9, r7)
            p000.C0888ux.m5988(r2, r7, r3, r1, r3)
            return r5
        L2f:
            int r0 = r0 + 1
            goto L2
        L32:
            r7 = 63
            java.lang.String r7 = p000.AbstractC0312g7.m2256(r9, r3, r3, r3, r7)
            java.lang.String r8 = "findClassAny miss: "
            java.lang.String r7 = r8.concat(r7)
            p000.C0888ux.m5988(r2, r7, r3, r1, r3)
            return r3
    }

    private final java.lang.String getHostAvatarShrink(java.lang.ClassLoader r5) {
            r4 = this;
            java.lang.String r0 = "96_96"
            r1 = 0
            java.lang.String r2 = "X.11Yo"
            java.lang.String r3 = "X.C19566711Yo"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L23
            java.lang.Class r4 = r4.findClassAny(r5, r2)     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto L13
            r4 = r0
            goto L2d
        L13:
            java.lang.String r5 = "LJIIL"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L23
            java.lang.Object r4 = p000.qe0.m4870(r4, r5, r2)     // Catch: java.lang.Throwable -> L23
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L25
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L23
            goto L2d
        L23:
            r4 = move-exception
            goto L27
        L25:
            r4 = r1
            goto L2d
        L27:
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L2d:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L32
            goto L33
        L32:
            r1 = r4
        L33:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L39
            java.lang.String r1 = ""
        L39:
            boolean r4 = p000.q02.m4671(r1)
            if (r4 == 0) goto L40
            goto L41
        L40:
            r0 = r1
        L41:
            return r0
    }

    private final java.lang.String getHostCityOrNull(java.lang.ClassLoader r4) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "X.16mC"
            java.lang.String r2 = "X.C20920116mC"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> L21
            java.lang.Class r3 = r3.findClassAny(r4, r1)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L11
        Lf:
            r3 = r0
            goto L28
        L11:
            java.lang.String r4 = "LJI"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L21
            java.lang.Object r3 = p000.qe0.m4870(r3, r4, r1)     // Catch: java.lang.Throwable -> L21
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto Lf
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L28:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r3
        L2e:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private final java.lang.String getHostCommonInfoOrEmpty(java.lang.ClassLoader r5) {
            r4 = this;
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = "X.116E"
            java.lang.String r3 = "X.C116E"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L23
            java.lang.Class r4 = r4.findClassAny(r5, r2)     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto L13
            r4 = r0
            goto L2d
        L13:
            java.lang.String r5 = "LIZIZ"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L23
            java.lang.Object r4 = p000.qe0.m4870(r4, r5, r2)     // Catch: java.lang.Throwable -> L23
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L25
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L23
            goto L2d
        L23:
            r4 = move-exception
            goto L27
        L25:
            r4 = r1
            goto L2d
        L27:
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L2d:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L32
            goto L33
        L32:
            r1 = r4
        L33:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L38
            goto L39
        L38:
            r0 = r1
        L39:
            return r0
    }

    private final void installProxyCaptureHook(java.lang.reflect.Method r8, java.lang.Object r9) {
            r7 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r8)
            java.lang.Class r9 = r9.getClass()
            java.lang.reflect.Method[] r9 = r9.getMethods()
            r9.getClass()
            int r0 = r9.length
            r1 = 0
        L15:
            r2 = 0
            if (r1 >= r0) goto L3a
            r3 = r9[r1]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = r8.getName()
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L37
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.Class[] r5 = r8.getParameterTypes()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L37
            goto L3b
        L37:
            int r1 = r1 + 1
            goto L15
        L3a:
            r3 = r2
        L3b:
            if (r3 == 0) goto L40
            r7.add(r3)
        L40:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L4e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r7.next()
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.String r3 = r4.stableKey(r3)
            boolean r3 = r9.add(r3)
            if (r3 == 0) goto L4e
            r0.add(r1)
            goto L4e
        L6b:
            java.util.Iterator r7 = r0.iterator()
        L6f:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lee
            java.lang.Object r9 = r7.next()
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.String r0 = r0.stableKey(r9)
            java.util.Set<java.lang.String> r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.hookedProxyMethods
            boolean r3 = r1.add(r0)
            if (r3 == 0) goto L6f
            int r3 = r9.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isAbstract(r3)
            r4 = 4
            java.lang.String r5 = "r70ac498a2ca77555"
            if (r3 == 0) goto La3
            java.lang.String r9 = "skip abstract capture method: "
            java.lang.String r9 = p000.lz1.m3687(r9, r0)
            p000.C0888ux.m5988(r5, r9, r2, r4, r2)
            r1.remove(r0)
            goto L6f
        La3:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            r3 = 1
            r9.setAccessible(r3)     // Catch: java.lang.Throwable -> Lca
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Lca
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1 r6 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$installProxyCaptureHook$4$1$1     // Catch: java.lang.Throwable -> Lca
            r6.<init>(r8, r1)     // Catch: java.lang.Throwable -> Lca
            r3.m6775(r9, r6)     // Catch: java.lang.Throwable -> Lca
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca
            r9.<init>()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = "hooked loadMore capture method: "
            r9.append(r1)     // Catch: java.lang.Throwable -> Lca
            r9.append(r0)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lca
            p000.C0888ux.m5988(r5, r9, r2, r4, r2)     // Catch: java.lang.Throwable -> Lca
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lca
            goto Ld1
        Lca:
            r9 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r9)
            r9 = r1
        Ld1:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L6f
            java.util.Set<java.lang.String> r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.hookedProxyMethods
            r1.remove(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "hook loadMore capture failed: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5977(r5, r0, r9)
            goto L6f
        Lee:
            return
    }

    private final java.lang.Object invokeLoadMore(java.lang.reflect.Method r3, java.lang.Object r4, java.lang.Object[] r5) {
            r2 = this;
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$selfInvoking$1 r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.selfInvoking
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
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$selfInvoking$1 r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.selfInvoking
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.set(r4)
            throw r2
    }

    public static /* synthetic */ java.lang.Object loadFirstPage$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0, java.lang.ClassLoader r1, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L6
            r3 = 50
        L6:
            java.lang.Object r0 = r0.loadFirstPage(r1, r2, r3)
            return r0
    }

    private static final java.lang.CharSequence loadFirstPage$lambda$25$lambda$24$lambda$23(java.lang.Object r3) {
            r3.getClass()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.String r2 = r1.getCommentId(r3)
            java.lang.String r3 = r1.getContent(r3)
            if (r3 == 0) goto L1e
            r1 = 20
            java.lang.String r3 = p000.q02.m4693(r3, r1)
            goto L1f
        L1e:
            r3 = 0
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " | id="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " | text="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    private static final java.lang.CharSequence loadInsertedCommentList$lambda$4(java.lang.reflect.Method r5) {
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

    private final void logInvokePlan(java.lang.reflect.Method r13, java.util.List<java.lang.String> r14, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan r15) {
            r12 = this;
            java.lang.String r12 = r15.getName()
            java.lang.Class r0 = r13.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r13.getName()
            java.lang.Class r2 = r13.getReturnType()
            java.lang.String r2 = r2.getName()
            java.lang.Class[] r3 = r13.getParameterTypes()
            r3.getClass()
            uj r4 = new uj
            r5 = 14
            r4.<init>(r5)
            r5 = 31
            r6 = 0
            java.lang.String r3 = p000.AbstractC0312g7.m2256(r3, r6, r6, r4, r5)
            java.lang.String r4 = ", method="
            java.lang.String r5 = "#"
            java.lang.String r7 = "invoke loadMore plan="
            java.lang.StringBuilder r12 = p000.lz1.m3695(r7, r12, r4, r0, r5)
            java.lang.String r0 = ", return="
            java.lang.String r4 = ", paramTypes="
            p000.AbstractC0602nx.m4119(r12, r1, r0, r2, r4)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "r70ac498a2ca77555"
            r1 = 4
            p000.C0888ux.m5988(r0, r12, r6, r1, r6)
            java.lang.Object[] r12 = r15.getArgs()
            int r15 = r12.length
            r2 = 0
            r3 = r2
        L52:
            if (r2 >= r15) goto Lb3
            r4 = r12[r2]
            int r5 = r3 + 1
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r7 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            java.lang.Object r8 = p000.AbstractC0984xh.m6641(r3, r14)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.maskArg(r8, r4)
            java.lang.Object r8 = p000.AbstractC0984xh.m6641(r3, r14)
            java.lang.Class[] r9 = r13.getParameterTypes()
            r9 = r9[r3]
            java.lang.String r9 = r9.getName()
            if (r4 == 0) goto L7d
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            goto L7e
        L7d:
            r4 = r6
        L7e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "arg["
            r10.<init>(r11)
            r10.append(r3)
            java.lang.String r3 = "], name="
            r10.append(r3)
            r10.append(r8)
            java.lang.String r3 = ", type="
            r10.append(r3)
            r10.append(r9)
            java.lang.String r3 = ", value="
            r10.append(r3)
            r10.append(r7)
            java.lang.String r3 = ", valueType="
            r10.append(r3)
            r10.append(r4)
            java.lang.String r3 = r10.toString()
            p000.C0888ux.m5988(r0, r3, r6, r1, r6)
            int r2 = r2 + 1
            r3 = r5
            goto L52
        Lb3:
            return
    }

    private static final java.lang.CharSequence logInvokePlan$lambda$18(java.lang.Class r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    private final void logReplyCoreArgs(java.lang.reflect.Method r17, java.util.List<java.lang.String> r18, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan r19) {
            r16 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = r17.getName()
            java.lang.String r4 = "comment_id"
            java.lang.Object r4 = logReplyCoreArgs$valueOf(r0, r1, r4)
            java.lang.String r5 = "item_id"
            java.lang.Object r5 = logReplyCoreArgs$valueOf(r0, r1, r5)
            java.lang.String r6 = "insert_ids"
            java.lang.Object r6 = logReplyCoreArgs$valueOf(r0, r1, r6)
            java.lang.String r7 = "top_ids"
            java.lang.Object r7 = logReplyCoreArgs$valueOf(r0, r1, r7)
            java.lang.String r8 = "two_level_insert_ids"
            java.lang.Object r8 = logReplyCoreArgs$valueOf(r0, r1, r8)
            java.lang.String r9 = "channel_id"
            java.lang.Object r9 = logReplyCoreArgs$valueOf(r0, r1, r9)
            java.lang.String r10 = "service_id"
            java.lang.Object r10 = logReplyCoreArgs$valueOf(r0, r1, r10)
            java.lang.String r11 = "group_id"
            java.lang.Object r11 = logReplyCoreArgs$valueOf(r0, r1, r11)
            java.lang.String r12 = "comment_scene"
            java.lang.Object r12 = logReplyCoreArgs$valueOf(r0, r1, r12)
            java.lang.String r13 = "hotspot_id"
            java.lang.Object r13 = logReplyCoreArgs$valueOf(r0, r1, r13)
            java.lang.String r14 = "comment_token"
            java.lang.Object r14 = logReplyCoreArgs$valueOf(r0, r1, r14)
            java.lang.String r15 = "language"
            java.lang.Object r15 = logReplyCoreArgs$valueOf(r0, r1, r15)
            r16 = r15
            java.lang.String r15 = "aweme_type"
            java.lang.Object r0 = logReplyCoreArgs$valueOf(r0, r1, r15)
            java.lang.String r1 = ", method="
            java.lang.String r15 = ", comment_id="
            r17 = r0
            java.lang.String r0 = "reply core args, plan="
            java.lang.StringBuilder r0 = p000.lz1.m3695(r0, r2, r1, r3, r15)
            r0.append(r4)
            java.lang.String r1 = ", item_id="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", insert_ids="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", top_ids="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", two_level_insert_ids="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", channel_id="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", service_id="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", group_id="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", comment_scene="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", hotspot_id="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", comment_token="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ", language="
            r0.append(r1)
            r1 = r16
            r0.append(r1)
            java.lang.String r1 = ", aweme_type="
            r0.append(r1)
            r1 = r17
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 4
            java.lang.String r3 = "r70ac498a2ca77555"
            p000.C0888ux.m5988(r3, r0, r1, r2, r1)
            return
    }

    private static final java.lang.Object logReplyCoreArgs$valueOf(java.util.List<java.lang.String> r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan r1, java.lang.String r2) {
            int r0 = r0.indexOf(r2)
            if (r0 < 0) goto Lf
            java.lang.Object[] r1 = r1.getArgs()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r0, r1)
            return r0
        Lf:
            r0 = 0
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
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$CapturedLoadMoreProfile r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.capturedProfile
            if (r1 != 0) goto L5
            return r2
        L5:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1 r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$sortMethodsByCapturedProfile$$inlined$sortedByDescending$1
            r0.<init>(r1)
            java.util.List r1 = p000.AbstractC0984xh.m6658(r2, r0)
            return r1
    }

    private final java.lang.Object tryLoadByHostWrapperLJII(java.lang.ClassLoader r24, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.String r2 = ", awemeId="
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "r70ac498a2ca77555"
            r5 = 0
            java.lang.String r6 = "X.11Yo"
            java.lang.String r7 = "X.C19566711Yo"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Throwable -> L22
            java.lang.Class r6 = r0.findClassAny(r1, r6)     // Catch: java.lang.Throwable -> L22
            r7 = 4
            if (r6 != 0) goto L25
            java.lang.String r0 = "host wrapper class not found: X.11Yo / X.C19566711Yo"
            p000.C0888ux.m5988(r4, r0, r5, r7, r5)     // Catch: java.lang.Throwable -> L22
        L1f:
            r0 = r5
            goto L193
        L22:
            r0 = move-exception
            goto L18d
        L25:
            java.lang.reflect.Method[] r8 = r6.getDeclaredMethods()     // Catch: java.lang.Throwable -> L22
            r8.getClass()     // Catch: java.lang.Throwable -> L22
            int r9 = r8.length     // Catch: java.lang.Throwable -> L22
            r11 = 0
        L2e:
            r12 = 8
            r13 = 1
            if (r11 >= r9) goto L75
            r14 = r8[r11]     // Catch: java.lang.Throwable -> L22
            java.lang.String r15 = r14.getName()     // Catch: java.lang.Throwable -> L22
            r16 = 0
            java.lang.String r10 = "LJII"
            boolean r10 = p000.ln0.m3626(r15, r10)     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L72
            java.lang.Class[] r10 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L22
            int r10 = r10.length     // Catch: java.lang.Throwable -> L22
            if (r10 != r12) goto L72
            java.lang.Class[] r10 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L22
            r10 = r10[r16]     // Catch: java.lang.Throwable -> L22
            boolean r10 = p000.ln0.m3626(r10, r3)     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L72
            java.lang.Class[] r10 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L22
            r10 = r10[r13]     // Catch: java.lang.Throwable -> L22
            java.lang.Class r15 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L22
            boolean r10 = p000.ln0.m3626(r10, r15)     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L72
            java.lang.Class[] r10 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L22
            r15 = 2
            r10 = r10[r15]     // Catch: java.lang.Throwable -> L22
            boolean r10 = p000.ln0.m3626(r10, r3)     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L72
            goto L76
        L72:
            int r11 = r11 + 1
            goto L2e
        L75:
            r14 = r5
        L76:
            if (r14 != 0) goto La2
            java.lang.reflect.Method[] r0 = r6.getDeclaredMethods()     // Catch: java.lang.Throwable -> L22
            r0.getClass()     // Catch: java.lang.Throwable -> L22
            uj r1 = new uj     // Catch: java.lang.Throwable -> L22
            r3 = 12
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L22
            r3 = 31
            java.lang.String r0 = p000.AbstractC0312g7.m2256(r0, r5, r5, r1, r3)     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "host wrapper LJII method not found, methods="
            r1.append(r3)     // Catch: java.lang.Throwable -> L22
            r1.append(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L22
            p000.C0888ux.m5988(r4, r0, r5, r7, r5)     // Catch: java.lang.Throwable -> L22
            goto L1f
        La2:
            r14.setAccessible(r13)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r25.getAwemeId()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r0.findAwemeById(r1, r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r0.findAwemeAuthorId(r1)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto Lb5
            java.lang.String r0 = ""
        Lb5:
            r18 = r0
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r25.getCommentId()     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r25.getAwemeId()     // Catch: java.lang.Throwable -> L22
            int r8 = r18.length()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto Ld2
            java.lang.Class r9 = r1.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L22
            goto Ld3
        Ld2:
            r9 = r5
        Ld3:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r10.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r11 = "try host wrapper LJII, cls="
            r10.append(r11)     // Catch: java.lang.Throwable -> L22
            r10.append(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = ", commentId="
            r10.append(r0)     // Catch: java.lang.Throwable -> L22
            r10.append(r3)     // Catch: java.lang.Throwable -> L22
            r10.append(r2)     // Catch: java.lang.Throwable -> L22
            r10.append(r6)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = ", awemeAuthorLen="
            r10.append(r0)     // Catch: java.lang.Throwable -> L22
            r10.append(r8)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = ", aweme="
            r10.append(r0)     // Catch: java.lang.Throwable -> L22
            r10.append(r9)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L22
            p000.C0888ux.m5988(r4, r0, r5, r7, r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String r15 = r25.getCommentId()     // Catch: java.lang.Throwable -> L22
            r8 = 0
            java.lang.Long r16 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L22
            java.lang.String r17 = r25.getAwemeId()     // Catch: java.lang.Throwable -> L22
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            r21 = 0
            r22 = r1
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r16, r17, r18, r19, r20, r21, r22}     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r14.invoke(r5, r0)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L127
            goto L1f
        L127:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r1.awaitNetworkResult(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L138
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L22
            goto L139
        L138:
            r1 = r5
        L139:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r3.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = "host wrapper LJII response="
            r3.append(r6)     // Catch: java.lang.Throwable -> L22
            r3.append(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L22
            p000.C0888ux.m5988(r4, r1, r5, r7, r5)     // Catch: java.lang.Throwable -> L22
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L22
            java.util.List r1 = r1.findCommentObjects(r0)     // Catch: java.lang.Throwable -> L22
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L22
            java.util.List r13 = p000.AbstractC0984xh.m6662(r1, r12)     // Catch: java.lang.Throwable -> L22
            uj r1 = new uj     // Catch: java.lang.Throwable -> L22
            r6 = 13
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L22
            r19 = 31
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = r1
            java.lang.String r1 = p000.AbstractC0984xh.m6644(r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r6.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = "host wrapper LJII comments="
            r6.append(r8)     // Catch: java.lang.Throwable -> L22
            r6.append(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = ", preview="
            r6.append(r3)     // Catch: java.lang.Throwable -> L22
            r6.append(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L22
            p000.C0888ux.m5988(r4, r1, r5, r7, r5)     // Catch: java.lang.Throwable -> L22
            goto L193
        L18d:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L193:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 == 0) goto L1aa
            java.lang.String r3 = r25.getCommentId()
            java.lang.String r6 = r25.getAwemeId()
            java.lang.String r7 = "host wrapper LJII failed, cid="
            java.lang.String r2 = p000.a12.m18(r7, r3, r2, r6)
            p000.C0888ux.m5977(r4, r2, r1)
        L1aa:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L1af
            goto L1b0
        L1af:
            r5 = r0
        L1b0:
            return r5
    }

    private static final java.lang.CharSequence tryLoadByHostWrapperLJII$lambda$30$lambda$28(java.lang.reflect.Method r2) {
            java.lang.String r0 = r2.getName()
            java.lang.Class[] r2 = r2.getParameterTypes()
            int r2 = r2.length
            java.lang.String r1 = "/"
            java.lang.String r2 = p000.AbstractC0602nx.m4130(r0, r1, r2)
            return r2
    }

    private static final java.lang.CharSequence tryLoadByHostWrapperLJII$lambda$30$lambda$29(java.lang.Object r2) {
            r2.getClass()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE
            java.lang.String r1 = r0.getCommentId(r2)
            java.lang.String r2 = r0.getContent(r2)
            if (r2 == 0) goto L16
            r0 = 20
            java.lang.String r2 = p000.q02.m4693(r2, r0)
            goto L17
        L16:
            r2 = 0
        L17:
            java.lang.String r0 = ":"
            java.lang.String r2 = p000.lz1.m3688(r1, r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ java.lang.CharSequence m1420(java.lang.reflect.Method r0) {
            java.lang.CharSequence r0 = tryLoadByHostWrapperLJII$lambda$30$lambda$28(r0)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ java.lang.CharSequence m1421(java.lang.Object r0) {
            java.lang.CharSequence r0 = loadFirstPage$lambda$25$lambda$24$lambda$23(r0)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ java.lang.CharSequence m1422(java.lang.Class r0) {
            java.lang.CharSequence r0 = logInvokePlan$lambda$18(r0)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ java.lang.CharSequence m1423(java.lang.Object r0) {
            java.lang.CharSequence r0 = buildArgPlansForReplyList$lambda$34$lambda$33(r0)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static /* synthetic */ java.lang.CharSequence m1424(java.lang.Object r0) {
            java.lang.CharSequence r0 = buildArgPlans$lambda$17$lambda$16(r0)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static /* synthetic */ java.lang.CharSequence m1425(java.lang.Object r0) {
            java.lang.CharSequence r0 = tryLoadByHostWrapperLJII$lambda$30$lambda$29(r0)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static /* synthetic */ java.lang.CharSequence m1426(java.lang.reflect.Method r0) {
            java.lang.CharSequence r0 = loadInsertedCommentList$lambda$4(r0)
            return r0
    }

    public final void installCaptureHooks(java.lang.ClassLoader r5, boolean r6) {
            r4 = this;
            r5.getClass()
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r4 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            java.util.List r4 = r4.resolveReplyListMethods(r5, r6)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$installCaptureHooks$$inlined$sortedByDescending$1 r5 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$installCaptureHooks$$inlined$sortedByDescending$1
            r5.<init>()
            java.util.List r4 = p000.AbstractC0984xh.m6658(r4, r5)
            int r5 = r4.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "installCaptureHooks, replyListMethods="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = ", allowDexKitScan="
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            r6 = 0
            r0 = 4
            java.lang.String r1 = "r70ac498a2ca77555"
            p000.C0888ux.m5988(r1, r5, r6, r0, r6)
            java.util.Iterator r4 = r4.iterator()
        L37:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            r0 = 1
            r5.setAccessible(r0)     // Catch: java.lang.Throwable -> L5f
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r2 = r5.getDeclaringClass()     // Catch: java.lang.Throwable -> L5f
            r2.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r0.resolveApiInstance(r2)     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L59
            goto L37
        L59:
            r6.installProxyCaptureHook(r5, r0)     // Catch: java.lang.Throwable -> L5f
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5f
            goto L66
        L5f:
            r6 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        L66:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto L37
            java.lang.Class r0 = r5.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r5 = r5.getName()
            java.lang.String r2 = "install capture hook failed for "
            java.lang.String r3 = "#"
            java.lang.String r5 = p000.a12.m18(r2, r0, r3, r5)
            p000.C0888ux.m5977(r1, r5, r6)
            goto L37
        L84:
            return
    }

    public final boolean isInvalidRequestError(java.lang.Throwable r1) {
            r0 = this;
            r1.getClass()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            boolean r0 = r0.isInvalidParamServerError(r1)
            return r0
    }

    public final java.lang.Object loadFirstPage(java.lang.ClassLoader r22, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r23, int r24) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            java.lang.String r3 = ", plan="
            r1.getClass()
            r23.getClass()
            java.lang.Object r4 = r21.tryLoadByHostWrapperLJII(r22, r23)
            r5 = 4
            java.lang.String r6 = "r70ac498a2ca77555"
            r7 = 0
            if (r4 == 0) goto L1e
            java.lang.String r0 = "loadFirstPage success via host wrapper LJII"
            p000.C0888ux.m5988(r6, r0, r7, r5, r7)
            return r4
        L1e:
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r4 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            r8 = 1
            java.util.List r4 = r4.resolveReplyListMethods(r1, r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r4 = r4.iterator()
        L2e:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L4b
            java.lang.Object r10 = r4.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "fetchReplyTreeListPOST"
            boolean r11 = p000.ln0.m3626(r11, r12)
            if (r11 == 0) goto L2e
            r9.add(r10)
            goto L2e
        L4b:
            int r4 = r9.size()
            java.lang.String r10 = r23.getAwemeId()
            java.lang.String r11 = r23.getCommentId()
            java.lang.String r12 = " (fetchReplyTreeListPOST only), awemeId="
            java.lang.String r13 = ", commentId="
            java.lang.String r14 = "loadFirstPage filtered methods="
            java.lang.StringBuilder r4 = p000.a12.m20(r4, r14, r12, r10, r13)
            r4.append(r11)
            java.lang.String r10 = ", count="
            r4.append(r10)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            p000.C0888ux.m5988(r6, r4, r7, r5, r7)
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L1cf
            r4 = 0
            r0.installCaptureHooks(r1, r4)
            java.util.List r0 = r0.sortMethodsByCapturedProfile(r9)
            java.util.Iterator r1 = r0.iterator()
            r0 = r7
        L86:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1c5
            java.lang.Object r4 = r1.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.setAccessible(r8)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r9 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.Class r10 = r4.getDeclaringClass()
            r10.getClass()
            java.lang.Object r10 = r9.resolveApiInstance(r10)
            if (r10 != 0) goto Lba
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r9 = "resolveApiInstance failed for "
            java.lang.String r4 = r9.concat(r4)
            p000.C0888ux.m5988(r6, r4, r7, r5, r7)
            r12 = r23
        Lb7:
            r8 = r5
            goto L1c0
        Lba:
            java.util.List<java.lang.String> r11 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.replyListParamNames
            java.util.List r9 = r9.resolveParamNames(r4, r11)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r11 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            r12 = r23
            java.util.List r11 = r11.buildArgPlansForReplyList(r4, r9, r12, r2)
            java.util.Iterator r11 = r11.iterator()
        Lcc:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto Lb7
            java.lang.Object r0 = r11.next()
            r13 = r0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r13 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan) r13
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            r0.logInvokePlan(r4, r9, r13)
            java.lang.Object[] r14 = r13.getArgs()     // Catch: java.lang.Throwable -> L102
            java.lang.Object r0 = r0.invokeLoadMore(r4, r10, r14)     // Catch: java.lang.Throwable -> L102
            if (r0 != 0) goto Le9
            return r7
        Le9:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r14 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE     // Catch: java.lang.Throwable -> L102
            java.lang.Object r17 = r14.awaitNetworkResult(r0)     // Catch: java.lang.Throwable -> L102
            java.lang.String r0 = r4.getName()     // Catch: java.lang.Throwable -> L102
            java.lang.String r14 = r13.getName()     // Catch: java.lang.Throwable -> L102
            if (r17 == 0) goto L106
            java.lang.Class r15 = r17.getClass()     // Catch: java.lang.Throwable -> L102
            java.lang.String r15 = r15.getName()     // Catch: java.lang.Throwable -> L102
            goto L107
        L102:
            r0 = move-exception
            r8 = r5
            goto L190
        L106:
            r15 = r7
        L107:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L102
            r8.<init>()     // Catch: java.lang.Throwable -> L102
            java.lang.String r5 = "reply response ok, method="
            r8.append(r5)     // Catch: java.lang.Throwable -> L18e
            r8.append(r0)     // Catch: java.lang.Throwable -> L18e
            r8.append(r3)     // Catch: java.lang.Throwable -> L18e
            r8.append(r14)     // Catch: java.lang.Throwable -> L18e
            java.lang.String r0 = ", responseClass="
            r8.append(r0)     // Catch: java.lang.Throwable -> L18e
            r8.append(r15)     // Catch: java.lang.Throwable -> L18e
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L18e
            r5 = 4
            p000.C0888ux.m5988(r6, r0, r7, r5, r7)     // Catch: java.lang.Throwable -> L102
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r15 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L18e
            java.lang.Class r0 = r4.getDeclaringClass()     // Catch: java.lang.Throwable -> L18e
            java.lang.ClassLoader r16 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L18e
            r16.getClass()     // Catch: java.lang.Throwable -> L18e
            r19 = 4
            r20 = 0
            r18 = 0
            java.util.List r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.findRealCommentObjectsDeep$default(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L18e
            r5 = r17
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L18e
            if (r8 != 0) goto L14a
            goto L14e
        L14a:
            java.util.List r0 = r15.findCommentObjects(r5)     // Catch: java.lang.Throwable -> L18e
        L14e:
            r8 = 8
            java.util.List r14 = p000.AbstractC0984xh.m6662(r0, r8)     // Catch: java.lang.Throwable -> L18e
            uj r8 = new uj     // Catch: java.lang.Throwable -> L18e
            r15 = 11
            r8.<init>(r15)     // Catch: java.lang.Throwable -> L18e
            r20 = 31
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r8
            java.lang.String r8 = p000.AbstractC0984xh.m6644(r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L18e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L18e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18e
            r14.<init>()     // Catch: java.lang.Throwable -> L18e
            java.lang.String r15 = "reply response comments count="
            r14.append(r15)     // Catch: java.lang.Throwable -> L18e
            r14.append(r0)     // Catch: java.lang.Throwable -> L18e
            java.lang.String r0 = ", preview="
            r14.append(r0)     // Catch: java.lang.Throwable -> L18e
            r14.append(r8)     // Catch: java.lang.Throwable -> L18e
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> L18e
            r8 = 4
            p000.C0888ux.m5988(r6, r0, r7, r8, r7)     // Catch: java.lang.Throwable -> L18c
            return r5
        L18c:
            r0 = move-exception
            goto L190
        L18e:
            r0 = move-exception
            r8 = 4
        L190:
            java.lang.Class r5 = r4.getDeclaringClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r14 = r4.getName()
            java.lang.String r13 = r13.getName()
            java.lang.String r15 = "loadFirstPage failed, method="
            java.lang.String r7 = "#"
            java.lang.StringBuilder r5 = p000.lz1.m3695(r15, r5, r7, r14, r3)
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            p000.C0888ux.m5977(r6, r5, r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            boolean r5 = r5.isInvalidParamServerError(r0)
            if (r5 == 0) goto L1bf
            r5 = r8
            r7 = 0
            r8 = 1
            goto Lcc
        L1bf:
            throw r0
        L1c0:
            r5 = r8
            r7 = 0
            r8 = 1
            goto L86
        L1c5:
            if (r0 != 0) goto L1ce
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "loadFirstPage failed"
            r0.<init>(r1)
        L1ce:
            throw r0
        L1cf:
            java.lang.String r0 = "reply list api method not found"
            p000.ql1.m4936(r0)
            r0 = 0
            return r0
    }

    public final java.lang.Object loadInsertedCommentList(java.lang.ClassLoader r17, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r1.getClass()
            r18.getClass()
            com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver r2 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.INSTANCE
            r3 = 1
            java.util.List r4 = r2.resolveReplyListMethods(r1, r3)
            int r2 = r4.size()
            uj r9 = new uj
            r5 = 10
            r9.<init>(r5)
            r10 = 23
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 8
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r4, r5, r6, r7, r8, r9, r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "loadInsertedCommentList methods="
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = ", "
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            java.lang.String r5 = "r70ac498a2ca77555"
            r6 = 0
            r7 = 4
            p000.C0888ux.m5988(r5, r2, r6, r7, r6)
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto Lff
            r2 = 0
            r0.installCaptureHooks(r1, r2)
            java.util.List r0 = r0.sortMethodsByCapturedProfile(r4)
            java.util.Iterator r1 = r0.iterator()
            r0 = r6
        L57:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf5
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r3)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            java.lang.Class r8 = r2.getDeclaringClass()
            r8.getClass()
            java.lang.Object r8 = r4.resolveApiInstance(r8)
            if (r8 != 0) goto L89
            java.lang.Class r2 = r2.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "resolveApiInstance failed for "
            java.lang.String r2 = r4.concat(r2)
            p000.C0888ux.m5988(r5, r2, r6, r7, r6)
            r10 = r18
            goto Lf2
        L89:
            java.util.List<java.lang.String> r9 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.replyListParamNames
            java.util.List r4 = r4.resolveParamNames(r2, r9)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r9 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            r10 = r18
            java.util.List r9 = r9.buildArgPlans(r2, r4, r10)
            java.util.Iterator r9 = r9.iterator()
        L9b:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lf2
            java.lang.Object r0 = r9.next()
            r11 = r0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient$ArgPlan r11 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.ArgPlan) r11
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyListClient.INSTANCE
            r0.logInvokePlan(r2, r4, r11)
            r0.logReplyCoreArgs(r2, r4, r11)
            java.lang.Object[] r12 = r11.getArgs()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r0 = r0.invokeLoadMore(r2, r8, r12)     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto Lbb
            return r6
        Lbb:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r12 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r0 = r12.awaitNetworkResult(r0)     // Catch: java.lang.Throwable -> Lc2
            return r0
        Lc2:
            r0 = move-exception
            java.lang.Class r12 = r2.getDeclaringClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = r2.getName()
            java.lang.String r11 = r11.getName()
            java.lang.String r14 = "#"
            java.lang.String r15 = ", plan="
            java.lang.String r3 = "loadMore failed, method="
            java.lang.StringBuilder r3 = p000.lz1.m3695(r3, r12, r14, r13, r15)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            p000.C0888ux.m5977(r5, r3, r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNetCompat.INSTANCE
            boolean r3 = r3.isInvalidParamServerError(r0)
            if (r3 == 0) goto Lf1
            r3 = 1
            goto L9b
        Lf1:
            throw r0
        Lf2:
            r3 = 1
            goto L57
        Lf5:
            if (r0 != 0) goto Lfe
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "loadMoreComments failed"
            r0.<init>(r1)
        Lfe:
            throw r0
        Lff:
            java.lang.String r0 = "comment list api method not found"
            p000.ql1.m4936(r0)
            r0 = 0
            return r0
    }
}
