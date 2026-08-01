package com.android.dx.rop.cst;

import com.android.dx.util.ToHuman;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Constant implements ToHuman, Comparable<Constant> {
    @Override // java.lang.Comparable
    public final int compareTo(Constant constant) {
        Class<?> cls = getClass();
        Class<?> cls2 = constant.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : compareTo0(constant);
    }

    public abstract int compareTo0(Constant constant);

    public abstract boolean isCategory2();

    public abstract String typeName();
}
