package p000;

import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: ch */
/* JADX INFO: loaded from: classes.dex */
public final class C0104ch implements InterfaceC0871ww, InterfaceC0786um {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f894a;

    /* JADX INFO: renamed from: b */
    public final Object f895b;

    public /* synthetic */ C0104ch(int i, Object obj) {
        this.f894a = i;
        this.f895b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m634a(Throwable th) {
        switch (this.f894a) {
            case Base64.DEFAULT /* 0 */:
                ((C0336ij) this.f895b).mo522b();
                break;
            default:
                ((InterfaceC0786um) this.f895b).mo26f(th);
                break;
        }
    }

    @Override // p000.InterfaceC0786um
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo26f(Object obj) {
        switch (this.f894a) {
            case Base64.DEFAULT /* 0 */:
                m634a((Throwable) obj);
                break;
            default:
                m634a((Throwable) obj);
                break;
        }
        return C0893xh.f5258n;
    }

    public final String toString() {
        switch (this.f894a) {
            case Base64.DEFAULT /* 0 */:
                return "DisposeOnCancel[" + ((C0336ij) this.f895b) + ']';
            default:
                return "InvokeOnCancel[" + ((InterfaceC0786um) this.f895b).getClass().getSimpleName() + '@' + AbstractC0259gf.m1262x(this) + ']';
        }
    }
}
