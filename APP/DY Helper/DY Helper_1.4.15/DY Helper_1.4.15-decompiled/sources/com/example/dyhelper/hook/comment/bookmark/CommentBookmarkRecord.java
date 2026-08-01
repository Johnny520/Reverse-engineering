package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkRecord implements java.io.Serializable {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord.Companion Companion = null;
    private final java.lang.String authorName;
    private int aweType;
    private java.lang.String awemeAuthorId;
    private java.lang.String awemeAuthorSecUid;
    private final java.lang.String awemeId;
    private java.lang.String awemeTitle;
    private final long commentCreateTime;
    private final java.lang.String commentId;
    private java.lang.String commentSecUid;
    private final java.lang.String content;
    private java.lang.String coverUrl;
    private final long createTimestamp;
    private boolean hasNewReplies;
    private java.util.Set<java.lang.String> knownReplyIds;
    private long lastCheckTimestamp;
    private int lastKnownReplyCount;
    private int newReplyCount;
    private java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> newReplyItems;
    private final boolean notificationEnabled;
    private final java.lang.String remark;
    private final java.lang.String userTag;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord fromJson(org.json.JSONObject r27) {
                r26 = this;
                r0 = r27
                r0.getClass()
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                java.lang.String r2 = "knownReplyIds"
                org.json.JSONArray r2 = r0.optJSONArray(r2)
                r3 = 0
                if (r2 == 0) goto L2d
                int r4 = r2.length()
                r5 = r3
            L18:
                if (r5 >= r4) goto L2d
                java.lang.String r6 = r2.optString(r5)
                r6.getClass()
                boolean r7 = p000.q02.m4671(r6)
                if (r7 != 0) goto L2a
                r1.add(r6)
            L2a:
                int r5 = r5 + 1
                goto L18
            L2d:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.lang.String r4 = "newReplyItems"
                org.json.JSONArray r4 = r0.optJSONArray(r4)
                if (r4 == 0) goto L62
                int r5 = r4.length()
            L3e:
                if (r3 >= r5) goto L62
                org.json.JSONObject r6 = r4.optJSONObject(r3)
                if (r6 != 0) goto L47
                goto L5f
            L47:
                java.lang.String r7 = "replyId"
                java.lang.String r7 = r6.optString(r7)
                r7.getClass()
                boolean r7 = p000.q02.m4671(r7)
                if (r7 != 0) goto L5f
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem$Companion r7 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem.Companion
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r6 = r7.fromJson(r6)
                r2.add(r6)
            L5f:
                int r3 = r3 + 1
                goto L3e
            L62:
                java.lang.String r3 = "commentId"
                java.lang.String r3 = r0.optString(r3)
                r3.getClass()
                java.lang.String r4 = "awemeId"
                java.lang.String r4 = r0.optString(r4)
                r4.getClass()
                java.lang.String r5 = "content"
                java.lang.String r5 = r0.optString(r5)
                r5.getClass()
                java.lang.String r6 = "authorName"
                java.lang.String r6 = r0.optString(r6)
                r6.getClass()
                java.lang.String r7 = "commentCreateTime"
                long r7 = r0.optLong(r7)
                java.lang.String r9 = "createTimestamp"
                long r10 = java.lang.System.currentTimeMillis()
                long r9 = r0.optLong(r9, r10)
                java.lang.String r11 = "notificationEnabled"
                r12 = 1
                boolean r11 = r0.optBoolean(r11, r12)
                java.lang.String r12 = "userTag"
                java.lang.String r12 = r0.optString(r12)
                r12.getClass()
                java.lang.String r13 = "remark"
                java.lang.String r13 = r0.optString(r13)
                r13.getClass()
                java.lang.String r14 = "lastCheckTimestamp"
                long r14 = r0.optLong(r14)
                r17 = r1
                java.lang.String r1 = "lastKnownReplyCount"
                int r1 = r0.optInt(r1)
                r26 = r1
                java.lang.String r1 = "hasNewReplies"
                boolean r1 = r0.optBoolean(r1)
                r16 = r1
                java.lang.String r1 = "newReplyCount"
                int r1 = r0.optInt(r1)
                r18 = r1
                java.lang.String r1 = "awemeAuthorId"
                r19 = r2
                java.lang.String r2 = ""
                java.lang.String r1 = r0.optString(r1, r2)
                r1.getClass()
                boolean r20 = p000.q02.m4671(r1)
                r21 = 0
                r22 = r3
                java.lang.String r3 = "null"
                if (r20 != 0) goto Lf1
                boolean r20 = r1.equals(r3)
                if (r20 != 0) goto Lf1
                r20 = r1
                goto Lf3
            Lf1:
                r20 = r21
            Lf3:
                java.lang.String r1 = "awemeAuthorSecUid"
                java.lang.String r1 = r0.optString(r1, r2)
                r1.getClass()
                boolean r23 = p000.q02.m4671(r1)
                if (r23 != 0) goto L10b
                boolean r23 = r1.equals(r3)
                if (r23 != 0) goto L10b
                r23 = r1
                goto L10d
            L10b:
                r23 = r21
            L10d:
                java.lang.String r1 = "awemeTitle"
                java.lang.String r1 = r0.optString(r1, r2)
                r1.getClass()
                boolean r24 = p000.q02.m4671(r1)
                if (r24 != 0) goto L125
                boolean r24 = r1.equals(r3)
                if (r24 != 0) goto L125
                r24 = r1
                goto L127
            L125:
                r24 = r21
            L127:
                java.lang.String r1 = "commentSecUid"
                java.lang.String r1 = r0.optString(r1, r2)
                r1.getClass()
                boolean r25 = p000.q02.m4671(r1)
                if (r25 != 0) goto L13f
                boolean r25 = r1.equals(r3)
                if (r25 != 0) goto L13f
                r25 = r1
                goto L141
            L13f:
                r25 = r21
            L141:
                java.lang.String r1 = "coverUrl"
                java.lang.String r1 = r0.optString(r1, r2)
                r1.getClass()
                boolean r2 = p000.q02.m4671(r1)
                if (r2 != 0) goto L158
                boolean r2 = r1.equals(r3)
                if (r2 != 0) goto L158
                r21 = r1
            L158:
                java.lang.String r1 = "aweType"
                r2 = 10500(0x2904, float:1.4714E-41)
                int r0 = r0.optInt(r1, r2)
                r2 = r4
                r3 = r5
                r4 = r6
                r5 = r7
                r7 = r9
                r9 = r11
                r10 = r12
                r11 = r13
                r12 = r14
                r15 = r16
                r16 = r18
                r18 = r19
                r19 = r20
                r20 = r23
                r23 = r21
                r21 = r24
                r24 = r0
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord
                r14 = r26
                r1 = r22
                r22 = r25
                r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return r0
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord$Companion r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord$Companion
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord.Companion = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord.$stable = r0
            return
    }

    public CommentBookmarkRecord(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5, long r7, boolean r9, java.lang.String r10, java.lang.String r11, long r12, int r14, boolean r15, int r16, java.util.Set<java.lang.String> r17, java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r10.getClass()
            r11.getClass()
            r17.getClass()
            r18.getClass()
            r0.<init>()
            r0.commentId = r1
            r0.awemeId = r2
            r0.content = r3
            r0.authorName = r4
            r0.commentCreateTime = r5
            r0.createTimestamp = r7
            r0.notificationEnabled = r9
            r0.userTag = r10
            r0.remark = r11
            r0.lastCheckTimestamp = r12
            r0.lastKnownReplyCount = r14
            r0.hasNewReplies = r15
            r1 = r16
            r0.newReplyCount = r1
            r1 = r17
            r0.knownReplyIds = r1
            r1 = r18
            r0.newReplyItems = r1
            r1 = r19
            r0.awemeAuthorId = r1
            r1 = r20
            r0.awemeAuthorSecUid = r1
            r1 = r21
            r0.awemeTitle = r1
            r1 = r22
            r0.commentSecUid = r1
            r1 = r23
            r0.coverUrl = r1
            r1 = r24
            r0.aweType = r1
            return
    }

    public /* synthetic */ CommentBookmarkRecord(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, long r27, long r29, boolean r31, java.lang.String r32, java.lang.String r33, long r34, int r36, boolean r37, int r38, java.util.Set r39, java.util.List r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, int r46, int r47, p000.AbstractC1067zq r48) {
            r22 = this;
            r0 = r47
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lc
        La:
            r1 = r24
        Lc:
            r3 = r0 & 4
            if (r3 == 0) goto L12
            r3 = r2
            goto L14
        L12:
            r3 = r25
        L14:
            r4 = r0 & 8
            if (r4 == 0) goto L1a
            r4 = r2
            goto L1c
        L1a:
            r4 = r26
        L1c:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L24
            r8 = r6
            goto L26
        L24:
            r8 = r27
        L26:
            r5 = r0 & 32
            if (r5 == 0) goto L2f
            long r10 = java.lang.System.currentTimeMillis()
            goto L31
        L2f:
            r10 = r29
        L31:
            r5 = r0 & 64
            if (r5 == 0) goto L37
            r5 = 1
            goto L39
        L37:
            r5 = r31
        L39:
            r12 = r0 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L3f
            r12 = r2
            goto L41
        L3f:
            r12 = r32
        L41:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L46
            goto L48
        L46:
            r2 = r33
        L48:
            r13 = r0 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L4d
            goto L4f
        L4d:
            r6 = r34
        L4f:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L55
            r13 = 0
            goto L57
        L55:
            r13 = r36
        L57:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L5d
            r15 = 0
            goto L5f
        L5d:
            r15 = r37
        L5f:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L65
            r14 = 0
            goto L67
        L65:
            r14 = r38
        L67:
            r24 = r1
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L73
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            goto L75
        L73:
            r1 = r39
        L75:
            r25 = r1
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L81
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L83
        L81:
            r1 = r40
        L83:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            r17 = 0
            if (r16 == 0) goto L8f
            r16 = r17
            goto L91
        L8f:
            r16 = r41
        L91:
            r18 = 65536(0x10000, float:9.1835E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L9a
            r18 = r17
            goto L9c
        L9a:
            r18 = r42
        L9c:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto La5
            r19 = r17
            goto La7
        La5:
            r19 = r43
        La7:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto Lb0
            r20 = r17
            goto Lb2
        Lb0:
            r20 = r44
        Lb2:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto Lb9
            goto Lbb
        Lb9:
            r17 = r45
        Lbb:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r21
            if (r0 == 0) goto Lf0
            r0 = 10500(0x2904, float:1.4714E-41)
            r48 = r0
        Lc5:
            r26 = r24
            r41 = r25
            r42 = r1
            r35 = r2
            r27 = r3
            r28 = r4
            r33 = r5
            r36 = r6
            r29 = r8
            r31 = r10
            r34 = r12
            r38 = r13
            r40 = r14
            r39 = r15
            r43 = r16
            r47 = r17
            r44 = r18
            r45 = r19
            r46 = r20
            r24 = r22
            r25 = r23
            goto Lf3
        Lf0:
            r48 = r46
            goto Lc5
        Lf3:
            r24.<init>(r25, r26, r27, r28, r29, r31, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return
    }

    public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, long r22, long r24, boolean r26, java.lang.String r27, java.lang.String r28, long r29, int r31, boolean r32, int r33, java.util.Set r34, java.util.List r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41, int r42, java.lang.Object r43) {
            r0 = r17
            r1 = r42
            r2 = r1 & 1
            if (r2 == 0) goto Lb
            java.lang.String r2 = r0.commentId
            goto Ld
        Lb:
            r2 = r18
        Ld:
            r3 = r1 & 2
            if (r3 == 0) goto L14
            java.lang.String r3 = r0.awemeId
            goto L16
        L14:
            r3 = r19
        L16:
            r4 = r1 & 4
            if (r4 == 0) goto L1d
            java.lang.String r4 = r0.content
            goto L1f
        L1d:
            r4 = r20
        L1f:
            r5 = r1 & 8
            if (r5 == 0) goto L26
            java.lang.String r5 = r0.authorName
            goto L28
        L26:
            r5 = r21
        L28:
            r6 = r1 & 16
            if (r6 == 0) goto L2f
            long r6 = r0.commentCreateTime
            goto L31
        L2f:
            r6 = r22
        L31:
            r8 = r1 & 32
            if (r8 == 0) goto L38
            long r8 = r0.createTimestamp
            goto L3a
        L38:
            r8 = r24
        L3a:
            r10 = r1 & 64
            if (r10 == 0) goto L41
            boolean r10 = r0.notificationEnabled
            goto L43
        L41:
            r10 = r26
        L43:
            r11 = r1 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L4a
            java.lang.String r11 = r0.userTag
            goto L4c
        L4a:
            r11 = r27
        L4c:
            r12 = r1 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L53
            java.lang.String r12 = r0.remark
            goto L55
        L53:
            r12 = r28
        L55:
            r13 = r1 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L5c
            long r13 = r0.lastCheckTimestamp
            goto L5e
        L5c:
            r13 = r29
        L5e:
            r15 = r1 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L65
            int r15 = r0.lastKnownReplyCount
            goto L67
        L65:
            r15 = r31
        L67:
            r18 = r2
            r2 = r1 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L70
            boolean r2 = r0.hasNewReplies
            goto L72
        L70:
            r2 = r32
        L72:
            r19 = r2
            r2 = r1 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L7b
            int r2 = r0.newReplyCount
            goto L7d
        L7b:
            r2 = r33
        L7d:
            r20 = r2
            r2 = r1 & 8192(0x2000, float:1.148E-41)
            if (r2 == 0) goto L86
            java.util.Set<java.lang.String> r2 = r0.knownReplyIds
            goto L88
        L86:
            r2 = r34
        L88:
            r21 = r2
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L91
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r2 = r0.newReplyItems
            goto L93
        L91:
            r2 = r35
        L93:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r1 & r16
            if (r16 == 0) goto L9d
            java.lang.String r1 = r0.awemeAuthorId
            goto L9f
        L9d:
            r1 = r36
        L9f:
            r16 = 65536(0x10000, float:9.1835E-41)
            r16 = r42 & r16
            r22 = r1
            if (r16 == 0) goto Laa
            java.lang.String r1 = r0.awemeAuthorSecUid
            goto Lac
        Laa:
            r1 = r37
        Lac:
            r16 = 131072(0x20000, float:1.83671E-40)
            r16 = r42 & r16
            r23 = r1
            if (r16 == 0) goto Lb7
            java.lang.String r1 = r0.awemeTitle
            goto Lb9
        Lb7:
            r1 = r38
        Lb9:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r42 & r16
            r24 = r1
            if (r16 == 0) goto Lc4
            java.lang.String r1 = r0.commentSecUid
            goto Lc6
        Lc4:
            r1 = r39
        Lc6:
            r16 = 524288(0x80000, float:7.34684E-40)
            r16 = r42 & r16
            r25 = r1
            if (r16 == 0) goto Ld1
            java.lang.String r1 = r0.coverUrl
            goto Ld3
        Ld1:
            r1 = r40
        Ld3:
            r16 = 1048576(0x100000, float:1.469368E-39)
            r16 = r42 & r16
            if (r16 == 0) goto L10a
            r26 = r1
            int r1 = r0.aweType
            r41 = r26
            r42 = r1
        Le1:
            r33 = r19
            r34 = r20
            r35 = r21
            r37 = r22
            r38 = r23
            r39 = r24
            r40 = r25
            r36 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r25 = r8
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r32 = r15
            r19 = r18
            r18 = r0
            goto L10f
        L10a:
            r42 = r41
            r41 = r1
            goto Le1
        L10f:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = r18.copy(r19, r20, r21, r22, r23, r25, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r0
    }

    public final java.lang.String component1() {
            r0 = this;
            java.lang.String r0 = r0.commentId
            return r0
    }

    public final long component10() {
            r2 = this;
            long r0 = r2.lastCheckTimestamp
            return r0
    }

    public final int component11() {
            r0 = this;
            int r0 = r0.lastKnownReplyCount
            return r0
    }

    public final boolean component12() {
            r0 = this;
            boolean r0 = r0.hasNewReplies
            return r0
    }

    public final int component13() {
            r0 = this;
            int r0 = r0.newReplyCount
            return r0
    }

    public final java.util.Set<java.lang.String> component14() {
            r0 = this;
            java.util.Set<java.lang.String> r0 = r0.knownReplyIds
            return r0
    }

    public final java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> component15() {
            r0 = this;
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r0 = r0.newReplyItems
            return r0
    }

    public final java.lang.String component16() {
            r0 = this;
            java.lang.String r0 = r0.awemeAuthorId
            return r0
    }

    public final java.lang.String component17() {
            r0 = this;
            java.lang.String r0 = r0.awemeAuthorSecUid
            return r0
    }

    public final java.lang.String component18() {
            r0 = this;
            java.lang.String r0 = r0.awemeTitle
            return r0
    }

    public final java.lang.String component19() {
            r0 = this;
            java.lang.String r0 = r0.commentSecUid
            return r0
    }

    public final java.lang.String component2() {
            r0 = this;
            java.lang.String r0 = r0.awemeId
            return r0
    }

    public final java.lang.String component20() {
            r0 = this;
            java.lang.String r0 = r0.coverUrl
            return r0
    }

    public final int component21() {
            r0 = this;
            int r0 = r0.aweType
            return r0
    }

    public final java.lang.String component3() {
            r0 = this;
            java.lang.String r0 = r0.content
            return r0
    }

    public final java.lang.String component4() {
            r0 = this;
            java.lang.String r0 = r0.authorName
            return r0
    }

    public final long component5() {
            r2 = this;
            long r0 = r2.commentCreateTime
            return r0
    }

    public final long component6() {
            r2 = this;
            long r0 = r2.createTimestamp
            return r0
    }

    public final boolean component7() {
            r0 = this;
            boolean r0 = r0.notificationEnabled
            return r0
    }

    public final java.lang.String component8() {
            r0 = this;
            java.lang.String r0 = r0.userTag
            return r0
    }

    public final java.lang.String component9() {
            r0 = this;
            java.lang.String r0 = r0.remark
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord copy(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, long r30, long r32, boolean r34, java.lang.String r35, java.lang.String r36, long r37, int r39, boolean r40, int r41, java.util.Set<java.lang.String> r42, java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, int r49) {
            r25 = this;
            r26.getClass()
            r27.getClass()
            r28.getClass()
            r29.getClass()
            r35.getClass()
            r36.getClass()
            r42.getClass()
            r43.getClass()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r7 = r32
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r37
            r14 = r39
            r15 = r40
            r16 = r41
            r17 = r42
            r18 = r43
            r19 = r44
            r20 = r45
            r21 = r46
            r22 = r47
            r23 = r48
            r24 = r49
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r8 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r8
            java.lang.String r1 = r7.commentId
            java.lang.String r3 = r8.commentId
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.awemeId
            java.lang.String r3 = r8.awemeId
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.content
            java.lang.String r3 = r8.content
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.authorName
            java.lang.String r3 = r8.authorName
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            long r3 = r7.commentCreateTime
            long r5 = r8.commentCreateTime
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L41
            return r2
        L41:
            long r3 = r7.createTimestamp
            long r5 = r8.createTimestamp
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L4a
            return r2
        L4a:
            boolean r1 = r7.notificationEnabled
            boolean r3 = r8.notificationEnabled
            if (r1 == r3) goto L51
            return r2
        L51:
            java.lang.String r1 = r7.userTag
            java.lang.String r3 = r8.userTag
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            java.lang.String r1 = r7.remark
            java.lang.String r3 = r8.remark
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L67
            return r2
        L67:
            long r3 = r7.lastCheckTimestamp
            long r5 = r8.lastCheckTimestamp
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L70
            return r2
        L70:
            int r1 = r7.lastKnownReplyCount
            int r3 = r8.lastKnownReplyCount
            if (r1 == r3) goto L77
            return r2
        L77:
            boolean r1 = r7.hasNewReplies
            boolean r3 = r8.hasNewReplies
            if (r1 == r3) goto L7e
            return r2
        L7e:
            int r1 = r7.newReplyCount
            int r3 = r8.newReplyCount
            if (r1 == r3) goto L85
            return r2
        L85:
            java.util.Set<java.lang.String> r1 = r7.knownReplyIds
            java.util.Set<java.lang.String> r3 = r8.knownReplyIds
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L90
            return r2
        L90:
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r1 = r7.newReplyItems
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r3 = r8.newReplyItems
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L9b
            return r2
        L9b:
            java.lang.String r1 = r7.awemeAuthorId
            java.lang.String r3 = r8.awemeAuthorId
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto La6
            return r2
        La6:
            java.lang.String r1 = r7.awemeAuthorSecUid
            java.lang.String r3 = r8.awemeAuthorSecUid
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto Lb1
            return r2
        Lb1:
            java.lang.String r1 = r7.awemeTitle
            java.lang.String r3 = r8.awemeTitle
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto Lbc
            return r2
        Lbc:
            java.lang.String r1 = r7.commentSecUid
            java.lang.String r3 = r8.commentSecUid
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto Lc7
            return r2
        Lc7:
            java.lang.String r1 = r7.coverUrl
            java.lang.String r3 = r8.coverUrl
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto Ld2
            return r2
        Ld2:
            int r7 = r7.aweType
            int r8 = r8.aweType
            if (r7 == r8) goto Ld9
            return r2
        Ld9:
            return r0
    }

    public final java.lang.String getAuthorName() {
            r0 = this;
            java.lang.String r0 = r0.authorName
            return r0
    }

    public final int getAweType() {
            r0 = this;
            int r0 = r0.aweType
            return r0
    }

    public final java.lang.String getAwemeAuthorId() {
            r0 = this;
            java.lang.String r0 = r0.awemeAuthorId
            return r0
    }

    public final java.lang.String getAwemeAuthorSecUid() {
            r0 = this;
            java.lang.String r0 = r0.awemeAuthorSecUid
            return r0
    }

    public final java.lang.String getAwemeId() {
            r0 = this;
            java.lang.String r0 = r0.awemeId
            return r0
    }

    public final java.lang.String getAwemeTitle() {
            r0 = this;
            java.lang.String r0 = r0.awemeTitle
            return r0
    }

    public final long getCommentCreateTime() {
            r2 = this;
            long r0 = r2.commentCreateTime
            return r0
    }

    public final java.lang.String getCommentId() {
            r0 = this;
            java.lang.String r0 = r0.commentId
            return r0
    }

    public final java.lang.String getCommentSecUid() {
            r0 = this;
            java.lang.String r0 = r0.commentSecUid
            return r0
    }

    public final java.lang.String getContent() {
            r0 = this;
            java.lang.String r0 = r0.content
            return r0
    }

    public final java.lang.String getCoverUrl() {
            r0 = this;
            java.lang.String r0 = r0.coverUrl
            return r0
    }

    public final long getCreateTimestamp() {
            r2 = this;
            long r0 = r2.createTimestamp
            return r0
    }

    public final boolean getHasNewReplies() {
            r0 = this;
            boolean r0 = r0.hasNewReplies
            return r0
    }

    public final java.util.Set<java.lang.String> getKnownReplyIds() {
            r0 = this;
            java.util.Set<java.lang.String> r0 = r0.knownReplyIds
            return r0
    }

    public final long getLastCheckTimestamp() {
            r2 = this;
            long r0 = r2.lastCheckTimestamp
            return r0
    }

    public final int getLastKnownReplyCount() {
            r0 = this;
            int r0 = r0.lastKnownReplyCount
            return r0
    }

    public final int getNewReplyCount() {
            r0 = this;
            int r0 = r0.newReplyCount
            return r0
    }

    public final java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> getNewReplyItems() {
            r0 = this;
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r0 = r0.newReplyItems
            return r0
    }

    public final boolean getNotificationEnabled() {
            r0 = this;
            boolean r0 = r0.notificationEnabled
            return r0
    }

    public final java.lang.String getRemark() {
            r0 = this;
            java.lang.String r0 = r0.remark
            return r0
    }

    public final java.lang.String getUserTag() {
            r0 = this;
            java.lang.String r0 = r0.userTag
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.commentId
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.awemeId
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.content
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.authorName
            int r0 = p000.a12.m15(r0, r1, r2)
            long r2 = r4.commentCreateTime
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.createTimestamp
            int r0 = p000.lz1.m3677(r0, r1, r2)
            boolean r2 = r4.notificationEnabled
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r2 = r4.userTag
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.remark
            int r0 = p000.a12.m15(r0, r1, r2)
            long r2 = r4.lastCheckTimestamp
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r2 = r4.lastKnownReplyCount
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r4.hasNewReplies
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r2 = r4.newReplyCount
            int r0 = p000.a12.m14(r2, r0, r1)
            java.util.Set<java.lang.String> r2 = r4.knownReplyIds
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r0 = r4.newReplyItems
            int r0 = p000.a12.m16(r0, r2, r1)
            java.lang.String r2 = r4.awemeAuthorId
            r3 = 0
            if (r2 != 0) goto L66
            r2 = r3
            goto L6a
        L66:
            int r2 = r2.hashCode()
        L6a:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.awemeAuthorSecUid
            if (r2 != 0) goto L72
            r2 = r3
            goto L76
        L72:
            int r2 = r2.hashCode()
        L76:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.awemeTitle
            if (r2 != 0) goto L7e
            r2 = r3
            goto L82
        L7e:
            int r2 = r2.hashCode()
        L82:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.commentSecUid
            if (r2 != 0) goto L8a
            r2 = r3
            goto L8e
        L8a:
            int r2 = r2.hashCode()
        L8e:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.coverUrl
            if (r2 != 0) goto L95
            goto L99
        L95:
            int r3 = r2.hashCode()
        L99:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r4 = r4.aweType
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final void setAweType(int r1) {
            r0 = this;
            r0.aweType = r1
            return
    }

    public final void setAwemeAuthorId(java.lang.String r1) {
            r0 = this;
            r0.awemeAuthorId = r1
            return
    }

    public final void setAwemeAuthorSecUid(java.lang.String r1) {
            r0 = this;
            r0.awemeAuthorSecUid = r1
            return
    }

    public final void setAwemeTitle(java.lang.String r1) {
            r0 = this;
            r0.awemeTitle = r1
            return
    }

    public final void setCommentSecUid(java.lang.String r1) {
            r0 = this;
            r0.commentSecUid = r1
            return
    }

    public final void setCoverUrl(java.lang.String r1) {
            r0 = this;
            r0.coverUrl = r1
            return
    }

    public final void setHasNewReplies(boolean r1) {
            r0 = this;
            r0.hasNewReplies = r1
            return
    }

    public final void setKnownReplyIds(java.util.Set<java.lang.String> r1) {
            r0 = this;
            r1.getClass()
            r0.knownReplyIds = r1
            return
    }

    public final void setLastCheckTimestamp(long r1) {
            r0 = this;
            r0.lastCheckTimestamp = r1
            return
    }

    public final void setLastKnownReplyCount(int r1) {
            r0 = this;
            r0.lastKnownReplyCount = r1
            return
    }

    public final void setNewReplyCount(int r1) {
            r0 = this;
            r0.newReplyCount = r1
            return
    }

    public final void setNewReplyItems(java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r1) {
            r0 = this;
            r1.getClass()
            r0.newReplyItems = r1
            return
    }

    public final org.json.JSONObject toJson() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "commentId"
            java.lang.String r2 = r4.commentId
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "awemeId"
            java.lang.String r2 = r4.awemeId
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "content"
            java.lang.String r2 = r4.content
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "authorName"
            java.lang.String r2 = r4.authorName
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "commentCreateTime"
            long r2 = r4.commentCreateTime
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "createTimestamp"
            long r2 = r4.createTimestamp
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "notificationEnabled"
            boolean r2 = r4.notificationEnabled
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "userTag"
            java.lang.String r2 = r4.userTag
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "remark"
            java.lang.String r2 = r4.remark
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "lastCheckTimestamp"
            long r2 = r4.lastCheckTimestamp
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "lastKnownReplyCount"
            int r2 = r4.lastKnownReplyCount
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "hasNewReplies"
            boolean r2 = r4.hasNewReplies
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "newReplyCount"
            int r2 = r4.newReplyCount
            org.json.JSONObject r0 = r0.put(r1, r2)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Set<java.lang.String> r2 = r4.knownReplyIds
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L7a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r3)
            goto L7a
        L8a:
            java.lang.String r2 = "knownReplyIds"
            r0.put(r2, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r2 = r4.newReplyItems
            java.util.Iterator r2 = r2.iterator()
        L9a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r2.next()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r3 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r3
            org.json.JSONObject r3 = r3.toJson()
            r1.put(r3)
            goto L9a
        Lae:
            java.lang.String r2 = "newReplyItems"
            r0.put(r2, r1)
            java.lang.String r1 = "awemeAuthorId"
            java.lang.String r2 = r4.awemeAuthorId
            r0.put(r1, r2)
            java.lang.String r1 = "awemeAuthorSecUid"
            java.lang.String r2 = r4.awemeAuthorSecUid
            r0.put(r1, r2)
            java.lang.String r1 = "awemeTitle"
            java.lang.String r2 = r4.awemeTitle
            r0.put(r1, r2)
            java.lang.String r1 = "commentSecUid"
            java.lang.String r2 = r4.commentSecUid
            r0.put(r1, r2)
            java.lang.String r1 = "coverUrl"
            java.lang.String r2 = r4.coverUrl
            r0.put(r1, r2)
            java.lang.String r1 = "aweType"
            int r4 = r4.aweType
            r0.put(r1, r4)
            return r0
    }

    public java.lang.String toString() {
            r26 = this;
            r0 = r26
            java.lang.String r1 = r0.commentId
            java.lang.String r2 = r0.awemeId
            java.lang.String r3 = r0.content
            java.lang.String r4 = r0.authorName
            long r5 = r0.commentCreateTime
            long r7 = r0.createTimestamp
            boolean r9 = r0.notificationEnabled
            java.lang.String r10 = r0.userTag
            java.lang.String r11 = r0.remark
            long r12 = r0.lastCheckTimestamp
            int r14 = r0.lastKnownReplyCount
            boolean r15 = r0.hasNewReplies
            r16 = r15
            int r15 = r0.newReplyCount
            r17 = r15
            java.util.Set<java.lang.String> r15 = r0.knownReplyIds
            r18 = r15
            java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem> r15 = r0.newReplyItems
            r19 = r15
            java.lang.String r15 = r0.awemeAuthorId
            r20 = r15
            java.lang.String r15 = r0.awemeAuthorSecUid
            r21 = r15
            java.lang.String r15 = r0.awemeTitle
            r22 = r15
            java.lang.String r15 = r0.commentSecUid
            r23 = r15
            java.lang.String r15 = r0.coverUrl
            int r0 = r0.aweType
            r26 = r0
            java.lang.String r0 = ", awemeId="
            r24 = r15
            java.lang.String r15 = ", content="
            r25 = r14
            java.lang.String r14 = "CommentBookmarkRecord(commentId="
            java.lang.StringBuilder r0 = p000.lz1.m3695(r14, r1, r0, r2, r15)
            java.lang.String r1 = ", authorName="
            java.lang.String r2 = ", commentCreateTime="
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            r0.append(r5)
            java.lang.String r1 = ", createTimestamp="
            java.lang.String r2 = ", notificationEnabled="
            p000.AbstractC0602nx.m4118(r0, r1, r7, r2)
            r0.append(r9)
            java.lang.String r1 = ", userTag="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", remark="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", lastCheckTimestamp="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", lastKnownReplyCount="
            r0.append(r1)
            r1 = r25
            r0.append(r1)
            java.lang.String r1 = ", hasNewReplies="
            r0.append(r1)
            r1 = r16
            r0.append(r1)
            java.lang.String r1 = ", newReplyCount="
            r0.append(r1)
            r1 = r17
            r0.append(r1)
            java.lang.String r1 = ", knownReplyIds="
            r0.append(r1)
            r1 = r18
            r0.append(r1)
            java.lang.String r1 = ", newReplyItems="
            r0.append(r1)
            r1 = r19
            r0.append(r1)
            java.lang.String r1 = ", awemeAuthorId="
            r0.append(r1)
            r1 = r20
            r0.append(r1)
            java.lang.String r1 = ", awemeAuthorSecUid="
            java.lang.String r2 = ", awemeTitle="
            r3 = r21
            r4 = r22
            p000.AbstractC0602nx.m4119(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", commentSecUid="
            java.lang.String r2 = ", coverUrl="
            r3 = r23
            r4 = r24
            p000.AbstractC0602nx.m4119(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", aweType="
            r0.append(r1)
            r1 = r26
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
