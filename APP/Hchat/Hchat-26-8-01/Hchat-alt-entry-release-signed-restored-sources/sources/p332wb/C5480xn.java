package p332wb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import okhttp3.HttpUrl;
import p024b9.RunnableC0217c;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p096g8.C1368i;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p218og.C3147k;
import p249qg.InterfaceC3599t;
import p251r.C3641z;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.xn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5480xn extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public C5292s0 f22006h;

    /* JADX INFO: renamed from: i */
    public int f22007i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3641z f22008j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Context f22009k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f22010l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f22011m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f22012n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f22013o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f22014p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5480xn(C3641z c3641z, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f22008j = c3641z;
        this.f22009k = context;
        this.f22010l = interfaceC1809a1;
        this.f22011m = interfaceC1809a12;
        this.f22012n = interfaceC1809a13;
        this.f22013o = interfaceC1809a14;
        this.f22014p = interfaceC1809a15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C5480xn(this.f22008j, this.f22009k, this.f22010l, this.f22011m, this.f22012n, this.f22013o, this.f22014p, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C5480xn) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5292s0 c5292s0;
        int i9 = this.f22007i;
        C3967n c3967n = C3967n.f12976a;
        InterfaceC1809a1 interfaceC1809a1 = this.f22013o;
        InterfaceC1809a1 interfaceC1809a12 = this.f22012n;
        C4173t c4173t = C4173t.f13710g;
        InterfaceC1809a1 interfaceC1809a13 = this.f22011m;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            C3147k c3147k = AbstractC4955ho.f17686a;
            c5292s0 = (C5292s0) this.f22010l.getValue();
            if (c5292s0 == null) {
                interfaceC1809a13.setValue(c4173t);
                interfaceC1809a12.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                interfaceC1809a1.setValue(Boolean.FALSE);
                return c3967n;
            }
            interfaceC1809a1.setValue(Boolean.TRUE);
            interfaceC1809a12.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            interfaceC1809a13.setValue(c4173t);
            this.f22014p.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f22006h = c5292s0;
            this.f22007i = 1;
            Object objM7618m = C3641z.m7618m(this.f22008j, 0, this);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objM7618m == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i9 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5292s0 = this.f22006h;
            AbstractC1089i.m2732I0(obj);
        }
        C5292s0 c5292s02 = c5292s0;
        C5071la c5071la = new C5071la(interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, 16);
        C3147k c3147k2 = AbstractC4955ho.f17686a;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        if (c1368iM9259c == null || !c1368iM9259c.m3704G()) {
            c5071la.invoke(c4173t, new IllegalStateException("群成员列表不可用"));
            return c3967n;
        }
        new Thread(new RunnableC0217c(c1368iM9259c, c5292s02, new Handler(Looper.getMainLooper()), c5071la, 20), "HchatGroupMemberPicker").start();
        return c3967n;
    }
}
