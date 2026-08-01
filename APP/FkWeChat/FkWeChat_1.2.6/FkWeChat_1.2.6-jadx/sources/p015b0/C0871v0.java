package p015b0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0188p;

/* JADX INFO: renamed from: b0.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0871v0 implements InterfaceC0188p {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ EnumC0769g3 f2745q;

    public C0871v0(EnumC0769g3 enumC0769g3) {
        this.f2745q = enumC0769g3;
    }

    /* JADX INFO: renamed from: a */
    public final String m3231a(InterfaceC0572r interfaceC0572r, int i10) {
        interfaceC0572r.mo2163V(-1744780674);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1744780674, i10, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:202)");
        }
        String strM2894i = this.f2745q.m2894i(interfaceC0572r, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        interfaceC0572r.mo2152K();
        return strM2894i;
    }

    @Override // p010a9.InterfaceC0188p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m3231a((InterfaceC0572r) obj, ((Number) obj2).intValue());
    }
}
