package yyds;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: yyds.ᛴᛲᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0792 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0397 f3629;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Executor f3630;

    public C0792(C0397 c0397, Executor executor) {
        this.f3629 = c0397;
        this.f3630 = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0792) && this.f3629 == ((C0792) obj).f3629;
    }

    public final int hashCode() {
        return this.f3629.hashCode();
    }
}
