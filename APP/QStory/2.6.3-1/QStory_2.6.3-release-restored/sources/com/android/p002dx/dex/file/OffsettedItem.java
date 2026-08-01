package com.android.p002dx.dex.file;

import bsh.C3466;
import com.android.dex.util.ExceptionWithContext;
import com.android.p002dx.util.AnnotatedOutput;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class OffsettedItem extends Item implements Comparable<OffsettedItem> {
    private Section addedTo;
    private final int alignment;
    private int offset;
    private int writeSize;

    public OffsettedItem(int i, int i2) {
        Section.validateAlignment(i);
        if (i2 < -1) {
            C6755.m11869("writeSize < -1");
            throw null;
        }
        this.alignment = i;
        this.writeSize = i2;
        this.addedTo = null;
        this.offset = -1;
    }

    public static int getAbsoluteOffsetOr0(OffsettedItem offsettedItem) {
        if (offsettedItem == null) {
            return 0;
        }
        return offsettedItem.getAbsoluteOffset();
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsettedItem offsettedItem) {
        if (this == offsettedItem) {
            return 0;
        }
        ItemType itemType = itemType();
        ItemType itemType2 = offsettedItem.itemType();
        return itemType != itemType2 ? itemType.compareTo(itemType2) : compareTo0(offsettedItem);
    }

    public int compareTo0(OffsettedItem offsettedItem) {
        throw new UnsupportedOperationException("unsupported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsettedItem offsettedItem = (OffsettedItem) obj;
        return itemType() == offsettedItem.itemType() && compareTo0(offsettedItem) == 0;
    }

    public final int getAbsoluteOffset() {
        int i = this.offset;
        if (i >= 0) {
            return this.addedTo.getAbsoluteOffset(i);
        }
        C3466.m5899("offset not yet known");
        return 0;
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final int getRelativeOffset() {
        int i = this.offset;
        if (i >= 0) {
            return i;
        }
        C3466.m5899("offset not yet known");
        return 0;
    }

    public final String offsetString() {
        return "[" + Integer.toHexString(getAbsoluteOffset()) + ']';
    }

    public final int place(Section section, int i) {
        if (section == null) {
            C3466.m5903("addedTo == null");
            return 0;
        }
        if (i < 0) {
            C6755.m11869("offset < 0");
            return 0;
        }
        if (this.addedTo != null) {
            C3466.m5899("already written");
            return 0;
        }
        int i2 = this.alignment - 1;
        int i3 = (i + i2) & (~i2);
        this.addedTo = section;
        this.offset = i3;
        place0(section, i3);
        return i3;
    }

    public final void setWriteSize(int i) {
        if (i < 0) {
            C6755.m11869("writeSize < 0");
        } else if (this.writeSize < 0) {
            this.writeSize = i;
        } else {
            C6755.m11867("writeSize already set");
        }
    }

    public abstract String toHuman();

    @Override // com.android.p002dx.dex.file.Item
    public final int writeSize() {
        int i = this.writeSize;
        if (i >= 0) {
            return i;
        }
        C6755.m11867("writeSize is unknown");
        return 0;
    }

    @Override // com.android.p002dx.dex.file.Item
    public final void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        annotatedOutput.alignTo(this.alignment);
        try {
            if (this.writeSize < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            annotatedOutput.assertCursor(getAbsoluteOffset());
            writeTo0(dexFile, annotatedOutput);
        } catch (RuntimeException e) {
            throw ExceptionWithContext.withContext(e, "...while writing " + this);
        }
    }

    public abstract void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput);

    public void place0(Section section, int i) {
    }
}
