package p332wb;

import okhttp3.HttpUrl;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p218og.C3147k;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p261rb.C3795k;
import p261rb.C3797m;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.sn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5315sn extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f20701h;

    /* JADX INFO: renamed from: i */
    public int f20702i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20703j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5315sn(InterfaceC1809a1 interfaceC1809a1, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f20701h = i9;
        this.f20703j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f20701h) {
            case 0:
                return new C5315sn(this.f20703j, interfaceC5557c, 0);
            default:
                return new C5315sn(this.f20703j, interfaceC5557c, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f20701h) {
            case 0:
                return ((C5315sn) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            default:
                ((C5315sn) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
                return EnumC5799a.f23547g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007b -> B:29:0x007f). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C3797m c3797m;
        switch (this.f20701h) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f20703j;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                int i9 = this.f20702i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C3147k c3147k = AbstractC4955ho.f17686a;
                    if (((Number) interfaceC1809a1.getValue()).intValue() > 0) {
                    }
                } else {
                    if (i9 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    C3147k c3147k2 = AbstractC4955ho.f17686a;
                    interfaceC1809a1.setValue(Integer.valueOf(((Number) interfaceC1809a1.getValue()).intValue() - 1));
                    C3147k c3147k3 = AbstractC4955ho.f17686a;
                    if (((Number) interfaceC1809a1.getValue()).intValue() > 0) {
                        this.f20702i = 1;
                        if (AbstractC3603v.m7552f(1000L, this) == enumC5799a) {
                            return enumC5799a;
                        }
                        C3147k c3147k22 = AbstractC4955ho.f17686a;
                        interfaceC1809a1.setValue(Integer.valueOf(((Number) interfaceC1809a1.getValue()).intValue() - 1));
                        C3147k c3147k32 = AbstractC4955ho.f17686a;
                        if (((Number) interfaceC1809a1.getValue()).intValue() > 0) {
                            return C3967n.f12976a;
                        }
                    }
                }
                break;
            default:
                EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                int i10 = this.f20702i;
                if (i10 != 0 && i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                do {
                    InterfaceC1809a1 interfaceC1809a12 = this.f20703j;
                    C3795k c3795k = AbstractC1184v0.f3987a;
                    if (c3795k != null) {
                        c3797m = c3795k.m7985l();
                    } else {
                        C4173t c4173t = C4173t.f13710g;
                        c3797m = new C3797m(false, false, "等待检测", HttpUrl.FRAGMENT_ENCODE_SET, 0, 0, c4173t, c4173t, false, 0, 0, 0, 0);
                    }
                    C3147k c3147k4 = AbstractC4955ho.f17686a;
                    interfaceC1809a12.setValue(c3797m);
                    this.f20702i = 1;
                } while (AbstractC3603v.m7552f(500L, this) != enumC5799a2);
                return enumC5799a2;
        }
    }
}
