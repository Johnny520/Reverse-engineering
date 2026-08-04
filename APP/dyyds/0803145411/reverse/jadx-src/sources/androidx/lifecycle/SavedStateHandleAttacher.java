package androidx.lifecycle;

import android.os.Bundle;
import yyds.C0188;
import yyds.C0442;
import yyds.EnumC0637;
import yyds.InterfaceC0657;
import yyds.InterfaceC2345;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0657 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0442 f309;

    public SavedStateHandleAttacher(C0442 c0442) {
        this.f309 = c0442;
    }

    @Override // yyds.InterfaceC0657
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
        if (enumC0637 != EnumC0637.ON_CREATE) {
            C0188.m802(enumC0637, "Next event must be ON_CREATE, it was ");
            return;
        }
        interfaceC2345.mo14().m126(this);
        C0442 c0442 = this.f309;
        if (c0442.f2258) {
            return;
        }
        Bundle bundleM998 = c0442.f2257.m998("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0442.f2259;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM998 != null) {
            bundle.putAll(bundleM998);
        }
        c0442.f2259 = bundle;
        c0442.f2258 = true;
    }
}
