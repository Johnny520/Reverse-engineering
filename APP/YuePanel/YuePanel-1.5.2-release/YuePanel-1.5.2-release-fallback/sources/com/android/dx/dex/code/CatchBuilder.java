package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public interface CatchBuilder {
    com.android.dx.dex.code.CatchTable build();

    java.util.HashSet<com.android.dx.rop.type.Type> getCatchTypes();

    boolean hasAnyCatches();
}
