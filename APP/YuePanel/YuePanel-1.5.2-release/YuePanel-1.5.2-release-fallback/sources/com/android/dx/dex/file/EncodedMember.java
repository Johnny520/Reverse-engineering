package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public abstract class EncodedMember implements com.android.dx.util.ToHuman {
    private final int accessFlags;

    public EncodedMember(int r1) {
            r0 = this;
            r0.<init>()
            r0.accessFlags = r1
            return
    }

    public abstract void addContents(com.android.dx.dex.file.DexFile r1);

    public abstract void debugPrint(java.io.PrintWriter r1, boolean r2);

    public abstract int encode(com.android.dx.dex.file.DexFile r1, com.android.dx.util.AnnotatedOutput r2, int r3, int r4);

    public final int getAccessFlags() {
            r1 = this;
            int r0 = r1.accessFlags
            return r0
    }

    public abstract com.android.dx.rop.cst.CstString getName();
}
