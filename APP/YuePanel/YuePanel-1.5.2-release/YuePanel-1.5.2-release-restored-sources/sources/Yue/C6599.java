package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥۣۡۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6599<A, B> implements Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final A f16967;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final B f16968;

    public C6599(A a, B b) {
        this.f16967 = a;
        this.f16968 = b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥۣۡۦ۠ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C6599 m20936(C6599 c6599, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c6599.f16967;
        }
        if ((i & 2) != 0) {
            obj2 = c6599.f16968;
        }
        return c6599.m20937(obj, obj2);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6599)) {
            return false;
        }
        C6599 c6599 = (C6599) obj;
        return C5499.m17094(this.f16967, c6599.f16967) && C5499.m17094(this.f16968, c6599.f16968);
    }

    public int hashCode() {
        A a = this.f16967;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f16968;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    @InterfaceC6399
    public String toString() {
        return '(' + this.f16967 + ", " + this.f16968 + ')';
    }

    /* JADX INFO: renamed from: ۥ */
    public final A m3062() {
        return this.f16967;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final B m3063() {
        return this.f16968;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C6599<A, B> m20937(A a, B b) {
        return new C6599<>(a, b);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final A m20938() {
        return this.f16967;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final B m20939() {
        return this.f16968;
    }
}
