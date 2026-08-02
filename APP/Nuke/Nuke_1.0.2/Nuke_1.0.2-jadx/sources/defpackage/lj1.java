package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lj1 {
    public final cj a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lj1(cj cjVar, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iG;
        int i5;
        this.a = cjVar;
        this.b = i;
        if (fz.j(j) != 0 || fz.i(j) != 0) {
            lz0.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) cjVar.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            sw1 sw1Var = (sw1) arrayList2.get(i6);
            x9 x9Var = sw1Var.a;
            int iH = fz.h(j);
            if (fz.c(j)) {
                i4 = i6;
                iG = fz.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i4 = i6;
                iG = fz.g(j);
            }
            i3 = 0;
            t9 t9Var = new t9(x9Var, this.b - i7, i2, gz.b(0, iH, 0, iG, 5));
            float fB = t9Var.b() + f;
            w03 w03Var = t9Var.d;
            int i8 = i7 + w03Var.g;
            arrayList.add(new rw1(t9Var, sw1Var.b, sw1Var.c, i7, i8, f, fB));
            if (!w03Var.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != eu.L((ArrayList) this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fB;
            }
            z = true;
            i7 = i8;
            f = fB;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = fz.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            rw1 rw1Var = (rw1) arrayList.get(i9);
            List list = rw1Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                o62 o62Var = (o62) list.get(i10);
                arrayList4.add(o62Var != null ? rw1Var.a(o62Var) : null);
            }
            iu.g0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = du.x0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(lj1 lj1Var, qp qpVar, an anVar, float f, bq2 bq2Var, gz2 gz2Var, op0 op0Var) {
        qpVar.l();
        ArrayList arrayList = lj1Var.h;
        if (arrayList.size() <= 1 || (anVar instanceof ft2)) {
            op0.n(lj1Var, qpVar, anVar, f, bq2Var, gz2Var, op0Var);
        } else {
            if (!(anVar instanceof zp2)) {
                c80.s();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i = 0; i < size; i++) {
                rw1 rw1Var = (rw1) arrayList.get(i);
                fB += rw1Var.a.b();
                fMax = Math.max(fMax, rw1Var.a.d());
            }
            Shader shaderB = ((zp2) anVar).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                t9 t9Var = ((rw1) arrayList.get(i2)).a;
                t9Var.g(qpVar, new bn(shaderB), f, bq2Var, gz2Var, op0Var);
                qpVar.g(0.0f, t9Var.b());
                matrix.setTranslate(0.0f, -t9Var.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        qpVar.i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(long j, float[] fArr) {
        j(f13.f(j));
        k(f13.e(j));
        a72 a72Var = new a72();
        a72Var.h = 0;
        eu.J(this.h, j, new pl(j, fArr, a72Var, new z62()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        rw1 rw1Var = (rw1) arrayList.get(eu.H(i, arrayList));
        t9 t9Var = rw1Var.a;
        return t9Var.d.e(i - rw1Var.d) + rw1Var.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i, boolean z) {
        int iF;
        l(i);
        ArrayList arrayList = this.h;
        rw1 rw1Var = (rw1) arrayList.get(eu.H(i, arrayList));
        t9 t9Var = rw1Var.a;
        int i2 = i - rw1Var.d;
        w03 w03Var = t9Var.d;
        if (z) {
            Layout layout = w03Var.f;
            ThreadLocal threadLocal = a13.a;
            if (layout.getEllipsisCount(i2) <= 0 || w03Var.b != TextUtils.TruncateAt.END) {
                cj cjVarC = w03Var.c();
                Layout layout2 = (Layout) cjVarC.a;
                iF = cjVarC.m(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = w03Var.f(i2);
        }
        return iF + rw1Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(int i) {
        int length = ((sd) this.a.a).i.length();
        ArrayList arrayList = this.h;
        rw1 rw1Var = (rw1) arrayList.get(i >= length ? eu.L(arrayList) : i < 0 ? 0 : eu.G(i, arrayList));
        return rw1Var.a.d.g(rw1Var.d(i)) + rw1Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        rw1 rw1Var = (rw1) arrayList.get(eu.I(arrayList, f));
        int i = rw1Var.c - rw1Var.b;
        int i2 = rw1Var.d;
        if (i == 0) {
            return i2;
        }
        t9 t9Var = rw1Var.a;
        float f2 = f - rw1Var.f;
        w03 w03Var = t9Var.d;
        int i3 = (int) f2;
        int i4 = w03Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = w03Var.f.getLineForVertical(i3 - w03Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        rw1 rw1Var = (rw1) arrayList.get(eu.H(i, arrayList));
        t9 t9Var = rw1Var.a;
        return t9Var.d.h(i - rw1Var.d) + rw1Var.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        rw1 rw1Var = (rw1) arrayList.get(eu.I(arrayList, fIntBitsToFloat));
        int i2 = rw1Var.c;
        int i3 = rw1Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        t9 t9Var = rw1Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - rw1Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        w03 w03Var = t9Var.d;
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        Layout layout = w03Var.f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - w03Var.h);
        if (lineForVertical >= w03Var.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (w03Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long h(o62 o62Var, int i, um2 um2Var) {
        long jB;
        long j;
        float f = o62Var.b;
        ArrayList arrayList = this.h;
        int I = eu.I(arrayList, f);
        float f2 = ((rw1) arrayList.get(I)).g;
        float f3 = o62Var.d;
        if (f2 >= f3 || I == eu.L(arrayList)) {
            rw1 rw1Var = (rw1) arrayList.get(I);
            return rw1Var.b(rw1Var.a.c(rw1Var.c(o62Var), i, um2Var), true);
        }
        int I2 = eu.I(arrayList, f3);
        long jB2 = f13.b;
        while (true) {
            jB = f13.b;
            if (!f13.b(jB2, jB) || I > I2) {
                break;
            }
            rw1 rw1Var2 = (rw1) arrayList.get(I);
            jB2 = rw1Var2.b(rw1Var2.a.c(rw1Var2.c(o62Var), i, um2Var), true);
            I++;
        }
        if (f13.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = f13.b;
            if (!f13.b(jB, j) || I > I2) {
                break;
            }
            rw1 rw1Var3 = (rw1) arrayList.get(I2);
            jB = rw1Var3.b(rw1Var3.a.c(rw1Var3.c(o62Var), i, um2Var), true);
            I2--;
        }
        return f13.b(jB, j) ? jB2 : fg1.i((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i) {
        sd sdVar = (sd) this.a.a;
        if (i < 0 || i >= sdVar.i.length()) {
            StringBuilder sbN = vi0.n(i, "offset(", ") is out of bounds [0, ");
            sbN.append(sdVar.i.length());
            sbN.append(')');
            lz0.a(sbN.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(int i) {
        sd sdVar = (sd) this.a.a;
        if (i < 0 || i > sdVar.i.length()) {
            StringBuilder sbN = vi0.n(i, "offset(", ") is out of bounds [0, ");
            sbN.append(sdVar.i.length());
            sbN.append(']');
            lz0.a(sbN.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        lz0.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
