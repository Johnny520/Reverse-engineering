package p073f2;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: f2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2227a implements InterfaceC2277y {

    /* JADX INFO: renamed from: b */
    public final int f6073b;

    public C2227a(int i10) {
        this.f6073b = i10;
    }

    /* JADX INFO: renamed from: a */
    public final int m8025a() {
        return this.f6073b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1061t.m3842c(C2227a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f6073b == ((C2227a) obj).f6073b;
    }

    public int hashCode() {
        return this.f6073b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f6073b + ')';
    }
}
