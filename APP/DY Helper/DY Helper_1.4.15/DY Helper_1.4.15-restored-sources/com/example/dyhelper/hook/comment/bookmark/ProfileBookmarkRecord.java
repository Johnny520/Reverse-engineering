package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileBookmarkRecord implements java.io.Serializable {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord.Companion Companion = null;
    private final java.lang.String avatarUrl;
    private final long createTimestamp;
    private final java.lang.String group;
    private boolean hasNewAweme;
    private java.util.Set<java.lang.String> knownAwemeIds;
    private int lastAwemeCount;
    private long lastCheckTimestamp;
    private java.lang.String lastNewestAwemeId;
    private int newAwemeCount;
    private java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> newAwemeItems;
    private final java.lang.String nickname;
    private boolean notificationEnabled;
    private final java.lang.String remark;
    private final java.lang.String secUid;
    private final java.lang.String signature;
    private final java.lang.String uid;

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

        public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord fromAwemeInfo(p000.C0276f8 r28) {
                r27 = this;
                r0 = r28
                r0.getClass()
                java.lang.String r1 = r0.f3801
                r2 = 0
                if (r1 == 0) goto L13
                java.lang.CharSequence r1 = p000.q02.m4660(r1)
                java.lang.String r1 = r1.toString()
                goto L14
            L13:
                r1 = r2
            L14:
                java.lang.String r3 = ""
                if (r1 != 0) goto L19
                r1 = r3
            L19:
                boolean r4 = p000.q02.m4671(r1)
                r5 = 0
                if (r4 != 0) goto L37
                r4 = r5
            L21:
                int r6 = r1.length()
                if (r4 >= r6) goto L35
                char r6 = r1.charAt(r4)
                boolean r6 = java.lang.Character.isDigit(r6)
                if (r6 != 0) goto L32
                goto L37
            L32:
                int r4 = r4 + 1
                goto L21
            L35:
                r4 = r1
                goto L38
            L37:
                r4 = r2
            L38:
                if (r4 != 0) goto L3c
                r7 = r3
                goto L3d
            L3c:
                r7 = r4
            L3d:
                java.lang.String r4 = r0.f3802
                if (r4 == 0) goto L4a
                java.lang.CharSequence r4 = p000.q02.m4660(r4)
                java.lang.String r4 = r4.toString()
                goto L4b
            L4a:
                r4 = r2
            L4b:
                if (r4 != 0) goto L4e
                r4 = r3
            L4e:
                boolean r6 = p000.q02.m4671(r4)
                if (r6 == 0) goto L74
                boolean r4 = p000.q02.m4671(r1)
                if (r4 != 0) goto L6e
            L5a:
                int r4 = r1.length()
                if (r5 >= r4) goto L6e
                char r4 = r1.charAt(r5)
                boolean r4 = java.lang.Character.isDigit(r4)
                if (r4 != 0) goto L6b
                goto L6f
            L6b:
                int r5 = r5 + 1
                goto L5a
            L6e:
                r1 = r2
            L6f:
                if (r1 != 0) goto L73
                r4 = r3
                goto L74
            L73:
                r4 = r1
            L74:
                int r1 = r4.length()
                r5 = 8
                if (r1 < r5) goto L95
                java.lang.String r1 = "-1"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L95
                java.lang.String r1 = "true"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L95
                java.lang.String r1 = "false"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L95
                goto L96
            L95:
                r4 = r2
            L96:
                if (r4 != 0) goto L9a
                r8 = r3
                goto L9b
            L9a:
                r8 = r4
            L9b:
                boolean r1 = p000.q02.m4671(r7)
                if (r1 == 0) goto La8
                boolean r1 = p000.q02.m4671(r8)
                if (r1 == 0) goto La8
                return r2
            La8:
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                java.lang.String r4 = r0.f3800
                if (r4 == 0) goto Lc8
                java.lang.CharSequence r4 = p000.q02.m4660(r4)
                java.lang.String r4 = r4.toString()
                if (r4 == 0) goto Lc8
                boolean r5 = p000.q02.m4671(r4)
                if (r5 != 0) goto Lc2
                goto Lc3
            Lc2:
                r4 = r2
            Lc3:
                if (r4 == 0) goto Lc8
                r1.add(r4)
            Lc8:
                java.lang.String r4 = r0.f3793
                java.lang.CharSequence r4 = p000.q02.m4660(r4)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "@"
                java.lang.String r4 = p000.q02.m4678(r4, r5)
                boolean r5 = p000.q02.m4671(r4)
                if (r5 != 0) goto Le7
                java.lang.String r5 = "未知"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto Le7
                goto Le8
            Le7:
                r4 = r2
            Le8:
                if (r4 != 0) goto Lec
                r9 = r3
                goto Led
            Lec:
                r9 = r4
            Led:
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r6 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
                java.lang.String r0 = r0.f3803
                if (r0 == 0) goto Lfb
                java.lang.CharSequence r0 = p000.q02.m4660(r0)
                java.lang.String r2 = r0.toString()
            Lfb:
                if (r2 != 0) goto Lff
                r10 = r3
                goto L100
            Lff:
                r10 = r2
            L100:
                r25 = 57328(0xdff0, float:8.0334E-41)
                r26 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r23 = 0
                r24 = 0
                r22 = r1
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                return r6
        }

        public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord fromJson(org.json.JSONObject r25) {
                r24 = this;
                r0 = r25
                r0.getClass()
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                java.lang.String r2 = "knownAwemeIds"
                org.json.JSONArray r2 = r0.optJSONArray(r2)
                if (r2 == 0) goto L2c
                int r4 = r2.length()
                r5 = 0
            L17:
                if (r5 >= r4) goto L2c
                java.lang.String r6 = r2.optString(r5)
                r6.getClass()
                boolean r7 = p000.q02.m4671(r6)
                if (r7 != 0) goto L29
                r1.add(r6)
            L29:
                int r5 = r5 + 1
                goto L17
            L2c:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.lang.String r4 = "newAwemeItems"
                org.json.JSONArray r4 = r0.optJSONArray(r4)
                if (r4 == 0) goto L5d
                int r5 = r4.length()
                r6 = 0
            L3e:
                if (r6 >= r5) goto L5d
                org.json.JSONObject r7 = r4.optJSONObject(r6)
                if (r7 != 0) goto L47
                goto L5a
            L47:
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem$Companion r8 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem.Companion
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r7 = r8.fromJson(r7)
                java.lang.String r8 = r7.getAwemeId()
                boolean r8 = p000.q02.m4671(r8)
                if (r8 != 0) goto L5a
                r2.add(r7)
            L5a:
                int r6 = r6 + 1
                goto L3e
            L5d:
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
                java.lang.String r5 = "uid"
                java.lang.String r5 = r0.optString(r5)
                r5.getClass()
                java.lang.String r6 = "secUid"
                java.lang.String r6 = r0.optString(r6)
                r6.getClass()
                java.lang.String r7 = "nickname"
                java.lang.String r7 = r0.optString(r7)
                r7.getClass()
                java.lang.String r8 = "signature"
                java.lang.String r8 = r0.optString(r8)
                r8.getClass()
                java.lang.String r9 = "avatarUrl"
                java.lang.String r9 = r0.optString(r9)
                r9.getClass()
                java.lang.String r10 = "group"
                java.lang.String r10 = r0.optString(r10)
                r10.getClass()
                java.lang.String r11 = "remark"
                java.lang.String r11 = r0.optString(r11)
                r11.getClass()
                java.lang.String r12 = "createTimestamp"
                long r13 = java.lang.System.currentTimeMillis()
                long r12 = r0.optLong(r12, r13)
                java.lang.String r14 = "lastCheckTimestamp"
                r15 = r4
                r3 = 0
                long r3 = r0.optLong(r14, r3)
                java.lang.String r14 = "lastAwemeCount"
                r16 = r1
                r1 = 0
                int r14 = r0.optInt(r14, r1)
                java.lang.String r1 = "lastNewestAwemeId"
                java.lang.String r1 = r0.optString(r1)
                r1.getClass()
                r17 = r1
                java.lang.String r1 = "hasNewAweme"
                r18 = r2
                r2 = 0
                boolean r1 = r0.optBoolean(r1, r2)
                r24 = r1
                java.lang.String r1 = "newAwemeCount"
                int r1 = r0.optInt(r1, r2)
                java.lang.String r2 = "notificationEnabled"
                r19 = r1
                r1 = 1
                boolean r0 = r0.optBoolean(r2, r1)
                r1 = r5
                r2 = r6
                r5 = r9
                r6 = r10
                r20 = r14
                r14 = r24
                r21 = r18
                r18 = r0
                r0 = r15
                r15 = r19
                r22 = r3
                r3 = r7
                r4 = r8
                r7 = r11
                r8 = r12
                r12 = r20
                r13 = r17
                r17 = r21
                r10 = r22
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
                r15 = r0
                return r15
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord$Companion r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord$Companion
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord.Companion = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord.$stable = r0
            return
    }

    public ProfileBookmarkRecord() {
            r21 = this;
            r19 = 65535(0xffff, float:9.1834E-41)
            r20 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r0 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
    }

    public ProfileBookmarkRecord(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, long r10, int r12, java.lang.String r13, boolean r14, int r15, java.util.Set<java.lang.String> r16, java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r17, boolean r18) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r13.getClass()
            r16.getClass()
            r17.getClass()
            r0.<init>()
            r0.uid = r1
            r0.secUid = r2
            r0.nickname = r3
            r0.signature = r4
            r0.avatarUrl = r5
            r0.group = r6
            r0.remark = r7
            r0.createTimestamp = r8
            r0.lastCheckTimestamp = r10
            r0.lastAwemeCount = r12
            r0.lastNewestAwemeId = r13
            r0.hasNewAweme = r14
            r0.newAwemeCount = r15
            r1 = r16
            r0.knownAwemeIds = r1
            r1 = r17
            r0.newAwemeItems = r1
            r1 = r18
            r0.notificationEnabled = r1
            return
    }

    public /* synthetic */ ProfileBookmarkRecord(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, long r25, long r27, int r29, java.lang.String r30, boolean r31, int r32, java.util.Set r33, java.util.List r34, boolean r35, int r36, p000.AbstractC1067zq r37) {
            r17 = this;
            r0 = r36
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lc
        La:
            r1 = r18
        Lc:
            r3 = r0 & 2
            if (r3 == 0) goto L12
            r3 = r2
            goto L14
        L12:
            r3 = r19
        L14:
            r4 = r0 & 4
            if (r4 == 0) goto L1a
            r4 = r2
            goto L1c
        L1a:
            r4 = r20
        L1c:
            r5 = r0 & 8
            if (r5 == 0) goto L22
            r5 = r2
            goto L24
        L22:
            r5 = r21
        L24:
            r6 = r0 & 16
            if (r6 == 0) goto L2a
            r6 = r2
            goto L2c
        L2a:
            r6 = r22
        L2c:
            r7 = r0 & 32
            if (r7 == 0) goto L32
            r7 = r2
            goto L34
        L32:
            r7 = r23
        L34:
            r8 = r0 & 64
            if (r8 == 0) goto L3a
            r8 = r2
            goto L3c
        L3a:
            r8 = r24
        L3c:
            r9 = r0 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L45
            long r9 = java.lang.System.currentTimeMillis()
            goto L47
        L45:
            r9 = r25
        L47:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L4e
            r11 = 0
            goto L50
        L4e:
            r11 = r27
        L50:
            r13 = r0 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L56
            r13 = 0
            goto L58
        L56:
            r13 = r29
        L58:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L5d
            goto L5f
        L5d:
            r2 = r30
        L5f:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L65
            r15 = 0
            goto L67
        L65:
            r15 = r31
        L67:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L6d
            r14 = 0
            goto L6f
        L6d:
            r14 = r32
        L6f:
            r18 = r1
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L7b
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            goto L7d
        L7b:
            r1 = r33
        L7d:
            r19 = r1
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L89
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L8b
        L89:
            r1 = r34
        L8b:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto Lb6
            r0 = 1
            r36 = r0
        L95:
            r34 = r19
            r35 = r1
            r31 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r28 = r11
            r30 = r13
            r33 = r14
            r32 = r15
            r19 = r18
            r18 = r17
            goto Lb9
        Lb6:
            r36 = r35
            goto L95
        Lb9:
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36)
            return
    }

    public static /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord copy$default(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, long r25, long r27, int r29, java.lang.String r30, boolean r31, int r32, java.util.Set r33, java.util.List r34, boolean r35, int r36, java.lang.Object r37) {
            r0 = r17
            r1 = r36
            r2 = r1 & 1
            if (r2 == 0) goto Lb
            java.lang.String r2 = r0.uid
            goto Ld
        Lb:
            r2 = r18
        Ld:
            r3 = r1 & 2
            if (r3 == 0) goto L14
            java.lang.String r3 = r0.secUid
            goto L16
        L14:
            r3 = r19
        L16:
            r4 = r1 & 4
            if (r4 == 0) goto L1d
            java.lang.String r4 = r0.nickname
            goto L1f
        L1d:
            r4 = r20
        L1f:
            r5 = r1 & 8
            if (r5 == 0) goto L26
            java.lang.String r5 = r0.signature
            goto L28
        L26:
            r5 = r21
        L28:
            r6 = r1 & 16
            if (r6 == 0) goto L2f
            java.lang.String r6 = r0.avatarUrl
            goto L31
        L2f:
            r6 = r22
        L31:
            r7 = r1 & 32
            if (r7 == 0) goto L38
            java.lang.String r7 = r0.group
            goto L3a
        L38:
            r7 = r23
        L3a:
            r8 = r1 & 64
            if (r8 == 0) goto L41
            java.lang.String r8 = r0.remark
            goto L43
        L41:
            r8 = r24
        L43:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4a
            long r9 = r0.createTimestamp
            goto L4c
        L4a:
            r9 = r25
        L4c:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L53
            long r11 = r0.lastCheckTimestamp
            goto L55
        L53:
            r11 = r27
        L55:
            r13 = r1 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L5c
            int r13 = r0.lastAwemeCount
            goto L5e
        L5c:
            r13 = r29
        L5e:
            r14 = r1 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L65
            java.lang.String r14 = r0.lastNewestAwemeId
            goto L67
        L65:
            r14 = r30
        L67:
            r15 = r1 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L6e
            boolean r15 = r0.hasNewAweme
            goto L70
        L6e:
            r15 = r31
        L70:
            r18 = r2
            r2 = r1 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L79
            int r2 = r0.newAwemeCount
            goto L7b
        L79:
            r2 = r32
        L7b:
            r19 = r2
            r2 = r1 & 8192(0x2000, float:1.148E-41)
            if (r2 == 0) goto L84
            java.util.Set<java.lang.String> r2 = r0.knownAwemeIds
            goto L86
        L84:
            r2 = r33
        L86:
            r20 = r2
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L8f
            java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r2 = r0.newAwemeItems
            goto L91
        L8f:
            r2 = r34
        L91:
            r16 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r16
            if (r1 == 0) goto Lbd
            boolean r1 = r0.notificationEnabled
            r36 = r1
        L9c:
            r33 = r19
            r34 = r20
            r35 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r28 = r11
            r30 = r13
            r31 = r14
            r32 = r15
            r19 = r18
            r18 = r0
            goto Lc0
        Lbd:
            r36 = r35
            goto L9c
        Lc0:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r18.copy(r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36)
            return r0
    }

    public final java.lang.String component1() {
            r0 = this;
            java.lang.String r0 = r0.uid
            return r0
    }

    public final int component10() {
            r0 = this;
            int r0 = r0.lastAwemeCount
            return r0
    }

    public final java.lang.String component11() {
            r0 = this;
            java.lang.String r0 = r0.lastNewestAwemeId
            return r0
    }

    public final boolean component12() {
            r0 = this;
            boolean r0 = r0.hasNewAweme
            return r0
    }

    public final int component13() {
            r0 = this;
            int r0 = r0.newAwemeCount
            return r0
    }

    public final java.util.Set<java.lang.String> component14() {
            r0 = this;
            java.util.Set<java.lang.String> r0 = r0.knownAwemeIds
            return r0
    }

    public final java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> component15() {
            r0 = this;
            java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r0 = r0.newAwemeItems
            return r0
    }

    public final boolean component16() {
            r0 = this;
            boolean r0 = r0.notificationEnabled
            return r0
    }

    public final java.lang.String component2() {
            r0 = this;
            java.lang.String r0 = r0.secUid
            return r0
    }

    public final java.lang.String component3() {
            r0 = this;
            java.lang.String r0 = r0.nickname
            return r0
    }

    public final java.lang.String component4() {
            r0 = this;
            java.lang.String r0 = r0.signature
            return r0
    }

    public final java.lang.String component5() {
            r0 = this;
            java.lang.String r0 = r0.avatarUrl
            return r0
    }

    public final java.lang.String component6() {
            r0 = this;
            java.lang.String r0 = r0.group
            return r0
    }

    public final java.lang.String component7() {
            r0 = this;
            java.lang.String r0 = r0.remark
            return r0
    }

    public final long component8() {
            r2 = this;
            long r0 = r2.createTimestamp
            return r0
    }

    public final long component9() {
            r2 = this;
            long r0 = r2.lastCheckTimestamp
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord copy(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, long r27, long r29, int r31, java.lang.String r32, boolean r33, int r34, java.util.Set<java.lang.String> r35, java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r36, boolean r37) {
            r19 = this;
            r20.getClass()
            r21.getClass()
            r22.getClass()
            r23.getClass()
            r24.getClass()
            r25.getClass()
            r26.getClass()
            r32.getClass()
            r35.getClass()
            r36.getClass()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r10 = r29
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
            return r0
    }

    public final java.lang.String displayName() {
            r2 = this;
            java.lang.String r0 = r2.nickname
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L1b
            java.lang.String r0 = r2.secUid
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L1b
            java.lang.String r2 = r2.uid
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto L1a
            java.lang.String r2 = "未知用户"
        L1a:
            return r2
        L1b:
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r8 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r8
            java.lang.String r1 = r7.uid
            java.lang.String r3 = r8.uid
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.secUid
            java.lang.String r3 = r8.secUid
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.nickname
            java.lang.String r3 = r8.nickname
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.signature
            java.lang.String r3 = r8.signature
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r7.avatarUrl
            java.lang.String r3 = r8.avatarUrl
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r7.group
            java.lang.String r3 = r8.group
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r7.remark
            java.lang.String r3 = r8.remark
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            long r3 = r7.createTimestamp
            long r5 = r8.createTimestamp
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L62
            return r2
        L62:
            long r3 = r7.lastCheckTimestamp
            long r5 = r8.lastCheckTimestamp
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L6b
            return r2
        L6b:
            int r1 = r7.lastAwemeCount
            int r3 = r8.lastAwemeCount
            if (r1 == r3) goto L72
            return r2
        L72:
            java.lang.String r1 = r7.lastNewestAwemeId
            java.lang.String r3 = r8.lastNewestAwemeId
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L7d
            return r2
        L7d:
            boolean r1 = r7.hasNewAweme
            boolean r3 = r8.hasNewAweme
            if (r1 == r3) goto L84
            return r2
        L84:
            int r1 = r7.newAwemeCount
            int r3 = r8.newAwemeCount
            if (r1 == r3) goto L8b
            return r2
        L8b:
            java.util.Set<java.lang.String> r1 = r7.knownAwemeIds
            java.util.Set<java.lang.String> r3 = r8.knownAwemeIds
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L96
            return r2
        L96:
            java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r1 = r7.newAwemeItems
            java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r3 = r8.newAwemeItems
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto La1
            return r2
        La1:
            boolean r7 = r7.notificationEnabled
            boolean r8 = r8.notificationEnabled
            if (r7 == r8) goto La8
            return r2
        La8:
            return r0
    }

    public final java.lang.String getAvatarUrl() {
            r0 = this;
            java.lang.String r0 = r0.avatarUrl
            return r0
    }

    public final long getCreateTimestamp() {
            r2 = this;
            long r0 = r2.createTimestamp
            return r0
    }

    public final java.lang.String getGroup() {
            r0 = this;
            java.lang.String r0 = r0.group
            return r0
    }

    public final boolean getHasNewAweme() {
            r0 = this;
            boolean r0 = r0.hasNewAweme
            return r0
    }

    public final java.util.Set<java.lang.String> getKnownAwemeIds() {
            r0 = this;
            java.util.Set<java.lang.String> r0 = r0.knownAwemeIds
            return r0
    }

    public final int getLastAwemeCount() {
            r0 = this;
            int r0 = r0.lastAwemeCount
            return r0
    }

    public final long getLastCheckTimestamp() {
            r2 = this;
            long r0 = r2.lastCheckTimestamp
            return r0
    }

    public final java.lang.String getLastNewestAwemeId() {
            r0 = this;
            java.lang.String r0 = r0.lastNewestAwemeId
            return r0
    }

    public final int getNewAwemeCount() {
            r0 = this;
            int r0 = r0.newAwemeCount
            return r0
    }

    public final java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> getNewAwemeItems() {
            r0 = this;
            java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r0 = r0.newAwemeItems
            return r0
    }

    public final java.lang.String getNickname() {
            r0 = this;
            java.lang.String r0 = r0.nickname
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

    public final java.lang.String getSecUid() {
            r0 = this;
            java.lang.String r0 = r0.secUid
            return r0
    }

    public final java.lang.String getSignature() {
            r0 = this;
            java.lang.String r0 = r0.signature
            return r0
    }

    public final java.lang.String getUid() {
            r0 = this;
            java.lang.String r0 = r0.uid
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.uid
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.secUid
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.nickname
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.signature
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.avatarUrl
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.group
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.remark
            int r0 = p000.a12.m15(r0, r1, r2)
            long r2 = r4.createTimestamp
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.lastCheckTimestamp
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r2 = r4.lastAwemeCount
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r4.lastNewestAwemeId
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r4.hasNewAweme
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r2 = r4.newAwemeCount
            int r0 = p000.a12.m14(r2, r0, r1)
            java.util.Set<java.lang.String> r2 = r4.knownAwemeIds
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r0 = r4.newAwemeItems
            int r0 = p000.a12.m16(r0, r2, r1)
            boolean r4 = r4.notificationEnabled
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final void setHasNewAweme(boolean r1) {
            r0 = this;
            r0.hasNewAweme = r1
            return
    }

    public final void setKnownAwemeIds(java.util.Set<java.lang.String> r1) {
            r0 = this;
            r1.getClass()
            r0.knownAwemeIds = r1
            return
    }

    public final void setLastAwemeCount(int r1) {
            r0 = this;
            r0.lastAwemeCount = r1
            return
    }

    public final void setLastCheckTimestamp(long r1) {
            r0 = this;
            r0.lastCheckTimestamp = r1
            return
    }

    public final void setLastNewestAwemeId(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.lastNewestAwemeId = r1
            return
    }

    public final void setNewAwemeCount(int r1) {
            r0 = this;
            r0.newAwemeCount = r1
            return
    }

    public final void setNewAwemeItems(java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r1) {
            r0 = this;
            r1.getClass()
            r0.newAwemeItems = r1
            return
    }

    public final void setNotificationEnabled(boolean r1) {
            r0 = this;
            r0.notificationEnabled = r1
            return
    }

    public final org.json.JSONObject toJson() {
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Set<java.lang.String> r1 = r6.knownAwemeIds
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = p000.q02.m4671(r2)
            if (r3 != 0) goto Ld
            r0.put(r2)
            goto Ld
        L23:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r2 = r6.newAwemeItems
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r3 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r3
            org.json.JSONObject r3 = r3.toJson()
            r1.put(r3)
            goto L2e
        L42:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "uid"
            java.lang.String r4 = r6.uid
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "secUid"
            java.lang.String r4 = r6.secUid
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "nickname"
            java.lang.String r4 = r6.nickname
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "signature"
            java.lang.String r4 = r6.signature
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "avatarUrl"
            java.lang.String r4 = r6.avatarUrl
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "group"
            java.lang.String r4 = r6.group
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "remark"
            java.lang.String r4 = r6.remark
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "createTimestamp"
            long r4 = r6.createTimestamp
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "lastCheckTimestamp"
            long r4 = r6.lastCheckTimestamp
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "lastAwemeCount"
            int r4 = r6.lastAwemeCount
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "lastNewestAwemeId"
            java.lang.String r4 = r6.lastNewestAwemeId
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "hasNewAweme"
            boolean r4 = r6.hasNewAweme
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "newAwemeCount"
            int r4 = r6.newAwemeCount
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "knownAwemeIds"
            org.json.JSONObject r0 = r2.put(r3, r0)
            java.lang.String r2 = "newAwemeItems"
            org.json.JSONObject r0 = r0.put(r2, r1)
            java.lang.String r1 = "notificationEnabled"
            boolean r6 = r6.notificationEnabled
            org.json.JSONObject r6 = r0.put(r1, r6)
            r6.getClass()
            return r6
    }

    public java.lang.String toString() {
            r20 = this;
            r0 = r20
            java.lang.String r1 = r0.uid
            java.lang.String r2 = r0.secUid
            java.lang.String r3 = r0.nickname
            java.lang.String r4 = r0.signature
            java.lang.String r5 = r0.avatarUrl
            java.lang.String r6 = r0.group
            java.lang.String r7 = r0.remark
            long r8 = r0.createTimestamp
            long r10 = r0.lastCheckTimestamp
            int r12 = r0.lastAwemeCount
            java.lang.String r13 = r0.lastNewestAwemeId
            boolean r14 = r0.hasNewAweme
            int r15 = r0.newAwemeCount
            r16 = r15
            java.util.Set<java.lang.String> r15 = r0.knownAwemeIds
            r17 = r15
            java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> r15 = r0.newAwemeItems
            boolean r0 = r0.notificationEnabled
            r20 = r0
            java.lang.String r0 = ", secUid="
            r18 = r15
            java.lang.String r15 = ", nickname="
            r19 = r14
            java.lang.String r14 = "ProfileBookmarkRecord(uid="
            java.lang.StringBuilder r0 = p000.lz1.m3695(r14, r1, r0, r2, r15)
            java.lang.String r1 = ", signature="
            java.lang.String r2 = ", avatarUrl="
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", group="
            java.lang.String r2 = ", remark="
            p000.AbstractC0602nx.m4119(r0, r5, r1, r6, r2)
            r0.append(r7)
            java.lang.String r1 = ", createTimestamp="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", lastCheckTimestamp="
            java.lang.String r2 = ", lastAwemeCount="
            p000.AbstractC0602nx.m4118(r0, r1, r10, r2)
            java.lang.String r1 = ", lastNewestAwemeId="
            java.lang.String r2 = ", hasNewAweme="
            p000.lz1.m3671(r0, r12, r1, r13, r2)
            r1 = r19
            r0.append(r1)
            java.lang.String r1 = ", newAwemeCount="
            r0.append(r1)
            r1 = r16
            r0.append(r1)
            java.lang.String r1 = ", knownAwemeIds="
            r0.append(r1)
            r1 = r17
            r0.append(r1)
            java.lang.String r1 = ", newAwemeItems="
            r0.append(r1)
            r1 = r18
            r0.append(r1)
            java.lang.String r1 = ", notificationEnabled="
            r0.append(r1)
            java.lang.String r1 = ")"
            r2 = r20
            java.lang.String r0 = p000.lz1.m3693(r0, r2, r1)
            return r0
    }

    public final java.lang.String uniqueKey() {
            r1 = this;
            java.lang.String r0 = r1.secUid
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L11
            java.lang.String r1 = r1.secUid
            java.lang.String r0 = "secUid:"
            java.lang.String r1 = p000.lz1.m3687(r0, r1)
            return r1
        L11:
            java.lang.String r0 = r1.uid
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L22
            java.lang.String r1 = r1.uid
            java.lang.String r0 = "uid:"
            java.lang.String r1 = p000.lz1.m3687(r0, r1)
            return r1
        L22:
            java.lang.String r0 = r1.nickname
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L33
            java.lang.String r1 = r1.nickname
            java.lang.String r0 = "nickname:"
            java.lang.String r1 = p000.lz1.m3687(r0, r1)
            return r1
        L33:
            java.lang.String r1 = ""
            return r1
    }
}
