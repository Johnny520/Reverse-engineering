package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public abstract class Item {
    public Item() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void addContents(com.android.dx.dex.file.DexFile r1);

    public abstract com.android.dx.dex.file.ItemType itemType();

    public final java.lang.String typeName() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = r1.itemType()
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    public abstract int writeSize();

    public abstract void writeTo(com.android.dx.dex.file.DexFile r1, com.android.dx.util.AnnotatedOutput r2);
}
