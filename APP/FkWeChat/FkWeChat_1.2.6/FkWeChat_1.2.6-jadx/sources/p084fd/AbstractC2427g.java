package p084fd;

import cd.C1517b;
import java.io.File;
import java.lang.reflect.Method;
import md.AbstractC5161p;
import me.yun.fkwechat.core.config.AppConfig;
import okhttp3.internal.url._UrlKt;
import p315vd.AbstractC8924d;
import p330wd.C9230e;

/* JADX INFO: renamed from: fd.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2427g {

    /* JADX INFO: renamed from: a */
    public static Class f6566a;

    /* JADX INFO: renamed from: b */
    public static Class f6567b;

    /* JADX INFO: renamed from: c */
    public static Class f6568c;

    /* JADX INFO: renamed from: d */
    public static Class f6569d;

    /* JADX INFO: renamed from: e */
    public static Class f6570e;

    /* JADX INFO: renamed from: f */
    public static Method f6571f;

    /* JADX INFO: renamed from: g */
    public static Class f6572g;

    /* JADX INFO: renamed from: h */
    public static Class f6573h;

    /* JADX INFO: renamed from: i */
    public static Class f6574i;

    /* JADX INFO: renamed from: j */
    public static Method f6575j;

    /* JADX INFO: renamed from: k */
    public static Method f6576k;

    /* JADX INFO: renamed from: l */
    public static Class f6577l;

    /* JADX INFO: renamed from: m */
    public static Method f6578m;

    /* JADX INFO: renamed from: n */
    public static Class f6579n;

    /* JADX INFO: renamed from: o */
    public static Method f6580o;

    /* JADX INFO: renamed from: p */
    public static Class f6581p;

    /* JADX INFO: renamed from: q */
    public static Class f6582q;

    /* JADX INFO: renamed from: r */
    public static Method f6583r;

    /* JADX INFO: renamed from: s */
    public static Method f6584s;

    /* JADX INFO: renamed from: t */
    public static Method f6585t;

    /* JADX INFO: renamed from: u */
    public static Class f6586u;

    /* JADX INFO: renamed from: v */
    public static Class f6587v;

    /* JADX INFO: renamed from: w */
    public static Class f6588w;

    /* JADX INFO: renamed from: a */
    public static Object m8763a(Object obj, String str, String str2) {
        Object objNewInstance = AbstractC5161p.newInstance(f6586u, new Object[0]);
        AbstractC5161p.setObjectField(objNewInstance, "mediaObject", obj);
        if (str != null) {
            AbstractC5161p.setObjectField(objNewInstance, "title", str);
        }
        if (str2 != null) {
            AbstractC5161p.setObjectField(objNewInstance, "description", str2);
        }
        return objNewInstance;
    }

    /* JADX INFO: renamed from: b */
    public static void m8764b() {
        try {
            f6566a = C1517b.findClass().usingStrings("MicroMsg.NetSceneSendMsg", "markMsgFailed for id:%d").get();
            f6567b = C1517b.findClass().usingStrings("/cgi-bin/micromsg-bin/sendemoji").get();
            Class<?> cls = C1517b.findClass().usingStrings("msg_raw_img_send", "imgPath").get();
            f6569d = cls;
            if (cls != null) {
                f6572g = C1517b.findMethod().inClass(f6569d).paramCount(5).getParams(4);
            }
            Class<?> cls2 = C1517b.findClass().usingStrings("MicroMsg.ImgUpload.MsgImgFeatureService", "taskListener").get();
            f6570e = cls2;
            if (cls2 != null) {
                f6571f = C1517b.findMethod().inClass(f6570e).modifiers(1).params(f6569d.getName()).usingStrings("params").get();
            }
            f6573h = C1517b.findClass().usingStrings("getVideoThumbFullPath").get();
            Class<?> cls3 = C1517b.findClass().usingStrings("MicroMsg.VoiceLogic", "voicestg success").get();
            f6574i = cls3;
            if (cls3 != null) {
                f6575j = C1517b.findMethod().inClass(f6574i).modifiers(9).usingStrings("voicestg success").get();
                f6576k = C1517b.findMethod().inClass(f6574i).modifiers(9).params("java.lang.String", "int", "int", null).usingNumbers(1000).returnType("boolean").get();
            }
            Class<?> cls4 = C1517b.findClass().usingStrings("getVoiceFullPath").get();
            f6577l = cls4;
            if (cls4 != null) {
                f6578m = C1517b.findMethod().inClass(f6577l).modifiers(1).usingStrings("getVoiceFullPath, businessType:").params(null, "java.lang.String", "boolean").get();
            }
            f6579n = C1517b.findClass().usingStrings("MicroMsg.ServiceManager", "Already initialized.").get();
            f6580o = C1517b.findMethod().inClass(f6579n).modifiers(9).paramCount(1).usingStrings("calling getService(...)").get();
            f6568c = C1517b.findClass().usingStrings("/cgi-bin/micromsg-bin/revokemsg", "MicroMsg.NetSceneRevokeMsg").get();
            f6581p = C1517b.findClass().usingStrings("MicroMsg.AppMessage", "parse amessage xml failed").get();
            f6582q = C1517b.findClass().pkg("com.tencent.mm.plugin.voip.model").usingStrings("/cgi-bin/micromsg-bin/newsendmsg").get();
            f6583r = C1517b.findMethod().inClass(f6581p).modifiers(9).params("java.lang.String").returnType(f6581p.getName()).get();
            Class<?> cls5 = C1517b.findClass().usingStrings("MicroMsg.AppMsgLogic", "summerbig sendAppMsg attachFilePath").get();
            f6584s = C1517b.findMethod().inClass(cls5).modifiers(8).params(null, "java.lang.String", "java.lang.String", "java.lang.String", "java.lang.String", "byte[]").get();
            f6585t = C1517b.findMethod().inClass(cls5).modifiers(9).params("com.tencent.mm.opensdk.modelmsg.WXMediaMessage", "java.lang.String", "java.lang.String", "java.lang.String", "int", "java.lang.String").get();
            f6586u = C1517b.findClass().inClass("com.tencent.mm.opensdk.modelmsg.WXMediaMessage").get();
            f6587v = C1517b.findClass().inClass("com.tencent.mm.opensdk.modelmsg.WXFileObject").get();
            f6588w = C1517b.findClass().inClass("com.tencent.mm.opensdk.modelmsg.WXMusicObject").get();
        } catch (Throwable th) {
            AbstractC8924d.m34264d("MessageBridge", "init error", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8765c(String str, String str2) {
        m8766d(str, str2, null, null, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m8766d(String str, String str2, String str3, String str4, byte[] bArr) {
        try {
            String strM35932d = new C9230e(str2).m35932d("appid");
            f6584s.invoke(null, f6583r.invoke(null, str2), strM35932d, str3 != null ? str3 : _UrlKt.FRAGMENT_ENCODE_SET, str, str4 != null ? str4 : _UrlKt.FRAGMENT_ENCODE_SET, bArr);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("MessageBridge", "sendCard error", th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8767e(String str, String str2) {
        try {
            ClassLoader classLoader = AppConfig.hostClassLoader;
            File file = new File(str2);
            long length = file.length();
            Object objNewInstance = classLoader.loadClass("com.tencent.mm.storage.emotion.EmojiInfo").newInstance();
            AbstractC5161p.setIntField(objNewInstance, "field_catalog", 65);
            AbstractC5161p.setIntField(objNewInstance, "field_type", 1);
            AbstractC5161p.setIntField(objNewInstance, "field_size", (int) length);
            AbstractC5161p.setIntField(objNewInstance, "field_start", 0);
            AbstractC5161p.setIntField(objNewInstance, "field_state", 1);
            AbstractC5161p.setIntField(objNewInstance, "field_needupload", 1);
            AbstractC5161p.setObjectField(objNewInstance, "field_md5", "db94fd7ca6d03eb794e569c3e9b07928");
            AbstractC5161p.setObjectField(objNewInstance, "A2", file.getParent() + "/");
            m8773k(AbstractC5161p.newInstance(f6567b, "0", str, objNewInstance, 0L, 0, 0));
        } catch (Throwable th) {
            AbstractC8924d.m34264d("MessageBridge", "sendEmoji error", th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m8768f(String str, String str2, String str3) {
        try {
            Object objNewInstance = AbstractC5161p.newInstance(f6587v, new Object[0]);
            AbstractC5161p.setObjectField(objNewInstance, "filePath", str2);
            m8771i(str, objNewInstance, str3, null, null, 6, null);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("MessageBridge", "sendFile error", th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m8769g(String str, String str2, boolean z10) {
        try {
            Object objNewInstance = AbstractC5161p.newInstance(f6569d, str2, Integer.valueOf(z10 ? 1 : 0), AbstractC2422b.m8720d(), str, AbstractC5161p.newInstance(f6572g, new Object[0]));
            Object objInvoke = f6580o.invoke(null, f6570e);
            if (objInvoke != null) {
                f6571f.invoke(objInvoke, objNewInstance);
            }
        } catch (Throwable th) {
            AbstractC8924d.m34264d("MessageBridge", "sendImage error", th);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m8770h(String str, Object obj, String str2) {
        m8771i(str, obj, null, null, null, 0, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m8771i(String str, Object obj, String str2, String str3, String str4, int i10, String str5) {
        try {
            Object objM8763a = m8763a(obj, str2, str3);
            Method method = f6585t;
            if (str5 == null) {
                str5 = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            method.invoke(null, objM8763a, str5, _UrlKt.FRAGMENT_ENCODE_SET, str, Integer.valueOf(i10), str4);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("MessageBridge", "sendMedia error", th);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8772j(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            Object objNewInstance = AbstractC5161p.newInstance(f6588w, new Object[0]);
            AbstractC5161p.setObjectField(objNewInstance, "musicUrl", str4);
            AbstractC5161p.setObjectField(objNewInstance, "musicDataUrl", str4);
            AbstractC5161p.setObjectField(objNewInstance, "songAlbumUrl", str5);
            AbstractC5161p.setObjectField(objNewInstance, "songLyric", str6);
            m8771i(str, objNewInstance, str2, str3, null, 3, null);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("MessageBridge", "sendMusic error", th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m8773k(Object obj) {
        AbstractC2429i.m8778c(obj);
    }

    /* JADX INFO: renamed from: l */
    public static void m8774l(String str, String str2) {
        try {
            m8773k(AbstractC5161p.newInstance(f6566a, str, str2, 1, 0, null));
        } catch (Throwable th) {
            AbstractC8924d.m34264d("MessageBridge", "sendText error", th);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m8775m(String str, String str2, int i10) {
        try {
            m8773k(AbstractC5161p.newInstance(f6582q, str, str2, Integer.valueOf(i10), 0));
        } catch (Throwable th) {
            AbstractC8924d.m34264d("MessageBridge", "sendXml error", th);
        }
    }
}
