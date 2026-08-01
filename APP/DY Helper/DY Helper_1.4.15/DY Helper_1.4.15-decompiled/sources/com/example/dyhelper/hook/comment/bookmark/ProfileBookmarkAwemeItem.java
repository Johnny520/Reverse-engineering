package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileBookmarkAwemeItem implements java.io.Serializable {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem.Companion Companion = null;
    private final java.lang.String awemeId;
    private final java.lang.String coverUrl;
    private final long createTime;
    private final java.lang.String desc;

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

        public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem fromJson(org.json.JSONObject r7) {
                r6 = this;
                r7.getClass()
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem
                java.lang.String r6 = "awemeId"
                java.lang.String r1 = r7.optString(r6)
                r1.getClass()
                java.lang.String r6 = "desc"
                java.lang.String r2 = r7.optString(r6)
                r2.getClass()
                java.lang.String r6 = "createTime"
                r3 = 0
                long r3 = r7.optLong(r6, r3)
                java.lang.String r6 = "coverUrl"
                java.lang.String r5 = r7.optString(r6)
                r5.getClass()
                r0.<init>(r1, r2, r3, r5)
                return r0
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem$Companion r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem$Companion
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem.Companion = r0
            return
    }

    public ProfileBookmarkAwemeItem(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r5.getClass()
            r0.<init>()
            r0.awemeId = r1
            r0.desc = r2
            r0.createTime = r3
            r0.coverUrl = r5
            return
    }

    public /* synthetic */ ProfileBookmarkAwemeItem(java.lang.String r7, java.lang.String r8, long r9, java.lang.String r11, int r12, p000.AbstractC1067zq r13) {
            r6 = this;
            r12 = r12 & 8
            if (r12 == 0) goto L6
            java.lang.String r11 = ""
        L6:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem copy$default(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r0, java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            java.lang.String r1 = r0.awemeId
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            java.lang.String r2 = r0.desc
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L12
            long r3 = r0.createTime
        L12:
            r6 = r6 & 8
            if (r6 == 0) goto L18
            java.lang.String r5 = r0.coverUrl
        L18:
            r7 = r5
            r5 = r3
            r3 = r1
            r4 = r2
            r2 = r0
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r0 = r2.copy(r3, r4, r5, r7)
            return r0
    }

    public final java.lang.String component1() {
            r0 = this;
            java.lang.String r0 = r0.awemeId
            return r0
    }

    public final java.lang.String component2() {
            r0 = this;
            java.lang.String r0 = r0.desc
            return r0
    }

    public final long component3() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final java.lang.String component4() {
            r0 = this;
            java.lang.String r0 = r0.coverUrl
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem copy(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r5.getClass()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r8 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r8
            java.lang.String r1 = r7.awemeId
            java.lang.String r3 = r8.awemeId
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.desc
            java.lang.String r3 = r8.desc
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            long r3 = r7.createTime
            long r5 = r8.createTime
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2b
            return r2
        L2b:
            java.lang.String r7 = r7.coverUrl
            java.lang.String r8 = r8.coverUrl
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 != 0) goto L36
            return r2
        L36:
            return r0
    }

    public final java.lang.String getAwemeId() {
            r0 = this;
            java.lang.String r0 = r0.awemeId
            return r0
    }

    public final java.lang.String getCoverUrl() {
            r0 = this;
            java.lang.String r0 = r0.coverUrl
            return r0
    }

    public final long getCreateTime() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final java.lang.String getDesc() {
            r0 = this;
            java.lang.String r0 = r0.desc
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.awemeId
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.desc
            int r0 = p000.a12.m15(r0, r1, r2)
            long r2 = r4.createTime
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r4 = r4.coverUrl
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final org.json.JSONObject toJson() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "awemeId"
            java.lang.String r2 = r4.awemeId
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "desc"
            java.lang.String r2 = r4.desc
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "createTime"
            long r2 = r4.createTime
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "coverUrl"
            java.lang.String r4 = r4.coverUrl
            org.json.JSONObject r4 = r0.put(r1, r4)
            r4.getClass()
            return r4
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.String r0 = r7.awemeId
            java.lang.String r1 = r7.desc
            long r2 = r7.createTime
            java.lang.String r7 = r7.coverUrl
            java.lang.String r4 = ", desc="
            java.lang.String r5 = ", createTime="
            java.lang.String r6 = "ProfileBookmarkAwemeItem(awemeId="
            java.lang.StringBuilder r0 = p000.lz1.m3695(r6, r0, r4, r1, r5)
            r0.append(r2)
            java.lang.String r1 = ", coverUrl="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ")"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }
}
