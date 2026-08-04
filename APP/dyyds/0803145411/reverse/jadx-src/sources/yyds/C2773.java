package yyds;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲈᲁᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2773 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public SparseArray f13522;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f13523;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Set f13524;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2118 m4889(int i) {
        SparseArray sparseArray = this.f13522;
        C2118 c2118 = (C2118) sparseArray.get(i);
        if (c2118 != null) {
            return c2118;
        }
        C2118 c21182 = new C2118();
        sparseArray.put(i, c21182);
        return c21182;
    }
}
