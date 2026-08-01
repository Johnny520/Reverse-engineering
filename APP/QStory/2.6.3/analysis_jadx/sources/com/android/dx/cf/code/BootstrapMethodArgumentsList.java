package com.android.dx.cf.code;

import androidx.activity.AbstractC0053;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstDouble;
import com.android.dx.rop.cst.CstFloat;
import com.android.dx.rop.cst.CstInteger;
import com.android.dx.rop.cst.CstLong;
import com.android.dx.rop.cst.CstMethodHandle;
import com.android.dx.rop.cst.CstProtoRef;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.util.FixedSizeList;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BootstrapMethodArgumentsList extends FixedSizeList {
    public BootstrapMethodArgumentsList(int i) {
        super(i);
    }

    public Constant get(int i) {
        return (Constant) get0(i);
    }

    public void set(int i, Constant constant) {
        if ((constant instanceof CstString) || (constant instanceof CstType) || (constant instanceof CstInteger) || (constant instanceof CstLong) || (constant instanceof CstFloat) || (constant instanceof CstDouble) || (constant instanceof CstMethodHandle) || (constant instanceof CstProtoRef)) {
            set0(i, constant);
        } else {
            C5925.m11310(AbstractC0053.m154(constant.getClass(), "bad type for bootstrap argument: "));
        }
    }
}
