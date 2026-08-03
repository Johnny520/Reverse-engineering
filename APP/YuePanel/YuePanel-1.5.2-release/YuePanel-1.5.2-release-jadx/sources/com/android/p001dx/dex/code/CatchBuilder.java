package com.android.p001dx.dex.code;

import com.android.p001dx.rop.type.Type;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public interface CatchBuilder {
    CatchTable build();

    HashSet<Type> getCatchTypes();

    boolean hasAnyCatches();
}
