package p211o0;

import p011B4.AbstractC0231b;
import p204n0.C2683b;

/* JADX INFO: renamed from: o0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C2737L {

    /* JADX INFO: renamed from: d */
    public static final C2737L f8703d = new C2737L(AbstractC2767z.m4934d(4278190080L), 0, 0.0f);

    /* JADX INFO: renamed from: a */
    public final long f8704a;

    /* JADX INFO: renamed from: b */
    public final long f8705b;

    /* JADX INFO: renamed from: c */
    public final float f8706c;

    public C2737L(long j5, long j6, float f2) {
        this.f8704a = j5;
        this.f8705b = j6;
        this.f8706c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2737L)) {
            return false;
        }
        C2737L c2737l = (C2737L) obj;
        return C2762u.m4921c(this.f8704a, c2737l.f8704a) && C2683b.m4644b(this.f8705b, c2737l.f8705b) && this.f8706c == c2737l.f8706c;
    }

    public final int hashCode() {
        int i5 = C2762u.f8763h;
        return Float.hashCode(this.f8706c) + AbstractC0231b.m392c(Long.hashCode(this.f8704a) * 31, 31, this.f8705b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC0231b.m406q(this.f8704a, sb, ", offset=");
        sb.append((Object) C2683b.m4649g(this.f8705b));
        sb.append(", blurRadius=");
        return AbstractC0231b.m401l(sb, this.f8706c, ')');
    }
}
