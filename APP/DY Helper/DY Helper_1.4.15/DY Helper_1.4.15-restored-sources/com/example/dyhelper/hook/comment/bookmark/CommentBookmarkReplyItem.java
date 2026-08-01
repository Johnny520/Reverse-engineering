package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkReplyItem implements java.io.Serializable {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem.Companion Companion = null;
    private final java.lang.String authorName;
    private final java.lang.String content;
    private final long createTime;
    private final java.lang.String replyId;

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

        public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem fromJson(org.json.JSONObject r7) {
                r6 = this;
                r7.getClass()
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem
                java.lang.String r6 = "replyId"
                java.lang.String r1 = r7.optString(r6)
                r1.getClass()
                java.lang.String r6 = "authorName"
                java.lang.String r2 = r7.optString(r6)
                r2.getClass()
                java.lang.String r6 = "content"
                java.lang.String r3 = r7.optString(r6)
                r3.getClass()
                java.lang.String r6 = "createTime"
                r4 = 0
                long r4 = r7.optLong(r6, r4)
                r0.<init>(r1, r2, r3, r4)
                return r0
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem$Companion r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem$Companion
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem.Companion = r0
            return
    }

    public CommentBookmarkReplyItem(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.replyId = r1
            r0.authorName = r2
            r0.content = r3
            r0.createTime = r4
            return
    }

    public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem copy$default(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            java.lang.String r1 = r0.replyId
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            java.lang.String r2 = r0.authorName
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L12
            java.lang.String r3 = r0.content
        L12:
            r6 = r6 & 8
            if (r6 == 0) goto L18
            long r4 = r0.createTime
        L18:
            r6 = r4
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r0 = r2.copy(r3, r4, r5, r6)
            return r0
    }

    public final java.lang.String component1() {
            r0 = this;
            java.lang.String r0 = r0.replyId
            return r0
    }

    public final java.lang.String component2() {
            r0 = this;
            java.lang.String r0 = r0.authorName
            return r0
    }

    public final java.lang.String component3() {
            r0 = this;
            java.lang.String r0 = r0.content
            return r0
    }

    public final long component4() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem copy(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r6 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r6
            java.lang.String r1 = r5.replyId
            java.lang.String r3 = r6.replyId
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.authorName
            java.lang.String r3 = r6.authorName
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.content
            java.lang.String r3 = r6.content
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            long r3 = r5.createTime
            long r5 = r6.createTime
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L36
            return r2
        L36:
            return r0
    }

    public final java.lang.String getAuthorName() {
            r0 = this;
            java.lang.String r0 = r0.authorName
            return r0
    }

    public final java.lang.String getContent() {
            r0 = this;
            java.lang.String r0 = r0.content
            return r0
    }

    public final long getCreateTime() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final java.lang.String getReplyId() {
            r0 = this;
            java.lang.String r0 = r0.replyId
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.replyId
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.authorName
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.content
            int r0 = p000.a12.m15(r0, r1, r2)
            long r1 = r3.createTime
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final org.json.JSONObject toJson() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "replyId"
            java.lang.String r2 = r4.replyId
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "authorName"
            java.lang.String r2 = r4.authorName
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "content"
            java.lang.String r2 = r4.content
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "createTime"
            long r2 = r4.createTime
            org.json.JSONObject r4 = r0.put(r1, r2)
            r4.getClass()
            return r4
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.String r0 = r7.replyId
            java.lang.String r1 = r7.authorName
            java.lang.String r2 = r7.content
            long r3 = r7.createTime
            java.lang.String r7 = ", authorName="
            java.lang.String r5 = ", content="
            java.lang.String r6 = "CommentBookmarkReplyItem(replyId="
            java.lang.StringBuilder r7 = p000.lz1.m3695(r6, r0, r7, r1, r5)
            r7.append(r2)
            java.lang.String r0 = ", createTime="
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = ")"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            return r7
    }
}
