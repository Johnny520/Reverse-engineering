package com.android.dx.dex.code;

import bsh.C2633;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstType;
import com.android.dx.util.FixedSizeList;
import com.android.dx.util.Hex;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CatchHandlerList extends FixedSizeList implements Comparable<CatchHandlerList> {
    public static final CatchHandlerList EMPTY = new CatchHandlerList(0);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Entry implements Comparable<Entry> {
        private final CstType exceptionType;
        private final int handler;

        public Entry(CstType cstType, int i) {
            if (i < 0) {
                C5925.m11310("handler < 0");
                throw null;
            }
            if (cstType == null) {
                C2633.m5343("exceptionType == null");
                throw null;
            }
            this.handler = i;
            this.exceptionType = cstType;
        }

        @Override // java.lang.Comparable
        public int compareTo(Entry entry) {
            int i = this.handler;
            int i2 = entry.handler;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return this.exceptionType.compareTo((Constant) entry.exceptionType);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Entry) && compareTo((Entry) obj) == 0;
        }

        public CstType getExceptionType() {
            return this.exceptionType;
        }

        public int getHandler() {
            return this.handler;
        }

        public int hashCode() {
            return this.exceptionType.hashCode() + (this.handler * 31);
        }
    }

    public CatchHandlerList(int i) {
        super(i);
    }

    public boolean catchesAll() {
        int size = size();
        if (size == 0) {
            return false;
        }
        return get(size - 1).getExceptionType().equals(CstType.OBJECT);
    }

    @Override // java.lang.Comparable
    public int compareTo(CatchHandlerList catchHandlerList) {
        if (this == catchHandlerList) {
            return 0;
        }
        int size = size();
        int size2 = catchHandlerList.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = get(i).compareTo(catchHandlerList.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public Entry get(int i) {
        return (Entry) get0(i);
    }

    public void set(int i, CstType cstType, int i2) {
        set0(i, new Entry(cstType, i2));
    }

    public String toHuman(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int size = size();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < size; i++) {
            Entry entry = get(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i == size - 1 && catchesAll()) {
                sb.append("<any>");
            } else {
                sb.append(entry.getExceptionType().toHuman());
            }
            sb.append(" -> ");
            sb.append(Hex.u2or4(entry.getHandler()));
        }
        return sb.toString();
    }

    public void set(int i, Entry entry) {
        set0(i, entry);
    }

    @Override // com.android.dx.util.FixedSizeList, com.android.dx.util.ToHuman
    public String toHuman() {
        return toHuman("", "");
    }
}
