package com.android.p001dx.dex.file;

import com.android.p001dx.dex.code.CatchHandlerList;
import com.android.p001dx.dex.code.CatchTable;
import com.android.p001dx.dex.code.DalvCode;
import com.android.p001dx.util.AnnotatedOutput;
import com.android.p001dx.util.ByteArrayAnnotatedOutput;
import com.android.p001dx.util.Hex;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class CatchStructs {
    private static final int TRY_ITEM_WRITE_SIZE = 8;
    private final DalvCode code;
    private CatchTable table = null;
    private byte[] encodedHandlers = null;
    private int encodedHandlerHeaderSize = 0;
    private TreeMap<CatchHandlerList, Integer> handlerOffsets = null;

    public CatchStructs(DalvCode dalvCode) {
        this.code = dalvCode;
    }

    private static void annotateAndConsumeHandlers(CatchHandlerList catchHandlerList, int i, int i2, String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput) {
        String human = catchHandlerList.toHuman(str, Hex.m5035u2(i) + ": ");
        if (printWriter != null) {
            printWriter.println(human);
        }
        annotatedOutput.annotate(i2, human);
    }

    private void annotateEntries(String str, PrintWriter printWriter, AnnotatedOutput annotatedOutput) {
        finishProcessingIfNecessary();
        int i = 0;
        boolean z = annotatedOutput != null;
        int i2 = z ? 6 : 0;
        int i3 = z ? 2 : 0;
        int size = this.table.size();
        String str2 = str + "  ";
        if (z) {
            annotatedOutput.annotate(0, str + "tries:");
        } else {
            printWriter.println(str + "tries:");
        }
        for (int i4 = 0; i4 < size; i4++) {
            CatchTable.Entry entry = this.table.get(i4);
            CatchHandlerList handlers = entry.getHandlers();
            String str3 = str2 + "try " + Hex.u2or4(entry.getStart()) + ".." + Hex.u2or4(entry.getEnd());
            String human = handlers.toHuman(str2, "");
            if (z) {
                annotatedOutput.annotate(i2, str3);
                annotatedOutput.annotate(i3, human);
            } else {
                printWriter.println(str3);
                printWriter.println(human);
            }
        }
        if (z) {
            annotatedOutput.annotate(0, str + "handlers:");
            annotatedOutput.annotate(this.encodedHandlerHeaderSize, str2 + "size: " + Hex.m5035u2(this.handlerOffsets.size()));
            CatchHandlerList catchHandlerList = null;
            for (Map.Entry<CatchHandlerList, Integer> entry2 : this.handlerOffsets.entrySet()) {
                CatchHandlerList key = entry2.getKey();
                int iIntValue = entry2.getValue().intValue();
                if (catchHandlerList != null) {
                    annotateAndConsumeHandlers(catchHandlerList, i, iIntValue - i, str2, printWriter, annotatedOutput);
                }
                catchHandlerList = key;
                i = iIntValue;
            }
            annotateAndConsumeHandlers(catchHandlerList, i, this.encodedHandlers.length - i, str2, printWriter, annotatedOutput);
        }
    }

    private void finishProcessingIfNecessary() {
        if (this.table == null) {
            this.table = this.code.getCatches();
        }
    }

    public void debugPrint(PrintWriter printWriter, String str) {
        annotateEntries(str, printWriter, null);
    }

    public void encode(DexFile dexFile) {
        finishProcessingIfNecessary();
        TypeIdsSection typeIds = dexFile.getTypeIds();
        int size = this.table.size();
        this.handlerOffsets = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            this.handlerOffsets.put(this.table.get(i).getHandlers(), null);
        }
        if (this.handlerOffsets.size() > 65535) {
            throw new UnsupportedOperationException("too many catch handlers");
        }
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
        this.encodedHandlerHeaderSize = byteArrayAnnotatedOutput.writeUleb128(this.handlerOffsets.size());
        for (Map.Entry<CatchHandlerList, Integer> entry : this.handlerOffsets.entrySet()) {
            CatchHandlerList key = entry.getKey();
            int size2 = key.size();
            boolean zCatchesAll = key.catchesAll();
            entry.setValue(Integer.valueOf(byteArrayAnnotatedOutput.getCursor()));
            if (zCatchesAll) {
                byteArrayAnnotatedOutput.writeSleb128(-(size2 - 1));
                size2--;
            } else {
                byteArrayAnnotatedOutput.writeSleb128(size2);
            }
            for (int i2 = 0; i2 < size2; i2++) {
                CatchHandlerList.Entry entry2 = key.get(i2);
                byteArrayAnnotatedOutput.writeUleb128(typeIds.indexOf(entry2.getExceptionType()));
                byteArrayAnnotatedOutput.writeUleb128(entry2.getHandler());
            }
            if (zCatchesAll) {
                byteArrayAnnotatedOutput.writeUleb128(key.get(size2).getHandler());
            }
        }
        this.encodedHandlers = byteArrayAnnotatedOutput.toByteArray();
    }

    public int triesSize() {
        finishProcessingIfNecessary();
        return this.table.size();
    }

    public int writeSize() {
        return (triesSize() * 8) + this.encodedHandlers.length;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        finishProcessingIfNecessary();
        if (annotatedOutput.annotates()) {
            annotateEntries("  ", null, annotatedOutput);
        }
        int size = this.table.size();
        for (int i = 0; i < size; i++) {
            CatchTable.Entry entry = this.table.get(i);
            int start = entry.getStart();
            int end = entry.getEnd();
            int i2 = end - start;
            if (i2 >= 65536) {
                throw new UnsupportedOperationException("bogus exception range: " + Hex.m5037u4(start) + ".." + Hex.m5037u4(end));
            }
            annotatedOutput.writeInt(start);
            annotatedOutput.writeShort(i2);
            annotatedOutput.writeShort(this.handlerOffsets.get(entry.getHandlers()).intValue());
        }
        annotatedOutput.write(this.encodedHandlers);
    }
}
