package yyds;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲇᛷᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2481 extends HashMap implements InterfaceC0663, InterfaceC0956 {
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static String m4531(Map map, C1083 c1083) {
        StringBuilder sb = new StringBuilder();
        try {
            m4532(map, sb, c1083);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static void m4532(Map map, StringBuilder sb, C1083 c1083) {
        c1083.getClass();
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || !c1083.f4989) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                C2133.m4044(entry.getKey().toString(), value, sb, c1083);
            }
        }
        sb.append('}');
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return m4531(this, AbstractC2084.f10334);
    }

    @Override // yyds.InterfaceC0663
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final String mo1578(C1083 c1083) {
        return m4531(this, c1083);
    }

    @Override // yyds.InterfaceC0956
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo2096(StringBuilder sb, C1083 c1083) {
        m4532(this, sb, c1083);
    }

    @Override // yyds.InterfaceC1732
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final String mo3460() {
        return m4531(this, AbstractC2084.f10334);
    }

    @Override // yyds.InterfaceC1349
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo2754(StringBuilder sb) {
        m4532(this, sb, AbstractC2084.f10334);
    }
}
