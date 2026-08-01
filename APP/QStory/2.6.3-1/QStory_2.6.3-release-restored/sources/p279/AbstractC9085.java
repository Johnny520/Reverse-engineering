package p279;

import com.android.p002dx.p005io.Opcodes;
import p263.AbstractC8986;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰世苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9085 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final double[][] f23207 = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final double[][] f23206 = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final double[][] f23205 = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final double[] f23204 = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final double[] f23203 = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m14379(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static double m14380(double d) {
        double dAbs = Math.abs(d);
        return Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d) * ((double) (d < 0.0d ? -1 : d == 0.0d ? 0 : 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static double m14381(double[] dArr) {
        dArr.getClass();
        double[] dArrM14165 = AbstractC8986.m14165(dArr, f23206);
        double dM14383 = m14383(dArrM14165[0]);
        double dM143832 = m14383(dArrM14165[1]);
        double dM143833 = m14383(dArrM14165[2]);
        return Math.atan2(((dM14383 + dM143832) - (dM143833 * 2.0d)) / 9.0d, ((((-12.0d) * dM143832) + (dM14383 * 11.0d)) + dM143833) / 11.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c8, code lost:
    
        r5 = r1[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d1, code lost:
    
        if (r5 > 100.01d) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d7, code lost:
    
        if (r1[1] > 100.01d) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01dd, code lost:
    
        if (r1[2] <= 100.01d) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e0, code lost:
    
        r1 = (p263.AbstractC8986.m14168(r1[2]) & com.android.p002dx.p005io.Opcodes.CONST_METHOD_TYPE) | ((((p263.AbstractC8986.m14168(r5) & com.android.p002dx.p005io.Opcodes.CONST_METHOD_TYPE) << 16) | (-16777216)) | ((p263.AbstractC8986.m14168(r1[1]) & com.android.p002dx.p005io.Opcodes.CONST_METHOD_TYPE) << 8));
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C9084 m14382(double d, double d2, double d3) {
        int iM14168;
        int i;
        int iM141682;
        double d4;
        int i2;
        double[] dArr;
        double d5;
        int i3;
        int iCeil;
        double dFloor;
        double[] dArr2;
        double dM14381;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10 = d % 360.0d;
        if (d10 < 0.0d) {
            d10 += 360.0d;
        }
        if (d2 >= 1.0E-4d && d3 >= 1.0E-4d && d3 <= 99.9999d) {
            double d11 = (d10 / 180.0d) * 3.141592653589793d;
            double d12 = (d3 + 16.0d) / 116.0d;
            double d13 = d12 * d12 * d12;
            if (d13 <= 0.008856451679035631d) {
                d13 = ((116.0d * d12) - 16.0d) / 903.2962962962963d;
            }
            double d14 = d13 * 100.0d;
            double dSqrt = Math.sqrt(d14) * 11.0d;
            C9083 c9083 = C9083.f23188;
            double d15 = 100.0d;
            double dPow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, c9083.f23194), 0.73d);
            double dCos = (Math.cos(d11 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * c9083.f23189 * c9083.f23191;
            double dSin = Math.sin(d11);
            double dCos2 = Math.cos(d11);
            int i4 = 0;
            while (true) {
                d4 = d15;
                i2 = 8;
                dArr = f23204;
                if (i4 >= 5) {
                    d5 = d14;
                    i3 = 1;
                    break;
                }
                d5 = d14;
                double d16 = dSqrt / d4;
                double dPow2 = Math.pow(((d2 == 0.0d || dSqrt == 0.0d) ? 0.0d : d2 / Math.sqrt(d16)) * dPow, 1.1111111111111112d);
                i3 = 1;
                double d17 = dPow;
                double dPow3 = (Math.pow(d16, (1.0d / c9083.f23190) / c9083.f23198) * c9083.f23193) / c9083.f23192;
                double d18 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((dPow2 * 108.0d) * dSin) + (((11.0d * dPow2) * dCos2) + (23.0d * dCos)));
                double d19 = d18 * dCos2;
                double d20 = d18 * dSin;
                double d21 = dPow3 * 460.0d;
                double[] dArrM14165 = AbstractC8986.m14165(new double[]{m14380(((288.0d * d20) + ((451.0d * d19) + d21)) / 1403.0d), m14380(((d21 - (891.0d * d19)) - (261.0d * d20)) / 1403.0d), m14380(((d21 - (d19 * 220.0d)) - (d20 * 6300.0d)) / 1403.0d)}, f23205);
                double d22 = dArrM14165[0];
                if (d22 < 0.0d) {
                    break;
                }
                double d23 = dArrM14165[1];
                if (d23 < 0.0d) {
                    break;
                }
                double d24 = dArrM14165[2];
                if (d24 < 0.0d) {
                    break;
                }
                double d25 = (dArr[2] * d24) + (dArr[1] * d23) + (dArr[0] * d22);
                if (d25 <= 0.0d) {
                    break;
                }
                if (i4 == 4) {
                    break;
                }
                double d26 = d25 - d5;
                if (Math.abs(d26) < 0.002d) {
                    break;
                }
                dSqrt -= (d26 * dSqrt) / (d25 * 2.0d);
                i4++;
                d15 = d4;
                d14 = d5;
                dPow = d17;
            }
            iM141682 = 0;
            if (iM141682 == 0) {
                double[] dArr3 = new double[3];
                dArr3[0] = -1.0d;
                dArr3[i3] = -1.0d;
                dArr3[2] = -1.0d;
                double[] dArr4 = dArr3;
                double d27 = 0.0d;
                double d28 = 0.0d;
                boolean z = false;
                int i5 = 0;
                int i6 = i3;
                while (i5 < 12) {
                    double d29 = dArr[0];
                    double d30 = dArr[i3];
                    double d31 = dArr[2];
                    double d32 = i5 % 4 <= i3 ? 0.0d : d4;
                    double d33 = i5 % 2 == 0 ? 0.0d : d4;
                    if (i5 < 4) {
                        double d34 = ((d5 - (d30 * d32)) - (d31 * d33)) / d29;
                        dArr2 = m14379(d34) ? new double[]{d34, d32, d33} : new double[]{-1.0d, -1.0d, -1.0d};
                    } else if (i5 < i2) {
                        double d35 = ((d5 - (d29 * d33)) - (d31 * d32)) / d30;
                        dArr2 = m14379(d35) ? new double[]{d33, d35, d32} : new double[]{-1.0d, -1.0d, -1.0d};
                    } else {
                        double d36 = ((d5 - (d29 * d32)) - (d30 * d33)) / d31;
                        dArr2 = m14379(d36) ? new double[]{d32, d33, d36} : new double[]{-1.0d, -1.0d, -1.0d};
                    }
                    if (dArr2[0] < 0.0d) {
                        dM14381 = d28;
                        d8 = d27;
                    } else {
                        dM14381 = m14381(dArr2);
                        if (z) {
                            if (i6 == 0) {
                                double d37 = d27;
                                double d38 = d28;
                                boolean zM14384 = m14384(d37, dM14381, d38);
                                d8 = d37;
                                d6 = dM14381;
                                dM14381 = d38;
                                if (zM14384) {
                                    d7 = d8;
                                }
                            } else {
                                d6 = dM14381;
                                dM14381 = d28;
                                d7 = d27;
                            }
                            double d39 = d11;
                            double d40 = d6;
                            d8 = d7;
                            d9 = d39;
                            if (m14384(d7, d39, d40)) {
                                dArr4 = dArr2;
                                i6 = 0;
                                dM14381 = d40;
                            } else {
                                dArr3 = dArr2;
                                i6 = 0;
                                d8 = d40;
                            }
                        } else {
                            d9 = d11;
                            dArr3 = dArr2;
                            dArr4 = dArr3;
                            d8 = dM14381;
                            z = true;
                        }
                        i5++;
                        d11 = d9;
                        d27 = d8;
                        d28 = dM14381;
                        i2 = 8;
                        i3 = 1;
                    }
                    d9 = d11;
                    i5++;
                    d11 = d9;
                    d27 = d8;
                    d28 = dM14381;
                    i2 = 8;
                    i3 = 1;
                }
                double d41 = d11;
                double[][] dArr5 = {dArr3, dArr4};
                double[] dArr6 = dArr5[0];
                double dM143812 = m14381(dArr6);
                double[] dArr7 = dArr5[1];
                for (int i7 = 0; i7 < 3; i7++) {
                    double d42 = dArr6[i7];
                    double d43 = dArr7[i7];
                    if (d42 != d43) {
                        if (d42 < d43) {
                            iCeil = (int) Math.floor(m14385(d42) - 0.5d);
                            dFloor = Math.ceil(m14385(dArr7[i7]) - 0.5d);
                        } else {
                            iCeil = (int) Math.ceil(m14385(d42) - 0.5d);
                            dFloor = Math.floor(m14385(dArr7[i7]) - 0.5d);
                        }
                        int i8 = (int) dFloor;
                        for (int i9 = 0; i9 < 8 && Math.abs(i8 - iCeil) > 1; i9++) {
                            int iFloor = (int) Math.floor(((double) (iCeil + i8)) / 2.0d);
                            double d44 = f23203[iFloor];
                            double d45 = dArr6[i7];
                            double d46 = (d44 - d45) / (dArr7[i7] - d45);
                            double d47 = dArr6[0];
                            double d48 = ((dArr7[0] - d47) * d46) + d47;
                            double d49 = dArr6[1];
                            double d50 = ((dArr7[1] - d49) * d46) + d49;
                            double d51 = dArr6[2];
                            double[] dArr8 = {d48, d50, ((dArr7[2] - d51) * d46) + d51};
                            double dM143813 = m14381(dArr8);
                            double d52 = dM143812;
                            if (m14384(d52, d41, dM143813)) {
                                i8 = iFloor;
                                dArr7 = dArr8;
                                dM143812 = d52;
                            } else {
                                iCeil = iFloor;
                                dArr6 = dArr8;
                                dM143812 = dM143813;
                            }
                        }
                        dM143812 = dM143812;
                    }
                }
                double[] dArr9 = {(dArr6[0] + dArr7[0]) / 2.0d, (dArr6[1] + dArr7[1]) / 2.0d, (dArr6[2] + dArr7[2]) / 2.0d};
                int iM141683 = AbstractC8986.m14168(dArr9[0]);
                int iM141684 = AbstractC8986.m14168(dArr9[1]);
                int iM141685 = AbstractC8986.m14168(dArr9[2]);
                i = ((iM141683 & Opcodes.CONST_METHOD_TYPE) << 16) | (-16777216) | ((iM141684 & Opcodes.CONST_METHOD_TYPE) << 8);
                iM14168 = iM141685 & Opcodes.CONST_METHOD_TYPE;
            }
            return new C9084(iM141682);
        }
        iM14168 = AbstractC8986.m14168(AbstractC8986.m14164(d3)) & Opcodes.CONST_METHOD_TYPE;
        i = (iM14168 << 16) | (-16777216) | (iM14168 << 8);
        iM141682 = iM14168 | i;
        return new C9084(iM141682);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static double m14383(double d) {
        double dPow = Math.pow(Math.abs(d), 0.42d);
        return ((((double) (d < 0.0d ? -1 : d == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m14384(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static double m14385(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }
}
