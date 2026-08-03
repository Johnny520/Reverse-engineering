package com.android.dex;

import com.android.dex.Dex;
import com.android.dex.util.Unsigned;

/* JADX INFO: loaded from: classes.dex */
public class CallSiteId implements Comparable<CallSiteId> {
    private final Dex dex;
    private final int offset;

    public CallSiteId(Dex dex, int i) {
        this.dex = dex;
        this.offset = i;
    }

    public int getCallSiteOffset() {
        return this.offset;
    }

    public String toString() {
        Dex dex = this.dex;
        return dex == null ? String.valueOf(this.offset) : dex.protoIds().get(this.offset).toString();
    }

    public void writeTo(Dex.Section section) {
        section.writeInt(this.offset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(CallSiteId callSiteId) {
        return Unsigned.compare(this.offset, callSiteId.offset);
    }
}
