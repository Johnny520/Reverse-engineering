package p152e0;

import android.app.PendingIntent;
import p000A.C0072l0;
import p000A.C0099z;
import p095T.C1357e;
import p095T.InterfaceC1306C0;
import p158f0.InterfaceC2083o;

/* JADX INFO: renamed from: e0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1995b implements InterfaceC1306C0 {

    /* JADX INFO: renamed from: d */
    public InterfaceC2003j f6706d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1999f f6707e;

    /* JADX INFO: renamed from: f */
    public String f6708f;

    /* JADX INFO: renamed from: g */
    public Object f6709g;

    /* JADX INFO: renamed from: h */
    public Object[] f6710h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1998e f6711i;

    /* JADX INFO: renamed from: j */
    public final C0099z f6712j = new C0099z(18, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1995b(InterfaceC2003j interfaceC2003j, InterfaceC1999f interfaceC1999f, String str, Object obj, Object[] objArr) {
        this.f6706d = interfaceC2003j;
        this.f6707e = interfaceC1999f;
        this.f6708f = str;
        this.f6709g = obj;
        this.f6710h = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: a */
    public final void mo2401a() throws PendingIntent.CanceledException {
        m3666b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3666b() throws PendingIntent.CanceledException {
        String strM3669a;
        InterfaceC1999f interfaceC1999f = this.f6707e;
        if (this.f6711i != null) {
            throw new IllegalArgumentException(("entry(" + this.f6711i + ") is not null").toString());
        }
        if (interfaceC1999f != null) {
            C0099z c0099z = this.f6712j;
            Object objMo6a = c0099z.mo6a();
            if (objMo6a == null || interfaceC1999f.mo1275a(objMo6a)) {
                this.f6711i = interfaceC1999f.mo1278d(this.f6708f, c0099z);
                return;
            }
            if (objMo6a instanceof InterfaceC2083o) {
                InterfaceC2083o interfaceC2083o = (InterfaceC2083o) objMo6a;
                if (interfaceC2083o.mo2506d() == C1357e.f4795g || interfaceC2083o.mo2506d() == C1357e.f4798j || interfaceC2083o.mo2506d() == C1357e.f4796h) {
                    strM3669a = "MutableState containing " + interfaceC2083o.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM3669a = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM3669a = AbstractC2004k.m3669a(objMo6a);
            }
            throw new IllegalArgumentException(strM3669a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: d */
    public final void mo2402d() {
        InterfaceC1998e interfaceC1998e = this.f6711i;
        if (interfaceC1998e != null) {
            ((C0072l0) interfaceC1998e).m96B();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: e */
    public final void mo2403e() {
        InterfaceC1998e interfaceC1998e = this.f6711i;
        if (interfaceC1998e != null) {
            ((C0072l0) interfaceC1998e).m96B();
        }
    }
}
