package yyds;

import java.io.Serializable;

/* JADX INFO: renamed from: yyds.ᲈᛵᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2658 implements Serializable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Throwable f13058;

    public C2658(Throwable th) {
        this.f13058 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2658) {
            return AbstractC1544.m3188(this.f13058, ((C2658) obj).f13058);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13058.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13058 + ')';
    }
}
