package p000;

import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r60 {

    /* JADX INFO: renamed from: a */
    public static r00 f5305a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final void m3392A(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final void m3393B(List list, C0118d6 c0118d6) {
        wp0 wp0Var;
        float f;
        float f2;
        float f3;
        Path path = c0118d6.f973a;
        Path path2 = c0118d6.f973a;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path2.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path2.setFillType(fillType2);
        wp0 wp0Var2 = list.isEmpty() ? lp0.f3578b : (wp0) list.get(0);
        int size = list.size();
        float f4 = 0.0f;
        int i = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (i < size) {
            wp0 wp0Var3 = (wp0) list.get(i);
            if (wp0Var3 instanceof lp0) {
                path2.close();
                wp0Var = wp0Var3;
                f5 = f7;
                f9 = f5;
                f6 = f8;
                f10 = f6;
            } else if (wp0Var3 instanceof pp0) {
                pp0 pp0Var = (pp0) wp0Var3;
                f7 = pp0Var.f4939b;
                f8 = pp0Var.f4940c;
                path2.moveTo(f7, f8);
                wp0Var = wp0Var3;
                f9 = f7;
                f10 = f8;
            } else {
                if (wp0Var3 instanceof tp0) {
                    tp0 tp0Var = (tp0) wp0Var3;
                    float f11 = tp0Var.f6034c;
                    float f12 = tp0Var.f6033b;
                    path2.rLineTo(f12, f11);
                    f9 += f12;
                    f10 += f11;
                } else if (wp0Var3 instanceof op0) {
                    op0 op0Var = (op0) wp0Var3;
                    float f13 = op0Var.f4603c;
                    float f14 = op0Var.f4602b;
                    path2.lineTo(f14, f13);
                    f9 = f14;
                    wp0Var = wp0Var3;
                    f10 = f13;
                } else if (wp0Var3 instanceof sp0) {
                    float f15 = ((sp0) wp0Var3).f5818b;
                    path2.rLineTo(f15, f4);
                    f9 += f15;
                } else if (wp0Var3 instanceof np0) {
                    path2.lineTo(7.0f, f10);
                    f9 = 7.0f;
                } else if (wp0Var3 instanceof vp0) {
                    float f16 = ((vp0) wp0Var3).f6805b;
                    path2.rLineTo(f4, f16);
                    f10 += f16;
                } else {
                    if (wp0Var3 instanceof rp0) {
                        rp0 rp0Var = (rp0) wp0Var3;
                        wp0Var = wp0Var3;
                        path2.rCubicTo(rp0Var.f5525b, rp0Var.f5526c, rp0Var.f5527d, rp0Var.f5528e, rp0Var.f5529f, rp0Var.f5530g);
                        f5 = rp0Var.f5527d + f9;
                        f6 = rp0Var.f5528e + f10;
                        f9 += rp0Var.f5529f;
                        f3 = rp0Var.f5530g;
                    } else {
                        wp0Var = wp0Var3;
                        if (wp0Var instanceof mp0) {
                            mp0 mp0Var = (mp0) wp0Var;
                            path2.cubicTo(mp0Var.f4016b, mp0Var.f4017c, mp0Var.f4018d, mp0Var.f4019e, mp0Var.f4020f, mp0Var.f4021g);
                            f5 = mp0Var.f4018d;
                            f6 = mp0Var.f4019e;
                            float f17 = mp0Var.f4020f;
                            f10 = mp0Var.f4021g;
                            f9 = f17;
                        } else if (wp0Var instanceof up0) {
                            if (wp0Var2.f7168a) {
                                f2 = f10 - f6;
                                f = f9 - f5;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                            }
                            up0 up0Var = (up0) wp0Var;
                            path2.rCubicTo(f, f2, up0Var.f6280b, up0Var.f6281c, 10.0f, up0Var.f6282d);
                            f5 = up0Var.f6280b + f9;
                            f6 = up0Var.f6281c + f10;
                            f9 += 10.0f;
                            f3 = up0Var.f6282d;
                        } else {
                            if (!(wp0Var instanceof qp0)) {
                                C0921xc.m5129j();
                                return;
                            }
                            if (wp0Var2.f7168a) {
                                f9 = (f9 * 2.0f) - f5;
                                f10 = (f10 * 2.0f) - f6;
                            }
                            path2.cubicTo(f9, f10, 17.52f, 2.0f, 12.0f, 2.0f);
                            f9 = 12.0f;
                            f6 = 2.0f;
                            f10 = 2.0f;
                            f5 = 17.52f;
                        }
                    }
                    f10 += f3;
                }
                wp0Var = wp0Var3;
            }
            i++;
            wp0Var2 = wp0Var;
            f4 = 0.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static void m3394C(float[] fArr, float f, float f2) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x0047 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0071 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x002a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x002a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x007a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [sw] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [oe0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX INFO: renamed from: D */
    public static final void m3395D(oe0 oe0Var, Object obj, InterfaceC0742sw interfaceC0742sw) {
        mj0 mj0Var;
        if (!oe0Var.f4529d.f4542q) {
            w10.m4824b("visitAncestors called on an unattached node");
        }
        oe0 oe0Var2 = oe0Var.f4529d.f4533h;
        b60 b60VarM3039Q = pf1.m3039Q(oe0Var);
        while (b60VarM3039Q != null) {
            if ((b60VarM3039Q.f395I.f3998f.f4532g & 262144) != 0) {
                while (oe0Var2 != null) {
                    if ((oe0Var2.f4531f & 262144) != 0) {
                        ?? M3050f = oe0Var2;
                        ?? sh0Var = 0;
                        while (M3050f != 0) {
                            if (M3050f instanceof h91) {
                                h91 h91Var = (h91) M3050f;
                                if (!(obj.equals(h91Var.mo1247k()) ? ((Boolean) interfaceC0742sw.invoke(h91Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((M3050f.f4531f & 262144) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                oe0 oe0Var3 = ((AbstractC0731sm) M3050f).f5782s;
                                int i = 0;
                                M3050f = M3050f;
                                sh0Var = sh0Var;
                                while (oe0Var3 != null) {
                                    if ((oe0Var3.f4531f & 262144) != 0) {
                                        i++;
                                        sh0Var = sh0Var;
                                        if (i == 1) {
                                            M3050f = oe0Var3;
                                        } else {
                                            if (sh0Var == 0) {
                                                sh0Var = new sh0(new oe0[16]);
                                            }
                                            if (M3050f != 0) {
                                                sh0Var.m4072b(M3050f);
                                                M3050f = 0;
                                            }
                                            sh0Var.m4072b(oe0Var3);
                                        }
                                    }
                                    oe0Var3 = oe0Var3.f4534i;
                                    M3050f = M3050f;
                                    sh0Var = sh0Var;
                                }
                                if (i == 1) {
                                }
                            }
                            M3050f = pf1.m3050f(sh0Var);
                        }
                    }
                    oe0Var2 = oe0Var2.f4533h;
                }
            }
            b60VarM3039Q = b60VarM3039Q.m315v();
            oe0Var2 = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x0093 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x00a2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0048 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0048 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x009c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [sw] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [oe0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: E */
    public static final void m3396E(InterfaceC0694rm interfaceC0694rm, String str, InterfaceC0742sw interfaceC0742sw) {
        if (!((oe0) interfaceC0694rm).f4529d.f4542q) {
            w10.m4824b("visitSubtreeIf called on an unattached node");
        }
        sh0 sh0Var = new sh0(new oe0[16]);
        oe0 oe0Var = ((oe0) interfaceC0694rm).f4529d;
        oe0 oe0Var2 = oe0Var.f4534i;
        if (oe0Var2 == null) {
            pf1.m3049e(sh0Var, oe0Var);
        } else {
            sh0Var.m4072b(oe0Var2);
        }
        while (true) {
            int i = sh0Var.f5770f;
            if (i == 0) {
                return;
            }
            oe0 oe0Var3 = (oe0) sh0Var.m4081k(i - 1);
            if ((oe0Var3.f4532g & 262144) != 0) {
                for (oe0 oe0Var4 = oe0Var3; oe0Var4 != null && oe0Var4.f4542q; oe0Var4 = oe0Var4.f4534i) {
                    if ((oe0Var4.f4531f & 262144) != 0) {
                        ?? M3050f = oe0Var4;
                        ?? sh0Var2 = 0;
                        while (M3050f != 0) {
                            if (M3050f instanceof h91) {
                                h91 h91Var = (h91) M3050f;
                                g91 g91Var = str.equals(h91Var.mo1247k()) ? (g91) interfaceC0742sw.invoke(h91Var) : g91.f1893d;
                                if (g91Var == g91.f1895f) {
                                    return;
                                }
                                if (g91Var == g91.f1894e) {
                                    break;
                                }
                            } else if ((M3050f.f4531f & 262144) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                oe0 oe0Var5 = ((AbstractC0731sm) M3050f).f5782s;
                                int i2 = 0;
                                M3050f = M3050f;
                                sh0Var2 = sh0Var2;
                                while (oe0Var5 != null) {
                                    if ((oe0Var5.f4531f & 262144) != 0) {
                                        i2++;
                                        sh0Var2 = sh0Var2;
                                        if (i2 == 1) {
                                            M3050f = oe0Var5;
                                        } else {
                                            if (sh0Var2 == 0) {
                                                sh0Var2 = new sh0(new oe0[16]);
                                            }
                                            if (M3050f != 0) {
                                                sh0Var2.m4072b(M3050f);
                                                M3050f = 0;
                                            }
                                            sh0Var2.m4072b(oe0Var5);
                                        }
                                    }
                                    oe0Var5 = oe0Var5.f4534i;
                                    M3050f = M3050f;
                                    sh0Var2 = sh0Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3050f = pf1.m3050f(sh0Var2);
                        }
                    }
                }
            }
            pf1.m3049e(sh0Var, oe0Var3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x00a2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x00b1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0049 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x0049 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x00ab */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [h91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [sw] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: F */
    public static final void m3397F(h91 h91Var, InterfaceC0742sw interfaceC0742sw) {
        if (!((oe0) h91Var).f4529d.f4542q) {
            w10.m4824b("visitSubtreeIf called on an unattached node");
        }
        sh0 sh0Var = new sh0(new oe0[16]);
        oe0 oe0Var = ((oe0) h91Var).f4529d;
        oe0 oe0Var2 = oe0Var.f4534i;
        if (oe0Var2 == null) {
            pf1.m3049e(sh0Var, oe0Var);
        } else {
            sh0Var.m4072b(oe0Var2);
        }
        while (true) {
            int i = sh0Var.f5770f;
            if (i == 0) {
                return;
            }
            oe0 oe0Var3 = (oe0) sh0Var.m4081k(i - 1);
            if ((oe0Var3.f4532g & 262144) != 0) {
                for (oe0 oe0Var4 = oe0Var3; oe0Var4 != null && oe0Var4.f4542q; oe0Var4 = oe0Var4.f4534i) {
                    if ((oe0Var4.f4531f & 262144) != 0) {
                        ?? M3050f = oe0Var4;
                        ?? sh0Var2 = 0;
                        while (M3050f != 0) {
                            if (M3050f instanceof h91) {
                                h91 h91Var2 = (h91) M3050f;
                                g91 g91Var = (p30.m3002l(h91Var.mo1247k(), h91Var2.mo1247k()) && h91Var.getClass() == h91Var2.getClass()) ? (g91) interfaceC0742sw.invoke(h91Var2) : g91.f1893d;
                                if (g91Var == g91.f1895f) {
                                    return;
                                }
                                if (g91Var == g91.f1894e) {
                                    break;
                                }
                            } else if ((M3050f.f4531f & 262144) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                oe0 oe0Var5 = ((AbstractC0731sm) M3050f).f5782s;
                                int i2 = 0;
                                M3050f = M3050f;
                                sh0Var2 = sh0Var2;
                                while (oe0Var5 != null) {
                                    if ((oe0Var5.f4531f & 262144) != 0) {
                                        i2++;
                                        sh0Var2 = sh0Var2;
                                        if (i2 == 1) {
                                            M3050f = oe0Var5;
                                        } else {
                                            if (sh0Var2 == 0) {
                                                sh0Var2 = new sh0(new oe0[16]);
                                            }
                                            if (M3050f != 0) {
                                                sh0Var2.m4072b(M3050f);
                                                M3050f = 0;
                                            }
                                            sh0Var2.m4072b(oe0Var5);
                                        }
                                    }
                                    oe0Var5 = oe0Var5.f4534i;
                                    M3050f = M3050f;
                                    sh0Var2 = sh0Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3050f = pf1.m3050f(sh0Var2);
                        }
                    }
                }
            }
            pf1.m3049e(sh0Var, oe0Var3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final double m3398G(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3399a(final C0399km c0399km, final pe0 pe0Var, jn0 jn0Var, C0496n2 c0496n2, C0239ga c0239ga, f21 f21Var, boolean z, aj0 aj0Var, C0496n2 c0496n22, C0343j5 c0343j5, final C0474mh c0474mh, InterfaceC0356ji interfaceC0356ji, final int i) {
        final jn0 jn0Var2;
        final C0496n2 c0496n23;
        final C0239ga c0239ga2;
        final f21 f21Var2;
        final boolean z2;
        final aj0 aj0Var2;
        final C0496n2 c0496n24;
        final C0343j5 c0343j52;
        f21 f21Var3;
        C0343j5 c0343j5M359a;
        C0239ga c0239ga3;
        aj0 aj0Var3;
        int i2;
        C0496n2 c0496n25;
        jn0 jn0Var3;
        boolean z3;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1860873769);
        int i3 = i | (c0616pi.m3104f(c0399km) ? 4 : 2) | (c0616pi.m3104f(pe0Var) ? 32 : 16) | 911961472;
        if (c0616pi.m3082O(i3 & 1, (306783379 & i3) != 306783378)) {
            c0616pi.m3087T();
            if ((i & 1) == 0 || c0616pi.m3128y()) {
                ln0 ln0Var = new ln0(0.0f, 0.0f, 0.0f, 0.0f);
                C0496n2 c0496n26 = C0496n2.f4135O;
                C0239ga c0239ga4 = C0496n2.f4155o;
                int i4 = (i3 & 14) | 196608;
                do0 do0Var = new do0();
                C0478ml c0478mlM2429a = m31.m2429a(c0616pi);
                Map map = xc1.f7330a;
                o31 o31VarM4028O = s91.m4028O(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                InterfaceC0968ym interfaceC0968ym = (InterfaceC0968ym) c0616pi.m3112j(AbstractC0131dj.f1121h);
                k50 k50Var = (k50) c0616pi.m3112j(AbstractC0131dj.f1127n);
                boolean zM3104f = ((((i4 & 14) ^ 6) > 4 && c0616pi.m3104f(c0399km)) || (i4 & 6) == 4) | c0616pi.m3104f(c0478mlM2429a) | c0616pi.m3104f(o31VarM4028O) | c0616pi.m3104f(do0Var) | c0616pi.m3104f(interfaceC0968ym) | c0616pi.m3100d(k50Var.ordinal());
                Object objM3080L = c0616pi.m3080L();
                C0675r3 c0675r3 = C0320ii.f2572a;
                if (zM3104f || objM3080L == c0675r3) {
                    f21 f21Var4 = new f21(new eo0(c0399km, new qn0(i, c0399km, k50Var), do0Var), c0478mlM2429a, o31VarM4028O);
                    c0616pi.m3107g0(f21Var4);
                    objM3080L = f21Var4;
                }
                f21 f21Var5 = (f21) objM3080L;
                int i5 = i3 & (-29360129);
                int i6 = (i3 & 14) | 432;
                i = ((((i6 & 14) ^ 6) > 4 && c0616pi.m3104f(c0399km)) || (i6 & 6) == 4) ? 1 : 0;
                Object objM3080L2 = c0616pi.m3080L();
                if (i != 0 || objM3080L2 == c0675r3) {
                    objM3080L2 = new C0360jm(c0399km);
                    c0616pi.m3107g0(objM3080L2);
                }
                C0496n2 c0496n27 = C0496n2.f4140T;
                f21Var3 = f21Var5;
                c0343j5M359a = bn0.m359a(c0616pi);
                c0239ga3 = c0239ga4;
                aj0Var3 = (C0360jm) objM3080L2;
                i2 = i5;
                c0496n25 = c0496n26;
                c0496n24 = c0496n27;
                jn0Var3 = ln0Var;
                z3 = true;
            } else {
                c0616pi.m3085R();
                i2 = i3 & (-29360129);
                jn0Var3 = jn0Var;
                c0496n25 = c0496n2;
                c0239ga3 = c0239ga;
                f21Var3 = f21Var;
                z3 = z;
                aj0Var3 = aj0Var;
                c0496n24 = c0496n22;
                c0343j5M359a = c0343j5;
            }
            c0616pi.m3120q();
            w60.m4895b(pe0Var, c0399km, jn0Var3, f21Var3, z3, c0343j5M359a, c0496n25, aj0Var3, c0239ga3, c0496n24, c0474mh, c0616pi, ((i2 << 3) & 112) | ((i2 >> 3) & 14) | 24576 | 907545984, 1797510);
            c0343j52 = c0343j5M359a;
            c0239ga2 = c0239ga3;
            aj0Var2 = aj0Var3;
            z2 = z3;
            c0496n23 = c0496n25;
            f21Var2 = f21Var3;
            jn0Var2 = jn0Var3;
        } else {
            c0616pi.m3085R();
            jn0Var2 = jn0Var;
            c0496n23 = c0496n2;
            c0239ga2 = c0239ga;
            f21Var2 = f21Var;
            z2 = z;
            aj0Var2 = aj0Var;
            c0496n24 = c0496n22;
            c0343j52 = c0343j5;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww(pe0Var, jn0Var2, c0496n23, c0239ga2, f21Var2, z2, aj0Var2, c0496n24, c0343j52, c0474mh, i) { // from class: sn0

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ pe0 f5799e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ jn0 f5800f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ C0496n2 f5801g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C0239ga f5802h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ f21 f5803i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ boolean f5804j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ aj0 f5805k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ C0496n2 f5806l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ C0343j5 f5807m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ C0474mh f5808n;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM1649A = j50.m1649A(1);
                    r60.m3399a(this.f5798d, this.f5799e, this.f5800f, this.f5801g, this.f5802h, this.f5803i, this.f5804j, this.f5805k, this.f5806l, this.f5807m, this.f5808n, (InterfaceC0356ji) obj, iM1649A);
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m3400b(InterfaceC0298hw interfaceC0298hw, final pe0 pe0Var, final d80 d80Var, final r70 r70Var, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1055276397);
        int i2 = (c0616pi.m3108h(interfaceC0298hw) ? 4 : 2) | i | (c0616pi.m3104f(pe0Var) ? 32 : 16) | (c0616pi.m3104f(d80Var) ? 256 : 128) | (c0616pi.m3104f(r70Var) ? 2048 : 1024);
        if (c0616pi.m3082O(i2 & 1, (i2 & 1171) != 1170)) {
            final oh0 oh0VarM3424z = m3424z(interfaceC0298hw, c0616pi);
            v50.m4397a(AbstractC0398kl.m1937w(-933153643, new InterfaceC0941xw() { // from class: p70
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0941xw
                /* JADX INFO: renamed from: a */
                public final Object mo353a(Object obj, Object obj2, Object obj3) {
                    pe0 pe0VarMo2499c;
                    ww0 ww0Var = (ww0) obj;
                    ((Integer) obj3).getClass();
                    C0616pi c0616pi2 = (C0616pi) ((InterfaceC0356ji) obj2);
                    Object objM3080L = c0616pi2.m3080L();
                    C0675r3 c0675r3 = C0320ii.f2572a;
                    if (objM3080L == c0675r3) {
                        objM3080L = new n70(ww0Var, new q70(oh0VarM3424z, 0));
                        c0616pi2.m3107g0(objM3080L);
                    }
                    n70 n70Var = (n70) objM3080L;
                    Object objM3080L2 = c0616pi2.m3080L();
                    if (objM3080L2 == c0675r3) {
                        objM3080L2 = new x41(new C0111d(n70Var));
                        c0616pi2.m3107g0(objM3080L2);
                    }
                    x41 x41Var = (x41) objM3080L2;
                    d80 d80Var2 = d80Var;
                    if (d80Var2 != null) {
                        c0616pi2.m3090W(1743490539);
                        c0616pi2.m3090W(887527095);
                        Object obj4 = es0.f1524a;
                        if (obj4 != null) {
                            c0616pi2.m3090W(1345554384);
                            c0616pi2.m3119p(false);
                        } else {
                            c0616pi2.m3090W(1345603457);
                            View view = (View) c0616pi2.m3112j(AbstractC0676r4.f5294e);
                            boolean zM3104f = c0616pi2.m3104f(view);
                            Object objM3080L3 = c0616pi2.m3080L();
                            if (zM3104f || objM3080L3 == c0675r3) {
                                Object tag = view.getTag(C0587R.id.compose_prefetch_scheduler);
                                objM3080L3 = tag instanceof cs0 ? (cs0) tag : null;
                                if (objM3080L3 == null) {
                                    objM3080L3 = new ViewOnAttachStateChangeListenerC0344j6(view);
                                    view.setTag(C0587R.id.compose_prefetch_scheduler, objM3080L3);
                                }
                                c0616pi2.m3107g0(objM3080L3);
                            }
                            obj4 = (cs0) objM3080L3;
                            c0616pi2.m3119p(false);
                        }
                        Object obj5 = obj4;
                        c0616pi2.m3119p(false);
                        Object[] objArr = {d80Var2, n70Var, x41Var, obj5};
                        boolean zM3104f2 = c0616pi2.m3104f(d80Var2) | c0616pi2.m3108h(n70Var) | c0616pi2.m3108h(x41Var) | c0616pi2.m3108h(obj5);
                        Object objM3080L4 = c0616pi2.m3080L();
                        if (zM3104f2 || objM3080L4 == c0675r3) {
                            objM3080L4 = new C0952y6(d80Var2, n70Var, x41Var, obj5, 1);
                            c0616pi2.m3107g0(objM3080L4);
                        }
                        InterfaceC0742sw interfaceC0742sw = (InterfaceC0742sw) objM3080L4;
                        boolean zM3104f3 = false;
                        for (Object obj6 : Arrays.copyOf(objArr, 4)) {
                            zM3104f3 |= c0616pi2.m3104f(obj6);
                        }
                        Object objM3080L5 = c0616pi2.m3080L();
                        if (zM3104f3 || objM3080L5 == c0675r3) {
                            c0616pi2.m3107g0(new C0481mo(interfaceC0742sw));
                        }
                    } else {
                        c0616pi2.m3090W(1737291469);
                    }
                    c0616pi2.m3119p(false);
                    int i3 = e80.f1342a;
                    pe0 pe0Var2 = pe0Var;
                    if (d80Var2 != null && (pe0VarMo2499c = pe0Var2.mo2499c(new i91(d80Var2))) != null) {
                        pe0Var2 = pe0VarMo2499c;
                    }
                    boolean zM3104f4 = c0616pi2.m3104f(n70Var);
                    r70 r70Var2 = r70Var;
                    boolean zM3104f5 = zM3104f4 | c0616pi2.m3104f(r70Var2);
                    Object objM3080L6 = c0616pi2.m3080L();
                    if (zM3104f5 || objM3080L6 == c0675r3) {
                        objM3080L6 = new C0168ed(5, n70Var, r70Var2);
                        c0616pi2.m3107g0(objM3080L6);
                    }
                    AbstractC0307i4.m1531g(x41Var, pe0Var2, (InterfaceC0904ww) objM3080L6, c0616pi2, 8);
                    return na1.f4229a;
                }
            }, c0616pi), c0616pi, 6);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new n00(interfaceC0298hw, pe0Var, d80Var, r70Var, i, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m3401c(final long j, final s71 s71Var, final InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, final int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-684938728);
        int i2 = (c0616pi.m3102e(j) ? 4 : 2) | i | (c0616pi.m3104f(s71Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0904ww) ? 256 : 128;
        }
        if (c0616pi.m3082O(i2 & 1, (i2 & 147) != 146)) {
            C0174ej c0174ej = d71.f988a;
            AbstractC0307i4.m1527c(new ct0[]{AbstractC0928xj.f7352a.mo206a(new C0207ff(j)), c0174ej.mo206a(((s71) c0616pi.m3112j(c0174ej)).m4013c(s71Var))}, interfaceC0904ww, c0616pi, ((i2 >> 3) & 112) | 8);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: bt0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r60.m3401c(j, s71Var, interfaceC0904ww, (InterfaceC0356ji) obj, j50.m1649A(i | 1));
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m3402d(int i, int i2) {
        if (i < 0 || i2 < 0) {
            x10.m5082a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = l71.f3381c;
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m3403e(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m3404f(qb1 qb1Var, nr0 nr0Var, long j) {
        C0620pm c0620pm = (C0620pm) qb1Var.f5106d;
        c0620pm.getClass();
        tb1 tb1Var = c0620pm.f4926b;
        tb1 tb1Var2 = c0620pm.f4925a;
        boolean zM4902i = w60.m4902i(nr0Var);
        long j2 = nr0Var.f4306b;
        if (zM4902i) {
            C0323il[] c0323ilArr = tb1Var2.f5976d;
            Arrays.fill(c0323ilArr, 0, c0323ilArr.length, (Object) null);
            tb1Var2.f5977e = 0;
            C0323il[] c0323ilArr2 = tb1Var.f5976d;
            Arrays.fill(c0323ilArr2, 0, c0323ilArr2.length, (Object) null);
            tb1Var.f5977e = 0;
            c0620pm.f4927c = 0L;
        }
        if (!w60.m4904k(nr0Var)) {
            List list = nr0Var.f4315k;
            if (list == null) {
                list = C0294hs.f2354d;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0448ly c0448ly = (C0448ly) list.get(i);
                c0620pm.m3142a(c0448ly.f3616a, ok0.m2934e(c0448ly.f3618c, j));
            }
            c0620pm.m3142a(j2, ok0.m2934e(nr0Var.f4316l, j));
        }
        if (w60.m4904k(nr0Var) && j2 - c0620pm.f4927c > 40) {
            C0323il[] c0323ilArr3 = tb1Var2.f5976d;
            Arrays.fill(c0323ilArr3, 0, c0323ilArr3.length, (Object) null);
            tb1Var2.f5977e = 0;
            C0323il[] c0323ilArr4 = tb1Var.f5976d;
            Arrays.fill(c0323ilArr4, 0, c0323ilArr4.length, (Object) null);
            tb1Var.f5977e = 0;
            c0620pm.f4927c = 0L;
        }
        c0620pm.f4927c = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m3405g(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0748t1.m4154l("Expected positive parallelism level, but got ", i).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static float[] m3406h() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static StaticLayout m3407i(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            x10.m5082a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            x10.m5082a("invalid end value");
        }
        if (i3 < 0) {
            x10.m5082a("invalid maxLines value");
        }
        if (i < 0) {
            x10.m5082a("invalid width value");
        }
        if (i4 < 0) {
            x10.m5082a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            builderObtain.setLineBreakConfig(AbstractC0983z0.m5347a().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static dx0 m3408j(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            dx0 dx0Var = new dx0();
            new LinkedHashMap();
            dx0Var.f1207a = new C0681r9(C0330is.f2614d);
            return dx0Var;
        }
        ClassLoader classLoader = dx0.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        fd0 fd0Var = new fd0(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            fd0Var.put(str, bundle.get(str));
        }
        fd0Var.m1081b();
        fd0Var.f1695p = true;
        if (fd0Var.f1691l <= 0) {
            fd0Var = fd0.f1682q;
            fd0Var.getClass();
        }
        dx0 dx0Var2 = new dx0();
        new LinkedHashMap();
        dx0Var2.f1207a = new C0681r9(fd0Var);
        return dx0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final sh0 m3409k() {
        C0541o8 c0541o8 = z21.f7779b;
        sh0 sh0Var = (sh0) c0541o8.m2801e();
        if (sh0Var != null) {
            return sh0Var;
        }
        sh0 sh0Var2 = new sh0(new C0552oi[0]);
        c0541o8.m2808m(sh0Var2);
        return sh0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final C0135dn m3410l(C0496n2 c0496n2, InterfaceC0298hw interfaceC0298hw) {
        C0541o8 c0541o8 = z21.f7778a;
        return new C0135dn(c0496n2, interfaceC0298hw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final C0135dn m3411m(InterfaceC0298hw interfaceC0298hw) {
        C0541o8 c0541o8 = z21.f7778a;
        return new C0135dn(null, interfaceC0298hw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final float m3412n(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final long m3413o(long j, boolean z, int i, float f) {
        int iM3137h = ((z || i == 2 || i == 4 || i == 5) && C0617pj.m3133d(j)) ? C0617pj.m3137h(j) : Integer.MAX_VALUE;
        if (C0617pj.m3139j(j) != iM3137h) {
            iM3137h = w60.m4907n(v50.m4401e(f), C0617pj.m3139j(j), iM3137h);
        }
        return o30.m2775o(0, iM3137h, 0, C0617pj.m3136g(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final String m3414p(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final long m3415q(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final r00 m3416r() {
        r00 r00Var = f5305a;
        if (r00Var != null) {
            return r00Var;
        }
        q00 q00Var = new q00("Filled.Warning");
        int i = ib1.f2505a;
        g31 g31Var = new g31(C0207ff.f1702b);
        C0910x1 c0910x1 = new C0910x1(16);
        c0910x1.m5075o(1.0f, 21.0f);
        c0910x1.m5070j(22.0f);
        c0910x1.m5073m(12.0f, 2.0f);
        c0910x1.m5073m(1.0f, 21.0f);
        c0910x1.m5067g();
        c0910x1.m5075o(13.0f, 18.0f);
        c0910x1.m5070j(-2.0f);
        c0910x1.m5081v(-2.0f);
        c0910x1.m5070j(2.0f);
        c0910x1.m5081v(2.0f);
        c0910x1.m5067g();
        c0910x1.m5075o(13.0f, 14.0f);
        c0910x1.m5070j(-2.0f);
        c0910x1.m5081v(-4.0f);
        c0910x1.m5070j(2.0f);
        c0910x1.m5081v(4.0f);
        c0910x1.m5067g();
        q00.m3181a(q00Var, (ArrayList) c0910x1.f7232e, g31Var);
        r00 r00VarM3182b = q00Var.m3182b();
        f5305a = r00VarM3182b;
        return r00VarM3182b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final long m3417s(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f6 * fIntBitsToFloat2) + (f3 * fIntBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        float f11 = ((f5 * fIntBitsToFloat2) + (f2 * fIntBitsToFloat) + f8) * f10;
        return (((long) Float.floatToRawIntBits((((f4 * fIntBitsToFloat2) + (f * fIntBitsToFloat)) + f7) * f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final void m3418t(float[] fArr, ih0 ih0Var) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = ih0Var.f2568a;
        float f11 = ih0Var.f2569b;
        float f12 = ih0Var.f2570c;
        float f13 = ih0Var.f2571d;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
            f16 = 0.0f;
        }
        float f17 = f * f10;
        float f18 = f4 * f11;
        float f19 = (f17 + f18 + f7) * f16;
        float f20 = f10 * f2;
        float f21 = f11 * f5;
        float f22 = (f20 + f21 + f8) * f16;
        float f23 = f6 * f13;
        float f24 = 1.0f / ((f14 + f23) + f9);
        if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f4 * f13;
        float f26 = (f17 + f25 + f7) * f24;
        float f27 = f5 * f13;
        float f28 = (f20 + f27 + f8) * f24;
        float f29 = f3 * f12;
        float f30 = 1.0f / ((f15 + f29) + f9);
        if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f * f12;
        float f32 = (f31 + f18 + f7) * f30;
        float f33 = f12 * f2;
        float f34 = (f21 + f33 + f8) * f30;
        float f35 = 1.0f / ((f29 + f23) + f9);
        float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
        float f37 = (f31 + f25 + f7) * f36;
        float f38 = (f33 + f27 + f8) * f36;
        ih0Var.f2568a = Math.min(f19, Math.min(f26, Math.min(f32, f37)));
        ih0Var.f2569b = Math.min(f22, Math.min(f28, Math.min(f34, f38)));
        ih0Var.f2570c = Math.max(f19, Math.max(f26, Math.max(f32, f37)));
        ih0Var.f2571d = Math.max(f22, Math.max(f28, Math.max(f34, f38)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static gp0 m3419u(Object obj) {
        return new gp0(obj, C0496n2.f4141U);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: oe0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static final void m3420v(oe0 oe0Var, InterfaceC0298hw interfaceC0298hw) {
        nk0 nk0Var = oe0Var.f4535j;
        if (nk0Var == null) {
            nk0Var = new nk0((mk0) oe0Var);
            oe0Var.f4535j = nk0Var;
        }
        fn0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(oe0Var)).getSnapshotObserver();
        snapshotObserver.f1778a.m777b(nk0Var, C0601p3.f4728v, interfaceC0298hw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final void m3421w(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            w10.m4823a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fM3412n = m3412n(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fM3412n);
                }
            }
            float fSqrt = (float) Math.sqrt(m3412n(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : m3412n(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fM3412n2 = m3412n(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fM3412n2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fM3412n2 / fArr11[i14];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final Object m3422x(Object[] objArr, qx0 qx0Var, InterfaceC0298hw interfaceC0298hw, InterfaceC0356ji interfaceC0356ji, int i) {
        Object[] objArr2;
        qx0 qx0Var2;
        final Object obj;
        Object objMo217d;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        long j = c0616pi.f4878T;
        p30.m3007q(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        qx0Var.getClass();
        final zw0 zw0Var = (zw0) c0616pi.m3112j(bx0.f604a);
        Object objM3080L = c0616pi.m3080L();
        C0675r3 c0675r3 = C0320ii.f2572a;
        if (objM3080L == c0675r3) {
            Object objMo611f = (zw0Var == null || (objMo217d = zw0Var.mo217d(string)) == null) ? null : qx0Var.mo611f(objMo217d);
            if (objMo611f == null) {
                objMo611f = interfaceC0298hw.invoke();
            }
            objArr2 = objArr;
            qx0Var2 = qx0Var;
            vw0 vw0Var = new vw0(qx0Var2, zw0Var, string, objMo611f, objArr2);
            c0616pi.m3107g0(vw0Var);
            objM3080L = vw0Var;
        } else {
            objArr2 = objArr;
            qx0Var2 = qx0Var;
        }
        final vw0 vw0Var2 = (vw0) objM3080L;
        Object objInvoke = Arrays.equals(objArr2, vw0Var2.f6834h) ? vw0Var2.f6833g : null;
        if (objInvoke == null) {
            objInvoke = interfaceC0298hw.invoke();
        }
        boolean zM3108h = c0616pi.m3108h(vw0Var2) | ((((i & 112) ^ 48) > 32 && c0616pi.m3108h(qx0Var2)) || (i & 48) == 32) | c0616pi.m3108h(zw0Var) | c0616pi.m3104f(string) | c0616pi.m3108h(objInvoke) | c0616pi.m3108h(objArr2);
        Object objM3080L2 = c0616pi.m3080L();
        if (zM3108h || objM3080L2 == c0675r3) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            final qx0 qx0Var3 = qx0Var2;
            InterfaceC0298hw interfaceC0298hw2 = new InterfaceC0298hw() { // from class: lu0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0298hw
                public final Object invoke() {
                    boolean z;
                    vw0 vw0Var3 = vw0Var2;
                    zw0 zw0Var2 = vw0Var3.f6831e;
                    zw0 zw0Var3 = zw0Var;
                    boolean z2 = true;
                    if (zw0Var2 != zw0Var3) {
                        vw0Var3.f6831e = zw0Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = vw0Var3.f6832f;
                    String str2 = string;
                    if (p30.m3002l(str, str2)) {
                        z2 = z;
                    } else {
                        vw0Var3.f6832f = str2;
                    }
                    vw0Var3.f6830d = qx0Var3;
                    vw0Var3.f6833g = obj;
                    vw0Var3.f6834h = objArr3;
                    C0541o8 c0541o8 = vw0Var3.f6835i;
                    if (c0541o8 != null && z2) {
                        c0541o8.m2813r();
                        vw0Var3.f6835i = null;
                        vw0Var3.m4793a();
                    }
                    return na1.f4229a;
                }
            };
            c0616pi.m3107g0(interfaceC0298hw2);
            objM3080L2 = interfaceC0298hw2;
        } else {
            obj = objInvoke;
        }
        s91.m4040e((InterfaceC0298hw) objM3080L2, c0616pi);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final Object m3423y(Object[] objArr, qx0 qx0Var, InterfaceC0298hw interfaceC0298hw, InterfaceC0356ji interfaceC0356ji, int i) {
        return m3422x(Arrays.copyOf(objArr, objArr.length), qx0Var, interfaceC0298hw, interfaceC0356ji, ((i << 3) & 7168) | 384);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final oh0 m3424z(Object obj, InterfaceC0356ji interfaceC0356ji) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        Object objM3080L = c0616pi.m3080L();
        if (objM3080L == C0320ii.f2572a) {
            objM3080L = m3419u(obj);
            c0616pi.m3107g0(objM3080L);
        }
        oh0 oh0Var = (oh0) objM3080L;
        oh0Var.setValue(obj);
        return oh0Var;
    }
}
