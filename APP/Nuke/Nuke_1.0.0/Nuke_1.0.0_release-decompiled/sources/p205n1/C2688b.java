package p205n1;

import android.graphics.Insets;
import p059L0.AbstractC0955a;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: n1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2688b {

    /* JADX INFO: renamed from: e */
    public static final C2688b f8571e = new C2688b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f8572a;

    /* JADX INFO: renamed from: b */
    public final int f8573b;

    /* JADX INFO: renamed from: c */
    public final int f8574c;

    /* JADX INFO: renamed from: d */
    public final int f8575d;

    public C2688b(int i5, int i6, int i7, int i8) {
        this.f8572a = i5;
        this.f8573b = i6;
        this.f8574c = i7;
        this.f8575d = i8;
    }

    /* JADX INFO: renamed from: a */
    public static C2688b m4666a(C2688b c2688b, C2688b c2688b2) {
        return m4667b(Math.max(c2688b.f8572a, c2688b2.f8572a), Math.max(c2688b.f8573b, c2688b2.f8573b), Math.max(c2688b.f8574c, c2688b2.f8574c), Math.max(c2688b.f8575d, c2688b2.f8575d));
    }

    /* JADX INFO: renamed from: b */
    public static C2688b m4667b(int i5, int i6, int i7, int i8) {
        return (i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) ? f8571e : new C2688b(i5, i6, i7, i8);
    }

    /* JADX INFO: renamed from: c */
    public static C2688b m4668c(Insets insets) {
        return m4667b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m4669d() {
        return AbstractC0955a.m1962h(this.f8572a, this.f8573b, this.f8574c, this.f8575d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2688b.class != obj.getClass()) {
            return false;
        }
        C2688b c2688b = (C2688b) obj;
        return this.f8575d == c2688b.f8575d && this.f8572a == c2688b.f8572a && this.f8574c == c2688b.f8574c && this.f8573b == c2688b.f8573b;
    }

    public final int hashCode() {
        return (((((this.f8572a * 31) + this.f8573b) * 31) + this.f8574c) * 31) + this.f8575d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f8572a);
        sb.append(", top=");
        sb.append(this.f8573b);
        sb.append(", right=");
        sb.append(this.f8574c);
        sb.append(", bottom=");
        return AbstractC3202a.m5466a(sb, this.f8575d, '}');
    }
}
