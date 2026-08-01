package com.android.dx.dex.file;

import androidx.profileinstaller.AbstractC2442;
import bsh.C2632;
import com.android.dex.DexIndexOverflowException;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.Type;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import io.ktor.util.C4210;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class TypeIdsSection extends UniformItemSection {
    private final TreeMap<Type, TypeIdItem> typeIds;

    public TypeIdsSection(DexFile dexFile) {
        super("type_ids", dexFile, 4);
        this.typeIds = new TreeMap<>();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant == null) {
            C2632.m5298("cst == null");
            return null;
        }
        throwIfNotPrepared();
        TypeIdItem typeIdItem = this.typeIds.get(((CstType) constant).getClassType());
        if (typeIdItem != null) {
            return typeIdItem;
        }
        C4210.m8614(constant, "not found: ");
        return null;
    }

    public int indexOf(Type type) {
        if (type == null) {
            C2632.m5298("type == null");
            return 0;
        }
        throwIfNotPrepared();
        TypeIdItem typeIdItem = this.typeIds.get(type);
        if (typeIdItem != null) {
            return typeIdItem.getIndex();
        }
        C4210.m8614(type, "not found: ");
        return 0;
    }

    public synchronized TypeIdItem intern(Type type) {
        TypeIdItem typeIdItem;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        throwIfPrepared();
        typeIdItem = this.typeIds.get(type);
        if (typeIdItem == null) {
            typeIdItem = new TypeIdItem(new CstType(type));
            this.typeIds.put(type, typeIdItem);
        }
        return typeIdItem;
    }

    @Override // com.android.dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.typeIds.values();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
        Iterator<? extends Item> it = items().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((TypeIdItem) it.next()).setIndex(i);
            i++;
        }
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        int size = this.typeIds.size();
        int fileOffset = size == 0 ? 0 : getFileOffset();
        if (size > 65536) {
            throw new DexIndexOverflowException(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(items().size()), 65536));
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "type_ids_size:   " + Hex.u4(size));
            AbstractC2442.m4552(fileOffset, new StringBuilder("type_ids_off:    "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }

    public int indexOf(CstType cstType) {
        if (cstType != null) {
            return indexOf(cstType.getClassType());
        }
        C2632.m5298("type == null");
        return 0;
    }

    public synchronized TypeIdItem intern(CstType cstType) {
        TypeIdItem typeIdItem;
        if (cstType != null) {
            throwIfPrepared();
            Type classType = cstType.getClassType();
            typeIdItem = this.typeIds.get(classType);
            if (typeIdItem == null) {
                typeIdItem = new TypeIdItem(cstType);
                this.typeIds.put(classType, typeIdItem);
            }
        } else {
            throw new NullPointerException("type == null");
        }
        return typeIdItem;
    }
}
