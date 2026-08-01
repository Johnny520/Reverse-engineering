package com.materialkolor.dynamiccolor;

import androidx.profileinstaller.AbstractC2442;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class MaterialDynamicColors$allDynamicColors$31 extends FunctionReferenceImpl implements InterfaceC6542 {
    public MaterialDynamicColors$allDynamicColors$31(Object obj) {
        super(0, obj, C3795.class, "inversePrimary", "inversePrimary()Lcom/materialkolor/dynamiccolor/DynamicColor;", 0);
    }

    @Override // p052.InterfaceC6542
    public final C3805 invoke() {
        C3804 c3804M4569 = AbstractC2442.m4569((C3795) this.receiver);
        c3804M4569.f11975 = "inverse_primary";
        c3804M4569.f11974 = new C3809(27);
        c3804M4569.f11973 = new C3809(28);
        c3804M4569.f11970 = new C3809(29);
        c3804M4569.f11976 = new C3808(0);
        C3805 c3805M8147 = c3804M4569.m8147();
        C3804 c3804 = new C3804();
        c3804.f11975 = "inverse_primary";
        c3804.f11974 = new C3799(2);
        c3804.f11973 = new C3799(3);
        c3804.f11970 = new C3799(5);
        c3804.f11976 = new C3799(6);
        return c3804.m8147().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3805M8147).m8147();
    }
}
