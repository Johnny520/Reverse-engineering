package p000;

import android.graphics.Rect;

/* JADX INFO: renamed from: wl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0851wl {

    /* JADX INFO: renamed from: a */
    public final int f12569a;

    /* JADX INFO: renamed from: b */
    public final int f12570b;

    /* JADX INFO: renamed from: c */
    public final int f12571c;

    /* JADX INFO: renamed from: d */
    public final int f12572d;

    static {
        new C0851wl(0, 0, 0, 0);
    }

    public C0851wl(int i, int i2, int i3, int i4) {
        this.f12569a = i;
        this.f12570b = i2;
        this.f12571c = i3;
        this.f12572d = i4;
        if (i > i3) {
            C0676s.m4645c(vi0.m5689h("Left must be less than or equal to right, left: ", i, ", right: ", i3));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        C0676s.m4645c(vi0.m5689h("top must be less than or equal to bottom, top: ", i2, ", bottom: ", i4));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0851wl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C0851wl c0851wl = (C0851wl) obj;
        return this.f12569a == c0851wl.f12569a && this.f12570b == c0851wl.f12570b && this.f12571c == c0851wl.f12571c && this.f12572d == c0851wl.f12572d;
    }

    public final int hashCode() {
        return (((((this.f12569a * 31) + this.f12570b) * 31) + this.f12571c) * 31) + this.f12572d;
    }

    public final String toString() {
        return C0851wl.class.getSimpleName() + " { [" + this.f12569a + ',' + this.f12570b + ',' + this.f12571c + ',' + this.f12572d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0851wl(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
