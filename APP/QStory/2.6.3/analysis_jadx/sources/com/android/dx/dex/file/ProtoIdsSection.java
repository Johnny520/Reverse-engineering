package com.android.dx.dex.file;

import androidx.profileinstaller.AbstractC2442;
import bsh.C2633;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstProtoRef;
import com.android.dx.rop.type.Prototype;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ProtoIdsSection extends UniformItemSection {
    private final TreeMap<Prototype, ProtoIdItem> protoIds;

    public ProtoIdsSection(DexFile dexFile) {
        super("proto_ids", dexFile, 4);
        this.protoIds = new TreeMap<>();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant == null) {
            C2633.m5343("cst == null");
            return null;
        }
        if (!(constant instanceof CstProtoRef)) {
            C5925.m11310("cst not instance of CstProtoRef");
            return null;
        }
        throwIfNotPrepared();
        ProtoIdItem protoIdItem = this.protoIds.get(((CstProtoRef) constant).getPrototype());
        if (protoIdItem != null) {
            return protoIdItem;
        }
        C5925.m11310("not found");
        return null;
    }

    public int indexOf(Prototype prototype) {
        if (prototype == null) {
            C2633.m5343("prototype == null");
            return 0;
        }
        throwIfNotPrepared();
        ProtoIdItem protoIdItem = this.protoIds.get(prototype);
        if (protoIdItem != null) {
            return protoIdItem.getIndex();
        }
        C5925.m11310("not found");
        return 0;
    }

    public synchronized ProtoIdItem intern(Prototype prototype) {
        ProtoIdItem protoIdItem;
        if (prototype == null) {
            throw new NullPointerException("prototype == null");
        }
        throwIfPrepared();
        protoIdItem = this.protoIds.get(prototype);
        if (protoIdItem == null) {
            protoIdItem = new ProtoIdItem(prototype);
            this.protoIds.put(prototype, protoIdItem);
        }
        return protoIdItem;
    }

    @Override // com.android.dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.protoIds.values();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
        Iterator<? extends Item> it = items().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((ProtoIdItem) it.next()).setIndex(i);
            i++;
        }
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.protoIds.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (size > 65536) {
            C5925.m11308("too many proto ids");
            return;
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "proto_ids_size:  " + Hex.u4(size));
            AbstractC2442.m4563(fileOffset, new StringBuilder("proto_ids_off:   "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }
}
