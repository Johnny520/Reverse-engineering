package com.materialkolor.dynamiccolor;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class MaterialDynamicColors$allDynamicColors$59 extends FunctionReferenceImpl implements InterfaceC6543 {
    public MaterialDynamicColors$allDynamicColors$59(Object obj) {
        super(0, obj, C3796.class, "textPrimaryInverse", "textPrimaryInverse()Lcom/materialkolor/dynamiccolor/DynamicColor;", 0);
    }

    @Override // p052.InterfaceC6543
    public final C3806 invoke() {
        ((C3796) this.receiver).getClass();
        C3805 c3805M8135 = C3796.f11962.m8139().m8135();
        c3805M8135.f11980 = "text_primary_inverse";
        C3806 c3806M8134 = c3805M8135.m8134();
        C3805 c3805 = new C3805();
        c3805.f11980 = "text_primary_inverse";
        c3805.f11979 = new C3797(4);
        c3805.f11978 = new C3797(5);
        return c3805.m8134().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3806M8134).m8134();
    }
}
