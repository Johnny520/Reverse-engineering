package com.android.p002dx.p003cf.attrib;

import bsh.C3466;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.cst.CstType;
import com.android.p002dx.util.FixedSizeList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class InnerClassList extends FixedSizeList {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Item {
        private final int accessFlags;
        private final CstType innerClass;
        private final CstString innerName;
        private final CstType outerClass;

        public Item(CstType cstType, CstType cstType2, CstString cstString, int i) {
            if (cstType == null) {
                C3466.m5903("innerClass == null");
                throw null;
            }
            this.innerClass = cstType;
            this.outerClass = cstType2;
            this.innerName = cstString;
            this.accessFlags = i;
        }

        public int getAccessFlags() {
            return this.accessFlags;
        }

        public CstType getInnerClass() {
            return this.innerClass;
        }

        public CstString getInnerName() {
            return this.innerName;
        }

        public CstType getOuterClass() {
            return this.outerClass;
        }
    }

    public InnerClassList(int i) {
        super(i);
    }

    public Item get(int i) {
        return (Item) get0(i);
    }

    public void set(int i, CstType cstType, CstType cstType2, CstString cstString, int i2) {
        set0(i, new Item(cstType, cstType2, cstString, i2));
    }
}
