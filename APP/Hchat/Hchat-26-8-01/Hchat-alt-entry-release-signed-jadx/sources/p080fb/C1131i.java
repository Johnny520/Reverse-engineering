package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1131i {

    /* JADX INFO: renamed from: a */
    public final String f3702a;

    /* JADX INFO: renamed from: b */
    public final String f3703b;

    /* JADX INFO: renamed from: c */
    public final String f3704c;

    /* JADX INFO: renamed from: d */
    public final String f3705d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1131i(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.f3702a = str;
        this.f3703b = str2;
        this.f3704c = str3;
        this.f3705d = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1131i)) {
            return false;
        }
        C1131i c1131i = (C1131i) obj;
        return AbstractC1416l.m3825a(this.f3702a, c1131i.f3702a) && AbstractC1416l.m3825a(this.f3703b, c1131i.f3703b) && this.f3704c.equals(c1131i.f3704c) && AbstractC1416l.m3825a(this.f3705d, c1131i.f3705d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3705d.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3702a.hashCode() * 31, 31, this.f3703b), 31, this.f3704c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("NativeToolCall(id=", this.f3702a, ", name=", this.f3703b, ", arguments="), this.f3704c, ", providerMetadata=", this.f3705d, ")");
    }
}
