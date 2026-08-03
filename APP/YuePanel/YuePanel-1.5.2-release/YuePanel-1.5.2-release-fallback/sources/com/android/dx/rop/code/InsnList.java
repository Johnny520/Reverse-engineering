package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class InsnList extends com.android.dx.util.FixedSizeList {
    public InsnList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean contentEquals(com.android.dx.rop.code.InsnList r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = r5.size()
            int r2 = r6.size()
            if (r1 == r2) goto Lf
            return r0
        Lf:
            r2 = r0
        L10:
            if (r2 >= r1) goto L24
            com.android.dx.rop.code.Insn r3 = r5.get(r2)
            com.android.dx.rop.code.Insn r4 = r6.get(r2)
            boolean r3 = r3.contentEquals(r4)
            if (r3 != 0) goto L21
            return r0
        L21:
            int r2 = r2 + 1
            goto L10
        L24:
            r6 = 1
            return r6
    }

    public void forEach(com.android.dx.rop.code.Insn.Visitor r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            com.android.dx.rop.code.Insn r2 = r3.get(r1)
            r2.accept(r4)
            int r1 = r1 + 1
            goto L5
        L11:
            return
    }

    public com.android.dx.rop.code.Insn get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.rop.code.Insn r1 = (com.android.dx.rop.code.Insn) r1
            return r1
    }

    public com.android.dx.rop.code.Insn getLast() {
            r1 = this;
            int r0 = r1.size()
            int r0 = r0 + (-1)
            com.android.dx.rop.code.Insn r0 = r1.get(r0)
            return r0
    }

    public void set(int r1, com.android.dx.rop.code.Insn r2) {
            r0 = this;
            r0.set0(r1, r2)
            return
    }

    public com.android.dx.rop.code.InsnList withRegisterOffset(int r5) {
            r4 = this;
            int r0 = r4.size()
            com.android.dx.rop.code.InsnList r1 = new com.android.dx.rop.code.InsnList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L1e
            java.lang.Object r3 = r4.get0(r2)
            com.android.dx.rop.code.Insn r3 = (com.android.dx.rop.code.Insn) r3
            if (r3 == 0) goto L1b
            com.android.dx.rop.code.Insn r3 = r3.withRegisterOffset(r5)
            r1.set0(r2, r3)
        L1b:
            int r2 = r2 + 1
            goto La
        L1e:
            boolean r5 = r4.isImmutable()
            if (r5 == 0) goto L27
            r1.setImmutable()
        L27:
            return r1
    }
}
