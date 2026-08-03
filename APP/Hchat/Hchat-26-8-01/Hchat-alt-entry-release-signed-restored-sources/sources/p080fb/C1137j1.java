package p080fb;

import gg.AbstractC1416l;
import java.util.Arrays;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.j1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1137j1 {

    /* JADX INFO: renamed from: a */
    public final String f3740a;

    /* JADX INFO: renamed from: b */
    public final String f3741b;

    /* JADX INFO: renamed from: c */
    public final byte[] f3742c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1137j1(String str, String str2, byte[] bArr) {
        str.getClass();
        this.f3740a = str;
        this.f3741b = str2;
        this.f3742c = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1137j1)) {
            return false;
        }
        C1137j1 c1137j1 = (C1137j1) obj;
        return AbstractC1416l.m3825a(this.f3740a, c1137j1.f3740a) && this.f3741b.equals(c1137j1.f3741b) && this.f3742c.equals(c1137j1.f3742c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.f3742c) + AbstractC0921a.m2244g(this.f3740a.hashCode() * 31, 31, this.f3741b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("LocatedDexInput(descriptor=", this.f3740a, ", sourceEntry=", this.f3741b, ", bytes="), Arrays.toString(this.f3742c), ")");
    }
}
