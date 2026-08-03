package p000;

import java.util.Objects;

/* JADX INFO: renamed from: pu */
/* JADX INFO: loaded from: classes.dex */
public final class C2387pu {

    /* JADX INFO: renamed from: a */
    public final Class f8386a;

    /* JADX INFO: renamed from: b */
    public final Class f8387b;

    public C2387pu(Class r1, Class r2) {
        this.f8386a = r1;
        this.f8387b = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C2387pu) == true) goto L5;
        return false;
    L5:
        C2387pu r42 = (C2387pu) r4;
        if (r42.f8386a.equals(this.f8386a) == true) goto L8;
    L11:
        return false;
    L8:
        if (r42.f8387b.equals(this.f8387b) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f8386a, this.f8387b});
    }

    public final String toString() {
        return this.f8386a.getSimpleName() + " with primitive type: " + this.f8387b.getSimpleName();
    }
}
