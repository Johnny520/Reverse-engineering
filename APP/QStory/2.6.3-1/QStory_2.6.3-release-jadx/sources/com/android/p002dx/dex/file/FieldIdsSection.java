package com.android.p002dx.dex.file;

import androidx.profileinstaller.AbstractC3275;
import bsh.C3466;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstFieldRef;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.Hex;
import java.util.Collection;
import java.util.TreeMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldIdsSection extends MemberIdsSection {
    private final TreeMap<CstFieldRef, FieldIdItem> fieldIds;

    public FieldIdsSection(DexFile dexFile) {
        super("field_ids", dexFile);
        this.fieldIds = new TreeMap<>();
    }

    @Override // com.android.p002dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant == null) {
            C3466.m5903("cst == null");
            return null;
        }
        throwIfNotPrepared();
        FieldIdItem fieldIdItem = this.fieldIds.get((CstFieldRef) constant);
        if (fieldIdItem != null) {
            return fieldIdItem;
        }
        C6755.m11869("not found");
        return null;
    }

    public int indexOf(CstFieldRef cstFieldRef) {
        if (cstFieldRef == null) {
            C3466.m5903("ref == null");
            return 0;
        }
        throwIfNotPrepared();
        FieldIdItem fieldIdItem = this.fieldIds.get(cstFieldRef);
        if (fieldIdItem != null) {
            return fieldIdItem.getIndex();
        }
        C6755.m11869("not found");
        return 0;
    }

    public synchronized FieldIdItem intern(CstFieldRef cstFieldRef) {
        FieldIdItem fieldIdItem;
        if (cstFieldRef == null) {
            throw new NullPointerException("field == null");
        }
        throwIfPrepared();
        fieldIdItem = this.fieldIds.get(cstFieldRef);
        if (fieldIdItem == null) {
            fieldIdItem = new FieldIdItem(cstFieldRef);
            this.fieldIds.put(cstFieldRef, fieldIdItem);
        }
        return fieldIdItem;
    }

    @Override // com.android.p002dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.fieldIds.values();
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.fieldIds.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "field_ids_size:  " + Hex.m30u4(size));
            AbstractC3275.m5123(fileOffset, new StringBuilder("field_ids_off:   "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }
}
