package com.android.dx.io;

/* JADX INFO: loaded from: classes.dex */
public final class CodeReader {
    private com.android.dx.io.CodeReader.Visitor callSiteVisitor;
    private com.android.dx.io.CodeReader.Visitor fallbackVisitor;
    private com.android.dx.io.CodeReader.Visitor fieldVisitor;
    private com.android.dx.io.CodeReader.Visitor methodAndProtoVisitor;
    private com.android.dx.io.CodeReader.Visitor methodVisitor;
    private com.android.dx.io.CodeReader.Visitor stringVisitor;
    private com.android.dx.io.CodeReader.Visitor typeVisitor;

    /* JADX INFO: renamed from: com.android.dx.io.CodeReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$io$IndexType = null;

        static {
                com.android.dx.io.IndexType[] r0 = com.android.dx.io.IndexType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.android.dx.io.CodeReader.AnonymousClass1.$SwitchMap$com$android$dx$io$IndexType = r0
                com.android.dx.io.IndexType r1 = com.android.dx.io.IndexType.STRING_REF     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.android.dx.io.CodeReader.AnonymousClass1.$SwitchMap$com$android$dx$io$IndexType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.android.dx.io.IndexType r1 = com.android.dx.io.IndexType.TYPE_REF     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.android.dx.io.CodeReader.AnonymousClass1.$SwitchMap$com$android$dx$io$IndexType     // Catch: java.lang.NoSuchFieldError -> L28
                com.android.dx.io.IndexType r1 = com.android.dx.io.IndexType.FIELD_REF     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.android.dx.io.CodeReader.AnonymousClass1.$SwitchMap$com$android$dx$io$IndexType     // Catch: java.lang.NoSuchFieldError -> L33
                com.android.dx.io.IndexType r1 = com.android.dx.io.IndexType.METHOD_REF     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.android.dx.io.CodeReader.AnonymousClass1.$SwitchMap$com$android$dx$io$IndexType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.android.dx.io.IndexType r1 = com.android.dx.io.IndexType.METHOD_AND_PROTO_REF     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.android.dx.io.CodeReader.AnonymousClass1.$SwitchMap$com$android$dx$io$IndexType     // Catch: java.lang.NoSuchFieldError -> L49
                com.android.dx.io.IndexType r1 = com.android.dx.io.IndexType.CALL_SITE_REF     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    public interface Visitor {
        void visit(com.android.dx.io.instructions.DecodedInstruction[] r1, com.android.dx.io.instructions.DecodedInstruction r2);
    }

    public CodeReader() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.fallbackVisitor = r0
            r1.stringVisitor = r0
            r1.typeVisitor = r0
            r1.fieldVisitor = r0
            r1.methodVisitor = r0
            r1.methodAndProtoVisitor = r0
            r1.callSiteVisitor = r0
            return
    }

    private void callVisit(com.android.dx.io.instructions.DecodedInstruction[] r3, com.android.dx.io.instructions.DecodedInstruction r4) {
            r2 = this;
            int[] r0 = com.android.dx.io.CodeReader.AnonymousClass1.$SwitchMap$com$android$dx$io$IndexType
            int r1 = r4.getOpcode()
            com.android.dx.io.IndexType r1 = com.android.dx.io.OpcodeInfo.getIndexType(r1)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L21;
                case 3: goto L1e;
                case 4: goto L1b;
                case 5: goto L18;
                case 6: goto L15;
                default: goto L13;
            }
        L13:
            r0 = 0
            goto L26
        L15:
            com.android.dx.io.CodeReader$Visitor r0 = r2.callSiteVisitor
            goto L26
        L18:
            com.android.dx.io.CodeReader$Visitor r0 = r2.methodAndProtoVisitor
            goto L26
        L1b:
            com.android.dx.io.CodeReader$Visitor r0 = r2.methodVisitor
            goto L26
        L1e:
            com.android.dx.io.CodeReader$Visitor r0 = r2.fieldVisitor
            goto L26
        L21:
            com.android.dx.io.CodeReader$Visitor r0 = r2.typeVisitor
            goto L26
        L24:
            com.android.dx.io.CodeReader$Visitor r0 = r2.stringVisitor
        L26:
            if (r0 != 0) goto L2a
            com.android.dx.io.CodeReader$Visitor r0 = r2.fallbackVisitor
        L2a:
            if (r0 == 0) goto L2f
            r0.visit(r3, r4)
        L2f:
            return
    }

    public void setAllVisitors(com.android.dx.io.CodeReader.Visitor r1) {
            r0 = this;
            r0.fallbackVisitor = r1
            r0.stringVisitor = r1
            r0.typeVisitor = r1
            r0.fieldVisitor = r1
            r0.methodVisitor = r1
            r0.methodAndProtoVisitor = r1
            r0.callSiteVisitor = r1
            return
    }

    public void setCallSiteVisitor(com.android.dx.io.CodeReader.Visitor r1) {
            r0 = this;
            r0.callSiteVisitor = r1
            return
    }

    public void setFallbackVisitor(com.android.dx.io.CodeReader.Visitor r1) {
            r0 = this;
            r0.fallbackVisitor = r1
            return
    }

    public void setFieldVisitor(com.android.dx.io.CodeReader.Visitor r1) {
            r0 = this;
            r0.fieldVisitor = r1
            return
    }

    public void setMethodAndProtoVisitor(com.android.dx.io.CodeReader.Visitor r1) {
            r0 = this;
            r0.methodAndProtoVisitor = r1
            return
    }

    public void setMethodVisitor(com.android.dx.io.CodeReader.Visitor r1) {
            r0 = this;
            r0.methodVisitor = r1
            return
    }

    public void setStringVisitor(com.android.dx.io.CodeReader.Visitor r1) {
            r0 = this;
            r0.stringVisitor = r1
            return
    }

    public void setTypeVisitor(com.android.dx.io.CodeReader.Visitor r1) {
            r0 = this;
            r0.typeVisitor = r1
            return
    }

    public void visitAll(com.android.dx.io.instructions.DecodedInstruction[] r4) throws com.android.dex.DexException {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lf
            r2 = r4[r1]
            if (r2 != 0) goto L9
            goto Lc
        L9:
            r3.callVisit(r4, r2)
        Lc:
            int r1 = r1 + 1
            goto L2
        Lf:
            return
    }

    public void visitAll(short[] r1) throws com.android.dex.DexException {
            r0 = this;
            com.android.dx.io.instructions.DecodedInstruction[] r1 = com.android.dx.io.instructions.DecodedInstruction.decodeAll(r1)
            r0.visitAll(r1)
            return
    }
}
