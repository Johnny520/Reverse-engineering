package p345x8;

import java.util.List;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: x8.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5708a0 {

    /* JADX INFO: renamed from: a */
    public final String f23196a;

    /* JADX INFO: renamed from: b */
    public final String f23197b;

    /* JADX INFO: renamed from: c */
    public final Object f23198c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5708a0(String str, String str2, List list) {
        this.f23196a = str;
        this.f23197b = str2;
        this.f23198c = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5708a0)) {
            return false;
        }
        C5708a0 c5708a0 = (C5708a0) obj;
        return this.f23196a.equals(c5708a0.f23196a) && this.f23197b.equals(c5708a0.f23197b) && this.f23198c.equals(c5708a0.f23198c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f23198c.hashCode() + AbstractC0921a.m2244g(this.f23196a.hashCode() * 31, 31, this.f23197b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("XiaozhiVoiceOption(id=", this.f23196a, ", name=", this.f23197b, ", languages=");
        sbM1027p.append(this.f23198c);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
