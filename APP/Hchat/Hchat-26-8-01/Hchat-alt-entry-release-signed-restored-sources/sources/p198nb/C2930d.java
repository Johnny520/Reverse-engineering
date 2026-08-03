package p198nb;

import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: nb.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2930d {

    /* JADX INFO: renamed from: a */
    public final String f9588a;

    /* JADX INFO: renamed from: b */
    public final String f9589b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2930d(String str, String str2) {
        this.f9588a = str;
        this.f9589b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2930d)) {
            return false;
        }
        C2930d c2930d = (C2930d) obj;
        return this.f9588a.equals(c2930d.f9588a) && this.f9589b.equals(c2930d.f9589b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9589b.hashCode() + (this.f9588a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("TextSpeechEngineOption(packageName=", this.f9588a, ", label=", this.f9589b, ")");
    }
}
