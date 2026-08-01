package com.android.dx.dex.file;

import com.android.dx.rop.cst.Constant;
import com.android.dx.util.AnnotatedOutput;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class UniformItemSection extends Section {
    public UniformItemSection(String str, DexFile dexFile, int i) {
        super(str, dexFile, i);
    }

    public abstract IndexedItem get(Constant constant);

    @Override // com.android.dx.dex.file.Section
    public final int getAbsoluteItemOffset(Item item) {
        IndexedItem indexedItem = (IndexedItem) item;
        return getAbsoluteOffset(indexedItem.writeSize() * indexedItem.getIndex());
    }

    public abstract void orderItems();

    @Override // com.android.dx.dex.file.Section
    public final void prepare0() {
        DexFile file = getFile();
        orderItems();
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            it.next().addContents(file);
        }
    }

    @Override // com.android.dx.dex.file.Section
    public final int writeSize() {
        Collection<? extends Item> collectionItems = items();
        int size = collectionItems.size();
        if (size == 0) {
            return 0;
        }
        return collectionItems.iterator().next().writeSize() * size;
    }

    @Override // com.android.dx.dex.file.Section
    public final void writeTo0(AnnotatedOutput annotatedOutput) {
        DexFile file = getFile();
        int alignment = getAlignment();
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            it.next().writeTo(file, annotatedOutput);
            annotatedOutput.alignTo(alignment);
        }
    }
}
