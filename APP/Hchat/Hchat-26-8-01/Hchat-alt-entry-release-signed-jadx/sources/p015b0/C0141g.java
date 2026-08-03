package p015b0;

import ac.RunnableC0059l;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import p002a1.RunnableC0003a;
import p040d0.C0645b;
import p040d0.C0646c;
import p040d0.InterfaceC0647d;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1768l1;
import p117i0.C1829f1;
import p117i0.C1845j1;
import p136j8.C2104o;
import p276sf.C3967n;
import p322w0.C4668s;
import p332wb.C5014jj;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: b0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0141g extends AbstractC6044i implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f363h;

    /* JADX INFO: renamed from: i */
    public int f364i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f365j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f366k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0141g(Object obj, Object obj2, InterfaceC5557c interfaceC5557c, int i9) {
        super(1, interfaceC5557c);
        this.f363h = i9;
        this.f365j = obj;
        this.f366k = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(InterfaceC5557c interfaceC5557c) {
        switch (this.f363h) {
            case 0:
                return new C0141g((C0142h) this.f365j, (InterfaceC0647d) this.f366k, interfaceC5557c, 0);
            case 1:
                return new C0141g((C0646c) this.f365j, (C0645b) this.f366k, interfaceC5557c, 1);
            default:
                return new C0141g((C1739c) this.f365j, (C1829f1) this.f366k, interfaceC5557c, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj;
        switch (this.f363h) {
        }
        return ((C0141g) create(interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        C0137e c0137e;
        C0141g c0141g;
        switch (this.f363h) {
            case 0:
                C0142h c0142h = (C0142h) this.f365j;
                C4668s c4668s = c0142h.f371e;
                View view = c0142h.f367a;
                int i9 = this.f364i;
                C3967n c3967n = C3967n.f12976a;
                try {
                    if (i9 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        C0139f c0139f = new C0139f();
                        InterfaceC0647d interfaceC0647d = (InterfaceC0647d) this.f366k;
                        C0137e c0137e2 = new C0137e(c0139f, new C0131b(c0142h, interfaceC0647d, 0), new C0131b(c0142h, interfaceC0647d, 1), view);
                        InterfaceC1231l interfaceC1231l = c0142h.f368b;
                        if (interfaceC1231l != null && (c0137e = (C0137e) interfaceC1231l.invoke(c0137e2)) != null) {
                            c0137e2 = c0137e;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                            RunnableC0059l runnableC0059l = c0142h.f375i;
                            if (runnableC0059l == null) {
                                runnableC0059l = new RunnableC0059l(c0142h, c0137e2, c0139f, 1);
                                c0142h.f375i = runnableC0059l;
                            }
                            view.post(runnableC0059l);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new ActionModeCallbackC0158x(c0137e2), 1);
                            if (actionModeStartActionMode == null) {
                                return c3967n;
                            }
                            c0142h.f374h = actionModeStartActionMode;
                        }
                        this.f364i = 1;
                        Object objMo8198f = c0139f.f361a.mo8198f(this);
                        EnumC5799a enumC5799a = EnumC5799a.f23547g;
                        if (objMo8198f != enumC5799a) {
                            objMo8198f = c3967n;
                        }
                        if (objMo8198f == enumC5799a) {
                            return enumC5799a;
                        }
                    } else {
                        if (i9 != 1) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1089i.m2732I0(obj);
                    }
                    c4668s.m9160a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable runnableC0003a = c0142h.f376j;
                        if (runnableC0003a == null) {
                            runnableC0003a = new RunnableC0003a(c0142h, 3);
                            c0142h.f376j = runnableC0003a;
                        }
                        view.post(runnableC0003a);
                    } else {
                        ActionMode actionMode = c0142h.f374h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    RunnableC0059l runnableC0059l2 = c0142h.f375i;
                    if (runnableC0059l2 != null) {
                        view.removeCallbacks(runnableC0059l2);
                    }
                    c0142h.f374h = null;
                    return c3967n;
                } catch (Throwable th2) {
                    c4668s.m9160a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable runnableC0003a2 = c0142h.f376j;
                        if (runnableC0003a2 == null) {
                            runnableC0003a2 = new RunnableC0003a(c0142h, 3);
                            c0142h.f376j = runnableC0003a2;
                        }
                        view.post(runnableC0003a2);
                    } else {
                        ActionMode actionMode2 = c0142h.f374h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    RunnableC0059l runnableC0059l3 = c0142h.f375i;
                    if (runnableC0059l3 != null) {
                        view.removeCallbacks(runnableC0059l3);
                    }
                    c0142h.f374h = null;
                    throw th2;
                }
            case 1:
                C0645b c0645b = (C0645b) this.f366k;
                C1845j1 c1845j1 = ((C0646c) this.f365j).f2013c;
                int i10 = this.f364i;
                C3967n c3967n2 = C3967n.f12976a;
                try {
                    if (i10 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        c1845j1.setValue(c0645b);
                        this.f364i = 1;
                        Object objMo8198f2 = c0645b.f2010b.mo8198f(this);
                        EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                        if (objMo8198f2 != enumC5799a2) {
                            objMo8198f2 = c3967n2;
                        }
                        if (objMo8198f2 == enumC5799a2) {
                            return enumC5799a2;
                        }
                    } else {
                        if (i10 != 1) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1089i.m2732I0(obj);
                    }
                    c1845j1.setValue(null);
                    return c3967n2;
                } catch (Throwable th3) {
                    c1845j1.setValue(null);
                    throw th3;
                }
            default:
                C1829f1 c1829f1 = (C1829f1) this.f366k;
                int i11 = this.f364i;
                EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1739c c1739c = (C1739c) this.f365j;
                    Float f3 = new Float(0.0f);
                    C1768l1 c1768l1M4380p = AbstractC1742d.m4380p(150, 6, null);
                    this.f364i = 1;
                    c0141g = this;
                    if (C1739c.m4359c(c1739c, f3, c1768l1M4380p, null, c0141g, 12) == enumC5799a3) {
                        return enumC5799a3;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC1089i.m2732I0(obj);
                            return C3967n.f12976a;
                        }
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    c0141g = this;
                }
                float fM4488g = c1829f1.m4488g();
                C1768l1 c1768l1M4380p2 = AbstractC1742d.m4380p(150, 6, null);
                C5014jj c5014jj = new C5014jj(c1829f1, 4);
                c0141g.f364i = 2;
                if (AbstractC1742d.m4369e(fM4488g, 1.0f, c1768l1M4380p2, c5014jj, c0141g, 4) == enumC5799a3) {
                    return enumC5799a3;
                }
                return C3967n.f12976a;
        }
    }
}
