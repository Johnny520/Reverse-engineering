package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public abstract class RegisterMapper {
    public RegisterMapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int getNewRegisterCount();

    public abstract com.android.dx.rop.code.RegisterSpec map(com.android.dx.rop.code.RegisterSpec r1);

    public final com.android.dx.rop.code.RegisterSpecList map(com.android.dx.rop.code.RegisterSpecList r5) {
            r4 = this;
            int r0 = r5.size()
            com.android.dx.rop.code.RegisterSpecList r1 = new com.android.dx.rop.code.RegisterSpecList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L1a
            com.android.dx.rop.code.RegisterSpec r3 = r5.get(r2)
            com.android.dx.rop.code.RegisterSpec r3 = r4.map(r3)
            r1.set(r2, r3)
            int r2 = r2 + 1
            goto La
        L1a:
            r1.setImmutable()
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L24
            goto L25
        L24:
            r5 = r1
        L25:
            return r5
    }

    public final com.android.dx.rop.code.RegisterSpecSet map(com.android.dx.rop.code.RegisterSpecSet r5) {
            r4 = this;
            int r0 = r5.getMaxSize()
            com.android.dx.rop.code.RegisterSpecSet r1 = new com.android.dx.rop.code.RegisterSpecSet
            int r2 = r4.getNewRegisterCount()
            r1.<init>(r2)
            r2 = 0
        Le:
            if (r2 >= r0) goto L20
            com.android.dx.rop.code.RegisterSpec r3 = r5.get(r2)
            if (r3 == 0) goto L1d
            com.android.dx.rop.code.RegisterSpec r3 = r4.map(r3)
            r1.put(r3)
        L1d:
            int r2 = r2 + 1
            goto Le
        L20:
            r1.setImmutable()
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L2a
            goto L2b
        L2a:
            r5 = r1
        L2b:
            return r5
    }
}
