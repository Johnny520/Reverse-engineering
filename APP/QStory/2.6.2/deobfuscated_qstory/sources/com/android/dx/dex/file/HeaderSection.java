package com.android.dx.dex.file;

import com.android.dx.rop.cst.Constant;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class HeaderSection extends UniformItemSection {
    private final List<HeaderItem> list;

    public HeaderSection(DexFile dexFile) {
        super(null, dexFile, 4);
        HeaderItem headerItem = new HeaderItem();
        headerItem.setIndex(0);
        this.list = Collections.singletonList(headerItem);
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        return null;
    }

    @Override // com.android.dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.list;
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
    }
}
