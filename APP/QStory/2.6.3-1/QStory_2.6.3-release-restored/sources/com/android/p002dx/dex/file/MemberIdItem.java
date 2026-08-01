package com.android.p002dx.dex.file;

import androidx.profileinstaller.AbstractC3275;
import com.android.p002dx.rop.cst.CstMemberRef;
import com.android.p002dx.rop.cst.CstNat;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.Hex;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class MemberIdItem extends IdItem {
    private final CstMemberRef cst;

    public MemberIdItem(CstMemberRef cstMemberRef) {
        super(cstMemberRef.getDefiningClass());
        this.cst = cstMemberRef;
    }

    @Override // com.android.p002dx.dex.file.IdItem, com.android.p002dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        super.addContents(dexFile);
        dexFile.getStringIds().intern(getRef().getNat().getName());
    }

    public final CstMemberRef getRef() {
        return this.cst;
    }

    public abstract int getTypoidIdx(DexFile dexFile);

    public abstract String getTypoidName();

    @Override // com.android.p002dx.dex.file.Item
    public int writeSize() {
        return 8;
    }

    @Override // com.android.p002dx.dex.file.Item
    public final void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        StringIdsSection stringIds = dexFile.getStringIds();
        CstNat nat = this.cst.getNat();
        int iIndexOf = typeIds.indexOf(getDefiningClass());
        int iIndexOf2 = stringIds.indexOf(nat.getName());
        int typoidIdx = getTypoidIdx(dexFile);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, indexString() + ' ' + this.cst.toHuman());
            StringBuilder sb = new StringBuilder("  class_idx: ");
            sb.append(Hex.m28u2(iIndexOf));
            annotatedOutput.annotate(2, sb.toString());
            annotatedOutput.annotate(2, String.format("  %-10s %s", getTypoidName() + ':', Hex.m28u2(typoidIdx)));
            AbstractC3275.m5123(iIndexOf2, new StringBuilder("  name_idx:  "), annotatedOutput, 4);
        }
        annotatedOutput.writeShort(iIndexOf);
        annotatedOutput.writeShort(typoidIdx);
        annotatedOutput.writeInt(iIndexOf2);
    }
}
