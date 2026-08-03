package p126ia;

import java.util.Arrays;

/* JADX INFO: renamed from: ia.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2006a {

    /* JADX INFO: renamed from: a */
    public final byte[] f6756a;

    /* JADX INFO: renamed from: b */
    public final boolean f6757b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2006a(byte[] bArr, boolean z9) {
        this.f6756a = bArr;
        this.f6757b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2006a)) {
            return false;
        }
        C2006a c2006a = (C2006a) obj;
        return this.f6756a.equals(c2006a.f6756a) && this.f6757b == c2006a.f6757b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f6757b) + (Arrays.hashCode(this.f6756a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FakeInteractionMergeResult(bytes=" + Arrays.toString(this.f6756a) + ", changed=" + this.f6757b + ")";
    }
}
