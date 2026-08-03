package p174m;

import gg.C1422r;
import p027c0.C0364i;
import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p119i2.C1955z;
import p136j8.C2104o;
import p144k.EnumC2164d1;
import p321w.C4606i1;
import p352xf.EnumC5799a;
import p356y0.InterfaceC5853o;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.a2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2574a2 {

    /* JADX INFO: renamed from: a */
    public static final C1955z f8343a = new C1955z(24);

    /* JADX INFO: renamed from: b */
    public static final C2672x1 f8344b = new C2672x1();

    /* JADX INFO: renamed from: c */
    public static final C2668w1 f8345c = new C2668w1();

    /* JADX INFO: renamed from: d */
    public static final C2676y1 f8346d = new C2676y1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m6040a(C2637o2 c2637o2, long j3, AbstractC6038c abstractC6038c) {
        C2680z1 c2680z1;
        C1422r c1422r;
        C2637o2 c2637o22;
        if (abstractC6038c instanceof C2680z1) {
            c2680z1 = (C2680z1) abstractC6038c;
            int i9 = c2680z1.f8737j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2680z1.f8737j = i9 - Integer.MIN_VALUE;
            } else {
                c2680z1 = new C2680z1(abstractC6038c);
            }
        }
        Object obj = c2680z1.f8736i;
        int i10 = c2680z1.f8737j;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            c1422r = new C1422r();
            C0364i c0364i = new C0364i(c2637o2, j3, c1422r, (InterfaceC5557c) null, 4);
            c2680z1.f8734g = c2637o2;
            c2680z1.f8735h = c1422r;
            c2680z1.f8737j = 1;
            Object objM6093f = c2637o2.m6093f(EnumC2164d1.f7173g, c0364i, c2680z1);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objM6093f == enumC5799a) {
                return enumC5799a;
            }
            c2637o22 = c2637o2;
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C1422r c1422r2 = c2680z1.f8735h;
            C2637o2 c2637o23 = c2680z1.f8734g;
            AbstractC1089i.m2732I0(obj);
            c1422r = c1422r2;
            c2637o22 = c2637o23;
        }
        return new C0807b(c2637o22.m6095h(c1422r.f4735g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static InterfaceC5853o m6041b(C4606i1 c4606i1, EnumC2640p1 enumC2640p1, boolean z9, boolean z10) {
        return new C2664v1(c4606i1, enumC2640p1, z9, z10);
    }
}
