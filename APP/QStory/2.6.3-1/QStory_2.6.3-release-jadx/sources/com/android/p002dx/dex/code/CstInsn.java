package com.android.p002dx.dex.code;

import bsh.C3466;
import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.rop.code.SourcePosition;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.util.Hex;
import io.ktor.util.C5043;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CstInsn extends FixedSizeInsn {
    private int classIndex;
    private final Constant constant;
    private int index;

    public CstInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant constant) {
        super(dop, sourcePosition, registerSpecList);
        if (constant == null) {
            C3466.m5903("constant == null");
            throw null;
        }
        this.constant = constant;
        this.index = -1;
        this.classIndex = -1;
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public String argString() {
        return this.constant.toHuman();
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public String cstComment() {
        if (!hasIndex()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(getConstant().typeName());
        sb.append('@');
        int i = this.index;
        if (i < 65536) {
            sb.append(Hex.m28u2(i));
        } else {
            sb.append(Hex.m30u4(i));
        }
        return sb.toString();
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public String cstString() {
        Constant constant = this.constant;
        return constant instanceof CstString ? ((CstString) constant).toQuoted() : constant.toHuman();
    }

    public int getClassIndex() {
        int i = this.classIndex;
        if (i >= 0) {
            return i;
        }
        C6755.m11870("class index not yet set");
        return 0;
    }

    public Constant getConstant() {
        return this.constant;
    }

    public int getIndex() {
        int i = this.index;
        if (i >= 0) {
            return i;
        }
        C5043.m9164(this.constant, "index not yet set for ");
        return 0;
    }

    public boolean hasClassIndex() {
        return this.classIndex >= 0;
    }

    public boolean hasIndex() {
        return this.index >= 0;
    }

    public void setClassIndex(int i) {
        if (i < 0) {
            C6755.m11869("index < 0");
        } else if (this.classIndex < 0) {
            this.classIndex = i;
        } else {
            C6755.m11870("class index already set");
        }
    }

    public void setIndex(int i) {
        if (i < 0) {
            C6755.m11869("index < 0");
        } else if (this.index < 0) {
            this.index = i;
        } else {
            C6755.m11870("index already set");
        }
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withOpcode(Dop dop) {
        CstInsn cstInsn = new CstInsn(dop, getPosition(), getRegisters(), this.constant);
        int i = this.index;
        if (i >= 0) {
            cstInsn.setIndex(i);
        }
        int i2 = this.classIndex;
        if (i2 >= 0) {
            cstInsn.setClassIndex(i2);
        }
        return cstInsn;
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        CstInsn cstInsn = new CstInsn(getOpcode(), getPosition(), registerSpecList, this.constant);
        int i = this.index;
        if (i >= 0) {
            cstInsn.setIndex(i);
        }
        int i2 = this.classIndex;
        if (i2 >= 0) {
            cstInsn.setClassIndex(i2);
        }
        return cstInsn;
    }
}
