package yyds;

import java.io.Serializable;

/* JADX INFO: renamed from: yyds.ᲁᛶᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2248 implements Serializable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f11089;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final Throwable m4249(Object obj) {
        if (obj instanceof C2658) {
            return ((C2658) obj).f13058;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2248) {
            return AbstractC1544.m3188(this.f11089, ((C2248) obj).f11089);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f11089;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f11089;
        if (obj instanceof C2658) {
            return ((C2658) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
