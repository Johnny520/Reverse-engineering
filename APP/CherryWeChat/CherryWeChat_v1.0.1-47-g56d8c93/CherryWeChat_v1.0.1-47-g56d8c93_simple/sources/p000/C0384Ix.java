package p000;

import java.util.Objects;

/* JADX INFO: renamed from: Ix */
/* JADX INFO: loaded from: classes.dex */
public final class C0384Ix {

    /* JADX INFO: renamed from: a */
    public final Class f1318a;

    /* JADX INFO: renamed from: b */
    public final C2787z6 f1319b;

    public C0384Ix(Class r1, C2787z6 r2) {
        this.f1318a = r1;
        this.f1319b = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C0384Ix) == true) goto L5;
        return false;
    L5:
        C0384Ix r42 = (C0384Ix) r4;
        if (r42.f1318a.equals(this.f1318a) == true) goto L8;
    L11:
        return false;
    L8:
        if (r42.f1319b.equals(this.f1319b) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f1318a, this.f1319b});
    }

    public final String toString() {
        return this.f1318a.getSimpleName() + ", object identifier: " + this.f1319b;
    }
}
