package com.android.dx.dex.code;

import com.android.dx.rop.type.Type;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface CatchBuilder {
    CatchTable build();

    HashSet<Type> getCatchTypes();

    boolean hasAnyCatches();
}
