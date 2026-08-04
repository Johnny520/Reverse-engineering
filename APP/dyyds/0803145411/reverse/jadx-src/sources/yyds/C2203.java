package yyds;

import java.util.Objects;

/* JADX INFO: renamed from: yyds.ᲁᛳᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2203 implements InterfaceC2440 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0989 f10863;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2623 f10864;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Object f10865;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f10866;

    public C2203(C2623 c2623, Object obj, C0989 c0989) {
        this.f10864 = c2623;
        this.f10866 = obj.toString();
        this.f10863 = c0989;
        this.f10865 = c2623.m4740(obj, obj, c0989).m3505(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2203.class == obj.getClass()) {
            C2203 c2203 = (C2203) obj;
            if (this.f10864 == c2203.f10864 && this.f10866.equals(c2203.f10866) && Objects.equals(this.f10863, c2203.f10863)) {
                return true;
            }
        }
        return false;
    }
}
