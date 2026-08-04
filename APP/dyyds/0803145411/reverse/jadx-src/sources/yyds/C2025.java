package yyds;

import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᲀᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2025 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2188 f10098;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0937 f10099;

    public C2025(C0937 c0937, C2188 c2188) {
        this.f10099 = c0937;
        this.f10098 = c2188;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() {
        C0937 c0937 = this.f10099;
        C2188 c2188 = this.f10098;
        try {
        } catch (IOException e) {
            c0937.m2052(2, 2, e);
        } catch (Throwable th) {
            c0937.m2052(3, 3, null);
            AbstractC1429.m2918(c2188);
            throw th;
        }
        if (!c2188.m4176(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (c2188.m4176(false, this)) {
        }
        c0937.m2052(1, 9, null);
        AbstractC1429.m2918(c2188);
        return C2746.f13459;
    }
}
