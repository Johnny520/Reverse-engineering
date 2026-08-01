package com.android.p002dx.merge;

import androidx.activity.AbstractC0900;
import com.android.dex.DexException;
import java.util.Comparator;
import p308.C9369;
import p308.C9377;
import p308.C9387;

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
    private final C9369 classDef;
    private int depth = -1;
    private final C9387 dex;
    private final IndexMap indexMap;

    public SortableType(C9387 c9387, IndexMap indexMap, C9369 c9369) {
        this.dex = c9387;
        this.indexMap = indexMap;
        this.classDef = c9369;
    }

    public C9369 getClassDef() {
        return this.classDef;
    }

    public C9387 getDex() {
        return this.dex;
    }

    public IndexMap getIndexMap() {
        return this.indexMap;
    }

    public int getTypeIndex() {
        return this.classDef.f24139;
    }

    public boolean isDepthAssigned() {
        return this.depth != -1;
    }

    public boolean tryAssignDepth(SortableType[] sortableTypeArr) {
        int iMax;
        C9377 c9377M14681;
        C9369 c9369 = this.classDef;
        int i = c9369.f24137;
        if (i == -1) {
            iMax = 0;
        } else {
            if (i == c9369.f24139) {
                throw new DexException(AbstractC0900.m707(new StringBuilder("Class with type index "), " extends itself", this.classDef.f24139));
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
        C9387 c9387 = c9369.f24141;
        int i2 = c9369.f24136;
        if (i2 == 0) {
            c9387.getClass();
            c9377M14681 = C9377.f24193;
        } else {
            c9377M14681 = c9387.m14692(i2).m14681();
        }
        for (short s : c9377M14681.f24194) {
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
