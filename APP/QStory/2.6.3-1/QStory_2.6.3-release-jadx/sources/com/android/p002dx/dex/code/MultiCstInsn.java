package com.android.p002dx.dex.code;

import androidx.activity.AbstractC0900;
import bsh.C3466;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.rop.code.SourcePosition;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.util.Hex;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MultiCstInsn extends FixedSizeInsn {
    private static final int NOT_SET = -1;
    private int classIndex;
    private final Constant[] constants;
    private final int[] index;

    public MultiCstInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant[] constantArr) {
        super(dop, sourcePosition, registerSpecList);
        if (constantArr == null) {
            C3466.m5903("constants == null");
            throw null;
        }
        this.constants = constantArr;
        this.index = new int[constantArr.length];
        int i = 0;
        while (true) {
            int[] iArr = this.index;
            if (i >= iArr.length) {
                this.classIndex = -1;
                return;
            } else {
                if (constantArr[i] == null) {
                    C3466.m5903("constants[i] == null");
                    throw null;
                }
                iArr[i] = -1;
                i++;
            }
        }
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public String argString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.constants.length; i++) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.constants[i].toHuman());
        }
        return sb.toString();
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public String cstComment() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.constants.length; i++) {
            if (!hasIndex(i)) {
                return "";
            }
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(getConstant(i).typeName());
            sb.append('@');
            int index = getIndex(i);
            if (index < 65536) {
                sb.append(Hex.m28u2(index));
            } else {
                sb.append(Hex.m30u4(index));
            }
        }
        return sb.toString();
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public String cstString() {
        return argString();
    }

    public int getClassIndex() {
        if (hasClassIndex()) {
            return this.classIndex;
        }
        C6755.m11870("class index not yet set");
        return 0;
    }

    public Constant getConstant(int i) {
        return this.constants[i];
    }

    public int getIndex(int i) {
        if (hasIndex(i)) {
            return this.index[i];
        }
        C3775.m6967(this.constants[i], AbstractC0900.m710(i, "index not yet set for constant ", " value = "));
        return 0;
    }

    public int getNumberOfConstants() {
        return this.constants.length;
    }

    public boolean hasClassIndex() {
        return this.classIndex != -1;
    }

    public boolean hasIndex(int i) {
        return this.index[i] != -1;
    }

    public void setClassIndex(int i) {
        if (i < 0) {
            C6755.m11869("index < 0");
        } else if (hasClassIndex()) {
            C6755.m11870("class index already set");
        } else {
            this.classIndex = i;
        }
    }

    public void setIndex(int i, int i2) {
        if (i2 < 0) {
            C6755.m11869("index < 0");
        } else if (hasIndex(i)) {
            C6755.m11870("index already set");
        } else {
            this.index[i] = i2;
        }
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withOpcode(Dop dop) {
        return new MultiCstInsn(dop, getPosition(), getRegisters(), this.constants, this.index, this.classIndex);
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new MultiCstInsn(getOpcode(), getPosition(), registerSpecList, this.constants, this.index, this.classIndex);
    }

    private MultiCstInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant[] constantArr, int[] iArr, int i) {
        super(dop, sourcePosition, registerSpecList);
        this.constants = constantArr;
        this.index = iArr;
        this.classIndex = i;
    }
}
