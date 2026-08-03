package p339x1;

import java.util.HashMap;
import java.util.Map;
import p016b1.C0166f;
import p057e1.C0807b;
import p071f1.C1008i0;
import p129ig.AbstractC2043a;
import p308v1.AbstractC4377b1;
import p308v1.AbstractC4378c;
import p308v1.C4399j;
import p357y1.C5916o1;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: x1.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5606g0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC4377b1 f22816a;

    /* JADX INFO: renamed from: c */
    public boolean f22818c;

    /* JADX INFO: renamed from: d */
    public boolean f22819d;

    /* JADX INFO: renamed from: e */
    public boolean f22820e;

    /* JADX INFO: renamed from: f */
    public InterfaceC5581a f22821f;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f22823h;

    /* JADX INFO: renamed from: b */
    public boolean f22817b = true;

    /* JADX INFO: renamed from: g */
    public final HashMap f22822g = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: x1.a */
    /* JADX WARN: Multi-variable type inference failed */
    public C5606g0(InterfaceC5581a interfaceC5581a, int i9) {
        this.f22823h = i9;
        this.f22816a = (AbstractC4377b1) interfaceC5581a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r12v5, types: [fg.p, gg.j] */
    /* JADX WARN: Type inference failed for: r3v8, types: [v1.b1, x1.a] */
    /* JADX INFO: renamed from: a */
    public static final void m10056a(C5606g0 c5606g0, C4399j c4399j, int i9, AbstractC5614i1 abstractC5614i1) {
        HashMap map = c5606g0.f22822g;
        float f3 = i9;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f3)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f3)) & 4294967295L;
        while (true) {
            long jM5012R = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (c5606g0.f22823h) {
                    case 0:
                        InterfaceC5638q1 interfaceC5638q1 = abstractC5614i1.f22866R;
                        if (interfaceC5638q1 != null) {
                            C5916o1 c5916o1 = (C5916o1) interfaceC5638q1;
                            float[] fArrM10624b = c5916o1.m10624b();
                            if (!c5916o1.f24024y) {
                                jM5012R = C1008i0.m2594b(jM5012R, fArrM10624b);
                            }
                        }
                        jM5012R = AbstractC2043a.m5012R(jM5012R, abstractC5614i1.f22854F);
                        break;
                    default:
                        AbstractC5631o0 abstractC5631o0Mo10104p1 = abstractC5614i1.mo10104p1();
                        abstractC5631o0Mo10104p1.getClass();
                        long j3 = abstractC5631o0Mo10104p1.f22933v;
                        jM5012R = C0807b.m2042e((((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j3 >> 32))) << 32), jM5012R);
                        break;
                }
                abstractC5614i1 = abstractC5614i1.f22870w;
                abstractC5614i1.getClass();
                if (abstractC5614i1.equals(c5606g0.f22816a.mo9967A())) {
                    int iRound = Math.round(c4399j instanceof C4399j ? Float.intBitsToFloat((int) (jM5012R & 4294967295L)) : Float.intBitsToFloat((int) (jM5012R >> 32)));
                    if (map.containsKey(c4399j)) {
                        int iIntValue = ((Number) AbstractC4178y.m8436Y(c4399j, map)).intValue();
                        C4399j c4399j2 = AbstractC4378c.f14598a;
                        iRound = ((Number) c4399j.f14647a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(c4399j, Integer.valueOf(iRound));
                    return;
                }
            } while (!c5606g0.m10057b(abstractC5614i1).containsKey(c4399j));
            float fM10058c = c5606g0.m10058c(abstractC5614i1, c4399j);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fM10058c);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fM10058c);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Map m10057b(AbstractC5614i1 abstractC5614i1) {
        switch (this.f22823h) {
            case 0:
                return abstractC5614i1.mo10091Z0().mo7599e();
            default:
                AbstractC5631o0 abstractC5631o0Mo10104p1 = abstractC5614i1.mo10104p1();
                abstractC5631o0Mo10104p1.getClass();
                return abstractC5631o0Mo10104p1.mo10091Z0().mo7599e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m10058c(AbstractC5614i1 abstractC5614i1, C4399j c4399j) {
        switch (this.f22823h) {
            case 0:
                return abstractC5614i1.m10177R0(c4399j);
            default:
                AbstractC5631o0 abstractC5631o0Mo10104p1 = abstractC5614i1.mo10104p1();
                abstractC5631o0Mo10104p1.getClass();
                return abstractC5631o0Mo10104p1.m10177R0(c4399j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m10059d() {
        return this.f22818c || this.f22819d || this.f22820e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m10060e() {
        m10063h();
        return this.f22821f != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [v1.b1, x1.a] */
    /* JADX INFO: renamed from: f */
    public final void m10061f() {
        this.f22817b = true;
        ?? r02 = this.f22816a;
        InterfaceC5581a interfaceC5581aMo9968B = r02.mo9968B();
        if (interfaceC5581aMo9968B == null) {
            return;
        }
        if (this.f22818c) {
            interfaceC5581aMo9968B.requestLayout();
        }
        if (this.f22819d) {
            r02.mo9973o0();
        }
        if (this.f22820e) {
            r02.requestLayout();
        }
        interfaceC5581aMo9968B.mo9971e().m10061f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v1, types: [v1.b1, x1.a] */
    /* JADX INFO: renamed from: g */
    public final void m10062g() {
        HashMap map = this.f22822g;
        map.clear();
        C0166f c0166f = new C0166f(this, 16);
        ?? r2 = this.f22816a;
        r2.mo9970c0(c0166f);
        map.putAll(m10057b(r2.mo9967A()));
        this.f22817b = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [v1.b1, x1.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [x1.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10063h() {
        C5606g0 c5606g0Mo9971e;
        C5606g0 c5606g0Mo9971e2;
        boolean zM10059d = m10059d();
        ?? r12 = this.f22816a;
        ?? r13 = r12;
        if (!zM10059d) {
            InterfaceC5581a interfaceC5581aMo9968B = r12.mo9968B();
            if (interfaceC5581aMo9968B == null) {
                return;
            }
            InterfaceC5581a interfaceC5581a = interfaceC5581aMo9968B.mo9971e().f22821f;
            if (interfaceC5581a != null) {
                boolean zM10059d2 = interfaceC5581a.mo9971e().m10059d();
                r13 = interfaceC5581a;
                if (!zM10059d2) {
                    InterfaceC5581a interfaceC5581a2 = this.f22821f;
                    if (interfaceC5581a2 == null || interfaceC5581a2.mo9971e().m10059d()) {
                        return;
                    }
                    InterfaceC5581a interfaceC5581aMo9968B2 = interfaceC5581a2.mo9968B();
                    if (interfaceC5581aMo9968B2 != null && (c5606g0Mo9971e2 = interfaceC5581aMo9968B2.mo9971e()) != null) {
                        c5606g0Mo9971e2.m10063h();
                    }
                    InterfaceC5581a interfaceC5581aMo9968B3 = interfaceC5581a2.mo9968B();
                    r13 = (interfaceC5581aMo9968B3 == null || (c5606g0Mo9971e = interfaceC5581aMo9968B3.mo9971e()) == null) ? 0 : c5606g0Mo9971e.f22821f;
                }
            }
        }
        this.f22821f = r13;
    }
}
