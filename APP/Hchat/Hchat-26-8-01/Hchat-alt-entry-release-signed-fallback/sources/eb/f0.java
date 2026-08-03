package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static h.Hchat.hooks.items.script.ScriptQuoteMsgBean a(h.Hchat.hooks.api.model.WeChatQuoteMsg r14) {
            h.Hchat.hooks.items.script.ScriptQuoteMsgBean r0 = new h.Hchat.hooks.items.script.ScriptQuoteMsgBean
            java.lang.String r1 = r14.title
            java.lang.String r2 = r14.msgSource
            java.lang.String r3 = r14.sendTalker
            java.lang.String r4 = r14.displayName
            java.lang.String r5 = r14.talker
            int r6 = r14.type
            java.lang.String r7 = r14.content
            long r8 = r14.svrId
            java.lang.String r10 = r14.strId
            long r11 = r14.createTime
            r13 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r13)
            return r0
    }
}
