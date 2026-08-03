package p332wb;

import okhttp3.HttpUrl;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.C1888v1;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p218og.C3147k;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.nn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5150nn extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f19266h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f19267i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f19268j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f19269k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f19270l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5150nn(boolean z9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f19267i = z9;
        this.f19268j = interfaceC1809a1;
        this.f19269k = interfaceC1809a12;
        this.f19270l = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C5150nn(this.f19267i, this.f19268j, this.f19269k, this.f19270l, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C5150nn) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i9 = this.f19266h;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            C5808e c5808e = AbstractC3553c0.f11555a;
            ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
            C1888v1 c1888v1 = new C1888v1(2, null, 2);
            this.f19266h = 1;
            obj = AbstractC3603v.m7570x(executorC5807d, c1888v1, this);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (obj == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i9 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
        }
        Object obj2 = ((C3960g) obj).f12964g;
        boolean z9 = obj2 instanceof C3959f;
        InterfaceC1809a1 interfaceC1809a1 = this.f19270l;
        if (!z9) {
            C3147k c3147k = AbstractC4955ho.f17686a;
            this.f19268j.setValue((String) obj2);
            this.f19269k.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            if (this.f19267i) {
                interfaceC1809a1.setValue("请输入图形验证码");
            }
        }
        Throwable thM8182b = C3960g.m8182b(obj2);
        if (thM8182b != null) {
            String strM9263g = AbstractC4855en.m9263g("刷新图形验证码失败: ", thM8182b.getMessage());
            C3147k c3147k2 = AbstractC4955ho.f17686a;
            interfaceC1809a1.setValue(strM9263g);
        }
        return C3967n.f12976a;
    }
}
