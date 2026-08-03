package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class Code {
    private final com.android.dex.Code.CatchHandler[] catchHandlers;
    private final int debugInfoOffset;
    private final int insSize;
    private final short[] instructions;
    private final int outsSize;
    private final int registersSize;
    private final com.android.dex.Code.Try[] tries;

    public static class CatchHandler {
        final int[] addresses;
        final int catchAllAddress;
        final int offset;
        final int[] typeIndexes;

        public CatchHandler(int[] r1, int[] r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.typeIndexes = r1
                r0.addresses = r2
                r0.catchAllAddress = r3
                r0.offset = r4
                return
        }

        public int[] getAddresses() {
                r1 = this;
                int[] r0 = r1.addresses
                return r0
        }

        public int getCatchAllAddress() {
                r1 = this;
                int r0 = r1.catchAllAddress
                return r0
        }

        public int getOffset() {
                r1 = this;
                int r0 = r1.offset
                return r0
        }

        public int[] getTypeIndexes() {
                r1 = this;
                int[] r0 = r1.typeIndexes
                return r0
        }
    }

    public static class Try {
        final int catchHandlerIndex;
        final int instructionCount;
        final int startAddress;

        public Try(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.startAddress = r1
                r0.instructionCount = r2
                r0.catchHandlerIndex = r3
                return
        }

        public int getCatchHandlerIndex() {
                r1 = this;
                int r0 = r1.catchHandlerIndex
                return r0
        }

        public int getInstructionCount() {
                r1 = this;
                int r0 = r1.instructionCount
                return r0
        }

        public int getStartAddress() {
                r1 = this;
                int r0 = r1.startAddress
                return r0
        }
    }

    public Code(int r1, int r2, int r3, int r4, short[] r5, com.android.dex.Code.Try[] r6, com.android.dex.Code.CatchHandler[] r7) {
            r0 = this;
            r0.<init>()
            r0.registersSize = r1
            r0.insSize = r2
            r0.outsSize = r3
            r0.debugInfoOffset = r4
            r0.instructions = r5
            r0.tries = r6
            r0.catchHandlers = r7
            return
    }

    public com.android.dex.Code.CatchHandler[] getCatchHandlers() {
            r1 = this;
            com.android.dex.Code$CatchHandler[] r0 = r1.catchHandlers
            return r0
    }

    public int getDebugInfoOffset() {
            r1 = this;
            int r0 = r1.debugInfoOffset
            return r0
    }

    public int getInsSize() {
            r1 = this;
            int r0 = r1.insSize
            return r0
    }

    public short[] getInstructions() {
            r1 = this;
            short[] r0 = r1.instructions
            return r0
    }

    public int getOutsSize() {
            r1 = this;
            int r0 = r1.outsSize
            return r0
    }

    public int getRegistersSize() {
            r1 = this;
            int r0 = r1.registersSize
            return r0
    }

    public com.android.dex.Code.Try[] getTries() {
            r1 = this;
            com.android.dex.Code$Try[] r0 = r1.tries
            return r0
    }
}
