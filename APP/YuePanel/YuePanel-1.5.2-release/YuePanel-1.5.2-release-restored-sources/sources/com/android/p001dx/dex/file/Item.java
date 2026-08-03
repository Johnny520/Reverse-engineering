package com.android.p001dx.dex.file;

import com.android.p001dx.util.AnnotatedOutput;

/* JADX INFO: loaded from: classes.dex */
public abstract class Item {
    public abstract void addContents(DexFile dexFile);

    public abstract ItemType itemType();

    public final String typeName() {
        return itemType().toHuman();
    }

    public abstract int writeSize();

    public abstract void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput);
}
