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

    public C1425fs(C2610v1 c2610v1, int i, String str, String str2) {
        this.f5025a = c2610v1;
        this.f5026b = i;
        this.f5027c = str;
        this.f5028d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1425fs)) {
            return false;
        }
        C1425fs c1425fs = (C1425fs) obj;
        return this.f5025a == c1425fs.f5025a && this.f5026b == c1425fs.f5026b && this.f5027c.equals(c1425fs.f5027c) && this.f5028d.equals(c1425fs.f5028d);
    }

    public final int hashCode() {
        return Objects.hash(this.f5025a, Integer.valueOf(this.f5026b), this.f5027c, this.f5028d);
    }

    public final String toString() {
        return "(status=" + this.f5025a + ", keyId=" + this.f5026b + ", keyType='" + this.f5027c + "', keyPrefix='" + this.f5028d + "')";
    }
}
