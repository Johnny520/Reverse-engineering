package p000;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class j51 implements sh0, xn1, us1, y02, gh2, tf2, bl2, kh1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4896h;

    public /* synthetic */ j51(int i) {
        this.f4896h = i;
    }

    /* JADX INFO: renamed from: s */
    public static final String m2437s(C0505no c0505no, C0505no[] c0505noArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C0505no c0505no2 = k42.f5334b;
        int iMo3322a = c0505no.mo3322a();
        int i5 = 0;
        while (i5 < iMo3322a) {
            int i6 = (i5 + iMo3322a) / 2;
            while (i6 > -1 && c0505no.mo3325d(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (c0505no.mo3325d(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bMo3325d = c0505noArr[i10].mo3325d(i11);
                    byte[] bArr = ug3.f11300a;
                    int i13 = bMo3325d & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bMo3325d2 = c0505no.mo3325d(i7 + i12);
                byte[] bArr2 = ug3.f11300a;
                i4 = i3 - (bMo3325d2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (c0505noArr[i10].mo3322a() != i11) {
                    z2 = z;
                } else {
                    if (i10 == c0505noArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iMo3322a2 = c0505noArr[i10].mo3322a() - i11;
                    int length = c0505noArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iMo3322a2 += c0505noArr[i15].mo3322a();
                    }
                    if (iMo3322a2 >= i14) {
                        if (iMo3322a2 <= i14) {
                            return c0505no.mo3329h(i7, i9 + i7).mo3328g(AbstractC0856wq.f12612a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iMo3322a = i6;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final void m2438t(i51 i51Var) {
        ju2 ju2Var;
        jz1 jz1Var;
        jz1 jz1Var2;
        ju2 ju2Var2 = i62.f4290z;
        do {
            ju2Var = i62.f4290z;
            jz1Var = (jz1) ju2Var.getValue();
            zy1 zy1VarM6516c = jz1Var.f5288j;
            nb1 nb1Var = (nb1) zy1VarM6516c.get(i51Var);
            if (nb1Var == null) {
                jz1Var2 = jz1Var;
            } else {
                Object obj = nb1Var.f7103a;
                Object obj2 = nb1Var.f7104b;
                h43 h43Var = zy1VarM6516c.f14150h;
                h43 h43VarM2075v = h43Var.m2075v(i51Var != null ? i51Var.hashCode() : 0, 0, i51Var);
                if (h43Var != h43VarM2075v) {
                    zy1VarM6516c = h43VarM2075v == null ? zy1.f14149j : new zy1(h43VarM2075v, zy1VarM6516c.f14151i - 1);
                }
                gd3 gd3Var = gd3.f3444v;
                if (obj != gd3Var) {
                    Object obj3 = zy1VarM6516c.get(obj);
                    obj3.getClass();
                    zy1VarM6516c = zy1VarM6516c.m6516c(obj, new nb1(((nb1) obj3).f7103a, obj2));
                }
                if (obj2 != gd3Var) {
                    Object obj4 = zy1VarM6516c.get(obj2);
                    obj4.getClass();
                    zy1VarM6516c = zy1VarM6516c.m6516c(obj2, new nb1(obj, ((nb1) obj4).f7104b));
                }
                Object obj5 = obj != gd3Var ? jz1Var.f5286h : obj2;
                if (obj2 != gd3Var) {
                    obj = jz1Var.f5287i;
                }
                jz1Var2 = new jz1(obj5, obj, zy1VarM6516c);
            }
            if (jz1Var == jz1Var2) {
                return;
            }
        } while (!ju2Var.m2576h(jz1Var, jz1Var2));
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList m2439u(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c42) obj) != c42.f1137j) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c42) it.next()).f1145h);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: v */
    public static byte[] m2440v(List list) {
        list.getClass();
        C0209fn c0209fn = new C0209fn();
        for (String str : m2439u(list)) {
            c0209fn.m1670E(str.length());
            c0209fn.m1675J(str);
        }
        return c0209fn.m1688q(c0209fn.f3068i);
    }

    /* JADX INFO: renamed from: w */
    public static Typeface m2441w(String str, im0 im0Var, int i) {
        if (i == 0 && t11.m5086l(im0Var, im0.f4680j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), im0Var.f4684h, i == 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2442A(sz0 sz0Var, List list, u00 u00Var) {
        yh2 yh2Var;
        String strM6107Y;
        if (u00Var instanceof yh2) {
            yh2Var = (yh2) u00Var;
            int i = yh2Var.f13464n;
            if ((i & Integer.MIN_VALUE) != 0) {
                yh2Var.f13464n = i - Integer.MIN_VALUE;
            } else {
                yh2Var = new yh2(this, u00Var);
            }
        }
        Object objM2443B = yh2Var.f13462l;
        int i2 = yh2Var.f13464n;
        si2 si2Var = si2.f10154j;
        if (i2 == 0) {
            fg1.m1627T(objM2443B);
            o72 o72Var = oi2.f7689i;
            strM6107Y = xe1.m6107Y("manifest.json");
            if (!list.contains(new oi2(strM6107Y))) {
                throw new dg2(null, si2Var, strM6107Y, "Script manifest does not exist.", null, 16);
            }
            yh2Var.f13461k = strM6107Y;
            yh2Var.f13464n = 1;
            objM2443B = m2443B(sz0Var, strM6107Y, yh2Var);
            Object obj = k20.f5323h;
            if (objM2443B == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = yh2Var.f13461k;
            fg1.m1627T(objM2443B);
            strM6107Y = str;
        }
        String str2 = (String) objM2443B;
        try {
            th2 th2VarM5677d = vh2.m5677d(str2);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            int length = bytes.length;
            if (length <= 2097152) {
                return new uh2(th2VarM5677d, length);
            }
            throw new dg2(null, si2Var, strM6107Y, hk1.m2208g(length, "Manifest size is ", " bytes; maximum is 2097152."), null, 16);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Invalid script manifest.";
            }
            throw new dg2(null, si2Var, strM6107Y, message, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2443B(sz0 sz0Var, String str, u00 u00Var) throws bh2, dg2 {
        zh2 zh2Var;
        if (u00Var instanceof zh2) {
            zh2Var = (zh2) u00Var;
            int i = zh2Var.f13914n;
            if ((i & Integer.MIN_VALUE) != 0) {
                zh2Var.f13914n = i - Integer.MIN_VALUE;
            } else {
                zh2Var = new zh2(this, u00Var);
            }
        }
        Object obj = zh2Var.f13912l;
        int i2 = zh2Var.f13914n;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    String str2 = zh2Var.f13911k;
                    fg1.m1627T(obj);
                    return (String) obj;
                }
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = zh2Var.f13911k;
                fg1.m1627T(obj);
                return (String) obj;
            }
            fg1.m1627T(obj);
            Object obj2 = k20.f5323h;
            if (sz0Var != null) {
                zh2Var.f13911k = str;
                zh2Var.f13914n = 1;
                Object objM5038K = sz0Var.m5038K(str, 2097152, zh2Var);
                if (objM5038K != obj2) {
                    obj = objM5038K;
                    return (String) obj;
                }
            } else {
                zh2Var.f13911k = str;
                zh2Var.f13914n = 2;
                Object objM5038K2 = sz0Var.m5038K(str, Integer.MAX_VALUE, zh2Var);
                if (objM5038K2 != obj2) {
                    obj = objM5038K2;
                    return (String) obj;
                }
            }
            return obj2;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            if (!(th instanceof bh2)) {
                throw new dg2(null, si2.f10153i, str, "Unable to read script manifest as UTF-8.", th);
            }
            throw new dg2(null, si2.f10154j, str, hk1.m2208g(th.f862h, "Manifest exceeds the maximum of ", " bytes."), th);
        }
    }

    @Override // p000.gh2
    /* JADX INFO: renamed from: a */
    public Object mo1924a(hh2 hh2Var, Object obj, String str, ArrayList arrayList, cw0 cw0Var) {
        switch (this.f4896h) {
            case 17:
                Map map = uu0.f11505a;
                Class<?> cls = obj.getClass();
                str.getClass();
                ru0 ru0VarM5585d = uu0.m5585d(cls, str, arrayList, false);
                if (ru0VarM5585d == null) {
                    throw new eh2(12, "NOT_FOUND", "No matching method named the requested name was found.", null);
                }
                try {
                    Method method = ru0VarM5585d.f9757a;
                    method.setAccessible(true);
                    Object[] objArr = ru0VarM5585d.f9758b;
                    return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } catch (InvocationTargetException e) {
                    e = e;
                    Throwable targetException = e.getTargetException();
                    if (targetException != null) {
                        e = targetException;
                    }
                    throw new eh2(4, "INTERNAL_ERROR", "The host method threw an exception.", e);
                } catch (ReflectiveOperationException e2) {
                    throw new eh2(4, "INTERNAL_ERROR", "The host method could not be invoked.", e2);
                }
            default:
                throw new eh2(8, "HOST_ACCESS_UNAVAILABLE", "Raw host object access is unavailable in the current environment.", null);
        }
    }

    @Override // p000.xn1
    /* JADX INFO: renamed from: b */
    public boolean mo2444b(th1 th1Var) {
        return false;
    }

    @Override // p000.y02
    /* JADX INFO: renamed from: c */
    public Typeface mo2276c(im0 im0Var, int i) {
        return m2441w(null, im0Var, i);
    }

    @Override // p000.xn1
    /* JADX INFO: renamed from: d */
    public int mo2445d() {
        return 8;
    }

    @Override // p000.bl2
    /* JADX INFO: renamed from: e */
    public Object mo266e(yk2 yk2Var, xk2 xk2Var, C0455mb c0455mb) {
        throw new zk2(8, "UI_UNAVAILABLE", "Script UI is unavailable in the current environment.");
    }

    @Override // p000.bl2
    /* JADX INFO: renamed from: f */
    public Object mo267f(yk2 yk2Var, xf2 xf2Var, t00 t00Var) {
        throw new zk2(8, "UI_UNAVAILABLE", "Script UI is unavailable in the current environment.");
    }

    @Override // p000.tf2
    /* JADX INFO: renamed from: g */
    public Object mo420g(String str, t00 t00Var) {
        return new d41(ce0.f1492h);
    }

    @Override // p000.y02
    /* JADX INFO: renamed from: h */
    public Typeface mo2277h(so0 so0Var, im0 im0Var, int i) {
        so0Var.getClass();
        return m2441w("sans-serif", im0Var, i);
    }

    @Override // p000.xn1
    /* JADX INFO: renamed from: i */
    public boolean mo2446i(th1 th1Var) {
        return xe1.m6095M(rp0.m4528N(sp0.m4933c0(th1Var), false));
    }

    @Override // p000.gh2
    /* JADX INFO: renamed from: j */
    public Object mo1925j(hh2 hh2Var, Object obj, String str, hw0 hw0Var) {
        switch (this.f4896h) {
            case 17:
                Map map = uu0.f11505a;
                Class<?> cls = obj.getClass();
                str.getClass();
                Field fieldM5583b = uu0.m5583b(cls, str, false);
                if (fieldM5583b == null) {
                    throw new eh2(12, "NOT_FOUND", "No readable field named the requested property was found.", null);
                }
                try {
                    fieldM5583b.setAccessible(true);
                    return fieldM5583b.get(obj);
                } catch (ReflectiveOperationException e) {
                    throw new eh2(4, "INTERNAL_ERROR", "The host field could not be read.", e);
                }
            default:
                throw new eh2(8, "HOST_ACCESS_UNAVAILABLE", "Raw host object access is unavailable in the current environment.", null);
        }
    }

    @Override // p000.sh0
    /* JADX INFO: renamed from: k */
    public Object mo2447k() {
        switch (this.f4896h) {
            case 2:
                return new sc1();
            default:
                try {
                    return new zb2(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    @Override // p000.xn1
    /* JADX INFO: renamed from: l */
    public void mo2448l(r61 r61Var, long j, xs0 xs0Var, int i, boolean z) {
        vn1 vn1Var = r61Var.f9372M;
        zn1 zn1Var = (zn1) vn1Var.f12034e;
        ca2 ca2Var = zn1.f13961T;
        ((zn1) vn1Var.f12034e).m6456X0(zn1.f13965X, zn1Var.m6450P0(j), xs0Var, 1, z);
    }

    @Override // p000.bl2
    /* JADX INFO: renamed from: m */
    public Object mo268m(yk2 yk2Var, jd2 jd2Var, t00 t00Var) {
        throw new zk2(8, "UI_UNAVAILABLE", "Script UI is unavailable in the current environment.");
    }

    @Override // p000.xn1
    /* JADX INFO: renamed from: o */
    public boolean mo2450o(xs0 xs0Var, r61 r61Var) {
        return false;
    }

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        return new kv2(kj1Var.m2708g(Uri.class, ParcelFileDescriptor.class), 0);
    }

    @Override // p000.xn1
    /* JADX INFO: renamed from: r */
    public boolean mo2452r(r61 r61Var) {
        ln2 ln2VarM4391w = r61Var.m4391w();
        boolean z = false;
        if (ln2VarM4391w != null && ln2VarM4391w.f6224k) {
            z = true;
        }
        return !z;
    }

    public String toString() {
        switch (this.f4896h) {
            case AIChatConfig.MaxContextRounds /* 20 */:
                int iHashCode = hashCode();
                xe1.m6127j(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return vi0.m5692k("CreationExtras.Key@", string, "<", d72.m967a(lb3.class).m591c(), ">");
            case 26:
                return "SharingStarted.Eagerly";
            case 29:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2453x(sz0 sz0Var, u00 u00Var) throws dg2 {
        wh2 wh2Var;
        if (u00Var instanceof wh2) {
            wh2Var = (wh2) u00Var;
            int i = wh2Var.f12515n;
            if ((i & Integer.MIN_VALUE) != 0) {
                wh2Var.f12515n = i - Integer.MIN_VALUE;
            } else {
                wh2Var = new wh2(this, u00Var);
            }
        }
        Object objM3762R = wh2Var.f12513l;
        int i2 = wh2Var.f12515n;
        t00 t00Var = null;
        try {
            if (i2 == 0) {
                fg1.m1627T(objM3762R);
                wh2Var.f12512k = sz0Var;
                wh2Var.f12515n = 1;
                objM3762R = AbstractC0570p7.m3762R((c20) sz0Var.f10436i, new u80(sz0Var, t00Var, 0), wh2Var);
                k20 k20Var = k20.f5323h;
                if (objM3762R == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sz0Var = wh2Var.f12512k;
                fg1.m1627T(objM3762R);
            }
            return AbstractC0142du.m1170z0((Iterable) objM3762R);
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            String path = ((File) sz0Var.f10437j).getPath();
            path.getClass();
            throw new dg2(null, si2.f10152h, null, "Unable to discover files from " + path + ".", th, 4);
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo1500y(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r8 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2454z(sz0 sz0Var, u00 u00Var) throws dg2 {
        xh2 xh2Var;
        if (u00Var instanceof xh2) {
            xh2Var = (xh2) u00Var;
            int i = xh2Var.f13038n;
            if ((i & Integer.MIN_VALUE) != 0) {
                xh2Var.f13038n = i - Integer.MIN_VALUE;
            } else {
                xh2Var = new xh2(this, u00Var);
            }
        }
        Object objM2453x = xh2Var.f13036l;
        int i2 = xh2Var.f13038n;
        Object obj = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objM2453x);
            xh2Var.f13035k = sz0Var;
            xh2Var.f13038n = 1;
            objM2453x = m2453x(sz0Var, xh2Var);
            if (objM2453x != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.m1627T(objM2453x);
                return ((uh2) objM2453x).f11315a;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sz0Var = xh2Var.f13035k;
        fg1.m1627T(objM2453x);
        xh2Var.f13035k = null;
        xh2Var.f13038n = 2;
        objM2453x = m2442A(sz0Var, (List) objM2453x, xh2Var);
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: n */
    public int mo2449n(int i) {
        return i;
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: p */
    public int mo2451p(int i) {
        return i;
    }

    /* JADX INFO: renamed from: C */
    public void mo1216C(d22 d22Var, int i, int i2) {
    }
}
