package com.android.dx.rop.type;

/* JADX INFO: loaded from: classes.dex */
public interface TypeBearer extends com.android.dx.util.ToHuman {
    int getBasicFrameType();

    int getBasicType();

    com.android.dx.rop.type.TypeBearer getFrameType();

    com.android.dx.rop.type.Type getType();

    boolean isConstant();
}
