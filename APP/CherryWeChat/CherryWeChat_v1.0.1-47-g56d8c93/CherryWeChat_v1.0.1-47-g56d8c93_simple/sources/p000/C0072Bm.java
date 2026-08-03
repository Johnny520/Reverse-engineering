package p000;

import kotlinx.serialization.json.AbstractC2158d;

/* JADX INFO: renamed from: Bm */
/* JADX INFO: loaded from: classes.dex */
public final class C0072Bm extends AbstractC2158d {

    /* JADX INFO: renamed from: a */
    public final boolean f172a;

    /* JADX INFO: renamed from: b */
    public final String f173b;

    public C0072Bm(Object r1, boolean r2) {
        this.f172a = r2;
        this.f173b = r1.toString();
    }

    @Override // kotlinx.serialization.json.AbstractC2158d
    /* JADX INFO: renamed from: a */
    public final String mo121a() {
        return this.f173b;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L18;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C0072Bm.class != r3.getClass()) goto L19;
        C0072Bm r32 = (C0072Bm) r3;
        if (this.f172a == r32.f172a) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f173b, r32.f173b) == false) goto L21;
        return true;
    L21:
        return false;
    L19:
        return false;
    L18:
        return true;
    }

    public final int hashCode() {
        int r0 = Boolean.hashCode(this.f172a) * 31;
        return this.f173b.hashCode() + r0;
    }

    @Override // kotlinx.serialization.json.AbstractC2158d
    public final String toString() {
        boolean r0 = this.f172a;
        String r1 = this.f173b;
        if (r0 == false) goto L6;
        StringBuilder r02 = new StringBuilder();
        AbstractC2478rz.m4964a(r02, r1);
        return r02.toString();
    L6:
        return r1;
    }
}
