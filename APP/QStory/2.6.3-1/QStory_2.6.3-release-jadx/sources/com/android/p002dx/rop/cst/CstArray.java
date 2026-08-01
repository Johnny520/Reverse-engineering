package com.android.p002dx.rop.cst;

import bsh.C3466;
import com.android.p002dx.util.FixedSizeList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CstArray extends Constant {
    private final List list;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class List extends FixedSizeList implements Comparable<List> {
        public List(int i) {
            super(i);
        }

        @Override // java.lang.Comparable
        public int compareTo(List list) {
            int size = size();
            int size2 = list.size();
            int i = size < size2 ? size : size2;
            for (int i2 = 0; i2 < i; i2++) {
                int iCompareTo = ((Constant) get0(i2)).compareTo((Constant) list.get0(i2));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            if (size < size2) {
                return -1;
            }
            return size > size2 ? 1 : 0;
        }

        public Constant get(int i) {
            return (Constant) get0(i);
        }

        public void set(int i, Constant constant) {
            set0(i, constant);
        }
    }

    public CstArray(List list) {
        if (list == null) {
            C3466.m5903("list == null");
            throw null;
        }
        list.throwIfMutable();
        this.list = list;
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public int compareTo0(Constant constant) {
        return this.list.compareTo(((CstArray) constant).list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CstArray) {
            return this.list.equals(((CstArray) obj).list);
        }
        return false;
    }

    public List getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return this.list.toHuman("{", ", ", "}");
    }

    public String toString() {
        return this.list.toString("array{", ", ", "}");
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public String typeName() {
        return "array";
    }
}
