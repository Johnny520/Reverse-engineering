package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatChatroom {
    public static final int $stable = 8;
    public final java.lang.String chatroomId;
    public final java.util.List<java.lang.String> memberIds;
    public final java.lang.String name;
    public final java.lang.String owner;
    public final java.lang.String rawDisplayNames;

    public WeChatChatroom(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            if (r2 != 0) goto L8
            r2 = r0
        L8:
            r1.chatroomId = r2
            if (r3 != 0) goto Ld
            r3 = r0
        Ld:
            r1.name = r3
            if (r4 != 0) goto L12
            r4 = r0
        L12:
            r1.owner = r4
            if (r5 == 0) goto L1b
            java.util.List r2 = tf.m.P1(r5)
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != 0) goto L20
            tf.t r2 = tf.t.f13167g
        L20:
            r1.memberIds = r2
            if (r6 != 0) goto L25
            r6 = r0
        L25:
            r1.rawDisplayNames = r6
            return
    }

    public final java.lang.String getChatroomId() {
            r1 = this;
            java.lang.String r0 = r1.chatroomId
            return r0
    }

    public final int getMemberCount() {
            r1 = this;
            int r0 = r1.memberCount()
            return r0
    }

    public final java.util.List<java.lang.String> getMemberList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.memberIds
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final java.lang.String getRawDisplayNames() {
            r1 = this;
            java.lang.String r0 = r1.rawDisplayNames
            return r0
    }

    public final java.lang.String getRoomId() {
            r1 = this;
            java.lang.String r0 = r1.chatroomId
            return r0
    }

    public final int memberCount() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.memberIds
            int r0 = r0.size()
            return r0
    }
}
