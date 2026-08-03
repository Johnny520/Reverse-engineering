package com.android.p001dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public interface ConstantPool {
    Constant get(int i);

    Constant get0Ok(int i);

    Constant[] getEntries();

    Constant getOrNull(int i);

    int size();
}
