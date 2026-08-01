package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fx implements la {
    public final Class a;

    public fx(Class r1) {
        this.a = r1;
    }

    @Override // defpackage.la
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof fx) == false) goto L8;
        Class r22 = ((fx) r2).a;
        if (ip.i(this.a, r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
