package p058L;

import p000A.EnumC0050a0;
import p011B4.AbstractC0231b;
import p204n0.C2683b;

/* JADX INFO: renamed from: L.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0902D {

    /* JADX INFO: renamed from: a */
    public final EnumC0050a0 f2805a;

    /* JADX INFO: renamed from: b */
    public final long f2806b;

    /* JADX INFO: renamed from: c */
    public final EnumC0901C f2807c;

    /* JADX INFO: renamed from: d */
    public final boolean f2808d;

    public C0902D(EnumC0050a0 enumC0050a0, long j5, EnumC0901C enumC0901C, boolean z5) {
        this.f2805a = enumC0050a0;
        this.f2806b = j5;
        this.f2807c = enumC0901C;
        this.f2808d = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0902D)) {
            return false;
        }
        C0902D c0902d = (C0902D) obj;
        return this.f2805a == c0902d.f2805a && C2683b.m4644b(this.f2806b, c0902d.f2806b) && this.f2807c == c0902d.f2807c && this.f2808d == c0902d.f2808d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2808d) + ((this.f2807c.hashCode() + AbstractC0231b.m392c(this.f2805a.hashCode() * 31, 31, this.f2806b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f2805a + ", position=" + ((Object) C2683b.m4649g(this.f2806b)) + ", anchor=" + this.f2807c + ", visible=" + this.f2808d + ')';
    }
}
