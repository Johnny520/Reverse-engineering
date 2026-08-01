package p201nd;

import gd.C2764e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import md.AbstractC5161p;
import me.yun.fkwechat.core.config.AppConfig;
import okhttp3.internal.url._UrlKt;
import p053dd.C1951c;
import p084fd.AbstractC2426f;
import p216od.C5732a;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: nd.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5582j {
    private final C5732a pluginCompiler;

    /* JADX INFO: renamed from: nd.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m22663a(long j10, long j11);

        /* JADX INFO: renamed from: b */
        void m22664b(int i10, String str);
    }

    public C5582j(C5732a c5732a) {
        this.pluginCompiler = c5732a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m22662a(a aVar, String str, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if ("onC2CDownloadCompleted".equals(name)) {
            int intField = AbstractC5161p.getIntField(objArr[1], "errorCode");
            if (aVar == null) {
                return null;
            }
            aVar.m22664b(intField, str);
            return null;
        }
        if (!"onDownloadProgressChanged".equals(name)) {
            return null;
        }
        long jLongValue = ((Long) objArr[1]).longValue();
        long jLongValue2 = ((Long) objArr[2]).longValue();
        if (aVar == null) {
            return null;
        }
        aVar.m22663a(jLongValue, jLongValue2);
        return null;
    }

    private String generateFileKey(String str) {
        return "fk_dl_" + Math.abs(str.hashCode()) + "_" + System.currentTimeMillis();
    }

    public void downCdn(String str, String str2, String str3, int i10, final String str4, final a aVar) {
        if (C2764e.f7217h == null) {
            AbstractC8924d.m34263c("CdnApi", "The CdnManager instance has not yet been initialized");
            if (aVar != null) {
                aVar.m22664b(-1, str4);
                return;
            }
            return;
        }
        try {
            ClassLoader classLoader = AppConfig.hostClassLoader;
            Object objNewInstance = classLoader.loadClass("com.tencent.mars.cdn.CdnManager$C2CDownloadRequest").newInstance();
            AbstractC5161p.callMethod(objNewInstance, "setFileKey", str);
            AbstractC5161p.callMethod(objNewInstance, "setFileid", str2);
            AbstractC5161p.callMethod(objNewInstance, "setAeskey", str3);
            AbstractC5161p.callMethod(objNewInstance, "setFileType", Integer.valueOf(i10));
            AbstractC5161p.callMethod(objNewInstance, "setSavePath2", str4);
            AbstractC5161p.callMethod(objNewInstance, "setBizid", 1);
            AbstractC5161p.callMethod(objNewInstance, "setApptype", 1);
            AbstractC5161p.callMethod(objNewInstance, "build", new Object[0]);
            Class<?> clsLoadClass = classLoader.loadClass("com.tencent.mars.cdn.CdnManager$DownloadCallback");
            AbstractC5161p.callMethod(C2764e.f7217h, "startC2CDownload", objNewInstance, Proxy.newProxyInstance(clsLoadClass.getClassLoader(), new Class[]{clsLoadClass}, new InvocationHandler(aVar, str4) { // from class: nd.i

                /* JADX INFO: renamed from: q */
                public final /* synthetic */ String f17467q;

                {
                    this.f17467q = str4;
                }

                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    return C5582j.m22662a(null, this.f17467q, obj, method, objArr);
                }
            }));
        } catch (Throwable th) {
            AbstractC8924d.m34264d("CdnApi", "Trigger underlying download exception", th);
            if (aVar != null) {
                aVar.m22664b(-2, str4);
            }
        }
    }

    public void downFile(String str, String str2, String str3, a aVar) {
        downCdn(generateFileKey(str), str, str2, 5, str3, aVar);
    }

    public void downImage(String str, String str2, String str3, a aVar) {
        downCdn(generateFileKey(str), str, str2, 2, str3, aVar);
    }

    public void downMsgMedia(C1951c c1951c, a aVar) {
        if (c1951c == null) {
            AbstractC8924d.m34263c("CdnApi", "MsgInfo Message carrier is empty");
            if (aVar != null) {
                aVar.m22664b(-3, _UrlKt.FRAGMENT_ENCODE_SET);
                return;
            }
            return;
        }
        String aesKey = c1951c.getAesKey();
        String fileId = c1951c.getFileId();
        if (fileId.isEmpty()) {
            AbstractC8924d.m34263c("CdnApi", "Unable to resolve the CDN resource ID (fileId) for this message. Message Type." + c1951c.type);
            if (aVar != null) {
                aVar.m22664b(-4, _UrlKt.FRAGMENT_ENCODE_SET);
                return;
            }
            return;
        }
        int i10 = c1951c.isImage() ? 2 : c1951c.isVideo() ? 4 : c1951c.isVoice() ? 15 : 5;
        String strM8756f = AbstractC2426f.m8756f(c1951c);
        if (strM8756f == null || strM8756f.isEmpty()) {
            strM8756f = AppConfig.hostContext.getExternalMediaDirs()[0].getAbsolutePath() + "/FkWeChat/Download/" + c1951c.msgId + (c1951c.isImage() ? ".jpg" : c1951c.isVideo() ? ".mp4" : c1951c.isVoice() ? ".amr" : ".tmp");
        }
        downCdn(generateFileKey(fileId), fileId, aesKey, i10, strM8756f, aVar);
    }

    public void downVideo(String str, String str2, String str3, a aVar) {
        downCdn(generateFileKey(str), str, str2, 4, str3, aVar);
    }

    public void downVoice(String str, String str2, String str3, a aVar) {
        downCdn(generateFileKey(str), str, str2, 15, str3, aVar);
    }

    public void downFile(String str, String str2, String str3) {
        downFile(str, str2, str3, null);
    }

    public void downImage(String str, String str2, String str3) {
        downImage(str, str2, str3, null);
    }

    public void downVideo(String str, String str2, String str3) {
        downVideo(str, str2, str3, null);
    }

    public void downVoice(String str, String str2, String str3) {
        downVoice(str, str2, str3, null);
    }

    public void downMsgMedia(C1951c c1951c) {
        downMsgMedia(c1951c, null);
    }
}
