package com.android.p002dx.dex.file;

import androidx.profileinstaller.AbstractC3275;
import bsh.C3466;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstType;
import com.android.p002dx.rop.type.Type;
import com.android.p002dx.rop.type.TypeList;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.Hex;
import com.google.protobuf.C4515;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassDefsSection extends UniformItemSection {
    private final TreeMap<Type, ClassDefItem> classDefs;
    private ArrayList<ClassDefItem> orderedDefs;

    public ClassDefsSection(DexFile dexFile) {
        super("class_defs", dexFile, 4);
        this.classDefs = new TreeMap<>();
        this.orderedDefs = null;
    }

    private int orderItems0(Type type, int i, int i2) {
        ClassDefItem classDefItem = this.classDefs.get(type);
        if (classDefItem == null || classDefItem.hasIndex()) {
            return i;
        }
        if (i2 < 0) {
            C4515.m8484(type, "class circularity with ");
            return 0;
        }
        int i3 = i2 - 1;
        CstType superclass = classDefItem.getSuperclass();
        if (superclass != null) {
            i = orderItems0(superclass.getClassType(), i, i3);
        }
        TypeList interfaces = classDefItem.getInterfaces();
        int size = interfaces.size();
        for (int i4 = 0; i4 < size; i4++) {
            i = orderItems0(interfaces.getType(i4), i, i3);
        }
        classDefItem.setIndex(i);
        this.orderedDefs.add(classDefItem);
        return i + 1;
    }

    public void add(ClassDefItem classDefItem) {
        try {
            Type classType = classDefItem.getThisClass().getClassType();
            throwIfPrepared();
            if (this.classDefs.get(classType) == null) {
                this.classDefs.put(classType, classDefItem);
            } else {
                C5043.m9163(classType, "already added: ");
            }
        } catch (NullPointerException unused) {
            C3466.m5903("clazz == null");
        }
    }

    @Override // com.android.p002dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant == null) {
            C3466.m5903("cst == null");
            return null;
        }
        throwIfNotPrepared();
        ClassDefItem classDefItem = this.classDefs.get(((CstType) constant).getClassType());
        if (classDefItem != null) {
            return classDefItem;
        }
        C6755.m11869("not found");
        return null;
    }

    @Override // com.android.p002dx.dex.file.Section
    public Collection<? extends Item> items() {
        ArrayList<ClassDefItem> arrayList = this.orderedDefs;
        return arrayList != null ? arrayList : this.classDefs.values();
    }

    @Override // com.android.p002dx.dex.file.UniformItemSection
    public void orderItems() {
        int size = this.classDefs.size();
        this.orderedDefs = new ArrayList<>(size);
        Iterator<Type> it = this.classDefs.keySet().iterator();
        int iOrderItems0 = 0;
        while (it.hasNext()) {
            iOrderItems0 = orderItems0(it.next(), iOrderItems0, size - iOrderItems0);
        }
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.classDefs.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "class_defs_size: " + Hex.m30u4(size));
            AbstractC3275.m5123(fileOffset, new StringBuilder("class_defs_off:  "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }
}
