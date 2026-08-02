package p000;

import android.content.ClipData;
import android.content.res.Configuration;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class op0 {

    /* JADX INFO: renamed from: a */
    public static final C0160eb f7754a = new C0160eb(1);

    /* JADX INFO: renamed from: b */
    public static final C0402kw f7755b = new C0402kw(1590802364, false, new C0558ow(6));

    /* JADX INFO: renamed from: c */
    public static final C0402kw f7756c = new C0402kw(-1346463969, false, new C0558ow(7));

    /* JADX INFO: renamed from: d */
    public static final C0953z8 f7757d = new C0953z8(28);

    /* JADX INFO: renamed from: e */
    public static final eq1 f7758e = new eq1(13);

    /* JADX INFO: renamed from: f */
    public static final C0595pw f7759f = new C0595pw(2);

    /* JADX INFO: renamed from: g */
    public static final Object f7760g = new Object();

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0631qt m3575A(C0690sd c0690sd) {
        SpannableString spannableString;
        List list = c0690sd.f10052j;
        be0 be0Var = be0.f819h;
        List list2 = list == null ? be0Var : list;
        CharSequence charSequence = c0690sd.f10051i;
        if (!list2.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            u40 u40Var = new u40();
            u40Var.f11097a = Parcel.obtain();
            if (list == null) {
                list = be0Var;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                C0652rd c0652rd = (C0652rd) list.get(i);
                lt2 lt2Var = (lt2) c0652rd.f9514a;
                int i2 = c0652rd.f9515b;
                int i3 = c0652rd.f9516c;
                u40Var.f11097a.recycle();
                u40Var.f11097a = Parcel.obtain();
                l03 l03Var = lt2Var.f6301a;
                long j = lt2Var.f6312l;
                long j2 = lt2Var.f6308h;
                int i4 = i;
                long j3 = lt2Var.f6302b;
                List list3 = list;
                int i5 = size;
                long jMo864b = l03Var.mo864b();
                long j4 = C0363ju.f5217g;
                if (C0363ju.m2566c(jMo864b, j4)) {
                    spannableString = spannableString2;
                } else {
                    u40Var.m5465c((byte) 1);
                    spannableString = spannableString2;
                    u40Var.f11097a.writeLong(lt2Var.f6301a.mo864b());
                }
                long j5 = p13.f7928c;
                byte b = 2;
                if (!p13.m3673a(j3, j5)) {
                    u40Var.m5465c((byte) 2);
                    u40Var.m5467e(j3);
                }
                im0 im0Var = lt2Var.f6303c;
                if (im0Var != null) {
                    u40Var.m5465c((byte) 3);
                    u40Var.f11097a.writeInt(im0Var.f4684h);
                }
                gm0 gm0Var = lt2Var.f6304d;
                if (gm0Var != null) {
                    int i6 = gm0Var.f3581a;
                    u40Var.m5465c((byte) 4);
                    u40Var.m5465c((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                hm0 hm0Var = lt2Var.f6305e;
                if (hm0Var != null) {
                    int i7 = hm0Var.f4076a;
                    u40Var.m5465c((byte) 5);
                    if (i7 != 0) {
                        if (i7 == 65535) {
                            b = 1;
                        } else if (i7 != 1) {
                            b = i7 == 2 ? (byte) 3 : (byte) 0;
                        }
                        u40Var.m5465c(b);
                    }
                }
                String str = lt2Var.f6307g;
                if (str != null) {
                    u40Var.m5465c((byte) 6);
                    u40Var.f11097a.writeString(str);
                }
                if (!p13.m3673a(j2, j5)) {
                    u40Var.m5465c((byte) 7);
                    u40Var.m5467e(j2);
                }
                C0888xj c0888xj = lt2Var.f6309i;
                if (c0888xj != null) {
                    float f = c0888xj.f13048a;
                    u40Var.m5465c((byte) 8);
                    u40Var.m5466d(f);
                }
                m03 m03Var = lt2Var.f6310j;
                if (m03Var != null) {
                    u40Var.m5465c((byte) 9);
                    u40Var.m5466d(m03Var.f6427a);
                    u40Var.m5466d(m03Var.f6428b);
                }
                if (!C0363ju.m2566c(j, j4)) {
                    u40Var.m5465c((byte) 10);
                    u40Var.f11097a.writeLong(j);
                }
                gz2 gz2Var = lt2Var.f6313m;
                if (gz2Var != null) {
                    u40Var.m5465c((byte) 11);
                    u40Var.f11097a.writeInt(gz2Var.f3749a);
                }
                bq2 bq2Var = lt2Var.f6314n;
                if (bq2Var != null) {
                    u40Var.m5465c((byte) 12);
                    u40Var.f11097a.writeLong(bq2Var.f986a);
                    long j6 = bq2Var.f987b;
                    u40Var.m5466d(Float.intBitsToFloat((int) (j6 >> 32)));
                    u40Var.m5466d(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    u40Var.m5466d(bq2Var.f988c);
                }
                SpannableString spannableString3 = spannableString;
                spannableString3.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(u40Var.f11097a.marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString2 = spannableString3;
                list = list3;
                size = i5;
            }
            charSequence = spannableString2;
        }
        return new C0631qt(ClipData.newPlainText("plain text", charSequence));
    }

    /* JADX INFO: renamed from: B */
    public static final yy1 m3576B(f42[] f42VarArr, yy1 yy1Var, yy1 yy1Var2) {
        yy1 yy1Var3 = yy1.f13674k;
        xy1 xy1Var = new xy1(yy1Var3);
        xy1Var.f13236n = yy1Var3;
        for (f42 f42Var : f42VarArr) {
            e42 e42Var = f42Var.f2787a;
            if (f42Var.f2792f || !yy1Var.containsKey(e42Var)) {
                xy1Var.put(e42Var, e42Var.m1253c(f42Var, (m93) yy1Var2.get(e42Var)));
            }
        }
        return xy1Var.mo608a();
    }

    /* JADX INFO: renamed from: C */
    public static final void m3577C(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            nz0.m3456a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        nz0.m3456a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    /* JADX INFO: renamed from: D */
    public static final o62 m3578D(c61 c61Var) {
        o62 o62VarM4724w = s11.m4724w(c61Var, true);
        long jMo648g = c61Var.mo648g(o62VarM4724w.m3516d());
        float f = o62VarM4724w.f7538c;
        float f2 = o62VarM4724w.f7539d;
        long jMo648g2 = c61Var.mo648g((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new o62(Float.intBitsToFloat((int) (jMo648g >> 32)), Float.intBitsToFloat((int) (jMo648g & 4294967295L)), Float.intBitsToFloat((int) (jMo648g2 >> 32)), Float.intBitsToFloat((int) (jMo648g2 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3579a(uh1 uh1Var, final float f, final long j, InterfaceC0596px interfaceC0596px, final int i, final int i2) {
        int i3;
        final uh1 uh1Var2;
        Object objM1956L;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (go0Var.m1980f(uh1Var) ? 4 : 2);
        }
        int i5 = i3 | (go0Var.m1978e(j) ? 256 : 128);
        int i6 = 0;
        boolean z = true;
        if (go0Var.m1958O(i5 & 1, (i5 & 147) != 146)) {
            go0Var.m1963T();
            if ((i & 1) == 0 || go0Var.m2003y()) {
                if (i4 != 0) {
                    uh1Var2 = rh1.f9587a;
                }
                go0Var.m1995q();
                uh1 uh1VarM5186O = AbstractC0731te.m5186O(uh1Var2.mo4491c(AbstractC0731te.f10693e), f);
                if ((((i5 & 896) ^ 384) > 256 || !go0Var.m1978e(j)) && (i5 & 384) != 256) {
                    z = false;
                }
                objM1956L = go0Var.m1956L();
                if (z || objM1956L == C0520nx.f7360a) {
                    objM1956L = new ka0(f, i6, j);
                    go0Var.m1981f0(objM1956L);
                }
                AbstractC0179eu.m1448b(uh1VarM5186O, (in0) objM1956L, go0Var, 0);
            } else {
                go0Var.m1961R();
            }
            uh1Var2 = uh1Var;
            go0Var.m1995q();
            uh1 uh1VarM5186O2 = AbstractC0731te.m5186O(uh1Var2.mo4491c(AbstractC0731te.f10693e), f);
            if (((i5 & 896) ^ 384) > 256) {
                z = false;
                objM1956L = go0Var.m1956L();
                if (z) {
                    objM1956L = new ka0(f, i6, j);
                    go0Var.m1981f0(objM1956L);
                    AbstractC0179eu.m1448b(uh1VarM5186O2, (in0) objM1956L, go0Var, 0);
                }
            } else {
                z = false;
                objM1956L = go0Var.m1956L();
                if (z) {
                }
            }
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(f, j, i, i2) { // from class: la0

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ float f5999i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ long f6000j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ int f6001k;

                {
                    this.f6001k = i2;
                }

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(49);
                    op0.m3579a(this.f5998h, this.f5999i, this.f6000j, (InterfaceC0596px) obj, iM3902N, this.f6001k);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3580b(C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-709502251);
        int i2 = 1;
        if (go0Var.m1958O(i & 1, (i & 3) != 2)) {
            tu2 tu2Var = hc2.f3953a;
            fc2 fc2Var = (fc2) go0Var.m1988j(tu2Var);
            go0Var.m1966W(1967007413);
            Object[] objArr = new Object[0];
            Object objM1956L = go0Var.m1956L();
            int i3 = 10;
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = new hn1(i3);
                go0Var.m1981f0(objM1956L);
            }
            dc2 dc2Var = (dc2) gf1.m1867O(objArr, dc2.f1984l, (xm0) objM1956L, go0Var, 384);
            dc2Var.f1987j = (fc2) go0Var.m1988j(tu2Var);
            go0Var.m1994p(false);
            Object[] objArr2 = {fc2Var};
            dq1 dq1Var = new dq1(i3, new z81(i2), new C0115d2(20, fc2Var, dc2Var));
            boolean zM1984h = go0Var.m1984h(fc2Var) | go0Var.m1984h(dc2Var);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1984h || objM1956L2 == c0160eb) {
                objM1956L2 = new C0640r1(23, fc2Var, dc2Var);
                go0Var.m1981f0(objM1956L2);
            }
            g91 g91Var = (g91) gf1.m1867O(objArr2, dq1Var, (xm0) objM1956L2, go0Var, 0);
            ci0.m800a(tu2Var.mo1251a(g91Var), xe1.m6126i0(-412824043, new C0016af(15, c0402kw, g91Var), go0Var), go0Var, 56);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0524o0(c0402kw, i, 5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3581c(final uh1 uh1Var, final float f, final long j, InterfaceC0596px interfaceC0596px, final int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1534852205);
        int i2 = (go0Var.m1978e(j) ? 256 : 128) | i;
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            go0Var.m1963T();
            if ((i & 1) != 0 && !go0Var.m2003y()) {
                go0Var.m1961R();
            }
            go0Var.m1995q();
            uh1 uh1VarM5231q0 = AbstractC0731te.m5231q0(uh1Var.mo4491c(AbstractC0731te.f10694f), f);
            boolean z = (((i2 & 896) ^ 384) > 256 && go0Var.m1978e(j)) || (i2 & 384) == 256;
            Object objM1956L = go0Var.m1956L();
            if (z || objM1956L == C0520nx.f7360a) {
                objM1956L = new ka0(f, i3, j);
                go0Var.m1981f0(objM1956L);
            }
            AbstractC0179eu.m1448b(uh1VarM5231q0, (in0) objM1956L, go0Var, 0);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(f, j, i) { // from class: ma0

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ float f6528i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ long f6529j;

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(55);
                    op0.m3581c(this.f6527h, this.f6528i, this.f6529j, (InterfaceC0596px) obj, iM3902N);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m3582d(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3583e(i23 i23Var, C0901xw c0901xw, Throwable th, u00 u00Var) {
        dk0 dk0Var;
        if (u00Var instanceof dk0) {
            dk0Var = (dk0) u00Var;
            int i = dk0Var.f2085m;
            if ((i & Integer.MIN_VALUE) != 0) {
                dk0Var.f2085m = i - Integer.MIN_VALUE;
            } else {
                dk0Var = new dk0(u00Var);
            }
        }
        Object obj = dk0Var.f2084l;
        int i2 = dk0Var.f2085m;
        a83 a83Var = a83.f116a;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                dk0Var.f2083k = th;
                dk0Var.f2085m = 1;
                c0901xw.mo489e(i23Var, th, dk0Var);
                k20 k20Var = k20.f5323h;
                if (a83Var == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = dk0Var.f2083k;
                fg1.m1627T(obj);
            }
            return a83Var;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                fg1.m1638m(th2, th);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m3584f(ab3 ab3Var, r61 r61Var) {
        long jMo646M = ((qz0) r61Var.f9372M.f12033d).mo646M(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo646M >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo646M & 4294967295L)));
        ab3Var.layout(iRound, iRound2, ab3Var.getMeasuredWidth() + iRound, ab3Var.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: renamed from: g */
    public static final void m3585g(Logger logger, ey2 ey2Var, hy2 hy2Var, String str) {
        logger.fine(hy2Var.f4186b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + ey2Var.f2685a);
    }

    /* JADX INFO: renamed from: h */
    public static void m3586h(tr2 tr2Var, List list, C0220fy c0220fy) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iM5412c = tr2Var.m5412c((ao0) list.get(i));
            int iM5402N = tr2Var.m5402N(tr2Var.f10914b, tr2Var.m5426r(iM5412c));
            Object obj = iM5402N < tr2Var.m5416g(tr2Var.f10914b, tr2Var.m5426r(iM5412c + 1)) ? tr2Var.f10915c[tr2Var.m5417h(iM5402N)] : C0520nx.f7360a;
            b62 b62Var = obj instanceof b62 ? (b62) obj : null;
            if (b62Var != null) {
                b62Var.f613a = c0220fy;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static final az0 m3587i(cz0 cz0Var, float f, float f2, zy0 zy0Var, InterfaceC0596px interfaceC0596px) {
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        go0 go0Var = (go0) interfaceC0596px;
        Object objM1956L = go0Var.m1956L();
        C0160eb c0160eb = C0520nx.f7360a;
        if (objM1956L == c0160eb) {
            objM1956L = new az0(cz0Var, fValueOf, fValueOf2, zy0Var);
            go0Var.m1981f0(objM1956L);
        }
        az0 az0Var = (az0) objM1956L;
        boolean zM1984h = go0Var.m1984h(zy0Var);
        Object objM1956L2 = go0Var.m1956L();
        if (zM1984h || objM1956L2 == c0160eb) {
            objM1956L2 = new dz0(fValueOf, az0Var, fValueOf2, zy0Var);
            go0Var.m1981f0(objM1956L2);
        }
        AbstractC0179eu.m1468r((xm0) objM1956L2, go0Var);
        boolean zM1984h2 = go0Var.m1984h(cz0Var);
        Object objM1956L3 = go0Var.m1956L();
        if (zM1984h2 || objM1956L3 == c0160eb) {
            objM1956L3 = new C0115d2(18, cz0Var, az0Var);
            go0Var.m1981f0(objM1956L3);
        }
        AbstractC0179eu.m1450c(az0Var, (in0) objM1956L3, go0Var);
        return az0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final Object m3588k(ArrayList arrayList, tw2 tw2Var) {
        if (arrayList.isEmpty()) {
            return be0.f819h;
        }
        n60[] n60VarArr = (n60[]) arrayList.toArray(new n60[0]);
        C0887xi c0887xi = new C0887xi(n60VarArr);
        C0469mp c0469mp = new C0469mp(1, gf1.m1908z(tw2Var));
        c0469mp.m3151u();
        int length = n60VarArr.length;
        C0811vi[] c0811viArr = new C0811vi[length];
        for (int i = 0; i < length; i++) {
            n60 n60Var = n60VarArr[i];
            ((r21) n60Var).start();
            C0811vi c0811vi = new C0811vi(c0887xi, c0469mp);
            c0811vi.f11973m = xe1.m6090H(n60Var, true, c0811vi);
            c0811viArr[i] = c0811vi;
        }
        C0848wi c0848wi = new C0848wi(c0811viArr);
        for (int i2 = 0; i2 < length; i2++) {
            C0811vi c0811vi2 = c0811viArr[i2];
            c0811vi2.getClass();
            C0811vi.f11971o.set(c0811vi2, c0848wi);
        }
        if (C0469mp.f6740n.get(c0469mp) instanceof ko1) {
            c0469mp.m3154x(c0848wi);
        } else {
            c0848wi.m5898b();
        }
        return c0469mp.m3150t();
    }

    /* JADX INFO: renamed from: l */
    public static final zk1 m3589l() {
        C0043b5 c0043b5 = ls2.f6294b;
        zk1 zk1Var = (zk1) c0043b5.m429p();
        if (zk1Var != null) {
            return zk1Var;
        }
        zk1 zk1Var2 = new zk1(new fo0[0]);
        c0043b5.m410A(zk1Var2);
        return zk1Var2;
    }

    /* JADX INFO: renamed from: m */
    public static final n70 m3590m(xm0 xm0Var) {
        C0043b5 c0043b5 = ls2.f6293a;
        return new n70(xm0Var, null);
    }

    /* JADX INFO: renamed from: n */
    public static final void m3591n(lj1 lj1Var, InterfaceC0627qp interfaceC0627qp, AbstractC0024an abstractC0024an, float f, bq2 bq2Var, gz2 gz2Var, op0 op0Var) {
        ArrayList arrayList = lj1Var.f6153h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rw1 rw1Var = (rw1) arrayList.get(i);
            rw1Var.f9775a.m5141g(interfaceC0627qp, abstractC0024an, f, bq2Var, gz2Var, op0Var);
            interfaceC0627qp.mo1518g(0.0f, rw1Var.f9775a.m5136b());
        }
    }

    /* JADX INFO: renamed from: o */
    public static final String m3592o(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: renamed from: p */
    public static void m3593p(AbstractC0812vj[] abstractC0812vjArr, boolean z) {
        pp1 pp1Var = pp1.f8445a;
        boolean zM3934f = pp1.m3934f();
        for (AbstractC0812vj abstractC0812vj : abstractC0812vjArr) {
            if (!(abstractC0812vj instanceof tb1)) {
                ArrayList arrayList = st0.f10362a;
                abstractC0812vj.getClass();
                if (!abstractC0812vj.mo5706f()) {
                    continue;
                } else if (z || !(abstractC0812vj instanceof w70)) {
                    m3594q(abstractC0812vj, zM3934f);
                } else {
                    String strMo9d = abstractC0812vj.mo9d();
                    String strMo9d2 = abstractC0812vj.mo9d();
                    String str = up0.f11405m;
                    if (str == null) {
                        t11.m5067S("hostProcess");
                        throw null;
                    }
                    hg3.m2168f(strMo9d, vi0.m5692k("Skip hooker ", strMo9d2, " in ", str, ": dex cache is invalid"));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m3594q(AbstractC0812vj abstractC0812vj, boolean z) {
        Object x92Var;
        boolean z2 = false;
        if (!z || abstractC0812vj.mo1778b()) {
            pp1 pp1Var = pp1.f8445a;
            if (!pp1.m3933e(abstractC0812vj.mo9d()) || abstractC0812vj.mo1778b()) {
                z2 = true;
            }
        }
        if (z2) {
            try {
                x92Var = Boolean.valueOf(st0.m5000a(abstractC0812vj));
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            Throwable thM6237a = y92.m6237a(x92Var);
            if (thM6237a != null) {
                pp1 pp1Var2 = pp1.f8445a;
                pp1.m3936h(abstractC0812vj, "install", thM6237a, "Hooker install failed");
                hg3.m2166d(abstractC0812vj.mo9d(), "Hooker " + abstractC0812vj.mo9d() + " failed: " + fg1.m1624Q(thM6237a));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m3595r(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m3596s(InterfaceC0596px interfaceC0596px) {
        return (((Configuration) ((go0) interfaceC0596px).m1988j(AbstractC0646r7.f9410a)).uiMode & 48) == 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3597t(ArrayList arrayList, u00 u00Var) {
        C0020aj c0020aj;
        Iterator it;
        int i;
        if (u00Var instanceof C0020aj) {
            c0020aj = (C0020aj) u00Var;
            int i2 = c0020aj.f222n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0020aj.f222n = i2 - Integer.MIN_VALUE;
            } else {
                c0020aj = new C0020aj(u00Var);
            }
        }
        Object obj = c0020aj.f221m;
        int i3 = c0020aj.f222n;
        if (i3 == 0) {
            fg1.m1627T(obj);
            it = arrayList.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c0020aj.f220l;
            it = c0020aj.f219k;
            fg1.m1627T(obj);
        }
        while (it.hasNext()) {
            k21 k21Var = (k21) it.next();
            c0020aj.f219k = it;
            c0020aj.f220l = i;
            c0020aj.f222n = 1;
            Object objMo1701A = k21Var.mo1701A(c0020aj);
            k20 k20Var = k20.f5323h;
            if (objMo1701A == k20Var) {
                return k20Var;
            }
        }
        return a83.f116a;
    }

    /* JADX INFO: renamed from: u */
    public static nx1 m3598u(Object obj) {
        return new nx1(obj, C0700sn.f10216T);
    }

    /* JADX INFO: renamed from: v */
    public static final uh1 m3599v(tm1 tm1Var) {
        return new um1(tm1Var);
    }

    /* JADX INFO: renamed from: w */
    public static final Object m3600w(yy1 yy1Var, e42 e42Var) {
        e42Var.getClass();
        Object objMo1252b = yy1Var.get(e42Var);
        if (objMo1252b == null) {
            objMo1252b = e42Var.mo1252b();
        }
        return ((m93) objMo1252b).mo1597a(yy1Var);
    }

    /* JADX INFO: renamed from: x */
    public static final xk1 m3601x(Object obj, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        Object objM1956L = go0Var.m1956L();
        if (objM1956L == C0520nx.f7360a) {
            objM1956L = m3598u(obj);
            go0Var.m1981f0(objM1956L);
        }
        xk1 xk1Var = (xk1) objM1956L;
        xk1Var.setValue(obj);
        return xk1Var;
    }

    /* JADX INFO: renamed from: y */
    public static C0485n4 m3602y(Object obj) {
        boolean z = obj instanceof C0067bt;
        int i = 24;
        xf1 xf1Var = xf1.f13006h;
        return z ? new C0485n4(i, new yf1(p40.m3741y((C0067bt) obj), obj, xf1Var)) : obj instanceof Class ? new C0485n4(i, new yf1((Class) obj, obj, xf1Var)) : new C0485n4(i, new yf1(obj.getClass(), obj, xf1Var));
    }

    /* JADX INFO: renamed from: z */
    public static final long m3603z(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo301j(r82 r82Var, Object obj);
}
