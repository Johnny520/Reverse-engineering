package p000;

import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: ah */
/* JADX INFO: loaded from: classes.dex */
public final class C0018ah implements InterfaceC0574ow, InterfaceC0713sm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141a;

    /* JADX INFO: renamed from: b */
    public final Object f142b;

    public /* synthetic */ C0018ah(int i, Object obj) {
        this.f141a = i;
        this.f142b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m95a(Throwable th) {
        switch (this.f141a) {
            case Base64.DEFAULT /* 0 */:
                ((C0263gj) this.f142b).mo1361b();
                break;
            default:
                ((InterfaceC0713sm) this.f142b).mo96f(th);
                break;
        }
    }

    @Override // p000.InterfaceC0713sm
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo96f(Object obj) {
        switch (this.f141a) {
            case Base64.DEFAULT /* 0 */:
                m95a((Throwable) obj);
                break;
            default:
                m95a((Throwable) obj);
                break;
        }
        return C0819vh.f4855n;
    }

    public final String toString() {
        switch (this.f141a) {
            case Base64.DEFAULT /* 0 */:
                return "DisposeOnCancel[" + ((C0263gj) this.f142b) + ']';
            default:
                return "InvokeOnCancel[" + ((InterfaceC0713sm) this.f142b).getClass().getSimpleName() + '@' + AbstractC0222ff.m1197s(this) + ']';
        }
    }
}
