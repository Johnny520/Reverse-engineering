package p332wb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: wb.b3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4737b3 {

    /* JADX INFO: renamed from: a */
    public final String f15962a;

    /* JADX INFO: renamed from: b */
    public final String f15963b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1231l f15964c;

    /* JADX INFO: renamed from: d */
    public final boolean f15965d;

    /* JADX INFO: renamed from: e */
    public final String f15966e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4737b3(String str, String str2, InterfaceC1231l interfaceC1231l, boolean z9, String str3) {
        str2.getClass();
        interfaceC1231l.getClass();
        this.f15962a = str;
        this.f15963b = str2;
        this.f15964c = interfaceC1231l;
        this.f15965d = z9;
        this.f15966e = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4737b3)) {
            return false;
        }
        C4737b3 c4737b3 = (C4737b3) obj;
        return this.f15962a.equals(c4737b3.f15962a) && AbstractC1416l.m3825a(this.f15963b, c4737b3.f15963b) && AbstractC1416l.m3825a(this.f15964c, c4737b3.f15964c) && this.f15965d == c4737b3.f15965d && this.f15966e.equals(c4737b3.f15966e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f15966e.hashCode() + AbstractC0921a.m2245h((this.f15964c.hashCode() + AbstractC0921a.m2244g(this.f15962a.hashCode() * 31, 31, this.f15963b)) * 31, 31, this.f15965d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("FavoritePickerRequest(title=", this.f15962a, ", existingValue=", this.f15963b, ", onValue=");
        sbM1027p.append(this.f15964c);
        sbM1027p.append(", multiSelect=");
        sbM1027p.append(this.f15965d);
        sbM1027p.append(", delimiter=");
        return AbstractC0921a.m2255r(sbM1027p, this.f15966e, ")");
    }
}
