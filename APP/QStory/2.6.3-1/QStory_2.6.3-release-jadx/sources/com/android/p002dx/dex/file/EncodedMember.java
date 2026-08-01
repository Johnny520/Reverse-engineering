package com.android.p002dx.dex.file;

import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.ToHuman;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
