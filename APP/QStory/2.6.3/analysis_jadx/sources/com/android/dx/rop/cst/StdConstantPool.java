package com.android.dx.rop.cst;

import androidx.profileinstaller.AbstractC2442;
import com.android.dex.util.ExceptionWithContext;
import com.android.dx.util.MutabilityControl;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class StdConstantPool extends MutabilityControl implements ConstantPool {
    private final Constant[] entries;

    public StdConstantPool(int i) {
        super(i > 1);
        if (i >= 1) {
            this.entries = new Constant[i];
        } else {
            C5925.m11310("size < 1");
            throw null;
        }
    }

    private static Constant throwInvalid(int i) {
        throw new ExceptionWithContext(AbstractC2442.m4560(new StringBuilder("invalid constant pool index "), i));
    }

    @Override // com.android.dx.rop.cst.ConstantPool
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

    @Override // com.android.dx.rop.cst.ConstantPool
    public Constant get0Ok(int i) {
        if (i == 0) {
            return null;
        }
        return get(i);
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public Constant[] getEntries() {
        return this.entries;
    }

    @Override // com.android.dx.rop.cst.ConstantPool
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
            C5925.m11310("n < 1");
            return;
        }
        if (z) {
            Constant[] constantArr = this.entries;
            if (i == constantArr.length - 1) {
                C5925.m11310("(n == size - 1) && cst.isCategory2()");
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

    @Override // com.android.dx.rop.cst.ConstantPool
    public int size() {
        return this.entries.length;
    }
}
