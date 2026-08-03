package p059e3;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: e3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0820a {

    /* JADX INFO: renamed from: a */
    public String f2459a;

    /* JADX INFO: renamed from: b */
    public String f2460b;

    /* JADX INFO: renamed from: c */
    public List f2461c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0820a)) {
            return false;
        }
        C0820a c0820a = (C0820a) obj;
        return Objects.equals(this.f2459a, c0820a.f2459a) && Objects.equals(this.f2460b, c0820a.f2460b) && Objects.equals(this.f2461c, c0820a.f2461c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(this.f2459a, this.f2460b, this.f2461c);
    }
}
