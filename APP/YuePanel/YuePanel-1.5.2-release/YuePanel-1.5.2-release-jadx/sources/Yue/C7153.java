package Yue;

import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥۡۦۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7153<T> extends AbstractC5556 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3666<T> f21571;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۟ۨ۠<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7153(@InterfaceC6399 C3666<? super T> c3666) {
        this.f21571 = c3666;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5124
    public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
        mo9329(th);
        return C8107.f3222;
    }

    @Override // Yue.AbstractC4052
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    public void mo9329(@InterfaceC6489 Throwable th) {
        Object objM17273 = m17241().m17273();
        if (objM17273 instanceof C4050) {
            C3666<T> c3666 = this.f21571;
            C7148.C1189 c1189 = C7148.f21560;
            c3666.resumeWith(C7148.m3438(C7149.m3441(((C4050) objM17273).f637)));
        } else {
            C3666<T> c36662 = this.f21571;
            C7148.C1189 c11892 = C7148.f21560;
            c36662.resumeWith(C7148.m3438(C5561.m17327(objM17273)));
        }
    }
}
