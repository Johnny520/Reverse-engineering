package com.android.p002dx.rop.cst;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface ConstantPool {
    Constant get(int i);

    Constant get0Ok(int i);

    Constant[] getEntries();

    Constant getOrNull(int i);

    int size();
}
