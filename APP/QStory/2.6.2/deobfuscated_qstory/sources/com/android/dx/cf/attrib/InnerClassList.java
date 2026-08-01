package com.android.dx.cf.attrib;

import bsh.C2632;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.util.FixedSizeList;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class InnerClassList extends FixedSizeList {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class Item {
        private final int accessFlags;
        private final CstType innerClass;
        private final CstString innerName;
        private final CstType outerClass;

        public Item(CstType cstType, CstType cstType2, CstString cstString, int i) {
            if (cstType == null) {
                C2632.m5298("innerClass == null");
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
