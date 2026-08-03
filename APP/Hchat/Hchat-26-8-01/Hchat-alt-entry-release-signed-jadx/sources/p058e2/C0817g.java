package p058e2;

import ci.C0596m0;
import p077f8.AbstractC1089i;
import p133j2.AbstractC2057g;
import p133j2.C2061k;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: e2.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0817g {

    /* JADX INFO: renamed from: a */
    public int f2452a;

    /* JADX INFO: renamed from: b */
    public float f2453b;

    /* JADX INFO: renamed from: c */
    public final Object f2454c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0817g(C2061k c2061k) {
        this.f2454c = c2061k;
        this.f2452a = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float m2064a(int i9, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        C2061k c2061k = (C2061k) this.f2454c;
        int i10 = 1;
        if (z9) {
            int iM5104d = AbstractC2057g.m5104d(c2061k.f6920f, i9, z9);
            z12 = i9 == c2061k.f6920f.getLineStart(iM5104d) || i9 == c2061k.m5114f(iM5104d);
        }
        int i11 = i9 * 4;
        if (!z11) {
            i10 = z12 ? 2 : 3;
        } else if (z12) {
            i10 = 0;
        }
        int i12 = i11 + i10;
        if (this.f2452a == i12) {
            return this.f2453b;
        }
        float fM5116h = z11 ? c2061k.m5116h(i9, z9) : c2061k.m5117i(i9, z9);
        if (z10) {
            this.f2452a = i12;
            this.f2453b = fM5116h;
        }
        return fM5116h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2065b(float f3, AbstractC6038c abstractC6038c) {
        C0816f c0816f;
        if (abstractC6038c instanceof C0816f) {
            c0816f = (C0816f) abstractC6038c;
            int i9 = c0816f.f2451i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0816f.f2451i = i9 - Integer.MIN_VALUE;
            } else {
                c0816f = new C0816f(this, abstractC6038c);
            }
        }
        Object objInvoke = c0816f.f2449g;
        int i10 = c0816f.f2451i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objInvoke);
            C0596m0 c0596m0 = (C0596m0) this.f2454c;
            Float f10 = new Float(f3);
            c0816f.f2451i = 1;
            objInvoke = c0596m0.invoke(f10, c0816f);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objInvoke == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(objInvoke);
        }
        this.f2453b += ((Number) objInvoke).floatValue();
        return C3967n.f12976a;
    }

    public C0817g(int i9, C0596m0 c0596m0) {
        this.f2452a = i9;
        this.f2454c = c0596m0;
    }
}
