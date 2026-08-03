package p065eb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: eb.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0872i {

    /* JADX INFO: renamed from: a */
    public final String f2676a;

    /* JADX INFO: renamed from: b */
    public final String f2677b;

    /* JADX INFO: renamed from: c */
    public final String f2678c;

    /* JADX INFO: renamed from: d */
    public final int f2679d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0872i(int i9, String str, String str2, String str3) {
        str3.getClass();
        this.f2676a = str;
        this.f2677b = str2;
        this.f2678c = str3;
        this.f2679d = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0872i)) {
            return false;
        }
        C0872i c0872i = (C0872i) obj;
        return this.f2676a.equals(c0872i.f2676a) && this.f2677b.equals(c0872i.f2677b) && AbstractC1416l.m3825a(this.f2678c, c0872i.f2678c) && this.f2679d == c0872i.f2679d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f2679d) + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f2676a.hashCode() * 31, 31, this.f2677b), 31, this.f2678c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("NewFriendEvent(wxid=", this.f2676a, ", verifyUsername=", this.f2677b, ", ticket=");
        sbM1027p.append(this.f2678c);
        sbM1027p.append(", scene=");
        sbM1027p.append(this.f2679d);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
