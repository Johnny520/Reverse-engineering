package ba;

import android.graphics.drawable.Drawable;
import gg.AbstractC1416l;
import java.util.List;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: ba.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0230j {

    /* JADX INFO: renamed from: a */
    public final Drawable f571a;

    /* JADX INFO: renamed from: b */
    public final int f572b;

    /* JADX INFO: renamed from: c */
    public final int f573c;

    /* JADX INFO: renamed from: d */
    public final int f574d;

    /* JADX INFO: renamed from: e */
    public final int f575e;

    /* JADX INFO: renamed from: f */
    public final Object f576f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0230j(Drawable drawable, int i9, int i10, int i11, int i12, List list) {
        this.f571a = drawable;
        this.f572b = i9;
        this.f573c = i10;
        this.f574d = i11;
        this.f575e = i12;
        this.f576f = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0230j)) {
            return false;
        }
        C0230j c0230j = (C0230j) obj;
        return AbstractC1416l.m3825a(this.f571a, c0230j.f571a) && this.f572b == c0230j.f572b && this.f573c == c0230j.f573c && this.f574d == c0230j.f574d && this.f575e == c0230j.f575e && this.f576f.equals(c0230j.f576f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Drawable drawable = this.f571a;
        return this.f576f.hashCode() + AbstractC0921a.m2242e(this.f575e, AbstractC0921a.m2242e(this.f574d, AbstractC0921a.m2242e(this.f573c, AbstractC0921a.m2242e(this.f572b, (drawable == null ? 0 : drawable.hashCode()) * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OriginalState(background=");
        sb2.append(this.f571a);
        sb2.append(", paddingLeft=");
        sb2.append(this.f572b);
        sb2.append(", paddingTop=");
        AbstractC4855en.m9272p(sb2, this.f573c, ", paddingRight=", this.f574d, ", paddingBottom=");
        sb2.append(this.f575e);
        sb2.append(", textColorStates=");
        sb2.append(this.f576f);
        sb2.append(")");
        return sb2.toString();
    }
}
