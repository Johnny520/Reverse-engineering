package com.android.p002dx.dex.file;

import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.util.AnnotatedOutput;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class UniformItemSection extends Section {
    public UniformItemSection(String str, DexFile dexFile, int i) {
        super(str, dexFile, i);
    }

    public abstract IndexedItem get(Constant constant);

    @Override // com.android.p002dx.dex.file.Section
    public final int getAbsoluteItemOffset(Item item) {
        IndexedItem indexedItem = (IndexedItem) item;
        return getAbsoluteOffset(indexedItem.writeSize() * indexedItem.getIndex());
    }

    public abstract void orderItems();

    @Override // com.android.p002dx.dex.file.Section
    public final void prepare0() {
        DexFile file = getFile();
        orderItems();
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            it.next().addContents(file);
        }
    }

    @Override // com.android.p002dx.dex.file.Section
    public final int writeSize() {
        Collection<? extends Item> collectionItems = items();
        int size = collectionItems.size();
        if (size == 0) {
            return 0;
        }
        return collectionItems.iterator().next().writeSize() * size;
    }

    @Override // com.android.p002dx.dex.file.Section
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
