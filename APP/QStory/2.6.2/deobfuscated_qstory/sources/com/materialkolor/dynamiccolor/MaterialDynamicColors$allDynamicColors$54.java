package com.materialkolor.dynamiccolor;

import androidx.profileinstaller.AbstractC2442;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class MaterialDynamicColors$allDynamicColors$54 extends FunctionReferenceImpl implements InterfaceC6542 {
    public MaterialDynamicColors$allDynamicColors$54(Object obj) {
        super(0, obj, C3795.class, "onTertiaryFixed", "onTertiaryFixed()Lcom/materialkolor/dynamiccolor/DynamicColor;", 0);
    }

    @Override // p052.InterfaceC6542
    public final C3805 invoke() {
        C3804 c3804M4569 = AbstractC2442.m4569((C3795) this.receiver);
        c3804M4569.f11975 = "on_tertiary_fixed";
        c3804M4569.f11974 = new C3814(29);
        c3804M4569.f11970 = new C3817(7);
        c3804M4569.f11976 = new C3817(14);
        C3805 c3805M8147 = c3804M4569.m8147();
        C3804 c3804 = new C3804();
        c3804.f11975 = "on_tertiary_fixed";
        c3804.f11974 = new C3797(3);
        c3804.f11973 = new C3797(4);
        c3804.f11970 = new C3797(6);
        c3804.f11977 = new C3797(7);
        c3804.f11976 = new C3797(8);
        return c3804.m8147().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3805M8147).m8147();
    }
}
