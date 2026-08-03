package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public abstract class LocalsArray extends com.android.dx.util.MutabilityControl implements com.android.dx.util.ToHuman {
    public LocalsArray(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public abstract void annotate(com.android.dex.util.ExceptionWithContext r1);

    public abstract com.android.dx.cf.code.LocalsArray copy();

    public abstract com.android.dx.rop.type.TypeBearer get(int r1);

    public abstract com.android.dx.rop.type.TypeBearer getCategory1(int r1);

    public abstract com.android.dx.rop.type.TypeBearer getCategory2(int r1);

    public abstract int getMaxLocals();

    public abstract com.android.dx.rop.type.TypeBearer getOrNull(int r1);

    public abstract com.android.dx.cf.code.OneLocalsArray getPrimary();

    public abstract void invalidate(int r1);

    public abstract void makeInitialized(com.android.dx.rop.type.Type r1);

    public abstract com.android.dx.cf.code.LocalsArray merge(com.android.dx.cf.code.LocalsArray r1);

    public abstract com.android.dx.cf.code.LocalsArraySet mergeWithSubroutineCaller(com.android.dx.cf.code.LocalsArray r1, int r2);

    public abstract void set(int r1, com.android.dx.rop.type.TypeBearer r2);

    public abstract void set(com.android.dx.rop.code.RegisterSpec r1);
}
