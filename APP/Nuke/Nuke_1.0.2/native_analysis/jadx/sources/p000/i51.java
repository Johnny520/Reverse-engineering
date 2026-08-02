package p000;

import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import com.dokar.quickjs.binding.JsObject;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class i51 implements ga1, lv1, m02, y02, nh2, hi2, kh1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4281h;

    public /* synthetic */ i51(int i) {
        this.f4281h = i;
    }

    /* JADX INFO: renamed from: k */
    public static Typeface m2271k(String str, im0 im0Var, int i) {
        if (i == 0 && t11.m5086l(im0Var, im0.f4680j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM5274A = AbstractC0738tl.m5274A(im0Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM5274A) : Typeface.create(str, iM5274A);
    }

    /* JADX INFO: renamed from: n */
    public static c42 m2272n(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return c42.f1137j;
        }
        if (str.equals("http/1.1")) {
            return c42.f1138k;
        }
        if (str.equals("h2_prior_knowledge")) {
            return c42.f1141n;
        }
        if (str.equals("h2")) {
            return c42.f1140m;
        }
        if (str.equals("spdy/3.1")) {
            return c42.f1139l;
        }
        if (str.equals("quic")) {
            return c42.f1142o;
        }
        if (wv2.m6012d0(str, "h3", false)) {
            return c42.f1143p;
        }
        c80.m678v("Unexpected protocol: ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static uf2 m2273t(String str) {
        Object next;
        str.getClass();
        yf0 yf0Var = uf2.f11276p;
        yf0Var.getClass();
        C0717t2 c0717t2 = new C0717t2(0, yf0Var);
        while (true) {
            if (!c0717t2.hasNext()) {
                next = null;
                break;
            }
            next = c0717t2.next();
            if (((uf2) next).f11277h.equals(str)) {
                break;
            }
        }
        uf2 uf2Var = (uf2) next;
        if (uf2Var != null) {
            return uf2Var;
        }
        C0676s.m4651j(vi0.m5691j("Unsupported config type '", str, "'."));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hg2 m2274y(String str, Object obj) {
        fg2 fg2Var;
        String strM4941g0;
        JsObject jsObjectM4937e0 = sp0.m4937e0(str, obj);
        String strM4941g02 = sp0.m4941g0(str.concat(".area"), jsObjectM4937e0.get((Object) "area"));
        switch (strM4941g02.hashCode()) {
            case -1820761141:
                if (strM4941g02.equals("external")) {
                    fg2Var = fg2.f2988k;
                    strM4941g0 = sp0.m4941g0(str.concat(".path"), jsObjectM4937e0.get((Object) "path"));
                    if (strM4941g0.length() <= 512) {
                        c80.m672p("INVALID_ARGUMENT", "File path is too long.", 0, null, null, 28);
                    } else if (pv2.m3996i0(strM4941g0, '\\') || pv2.m3996i0(strM4941g0, (char) 0) || pv2.m3996i0(strM4941g0, ':')) {
                        c80.m672p("INVALID_ARGUMENT", "File path contains unsupported characters.", 0, null, null, 28);
                    } else if (pv2.m3989E0(strM4941g0, '/')) {
                        c80.m672p("INVALID_ARGUMENT", "File path must be relative.", 0, null, null, 28);
                    } else if (strM4941g0.length() != 0) {
                        List<String> listM3987C0 = pv2.m3987C0(strM4941g0, new char[]{'/'});
                        if (!listM3987C0.isEmpty()) {
                            for (String str2 : listM3987C0) {
                                if (str2.length() == 0 || str2.equals(".") || str2.equals("..")) {
                                    c80.m672p("INVALID_ARGUMENT", "File path is not normalized.", 0, null, null, 28);
                                    break;
                                }
                            }
                        }
                        if (!listM3987C0.isEmpty()) {
                            Iterator it = listM3987C0.iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).length() > 255) {
                                    c80.m672p("INVALID_ARGUMENT", "File path segment is too long.", 0, null, null, 28);
                                    break;
                                }
                            }
                        }
                        strM4941g0 = AbstractC0142du.m1165u0(listM3987C0, "/", null, null, null, 62);
                    }
                }
                c80.m672p("INVALID_ARGUMENT", str.concat(".area must be package, data, cache, or external."), 0, null, null, 28);
                break;
            case -807062458:
                if (strM4941g02.equals("package")) {
                    fg2Var = fg2.f2985h;
                    strM4941g0 = sp0.m4941g0(str.concat(".path"), jsObjectM4937e0.get((Object) "path"));
                    if (strM4941g0.length() <= 512) {
                    }
                }
                c80.m672p("INVALID_ARGUMENT", str.concat(".area must be package, data, cache, or external."), 0, null, null, 28);
                break;
            case 3076010:
                if (strM4941g02.equals("data")) {
                    fg2Var = fg2.f2986i;
                    strM4941g0 = sp0.m4941g0(str.concat(".path"), jsObjectM4937e0.get((Object) "path"));
                    if (strM4941g0.length() <= 512) {
                    }
                }
                c80.m672p("INVALID_ARGUMENT", str.concat(".area must be package, data, cache, or external."), 0, null, null, 28);
                break;
            case 94416770:
                if (strM4941g02.equals("cache")) {
                    fg2Var = fg2.f2987j;
                    strM4941g0 = sp0.m4941g0(str.concat(".path"), jsObjectM4937e0.get((Object) "path"));
                    if (strM4941g0.length() <= 512) {
                    }
                }
                c80.m672p("INVALID_ARGUMENT", str.concat(".area must be package, data, cache, or external."), 0, null, null, 28);
                break;
            default:
                c80.m672p("INVALID_ARGUMENT", str.concat(".area must be package, data, cache, or external."), 0, null, null, 28);
                break;
        }
        return null;
    }

    @Override // p000.nh2
    /* JADX INFO: renamed from: b */
    public Object mo416b(lh2 lh2Var) {
        throw new eh2(8, "HOST_ACCESS_UNAVAILABLE", "Host runtime access is unavailable in the current environment.", null);
    }

    @Override // p000.y02
    /* JADX INFO: renamed from: c */
    public Typeface mo2276c(im0 im0Var, int i) {
        return m2271k(null, im0Var, i);
    }

    @Override // p000.nh2
    /* JADX INFO: renamed from: d */
    public Object mo417d(lh2 lh2Var) {
        throw new eh2(8, "HOST_ACCESS_UNAVAILABLE", "Host runtime access is unavailable in the current environment.", null);
    }

    @Override // p000.nh2
    /* JADX INFO: renamed from: e */
    public Class mo418e(lh2 lh2Var, String str) {
        str.getClass();
        throw new eh2(8, "HOST_ACCESS_UNAVAILABLE", "Host runtime access is unavailable in the current environment.", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @Override // p000.y02
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface mo2277h(so0 so0Var, im0 im0Var, int i) {
        String str;
        so0Var.getClass();
        int i2 = im0Var.f4684h / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 <= i2 && i2 < 4) {
            str = "sans-serif-light";
        } else if (i2 != 4) {
            str = i2 == 5 ? "sans-serif-medium" : ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) ? "sans-serif-black" : "sans-serif";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface typefaceM2271k = m2271k(str, im0Var, i);
            if (!t11.m5086l(typefaceM2271k, Typeface.create(Typeface.DEFAULT, AbstractC0738tl.m5274A(im0Var, i))) && !t11.m5086l(typefaceM2271k, m2271k(null, im0Var, i))) {
                typeface = typefaceM2271k;
            }
        }
        return typeface == null ? m2271k("sans-serif", im0Var, i) : typeface;
    }

    @Override // p000.hi2
    /* JADX INFO: renamed from: i */
    public Object mo2195i() {
        throw new fi2("MESSAGING_UNAVAILABLE", "Host messaging is unavailable in the current environment.", 8, true);
    }

    @Override // p000.hi2
    /* JADX INFO: renamed from: j */
    public Object mo2196j(zj2 zj2Var) {
        throw new fi2("MESSAGING_UNAVAILABLE", "Host messaging is unavailable in the current environment.", 8, true);
    }

    /* JADX INFO: renamed from: l */
    public String mo659l(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        int i = 0;
        switch (this.f4281h) {
            case 28:
                return new kv2(kj1Var.m2708g(Uri.class, AssetFileDescriptor.class), i);
            default:
                return new kv2(kj1Var.m2708g(Uri.class, InputStream.class), i);
        }
    }

    /* JADX INFO: renamed from: r */
    public Object mo660r(Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: s */
    public boolean mo661s(Method method) {
        return false;
    }

    public String toString() {
        switch (this.f4281h) {
            case AIChatConfig.MaxContextRounds /* 20 */:
                int iHashCode = hashCode();
                xe1.m6127j(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return vi0.m5692k("CreationExtras.Key@", string, "<", d72.m967a(tc2.class).m591c(), ">");
            case 21:
                int iHashCode2 = hashCode();
                xe1.m6127j(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return vi0.m5692k("CreationExtras.Key@", string2, "<", d72.m967a(Bundle.class).m591c(), ">");
            case 27:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2278z(u22 u22Var, eg2 eg2Var, df2 df2Var, c20 c20Var, u00 u00Var) {
        z42 z42Var;
        if (u00Var instanceof z42) {
            z42Var = (z42) u00Var;
            int i = z42Var.f13723n;
            if ((i & Integer.MIN_VALUE) != 0) {
                z42Var.f13723n = i - Integer.MIN_VALUE;
            } else {
                z42Var = new z42(this, u00Var);
            }
        }
        Object obj = z42Var.f13721l;
        int i2 = z42Var.f13723n;
        if (i2 != 0) {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f52 f52Var = z42Var.f13720k;
            fg1.m1627T(obj);
            return f52Var;
        }
        fg1.m1627T(obj);
        f52 f52Var2 = new f52(u22Var, eg2Var, df2Var, c20Var);
        z42Var.f13720k = f52Var2;
        z42Var.f13723n = 1;
        Object objM1505b = f52.m1505b(f52Var2, z42Var);
        k20 k20Var = k20.f5323h;
        return objM1505b == k20Var ? k20Var : f52Var2;
    }

    @Override // p000.ga1
    /* JADX INFO: renamed from: x */
    public void mo881x() {
    }

    @Override // p000.lv1
    /* JADX INFO: renamed from: a */
    public void mo2275a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
