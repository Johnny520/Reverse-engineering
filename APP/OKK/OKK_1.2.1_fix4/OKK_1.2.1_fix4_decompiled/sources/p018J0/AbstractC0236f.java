package p018J0;

import p014H0.C0206e;
import p014H0.InterfaceC0202a;
import p014H0.InterfaceC0205d;

/* JADX INFO: renamed from: J0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0236f extends AbstractC0231a {
    public AbstractC0236f(InterfaceC0202a interfaceC0202a) {
        super(interfaceC0202a);
        if (interfaceC0202a != null && interfaceC0202a.mo588c() != C0206e.f423a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: c */
    public final InterfaceC0205d mo588c() {
        return C0206e.f423a;
    }
}
