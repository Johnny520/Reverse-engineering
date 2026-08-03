package ua;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p063e9.C0830a;
import p077f8.C1085e;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p153k8.C2351o;
import p196n8.C2909a;
import p196n8.C2911c;
import p218og.AbstractC3149m;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;
import p261rb.RunnableC3791g;
import p274s8.C3944d;
import sh.C4056v1;

/* JADX INFO: renamed from: ua.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4291b extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public final Handler f14234e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f14235f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public volatile boolean f14236g;

    /* JADX INFO: renamed from: h */
    public volatile C4300k f14237h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m8617l(String str, String str2) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return false;
        }
        List listM6692G0 = AbstractC3149m.m6692G0(str2, new String[]{"|", ",", "，", "\n", "\r"});
        if (listM6692G0.isEmpty()) {
            return false;
        }
        Iterator it = listM6692G0.iterator();
        while (it.hasNext()) {
            if (AbstractC1416l.m3825a(AbstractC3149m.m6703R0((String) it.next()).toString(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m8618n(C4293d c4293d) {
        return c4293d.f14269a + ':' + c4293d.f14270b + ':' + c4293d.f14271c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "auto_transfer";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C3944d("auto_transfer", "自动收款", "自动领取微信转账", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        Handler handler = C3740e.f12138a;
        C3740e.m7759f(8, new C4056v1(c3742g, 1, this), "auto_transfer", "自动收款", EnumC3738c.WARMUP);
        m7752i(C1085e.class, new C0830a(this, 9, c3742g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m8619k(C4292c c4292c, C2351o c2351o, C4293d c4293d, C4295f c4295f) {
        C4300k c4300k;
        C4293d c4293d2;
        C2351o c2351o2;
        long j3;
        boolean zM8620m = m8620m(c4293d, "confirm", c4295f);
        if (!zM8620m) {
            m7750e("自动收款失败", null);
        }
        if (zM8620m && (c4300k = this.f14237h) != null) {
            String strM8618n = m8618n(c4293d);
            if (AbstractC3149m.m6721t0(strM8618n) || c4300k.f14340e.add(strM8618n)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strM8634a = c4300k.m8634a(c4292c.f14239B, c2351o, c4293d, jCurrentTimeMillis);
                String strM8634a2 = c4300k.m8634a(c4292c.f14240C, c2351o, c4293d, jCurrentTimeMillis);
                C4300k c4300k2 = c4300k;
                boolean z9 = c4292c.f14264v;
                if (z9 || c4292c.f14265w) {
                    c4300k2.f14339d.m8172b("自动收款", strM8634a, strM8634a2, c2351o.f7715c, strM8618n, 300000, z9, c4292c.f14265w, c4292c.f14266x, c4292c.f14268z, c4292c.f14238A);
                }
                if (c4292c.f14241D) {
                    c4293d2 = c4293d;
                    c2351o2 = c2351o;
                    j3 = jCurrentTimeMillis;
                    String strM8634a3 = c4300k2.m8634a(c4292c.f14242E, c2351o2, c4293d2, j3);
                    if (!AbstractC3149m.m6721t0(strM8634a3)) {
                        c4300k2.f14338c.post(new RunnableC3791g(c4300k2, 4, strM8634a3));
                    }
                    c4300k2 = c4300k2;
                } else {
                    c4293d2 = c4293d;
                    c2351o2 = c2351o;
                    j3 = jCurrentTimeMillis;
                }
                String str = c2351o2.f7715c;
                str.getClass();
                String str2 = c4293d2.f14271c;
                if (AbstractC3149m.m6721t0(str2)) {
                    str2 = c2351o2.f7716d;
                }
                str2.getClass();
                c4300k2.m8635b(str, str2, c2351o2, c4293d2, c4292c.f14263u, j3, 0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final boolean m8620m(C4293d c4293d, String str, C4295f c4295f) {
        String str2 = c4293d.f14270b;
        String str3 = c4293d.f14269a;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            m7750e("转账单号缺失，跳过", null);
            return false;
        }
        WeChatApis.payment().getClass();
        C2911c c2911c = WeChatApis.transferApi;
        if (c2911c == null || !c2911c.m6316c()) {
            m7750e("转账 API 未就绪: api=" + (c2911c != null) + " canOperate=" + (c2911c != null ? Boolean.valueOf(c2911c.m6316c()) : null), null);
            return false;
        }
        int i9 = c4293d.f14274f;
        int i10 = 0;
        String str4 = c4293d.f14271c;
        String str5 = null;
        int i11 = c4293d.f14273e;
        if (c4295f != null) {
            i10 = c4295f.f14282c;
        }
        if (c4295f != null) {
            str5 = c4295f.f14284e;
        }
        if (str5 == null) {
            str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C2909a c2909a = new C2909a(str3, str2, i9, str4, i11, i10, str5, c4295f != null ? c4295f.f14283d : 0L, c4293d.f14277i);
        return str.equals("refuse") ? c2911c.m6318f("refuse", c2909a) : c2911c.m6318f("confirm", c2909a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "自动收款";
    }
}
