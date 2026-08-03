package p015b0;

import ac.RunnableC0059l;
import android.view.ActionMode;
import android.view.View;
import p040d0.InterfaceC0647d;
import p040d0.InterfaceC0648e;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p144k.C2176h1;
import p276sf.C3967n;
import p322w0.C4668s;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;

/* JADX INFO: renamed from: b0.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0142h implements InterfaceC0648e {

    /* JADX INFO: renamed from: a */
    public final View f367a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1231l f368b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1220a f369c;

    /* JADX INFO: renamed from: d */
    public final C2176h1 f370d = new C2176h1();

    /* JADX INFO: renamed from: e */
    public final C4668s f371e = new C4668s(new C0129a(this, 0));

    /* JADX INFO: renamed from: f */
    public final C0129a f372f = new C0129a(this, 1);

    /* JADX INFO: renamed from: g */
    public final C0129a f373g = new C0129a(this, 2);

    /* JADX INFO: renamed from: h */
    public ActionMode f374h;

    /* JADX INFO: renamed from: i */
    public RunnableC0059l f375i;

    /* JADX INFO: renamed from: j */
    public Runnable f376j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0142h(View view, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a) {
        this.f367a = view;
        this.f368b = interfaceC1231l;
        this.f369c = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040d0.InterfaceC0648e
    /* JADX INFO: renamed from: a */
    public final Object mo716a(InterfaceC0647d interfaceC0647d, AbstractC6044i abstractC6044i) {
        Object objM5407b = C2176h1.m5407b(this.f370d, new C0141g(this, interfaceC0647d, null, 0), abstractC6044i);
        return objM5407b == EnumC5799a.f23547g ? objM5407b : C3967n.f12976a;
    }
}
