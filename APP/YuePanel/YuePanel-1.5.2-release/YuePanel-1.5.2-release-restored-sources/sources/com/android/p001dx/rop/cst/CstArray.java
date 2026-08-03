package com.android.p001dx.rop.cst;

import com.android.p001dx.util.FixedSizeList;

/* JADX INFO: loaded from: classes.dex */
public class CstArray extends Constant {
    private final List list;

    public static final class List extends FixedSizeList implements Comparable<List> {
        public List(int i) {
            super(i);
        }

        public Constant get(int i) {
            return (Constant) get0(i);
        }

        public void set(int i, Constant constant) {
            set0(i, constant);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
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
    }

    public CstArray(List list) {
        if (list == null) {
            throw new NullPointerException("list == null");
        }
        list.throwIfMutable();
        this.list = list;
    }

    @Override // com.android.p001dx.rop.cst.Constant
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

    @Override // com.android.p001dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return this.list.toHuman("{", ", ", "}");
    }

    public String toString() {
        return this.list.toString("array{", ", ", "}");
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "array";
    }
}
