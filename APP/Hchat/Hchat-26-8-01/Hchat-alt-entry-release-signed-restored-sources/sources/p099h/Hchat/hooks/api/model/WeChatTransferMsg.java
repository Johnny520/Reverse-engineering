package p099h.Hchat.hooks.api.model;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatTransferMsg {
    public static final int $stable = 0;
    public final String description;
    public final long fee;
    public final long invalidTime;
    public final String payer;
    public final String payerUsername;
    public final String rawXml;
    public final String receiver;
    public final String transId;
    public final String transactionId;
    public final String transferId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatTransferMsg(String str, String str2, String str3, String str4, long j3, long j4, String str5, String str6) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        str6.getClass();
        this.transactionId = str;
        this.transId = str2;
        this.payer = str3;
        this.receiver = str4;
        this.invalidTime = j3;
        this.fee = j4;
        this.description = str5;
        this.rawXml = str6;
        this.transferId = str2;
        this.payerUsername = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ WeChatTransferMsg copy$default(WeChatTransferMsg weChatTransferMsg, String str, String str2, String str3, String str4, long j3, long j4, String str5, String str6, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = weChatTransferMsg.transactionId;
        }
        if ((i9 & 2) != 0) {
            str2 = weChatTransferMsg.transId;
        }
        if ((i9 & 4) != 0) {
            str3 = weChatTransferMsg.payer;
        }
        if ((i9 & 8) != 0) {
            str4 = weChatTransferMsg.receiver;
        }
        if ((i9 & 16) != 0) {
            j3 = weChatTransferMsg.invalidTime;
        }
        if ((i9 & 32) != 0) {
            j4 = weChatTransferMsg.fee;
        }
        if ((i9 & 64) != 0) {
            str5 = weChatTransferMsg.description;
        }
        if ((i9 & 128) != 0) {
            str6 = weChatTransferMsg.rawXml;
        }
        long j5 = j4;
        long j10 = j3;
        String str7 = str3;
        String str8 = str4;
        return weChatTransferMsg.copy(str, str2, str7, str8, j10, j5, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.transId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component3() {
        return this.payer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component4() {
        return this.receiver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long component5() {
        return this.invalidTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long component6() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component7() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component8() {
        return this.rawXml;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatTransferMsg copy(String str, String str2, String str3, String str4, long j3, long j4, String str5, String str6) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        str6.getClass();
        return new WeChatTransferMsg(str, str2, str3, str4, j3, j4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeChatTransferMsg)) {
            return false;
        }
        WeChatTransferMsg weChatTransferMsg = (WeChatTransferMsg) obj;
        return AbstractC1416l.m3825a(this.transactionId, weChatTransferMsg.transactionId) && AbstractC1416l.m3825a(this.transId, weChatTransferMsg.transId) && AbstractC1416l.m3825a(this.payer, weChatTransferMsg.payer) && AbstractC1416l.m3825a(this.receiver, weChatTransferMsg.receiver) && this.invalidTime == weChatTransferMsg.invalidTime && this.fee == weChatTransferMsg.fee && AbstractC1416l.m3825a(this.description, weChatTransferMsg.description) && AbstractC1416l.m3825a(this.rawXml, weChatTransferMsg.rawXml);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getInvalidTime() {
        return this.invalidTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getPayer() {
        return this.payer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getPayerUsername() {
        return this.payerUsername;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getRawXml() {
        return this.rawXml;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getReceiver() {
        return this.receiver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTransId() {
        return this.transId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTransferId() {
        return this.transferId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.rawXml.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.transactionId.hashCode() * 31, 31, this.transId), 31, this.payer), 31, this.receiver), 31, this.invalidTime), 31, this.fee), 31, this.description);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.transactionId;
        String str2 = this.transId;
        String str3 = this.payer;
        String str4 = this.receiver;
        long j3 = this.invalidTime;
        long j4 = this.fee;
        String str5 = this.description;
        String str6 = this.rawXml;
        StringBuilder sbM1027p = AbstractC0255e.m1027p("WeChatTransferMsg(transactionId=", str, ", transId=", str2, ", payer=");
        AbstractC2091b.m5173t(sbM1027p, str3, ", receiver=", str4, ", invalidTime=");
        sbM1027p.append(j3);
        AbstractC2091b.m5172s(sbM1027p, ", fee=", j4, ", description=");
        return AbstractC2091b.m5164k(sbM1027p, str5, ", rawXml=", str6, ")");
    }
}
