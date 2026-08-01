package com.android.p002dx.p003cf.code;

import androidx.activity.AbstractC0900;
import bsh.C3466;
import com.android.p002dx.util.Hex;
import com.android.p002dx.util.IntList;
import com.android.p002dx.util.LabeledItem;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ByteBlock implements LabeledItem {
    private final ByteCatchList catches;
    private final int end;
    private final int label;
    private final int start;
    private final IntList successors;

    public ByteBlock(int i, int i2, int i3, IntList intList, ByteCatchList byteCatchList) {
        if (i < 0) {
            C6755.m11869("label < 0");
            throw null;
        }
        if (i2 < 0) {
            C6755.m11869("start < 0");
            throw null;
        }
        if (i3 <= i2) {
            C6755.m11869("end <= start");
            throw null;
        }
        if (intList == null) {
            C3466.m5903("targets == null");
            throw null;
        }
        int size = intList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (intList.get(i4) < 0) {
                C8376.m13335(AbstractC0900.m710(i4, "successors[", "] == "), intList.get(i4));
                throw null;
            }
        }
        if (byteCatchList == null) {
            C3466.m5903("catches == null");
            throw null;
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

    @Override // com.android.p002dx.util.LabeledItem
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
        return "{" + Hex.m28u2(this.label) + ": " + Hex.m28u2(this.start) + ".." + Hex.m28u2(this.end) + '}';
    }
}
