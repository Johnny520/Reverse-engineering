package com.android.dx.merge;

import androidx.activity.AbstractC0053;
import com.android.dex.DexException;
import java.util.Comparator;
import p292.C8548;
import p292.C8556;
import p292.C8566;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class SortableType {
    public static final Comparator<SortableType> NULLS_LAST_ORDER = new Comparator<SortableType>() { // from class: com.android.dx.merge.SortableType.1
        @Override // java.util.Comparator
        public int compare(SortableType sortableType, SortableType sortableType2) {
            int typeIndex;
            int typeIndex2;
            if (sortableType == sortableType2) {
                return 0;
            }
            if (sortableType2 == null) {
                return -1;
            }
            if (sortableType == null) {
                return 1;
            }
            if (sortableType.depth != sortableType2.depth) {
                typeIndex = sortableType.depth;
                typeIndex2 = sortableType2.depth;
            } else {
                typeIndex = sortableType.getTypeIndex();
                typeIndex2 = sortableType2.getTypeIndex();
            }
            return typeIndex - typeIndex2;
        }
    };
    private final C8548 classDef;
    private int depth = -1;
    private final C8566 dex;
    private final IndexMap indexMap;

    public SortableType(C8566 c8566, IndexMap indexMap, C8548 c8548) {
        this.dex = c8566;
        this.indexMap = indexMap;
        this.classDef = c8548;
    }

    public C8548 getClassDef() {
        return this.classDef;
    }

    public C8566 getDex() {
        return this.dex;
    }

    public IndexMap getIndexMap() {
        return this.indexMap;
    }

    public int getTypeIndex() {
        return this.classDef.f23803;
    }

    public boolean isDepthAssigned() {
        return this.depth != -1;
    }

    public boolean tryAssignDepth(SortableType[] sortableTypeArr) {
        int iMax;
        C8556 c8556M14103;
        C8548 c8548 = this.classDef;
        int i = c8548.f23801;
        if (i == -1) {
            iMax = 0;
        } else {
            if (i == c8548.f23803) {
                throw new DexException(AbstractC0053.m147(new StringBuilder("Class with type index "), " extends itself", this.classDef.f23803));
            }
            SortableType sortableType = sortableTypeArr[i];
            if (sortableType != null) {
                iMax = sortableType.depth;
                if (iMax != -1) {
                }
                return false;
            }
            iMax = 1;
        }
        C8566 c8566 = c8548.f23805;
        int i2 = c8548.f23800;
        if (i2 == 0) {
            c8566.getClass();
            c8556M14103 = C8556.f23857;
        } else {
            c8556M14103 = c8566.m14114(i2).m14103();
        }
        for (short s : c8556M14103.f23858) {
            SortableType sortableType2 = sortableTypeArr[s];
            if (sortableType2 == null) {
                iMax = Math.max(iMax, 1);
            } else {
                int i3 = sortableType2.depth;
                if (i3 == -1) {
                    return false;
                }
                iMax = Math.max(iMax, i3);
            }
        }
        this.depth = iMax + 1;
        return true;
    }
}
