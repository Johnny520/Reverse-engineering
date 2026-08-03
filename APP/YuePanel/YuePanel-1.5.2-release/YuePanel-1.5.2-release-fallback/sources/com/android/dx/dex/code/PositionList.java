package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class PositionList extends com.android.dx.util.FixedSizeList {
    public static final com.android.dx.dex.code.PositionList EMPTY = null;
    public static final int IMPORTANT = 3;
    public static final int LINES = 2;
    public static final int NONE = 1;

    public static class Entry {
        private final int address;
        private final com.android.dx.rop.code.SourcePosition position;

        public Entry(int r1, com.android.dx.rop.code.SourcePosition r2) {
                r0 = this;
                r0.<init>()
                if (r1 < 0) goto L14
                if (r2 == 0) goto Lc
                r0.address = r1
                r0.position = r2
                return
            Lc:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "position == null"
                r1.<init>(r2)
                throw r1
            L14:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "address < 0"
                r1.<init>(r2)
                throw r1
        }

        public int getAddress() {
                r1 = this;
                int r0 = r1.address
                return r0
        }

        public com.android.dx.rop.code.SourcePosition getPosition() {
                r1 = this;
                com.android.dx.rop.code.SourcePosition r0 = r1.position
                return r0
        }
    }

    static {
            com.android.dx.dex.code.PositionList r0 = new com.android.dx.dex.code.PositionList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.dex.code.PositionList.EMPTY = r0
            return
    }

    public PositionList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.dex.code.PositionList make(com.android.dx.dex.code.DalvInsnList r13, int r14) {
            r0 = 1
            if (r14 == r0) goto L66
            r1 = 2
            r2 = 3
            if (r14 == r1) goto L12
            if (r14 != r2) goto La
            goto L12
        La:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "bogus howMuch"
            r13.<init>(r14)
            throw r13
        L12:
            com.android.dx.rop.code.SourcePosition r1 = com.android.dx.rop.code.SourcePosition.NO_INFO
            int r3 = r13.size()
            com.android.dx.dex.code.PositionList$Entry[] r4 = new com.android.dx.dex.code.PositionList.Entry[r3]
            r5 = 0
            r8 = r1
            r6 = r5
            r7 = r6
            r9 = r7
        L1f:
            if (r6 >= r3) goto L53
            com.android.dx.dex.code.DalvInsn r10 = r13.get(r6)
            boolean r11 = r10 instanceof com.android.dx.dex.code.CodeAddress
            if (r11 == 0) goto L2b
            r9 = r0
            goto L50
        L2b:
            com.android.dx.rop.code.SourcePosition r11 = r10.getPosition()
            boolean r12 = r11.equals(r1)
            if (r12 != 0) goto L50
            boolean r12 = r11.sameLine(r8)
            if (r12 == 0) goto L3c
            goto L50
        L3c:
            if (r14 != r2) goto L41
            if (r9 != 0) goto L41
            goto L50
        L41:
            com.android.dx.dex.code.PositionList$Entry r8 = new com.android.dx.dex.code.PositionList$Entry
            int r9 = r10.getAddress()
            r8.<init>(r9, r11)
            r4[r7] = r8
            int r7 = r7 + 1
            r9 = r5
            r8 = r11
        L50:
            int r6 = r6 + 1
            goto L1f
        L53:
            com.android.dx.dex.code.PositionList r13 = new com.android.dx.dex.code.PositionList
            r13.<init>(r7)
        L58:
            if (r5 >= r7) goto L62
            r14 = r4[r5]
            r13.set(r5, r14)
            int r5 = r5 + 1
            goto L58
        L62:
            r13.setImmutable()
            return r13
        L66:
            com.android.dx.dex.code.PositionList r13 = com.android.dx.dex.code.PositionList.EMPTY
            return r13
    }

    public com.android.dx.dex.code.PositionList.Entry get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.dex.code.PositionList$Entry r1 = (com.android.dx.dex.code.PositionList.Entry) r1
            return r1
    }

    public void set(int r1, com.android.dx.dex.code.PositionList.Entry r2) {
            r0 = this;
            r0.set0(r1, r2)
            return
    }
}
