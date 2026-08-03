package p198nb;

import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: nb.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2942k {

    /* JADX INFO: renamed from: a */
    public final String f9647a;

    /* JADX INFO: renamed from: b */
    public final String f9648b;

    /* JADX INFO: renamed from: c */
    public final long f9649c;

    /* JADX INFO: renamed from: d */
    public final long f9650d;

    /* JADX INFO: renamed from: e */
    public final WeChatMessage f9651e;

    /* JADX INFO: renamed from: f */
    public final List f9652f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f9653g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashSet f9654h;

    /* JADX INFO: renamed from: i */
    public volatile String f9655i;

    /* JADX INFO: renamed from: j */
    public volatile String f9656j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2942k(String str, String str2, long j3, long j4, WeChatMessage weChatMessage, List list) {
        str2.getClass();
        this.f9647a = str;
        this.f9648b = str2;
        this.f9649c = j3;
        this.f9650d = j4;
        this.f9651e = weChatMessage;
        this.f9652f = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((String) it.next(), "initial");
        }
        this.f9653g = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        WeChatMessage weChatMessage2 = this.f9651e;
        if (weChatMessage2 != null && (strBodyContent = weChatMessage2.bodyContent()) != null) {
            String strBodyContent = AbstractC3149m.m6721t0(strBodyContent) ? null : strBodyContent;
            if (strBodyContent != null) {
                linkedHashSet.add(strBodyContent);
            }
        }
        this.f9654h = linkedHashSet;
        this.f9655i = "lookups=unattempted";
        this.f9656j = "lookups=unattempted candidates=[]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2942k)) {
            return false;
        }
        C2942k c2942k = (C2942k) obj;
        return this.f9647a.equals(c2942k.f9647a) && AbstractC1416l.m3825a(this.f9648b, c2942k.f9648b) && this.f9649c == c2942k.f9649c && this.f9650d == c2942k.f9650d && AbstractC1416l.m3825a(this.f9651e, c2942k.f9651e) && this.f9652f.equals(c2942k.f9652f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2243f = AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2244g(this.f9647a.hashCode() * 31, 31, this.f9648b), 31, this.f9649c), 31, this.f9650d);
        WeChatMessage weChatMessage = this.f9651e;
        return this.f9652f.hashCode() + ((iM2243f + (weChatMessage == null ? 0 : weChatMessage.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("PendingVoice(key=", this.f9647a, ", talker=", this.f9648b, ", msgId=");
        sbM1027p.append(this.f9649c);
        AbstractC2091b.m5172s(sbM1027p, ", msgSvrId=", this.f9650d, ", initialMessage=");
        sbM1027p.append(this.f9651e);
        sbM1027p.append(", initialFileNames=");
        sbM1027p.append(this.f9652f);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
