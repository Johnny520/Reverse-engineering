package p198nb;

import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: nb.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2939h0 {

    /* JADX INFO: renamed from: a */
    public final String f9639a;

    /* JADX INFO: renamed from: b */
    public final String f9640b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2939h0(String str, String str2) {
        this.f9639a = str;
        this.f9640b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2939h0)) {
            return false;
        }
        C2939h0 c2939h0 = (C2939h0) obj;
        return this.f9639a.equals(c2939h0.f9639a) && this.f9640b.equals(c2939h0.f9640b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9640b.hashCode() + (this.f9639a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("TextSpeechVoiceOption(name=", this.f9639a, ", label=", this.f9640b, ")");
    }
}
