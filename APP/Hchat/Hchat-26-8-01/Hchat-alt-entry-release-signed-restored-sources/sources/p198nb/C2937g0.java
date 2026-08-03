package p198nb;

import java.util.List;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: nb.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2937g0 {

    /* JADX INFO: renamed from: a */
    public final List f9630a;

    /* JADX INFO: renamed from: b */
    public final String f9631b;

    /* JADX INFO: renamed from: c */
    public final String f9632c;

    /* JADX INFO: renamed from: d */
    public final boolean f9633d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2937g0(List list, String str, String str2, boolean z9, int i9) {
        str = (i9 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        str2 = (i9 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        z9 = (i9 & 8) != 0 ? false : z9;
        str2.getClass();
        this.f9630a = list;
        this.f9631b = str;
        this.f9632c = str2;
        this.f9633d = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2937g0)) {
            return false;
        }
        C2937g0 c2937g0 = (C2937g0) obj;
        return this.f9630a.equals(c2937g0.f9630a) && this.f9631b.equals(c2937g0.f9631b) && this.f9632c.equals(c2937g0.f9632c) && this.f9633d == c2937g0.f9633d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f9633d) + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f9630a.hashCode() * 31, 31, this.f9631b), 31, this.f9632c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextSpeechVoiceLoadResult(options=" + this.f9630a + ", error=" + this.f9631b + ", activeEnginePackage=" + this.f9632c + ", usedFallback=" + this.f9633d + ")";
    }
}
