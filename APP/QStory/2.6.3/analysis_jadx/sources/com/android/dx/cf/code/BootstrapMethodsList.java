package com.android.dx.cf.code;

import bsh.C2633;
import com.android.dx.rop.cst.CstMethodHandle;
import com.android.dx.rop.cst.CstType;
import com.android.dx.util.FixedSizeList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BootstrapMethodsList extends FixedSizeList {
    public static final BootstrapMethodsList EMPTY = new BootstrapMethodsList(0);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Item {
        private final BootstrapMethodArgumentsList bootstrapMethodArgumentsList;
        private final CstMethodHandle bootstrapMethodHandle;
        private final CstType declaringClass;

        public Item(CstType cstType, CstMethodHandle cstMethodHandle, BootstrapMethodArgumentsList bootstrapMethodArgumentsList) {
            if (cstType == null) {
                C2633.m5343("declaringClass == null");
                throw null;
            }
            if (cstMethodHandle == null) {
                C2633.m5343("bootstrapMethodHandle == null");
                throw null;
            }
            if (bootstrapMethodArgumentsList == null) {
                C2633.m5343("bootstrapMethodArguments == null");
                throw null;
            }
            this.bootstrapMethodHandle = cstMethodHandle;
            this.bootstrapMethodArgumentsList = bootstrapMethodArgumentsList;
            this.declaringClass = cstType;
        }

        public BootstrapMethodArgumentsList getBootstrapMethodArguments() {
            return this.bootstrapMethodArgumentsList;
        }

        public CstMethodHandle getBootstrapMethodHandle() {
            return this.bootstrapMethodHandle;
        }

        public CstType getDeclaringClass() {
            return this.declaringClass;
        }
    }

    public BootstrapMethodsList(int i) {
        super(i);
    }

    public static BootstrapMethodsList concat(BootstrapMethodsList bootstrapMethodsList, BootstrapMethodsList bootstrapMethodsList2) {
        BootstrapMethodsList bootstrapMethodsList3 = EMPTY;
        if (bootstrapMethodsList == bootstrapMethodsList3) {
            return bootstrapMethodsList2;
        }
        if (bootstrapMethodsList2 == bootstrapMethodsList3) {
            return bootstrapMethodsList;
        }
        int size = bootstrapMethodsList.size();
        int size2 = bootstrapMethodsList2.size();
        BootstrapMethodsList bootstrapMethodsList4 = new BootstrapMethodsList(size + size2);
        for (int i = 0; i < size; i++) {
            bootstrapMethodsList4.set(i, bootstrapMethodsList.get(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            bootstrapMethodsList4.set(size + i2, bootstrapMethodsList2.get(i2));
        }
        return bootstrapMethodsList4;
    }

    public Item get(int i) {
        return (Item) get0(i);
    }

    public void set(int i, Item item) {
        if (item != null) {
            set0(i, item);
        } else {
            C2633.m5343("item == null");
        }
    }

    public void set(int i, CstType cstType, CstMethodHandle cstMethodHandle, BootstrapMethodArgumentsList bootstrapMethodArgumentsList) {
        set(i, new Item(cstType, cstMethodHandle, bootstrapMethodArgumentsList));
    }
}
