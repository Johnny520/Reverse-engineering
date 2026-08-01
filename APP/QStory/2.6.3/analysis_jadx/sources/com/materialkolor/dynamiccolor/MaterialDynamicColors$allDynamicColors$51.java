package com.materialkolor.dynamiccolor;

import androidx.profileinstaller.AbstractC2442;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class MaterialDynamicColors$allDynamicColors$51 extends FunctionReferenceImpl implements InterfaceC6543 {
    public MaterialDynamicColors$allDynamicColors$51(Object obj) {
        super(0, obj, C3796.class, "onSecondaryFixedVariant", "onSecondaryFixedVariant()Lcom/materialkolor/dynamiccolor/DynamicColor;", 0);
    }

    @Override // p052.InterfaceC6543
    public final C3806 invoke() {
        C3805 c3805M4579 = AbstractC2442.m4579((C3796) this.receiver);
        c3805M4579.f11980 = "on_secondary_fixed_variant";
        c3805M4579.f11979 = new C3814(14);
        c3805M4579.f11975 = new C3814(15);
        c3805M4579.f11981 = new C3814(16);
        C3806 c3806M8134 = c3805M4579.m8134();
        C3805 c3805 = new C3805();
        c3805.f11980 = "on_secondary_fixed_variant";
        c3805.f11979 = new C3800(23);
        c3805.f11978 = new C3800(25);
        c3805.f11975 = new C3800(26);
        c3805.f11982 = new C3800(27);
        c3805.f11981 = new C3800(28);
        return c3805.m8134().m8135().m8133(ColorSpec$SpecVersion.SPEC_2025, c3806M8134).m8134();
    }
}
