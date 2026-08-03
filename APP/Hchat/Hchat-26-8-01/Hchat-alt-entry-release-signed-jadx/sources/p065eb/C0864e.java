package p065eb;

import be.C0285i;
import ca.C0512c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p002a1.RunnableC0003a;
import p014b.C0126e;
import p025bc.AbstractC0255e;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.items.script.ScriptMessageBean;
import p136j8.AbstractC2091b;
import p153k8.InterfaceC2344h;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;

/* JADX INFO: renamed from: eb.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0864e implements InterfaceC2344h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    @Override // p153k8.InterfaceC2344h
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2171a(C0126e c0126e) {
        WeChatMessage weChatMessage = (WeChatMessage) c0126e.f333i;
        if (weChatMessage != null) {
            ScriptMessageBean scriptMessageBean = new ScriptMessageBean(weChatMessage);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ConcurrentHashMap concurrentHashMap = C0866f.f2663d;
            if (concurrentHashMap.size() >= 128) {
                concurrentHashMap.entrySet().removeIf(new C0285i(new C0512c(jCurrentTimeMillis, 4), 10));
            }
            ArrayList<String> arrayList = new ArrayList(4);
            String talker = scriptMessageBean.getTalker();
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (talker == null) {
                talker = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String string = AbstractC3149m.m6703R0(talker).toString();
            String sender = scriptMessageBean.getSender();
            if (sender == null) {
                sender = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String string2 = AbstractC3149m.m6703R0(sender).toString();
            if (string2.length() <= 0 || string2.equals(string)) {
                string2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String msgType = scriptMessageBean.getMsgType();
            if (msgType == null) {
                msgType = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String string3 = AbstractC3149m.m6703R0(msgType).toString();
            String content = scriptMessageBean.getContent();
            if (content != null) {
                str = content;
            }
            String strReplace = AbstractC3156t.m6737a0(str, "\r\n", "\n", false).replace('\r', '\n');
            strReplace.getClass();
            String string4 = AbstractC3149m.m6703R0(strReplace).toString();
            if (AbstractC3156t.m6733W(string, "@chatroom", true) && !AbstractC3149m.m6721t0(string4)) {
                if (!AbstractC3149m.m6721t0(string2)) {
                    String strConcat = string2.concat(":\n");
                    if (AbstractC3156t.m6740d0(string4, strConcat, false)) {
                        string4 = AbstractC3149m.m6703R0(string4.substring(strConcat.length())).toString();
                    } else {
                        int iM6718q0 = AbstractC3149m.m6718q0(string4, '\n', 0, 6);
                        if (iM6718q0 > 0) {
                            String strM6687B0 = AbstractC3149m.m6687B0(AbstractC3149m.m6703R0(string4.substring(0, iM6718q0)).toString(), ":");
                            if (!AbstractC3149m.m6721t0(strM6687B0) && strM6687B0.length() <= 80) {
                                Locale locale = Locale.ROOT;
                                String strM5165l = AbstractC2091b.m5165l(locale, strM6687B0, locale);
                                if (AbstractC3156t.m6733W(strM5165l, "@openim", false) || AbstractC3156t.m6733W(strM5165l, "@chatroom", false) || C0866f.f2661b.m6683d(strM5165l)) {
                                    string4 = AbstractC3149m.m6703R0(string4.substring(iM6718q0 + 1)).toString();
                                }
                            }
                        }
                    }
                }
            }
            long msgId = scriptMessageBean.getMsgId();
            if (msgId > 0) {
                arrayList.add("msg:" + string + ":" + msgId);
            }
            long msgSvrId = scriptMessageBean.getMsgSvrId();
            if (msgSvrId > 0) {
                arrayList.add("svr:" + string + ":" + msgSvrId);
            }
            arrayList.add("raw:" + string + '|' + string2 + '|' + string3 + '|' + scriptMessageBean.isSend() + '|' + string4);
            StringBuilder sb2 = new StringBuilder("body:");
            sb2.append(string);
            AbstractC2091b.m5173t(sb2, "|", string2, "|", string3);
            sb2.append("|");
            sb2.append(string4);
            arrayList.add(sb2.toString());
            if (scriptMessageBean.isSend()) {
                StringBuilder sbM1027p = AbstractC0255e.m1027p("chat:", string, "|", string3, "|");
                sbM1027p.append(string4);
                arrayList.add(sbM1027p.toString());
            }
            if (!arrayList.isEmpty()) {
                for (String str2 : arrayList) {
                    Long l10 = (Long) concurrentHashMap.get(str2);
                    if (l10 != null) {
                        long jLongValue = jCurrentTimeMillis - l10.longValue();
                        C0866f c0866f = C0866f.f2660a;
                        if (jLongValue < (AbstractC3156t.m6740d0(str2, "msg:", false) ? 60000L : 1000L)) {
                            return;
                        }
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                concurrentHashMap.put((String) it.next(), Long.valueOf(jCurrentTimeMillis));
            }
            C0866f.f2664e.execute(new RunnableC0003a(scriptMessageBean, 7));
        }
    }
}
