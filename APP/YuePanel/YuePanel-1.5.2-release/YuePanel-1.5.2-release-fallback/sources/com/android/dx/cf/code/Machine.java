package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public interface Machine {
    void auxCstArg(com.android.dx.rop.cst.Constant r1);

    void auxInitValues(java.util.ArrayList<com.android.dx.rop.cst.Constant> r1);

    void auxIntArg(int r1);

    void auxSwitchArg(com.android.dx.cf.code.SwitchList r1);

    void auxTargetArg(int r1);

    void auxType(com.android.dx.rop.type.Type r1);

    void clearArgs();

    com.android.dx.rop.type.Prototype getPrototype();

    void localArg(com.android.dx.cf.code.Frame r1, int r2);

    void localInfo(boolean r1);

    void localTarget(int r1, com.android.dx.rop.type.Type r2, com.android.dx.rop.code.LocalItem r3);

    void popArgs(com.android.dx.cf.code.Frame r1, int r2);

    void popArgs(com.android.dx.cf.code.Frame r1, com.android.dx.rop.type.Prototype r2);

    void popArgs(com.android.dx.cf.code.Frame r1, com.android.dx.rop.type.Type r2);

    void popArgs(com.android.dx.cf.code.Frame r1, com.android.dx.rop.type.Type r2, com.android.dx.rop.type.Type r3);

    void popArgs(com.android.dx.cf.code.Frame r1, com.android.dx.rop.type.Type r2, com.android.dx.rop.type.Type r3, com.android.dx.rop.type.Type r4);

    void run(com.android.dx.cf.code.Frame r1, int r2, int r3);
}
