package com.android.p002dx.rop.cst;

import androidx.profileinstaller.AbstractC3275;
import com.android.dex.util.ExceptionWithContext;
import com.android.p002dx.util.MutabilityControl;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class StdConstantPool extends MutabilityControl implements ConstantPool {
    private final Constant[] entries;

    public StdConstantPool(int i) {
        super(i > 1);
        if (i >= 1) {
            this.entries = new Constant[i];
        } else {
            C6755.m11869("size < 1");
            throw null;
        }
    }

    private static Constant throwInvalid(int i) {
        throw new ExceptionWithContext(AbstractC3275.m5120(new StringBuilder("invalid constant pool index "), i));
    }

    @Override // com.android.p002dx.rop.cst.ConstantPool
    public Constant get(int i) {
        try {
            Constant constant = this.entries[i];
            if (constant == null) {
                throwInvalid(i);
            }
            return constant;
        } catch (IndexOutOfBoundsException unused) {
            return throwInvalid(i);
        }
    }

    @Override // com.android.p002dx.rop.cst.ConstantPool
    public Constant get0Ok(int i) {
        if (i == 0) {
            return null;
        }
        return get(i);
    }

    @Override // com.android.p002dx.rop.cst.ConstantPool
    public Constant[] getEntries() {
        return this.entries;
    }

    @Override // com.android.p002dx.rop.cst.ConstantPool
    public Constant getOrNull(int i) {
        try {
            return this.entries[i];
        } catch (IndexOutOfBoundsException unused) {
            return throwInvalid(i);
        }
    }

    public void set(int i, Constant constant) {
        int i2;
        Constant constant2;
        throwIfImmutable();
        boolean z = constant != null && constant.isCategory2();
        if (i < 1) {
            C6755.m11869("n < 1");
            return;
        }
        if (z) {
            Constant[] constantArr = this.entries;
            if (i == constantArr.length - 1) {
                C6755.m11869("(n == size - 1) && cst.isCategory2()");
                return;
            }
            constantArr[i + 1] = null;
        }
        if (constant != null) {
            Constant[] constantArr2 = this.entries;
            if (constantArr2[i] == null && (constant2 = constantArr2[i - 1]) != null && constant2.isCategory2()) {
                this.entries[i2] = null;
            }
        }
        this.entries[i] = constant;
    }

    @Override // com.android.p002dx.rop.cst.ConstantPool
    public int size() {
        return this.entries.length;
    }
}
