package com.android.dx.rop.cst;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface ConstantPool {
    Constant get(int i);

    Constant get0Ok(int i);

    Constant[] getEntries();

    Constant getOrNull(int i);

    int size();
}
