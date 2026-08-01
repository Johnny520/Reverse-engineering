package com.android.p002dx.dex.file;

import bsh.C3466;
import com.android.p002dx.rop.code.AccessFlags;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstFieldRef;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.Hex;
import com.bumptech.glide.AbstractC3887;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodedField extends EncodedMember implements Comparable<EncodedField> {
    private final CstFieldRef field;

    public EncodedField(CstFieldRef cstFieldRef, int i) {
        super(i);
        if (cstFieldRef != null) {
            this.field = cstFieldRef;
        } else {
            C3466.m5903("field == null");
            throw null;
        }
    }

    @Override // com.android.p002dx.dex.file.EncodedMember
    public void addContents(DexFile dexFile) {
        dexFile.getFieldIds().intern(this.field);
    }

    @Override // java.lang.Comparable
    public int compareTo(EncodedField encodedField) {
        return this.field.compareTo((Constant) encodedField.field);
    }

    @Override // com.android.p002dx.dex.file.EncodedMember
    public void debugPrint(PrintWriter printWriter, boolean z) {
        printWriter.println(toString());
    }

    @Override // com.android.p002dx.dex.file.EncodedMember
    public int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i, int i2) {
        int iIndexOf = dexFile.getFieldIds().indexOf(this.field);
        int i3 = iIndexOf - i;
        int accessFlags = getAccessFlags();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, String.format("  [%x] %s", Integer.valueOf(i2), this.field.toHuman()));
            annotatedOutput.annotate(AbstractC3887.m7197(i3), "    field_idx:    " + Hex.m30u4(iIndexOf));
            annotatedOutput.annotate(AbstractC3887.m7197(accessFlags), "    access_flags: " + AccessFlags.fieldString(accessFlags));
        }
        annotatedOutput.writeUleb128(i3);
        annotatedOutput.writeUleb128(accessFlags);
        return iIndexOf;
    }

    public boolean equals(Object obj) {
        return (obj instanceof EncodedField) && compareTo((EncodedField) obj) == 0;
    }

    @Override // com.android.p002dx.dex.file.EncodedMember
    public CstString getName() {
        return this.field.getNat().getName();
    }

    public CstFieldRef getRef() {
        return this.field;
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return this.field.toHuman();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(EncodedField.class.getName());
        sb.append('{');
        sb.append(Hex.m28u2(getAccessFlags()));
        sb.append(' ');
        sb.append(this.field);
        sb.append('}');
        return sb.toString();
    }
}
