package p065eb;

import p099h.Hchat.hooks.api.model.WeChatQuoteMsg;
import p099h.Hchat.hooks.items.script.ScriptQuoteMsgBean;

/* JADX INFO: renamed from: eb.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0867f0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ScriptQuoteMsgBean m2172a(WeChatQuoteMsg weChatQuoteMsg) {
        return new ScriptQuoteMsgBean(weChatQuoteMsg.title, weChatQuoteMsg.msgSource, weChatQuoteMsg.sendTalker, weChatQuoteMsg.displayName, weChatQuoteMsg.talker, weChatQuoteMsg.type, weChatQuoteMsg.content, weChatQuoteMsg.svrId, weChatQuoteMsg.strId, weChatQuoteMsg.createTime, null);
    }
}
