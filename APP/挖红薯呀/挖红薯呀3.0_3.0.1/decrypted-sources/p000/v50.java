package p000;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v50 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4397a(C0474mh c0474mh, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-709502251);
        int i2 = 1;
        if (c0616pi.m3082O(i & 1, (i & 3) != 2)) {
            g41 g41Var = bx0.f604a;
            zw0 zw0Var = (zw0) c0616pi.m3112j(g41Var);
            c0616pi.m3090W(1967007413);
            Object[] objArr = new Object[0];
            Object objM3080L = c0616pi.m3080L();
            int i3 = 5;
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (objM3080L == c0675r3) {
                objM3080L = new us0(i3);
                c0616pi.m3107g0(objM3080L);
            }
            yw0 yw0Var = (yw0) r60.m3423y(objArr, yw0.f7697h, (InterfaceC0298hw) objM3080L, c0616pi, 384);
            yw0Var.f7700f = (zw0) c0616pi.m3112j(g41Var);
            c0616pi.m3119p(false);
            Object[] objArr2 = {zw0Var};
            C0111d c0111d = new C0111d(19, new C0717s8(15), new C0073c(10, zw0Var, yw0Var));
            boolean zM3108h = c0616pi.m3108h(zw0Var) | c0616pi.m3108h(yw0Var);
            Object objM3080L2 = c0616pi.m3080L();
            if (zM3108h || objM3080L2 == c0675r3) {
                objM3080L2 = new C0081c7(i3, zw0Var, yw0Var);
                c0616pi.m3107g0(objM3080L2);
            }
            f90 f90Var = (f90) r60.m3423y(objArr2, c0111d, (InterfaceC0298hw) objM3080L2, c0616pi, 0);
            AbstractC0307i4.m1526b(g41Var.mo206a(f90Var), AbstractC0398kl.m1937w(-412824043, new C0168ed(6, c0474mh, f90Var), c0616pi), c0616pi, 56);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0231g2(c0474mh, i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final st0 m4398b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new st0(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m4399c(o70 o70Var, Object obj, int i, Object obj2, InterfaceC0356ji interfaceC0356ji, int i2) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1439843069);
        int i3 = (c0616pi.m3104f(o70Var) ? 4 : 2) | i2 | (c0616pi.m3104f(obj) ? 32 : 16) | (c0616pi.m3100d(i) ? 256 : 128) | (c0616pi.m3104f(obj2) ? 2048 : 1024);
        if (c0616pi.m3082O(i3 & 1, (i3 & 1171) != 1170)) {
            ((ww0) obj).mo1070e(obj2, AbstractC0398kl.m1937w(980966366, new C0355jh(i, o70Var, obj2), c0616pi), c0616pi, 48);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0394kh(o70Var, obj, i, obj2, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final oe0 m4400d(InterfaceC0694rm interfaceC0694rm, int i) {
        oe0 oe0Var = ((oe0) interfaceC0694rm).f4529d.f4534i;
        if (oe0Var == null || (oe0Var.f4532g & i) == 0) {
            return null;
        }
        while (oe0Var != null) {
            int i2 = oe0Var.f4531f;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return oe0Var;
            }
            oe0Var = oe0Var.f4534i;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m4401e(float f) {
        return Math.round((float) Math.ceil(f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m4402g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m4403h(C0035ay c0035ay, hb1 hb1Var) {
        ArrayList arrayList = hb1Var.f2195e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jb1 jb1Var = (jb1) arrayList.get(i);
            if (jb1Var instanceof lb1) {
                kp0 kp0Var = new kp0();
                lb1 lb1Var = (lb1) jb1Var;
                kp0Var.f3250c = lb1Var.f3408d;
                kp0Var.f3252e = true;
                kp0Var.m337c();
                kp0Var.f3255h.f973a.setFillType(Path.FillType.WINDING);
                kp0Var.m337c();
                kp0Var.m337c();
                kp0Var.f3249b = lb1Var.f3409e;
                kp0Var.m337c();
                kp0Var.m337c();
                kp0Var.m337c();
                kp0Var.m337c();
                kp0Var.m337c();
                kp0Var.m337c();
                kp0Var.m337c();
                kp0Var.m337c();
                kp0Var.f3253f = true;
                kp0Var.m337c();
                kp0Var.f3251d = 1.0f;
                kp0Var.f3253f = true;
                kp0Var.m337c();
                kp0Var.f3253f = true;
                kp0Var.m337c();
                c0035ay.m221e(i, kp0Var);
            } else if (jb1Var instanceof hb1) {
                C0035ay c0035ay2 = new C0035ay();
                hb1 hb1Var2 = (hb1) jb1Var;
                c0035ay2.f296k = "";
                c0035ay2.m337c();
                c0035ay2.f299n = true;
                c0035ay2.m337c();
                c0035ay2.f297l = 1.0f;
                c0035ay2.f299n = true;
                c0035ay2.m337c();
                c0035ay2.f298m = 1.0f;
                c0035ay2.f299n = true;
                c0035ay2.m337c();
                c0035ay2.f299n = true;
                c0035ay2.m337c();
                c0035ay2.f299n = true;
                c0035ay2.m337c();
                c0035ay2.f299n = true;
                c0035ay2.m337c();
                c0035ay2.f299n = true;
                c0035ay2.m337c();
                c0035ay2.f291f = hb1Var2.f2194d;
                c0035ay2.f292g = true;
                c0035ay2.m337c();
                m4403h(c0035ay2, hb1Var2);
                c0035ay.m221e(i, c0035ay2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final wc1 m4404i(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(C0587R.id.view_tree_view_model_store_owner);
            wc1 wc1Var = tag instanceof wc1 ? (wc1) tag : null;
            if (wc1Var != null) {
                return wc1Var;
            }
            Object objM5455y = z60.m5455y(view);
            view = objM5455y instanceof View ? (View) objM5455y : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final Rect m4405k(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, iNextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final C0715s6 m4406l(InterfaceC0618pk interfaceC0618pk) {
        C0715s6 c0715s6 = (C0715s6) interfaceC0618pk.mo64l(C0496n2.f4130J);
        if (c0715s6 != null) {
            return c0715s6;
        }
        C0921xc.m5134o("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final void m4407m(r50 r50Var) {
        pf1.m3039Q(r50Var).m269E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static q01 m4408n(InterfaceC0904ww interfaceC0904ww) {
        q01 q01Var = new q01();
        q01Var.f5021f = rd0.m3484m(q01Var, q01Var, interfaceC0904ww);
        return q01Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static yd0 m4409o(fw0 fw0Var, int i, int i2, int i3, int i4, int i5, zd0 zd0Var, List list, xq0[] xq0VarArr, int i6) {
        int i7;
        float f;
        long j;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j2 = i5;
        int[] iArr = new int[i6];
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i11 < i6) {
            sd0 sd0Var = (sd0) list2.get(i11);
            float fM4274q = u50.m4274q(u50.m4272o(sd0Var));
            if (fM4274q > 0.0f) {
                f2 += fM4274q;
                i12++;
                j = j2;
                i8 = i11;
            } else {
                int i14 = i3 - i13;
                xq0 xq0VarMo184e = xq0VarArr[i11];
                j = j2;
                if (xq0VarMo184e == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i8 = i11;
                        i9 = i12;
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i8 = i11;
                        i9 = i12;
                        i10 = i14 < 0 ? 0 : i14;
                    }
                    xq0VarMo184e = sd0Var.mo184e(fw0Var.mo1192e(0, i10, i4, false));
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                xq0 xq0Var = xq0VarMo184e;
                int iMo1194i = fw0Var.mo1194i(xq0Var);
                int iMo1193f = fw0Var.mo1193f(xq0Var);
                iArr[i8] = iMo1194i;
                int i15 = i14 - iMo1194i;
                if (i15 < 0) {
                    i15 = 0;
                }
                iMin = Math.min(i5, i15);
                i13 += iMo1194i + iMin;
                iMax = Math.max(iMax, iMo1193f);
                xq0VarArr[i8] = xq0Var;
                i12 = i9;
            }
            i11 = i8 + 1;
            j2 = j;
        }
        long j3 = j2;
        int i16 = i12;
        if (i16 == 0) {
            i13 -= iMin;
            i7 = 0;
        } else {
            long j4 = ((long) (i16 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i13)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i17 = 0; i17 < i6; i17++) {
                jRound -= (long) Math.round(u50.m4274q(u50.m4272o((sd0) list2.get(i17))) * f3);
            }
            int i18 = iMax;
            int i19 = 0;
            int i20 = 0;
            while (i19 < i6) {
                if (xq0VarArr[i19] == null) {
                    sd0 sd0Var2 = (sd0) list2.get(i19);
                    gw0 gw0VarM4272o = u50.m4272o(sd0Var2);
                    float fM4274q2 = u50.m4274q(gw0VarM4272o);
                    if (fM4274q2 <= 0.0f) {
                        u10.m4245b("All weights <= 0 should have placeables");
                    }
                    f = f3;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fM4274q2 * f) + iSignum);
                    xq0 xq0VarMo184e2 = sd0Var2.mo184e(fw0Var.mo1192e((!(gw0VarM4272o != null ? gw0VarM4272o.f2083b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iMo1194i2 = fw0Var.mo1194i(xq0VarMo184e2);
                    int iMo1193f2 = fw0Var.mo1193f(xq0VarMo184e2);
                    iArr[i19] = iMo1194i2;
                    i20 += iMo1194i2;
                    int iMax3 = Math.max(i18, iMo1193f2);
                    xq0VarArr[i19] = xq0VarMo184e2;
                    i18 = iMax3;
                } else {
                    f = f3;
                }
                i19++;
                list2 = list;
                f3 = f;
            }
            i7 = (int) (((long) i20) + j4);
            int i21 = i3 - i13;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i21) {
                i7 = i21;
            }
            iMax = i18;
        }
        int i22 = i7 + i13;
        if (i22 < 0) {
            i22 = 0;
        }
        int iMax4 = Math.max(i22, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        fw0Var.mo1191d(iMax4, iArr, iArr2, zd0Var);
        return fw0Var.mo1190a(xq0VarArr, zd0Var, iArr2, iMax4, iMax5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final float m4410p(long j, float f, InterfaceC0968ym interfaceC0968ym) {
        float fM4288c;
        long jM4287b = u71.m4287b(j);
        if (v71.m4419a(jM4287b, 4294967296L)) {
            if (interfaceC0968ym.mo49h() <= 1.05d) {
                return interfaceC0968ym.mo645P(j);
            }
            fM4288c = u71.m4288c(j) / u71.m4288c(interfaceC0968ym.mo647Z(f));
        } else {
            if (!v71.m4419a(jM4287b, 8589934592L)) {
                return Float.NaN;
            }
            fM4288c = u71.m4288c(j);
        }
        return fM4288c * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m4411q(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(p30.m2987W(j)), i, i2, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final void m4412r(Spannable spannable, long j, InterfaceC0968ym interfaceC0968ym, int i, int i2) {
        long jM4287b = u71.m4287b(j);
        if (v71.m4419a(jM4287b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(rd0.m3458Q(interfaceC0968ym.mo645P(j)), false), i, i2, 33);
        } else if (v71.m4419a(jM4287b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(u71.m4288c(j)), i, i2, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final void m4413s(Spannable spannable, fb0 fb0Var, int i, int i2) {
        if (fb0Var != null) {
            ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(fb0Var));
            Iterator it = fb0Var.f1651d.iterator();
            while (it.hasNext()) {
                arrayList.add(((eb0) it.next()).f1368a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final Object m4414t(k81 k81Var, InterfaceC0904ww interfaceC0904ww) throws Throwable {
        Object c0688rg;
        Object objM1627T;
        pf1.m3027C(k81Var, true, new C0733so(s91.m4061z(k81Var.f2092i.mo540e()).mo1073c(k81Var.f3049j, k81Var, k81Var.f5614h)));
        try {
            if (interfaceC0904ww instanceof AbstractC0955y9) {
                s91.m4048m(2, interfaceC0904ww);
                c0688rg = interfaceC0904ww.invoke(k81Var, k81Var);
            } else {
                c0688rg = rd0.m3467Z(interfaceC0904ww, k81Var, k81Var);
            }
        } catch (Throwable th) {
            c0688rg = new C0688rg(th, false);
        }
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (c0688rg == enumC1007zk || (objM1627T = k81Var.m1627T(c0688rg)) == s91.f5711m) {
            return enumC1007zk;
        }
        if (objM1627T instanceof C0688rg) {
            Throwable th2 = ((C0688rg) objM1627T).f5416a;
            if (!(th2 instanceof j81) || ((j81) th2).f2772d != k81Var) {
                throw th2;
            }
            if (c0688rg instanceof C0688rg) {
                throw ((C0688rg) c0688rg).f5416a;
            }
        } else {
            c0688rg = s91.m4034U(objM1627T);
        }
        return c0688rg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static byte[] m4415u(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((ia1) it.next()).f2502d;
            i++;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final void m4416v(xz0 xz0Var, int i, iy0 iy0Var) {
        xz0 xz0Var2;
        sh0 sh0Var = new sh0(new xz0[16]);
        List listM5187i = xz0Var.m5187i(false, false);
        while (true) {
            sh0Var.m4074d(sh0Var.f5770f, listM5187i);
            while (true) {
                int i2 = sh0Var.f5770f;
                if (i2 == 0) {
                    return;
                }
                xz0Var2 = (xz0) sh0Var.m4081k(i2 - 1);
                boolean zM1545u = AbstractC0307i4.m1545u(xz0Var2);
                sz0 sz0Var = xz0Var2.f7471d;
                jh0 jh0Var = sz0Var.f5877d;
                if (!zM1545u && !jh0Var.m1697c(b01.f330i)) {
                    qj0 qj0VarM5182d = xz0Var2.m5182d();
                    if (qj0VarM5182d == null) {
                        throw AbstractC0748t1.m4149g("Expected semantics node to have a coordinator.");
                    }
                    a30 a30VarM1939y = AbstractC0398kl.m1939y(j50.m1658h(qj0VarM5182d, true));
                    if (a30VarM1939y.f39a < a30VarM1939y.f41c && a30VarM1939y.f40b < a30VarM1939y.f42d) {
                        Object objM1701g = sz0Var.f5877d.m1701g(rz0.f5592e);
                        if (objM1701g == null) {
                            objM1701g = null;
                        }
                        InterfaceC0904ww interfaceC0904ww = (InterfaceC0904ww) objM1701g;
                        Object objM1701g2 = jh0Var.m1701g(b01.f343v);
                        hy0 hy0Var = (hy0) (objM1701g2 != null ? objM1701g2 : null);
                        if (interfaceC0904ww == null || hy0Var == null || ((Number) hy0Var.f2377b.invoke()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i3 = 1 + i;
                        iy0Var.invoke(new jy0(xz0Var2, i3, a30VarM1939y, qj0VarM5182d));
                        m4416v(xz0Var2, i3, iy0Var);
                    }
                }
            }
            listM5187i = xz0Var2.m5187i(false, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4417w(long j, InterfaceC0904ww interfaceC0904ww, AbstractC0358jk abstractC0358jk) throws Throwable {
        l81 l81Var;
        zt0 zt0Var;
        if (abstractC0358jk instanceof l81) {
            l81Var = (l81) abstractC0358jk;
            int i = l81Var.f3390i;
            if ((i & Integer.MIN_VALUE) != 0) {
                l81Var.f3390i = i - Integer.MIN_VALUE;
            } else {
                l81Var = new l81(abstractC0358jk);
            }
        }
        Object obj = l81Var.f3389h;
        int i2 = l81Var.f3390i;
        if (i2 == 0) {
            w60.m4891M(obj);
            if (j > 0) {
                zt0 zt0Var2 = new zt0();
                try {
                    l81Var.f3388g = zt0Var2;
                    l81Var.f3390i = 1;
                    k81 k81Var = new k81(j, l81Var);
                    zt0Var2.f7995d = k81Var;
                    Object objM4414t = m4414t(k81Var, interfaceC0904ww);
                    EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                    return objM4414t == enumC1007zk ? enumC1007zk : objM4414t;
                } catch (j81 e) {
                    e = e;
                    zt0Var = zt0Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zt0Var = l81Var.f3388g;
        try {
            w60.m4891M(obj);
            return obj;
        } catch (j81 e2) {
            e = e2;
        }
        if (e.f2772d != zt0Var.f7995d) {
            throw e;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo2631f();

    /* JADX INFO: renamed from: j */
    public abstract st0 mo4418j();
}
