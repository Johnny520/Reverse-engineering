package p053dd;

import android.content.ContentValues;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import md.AbstractC5161p;
import okhttp3.internal.url._UrlKt;
import p084fd.AbstractC2422b;
import p084fd.AbstractC2424d;
import p330wd.C9230e;

/* JADX INFO: renamed from: dd.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C1951c {
    public String content;
    public final long createTime;
    public final String imgPath;
    public final int isSend;
    public final byte[] lvbuffer;
    public final long msgId;
    public final long msgSvrId;
    public final String rawContent;
    public String sendTalker;
    public final int status;
    public final String talker;
    public final int type;
    public C9230e xml;
    public List<String> atList = new ArrayList();
    public boolean isAnnounce = false;
    public boolean isAtAll = false;
    public boolean isAtMe = false;

    public C1951c(ContentValues contentValues) {
        if (contentValues == null) {
            this.talker = _UrlKt.FRAGMENT_ENCODE_SET;
            this.rawContent = _UrlKt.FRAGMENT_ENCODE_SET;
            this.imgPath = _UrlKt.FRAGMENT_ENCODE_SET;
            this.createTime = 0L;
            this.type = 0;
            this.isSend = 0;
            this.msgId = 0L;
            this.msgSvrId = 0L;
            this.status = 0;
            this.lvbuffer = null;
            this.sendTalker = _UrlKt.FRAGMENT_ENCODE_SET;
            this.content = _UrlKt.FRAGMENT_ENCODE_SET;
            return;
        }
        Long asLong = contentValues.getAsLong("createTime");
        this.createTime = asLong != null ? asLong.longValue() : 0L;
        Integer asInteger = contentValues.getAsInteger("type");
        this.type = asInteger != null ? asInteger.intValue() : 0;
        Integer asInteger2 = contentValues.getAsInteger("isSend");
        this.isSend = asInteger2 != null ? asInteger2.intValue() : 0;
        Long asLong2 = contentValues.getAsLong("msgId");
        long jLongValue = asLong2 != null ? asLong2.longValue() : 0L;
        this.msgId = jLongValue;
        Long asLong3 = contentValues.getAsLong("msgSvrId");
        this.msgSvrId = asLong3 != null ? asLong3.longValue() : 0L;
        Integer asInteger3 = contentValues.getAsInteger("status");
        this.status = asInteger3 != null ? asInteger3.intValue() : 0;
        this.lvbuffer = contentValues.getAsByteArray("lvbuffer");
        this.talker = contentValues.getAsString("talker");
        if (asInteger.intValue() != 43 || asLong2.longValue() <= 0) {
            this.rawContent = contentValues.getAsString("content");
        } else {
            this.rawContent = AbstractC2424d.m8748u(jLongValue);
        }
        this.imgPath = contentValues.getAsString("imgPath");
        parseEnhanceFields();
    }

    private int getIntField(Object obj, String str) {
        try {
            return AbstractC5161p.getIntField(obj, str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private long getLongField(Object obj, String str) {
        try {
            return AbstractC5161p.getLongField(obj, str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private String getStringField(Object obj, String str) {
        Object objectField = AbstractC5161p.getObjectField(obj, str);
        return objectField == null ? _UrlKt.FRAGMENT_ENCODE_SET : objectField.toString();
    }

    private void parseAtList(String str) {
        String strGroup;
        byte[] bArr = this.lvbuffer;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            Matcher matcher = Pattern.compile("<atuserlist>(<!\\[CDATA\\[)?(.*?)(]]>)?</atuserlist>").matcher(new String(bArr, StandardCharsets.UTF_8).replaceAll("\\p{Cntrl}", _UrlKt.FRAGMENT_ENCODE_SET).trim());
            if (matcher.find() && (strGroup = matcher.group(2)) != null && !strGroup.isEmpty()) {
                for (String str2 : strGroup.split(",")) {
                    String strTrim = str2.trim();
                    if (!strTrim.isEmpty()) {
                        this.atList.add(strTrim);
                        if ("notify@all".equals(strTrim)) {
                            this.isAtAll = true;
                        }
                        if ("announcement@all".equals(strTrim)) {
                            this.isAnnounce = true;
                        }
                    }
                }
            }
            if (this.isAnnounce) {
                this.isAtMe = false;
                return;
            }
            if (this.isAtAll) {
                this.isAtMe = true;
            } else {
                if (str == null || str.isEmpty()) {
                    return;
                }
                this.isAtMe = this.atList.contains(str);
            }
        } catch (Exception unused) {
        }
    }

    private void parseEnhanceFields() {
        String str;
        String str2;
        String strM8720d = AbstractC2422b.m8720d();
        if (this.isSend == 1) {
            this.sendTalker = strM8720d;
            this.content = this.rawContent;
        } else if (!isGroupChat() || (str = this.rawContent) == null) {
            this.sendTalker = this.talker;
            this.content = this.rawContent;
        } else {
            int iIndexOf = str.indexOf(":\n");
            String str3 = this.rawContent;
            if (iIndexOf > 0) {
                this.sendTalker = str3.substring(0, iIndexOf);
                this.content = this.rawContent.substring(iIndexOf + 2);
            } else {
                boolean zContains = str3.contains(":");
                String str4 = this.rawContent;
                if (zContains) {
                    int iIndexOf2 = str4.indexOf(":");
                    this.sendTalker = this.rawContent.substring(0, iIndexOf2);
                    this.content = this.rawContent.substring(iIndexOf2 + 1);
                } else if (str4.contains("<")) {
                    this.sendTalker = _UrlKt.FRAGMENT_ENCODE_SET;
                    this.content = this.rawContent;
                } else {
                    this.sendTalker = this.talker;
                    this.content = this.rawContent;
                }
            }
        }
        if (this.xml == null && (str2 = this.content) != null && (str2.contains("<msg>") || this.content.contains("<appmsg>"))) {
            this.xml = new C9230e(this.content);
        }
        parseAtList(strM8720d);
    }

    public String getAesKey() {
        C9230e c9230e = this.xml;
        return c9230e != null ? c9230e.m35933e() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public String getAppId() {
        C9230e c9230e = this.xml;
        return c9230e != null ? c9230e.m35934f() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public String getFileId() {
        C9230e c9230e = this.xml;
        return c9230e != null ? c9230e.m35935g() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public int getInvalidTime() {
        C9230e c9230e = this.xml;
        if (c9230e != null) {
            return c9230e.m35937i();
        }
        return 0;
    }

    public long getLength() {
        C9230e c9230e = this.xml;
        if (c9230e != null) {
            return c9230e.m35938j();
        }
        return 0L;
    }

    public String getMd5() {
        C9230e c9230e = this.xml;
        return c9230e != null ? c9230e.m35940l() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public String getNativeUrl() {
        C9230e c9230e = this.xml;
        return c9230e != null ? c9230e.m35941m() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public String getTitle() {
        C9230e c9230e = this.xml;
        return c9230e != null ? c9230e.m35943o() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public String getTransactionId() {
        C9230e c9230e = this.xml;
        return c9230e != null ? c9230e.m35944p() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public String getTransferId() {
        C9230e c9230e = this.xml;
        return c9230e != null ? c9230e.m35945q() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public boolean isAnnounce() {
        return this.isAnnounce;
    }

    public boolean isAtAll() {
        return this.isAtAll;
    }

    public boolean isAtMe() {
        return this.isAtMe;
    }

    public boolean isCard() {
        return this.type == 49;
    }

    public boolean isChatRoom() {
        return isGroupChat();
    }

    public boolean isEmoji() {
        return this.type == 47;
    }

    public boolean isFile() {
        int i10 = this.type;
        return i10 == 1090519089 || i10 == 6;
    }

    public boolean isGif() {
        int i10 = this.type;
        return i10 == 8 || i10 == 1048625;
    }

    public boolean isGroupChat() {
        String str = this.talker;
        return str != null && str.endsWith("@chatroom");
    }

    public boolean isImage() {
        return this.type == 3;
    }

    public boolean isLocation() {
        return this.type == 48;
    }

    public boolean isNotify() {
        int i10 = this.type;
        return i10 == 1075839025 || i10 == 318767153;
    }

    public boolean isPic() {
        return isImage();
    }

    public boolean isPrivateChat() {
        return !isGroupChat();
    }

    public boolean isQuote() {
        return isReply();
    }

    public boolean isRedPacket() {
        return this.type == 436207665;
    }

    public boolean isReply() {
        return this.type == 822083633;
    }

    public boolean isRevoke() {
        return this.type == 10002;
    }

    public boolean isSend() {
        return this.isSend == 1;
    }

    public boolean isSystem() {
        return this.type == 10000;
    }

    public boolean isText() {
        return this.type == 1;
    }

    public boolean isTransfer() {
        return this.type == 419430449;
    }

    public boolean isVideo() {
        return this.type == 43;
    }

    public boolean isVoice() {
        return this.type == 34;
    }

    public String toString() {
        return "MsgInfo(type=" + this.type + ", msgId=" + this.msgId + ", isSend=" + this.isSend + ", talker=" + this.talker + ", sendTalker=" + this.sendTalker + ", content=" + this.content + ", imgPath=" + this.imgPath + ", createTime=" + this.createTime + ", atList=" + this.atList + ")";
    }

    public C1951c(Object obj) {
        if (obj == null) {
            this.talker = _UrlKt.FRAGMENT_ENCODE_SET;
            this.rawContent = _UrlKt.FRAGMENT_ENCODE_SET;
            this.imgPath = _UrlKt.FRAGMENT_ENCODE_SET;
            this.createTime = 0L;
            this.type = 0;
            this.isSend = 0;
            this.msgId = 0L;
            this.msgSvrId = 0L;
            this.status = 0;
            this.lvbuffer = null;
            this.sendTalker = _UrlKt.FRAGMENT_ENCODE_SET;
            this.content = _UrlKt.FRAGMENT_ENCODE_SET;
            return;
        }
        this.createTime = getLongField(obj, "field_createTime");
        int intField = getIntField(obj, "field_type");
        this.type = intField;
        this.isSend = getIntField(obj, "field_isSend");
        long longField = getLongField(obj, "field_msgId");
        this.msgId = longField;
        this.msgSvrId = getLongField(obj, "field_msgSvrId");
        this.status = getIntField(obj, "field_status");
        this.lvbuffer = (byte[]) AbstractC5161p.getObjectField(obj, "field_lvbuffer");
        this.talker = getStringField(obj, "field_talker");
        if (intField == 43 && longField > 0) {
            this.rawContent = AbstractC2424d.m8748u(longField);
        } else {
            this.rawContent = getStringField(obj, "field_content");
        }
        this.imgPath = getStringField(obj, "field_imgPath");
        parseEnhanceFields();
    }
}
