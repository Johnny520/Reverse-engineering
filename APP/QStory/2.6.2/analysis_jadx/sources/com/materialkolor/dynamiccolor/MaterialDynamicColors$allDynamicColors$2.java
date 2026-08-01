package com.materialkolor.dynamiccolor;

import androidx.compose.foundation.text.C0995;
import androidx.profileinstaller.AbstractC2442;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class MaterialDynamicColors$allDynamicColors$2 extends FunctionReferenceImpl implements InterfaceC6542 {
    public MaterialDynamicColors$allDynamicColors$2(Object obj) {
        super(0, obj, C3795.class, "secondaryPaletteKeyColor", "secondaryPaletteKeyColor()Lcom/materialkolor/dynamiccolor/DynamicColor;", 0);
    }

    @Override // p052.InterfaceC6542
    public final C3805 invoke() {
        C3804 c3804M4569 = AbstractC2442.m4569((C3795) this.receiver);
        c3804M4569.f11975 = "secondary_palette_key_color";
        c3804M4569.f11974 = new C3814(17);
        c3804M4569.f11973 = new C0995(24);
        return c3804M4569.m8147();
    }
}
