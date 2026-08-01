package com.android.p002dx.p003cf.code;

import androidx.profileinstaller.AbstractC3275;
import com.android.p002dx.util.LabeledItem;
import com.android.p002dx.util.LabeledList;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        C6755.m11869(AbstractC3275.m5120(new StringBuilder("no such label: "), i));
        return null;
    }

    public void set(int i, ByteBlock byteBlock) {
        super.set(i, (LabeledItem) byteBlock);
    }
}
