package a;

/* JADX INFO: renamed from: a.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0061b4 extends a.W1 {
    public final a.InterfaceC0456x4 b;
    public transient a.InterfaceC0042a4<java.lang.Object> c;

    public AbstractC0061b4(a.InterfaceC0042a4<java.lang.Object> r1, a.InterfaceC0456x4 r2) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            return
    }

    @Override // a.InterfaceC0042a4
    public final a.InterfaceC0456x4 c() {
            r1 = this;
            a.x4 r0 = r1.b
            a.C0193i9.b(r0)
            return r0
    }

    @Override // a.W1
    public final void i() {
            r3 = this;
            a.a4<java.lang.Object> r0 = r3.c
            if (r0 == 0) goto L19
            if (r0 == r3) goto L19
            a.x4 r1 = r3.b
            a.C0193i9.b(r1)
            a.c4$a r2 = a.InterfaceC0080c4.a.f415a
            a.x4$a r1 = r1.b(r2)
            a.C0193i9.b(r1)
            a.c4 r1 = (a.InterfaceC0080c4) r1
            r1.a(r0)
        L19:
            a.y3 r0 = a.C0473y3.f766a
            r3.c = r0
            return
    }
}
