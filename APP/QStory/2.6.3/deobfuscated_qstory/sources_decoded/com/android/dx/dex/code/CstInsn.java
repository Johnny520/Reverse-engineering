package com.android.dx.dex.code;

import bsh.C2633;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstString;
import com.android.dx.util.Hex;
import io.ktor.util.C4211;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CstInsn extends FixedSizeInsn {
    private int classIndex;
    private final Constant constant;
    private int index;

    public CstInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant constant) {
        super(dop, sourcePosition, registerSpecList);
        if (constant == null) {
            C2633.m5343("constant == null");
            throw null;
        }
        this.constant = constant;
        this.index = -1;
        this.classIndex = -1;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String argString() {
        return this.constant.toHuman();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String cstComment() {
        if (!hasIndex()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(getConstant().typeName());
        sb.append('@');
        int i = this.index;
        if (i < 65536) {
            sb.append(Hex.u2(i));
        } else {
            sb.append(Hex.u4(i));
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String cstString() {
        Constant constant = this.constant;
        return constant instanceof CstString ? ((CstString) constant).toQuoted() : constant.toHuman();
    }

    public int getClassIndex() {
        int i = this.classIndex;
        if (i >= 0) {
            return i;
        }
        C5925.m11311("class index not yet set");
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
        C4211.m8605(this.constant, "index not yet set for ");
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
            C5925.m11310("index < 0");
        } else if (this.classIndex < 0) {
            this.classIndex = i;
        } else {
            C5925.m11311("class index already set");
        }
    }

    public void setIndex(int i) {
        if (i < 0) {
            C5925.m11310("index < 0");
        } else if (this.index < 0) {
            this.index = i;
        } else {
            C5925.m11311("index already set");
        }
    }

    @Override // com.android.dx.dex.code.DalvInsn
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

    @Override // com.android.dx.dex.code.DalvInsn
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
