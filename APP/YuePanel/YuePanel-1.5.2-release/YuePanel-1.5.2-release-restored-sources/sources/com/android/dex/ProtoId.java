package com.android.dex;

import com.android.dex.Dex;
import com.android.dex.util.Unsigned;

/* JADX INFO: loaded from: classes.dex */
public final class ProtoId implements Comparable<ProtoId> {
    private final Dex dex;
    private final int parametersOffset;
    private final int returnTypeIndex;
    private final int shortyIndex;

    public ProtoId(Dex dex, int i, int i2, int i3) {
        this.dex = dex;
        this.shortyIndex = i;
        this.returnTypeIndex = i2;
        this.parametersOffset = i3;
    }

    public int getParametersOffset() {
        return this.parametersOffset;
    }

    public int getReturnTypeIndex() {
        return this.returnTypeIndex;
    }

    public int getShortyIndex() {
        return this.shortyIndex;
    }

    public String toString() {
        if (this.dex == null) {
            return this.shortyIndex + " " + this.returnTypeIndex + " " + this.parametersOffset;
        }
        return this.dex.strings().get(this.shortyIndex) + ": " + this.dex.typeNames().get(this.returnTypeIndex) + " " + this.dex.readTypeList(this.parametersOffset);
    }

    public void writeTo(Dex.Section section) {
        section.writeInt(this.shortyIndex);
        section.writeInt(this.returnTypeIndex);
        section.writeInt(this.parametersOffset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(ProtoId protoId) {
        int i = this.returnTypeIndex;
        int i2 = protoId.returnTypeIndex;
        return i != i2 ? Unsigned.compare(i, i2) : Unsigned.compare(this.parametersOffset, protoId.parametersOffset);
    }
}
