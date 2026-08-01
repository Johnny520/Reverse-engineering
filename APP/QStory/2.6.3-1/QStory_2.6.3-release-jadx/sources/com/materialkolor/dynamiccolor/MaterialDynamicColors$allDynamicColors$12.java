package com.materialkolor.dynamiccolor;

import androidx.profileinstaller.AbstractC3275;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class MaterialDynamicColors$allDynamicColors$12 extends FunctionReferenceImpl implements InterfaceC7372 {
    public MaterialDynamicColors$allDynamicColors$12(Object obj) {
        super(0, obj, C4628.class, "surfaceContainerLowest", "surfaceContainerLowest()Lcom/materialkolor/dynamiccolor/DynamicColor;", 0);
    }

    @Override // p068.InterfaceC7372
    public final C4638 invoke() {
        C4637 c4637M5139 = AbstractC3275.m5139((C4628) this.receiver);
        c4637M5139.f12325 = "surface_container_lowest";
        c4637M5139.f12324 = new C4641(6);
        c4637M5139.f12323 = new C4641(7);
        c4637M5139.f12322 = true;
        C4638 c4638M8693 = c4637M5139.m8693();
        C4637 c4637 = new C4637();
        c4637.f12325 = "surface_container_lowest";
        c4637.f12324 = new C4648(4);
        c4637.f12323 = new C4648(5);
        c4637.f12322 = true;
        return c4637.m8693().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4638M8693).m8693();
    }
}
