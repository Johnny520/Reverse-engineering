package p213ob;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: ob.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3122o {

    /* JADX INFO: renamed from: a */
    public final String f10124a;

    /* JADX INFO: renamed from: b */
    public final String f10125b;

    /* JADX INFO: renamed from: c */
    public final String f10126c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3122o(String str, String str2, String str3) {
        this.f10124a = str;
        this.f10125b = str2;
        this.f10126c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3122o)) {
            return false;
        }
        C3122o c3122o = (C3122o) obj;
        return this.f10124a.equals(c3122o.f10124a) && this.f10125b.equals(c3122o.f10125b) && this.f10126c.equals(c3122o.f10126c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10126c.hashCode() + AbstractC0921a.m2244g(this.f10124a.hashCode() * 31, 31, this.f10125b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("VoiceOption(key=", this.f10124a, ", label=", this.f10125b, ", voiceId="), this.f10126c, ")");
    }
}
