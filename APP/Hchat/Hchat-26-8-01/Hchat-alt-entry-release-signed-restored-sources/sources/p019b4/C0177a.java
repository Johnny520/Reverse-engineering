package p019b4;

import android.graphics.Rect;
import gg.AbstractC1416l;
import p004a4.C0015a;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: b4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0177a {

    /* JADX INFO: renamed from: a */
    public final C0015a f458a;

    /* JADX INFO: renamed from: b */
    public final float f459b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0177a(Rect rect, float f3) {
        this.f458a = new C0015a(rect);
        this.f459b = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Rect m774a() {
        C0015a c0015a = this.f458a;
        c0015a.getClass();
        return new Rect(c0015a.f50a, c0015a.f51b, c0015a.f52c, c0015a.f53d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0177a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C0177a c0177a = (C0177a) obj;
        return AbstractC1416l.m3825a(this.f458a, c0177a.f458a) && this.f459b == c0177a.f459b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f459b) + (this.f458a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowMetrics(_bounds=");
        sb2.append(this.f458a);
        sb2.append(", density=");
        return AbstractC0921a.m2252o(sb2, this.f459b, ')');
    }

    public C0177a(C0015a c0015a, float f3) {
        this.f458a = c0015a;
        this.f459b = f3;
    }
}
