package com.android.p001dx.rop.type;

import com.android.p001dx.util.ToHuman;

/* JADX INFO: loaded from: classes.dex */
public interface TypeBearer extends ToHuman {
    int getBasicFrameType();

    int getBasicType();

    TypeBearer getFrameType();

    Type getType();

    boolean isConstant();
}
