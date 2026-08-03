package p000;

/* JADX INFO: renamed from: de */
/* JADX INFO: loaded from: classes.dex */
public final class C1324de extends Exception {

    /* JADX INFO: renamed from: a */
    public final Throwable f4800a;

    public C1324de(Throwable th, AbstractC1217bc abstractC1217bc, InterfaceC1137ac interfaceC1137ac) {
        super("Coroutine dispatcher " + abstractC1217bc + " threw an exception, context = " + interfaceC1137ac, th);
        this.f4800a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f4800a;
    }
}
