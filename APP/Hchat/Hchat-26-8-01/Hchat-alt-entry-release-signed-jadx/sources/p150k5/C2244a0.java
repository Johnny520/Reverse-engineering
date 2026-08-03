package p150k5;

import ac.C0058k;
import androidx.lifecycle.C0119x;
import p005a5.C0016a;
import p046d6.C0709f;
import p068eh.AbstractC0921a;
import p074f5.C1071g;
import p074f5.EnumC1070f;
import p164l5.C2480b;
import p164l5.C2482c;
import p164l5.C2483c0;
import p164l5.C2484d;
import p164l5.C2486e;
import p164l5.C2487e0;
import p164l5.C2488f;
import p164l5.C2489f0;
import p164l5.C2490g;
import p164l5.C2491h;
import p164l5.C2492i;
import p164l5.C2493j;
import p164l5.C2494k;
import p164l5.C2495l;
import p164l5.C2496m;
import p164l5.C2497n;
import p164l5.C2498o;
import p164l5.C2499p;
import p164l5.C2500q;
import p164l5.C2501r;
import p164l5.C2502s;
import p164l5.C2503t;
import p164l5.C2504u;
import p164l5.C2505v;
import p164l5.C2506w;
import p164l5.C2507x;
import p164l5.C2508y;
import p164l5.C2509z;
import p207o5.AbstractC3065t;
import p281t3.AbstractC4106c;
import p283t5.InterfaceC4121d;

/* JADX INFO: renamed from: k5.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2244a0 extends AbstractC3065t {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2246b0 f7440j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2244a0(C2246b0 c2246b0, C0119x c0119x, int i9) {
        super(c0119x, i9);
        this.f7440j = c2246b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    @Override // p207o5.AbstractC3065t
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5492a(C0016a c0016a) {
        EnumC1070f enumC1070f;
        InterfaceC4121d c2482c;
        InterfaceC4121d c2480b;
        int i9 = c0016a.f55h;
        C2246b0 c2246b0 = this.f7440j;
        int i10 = c2246b0.f7446h;
        C0058k c0058k = c2246b0.f7447i;
        if (i9 >= i10) {
            this.f9909g = 3;
            return null;
        }
        C2270u c2270u = (C2270u) c0058k.f177i;
        C0119x c0119x = (C0119x) c0016a.f56i;
        int iM584O = c0119x.m584O(i9);
        if (iM584O == 0) {
            iM584O = c0119x.m585P(c0016a.f55h);
        }
        C1071g c1071g = c2270u.f7533c;
        c1071g.getClass();
        if (iM584O == 256) {
            enumC1070f = EnumC1070f.PACKED_SWITCH_PAYLOAD;
        } else if (iM584O == 512) {
            enumC1070f = EnumC1070f.SPARSE_SWITCH_PAYLOAD;
        } else if (iM584O == 768) {
            enumC1070f = EnumC1070f.ARRAY_PAYLOAD;
        } else if (iM584O >= 0) {
            EnumC1070f[] enumC1070fArr = (EnumC1070f[]) c1071g.f3452d;
            enumC1070f = iM584O < enumC1070fArr.length ? enumC1070fArr[iM584O] : null;
        }
        int i11 = c0016a.f55h;
        c2270u.f7531a.getClass();
        if (enumC1070f == null) {
            c2480b = new C2489f0(c2270u, EnumC1070f.NOP, i11);
        } else {
            int i12 = enumC1070f.f3448m;
            switch (AbstractC4106c.m8279b(i12)) {
                case 0:
                    c2482c = new C2482c(c2270u, enumC1070f, i11, 0);
                    c2480b = c2482c;
                    break;
                case 1:
                    c2482c = new C2484d(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 2:
                    c2482c = new C2486e(c2270u, enumC1070f, i11, 0);
                    c2480b = c2482c;
                    break;
                case 3:
                    c2482c = new C2488f(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 4:
                    c2482c = new C2490g(c2270u, enumC1070f, i11, 0);
                    c2480b = c2482c;
                    break;
                case 5:
                    c2482c = new C2491h(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 6:
                    c2482c = new C2482c(c2270u, enumC1070f, i11, 1);
                    c2480b = c2482c;
                    break;
                case 7:
                    c2482c = new C2492i(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 8:
                    c2482c = new C2486e(c2270u, enumC1070f, i11, 1);
                    c2480b = c2482c;
                    break;
                case 9:
                    c2482c = new C2493j(c2270u, enumC1070f, i11, 0);
                    c2480b = c2482c;
                    break;
                case 10:
                    c2482c = new C2486e(c2270u, enumC1070f, i11, 2);
                    c2480b = c2482c;
                    break;
                case 11:
                    c2482c = new C2494k(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 12:
                    c2482c = new C2495l(c2270u, enumC1070f, i11, 0);
                    c2480b = c2482c;
                    break;
                case 13:
                    c2482c = new C2496m(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 14:
                    c2482c = new C2497n(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 15:
                    c2482c = new C2495l(c2270u, enumC1070f, i11, 1);
                    c2480b = c2482c;
                    break;
                case 16:
                    c2482c = new C2498o(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 17:
                    c2482c = new C2490g(c2270u, enumC1070f, i11, 1);
                    c2480b = c2482c;
                    break;
                case 18:
                    c2482c = new C2499p(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 19:
                    c2482c = new C2482c(c2270u, enumC1070f, i11, 2);
                    c2480b = c2482c;
                    break;
                case 20:
                    c2482c = new C2500q(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 21:
                    c2482c = new C2486e(c2270u, enumC1070f, i11, 3);
                    c2480b = c2482c;
                    break;
                case 22:
                    c2482c = new C2501r(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 23:
                    c2482c = new C2490g(c2270u, enumC1070f, i11, 2);
                    c2480b = c2482c;
                    break;
                case 24:
                    c2482c = new C2502s(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 25:
                    c2482c = new C2503t(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 26:
                    c2482c = new C2504u(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 27:
                    c2482c = new C2505v(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 28:
                    c2482c = new C2506w(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 29:
                    c2482c = new C2507x(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 30:
                    c2482c = new C2508y(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 31:
                    c2482c = new C2509z(c2270u, enumC1070f, i11);
                    c2480b = c2482c;
                    break;
                case 32:
                    c2482c = new C2493j(c2270u, enumC1070f, i11, 1);
                    c2480b = c2482c;
                    break;
                case 33:
                    c2480b = new C2480b(c2270u, i11);
                    break;
                case 34:
                    c2480b = new C2483c0(c2270u, i11);
                    break;
                case 35:
                    c2480b = new C2487e0(c2270u, i11);
                    break;
                default:
                    throw new C0709f(null, "Unexpected opcode format: %s", AbstractC0921a.m2237B(i12));
            }
        }
        int iMo5877c = c0016a.f55h + (c2480b.mo5877c() * 2);
        c0016a.f55h = iMo5877c;
        if (iMo5877c > i10 || iMo5877c < 0) {
            throw new C0709f(null, "The last instruction in method %s is truncated", (C2275z) c0058k.f178j);
        }
        return c2480b;
    }
}
