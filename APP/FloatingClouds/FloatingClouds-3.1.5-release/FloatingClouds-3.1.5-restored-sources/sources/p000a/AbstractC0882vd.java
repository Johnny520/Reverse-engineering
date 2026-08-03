package p000a;

/* JADX INFO: renamed from: a.vd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0882vd extends AbstractC0399W1 {
    public AbstractC0882vd(InterfaceC0474a4<Object> interfaceC0474a4) {
        super(interfaceC0474a4);
        if (interfaceC0474a4 != null && interfaceC0474a4.mo846c() != C0403W5.f1543a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p000a.InterfaceC0474a4
    /* JADX INFO: renamed from: c */
    public final InterfaceC0911x4 mo846c() {
        return C0403W5.f1543a;
    }
}
