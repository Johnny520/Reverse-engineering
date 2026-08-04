package androidx.activity.result;

import yyds.EnumC0637;
import yyds.InterfaceC0657;
import yyds.InterfaceC2345;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements InterfaceC0657 {
    @Override // yyds.InterfaceC0657
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
        if (EnumC0637.ON_START.equals(enumC0637) || EnumC0637.ON_STOP.equals(enumC0637) || EnumC0637.ON_DESTROY.equals(enumC0637)) {
            throw null;
        }
    }
}
