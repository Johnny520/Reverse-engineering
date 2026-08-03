package p099h.Hchat.hooks.items.script;

import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import me.p186hd.wauxv.data.bean.MsgInfoBean;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p065eb.C0867f0;
import p068eh.AbstractC0921a;
import p077f8.C1087g;
import p099h.Hchat.hooks.api.model.WeChatFileMsg;
import p099h.Hchat.hooks.api.model.WeChatImageMsg;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatPatMsg;
import p099h.Hchat.hooks.api.model.WeChatQuoteMsg;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.api.model.WeChatTransferMsg;
import p099h.Hchat.hooks.api.model.WeChatVideoMsg;
import p153k8.C2351o;
import p167l8.C2529d;
import p167l8.EnumC2528c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3959f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptMessageBean extends MsgInfoBean {
    public static final int $stable = 8;
    private final C1087g event;
    private final C2351o observed;
    private final WeChatMessage stored;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ScriptMessageBean(C1087g c1087g, C2351o c2351o, WeChatMessage weChatMessage) {
        this.event = c1087g;
        this.observed = c2351o;
        this.stored = weChatMessage;
        this.xml = getXml();
        this.sender = getSender();
        this.senderId = getSenderId();
        this.sendTalker = getSendTalker();
        this.talker = getTalker();
        this.talkerId = getTalkerId();
        this.content = getContent();
        this.text = getText();
        this.msgId = getMsgId();
        this.msgType = getMsgType();
        this.type = getType();
        this.createTime = getCreateTime();
        this.msgSvrId = getMsgSvrId();
        this.msgSource = getMsgSource();
        this.selfWxId = getSelfWxId();
        this.source = getSource();
        this.kind = getKind();
        this.nativeUrl = getNativeUrl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int callInt(Object obj, String str, String str2) {
        Object c3959f;
        Object obj2;
        int iIntValue;
        Method[] methods;
        int length;
        int i9;
        Method method;
        try {
            methods = obj.getClass().getMethods();
            methods.getClass();
            length = methods.length;
            i9 = 0;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        while (true) {
            if (i9 >= length) {
                method = null;
                break;
            }
            method = methods[i9];
            if (AbstractC1416l.m3825a(method.getName(), str)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                boolean z9 = parameterTypes.length == 0;
                if (Boolean.valueOf(z9).booleanValue()) {
                    break;
                }
                i9++;
            }
            obj2 = c3959f instanceof C3959f ? null : c3959f;
            if (!(obj2 instanceof Number)) {
                iIntValue = ((Number) obj2).intValue();
                if (iIntValue < 0) {
                    return 0;
                }
            } else {
                if (!(obj2 instanceof String)) {
                    return 0;
                }
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, (String) obj2);
                iIntValue = numM6741e0 != null ? numM6741e0.intValue() : 0;
                if (iIntValue < 0) {
                    return 0;
                }
            }
            return iIntValue;
        }
        if (method == null || (c3959f = method.invoke(obj, null)) == null) {
            c3959f = fieldValue(obj, str2);
        }
        if (c3959f instanceof C3959f) {
        }
        if (!(obj2 instanceof Number)) {
        }
        return iIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x0002, B:6:0x0014, B:8:0x0020, B:14:0x002f, B:20:0x0040, B:22:0x0046, B:24:0x004c, B:30:0x0060, B:32:0x0066, B:17:0x003a), top: B:43:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String callString(Object obj, String str, String str2) {
        Object c3959f;
        Method[] methods;
        int length;
        int i9;
        Method method;
        Object objInvoke;
        String string;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        try {
            methods = obj.getClass().getMethods();
            methods.getClass();
            length = methods.length;
            i9 = 0;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        while (true) {
            if (i9 >= length) {
                method = null;
                break;
            }
            method = methods[i9];
            if (AbstractC1416l.m3825a(method.getName(), str)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                boolean z9 = parameterTypes.length == 0;
                if (Boolean.valueOf(z9).booleanValue()) {
                    break;
                }
                i9++;
            }
            Object obj2 = str3;
            if (!(c3959f instanceof C3959f)) {
                obj2 = c3959f;
            }
            return (String) obj2;
        }
        if (method == null || (objInvoke = method.invoke(obj, null)) == null || (string = objInvoke.toString()) == null) {
            Object objFieldValue = fieldValue(obj, str2);
            String string2 = objFieldValue != null ? objFieldValue.toString() : null;
            c3959f = string2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string2;
        } else {
            String str4 = Boolean.valueOf(AbstractC3149m.m6721t0(string) ^ true).booleanValue() ? string : null;
            if (str4 != null) {
                c3959f = str4;
            }
        }
        Object obj22 = str3;
        if (!(c3959f instanceof C3959f)) {
        }
        return (String) obj22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final WeChatQuoteMsg fallbackQuoteMsg() {
        String content = getContent();
        if (AbstractC3149m.m6721t0(content)) {
            return null;
        }
        C2529d c2529d = WeChatMessage.Companion;
        String talker = getTalker();
        String sender = getSender();
        long createTime = getCreateTime();
        boolean zIsSend = isSend();
        long msgSvrId = getMsgSvrId();
        String msgSource = getMsgSource();
        String selfWxId = getSelfWxId();
        c2529d.getClass();
        return C2529d.m5945k(talker, sender, content, createTime, zIsSend, 0, msgSvrId, msgSource, selfWxId).getQuoteMsg();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object fieldValue(Object obj, String str) {
        Class<?> superclass = obj.getClass();
        while (true) {
            Field field = null;
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            }
            Field[] declaredFields = superclass.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                Field field2 = declaredFields[i9];
                if (Boolean.valueOf(AbstractC1416l.m3825a(field2.getName(), str)).booleanValue()) {
                    field = field2;
                    break;
                }
                i9++;
            }
            if (field != null) {
                field.setAccessible(true);
                return field.get(obj);
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String firstNotBlank(String... strArr) {
        for (String str : strArr) {
            if (str != null && !AbstractC3149m.m6721t0(str)) {
                return str;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String kindOf(WeChatMessage weChatMessage) {
        int i9;
        if (weChatMessage.isRedPacket()) {
            return "red_packet";
        }
        if (weChatMessage.isTransfer()) {
            return "transfer";
        }
        if (weChatMessage.isQuote()) {
            return "quote";
        }
        if (weChatMessage.isFile()) {
            return "file";
        }
        if (weChatMessage.isPat()) {
            return "pat";
        }
        if (weChatMessage.isLink()) {
            return "link";
        }
        if (weChatMessage.isMusic()) {
            return "music";
        }
        if (weChatMessage.isNote()) {
            return "note";
        }
        if (weChatMessage.isVideoNumberVideo()) {
            return "video_number_video";
        }
        int i10 = weChatMessage.type;
        if (i10 <= 0) {
            i9 = i10;
        } else {
            i9 = i10 & 255;
            int i11 = 65535 & i10;
            if ((i10 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i9 = i11;
                } else if (i9 == 0 || i11 != i9) {
                }
            }
        }
        if (i9 == 1) {
            return WeChatSnsPost.TYPE_TEXT;
        }
        if (i9 == 3) {
            return WeChatSnsPost.TYPE_IMAGE;
        }
        if (i9 == 34) {
            return "voice";
        }
        if (i9 == 43) {
            return WeChatSnsPost.TYPE_VIDEO;
        }
        if (i9 == 10000) {
            return "system";
        }
        if (i9 == 10002) {
            return "recalled";
        }
        switch (i9) {
            case 47:
                return "emoji";
            case 48:
                return "location";
            case 49:
                return "app";
            default:
                return AbstractC0921a.m2250m(i10, "unknown(", ")");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String storedSender(WeChatMessage weChatMessage) {
        String str = weChatMessage.selfWxId;
        return (!weChatMessage.isOutgoing() || AbstractC3149m.m6721t0(str)) ? weChatMessage.sendTalker() : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Object toWaImageMsg(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof MsgInfoBean.ImageMsg ? obj : new MsgInfoBean.ImageMsg(callString(obj, "getMd5", "md5"), callString(obj, "getBigImgUrl", "bigImgUrl"), callString(obj, "getMidImgUrl", "midImgUrl"), callString(obj, "getThumbUrl", "thumbUrl"), firstNotBlank(callString(obj, "getKey", "key"), callString(obj, "getAesKey", "aesKey")), callInt(obj, "getBigLength", "bigLength"), callInt(obj, "getMidLength", "midLength"), callInt(obj, "getThumbLength", "thumbLength"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getAtUserList() {
        List<String> atUserList;
        List<String> atUserList2;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (atUserList2 = weChatMessage.getAtUserList()) != null) {
            return atUserList2;
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            WeChatMessage weChatMessage2 = c2351o.f7723k;
            atUserList = weChatMessage2 != null ? weChatMessage2.getAtUserList() : Collections.EMPTY_LIST;
        } else {
            atUserList = null;
        }
        if (atUserList != null) {
            return atUserList;
        }
        List<String> list = Collections.EMPTY_LIST;
        list.getClass();
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getContent() {
        String strBodyContent;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (strBodyContent = weChatMessage.bodyContent()) != null) {
            return strBodyContent;
        }
        C2351o c2351o = this.observed;
        String str = c2351o != null ? c2351o.f7717e : null;
        if (str != null) {
            return str;
        }
        C1087g c1087g = this.event;
        String str2 = c1087g != null ? c1087g.f3489d : null;
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getCreateTime() {
        Long lValueOf;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            long j3 = weChatMessage.createTime;
            Long lValueOf2 = Long.valueOf(j3);
            if (!(j3 > 0)) {
                lValueOf2 = null;
            }
            if (lValueOf2 != null) {
                return lValueOf2.longValue();
            }
        }
        C2351o c2351o = this.observed;
        if (c2351o == null) {
            lValueOf = null;
        } else {
            WeChatMessage weChatMessage2 = c2351o.f7723k;
            long createTime = weChatMessage2 != null ? weChatMessage2.getCreateTime() : 0L;
            lValueOf = Long.valueOf(createTime);
            if (!(createTime > 0)) {
            }
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        C1087g c1087g = this.event;
        Long lValueOf3 = c1087g != null ? Long.valueOf(c1087g.f3491f) : null;
        if (lValueOf3 != null) {
            return lValueOf3.longValue();
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getCreateTimeSeconds() {
        long createTime = getCreateTime();
        return createTime > 100000000000L ? createTime / 1000 : createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getFileMsg() {
        WeChatMessage weChatMessage;
        WeChatFileMsg fileMsg;
        WeChatMessage weChatMessage2 = this.stored;
        if (weChatMessage2 != null && (fileMsg = weChatMessage2.getFileMsg()) != null) {
            return fileMsg;
        }
        C2351o c2351o = this.observed;
        if (c2351o == null || (weChatMessage = c2351o.f7723k) == null) {
            return null;
        }
        return weChatMessage.getFileMsg();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getImageMsg() {
        WeChatImageMsg imageMsg;
        WeChatMessage weChatMessage;
        WeChatMessage weChatMessage2 = this.stored;
        if (weChatMessage2 == null || (imageMsg = weChatMessage2.getImageMsg()) == null) {
            C2351o c2351o = this.observed;
            imageMsg = (c2351o == null || (weChatMessage = c2351o.f7723k) == null) ? null : weChatMessage.getImageMsg();
        }
        return toWaImageMsg(imageMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getKind() {
        String strKindOf;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (strKindOf = kindOf(weChatMessage)) != null) {
            return strKindOf;
        }
        C2351o c2351o = this.observed;
        String str = c2351o != null ? c2351o.f7714b : null;
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getMessage() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage;
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.f7723k;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getMsgId() {
        WeChatMessage weChatMessage;
        WeChatMessage weChatMessage2 = this.stored;
        if (weChatMessage2 != null) {
            return weChatMessage2.msgId;
        }
        C2351o c2351o = this.observed;
        if (c2351o == null || (weChatMessage = c2351o.f7723k) == null) {
            return 0L;
        }
        return weChatMessage.getMsgId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMsgSource() {
        String msgSource;
        String msgSource2;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (msgSource2 = weChatMessage.getMsgSource()) != null) {
            return msgSource2;
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            WeChatMessage weChatMessage2 = c2351o.f7723k;
            msgSource = weChatMessage2 != null ? weChatMessage2.getMsgSource() : HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            msgSource = null;
        }
        if (msgSource != null) {
            return msgSource;
        }
        C1087g c1087g = this.event;
        String str = c1087g != null ? c1087g.f3493h : null;
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getMsgSvrId() {
        WeChatMessage weChatMessage;
        WeChatMessage weChatMessage2 = this.stored;
        if (weChatMessage2 != null) {
            return weChatMessage2.msgSvrId;
        }
        C2351o c2351o = this.observed;
        if (c2351o != null && (weChatMessage = c2351o.f7723k) != null) {
            return weChatMessage.msgSvrId;
        }
        C1087g c1087g = this.event;
        Long lValueOf = c1087g != null ? Long.valueOf(c1087g.f3492g) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMsgType() {
        String strValueOf;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            int i9 = weChatMessage.type;
            Integer numValueOf = Integer.valueOf(i9);
            if (!(i9 > 0)) {
                numValueOf = null;
            }
            if (numValueOf != null && (strValueOf = String.valueOf(numValueOf.intValue())) != null) {
                return strValueOf;
            }
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            WeChatMessage weChatMessage2 = c2351o.f7723k;
            int type = weChatMessage2 != null ? weChatMessage2.getType() : 0;
            Integer numValueOf2 = Integer.valueOf(type);
            if (!(type > 0)) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                return String.valueOf(numValueOf2.intValue());
            }
        }
        C1087g c1087g = this.event;
        String str = c1087g != null ? c1087g.f3490e : null;
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getNativeUrl() {
        String strNativeUrl;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (strNativeUrl = weChatMessage.nativeUrl()) != null) {
            return strNativeUrl;
        }
        C2351o c2351o = this.observed;
        String str = c2351o != null ? c2351o.f7719g : null;
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getPatMsg() {
        WeChatPatMsg patMsg;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (patMsg = weChatMessage.getPatMsg()) != null) {
            return patMsg;
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5615b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getQuoteMsg() {
        WeChatQuoteMsg quoteMsg;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (quoteMsg = weChatMessage.getQuoteMsg()) != null) {
            ScriptQuoteMsgBean.Companion.getClass();
            return C0867f0.m2172a(quoteMsg);
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            WeChatMessage weChatMessage2 = c2351o.f7723k;
            WeChatQuoteMsg quoteMsg2 = weChatMessage2 != null ? weChatMessage2.getQuoteMsg() : null;
            if (quoteMsg2 != null) {
                ScriptQuoteMsgBean.Companion.getClass();
                return C0867f0.m2172a(quoteMsg2);
            }
        }
        WeChatQuoteMsg weChatQuoteMsgFallbackQuoteMsg = fallbackQuoteMsg();
        if (weChatQuoteMsgFallbackQuoteMsg == null) {
            return null;
        }
        ScriptQuoteMsgBean.Companion.getClass();
        return C0867f0.m2172a(weChatQuoteMsgFallbackQuoteMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSelfWxId() {
        WeChatMessage weChatMessage;
        String str;
        WeChatMessage weChatMessage2 = this.stored;
        if (weChatMessage2 != null && (str = weChatMessage2.selfWxId) != null) {
            return str;
        }
        C2351o c2351o = this.observed;
        if (c2351o != null && (weChatMessage = c2351o.f7723k) != null) {
            return weChatMessage.selfWxId;
        }
        C1087g c1087g = this.event;
        String str2 = c1087g != null ? c1087g.f3494i : null;
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSendTalker() {
        String strStoredSender;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (strStoredSender = storedSender(weChatMessage)) != null) {
            return strStoredSender;
        }
        C2351o c2351o = this.observed;
        String strM5616c = c2351o != null ? c2351o.m5616c() : null;
        return strM5616c != null ? strM5616c : getSender();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSender() {
        String strStoredSender;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (strStoredSender = storedSender(weChatMessage)) != null) {
            return strStoredSender;
        }
        C2351o c2351o = this.observed;
        String str = c2351o != null ? c2351o.f7716d : null;
        if (str != null) {
            return str;
        }
        C1087g c1087g = this.event;
        String str2 = c1087g != null ? c1087g.f3487b : null;
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSenderId() {
        return getSendTalker();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSource() {
        String str;
        if (this.stored != null) {
            return "message_db";
        }
        C2351o c2351o = this.observed;
        if (c2351o != null && (str = c2351o.f7713a) != null) {
            return str;
        }
        C1087g c1087g = this.event;
        String str2 = c1087g != null ? c1087g.f3495j : null;
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getStoredMessage() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage;
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.f7722j;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTalker() {
        String str;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (str = weChatMessage.talker) != null) {
            return str;
        }
        C2351o c2351o = this.observed;
        String str2 = c2351o != null ? c2351o.f7715c : null;
        if (str2 != null) {
            return str2;
        }
        C1087g c1087g = this.event;
        String str3 = c1087g != null ? c1087g.f3488c : null;
        return str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTalkerId() {
        return getTalker();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getText() {
        return getContent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getTransferMsg() {
        WeChatTransferMsg transferMsg;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (transferMsg = weChatMessage.getTransferMsg()) != null) {
            return transferMsg;
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.f7728p;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getType() {
        return getMsgType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getVideoMsg() {
        WeChatMessage weChatMessage;
        WeChatVideoMsg videoMsg;
        WeChatMessage weChatMessage2 = this.stored;
        if (weChatMessage2 != null && (videoMsg = weChatMessage2.getVideoMsg()) != null) {
            return videoMsg;
        }
        C2351o c2351o = this.observed;
        if (c2351o == null || (weChatMessage = c2351o.f7723k) == null) {
            return null;
        }
        return weChatMessage.getVideoMsg();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getXml() {
        String strXml;
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null && (strXml = weChatMessage.xml()) != null) {
            return strXml;
        }
        C2351o c2351o = this.observed;
        String str = c2351o != null ? c2351o.f7718f : null;
        if (str != null) {
            return str;
        }
        C1087g c1087g = this.event;
        String str2 = c1087g != null ? c1087g.f3486a : null;
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isAnnounceAll() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isAnnounceAll();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5618e();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isApp() {
        return isAppMsg();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isAppMsg() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isApp();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5619f();
        }
        Integer numM6742f0 = AbstractC3156t.m6742f0(getMsgType());
        int iIntValue = numM6742f0 != null ? numM6742f0.intValue() : 0;
        if (iIntValue > 0) {
            int i9 = iIntValue & 255;
            int i10 = 65535 & iIntValue;
            if ((iIntValue >>> 16) != 0) {
                if (i10 == 10000 || i10 == 10002) {
                    iIntValue = i10;
                } else if (i9 != 0 && i10 == i9) {
                    iIntValue = i9;
                }
            }
        }
        return iIntValue == 49;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isAtMe() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isAtMe();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5620g();
        }
        String selfWxId = getSelfWxId();
        C2529d c2529d = WeChatMessage.Companion;
        String msgSource = getMsgSource();
        String content = getContent();
        c2529d.getClass();
        return C2529d.m5937c(msgSource, content, selfWxId) == EnumC2528c.f8169h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isChatroom() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isChatroom();
        }
        C2351o c2351o = this.observed;
        if (c2351o == null) {
            return isGroupChat();
        }
        WeChatMessage weChatMessage2 = c2351o.f7723k;
        return weChatMessage2 != null && weChatMessage2.isChatroom();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmoji() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isEmoji();
        }
        C2351o c2351o = this.observed;
        return c2351o != null ? c2351o.m5621h() : AbstractC1416l.m3825a(getMsgType(), "47");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isFile() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isFile();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5622i();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isGroupChat() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isGroupChat();
        }
        C2351o c2351o = this.observed;
        return c2351o != null ? c2351o.m5623j() : AbstractC3156t.m6733W(getTalker(), "@chatroom", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isImChatroom() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isImChatroom();
        }
        C2351o c2351o = this.observed;
        if (c2351o == null) {
            return AbstractC3156t.m6733W(getTalker(), "@im.chatroom", false);
        }
        WeChatMessage weChatMessage2 = c2351o.f7723k;
        return weChatMessage2 != null && weChatMessage2.isImChatroom();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isImage() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isImage();
        }
        C2351o c2351o = this.observed;
        return c2351o != null ? c2351o.m5624k() : AbstractC1416l.m3825a(getMsgType(), "3");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isLink() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isLink();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5625l();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isLocation() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isLocation();
        }
        C2351o c2351o = this.observed;
        return c2351o != null ? c2351o.m5626m() : AbstractC1416l.m3825a(getMsgType(), "48");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isMusic() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isMusic();
        }
        C2351o c2351o = this.observed;
        if (c2351o == null) {
            return false;
        }
        if ("music".equals(c2351o.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage2 = c2351o.f7723k;
        return weChatMessage2 != null && weChatMessage2.isMusic();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isNote() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isNote();
        }
        C2351o c2351o = this.observed;
        if (c2351o == null) {
            return false;
        }
        if ("note".equals(c2351o.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage2 = c2351o.f7723k;
        return weChatMessage2 != null && weChatMessage2.isNote();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isNotifyAll() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isNotifyAll();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5627n();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isOfficialAccount() {
        WeChatMessage weChatMessage;
        WeChatMessage weChatMessage2 = this.stored;
        if (weChatMessage2 != null) {
            return weChatMessage2.isOfficialAccount();
        }
        C2351o c2351o = this.observed;
        return (c2351o == null || (weChatMessage = c2351o.f7723k) == null || !weChatMessage.isOfficialAccount()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isOpenIM() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isOpenIM();
        }
        C2351o c2351o = this.observed;
        if (c2351o == null) {
            return AbstractC3156t.m6733W(getTalker(), "@openim", false);
        }
        WeChatMessage weChatMessage2 = c2351o.f7723k;
        return weChatMessage2 != null && weChatMessage2.isOpenIM();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isPat() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isPat();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5628o();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isPrivateChat() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isPrivateChat();
        }
        C2351o c2351o = this.observed;
        if (c2351o == null) {
            return !isGroupChat();
        }
        WeChatMessage weChatMessage2 = c2351o.f7723k;
        return weChatMessage2 != null && weChatMessage2.isPrivateChat();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isQuote() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isQuote();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5629p();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRecalled() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isRecalled();
        }
        C2351o c2351o = this.observed;
        if (c2351o == null) {
            return false;
        }
        if ("recalled".equals(c2351o.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage2 = c2351o.f7723k;
        return weChatMessage2 != null && weChatMessage2.isRecalled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRedBag() {
        return isRedPacket();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRedPacket() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isRedPacket();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return "red_packet".equals(c2351o.f7714b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSelf() {
        return isSend();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSend() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isSend();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5630q();
        }
        C1087g c1087g = this.event;
        if (c1087g == null) {
            return false;
        }
        if (c1087g.f3496k) {
            return true;
        }
        String selfWxId = getSelfWxId();
        return !AbstractC3149m.m6721t0(selfWxId) && AbstractC1416l.m3825a(getSender(), selfWxId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isShareCard() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isShareCard();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5631r();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSystem() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isSystem();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5632s();
        }
        Integer numM6742f0 = AbstractC3156t.m6742f0(getMsgType());
        int iIntValue = numM6742f0 != null ? numM6742f0.intValue() : 0;
        if (iIntValue > 0) {
            int i9 = iIntValue & 255;
            int i10 = 65535 & iIntValue;
            if ((iIntValue >>> 16) != 0) {
                if (i10 == 10000 || i10 == 10002) {
                    iIntValue = i10;
                } else if (i9 != 0 && i10 == i9) {
                    iIntValue = i9;
                }
            }
        }
        return iIntValue == 10000 || iIntValue == 10002;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isText() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isText();
        }
        C2351o c2351o = this.observed;
        return c2351o != null ? WeChatSnsPost.TYPE_TEXT.equals(c2351o.f7714b) : AbstractC1416l.m3825a(getMsgType(), "1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isTransfer() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isTransfer();
        }
        C2351o c2351o = this.observed;
        if (c2351o == null) {
            return false;
        }
        if ("transfer".equals(c2351o.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage2 = c2351o.f7723k;
        return weChatMessage2 != null && weChatMessage2.isTransfer();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVideo() {
        WeChatMessage weChatMessage = this.stored;
        boolean z9 = true;
        if (weChatMessage == null) {
            C2351o c2351o = this.observed;
            return c2351o != null ? c2351o.m5633t() : AbstractC1416l.m3825a(getMsgType(), "43") || AbstractC1416l.m3825a(getMsgType(), "62");
        }
        if (!weChatMessage.isVideo() && weChatMessage.type != 62) {
            z9 = false;
        }
        return Boolean.valueOf(z9).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVideoNumberVideo() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isVideoNumberVideo();
        }
        C2351o c2351o = this.observed;
        if (c2351o == null) {
            return false;
        }
        if ("video_number_video".equals(c2351o.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage2 = c2351o.f7723k;
        return weChatMessage2 != null && weChatMessage2.isVideoNumberVideo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVoice() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isVoice();
        }
        C2351o c2351o = this.observed;
        return c2351o != null ? c2351o.m5634u() : AbstractC1416l.m3825a(getMsgType(), "34");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVoip() {
        WeChatMessage weChatMessage = this.stored;
        if (weChatMessage != null) {
            return weChatMessage.isVoip();
        }
        C2351o c2351o = this.observed;
        if (c2351o != null) {
            return c2351o.m5635v();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVoipVideo() {
        WeChatMessage weChatMessage;
        WeChatMessage weChatMessage2 = this.stored;
        if (weChatMessage2 != null) {
            return weChatMessage2.isVoipVideo();
        }
        C2351o c2351o = this.observed;
        return (c2351o == null || (weChatMessage = c2351o.f7723k) == null || !weChatMessage.isVoipVideo()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isVoipVoice() {
        WeChatMessage weChatMessage;
        WeChatMessage weChatMessage2 = this.stored;
        if (weChatMessage2 != null) {
            return weChatMessage2.isVoipVoice();
        }
        C2351o c2351o = this.observed;
        return (c2351o == null || (weChatMessage = c2351o.f7723k) == null || !weChatMessage.isVoipVoice()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String talker = getTalker();
        String sender = getSender();
        String msgType = getMsgType();
        boolean zIsSend = isSend();
        String content = getContent();
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptMessageBean(talker=", talker, ", sender=", sender, ", type=");
        sbM1027p.append(msgType);
        sbM1027p.append(", send=");
        sbM1027p.append(zIsSend);
        sbM1027p.append(", content=");
        return AbstractC0921a.m2255r(sbM1027p, content, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScriptMessageBean(C1087g c1087g) {
        this(c1087g, null, null);
        c1087g.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScriptMessageBean(C2351o c2351o) {
        this(null, c2351o, null);
        c2351o.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScriptMessageBean(WeChatMessage weChatMessage) {
        this(null, null, weChatMessage);
        weChatMessage.getClass();
    }
}
