package defpackage;

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
    public static final hh1 d;
    public static final hh1 e;
    public static final b5 j;
    public static b5 k;
    public static final t00[] a = new t00[0];
    public static final kw b = new kw(-1408078346, false, new ow(3));
    public static final kw c = new kw(-1917834791, false, new ow(4));
    public static final double[][] f = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] g = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] h = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] i = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final w41[] l = new w41[0];
    public static final Object m = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 19;
        d = new hh1(i2, "UNDEFINED");
        e = new hh1(i2, "REUSABLE_CLAIMED");
        Object obj = null;
        j = new b5(obj, obj, obj, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class A(bt btVar) {
        Class clsA = btVar.a();
        if (clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int B(lj1 lj1Var, long j2, za3 za3Var) {
        float f2 = za3Var != null ? za3Var.f() : 0.0f;
        int i2 = (int) (4294967295L & j2);
        int iE = lj1Var.e(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) < lj1Var.f(iE) - f2 || Float.intBitsToFloat(i2) > lj1Var.b(iE) + f2) {
            return -1;
        }
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) < (-f2) || Float.intBitsToFloat(i3) > lj1Var.d + f2) {
            return -1;
        }
        return iE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int C(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                s.j("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long D(t91 t91Var, o62 o62Var, int i2) {
        um2 um2Var = gd3.N;
        z03 z03VarD = t91Var.d();
        lj1 lj1Var = z03VarD != null ? z03VarD.a.b : null;
        c61 c61VarC = t91Var.c();
        return (lj1Var == null || c61VarC == null) ? f13.b : lj1Var.h(o62Var.i(c61VarC.s(0L)), i2, um2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double E(double[] dArr) {
        double d2 = dArr[0];
        double[][] dArr2 = f;
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d9 = (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0]);
        double dL = l(d7);
        double dL2 = l(d8);
        double dL3 = l(d9);
        return Math.atan2(((dL + dL2) - (dL3 * 2.0d)) / 9.0d, ((((-12.0d) * dL2) + (dL * 11.0d)) + dL3) / 11.0d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int F(jg jgVar, Object obj, int i2) {
        int i3 = jgVar.j;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iP = rg3.p(jgVar.h, i3, i2);
            if (iP < 0 || t11.l(obj, jgVar.i[iP])) {
                return iP;
            }
            int i4 = iP + 1;
            while (i4 < i3 && jgVar.h[i4] == i2) {
                if (t11.l(obj, jgVar.i[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iP - 1; i5 >= 0 && jgVar.h[i5] == i2; i5--) {
                if (t11.l(obj, jgVar.i[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int G(Cursor cursor, String str) {
        cursor.getClass();
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return 0;
        }
        return cursor.getInt(columnIndexOrThrow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double H(double d2) {
        double dAbs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d) * ((double) (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean I(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean J(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean K(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean L(int i2) {
        int type;
        return (!K(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final lp1 M(long j2) {
        return new lp1(true, sp0.c(4294243574L), ju.c, sp0.c(4293914607L), sp0.c(4279900698L), sp0.c(4285887861L), j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long N(Cursor cursor, String str) {
        cursor.getClass();
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return 0L;
        }
        return cursor.getLong(columnIndexOrThrow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        if (r3 == r13) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(yw2 yw2Var, er2 er2Var, e9 e9Var, h12 h12Var, rj rjVar) {
        zm2 zm2Var;
        c80 c80Var;
        boolean z;
        y62 y62Var;
        t91 t91Var;
        boolean z2;
        yw2 yw2Var2 = yw2Var;
        er2 er2Var2 = er2Var;
        c80 c80Var2 = gd3.H;
        if (rjVar instanceof zm2) {
            zm2Var = (zm2) rjVar;
            int i2 = zm2Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zm2Var.o = i2 - Integer.MIN_VALUE;
            } else {
                zm2Var = new zm2(rjVar);
            }
        }
        zm2 zm2Var2 = zm2Var;
        Object objD = zm2Var2.n;
        int i3 = zm2Var2.o;
        int i4 = 0;
        try {
            try {
                if (i3 == 0) {
                    fg1.T(objD);
                    o12 o12Var = (o12) h12Var.a.get(0);
                    int i5 = h12Var.e & 1;
                    k20 k20Var = k20.h;
                    if (i5 != 0) {
                        long j2 = o12Var.c;
                        b03 b03Var = (b03) er2Var2.k;
                        t91 t91Var2 = b03Var.d;
                        if (t91Var2 == null || t91Var2.d() == null || !b03Var.k()) {
                            z2 = false;
                        } else {
                            b03Var.t = -1;
                            gl0 gl0Var = b03Var.l;
                            if (gl0Var != null) {
                                gl0.a(gl0Var);
                            }
                            er2Var2.e(b03Var.n(), j2, false, gd3.H);
                            z2 = true;
                        }
                        if (z2) {
                            o12Var.a();
                            long j3 = o12Var.a;
                            v vVar = new v(29, er2Var2);
                            zm2Var2.k = yw2Var2;
                            zm2Var2.l = er2Var2;
                            zm2Var2.o = 1;
                            objD = yb0.d(yw2Var2, j3, vVar, zm2Var2);
                            if (objD == k20Var) {
                                return k20Var;
                            }
                            if (((Boolean) objD).booleanValue()) {
                            }
                        }
                    } else {
                        int i6 = e9Var.i;
                        if (i6 != 1) {
                            c80Var = i6 != 2 ? gd3.J : gd3.I;
                        } else {
                            c80Var = c80Var2;
                        }
                        long j4 = o12Var.c;
                        b03 b03Var2 = (b03) er2Var2.k;
                        if (!b03Var2.k() || b03Var2.n().a.i.length() == 0 || (t91Var = b03Var2.d) == null || t91Var.d() == null) {
                            z = false;
                        } else {
                            gl0 gl0Var2 = b03Var2.l;
                            if (gl0Var2 != null) {
                                gl0.a(gl0Var2);
                            }
                            b03Var2.o = j4;
                            b03Var2.t = -1;
                            b03Var2.h(true);
                            long jE = er2Var2.e(b03Var2.n(), b03Var2.o, true, c80Var);
                            if (i6 >= 2) {
                                er2Var2.i = true;
                                er2Var2.j = new f13(jE);
                            }
                            z = true;
                        }
                        if (z) {
                            y62Var = new y62();
                            y62Var.h = !c80Var.equals(c80Var2);
                            long j5 = o12Var.a;
                            m0 m0Var = new m0(er2Var2, c80Var, y62Var, 11);
                            zm2Var2.k = yw2Var2;
                            zm2Var2.l = er2Var2;
                            zm2Var2.m = y62Var;
                            zm2Var2.o = 2;
                            objD = yb0.d(yw2Var2, j5, m0Var, zm2Var2);
                        }
                    }
                } else if (i3 == 1) {
                    er2Var2 = zm2Var2.l;
                    yw2Var2 = zm2Var2.k;
                    fg1.T(objD);
                    if (((Boolean) objD).booleanValue()) {
                        List list = yw2Var2.m.z.a;
                        int size = list.size();
                        while (i4 < size) {
                            o12 o12Var2 = (o12) list.get(i4);
                            if (tp0.p(o12Var2)) {
                                o12Var2.a();
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y62 y62Var2 = zm2Var2.m;
                    er2Var2 = zm2Var2.l;
                    yw2 yw2Var3 = zm2Var2.k;
                    fg1.T(objD);
                    y62Var = y62Var2;
                    yw2Var2 = yw2Var3;
                    if (((Boolean) objD).booleanValue() && y62Var.h) {
                        List list2 = yw2Var2.m.z.a;
                        int size2 = list2.size();
                        while (i4 < size2) {
                            o12 o12Var3 = (o12) list2.get(i4);
                            if (tp0.p(o12Var3)) {
                                o12Var3.a();
                            }
                            i4++;
                        }
                    }
                    er2Var2.d();
                }
                return a83.a;
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Q(t00 t00Var, Object obj) throws j90 {
        k21 k21Var;
        if (!(t00Var instanceof k90)) {
            t00Var.h(obj);
            return;
        }
        k90 k90Var = (k90) t00Var;
        c20 c20Var = k90Var.k;
        u00 u00Var = k90Var.l;
        Throwable thA = y92.a(obj);
        Object ovVar = thA == null ? obj : new ov(thA, false);
        if (S(c20Var, u00Var.f())) {
            k90Var.m = ovVar;
            k90Var.j = 1;
            R(c20Var, u00Var.f(), k90Var);
            return;
        }
        lg0 lg0VarA = a23.a();
        if (lg0VarA.j >= 4294967296L) {
            k90Var.m = ovVar;
            k90Var.j = 1;
            lg0VarA.H(k90Var);
            return;
        }
        lg0VarA.I(true);
        try {
            k21Var = (k21) u00Var.f().o(sn.K);
        } finally {
            try {
            } finally {
            }
        }
        if (k21Var == null || k21Var.b()) {
            Object obj2 = k90Var.n;
            a20 a20VarF = u00Var.f();
            Object objV = fg1.V(a20VarF, obj2);
            v73 v73VarR = objV != fg1.i ? rg3.R(u00Var, a20VarF, objV) : null;
            try {
                u00Var.h(obj);
            } finally {
                if (v73VarR == null || v73VarR.k0()) {
                    fg1.M(a20VarF, objV);
                }
            }
        }
        k90Var.h(fg1.s(k21Var.q()));
        while (lg0VarA.K()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void R(c20 c20Var, a20 a20Var, Runnable runnable) throws j90 {
        try {
            c20Var.D(a20Var, runnable);
        } catch (Throwable th) {
            throw new j90(th, c20Var, a20Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean S(c20 c20Var, a20 a20Var) throws j90 {
        try {
            return c20Var.E(a20Var);
        } catch (Throwable th) {
            throw new j90(th, c20Var, a20Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String T(String str) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final m52 U(yb2 yb2Var, s00 s00Var, fu2 fu2Var, Float f2) {
        fq.b.getClass();
        eq eqVar = eq.a;
        dq1 dq1Var = new dq1(13, yb2Var, zd0.h);
        ju2 ju2VarF = pp0.f(f2);
        a20 a20Var = (a20) dq1Var.j;
        zj0 zj0Var = (zj0) dq1Var.i;
        m20 m20Var = fu2Var.equals(oq2.a) ? m20.h : m20.k;
        mn0 k9Var = new k9(fu2Var, zj0Var, ju2VarF, f2, null, 5);
        a20 a20VarH = rg3.H(s00Var, a20Var);
        zt2 h91Var = m20Var == m20.i ? new h91(a20VarH, k9Var) : new zt2(a20VarH, true);
        h91Var.i0(m20Var, h91Var, k9Var);
        return new m52(ju2VarF, h91Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String V(Cursor cursor, String str) {
        String string;
        cursor.getClass();
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        return (cursor.isNull(columnIndexOrThrow) || (string = cursor.getString(columnIndexOrThrow)) == null) ? "" : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Bitmap.Config W(int i2) {
        return i2 == 0 ? Bitmap.Config.ARGB_8888 : i2 == 1 ? Bitmap.Config.ALPHA_8 : i2 == 2 ? Bitmap.Config.RGB_565 : i2 == 3 ? Bitmap.Config.RGBA_F16 : i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String X(t00 t00Var) {
        Object x92Var;
        if (t00Var instanceof k90) {
            return ((k90) t00Var).toString();
        }
        try {
            x92Var = t00Var + '@' + x(t00Var);
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (y92.a(x92Var) != null) {
            x92Var = t00Var.getClass().getName() + '@' + x(t00Var);
        }
        return (String) x92Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long Y(long j2) {
        return ea3.a(Float.isNaN(da3.b(j2)) ? 0.0f : da3.b(j2), Float.isNaN(da3.c(j2)) ? 0.0f : da3.c(j2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Z(yw2 yw2Var, kz2 kz2Var, h12 h12Var, rj rjVar) {
        an2 an2Var;
        o12 o12Var;
        if (rjVar instanceof an2) {
            an2Var = (an2) rjVar;
            int i2 = an2Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                an2Var.o = i2 - Integer.MIN_VALUE;
            } else {
                an2Var = new an2(rjVar);
            }
        }
        Object objB = an2Var.n;
        int i3 = an2Var.o;
        int i4 = 1;
        k20 k20Var = k20.h;
        try {
            if (i3 == 0) {
                fg1.T(objB);
                o12Var = (o12) du.o0(h12Var.a);
                long j2 = o12Var.a;
                an2Var.k = yw2Var;
                an2Var.l = kz2Var;
                an2Var.m = o12Var;
                an2Var.o = 1;
                objB = yb0.b(yw2Var, j2, an2Var);
                if (objB == k20Var) {
                }
                return k20Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kz2Var = an2Var.l;
                yw2Var = an2Var.k;
                fg1.T(objB);
                if (((Boolean) objB).booleanValue()) {
                    List list = yw2Var.m.z.a;
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        o12 o12Var2 = (o12) list.get(i5);
                        if (tp0.p(o12Var2)) {
                            o12Var2.a();
                        }
                    }
                    kz2Var.a();
                } else {
                    kz2Var.onCancel();
                }
                return a83.a;
            }
            o12 o12Var3 = an2Var.m;
            kz2Var = an2Var.l;
            yw2 yw2Var2 = an2Var.k;
            fg1.T(objB);
            o12Var = o12Var3;
            yw2Var = yw2Var2;
            o12 o12Var4 = (o12) objB;
            if (o12Var4 != null) {
                long j3 = o12Var4.c;
                if (rs1.c(rs1.d(o12Var.c, j3)) < yb0.f(yw2Var.e(), o12Var.i)) {
                    kz2Var.b(j3, dn2.a);
                    long j4 = o12Var4.a;
                    cd1 cd1Var = new cd1(kz2Var, i4);
                    an2Var.k = yw2Var;
                    an2Var.l = kz2Var;
                    an2Var.m = null;
                    an2Var.o = 2;
                    objB = yb0.d(yw2Var, j4, cd1Var, an2Var);
                }
            }
            return a83.a;
        } catch (CancellationException e2) {
            kz2Var.onCancel();
            throw e2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(Object obj, int i2, g81 g81Var, kw kwVar, px pxVar, int i3) {
        int i4;
        go0 go0Var = (go0) pxVar;
        go0Var.X(872548579);
        if ((i3 & 6) == 0) {
            i4 = (go0Var.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= go0Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= go0Var.h(g81Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= go0Var.h(kwVar) ? 2048 : 1024;
        }
        if (go0Var.O(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zF = go0Var.f(obj) | go0Var.f(g81Var);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (zF || objL == ebVar) {
                objL = new e81(obj, g81Var);
                go0Var.f0(objL);
            }
            e81 e81Var = (e81) objL;
            e81Var.c = i2;
            nx1 nx1Var = e81Var.g;
            my myVar = qz1.a;
            e81 e81Var2 = (e81) go0Var.j(myVar);
            vr2 vr2VarB = tl.B();
            in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
            vr2 vr2VarK = tl.K(vr2VarB);
            try {
                if (e81Var2 != ((e81) nx1Var.getValue())) {
                    nx1Var.setValue(e81Var2);
                    if (e81Var.d > 0) {
                        e81 e81Var3 = e81Var.e;
                        if (e81Var3 != null) {
                            e81Var3.b();
                        }
                        if (e81Var2 != null) {
                            e81Var2.a();
                        } else {
                            e81Var2 = null;
                        }
                        e81Var.e = e81Var2;
                    }
                }
                tl.U(vr2VarB, vr2VarK, in0VarE);
                boolean zF2 = go0Var.f(e81Var);
                Object objL2 = go0Var.L();
                if (zF2 || objL2 == ebVar) {
                    objL2 = new v(12, e81Var);
                    go0Var.f0(objL2);
                }
                eu.c(e81Var, (in0) objL2, go0Var);
                ci0.a(myVar.a(e81Var), kwVar, go0Var, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                tl.U(vr2VarB, vr2VarK, in0VarE);
                throw th;
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new f81(obj, i2, g81Var, kwVar, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double a0(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(yw2 yw2Var, rj rjVar) {
        xm2 xm2Var;
        k20 k20Var;
        int size;
        int i2;
        if (rjVar instanceof xm2) {
            xm2Var = (xm2) rjVar;
            int i3 = xm2Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xm2Var.m = i3 - Integer.MIN_VALUE;
            } else {
                xm2Var = new xm2(rjVar);
            }
        }
        Object objA = xm2Var.l;
        int i4 = xm2Var.m;
        if (i4 == 0) {
            fg1.T(objA);
            xm2Var.k = yw2Var;
            xm2Var.m = 1;
            objA = yw2Var.a(i12.i, xm2Var);
            k20Var = k20.h;
            if (objA == k20Var) {
            }
            h12 h12Var = (h12) objA;
            List list = h12Var.a;
            size = list.size();
            i2 = 0;
            while (i2 < size) {
            }
            return h12Var;
        }
        if (i4 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yw2Var = xm2Var.k;
        fg1.T(objA);
        h12 h12Var2 = (h12) objA;
        List list2 = h12Var2.a;
        size = list2.size();
        i2 = 0;
        while (i2 < size) {
            if (tp0.n((o12) list2.get(i2))) {
                i2++;
            } else {
                xm2Var.k = yw2Var;
                xm2Var.m = 1;
                objA = yw2Var.a(i12.i, xm2Var);
                k20Var = k20.h;
                if (objA == k20Var) {
                    return k20Var;
                }
                h12 h12Var22 = (h12) objA;
                List list22 = h12Var22.a;
                size = list22.size();
                i2 = 0;
                while (i2 < size) {
                }
            }
        }
        return h12Var22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b0() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int c(t91 t91Var, long j2, za3 za3Var) {
        long jS;
        int iB;
        z03 z03VarD = t91Var.d();
        if (z03VarD != null) {
            lj1 lj1Var = z03VarD.a.b;
            c61 c61VarC = t91Var.c();
            if (c61VarC != null && (iB = B(lj1Var, (jS = c61VarC.s(j2)), za3Var)) != -1) {
                return lj1Var.g(rs1.a((lj1Var.b(iB) + lj1Var.f(iB)) / 2.0f, 1, jS));
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 c0(uh1 uh1Var, oc ocVar) {
        return uh1Var.c(new d01(ocVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long d(t91 t91Var, o62 o62Var, o62 o62Var2, int i2) {
        long jD = D(t91Var, o62Var, i2);
        if (f13.c(jD)) {
            return f13.b;
        }
        long jD2 = D(t91Var, o62Var2, i2);
        if (f13.c(jD2)) {
            return f13.b;
        }
        int i3 = (int) (jD >> 32);
        int i4 = (int) (jD2 & 4294967295L);
        return fg1.i(Math.min(i3, i3), Math.max(i4, i4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean e(y03 y03Var, int i2) {
        lj1 lj1Var = y03Var.b;
        int iD = lj1Var.d(i2);
        return i2 == y03Var.f(iD) || i2 == lj1Var.c(iD, false) ? y03Var.g(i2) != y03Var.a(i2) : y03Var.a(i2) != y03Var.a(i2 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long f(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(yw2 yw2Var, kz2 kz2Var, h12 h12Var, int i2, rj rjVar) {
        bn2 bn2Var;
        long j2;
        b72 b72Var;
        if (rjVar instanceof bn2) {
            bn2Var = (bn2) rjVar;
            int i3 = bn2Var.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bn2Var.p = i3 - Integer.MIN_VALUE;
            } else {
                bn2Var = new bn2(rjVar);
            }
        }
        Object objJ = bn2Var.o;
        int i4 = bn2Var.p;
        a83 a83Var = a83.a;
        int i5 = 2;
        k20 k20Var = k20.h;
        try {
            if (i4 == 0) {
                fg1.T(objJ);
                o12 o12Var = (o12) du.o0(h12Var.a);
                j2 = o12Var.a;
                kz2Var.b(o12Var.c, i2 > 2 ? gd3.J : gd3.I);
                b72Var = new b72();
                b72Var.h = 9205357640488583168L;
                long jC = yw2Var.e().c();
                cn2 cn2Var = new cn2(j2, b72Var, null);
                bn2Var.k = yw2Var;
                bn2Var.l = kz2Var;
                bn2Var.m = b72Var;
                bn2Var.n = j2;
                bn2Var.p = 1;
                objJ = yw2Var.j(jC, cn2Var, bn2Var);
                if (objJ == k20Var) {
                }
                return k20Var;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kz2Var = bn2Var.l;
                yw2Var = bn2Var.k;
                fg1.T(objJ);
                if (!((Boolean) objJ).booleanValue()) {
                    kz2Var.onCancel();
                    return a83Var;
                }
                List list = yw2Var.m.z.a;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    o12 o12Var2 = (o12) list.get(i6);
                    if (tp0.p(o12Var2)) {
                        o12Var2.a();
                    }
                }
                kz2Var.a();
                return a83Var;
            }
            long j3 = bn2Var.n;
            b72Var = bn2Var.m;
            kz2 kz2Var2 = bn2Var.l;
            yw2 yw2Var2 = bn2Var.k;
            try {
                fg1.T(objJ);
                j2 = j3;
                kz2Var = kz2Var2;
                yw2Var = yw2Var2;
            } catch (CancellationException e2) {
                e = e2;
                kz2Var = kz2Var2;
                kz2Var.onCancel();
                throw e;
            }
            ua0 ua0Var = (ua0) objJ;
            if (ua0Var == null) {
                ua0Var = ua0.j;
            }
            if (ua0Var == ua0.k) {
                kz2Var.onCancel();
                return a83Var;
            }
            if (ua0Var == ua0.h) {
                kz2Var.a();
                return a83Var;
            }
            if (ua0Var == ua0.i) {
                kz2Var.e(b72Var.h);
            }
            cd1 cd1Var = new cd1(kz2Var, i5);
            bn2Var.k = yw2Var;
            bn2Var.l = kz2Var;
            bn2Var.m = null;
            bn2Var.p = 2;
            objJ = yb0.d(yw2Var, j2, cd1Var, bn2Var);
        } catch (CancellationException e3) {
            e = e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean h(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Bitmap i(d9 d9Var) {
        if (d9Var instanceof d9) {
            return d9Var.a;
        }
        c80.t("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object j(s12 s12Var, er2 er2Var, kz2 kz2Var, t00 t00Var) {
        zw2 zw2Var = (zw2) s12Var;
        zw2Var.getClass();
        Object objP = sp0.p(s12Var, new ym2(new e9(sp0.c0(zw2Var).H), er2Var, kz2Var, null), t00Var);
        return objP == k20.h ? objP : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double l(double d2) {
        double dPow = Math.pow(Math.abs(d2), 0.42d);
        return ((((double) (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String m(String str) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i2 = inputStream.read(bArr);
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            i2 = inputStream.read(bArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jc2 o(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            jc2 jc2Var = new jc2();
            new LinkedHashMap();
            jc2Var.a = new cj(ce0.h);
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
        pe1 pe1VarB = pe1Var.b();
        jc2 jc2Var2 = new jc2();
        new LinkedHashMap();
        jc2Var2.a = new cj(pe1VarB);
        return jc2Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: gy */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object p(gy gyVar, e42 e42Var) {
        if (!((th1) gyVar).h.u) {
            kz0.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        yy1 yy1Var = (yy1) sp0.c0(gyVar).I;
        yy1Var.getClass();
        return op0.w(yy1Var, e42Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final lp1 q(long j2) {
        return new lp1(false, sp0.c(4278848010L), sp0.c(4279637526L), sp0.c(4280558628L), sp0.c(4294967295L), sp0.c(4287137928L), j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final zj0 r(zj0 zj0Var) {
        return ((zj0Var instanceof hu2) || (zj0Var instanceof ia0)) ? zj0Var : new ia0(zj0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(zj0 zj0Var, mn0 mn0Var, u00 u00Var) {
        kk0 kk0Var;
        o72 o72Var;
        o1 e2;
        ha0 ha0Var;
        hh1 hh1Var = up0.e;
        if (u00Var instanceof kk0) {
            kk0Var = (kk0) u00Var;
            int i2 = kk0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kk0Var.n = i2 - Integer.MIN_VALUE;
            } else {
                kk0Var = new kk0(u00Var);
            }
        }
        Object obj = kk0Var.m;
        int i3 = kk0Var.n;
        if (i3 == 0) {
            fg1.T(obj);
            o72 o72Var2 = new o72();
            o72Var2.i = hh1Var;
            ha0 ha0Var2 = new ha0(mn0Var, o72Var2);
            try {
                kk0Var.k = o72Var2;
                kk0Var.l = ha0Var2;
                kk0Var.n = 1;
                Object objA = zj0Var.a(ha0Var2, kk0Var);
                Object obj2 = k20.h;
                if (objA == obj2) {
                    return obj2;
                }
                o72Var = o72Var2;
            } catch (o1 e3) {
                o72Var = o72Var2;
                e2 = e3;
                ha0Var = ha0Var2;
                if (e2.h == ha0Var) {
                    throw e2;
                }
                a20 a20Var = kk0Var.i;
                a20Var.getClass();
                xe1.n(a20Var);
            }
        } else {
            if (i3 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ha0Var = kk0Var.l;
            o72Var = kk0Var.k;
            try {
                fg1.T(obj);
            } catch (o1 e4) {
                e2 = e4;
                if (e2.h == ha0Var) {
                }
            }
        }
        Object obj3 = o72Var.i;
        if (obj3 != hh1Var) {
            return obj3;
        }
        um2.i("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ug1 t(DexKitBridge dexKitBridge, r rVar) {
        dexKitBridge.getClass();
        int iB = rVar.b(10);
        int i2 = iB != 0 ? rVar.b.getInt(iB + rVar.a) : 0;
        if ((i2 & 131072) > 0) {
            i2 = (i2 ^ 131072) | 32;
        }
        int i3 = i2;
        int iB2 = rVar.b(4);
        int i4 = iB2 != 0 ? rVar.b.getInt(iB2 + rVar.a) : 0;
        int iB3 = rVar.b(6);
        int i5 = iB3 != 0 ? rVar.b.getInt(iB3 + rVar.a) : 0;
        int iB4 = rVar.b(8);
        int i6 = iB4 != 0 ? rVar.b.getInt(iB4 + rVar.a) : 0;
        int iB5 = rVar.b(12);
        String strD = iB5 != 0 ? rVar.d(iB5 + rVar.a) : null;
        if (strD == null) {
            strD = "";
        }
        String str = strD;
        int iB6 = rVar.b(14);
        int i7 = iB6 != 0 ? rVar.b.getInt(iB6 + rVar.a) : 0;
        ArrayList arrayList = new ArrayList();
        int iB7 = rVar.b(16);
        int iF = iB7 != 0 ? rVar.f(iB7) : 0;
        for (int i8 = 0; i8 < iF; i8++) {
            int iB8 = rVar.b(16);
            arrayList.add(Integer.valueOf(iB8 != 0 ? rVar.b.getInt((i8 * 4) + rVar.e(iB8)) : 0));
        }
        return new ug1(dexKitBridge, i4, i5, i6, i3, str, i7, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final bt v(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return d72.a(clsAnnotationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Rect w(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i4, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i4, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        return rect3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String x(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Class y(bt btVar) {
        btVar.getClass();
        Class clsA = btVar.a();
        clsA.getClass();
        return clsA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class z(bt btVar) {
        btVar.getClass();
        Class clsA = btVar.a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
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
        return clsA;
    }

    public abstract p40 P(bt btVar, Object obj);

    public abstract void k();

    public abstract Object u(bt btVar);
}
