package com.android.dx.cf.code;

import androidx.profileinstaller.AbstractC2442;
import com.android.dx.util.LabeledItem;
import com.android.dx.util.LabeledList;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        C5919.m11249(AbstractC2442.m4550(new StringBuilder("no such label: "), i));
        return null;
    }

    public void set(int i, ByteBlock byteBlock) {
        super.set(i, (LabeledItem) byteBlock);
    }
}
