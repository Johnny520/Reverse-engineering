package p000;

/* JADX INFO: renamed from: Ew */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0211Ew extends AbstractC2571u5 {
    public AbstractC0211Ew(InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        if (interfaceC0190Eb != null && interfaceC0190Eb.mo263e() != C0366If.f1247a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac mo263e() {
        return C0366If.f1247a;
    }
}
