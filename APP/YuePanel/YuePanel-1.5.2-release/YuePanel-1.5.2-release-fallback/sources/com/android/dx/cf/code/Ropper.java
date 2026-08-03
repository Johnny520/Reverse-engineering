package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class Ropper {
    private static final int PARAM_ASSIGNMENT = -1;
    private static final int RETURN = -2;
    private static final int SPECIAL_LABEL_COUNT = 7;
    private static final int SYNCH_CATCH_1 = -6;
    private static final int SYNCH_CATCH_2 = -7;
    private static final int SYNCH_RETURN = -3;
    private static final int SYNCH_SETUP_1 = -4;
    private static final int SYNCH_SETUP_2 = -5;
    private final com.android.dx.cf.code.ByteBlockList blocks;
    private final com.android.dx.cf.code.Ropper.CatchInfo[] catchInfos;
    private final com.android.dx.cf.code.Ropper.ExceptionSetupLabelAllocator exceptionSetupLabelAllocator;
    private boolean hasSubroutines;
    private final com.android.dx.cf.code.RopperMachine machine;
    private final int maxLabel;
    private final int maxLocals;
    private final com.android.dx.cf.code.ConcreteMethod method;
    private final java.util.ArrayList<com.android.dx.rop.code.BasicBlock> result;
    private final java.util.ArrayList<com.android.dx.util.IntList> resultSubroutines;
    private final com.android.dx.cf.code.Simulator sim;
    private final com.android.dx.cf.code.Frame[] startFrames;
    private final com.android.dx.cf.code.Ropper.Subroutine[] subroutines;
    private boolean synchNeedsExceptionHandler;



    public class CatchInfo {
        private final java.util.Map<com.android.dx.rop.type.Type, com.android.dx.cf.code.Ropper.ExceptionHandlerSetup> setups;
        final /* synthetic */ com.android.dx.cf.code.Ropper this$0;

        private CatchInfo(com.android.dx.cf.code.Ropper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.setups = r1
                return
        }

        public /* synthetic */ CatchInfo(com.android.dx.cf.code.Ropper r1, com.android.dx.cf.code.Ropper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.android.dx.cf.code.Ropper.ExceptionHandlerSetup getSetup(com.android.dx.rop.type.Type r3) {
                r2 = this;
                java.util.Map<com.android.dx.rop.type.Type, com.android.dx.cf.code.Ropper$ExceptionHandlerSetup> r0 = r2.setups
                java.lang.Object r0 = r0.get(r3)
                com.android.dx.cf.code.Ropper$ExceptionHandlerSetup r0 = (com.android.dx.cf.code.Ropper.ExceptionHandlerSetup) r0
                if (r0 != 0) goto L1f
                com.android.dx.cf.code.Ropper r0 = r2.this$0
                com.android.dx.cf.code.Ropper$ExceptionSetupLabelAllocator r0 = com.android.dx.cf.code.Ropper.access$000(r0)
                int r0 = r0.getNextLabel()
                com.android.dx.cf.code.Ropper$ExceptionHandlerSetup r1 = new com.android.dx.cf.code.Ropper$ExceptionHandlerSetup
                r1.<init>(r3, r0)
                java.util.Map<com.android.dx.rop.type.Type, com.android.dx.cf.code.Ropper$ExceptionHandlerSetup> r0 = r2.setups
                r0.put(r3, r1)
                r0 = r1
            L1f:
                return r0
        }

        public java.util.Collection<com.android.dx.cf.code.Ropper.ExceptionHandlerSetup> getSetups() {
                r1 = this;
                java.util.Map<com.android.dx.rop.type.Type, com.android.dx.cf.code.Ropper$ExceptionHandlerSetup> r0 = r1.setups
                java.util.Collection r0 = r0.values()
                return r0
        }
    }

    public static class ExceptionHandlerSetup {
        private com.android.dx.rop.type.Type caughtType;
        private int label;

        public ExceptionHandlerSetup(com.android.dx.rop.type.Type r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.caughtType = r1
                r0.label = r2
                return
        }

        public com.android.dx.rop.type.Type getCaughtType() {
                r1 = this;
                com.android.dx.rop.type.Type r0 = r1.caughtType
                return r0
        }

        public int getLabel() {
                r1 = this;
                int r0 = r1.label
                return r0
        }
    }

    public class ExceptionSetupLabelAllocator extends com.android.dx.cf.code.Ropper.LabelAllocator {
        int maxSetupLabel;
        final /* synthetic */ com.android.dx.cf.code.Ropper this$0;

        public ExceptionSetupLabelAllocator(com.android.dx.cf.code.Ropper r2) {
                r1 = this;
                r1.this$0 = r2
                int r0 = com.android.dx.cf.code.Ropper.access$100(r2)
                r1.<init>(r0)
                int r0 = com.android.dx.cf.code.Ropper.access$100(r2)
                com.android.dx.cf.code.ConcreteMethod r2 = com.android.dx.cf.code.Ropper.access$700(r2)
                com.android.dx.cf.code.ByteCatchList r2 = r2.getCatches()
                int r2 = r2.size()
                int r0 = r0 + r2
                r1.maxSetupLabel = r0
                return
        }

        @Override // com.android.dx.cf.code.Ropper.LabelAllocator
        public int getNextLabel() {
                r2 = this;
                int r0 = r2.nextAvailableLabel
                int r1 = r2.maxSetupLabel
                if (r0 >= r1) goto Lb
                int r1 = r0 + 1
                r2.nextAvailableLabel = r1
                return r0
            Lb:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }
    }

    public static class LabelAllocator {
        int nextAvailableLabel;

        public LabelAllocator(int r1) {
                r0 = this;
                r0.<init>()
                r0.nextAvailableLabel = r1
                return
        }

        public int getNextLabel() {
                r2 = this;
                int r0 = r2.nextAvailableLabel
                int r1 = r0 + 1
                r2.nextAvailableLabel = r1
                return r0
        }
    }

    public class Subroutine {
        private java.util.BitSet callerBlocks;
        private java.util.BitSet retBlocks;
        private int startBlock;
        final /* synthetic */ com.android.dx.cf.code.Ropper this$0;

        public Subroutine(com.android.dx.cf.code.Ropper r2, int r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r1.startBlock = r3
                java.util.BitSet r3 = new java.util.BitSet
                int r0 = com.android.dx.cf.code.Ropper.access$100(r2)
                r3.<init>(r0)
                r1.retBlocks = r3
                java.util.BitSet r3 = new java.util.BitSet
                int r0 = com.android.dx.cf.code.Ropper.access$100(r2)
                r3.<init>(r0)
                r1.callerBlocks = r3
                r3 = 1
                com.android.dx.cf.code.Ropper.access$202(r2, r3)
                return
        }

        public Subroutine(com.android.dx.cf.code.Ropper r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.addRetBlock(r3)
                return
        }

        public static /* synthetic */ int access$1000(com.android.dx.cf.code.Ropper.Subroutine r0) {
                int r0 = r0.startBlock
                return r0
        }

        public static /* synthetic */ java.util.BitSet access$1300(com.android.dx.cf.code.Ropper.Subroutine r0) {
                java.util.BitSet r0 = r0.retBlocks
                return r0
        }

        public void addCallerBlock(int r2) {
                r1 = this;
                java.util.BitSet r0 = r1.callerBlocks
                r0.set(r2)
                return
        }

        public void addRetBlock(int r2) {
                r1 = this;
                java.util.BitSet r0 = r1.retBlocks
                r0.set(r2)
                return
        }

        public int getStartBlock() {
                r1 = this;
                int r0 = r1.startBlock
                return r0
        }

        public com.android.dx.util.IntList getSuccessors() {
                r4 = this;
                com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
                java.util.BitSet r1 = r4.callerBlocks
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.BitSet r1 = r4.callerBlocks
                r2 = 0
                int r1 = r1.nextSetBit(r2)
            L12:
                if (r1 < 0) goto L2e
                com.android.dx.cf.code.Ropper r3 = r4.this$0
                com.android.dx.rop.code.BasicBlock r3 = com.android.dx.cf.code.Ropper.access$300(r3, r1)
                com.android.dx.util.IntList r3 = r3.getSuccessors()
                int r3 = r3.get(r2)
                r0.add(r3)
                java.util.BitSet r3 = r4.callerBlocks
                int r1 = r1 + 1
                int r1 = r3.nextSetBit(r1)
                goto L12
            L2e:
                r0.setImmutable()
                return r0
        }

        public void mergeToSuccessors(com.android.dx.cf.code.Frame r10, int[] r11) {
                r9 = this;
                java.util.BitSet r0 = r9.callerBlocks
                r1 = 0
                int r0 = r0.nextSetBit(r1)
            L7:
                if (r0 < 0) goto L34
                com.android.dx.cf.code.Ropper r2 = r9.this$0
                com.android.dx.rop.code.BasicBlock r2 = com.android.dx.cf.code.Ropper.access$300(r2, r0)
                com.android.dx.util.IntList r2 = r2.getSuccessors()
                int r4 = r2.get(r1)
                int r2 = r9.startBlock
                com.android.dx.cf.code.Frame r7 = r10.subFrameForLabel(r2, r0)
                if (r7 == 0) goto L28
                com.android.dx.cf.code.Ropper r3 = r9.this$0
                r5 = -1
                r6 = 0
                r8 = r11
                com.android.dx.cf.code.Ropper.access$400(r3, r4, r5, r6, r7, r8)
                goto L2b
            L28:
                com.android.dx.util.Bits.set(r11, r0)
            L2b:
                java.util.BitSet r2 = r9.callerBlocks
                int r0 = r0 + 1
                int r0 = r2.nextSetBit(r0)
                goto L7
            L34:
                return
        }
    }

    public class SubroutineInliner {
        private final com.android.dx.cf.code.Ropper.LabelAllocator labelAllocator;
        private final java.util.ArrayList<com.android.dx.util.IntList> labelToSubroutines;
        private final java.util.HashMap<java.lang.Integer, java.lang.Integer> origLabelToCopiedLabel;
        private int subroutineStart;
        private int subroutineSuccessor;
        final /* synthetic */ com.android.dx.cf.code.Ropper this$0;
        private final java.util.BitSet workList;

        public SubroutineInliner(com.android.dx.cf.code.Ropper r2, com.android.dx.cf.code.Ropper.LabelAllocator r3, java.util.ArrayList<com.android.dx.util.IntList> r4) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.origLabelToCopiedLabel = r0
                java.util.BitSet r0 = new java.util.BitSet
                int r2 = com.android.dx.cf.code.Ropper.access$100(r2)
                r0.<init>(r2)
                r1.workList = r0
                r1.labelAllocator = r3
                r1.labelToSubroutines = r4
                return
        }

        private void copyBlock(int r9, int r10) {
                r8 = this;
                com.android.dx.cf.code.Ropper r0 = r8.this$0
                com.android.dx.rop.code.BasicBlock r0 = com.android.dx.cf.code.Ropper.access$300(r0, r9)
                com.android.dx.util.IntList r1 = r0.getSuccessors()
                com.android.dx.cf.code.Ropper r2 = r8.this$0
                boolean r2 = com.android.dx.cf.code.Ropper.access$600(r2, r0)
                r3 = 0
                r4 = -1
                if (r2 == 0) goto L26
                int r9 = r1.get(r3)
                int r9 = r8.mapOrAllocateLabel(r9)
                r2 = 1
                int r1 = r1.get(r2)
                com.android.dx.util.IntList r9 = com.android.dx.util.IntList.makeImmutable(r9, r1)
                goto L90
            L26:
                com.android.dx.cf.code.Ropper r2 = r8.this$0
                com.android.dx.cf.code.Ropper$Subroutine r9 = com.android.dx.cf.code.Ropper.access$900(r2, r9)
                if (r9 == 0) goto L6c
                int r1 = com.android.dx.cf.code.Ropper.Subroutine.access$1000(r9)
                int r2 = r8.subroutineStart
                if (r1 != r2) goto L3f
                int r9 = r8.subroutineSuccessor
                com.android.dx.util.IntList r9 = com.android.dx.util.IntList.makeImmutable(r9)
                int r4 = r8.subroutineSuccessor
                goto L90
            L3f:
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ret instruction returns to label "
                r0.append(r1)
                int r9 = com.android.dx.cf.code.Ropper.Subroutine.access$1000(r9)
                java.lang.String r9 = com.android.dx.util.Hex.u2(r9)
                r0.append(r9)
                java.lang.String r9 = " expected: "
                r0.append(r9)
                int r9 = r8.subroutineStart
                java.lang.String r9 = com.android.dx.util.Hex.u2(r9)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r10.<init>(r9)
                throw r10
            L6c:
                int r9 = r0.getPrimarySuccessor()
                int r2 = r1.size()
                com.android.dx.util.IntList r5 = new com.android.dx.util.IntList
                r5.<init>(r2)
            L79:
                if (r3 >= r2) goto L8c
                int r6 = r1.get(r3)
                int r7 = r8.mapOrAllocateLabel(r6)
                r5.add(r7)
                if (r9 != r6) goto L89
                r4 = r7
            L89:
                int r3 = r3 + 1
                goto L79
            L8c:
                r5.setImmutable()
                r9 = r5
            L90:
                com.android.dx.cf.code.Ropper r1 = r8.this$0
                com.android.dx.rop.code.BasicBlock r2 = new com.android.dx.rop.code.BasicBlock
                com.android.dx.rop.code.InsnList r0 = r0.getInsns()
                com.android.dx.rop.code.InsnList r0 = com.android.dx.cf.code.Ropper.access$1100(r1, r0)
                r2.<init>(r10, r0, r9, r4)
                java.util.ArrayList<com.android.dx.util.IntList> r9 = r8.labelToSubroutines
                java.lang.Object r9 = r9.get(r10)
                com.android.dx.util.IntList r9 = (com.android.dx.util.IntList) r9
                com.android.dx.cf.code.Ropper.access$1200(r1, r2, r9)
                return
        }

        private boolean involvedInSubroutine(int r2, int r3) {
                r1 = this;
                java.util.ArrayList<com.android.dx.util.IntList> r0 = r1.labelToSubroutines
                java.lang.Object r2 = r0.get(r2)
                com.android.dx.util.IntList r2 = (com.android.dx.util.IntList) r2
                if (r2 == 0) goto L18
                int r0 = r2.size()
                if (r0 <= 0) goto L18
                int r2 = r2.top()
                if (r2 != r3) goto L18
                r2 = 1
                goto L19
            L18:
                r2 = 0
            L19:
                return r2
        }

        private int mapOrAllocateLabel(int r5) {
                r4 = this;
                java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r4.origLabelToCopiedLabel
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L13
                int r5 = r0.intValue()
                goto L4d
            L13:
                int r0 = r4.subroutineStart
                boolean r0 = r4.involvedInSubroutine(r5, r0)
                if (r0 != 0) goto L1c
                goto L4d
            L1c:
                com.android.dx.cf.code.Ropper$LabelAllocator r0 = r4.labelAllocator
                int r0 = r0.getNextLabel()
                java.util.BitSet r1 = r4.workList
                r1.set(r5)
                java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r4.origLabelToCopiedLabel
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                r1.put(r2, r3)
            L34:
                java.util.ArrayList<com.android.dx.util.IntList> r1 = r4.labelToSubroutines
                int r1 = r1.size()
                if (r1 > r0) goto L43
                java.util.ArrayList<com.android.dx.util.IntList> r1 = r4.labelToSubroutines
                r2 = 0
                r1.add(r2)
                goto L34
            L43:
                java.util.ArrayList<com.android.dx.util.IntList> r1 = r4.labelToSubroutines
                java.lang.Object r5 = r1.get(r5)
                r1.set(r0, r5)
                r5 = r0
            L4d:
                return r5
        }

        public void inlineSubroutineCalledFrom(com.android.dx.rop.code.BasicBlock r8) {
                r7 = this;
                com.android.dx.util.IntList r0 = r8.getSuccessors()
                r1 = 0
                int r0 = r0.get(r1)
                r7.subroutineSuccessor = r0
                com.android.dx.util.IntList r0 = r8.getSuccessors()
                r2 = 1
                int r0 = r0.get(r2)
                r7.subroutineStart = r0
                int r0 = r7.mapOrAllocateLabel(r0)
                java.util.BitSet r2 = r7.workList
                int r2 = r2.nextSetBit(r1)
            L20:
                if (r2 < 0) goto L61
                java.util.BitSet r3 = r7.workList
                r3.clear(r2)
                java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = r7.origLabelToCopiedLabel
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                java.lang.Object r3 = r3.get(r4)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r7.copyBlock(r2, r3)
                com.android.dx.cf.code.Ropper r4 = r7.this$0
                com.android.dx.rop.code.BasicBlock r2 = com.android.dx.cf.code.Ropper.access$300(r4, r2)
                boolean r2 = com.android.dx.cf.code.Ropper.access$600(r4, r2)
                if (r2 == 0) goto L5a
                com.android.dx.cf.code.Ropper$SubroutineInliner r2 = new com.android.dx.cf.code.Ropper$SubroutineInliner
                com.android.dx.cf.code.Ropper r4 = r7.this$0
                com.android.dx.cf.code.Ropper$LabelAllocator r5 = r7.labelAllocator
                java.util.ArrayList<com.android.dx.util.IntList> r6 = r7.labelToSubroutines
                r2.<init>(r4, r5, r6)
                com.android.dx.cf.code.Ropper r4 = r7.this$0
                com.android.dx.rop.code.BasicBlock r3 = com.android.dx.cf.code.Ropper.access$300(r4, r3)
                r2.inlineSubroutineCalledFrom(r3)
            L5a:
                java.util.BitSet r2 = r7.workList
                int r2 = r2.nextSetBit(r1)
                goto L20
            L61:
                com.android.dx.cf.code.Ropper r1 = r7.this$0
                com.android.dx.rop.code.BasicBlock r2 = new com.android.dx.rop.code.BasicBlock
                int r3 = r8.getLabel()
                com.android.dx.rop.code.InsnList r4 = r8.getInsns()
                com.android.dx.util.IntList r5 = com.android.dx.util.IntList.makeImmutable(r0)
                r2.<init>(r3, r4, r5, r0)
                java.util.ArrayList<com.android.dx.util.IntList> r0 = r7.labelToSubroutines
                int r8 = r8.getLabel()
                java.lang.Object r8 = r0.get(r8)
                com.android.dx.util.IntList r8 = (com.android.dx.util.IntList) r8
                com.android.dx.cf.code.Ropper.access$800(r1, r2, r8)
                return
        }
    }

    private Ropper(com.android.dx.cf.code.ConcreteMethod r5, com.android.dx.rop.code.TranslationAdvice r6, com.android.dx.cf.iface.MethodList r7, com.android.dx.dex.DexOptions r8) {
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L71
            if (r6 == 0) goto L69
            r4.method = r5
            com.android.dx.cf.code.ByteBlockList r0 = com.android.dx.cf.code.BasicBlocker.identifyBlocks(r5)
            r4.blocks = r0
            int r1 = r0.getMaxLabel()
            r4.maxLabel = r1
            int r2 = r5.getMaxLocals()
            r4.maxLocals = r2
            com.android.dx.cf.code.RopperMachine r3 = new com.android.dx.cf.code.RopperMachine
            r3.<init>(r4, r5, r6, r7)
            r4.machine = r3
            com.android.dx.cf.code.Simulator r6 = new com.android.dx.cf.code.Simulator
            r6.<init>(r3, r5, r8)
            r4.sim = r6
            com.android.dx.cf.code.Frame[] r6 = new com.android.dx.cf.code.Frame[r1]
            r4.startFrames = r6
            com.android.dx.cf.code.Ropper$Subroutine[] r7 = new com.android.dx.cf.code.Ropper.Subroutine[r1]
            r4.subroutines = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = r0.size()
            int r8 = r8 * 2
            int r8 = r8 + 10
            r7.<init>(r8)
            r4.result = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = r0.size()
            int r8 = r8 * 2
            int r8 = r8 + 10
            r7.<init>(r8)
            r4.resultSubroutines = r7
            com.android.dx.cf.code.Ropper$CatchInfo[] r7 = new com.android.dx.cf.code.Ropper.CatchInfo[r1]
            r4.catchInfos = r7
            r7 = 0
            r4.synchNeedsExceptionHandler = r7
            com.android.dx.cf.code.Frame r8 = new com.android.dx.cf.code.Frame
            int r5 = r5.getMaxStack()
            r8.<init>(r2, r5)
            r6[r7] = r8
            com.android.dx.cf.code.Ropper$ExceptionSetupLabelAllocator r5 = new com.android.dx.cf.code.Ropper$ExceptionSetupLabelAllocator
            r5.<init>(r4)
            r4.exceptionSetupLabelAllocator = r5
            return
        L69:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "advice == null"
            r5.<init>(r6)
            throw r5
        L71:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "method == null"
            r5.<init>(r6)
            throw r5
    }

    public static /* synthetic */ com.android.dx.cf.code.Ropper.ExceptionSetupLabelAllocator access$000(com.android.dx.cf.code.Ropper r0) {
            com.android.dx.cf.code.Ropper$ExceptionSetupLabelAllocator r0 = r0.exceptionSetupLabelAllocator
            return r0
    }

    public static /* synthetic */ int access$100(com.android.dx.cf.code.Ropper r0) {
            int r0 = r0.maxLabel
            return r0
    }

    public static /* synthetic */ com.android.dx.rop.code.InsnList access$1100(com.android.dx.cf.code.Ropper r0, com.android.dx.rop.code.InsnList r1) {
            com.android.dx.rop.code.InsnList r0 = r0.filterMoveReturnAddressInsns(r1)
            return r0
    }

    public static /* synthetic */ void access$1200(com.android.dx.cf.code.Ropper r0, com.android.dx.rop.code.BasicBlock r1, com.android.dx.util.IntList r2) {
            r0.addBlock(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$202(com.android.dx.cf.code.Ropper r0, boolean r1) {
            r0.hasSubroutines = r1
            return r1
    }

    public static /* synthetic */ com.android.dx.rop.code.BasicBlock access$300(com.android.dx.cf.code.Ropper r0, int r1) {
            com.android.dx.rop.code.BasicBlock r0 = r0.labelToBlock(r1)
            return r0
    }

    public static /* synthetic */ void access$400(com.android.dx.cf.code.Ropper r0, int r1, int r2, com.android.dx.cf.code.Ropper.Subroutine r3, com.android.dx.cf.code.Frame r4, int[] r5) {
            r0.mergeAndWorkAsNecessary(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ boolean access$600(com.android.dx.cf.code.Ropper r0, com.android.dx.rop.code.BasicBlock r1) {
            boolean r0 = r0.isSubroutineCaller(r1)
            return r0
    }

    public static /* synthetic */ com.android.dx.cf.code.ConcreteMethod access$700(com.android.dx.cf.code.Ropper r0) {
            com.android.dx.cf.code.ConcreteMethod r0 = r0.method
            return r0
    }

    public static /* synthetic */ boolean access$800(com.android.dx.cf.code.Ropper r0, com.android.dx.rop.code.BasicBlock r1, com.android.dx.util.IntList r2) {
            boolean r0 = r0.addOrReplaceBlockNoDelete(r1, r2)
            return r0
    }

    public static /* synthetic */ com.android.dx.cf.code.Ropper.Subroutine access$900(com.android.dx.cf.code.Ropper r0, int r1) {
            com.android.dx.cf.code.Ropper$Subroutine r0 = r0.subroutineFromRetBlock(r1)
            return r0
    }

    private void addBlock(com.android.dx.rop.code.BasicBlock r2, com.android.dx.util.IntList r3) {
            r1 = this;
            if (r2 == 0) goto L10
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r0 = r1.result
            r0.add(r2)
            r3.throwIfMutable()
            java.util.ArrayList<com.android.dx.util.IntList> r2 = r1.resultSubroutines
            r2.add(r3)
            return
        L10:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "block == null"
            r2.<init>(r3)
            throw r2
    }

    private void addExceptionSetupBlocks() {
            r11 = this;
            com.android.dx.cf.code.Ropper$CatchInfo[] r0 = r11.catchInfos
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r2 >= r0) goto L7a
            com.android.dx.cf.code.Ropper$CatchInfo[] r3 = r11.catchInfos
            r3 = r3[r2]
            if (r3 == 0) goto L77
            java.util.Collection r3 = r3.getSetups()
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r3.next()
            com.android.dx.cf.code.Ropper$ExceptionHandlerSetup r4 = (com.android.dx.cf.code.Ropper.ExceptionHandlerSetup) r4
            com.android.dx.rop.code.BasicBlock r5 = r11.labelToBlock(r2)
            com.android.dx.rop.code.Insn r5 = r5.getFirstInsn()
            com.android.dx.rop.code.SourcePosition r5 = r5.getPosition()
            com.android.dx.rop.code.InsnList r6 = new com.android.dx.rop.code.InsnList
            r7 = 2
            r6.<init>(r7)
            com.android.dx.rop.code.PlainInsn r7 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.type.Type r8 = r4.getCaughtType()
            com.android.dx.rop.code.Rop r8 = com.android.dx.rop.code.Rops.opMoveException(r8)
            int r9 = r11.maxLocals
            com.android.dx.rop.type.Type r10 = r4.getCaughtType()
            com.android.dx.rop.code.RegisterSpec r9 = com.android.dx.rop.code.RegisterSpec.make(r9, r10)
            com.android.dx.rop.code.RegisterSpecList r10 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r7.<init>(r8, r5, r9, r10)
            r6.set(r1, r7)
            com.android.dx.rop.code.PlainInsn r7 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r8 = com.android.dx.rop.code.Rops.GOTO
            r9 = 0
            r7.<init>(r8, r5, r9, r10)
            r5 = 1
            r6.set(r5, r7)
            r6.setImmutable()
            com.android.dx.rop.code.BasicBlock r5 = new com.android.dx.rop.code.BasicBlock
            int r4 = r4.getLabel()
            com.android.dx.util.IntList r7 = com.android.dx.util.IntList.makeImmutable(r2)
            r5.<init>(r4, r6, r7, r2)
            com.android.dx.cf.code.Frame[] r4 = r11.startFrames
            r4 = r4[r2]
            com.android.dx.util.IntList r4 = r4.getSubroutines()
            r11.addBlock(r5, r4)
            goto L15
        L77:
            int r2 = r2 + 1
            goto L5
        L7a:
            return
    }

    private boolean addOrReplaceBlock(com.android.dx.rop.code.BasicBlock r3, com.android.dx.util.IntList r4) {
            r2 = this;
            if (r3 == 0) goto L20
            int r0 = r3.getLabel()
            int r0 = r2.labelToResultIndex(r0)
            if (r0 >= 0) goto Le
            r0 = 0
            goto L12
        Le:
            r2.removeBlockAndSpecialSuccessors(r0)
            r0 = 1
        L12:
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r1 = r2.result
            r1.add(r3)
            r4.throwIfMutable()
            java.util.ArrayList<com.android.dx.util.IntList> r3 = r2.resultSubroutines
            r3.add(r4)
            return r0
        L20:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "block == null"
            r3.<init>(r4)
            throw r3
    }

    private boolean addOrReplaceBlockNoDelete(com.android.dx.rop.code.BasicBlock r3, com.android.dx.util.IntList r4) {
            r2 = this;
            if (r3 == 0) goto L27
            int r0 = r3.getLabel()
            int r0 = r2.labelToResultIndex(r0)
            if (r0 >= 0) goto Le
            r0 = 0
            goto L19
        Le:
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r1 = r2.result
            r1.remove(r0)
            java.util.ArrayList<com.android.dx.util.IntList> r1 = r2.resultSubroutines
            r1.remove(r0)
            r0 = 1
        L19:
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r1 = r2.result
            r1.add(r3)
            r4.throwIfMutable()
            java.util.ArrayList<com.android.dx.util.IntList> r3 = r2.resultSubroutines
            r3.add(r4)
            return r0
        L27:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "block == null"
            r3.<init>(r4)
            throw r3
    }

    private void addReturnBlock() {
            r10 = this;
            com.android.dx.cf.code.RopperMachine r0 = r10.machine
            com.android.dx.rop.code.Rop r0 = r0.getReturnOp()
            if (r0 != 0) goto L9
            return
        L9:
            com.android.dx.cf.code.RopperMachine r1 = r10.machine
            com.android.dx.rop.code.SourcePosition r1 = r1.getReturnPosition()
            r2 = -2
            int r2 = r10.getSpecialLabel(r2)
            boolean r3 = r10.isSynchronized()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L4c
            com.android.dx.rop.code.InsnList r3 = new com.android.dx.rop.code.InsnList
            r3.<init>(r4)
            com.android.dx.rop.code.ThrowingInsn r6 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.code.Rop r7 = com.android.dx.rop.code.Rops.MONITOR_EXIT
            com.android.dx.rop.code.RegisterSpec r8 = r10.getSynchReg()
            com.android.dx.rop.code.RegisterSpecList r8 = com.android.dx.rop.code.RegisterSpecList.make(r8)
            com.android.dx.rop.type.StdTypeList r9 = com.android.dx.rop.type.StdTypeList.EMPTY
            r6.<init>(r7, r1, r8, r9)
            r3.set(r5, r6)
            r3.setImmutable()
            r6 = -3
            int r6 = r10.getSpecialLabel(r6)
            com.android.dx.rop.code.BasicBlock r7 = new com.android.dx.rop.code.BasicBlock
            com.android.dx.util.IntList r8 = com.android.dx.util.IntList.makeImmutable(r6)
            r7.<init>(r2, r3, r8, r6)
            com.android.dx.util.IntList r2 = com.android.dx.util.IntList.EMPTY
            r10.addBlock(r7, r2)
            r2 = r6
        L4c:
            com.android.dx.rop.code.InsnList r3 = new com.android.dx.rop.code.InsnList
            r3.<init>(r4)
            com.android.dx.rop.type.TypeList r4 = r0.getSources()
            int r6 = r4.size()
            if (r6 != 0) goto L5e
            com.android.dx.rop.code.RegisterSpecList r4 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            goto L6a
        L5e:
            com.android.dx.rop.type.Type r4 = r4.getType(r5)
            com.android.dx.rop.code.RegisterSpec r4 = com.android.dx.rop.code.RegisterSpec.make(r5, r4)
            com.android.dx.rop.code.RegisterSpecList r4 = com.android.dx.rop.code.RegisterSpecList.make(r4)
        L6a:
            com.android.dx.rop.code.PlainInsn r6 = new com.android.dx.rop.code.PlainInsn
            r7 = 0
            r6.<init>(r0, r1, r7, r4)
            r3.set(r5, r6)
            r3.setImmutable()
            com.android.dx.rop.code.BasicBlock r0 = new com.android.dx.rop.code.BasicBlock
            com.android.dx.util.IntList r1 = com.android.dx.util.IntList.EMPTY
            r4 = -1
            r0.<init>(r2, r3, r1, r4)
            r10.addBlock(r0, r1)
            return
    }

    private void addSetupBlocks() {
            r17 = this;
            r0 = r17
            com.android.dx.cf.code.ConcreteMethod r1 = r0.method
            com.android.dx.cf.code.LocalVariableList r1 = r1.getLocalVariables()
            com.android.dx.cf.code.ConcreteMethod r2 = r0.method
            r3 = 0
            com.android.dx.rop.code.SourcePosition r2 = r2.makeSourcePosistion(r3)
            com.android.dx.cf.code.ConcreteMethod r4 = r0.method
            com.android.dx.rop.type.Prototype r4 = r4.getEffectiveDescriptor()
            com.android.dx.rop.type.StdTypeList r10 = r4.getParameterTypes()
            int r11 = r10.size()
            com.android.dx.rop.code.InsnList r12 = new com.android.dx.rop.code.InsnList
            int r4 = r11 + 1
            r12.<init>(r4)
            r13 = r3
            r14 = r13
        L26:
            if (r13 >= r11) goto L61
            com.android.dx.rop.type.Type r15 = r10.get(r13)
            com.android.dx.cf.code.LocalVariableList$Item r4 = r1.pcAndIndexToLocal(r3, r14)
            if (r4 != 0) goto L38
            com.android.dx.rop.code.RegisterSpec r4 = com.android.dx.rop.code.RegisterSpec.make(r14, r15)
        L36:
            r7 = r4
            goto L41
        L38:
            com.android.dx.rop.code.LocalItem r4 = r4.getLocalItem()
            com.android.dx.rop.code.RegisterSpec r4 = com.android.dx.rop.code.RegisterSpec.makeLocalOptional(r14, r15, r4)
            goto L36
        L41:
            com.android.dx.rop.code.PlainCstInsn r9 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.Rop r5 = com.android.dx.rop.code.Rops.opMoveParam(r15)
            com.android.dx.rop.code.RegisterSpecList r8 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            com.android.dx.rop.cst.CstInteger r16 = com.android.dx.rop.cst.CstInteger.make(r14)
            r4 = r9
            r6 = r2
            r3 = r9
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)
            r12.set(r13, r3)
            int r3 = r15.getCategory()
            int r14 = r14 + r3
            int r13 = r13 + 1
            r3 = 0
            goto L26
        L61:
            com.android.dx.rop.code.PlainInsn r1 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r3 = com.android.dx.rop.code.Rops.GOTO
            com.android.dx.rop.code.RegisterSpecList r10 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r13 = 0
            r1.<init>(r3, r2, r13, r10)
            r12.set(r11, r1)
            r12.setImmutable()
            boolean r1 = r17.isSynchronized()
            if (r1 == 0) goto L7e
            r4 = -4
            int r4 = r0.getSpecialLabel(r4)
            r11 = r4
            goto L7f
        L7e:
            r11 = 0
        L7f:
            com.android.dx.rop.code.BasicBlock r4 = new com.android.dx.rop.code.BasicBlock
            r5 = -1
            int r5 = r0.getSpecialLabel(r5)
            com.android.dx.util.IntList r6 = com.android.dx.util.IntList.makeImmutable(r11)
            r4.<init>(r5, r12, r6, r11)
            com.android.dx.util.IntList r12 = com.android.dx.util.IntList.EMPTY
            r0.addBlock(r4, r12)
            if (r1 == 0) goto L13a
            com.android.dx.rop.code.RegisterSpec r1 = r17.getSynchReg()
            boolean r4 = r17.isStatic()
            r14 = 2
            r15 = 1
            if (r4 == 0) goto Lbd
            com.android.dx.rop.code.ThrowingCstInsn r3 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.Rop r5 = com.android.dx.rop.code.Rops.CONST_OBJECT
            com.android.dx.rop.type.StdTypeList r8 = com.android.dx.rop.type.StdTypeList.EMPTY
            com.android.dx.cf.code.ConcreteMethod r4 = r0.method
            com.android.dx.rop.cst.CstType r9 = r4.getDefiningClass()
            r4 = r3
            r6 = r2
            r7 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            com.android.dx.rop.code.InsnList r4 = new com.android.dx.rop.code.InsnList
            r4.<init>(r15)
            r5 = 0
            r4.set(r5, r3)
            r3 = r15
            goto Le1
        Lbd:
            com.android.dx.rop.code.InsnList r9 = new com.android.dx.rop.code.InsnList
            r9.<init>(r14)
            com.android.dx.rop.code.PlainCstInsn r8 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.Rop r5 = com.android.dx.rop.code.Rops.MOVE_PARAM_OBJECT
            com.android.dx.rop.cst.CstInteger r16 = com.android.dx.rop.cst.CstInteger.VALUE_0
            r4 = r8
            r6 = r2
            r7 = r1
            r14 = r8
            r8 = r10
            r15 = r9
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)
            r4 = 0
            r15.set(r4, r14)
            com.android.dx.rop.code.PlainInsn r4 = new com.android.dx.rop.code.PlainInsn
            r4.<init>(r3, r2, r13, r10)
            r3 = 1
            r15.set(r3, r4)
            r4 = r15
        Le1:
            r5 = -5
            int r5 = r0.getSpecialLabel(r5)
            r4.setImmutable()
            com.android.dx.rop.code.BasicBlock r6 = new com.android.dx.rop.code.BasicBlock
            com.android.dx.util.IntList r7 = com.android.dx.util.IntList.makeImmutable(r5)
            r6.<init>(r11, r4, r7, r5)
            r0.addBlock(r6, r12)
            com.android.dx.rop.code.InsnList r4 = new com.android.dx.rop.code.InsnList
            boolean r6 = r17.isStatic()
            if (r6 == 0) goto Lff
            r14 = 2
            goto L100
        Lff:
            r14 = r3
        L100:
            r4.<init>(r14)
            boolean r3 = r17.isStatic()
            if (r3 == 0) goto L116
            com.android.dx.rop.code.PlainInsn r3 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r6 = com.android.dx.rop.code.Rops.opMoveResultPseudo(r1)
            r3.<init>(r6, r2, r1, r10)
            r6 = 0
            r4.set(r6, r3)
        L116:
            com.android.dx.rop.code.ThrowingInsn r3 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.code.Rop r6 = com.android.dx.rop.code.Rops.MONITOR_ENTER
            com.android.dx.rop.code.RegisterSpecList r1 = com.android.dx.rop.code.RegisterSpecList.make(r1)
            com.android.dx.rop.type.StdTypeList r7 = com.android.dx.rop.type.StdTypeList.EMPTY
            r3.<init>(r6, r2, r1, r7)
            boolean r1 = r17.isStatic()
            r4.set(r1, r3)
            r4.setImmutable()
            com.android.dx.rop.code.BasicBlock r1 = new com.android.dx.rop.code.BasicBlock
            r2 = 0
            com.android.dx.util.IntList r3 = com.android.dx.util.IntList.makeImmutable(r2)
            r1.<init>(r5, r4, r3, r2)
            r0.addBlock(r1, r12)
        L13a:
            return
    }

    private void addSynchExceptionHandlerBlock() {
            r10 = this;
            boolean r0 = r10.synchNeedsExceptionHandler
            if (r0 != 0) goto L5
            return
        L5:
            com.android.dx.cf.code.ConcreteMethod r0 = r10.method
            r1 = 0
            com.android.dx.rop.code.SourcePosition r0 = r0.makeSourcePosistion(r1)
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.THROWABLE
            com.android.dx.rop.code.RegisterSpec r3 = com.android.dx.rop.code.RegisterSpec.make(r1, r2)
            com.android.dx.rop.code.InsnList r4 = new com.android.dx.rop.code.InsnList
            r5 = 2
            r4.<init>(r5)
            com.android.dx.rop.code.PlainInsn r5 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r2 = com.android.dx.rop.code.Rops.opMoveException(r2)
            com.android.dx.rop.code.RegisterSpecList r6 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r5.<init>(r2, r0, r3, r6)
            r4.set(r1, r5)
            com.android.dx.rop.code.ThrowingInsn r2 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.code.Rop r5 = com.android.dx.rop.code.Rops.MONITOR_EXIT
            com.android.dx.rop.code.RegisterSpec r6 = r10.getSynchReg()
            com.android.dx.rop.code.RegisterSpecList r6 = com.android.dx.rop.code.RegisterSpecList.make(r6)
            com.android.dx.rop.type.StdTypeList r7 = com.android.dx.rop.type.StdTypeList.EMPTY
            r2.<init>(r5, r0, r6, r7)
            r5 = 1
            r4.set(r5, r2)
            r4.setImmutable()
            r2 = -7
            int r2 = r10.getSpecialLabel(r2)
            com.android.dx.rop.code.BasicBlock r6 = new com.android.dx.rop.code.BasicBlock
            r8 = -6
            int r8 = r10.getSpecialLabel(r8)
            com.android.dx.util.IntList r9 = com.android.dx.util.IntList.makeImmutable(r2)
            r6.<init>(r8, r4, r9, r2)
            com.android.dx.util.IntList r4 = com.android.dx.util.IntList.EMPTY
            r10.addBlock(r6, r4)
            com.android.dx.rop.code.InsnList r6 = new com.android.dx.rop.code.InsnList
            r6.<init>(r5)
            com.android.dx.rop.code.ThrowingInsn r5 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.code.Rop r8 = com.android.dx.rop.code.Rops.THROW
            com.android.dx.rop.code.RegisterSpecList r3 = com.android.dx.rop.code.RegisterSpecList.make(r3)
            r5.<init>(r8, r0, r3, r7)
            r6.set(r1, r5)
            r6.setImmutable()
            com.android.dx.rop.code.BasicBlock r0 = new com.android.dx.rop.code.BasicBlock
            r1 = -1
            r0.<init>(r2, r6, r4, r1)
            r10.addBlock(r0, r4)
            return
    }

    public static com.android.dx.rop.code.RopMethod convert(com.android.dx.cf.code.ConcreteMethod r1, com.android.dx.rop.code.TranslationAdvice r2, com.android.dx.cf.iface.MethodList r3, com.android.dx.dex.DexOptions r4) {
            com.android.dx.cf.code.Ropper r0 = new com.android.dx.cf.code.Ropper     // Catch: com.android.dx.cf.code.SimException -> Ld
            r0.<init>(r1, r2, r3, r4)     // Catch: com.android.dx.cf.code.SimException -> Ld
            r0.doit()     // Catch: com.android.dx.cf.code.SimException -> Ld
            com.android.dx.rop.code.RopMethod r1 = r0.getRopMethod()     // Catch: com.android.dx.cf.code.SimException -> Ld
            return r1
        Ld:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "...while working on method "
            r3.append(r4)
            com.android.dx.rop.cst.CstNat r1 = r1.getNat()
            java.lang.String r1 = r1.toHuman()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.addContext(r1)
            throw r2
    }

    private void deleteUnreachableBlocks() {
            r3 = this;
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r1 = r3.result
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.ArrayList<com.android.dx.util.IntList> r1 = r3.resultSubroutines
            r1.clear()
            r1 = -1
            int r1 = r3.getSpecialLabel(r1)
            com.android.dx.cf.code.Ropper$2 r2 = new com.android.dx.cf.code.Ropper$2
            r2.<init>(r3, r0)
            r3.forEachNonSubBlockDepthFirst(r1, r2)
            r0.sort()
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r1 = r3.result
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L28:
            if (r1 < 0) goto L44
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r2 = r3.result
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.rop.code.BasicBlock r2 = (com.android.dx.rop.code.BasicBlock) r2
            int r2 = r2.getLabel()
            int r2 = r0.indexOf(r2)
            if (r2 >= 0) goto L41
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r2 = r3.result
            r2.remove(r1)
        L41:
            int r1 = r1 + (-1)
            goto L28
        L44:
            return
    }

    private void doit() {
            r5 = this;
            int r0 = r5.maxLabel
            int[] r0 = com.android.dx.util.Bits.makeBitSet(r0)
            r1 = 0
            com.android.dx.util.Bits.set(r0, r1)
            r5.addSetupBlocks()
            r5.setFirstFrame()
        L10:
            int r2 = com.android.dx.util.Bits.findFirst(r0, r1)
            if (r2 >= 0) goto L27
            r5.addReturnBlock()
            r5.addSynchExceptionHandlerBlock()
            r5.addExceptionSetupBlocks()
            boolean r0 = r5.hasSubroutines
            if (r0 == 0) goto L26
            r5.inlineSubroutines()
        L26:
            return
        L27:
            com.android.dx.util.Bits.clear(r0, r2)
            com.android.dx.cf.code.ByteBlockList r3 = r5.blocks
            com.android.dx.cf.code.ByteBlock r3 = r3.labelToBlock(r2)
            com.android.dx.cf.code.Frame[] r4 = r5.startFrames
            r4 = r4[r2]
            r5.processBlock(r3, r4, r0)     // Catch: com.android.dx.cf.code.SimException -> L38
            goto L10
        L38:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "...while working on block "
            r1.append(r3)
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addContext(r1)
            throw r0
    }

    private com.android.dx.rop.code.InsnList filterMoveReturnAddressInsns(com.android.dx.rop.code.InsnList r8) {
            r7 = this;
            int r0 = r8.size()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L1a
            com.android.dx.rop.code.Insn r4 = r8.get(r2)
            com.android.dx.rop.code.Rop r4 = r4.getOpcode()
            com.android.dx.rop.code.Rop r5 = com.android.dx.rop.code.Rops.MOVE_RETURN_ADDRESS
            if (r4 == r5) goto L17
            int r3 = r3 + 1
        L17:
            int r2 = r2 + 1
            goto L7
        L1a:
            if (r3 != r0) goto L1d
            return r8
        L1d:
            com.android.dx.rop.code.InsnList r2 = new com.android.dx.rop.code.InsnList
            r2.<init>(r3)
            r3 = r1
        L23:
            if (r1 >= r0) goto L3a
            com.android.dx.rop.code.Insn r4 = r8.get(r1)
            com.android.dx.rop.code.Rop r5 = r4.getOpcode()
            com.android.dx.rop.code.Rop r6 = com.android.dx.rop.code.Rops.MOVE_RETURN_ADDRESS
            if (r5 == r6) goto L37
            int r5 = r3 + 1
            r2.set(r3, r4)
            r3 = r5
        L37:
            int r1 = r1 + 1
            goto L23
        L3a:
            r2.setImmutable()
            return r2
    }

    private void forEachNonSubBlockDepthFirst(int r3, com.android.dx.rop.code.BasicBlock.Visitor r4) {
            r2 = this;
            com.android.dx.rop.code.BasicBlock r3 = r2.labelToBlock(r3)
            java.util.BitSet r0 = new java.util.BitSet
            int r1 = r2.maxLabel
            r0.<init>(r1)
            r2.forEachNonSubBlockDepthFirst0(r3, r4, r0)
            return
    }

    private void forEachNonSubBlockDepthFirst0(com.android.dx.rop.code.BasicBlock r6, com.android.dx.rop.code.BasicBlock.Visitor r7, java.util.BitSet r8) {
            r5 = this;
            r7.visitBlock(r6)
            int r0 = r6.getLabel()
            r8.set(r0)
            com.android.dx.util.IntList r0 = r6.getSuccessors()
            int r1 = r0.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L3d
            int r3 = r0.get(r2)
            boolean r4 = r8.get(r3)
            if (r4 == 0) goto L20
            goto L3a
        L20:
            boolean r4 = r5.isSubroutineCaller(r6)
            if (r4 == 0) goto L29
            if (r2 <= 0) goto L29
            goto L3a
        L29:
            int r3 = r5.labelToResultIndex(r3)
            if (r3 < 0) goto L3a
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r4 = r5.result
            java.lang.Object r3 = r4.get(r3)
            com.android.dx.rop.code.BasicBlock r3 = (com.android.dx.rop.code.BasicBlock) r3
            r5.forEachNonSubBlockDepthFirst0(r3, r7, r8)
        L3a:
            int r2 = r2 + 1
            goto L13
        L3d:
            return
    }

    private int getAvailableLabel() {
            r3 = this;
            int r0 = r3.getMinimumUnreservedLabel()
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r1 = r3.result
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            com.android.dx.rop.code.BasicBlock r2 = (com.android.dx.rop.code.BasicBlock) r2
            int r2 = r2.getLabel()
            if (r2 < r0) goto La
            int r2 = r2 + 1
            r0 = r2
            goto La
        L20:
            return r0
    }

    private int getMinimumUnreservedLabel() {
            r2 = this;
            int r0 = r2.maxLabel
            com.android.dx.cf.code.ConcreteMethod r1 = r2.method
            com.android.dx.cf.code.ByteCatchList r1 = r1.getCatches()
            int r1 = r1.size()
            int r0 = r0 + r1
            int r0 = r0 + 7
            return r0
    }

    private int getNormalRegCount() {
            r2 = this;
            int r0 = r2.maxLocals
            com.android.dx.cf.code.ConcreteMethod r1 = r2.method
            int r1 = r1.getMaxStack()
            int r0 = r0 + r1
            return r0
    }

    private com.android.dx.rop.code.RopMethod getRopMethod() {
            r4 = this;
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r0 = r4.result
            int r0 = r0.size()
            com.android.dx.rop.code.BasicBlockList r1 = new com.android.dx.rop.code.BasicBlockList
            r1.<init>(r0)
            r2 = 0
        Lc:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r3 = r4.result
            java.lang.Object r3 = r3.get(r2)
            com.android.dx.rop.code.BasicBlock r3 = (com.android.dx.rop.code.BasicBlock) r3
            r1.set(r2, r3)
            int r2 = r2 + 1
            goto Lc
        L1c:
            r1.setImmutable()
            com.android.dx.rop.code.RopMethod r0 = new com.android.dx.rop.code.RopMethod
            r2 = -1
            int r2 = r4.getSpecialLabel(r2)
            r0.<init>(r1, r2)
            return r0
    }

    private int getSpecialLabel(int r3) {
            r2 = this;
            int r0 = r2.maxLabel
            com.android.dx.cf.code.ConcreteMethod r1 = r2.method
            com.android.dx.cf.code.ByteCatchList r1 = r1.getCatches()
            int r1 = r1.size()
            int r0 = r0 + r1
            int r3 = ~r3
            int r0 = r0 + r3
            return r0
    }

    private com.android.dx.rop.code.RegisterSpec getSynchReg() {
            r2 = this;
            int r0 = r2.getNormalRegCount()
            r1 = 1
            if (r0 >= r1) goto L8
            r0 = r1
        L8:
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.OBJECT
            com.android.dx.rop.code.RegisterSpec r0 = com.android.dx.rop.code.RegisterSpec.make(r0, r1)
            return r0
    }

    private void inlineSubroutines() {
            r8 = this;
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            r1 = 4
            r0.<init>(r1)
            com.android.dx.cf.code.Ropper$1 r1 = new com.android.dx.cf.code.Ropper$1
            r1.<init>(r8, r0)
            r2 = 0
            r8.forEachNonSubBlockDepthFirst(r2, r1)
            int r1 = r8.getAvailableLabel()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r4 = r2
        L19:
            if (r4 >= r1) goto L22
            r5 = 0
            r3.add(r5)
            int r4 = r4 + 1
            goto L19
        L22:
            r1 = r2
        L23:
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r4 = r8.result
            int r4 = r4.size()
            if (r1 >= r4) goto L48
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r4 = r8.result
            java.lang.Object r4 = r4.get(r1)
            com.android.dx.rop.code.BasicBlock r4 = (com.android.dx.rop.code.BasicBlock) r4
            if (r4 != 0) goto L36
            goto L45
        L36:
            java.util.ArrayList<com.android.dx.util.IntList> r5 = r8.resultSubroutines
            java.lang.Object r5 = r5.get(r1)
            com.android.dx.util.IntList r5 = (com.android.dx.util.IntList) r5
            int r4 = r4.getLabel()
            r3.set(r4, r5)
        L45:
            int r1 = r1 + 1
            goto L23
        L48:
            int r1 = r0.size()
        L4c:
            if (r2 >= r1) goto L6a
            int r4 = r0.get(r2)
            com.android.dx.cf.code.Ropper$SubroutineInliner r5 = new com.android.dx.cf.code.Ropper$SubroutineInliner
            com.android.dx.cf.code.Ropper$LabelAllocator r6 = new com.android.dx.cf.code.Ropper$LabelAllocator
            int r7 = r8.getAvailableLabel()
            r6.<init>(r7)
            r5.<init>(r8, r6, r3)
            com.android.dx.rop.code.BasicBlock r4 = r8.labelToBlock(r4)
            r5.inlineSubroutineCalledFrom(r4)
            int r2 = r2 + 1
            goto L4c
        L6a:
            r8.deleteUnreachableBlocks()
            return
    }

    private boolean isStatic() {
            r1 = this;
            com.android.dx.cf.code.ConcreteMethod r0 = r1.method
            int r0 = r0.getAccessFlags()
            r0 = r0 & 8
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private boolean isSubroutineCaller(com.android.dx.rop.code.BasicBlock r5) {
            r4 = this;
            com.android.dx.util.IntList r5 = r5.getSuccessors()
            int r0 = r5.size()
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto Ld
            return r2
        Ld:
            r0 = 1
            int r5 = r5.get(r0)
            com.android.dx.cf.code.Ropper$Subroutine[] r1 = r4.subroutines
            int r3 = r1.length
            if (r5 >= r3) goto L1c
            r5 = r1[r5]
            if (r5 == 0) goto L1c
            r2 = r0
        L1c:
            return r2
    }

    private boolean isSynchronized() {
            r1 = this;
            com.android.dx.cf.code.ConcreteMethod r0 = r1.method
            int r0 = r0.getAccessFlags()
            r0 = r0 & 32
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private com.android.dx.rop.code.BasicBlock labelToBlock(int r4) {
            r3 = this;
            int r0 = r3.labelToResultIndex(r4)
            if (r0 < 0) goto Lf
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r4 = r3.result
            java.lang.Object r4 = r4.get(r0)
            com.android.dx.rop.code.BasicBlock r4 = (com.android.dx.rop.code.BasicBlock) r4
            return r4
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such label "
            r1.append(r2)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private int labelToResultIndex(int r4) {
            r3 = this;
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r0 = r3.result
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1b
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r2 = r3.result
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.rop.code.BasicBlock r2 = (com.android.dx.rop.code.BasicBlock) r2
            int r2 = r2.getLabel()
            if (r2 != r4) goto L18
            return r1
        L18:
            int r1 = r1 + 1
            goto L7
        L1b:
            r4 = -1
            return r4
    }

    private void mergeAndWorkAsNecessary(int r3, int r4, com.android.dx.cf.code.Ropper.Subroutine r5, com.android.dx.cf.code.Frame r6, int[] r7) {
            r2 = this;
            com.android.dx.cf.code.Frame[] r0 = r2.startFrames
            r1 = r0[r3]
            if (r1 == 0) goto L1f
            if (r5 == 0) goto L11
            int r5 = r5.getStartBlock()
            com.android.dx.cf.code.Frame r4 = r1.mergeWithSubroutineCaller(r6, r5, r4)
            goto L15
        L11:
            com.android.dx.cf.code.Frame r4 = r1.mergeWith(r6)
        L15:
            if (r4 == r1) goto L2d
            com.android.dx.cf.code.Frame[] r5 = r2.startFrames
            r5[r3] = r4
            com.android.dx.util.Bits.set(r7, r3)
            goto L2d
        L1f:
            if (r5 == 0) goto L28
            com.android.dx.cf.code.Frame r4 = r6.makeNewSubroutineStartFrame(r3, r4)
            r0[r3] = r4
            goto L2a
        L28:
            r0[r3] = r6
        L2a:
            com.android.dx.util.Bits.set(r7, r3)
        L2d:
            return
    }

    private void processBlock(com.android.dx.cf.code.ByteBlock r25, com.android.dx.cf.code.Frame r26, int[] r27) {
            r24 = this;
            r7 = r24
            com.android.dx.cf.code.ByteCatchList r0 = r25.getCatches()
            com.android.dx.cf.code.RopperMachine r1 = r7.machine
            com.android.dx.rop.type.TypeList r2 = r0.toRopCatchList()
            r1.startBlock(r2)
            com.android.dx.cf.code.Frame r8 = r26.copy()
            com.android.dx.cf.code.Simulator r1 = r7.sim
            r9 = r25
            r1.simulate(r9, r8)
            r8.setImmutable()
            com.android.dx.cf.code.RopperMachine r1 = r7.machine
            int r10 = r1.getExtraBlockCount()
            com.android.dx.cf.code.RopperMachine r1 = r7.machine
            java.util.ArrayList r11 = r1.getInsns()
            int r12 = r11.size()
            int r13 = r0.size()
            com.android.dx.util.IntList r1 = r25.getSuccessors()
            com.android.dx.cf.code.RopperMachine r2 = r7.machine
            boolean r2 = r2.hasJsr()
            r15 = 1
            r6 = 0
            if (r2 == 0) goto L66
            int r2 = r1.get(r15)
            com.android.dx.cf.code.Ropper$Subroutine[] r3 = r7.subroutines
            r4 = r3[r2]
            if (r4 != 0) goto L50
            com.android.dx.cf.code.Ropper$Subroutine r4 = new com.android.dx.cf.code.Ropper$Subroutine
            r4.<init>(r7, r2)
            r3[r2] = r4
        L50:
            com.android.dx.cf.code.Ropper$Subroutine[] r3 = r7.subroutines
            r3 = r3[r2]
            int r4 = r25.getLabel()
            r3.addCallerBlock(r4)
            com.android.dx.cf.code.Ropper$Subroutine[] r3 = r7.subroutines
            r2 = r3[r2]
            r5 = r27
            r4 = r1
            r16 = r2
            r1 = r15
            goto Lbd
        L66:
            com.android.dx.cf.code.RopperMachine r2 = r7.machine
            boolean r2 = r2.hasRet()
            if (r2 == 0) goto Laa
            com.android.dx.cf.code.RopperMachine r1 = r7.machine
            com.android.dx.cf.code.ReturnAddress r1 = r1.getReturnAddress()
            int r1 = r1.getSubroutineAddress()
            com.android.dx.cf.code.Ropper$Subroutine[] r2 = r7.subroutines
            r3 = r2[r1]
            if (r3 != 0) goto L8a
            com.android.dx.cf.code.Ropper$Subroutine r3 = new com.android.dx.cf.code.Ropper$Subroutine
            int r4 = r25.getLabel()
            r3.<init>(r7, r1, r4)
            r2[r1] = r3
            goto L91
        L8a:
            int r2 = r25.getLabel()
            r3.addRetBlock(r2)
        L91:
            com.android.dx.cf.code.Ropper$Subroutine[] r2 = r7.subroutines
            r2 = r2[r1]
            com.android.dx.util.IntList r2 = r2.getSuccessors()
            com.android.dx.cf.code.Ropper$Subroutine[] r3 = r7.subroutines
            r1 = r3[r1]
            r5 = r27
            r1.mergeToSuccessors(r8, r5)
            int r1 = r2.size()
            r4 = r2
            r16 = r6
            goto Lbd
        Laa:
            r5 = r27
            com.android.dx.cf.code.RopperMachine r2 = r7.machine
            boolean r2 = r2.wereCatchesUsed()
            if (r2 == 0) goto Lb9
            r4 = r1
            r16 = r6
            r1 = r13
            goto Lbd
        Lb9:
            r4 = r1
            r16 = r6
            r1 = 0
        Lbd:
            int r3 = r4.size()
            r2 = r1
        Lc2:
            if (r2 >= r3) goto L105
            int r17 = r4.get(r2)
            int r18 = r25.getLabel()     // Catch: com.android.dx.cf.code.SimException -> Leb
            r1 = r24
            r19 = r2
            r2 = r17
            r20 = r3
            r3 = r18
            r18 = r4
            r4 = r16
            r5 = r8
            r14 = r6
            r6 = r27
            r1.mergeAndWorkAsNecessary(r2, r3, r4, r5, r6)     // Catch: com.android.dx.cf.code.SimException -> Leb
            int r2 = r19 + 1
            r5 = r27
            r6 = r14
            r4 = r18
            r3 = r20
            goto Lc2
        Leb:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "...while merging to block "
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u2(r17)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addContext(r1)
            throw r0
        L105:
            r20 = r3
            r18 = r4
            r14 = r6
            if (r20 != 0) goto L11f
            com.android.dx.cf.code.RopperMachine r1 = r7.machine
            boolean r1 = r1.returns()
            if (r1 == 0) goto L11f
            r1 = -2
            int r1 = r7.getSpecialLabel(r1)
            com.android.dx.util.IntList r4 = com.android.dx.util.IntList.makeImmutable(r1)
            r3 = r15
            goto L123
        L11f:
            r4 = r18
            r3 = r20
        L123:
            if (r3 != 0) goto L128
            r1 = -1
        L126:
            r6 = r1
            goto L135
        L128:
            com.android.dx.cf.code.RopperMachine r1 = r7.machine
            int r1 = r1.getPrimarySuccessorIndex()
            if (r1 < 0) goto L126
            int r1 = r4.get(r1)
            goto L126
        L135:
            boolean r1 = r24.isSynchronized()
            if (r1 == 0) goto L146
            com.android.dx.cf.code.RopperMachine r1 = r7.machine
            boolean r1 = r1.canThrow()
            if (r1 == 0) goto L146
            r16 = r15
            goto L148
        L146:
            r16 = 0
        L148:
            if (r16 != 0) goto L150
            if (r13 == 0) goto L14d
            goto L150
        L14d:
            r1 = r6
            goto L209
        L150:
            com.android.dx.util.IntList r5 = new com.android.dx.util.IntList
            r5.<init>(r3)
            r1 = 0
            r4 = 0
        L157:
            if (r4 >= r13) goto L1cf
            com.android.dx.cf.code.ByteCatchList$Item r2 = r0.get(r4)
            com.android.dx.rop.cst.CstType r3 = r2.getExceptionClass()
            int r17 = r2.getHandlerPc()
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.OBJECT
            if (r3 != r2) goto L16b
            r2 = r15
            goto L16c
        L16b:
            r2 = 0
        L16c:
            r18 = r1 | r2
            com.android.dx.cf.code.Frame r19 = r8.makeExceptionHandlerStartFrame(r3)
            int r20 = r25.getLabel()     // Catch: com.android.dx.cf.code.SimException -> L1b5
            r21 = 0
            r1 = r24
            r2 = r17
            r22 = r3
            r3 = r20
            r20 = r4
            r4 = r21
            r15 = r5
            r5 = r19
            r23 = r6
            r6 = r27
            r1.mergeAndWorkAsNecessary(r2, r3, r4, r5, r6)     // Catch: com.android.dx.cf.code.SimException -> L1b5
            com.android.dx.cf.code.Ropper$CatchInfo[] r1 = r7.catchInfos
            r1 = r1[r17]
            if (r1 != 0) goto L19d
            com.android.dx.cf.code.Ropper$CatchInfo r1 = new com.android.dx.cf.code.Ropper$CatchInfo
            r1.<init>(r7, r14)
            com.android.dx.cf.code.Ropper$CatchInfo[] r2 = r7.catchInfos
            r2[r17] = r1
        L19d:
            com.android.dx.rop.type.Type r2 = r22.getClassType()
            com.android.dx.cf.code.Ropper$ExceptionHandlerSetup r1 = r1.getSetup(r2)
            int r1 = r1.getLabel()
            r15.add(r1)
            int r4 = r20 + 1
            r5 = r15
            r1 = r18
            r6 = r23
            r15 = 1
            goto L157
        L1b5:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "...while merging exception to block "
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u2(r17)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addContext(r1)
            throw r0
        L1cf:
            r15 = r5
            r23 = r6
            if (r16 == 0) goto L1fe
            if (r1 != 0) goto L1fe
            r0 = -6
            int r0 = r7.getSpecialLabel(r0)
            r15.add(r0)
            r0 = 1
            r7.synchNeedsExceptionHandler = r0
            int r1 = r12 - r10
            int r1 = r1 - r0
        L1e4:
            if (r1 >= r12) goto L1fe
            java.lang.Object r0 = r11.get(r1)
            com.android.dx.rop.code.Insn r0 = (com.android.dx.rop.code.Insn) r0
            boolean r2 = r0.canThrow()
            if (r2 == 0) goto L1fb
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.OBJECT
            com.android.dx.rop.code.Insn r0 = r0.withAddedCatch(r2)
            r11.set(r1, r0)
        L1fb:
            int r1 = r1 + 1
            goto L1e4
        L1fe:
            r1 = r23
            if (r1 < 0) goto L205
            r15.add(r1)
        L205:
            r15.setImmutable()
            r4 = r15
        L209:
            int r0 = r4.indexOf(r1)
            r6 = r1
        L20e:
            if (r10 <= 0) goto L26e
            int r12 = r12 + (-1)
            java.lang.Object r1 = r11.get(r12)
            com.android.dx.rop.code.Insn r1 = (com.android.dx.rop.code.Insn) r1
            com.android.dx.rop.code.Rop r2 = r1.getOpcode()
            int r2 = r2.getBranchingness()
            r3 = 1
            if (r2 != r3) goto L225
            r2 = 1
            goto L226
        L225:
            r2 = 0
        L226:
            com.android.dx.rop.code.InsnList r3 = new com.android.dx.rop.code.InsnList
            if (r2 == 0) goto L22c
            r5 = 2
            goto L22d
        L22c:
            r5 = 1
        L22d:
            r3.<init>(r5)
            r5 = 0
            r3.set(r5, r1)
            if (r2 == 0) goto L24c
            com.android.dx.rop.code.PlainInsn r2 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r13 = com.android.dx.rop.code.Rops.GOTO
            com.android.dx.rop.code.SourcePosition r1 = r1.getPosition()
            com.android.dx.rop.code.RegisterSpecList r15 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r2.<init>(r13, r1, r14, r15)
            r1 = 1
            r3.set(r1, r2)
            com.android.dx.util.IntList r1 = com.android.dx.util.IntList.makeImmutable(r6)
            goto L24d
        L24c:
            r1 = r4
        L24d:
            r3.setImmutable()
            int r2 = r24.getAvailableLabel()
            com.android.dx.rop.code.BasicBlock r13 = new com.android.dx.rop.code.BasicBlock
            r13.<init>(r2, r3, r1, r6)
            com.android.dx.util.IntList r1 = r8.getSubroutines()
            r7.addBlock(r13, r1)
            com.android.dx.util.IntList r4 = r4.mutableCopy()
            r4.set(r0, r2)
            r4.setImmutable()
            int r10 = r10 + (-1)
            r6 = r2
            goto L20e
        L26e:
            r5 = 0
            if (r12 != 0) goto L273
            r0 = r14
            goto L27b
        L273:
            int r0 = r12 + (-1)
            java.lang.Object r0 = r11.get(r0)
            com.android.dx.rop.code.Insn r0 = (com.android.dx.rop.code.Insn) r0
        L27b:
            if (r0 == 0) goto L288
            com.android.dx.rop.code.Rop r1 = r0.getOpcode()
            int r1 = r1.getBranchingness()
            r2 = 1
            if (r1 != r2) goto L29f
        L288:
            if (r0 != 0) goto L28d
            com.android.dx.rop.code.SourcePosition r0 = com.android.dx.rop.code.SourcePosition.NO_INFO
            goto L291
        L28d:
            com.android.dx.rop.code.SourcePosition r0 = r0.getPosition()
        L291:
            com.android.dx.rop.code.PlainInsn r1 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r2 = com.android.dx.rop.code.Rops.GOTO
            com.android.dx.rop.code.RegisterSpecList r3 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r1.<init>(r2, r0, r14, r3)
            r11.add(r1)
            int r12 = r12 + 1
        L29f:
            com.android.dx.rop.code.InsnList r0 = new com.android.dx.rop.code.InsnList
            r0.<init>(r12)
            r14 = r5
        L2a5:
            if (r14 >= r12) goto L2b3
            java.lang.Object r1 = r11.get(r14)
            com.android.dx.rop.code.Insn r1 = (com.android.dx.rop.code.Insn) r1
            r0.set(r14, r1)
            int r14 = r14 + 1
            goto L2a5
        L2b3:
            r0.setImmutable()
            com.android.dx.rop.code.BasicBlock r1 = new com.android.dx.rop.code.BasicBlock
            int r2 = r25.getLabel()
            r1.<init>(r2, r0, r4, r6)
            com.android.dx.util.IntList r0 = r8.getSubroutines()
            r7.addOrReplaceBlock(r1, r0)
            return
    }

    private void removeBlockAndSpecialSuccessors(int r6) {
            r5 = this;
            int r0 = r5.getMinimumUnreservedLabel()
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r1 = r5.result
            java.lang.Object r1 = r1.get(r6)
            com.android.dx.rop.code.BasicBlock r1 = (com.android.dx.rop.code.BasicBlock) r1
            com.android.dx.util.IntList r1 = r1.getSuccessors()
            int r2 = r1.size()
            java.util.ArrayList<com.android.dx.rop.code.BasicBlock> r3 = r5.result
            r3.remove(r6)
            java.util.ArrayList<com.android.dx.util.IntList> r3 = r5.resultSubroutines
            r3.remove(r6)
            r6 = 0
        L1f:
            if (r6 >= r2) goto L4f
            int r3 = r1.get(r6)
            if (r3 < r0) goto L4c
            int r4 = r5.labelToResultIndex(r3)
            if (r4 < 0) goto L31
            r5.removeBlockAndSpecialSuccessors(r4)
            goto L4c
        L31:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid label "
            r0.append(r1)
            java.lang.String r1 = com.android.dx.util.Hex.u2(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4c:
            int r6 = r6 + 1
            goto L1f
        L4f:
            return
    }

    private void setFirstFrame() {
            r3 = this;
            com.android.dx.cf.code.ConcreteMethod r0 = r3.method
            com.android.dx.rop.type.Prototype r0 = r0.getEffectiveDescriptor()
            com.android.dx.cf.code.Frame[] r1 = r3.startFrames
            r2 = 0
            r1 = r1[r2]
            com.android.dx.rop.type.StdTypeList r0 = r0.getParameterTypes()
            r1.initializeWithParameters(r0)
            com.android.dx.cf.code.Frame[] r0 = r3.startFrames
            r0 = r0[r2]
            r0.setImmutable()
            return
    }

    private com.android.dx.cf.code.Ropper.Subroutine subroutineFromRetBlock(int r4) {
            r3 = this;
            com.android.dx.cf.code.Ropper$Subroutine[] r0 = r3.subroutines
            int r0 = r0.length
            int r0 = r0 + (-1)
        L5:
            if (r0 < 0) goto L1b
            com.android.dx.cf.code.Ropper$Subroutine[] r1 = r3.subroutines
            r1 = r1[r0]
            if (r1 == 0) goto L18
            java.util.BitSet r2 = com.android.dx.cf.code.Ropper.Subroutine.access$1300(r1)
            boolean r2 = r2.get(r4)
            if (r2 == 0) goto L18
            return r1
        L18:
            int r0 = r0 + (-1)
            goto L5
        L1b:
            r4 = 0
            return r4
    }

    public int getFirstTempStackReg() {
            r2 = this;
            int r0 = r2.getNormalRegCount()
            boolean r1 = r2.isSynchronized()
            if (r1 == 0) goto Lc
            int r0 = r0 + 1
        Lc:
            return r0
    }
}
