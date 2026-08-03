package com.android.dx.rop.type;

/* JADX INFO: loaded from: classes.dex */
public interface TypeList {
    com.android.dx.rop.type.Type getType(int r1);

    int getWordCount();

    boolean isMutable();

    int size();

    com.android.dx.rop.type.TypeList withAddedType(com.android.dx.rop.type.Type r1);
}
