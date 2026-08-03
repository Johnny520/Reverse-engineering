package com.android.p001dx.p002cf.code;

import Yue.C6193;
import com.android.p001dx.util.Hex;
import com.android.p001dx.util.IntList;
import com.android.p001dx.util.LabeledItem;

/* JADX INFO: loaded from: classes.dex */
public final class ByteBlock implements LabeledItem {
    private final ByteCatchList catches;
    private final int end;
    private final int label;
    private final int start;
    private final IntList successors;

    public ByteBlock(int i, int i2, int i3, IntList intList, ByteCatchList byteCatchList) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        if (intList == null) {
            throw new NullPointerException("targets == null");
        }
        int size = intList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (intList.get(i4) < 0) {
                throw new IllegalArgumentException("successors[" + i4 + "] == " + intList.get(i4));
            }
        }
        if (byteCatchList == null) {
            throw new NullPointerException("catches == null");
        }
        this.label = i;
        this.start = i2;
        this.end = i3;
        this.successors = intList;
        this.catches = byteCatchList;
    }

    public ByteCatchList getCatches() {
        return this.catches;
    }

    public int getEnd() {
        return this.end;
    }

    @Override // com.android.p001dx.util.LabeledItem
    public int getLabel() {
        return this.label;
    }

    public int getStart() {
        return this.start;
    }

    public IntList getSuccessors() {
        return this.successors;
    }

    public String toString() {
        return C6193.f1884 + Hex.m5035u2(this.label) + ": " + Hex.m5035u2(this.start) + ".." + Hex.m5035u2(this.end) + C6193.f1885;
    }
}
