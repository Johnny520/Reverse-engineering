package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nl1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f7214a;

    public nl1(byte[] bArr) {
        this.f7214a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl1) && t11.m5086l(this.f7214a, ((nl1) obj).f7214a);
    }

    public final int hashCode() {
        byte[] bArr = this.f7214a;
        if (bArr == null) {
            return 0;
        }
        return Arrays.hashCode(bArr);
    }

    public final String toString() {
        return vi0.m5691j("NativeModuleAttestationResult(certSha256=", Arrays.toString(this.f7214a), ")");
    }
}
