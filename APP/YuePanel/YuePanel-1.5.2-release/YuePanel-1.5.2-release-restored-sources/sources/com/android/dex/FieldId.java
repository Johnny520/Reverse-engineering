package com.android.dex;

import com.android.dex.Dex;
import com.android.dex.util.Unsigned;

/* JADX INFO: loaded from: classes.dex */
public final class FieldId implements Comparable<FieldId> {
    private final int declaringClassIndex;
    private final Dex dex;
    private final int nameIndex;
    private final int typeIndex;

    public FieldId(Dex dex, int i, int i2, int i3) {
        this.dex = dex;
        this.declaringClassIndex = i;
        this.typeIndex = i2;
        this.nameIndex = i3;
    }

    public int getDeclaringClassIndex() {
        return this.declaringClassIndex;
    }

    public int getNameIndex() {
        return this.nameIndex;
    }

    public int getTypeIndex() {
        return this.typeIndex;
    }

    public String toString() {
        if (this.dex != null) {
            return this.dex.typeNames().get(this.typeIndex) + "." + this.dex.strings().get(this.nameIndex);
        }
        return this.declaringClassIndex + " " + this.typeIndex + " " + this.nameIndex;
    }

    public void writeTo(Dex.Section section) {
        section.writeUnsignedShort(this.declaringClassIndex);
        section.writeUnsignedShort(this.typeIndex);
        section.writeInt(this.nameIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(FieldId fieldId) {
        int i = this.declaringClassIndex;
        int i2 = fieldId.declaringClassIndex;
        if (i != i2) {
            return Unsigned.compare(i, i2);
        }
        int i3 = this.nameIndex;
        int i4 = fieldId.nameIndex;
        return i3 != i4 ? Unsigned.compare(i3, i4) : Unsigned.compare(this.typeIndex, fieldId.typeIndex);
    }
}
