package h.Hchat.hooks.items.script;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptQuoteMsgBean {
    public static final int $stable = 0;
    public static final eb.f0 Companion = null;
    private final java.lang.String content;
    private final long createTime;
    private final java.lang.String displayName;
    private final java.lang.String msgSource;
    private final java.lang.String sendTalker;
    private final java.lang.String strId;
    private final long svrId;
    private final java.lang.String talker;
    private final java.lang.String title;
    private final int type;

    static {
            eb.f0 r0 = new eb.f0
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptQuoteMsgBean.Companion = r0
            return
    }

    private ScriptQuoteMsgBean(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, long r8, java.lang.String r10, long r11) {
            r0 = this;
            r0.<init>()
            r0.title = r1
            r0.msgSource = r2
            r0.sendTalker = r3
            r0.displayName = r4
            r0.talker = r5
            r0.type = r6
            r0.content = r7
            r0.svrId = r8
            r0.strId = r10
            r0.createTime = r11
            return
    }

    public /* synthetic */ ScriptQuoteMsgBean(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, long r8, java.lang.String r10, long r11, gg.g r13) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return
    }

    public final java.lang.String getContent() {
            r1 = this;
            java.lang.String r0 = r1.content
            return r0
    }

    public final long getCreateTime() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.displayName
            return r0
    }

    public final java.lang.String getMsgSource() {
            r1 = this;
            java.lang.String r0 = r1.msgSource
            return r0
    }

    public final java.lang.String getSendTalker() {
            r1 = this;
            java.lang.String r0 = r1.sendTalker
            return r0
    }

    public final java.lang.String getSenderId() {
            r1 = this;
            java.lang.String r0 = r1.sendTalker
            return r0
    }

    public final java.lang.String getStrId() {
            r1 = this;
            java.lang.String r0 = r1.strId
            return r0
    }

    public final long getSvrId() {
            r2 = this;
            long r0 = r2.svrId
            return r0
    }

    public final java.lang.String getTalker() {
            r1 = this;
            java.lang.String r0 = r1.talker
            return r0
    }

    public final java.lang.String getTalkerId() {
            r1 = this;
            java.lang.String r0 = r1.talker
            return r0
    }

    public final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public final int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }
}
