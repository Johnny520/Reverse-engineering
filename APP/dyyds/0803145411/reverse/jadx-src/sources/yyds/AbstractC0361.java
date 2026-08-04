package yyds;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛲᛵᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0361 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final List f1875;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (!z) {
            f1875 = Collections.EMPTY_LIST;
            return;
        }
        new C2489(Date.class, 0);
        new C2489(Timestamp.class, 1);
        f1875 = Collections.unmodifiableList(Arrays.asList(C1634.f8336, C2012.f10071, C2192.f10763));
    }
}
