package p258r8;

import java.util.ArrayList;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p077f8.InterfaceC1084d;
import p080fb.AbstractC1184v0;
import p317vb.C4546c;
import p317vb.InterfaceC4544a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: r8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3736a implements InterfaceC3741f {

    /* JADX INFO: renamed from: a */
    public final ArrayList f12117a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f12118b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f12119c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public C3742g f12120d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: c */
    public final void mo4941c(C3742g c3742g) {
        c3742g.getClass();
        this.f12120d = c3742g;
        mo299g(c3742g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: d */
    public final void mo4988d(C3742g c3742g) {
        c3742g.getClass();
        this.f12120d = c3742g;
        mo298f(c3742g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m7750e(String str, Throwable th2) {
        str.getClass();
        AbstractC1184v0.m3204n(AbstractC0255e.m1022k("[Hchat:", mo297a(), "] ", str, th2 != null ? AbstractC4855en.m9263g(": ", th2.getMessage()) : HttpUrl.FRAGMENT_ENCODE_SET), th2);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo298f(C3742g c3742g);

    /* JADX INFO: renamed from: g */
    public abstract void mo299g(C3742g c3742g);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m7751h(InterfaceC4544a interfaceC4544a) {
        C3742g c3742g = this.f12120d;
        if (c3742g != null) {
            c3742g.f12151i.getClass();
            C4546c.m8971a(interfaceC4544a);
            this.f12119c.add(interfaceC4544a.mo4983a());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m7752i(Class cls, InterfaceC1084d interfaceC1084d) {
        C3742g c3742g = this.f12120d;
        if (c3742g != null) {
            this.f12117a.add(c3742g.f12148f.m2716c(cls, interfaceC1084d));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m7753j(Object obj) {
        if (obj != null) {
            this.f12118b.add(obj);
        }
    }
}
