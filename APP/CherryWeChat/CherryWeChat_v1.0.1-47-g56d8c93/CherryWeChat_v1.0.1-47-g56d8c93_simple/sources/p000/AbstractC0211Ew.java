package p000;

/* JADX INFO: renamed from: Ew */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0211Ew extends AbstractC2571u5 {
    public AbstractC0211Ew(InterfaceC0190Eb r2) {
        super(r2);
        if (r2 != null) goto L5;
        return;
    L5:
        if (r2.mo263e() != C0366If.f1247a) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac mo263e() {
        return C0366If.f1247a;
    }
}
