package yyds;

import java.util.List;

/* JADX INFO: renamed from: yyds.ᛴᛱᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0789 extends AbstractC2026 {
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final boolean m1778(String str, Object obj, C1762 c1762) {
        C0989 c0989 = c1762.f8846;
        EnumC0445 enumC0445 = EnumC0445.f2270;
        if (obj == null) {
            if (!m3898() || c0989.f4505.contains(enumC0445)) {
                return false;
            }
            throw new C1553(AbstractC2104.m4014("The path ", str, " is null"));
        }
        c0989.f4503.getClass();
        if (obj instanceof List) {
            return true;
        }
        if (!m3898() || c0989.f4505.contains(enumC0445)) {
            return false;
        }
        throw new C1553(String.format("Filter: %s can only be applied to arrays. Current context is: %s", toString(), obj));
    }
}
