package com.android.dx.cf.code;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.android.dx.util.Hex;
import com.android.dx.util.IntList;
import com.android.dx.util.LabeledItem;
import p144.C7547;
import top.suzhelan.qstory.hook.item.C5925;

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
            C5925.m11310("label < 0");
            throw null;
        }
        if (i2 < 0) {
            C5925.m11310("start < 0");
            throw null;
        }
        if (i3 <= i2) {
            C5925.m11310("end <= start");
            throw null;
        }
        if (intList == null) {
            C2633.m5343("targets == null");
            throw null;
        }
        int size = intList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (intList.get(i4) < 0) {
                C7547.m12776(AbstractC0053.m150(i4, "successors[", "] == "), intList.get(i4));
                throw null;
            }
        }
        if (byteCatchList == null) {
            C2633.m5343("catches == null");
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

    @Override // com.android.dx.util.LabeledItem
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
        return "{" + Hex.u2(this.label) + ": " + Hex.u2(this.start) + ".." + Hex.u2(this.end) + '}';
    }
}
