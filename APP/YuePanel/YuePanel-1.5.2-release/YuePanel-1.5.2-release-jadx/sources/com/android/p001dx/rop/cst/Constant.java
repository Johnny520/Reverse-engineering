package com.android.p001dx.rop.cst;

import com.android.p001dx.util.ToHuman;

/* JADX INFO: loaded from: classes.dex */
public abstract class Constant implements ToHuman, Comparable<Constant> {
    public abstract int compareTo0(Constant constant);

    public abstract boolean isCategory2();

    public abstract String typeName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public final int compareTo(Constant constant) {
        Class<?> cls = getClass();
        Class<?> cls2 = constant.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : compareTo0(constant);
    }
}
