package p099h.Hchat.hooks.api.model;

import gg.AbstractC1416l;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p167l8.C2529d;
import p167l8.EnumC2528c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import tf.AbstractC4156d0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatMessage {
    public static final int $stable = 0;
    private static final int MAX_WECHAT_AT_LENGTH = 40;
    private static final char WECHAT_AT_SEPARATOR = 8197;
    public final String content;
    public final long createTime;
    public final int flag;
    public final String imagePath;
    public final int isSend;
    public final long msgId;
    public final String msgSource;
    public final long msgSvrId;
    public final String reserved;
    public final String selfWxId;
    public final int status;
    public final String talker;
    public final String translatedContent;
    public final int type;
    public static final C2529d Companion = new C2529d();
    private static final Set<String> AT_ALL_LABELS = AbstractC4156d0.m8355W("所有人", "all", "everyone", "全員", "모두");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatMessage(long j3, long j4, int i9, int i10, int i11, long j5, String str, String str2, String str3, String str4, String str5, int i12, String str6, String str7) {
        this.msgId = j3;
        this.msgSvrId = j4;
        this.type = i9;
        this.status = i10;
        this.isSend = i11;
        this.createTime = j5;
        this.flag = i12;
        String str8 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.talker = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.content = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.imagePath = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.reserved = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        this.translatedContent = str5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
        this.msgSource = str6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str6;
        this.selfWxId = str7 != null ? str7 : str8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final EnumC2528c classifyAtMention(String str, String str2, String str3) {
        Companion.getClass();
        return C2529d.m5937c(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List<String> effectiveAtUserList(String str, String str2, String str3) {
        Companion.getClass();
        int iOrdinal = C2529d.m5937c(str, str2, str3).ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? C2529d.m5944j(str) : AbstractC0000a.m99x0("announcement@all") : AbstractC0000a.m99x0("notify@all");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String extractXml(String str) {
        Companion.getClass();
        return C2529d.m5938d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final WeChatMessage fromTransient(String str, String str2, String str3, long j3, boolean z9) {
        Companion.getClass();
        return C2529d.m5945k(str, str2, str3, j3, z9, C2529d.m5940f(str3), 0L, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int inferType(String str) {
        Companion.getClass();
        return C2529d.m5940f(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isAtMeMessage(String str, String str2, String str3) {
        Companion.getClass();
        return C2529d.m5937c(str, str2, str3) == EnumC2528c.f8169h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isGroupTalker(String str) {
        Companion.getClass();
        return C2529d.m5941g(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isNotifyAllMessage(String str, String str2, String str3) {
        Companion.getClass();
        return C2529d.m5937c(str, str2, str3) == EnumC2528c.f8170i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isVideoNumberContent(String str) {
        Companion.getClass();
        return C2529d.m5942h(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String msgSourceValue(String str, String str2) {
        Companion.getClass();
        return C2529d.m5943i(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List<String> parseAtUserList(String str) {
        Companion.getClass();
        return C2529d.m5944j(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String quoteSender(String str, String str2) {
        C2529d c2529d = Companion;
        c2529d.getClass();
        return C2529d.m5941g(str) ? C2529d.m5936b(c2529d, str2, str) : C2529d.m5941g(str2) ? C2529d.m5936b(c2529d, str, str2) : isGroupChat() ? C2529d.m5939e(str2, str) : C2529d.m5939e(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String quoteTalker(String str, String str2) {
        Companion.getClass();
        return C2529d.m5941g(str) ? str : C2529d.m5941g(str2) ? str2 : !AbstractC3149m.m6721t0(this.talker) ? this.talker : C2529d.m5939e(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final WeChatMessage m10913transient(String str, String str2, String str3, long j3, boolean z9) {
        Companion.getClass();
        return C2529d.m5945k(str, str2, str3, j3, z9, C2529d.m5940f(str3), 0L, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String xmlAttr(String str, String str2) {
        Companion.getClass();
        return C2529d.m5947m(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String xmlSection(String str, String str2) {
        Companion.getClass();
        return C2529d.m5948n(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String xmlTag(String str, String str2) {
        Companion.getClass();
        return C2529d.m5949o(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int appMsgType() {
        C2529d c2529d = Companion;
        String strBodyContent = bodyContent();
        c2529d.getClass();
        Integer numM6742f0 = AbstractC3156t.m6742f0(C2529d.m5949o(strBodyContent, "type"));
        if (numM6742f0 != null) {
            return numM6742f0.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String bodyContent() {
        int iM6719r0 = AbstractC3149m.m6719r0(this.content, ":\n", 0, false, 6);
        return (!isGroupChat() || iM6719r0 <= 0) ? this.content : this.content.substring(iM6719r0 + 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getAppMsgType() {
        return appMsgType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EnumC2528c getAtMentionType() {
        C2529d c2529d = Companion;
        String msgSource = getMsgSource();
        String strBodyContent = bodyContent();
        String str = this.selfWxId;
        c2529d.getClass();
        return C2529d.m5937c(msgSource, strBodyContent, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getAtUserList() {
        C2529d c2529d = Companion;
        String msgSource = getMsgSource();
        c2529d.getClass();
        return C2529d.m5944j(msgSource);
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
    public final List<String> getEffectiveAtUserList() {
        int iOrdinal = getAtMentionType().ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? getAtUserList() : AbstractC0000a.m99x0("announcement@all") : AbstractC0000a.m99x0("notify@all");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatFileMsg getFileMsg() {
        if (!isFile()) {
            return null;
        }
        String strBodyContent = bodyContent();
        Companion.getClass();
        String strM5939e = C2529d.m5939e(C2529d.m5949o(strBodyContent, "title"), C2529d.m5949o(strBodyContent, "filename"));
        Long lM6743g0 = AbstractC3156t.m6743g0(C2529d.m5949o(strBodyContent, "totallen"));
        return new WeChatFileMsg(strM5939e, (lM6743g0 == null && (lM6743g0 = AbstractC3156t.m6743g0(C2529d.m5949o(strBodyContent, "length"))) == null) ? 0L : lM6743g0.longValue(), C2529d.m5939e(C2529d.m5949o(strBodyContent, "fileext"), AbstractC3149m.m6697L0(strM5939e, '.', HttpUrl.FRAGMENT_ENCODE_SET)), C2529d.m5939e(C2529d.m5949o(strBodyContent, "filemd5"), C2529d.m5949o(strBodyContent, "md5"), C2529d.m5949o(strBodyContent, "cdnthumbmd5")), C2529d.m5939e(C2529d.m5949o(strBodyContent, "cdnattachurl"), C2529d.m5949o(strBodyContent, "attachid"), C2529d.m5949o(strBodyContent, "url")), C2529d.m5939e(C2529d.m5949o(strBodyContent, "aeskey"), C2529d.m5949o(strBodyContent, "cdnthumbaeskey")), C2529d.m5949o(strBodyContent, "attachid"), C2529d.m5949o(strBodyContent, "filename"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatImageMsg getImageMsg() {
        if (!isImage()) {
            return null;
        }
        String strBodyContent = bodyContent();
        Companion.getClass();
        String strM5939e = C2529d.m5939e(C2529d.m5947m(strBodyContent, "md5"), C2529d.m5949o(strBodyContent, "md5"));
        String strM5939e2 = C2529d.m5939e(C2529d.m5947m(strBodyContent, "cdnbigimgurl"), C2529d.m5949o(strBodyContent, "cdnbigimgurl"));
        String strM5939e3 = C2529d.m5939e(C2529d.m5947m(strBodyContent, "cdnmidimgurl"), C2529d.m5949o(strBodyContent, "cdnmidimgurl"));
        String strM5939e4 = C2529d.m5939e(C2529d.m5947m(strBodyContent, "cdnthumburl"), C2529d.m5949o(strBodyContent, "cdnthumburl"));
        String strM5939e5 = C2529d.m5939e(C2529d.m5947m(strBodyContent, "aeskey"), C2529d.m5949o(strBodyContent, "aeskey"));
        Integer numM6741e0 = AbstractC3156t.m6741e0(10, C2529d.m5939e(C2529d.m5947m(strBodyContent, "hdlength"), C2529d.m5949o(strBodyContent, "hdlength")));
        int iIntValue = numM6741e0 != null ? numM6741e0.intValue() : 0;
        Integer numM6741e02 = AbstractC3156t.m6741e0(10, C2529d.m5939e(C2529d.m5947m(strBodyContent, "length"), C2529d.m5949o(strBodyContent, "length")));
        int iIntValue2 = numM6741e02 != null ? numM6741e02.intValue() : 0;
        Integer numM6741e03 = AbstractC3156t.m6741e0(10, C2529d.m5939e(C2529d.m5947m(strBodyContent, "cdnthumblength"), C2529d.m5949o(strBodyContent, "cdnthumblength")));
        return new WeChatImageMsg(strM5939e, strM5939e2, strM5939e3, strM5939e4, strM5939e5, iIntValue, iIntValue2, numM6741e03 != null ? numM6741e03.intValue() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getMsgId() {
        return this.msgId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMsgSource() {
        C2529d c2529d = Companion;
        String str = this.msgSource;
        String str2 = this.content;
        c2529d.getClass();
        return C2529d.m5946l(C2529d.m5939e(str, C2529d.m5948n(str2, "msgsource"), C2529d.m5948n(bodyContent(), "msgsource"), C2529d.m5948n(this.reserved, "msgsource")));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatPatMsg getPatMsg() {
        if (!isPat()) {
            return null;
        }
        return new WeChatPatMsg(this.talker, sendTalker(), HttpUrl.FRAGMENT_ENCODE_SET, bodyContent(), this.createTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatQuoteMsg getQuoteMsg() {
        if (!isQuote()) {
            return null;
        }
        String strBodyContent = bodyContent();
        C2529d c2529d = Companion;
        c2529d.getClass();
        String strM5939e = C2529d.m5939e(C2529d.m5948n(strBodyContent, "refermsg"), strBodyContent);
        String strM5935a = C2529d.m5935a(c2529d, C2529d.m5939e(C2529d.m5949o(strM5939e, "fromusr"), C2529d.m5949o(strBodyContent, "referfromusr"), C2529d.m5949o(strBodyContent, "fromusername")));
        String strM5935a2 = C2529d.m5935a(c2529d, C2529d.m5939e(C2529d.m5949o(strM5939e, "chatusr"), C2529d.m5949o(strBodyContent, "refertowusr")));
        String strM5935a3 = C2529d.m5935a(c2529d, C2529d.m5949o(strBodyContent, "title"));
        String strM5935a4 = C2529d.m5935a(c2529d, C2529d.m5949o(strM5939e, "msgsource"));
        String strQuoteSender = quoteSender(strM5935a, strM5935a2);
        String strM5935a5 = C2529d.m5935a(c2529d, C2529d.m5949o(strM5939e, "displayname"));
        String strQuoteTalker = quoteTalker(strM5935a, strM5935a2);
        Integer numM6741e0 = AbstractC3156t.m6741e0(10, C2529d.m5939e(C2529d.m5949o(strBodyContent, "refermsgtype"), C2529d.m5949o(strM5939e, "type")));
        int iIntValue = numM6741e0 != null ? numM6741e0.intValue() : 0;
        String strM5935a6 = C2529d.m5935a(c2529d, C2529d.m5939e(C2529d.m5949o(strM5939e, "content"), C2529d.m5949o(strBodyContent, "refermsgcontent")));
        Long lM6743g0 = AbstractC3156t.m6743g0(C2529d.m5939e(C2529d.m5949o(strM5939e, "svrid"), C2529d.m5949o(strBodyContent, "refermsgid")));
        long jLongValue = lM6743g0 != null ? lM6743g0.longValue() : 0L;
        String strM5935a7 = C2529d.m5935a(c2529d, C2529d.m5949o(strM5939e, "strid"));
        Long lM6743g02 = AbstractC3156t.m6743g0(C2529d.m5949o(strM5939e, "createtime"));
        return new WeChatQuoteMsg(strM5935a3, strM5935a4, strQuoteSender, strM5935a5, strQuoteTalker, iIntValue, strM5935a6, jLongValue, strM5935a7, lM6743g02 != null ? lM6743g02.longValue() : 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSendTalker() {
        return sendTalker();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTalker() {
        return this.talker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatTransferMsg getTransferMsg() {
        if (!isTransfer()) {
            return null;
        }
        String strBodyContent = bodyContent();
        Companion.getClass();
        Long lM6743g0 = AbstractC3156t.m6743g0(C2529d.m5939e(C2529d.m5949o(strBodyContent, "total_fee"), C2529d.m5949o(strBodyContent, "feederval"), C2529d.m5949o(strBodyContent, "fee")));
        long jLongValue = lM6743g0 != null ? lM6743g0.longValue() : 0L;
        String strM5939e = C2529d.m5939e(C2529d.m5949o(strBodyContent, "transcationid"), C2529d.m5949o(strBodyContent, "transactionid"), C2529d.m5949o(strBodyContent, "transaction_id"));
        String strM5939e2 = C2529d.m5939e(C2529d.m5949o(strBodyContent, "transferid"), C2529d.m5949o(strBodyContent, "transfer_id"), C2529d.m5949o(strBodyContent, "trans_id"));
        String strM5939e3 = C2529d.m5939e(C2529d.m5949o(strBodyContent, "payer_username"), C2529d.m5949o(strBodyContent, "payerusername"), C2529d.m5949o(strBodyContent, "username"), sendTalker());
        String strM5939e4 = C2529d.m5939e(C2529d.m5949o(strBodyContent, "receiver_username"), C2529d.m5949o(strBodyContent, "receiverusername"));
        Long lM6743g02 = AbstractC3156t.m6743g0(C2529d.m5949o(strBodyContent, "invalidtime"));
        return new WeChatTransferMsg(strM5939e, strM5939e2, strM5939e3, strM5939e4, lM6743g02 != null ? lM6743g02.longValue() : 0L, jLongValue, C2529d.m5939e(C2529d.m5949o(strBodyContent, "pay_memo"), C2529d.m5949o(strBodyContent, "feedesc"), C2529d.m5949o(strBodyContent, "desc"), C2529d.m5949o(strBodyContent, "title")), C2529d.m5938d(strBodyContent));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatVideoMsg getVideoMsg() {
        if (!isVideo() && this.type != 62) {
            return null;
        }
        String strBodyContent = bodyContent();
        Companion.getClass();
        String strM5939e = C2529d.m5939e(C2529d.m5947m(strBodyContent, "md5"), C2529d.m5949o(strBodyContent, "md5"));
        String strM5939e2 = C2529d.m5939e(C2529d.m5947m(strBodyContent, "newmd5"), C2529d.m5949o(strBodyContent, "newmd5"));
        String strM5939e3 = C2529d.m5939e(C2529d.m5947m(strBodyContent, "cdnvideourl"), C2529d.m5949o(strBodyContent, "cdnvideourl"));
        String strM5939e4 = C2529d.m5939e(C2529d.m5947m(strBodyContent, "aeskey"), C2529d.m5949o(strBodyContent, "aeskey"));
        Long lM6743g0 = AbstractC3156t.m6743g0(C2529d.m5939e(C2529d.m5947m(strBodyContent, "length"), C2529d.m5949o(strBodyContent, "length")));
        long jLongValue = lM6743g0 != null ? lM6743g0.longValue() : 0L;
        Integer numM6741e0 = AbstractC3156t.m6741e0(10, C2529d.m5939e(C2529d.m5947m(strBodyContent, "playlength"), C2529d.m5949o(strBodyContent, "playlength")));
        return new WeChatVideoMsg(strM5939e, strM5939e2, strM5939e3, strM5939e4, jLongValue, numM6741e0 != null ? numM6741e0.intValue() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isAnnounceAll() {
        return getAtMentionType() == EnumC2528c.f8171j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isApp() {
        int i9 = this.type;
        if (i9 > 0) {
            int i10 = i9 & 255;
            int i11 = 65535 & i9;
            if ((i9 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i9 = i11;
                } else if (i10 != 0 && i11 == i10) {
                    i9 = i10;
                }
            }
        }
        return i9 == 49;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isAtMe(String str) {
        C2529d c2529d = Companion;
        String msgSource = getMsgSource();
        String strBodyContent = bodyContent();
        c2529d.getClass();
        return C2529d.m5937c(msgSource, strBodyContent, str) == EnumC2528c.f8169h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isChatroom() {
        return AbstractC3156t.m6733W(this.talker, "@chatroom", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmoji() {
        int i9 = this.type;
        if (i9 > 0) {
            int i10 = i9 & 255;
            int i11 = 65535 & i9;
            if ((i9 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i9 = i11;
                } else if (i10 != 0 && i11 == i10) {
                    i9 = i10;
                }
            }
        }
        return i9 == 47;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isFile() {
        String strBodyContent = bodyContent();
        if (!isApp()) {
            return false;
        }
        int iAppMsgType = appMsgType();
        return iAppMsgType > 0 ? iAppMsgType == 6 : AbstractC3149m.m6709h0(strBodyContent, "<fileext>", true) || AbstractC3149m.m6709h0(strBodyContent, "<filename>", true) || AbstractC3149m.m6709h0(strBodyContent, "<cdnattachurl>", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isFromGroup() {
        return isGroupChat();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isGroupChat() {
        C2529d c2529d = Companion;
        String str = this.talker;
        c2529d.getClass();
        return C2529d.m5941g(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isImChatroom() {
        return AbstractC3156t.m6733W(this.talker, "@im.chatroom", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isImage() {
        int i9 = this.type;
        if (i9 > 0) {
            int i10 = i9 & 255;
            int i11 = 65535 & i9;
            if ((i9 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i9 = i11;
                } else if (i10 != 0 && i11 == i10) {
                    i9 = i10;
                }
            }
        }
        return i9 == 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isIncoming() {
        return this.isSend == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isLink() {
        if (isApp()) {
            return appMsgType() == 4 || appMsgType() == 5;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isLocation() {
        int i9 = this.type;
        if (i9 > 0) {
            int i10 = i9 & 255;
            int i11 = 65535 & i9;
            if ((i9 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i9 = i11;
                } else if (i10 != 0 && i11 == i10) {
                    i9 = i10;
                }
            }
        }
        return i9 == 48;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isMiniProgram() {
        if (isApp()) {
            return appMsgType() == 33 || appMsgType() == 36;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isMusic() {
        if (isApp()) {
            return appMsgType() == 3 || appMsgType() == 76;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isNote() {
        String strBodyContent = bodyContent();
        return isApp() && (appMsgType() == 53 || AbstractC3149m.m6709h0(strBodyContent, "solitaire", true) || AbstractC3149m.m6709h0(strBodyContent, "接龙", false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isNotifyAll() {
        return getAtMentionType() == EnumC2528c.f8170i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isOfficialAccount() {
        return AbstractC3156t.m6733W(this.talker, "@app", false) || AbstractC3156t.m6740d0(this.talker, "gh_", false) || AbstractC1416l.m3825a(this.talker, "newsapp");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isOpenIM() {
        return AbstractC3156t.m6733W(this.talker, "@openim", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isOutgoing() {
        return this.isSend == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isPat() {
        String strBodyContent = bodyContent();
        return isSystem() && (AbstractC3149m.m6709h0(strBodyContent, "pattedUser", true) || AbstractC3149m.m6709h0(strBodyContent, "pattedusername", true) || AbstractC3149m.m6709h0(strBodyContent, "拍了拍", false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isPrivateChat() {
        return (AbstractC3149m.m6721t0(this.talker) || isGroupChat() || isOfficialAccount()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isQuote() {
        String strBodyContent = bodyContent();
        return appMsgType() == 57 || AbstractC3149m.m6709h0(strBodyContent, "<refermsg>", true) || AbstractC3149m.m6709h0(strBodyContent, "<referfromusr>", true) || AbstractC3149m.m6709h0(strBodyContent, "<refermsgid>", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRecalled() {
        return this.type == 10002 || AbstractC3149m.m6709h0(this.content, "<revokemsg", true) || AbstractC3149m.m6709h0(this.content, "revokemsg", true) || AbstractC3149m.m6709h0(this.content, "revoke_msg", true) || AbstractC3149m.m6709h0(this.content, "撤回", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRedBag() {
        return isRedPacket();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRedPacket() {
        String strBodyContent = bodyContent();
        Companion.getClass();
        String lowerCase = C2529d.m5949o(strBodyContent, "nativeurl").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return AbstractC3149m.m6709h0(lowerCase, "receivehongbao", true) || AbstractC3149m.m6709h0(lowerCase, "wxhb", true) || AbstractC3149m.m6709h0(lowerCase, "hongbao", true) || AbstractC3149m.m6709h0(strBodyContent, "receivehongbao", true) || AbstractC3149m.m6709h0(strBodyContent, "wxhb_personalreceive", true) || AbstractC3149m.m6709h0(strBodyContent, "/hongbao/", true) || AbstractC1416l.m3825a(C2529d.m5949o(strBodyContent, "type"), "2001");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSend() {
        return isOutgoing();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isShareCard() {
        int i9 = this.type;
        return i9 == 42 || i9 == 66;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSystem() {
        int i9 = this.type;
        if (i9 > 0) {
            int i10 = i9 & 255;
            int i11 = 65535 & i9;
            if ((i9 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i9 = i11;
                } else if (i10 != 0 && i11 == i10) {
                    i9 = i10;
                }
            }
        }
        return i9 == 10000 || i9 == 10002;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isText() {
        int i9 = this.type;
        if (i9 > 0) {
            int i10 = i9 & 255;
            int i11 = 65535 & i9;
            if ((i9 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i9 = i11;
                } else if (i10 != 0 && i11 == i10) {
                    i9 = i10;
                }
            }
        }
        return i9 == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isTransfer() {
        String strBodyContent = bodyContent();
        int iAppMsgType = appMsgType();
        if (!isApp() || (iAppMsgType != 2000 && iAppMsgType != 2011)) {
            if (!AbstractC3149m.m6709h0(strBodyContent, "<wcpayinfo>", true)) {
                return false;
            }
            if (!AbstractC3149m.m6709h0(strBodyContent, "<transferid>", true) && !AbstractC3149m.m6709h0(strBodyContent, "<transcationid>", true) && !AbstractC3149m.m6709h0(strBodyContent, "<transactionid>", true) && !AbstractC3149m.m6709h0(strBodyContent, "transfer_id=", true) && !AbstractC3149m.m6709h0(strBodyContent, "trans_id=", true) && !AbstractC3149m.m6709h0(strBodyContent, "transferoperation", true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVideo() {
        int i9 = this.type;
        if (i9 > 0) {
            int i10 = i9 & 255;
            int i11 = 65535 & i9;
            if ((i9 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i9 = i11;
                } else if (i10 != 0 && i11 == i10) {
                    i9 = i10;
                }
            }
        }
        return i9 == 43;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVideoNumberVideo() {
        if (!isApp()) {
            return false;
        }
        C2529d c2529d = Companion;
        String strBodyContent = bodyContent();
        c2529d.getClass();
        return C2529d.m5942h(strBodyContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVoice() {
        int i9 = this.type;
        if (i9 > 0) {
            int i10 = i9 & 255;
            int i11 = 65535 & i9;
            if ((i9 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i9 = i11;
                } else if (i10 != 0 && i11 == i10) {
                    i9 = i10;
                }
            }
        }
        return i9 == 34;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVoip() {
        int i9 = this.type;
        return i9 == 50 || i9 == 1000052 || i9 == 1000053;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVoipVideo() {
        return this.type == 1000053;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVoipVoice() {
        int i9 = this.type;
        return i9 == 50 || i9 == 1000052;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String nativeUrl() {
        C2529d c2529d = Companion;
        String strBodyContent = bodyContent();
        c2529d.getClass();
        return C2529d.m5949o(strBodyContent, "nativeurl");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String sendTalker() {
        if (isOutgoing()) {
            return this.talker;
        }
        int iM6719r0 = AbstractC3149m.m6719r0(this.content, ":\n", 0, false, 6);
        if (!isGroupChat() || iM6719r0 <= 0) {
            return this.talker;
        }
        C2529d c2529d = Companion;
        String strSubstring = this.content.substring(0, iM6719r0);
        c2529d.getClass();
        String string = AbstractC3149m.m6703R0(strSubstring).toString();
        while (true) {
            if (!AbstractC3156t.m6733W(string, "]", false) && !AbstractC3156t.m6733W(string, ")", false) && !AbstractC3156t.m6733W(string, ",", false) && !AbstractC3156t.m6733W(string, ";", false)) {
                break;
            }
            string = AbstractC3149m.m6703R0(AbstractC3149m.m6712k0(1, string)).toString();
        }
        int iM6718q0 = AbstractC3149m.m6718q0(string, '\n', 0, 6);
        return iM6718q0 > 0 ? AbstractC3149m.m6703R0(string.substring(0, iM6718q0)).toString() : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String xml() {
        C2529d c2529d = Companion;
        String strBodyContent = bodyContent();
        c2529d.getClass();
        return C2529d.m5938d(strBodyContent);
    }

    public final boolean isAtMe() {
        return isAtMe(this.selfWxId);
    }

    public static final WeChatMessage fromTransient(String str, String str2, String str3, long j3, boolean z9, int i9, long j4) {
        Companion.getClass();
        return C2529d.m5945k(str, str2, str3, j3, z9, i9, j4, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final WeChatMessage m10915transient(String str, String str2, String str3, long j3, boolean z9, int i9, long j4, String str4, String str5) {
        Companion.getClass();
        return C2529d.m5945k(str, str2, str3, j3, z9, i9, j4, str4, str5);
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final WeChatMessage m10914transient(String str, String str2, String str3, long j3, boolean z9, int i9, long j4) {
        Companion.getClass();
        return C2529d.m5945k(str, str2, str3, j3, z9, i9, j4, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public static final WeChatMessage fromTransient(String str, String str2, String str3, long j3, boolean z9, int i9, long j4, String str4, String str5) {
        Companion.getClass();
        return C2529d.m5945k(str, str2, str3, j3, z9, i9, j4, str4, str5);
    }

    public WeChatMessage(long j3, long j4, int i9, int i10, int i11, long j5, String str, String str2, String str3, String str4, String str5, int i12) {
        this(j3, j4, i9, i10, i11, j5, str, str2, str3, str4, str5, i12, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
