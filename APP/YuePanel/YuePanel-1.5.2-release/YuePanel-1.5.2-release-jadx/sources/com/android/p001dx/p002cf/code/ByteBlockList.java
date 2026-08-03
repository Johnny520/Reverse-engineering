package com.android.p001dx.p002cf.code;

import com.android.p001dx.util.Hex;
import com.android.p001dx.util.LabeledItem;
import com.android.p001dx.util.LabeledList;

/* JADX INFO: loaded from: classes.dex */
public final class ByteBlockList extends LabeledList {
    public ByteBlockList(int i) {
        super(i);
    }

    public ByteBlock get(int i) {
        return (ByteBlock) get0(i);
    }

    public ByteBlock labelToBlock(int i) {
        int iIndexOfLabel = indexOfLabel(i);
        if (iIndexOfLabel >= 0) {
            return get(iIndexOfLabel);
        }
        throw new IllegalArgumentException("no such label: " + Hex.m5035u2(i));
    }

    public void set(int i, ByteBlock byteBlock) {
        super.set(i, (LabeledItem) byteBlock);
    }
}
