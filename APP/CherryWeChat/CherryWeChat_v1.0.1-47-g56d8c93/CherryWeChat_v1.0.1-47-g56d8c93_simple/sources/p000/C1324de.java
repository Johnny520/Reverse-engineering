package p000;

/* JADX INFO: renamed from: de */
/* JADX INFO: loaded from: classes.dex */
public final class C1324de extends Exception {

    /* JADX INFO: renamed from: a */
    public final Throwable f4800a;

    public C1324de(Throwable r3, AbstractC1217bc r4, InterfaceC1137ac r5) {
        super("Coroutine dispatcher " + r4 + " threw an exception, context = " + r5, r3);
        this.f4800a = r3;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f4800a;
    }
}
