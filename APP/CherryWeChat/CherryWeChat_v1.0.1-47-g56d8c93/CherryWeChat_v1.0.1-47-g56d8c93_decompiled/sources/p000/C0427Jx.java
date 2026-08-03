package p000;

import java.util.Objects;

/* JADX INFO: renamed from: Jx */
/* JADX INFO: loaded from: classes.dex */
public final class C0427Jx {

    /* JADX INFO: renamed from: a */
    public final Class f1407a;

    /* JADX INFO: renamed from: b */
    public final Class f1408b;

    public C0427Jx(Class cls, Class cls2) {
        this.f1407a = cls;
        this.f1408b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0427Jx)) {
            return false;
        }
        C0427Jx c0427Jx = (C0427Jx) obj;
        return c0427Jx.f1407a.equals(this.f1407a) && c0427Jx.f1408b.equals(this.f1408b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1407a, this.f1408b);
    }

    public final String toString() {
        return this.f1407a.getSimpleName() + " with serialization type: " + this.f1408b.getSimpleName();
    }
}
