package p361yc;

import p300uc.InterfaceC8647b;
import p314vb.C8895b;
import p329wc.AbstractC9217e;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: yc.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9682d0 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public static final C9682d0 f32915a = new C9682d0();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9218f f32916b = new C9749q2("kotlin.time.Duration", AbstractC9217e.i.f31464a);

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return f32916b;
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        m37842h(interfaceC9488f, ((C8895b) obj).m34125T());
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ Object mo15956d(InterfaceC9487e interfaceC9487e) {
        return C8895b.m34114m(m37841g(interfaceC9487e));
    }

    /* JADX INFO: renamed from: g */
    public long m37841g(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        return C8895b.f29484r.m34132f(interfaceC9487e.mo894k());
    }

    /* JADX INFO: renamed from: h */
    public void m37842h(InterfaceC9488f interfaceC9488f, long j10) {
        interfaceC9488f.getClass();
        interfaceC9488f.mo631F(C8895b.m34102P(j10));
    }
}
