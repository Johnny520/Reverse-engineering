package p366ya;

import android.view.View;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: ya.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6015e {

    /* JADX INFO: renamed from: a */
    public final View f24436a;

    /* JADX INFO: renamed from: b */
    public final float f24437b;

    /* JADX INFO: renamed from: c */
    public final int f24438c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6015e(View view, float f3, int i9) {
        view.getClass();
        this.f24436a = view;
        this.f24437b = f3;
        this.f24438c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6015e)) {
            return false;
        }
        C6015e c6015e = (C6015e) obj;
        return AbstractC1416l.m3825a(this.f24436a, c6015e.f24436a) && Float.compare(this.f24437b, c6015e.f24437b) == 0 && this.f24438c == c6015e.f24438c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f24438c) + AbstractC0921a.m2241d(this.f24437b, this.f24436a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BadgeHit(view=");
        sb2.append(this.f24436a);
        sb2.append(", distance=");
        sb2.append(this.f24437b);
        sb2.append(", area=");
        return AbstractC2091b.m5163j(sb2, this.f24438c, ")");
    }
}
