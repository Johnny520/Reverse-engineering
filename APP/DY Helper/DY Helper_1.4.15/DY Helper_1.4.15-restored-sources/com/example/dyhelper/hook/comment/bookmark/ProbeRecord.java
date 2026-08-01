package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProbeRecord implements java.io.Serializable {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.ProbeRecord.Companion Companion = null;
    private final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord commentRecord;
    private final long createTime;
    private final java.lang.String group;

    /* JADX INFO: renamed from: id */
    private final java.lang.String f2263id;
    private final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord profileRecord;
    private final com.example.dyhelper.hook.comment.bookmark.ProbeType type;

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

        public final com.example.dyhelper.hook.comment.bookmark.ProbeRecord fromJson(org.json.JSONObject r9) {
                r8 = this;
                r9.getClass()
                java.lang.String r8 = "type"
                java.lang.String r8 = r9.optString(r8)     // Catch: java.lang.Throwable -> L11
                r8.getClass()     // Catch: java.lang.Throwable -> L11
                com.example.dyhelper.hook.comment.bookmark.ProbeType r8 = com.example.dyhelper.hook.comment.bookmark.ProbeType.valueOf(r8)     // Catch: java.lang.Throwable -> L11
                goto L19
            L11:
                r0 = move-exception
                r8 = r0
                eo1 r0 = new eo1
                r0.<init>(r8)
                r8 = r0
            L19:
                com.example.dyhelper.hook.comment.bookmark.ProbeType r0 = com.example.dyhelper.hook.comment.bookmark.ProbeType.COMMENT
                boolean r1 = r8 instanceof p000.eo1
                if (r1 == 0) goto L20
                r8 = r0
            L20:
                r2 = r8
                com.example.dyhelper.hook.comment.bookmark.ProbeType r2 = (com.example.dyhelper.hook.comment.bookmark.ProbeType) r2
                java.lang.String r8 = "id"
                java.lang.String r1 = r9.optString(r8)
                r1.getClass()
                java.lang.String r8 = "group"
                java.lang.String r3 = r9.optString(r8)
                r3.getClass()
                java.lang.String r8 = "createTime"
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r9.optLong(r8, r4)
                java.lang.String r8 = "commentRecord"
                org.json.JSONObject r8 = r9.optJSONObject(r8)
                r0 = 0
                if (r8 == 0) goto L50
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord$Companion r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord.Companion
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r8 = r6.fromJson(r8)
                r6 = r8
                goto L51
            L50:
                r6 = r0
            L51:
                java.lang.String r8 = "profileRecord"
                org.json.JSONObject r8 = r9.optJSONObject(r8)
                if (r8 == 0) goto L5f
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord$Companion r9 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord.Companion
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r9.fromJson(r8)
            L5f:
                r7 = r0
                com.example.dyhelper.hook.comment.bookmark.ProbeRecord r0 = new com.example.dyhelper.hook.comment.bookmark.ProbeRecord
                r0.<init>(r1, r2, r3, r4, r6, r7)
                return r0
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.ProbeRecord$Companion r0 = new com.example.dyhelper.hook.comment.bookmark.ProbeRecord$Companion
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProbeRecord.Companion = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.ProbeRecord.$stable = r0
            return
    }

    public ProbeRecord(java.lang.String r1, com.example.dyhelper.hook.comment.bookmark.ProbeType r2, java.lang.String r3, long r4, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r6, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f2263id = r1
            r0.type = r2
            r0.group = r3
            r0.createTime = r4
            r0.commentRecord = r6
            r0.profileRecord = r7
            return
    }

    public /* synthetic */ ProbeRecord(java.lang.String r9, com.example.dyhelper.hook.comment.bookmark.ProbeType r10, java.lang.String r11, long r12, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r14, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r15, int r16, p000.AbstractC1067zq r17) {
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L6
            java.lang.String r11 = ""
        L6:
            r3 = r11
            r11 = r16 & 8
            if (r11 == 0) goto Lf
            long r12 = java.lang.System.currentTimeMillis()
        Lf:
            r4 = r12
            r11 = r16 & 16
            r12 = 0
            if (r11 == 0) goto L17
            r6 = r12
            goto L18
        L17:
            r6 = r14
        L18:
            r11 = r16 & 32
            if (r11 == 0) goto L21
            r7 = r12
        L1d:
            r0 = r8
            r1 = r9
            r2 = r10
            goto L23
        L21:
            r7 = r15
            goto L1d
        L23:
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return
    }

    public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProbeRecord copy$default(com.example.dyhelper.hook.comment.bookmark.ProbeRecord r0, java.lang.String r1, com.example.dyhelper.hook.comment.bookmark.ProbeType r2, java.lang.String r3, long r4, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r6, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r7, int r8, java.lang.Object r9) {
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r1 = r0.f2263id
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            com.example.dyhelper.hook.comment.bookmark.ProbeType r2 = r0.type
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L12
            java.lang.String r3 = r0.group
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L18
            long r4 = r0.createTime
        L18:
            r9 = r8 & 16
            if (r9 == 0) goto L1e
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r6 = r0.commentRecord
        L1e:
            r8 = r8 & 32
            if (r8 == 0) goto L24
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r7 = r0.profileRecord
        L24:
            r8 = r6
            r9 = r7
            r6 = r4
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            com.example.dyhelper.hook.comment.bookmark.ProbeRecord r0 = r2.copy(r3, r4, r5, r6, r8, r9)
            return r0
    }

    public final java.lang.String component1() {
            r0 = this;
            java.lang.String r0 = r0.f2263id
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProbeType component2() {
            r0 = this;
            com.example.dyhelper.hook.comment.bookmark.ProbeType r0 = r0.type
            return r0
    }

    public final java.lang.String component3() {
            r0 = this;
            java.lang.String r0 = r0.group
            return r0
    }

    public final long component4() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord component5() {
            r0 = this;
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = r0.commentRecord
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord component6() {
            r0 = this;
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r0.profileRecord
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProbeRecord copy(java.lang.String r1, com.example.dyhelper.hook.comment.bookmark.ProbeType r2, java.lang.String r3, long r4, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r6, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            com.example.dyhelper.hook.comment.bookmark.ProbeRecord r0 = new com.example.dyhelper.hook.comment.bookmark.ProbeRecord
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.example.dyhelper.hook.comment.bookmark.ProbeRecord
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.example.dyhelper.hook.comment.bookmark.ProbeRecord r8 = (com.example.dyhelper.hook.comment.bookmark.ProbeRecord) r8
            java.lang.String r1 = r7.f2263id
            java.lang.String r3 = r8.f2263id
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.example.dyhelper.hook.comment.bookmark.ProbeType r1 = r7.type
            com.example.dyhelper.hook.comment.bookmark.ProbeType r3 = r8.type
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r7.group
            java.lang.String r3 = r8.group
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            long r3 = r7.createTime
            long r5 = r8.createTime
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L32
            return r2
        L32:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = r7.commentRecord
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r3 = r8.commentRecord
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L3d
            return r2
        L3d:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r7 = r7.profileRecord
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r8 = r8.profileRecord
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 != 0) goto L48
            return r2
        L48:
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord getCommentRecord() {
            r0 = this;
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = r0.commentRecord
            return r0
    }

    public final long getCreateTime() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final java.lang.String getGroup() {
            r0 = this;
            java.lang.String r0 = r0.group
            return r0
    }

    public final java.lang.String getId() {
            r0 = this;
            java.lang.String r0 = r0.f2263id
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord getProfileRecord() {
            r0 = this;
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r0.profileRecord
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProbeType getType() {
            r0 = this;
            com.example.dyhelper.hook.comment.bookmark.ProbeType r0 = r0.type
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f2263id
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            com.example.dyhelper.hook.comment.bookmark.ProbeType r2 = r4.type
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r4.group
            int r0 = p000.a12.m15(r2, r1, r0)
            long r2 = r4.createTime
            int r0 = p000.lz1.m3677(r0, r1, r2)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r2 = r4.commentRecord
            r3 = 0
            if (r2 != 0) goto L24
            r2 = r3
            goto L28
        L24:
            int r2 = r2.hashCode()
        L28:
            int r0 = r0 + r2
            int r0 = r0 * r1
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4 = r4.profileRecord
            if (r4 != 0) goto L2f
            goto L33
        L2f:
            int r3 = r4.hashCode()
        L33:
            int r0 = r0 + r3
            return r0
    }

    public final org.json.JSONObject toJson() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r4.f2263id
            org.json.JSONObject r0 = r0.put(r1, r2)
            com.example.dyhelper.hook.comment.bookmark.ProbeType r1 = r4.type
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "type"
            org.json.JSONObject r0 = r0.put(r2, r1)
            java.lang.String r1 = "group"
            java.lang.String r2 = r4.group
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "createTime"
            long r2 = r4.createTime
            org.json.JSONObject r0 = r0.put(r1, r2)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = r4.commentRecord
            if (r1 == 0) goto L36
            java.lang.String r2 = "commentRecord"
            org.json.JSONObject r1 = r1.toJson()
            r0.put(r2, r1)
        L36:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4 = r4.profileRecord
            if (r4 == 0) goto L43
            java.lang.String r1 = "profileRecord"
            org.json.JSONObject r4 = r4.toJson()
            r0.put(r1, r4)
        L43:
            r0.getClass()
            return r0
    }

    public java.lang.String toString() {
            r8 = this;
            java.lang.String r0 = r8.f2263id
            com.example.dyhelper.hook.comment.bookmark.ProbeType r1 = r8.type
            java.lang.String r2 = r8.group
            long r3 = r8.createTime
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r5 = r8.commentRecord
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r8 = r8.profileRecord
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "ProbeRecord(id="
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = ", type="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = ", group="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = ", createTime="
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = ", commentRecord="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", profileRecord="
            r6.append(r0)
            r6.append(r8)
            java.lang.String r8 = ")"
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            return r8
    }
}
