package yyds;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲀᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2046 extends AbstractC2026 {
    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo827(String str, AbstractC1614 abstractC1614, Object obj, C1762 c1762) {
        C0989 c0989 = c1762.f8846;
        c0989.f4503.getClass();
        if (obj instanceof Map) {
            Iterator it = c0989.f4503.m393(obj).iterator();
            while (it.hasNext()) {
                m3903(str, obj, c1762, Collections.singletonList((String) it.next()));
            }
            return;
        }
        c0989.f4503.getClass();
        if (obj instanceof List) {
            for (int i = 0; i < c0989.f4503.m408(obj); i++) {
                try {
                    m3901(i, str, obj, c1762);
                } catch (C1553 e) {
                    if (c0989.f4505.contains(EnumC0445.f2268)) {
                        throw e;
                    }
                }
            }
        }
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final String mo828() {
        return "[*]";
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo829() {
        return false;
    }
}
