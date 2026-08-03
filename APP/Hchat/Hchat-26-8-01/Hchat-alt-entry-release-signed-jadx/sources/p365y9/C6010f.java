package p365y9;

import java.util.Arrays;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: y9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6010f {

    /* JADX INFO: renamed from: a */
    public final int f24400a;

    /* JADX INFO: renamed from: b */
    public final int f24401b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6010f(int i9, int i10) {
        this.f24400a = i9;
        this.f24401b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m10770a() {
        int i9 = this.f24400a;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i9 & 16777215)}, 1));
        int i10 = this.f24401b;
        return i9 != i10 ? AbstractC4855en.m9264h(str, ",", String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i10 & 16777215)}, 1))) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6010f)) {
            return false;
        }
        C6010f c6010f = (C6010f) obj;
        return this.f24400a == c6010f.f24400a && this.f24401b == c6010f.f24401b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f24401b) + (Integer.hashCode(this.f24400a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2248k(this.f24400a, this.f24401b, "ColorSpec(startColor=", ", endColor=", ")");
    }
}
