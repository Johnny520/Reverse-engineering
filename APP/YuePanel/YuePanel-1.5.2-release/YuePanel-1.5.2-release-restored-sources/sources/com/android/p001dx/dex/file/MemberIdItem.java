package com.android.p001dx.dex.file;

import com.android.p001dx.rop.cst.CstMemberRef;
import com.android.p001dx.rop.cst.CstNat;
import com.android.p001dx.util.AnnotatedOutput;
import com.android.p001dx.util.Hex;

/* JADX INFO: loaded from: classes.dex */
public abstract class MemberIdItem extends IdItem {
    private final CstMemberRef cst;

    public MemberIdItem(CstMemberRef cstMemberRef) {
        super(cstMemberRef.getDefiningClass());
        this.cst = cstMemberRef;
    }

    @Override // com.android.p001dx.dex.file.IdItem, com.android.p001dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        super.addContents(dexFile);
        dexFile.getStringIds().intern(getRef().getNat().getName());
    }

    public final CstMemberRef getRef() {
        return this.cst;
    }

    public abstract int getTypoidIdx(DexFile dexFile);

    public abstract String getTypoidName();

    @Override // com.android.p001dx.dex.file.Item
    public int writeSize() {
        return 8;
    }

    @Override // com.android.p001dx.dex.file.Item
    public final void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        StringIdsSection stringIds = dexFile.getStringIds();
        CstNat nat = this.cst.getNat();
        int iIndexOf = typeIds.indexOf(getDefiningClass());
        int iIndexOf2 = stringIds.indexOf(nat.getName());
        int typoidIdx = getTypoidIdx(dexFile);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, indexString() + ' ' + this.cst.toHuman());
            StringBuilder sb = new StringBuilder();
            sb.append("  class_idx: ");
            sb.append(Hex.m5035u2(iIndexOf));
            annotatedOutput.annotate(2, sb.toString());
            annotatedOutput.annotate(2, String.format("  %-10s %s", getTypoidName() + ':', Hex.m5035u2(typoidIdx)));
            annotatedOutput.annotate(4, "  name_idx:  " + Hex.m5037u4(iIndexOf2));
        }
        annotatedOutput.writeShort(iIndexOf);
        annotatedOutput.writeShort(typoidIdx);
        annotatedOutput.writeInt(iIndexOf2);
    }
}
