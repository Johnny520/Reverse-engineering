package p332wb;

import gg.AbstractC1416l;
import java.util.LinkedHashSet;
import java.util.Set;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: wb.d4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4804d4 {

    /* JADX INFO: renamed from: a */
    public final String f16498a;

    /* JADX INFO: renamed from: b */
    public final String f16499b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1231l f16500c;

    /* JADX INFO: renamed from: d */
    public final Set f16501d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4804d4(String str, String str2, InterfaceC1231l interfaceC1231l, LinkedHashSet linkedHashSet) {
        this.f16498a = str;
        this.f16499b = str2;
        this.f16500c = interfaceC1231l;
        this.f16501d = linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4804d4)) {
            return false;
        }
        C4804d4 c4804d4 = (C4804d4) obj;
        return AbstractC1416l.m3825a(this.f16498a, c4804d4.f16498a) && AbstractC1416l.m3825a(this.f16499b, c4804d4.f16499b) && AbstractC1416l.m3825a(this.f16500c, c4804d4.f16500c) && AbstractC1416l.m3825a(this.f16501d, c4804d4.f16501d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f16500c.hashCode() + AbstractC0921a.m2244g(this.f16498a.hashCode() * 31, 31, this.f16499b)) * 31;
        Set set = this.f16501d;
        return iHashCode + (set == null ? 0 : set.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("GroupMemberPickerRequest(title=", this.f16498a, ", existingValue=", this.f16499b, ", onValue=");
        sbM1027p.append(this.f16500c);
        sbM1027p.append(", allowedGroupIds=");
        sbM1027p.append(this.f16501d);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
