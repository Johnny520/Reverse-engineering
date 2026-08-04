package yyds;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛲᲀᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0442 implements InterfaceC1801 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0328 f2257;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean f2258;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Bundle f2259;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0078 f2260;

    public C0442(C0328 c0328, InterfaceC0538 interfaceC0538) {
        this.f2257 = c0328;
        this.f2260 = new C0078(new C2241(2, interfaceC0538));
    }

    @Override // yyds.InterfaceC1801
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Bundle mo1228() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2259;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((C0419) this.f2260.getValue()).f2156.entrySet().iterator();
        if (!it.hasNext()) {
            this.f2258 = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        C0188.m794();
        return null;
    }
}
