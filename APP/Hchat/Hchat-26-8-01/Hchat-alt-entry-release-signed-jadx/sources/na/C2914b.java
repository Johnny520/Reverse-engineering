package na;

import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p109hb.C1671c;
import p162l3.C2458l;
import p183m8.C2815c;
import p183m8.InterfaceC2814b;
import sa.InterfaceC3950d;

/* JADX INFO: renamed from: na.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2914b implements InterfaceC3950d, InterfaceC2814b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9448g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2917e f9449h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2914b(C2917e c2917e, int i9) {
        this.f9448g = i9;
        this.f9449h = c2917e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // sa.InterfaceC3950d, p183m8.InterfaceC2814b
    /* JADX INFO: renamed from: a */
    public void mo3415a(String str) {
        switch (this.f9448g) {
        }
        this.f9449h.m6327d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m6321b(String str) {
        C2917e c2917e = this.f9449h;
        C2923k c2923k = c2917e.f9462f;
        c2917e.f9464h.m1204m(!TextUtils.isEmpty(str) ? (String) c2923k.f9545h.get(str) : null, str, "手慢了或红包已领完", c2917e.m6330g(str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c2923k.f9543f.remove(str);
        c2923k.f9544g.remove(str);
        c2923k.f9545h.remove(str);
        c2923k.f9546i.remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m6322c(String str, String str2, String str3, String str4, Object obj) {
        boolean z9;
        boolean z10;
        DexFinder dexFinder;
        Constructor<?> constructor;
        C2917e c2917e = this.f9449h;
        C2913a c2913aM6330g = c2917e.m6330g(str3);
        c2917e.f9464h.m1205n(str, str2, str3, c2913aM6330g);
        c2917e.f9474r.m7929a(str, str2, str3, c2913aM6330g);
        c2917e.f9472p.m8331c(str3, str2, str, false);
        C1671c c1671c = c2917e.f9473q;
        c1671c.getClass();
        C2914b c2914b = (C2914b) c1671c.f5523j;
        String strM4266r = C1671c.m4266r(obj, "sendId");
        if (TextUtils.isEmpty(strM4266r)) {
            strM4266r = C1671c.m4266r(obj, "sendid");
        }
        if (TextUtils.isEmpty(strM4266r)) {
            strM4266r = str4;
        }
        String strM4266r2 = C1671c.m4266r(obj, "receiveId");
        if (TextUtils.isEmpty(strM4266r2)) {
            strM4266r2 = C1671c.m4266r(obj, "receiveid");
        }
        if (TextUtils.isEmpty(strM4266r2)) {
            strM4266r2 = C1671c.m4266r(obj, "receive_id");
        }
        String strM4266r3 = C1671c.m4266r(obj, "ver");
        if (TextUtils.isEmpty(strM4266r3)) {
            strM4266r3 = C1671c.m4266r(obj, "hbVer");
        }
        C2815c c2815c = (C2815c) c1671c.f5522i;
        DexFinder dexFinder2 = (DexFinder) c1671c.f5520g;
        C2458l c2458l = (C2458l) c1671c.f5521h;
        try {
            z9 = c2458l.m5853b().getBoolean("hb_wish_enable", false);
        } catch (Throwable unused) {
            z9 = false;
        }
        if (z9 && !TextUtils.isEmpty(strM4266r)) {
            String strM5855d = c2458l.m5855d("hb_wish_text", "谢谢老板");
            try {
                z10 = c2458l.m5853b().getBoolean("hb_wish_random", false);
            } catch (Throwable unused2) {
                z10 = false;
            }
            if (z10) {
                String strM5855d2 = c2458l.m5855d("hb_wish_templates", HttpUrl.FRAGMENT_ENCODE_SET);
                if (!TextUtils.isEmpty(strM5855d2)) {
                    String[] strArrSplit = strM5855d2.split("\\|");
                    if (strArrSplit.length != 0) {
                        dexFinder = dexFinder2;
                        String strTrim = strArrSplit[(int) (Math.random() * ((double) strArrSplit.length))].trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            strM5855d = strTrim;
                        }
                    }
                }
            } else {
                dexFinder = dexFinder2;
            }
            if (TextUtils.isEmpty(strM5855d)) {
                return;
            }
            DexFinder dexFinder3 = dexFinder;
            try {
                if (dexFinder3.wishWxHbClass == null || (constructor = dexFinder3.wishWxHbCtor) == null) {
                    StringBuilder sb2 = new StringBuilder("祝福功能不可用: class=");
                    sb2.append(dexFinder3.wishWxHbClass != null);
                    sb2.append(" ctor=");
                    sb2.append(dexFinder3.wishWxHbCtor != null);
                    sb2.append(" dispatcher=");
                    sb2.append((c2815c.f9082c == null || ((Method) c2815c.f9083d) == null) ? false : true);
                    c2914b.f9449h.m6327d(sb2.toString());
                    return;
                }
                if (TextUtils.isEmpty(strM4266r2)) {
                    strM4266r2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (TextUtils.isEmpty(strM4266r3)) {
                    strM4266r3 = "v1.0";
                }
                if (!c2815c.m6216j(KavaReflector.newInstance(constructor, strM4266r, strM5855d, strM4266r2, strM4266r3))) {
                    c2914b.f9449h.m6327d("自动祝福发送失败");
                    return;
                }
                c2914b.f9449h.m6327d("自动祝福已发送: " + strM5855d);
            } catch (Throwable th2) {
                c2914b.f9449h.m6327d("ERROR sendWish: " + th2.getMessage());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m6323d(String str, String str2, boolean z9) {
        C2917e c2917e = this.f9449h;
        C2923k c2923k = c2917e.f9462f;
        if (TextUtils.isEmpty(str) || c2917e.f9463g.m828y(str)) {
            String str3 = !TextUtils.isEmpty(str) ? (String) c2923k.f9545h.get(str) : null;
            C2913a c2913aM6330g = c2917e.m6330g(str);
            c2917e.f9464h.m1205n(str2, str3, str, c2913aM6330g);
            c2917e.f9474r.m7929a(str2, str3, str, c2913aM6330g);
            c2917e.f9472p.m8331c(str, str3, str2, z9);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c2923k.f9543f.remove(str);
            c2923k.f9544g.remove(str);
            c2923k.f9545h.remove(str);
            c2923k.f9546i.remove(str);
        }
    }
}
