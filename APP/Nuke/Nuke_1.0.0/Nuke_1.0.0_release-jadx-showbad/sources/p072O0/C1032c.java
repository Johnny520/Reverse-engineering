package p072O0;

import p011B4.AbstractC0231b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p077P0.AbstractC1124k;
import p077P0.C1125l;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p204n0.C2683b;

/* JADX INFO: renamed from: O0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1032c extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public int f3215h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ float f3216i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ScrollCaptureCallbackC1033d f3217j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1032c(ScrollCaptureCallbackC1033d scrollCaptureCallbackC1033d, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f3217j = scrollCaptureCallbackC1033d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C1032c) mo7n((InterfaceC1046d) obj2, Float.valueOf(((Number) obj).floatValue()))).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C1032c c1032c = new C1032c(this.f3217j, interfaceC1046d);
        c1032c.f3216i = ((Number) obj).floatValue();
        return c1032c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        int i5 = this.f3215h;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            float f2 = this.f3216i;
            ScrollCaptureCallbackC1033d scrollCaptureCallbackC1033d = this.f3217j;
            C1125l c1125l = scrollCaptureCallbackC1033d.f3218a.f3711d;
            Object objM4272g = c1125l.f3702d.m4272g(AbstractC1124k.f3680e);
            if (objM4272g == null) {
                objM4272g = null;
            }
            InterfaceC1603e interfaceC1603e = (InterfaceC1603e) objM4272g;
            if (interfaceC1603e == null) {
                throw AbstractC0231b.m396g("Required value was null.");
            }
            C2683b c2683b = new C2683b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
            this.f3215h = 1;
            obj = interfaceC1603e.mo0g(c2683b, this);
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (obj == enumC1152a) {
                return enumC1152a;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((C2683b) obj).f8556a & 4294967295L)));
    }
}
