package p050I3;

import java.util.Arrays;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: I3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0805e {

    /* JADX INFO: renamed from: a */
    public final byte[] f2591a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0805e(byte[] bArr) {
        this.f2591a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0805e) && AbstractC1665j.m2981a(this.f2591a, ((C0805e) obj).f2591a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        byte[] bArr = this.f2591a;
        if (bArr == null) {
            return 0;
        }
        return Arrays.hashCode(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m400k("NativeModuleAttestationResult(certSha256=", Arrays.toString(this.f2591a), ")");
    }
}
