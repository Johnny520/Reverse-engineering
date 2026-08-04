package yyds;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: yyds.ᲇᛸᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2498 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final WeakReference f12307;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Field f12308;

    public C2498(WeakReference weakReference, Field field) {
        AbstractC2328.m4341(-735873499562862L);
        AbstractC2328.m4341(-735916449235822L);
        this.f12307 = weakReference;
        this.f12308 = field;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2498)) {
            return false;
        }
        C2498 c2498 = (C2498) obj;
        return this.f12307.equals(c2498.f12307) && AbstractC1544.m3188(this.f12308, c2498.f12308);
    }

    public final int hashCode() {
        return this.f12308.hashCode() + (this.f12307.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2328.m4341(-736053888189294L) + this.f12307 + AbstractC2328.m4341(-736169852306286L) + this.f12308 + ')';
    }
}
