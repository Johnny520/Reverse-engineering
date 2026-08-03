package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public interface ConstantPool {
    com.android.dx.rop.cst.Constant get(int r1);

    com.android.dx.rop.cst.Constant get0Ok(int r1);

    com.android.dx.rop.cst.Constant[] getEntries();

    com.android.dx.rop.cst.Constant getOrNull(int r1);

    int size();
}
