package com.android.dx.dex.file;

import bsh.C2633;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IndexedItem extends Item {
    private int index = -1;

    public final int getIndex() {
        int i = this.index;
        if (i >= 0) {
            return i;
        }
        C2633.m5339("index not yet set");
        return 0;
    }

    public final boolean hasIndex() {
        return this.index >= 0;
    }

    public final String indexString() {
        return "[" + Integer.toHexString(this.index) + ']';
    }

    public final void setIndex(int i) {
        if (this.index == -1) {
            this.index = i;
        } else {
            C2633.m5339("index already set");
        }
    }
}
