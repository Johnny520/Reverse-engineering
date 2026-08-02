package defpackage;

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
    public static final eb a = new eb(1);
    public static final kw b = new kw(1590802364, false, new ow(6));
    public static final kw c = new kw(-1346463969, false, new ow(7));
    public static final z8 d = new z8(28);
    public static final eq1 e = new eq1(13);
    public static final pw f = new pw(2);
    public static final Object g = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final qt A(sd sdVar) {
        SpannableString spannableString;
        List list = sdVar.j;
        be0 be0Var = be0.h;
        List list2 = list == null ? be0Var : list;
        CharSequence charSequence = sdVar.i;
        if (!list2.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            u40 u40Var = new u40();
            u40Var.a = Parcel.obtain();
            if (list == null) {
                list = be0Var;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                rd rdVar = (rd) list.get(i);
                lt2 lt2Var = (lt2) rdVar.a;
                int i2 = rdVar.b;
                int i3 = rdVar.c;
                u40Var.a.recycle();
                u40Var.a = Parcel.obtain();
                l03 l03Var = lt2Var.a;
                long j = lt2Var.l;
                long j2 = lt2Var.h;
                int i4 = i;
                long j3 = lt2Var.b;
                List list3 = list;
                int i5 = size;
                long jB = l03Var.b();
                long j4 = ju.g;
                if (ju.c(jB, j4)) {
                    spannableString = spannableString2;
                } else {
                    u40Var.c((byte) 1);
                    spannableString = spannableString2;
                    u40Var.a.writeLong(lt2Var.a.b());
                }
                long j5 = p13.c;
                byte b2 = 2;
                if (!p13.a(j3, j5)) {
                    u40Var.c((byte) 2);
                    u40Var.e(j3);
                }
                im0 im0Var = lt2Var.c;
                if (im0Var != null) {
                    u40Var.c((byte) 3);
                    u40Var.a.writeInt(im0Var.h);
                }
                gm0 gm0Var = lt2Var.d;
                if (gm0Var != null) {
                    int i6 = gm0Var.a;
                    u40Var.c((byte) 4);
                    u40Var.c((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                hm0 hm0Var = lt2Var.e;
                if (hm0Var != null) {
                    int i7 = hm0Var.a;
                    u40Var.c((byte) 5);
                    if (i7 != 0) {
                        if (i7 == 65535) {
                            b2 = 1;
                        } else if (i7 != 1) {
                            b2 = i7 == 2 ? (byte) 3 : (byte) 0;
                        }
                        u40Var.c(b2);
                    }
                }
                String str = lt2Var.g;
                if (str != null) {
                    u40Var.c((byte) 6);
                    u40Var.a.writeString(str);
                }
                if (!p13.a(j2, j5)) {
                    u40Var.c((byte) 7);
                    u40Var.e(j2);
                }
                xj xjVar = lt2Var.i;
                if (xjVar != null) {
                    float f2 = xjVar.a;
                    u40Var.c((byte) 8);
                    u40Var.d(f2);
                }
                m03 m03Var = lt2Var.j;
                if (m03Var != null) {
                    u40Var.c((byte) 9);
                    u40Var.d(m03Var.a);
                    u40Var.d(m03Var.b);
                }
                if (!ju.c(j, j4)) {
                    u40Var.c((byte) 10);
                    u40Var.a.writeLong(j);
                }
                gz2 gz2Var = lt2Var.m;
                if (gz2Var != null) {
                    u40Var.c((byte) 11);
                    u40Var.a.writeInt(gz2Var.a);
                }
                bq2 bq2Var = lt2Var.n;
                if (bq2Var != null) {
                    u40Var.c((byte) 12);
                    u40Var.a.writeLong(bq2Var.a);
                    long j6 = bq2Var.b;
                    u40Var.d(Float.intBitsToFloat((int) (j6 >> 32)));
                    u40Var.d(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    u40Var.d(bq2Var.c);
                }
                SpannableString spannableString3 = spannableString;
                spannableString3.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(u40Var.a.marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString2 = spannableString3;
                list = list3;
                size = i5;
            }
            charSequence = spannableString2;
        }
        return new qt(ClipData.newPlainText("plain text", charSequence));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final yy1 B(f42[] f42VarArr, yy1 yy1Var, yy1 yy1Var2) {
        yy1 yy1Var3 = yy1.k;
        xy1 xy1Var = new xy1(yy1Var3);
        xy1Var.n = yy1Var3;
        for (f42 f42Var : f42VarArr) {
            e42 e42Var = f42Var.a;
            if (f42Var.f || !yy1Var.containsKey(e42Var)) {
                xy1Var.put(e42Var, e42Var.c(f42Var, (m93) yy1Var2.get(e42Var)));
            }
        }
        return xy1Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void C(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            nz0.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        nz0.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o62 D(c61 c61Var) {
        o62 o62VarW = s11.w(c61Var, true);
        long jG = c61Var.g(o62VarW.d());
        float f2 = o62VarW.c;
        float f3 = o62VarW.d;
        long jG2 = c61Var.g((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        return new o62(Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jG & 4294967295L)), Float.intBitsToFloat((int) (jG2 >> 32)), Float.intBitsToFloat((int) (jG2 & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(uh1 uh1Var, final float f2, final long j, px pxVar, final int i, final int i2) {
        int i3;
        final uh1 uh1Var2;
        Object objL;
        go0 go0Var = (go0) pxVar;
        go0Var.X(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (go0Var.f(uh1Var) ? 4 : 2);
        }
        int i5 = i3 | (go0Var.e(j) ? 256 : 128);
        int i6 = 0;
        boolean z = true;
        if (go0Var.O(i5 & 1, (i5 & 147) != 146)) {
            go0Var.T();
            if ((i & 1) == 0 || go0Var.y()) {
                if (i4 != 0) {
                    uh1Var2 = rh1.a;
                }
                go0Var.q();
                uh1 uh1VarO = te.O(uh1Var2.c(te.e), f2);
                if ((((i5 & 896) ^ 384) > 256 || !go0Var.e(j)) && (i5 & 384) != 256) {
                    z = false;
                }
                objL = go0Var.L();
                if (z || objL == nx.a) {
                    objL = new ka0(f2, i6, j);
                    go0Var.f0(objL);
                }
                eu.b(uh1VarO, (in0) objL, go0Var, 0);
            } else {
                go0Var.R();
            }
            uh1Var2 = uh1Var;
            go0Var.q();
            uh1 uh1VarO2 = te.O(uh1Var2.c(te.e), f2);
            if (((i5 & 896) ^ 384) > 256) {
                z = false;
                objL = go0Var.L();
                if (z) {
                    objL = new ka0(f2, i6, j);
                    go0Var.f0(objL);
                    eu.b(uh1VarO2, (in0) objL, go0Var, 0);
                }
            } else {
                z = false;
                objL = go0Var.L();
                if (z) {
                }
            }
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(f2, j, i, i2) { // from class: la0
                public final /* synthetic */ float i;
                public final /* synthetic */ long j;
                public final /* synthetic */ int k;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.k = i2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(49);
                    op0.a(this.h, this.i, this.j, (px) obj, iN, this.k);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(kw kwVar, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-709502251);
        int i2 = 1;
        if (go0Var.O(i & 1, (i & 3) != 2)) {
            tu2 tu2Var = hc2.a;
            fc2 fc2Var = (fc2) go0Var.j(tu2Var);
            go0Var.W(1967007413);
            Object[] objArr = new Object[0];
            Object objL = go0Var.L();
            int i3 = 10;
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = new hn1(i3);
                go0Var.f0(objL);
            }
            dc2 dc2Var = (dc2) gf1.O(objArr, dc2.l, (xm0) objL, go0Var, 384);
            dc2Var.j = (fc2) go0Var.j(tu2Var);
            go0Var.p(false);
            Object[] objArr2 = {fc2Var};
            dq1 dq1Var = new dq1(i3, new z81(i2), new d2(20, fc2Var, dc2Var));
            boolean zH = go0Var.h(fc2Var) | go0Var.h(dc2Var);
            Object objL2 = go0Var.L();
            if (zH || objL2 == ebVar) {
                objL2 = new r1(23, fc2Var, dc2Var);
                go0Var.f0(objL2);
            }
            g91 g91Var = (g91) gf1.O(objArr2, dq1Var, (xm0) objL2, go0Var, 0);
            ci0.a(tu2Var.a(g91Var), xe1.i0(-412824043, new af(15, kwVar, g91Var), go0Var), go0Var, 56);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new o0(kwVar, i, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(final uh1 uh1Var, final float f2, final long j, px pxVar, final int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1534852205);
        int i2 = (go0Var.e(j) ? 256 : 128) | i;
        int i3 = 1;
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            go0Var.T();
            if ((i & 1) != 0 && !go0Var.y()) {
                go0Var.R();
            }
            go0Var.q();
            uh1 uh1VarQ0 = te.q0(uh1Var.c(te.f), f2);
            boolean z = (((i2 & 896) ^ 384) > 256 && go0Var.e(j)) || (i2 & 384) == 256;
            Object objL = go0Var.L();
            if (z || objL == nx.a) {
                objL = new ka0(f2, i3, j);
                go0Var.f0(objL);
            }
            eu.b(uh1VarQ0, (in0) objL, go0Var, 0);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(f2, j, i) { // from class: ma0
                public final /* synthetic */ float i;
                public final /* synthetic */ long j;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(55);
                    op0.c(this.h, this.i, this.j, (px) obj, iN);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int d(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(i23 i23Var, xw xwVar, Throwable th, u00 u00Var) {
        dk0 dk0Var;
        if (u00Var instanceof dk0) {
            dk0Var = (dk0) u00Var;
            int i = dk0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                dk0Var.m = i - Integer.MIN_VALUE;
            } else {
                dk0Var = new dk0(u00Var);
            }
        }
        Object obj = dk0Var.l;
        int i2 = dk0Var.m;
        a83 a83Var = a83.a;
        try {
            if (i2 == 0) {
                fg1.T(obj);
                dk0Var.k = th;
                dk0Var.m = 1;
                xwVar.e(i23Var, th, dk0Var);
                k20 k20Var = k20.h;
                if (a83Var == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = dk0Var.k;
                fg1.T(obj);
            }
            return a83Var;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                fg1.m(th2, th);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(ab3 ab3Var, r61 r61Var) {
        long jM = ((qz0) r61Var.M.d).M(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jM >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jM & 4294967295L)));
        ab3Var.layout(iRound, iRound2, ab3Var.getMeasuredWidth() + iRound, ab3Var.getMeasuredHeight() + iRound2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(Logger logger, ey2 ey2Var, hy2 hy2Var, String str) {
        logger.fine(hy2Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + ey2Var.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(tr2 tr2Var, List list, fy fyVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = tr2Var.c((ao0) list.get(i));
            int iN = tr2Var.N(tr2Var.b, tr2Var.r(iC));
            Object obj = iN < tr2Var.g(tr2Var.b, tr2Var.r(iC + 1)) ? tr2Var.c[tr2Var.h(iN)] : nx.a;
            b62 b62Var = obj instanceof b62 ? (b62) obj : null;
            if (b62Var != null) {
                b62Var.a = fyVar;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final az0 i(cz0 cz0Var, float f2, float f3, zy0 zy0Var, px pxVar) {
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        go0 go0Var = (go0) pxVar;
        Object objL = go0Var.L();
        eb ebVar = nx.a;
        if (objL == ebVar) {
            objL = new az0(cz0Var, fValueOf, fValueOf2, zy0Var);
            go0Var.f0(objL);
        }
        az0 az0Var = (az0) objL;
        boolean zH = go0Var.h(zy0Var);
        Object objL2 = go0Var.L();
        if (zH || objL2 == ebVar) {
            objL2 = new dz0(fValueOf, az0Var, fValueOf2, zy0Var);
            go0Var.f0(objL2);
        }
        eu.r((xm0) objL2, go0Var);
        boolean zH2 = go0Var.h(cz0Var);
        Object objL3 = go0Var.L();
        if (zH2 || objL3 == ebVar) {
            objL3 = new d2(18, cz0Var, az0Var);
            go0Var.f0(objL3);
        }
        eu.c(az0Var, (in0) objL3, go0Var);
        return az0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: n60 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: n60[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(ArrayList arrayList, tw2 tw2Var) {
        if (arrayList.isEmpty()) {
            return be0.h;
        }
        n60[] n60VarArr = (n60[]) arrayList.toArray(new n60[0]);
        xi xiVar = new xi(n60VarArr);
        mp mpVar = new mp(1, gf1.z(tw2Var));
        mpVar.u();
        int length = n60VarArr.length;
        vi[] viVarArr = new vi[length];
        for (int i = 0; i < length; i++) {
            n60 n60Var = n60VarArr[i];
            ((r21) n60Var).start();
            vi viVar = new vi(xiVar, mpVar);
            viVar.m = xe1.H(n60Var, true, viVar);
            viVarArr[i] = viVar;
        }
        wi wiVar = new wi(viVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            vi viVar2 = viVarArr[i2];
            viVar2.getClass();
            vi.o.set(viVar2, wiVar);
        }
        if (mp.n.get(mpVar) instanceof ko1) {
            mpVar.x(wiVar);
        } else {
            wiVar.b();
        }
        return mpVar.t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final zk1 l() {
        b5 b5Var = ls2.b;
        zk1 zk1Var = (zk1) b5Var.p();
        if (zk1Var != null) {
            return zk1Var;
        }
        zk1 zk1Var2 = new zk1(new fo0[0]);
        b5Var.A(zk1Var2);
        return zk1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final n70 m(xm0 xm0Var) {
        b5 b5Var = ls2.a;
        return new n70(xm0Var, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(lj1 lj1Var, qp qpVar, an anVar, float f2, bq2 bq2Var, gz2 gz2Var, op0 op0Var) {
        ArrayList arrayList = lj1Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rw1 rw1Var = (rw1) arrayList.get(i);
            rw1Var.a.g(qpVar, anVar, f2, bq2Var, gz2Var, op0Var);
            qpVar.g(0.0f, rw1Var.a.b());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String o(long j) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void p(vj[] vjVarArr, boolean z) {
        pp1 pp1Var = pp1.a;
        boolean zF = pp1.f();
        for (vj vjVar : vjVarArr) {
            if (!(vjVar instanceof tb1)) {
                ArrayList arrayList = st0.a;
                vjVar.getClass();
                if (!vjVar.f()) {
                    continue;
                } else if (z || !(vjVar instanceof w70)) {
                    q(vjVar, zF);
                } else {
                    String strD = vjVar.d();
                    String strD2 = vjVar.d();
                    String str = up0.m;
                    if (str == null) {
                        t11.S("hostProcess");
                        throw null;
                    }
                    hg3.f(strD, vi0.k("Skip hooker ", strD2, " in ", str, ": dex cache is invalid"));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(vj vjVar, boolean z) {
        Object x92Var;
        boolean z2 = false;
        if (!z || vjVar.b()) {
            pp1 pp1Var = pp1.a;
            if (!pp1.e(vjVar.d()) || vjVar.b()) {
                z2 = true;
            }
        }
        if (z2) {
            try {
                x92Var = Boolean.valueOf(st0.a(vjVar));
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            Throwable thA = y92.a(x92Var);
            if (thA != null) {
                pp1 pp1Var2 = pp1.a;
                pp1.h(vjVar, "install", thA, "Hooker install failed");
                hg3.d(vjVar.d(), "Hooker " + vjVar.d() + " failed: " + fg1.Q(thA));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean r(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean s(px pxVar) {
        return (((Configuration) ((go0) pxVar).j(r7.a)).uiMode & 48) == 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(ArrayList arrayList, u00 u00Var) {
        aj ajVar;
        Iterator it;
        int i;
        if (u00Var instanceof aj) {
            ajVar = (aj) u00Var;
            int i2 = ajVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ajVar.n = i2 - Integer.MIN_VALUE;
            } else {
                ajVar = new aj(u00Var);
            }
        }
        Object obj = ajVar.m;
        int i3 = ajVar.n;
        if (i3 == 0) {
            fg1.T(obj);
            it = arrayList.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = ajVar.l;
            it = ajVar.k;
            fg1.T(obj);
        }
        while (it.hasNext()) {
            k21 k21Var = (k21) it.next();
            ajVar.k = it;
            ajVar.l = i;
            ajVar.n = 1;
            Object objA = k21Var.A(ajVar);
            k20 k20Var = k20.h;
            if (objA == k20Var) {
                return k20Var;
            }
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static nx1 u(Object obj) {
        return new nx1(obj, sn.T);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 v(tm1 tm1Var) {
        return new um1(tm1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object w(yy1 yy1Var, e42 e42Var) {
        e42Var.getClass();
        Object objB = yy1Var.get(e42Var);
        if (objB == null) {
            objB = e42Var.b();
        }
        return ((m93) objB).a(yy1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final xk1 x(Object obj, px pxVar) {
        go0 go0Var = (go0) pxVar;
        Object objL = go0Var.L();
        if (objL == nx.a) {
            objL = u(obj);
            go0Var.f0(objL);
        }
        xk1 xk1Var = (xk1) objL;
        xk1Var.setValue(obj);
        return xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n4 y(Object obj) {
        boolean z = obj instanceof bt;
        int i = 24;
        xf1 xf1Var = xf1.h;
        return z ? new n4(i, new yf1(p40.y((bt) obj), obj, xf1Var)) : obj instanceof Class ? new n4(i, new yf1((Class) obj, obj, xf1Var)) : new n4(i, new yf1(obj.getClass(), obj, xf1Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long z(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public abstract void j(r82 r82Var, Object obj);
}
