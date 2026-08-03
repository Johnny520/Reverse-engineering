package com.android.dx.merge;

/* JADX INFO: loaded from: classes.dex */
final class InstructionTransformer {
    private com.android.dx.merge.IndexMap indexMap;
    private int mappedAt;
    private com.android.dx.io.instructions.DecodedInstruction[] mappedInstructions;
    private final com.android.dx.io.CodeReader reader;

    /* JADX INFO: renamed from: com.android.dx.merge.InstructionTransformer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class CallSiteVisitor implements com.android.dx.io.CodeReader.Visitor {
        final /* synthetic */ com.android.dx.merge.InstructionTransformer this$0;

        private CallSiteVisitor(com.android.dx.merge.InstructionTransformer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ CallSiteVisitor(com.android.dx.merge.InstructionTransformer r1, com.android.dx.merge.InstructionTransformer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.io.CodeReader.Visitor
        public void visit(com.android.dx.io.instructions.DecodedInstruction[] r3, com.android.dx.io.instructions.DecodedInstruction r4) {
                r2 = this;
                int r3 = r4.getIndex()
                com.android.dx.merge.InstructionTransformer r0 = r2.this$0
                com.android.dx.merge.IndexMap r0 = com.android.dx.merge.InstructionTransformer.access$900(r0)
                int r3 = r0.adjustCallSite(r3)
                com.android.dx.merge.InstructionTransformer r0 = r2.this$0
                com.android.dx.io.instructions.DecodedInstruction[] r0 = com.android.dx.merge.InstructionTransformer.access$700(r0)
                com.android.dx.merge.InstructionTransformer r1 = r2.this$0
                int r1 = com.android.dx.merge.InstructionTransformer.access$808(r1)
                com.android.dx.io.instructions.DecodedInstruction r3 = r4.withIndex(r3)
                r0[r1] = r3
                return
        }
    }

    public class FieldVisitor implements com.android.dx.io.CodeReader.Visitor {
        final /* synthetic */ com.android.dx.merge.InstructionTransformer this$0;

        private FieldVisitor(com.android.dx.merge.InstructionTransformer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ FieldVisitor(com.android.dx.merge.InstructionTransformer r1, com.android.dx.merge.InstructionTransformer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.io.CodeReader.Visitor
        public void visit(com.android.dx.io.instructions.DecodedInstruction[] r3, com.android.dx.io.instructions.DecodedInstruction r4) {
                r2 = this;
                int r3 = r4.getIndex()
                com.android.dx.merge.InstructionTransformer r0 = r2.this$0
                com.android.dx.merge.IndexMap r0 = com.android.dx.merge.InstructionTransformer.access$900(r0)
                int r3 = r0.adjustField(r3)
                int r0 = r4.getOpcode()
                r1 = 27
                if (r0 != r1) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                com.android.dx.merge.InstructionTransformer.access$1000(r0, r3)
                com.android.dx.merge.InstructionTransformer r0 = r2.this$0
                com.android.dx.io.instructions.DecodedInstruction[] r0 = com.android.dx.merge.InstructionTransformer.access$700(r0)
                com.android.dx.merge.InstructionTransformer r1 = r2.this$0
                int r1 = com.android.dx.merge.InstructionTransformer.access$808(r1)
                com.android.dx.io.instructions.DecodedInstruction r3 = r4.withIndex(r3)
                r0[r1] = r3
                return
        }
    }

    public class GenericVisitor implements com.android.dx.io.CodeReader.Visitor {
        final /* synthetic */ com.android.dx.merge.InstructionTransformer this$0;

        private GenericVisitor(com.android.dx.merge.InstructionTransformer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ GenericVisitor(com.android.dx.merge.InstructionTransformer r1, com.android.dx.merge.InstructionTransformer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.io.CodeReader.Visitor
        public void visit(com.android.dx.io.instructions.DecodedInstruction[] r2, com.android.dx.io.instructions.DecodedInstruction r3) {
                r1 = this;
                com.android.dx.merge.InstructionTransformer r2 = r1.this$0
                com.android.dx.io.instructions.DecodedInstruction[] r2 = com.android.dx.merge.InstructionTransformer.access$700(r2)
                com.android.dx.merge.InstructionTransformer r0 = r1.this$0
                int r0 = com.android.dx.merge.InstructionTransformer.access$808(r0)
                r2[r0] = r3
                return
        }
    }

    public class MethodAndProtoVisitor implements com.android.dx.io.CodeReader.Visitor {
        final /* synthetic */ com.android.dx.merge.InstructionTransformer this$0;

        private MethodAndProtoVisitor(com.android.dx.merge.InstructionTransformer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ MethodAndProtoVisitor(com.android.dx.merge.InstructionTransformer r1, com.android.dx.merge.InstructionTransformer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.io.CodeReader.Visitor
        public void visit(com.android.dx.io.instructions.DecodedInstruction[] r5, com.android.dx.io.instructions.DecodedInstruction r6) {
                r4 = this;
                int r5 = r6.getIndex()
                short r0 = r6.getProtoIndex()
                com.android.dx.merge.InstructionTransformer r1 = r4.this$0
                com.android.dx.io.instructions.DecodedInstruction[] r1 = com.android.dx.merge.InstructionTransformer.access$700(r1)
                com.android.dx.merge.InstructionTransformer r2 = r4.this$0
                int r2 = com.android.dx.merge.InstructionTransformer.access$808(r2)
                com.android.dx.merge.InstructionTransformer r3 = r4.this$0
                com.android.dx.merge.IndexMap r3 = com.android.dx.merge.InstructionTransformer.access$900(r3)
                int r5 = r3.adjustMethod(r5)
                com.android.dx.merge.InstructionTransformer r3 = r4.this$0
                com.android.dx.merge.IndexMap r3 = com.android.dx.merge.InstructionTransformer.access$900(r3)
                int r0 = r3.adjustProto(r0)
                com.android.dx.io.instructions.DecodedInstruction r5 = r6.withProtoIndex(r5, r0)
                r1[r2] = r5
                return
        }
    }

    public class MethodVisitor implements com.android.dx.io.CodeReader.Visitor {
        final /* synthetic */ com.android.dx.merge.InstructionTransformer this$0;

        private MethodVisitor(com.android.dx.merge.InstructionTransformer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ MethodVisitor(com.android.dx.merge.InstructionTransformer r1, com.android.dx.merge.InstructionTransformer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.io.CodeReader.Visitor
        public void visit(com.android.dx.io.instructions.DecodedInstruction[] r3, com.android.dx.io.instructions.DecodedInstruction r4) {
                r2 = this;
                int r3 = r4.getIndex()
                com.android.dx.merge.InstructionTransformer r0 = r2.this$0
                com.android.dx.merge.IndexMap r0 = com.android.dx.merge.InstructionTransformer.access$900(r0)
                int r3 = r0.adjustMethod(r3)
                int r0 = r4.getOpcode()
                r1 = 27
                if (r0 != r1) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                com.android.dx.merge.InstructionTransformer.access$1000(r0, r3)
                com.android.dx.merge.InstructionTransformer r0 = r2.this$0
                com.android.dx.io.instructions.DecodedInstruction[] r0 = com.android.dx.merge.InstructionTransformer.access$700(r0)
                com.android.dx.merge.InstructionTransformer r1 = r2.this$0
                int r1 = com.android.dx.merge.InstructionTransformer.access$808(r1)
                com.android.dx.io.instructions.DecodedInstruction r3 = r4.withIndex(r3)
                r0[r1] = r3
                return
        }
    }

    public class StringVisitor implements com.android.dx.io.CodeReader.Visitor {
        final /* synthetic */ com.android.dx.merge.InstructionTransformer this$0;

        private StringVisitor(com.android.dx.merge.InstructionTransformer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ StringVisitor(com.android.dx.merge.InstructionTransformer r1, com.android.dx.merge.InstructionTransformer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.io.CodeReader.Visitor
        public void visit(com.android.dx.io.instructions.DecodedInstruction[] r3, com.android.dx.io.instructions.DecodedInstruction r4) {
                r2 = this;
                int r3 = r4.getIndex()
                com.android.dx.merge.InstructionTransformer r0 = r2.this$0
                com.android.dx.merge.IndexMap r0 = com.android.dx.merge.InstructionTransformer.access$900(r0)
                int r3 = r0.adjustString(r3)
                int r0 = r4.getOpcode()
                r1 = 27
                if (r0 != r1) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                com.android.dx.merge.InstructionTransformer.access$1000(r0, r3)
                com.android.dx.merge.InstructionTransformer r0 = r2.this$0
                com.android.dx.io.instructions.DecodedInstruction[] r0 = com.android.dx.merge.InstructionTransformer.access$700(r0)
                com.android.dx.merge.InstructionTransformer r1 = r2.this$0
                int r1 = com.android.dx.merge.InstructionTransformer.access$808(r1)
                com.android.dx.io.instructions.DecodedInstruction r3 = r4.withIndex(r3)
                r0[r1] = r3
                return
        }
    }

    public class TypeVisitor implements com.android.dx.io.CodeReader.Visitor {
        final /* synthetic */ com.android.dx.merge.InstructionTransformer this$0;

        private TypeVisitor(com.android.dx.merge.InstructionTransformer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ TypeVisitor(com.android.dx.merge.InstructionTransformer r1, com.android.dx.merge.InstructionTransformer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.io.CodeReader.Visitor
        public void visit(com.android.dx.io.instructions.DecodedInstruction[] r3, com.android.dx.io.instructions.DecodedInstruction r4) {
                r2 = this;
                int r3 = r4.getIndex()
                com.android.dx.merge.InstructionTransformer r0 = r2.this$0
                com.android.dx.merge.IndexMap r0 = com.android.dx.merge.InstructionTransformer.access$900(r0)
                int r3 = r0.adjustType(r3)
                int r0 = r4.getOpcode()
                r1 = 27
                if (r0 != r1) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                com.android.dx.merge.InstructionTransformer.access$1000(r0, r3)
                com.android.dx.merge.InstructionTransformer r0 = r2.this$0
                com.android.dx.io.instructions.DecodedInstruction[] r0 = com.android.dx.merge.InstructionTransformer.access$700(r0)
                com.android.dx.merge.InstructionTransformer r1 = r2.this$0
                int r1 = com.android.dx.merge.InstructionTransformer.access$808(r1)
                com.android.dx.io.instructions.DecodedInstruction r3 = r4.withIndex(r3)
                r0[r1] = r3
                return
        }
    }

    public InstructionTransformer() {
            r3 = this;
            r3.<init>()
            com.android.dx.io.CodeReader r0 = new com.android.dx.io.CodeReader
            r0.<init>()
            r3.reader = r0
            com.android.dx.merge.InstructionTransformer$GenericVisitor r1 = new com.android.dx.merge.InstructionTransformer$GenericVisitor
            r2 = 0
            r1.<init>(r3, r2)
            r0.setAllVisitors(r1)
            com.android.dx.merge.InstructionTransformer$StringVisitor r1 = new com.android.dx.merge.InstructionTransformer$StringVisitor
            r1.<init>(r3, r2)
            r0.setStringVisitor(r1)
            com.android.dx.merge.InstructionTransformer$TypeVisitor r1 = new com.android.dx.merge.InstructionTransformer$TypeVisitor
            r1.<init>(r3, r2)
            r0.setTypeVisitor(r1)
            com.android.dx.merge.InstructionTransformer$FieldVisitor r1 = new com.android.dx.merge.InstructionTransformer$FieldVisitor
            r1.<init>(r3, r2)
            r0.setFieldVisitor(r1)
            com.android.dx.merge.InstructionTransformer$MethodVisitor r1 = new com.android.dx.merge.InstructionTransformer$MethodVisitor
            r1.<init>(r3, r2)
            r0.setMethodVisitor(r1)
            com.android.dx.merge.InstructionTransformer$MethodAndProtoVisitor r1 = new com.android.dx.merge.InstructionTransformer$MethodAndProtoVisitor
            r1.<init>(r3, r2)
            r0.setMethodAndProtoVisitor(r1)
            com.android.dx.merge.InstructionTransformer$CallSiteVisitor r1 = new com.android.dx.merge.InstructionTransformer$CallSiteVisitor
            r1.<init>(r3, r2)
            r0.setCallSiteVisitor(r1)
            return
    }

    public static /* synthetic */ void access$1000(boolean r0, int r1) {
            jumboCheck(r0, r1)
            return
    }

    public static /* synthetic */ com.android.dx.io.instructions.DecodedInstruction[] access$700(com.android.dx.merge.InstructionTransformer r0) {
            com.android.dx.io.instructions.DecodedInstruction[] r0 = r0.mappedInstructions
            return r0
    }

    public static /* synthetic */ int access$808(com.android.dx.merge.InstructionTransformer r2) {
            int r0 = r2.mappedAt
            int r1 = r0 + 1
            r2.mappedAt = r1
            return r0
    }

    public static /* synthetic */ com.android.dx.merge.IndexMap access$900(com.android.dx.merge.InstructionTransformer r0) {
            com.android.dx.merge.IndexMap r0 = r0.indexMap
            return r0
    }

    private static void jumboCheck(boolean r2, int r3) {
            if (r2 != 0) goto L24
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r2) goto L8
            goto L24
        L8:
            com.android.dex.DexIndexOverflowException r2 = new com.android.dex.DexIndexOverflowException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot merge new index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " into a non-jumbo instruction!"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L24:
            return
    }

    public short[] transform(com.android.dx.merge.IndexMap r4, short[] r5) throws com.android.dex.DexException {
            r3 = this;
            com.android.dx.io.instructions.DecodedInstruction[] r5 = com.android.dx.io.instructions.DecodedInstruction.decodeAll(r5)
            int r0 = r5.length
            r3.indexMap = r4
            com.android.dx.io.instructions.DecodedInstruction[] r4 = new com.android.dx.io.instructions.DecodedInstruction[r0]
            r3.mappedInstructions = r4
            r4 = 0
            r3.mappedAt = r4
            com.android.dx.io.CodeReader r1 = r3.reader
            r1.visitAll(r5)
            com.android.dx.io.instructions.ShortArrayCodeOutput r5 = new com.android.dx.io.instructions.ShortArrayCodeOutput
            r5.<init>(r0)
            com.android.dx.io.instructions.DecodedInstruction[] r0 = r3.mappedInstructions
            int r1 = r0.length
        L1b:
            if (r4 >= r1) goto L27
            r2 = r0[r4]
            if (r2 == 0) goto L24
            r2.encode(r5)
        L24:
            int r4 = r4 + 1
            goto L1b
        L27:
            r4 = 0
            r3.indexMap = r4
            short[] r4 = r5.getArray()
            return r4
    }
}
