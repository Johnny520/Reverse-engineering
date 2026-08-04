package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛸᛴᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1764 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ArrayList f8854;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2791 f8855;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f8856;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f8857;

    public C1764(C2791 c2791) {
        c2791.getClass();
        this.f8854 = new ArrayList();
        this.f8857 = -1;
        this.f8855 = c2791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8857 >= 0) {
            sb.append(" #");
            sb.append(this.f8857);
        }
        sb.append("}");
        return sb.toString();
    }
}
