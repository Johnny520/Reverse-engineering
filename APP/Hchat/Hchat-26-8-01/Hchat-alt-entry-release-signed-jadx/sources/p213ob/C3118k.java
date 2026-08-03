package p213ob;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: ob.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3118k {

    /* JADX INFO: renamed from: a */
    public final String f10102a;

    /* JADX INFO: renamed from: b */
    public final String f10103b;

    /* JADX INFO: renamed from: c */
    public final String f10104c;

    /* JADX INFO: renamed from: d */
    public final float f10105d;

    /* JADX INFO: renamed from: e */
    public final boolean f10106e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3118k(String str, String str2, String str3, float f3, boolean z9) {
        str2.getClass();
        this.f10102a = str;
        this.f10103b = str2;
        this.f10104c = str3;
        this.f10105d = f3;
        this.f10106e = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3118k)) {
            return false;
        }
        C3118k c3118k = (C3118k) obj;
        return this.f10102a.equals(c3118k.f10102a) && AbstractC1416l.m3825a(this.f10103b, c3118k.f10103b) && this.f10104c.equals(c3118k.f10104c) && Float.compare(this.f10105d, c3118k.f10105d) == 0 && this.f10106e == c3118k.f10106e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f10106e) + AbstractC0921a.m2241d(this.f10105d, AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f10102a.hashCode() * 31, 31, this.f10103b), 31, this.f10104c), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("SynthesisConfig(engine=", this.f10102a, ", voiceId=", this.f10103b, ", ttsVoice=");
        sbM1027p.append(this.f10104c);
        sbM1027p.append(", speechRate=");
        sbM1027p.append(this.f10105d);
        sbM1027p.append(", english=");
        return AbstractC3199a.m6840m(")", sbM1027p, this.f10106e);
    }
}
