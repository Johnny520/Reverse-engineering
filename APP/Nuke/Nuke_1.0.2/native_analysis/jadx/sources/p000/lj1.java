package p000;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lj1 {

    /* JADX INFO: renamed from: a */
    public final C0093cj f6146a;

    /* JADX INFO: renamed from: b */
    public final int f6147b;

    /* JADX INFO: renamed from: c */
    public final boolean f6148c;

    /* JADX INFO: renamed from: d */
    public final float f6149d;

    /* JADX INFO: renamed from: e */
    public final float f6150e;

    /* JADX INFO: renamed from: f */
    public final int f6151f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f6152g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f6153h;

    public lj1(C0093cj c0093cj, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iM1762g;
        int i5;
        this.f6146a = c0093cj;
        this.f6147b = i;
        if (C0221fz.m1765j(j) != 0 || C0221fz.m1764i(j) != 0) {
            lz0.m2988a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c0093cj.f1583e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            sw1 sw1Var = (sw1) arrayList2.get(i6);
            C0878x9 c0878x9 = sw1Var.f10386a;
            int iM1763h = C0221fz.m1763h(j);
            if (C0221fz.m1758c(j)) {
                i4 = i6;
                iM1762g = C0221fz.m1762g(j) - ((int) Math.ceil(f));
                if (iM1762g < 0) {
                    iM1762g = 0;
                }
            } else {
                i4 = i6;
                iM1762g = C0221fz.m1762g(j);
            }
            i3 = 0;
            C0726t9 c0726t9 = new C0726t9(c0878x9, this.f6147b - i7, i2, AbstractC0258gz.m2028b(0, iM1763h, 0, iM1762g, 5));
            float fM5136b = c0726t9.m5136b() + f;
            w03 w03Var = c0726t9.f10616d;
            int i8 = i7 + w03Var.f12247g;
            arrayList.add(new rw1(c0726t9, sw1Var.f10387b, sw1Var.f10388c, i7, i8, f, fM5136b));
            if (!w03Var.f12244d) {
                if (i8 == this.f6147b) {
                    i5 = i4;
                    if (i5 != AbstractC0179eu.m1431L((ArrayList) this.f6146a.f1583e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fM5136b;
            }
            z = true;
            i7 = i8;
            f = fM5136b;
            break;
        }
        i3 = 0;
        z = false;
        this.f6150e = f;
        this.f6151f = i7;
        this.f6148c = z;
        this.f6153h = arrayList;
        this.f6149d = C0221fz.m1763h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            rw1 rw1Var = (rw1) arrayList.get(i9);
            List list = rw1Var.f9775a.f10618f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                o62 o62Var = (o62) list.get(i10);
                arrayList4.add(o62Var != null ? rw1Var.m4620a(o62Var) : null);
            }
            AbstractC0325iu.m2393g0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f6146a.f1580b).size()) {
            int size4 = ((List) this.f6146a.f1580b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC0142du.m1168x0(arrayList3, arrayList5);
        }
        this.f6152g = arrayList3;
    }

    /* JADX INFO: renamed from: i */
    public static void m2913i(lj1 lj1Var, InterfaceC0627qp interfaceC0627qp, AbstractC0024an abstractC0024an, float f, bq2 bq2Var, gz2 gz2Var, op0 op0Var) {
        interfaceC0627qp.mo1522l();
        ArrayList arrayList = lj1Var.f6153h;
        if (arrayList.size() <= 1 || (abstractC0024an instanceof ft2)) {
            op0.m3591n(lj1Var, interfaceC0627qp, abstractC0024an, f, bq2Var, gz2Var, op0Var);
        } else {
            if (!(abstractC0024an instanceof zp2)) {
                c80.m675s();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM5136b = 0.0f;
            for (int i = 0; i < size; i++) {
                rw1 rw1Var = (rw1) arrayList.get(i);
                fM5136b += rw1Var.f9775a.m5136b();
                fMax = Math.max(fMax, rw1Var.f9775a.m5138d());
            }
            Shader shaderMo507b = ((zp2) abstractC0024an).mo507b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fM5136b)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderMo507b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C0726t9 c0726t9 = ((rw1) arrayList.get(i2)).f9775a;
                c0726t9.m5141g(interfaceC0627qp, new C0061bn(shaderMo507b), f, bq2Var, gz2Var, op0Var);
                interfaceC0627qp.mo1518g(0.0f, c0726t9.m5136b());
                matrix.setTranslate(0.0f, -c0726t9.m5136b());
                shaderMo507b.setLocalMatrix(matrix);
            }
        }
        interfaceC0627qp.mo1520i();
    }

    /* JADX INFO: renamed from: a */
    public final void m2914a(long j, float[] fArr) {
        m2922j(f13.m1497f(j));
        m2923k(f13.m1496e(j));
        a72 a72Var = new a72();
        a72Var.f108h = 0;
        AbstractC0179eu.m1429J(this.f6153h, j, new C0584pl(j, fArr, a72Var, new z62()));
    }

    /* JADX INFO: renamed from: b */
    public final float m2915b(int i) {
        m2924l(i);
        ArrayList arrayList = this.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(AbstractC0179eu.m1427H(i, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        return c0726t9.f10616d.m5818e(i - rw1Var.f9778d) + rw1Var.f9780f;
    }

    /* JADX INFO: renamed from: c */
    public final int m2916c(int i, boolean z) {
        int iM5819f;
        m2924l(i);
        ArrayList arrayList = this.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(AbstractC0179eu.m1427H(i, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        int i2 = i - rw1Var.f9778d;
        w03 w03Var = c0726t9.f10616d;
        if (z) {
            Layout layout = w03Var.f12246f;
            ThreadLocal threadLocal = a13.f30a;
            if (layout.getEllipsisCount(i2) <= 0 || w03Var.f12242b != TextUtils.TruncateAt.END) {
                C0093cj c0093cjM5816c = w03Var.m5816c();
                Layout layout2 = (Layout) c0093cjM5816c.f1579a;
                iM5819f = c0093cjM5816c.m838m(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iM5819f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iM5819f = w03Var.m5819f(i2);
        }
        return iM5819f + rw1Var.f9776b;
    }

    /* JADX INFO: renamed from: d */
    public final int m2917d(int i) {
        int length = ((C0690sd) this.f6146a.f1579a).f10051i.length();
        ArrayList arrayList = this.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(i >= length ? AbstractC0179eu.m1431L(arrayList) : i < 0 ? 0 : AbstractC0179eu.m1426G(i, arrayList));
        return rw1Var.f9775a.f10616d.m5820g(rw1Var.m4623d(i)) + rw1Var.f9778d;
    }

    /* JADX INFO: renamed from: e */
    public final int m2918e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(AbstractC0179eu.m1428I(arrayList, f));
        int i = rw1Var.f9777c - rw1Var.f9776b;
        int i2 = rw1Var.f9778d;
        if (i == 0) {
            return i2;
        }
        C0726t9 c0726t9 = rw1Var.f9775a;
        float f2 = f - rw1Var.f9780f;
        w03 w03Var = c0726t9.f10616d;
        int i3 = (int) f2;
        int i4 = w03Var.f12247g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = w03Var.f12246f.getLineForVertical(i3 - w03Var.f12248h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    /* JADX INFO: renamed from: f */
    public final float m2919f(int i) {
        m2924l(i);
        ArrayList arrayList = this.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(AbstractC0179eu.m1427H(i, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        return c0726t9.f10616d.m5821h(i - rw1Var.f9778d) + rw1Var.f9780f;
    }

    /* JADX INFO: renamed from: g */
    public final int m2920g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(AbstractC0179eu.m1428I(arrayList, fIntBitsToFloat));
        int i2 = rw1Var.f9777c;
        int i3 = rw1Var.f9776b;
        if (i2 - i3 == 0) {
            return i3;
        }
        C0726t9 c0726t9 = rw1Var.f9775a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - rw1Var.f9780f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        w03 w03Var = c0726t9.f10616d;
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        Layout layout = w03Var.f12246f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - w03Var.f12248h);
        if (lineForVertical >= w03Var.f12247g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (w03Var.m5815b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    /* JADX INFO: renamed from: h */
    public final long m2921h(o62 o62Var, int i, um2 um2Var) {
        long jM4621b;
        long j;
        float f = o62Var.f7537b;
        ArrayList arrayList = this.f6153h;
        int iM1428I = AbstractC0179eu.m1428I(arrayList, f);
        float f2 = ((rw1) arrayList.get(iM1428I)).f9781g;
        float f3 = o62Var.f7539d;
        if (f2 >= f3 || iM1428I == AbstractC0179eu.m1431L(arrayList)) {
            rw1 rw1Var = (rw1) arrayList.get(iM1428I);
            return rw1Var.m4621b(rw1Var.f9775a.m5137c(rw1Var.m4622c(o62Var), i, um2Var), true);
        }
        int iM1428I2 = AbstractC0179eu.m1428I(arrayList, f3);
        long jM4621b2 = f13.f2737b;
        while (true) {
            jM4621b = f13.f2737b;
            if (!f13.m1493b(jM4621b2, jM4621b) || iM1428I > iM1428I2) {
                break;
            }
            rw1 rw1Var2 = (rw1) arrayList.get(iM1428I);
            jM4621b2 = rw1Var2.m4621b(rw1Var2.f9775a.m5137c(rw1Var2.m4622c(o62Var), i, um2Var), true);
            iM1428I++;
        }
        if (f13.m1493b(jM4621b2, jM4621b)) {
            return jM4621b;
        }
        while (true) {
            j = f13.f2737b;
            if (!f13.m1493b(jM4621b, j) || iM1428I > iM1428I2) {
                break;
            }
            rw1 rw1Var3 = (rw1) arrayList.get(iM1428I2);
            jM4621b = rw1Var3.m4621b(rw1Var3.f9775a.m5137c(rw1Var3.m4622c(o62Var), i, um2Var), true);
            iM1428I2--;
        }
        return f13.m1493b(jM4621b, j) ? jM4621b2 : fg1.m1636i((int) (jM4621b2 >> 32), (int) (4294967295L & jM4621b));
    }

    /* JADX INFO: renamed from: j */
    public final void m2922j(int i) {
        C0690sd c0690sd = (C0690sd) this.f6146a.f1579a;
        if (i < 0 || i >= c0690sd.f10051i.length()) {
            StringBuilder sbM5695n = vi0.m5695n(i, "offset(", ") is out of bounds [0, ");
            sbM5695n.append(c0690sd.f10051i.length());
            sbM5695n.append(')');
            lz0.m2988a(sbM5695n.toString());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2923k(int i) {
        C0690sd c0690sd = (C0690sd) this.f6146a.f1579a;
        if (i < 0 || i > c0690sd.f10051i.length()) {
            StringBuilder sbM5695n = vi0.m5695n(i, "offset(", ") is out of bounds [0, ");
            sbM5695n.append(c0690sd.f10051i.length());
            sbM5695n.append(']');
            lz0.m2988a(sbM5695n.toString());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2924l(int i) {
        boolean z = false;
        int i2 = this.f6151f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        lz0.m2988a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
