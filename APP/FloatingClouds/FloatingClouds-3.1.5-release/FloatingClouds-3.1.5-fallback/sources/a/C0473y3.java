package a;

/* JADX INFO: renamed from: a.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0473y3 implements a.InterfaceC0042a4<java.lang.Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0473y3 f766a = null;

    static {
            a.y3 r0 = new a.y3
            r0.<init>()
            a.C0473y3.f766a = r0
            return
    }

    @Override // a.InterfaceC0042a4
    public final a.InterfaceC0456x4 c() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This continuation is already complete"
            r0.<init>(r1)
            throw r0
    }

    @Override // a.InterfaceC0042a4
    public final void d(java.lang.Object r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This continuation is already complete"
            r2.<init>(r0)
            throw r2
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "This continuation is already complete"
            return r0
    }
}
