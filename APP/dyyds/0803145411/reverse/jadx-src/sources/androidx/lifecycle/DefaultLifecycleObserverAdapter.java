package androidx.lifecycle;

import yyds.AbstractC0516;
import yyds.C0188;
import yyds.EnumC0637;
import yyds.InterfaceC0657;
import yyds.InterfaceC2159;
import yyds.InterfaceC2345;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0657 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC2159 f305;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC0657 f306;

    public DefaultLifecycleObserverAdapter(InterfaceC2159 interfaceC2159, InterfaceC0657 interfaceC0657) {
        this.f305 = interfaceC2159;
        this.f306 = interfaceC0657;
    }

    @Override // yyds.InterfaceC0657
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
        int i = AbstractC0516.f2469[enumC0637.ordinal()];
        if (i == 3) {
            this.f305.mo118();
        } else if (i == 7) {
            C0188.m798("ON_ANY must not been send by anybody");
            return;
        }
        InterfaceC0657 interfaceC0657 = this.f306;
        if (interfaceC0657 != null) {
            interfaceC0657.mo20(interfaceC2345, enumC0637);
        }
    }
}
