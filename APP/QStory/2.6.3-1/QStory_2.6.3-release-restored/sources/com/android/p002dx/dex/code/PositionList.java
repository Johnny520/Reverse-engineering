package com.android.p002dx.dex.code;

import bsh.C3466;
import com.android.p002dx.rop.code.SourcePosition;
import com.android.p002dx.util.FixedSizeList;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class PositionList extends FixedSizeList {
    public static final PositionList EMPTY = new PositionList(0);
    public static final int IMPORTANT = 3;
    public static final int LINES = 2;
    public static final int NONE = 1;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Entry {
        private final int address;
        private final SourcePosition position;

        public Entry(int i, SourcePosition sourcePosition) {
            if (i < 0) {
                C6755.m11869("address < 0");
                throw null;
            }
            if (sourcePosition == null) {
                C3466.m5903("position == null");
                throw null;
            }
            this.address = i;
            this.position = sourcePosition;
        }

        public int getAddress() {
            return this.address;
        }

        public SourcePosition getPosition() {
            return this.position;
        }
    }

    public PositionList(int i) {
        super(i);
    }

    public static PositionList make(DalvInsnList dalvInsnList, int i) {
        if (i == 1) {
            return EMPTY;
        }
        if (i != 2 && i != 3) {
            C6755.m11869("bogus howMuch");
            return null;
        }
        SourcePosition sourcePosition = SourcePosition.NO_INFO;
        int size = dalvInsnList.size();
        Entry[] entryArr = new Entry[size];
        SourcePosition sourcePosition2 = sourcePosition;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            DalvInsn dalvInsn = dalvInsnList.get(i3);
            if (dalvInsn instanceof CodeAddress) {
                z = true;
            } else {
                SourcePosition position = dalvInsn.getPosition();
                if (!position.equals(sourcePosition) && !position.sameLine(sourcePosition2) && (i != 3 || z)) {
                    entryArr[i2] = new Entry(dalvInsn.getAddress(), position);
                    i2++;
                    z = false;
                    sourcePosition2 = position;
                }
            }
        }
        PositionList positionList = new PositionList(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            positionList.set(i4, entryArr[i4]);
        }
        positionList.setImmutable();
        return positionList;
    }

    public Entry get(int i) {
        return (Entry) get0(i);
    }

    public void set(int i, Entry entry) {
        set0(i, entry);
    }
}
