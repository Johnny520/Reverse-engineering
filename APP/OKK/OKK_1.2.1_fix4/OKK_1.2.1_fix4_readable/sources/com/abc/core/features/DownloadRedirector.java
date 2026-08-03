package com.abc.core.features;

import de.robv.android.xposed.AbstractC0762d;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class DownloadRedirector {

    /* JADX INFO: renamed from: a */
    public static final DownloadRedirector f2022a = new DownloadRedirector();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2023b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final String m1632a(String str) {
        if ((!AbstractC0425j.m1005J0(str, "保存", false) && !AbstractC0425j.m1005J0(str, "下载", false) && !AbstractC0425j.m1005J0(str, "Download", false)) || AbstractC0425j.m1005J0(str, "失败", false) || AbstractC0425j.m1005J0(str, "fail", true)) {
            return null;
        }
        if (AbstractC0425j.m1005J0(str, "WeiXin", true) || AbstractC0425j.m1005J0(str, "WeChat", true) || AbstractC0425j.m1005J0(str, "MicroMsg", true) || AbstractC0425j.m1005J0(str, "已保存", false)) {
            return "已保存到: ".concat(m1634c());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1633b() {
        Object objM116u;
        try {
            ConfigStore configStore = ConfigStore.f2048a;
            objM116u = Boolean.valueOf(ConfigStore.m1661c("download_redirect_enabled", false));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static String m1634c() {
        Object objM116u;
        try {
            ConfigStore configStore = ConfigStore.f2048a;
            objM116u = ConfigStore.m1662d("download_redirect_dir", "/storage/emulated/0/Android/media/com.tencent.mm/OKK/download");
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = "/storage/emulated/0/Android/media/com.tencent.mm/OKK/download";
        }
        CharSequence charSequence = (CharSequence) objM116u;
        return (String) (AbstractC0425j.m1013R0(charSequence) ? "/storage/emulated/0/Android/media/com.tencent.mm/OKK/download" : charSequence);
    }

    /* JADX INFO: renamed from: d */
    public static void m1635d(String str) {
        CharSequence charSequenceSubSequence;
        AbstractC0307g.m703e(str, "dir");
        String strM1032G0 = AbstractC0433r.m1032G0(AbstractC0425j.m1022a1(str).toString(), '\\', '/');
        char[] cArr = {'/'};
        int length = strM1032G0.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!AbstractC0179j.m532i0(cArr, strM1032G0.charAt(length))) {
                    charSequenceSubSequence = strM1032G0.subSequence(0, length + 1);
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        String string = charSequenceSubSequence.toString();
        if (AbstractC0425j.m1013R0(string)) {
            string = "/storage/emulated/0/Android/media/com.tencent.mm/OKK/download";
        }
        ConfigStore configStore = ConfigStore.f2048a;
        ConfigStore.m1664h("download_redirect_dir", string);
    }

    /* JADX INFO: renamed from: e */
    public static void m1636e(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-DownloadRedirect] " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }
}
