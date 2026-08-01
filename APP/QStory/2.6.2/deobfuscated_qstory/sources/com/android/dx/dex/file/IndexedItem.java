package com.android.dx.dex.file;

import bsh.C2632;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IndexedItem extends Item {
    private int index = -1;

    public final int getIndex() {
        int i = this.index;
        if (i >= 0) {
            return i;
        }
        C2632.m5294("index not yet set");
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
            C2632.m5294("index already set");
        }
    }
}
