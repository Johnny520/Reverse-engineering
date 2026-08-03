package lb;

import gg.AbstractC1416l;
import p099h.Hchat.hooks.api.model.WeChatMessage;

/* JADX INFO: renamed from: lb.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2543e {

    /* JADX INFO: renamed from: a */
    public final WeChatMessage f8230a;

    /* JADX INFO: renamed from: b */
    public final WeChatMessage f8231b;

    /* JADX INFO: renamed from: c */
    public final WeChatMessage f8232c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2543e(WeChatMessage weChatMessage, WeChatMessage weChatMessage2, WeChatMessage weChatMessage3) {
        this.f8230a = weChatMessage;
        this.f8231b = weChatMessage2;
        this.f8232c = weChatMessage3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2543e)) {
            return false;
        }
        C2543e c2543e = (C2543e) obj;
        return this.f8230a.equals(c2543e.f8230a) && AbstractC1416l.m3825a(this.f8231b, c2543e.f8231b) && AbstractC1416l.m3825a(this.f8232c, c2543e.f8232c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f8230a.hashCode() * 31;
        WeChatMessage weChatMessage = this.f8231b;
        int iHashCode2 = (iHashCode + (weChatMessage == null ? 0 : weChatMessage.hashCode())) * 31;
        WeChatMessage weChatMessage2 = this.f8232c;
        return iHashCode2 + (weChatMessage2 != null ? weChatMessage2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RepeatMessageSelection(message=" + this.f8230a + ", storedMessage=" + this.f8231b + ", nativeMessage=" + this.f8232c + ")";
    }
}
