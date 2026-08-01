package com.android.dx.dex.file;

import androidx.profileinstaller.AbstractC2442;
import bsh.C2633;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstString;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class StringIdsSection extends UniformItemSection {
    private final TreeMap<CstString, StringIdItem> strings;

    public StringIdsSection(DexFile dexFile) {
        super("string_ids", dexFile, 4);
        this.strings = new TreeMap<>();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant == null) {
            C2633.m5343("cst == null");
            return null;
        }
        throwIfNotPrepared();
        StringIdItem stringIdItem = this.strings.get((CstString) constant);
        if (stringIdItem != null) {
            return stringIdItem;
        }
        C5925.m11310("not found");
        return null;
    }

    public int indexOf(CstString cstString) {
        if (cstString == null) {
            C2633.m5343("string == null");
            return 0;
        }
        throwIfNotPrepared();
        StringIdItem stringIdItem = this.strings.get(cstString);
        if (stringIdItem != null) {
            return stringIdItem.getIndex();
        }
        C5925.m11310("not found");
        return 0;
    }

    public synchronized StringIdItem intern(StringIdItem stringIdItem) {
        if (stringIdItem == null) {
            throw new NullPointerException("string == null");
        }
        throwIfPrepared();
        CstString value = stringIdItem.getValue();
        StringIdItem stringIdItem2 = this.strings.get(value);
        if (stringIdItem2 != null) {
            return stringIdItem2;
        }
        this.strings.put(value, stringIdItem);
        return stringIdItem;
    }

    @Override // com.android.dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.strings.values();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
        Iterator<StringIdItem> it = this.strings.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().setIndex(i);
            i++;
        }
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.strings.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "string_ids_size: " + Hex.u4(size));
            AbstractC2442.m4563(fileOffset, new StringBuilder("string_ids_off:  "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }

    public StringIdItem intern(CstString cstString) {
        return intern(new StringIdItem(cstString));
    }

    public StringIdItem intern(String str) {
        return intern(new StringIdItem(new CstString(str)));
    }

    public synchronized void intern(CstNat cstNat) {
        intern(cstNat.getName());
        intern(cstNat.getDescriptor());
    }
}
