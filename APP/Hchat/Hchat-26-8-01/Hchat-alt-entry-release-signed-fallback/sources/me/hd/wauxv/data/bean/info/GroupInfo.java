package me.hd.wauxv.data.bean.info;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class GroupInfo {
    private final java.lang.String displayName;
    private final java.util.List<java.lang.String> memberList;
    private final java.lang.String name;
    private final java.lang.String nickname;
    private final java.lang.String owner;
    private final java.lang.String rawDisplayNames;
    private final java.lang.String remarkName;
    private final java.lang.String roomId;

    public GroupInfo(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.util.List<java.lang.String> r7, java.lang.String r8) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            if (r2 != 0) goto L8
            r2 = r0
        L8:
            r1.roomId = r2
            if (r3 != 0) goto Ld
            r3 = r0
        Ld:
            r1.name = r3
            if (r4 != 0) goto L12
            r4 = r0
        L12:
            r1.nickname = r4
            if (r5 != 0) goto L17
            r5 = r0
        L17:
            r1.remarkName = r5
            java.lang.String r2 = buildDisplayName(r2, r3, r5)
            r1.displayName = r2
            if (r6 != 0) goto L22
            r6 = r0
        L22:
            r1.owner = r6
            if (r7 != 0) goto L29
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            goto L2d
        L29:
            java.util.List r2 = java.util.Collections.unmodifiableList(r7)
        L2d:
            r1.memberList = r2
            if (r8 != 0) goto L32
            r8 = r0
        L32:
            r1.rawDisplayNames = r8
            return
    }

    public GroupInfo(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.List<java.lang.String> r12, java.lang.String r13) {
            r8 = this;
            java.lang.String r4 = ""
            r3 = r10
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private static java.lang.String buildDisplayName(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L1c
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L1c
            boolean r1 = isEmpty(r2)
            if (r1 == 0) goto L13
            return r3
        L13:
            java.lang.String r1 = " ("
            java.lang.String r0 = ")"
            java.lang.String r1 = wb.en.i(r3, r1, r2, r0)
            return r1
        L1c:
            boolean r0 = isEmpty(r2)
            if (r0 != 0) goto L23
            return r2
        L23:
            boolean r2 = isEmpty(r3)
            if (r2 != 0) goto L2a
            return r3
        L2a:
            return r1
    }

    private static boolean isEmpty(java.lang.String r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public java.lang.String getChatroomId() {
            r1 = this;
            java.lang.String r0 = r1.roomId
            return r0
    }

    public java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.displayName
            return r0
    }

    public int getMemberCount() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.memberList
            int r0 = r0.size()
            return r0
    }

    public java.util.List<java.lang.String> getMemberList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.memberList
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getNickName() {
            r1 = this;
            java.lang.String r0 = r1.nickname
            return r0
    }

    public java.lang.String getNickname() {
            r1 = this;
            java.lang.String r0 = r1.nickname
            return r0
    }

    public java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public java.lang.String getRawDisplayNames() {
            r1 = this;
            java.lang.String r0 = r1.rawDisplayNames
            return r0
    }

    public java.lang.String getRemark() {
            r1 = this;
            java.lang.String r0 = r1.remarkName
            return r0
    }

    public java.lang.String getRemarkName() {
            r1 = this;
            java.lang.String r0 = r1.remarkName
            return r0
    }

    public java.lang.String getRoomId() {
            r1 = this;
            java.lang.String r0 = r1.roomId
            return r0
    }

    public java.lang.String getUserName() {
            r1 = this;
            java.lang.String r0 = r1.roomId
            return r0
    }

    public java.lang.String getWxId() {
            r1 = this;
            java.lang.String r0 = r1.roomId
            return r0
    }

    public java.lang.String getWxid() {
            r1 = this;
            java.lang.String r0 = r1.roomId
            return r0
    }

    public int memberCount() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.memberList
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GroupInfo(roomId="
            r0.<init>(r1)
            java.lang.String r1 = r2.roomId
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", remarkName="
            r0.append(r1)
            java.lang.String r1 = r2.remarkName
            r0.append(r1)
            java.lang.String r1 = ", memberCount="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.memberList
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
