package p194n6;

import java.lang.reflect.Type;
import java.util.Objects;
import p134j6.AbstractC2070h;

/* JADX INFO: renamed from: n6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2901a<T> {

    /* JADX INFO: renamed from: a */
    public final Class f9368a;

    /* JADX INFO: renamed from: b */
    public final Type f9369b;

    /* JADX INFO: renamed from: c */
    public final int f9370c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2901a(Type type) {
        Objects.requireNonNull(type);
        Type typeM5123a = AbstractC2070h.m5123a(type);
        this.f9369b = typeM5123a;
        this.f9368a = AbstractC2070h.m5128f(typeM5123a);
        this.f9370c = typeM5123a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2901a) {
            return AbstractC2070h.m5125c(this.f9369b, ((C2901a) obj).f9369b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9370c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2070h.m5131i(this.f9369b);
    }
}
