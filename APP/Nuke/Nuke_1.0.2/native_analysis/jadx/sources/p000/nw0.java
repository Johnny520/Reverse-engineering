package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nw0 implements pw0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f7348a;

    public nw0(byte[] bArr) {
        this.f7348a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw0) && this.f7348a.equals(((nw0) obj).f7348a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7348a);
    }

    public final String toString() {
        return vi0.m5691j("Bytes(value=", Arrays.toString(this.f7348a), ")");
    }
}
