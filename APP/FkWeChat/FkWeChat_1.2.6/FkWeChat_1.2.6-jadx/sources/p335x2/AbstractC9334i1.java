package p335x2;

import android.graphics.RectF;
import android.text.Layout;
import p010a9.InterfaceC0188p;
import p080f9.AbstractC2368o;
import p080f9.C2361h;
import p185m8.AbstractC5106t;
import p335x2.C9330h0;
import p351y2.AbstractC9538g;
import p351y2.C9541j;
import p351y2.InterfaceC9537f;

/* JADX INFO: renamed from: x2.i1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9334i1 {
    /* JADX INFO: renamed from: a */
    public static final float m36387a(int i10, int i11, float[] fArr) {
        return fArr[(i10 - i11) * 2];
    }

    /* JADX INFO: renamed from: b */
    public static final float m36388b(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    /* JADX INFO: renamed from: c */
    public static final int m36389c(C9330h0.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, InterfaceC9537f interfaceC9537f, InterfaceC0188p interfaceC0188p) {
        int iM36346b;
        int iMo37322d;
        if (!m36393g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.m36347c() || rectF.right < f11) && (!aVar.m36347c() || rectF.left > f10)) {
            iM36346b = aVar.m36346b();
            int iM36345a = aVar.m36345a();
            while (iM36345a - iM36346b > 1) {
                int i13 = (iM36345a + iM36346b) / 2;
                float fM36387a = m36387a(i13, i10, fArr);
                if ((aVar.m36347c() || fM36387a <= rectF.right) && (!aVar.m36347c() || fM36387a >= rectF.left)) {
                    iM36346b = i13;
                } else {
                    iM36345a = i13;
                }
            }
            if (aVar.m36347c()) {
                iM36346b = iM36345a;
            }
        } else {
            iM36346b = aVar.m36345a() - 1;
        }
        int iMo37321c = interfaceC9537f.mo37321c(iM36346b + 1);
        if (iMo37321c == -1 || (iMo37322d = interfaceC9537f.mo37322d(iMo37321c)) <= aVar.m36346b()) {
            return -1;
        }
        int iM8578e = AbstractC2368o.m8578e(iMo37321c, aVar.m36346b());
        int iM8582i = AbstractC2368o.m8582i(iMo37322d, aVar.m36345a());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = aVar.m36347c() ? m36387a(iM8582i - 1, i10, fArr) : m36387a(iM8578e, i10, fArr);
            rectF2.right = aVar.m36347c() ? m36388b(iM8578e, i10, fArr) : m36388b(iM8582i - 1, i10, fArr);
            if (((Boolean) interfaceC0188p.invoke(rectF2, rectF)).booleanValue()) {
                return iM8582i;
            }
            iM8582i = interfaceC9537f.mo37320b(iM8582i);
            if (iM8582i == -1 || iM8582i <= aVar.m36346b()) {
                break;
            }
            iM8578e = AbstractC2368o.m8578e(interfaceC9537f.mo37321c(iM8582i), aVar.m36346b());
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static final int[] m36390d(C9331h1 c9331h1, Layout layout, C9330h0 c9330h0, RectF rectF, int i10, InterfaceC0188p interfaceC0188p) {
        int i11;
        InterfaceC9537f c9541j = i10 == 1 ? new C9541j(c9331h1.m36354G(), c9331h1.m36356I()) : AbstractC9538g.m37326a(c9331h1.m36354G(), c9331h1.m36355H());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > c9331h1.m36371l(lineForVertical) && (lineForVertical = lineForVertical + 1) >= c9331h1.m36372m()) {
            return null;
        }
        int i12 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < c9331h1.m36382w(0)) {
            return null;
        }
        int iM36392f = m36392f(c9331h1, layout, c9330h0, i12, rectF, c9541j, interfaceC0188p, true);
        while (true) {
            i11 = i12;
            if (iM36392f != -1 || i11 >= lineForVertical2) {
                break;
            }
            i12 = i11 + 1;
            iM36392f = m36392f(c9331h1, layout, c9330h0, i12, rectF, c9541j, interfaceC0188p, true);
        }
        if (iM36392f == -1) {
            return null;
        }
        int iM36392f2 = m36392f(c9331h1, layout, c9330h0, lineForVertical2, rectF, c9541j, interfaceC0188p, false);
        while (iM36392f2 == -1 && i11 < lineForVertical2) {
            int i13 = lineForVertical2 - 1;
            iM36392f2 = m36392f(c9331h1, layout, c9330h0, i13, rectF, c9541j, interfaceC0188p, false);
            lineForVertical2 = i13;
        }
        if (iM36392f2 == -1) {
            return null;
        }
        return new int[]{c9541j.mo37321c(iM36392f + 1), c9541j.mo37322d(iM36392f2 - 1)};
    }

    /* JADX INFO: renamed from: e */
    public static final int m36391e(C9330h0.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, InterfaceC9537f interfaceC9537f, InterfaceC0188p interfaceC0188p) {
        int iM36346b;
        int iMo37321c;
        if (!m36393g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.m36347c() || rectF.left > f10) && (!aVar.m36347c() || rectF.right < f11)) {
            iM36346b = aVar.m36346b();
            int iM36345a = aVar.m36345a();
            while (iM36345a - iM36346b > 1) {
                int i13 = (iM36345a + iM36346b) / 2;
                float fM36387a = m36387a(i13, i10, fArr);
                if ((aVar.m36347c() || fM36387a <= rectF.left) && (!aVar.m36347c() || fM36387a >= rectF.right)) {
                    iM36346b = i13;
                } else {
                    iM36345a = i13;
                }
            }
            if (aVar.m36347c()) {
                iM36346b = iM36345a;
            }
        } else {
            iM36346b = aVar.m36346b();
        }
        int iMo37322d = interfaceC9537f.mo37322d(iM36346b);
        if (iMo37322d == -1 || (iMo37321c = interfaceC9537f.mo37321c(iMo37322d)) >= aVar.m36345a()) {
            return -1;
        }
        int iM8578e = AbstractC2368o.m8578e(iMo37321c, aVar.m36346b());
        int iM8582i = AbstractC2368o.m8582i(iMo37322d, aVar.m36345a());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = aVar.m36347c() ? m36387a(iM8582i - 1, i10, fArr) : m36387a(iM8578e, i10, fArr);
            rectF2.right = aVar.m36347c() ? m36388b(iM8578e, i10, fArr) : m36388b(iM8582i - 1, i10, fArr);
            if (((Boolean) interfaceC0188p.invoke(rectF2, rectF)).booleanValue()) {
                return iM8578e;
            }
            iM8578e = interfaceC9537f.mo37319a(iM8578e);
            if (iM8578e == -1 || iM8578e >= aVar.m36345a()) {
                break;
            }
            iM8582i = AbstractC2368o.m8582i(interfaceC9537f.mo37322d(iM8578e), aVar.m36345a());
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static final int m36392f(C9331h1 c9331h1, Layout layout, C9330h0 c9330h0, int i10, RectF rectF, InterfaceC9537f interfaceC9537f, InterfaceC0188p interfaceC0188p, boolean z10) {
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        c9331h1.m36361b(i10, fArr);
        C9330h0.a[] aVarArrM36338d = c9330h0.m36338d(i10);
        C2361h c2361hM20724b0 = z10 ? AbstractC5106t.m20724b0(aVarArrM36338d) : AbstractC2368o.m8589p(AbstractC5106t.m20732f0(aVarArrM36338d), 0);
        int iM8560o = c2361hM20724b0.m8560o();
        int iM8561p = c2361hM20724b0.m8561p();
        int iM8562q = c2361hM20724b0.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            int i11 = iM8560o;
            while (true) {
                C9330h0.a aVar = aVarArrM36338d[i11];
                float fM36387a = aVar.m36347c() ? m36387a(aVar.m36345a() - 1, lineStart, fArr) : m36387a(aVar.m36346b(), lineStart, fArr);
                float fM36388b = aVar.m36347c() ? m36388b(aVar.m36346b(), lineStart, fArr) : m36388b(aVar.m36345a() - 1, lineStart, fArr);
                int iM36391e = z10 ? m36391e(aVar, rectF, lineStart, lineTop, lineBottom, fM36387a, fM36388b, fArr, interfaceC9537f, interfaceC0188p) : m36389c(aVar, rectF, lineStart, lineTop, lineBottom, fM36387a, fM36388b, fArr, interfaceC9537f, interfaceC0188p);
                if (iM36391e < 0) {
                    if (i11 == iM8561p) {
                        break;
                    }
                    i11 += iM8562q;
                } else {
                    return iM36391e;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m36393g(RectF rectF, float f10, float f11) {
        return f11 >= rectF.left && f10 <= rectF.right;
    }
}
