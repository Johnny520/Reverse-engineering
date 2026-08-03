package p080fb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: fb.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1100a0 {

    /* JADX INFO: renamed from: a */
    public final EnumC1104b0 f3544a;

    /* JADX INFO: renamed from: b */
    public final String f3545b;

    /* JADX INFO: renamed from: c */
    public final boolean f3546c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1100a0(EnumC1104b0 enumC1104b0, String str, boolean z9) {
        enumC1104b0.getClass();
        str.getClass();
        this.f3544a = enumC1104b0;
        this.f3545b = str;
        this.f3546c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1100a0)) {
            return false;
        }
        C1100a0 c1100a0 = (C1100a0) obj;
        return this.f3544a == c1100a0.f3544a && AbstractC1416l.m3825a(this.f3545b, c1100a0.f3545b) && this.f3546c == c1100a0.f3546c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3546c) + AbstractC0921a.m2244g(this.f3544a.hashCode() * 31, 31, this.f3545b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScriptPluginAgentIssue(level=");
        sb2.append(this.f3544a);
        sb2.append(", message=");
        sb2.append(this.f3545b);
        sb2.append(", risky=");
        return AbstractC3199a.m6840m(")", sb2, this.f3546c);
    }
}
