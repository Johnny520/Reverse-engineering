package com.android.dx.merge;

import androidx.activity.AbstractC0053;
import com.android.dex.DexException;
import java.util.Comparator;
import p292.C8540;
import p292.C8548;
import p292.C8558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
    private final C8540 classDef;
    private int depth = -1;
    private final C8558 dex;
    private final IndexMap indexMap;

    public SortableType(C8558 c8558, IndexMap indexMap, C8540 c8540) {
        this.dex = c8558;
        this.indexMap = indexMap;
        this.classDef = c8540;
    }

    public C8540 getClassDef() {
        return this.classDef;
    }

    public C8558 getDex() {
        return this.dex;
    }

    public IndexMap getIndexMap() {
        return this.indexMap;
    }

    public int getTypeIndex() {
        return this.classDef.f23794;
    }

    public boolean isDepthAssigned() {
        return this.depth != -1;
    }

    public boolean tryAssignDepth(SortableType[] sortableTypeArr) {
        int iMax;
        C8548 c8548M14122;
        C8540 c8540 = this.classDef;
        int i = c8540.f23792;
        if (i == -1) {
            iMax = 0;
        } else {
            if (i == c8540.f23794) {
                throw new DexException(AbstractC0053.m147(new StringBuilder("Class with type index "), " extends itself", this.classDef.f23794));
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
        C8558 c8558 = c8540.f23796;
        int i2 = c8540.f23791;
        if (i2 == 0) {
            c8558.getClass();
            c8548M14122 = C8548.f23848;
        } else {
            c8548M14122 = c8558.m14133(i2).m14122();
        }
        for (short s : c8548M14122.f23849) {
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
