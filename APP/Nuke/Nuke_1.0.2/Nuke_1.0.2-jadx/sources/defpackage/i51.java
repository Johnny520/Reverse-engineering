package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class i51 implements ga1, lv1, m02, y02, nh2, hi2, kh1 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bz1.<init>(zy1):void, bz1.a():zy1, c42.<clinit>():void, dw.onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState):void, hh1.<init>(int):void, kj1.<clinit>():void, lz1.<init>(c3, java.lang.Object[], java.lang.Object[], int):void, lz1.c():c3, mv1.<clinit>():void, rg3.<clinit>():void, s11.<clinit>():void, t11.s(com.bumptech.glide.a, java.util.ArrayList):v72, tl.<clinit>():void, up0.<clinit>():void, x51.<clinit>():void, x82.<init>(com.bumptech.glide.a, eb, eb, android.content.Context):void, xd1.<init>(int):void, xy1.d():yy1] */
    public /* synthetic */ i51(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Typeface k(String str, im0 im0Var, int i) {
        if (i == 0 && t11.l(im0Var, im0.j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iA = tl.A(im0Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iA) : Typeface.create(str, iA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c42 n(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return c42.j;
        }
        if (str.equals("http/1.1")) {
            return c42.k;
        }
        if (str.equals("h2_prior_knowledge")) {
            return c42.n;
        }
        if (str.equals("h2")) {
            return c42.m;
        }
        if (str.equals("spdy/3.1")) {
            return c42.l;
        }
        if (str.equals("quic")) {
            return c42.o;
        }
        if (wv2.d0(str, "h3", false)) {
            return c42.p;
        }
        c80.v("Unexpected protocol: ".concat(str));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uf2 t(String str) {
        Object next;
        str.getClass();
        yf0 yf0Var = uf2.p;
        yf0Var.getClass();
        t2 t2Var = new t2(0, yf0Var);
        while (true) {
            if (!t2Var.hasNext()) {
                next = null;
                break;
            }
            next = t2Var.next();
            if (((uf2) next).h.equals(str)) {
                break;
            }
        }
        uf2 uf2Var = (uf2) next;
        if (uf2Var != null) {
            return uf2Var;
        }
        s.j(vi0.j("Unsupported config type '", str, "'."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hg2 y(String str, Object obj) {
        fg2 fg2Var;
        String strG0;
        JsObject jsObjectE0 = sp0.e0(str, obj);
        String strG02 = sp0.g0(str.concat(".area"), jsObjectE0.get((Object) "area"));
        switch (strG02.hashCode()) {
            case -1820761141:
                if (strG02.equals("external")) {
                    fg2Var = fg2.k;
                    strG0 = sp0.g0(str.concat(".path"), jsObjectE0.get((Object) "path"));
                    if (strG0.length() <= 512) {
                        c80.p("INVALID_ARGUMENT", "File path is too long.", 0, null, null, 28);
                    } else if (pv2.i0(strG0, '\\') || pv2.i0(strG0, (char) 0) || pv2.i0(strG0, ':')) {
                        c80.p("INVALID_ARGUMENT", "File path contains unsupported characters.", 0, null, null, 28);
                    } else if (pv2.E0(strG0, '/')) {
                        c80.p("INVALID_ARGUMENT", "File path must be relative.", 0, null, null, 28);
                    } else if (strG0.length() != 0) {
                        List<String> listC0 = pv2.C0(strG0, new char[]{'/'});
                        if (!listC0.isEmpty()) {
                            for (String str2 : listC0) {
                                if (str2.length() == 0 || str2.equals(".") || str2.equals("..")) {
                                    c80.p("INVALID_ARGUMENT", "File path is not normalized.", 0, null, null, 28);
                                    break;
                                }
                            }
                        }
                        if (!listC0.isEmpty()) {
                            Iterator it = listC0.iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).length() > 255) {
                                    c80.p("INVALID_ARGUMENT", "File path segment is too long.", 0, null, null, 28);
                                    break;
                                }
                            }
                        }
                        strG0 = du.u0(listC0, "/", null, null, null, 62);
                    }
                }
                c80.p("INVALID_ARGUMENT", str.concat(".area must be package, data, cache, or external."), 0, null, null, 28);
                break;
            case -807062458:
                if (strG02.equals("package")) {
                    fg2Var = fg2.h;
                    strG0 = sp0.g0(str.concat(".path"), jsObjectE0.get((Object) "path"));
                    if (strG0.length() <= 512) {
                    }
                }
                c80.p("INVALID_ARGUMENT", str.concat(".area must be package, data, cache, or external."), 0, null, null, 28);
                break;
            case 3076010:
                if (strG02.equals("data")) {
                    fg2Var = fg2.i;
                    strG0 = sp0.g0(str.concat(".path"), jsObjectE0.get((Object) "path"));
                    if (strG0.length() <= 512) {
                    }
                }
                c80.p("INVALID_ARGUMENT", str.concat(".area must be package, data, cache, or external."), 0, null, null, 28);
                break;
            case 94416770:
                if (strG02.equals("cache")) {
                    fg2Var = fg2.j;
                    strG0 = sp0.g0(str.concat(".path"), jsObjectE0.get((Object) "path"));
                    if (strG0.length() <= 512) {
                    }
                }
                c80.p("INVALID_ARGUMENT", str.concat(".area must be package, data, cache, or external."), 0, null, null, 28);
                break;
            default:
                c80.p("INVALID_ARGUMENT", str.concat(".area must be package, data, cache, or external."), 0, null, null, 28);
                break;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nh2
    public Object b(lh2 lh2Var) {
        throw new eh2(8, "HOST_ACCESS_UNAVAILABLE", "Host runtime access is unavailable in the current environment.", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y02
    public Typeface c(im0 im0Var, int i) {
        return k(null, im0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nh2
    public Object d(lh2 lh2Var) {
        throw new eh2(8, "HOST_ACCESS_UNAVAILABLE", "Host runtime access is unavailable in the current environment.", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nh2
    public Class e(lh2 lh2Var, String str) {
        str.getClass();
        throw new eh2(8, "HOST_ACCESS_UNAVAILABLE", "Host runtime access is unavailable in the current environment.", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @Override // defpackage.y02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface h(so0 so0Var, im0 im0Var, int i) {
        String str;
        so0Var.getClass();
        int i2 = im0Var.h / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 <= i2 && i2 < 4) {
            str = "sans-serif-light";
        } else if (i2 != 4) {
            str = i2 == 5 ? "sans-serif-medium" : ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) ? "sans-serif-black" : "sans-serif";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface typefaceK = k(str, im0Var, i);
            if (!t11.l(typefaceK, Typeface.create(Typeface.DEFAULT, tl.A(im0Var, i))) && !t11.l(typefaceK, k(null, im0Var, i))) {
                typeface = typefaceK;
            }
        }
        return typeface == null ? k("sans-serif", im0Var, i) : typeface;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hi2
    public Object i() {
        throw new fi2("MESSAGING_UNAVAILABLE", "Host messaging is unavailable in the current environment.", 8, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hi2
    public Object j(zj2 zj2Var) {
        throw new fi2("MESSAGING_UNAVAILABLE", "Host messaging is unavailable in the current environment.", 8, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String l(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        int i = 0;
        switch (this.h) {
            case 28:
                return new kv2(kj1Var.g(Uri.class, AssetFileDescriptor.class), i);
            default:
                return new kv2(kj1Var.g(Uri.class, InputStream.class), i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object r(Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean s(Method method) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case AIChatConfig.MaxContextRounds /* 20 */:
                int iHashCode = hashCode();
                xe1.j(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return vi0.k("CreationExtras.Key@", string, "<", d72.a(tc2.class).c(), ">");
            case 21:
                int iHashCode2 = hashCode();
                xe1.j(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return vi0.k("CreationExtras.Key@", string2, "<", d72.a(Bundle.class).c(), ">");
            case 27:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(u22 u22Var, eg2 eg2Var, df2 df2Var, c20 c20Var, u00 u00Var) {
        z42 z42Var;
        if (u00Var instanceof z42) {
            z42Var = (z42) u00Var;
            int i = z42Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                z42Var.n = i - Integer.MIN_VALUE;
            } else {
                z42Var = new z42(this, u00Var);
            }
        }
        Object obj = z42Var.l;
        int i2 = z42Var.n;
        if (i2 != 0) {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f52 f52Var = z42Var.k;
            fg1.T(obj);
            return f52Var;
        }
        fg1.T(obj);
        f52 f52Var2 = new f52(u22Var, eg2Var, df2Var, c20Var);
        z42Var.k = f52Var2;
        z42Var.n = 1;
        Object objB = f52.b(f52Var2, z42Var);
        k20 k20Var = k20.h;
        return objB == k20Var ? k20Var : f52Var2;
    }

    @Override // defpackage.ga1
    public void x() {
    }

    @Override // defpackage.lv1
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
