package yyds;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛵᛴᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1077 implements InterfaceC0894 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Set f4963 = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1184 f4964;

    public C1077(C1184 c1184) {
        this.f4964 = c1184;
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C1199 mo940(Object obj, int i, int i2, C0822 c0822) {
        InterfaceC0724 c2281;
        Uri uri = (Uri) obj;
        C1818 c1818 = new C1818(uri);
        C1184 c1184 = this.f4964;
        switch (c1184.f5422) {
            case 0:
                c2281 = new C2281(c1184.f5423, uri, c1184.f5421, 0);
                break;
            case 1:
                c2281 = new C2281(c1184.f5423, uri, c1184.f5421, 1);
                break;
            default:
                c2281 = new C0054(c1184.f5423, uri, c1184.f5421);
                break;
        }
        return new C1199(c1818, c2281);
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo941(Object obj) {
        return f4963.contains(((Uri) obj).getScheme());
    }
}
