package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥۢۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8001<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final A f23793;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final B f23794;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C f23795;

    public C8001(A a, B b, C c) {
        this.f23793 = a;
        this.f23794 = b;
        this.f23795 = c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥۢۢۢ۟ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C8001 m25220(C8001 c8001, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = c8001.f23793;
        }
        if ((i & 2) != 0) {
            obj2 = c8001.f23794;
        }
        if ((i & 4) != 0) {
            obj3 = c8001.f23795;
        }
        return c8001.m25222(obj, obj2, obj3);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8001)) {
            return false;
        }
        C8001 c8001 = (C8001) obj;
        return C5499.m17094(this.f23793, c8001.f23793) && C5499.m17094(this.f23794, c8001.f23794) && C5499.m17094(this.f23795, c8001.f23795);
    }

    public int hashCode() {
        A a = this.f23793;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f23794;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f23795;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    @InterfaceC6399
    public String toString() {
        return '(' + this.f23793 + ", " + this.f23794 + ", " + this.f23795 + ')';
    }

    /* JADX INFO: renamed from: ۥ */
    public final A m4012() {
        return this.f23793;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final B m4013() {
        return this.f23794;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C m25221() {
        return this.f23795;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C8001<A, B, C> m25222(A a, B b, C c) {
        return new C8001<>(a, b, c);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final A m25223() {
        return this.f23793;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final B m25224() {
        return this.f23794;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C m25225() {
        return this.f23795;
    }
}
