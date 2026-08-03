package p099h.Hchat.hooks.api.model;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatQuoteMsg {
    public static final int $stable = 0;
    public final String content;
    public final long createTime;
    public final String displayName;
    public final String msgSource;
    public final String sendTalker;
    public final String strId;
    public final long svrId;
    public final String talker;
    public final String title;
    public final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatQuoteMsg(String str, String str2, String str3, String str4, String str5, int i9, String str6, long j3, String str7, long j4) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.title = str;
        this.msgSource = str2;
        this.sendTalker = str3;
        this.displayName = str4;
        this.talker = str5;
        this.type = i9;
        this.content = str6;
        this.svrId = j3;
        this.strId = str7;
        this.createTime = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ WeChatQuoteMsg copy$default(WeChatQuoteMsg weChatQuoteMsg, String str, String str2, String str3, String str4, String str5, int i9, String str6, long j3, String str7, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = weChatQuoteMsg.title;
        }
        if ((i10 & 2) != 0) {
            str2 = weChatQuoteMsg.msgSource;
        }
        if ((i10 & 4) != 0) {
            str3 = weChatQuoteMsg.sendTalker;
        }
        if ((i10 & 8) != 0) {
            str4 = weChatQuoteMsg.displayName;
        }
        if ((i10 & 16) != 0) {
            str5 = weChatQuoteMsg.talker;
        }
        if ((i10 & 32) != 0) {
            i9 = weChatQuoteMsg.type;
        }
        if ((i10 & 64) != 0) {
            str6 = weChatQuoteMsg.content;
        }
        if ((i10 & 128) != 0) {
            j3 = weChatQuoteMsg.svrId;
        }
        if ((i10 & Opcodes.ACC_NATIVE) != 0) {
            str7 = weChatQuoteMsg.strId;
        }
        if ((i10 & Opcodes.ACC_INTERFACE) != 0) {
            j4 = weChatQuoteMsg.createTime;
        }
        String str8 = str7;
        long j5 = j3;
        int i11 = i9;
        String str9 = str6;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        return weChatQuoteMsg.copy(str, str2, str12, str10, str11, i11, str9, j5, str8, j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long component10() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.msgSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component3() {
        return this.sendTalker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component4() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component5() {
        return this.talker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component6() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component7() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long component8() {
        return this.svrId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component9() {
        return this.strId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatQuoteMsg copy(String str, String str2, String str3, String str4, String str5, int i9, String str6, long j3, String str7, long j4) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        return new WeChatQuoteMsg(str, str2, str3, str4, str5, i9, str6, j3, str7, j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeChatQuoteMsg)) {
            return false;
        }
        WeChatQuoteMsg weChatQuoteMsg = (WeChatQuoteMsg) obj;
        return AbstractC1416l.m3825a(this.title, weChatQuoteMsg.title) && AbstractC1416l.m3825a(this.msgSource, weChatQuoteMsg.msgSource) && AbstractC1416l.m3825a(this.sendTalker, weChatQuoteMsg.sendTalker) && AbstractC1416l.m3825a(this.displayName, weChatQuoteMsg.displayName) && AbstractC1416l.m3825a(this.talker, weChatQuoteMsg.talker) && this.type == weChatQuoteMsg.type && AbstractC1416l.m3825a(this.content, weChatQuoteMsg.content) && this.svrId == weChatQuoteMsg.svrId && AbstractC1416l.m3825a(this.strId, weChatQuoteMsg.strId) && this.createTime == weChatQuoteMsg.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMsgSource() {
        return this.msgSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSendTalker() {
        return this.sendTalker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getStrId() {
        return this.strId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getSvrId() {
        return this.svrId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTalker() {
        return this.talker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Long.hashCode(this.createTime) + AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.type, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.title.hashCode() * 31, 31, this.msgSource), 31, this.sendTalker), 31, this.displayName), 31, this.talker), 31), 31, this.content), 31, this.svrId), 31, this.strId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.title;
        String str2 = this.msgSource;
        String str3 = this.sendTalker;
        String str4 = this.displayName;
        String str5 = this.talker;
        int i9 = this.type;
        String str6 = this.content;
        long j3 = this.svrId;
        String str7 = this.strId;
        long j4 = this.createTime;
        StringBuilder sbM1027p = AbstractC0255e.m1027p("WeChatQuoteMsg(title=", str, ", msgSource=", str2, ", sendTalker=");
        AbstractC2091b.m5173t(sbM1027p, str3, ", displayName=", str4, ", talker=");
        sbM1027p.append(str5);
        sbM1027p.append(", type=");
        sbM1027p.append(i9);
        sbM1027p.append(", content=");
        sbM1027p.append(str6);
        sbM1027p.append(", svrId=");
        sbM1027p.append(j3);
        sbM1027p.append(", strId=");
        sbM1027p.append(str7);
        sbM1027p.append(", createTime=");
        return AbstractC0921a.m2253p(sbM1027p, j4, ")");
    }
}
