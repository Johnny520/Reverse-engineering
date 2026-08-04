package yyds;

import java.lang.ref.Reference;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛵᲇᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1222 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final ArrayList f5603 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static synchronized boolean m2489(String str) {
        C0912 c0912;
        for (Reference reference : f5603) {
            if (reference != null && (c0912 = (C0912) reference.get()) != null && str.equals(c0912.f4152) && c0912.f4157) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static synchronized ArrayList m2490(String str) {
        ArrayList arrayList;
        C0912 c0912;
        arrayList = new ArrayList(1);
        for (Reference reference : f5603) {
            if (reference != null && (c0912 = (C0912) reference.get()) != null && str.equals(c0912.f4152)) {
                arrayList.add(c0912);
            }
        }
        return arrayList;
    }
}
