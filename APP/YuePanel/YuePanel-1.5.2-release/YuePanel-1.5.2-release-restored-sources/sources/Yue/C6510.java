package Yue;

import com.nmmedit.protect.NativeUtil;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: Yue.ۥۡۢۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6510 implements HostnameVerifier {
    static {
        NativeUtil.classesInit0(150);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final native boolean verify(String str, SSLSession sSLSession);
}
