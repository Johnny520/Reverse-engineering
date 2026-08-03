package p042d2;

import android.content.res.Resources;
import gg.AbstractC1416l;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: d2.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0682b {

    /* JADX INFO: renamed from: a */
    public final Resources.Theme f2088a;

    /* JADX INFO: renamed from: b */
    public final int f2089b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0682b(Resources.Theme theme, int i9) {
        this.f2088a = theme;
        this.f2089b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0682b)) {
            return false;
        }
        C0682b c0682b = (C0682b) obj;
        return AbstractC1416l.m3825a(this.f2088a, c0682b.f2088a) && this.f2089b == c0682b.f2089b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f2089b) + (this.f2088a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f2088a);
        sb2.append(", id=");
        return AbstractC3199a.m6841n(sb2, this.f2089b, ')');
    }
}
