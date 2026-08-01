package com.android.p002dx.dex.file;

import bsh.C3466;
import com.android.p002dx.util.AnnotatedOutput;
import java.util.Collection;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Section {
    private final int alignment;
    private final DexFile file;
    private int fileOffset;
    private final String name;
    private boolean prepared;

    public Section(String str, DexFile dexFile, int i) {
        if (dexFile == null) {
            C3466.m5903("file == null");
            throw null;
        }
        validateAlignment(i);
        this.name = str;
        this.file = dexFile;
        this.alignment = i;
        this.fileOffset = -1;
        this.prepared = false;
    }

    public static void validateAlignment(int i) {
        if (i <= 0 || (i & (i - 1)) != 0) {
            C6755.m11869("invalid alignment");
        }
    }

    public final void align(AnnotatedOutput annotatedOutput) {
        annotatedOutput.alignTo(this.alignment);
    }

    public abstract int getAbsoluteItemOffset(Item item);

    public final int getAbsoluteOffset(int i) {
        if (i < 0) {
            C6755.m11869("relative < 0");
            return 0;
        }
        int i2 = this.fileOffset;
        if (i2 >= 0) {
            return i2 + i;
        }
        C3466.m5899("fileOffset not yet set");
        return 0;
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final DexFile getFile() {
        return this.file;
    }

    public final int getFileOffset() {
        int i = this.fileOffset;
        if (i >= 0) {
            return i;
        }
        C3466.m5899("fileOffset not set");
        return 0;
    }

    public final String getName() {
        return this.name;
    }

    public abstract Collection<? extends Item> items();

    public final void prepare() {
        throwIfPrepared();
        prepare0();
        this.prepared = true;
    }

    public abstract void prepare0();

    public final int setFileOffset(int i) {
        if (i < 0) {
            C6755.m11869("fileOffset < 0");
            return 0;
        }
        if (this.fileOffset >= 0) {
            C3466.m5899("fileOffset already set");
            return 0;
        }
        int i2 = this.alignment - 1;
        int i3 = (i + i2) & (~i2);
        this.fileOffset = i3;
        return i3;
    }

    public final void throwIfNotPrepared() {
        if (this.prepared) {
            return;
        }
        C3466.m5899("not prepared");
    }

    public final void throwIfPrepared() {
        if (this.prepared) {
            C3466.m5899("already prepared");
        }
    }

    public abstract int writeSize();

    public final void writeTo(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        align(annotatedOutput);
        int cursor = annotatedOutput.getCursor();
        int i = this.fileOffset;
        if (i < 0) {
            this.fileOffset = cursor;
        } else if (i != cursor) {
            StringBuilder sb = new StringBuilder("alignment mismatch: for ");
            sb.append(this);
            int i2 = this.fileOffset;
            sb.append(", at ");
            sb.append(cursor);
            sb.append(", but expected ");
            sb.append(i2);
            throw new RuntimeException(sb.toString());
        }
        if (annotatedOutput.annotates()) {
            if (this.name != null) {
                annotatedOutput.annotate(0, "\n" + this.name + ":");
            } else if (cursor != 0) {
                annotatedOutput.annotate(0, "\n");
            }
        }
        writeTo0(annotatedOutput);
    }

    public abstract void writeTo0(AnnotatedOutput annotatedOutput);
}
