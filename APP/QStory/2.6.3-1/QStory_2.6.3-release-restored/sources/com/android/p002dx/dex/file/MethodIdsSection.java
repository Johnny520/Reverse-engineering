package com.android.p002dx.dex.file;

import androidx.profileinstaller.AbstractC3275;
import bsh.C3466;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstBaseMethodRef;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.Hex;
import java.util.Collection;
import java.util.TreeMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodIdsSection extends MemberIdsSection {
    private final TreeMap<CstBaseMethodRef, MethodIdItem> methodIds;

    public MethodIdsSection(DexFile dexFile) {
        super("method_ids", dexFile);
        this.methodIds = new TreeMap<>();
    }

    @Override // com.android.p002dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant == null) {
            C3466.m5903("cst == null");
            return null;
        }
        throwIfNotPrepared();
        MethodIdItem methodIdItem = this.methodIds.get((CstBaseMethodRef) constant);
        if (methodIdItem != null) {
            return methodIdItem;
        }
        C6755.m11869("not found");
        return null;
    }

    public int indexOf(CstBaseMethodRef cstBaseMethodRef) {
        if (cstBaseMethodRef == null) {
            C3466.m5903("ref == null");
            return 0;
        }
        throwIfNotPrepared();
        MethodIdItem methodIdItem = this.methodIds.get(cstBaseMethodRef);
        if (methodIdItem != null) {
            return methodIdItem.getIndex();
        }
        C6755.m11869("not found");
        return 0;
    }

    public synchronized MethodIdItem intern(CstBaseMethodRef cstBaseMethodRef) {
        MethodIdItem methodIdItem;
        if (cstBaseMethodRef == null) {
            throw new NullPointerException("method == null");
        }
        throwIfPrepared();
        methodIdItem = this.methodIds.get(cstBaseMethodRef);
        if (methodIdItem == null) {
            methodIdItem = new MethodIdItem(cstBaseMethodRef);
            this.methodIds.put(cstBaseMethodRef, methodIdItem);
        }
        return methodIdItem;
    }

    @Override // com.android.p002dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.methodIds.values();
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.methodIds.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "method_ids_size: " + Hex.m30u4(size));
            AbstractC3275.m5123(fileOffset, new StringBuilder("method_ids_off:  "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }
}
