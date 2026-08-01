package p041H0;

import com.bumptech.glide.AbstractC1923e;
import java.util.HashMap;
import java.util.Map;
import p007B0.C0172E;
import p029F0.AbstractC0388a;
import p029F0.AbstractC0391b0;
import p029F0.AbstractC0394d;
import p029F0.C0410l;
import p047I0.C0769w0;
import p061L2.AbstractC0984x;
import p117X2.AbstractC1665j;
import p204n0.C2683b;

/* JADX INFO: renamed from: H0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0565J {

    /* JADX INFO: renamed from: a */
    public final AbstractC0391b0 f1734a;

    /* JADX INFO: renamed from: c */
    public boolean f1736c;

    /* JADX INFO: renamed from: d */
    public boolean f1737d;

    /* JADX INFO: renamed from: e */
    public boolean f1738e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0581a f1739f;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1741h;

    /* JADX INFO: renamed from: b */
    public boolean f1735b = true;

    /* JADX INFO: renamed from: g */
    public final HashMap f1740g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public C0565J(InterfaceC0581a interfaceC0581a, int i5) {
        this.f1741h = i5;
        this.f1734a = (AbstractC0391b0) interfaceC0581a;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [W2.e, X2.h] */
    /* JADX WARN: Type inference failed for: r3v7, types: [F0.b0, H0.a] */
    /* JADX INFO: renamed from: a */
    public static final void m845a(C0565J c0565j, AbstractC0388a abstractC0388a, int i5, AbstractC0596h0 abstractC0596h0) {
        HashMap map = c0565j.f1740g;
        float f2 = i5;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f2)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        while (true) {
            long jM3454N = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (c0565j.f1741h) {
                    case 0:
                        InterfaceC0612p0 interfaceC0612p0 = abstractC0596h0.f1931O;
                        if (interfaceC0612p0 != null) {
                            jM3454N = ((C0769w0) interfaceC0612p0).m1281c(jM3454N, false);
                        }
                        jM3454N = AbstractC1923e.m3454N(jM3454N, abstractC0596h0.f1919C);
                        break;
                    default:
                        AbstractC0573S abstractC0573SMo979P0 = abstractC0596h0.mo979P0();
                        AbstractC1665j.m2982b(abstractC0573SMo979P0);
                        long j5 = abstractC0573SMo979P0.f1786s;
                        jM3454N = C2683b.m4647e((((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j5 >> 32))) << 32), jM3454N);
                        break;
                }
                abstractC0596h0 = abstractC0596h0.f1934t;
                AbstractC1665j.m2982b(abstractC0596h0);
                if (abstractC0596h0.equals(c0565j.f1734a.mo909w())) {
                    int iRound = Math.round(abstractC0388a instanceof C0410l ? Float.intBitsToFloat((int) (jM3454N & 4294967295L)) : Float.intBitsToFloat((int) (jM3454N >> 32)));
                    if (map.containsKey(abstractC0388a)) {
                        int iIntValue = ((Number) AbstractC0984x.m2033E(abstractC0388a, map)).intValue();
                        C0410l c0410l = AbstractC0394d.f1215a;
                        iRound = ((Number) abstractC0388a.f1203a.mo0g(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(abstractC0388a, Integer.valueOf(iRound));
                    return;
                }
            } while (!c0565j.m846b(abstractC0596h0).containsKey(abstractC0388a));
            float fM847c = c0565j.m847c(abstractC0596h0, abstractC0388a);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fM847c);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fM847c);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Map m846b(AbstractC0596h0 abstractC0596h0) {
        switch (this.f1741h) {
            case 0:
                return abstractC0596h0.mo894z0().mo607a();
            default:
                AbstractC0573S abstractC0573SMo979P0 = abstractC0596h0.mo979P0();
                AbstractC1665j.m2982b(abstractC0573SMo979P0);
                return abstractC0573SMo979P0.mo894z0().mo607a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m847c(AbstractC0596h0 abstractC0596h0, AbstractC0388a abstractC0388a) {
        switch (this.f1741h) {
            case 0:
                return abstractC0596h0.m888s0(abstractC0388a);
            default:
                AbstractC0573S abstractC0573SMo979P0 = abstractC0596h0.mo979P0();
                AbstractC1665j.m2982b(abstractC0573SMo979P0);
                return abstractC0573SMo979P0.m888s0(abstractC0388a);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m848d() {
        return this.f1736c || this.f1737d || this.f1738e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m849e() {
        m852h();
        return this.f1739f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [F0.b0, H0.a] */
    /* JADX INFO: renamed from: f */
    public final void m850f() {
        this.f1735b = true;
        ?? r02 = this.f1734a;
        InterfaceC0581a interfaceC0581aMo911x = r02.mo911x();
        if (interfaceC0581aMo911x == null) {
            return;
        }
        if (this.f1736c) {
            interfaceC0581aMo911x.requestLayout();
        }
        if (this.f1737d) {
            r02.mo900W();
        }
        if (this.f1738e) {
            r02.requestLayout();
        }
        interfaceC0581aMo911x.mo901a().m850f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [F0.b0, H0.a] */
    /* JADX INFO: renamed from: g */
    public final void m851g() {
        HashMap map = this.f1740g;
        map.clear();
        C0172E c0172e = new C0172E(2, this);
        ?? r22 = this.f1734a;
        r22.mo902j(c0172e);
        map.putAll(m846b(r22.mo909w()));
        this.f1735b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [F0.b0, H0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [H0.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m852h() {
        /*
            r2 = this;
            boolean r0 = r2.m848d()
            F0.b0 r1 = r2.f1734a
            if (r0 == 0) goto L9
            goto L51
        L9:
            H0.a r0 = r1.mo911x()
            if (r0 != 0) goto L10
            goto L53
        L10:
            H0.J r0 = r0.mo901a()
            H0.a r1 = r0.f1739f
            if (r1 == 0) goto L23
            H0.J r0 = r1.mo901a()
            boolean r0 = r0.m848d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            H0.a r0 = r2.f1739f
            if (r0 == 0) goto L53
            H0.J r1 = r0.mo901a()
            boolean r1 = r1.m848d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            H0.a r1 = r0.mo911x()
            if (r1 == 0) goto L41
            H0.J r1 = r1.mo901a()
            if (r1 == 0) goto L41
            r1.m852h()
        L41:
            H0.a r0 = r0.mo911x()
            if (r0 == 0) goto L50
            H0.J r0 = r0.mo901a()
            if (r0 == 0) goto L50
            H0.a r1 = r0.f1739f
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f1739f = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p041H0.C0565J.m852h():void");
    }
}
