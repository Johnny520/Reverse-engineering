package p018J0;

import p014H0.C0206e;
import p014H0.InterfaceC0202a;
import p014H0.InterfaceC0205d;

/* JADX INFO: renamed from: J0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0236f extends AbstractC0231a {
    public AbstractC0236f(InterfaceC0202a r2) {
        super(r2);
        if (r2 != null) goto L5;
        return;
    L5:
        if (r2.mo588c() != C0206e.f423a) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
    }

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: c */
    public final InterfaceC0205d mo588c() {
        return C0206e.f423a;
    }
}
