package com.materialkolor.dynamiccolor;

import androidx.profileinstaller.AbstractC3275;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class MaterialDynamicColors$allDynamicColors$47 extends FunctionReferenceImpl implements InterfaceC7372 {
    public MaterialDynamicColors$allDynamicColors$47(Object obj) {
        super(0, obj, C4628.class, "onPrimaryFixedVariant", "onPrimaryFixedVariant()Lcom/materialkolor/dynamiccolor/DynamicColor;", 0);
    }

    @Override // p068.InterfaceC7372
    public final C4638 invoke() {
        C4637 c4637M5139 = AbstractC3275.m5139((C4628) this.receiver);
        c4637M5139.f12325 = "on_primary_fixed_variant";
        c4637M5139.f12324 = new C4647(26);
        c4637M5139.f12320 = new C4647(27);
        c4637M5139.f12326 = new C4647(28);
        C4638 c4638M8693 = c4637M5139.m8693();
        C4637 c4637 = new C4637();
        c4637.f12325 = "on_primary_fixed_variant";
        c4637.f12324 = new C4632(29);
        c4637.f12323 = new C4631(0);
        c4637.f12320 = new C4631(1);
        c4637.f12327 = new C4631(2);
        c4637.f12326 = new C4631(3);
        return c4637.m8693().m8694().m8692(ColorSpec$SpecVersion.SPEC_2025, c4638M8693).m8693();
    }
}
