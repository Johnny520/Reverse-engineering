package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class OutputCollector {
    private final com.android.dx.dex.code.OutputFinisher finisher;
    private java.util.ArrayList<com.android.dx.dex.code.DalvInsn> suffix;

    public OutputCollector(com.android.dx.dex.DexOptions r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r1.<init>()
            com.android.dx.dex.code.OutputFinisher r0 = new com.android.dx.dex.code.OutputFinisher
            r0.<init>(r2, r3, r5, r6)
            r1.finisher = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            r1.suffix = r2
            return
    }

    private void appendSuffixToOutput() {
            r4 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r4.suffix
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            com.android.dx.dex.code.OutputFinisher r2 = r4.finisher
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r3 = r4.suffix
            java.lang.Object r3 = r3.get(r1)
            com.android.dx.dex.code.DalvInsn r3 = (com.android.dx.dex.code.DalvInsn) r3
            r2.add(r3)
            int r1 = r1 + 1
            goto L7
        L19:
            r0 = 0
            r4.suffix = r0
            return
    }

    public void add(com.android.dx.dex.code.DalvInsn r2) {
            r1 = this;
            com.android.dx.dex.code.OutputFinisher r0 = r1.finisher
            r0.add(r2)
            return
    }

    public void addSuffix(com.android.dx.dex.code.DalvInsn r2) {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r1.suffix
            r0.add(r2)
            return
    }

    public com.android.dx.dex.code.DalvInsn get(int r2) {
            r1 = this;
            com.android.dx.dex.code.OutputFinisher r0 = r1.finisher
            int r0 = r0.size()
            if (r2 >= r0) goto L12
            if (r2 >= 0) goto Lb
            goto L12
        Lb:
            com.android.dx.dex.code.OutputFinisher r0 = r1.finisher
            com.android.dx.dex.code.DalvInsn r2 = r0.get(r2)
            return r2
        L12:
            r2 = 0
            return r2
    }

    public com.android.dx.dex.code.OutputFinisher getFinisher() {
            r2 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r2.suffix
            if (r0 == 0) goto La
            r2.appendSuffixToOutput()
            com.android.dx.dex.code.OutputFinisher r0 = r2.finisher
            return r0
        La:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "already processed"
            r0.<init>(r1)
            throw r0
    }

    public void reverseBranch(int r2, com.android.dx.dex.code.CodeAddress r3) {
            r1 = this;
            com.android.dx.dex.code.OutputFinisher r0 = r1.finisher
            r0.reverseBranch(r2, r3)
            return
    }

    public int size() {
            r1 = this;
            com.android.dx.dex.code.OutputFinisher r0 = r1.finisher
            int r0 = r0.size()
            return r0
    }
}
