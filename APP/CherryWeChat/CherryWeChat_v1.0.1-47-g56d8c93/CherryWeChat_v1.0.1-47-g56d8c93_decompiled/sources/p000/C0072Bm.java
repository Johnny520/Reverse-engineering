package p000;

import kotlinx.serialization.json.AbstractC2158d;

/* JADX INFO: renamed from: Bm */
/* JADX INFO: loaded from: classes.dex */
public final class C0072Bm extends AbstractC2158d {

    /* JADX INFO: renamed from: a */
    public final boolean f172a;

    /* JADX INFO: renamed from: b */
    public final String f173b;

    public C0072Bm(Object obj, boolean z) {
        this.f172a = z;
        this.f173b = obj.toString();
    }

    @Override // kotlinx.serialization.json.AbstractC2158d
    /* JADX INFO: renamed from: a */
    public final String mo121a() {
        return this.f173b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0072Bm.class != obj.getClass()) {
            return false;
        }
        C0072Bm c0072Bm = (C0072Bm) obj;
        return this.f172a == c0072Bm.f172a && AbstractC0585Nj.m1134a(this.f173b, c0072Bm.f173b);
    }

    public final int hashCode() {
        return this.f173b.hashCode() + (Boolean.hashCode(this.f172a) * 31);
    }

    @Override // kotlinx.serialization.json.AbstractC2158d
    public final String toString() {
        boolean z = this.f172a;
        String str = this.f173b;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC2478rz.m4964a(sb, str);
        return sb.toString();
    }
}
