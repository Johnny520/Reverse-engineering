package p058L;

import java.util.ArrayList;
import me.dartcv.nuke.BuildConfig;
import p000A.C0039U;
import p007B0.C0183P;
import p007B0.C0212z;
import p041H0.AbstractC0601k;
import p056K2.C0891q;
import p061L2.AbstractC0973m;
import p071O.AbstractC1027f;
import p071O.C1022a;
import p071O.C1028g;
import p074O2.InterfaceC1046d;
import p076P.C1110w;
import p079P2.EnumC1152a;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p178i3.C2321b;
import p178i3.C2322c;
import p178i3.C2330k;
import p178i3.InterfaceC2324e;
import p184j3.AbstractC2384c;
import p184j3.C2382a;
import p203n.AbstractC2649d;
import p203n.AbstractC2676u;
import p203n.C2647c;
import p203n.C2650d0;
import p204n0.C2683b;
import p232s.C3154a;
import p232s.C3155b;
import p232s.C3156c;
import p232s.C3157d;
import p232s.C3158e;
import p232s.C3159f;
import p232s.C3160g;
import p232s.C3163j;
import p232s.C3164k;
import p232s.C3165l;
import p232s.InterfaceC3161h;
import p232s.InterfaceC3166m;

/* JADX INFO: renamed from: L.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0906H implements InterfaceC2324e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2817d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2818e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f2819f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0906H(int i5, Object obj, Object obj2) {
        this.f2817d = i5;
        this.f2819f = obj;
        this.f2818e = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    @Override // p178i3.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9c(Object obj, InterfaceC1046d interfaceC1046d) {
        C2321b c2321b;
        C2330k c2330k;
        C0906H c0906h;
        switch (this.f2817d) {
            case 0:
                long j5 = ((C2683b) obj).f8556a;
                C2647c c2647c = (C2647c) this.f2819f;
                long j6 = ((C2683b) c2647c.m4605d()).f8556a & 9223372034707292159L;
                C0891q c0891q = C0891q.f2780a;
                if (j6 == 9205357640488583168L || (j5 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((C2683b) c2647c.m4605d()).f8556a & 4294967295L)) == Float.intBitsToFloat((int) (j5 & 4294967295L))) {
                    Object objM4606e = c2647c.m4606e(interfaceC1046d, new C2683b(j5));
                    return objM4606e == EnumC1152a.f3788d ? objM4606e : c0891q;
                }
                AbstractC2162v.m3994p((InterfaceC2160t) this.f2818e, null, new C0183P(c2647c, j5, null, 1), 3);
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC3161h interfaceC3161h = (InterfaceC3161h) obj;
                C1022a c1022a = (C1022a) this.f2819f;
                if (!(interfaceC3161h instanceof InterfaceC3166m)) {
                    InterfaceC2160t interfaceC2160t = (InterfaceC2160t) this.f2818e;
                    C0212z c0212z = c1022a.f3177w;
                    if (c0212z == null) {
                        boolean z5 = c1022a.f3173s;
                        C1110w c1110w = c1022a.f3176v;
                        c0212z = new C0212z();
                        c0212z.f740a = z5;
                        c0212z.f741b = c1110w;
                        c0212z.f742c = new C2647c(Float.valueOf(0.0f), AbstractC2649d.f8446j, Float.valueOf(0.01f), 8);
                        c0212z.f743d = new ArrayList();
                        AbstractC0601k.m1034j(c1022a);
                        c1022a.f3177w = c0212z;
                    }
                    ArrayList arrayList = (ArrayList) c0212z.f743d;
                    if (interfaceC3161h instanceof C3159f) {
                        arrayList.add(interfaceC3161h);
                    } else if (interfaceC3161h instanceof C3160g) {
                        arrayList.remove(((C3160g) interfaceC3161h).f9913a);
                    } else if (interfaceC3161h instanceof C3157d) {
                        arrayList.add(interfaceC3161h);
                    } else if (interfaceC3161h instanceof C3158e) {
                        arrayList.remove(((C3158e) interfaceC3161h).f9912a);
                    } else if (interfaceC3161h instanceof C3155b) {
                        arrayList.add(interfaceC3161h);
                    } else if (interfaceC3161h instanceof C3156c) {
                        arrayList.remove(((C3156c) interfaceC3161h).f9911a);
                    } else if (interfaceC3161h instanceof C3154a) {
                        arrayList.remove(((C3154a) interfaceC3161h).f9910a);
                    }
                    InterfaceC3161h interfaceC3161h2 = (InterfaceC3161h) AbstractC0973m.m2018Y(arrayList);
                    if (!AbstractC1665j.m2981a((InterfaceC3161h) c0212z.f744e, interfaceC3161h2)) {
                        InterfaceC1046d interfaceC1046d2 = null;
                        if (interfaceC3161h2 != null) {
                            ((C1110w) c0212z.f741b).mo6a();
                            boolean z6 = interfaceC3161h2 instanceof C3159f;
                            float f2 = z6 ? 0.08f : interfaceC3161h2 instanceof C3157d ? 0.1f : interfaceC3161h2 instanceof C3155b ? 0.16f : 0.0f;
                            C2650d0 c2650d0 = AbstractC1027f.f3194a;
                            if (!z6 && ((interfaceC3161h2 instanceof C3157d) || (interfaceC3161h2 instanceof C3155b))) {
                                c2650d0 = new C2650d0(45, 0, AbstractC2676u.f8543b);
                            }
                            AbstractC2162v.m3994p(interfaceC2160t, null, new C1028g(c0212z, f2, c2650d0, null), 3);
                        } else {
                            InterfaceC3161h interfaceC3161h3 = (InterfaceC3161h) c0212z.f744e;
                            C2650d0 c2650d02 = AbstractC1027f.f3194a;
                            if (!(interfaceC3161h3 instanceof C3159f) && !(interfaceC3161h3 instanceof C3157d) && (interfaceC3161h3 instanceof C3155b)) {
                                c2650d02 = new C2650d0(150, 0, AbstractC2676u.f8543b);
                            }
                            AbstractC2162v.m3994p(interfaceC2160t, null, new C0039U(c0212z, c2650d02, interfaceC1046d2, 9), 3);
                        }
                        c0212z.f744e = interfaceC3161h2;
                    }
                } else if (c1022a.f3180z) {
                    c1022a.m2104J0((InterfaceC3166m) interfaceC3161h);
                } else {
                    c1022a.f3169A.m4243a(interfaceC3161h);
                }
                return C0891q.f2780a;
            case 2:
                C1675t c1675t = (C1675t) this.f2819f;
                if (interfaceC1046d instanceof C2321b) {
                    c2321b = (C2321b) interfaceC1046d;
                    int i5 = c2321b.f7572i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c2321b.f7572i = i5 - Integer.MIN_VALUE;
                    } else {
                        c2321b = new C2321b(this, interfaceC1046d);
                    }
                }
                Object obj2 = c2321b.f7570g;
                int i6 = c2321b.f7572i;
                C0891q c0891q2 = C0891q.f2780a;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj2);
                    return c0891q2;
                }
                AbstractC1784a.m3205S(obj2);
                Object obj3 = c1675t.f5710e;
                if (obj3 != AbstractC2384c.f7730b && AbstractC1665j.m2981a(obj3, obj)) {
                    return c0891q2;
                }
                c1675t.f5710e = obj;
                InterfaceC2324e interfaceC2324e = (InterfaceC2324e) this.f2818e;
                c2321b.f7572i = 1;
                Object objMo9c = interfaceC2324e.mo9c(obj, c2321b);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                return objMo9c == enumC1152a ? enumC1152a : c0891q2;
            case 3:
                if (interfaceC1046d instanceof C2330k) {
                    c2330k = (C2330k) interfaceC1046d;
                    int i7 = c2330k.f7596i;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c2330k.f7596i = i7 - Integer.MIN_VALUE;
                    } else {
                        c2330k = new C2330k(this, interfaceC1046d);
                    }
                }
                Object objMo0g = c2330k.f7595h;
                int i8 = c2330k.f7596i;
                if (i8 == 0) {
                    AbstractC1784a.m3205S(objMo0g);
                    InterfaceC1603e interfaceC1603e = (InterfaceC1603e) this.f2819f;
                    c2330k.f7594g = this;
                    c2330k.f7598k = obj;
                    c2330k.f7596i = 1;
                    objMo0g = interfaceC1603e.mo0g(obj, c2330k);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objMo0g == enumC1152a2) {
                        return enumC1152a2;
                    }
                    c0906h = this;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c2330k.f7598k;
                    c0906h = c2330k.f7594g;
                    AbstractC1784a.m3205S(objMo0g);
                }
                if (!((Boolean) objMo0g).booleanValue()) {
                    return C0891q.f2780a;
                }
                ((C1675t) c0906h.f2818e).f5710e = obj;
                throw new C2382a(c0906h);
            default:
                InterfaceC3161h interfaceC3161h4 = (InterfaceC3161h) obj;
                ArrayList arrayList2 = (ArrayList) this.f2819f;
                if (interfaceC3161h4 instanceof C3164k) {
                    arrayList2.add(interfaceC3161h4);
                } else if (interfaceC3161h4 instanceof C3165l) {
                    arrayList2.remove(((C3165l) interfaceC3161h4).f9917a);
                } else if (interfaceC3161h4 instanceof C3163j) {
                    arrayList2.remove(((C3163j) interfaceC3161h4).f9915a);
                }
                ((InterfaceC1347Y) this.f2818e).setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0906H(C2322c c2322c, C1675t c1675t, InterfaceC2324e interfaceC2324e) {
        this.f2817d = 2;
        this.f2819f = c1675t;
        this.f2818e = interfaceC2324e;
    }
}
