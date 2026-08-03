package p050c0;

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
public final class C0651e0 {

    /* JADX INFO: renamed from: a */
    public static final C0651e0 f2022a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2023b = null;

    static {
        f2022a = new C0651e0();
        f2023b = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static final String m1632a(String r4) {
        if (AbstractC0425j.m1005J0(r4, "保存", false) == true) goto L10;
        if (AbstractC0425j.m1005J0(r4, "下载", false) == true) goto L10;
        if (AbstractC0425j.m1005J0(r4, "Download", false) == true) goto L10;
        return null;
    L10:
        if (AbstractC0425j.m1005J0(r4, "失败", false) == false) goto L12;
        return null;
    L12:
        if (AbstractC0425j.m1005J0(r4, "fail", true) == false) goto L15;
        return null;
    L15:
        if (AbstractC0425j.m1005J0(r4, "WeiXin", true) == true) goto L23;
        if (AbstractC0425j.m1005J0(r4, "WeChat", true) == true) goto L23;
        if (AbstractC0425j.m1005J0(r4, "MicroMsg", true) == true) goto L23;
        if (AbstractC0425j.m1005J0(r4, "已保存", false) == true) goto L23;
        return null;
    L23:
        return "已保存到: ".concat(m1634c());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1633b() {
        C0661h1 r02 = C0661h1.f2048a;     // Catch: Throwable -> L4
        Object r03 = Boolean.valueOf(C0661h1.m1661c("download_redirect_enabled", false));     // Catch: Throwable -> L4
    L6:
        Object r1 = Boolean.FALSE;
        if ((r03 instanceof C0140f) == false) goto L10;
        r03 = r1;
    L10:
        return ((Boolean) r03).booleanValue();
    L4:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public static String m1634c() {
        CharSequence r02 = "/storage/emulated/0/Android/media/com.tencent.mm/OKK/download";
        C0661h1 r1 = C0661h1.f2048a;     // Catch: Throwable -> L5
        Object r12 = C0661h1.m1662d("download_redirect_dir", "/storage/emulated/0/Android/media/com.tencent.mm/OKK/download");     // Catch: Throwable -> L5
    L8:
        if ((r12 instanceof C0140f) == false) goto L10;
        r12 = "/storage/emulated/0/Android/media/com.tencent.mm/OKK/download";
    L10:
        CharSequence r13 = (CharSequence) r12;
        if (AbstractC0425j.m1013R0(r13) == true) goto L15;
        r02 = r13;
    L15:
        return (String) r02;
    L5:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
        goto L8
    }

    /* JADX INFO: renamed from: d */
    public static void m1635d(String r6) {
        AbstractC0307g.m703e(r6, "dir");
        String r62 = AbstractC0433r.m1032G0(AbstractC0425j.m1022a1(r6).toString(), '\\', '/');
        char[] r2 = {'/'};
        int r1 = r62.length() - 1;
        if (r1 < 0) goto L10;
    L4:
        int r4 = r1 - 1;
        if (AbstractC0179j.m532i0(r2, r62.charAt(r1)) == false) goto L6;
        if (r4 < 0) goto L10;
        r1 = r4;
        goto L4
    L6:
        CharSequence r63 = r62.subSequence(0, r1 + 1);
    L11:
        String r64 = r63.toString();
        if (AbstractC0425j.m1013R0(r64) == false) goto L14;
        r64 = "/storage/emulated/0/Android/media/com.tencent.mm/OKK/download";
    L14:
        C0661h1 r02 = C0661h1.f2048a;
        C0661h1.m1664h("download_redirect_dir", r64);
        return;
    L10:
        r63 = "";
        goto L11
    }

    /* JADX INFO: renamed from: e */
    public static void m1636e(String r2) {
        AbstractC0762d.m1954d("[OKK-DownloadRedirect] " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
