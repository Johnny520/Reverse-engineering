package p320vh;

import gg.AbstractC1416l;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.C1009j;
import p071f1.C1010j0;
import p071f1.InterfaceC1026r0;
import p085fg.InterfaceC1220a;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: vh.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4578e implements InterfaceC1026r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15080a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15081b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4578e(Object obj, int i9) {
        this.f15080a = i9;
        this.f15081b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // p071f1.InterfaceC1026r0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0996c0 mo2612a(long j3, EnumC4243m enumC4243m, InterfaceC4233c interfaceC4233c) {
        switch (this.f15080a) {
            case 0:
                enumC4243m.getClass();
                interfaceC4233c.getClass();
                C4579f c4579f = (C4579f) this.f15081b;
                InterfaceC1026r0 interfaceC1026r0 = (InterfaceC1026r0) ((InterfaceC1220a) c4579f.f15084c).invoke();
                if (!AbstractC1416l.m3825a((InterfaceC1026r0) c4579f.f15085d, interfaceC1026r0)) {
                    c4579f.f15085d = interfaceC1026r0;
                    c4579f.f15086e = null;
                }
                if (((AbstractC0996c0) c4579f.f15086e) != null && C0810e.m2054a(c4579f.f15083b, j3) && c4579f.f15082a == enumC4243m) {
                    Float f3 = (Float) c4579f.f15087f;
                    float fMo1333d = interfaceC4233c.mo1333d();
                    if (f3 == null || f3.floatValue() != fMo1333d) {
                    }
                } else {
                    c4579f.f15083b = j3;
                    c4579f.f15082a = enumC4243m;
                    c4579f.f15087f = Float.valueOf(interfaceC4233c.mo1333d());
                    c4579f.f15086e = interfaceC1026r0.mo2612a(j3, enumC4243m, interfaceC4233c);
                }
                AbstractC0996c0 abstractC0996c0 = (AbstractC0996c0) c4579f.f15086e;
                abstractC0996c0.getClass();
                return abstractC0996c0;
            default:
                return new C1010j0((C1009j) this.f15081b);
        }
    }
}
