package p230p8;

import java.util.ArrayList;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: p8.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3370v {

    /* JADX INFO: renamed from: a */
    public final String f10879a;

    /* JADX INFO: renamed from: b */
    public final String f10880b;

    /* JADX INFO: renamed from: c */
    public final int f10881c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f10882d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3370v(String str, String str2, int i9, ArrayList arrayList) {
        this.f10879a = str;
        this.f10880b = str2;
        this.f10881c = i9;
        this.f10882d = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3370v)) {
            return false;
        }
        C3370v c3370v = (C3370v) obj;
        return this.f10879a.equals(c3370v.f10879a) && this.f10880b.equals(c3370v.f10880b) && this.f10881c == c3370v.f10881c && this.f10882d.equals(c3370v.f10882d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10882d.hashCode() + AbstractC0921a.m2242e(this.f10881c, AbstractC0921a.m2244g(this.f10879a.hashCode() * 31, 31, this.f10880b), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("SnsForwardSnapshot(id=", this.f10879a, ", text=", this.f10880b, ", type=");
        sbM1027p.append(this.f10881c);
        sbM1027p.append(", media=");
        sbM1027p.append(this.f10882d);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
