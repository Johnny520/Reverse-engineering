package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class VideoBookmarkRecord implements java.io.Serializable {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord.Companion Companion = null;
    private final java.lang.String authorName;
    private final java.lang.String authorSecUid;
    private final java.lang.String authorUid;
    private final java.lang.String awemeId;
    private final long collectCount;
    private final long commentCount;
    private final java.lang.String coverUrl;
    private final long createTime;
    private final long createTimestamp;
    private final long diggCount;
    private final java.lang.String shareUrl;
    private final java.lang.String title;
    private final java.lang.String typeLabel;

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

        private final java.lang.String resolveTypeLabel(p000.C0276f8 r3) {
                r2 = this;
                h8 r2 = r3.f3798
                h8 r0 = r3.f3798
                h8 r1 = p000.EnumC0350h8.f4617
                if (r2 == r1) goto L3c
                boolean r2 = r3.m2051()
                if (r2 == 0) goto Lf
                goto L3c
            Lf:
                h8 r2 = p000.EnumC0350h8.f4616
                if (r0 == r2) goto L39
                boolean r2 = r3.m2050()
                if (r2 == 0) goto L1a
                goto L39
            L1a:
                h8 r2 = p000.EnumC0350h8.f4615
                if (r0 == r2) goto L36
                boolean r2 = r3.m2053()
                if (r2 == 0) goto L25
                goto L36
            L25:
                h8 r2 = p000.EnumC0350h8.f4618
                if (r0 == r2) goto L33
                boolean r2 = r3.m2049()
                if (r2 == 0) goto L30
                goto L33
            L30:
                java.lang.String r2 = "作品"
                return r2
            L33:
                java.lang.String r2 = "文字作品"
                return r2
            L36:
                java.lang.String r2 = "视频作品"
                return r2
            L39:
                java.lang.String r2 = "图文作品"
                return r2
            L3c:
                java.lang.String r2 = "LivePhoto作品"
                return r2
        }

        public final com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord fromAwemeInfo(p000.C0276f8 r27) {
                r26 = this;
                r0 = r27
                r0.getClass()
                java.util.List r1 = r0.f3786
                java.lang.String r2 = r0.f3800
                r3 = 0
                if (r2 == 0) goto L15
                java.lang.CharSequence r2 = p000.q02.m4660(r2)
                java.lang.String r2 = r2.toString()
                goto L16
            L15:
                r2 = r3
            L16:
                java.lang.String r4 = ""
                if (r2 != 0) goto L1c
                r6 = r4
                goto L1d
            L1c:
                r6 = r2
            L1d:
                boolean r2 = p000.q02.m4671(r6)
                if (r2 == 0) goto L24
                return r3
            L24:
                java.lang.String r7 = r0.f3797
                java.lang.String r8 = r0.f3783
                java.util.List r2 = r0.f3796
                if (r2 == 0) goto L34
                java.lang.Object r2 = p000.AbstractC0984xh.m6640(r2)
                java.lang.String r2 = (java.lang.String) r2
                r9 = r2
                goto L35
            L34:
                r9 = r3
            L35:
                java.lang.String r10 = r0.f3776
                if (r1 == 0) goto L45
                java.lang.Object r2 = p000.AbstractC0984xh.m6640(r1)
                qu0 r2 = (p000.qu0) r2
                if (r2 == 0) goto L45
                java.lang.String r2 = r2.f9113
                r11 = r2
                goto L46
            L45:
                r11 = r3
            L46:
                if (r1 == 0) goto L54
                java.lang.Object r1 = p000.AbstractC0984xh.m6640(r1)
                qu0 r1 = (p000.qu0) r1
                if (r1 == 0) goto L54
                java.lang.String r1 = r1.f9112
                r12 = r1
                goto L55
            L54:
                r12 = r3
            L55:
                java.lang.String[] r1 = new java.lang.String[]{r7, r8, r9, r10, r11, r12}
                java.util.ArrayList r1 = p000.AbstractC0312g7.m2248(r1)
                java.util.Iterator r1 = r1.iterator()
            L61:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L78
                java.lang.Object r2 = r1.next()
                r5 = r2
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r7 = "http"
                r8 = 1
                boolean r5 = p000.x02.m6485(r5, r7, r8)
                if (r5 == 0) goto L61
                r3 = r2
            L78:
                java.lang.String r3 = (java.lang.String) r3
                if (r3 != 0) goto L7e
                r12 = r4
                goto L7f
            L7e:
                r12 = r3
            L7f:
                com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r5 = new com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord
                java.lang.String r7 = r26.resolveTypeLabel(r27)
                java.lang.String r8 = r0.f3794
                java.lang.String r9 = r0.f3793
                java.lang.String r1 = r0.f3801
                if (r1 != 0) goto L8f
                r10 = r4
                goto L90
            L8f:
                r10 = r1
            L90:
                java.lang.String r1 = r0.f3802
                if (r1 != 0) goto L96
                r11 = r4
                goto L97
            L96:
                r11 = r1
            L97:
                java.lang.String r1 = r0.f3799
                if (r1 != 0) goto L9d
                r13 = r4
                goto L9e
            L9d:
                r13 = r1
            L9e:
                long r14 = r0.f3789
                long r1 = r0.f3790
                long r3 = r0.f3791
                r16 = r1
                long r0 = r0.f3810
                r24 = 4096(0x1000, float:5.74E-42)
                r25 = 0
                r22 = 0
                r20 = r0
                r18 = r3
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r20, r22, r24, r25)
                return r5
        }

        public final com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord fromJson(org.json.JSONObject r22) {
                r21 = this;
                r0 = r22
                r0.getClass()
                java.lang.String r1 = "awemeId"
                java.lang.String r3 = r0.optString(r1)
                r3.getClass()
                java.lang.String r1 = "typeLabel"
                java.lang.String r2 = "作品"
                java.lang.String r1 = r0.optString(r1, r2)
                boolean r4 = p000.q02.m4671(r1)
                if (r4 == 0) goto L1e
                r4 = r2
                goto L1f
            L1e:
                r4 = r1
            L1f:
                java.lang.String r1 = "title"
                java.lang.String r5 = r0.optString(r1)
                r5.getClass()
                java.lang.String r1 = "authorName"
                java.lang.String r6 = r0.optString(r1)
                r6.getClass()
                java.lang.String r1 = "authorUid"
                java.lang.String r7 = r0.optString(r1)
                r7.getClass()
                java.lang.String r1 = "authorSecUid"
                java.lang.String r8 = r0.optString(r1)
                r8.getClass()
                java.lang.String r1 = "coverUrl"
                java.lang.String r9 = r0.optString(r1)
                r9.getClass()
                java.lang.String r1 = "shareUrl"
                java.lang.String r10 = r0.optString(r1)
                r10.getClass()
                java.lang.String r1 = "diggCount"
                r11 = 0
                long r1 = r0.optLong(r1, r11)
                java.lang.String r13 = "commentCount"
                long r13 = r0.optLong(r13, r11)
                java.lang.String r15 = "collectCount"
                long r15 = r0.optLong(r15, r11)
                r17 = r1
                java.lang.String r1 = "createTime"
                long r1 = r0.optLong(r1, r11)
                java.lang.String r11 = "createTimestamp"
                r19 = r1
                long r1 = java.lang.System.currentTimeMillis()
                long r0 = r0.optLong(r11, r1)
                com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r2 = new com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord
                r11 = r17
                r17 = r19
                r19 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r17, r19)
                return r2
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord$Companion r0 = new com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord$Companion
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord.Companion = r0
            return
    }

    public VideoBookmarkRecord(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, long r9, long r11, long r13, long r15, long r17) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r0.<init>()
            r0.awemeId = r1
            r0.typeLabel = r2
            r0.title = r3
            r0.authorName = r4
            r0.authorUid = r5
            r0.authorSecUid = r6
            r0.coverUrl = r7
            r0.shareUrl = r8
            r0.diggCount = r9
            r0.commentCount = r11
            r0.collectCount = r13
            r1 = r15
            r0.createTime = r1
            r1 = r17
            r0.createTimestamp = r1
            return
    }

    public /* synthetic */ VideoBookmarkRecord(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, long r28, long r30, long r32, long r34, long r36, int r38, p000.AbstractC1067zq r39) {
            r19 = this;
            r0 = r38
            r1 = r0 & 2
            if (r1 == 0) goto L9
            java.lang.String r1 = "作品"
            goto Lb
        L9:
            r1 = r21
        Lb:
            r2 = r0 & 4
            java.lang.String r3 = ""
            if (r2 == 0) goto L13
            r2 = r3
            goto L15
        L13:
            r2 = r22
        L15:
            r4 = r0 & 8
            if (r4 == 0) goto L1b
            r4 = r3
            goto L1d
        L1b:
            r4 = r23
        L1d:
            r5 = r0 & 16
            if (r5 == 0) goto L23
            r5 = r3
            goto L25
        L23:
            r5 = r24
        L25:
            r6 = r0 & 32
            if (r6 == 0) goto L2b
            r6 = r3
            goto L2d
        L2b:
            r6 = r25
        L2d:
            r7 = r0 & 64
            if (r7 == 0) goto L33
            r7 = r3
            goto L35
        L33:
            r7 = r26
        L35:
            r8 = r0 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L3a
            goto L3c
        L3a:
            r3 = r27
        L3c:
            r8 = r0 & 256(0x100, float:3.59E-43)
            r9 = 0
            if (r8 == 0) goto L44
            r11 = r9
            goto L46
        L44:
            r11 = r28
        L46:
            r8 = r0 & 512(0x200, float:7.17E-43)
            if (r8 == 0) goto L4c
            r13 = r9
            goto L4e
        L4c:
            r13 = r30
        L4e:
            r8 = r0 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L54
            r15 = r9
            goto L56
        L54:
            r15 = r32
        L56:
            r8 = r0 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L5b
            goto L5d
        L5b:
            r9 = r34
        L5d:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L82
            long r17 = java.lang.System.currentTimeMillis()
            r38 = r17
        L67:
            r21 = r19
            r22 = r20
            r23 = r1
            r24 = r2
            r29 = r3
            r25 = r4
            r26 = r5
            r27 = r6
            r28 = r7
            r36 = r9
            r30 = r11
            r32 = r13
            r34 = r15
            goto L85
        L82:
            r38 = r36
            goto L67
        L85:
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36, r38)
            return
    }

    public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord copy$default(com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, long r25, long r27, long r29, long r31, long r33, int r35, java.lang.Object r36) {
            r0 = r16
            r1 = r35
            r2 = r1 & 1
            if (r2 == 0) goto Lb
            java.lang.String r2 = r0.awemeId
            goto Ld
        Lb:
            r2 = r17
        Ld:
            r3 = r1 & 2
            if (r3 == 0) goto L14
            java.lang.String r3 = r0.typeLabel
            goto L16
        L14:
            r3 = r18
        L16:
            r4 = r1 & 4
            if (r4 == 0) goto L1d
            java.lang.String r4 = r0.title
            goto L1f
        L1d:
            r4 = r19
        L1f:
            r5 = r1 & 8
            if (r5 == 0) goto L26
            java.lang.String r5 = r0.authorName
            goto L28
        L26:
            r5 = r20
        L28:
            r6 = r1 & 16
            if (r6 == 0) goto L2f
            java.lang.String r6 = r0.authorUid
            goto L31
        L2f:
            r6 = r21
        L31:
            r7 = r1 & 32
            if (r7 == 0) goto L38
            java.lang.String r7 = r0.authorSecUid
            goto L3a
        L38:
            r7 = r22
        L3a:
            r8 = r1 & 64
            if (r8 == 0) goto L41
            java.lang.String r8 = r0.coverUrl
            goto L43
        L41:
            r8 = r23
        L43:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4a
            java.lang.String r9 = r0.shareUrl
            goto L4c
        L4a:
            r9 = r24
        L4c:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L53
            long r10 = r0.diggCount
            goto L55
        L53:
            r10 = r25
        L55:
            r12 = r1 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L5c
            long r12 = r0.commentCount
            goto L5e
        L5c:
            r12 = r27
        L5e:
            r14 = r1 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L65
            long r14 = r0.collectCount
            goto L67
        L65:
            r14 = r29
        L67:
            r17 = r2
            r2 = r1 & 2048(0x800, float:2.87E-42)
            r18 = r3
            if (r2 == 0) goto L72
            long r2 = r0.createTime
            goto L74
        L72:
            r2 = r31
        L74:
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L99
            r19 = r2
            long r1 = r0.createTimestamp
            r32 = r19
            r34 = r1
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r28 = r12
            r30 = r14
            r19 = r18
        L94:
            r18 = r17
            r17 = r0
            goto Lb2
        L99:
            r34 = r33
            r32 = r2
            r19 = r18
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r28 = r12
            r30 = r14
            goto L94
        Lb2:
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r0 = r17.copy(r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r34)
            return r0
    }

    public final java.lang.String component1() {
            r0 = this;
            java.lang.String r0 = r0.awemeId
            return r0
    }

    public final long component10() {
            r2 = this;
            long r0 = r2.commentCount
            return r0
    }

    public final long component11() {
            r2 = this;
            long r0 = r2.collectCount
            return r0
    }

    public final long component12() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final long component13() {
            r2 = this;
            long r0 = r2.createTimestamp
            return r0
    }

    public final java.lang.String component2() {
            r0 = this;
            java.lang.String r0 = r0.typeLabel
            return r0
    }

    public final java.lang.String component3() {
            r0 = this;
            java.lang.String r0 = r0.title
            return r0
    }

    public final java.lang.String component4() {
            r0 = this;
            java.lang.String r0 = r0.authorName
            return r0
    }

    public final java.lang.String component5() {
            r0 = this;
            java.lang.String r0 = r0.authorUid
            return r0
    }

    public final java.lang.String component6() {
            r0 = this;
            java.lang.String r0 = r0.authorSecUid
            return r0
    }

    public final java.lang.String component7() {
            r0 = this;
            java.lang.String r0 = r0.coverUrl
            return r0
    }

    public final java.lang.String component8() {
            r0 = this;
            java.lang.String r0 = r0.shareUrl
            return r0
    }

    public final long component9() {
            r2 = this;
            long r0 = r2.diggCount
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord copy(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, long r28, long r30, long r32, long r34, long r36) {
            r19 = this;
            r20.getClass()
            r21.getClass()
            r22.getClass()
            r23.getClass()
            r24.getClass()
            r25.getClass()
            r26.getClass()
            r27.getClass()
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r0 = new com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r11 = r30
            r13 = r32
            r15 = r34
            r17 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r17)
            return r0
    }

    public final java.lang.String displayAuthor() {
            r1 = this;
            java.lang.String r1 = r1.authorName
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "@"
            java.lang.String r1 = p000.q02.m4678(r1, r0)
            boolean r0 = p000.q02.m4671(r1)
            if (r0 == 0) goto L18
            java.lang.String r1 = "未知作者"
        L18:
            return r1
    }

    public final java.lang.String displayTitle() {
            r2 = this;
            java.lang.String r0 = r2.title
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L21
            java.lang.String r1 = "无描述"
            boolean r1 = p000.ln0.m3626(r0, r1)
            if (r1 != 0) goto L21
            java.lang.String r1 = "未知"
            boolean r1 = p000.ln0.m3626(r0, r1)
            if (r1 != 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L2f
            java.lang.String r2 = r2.typeLabel
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto L2e
            java.lang.String r2 = "作品"
        L2e:
            return r2
        L2f:
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r8 = (com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord) r8
            java.lang.String r1 = r7.awemeId
            java.lang.String r3 = r8.awemeId
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.typeLabel
            java.lang.String r3 = r8.typeLabel
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.title
            java.lang.String r3 = r8.title
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
            java.lang.String r1 = r7.authorUid
            java.lang.String r3 = r8.authorUid
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r7.authorSecUid
            java.lang.String r3 = r8.authorSecUid
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r7.coverUrl
            java.lang.String r3 = r8.coverUrl
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r7.shareUrl
            java.lang.String r3 = r8.shareUrl
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            long r3 = r7.diggCount
            long r5 = r8.diggCount
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L6d
            return r2
        L6d:
            long r3 = r7.commentCount
            long r5 = r8.commentCount
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L76
            return r2
        L76:
            long r3 = r7.collectCount
            long r5 = r8.collectCount
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L7f
            return r2
        L7f:
            long r3 = r7.createTime
            long r5 = r8.createTime
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L88
            return r2
        L88:
            long r3 = r7.createTimestamp
            long r7 = r8.createTimestamp
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L91
            return r2
        L91:
            return r0
    }

    public final java.lang.String getAuthorName() {
            r0 = this;
            java.lang.String r0 = r0.authorName
            return r0
    }

    public final java.lang.String getAuthorSecUid() {
            r0 = this;
            java.lang.String r0 = r0.authorSecUid
            return r0
    }

    public final java.lang.String getAuthorUid() {
            r0 = this;
            java.lang.String r0 = r0.authorUid
            return r0
    }

    public final java.lang.String getAwemeId() {
            r0 = this;
            java.lang.String r0 = r0.awemeId
            return r0
    }

    public final long getCollectCount() {
            r2 = this;
            long r0 = r2.collectCount
            return r0
    }

    public final long getCommentCount() {
            r2 = this;
            long r0 = r2.commentCount
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

    public final long getCreateTimestamp() {
            r2 = this;
            long r0 = r2.createTimestamp
            return r0
    }

    public final long getDiggCount() {
            r2 = this;
            long r0 = r2.diggCount
            return r0
    }

    public final java.lang.String getShareUrl() {
            r0 = this;
            java.lang.String r0 = r0.shareUrl
            return r0
    }

    public final java.lang.String getTitle() {
            r0 = this;
            java.lang.String r0 = r0.title
            return r0
    }

    public final java.lang.String getTypeLabel() {
            r0 = this;
            java.lang.String r0 = r0.typeLabel
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.awemeId
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.typeLabel
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.title
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.authorName
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.authorUid
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.authorSecUid
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.coverUrl
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.shareUrl
            int r0 = p000.a12.m15(r0, r1, r2)
            long r2 = r4.diggCount
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.commentCount
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.collectCount
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.createTime
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r1 = r4.createTimestamp
            int r4 = java.lang.Long.hashCode(r1)
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
            java.lang.String r1 = "typeLabel"
            java.lang.String r2 = r4.typeLabel
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "title"
            java.lang.String r2 = r4.title
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "authorName"
            java.lang.String r2 = r4.authorName
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "authorUid"
            java.lang.String r2 = r4.authorUid
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "authorSecUid"
            java.lang.String r2 = r4.authorSecUid
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "coverUrl"
            java.lang.String r2 = r4.coverUrl
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "shareUrl"
            java.lang.String r2 = r4.shareUrl
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "diggCount"
            long r2 = r4.diggCount
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "commentCount"
            long r2 = r4.commentCount
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "collectCount"
            long r2 = r4.collectCount
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "createTime"
            long r2 = r4.createTime
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "createTimestamp"
            long r2 = r4.createTimestamp
            org.json.JSONObject r4 = r0.put(r1, r2)
            r4.getClass()
            return r4
    }

    public java.lang.String toString() {
            r23 = this;
            r0 = r23
            java.lang.String r1 = r0.awemeId
            java.lang.String r2 = r0.typeLabel
            java.lang.String r3 = r0.title
            java.lang.String r4 = r0.authorName
            java.lang.String r5 = r0.authorUid
            java.lang.String r6 = r0.authorSecUid
            java.lang.String r7 = r0.coverUrl
            java.lang.String r8 = r0.shareUrl
            long r9 = r0.diggCount
            long r11 = r0.commentCount
            long r13 = r0.collectCount
            r15 = r13
            long r13 = r0.createTime
            r17 = r13
            long r13 = r0.createTimestamp
            java.lang.String r0 = ", typeLabel="
            r19 = r15
            java.lang.String r15 = ", title="
            r21 = r13
            java.lang.String r13 = "VideoBookmarkRecord(awemeId="
            java.lang.StringBuilder r0 = p000.lz1.m3695(r13, r1, r0, r2, r15)
            java.lang.String r1 = ", authorName="
            java.lang.String r2 = ", authorUid="
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", authorSecUid="
            java.lang.String r2 = ", coverUrl="
            p000.AbstractC0602nx.m4119(r0, r5, r1, r6, r2)
            java.lang.String r1 = ", shareUrl="
            java.lang.String r2 = ", diggCount="
            p000.AbstractC0602nx.m4119(r0, r7, r1, r8, r2)
            r0.append(r9)
            java.lang.String r1 = ", commentCount="
            java.lang.String r2 = ", collectCount="
            p000.AbstractC0602nx.m4118(r0, r1, r11, r2)
            r1 = r19
            r0.append(r1)
            java.lang.String r1 = ", createTime="
            java.lang.String r2 = ", createTimestamp="
            r3 = r17
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            r1 = r21
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
