package p000;

import java.util.Objects;

/* JADX INFO: renamed from: Ix */
/* JADX INFO: loaded from: classes.dex */
public final class C0384Ix {

    /* JADX INFO: renamed from: a */
    public final Class f1318a;

    /* JADX INFO: renamed from: b */
    public final C2787z6 f1319b;

    public C0384Ix(Class cls, C2787z6 c2787z6) {
        this.f1318a = cls;
        this.f1319b = c2787z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0384Ix)) {
            return false;
        }
        C0384Ix c0384Ix = (C0384Ix) obj;
        return c0384Ix.f1318a.equals(this.f1318a) && c0384Ix.f1319b.equals(this.f1319b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1318a, this.f1319b);
    }

    public final String toString() {
        return this.f1318a.getSimpleName() + ", object identifier: " + this.f1319b;
    }
}
