package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class j51 implements sh0, xn1, us1, y02, gh2, tf2, bl2, kh1 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [d22.<init>(xm0, h22, java.lang.String, android.view.View, e70, g22, java.util.UUID, boolean):void, dq1.<init>(int):void, dq1.<init>(eg2):void, dw.onMultiWindowModeChanged(boolean):void, dw.onMultiWindowModeChanged(boolean, android.content.res.Configuration):void, dw.onPictureInPictureModeChanged(boolean):void, dw.onPictureInPictureModeChanged(boolean, android.content.res.Configuration):void, hh1.<init>(int):void, ic.<init>(android.content.Context, eo0, int, tm1, android.view.View, zv1):void, rp0.<clinit>():void, t11.<clinit>():void, t11.s(com.bumptech.glide.a, java.util.ArrayList):v72, ts1.<clinit>():void, up0.<clinit>():void, zn1.<clinit>():void] */
    public /* synthetic */ j51(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String s(no noVar, no[] noVarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        no noVar2 = k42.b;
        int iA = noVar.a();
        int i5 = 0;
        while (i5 < iA) {
            int i6 = (i5 + iA) / 2;
            while (i6 > -1 && noVar.d(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (noVar.d(i2) == 10) {
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
                    byte bD = noVarArr[i10].d(i11);
                    byte[] bArr = ug3.a;
                    int i13 = bD & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bD2 = noVar.d(i7 + i12);
                byte[] bArr2 = ug3.a;
                i4 = i3 - (bD2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (noVarArr[i10].a() != i11) {
                    z2 = z;
                } else {
                    if (i10 == noVarArr.length - 1) {
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
                    int iA2 = noVarArr[i10].a() - i11;
                    int length = noVarArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iA2 += noVarArr[i15].a();
                    }
                    if (iA2 >= i14) {
                        if (iA2 <= i14) {
                            return noVar.h(i7, i9 + i7).g(wq.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iA = i6;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void t(i51 i51Var) {
        ju2 ju2Var;
        jz1 jz1Var;
        jz1 jz1Var2;
        ju2 ju2Var2 = i62.z;
        do {
            ju2Var = i62.z;
            jz1Var = (jz1) ju2Var.getValue();
            zy1 zy1VarC = jz1Var.j;
            nb1 nb1Var = (nb1) zy1VarC.get(i51Var);
            if (nb1Var == null) {
                jz1Var2 = jz1Var;
            } else {
                Object obj = nb1Var.a;
                Object obj2 = nb1Var.b;
                h43 h43Var = zy1VarC.h;
                h43 h43VarV = h43Var.v(i51Var != null ? i51Var.hashCode() : 0, 0, i51Var);
                if (h43Var != h43VarV) {
                    zy1VarC = h43VarV == null ? zy1.j : new zy1(h43VarV, zy1VarC.i - 1);
                }
                gd3 gd3Var = gd3.v;
                if (obj != gd3Var) {
                    Object obj3 = zy1VarC.get(obj);
                    obj3.getClass();
                    zy1VarC = zy1VarC.c(obj, new nb1(((nb1) obj3).a, obj2));
                }
                if (obj2 != gd3Var) {
                    Object obj4 = zy1VarC.get(obj2);
                    obj4.getClass();
                    zy1VarC = zy1VarC.c(obj2, new nb1(obj, ((nb1) obj4).b));
                }
                Object obj5 = obj != gd3Var ? jz1Var.h : obj2;
                if (obj2 != gd3Var) {
                    obj = jz1Var.i;
                }
                jz1Var2 = new jz1(obj5, obj, zy1VarC);
            }
            if (jz1Var == jz1Var2) {
                return;
            }
        } while (!ju2Var.h(jz1Var, jz1Var2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList u(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c42) obj) != c42.j) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(eu.B(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c42) it.next()).h);
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] v(List list) {
        list.getClass();
        fn fnVar = new fn();
        for (String str : u(list)) {
            fnVar.E(str.length());
            fnVar.J(str);
        }
        return fnVar.q(fnVar.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Typeface w(String str, im0 im0Var, int i) {
        if (i == 0 && t11.l(im0Var, im0.j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), im0Var.h, i == 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(sz0 sz0Var, List list, u00 u00Var) {
        yh2 yh2Var;
        String strY;
        if (u00Var instanceof yh2) {
            yh2Var = (yh2) u00Var;
            int i = yh2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                yh2Var.n = i - Integer.MIN_VALUE;
            } else {
                yh2Var = new yh2(this, u00Var);
            }
        }
        Object objB = yh2Var.l;
        int i2 = yh2Var.n;
        si2 si2Var = si2.j;
        if (i2 == 0) {
            fg1.T(objB);
            o72 o72Var = oi2.i;
            strY = xe1.Y("manifest.json");
            if (!list.contains(new oi2(strY))) {
                throw new dg2(null, si2Var, strY, "Script manifest does not exist.", null, 16);
            }
            yh2Var.k = strY;
            yh2Var.n = 1;
            objB = B(sz0Var, strY, yh2Var);
            Object obj = k20.h;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = yh2Var.k;
            fg1.T(objB);
            strY = str;
        }
        String str2 = (String) objB;
        try {
            th2 th2VarD = vh2.d(str2);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            int length = bytes.length;
            if (length <= 2097152) {
                return new uh2(th2VarD, length);
            }
            throw new dg2(null, si2Var, strY, hk1.g(length, "Manifest size is ", " bytes; maximum is 2097152."), null, 16);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Invalid script manifest.";
            }
            throw new dg2(null, si2Var, strY, message, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(sz0 sz0Var, String str, u00 u00Var) throws bh2, dg2 {
        zh2 zh2Var;
        if (u00Var instanceof zh2) {
            zh2Var = (zh2) u00Var;
            int i = zh2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                zh2Var.n = i - Integer.MIN_VALUE;
            } else {
                zh2Var = new zh2(this, u00Var);
            }
        }
        Object obj = zh2Var.l;
        int i2 = zh2Var.n;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    String str2 = zh2Var.k;
                    fg1.T(obj);
                    return (String) obj;
                }
                if (i2 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = zh2Var.k;
                fg1.T(obj);
                return (String) obj;
            }
            fg1.T(obj);
            Object obj2 = k20.h;
            if (sz0Var != null) {
                zh2Var.k = str;
                zh2Var.n = 1;
                Object objK = sz0Var.K(str, 2097152, zh2Var);
                if (objK != obj2) {
                    obj = objK;
                    return (String) obj;
                }
            } else {
                zh2Var.k = str;
                zh2Var.n = 2;
                Object objK2 = sz0Var.K(str, Integer.MAX_VALUE, zh2Var);
                if (objK2 != obj2) {
                    obj = objK2;
                    return (String) obj;
                }
            }
            return obj2;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            if (!(th instanceof bh2)) {
                throw new dg2(null, si2.i, str, "Unable to read script manifest as UTF-8.", th);
            }
            throw new dg2(null, si2.j, str, hk1.g(th.h, "Manifest exceeds the maximum of ", " bytes."), th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gh2
    public Object a(hh2 hh2Var, Object obj, String str, ArrayList arrayList, cw0 cw0Var) {
        switch (this.h) {
            case 17:
                Map map = uu0.a;
                Class<?> cls = obj.getClass();
                str.getClass();
                ru0 ru0VarD = uu0.d(cls, str, arrayList, false);
                if (ru0VarD == null) {
                    throw new eh2(12, "NOT_FOUND", "No matching method named the requested name was found.", null);
                }
                try {
                    Method method = ru0VarD.a;
                    method.setAccessible(true);
                    Object[] objArr = ru0VarD.b;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn1
    public boolean b(th1 th1Var) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y02
    public Typeface c(im0 im0Var, int i) {
        return w(null, im0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn1
    public int d() {
        return 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bl2
    public Object e(yk2 yk2Var, xk2 xk2Var, mb mbVar) {
        throw new zk2(8, "UI_UNAVAILABLE", "Script UI is unavailable in the current environment.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bl2
    public Object f(yk2 yk2Var, xf2 xf2Var, t00 t00Var) {
        throw new zk2(8, "UI_UNAVAILABLE", "Script UI is unavailable in the current environment.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tf2
    public Object g(String str, t00 t00Var) {
        return new d41(ce0.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y02
    public Typeface h(so0 so0Var, im0 im0Var, int i) {
        so0Var.getClass();
        return w("sans-serif", im0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn1
    public boolean i(th1 th1Var) {
        return xe1.M(rp0.N(sp0.c0(th1Var), false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gh2
    public Object j(hh2 hh2Var, Object obj, String str, hw0 hw0Var) {
        switch (this.h) {
            case 17:
                Map map = uu0.a;
                Class<?> cls = obj.getClass();
                str.getClass();
                Field fieldB = uu0.b(cls, str, false);
                if (fieldB == null) {
                    throw new eh2(12, "NOT_FOUND", "No readable field named the requested property was found.", null);
                }
                try {
                    fieldB.setAccessible(true);
                    return fieldB.get(obj);
                } catch (ReflectiveOperationException e) {
                    throw new eh2(4, "INTERNAL_ERROR", "The host field could not be read.", e);
                }
            default:
                throw new eh2(8, "HOST_ACCESS_UNAVAILABLE", "Raw host object access is unavailable in the current environment.", null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sh0
    public Object k() {
        switch (this.h) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn1
    public void l(r61 r61Var, long j, xs0 xs0Var, int i, boolean z) {
        vn1 vn1Var = r61Var.M;
        zn1 zn1Var = (zn1) vn1Var.e;
        ca2 ca2Var = zn1.T;
        ((zn1) vn1Var.e).X0(zn1.X, zn1Var.P0(j), xs0Var, 1, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bl2
    public Object m(yk2 yk2Var, jd2 jd2Var, t00 t00Var) {
        throw new zk2(8, "UI_UNAVAILABLE", "Script UI is unavailable in the current environment.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn1
    public boolean o(xs0 xs0Var, r61 r61Var) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        return new kv2(kj1Var.g(Uri.class, ParcelFileDescriptor.class), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn1
    public boolean r(r61 r61Var) {
        ln2 ln2VarW = r61Var.w();
        boolean z = false;
        if (ln2VarW != null && ln2VarW.k) {
            z = true;
        }
        return !z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case AIChatConfig.MaxContextRounds /* 20 */:
                int iHashCode = hashCode();
                xe1.j(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return vi0.k("CreationExtras.Key@", string, "<", d72.a(lb3.class).c(), ">");
            case 26:
                return "SharingStarted.Eagerly";
            case 29:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(sz0 sz0Var, u00 u00Var) throws dg2 {
        wh2 wh2Var;
        if (u00Var instanceof wh2) {
            wh2Var = (wh2) u00Var;
            int i = wh2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                wh2Var.n = i - Integer.MIN_VALUE;
            } else {
                wh2Var = new wh2(this, u00Var);
            }
        }
        Object objR = wh2Var.l;
        int i2 = wh2Var.n;
        t00 t00Var = null;
        try {
            if (i2 == 0) {
                fg1.T(objR);
                wh2Var.k = sz0Var;
                wh2Var.n = 1;
                objR = p7.R((c20) sz0Var.i, new u80(sz0Var, t00Var, 0), wh2Var);
                k20 k20Var = k20.h;
                if (objR == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sz0Var = wh2Var.k;
                fg1.T(objR);
            }
            return du.z0((Iterable) objR);
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            String path = ((File) sz0Var.j).getPath();
            path.getClass();
            throw new dg2(null, si2.h, null, "Unable to discover files from " + path + ".", th, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r8 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(sz0 sz0Var, u00 u00Var) throws dg2 {
        xh2 xh2Var;
        if (u00Var instanceof xh2) {
            xh2Var = (xh2) u00Var;
            int i = xh2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                xh2Var.n = i - Integer.MIN_VALUE;
            } else {
                xh2Var = new xh2(this, u00Var);
            }
        }
        Object objX = xh2Var.l;
        int i2 = xh2Var.n;
        Object obj = k20.h;
        if (i2 == 0) {
            fg1.T(objX);
            xh2Var.k = sz0Var;
            xh2Var.n = 1;
            objX = x(sz0Var, xh2Var);
            if (objX != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.T(objX);
                return ((uh2) objX).a;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sz0Var = xh2Var.k;
        fg1.T(objX);
        xh2Var.k = null;
        xh2Var.n = 2;
        objX = A(sz0Var, (List) objX, xh2Var);
    }

    @Override // defpackage.us1
    public int n(int i) {
        return i;
    }

    @Override // defpackage.us1
    public int p(int i) {
        return i;
    }

    public void C(d22 d22Var, int i, int i2) {
    }
}
