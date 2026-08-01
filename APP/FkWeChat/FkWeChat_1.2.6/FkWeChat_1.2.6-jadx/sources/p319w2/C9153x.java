package p319w2;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: w2.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9153x {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9158y f31248a;

    /* JADX INFO: renamed from: b */
    public final int f31249b;

    /* JADX INFO: renamed from: c */
    public final int f31250c;

    public C9153x(InterfaceC9158y interfaceC9158y, int i10, int i11) {
        this.f31248a = interfaceC9158y;
        this.f31249b = i10;
        this.f31250c = i11;
    }

    /* JADX INFO: renamed from: a */
    public final int m35603a() {
        return this.f31250c;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC9158y m35604b() {
        return this.f31248a;
    }

    /* JADX INFO: renamed from: c */
    public final int m35605c() {
        return this.f31249b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9153x)) {
            return false;
        }
        C9153x c9153x = (C9153x) obj;
        return AbstractC1061t.m3842c(this.f31248a, c9153x.f31248a) && this.f31249b == c9153x.f31249b && this.f31250c == c9153x.f31250c;
    }

    public int hashCode() {
        return (((this.f31248a.hashCode() * 31) + Integer.hashCode(this.f31249b)) * 31) + Integer.hashCode(this.f31250c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f31248a + ", startIndex=" + this.f31249b + ", endIndex=" + this.f31250c + ')';
    }
}
