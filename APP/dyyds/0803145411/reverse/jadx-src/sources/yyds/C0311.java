package yyds;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: renamed from: yyds.ᛲᛳᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0311 implements InterfaceC0652 {
    @Override // yyds.InterfaceC0652
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
        if (c2805.f13682 == Timestamp.class) {
            return new C2192(c0114.m519(Date.class));
        }
        return null;
    }
}
