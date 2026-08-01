package com.android.dx.dex.file;

import bsh.C2632;
import com.android.dx.rop.code.AccessFlags;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstFieldRef;
import com.android.dx.rop.cst.CstString;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import com.bumptech.glide.AbstractC3065;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodedField extends EncodedMember implements Comparable<EncodedField> {
    private final CstFieldRef field;

    public EncodedField(CstFieldRef cstFieldRef, int i) {
        super(i);
        if (cstFieldRef != null) {
            this.field = cstFieldRef;
        } else {
            C2632.m5298("field == null");
            throw null;
        }
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public void addContents(DexFile dexFile) {
        dexFile.getFieldIds().intern(this.field);
    }

    @Override // java.lang.Comparable
    public int compareTo(EncodedField encodedField) {
        return this.field.compareTo((Constant) encodedField.field);
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public void debugPrint(PrintWriter printWriter, boolean z) {
        printWriter.println(toString());
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i, int i2) {
        int iIndexOf = dexFile.getFieldIds().indexOf(this.field);
        int i3 = iIndexOf - i;
        int accessFlags = getAccessFlags();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, String.format("  [%x] %s", Integer.valueOf(i2), this.field.toHuman()));
            annotatedOutput.annotate(AbstractC3065.m6847(i3), "    field_idx:    " + Hex.u4(iIndexOf));
            annotatedOutput.annotate(AbstractC3065.m6847(accessFlags), "    access_flags: " + AccessFlags.fieldString(accessFlags));
        }
        annotatedOutput.writeUleb128(i3);
        annotatedOutput.writeUleb128(accessFlags);
        return iIndexOf;
    }

    public boolean equals(Object obj) {
        return (obj instanceof EncodedField) && compareTo((EncodedField) obj) == 0;
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public CstString getName() {
        return this.field.getNat().getName();
    }

    public CstFieldRef getRef() {
        return this.field;
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return this.field.toHuman();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(EncodedField.class.getName());
        sb.append('{');
        sb.append(Hex.u2(getAccessFlags()));
        sb.append(' ');
        sb.append(this.field);
        sb.append('}');
        return sb.toString();
    }
}
