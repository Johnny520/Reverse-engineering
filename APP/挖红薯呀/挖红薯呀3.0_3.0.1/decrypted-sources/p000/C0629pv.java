package p000;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: pv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0629pv {

    /* JADX INFO: renamed from: a */
    public String f4969a;

    /* JADX INFO: renamed from: b */
    public String f4970b;

    /* JADX INFO: renamed from: c */
    public List f4971c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0629pv)) {
            return false;
        }
        C0629pv c0629pv = (C0629pv) obj;
        return Objects.equals(this.f4969a, c0629pv.f4969a) && Objects.equals(this.f4970b, c0629pv.f4970b) && Objects.equals(this.f4971c, c0629pv.f4971c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(this.f4969a, this.f4970b, this.f4971c);
    }
}
