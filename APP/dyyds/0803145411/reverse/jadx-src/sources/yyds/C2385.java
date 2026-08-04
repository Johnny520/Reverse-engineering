package yyds;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲇᛱᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2385 implements InterfaceC0894 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Set f11758 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0894 f11759;

    public C2385(InterfaceC0894 interfaceC0894) {
        this.f11759 = interfaceC0894;
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C1199 mo940(Object obj, int i, int i2, C0822 c0822) {
        return this.f11759.mo940(new C0714(((Uri) obj).toString()), i, i2, c0822);
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo941(Object obj) {
        return f11758.contains(((Uri) obj).getScheme());
    }
}
