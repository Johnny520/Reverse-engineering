package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import yyds.AbstractC1325;
import yyds.C1860;
import yyds.C1966;
import yyds.InterfaceC1283;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class PlatformInitializer implements InterfaceC1283 {
    @Override // yyds.InterfaceC1283
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final List mo116() {
        return C1860.f9345;
    }

    @Override // yyds.InterfaceC1283
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo117(Context context) {
        C1966 c1966 = AbstractC1325.f6087;
        C1966 c19662 = AbstractC1325.f6087;
        if (c19662 == null) {
            c19662 = null;
        }
        if (c19662 != null) {
            c19662.f9864 = context;
        }
        return AbstractC1325.f6087;
    }
}
