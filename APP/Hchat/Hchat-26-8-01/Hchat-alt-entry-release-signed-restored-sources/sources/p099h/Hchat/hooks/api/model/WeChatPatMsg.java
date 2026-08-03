package p099h.Hchat.hooks.api.model;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatPatMsg {
    public static final int $stable = 0;
    public final long createTime;
    public final String fromUser;
    public final String pattedUser;
    public final String talker;
    public final String template;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatPatMsg(String str, String str2, String str3, String str4, long j3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.talker = str;
        this.fromUser = str2;
        this.pattedUser = str3;
        this.template = str4;
        this.createTime = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ WeChatPatMsg copy$default(WeChatPatMsg weChatPatMsg, String str, String str2, String str3, String str4, long j3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = weChatPatMsg.talker;
        }
        if ((i9 & 2) != 0) {
            str2 = weChatPatMsg.fromUser;
        }
        if ((i9 & 4) != 0) {
            str3 = weChatPatMsg.pattedUser;
        }
        if ((i9 & 8) != 0) {
            str4 = weChatPatMsg.template;
        }
        if ((i9 & 16) != 0) {
            j3 = weChatPatMsg.createTime;
        }
        long j4 = j3;
        return weChatPatMsg.copy(str, str2, str3, str4, j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.talker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.fromUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component3() {
        return this.pattedUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component4() {
        return this.template;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long component5() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatPatMsg copy(String str, String str2, String str3, String str4, long j3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new WeChatPatMsg(str, str2, str3, str4, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeChatPatMsg)) {
            return false;
        }
        WeChatPatMsg weChatPatMsg = (WeChatPatMsg) obj;
        return AbstractC1416l.m3825a(this.talker, weChatPatMsg.talker) && AbstractC1416l.m3825a(this.fromUser, weChatPatMsg.fromUser) && AbstractC1416l.m3825a(this.pattedUser, weChatPatMsg.pattedUser) && AbstractC1416l.m3825a(this.template, weChatPatMsg.template) && this.createTime == weChatPatMsg.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getFromUser() {
        return this.fromUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getPattedUser() {
        return this.pattedUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTalker() {
        return this.talker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTemplate() {
        return this.template;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Long.hashCode(this.createTime) + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.talker.hashCode() * 31, 31, this.fromUser), 31, this.pattedUser), 31, this.template);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.talker;
        String str2 = this.fromUser;
        String str3 = this.pattedUser;
        String str4 = this.template;
        long j3 = this.createTime;
        StringBuilder sbM1027p = AbstractC0255e.m1027p("WeChatPatMsg(talker=", str, ", fromUser=", str2, ", pattedUser=");
        AbstractC2091b.m5173t(sbM1027p, str3, ", template=", str4, ", createTime=");
        return AbstractC0921a.m2253p(sbM1027p, j3, ")");
    }
}
