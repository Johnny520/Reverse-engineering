package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public abstract class IndexedItem extends com.android.dx.dex.file.Item {
    private int index;

    public IndexedItem() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.index = r0
            return
    }

    public final int getIndex() {
            r2 = this;
            int r0 = r2.index
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "index not yet set"
            r0.<init>(r1)
            throw r0
    }

    public final boolean hasIndex() {
            r1 = this;
            int r0 = r1.index
            if (r0 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final java.lang.String indexString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r2.index
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void setIndex(int r3) {
            r2 = this;
            int r0 = r2.index
            r1 = -1
            if (r0 != r1) goto L8
            r2.index = r3
            return
        L8:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "index already set"
            r3.<init>(r0)
            throw r3
    }
}
