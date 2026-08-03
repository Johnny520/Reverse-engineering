package p000;

import java.util.Objects;

/* JADX INFO: renamed from: fs */
/* JADX INFO: loaded from: classes.dex */
public final class C1425fs {

    /* JADX INFO: renamed from: a */
    public final C2610v1 f5025a;

    /* JADX INFO: renamed from: b */
    public final int f5026b;

    /* JADX INFO: renamed from: c */
    public final String f5027c;

    /* JADX INFO: renamed from: d */
    public final String f5028d;

    public C1425fs(C2610v1 r1, int r2, String r3, String r4) {
        this.f5025a = r1;
        this.f5026b = r2;
        this.f5027c = r3;
        this.f5028d = r4;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C1425fs) == true) goto L5;
        return false;
    L5:
        C1425fs r42 = (C1425fs) r4;
        if (this.f5025a == r42.f5025a) goto L8;
    L15:
        return false;
    L8:
        if (this.f5026b != r42.f5026b) goto L15;
        if (this.f5027c.equals(r42.f5027c) == false) goto L15;
        if (this.f5028d.equals(r42.f5028d) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        Integer r0 = Integer.valueOf(this.f5026b);
        String r1 = this.f5027c;
        String r2 = this.f5028d;
        return Objects.hash(new Object[]{this.f5025a, r0, r1, r2});
    }

    public final String toString() {
        return "(status=" + this.f5025a + ", keyId=" + this.f5026b + ", keyType='" + this.f5027c + "', keyPrefix='" + this.f5028d + "')";
    }
}
