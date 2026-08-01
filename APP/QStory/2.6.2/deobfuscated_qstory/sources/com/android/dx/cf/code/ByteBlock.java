package com.android.dx.cf.code;

import androidx.activity.AbstractC0053;
import bsh.C2632;
import com.android.dx.util.Hex;
import com.android.dx.util.IntList;
import com.android.dx.util.LabeledItem;
import p144.C7546;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ByteBlock implements LabeledItem {
    private final ByteCatchList catches;
    private final int end;
    private final int label;
    private final int start;
    private final IntList successors;

    public ByteBlock(int i, int i2, int i3, IntList intList, ByteCatchList byteCatchList) {
        if (i < 0) {
            C5919.m11249("label < 0");
            throw null;
        }
        if (i2 < 0) {
            C5919.m11249("start < 0");
            throw null;
        }
        if (i3 <= i2) {
            C5919.m11249("end <= start");
            throw null;
        }
        if (intList == null) {
            C2632.m5298("targets == null");
            throw null;
        }
        int size = intList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (intList.get(i4) < 0) {
                C7546.m12747(AbstractC0053.m148(i4, "successors[", "] == "), intList.get(i4));
                throw null;
            }
        }
        if (byteCatchList == null) {
            C2632.m5298("catches == null");
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
