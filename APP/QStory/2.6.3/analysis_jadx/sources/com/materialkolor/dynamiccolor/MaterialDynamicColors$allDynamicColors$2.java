package com.materialkolor.dynamiccolor;

import androidx.compose.foundation.text.C0995;
import androidx.profileinstaller.AbstractC2442;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class MaterialDynamicColors$allDynamicColors$2 extends FunctionReferenceImpl implements InterfaceC6543 {
    public MaterialDynamicColors$allDynamicColors$2(Object obj) {
        super(0, obj, C3796.class, "secondaryPaletteKeyColor", "secondaryPaletteKeyColor()Lcom/materialkolor/dynamiccolor/DynamicColor;", 0);
    }

    @Override // p052.InterfaceC6543
    public final C3806 invoke() {
        C3805 c3805M4579 = AbstractC2442.m4579((C3796) this.receiver);
        c3805M4579.f11980 = "secondary_palette_key_color";
        c3805M4579.f11979 = new C3815(17);
        c3805M4579.f11978 = new C0995(24);
        return c3805M4579.m8134();
    }
}
