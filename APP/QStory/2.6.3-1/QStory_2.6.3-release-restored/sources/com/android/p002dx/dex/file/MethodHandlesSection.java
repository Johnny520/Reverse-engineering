package com.android.p002dx.dex.file;

import bsh.C3466;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstMethodHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodHandlesSection extends UniformItemSection {
    private final TreeMap<CstMethodHandle, MethodHandleItem> methodHandles;

    public MethodHandlesSection(DexFile dexFile) {
        super("method_handles", dexFile, 8);
        this.methodHandles = new TreeMap<>();
    }

    @Override // com.android.p002dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant == null) {
            C3466.m5903("cst == null");
            return null;
        }
        throwIfNotPrepared();
        MethodHandleItem methodHandleItem = this.methodHandles.get((CstMethodHandle) constant);
        if (methodHandleItem != null) {
            return methodHandleItem;
        }
        C6755.m11869("not found");
        return null;
    }

    public int indexOf(CstMethodHandle cstMethodHandle) {
        return this.methodHandles.get(cstMethodHandle).getIndex();
    }

    public synchronized void intern(CstMethodHandle cstMethodHandle) {
        if (cstMethodHandle == null) {
            throw new NullPointerException("methodHandle == null");
        }
        throwIfPrepared();
        if (this.methodHandles.get(cstMethodHandle) == null) {
            this.methodHandles.put(cstMethodHandle, new MethodHandleItem(cstMethodHandle));
        }
    }

    @Override // com.android.p002dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.methodHandles.values();
    }

    @Override // com.android.p002dx.dex.file.UniformItemSection
    public void orderItems() {
        Iterator<MethodHandleItem> it = this.methodHandles.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().setIndex(i);
            i++;
        }
    }
}
