package a;

/* JADX INFO: loaded from: classes.dex */
public final class Sd implements java.lang.Iterable<java.lang.Object>, a.InterfaceC0336q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.S4 f264a;

    public Sd(a.S4 r1) {
            r0 = this;
            r0.<init>()
            r0.f264a = r1
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.Object> iterator() {
            r2 = this;
            a.S4 r0 = r2.f264a
            a.S4$a r1 = new a.S4$a
            r1.<init>(r0)
            return r1
    }
}
