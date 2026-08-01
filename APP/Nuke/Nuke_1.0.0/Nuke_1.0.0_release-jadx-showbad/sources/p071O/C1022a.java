package p071O;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bumptech.glide.AbstractC1925g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000A.C0038T0;
import p000A.C0039U;
import p000A.C0066i0;
import p000A.C0072l0;
import p000A.C0099z;
import p007B0.C0212z;
import p041H0.AbstractC0601k;
import p041H0.C0566K;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0605m;
import p041H0.InterfaceC0625w;
import p047I0.AbstractC0691Q;
import p074O2.InterfaceC1046d;
import p076P.C1110w;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p153e1.InterfaceC2007c;
import p160f3.AbstractC2162v;
import p169h0.AbstractC2206o;
import p179i4.AbstractC2352g;
import p186k.C2404A;
import p203n.C2647c;
import p204n0.C2683b;
import p211o0.AbstractC2744c;
import p211o0.C2762u;
import p211o0.InterfaceC2760s;
import p222q0.C2901b;
import p222q0.InterfaceC2903d;
import p232s.C3162i;
import p232s.C3163j;
import p232s.C3164k;
import p232s.C3165l;
import p232s.InterfaceC3166m;

/* JADX INFO: renamed from: O.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1022a extends AbstractC2206o implements InterfaceC0595h, InterfaceC0605m, InterfaceC0625w {

    /* JADX INFO: renamed from: B */
    public C1025d f3170B;

    /* JADX INFO: renamed from: C */
    public C1026e f3171C;

    /* JADX INFO: renamed from: r */
    public final C3162i f3172r;

    /* JADX INFO: renamed from: s */
    public final boolean f3173s;

    /* JADX INFO: renamed from: t */
    public final float f3174t;

    /* JADX INFO: renamed from: u */
    public final C0066i0 f3175u;

    /* JADX INFO: renamed from: v */
    public final C1110w f3176v;

    /* JADX INFO: renamed from: w */
    public C0212z f3177w;

    /* JADX INFO: renamed from: x */
    public float f3178x;

    /* JADX INFO: renamed from: z */
    public boolean f3180z;

    /* JADX INFO: renamed from: y */
    public long f3179y = 0;

    /* JADX INFO: renamed from: A */
    public final C2404A f3169A = new C2404A();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1022a(C3162i c3162i, boolean z5, float f2, C0066i0 c0066i0, C1110w c1110w) {
        this.f3172r = c3162i;
        this.f3173s = z5;
        this.f3174t = f2;
        this.f3175u = c0066i0;
        this.f3176v = c1110w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        AbstractC2162v.m3994p(m4023x0(), null, new C0039U(this, (InterfaceC1046d) null, 8), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        C1025d c1025d = this.f3170B;
        if (c1025d != null) {
            this.f3171C = null;
            AbstractC0601k.m1034j(this);
            C0038T0 c0038t0 = c1025d.f3185g;
            C1026e c1026e = (C1026e) ((LinkedHashMap) c0038t0.f169e).get(this);
            if (c1026e != null) {
                c1026e.m2107c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0038t0.f169e;
                C1026e c1026e2 = (C1026e) linkedHashMap.get(this);
                if (c1026e2 != null) {
                }
                linkedHashMap.remove(this);
                c1025d.f3184f.add(c1026e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final void m2104J0(InterfaceC3166m interfaceC3166m) {
        C1026e c1026e;
        if (!(interfaceC3166m instanceof C3164k)) {
            if (interfaceC3166m instanceof C3165l) {
                C1026e c1026e2 = this.f3171C;
                if (c1026e2 != null) {
                    c1026e2.m2108d();
                    return;
                }
                return;
            }
            if (!(interfaceC3166m instanceof C3163j) || (c1026e = this.f3171C) == null) {
                return;
            }
            c1026e.m2108d();
            return;
        }
        C3164k c3164k = (C3164k) interfaceC3166m;
        long j5 = this.f3179y;
        float f2 = this.f3178x;
        C1025d c1025d = this.f3170B;
        if (c1025d == null) {
            Object obj = (View) AbstractC0601k.m1032h(this, AbstractC0691Q.f2215f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    C1025d c1025d2 = new C1025d(viewGroup.getContext());
                    viewGroup.addView(c1025d2);
                    c1025d = c1025d2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i5);
                    if (childAt instanceof C1025d) {
                        c1025d = (C1025d) childAt;
                        break;
                    }
                    i5++;
                }
            }
            this.f3170B = c1025d;
        }
        ArrayList arrayList = c1025d.f3183e;
        C0038T0 c0038t0 = c1025d.f3185g;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0038t0.f169e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0038t0.f169e;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c0038t0.f170f;
        C1026e c1026e3 = (C1026e) linkedHashMap.get(this);
        if (c1026e3 == null) {
            ArrayList arrayList2 = c1025d.f3184f;
            AbstractC1665j.m2985e(arrayList2, "<this>");
            c1026e3 = (C1026e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (c1026e3 == null) {
                if (c1025d.f3186h > AbstractC2352g.m4208u(arrayList)) {
                    c1026e3 = new C1026e(c1025d.getContext());
                    c1025d.addView(c1026e3);
                    arrayList.add(c1026e3);
                } else {
                    c1026e3 = (C1026e) arrayList.get(c1025d.f3186h);
                    C1022a c1022a = (C1022a) linkedHashMap3.get(c1026e3);
                    if (c1022a != null) {
                        c1022a.f3171C = null;
                        AbstractC0601k.m1034j(c1022a);
                        C1026e c1026e4 = (C1026e) linkedHashMap2.get(c1022a);
                        if (c1026e4 != null) {
                        }
                        linkedHashMap2.remove(c1022a);
                        c1026e3.m2107c();
                    }
                }
                int i6 = c1025d.f3186h;
                if (i6 < c1025d.f3182d - 1) {
                    c1025d.f3186h = i6 + 1;
                } else {
                    c1025d.f3186h = 0;
                }
            }
            linkedHashMap2.put(this, c1026e3);
            linkedHashMap3.put(c1026e3, this);
        }
        C1026e c1026e5 = c1026e3;
        int iM3200N = AbstractC1784a.m3200N(f2);
        long jM70j = this.f3175u.m70j();
        this.f3176v.mo6a();
        c1026e5.m2106b(c3164k, this.f3173s, j5, iM3200N, jM70j, new C0099z(11, this));
        this.f3171C = c1026e5;
        AbstractC0601k.m1034j(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    public final void mo940R(C0566K c0566k) {
        C2901b c2901b = c0566k.f1742d;
        c0566k.m857a();
        C0212z c0212z = this.f3177w;
        if (c0212z != null) {
            float f2 = this.f3178x;
            long jM70j = this.f3175u.m70j();
            float fFloatValue = ((Number) ((C2647c) c0212z.f742c).m4605d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jM4920b = C2762u.m4920b(fFloatValue, jM70j);
                if (c0212z.f740a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c2901b.mo859c() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2901b.mo859c() & 4294967295L));
                    C0072l0 c0072l0 = c2901b.f9185e;
                    long jM110n = c0072l0.m110n();
                    c0072l0.m106j().mo4852n();
                    try {
                        ((C0072l0) ((C1753n) c0072l0.f307e).f6028e).m106j().mo4845f(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        InterfaceC2903d.m5100A(c0566k, jM4920b, f2, 0L, null, 124);
                    } finally {
                        c0072l0.m106j().mo4851l();
                        c0072l0.m119y(jM110n);
                    }
                } else {
                    InterfaceC2903d.m5100A(c0566k, jM4920b, f2, 0L, null, 124);
                }
            }
        }
        InterfaceC2760s interfaceC2760sM106j = c2901b.f9185e.m106j();
        C1026e c1026e = this.f3171C;
        if (c1026e != null) {
            long j5 = this.f3179y;
            int iM3200N = AbstractC1784a.m3200N(this.f3178x);
            long jM70j2 = this.f3175u.m70j();
            this.f3176v.mo6a();
            c1026e.m2109e(iM3200N, j5, jM70j2);
            c1026e.draw(AbstractC2744c.m4858a(interfaceC2760sM106j));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0625w
    /* JADX INFO: renamed from: x */
    public final void mo655x(long j5) {
        float fMo268G;
        this.f3180z = true;
        InterfaceC2007c interfaceC2007c = AbstractC0601k.m1044t(this).f1692C;
        this.f3179y = AbstractC1925g.m3523F(j5);
        float f2 = this.f3174t;
        if (Float.isNaN(f2)) {
            long j6 = this.f3179y;
            float f5 = AbstractC1024c.f3181a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
            fMo268G = C2683b.m4645c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.f3173s) {
                fMo268G += interfaceC2007c.mo268G(AbstractC1024c.f3181a);
            }
        } else {
            fMo268G = interfaceC2007c.mo268G(f2);
        }
        this.f3178x = fMo268G;
        C2404A c2404a = this.f3169A;
        Object[] objArr = c2404a.f7766a;
        int i5 = c2404a.f7767b;
        for (int i6 = 0; i6 < i5; i6++) {
            m2104J0((InterfaceC3166m) objArr[i6]);
        }
        c2404a.m4246d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
