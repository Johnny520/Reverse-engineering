package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 {

    /* JADX INFO: renamed from: a */
    public final tl1 f11351a;

    /* JADX INFO: renamed from: b */
    public final byte[] f11352b;

    /* JADX INFO: renamed from: c */
    public final byte[] f11353c;

    public ul1(tl1 tl1Var, byte[] bArr, byte[] bArr2) {
        this.f11351a = tl1Var;
        this.f11352b = bArr;
        this.f11353c = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul1)) {
            return false;
        }
        ul1 ul1Var = (ul1) obj;
        return this.f11351a.equals(ul1Var.f11351a) && this.f11352b.equals(ul1Var.f11352b) && this.f11353c.equals(ul1Var.f11353c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11353c) + ((Arrays.hashCode(this.f11352b) + (this.f11351a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f11352b);
        String string2 = Arrays.toString(this.f11353c);
        StringBuilder sb = new StringBuilder("VerifiedActivation(manifest=");
        sb.append(this.f11351a);
        sb.append(", token=");
        sb.append(string);
        sb.append(", envelope=");
        return hk1.m2211j(sb, string2, ")");
    }
}
