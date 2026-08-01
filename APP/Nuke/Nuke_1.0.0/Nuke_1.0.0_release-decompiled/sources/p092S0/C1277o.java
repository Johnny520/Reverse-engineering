package p092S0;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p011B4.AbstractC0231b;
import p014C1.C0240b;
import p027E4.C0330q;
import p029F0.C0363A;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0978r;
import p096T0.AbstractC1411k;
import p096T0.C1410j;
import p117X2.C1672q;
import p117X2.C1673r;
import p120Y0.AbstractC1732a;
import p130a1.AbstractC1796i;
import p130a1.C1791d;
import p147d1.C1962l;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p179i4.AbstractC2352g;
import p204n0.C2684c;
import p211o0.AbstractC2736K;
import p211o0.AbstractC2758q;
import p211o0.C2737L;
import p211o0.C2740O;
import p211o0.C2759r;
import p211o0.InterfaceC2760s;
import p222q0.AbstractC2902c;

/* JADX INFO: renamed from: S0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1277o {

    /* JADX INFO: renamed from: a */
    public final C0240b f4585a;

    /* JADX INFO: renamed from: b */
    public final int f4586b;

    /* JADX INFO: renamed from: c */
    public final boolean f4587c;

    /* JADX INFO: renamed from: d */
    public final float f4588d;

    /* JADX INFO: renamed from: e */
    public final float f4589e;

    /* JADX INFO: renamed from: f */
    public final int f4590f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4591g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4592h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public C1277o(C0240b c0240b, long j5, int i5, int i6) {
        boolean z5;
        int i7;
        int iM3679g;
        int i8;
        this.f4585a = c0240b;
        this.f4586b = i5;
        if (C2005a.m3682j(j5) != 0 || C2005a.m3681i(j5) != 0) {
            AbstractC1732a.m3085a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c0240b.f812e;
        int size = arrayList2.size();
        float f2 = 0.0f;
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C1280r c1280r = (C1280r) arrayList2.get(i9);
            C1791d c1791d = c1280r.f4602a;
            int iM3680h = C2005a.m3680h(j5);
            if (C2005a.m3675c(j5)) {
                i7 = i9;
                iM3679g = C2005a.m3679g(j5) - ((int) Math.ceil(f2));
                if (iM3679g < 0) {
                    iM3679g = 0;
                }
            } else {
                i7 = i9;
                iM3679g = C2005a.m3679g(j5);
            }
            C1263a c1263a = new C1263a(c1791d, this.f4586b - i10, i6, AbstractC2006b.m3685b(iM3680h, iM3679g, 5));
            float fM2347b = c1263a.m2347b() + f2;
            C1410j c1410j = c1263a.f4548d;
            int i11 = i10 + c1410j.f5045g;
            arrayList.add(new C1279q(c1263a, c1280r.f4603b, c1280r.f4604c, i10, i11, f2, fM2347b));
            if (!c1410j.f5042d) {
                if (i11 == this.f4586b) {
                    i8 = i7;
                    if (i8 != AbstractC2352g.m4208u((ArrayList) this.f4585a.f812e)) {
                    }
                } else {
                    i8 = i7;
                }
                i9 = i8 + 1;
                i10 = i11;
                f2 = fM2347b;
            }
            z5 = true;
            i10 = i11;
            f2 = fM2347b;
            break;
        }
        z5 = false;
        this.f4589e = f2;
        this.f4590f = i10;
        this.f4587c = z5;
        this.f4592h = arrayList;
        this.f4588d = C2005a.m3680h(j5);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            C1279q c1279q = (C1279q) arrayList.get(i12);
            ?? r7 = c1279q.f4595a.f4550f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i13 = 0; i13 < size3; i13++) {
                C2684c c2684c = (C2684c) r7.get(i13);
                arrayList4.add(c2684c != null ? c1279q.m2371a(c2684c) : null);
            }
            AbstractC0978r.m2032N(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f4585a.f809b).size()) {
            int size4 = ((List) this.f4585a.f809b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i14 = 0; i14 < size4; i14++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC0973m.m2019Z(arrayList3, arrayList5);
        }
        this.f4591g = arrayList3;
    }

    /* JADX INFO: renamed from: i */
    public static void m2359i(C1277o c1277o, InterfaceC2760s interfaceC2760s, AbstractC2758q abstractC2758q, float f2, C2737L c2737l, C1962l c1962l, AbstractC2902c abstractC2902c) {
        interfaceC2760s.mo4852n();
        ArrayList arrayList = c1277o.f4592h;
        if (arrayList.size() <= 1 || (abstractC2758q instanceof C2740O)) {
            AbstractC1796i.m3268b(c1277o, interfaceC2760s, abstractC2758q, f2, c2737l, c1962l, abstractC2902c);
        } else {
            if (!(abstractC2758q instanceof AbstractC2736K)) {
                throw new C0330q();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM2347b = 0.0f;
            for (int i5 = 0; i5 < size; i5++) {
                C1279q c1279q = (C1279q) arrayList.get(i5);
                fM2347b += c1279q.f4595a.m2347b();
                fMax = Math.max(fMax, c1279q.f4595a.m2349d());
            }
            Shader shaderMo4781b = ((AbstractC2736K) abstractC2758q).mo4781b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fM2347b)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderMo4781b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                C1263a c1263a = ((C1279q) arrayList.get(i6)).f4595a;
                c1263a.m2352g(interfaceC2760s, new C2759r(shaderMo4781b), f2, c2737l, c1962l, abstractC2902c);
                interfaceC2760s.mo4846g(0.0f, c1263a.m2347b());
                matrix.setTranslate(0.0f, -c1263a.m2347b());
                shaderMo4781b.setLocalMatrix(matrix);
            }
        }
        interfaceC2760s.mo4851l();
    }

    /* JADX INFO: renamed from: a */
    public final void m2360a(long j5, float[] fArr) {
        m2368j(C1259L.m2338f(j5));
        m2369k(C1259L.m2337e(j5));
        C1673r c1673r = new C1673r();
        c1673r.f5707d = 0;
        AbstractC1251D.m2318g(this.f4592h, j5, new C1276n(j5, fArr, c1673r, new C1672q()));
    }

    /* JADX INFO: renamed from: b */
    public final float m2361b(int i5) {
        m2370l(i5);
        ArrayList arrayList = this.f4592h;
        C1279q c1279q = (C1279q) arrayList.get(AbstractC1251D.m2316e(i5, arrayList));
        C1263a c1263a = c1279q.f4595a;
        return c1263a.f4548d.m2709e(i5 - c1279q.f4598d) + c1279q.f4600f;
    }

    /* JADX INFO: renamed from: c */
    public final int m2362c(int i5, boolean z5) {
        int iM2710f;
        m2370l(i5);
        ArrayList arrayList = this.f4592h;
        C1279q c1279q = (C1279q) arrayList.get(AbstractC1251D.m2316e(i5, arrayList));
        C1263a c1263a = c1279q.f4595a;
        int i6 = i5 - c1279q.f4598d;
        C1410j c1410j = c1263a.f4548d;
        if (z5) {
            Layout layout = c1410j.f5044f;
            ThreadLocal threadLocal = AbstractC1411k.f5056a;
            if (layout.getEllipsisCount(i6) <= 0 || c1410j.f5040b != TextUtils.TruncateAt.END) {
                C0240b c0240bM2707c = c1410j.m2707c();
                Layout layout2 = (Layout) c0240bM2707c.f808a;
                iM2710f = c0240bM2707c.m437n(layout2.getLineEnd(i6), layout2.getLineStart(i6));
            } else {
                iM2710f = layout.getEllipsisStart(i6) + layout.getLineStart(i6);
            }
        } else {
            iM2710f = c1410j.m2710f(i6);
        }
        return iM2710f + c1279q.f4596b;
    }

    /* JADX INFO: renamed from: d */
    public final int m2363d(int i5) {
        int length = ((C1269g) this.f4585a.f808a).f4563e.length();
        ArrayList arrayList = this.f4592h;
        C1279q c1279q = (C1279q) arrayList.get(i5 >= length ? AbstractC2352g.m4208u(arrayList) : i5 < 0 ? 0 : AbstractC1251D.m2315d(i5, arrayList));
        return c1279q.f4595a.f4548d.f5044f.getLineForOffset(c1279q.m2374d(i5)) + c1279q.f4598d;
    }

    /* JADX INFO: renamed from: e */
    public final int m2364e(float f2) {
        ArrayList arrayList = this.f4592h;
        C1279q c1279q = (C1279q) arrayList.get(AbstractC1251D.m2317f(arrayList, f2));
        int i5 = c1279q.f4597c - c1279q.f4596b;
        int i6 = c1279q.f4598d;
        if (i5 == 0) {
            return i6;
        }
        C1263a c1263a = c1279q.f4595a;
        float f5 = f2 - c1279q.f4600f;
        C1410j c1410j = c1263a.f4548d;
        return c1410j.f5044f.getLineForVertical(((int) f5) - c1410j.f5046h) + i6;
    }

    /* JADX INFO: renamed from: f */
    public final float m2365f(int i5) {
        m2370l(i5);
        ArrayList arrayList = this.f4592h;
        C1279q c1279q = (C1279q) arrayList.get(AbstractC1251D.m2316e(i5, arrayList));
        C1263a c1263a = c1279q.f4595a;
        return c1263a.f4548d.m2711g(i5 - c1279q.f4598d) + c1279q.f4600f;
    }

    /* JADX INFO: renamed from: g */
    public final int m2366g(long j5) {
        int i5 = (int) (j5 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i5);
        ArrayList arrayList = this.f4592h;
        C1279q c1279q = (C1279q) arrayList.get(AbstractC1251D.m2317f(arrayList, fIntBitsToFloat));
        int i6 = c1279q.f4597c;
        int i7 = c1279q.f4596b;
        if (i6 - i7 == 0) {
            return i7;
        }
        C1263a c1263a = c1279q.f4595a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i5) - c1279q.f4600f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        C1410j c1410j = c1263a.f4548d;
        int lineForVertical = c1410j.f5044f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - c1410j.f5046h);
        return c1410j.f5044f.getOffsetForHorizontal(lineForVertical, (c1410j.m2706b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i7;
    }

    /* JADX INFO: renamed from: h */
    public final long m2367h(C2684c c2684c, int i5, C0363A c0363a) {
        long jM2372b;
        long j5;
        float f2 = c2684c.f8559b;
        ArrayList arrayList = this.f4592h;
        int iM2317f = AbstractC1251D.m2317f(arrayList, f2);
        float f5 = ((C1279q) arrayList.get(iM2317f)).f4601g;
        float f6 = c2684c.f8561d;
        if (f5 >= f6 || iM2317f == AbstractC2352g.m4208u(arrayList)) {
            C1279q c1279q = (C1279q) arrayList.get(iM2317f);
            return c1279q.m2372b(c1279q.f4595a.m2348c(c1279q.m2373c(c2684c), i5, c0363a), true);
        }
        int iM2317f2 = AbstractC1251D.m2317f(arrayList, f6);
        long jM2372b2 = C1259L.f4536b;
        while (true) {
            jM2372b = C1259L.f4536b;
            if (!C1259L.m2334b(jM2372b2, jM2372b) || iM2317f > iM2317f2) {
                break;
            }
            C1279q c1279q2 = (C1279q) arrayList.get(iM2317f);
            jM2372b2 = c1279q2.m2372b(c1279q2.f4595a.m2348c(c1279q2.m2373c(c2684c), i5, c0363a), true);
            iM2317f++;
        }
        if (C1259L.m2334b(jM2372b2, jM2372b)) {
            return jM2372b;
        }
        while (true) {
            j5 = C1259L.f4536b;
            if (!C1259L.m2334b(jM2372b, j5) || iM2317f > iM2317f2) {
                break;
            }
            C1279q c1279q3 = (C1279q) arrayList.get(iM2317f2);
            jM2372b = c1279q3.m2372b(c1279q3.f4595a.m2348c(c1279q3.m2373c(c2684c), i5, c0363a), true);
            iM2317f2--;
        }
        return C1259L.m2334b(jM2372b, j5) ? jM2372b2 : AbstractC1251D.m2313b((int) (jM2372b2 >> 32), (int) (4294967295L & jM2372b));
    }

    /* JADX INFO: renamed from: j */
    public final void m2368j(int i5) {
        boolean z5 = false;
        C0240b c0240b = this.f4585a;
        if (i5 >= 0 && i5 < ((C1269g) c0240b.f808a).f4563e.length()) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        StringBuilder sbM404o = AbstractC0231b.m404o(i5, "offset(", ") is out of bounds [0, ");
        sbM404o.append(((C1269g) c0240b.f808a).f4563e.length());
        sbM404o.append(')');
        AbstractC1732a.m3085a(sbM404o.toString());
    }

    /* JADX INFO: renamed from: k */
    public final void m2369k(int i5) {
        boolean z5 = false;
        C0240b c0240b = this.f4585a;
        if (i5 >= 0 && i5 <= ((C1269g) c0240b.f808a).f4563e.length()) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        StringBuilder sbM404o = AbstractC0231b.m404o(i5, "offset(", ") is out of bounds [0, ");
        sbM404o.append(((C1269g) c0240b.f808a).f4563e.length());
        sbM404o.append(']');
        AbstractC1732a.m3085a(sbM404o.toString());
    }

    /* JADX INFO: renamed from: l */
    public final void m2370l(int i5) {
        boolean z5 = false;
        int i6 = this.f4590f;
        if (i5 >= 0 && i5 < i6) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        AbstractC1732a.m3085a("lineIndex(" + i5 + ") is out of bounds [0, " + i6 + ')');
    }
}
