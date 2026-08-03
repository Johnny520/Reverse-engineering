package p004a4;

import android.graphics.Rect;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: a4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0015a {

    /* JADX INFO: renamed from: a */
    public final int f50a;

    /* JADX INFO: renamed from: b */
    public final int f51b;

    /* JADX INFO: renamed from: c */
    public final int f52c;

    /* JADX INFO: renamed from: d */
    public final int f53d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C0015a(0, 0, 0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0015a(int i9, int i10, int i11, int i12) {
        this.f50a = i9;
        this.f51b = i10;
        this.f52c = i11;
        this.f53d = i12;
        if (i9 > i11) {
            C2104o.m5291q(AbstractC3199a.m6837j(i9, "Left must be less than or equal to right, left: ", ", right: ", i11));
            throw null;
        }
        if (i10 <= i12) {
            return;
        }
        C2104o.m5291q(AbstractC3199a.m6837j(i10, "top must be less than or equal to bottom, top: ", ", bottom: ", i12));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0015a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C0015a c0015a = (C0015a) obj;
        return this.f50a == c0015a.f50a && this.f51b == c0015a.f51b && this.f52c == c0015a.f52c && this.f53d == c0015a.f53d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((((this.f50a * 31) + this.f51b) * 31) + this.f52c) * 31) + this.f53d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C0015a.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f50a);
        sb2.append(',');
        sb2.append(this.f51b);
        sb2.append(',');
        sb2.append(this.f52c);
        sb2.append(',');
        return AbstractC2091b.m5163j(sb2, this.f53d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0015a(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
