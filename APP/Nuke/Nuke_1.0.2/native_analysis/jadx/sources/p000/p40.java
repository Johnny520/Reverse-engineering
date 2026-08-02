package p000;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p40 {

    /* JADX INFO: renamed from: d */
    public static final hh1 f7968d;

    /* JADX INFO: renamed from: e */
    public static final hh1 f7969e;

    /* JADX INFO: renamed from: j */
    public static final C0043b5 f7974j;

    /* JADX INFO: renamed from: k */
    public static C0043b5 f7975k;

    /* JADX INFO: renamed from: a */
    public static final t00[] f7965a = new t00[0];

    /* JADX INFO: renamed from: b */
    public static final C0402kw f7966b = new C0402kw(-1408078346, false, new C0558ow(3));

    /* JADX INFO: renamed from: c */
    public static final C0402kw f7967c = new C0402kw(-1917834791, false, new C0558ow(4));

    /* JADX INFO: renamed from: f */
    public static final double[][] f7970f = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: g */
    public static final double[][] f7971g = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: h */
    public static final double[] f7972h = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: i */
    public static final double[] f7973i = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    /* JADX INFO: renamed from: l */
    public static final w41[] f7976l = new w41[0];

    /* JADX INFO: renamed from: m */
    public static final Object f7977m = new Object();

    static {
        int i = 19;
        f7968d = new hh1(i, "UNDEFINED");
        f7969e = new hh1(i, "REUSABLE_CLAIMED");
        Object obj = null;
        f7974j = new C0043b5(obj, obj, obj, 20);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: A */
    public static final Class m3691A(C0067bt c0067bt) {
        Class clsMo589a = c0067bt.mo589a();
        if (clsMo589a.isPrimitive()) {
            return clsMo589a;
        }
        String name = clsMo589a.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static final int m3692B(lj1 lj1Var, long j, za3 za3Var) {
        float fMo6408f = za3Var != null ? za3Var.mo6408f() : 0.0f;
        int i = (int) (4294967295L & j);
        int iM2918e = lj1Var.m2918e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < lj1Var.m2919f(iM2918e) - fMo6408f || Float.intBitsToFloat(i) > lj1Var.m2915b(iM2918e) + fMo6408f) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fMo6408f) || Float.intBitsToFloat(i2) > lj1Var.f6149d + fMo6408f) {
            return -1;
        }
        return iM2918e;
    }

    /* JADX INFO: renamed from: C */
    public static final int m3693C(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                C0676s.m4651j("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: D */
    public static final long m3694D(t91 t91Var, o62 o62Var, int i) {
        um2 um2Var = gd3.f3427N;
        z03 z03VarM5146d = t91Var.m5146d();
        lj1 lj1Var = z03VarM5146d != null ? z03VarM5146d.f13697a.f13267b : null;
        c61 c61VarM5145c = t91Var.m5145c();
        return (lj1Var == null || c61VarM5145c == null) ? f13.f2737b : lj1Var.m2921h(o62Var.m3521i(c61VarM5145c.mo652s(0L)), i, um2Var);
    }

    /* JADX INFO: renamed from: E */
    public static double m3695E(double[] dArr) {
        double d = dArr[0];
        double[][] dArr2 = f7970f;
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double dM3729l = m3729l(d6);
        double dM3729l2 = m3729l(d7);
        double dM3729l3 = m3729l(d8);
        return Math.atan2(((dM3729l + dM3729l2) - (dM3729l3 * 2.0d)) / 9.0d, ((((-12.0d) * dM3729l2) + (dM3729l * 11.0d)) + dM3729l3) / 11.0d);
    }

    /* JADX INFO: renamed from: F */
    public static final int m3696F(C0349jg c0349jg, Object obj, int i) {
        int i2 = c0349jg.f5022j;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM4480p = rg3.m4480p(c0349jg.f5020h, i2, i);
            if (iM4480p < 0 || t11.m5086l(obj, c0349jg.f5021i[iM4480p])) {
                return iM4480p;
            }
            int i3 = iM4480p + 1;
            while (i3 < i2 && c0349jg.f5020h[i3] == i) {
                if (t11.m5086l(obj, c0349jg.f5021i[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM4480p - 1; i4 >= 0 && c0349jg.f5020h[i4] == i; i4--) {
                if (t11.m5086l(obj, c0349jg.f5021i[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: G */
    public static final int m3697G(Cursor cursor, String str) {
        cursor.getClass();
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return 0;
        }
        return cursor.getInt(columnIndexOrThrow);
    }

    /* JADX INFO: renamed from: H */
    public static double m3698H(double d) {
        double dAbs = Math.abs(d);
        return Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d) * ((double) (d < 0.0d ? -1 : d == 0.0d ? 0 : 1));
    }

    /* JADX INFO: renamed from: I */
    public static boolean m3699I(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m3700J(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m3701K(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m3702L(int i) {
        int type;
        return (!m3701K(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    /* JADX INFO: renamed from: M */
    public static final lp1 m3703M(long j) {
        return new lp1(true, sp0.m4932c(4294243574L), C0363ju.f5213c, sp0.m4932c(4293914607L), sp0.m4932c(4279900698L), sp0.m4932c(4285887861L), j);
    }

    /* JADX INFO: renamed from: N */
    public static final long m3704N(Cursor cursor, String str) {
        cursor.getClass();
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return 0L;
        }
        return cursor.getLong(columnIndexOrThrow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        if (r3 == r13) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3705O(yw2 yw2Var, er2 er2Var, C0158e9 c0158e9, h12 h12Var, AbstractC0658rj abstractC0658rj) {
        zm2 zm2Var;
        c80 c80Var;
        boolean z;
        y62 y62Var;
        t91 t91Var;
        boolean z2;
        yw2 yw2Var2 = yw2Var;
        er2 er2Var2 = er2Var;
        c80 c80Var2 = gd3.f3421H;
        if (abstractC0658rj instanceof zm2) {
            zm2Var = (zm2) abstractC0658rj;
            int i = zm2Var.f13958o;
            if ((i & Integer.MIN_VALUE) != 0) {
                zm2Var.f13958o = i - Integer.MIN_VALUE;
            } else {
                zm2Var = new zm2(abstractC0658rj);
            }
        }
        zm2 zm2Var2 = zm2Var;
        Object objM6244d = zm2Var2.f13957n;
        int i2 = zm2Var2.f13958o;
        int i3 = 0;
        try {
            try {
                if (i2 == 0) {
                    fg1.m1627T(objM6244d);
                    o12 o12Var = (o12) h12Var.f3776a.get(0);
                    int i4 = h12Var.f3780e & 1;
                    k20 k20Var = k20.f5323h;
                    if (i4 != 0) {
                        long j = o12Var.f7422c;
                        b03 b03Var = (b03) er2Var2.f2578k;
                        t91 t91Var2 = b03Var.f483d;
                        if (t91Var2 == null || t91Var2.m5146d() == null || !b03Var.m347k()) {
                            z2 = false;
                        } else {
                            b03Var.f499t = -1;
                            gl0 gl0Var = b03Var.f491l;
                            if (gl0Var != null) {
                                gl0.m1938a(gl0Var);
                            }
                            er2Var2.m1415e(b03Var.m350n(), j, false, gd3.f3421H);
                            z2 = true;
                        }
                        if (z2) {
                            o12Var.m3463a();
                            long j2 = o12Var.f7420a;
                            C0792v c0792v = new C0792v(29, er2Var2);
                            zm2Var2.f13954k = yw2Var2;
                            zm2Var2.f13955l = er2Var2;
                            zm2Var2.f13958o = 1;
                            objM6244d = yb0.m6244d(yw2Var2, j2, c0792v, zm2Var2);
                            if (objM6244d == k20Var) {
                                return k20Var;
                            }
                            if (((Boolean) objM6244d).booleanValue()) {
                            }
                        }
                    } else {
                        int i5 = c0158e9.f2352i;
                        if (i5 != 1) {
                            c80Var = i5 != 2 ? gd3.f3423J : gd3.f3422I;
                        } else {
                            c80Var = c80Var2;
                        }
                        long j3 = o12Var.f7422c;
                        b03 b03Var2 = (b03) er2Var2.f2578k;
                        if (!b03Var2.m347k() || b03Var2.m350n().f5296a.f10051i.length() == 0 || (t91Var = b03Var2.f483d) == null || t91Var.m5146d() == null) {
                            z = false;
                        } else {
                            gl0 gl0Var2 = b03Var2.f491l;
                            if (gl0Var2 != null) {
                                gl0.m1938a(gl0Var2);
                            }
                            b03Var2.f494o = j3;
                            b03Var2.f499t = -1;
                            b03Var2.m344h(true);
                            long jM1415e = er2Var2.m1415e(b03Var2.m350n(), b03Var2.f494o, true, c80Var);
                            if (i5 >= 2) {
                                er2Var2.f2576i = true;
                                er2Var2.f2577j = new f13(jM1415e);
                            }
                            z = true;
                        }
                        if (z) {
                            y62Var = new y62();
                            y62Var.f13324h = !c80Var.equals(c80Var2);
                            long j4 = o12Var.f7420a;
                            C0444m0 c0444m0 = new C0444m0(er2Var2, c80Var, y62Var, 11);
                            zm2Var2.f13954k = yw2Var2;
                            zm2Var2.f13955l = er2Var2;
                            zm2Var2.f13956m = y62Var;
                            zm2Var2.f13958o = 2;
                            objM6244d = yb0.m6244d(yw2Var2, j4, c0444m0, zm2Var2);
                        }
                    }
                } else if (i2 == 1) {
                    er2Var2 = zm2Var2.f13955l;
                    yw2Var2 = zm2Var2.f13954k;
                    fg1.m1627T(objM6244d);
                    if (((Boolean) objM6244d).booleanValue()) {
                        List list = yw2Var2.f13658m.f14135z.f3776a;
                        int size = list.size();
                        while (i3 < size) {
                            o12 o12Var2 = (o12) list.get(i3);
                            if (tp0.m5368p(o12Var2)) {
                                o12Var2.m3463a();
                            }
                            i3++;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y62 y62Var2 = zm2Var2.f13956m;
                    er2Var2 = zm2Var2.f13955l;
                    yw2 yw2Var3 = zm2Var2.f13954k;
                    fg1.m1627T(objM6244d);
                    y62Var = y62Var2;
                    yw2Var2 = yw2Var3;
                    if (((Boolean) objM6244d).booleanValue() && y62Var.f13324h) {
                        List list2 = yw2Var2.f13658m.f14135z.f3776a;
                        int size2 = list2.size();
                        while (i3 < size2) {
                            o12 o12Var3 = (o12) list2.get(i3);
                            if (tp0.m5368p(o12Var3)) {
                                o12Var3.m3463a();
                            }
                            i3++;
                        }
                    }
                    er2Var2.m1414d();
                }
                return a83.f116a;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3706Q(t00 t00Var, Object obj) throws j90 {
        k21 k21Var;
        if (!(t00Var instanceof k90)) {
            t00Var.mo2509h(obj);
            return;
        }
        k90 k90Var = (k90) t00Var;
        c20 c20Var = k90Var.f5404k;
        u00 u00Var = k90Var.f5405l;
        Throwable thM6237a = y92.m6237a(obj);
        Object c0557ov = thM6237a == null ? obj : new C0557ov(thM6237a, false);
        if (m3708S(c20Var, u00Var.mo2508f())) {
            k90Var.f5406m = c0557ov;
            k90Var.f6520j = 1;
            m3707R(c20Var, u00Var.mo2508f(), k90Var);
            return;
        }
        lg0 lg0VarM20a = a23.m20a();
        if (lg0VarM20a.f6107j >= 4294967296L) {
            k90Var.f5406m = c0557ov;
            k90Var.f6520j = 1;
            lg0VarM20a.m2905H(k90Var);
            return;
        }
        lg0VarM20a.m2906I(true);
        try {
            k21Var = (k21) u00Var.mo2508f().mo15o(C0700sn.f10207K);
        } finally {
            try {
            } finally {
            }
        }
        if (k21Var == null || k21Var.mo1703b()) {
            Object obj2 = k90Var.f5407n;
            a20 a20VarMo2508f = u00Var.mo2508f();
            Object objM1629V = fg1.m1629V(a20VarMo2508f, obj2);
            v73 v73VarM4464R = objM1629V != fg1.f2981i ? rg3.m4464R(u00Var, a20VarMo2508f, objM1629V) : null;
            try {
                u00Var.mo2509h(obj);
            } finally {
                if (v73VarM4464R == null || v73VarM4464R.m5651k0()) {
                    fg1.m1620M(a20VarMo2508f, objM1629V);
                }
            }
        }
        k90Var.mo2509h(fg1.m1644s(k21Var.mo1706q()));
        while (lg0VarM20a.m2908K()) {
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m3707R(c20 c20Var, a20 a20Var, Runnable runnable) throws j90 {
        try {
            c20Var.mo612D(a20Var, runnable);
        } catch (Throwable th) {
            throw new j90(th, c20Var, a20Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public static final boolean m3708S(c20 c20Var, a20 a20Var) throws j90 {
        try {
            return c20Var.mo613E(a20Var);
        } catch (Throwable th) {
            throw new j90(th, c20Var, a20Var);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: T */
    public static String m3709T(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: U */
    public static final m52 m3710U(yb2 yb2Var, s00 s00Var, fu2 fu2Var, Float f) {
        InterfaceC0212fq.f3107b.getClass();
        C0175eq c0175eq = C0175eq.f2559a;
        dq1 dq1Var = new dq1(13, yb2Var, zd0.f13837h);
        ju2 ju2VarM3908f = pp0.m3908f(f);
        a20 a20Var = (a20) dq1Var.f2148j;
        zj0 zj0Var = (zj0) dq1Var.f2147i;
        m20 m20Var = fu2Var.equals(oq2.f7796a) ? m20.f6440h : m20.f6443k;
        mn0 c0379k9 = new C0379k9(fu2Var, zj0Var, ju2VarM3908f, f, null, 5);
        a20 a20VarM4454H = rg3.m4454H(s00Var, a20Var);
        zt2 h91Var = m20Var == m20.f6441i ? new h91(a20VarM4454H, c0379k9) : new zt2(a20VarM4454H, true);
        h91Var.m3680i0(m20Var, h91Var, c0379k9);
        return new m52(ju2VarM3908f, h91Var);
    }

    /* JADX INFO: renamed from: V */
    public static final String m3711V(Cursor cursor, String str) {
        String string;
        cursor.getClass();
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        return (cursor.isNull(columnIndexOrThrow) || (string = cursor.getString(columnIndexOrThrow)) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: W */
    public static final Bitmap.Config m3712W(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: X */
    public static final String m3713X(t00 t00Var) {
        Object x92Var;
        if (t00Var instanceof k90) {
            return ((k90) t00Var).toString();
        }
        try {
            x92Var = t00Var + '@' + m3740x(t00Var);
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (y92.m6237a(x92Var) != null) {
            x92Var = t00Var.getClass().getName() + '@' + m3740x(t00Var);
        }
        return (String) x92Var;
    }

    /* JADX INFO: renamed from: Y */
    public static final long m3714Y(long j) {
        return ea3.m1314a(Float.isNaN(da3.m985b(j)) ? 0.0f : da3.m985b(j), Float.isNaN(da3.m986c(j)) ? 0.0f : da3.m986c(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3715Z(yw2 yw2Var, kz2 kz2Var, h12 h12Var, AbstractC0658rj abstractC0658rj) {
        an2 an2Var;
        o12 o12Var;
        if (abstractC0658rj instanceof an2) {
            an2Var = (an2) abstractC0658rj;
            int i = an2Var.f292o;
            if ((i & Integer.MIN_VALUE) != 0) {
                an2Var.f292o = i - Integer.MIN_VALUE;
            } else {
                an2Var = new an2(abstractC0658rj);
            }
        }
        Object objM6242b = an2Var.f291n;
        int i2 = an2Var.f292o;
        int i3 = 1;
        k20 k20Var = k20.f5323h;
        try {
            if (i2 == 0) {
                fg1.m1627T(objM6242b);
                o12Var = (o12) AbstractC0142du.m1159o0(h12Var.f3776a);
                long j = o12Var.f7420a;
                an2Var.f288k = yw2Var;
                an2Var.f289l = kz2Var;
                an2Var.f290m = o12Var;
                an2Var.f292o = 1;
                objM6242b = yb0.m6242b(yw2Var, j, an2Var);
                if (objM6242b == k20Var) {
                }
                return k20Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kz2Var = an2Var.f289l;
                yw2Var = an2Var.f288k;
                fg1.m1627T(objM6242b);
                if (((Boolean) objM6242b).booleanValue()) {
                    List list = yw2Var.f13658m.f14135z.f3776a;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        o12 o12Var2 = (o12) list.get(i4);
                        if (tp0.m5368p(o12Var2)) {
                            o12Var2.m3463a();
                        }
                    }
                    kz2Var.mo2776a();
                } else {
                    kz2Var.onCancel();
                }
                return a83.f116a;
            }
            o12 o12Var3 = an2Var.f290m;
            kz2Var = an2Var.f289l;
            yw2 yw2Var2 = an2Var.f288k;
            fg1.m1627T(objM6242b);
            o12Var = o12Var3;
            yw2Var = yw2Var2;
            o12 o12Var4 = (o12) objM6242b;
            if (o12Var4 != null) {
                long j2 = o12Var4.f7422c;
                if (rs1.m4610c(rs1.m4611d(o12Var.f7422c, j2)) < yb0.m6246f(yw2Var.m6365e(), o12Var.f7428i)) {
                    kz2Var.mo2777b(j2, dn2.f2126a);
                    long j3 = o12Var4.f7420a;
                    cd1 cd1Var = new cd1(kz2Var, i3);
                    an2Var.f288k = yw2Var;
                    an2Var.f289l = kz2Var;
                    an2Var.f290m = null;
                    an2Var.f292o = 2;
                    objM6242b = yb0.m6244d(yw2Var, j3, cd1Var, an2Var);
                }
            }
            return a83.f116a;
        } catch (CancellationException e) {
            kz2Var.onCancel();
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m3716a(Object obj, int i, g81 g81Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i2) {
        int i3;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(872548579);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.m1984h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.m1976d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.m1984h(g81Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go0Var.m1984h(c0402kw) ? 2048 : 1024;
        }
        if (go0Var.m1958O(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zM1980f = go0Var.m1980f(obj) | go0Var.m1980f(g81Var);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (zM1980f || objM1956L == c0160eb) {
                objM1956L = new e81(obj, g81Var);
                go0Var.m1981f0(objM1956L);
            }
            e81 e81Var = (e81) objM1956L;
            e81Var.f2346c = i;
            nx1 nx1Var = e81Var.f2350g;
            C0478my c0478my = qz1.f9295a;
            e81 e81Var2 = (e81) go0Var.m1988j(c0478my);
            vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
            in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
            vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
            try {
                if (e81Var2 != ((e81) nx1Var.getValue())) {
                    nx1Var.setValue(e81Var2);
                    if (e81Var.f2347d > 0) {
                        e81 e81Var3 = e81Var.f2348e;
                        if (e81Var3 != null) {
                            e81Var3.m1292b();
                        }
                        if (e81Var2 != null) {
                            e81Var2.m1291a();
                        } else {
                            e81Var2 = null;
                        }
                        e81Var.f2348e = e81Var2;
                    }
                }
                AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                boolean zM1980f2 = go0Var.m1980f(e81Var);
                Object objM1956L2 = go0Var.m1956L();
                if (zM1980f2 || objM1956L2 == c0160eb) {
                    objM1956L2 = new C0792v(12, e81Var);
                    go0Var.m1981f0(objM1956L2);
                }
                AbstractC0179eu.m1450c(e81Var, (in0) objM1956L2, go0Var);
                ci0.m800a(c0478my.mo1251a(e81Var), c0402kw, go0Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                throw th;
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new f81(obj, i, g81Var, c0402kw, i2);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static double m3717a0(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3718b(yw2 yw2Var, AbstractC0658rj abstractC0658rj) {
        xm2 xm2Var;
        k20 k20Var;
        int size;
        int i;
        if (abstractC0658rj instanceof xm2) {
            xm2Var = (xm2) abstractC0658rj;
            int i2 = xm2Var.f13084m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xm2Var.f13084m = i2 - Integer.MIN_VALUE;
            } else {
                xm2Var = new xm2(abstractC0658rj);
            }
        }
        Object objM6363a = xm2Var.f13083l;
        int i3 = xm2Var.f13084m;
        if (i3 == 0) {
            fg1.m1627T(objM6363a);
            xm2Var.f13082k = yw2Var;
            xm2Var.f13084m = 1;
            objM6363a = yw2Var.m6363a(i12.f4217i, xm2Var);
            k20Var = k20.f5323h;
            if (objM6363a == k20Var) {
            }
            h12 h12Var = (h12) objM6363a;
            List list = h12Var.f3776a;
            size = list.size();
            i = 0;
            while (i < size) {
            }
            return h12Var;
        }
        if (i3 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yw2Var = xm2Var.f13082k;
        fg1.m1627T(objM6363a);
        h12 h12Var2 = (h12) objM6363a;
        List list2 = h12Var2.f3776a;
        size = list2.size();
        i = 0;
        while (i < size) {
            if (tp0.m5366n((o12) list2.get(i))) {
                i++;
            } else {
                xm2Var.f13082k = yw2Var;
                xm2Var.f13084m = 1;
                objM6363a = yw2Var.m6363a(i12.f4217i, xm2Var);
                k20Var = k20.f5323h;
                if (objM6363a == k20Var) {
                    return k20Var;
                }
                h12 h12Var22 = (h12) objM6363a;
                List list22 = h12Var22.f3776a;
                size = list22.size();
                i = 0;
                while (i < size) {
                }
            }
        }
        return h12Var22;
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m3719b0() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public static final int m3720c(t91 t91Var, long j, za3 za3Var) {
        long jMo652s;
        int iM3692B;
        z03 z03VarM5146d = t91Var.m5146d();
        if (z03VarM5146d != null) {
            lj1 lj1Var = z03VarM5146d.f13697a.f13267b;
            c61 c61VarM5145c = t91Var.m5145c();
            if (c61VarM5145c != null && (iM3692B = m3692B(lj1Var, (jMo652s = c61VarM5145c.mo652s(j)), za3Var)) != -1) {
                return lj1Var.m2920g(rs1.m4608a((lj1Var.m2915b(iM3692B) + lj1Var.m2919f(iM3692B)) / 2.0f, 1, jMo652s));
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c0 */
    public static final uh1 m3721c0(uh1 uh1Var, C0538oc c0538oc) {
        return uh1Var.mo4491c(new d01(c0538oc));
    }

    /* JADX INFO: renamed from: d */
    public static final long m3722d(t91 t91Var, o62 o62Var, o62 o62Var2, int i) {
        long jM3694D = m3694D(t91Var, o62Var, i);
        if (f13.m1494c(jM3694D)) {
            return f13.f2737b;
        }
        long jM3694D2 = m3694D(t91Var, o62Var2, i);
        if (f13.m1494c(jM3694D2)) {
            return f13.f2737b;
        }
        int i2 = (int) (jM3694D >> 32);
        int i3 = (int) (jM3694D2 & 4294967295L);
        return fg1.m1636i(Math.min(i2, i2), Math.max(i3, i3));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m3723e(y03 y03Var, int i) {
        lj1 lj1Var = y03Var.f13267b;
        int iM2917d = lj1Var.m2917d(i);
        return i == y03Var.m6206f(iM2917d) || i == lj1Var.m2916c(iM2917d, false) ? y03Var.m6207g(i) != y03Var.m6201a(i) : y03Var.m6201a(i) != y03Var.m6201a(i - 1);
    }

    /* JADX INFO: renamed from: f */
    public static final long m3724f(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3725g(yw2 yw2Var, kz2 kz2Var, h12 h12Var, int i, AbstractC0658rj abstractC0658rj) {
        bn2 bn2Var;
        long j;
        b72 b72Var;
        if (abstractC0658rj instanceof bn2) {
            bn2Var = (bn2) abstractC0658rj;
            int i2 = bn2Var.f954p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bn2Var.f954p = i2 - Integer.MIN_VALUE;
            } else {
                bn2Var = new bn2(abstractC0658rj);
            }
        }
        Object objM6367j = bn2Var.f953o;
        int i3 = bn2Var.f954p;
        a83 a83Var = a83.f116a;
        int i4 = 2;
        k20 k20Var = k20.f5323h;
        try {
            if (i3 == 0) {
                fg1.m1627T(objM6367j);
                o12 o12Var = (o12) AbstractC0142du.m1159o0(h12Var.f3776a);
                j = o12Var.f7420a;
                kz2Var.mo2777b(o12Var.f7422c, i > 2 ? gd3.f3423J : gd3.f3422I);
                b72Var = new b72();
                b72Var.f722h = 9205357640488583168L;
                long jMo3034c = yw2Var.m6365e().mo3034c();
                cn2 cn2Var = new cn2(j, b72Var, null);
                bn2Var.f949k = yw2Var;
                bn2Var.f950l = kz2Var;
                bn2Var.f951m = b72Var;
                bn2Var.f952n = j;
                bn2Var.f954p = 1;
                objM6367j = yw2Var.m6367j(jMo3034c, cn2Var, bn2Var);
                if (objM6367j == k20Var) {
                }
                return k20Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kz2Var = bn2Var.f950l;
                yw2Var = bn2Var.f949k;
                fg1.m1627T(objM6367j);
                if (!((Boolean) objM6367j).booleanValue()) {
                    kz2Var.onCancel();
                    return a83Var;
                }
                List list = yw2Var.f13658m.f14135z.f3776a;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    o12 o12Var2 = (o12) list.get(i5);
                    if (tp0.m5368p(o12Var2)) {
                        o12Var2.m3463a();
                    }
                }
                kz2Var.mo2776a();
                return a83Var;
            }
            long j2 = bn2Var.f952n;
            b72Var = bn2Var.f951m;
            kz2 kz2Var2 = bn2Var.f950l;
            yw2 yw2Var2 = bn2Var.f949k;
            try {
                fg1.m1627T(objM6367j);
                j = j2;
                kz2Var = kz2Var2;
                yw2Var = yw2Var2;
            } catch (CancellationException e) {
                e = e;
                kz2Var = kz2Var2;
                kz2Var.onCancel();
                throw e;
            }
            ua0 ua0Var = (ua0) objM6367j;
            if (ua0Var == null) {
                ua0Var = ua0.f11192j;
            }
            if (ua0Var == ua0.f11193k) {
                kz2Var.onCancel();
                return a83Var;
            }
            if (ua0Var == ua0.f11190h) {
                kz2Var.mo2776a();
                return a83Var;
            }
            if (ua0Var == ua0.f11191i) {
                kz2Var.mo2780e(b72Var.f722h);
            }
            cd1 cd1Var = new cd1(kz2Var, i4);
            bn2Var.f949k = yw2Var;
            bn2Var.f950l = kz2Var;
            bn2Var.f951m = null;
            bn2Var.f954p = 2;
            objM6367j = yb0.m6244d(yw2Var, j, cd1Var, bn2Var);
        } catch (CancellationException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3726h(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX INFO: renamed from: i */
    public static final Bitmap m3727i(C0122d9 c0122d9) {
        if (c0122d9 instanceof C0122d9) {
            return c0122d9.f1913a;
        }
        c80.m676t("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final Object m3728j(s12 s12Var, er2 er2Var, kz2 kz2Var, t00 t00Var) {
        zw2 zw2Var = (zw2) s12Var;
        zw2Var.getClass();
        Object objM4958p = sp0.m4958p(s12Var, new ym2(new C0158e9(sp0.m4933c0(zw2Var).f9367H), er2Var, kz2Var, null), t00Var);
        return objM4958p == k20.f5323h ? objM4958p : a83.f116a;
    }

    /* JADX INFO: renamed from: l */
    public static double m3729l(double d) {
        double dPow = Math.pow(Math.abs(d), 0.42d);
        return ((((double) (d < 0.0d ? -1 : d == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: m */
    public static String m3730m(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m3731n(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    /* JADX INFO: renamed from: o */
    public static jc2 m3732o(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            jc2 jc2Var = new jc2();
            new LinkedHashMap();
            jc2Var.f4963a = new C0093cj(ce0.f1492h);
            return jc2Var;
        }
        ClassLoader classLoader = jc2.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        pe1 pe1Var = new pe1(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            pe1Var.put(str, bundle.get(str));
        }
        pe1 pe1VarM3852b = pe1Var.m3852b();
        jc2 jc2Var2 = new jc2();
        new LinkedHashMap();
        jc2Var2.f4963a = new C0093cj(pe1VarM3852b);
        return jc2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final Object m3733p(InterfaceC0257gy interfaceC0257gy, e42 e42Var) {
        if (!((th1) interfaceC0257gy).f10757h.f10770u) {
            kz0.m2764b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        yy1 yy1Var = (yy1) sp0.m4933c0(interfaceC0257gy).f9368I;
        yy1Var.getClass();
        return op0.m3600w(yy1Var, e42Var);
    }

    /* JADX INFO: renamed from: q */
    public static final lp1 m3734q(long j) {
        return new lp1(false, sp0.m4932c(4278848010L), sp0.m4932c(4279637526L), sp0.m4932c(4280558628L), sp0.m4932c(4294967295L), sp0.m4932c(4287137928L), j);
    }

    /* JADX INFO: renamed from: r */
    public static final zj0 m3735r(zj0 zj0Var) {
        return ((zj0Var instanceof hu2) || (zj0Var instanceof ia0)) ? zj0Var : new ia0(zj0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3736s(zj0 zj0Var, mn0 mn0Var, u00 u00Var) {
        kk0 kk0Var;
        o72 o72Var;
        C0525o1 e;
        ha0 ha0Var;
        hh1 hh1Var = up0.f11397e;
        if (u00Var instanceof kk0) {
            kk0Var = (kk0) u00Var;
            int i = kk0Var.f5613n;
            if ((i & Integer.MIN_VALUE) != 0) {
                kk0Var.f5613n = i - Integer.MIN_VALUE;
            } else {
                kk0Var = new kk0(u00Var);
            }
        }
        Object obj = kk0Var.f5612m;
        int i2 = kk0Var.f5613n;
        if (i2 == 0) {
            fg1.m1627T(obj);
            o72 o72Var2 = new o72();
            o72Var2.f7574i = hh1Var;
            ha0 ha0Var2 = new ha0(mn0Var, o72Var2);
            try {
                kk0Var.f5610k = o72Var2;
                kk0Var.f5611l = ha0Var2;
                kk0Var.f5613n = 1;
                Object objMo1660a = zj0Var.mo1660a(ha0Var2, kk0Var);
                Object obj2 = k20.f5323h;
                if (objMo1660a == obj2) {
                    return obj2;
                }
                o72Var = o72Var2;
            } catch (C0525o1 e2) {
                o72Var = o72Var2;
                e = e2;
                ha0Var = ha0Var2;
                if (e.f7410h == ha0Var) {
                    throw e;
                }
                a20 a20Var = kk0Var.f11029i;
                a20Var.getClass();
                xe1.m6135n(a20Var);
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ha0Var = kk0Var.f5611l;
            o72Var = kk0Var.f5610k;
            try {
                fg1.m1627T(obj);
            } catch (C0525o1 e3) {
                e = e3;
                if (e.f7410h == ha0Var) {
                }
            }
        }
        Object obj3 = o72Var.f7574i;
        if (obj3 != hh1Var) {
            return obj3;
        }
        um2.m5519i("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static ug1 m3737t(DexKitBridge dexKitBridge, C0638r c0638r) {
        dexKitBridge.getClass();
        int iM3661b = c0638r.m3661b(10);
        int i = iM3661b != 0 ? c0638r.f7869b.getInt(iM3661b + c0638r.f7868a) : 0;
        if ((i & 131072) > 0) {
            i = (i ^ 131072) | 32;
        }
        int i2 = i;
        int iM3661b2 = c0638r.m3661b(4);
        int i3 = iM3661b2 != 0 ? c0638r.f7869b.getInt(iM3661b2 + c0638r.f7868a) : 0;
        int iM3661b3 = c0638r.m3661b(6);
        int i4 = iM3661b3 != 0 ? c0638r.f7869b.getInt(iM3661b3 + c0638r.f7868a) : 0;
        int iM3661b4 = c0638r.m3661b(8);
        int i5 = iM3661b4 != 0 ? c0638r.f7869b.getInt(iM3661b4 + c0638r.f7868a) : 0;
        int iM3661b5 = c0638r.m3661b(12);
        String strM3663d = iM3661b5 != 0 ? c0638r.m3663d(iM3661b5 + c0638r.f7868a) : null;
        if (strM3663d == null) {
            strM3663d = "";
        }
        String str = strM3663d;
        int iM3661b6 = c0638r.m3661b(14);
        int i6 = iM3661b6 != 0 ? c0638r.f7869b.getInt(iM3661b6 + c0638r.f7868a) : 0;
        ArrayList arrayList = new ArrayList();
        int iM3661b7 = c0638r.m3661b(16);
        int iM3665f = iM3661b7 != 0 ? c0638r.m3665f(iM3661b7) : 0;
        for (int i7 = 0; i7 < iM3665f; i7++) {
            int iM3661b8 = c0638r.m3661b(16);
            arrayList.add(Integer.valueOf(iM3661b8 != 0 ? c0638r.f7869b.getInt((i7 * 4) + c0638r.m3664e(iM3661b8)) : 0));
        }
        return new ug1(dexKitBridge, i3, i4, i5, i2, str, i6, arrayList);
    }

    /* JADX INFO: renamed from: v */
    public static final C0067bt m3738v(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return d72.m967a(clsAnnotationType);
    }

    /* JADX INFO: renamed from: w */
    public static final Rect m3739w(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    /* JADX INFO: renamed from: x */
    public static final String m3740x(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: y */
    public static final Class m3741y(C0067bt c0067bt) {
        c0067bt.getClass();
        Class clsMo589a = c0067bt.mo589a();
        clsMo589a.getClass();
        return clsMo589a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: z */
    public static final Class m3742z(C0067bt c0067bt) {
        c0067bt.getClass();
        Class clsMo589a = c0067bt.mo589a();
        if (clsMo589a.isPrimitive()) {
            String name = clsMo589a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo589a;
    }

    /* JADX INFO: renamed from: P */
    public abstract p40 mo2317P(C0067bt c0067bt, Object obj);

    /* JADX INFO: renamed from: k */
    public abstract void mo3743k();

    /* JADX INFO: renamed from: u */
    public abstract Object mo2318u(C0067bt c0067bt);
}
