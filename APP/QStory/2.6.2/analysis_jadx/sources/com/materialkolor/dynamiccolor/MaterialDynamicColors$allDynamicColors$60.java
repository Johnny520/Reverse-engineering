package com.materialkolor.dynamiccolor;

import androidx.profileinstaller.AbstractC2442;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class MaterialDynamicColors$allDynamicColors$60 extends FunctionReferenceImpl implements InterfaceC6542 {
    public MaterialDynamicColors$allDynamicColors$60(Object obj) {
        super(0, obj, C3795.class, "textSecondaryAndTertiaryInverse", "textSecondaryAndTertiaryInverse()Lcom/materialkolor/dynamiccolor/DynamicColor;", 0);
    }

    @Override // p052.InterfaceC6542
    public final C3805 invoke() {
        C3804 c3804M4569 = AbstractC2442.m4569((C3795) this.receiver);
        c3804M4569.f11975 = "text_secondary_and_tertiary_inverse";
        c3804M4569.f11974 = new C3796(13);
        c3804M4569.f11973 = new C3796(14);
        return c3804M4569.m8147();
    }
}
