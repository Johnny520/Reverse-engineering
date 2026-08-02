package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 {
    public final tl1 a;
    public final byte[] b;
    public final byte[] c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ul1(tl1 tl1Var, byte[] bArr, byte[] bArr2) {
        this.a = tl1Var;
        this.b = bArr;
        this.c = bArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul1)) {
            return false;
        }
        ul1 ul1Var = (ul1) obj;
        return this.a.equals(ul1Var.a) && this.b.equals(ul1Var.b) && this.c.equals(ul1Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = Arrays.toString(this.b);
        String string2 = Arrays.toString(this.c);
        StringBuilder sb = new StringBuilder("VerifiedActivation(manifest=");
        sb.append(this.a);
        sb.append(", token=");
        sb.append(string);
        sb.append(", envelope=");
        return hk1.j(sb, string2, ")");
    }
}
