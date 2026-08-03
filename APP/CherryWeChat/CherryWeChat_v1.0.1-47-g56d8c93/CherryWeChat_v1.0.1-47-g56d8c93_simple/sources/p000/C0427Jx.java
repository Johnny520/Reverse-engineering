package p000;

import java.util.Objects;

/* JADX INFO: renamed from: Jx */
/* JADX INFO: loaded from: classes.dex */
public final class C0427Jx {

    /* JADX INFO: renamed from: a */
    public final Class f1407a;

    /* JADX INFO: renamed from: b */
    public final Class f1408b;

    public C0427Jx(Class r1, Class r2) {
        this.f1407a = r1;
        this.f1408b = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C0427Jx) == true) goto L5;
        return false;
    L5:
        C0427Jx r42 = (C0427Jx) r4;
        if (r42.f1407a.equals(this.f1407a) == true) goto L8;
    L11:
        return false;
    L8:
        if (r42.f1408b.equals(this.f1408b) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f1407a, this.f1408b});
    }

    public final String toString() {
        return this.f1407a.getSimpleName() + " with serialization type: " + this.f1408b.getSimpleName();
    }
}
