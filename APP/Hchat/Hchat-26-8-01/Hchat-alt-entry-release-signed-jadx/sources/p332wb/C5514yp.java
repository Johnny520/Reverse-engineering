package p332wb;

import android.content.Context;
import gb.AbstractC1378b;
import gb.AbstractC1387k;
import gb.AbstractC1393q;
import gb.C1385i;
import gb.C1388l;
import gb.C1391o;
import gb.C1395s;
import java.io.Serializable;
import java.util.UUID;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3156t;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.yp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5514yp extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f22234h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f22235i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f22236j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f22237k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5514yp(Context context, C1391o c1391o, boolean z9, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f22234h = 0;
        this.f22236j = context;
        this.f22237k = c1391o;
        this.f22235i = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f22234h) {
            case 0:
                return new C5514yp((Context) this.f22236j, (C1391o) this.f22237k, this.f22235i, interfaceC5557c);
            case 1:
                return new C5514yp(this.f22235i, (Context) this.f22236j, (C1391o) this.f22237k, interfaceC5557c, 1);
            default:
                return new C5514yp(this.f22235i, (InterfaceC1809a1) this.f22236j, (InterfaceC1809a1) this.f22237k, interfaceC5557c, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f22234h) {
            case 0:
                return ((C5514yp) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 1:
                return ((C5514yp) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            default:
                C5514yp c5514yp = (C5514yp) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c5514yp.invokeSuspend(c3967n);
                return c3967n;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        Object c3959f;
        C3959f c3959f2;
        Object obj2;
        int i9 = this.f22234h;
        boolean z9 = this.f22235i;
        Object obj3 = this.f22237k;
        Object obj4 = this.f22236j;
        switch (i9) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                Context context = (Context) obj4;
                C1391o c1391o = (C1391o) obj3;
                c1391o.getClass();
                try {
                    Object objM3776m = AbstractC1387k.m3776m(context, c1391o, z9);
                    AbstractC1089i.m2732I0(objM3776m);
                    C1385i c1385i = (C1385i) objM3776m;
                    String string = UUID.randomUUID().toString();
                    string.getClass();
                    String strM6737a0 = AbstractC3156t.m6737a0(string, "-", HttpUrl.FRAGMENT_ENCODE_SET, false);
                    MediaType mediaType = AbstractC1378b.f4576a;
                    Serializable serializableM3759k = AbstractC1378b.m3759k(context, c1391o.f4617a, c1391o.f4622f, strM6737a0);
                    if (serializableM3759k instanceof C3959f) {
                        serializableM3759k = null;
                    }
                    c3959f = new C1385i(c1385i.f4601a, c1385i.f4602b, c1385i.f4603c, (Long) serializableM3759k);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                return new C3960g(c3959f);
            case 1:
                AbstractC1089i.m2732I0(obj);
                Context context2 = (Context) obj4;
                String str = ((C1391o) obj3).f4617a;
                if (!z9) {
                    try {
                        Object objM3789a = AbstractC1393q.m3789a(context2);
                        AbstractC1089i.m2732I0(objM3789a);
                        Object objM3757i = AbstractC1378b.m3757i(context2, str, (C1395s) objM3789a);
                        AbstractC1089i.m2732I0(objM3757i);
                        obj2 = (C1388l) objM3757i;
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                        obj2 = c3959f2;
                    }
                    break;
                } else {
                    try {
                        Object objM3789a2 = AbstractC1393q.m3789a(context2);
                        AbstractC1089i.m2732I0(objM3789a2);
                        Object objM3761m = AbstractC1378b.m3761m(context2, str, (C1395s) objM3789a2);
                        AbstractC1089i.m2732I0(objM3761m);
                        obj2 = (C1388l) objM3761m;
                    } catch (Throwable th4) {
                        c3959f2 = new C3959f(th4);
                        obj2 = c3959f2;
                    }
                    break;
                }
                return new C3960g(obj2);
            default:
                AbstractC1089i.m2732I0(obj);
                if (((Boolean) ((InterfaceC1809a1) obj4).getValue()) == null) {
                    ((InterfaceC1809a1) obj3).setValue(Boolean.valueOf(z9));
                }
                return C3967n.f12976a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5514yp(boolean z9, Object obj, Object obj2, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f22234h = i9;
        this.f22235i = z9;
        this.f22236j = obj;
        this.f22237k = obj2;
    }
}
