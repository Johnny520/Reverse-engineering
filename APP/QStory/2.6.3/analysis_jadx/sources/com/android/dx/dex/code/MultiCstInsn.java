package com.android.dx.dex.code;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.alibaba.fastjson2.C2942;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.rop.cst.Constant;
import com.android.dx.util.Hex;
import top.suzhelan.qstory.hook.item.C5925;

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
            C2633.m5343("constants == null");
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
                    C2633.m5343("constants[i] == null");
                    throw null;
                }
                iArr[i] = -1;
                i++;
            }
        }
    }

    @Override // com.android.dx.dex.code.DalvInsn
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

    @Override // com.android.dx.dex.code.DalvInsn
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
                sb.append(Hex.u2(index));
            } else {
                sb.append(Hex.u4(index));
            }
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String cstString() {
        return argString();
    }

    public int getClassIndex() {
        if (hasClassIndex()) {
            return this.classIndex;
        }
        C5925.m11311("class index not yet set");
        return 0;
    }

    public Constant getConstant(int i) {
        return this.constants[i];
    }

    public int getIndex(int i) {
        if (hasIndex(i)) {
            return this.index[i];
        }
        C2942.m6407(this.constants[i], AbstractC0053.m150(i, "index not yet set for constant ", " value = "));
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
            C5925.m11310("index < 0");
        } else if (hasClassIndex()) {
            C5925.m11311("class index already set");
        } else {
            this.classIndex = i;
        }
    }

    public void setIndex(int i, int i2) {
        if (i2 < 0) {
            C5925.m11310("index < 0");
        } else if (hasIndex(i)) {
            C5925.m11311("index already set");
        } else {
            this.index[i] = i2;
        }
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withOpcode(Dop dop) {
        return new MultiCstInsn(dop, getPosition(), getRegisters(), this.constants, this.index, this.classIndex);
    }

    @Override // com.android.dx.dex.code.DalvInsn
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
