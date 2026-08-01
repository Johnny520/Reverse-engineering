package com.android.dx.dex.file;

import com.android.dx.rop.cst.Constant;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
