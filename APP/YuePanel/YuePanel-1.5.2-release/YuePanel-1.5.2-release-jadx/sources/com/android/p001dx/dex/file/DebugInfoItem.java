package com.android.p001dx.dex.file;

import com.android.dex.util.ExceptionWithContext;
import com.android.p001dx.dex.code.DalvCode;
import com.android.p001dx.dex.code.DalvInsnList;
import com.android.p001dx.dex.code.LocalList;
import com.android.p001dx.dex.code.PositionList;
import com.android.p001dx.rop.cst.CstMethodRef;
import com.android.p001dx.util.AnnotatedOutput;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class DebugInfoItem extends OffsettedItem {
    private static final int ALIGNMENT = 1;
    private static final boolean ENABLE_ENCODER_SELF_CHECK = false;
    private final DalvCode code;
    private byte[] encoded;
    private final boolean isStatic;
    private final CstMethodRef ref;

    public DebugInfoItem(DalvCode dalvCode, boolean z, CstMethodRef cstMethodRef) {
        super(1, -1);
        if (dalvCode == null) {
            throw new NullPointerException("code == null");
        }
        this.code = dalvCode;
        this.isStatic = z;
        this.ref = cstMethodRef;
    }

    private byte[] encode(DexFile dexFile, String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput, boolean z) {
        return encode0(dexFile, str, printWriter, annotatedOutput, z);
    }

    private byte[] encode0(DexFile dexFile, String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput, boolean z) {
        PositionList positions = this.code.getPositions();
        LocalList locals = this.code.getLocals();
        DalvInsnList insns = this.code.getInsns();
        DebugInfoEncoder debugInfoEncoder = new DebugInfoEncoder(positions, locals, dexFile, insns.codeSize(), insns.getRegistersSize(), this.isStatic, this.ref);
        return (printWriter == null && annotatedOutput == null) ? debugInfoEncoder.convert() : debugInfoEncoder.convertAndAnnotate(str, printWriter, annotatedOutput, z);
    }

    @Override // com.android.p001dx.dex.file.Item
    public void addContents(DexFile dexFile) {
    }

    public void annotateTo(DexFile dexFile, AnnotatedOutput annotatedOutput, String str) {
        encode(dexFile, str, null, annotatedOutput, false);
    }

    public void debugPrint(PrintWriter printWriter, String str) {
        encode(null, str, printWriter, null, false);
    }

    @Override // com.android.p001dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_DEBUG_INFO_ITEM;
    }

    @Override // com.android.p001dx.dex.file.OffsettedItem
    public void place0(Section section, int i) {
        try {
            byte[] bArrEncode = encode(section.getFile(), null, null, null, false);
            this.encoded = bArrEncode;
            setWriteSize(bArrEncode.length);
        } catch (RuntimeException e) {
            throw ExceptionWithContext.withContext(e, "...while placing debug info for " + this.ref.toHuman());
        }
    }

    @Override // com.android.p001dx.dex.file.OffsettedItem
    public String toHuman() {
        throw new RuntimeException("unsupported");
    }

    @Override // com.android.p001dx.dex.file.OffsettedItem
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(offsetString() + " debug info");
            encode(dexFile, null, null, annotatedOutput, true);
        }
        annotatedOutput.write(this.encoded);
    }
}
