package com.android.dx.cf.code;

import androidx.profileinstaller.AbstractC2442;
import com.android.dx.util.LabeledItem;
import com.android.dx.util.LabeledList;
import top.suzhelan.qstory.hook.item.C5925;

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
        C5925.m11310(AbstractC2442.m4560(new StringBuilder("no such label: "), i));
        return null;
    }

    public void set(int i, ByteBlock byteBlock) {
        super.set(i, (LabeledItem) byteBlock);
    }
}
