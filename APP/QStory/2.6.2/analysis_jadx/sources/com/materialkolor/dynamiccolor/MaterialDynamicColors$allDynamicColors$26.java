package com.materialkolor.dynamiccolor;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class MaterialDynamicColors$allDynamicColors$26 extends FunctionReferenceImpl implements InterfaceC6542 {
    public MaterialDynamicColors$allDynamicColors$26(Object obj) {
        super(0, obj, C3795.class, "surfaceTint", "surfaceTint()Lcom/materialkolor/dynamiccolor/DynamicColor;", 0);
    }

    @Override // p052.InterfaceC6542
    public final C3805 invoke() {
        ((C3795) this.receiver).getClass();
        C3804 c3804M8148 = C3795.f11957.mo8179().m8148();
        c3804M8148.f11975 = "surface_tint";
        C3805 c3805M8147 = c3804M8148.m8147();
        C3804 c3804 = new C3804();
        c3804.f11975 = "surface_tint";
        c3804.f11974 = new C3796(0);
        c3804.f11973 = new C3796(1);
        c3804.f11972 = true;
        return c3804.m8147().m8148().m8146(ColorSpec$SpecVersion.SPEC_2025, c3805M8147).m8147();
    }
}
