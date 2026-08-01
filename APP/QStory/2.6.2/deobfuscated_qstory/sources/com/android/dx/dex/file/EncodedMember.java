package com.android.dx.dex.file;

import com.android.dx.rop.cst.CstString;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.ToHuman;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EncodedMember implements ToHuman {
    private final int accessFlags;

    public EncodedMember(int i) {
        this.accessFlags = i;
    }

    public abstract void addContents(DexFile dexFile);

    public abstract void debugPrint(PrintWriter printWriter, boolean z);

    public abstract int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i, int i2);

    public final int getAccessFlags() {
        return this.accessFlags;
    }

    public abstract CstString getName();
}
