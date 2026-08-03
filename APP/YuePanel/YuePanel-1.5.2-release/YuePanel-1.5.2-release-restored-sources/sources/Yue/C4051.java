package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4051 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC5568
    @InterfaceC6489
    public final Object f638;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC5124<Throwable, C8107> f639;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.lang.Throwable, Yue.ۥۣۢ۠ۤ> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4051(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        this.f638 = obj;
        this.f639 = interfaceC5124;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥ۟ۦۣۣ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C4051 m11483(C4051 c4051, Object obj, InterfaceC5124 interfaceC5124, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = c4051.f638;
        }
        if ((i & 2) != 0) {
            interfaceC5124 = c4051.f639;
        }
        return c4051.m11484(obj, interfaceC5124);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4051)) {
            return false;
        }
        C4051 c4051 = (C4051) obj;
        return C5499.m17094(this.f638, c4051.f638) && C5499.m17094(this.f639, c4051.f639);
    }

    public int hashCode() {
        Object obj = this.f638;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f639.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f638 + ", onCancellation=" + this.f639 + ')';
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final Object m1004() {
        return this.f638;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final InterfaceC5124<Throwable, C8107> m1005() {
        return this.f639;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C4051 m11484(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        return new C4051(obj, interfaceC5124);
    }
}
