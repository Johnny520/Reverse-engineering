package p253r1;

import gg.AbstractC1417m;
import p041d1.C0655c0;
import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p293u2.C4247q;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: r1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3647d {

    /* JADX INFO: renamed from: a */
    public C3652i f11829a;

    /* JADX INFO: renamed from: b */
    public C3652i f11830b;

    /* JADX INFO: renamed from: c */
    public AbstractC1417m f11831c = new C0655c0(this, 12);

    /* JADX INFO: renamed from: d */
    public InterfaceC3599t f11832d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r15 == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r15 == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7626a(long j3, long j4, AbstractC6038c abstractC6038c) {
        C3645b c3645b;
        long j5;
        if (abstractC6038c instanceof C3645b) {
            c3645b = (C3645b) abstractC6038c;
            int i9 = c3645b.f11825i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c3645b.f11825i = i9 - Integer.MIN_VALUE;
            } else {
                c3645b = new C3645b(this, abstractC6038c);
            }
        }
        C3645b c3645b2 = c3645b;
        Object objMo1583m0 = c3645b2.f11823g;
        int i10 = c3645b2.f11825i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objMo1583m0);
            C3652i c3652i = this.f11829a;
            C3652i c3652iM7633l1 = c3652i != null ? c3652i.m7633l1() : null;
            j5 = 0;
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (c3652iM7633l1 == null) {
                C3652i c3652i2 = this.f11830b;
                if (c3652i2 != null) {
                    c3645b2.f11825i = 1;
                    objMo1583m0 = c3652i2.mo1583m0(j3, j4, c3645b2);
                }
            } else {
                C3652i c3652i3 = this.f11829a;
                C3652i c3652iM7633l12 = c3652i3 != null ? c3652i3.m7633l1() : null;
                if (c3652iM7633l12 != null) {
                    c3645b2.f11825i = 2;
                    objMo1583m0 = c3652iM7633l12.mo1583m0(j3, j4, c3645b2);
                } else {
                    j5 = 0;
                }
            }
        } else if (i10 == 1) {
            AbstractC1089i.m2732I0(objMo1583m0);
            j5 = ((C4247q) objMo1583m0).f13927a;
        } else {
            if (i10 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(objMo1583m0);
            j5 = ((C4247q) objMo1583m0).f13927a;
        }
        return new C4247q(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m7627b(long j3, long j4, int i9) {
        C3652i c3652i = this.f11829a;
        C3652i c3652iM7633l1 = c3652i != null ? c3652i.m7633l1() : null;
        if (c3652iM7633l1 != null) {
            return c3652iM7633l1.mo1581M0(j3, j4, i9);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7628c(long j3, AbstractC6038c abstractC6038c) {
        C3646c c3646c;
        long j4;
        if (abstractC6038c instanceof C3646c) {
            c3646c = (C3646c) abstractC6038c;
            int i9 = c3646c.f11828i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c3646c.f11828i = i9 - Integer.MIN_VALUE;
            } else {
                c3646c = new C3646c(this, abstractC6038c);
            }
        }
        Object objMo1580M = c3646c.f11826g;
        int i10 = c3646c.f11828i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objMo1580M);
            C3652i c3652i = this.f11829a;
            C3652i c3652iM7633l1 = c3652i != null ? c3652i.m7633l1() : null;
            if (c3652iM7633l1 == null) {
                j4 = 0;
                return new C4247q(j4);
            }
            c3646c.f11828i = 1;
            objMo1580M = c3652iM7633l1.mo1580M(j3, c3646c);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objMo1580M == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(objMo1580M);
        }
        j4 = ((C4247q) objMo1580M).f13927a;
        return new C4247q(j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final long m7629d(int i9, long j3) {
        C3652i c3652i = this.f11829a;
        C3652i c3652iM7633l1 = c3652i != null ? c3652i.m7633l1() : null;
        if (c3652iM7633l1 != null) {
            return c3652iM7633l1.mo1582f0(i9, j3);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [fg.a, gg.m] */
    /* JADX INFO: renamed from: e */
    public final InterfaceC3599t m7630e() {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f11831c.invoke();
        if (interfaceC3599t != null) {
            return interfaceC3599t;
        }
        C2104o.m5276A("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
