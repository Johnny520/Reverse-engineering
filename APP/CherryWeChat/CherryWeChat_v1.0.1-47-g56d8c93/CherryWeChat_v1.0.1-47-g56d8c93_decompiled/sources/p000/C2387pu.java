package p000;

import java.util.Objects;

/* JADX INFO: renamed from: pu */
/* JADX INFO: loaded from: classes.dex */
public final class C2387pu {

    /* JADX INFO: renamed from: a */
    public final Class f8386a;

    /* JADX INFO: renamed from: b */
    public final Class f8387b;

    public C2387pu(Class cls, Class cls2) {
        this.f8386a = cls;
        this.f8387b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2387pu)) {
            return false;
        }
        C2387pu c2387pu = (C2387pu) obj;
        return c2387pu.f8386a.equals(this.f8386a) && c2387pu.f8387b.equals(this.f8387b);
    }

    public final int hashCode() {
        return Objects.hash(this.f8386a, this.f8387b);
    }

    public final String toString() {
        return this.f8386a.getSimpleName() + " with primitive type: " + this.f8387b.getSimpleName();
    }
}
