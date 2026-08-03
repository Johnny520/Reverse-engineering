package p332wb;

import android.content.Context;
import gb.C1391o;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.bq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4760bq extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f16111h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1391o f16112i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Context f16113j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16114k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16115l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC3599t f16116m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f16117n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f16118o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f16119p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f16120q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f16121r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4760bq(C1391o c1391o, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f16112i = c1391o;
        this.f16113j = context;
        this.f16114k = interfaceC1809a1;
        this.f16115l = interfaceC1809a12;
        this.f16116m = interfaceC3599t;
        this.f16117n = interfaceC1809a13;
        this.f16118o = interfaceC1809a14;
        this.f16119p = interfaceC1809a15;
        this.f16120q = interfaceC1809a16;
        this.f16121r = interfaceC1809a17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C4760bq(this.f16112i, this.f16113j, this.f16114k, this.f16115l, this.f16116m, this.f16117n, this.f16118o, this.f16119p, this.f16120q, this.f16121r, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4760bq) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i9 = this.f16111h;
        Context context = this.f16113j;
        C1391o c1391o = this.f16112i;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            C5808e c5808e = AbstractC3553c0.f11555a;
            ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
            C5383up c5383up = new C5383up(context, c1391o, null, 3);
            this.f16111h = 1;
            obj = AbstractC3603v.m7570x(executorC5807d, c5383up, this);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        InterfaceC1809a1 interfaceC1809a1 = this.f16114k;
        interfaceC1809a1.setValue(null);
        if (zBooleanValue) {
            this.f16115l.setValue(c1391o);
        } else {
            C5491y2.m9855z1(this.f16116m, interfaceC1809a1, this.f16117n, context, this.f16118o, this.f16119p, this.f16120q, this.f16121r, this.f16112i, false);
        }
        return C3967n.f12976a;
    }
}
