package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public class LocalsArraySet extends com.android.dx.cf.code.LocalsArray {
    private final com.android.dx.cf.code.OneLocalsArray primary;
    private final java.util.ArrayList<com.android.dx.cf.code.LocalsArray> secondaries;

    public LocalsArraySet(int r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.<init>(r0)
            com.android.dx.cf.code.OneLocalsArray r0 = new com.android.dx.cf.code.OneLocalsArray
            r0.<init>(r2)
            r1.primary = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.secondaries = r2
            return
    }

    private LocalsArraySet(com.android.dx.cf.code.LocalsArraySet r5) {
            r4 = this;
            int r0 = r5.getMaxLocals()
            r1 = 0
            if (r0 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = r1
        La:
            r4.<init>(r0)
            com.android.dx.cf.code.OneLocalsArray r0 = r5.primary
            com.android.dx.cf.code.OneLocalsArray r0 = r0.copy()
            r4.primary = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r2 = r5.secondaries
            int r2 = r2.size()
            r0.<init>(r2)
            r4.secondaries = r0
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r0 = r5.secondaries
            int r0 = r0.size()
        L28:
            if (r1 >= r0) goto L47
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r2 = r5.secondaries
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.cf.code.LocalsArray r2 = (com.android.dx.cf.code.LocalsArray) r2
            if (r2 != 0) goto L3b
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r2 = r4.secondaries
            r3 = 0
            r2.add(r3)
            goto L44
        L3b:
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r3 = r4.secondaries
            com.android.dx.cf.code.LocalsArray r2 = r2.copy()
            r3.add(r2)
        L44:
            int r1 = r1 + 1
            goto L28
        L47:
            return
    }

    public LocalsArraySet(com.android.dx.cf.code.OneLocalsArray r2, java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r3) {
            r1 = this;
            int r0 = r2.getMaxLocals()
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r1.<init>(r0)
            r1.primary = r2
            r1.secondaries = r3
            return
    }

    private com.android.dx.cf.code.LocalsArray getSecondaryForLabel(int r2) {
            r1 = this;
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r0 = r1.secondaries
            int r0 = r0.size()
            if (r2 < r0) goto La
            r2 = 0
            return r2
        La:
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r0 = r1.secondaries
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.cf.code.LocalsArray r2 = (com.android.dx.cf.code.LocalsArray) r2
            return r2
    }

    private com.android.dx.cf.code.LocalsArraySet mergeWithOne(com.android.dx.cf.code.OneLocalsArray r11) {
            r10 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r10.primary
            com.android.dx.cf.code.OneLocalsArray r1 = r11.getPrimary()
            com.android.dx.cf.code.OneLocalsArray r0 = r0.merge(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r2 = r10.secondaries
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r2 = r10.secondaries
            int r2 = r2.size()
            r3 = 0
            r4 = r3
            r5 = r4
        L1e:
            if (r4 >= r2) goto L57
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r6 = r10.secondaries
            java.lang.Object r6 = r6.get(r4)
            com.android.dx.cf.code.LocalsArray r6 = (com.android.dx.cf.code.LocalsArray) r6
            if (r6 == 0) goto L48
            com.android.dx.cf.code.LocalsArray r7 = r6.merge(r11)     // Catch: com.android.dx.cf.code.SimException -> L2f
            goto L49
        L2f:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Merging one locals against caller block "
            r8.append(r9)
            java.lang.String r9 = com.android.dx.util.Hex.u2(r4)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.addContext(r8)
        L48:
            r7 = 0
        L49:
            if (r5 != 0) goto L50
            if (r6 == r7) goto L4e
            goto L50
        L4e:
            r5 = r3
            goto L51
        L50:
            r5 = 1
        L51:
            r1.add(r7)
            int r4 = r4 + 1
            goto L1e
        L57:
            com.android.dx.cf.code.OneLocalsArray r11 = r10.primary
            if (r11 != r0) goto L5e
            if (r5 != 0) goto L5e
            return r10
        L5e:
            com.android.dx.cf.code.LocalsArraySet r11 = new com.android.dx.cf.code.LocalsArraySet
            r11.<init>(r0, r1)
            return r11
    }

    private com.android.dx.cf.code.LocalsArraySet mergeWithSet(com.android.dx.cf.code.LocalsArraySet r14) {
            r13 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r13.primary
            com.android.dx.cf.code.OneLocalsArray r1 = r14.getPrimary()
            com.android.dx.cf.code.OneLocalsArray r0 = r0.merge(r1)
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r1 = r13.secondaries
            int r1 = r1.size()
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r2 = r14.secondaries
            int r2 = r2.size()
            int r3 = java.lang.Math.max(r1, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r5 = 0
            r6 = r5
            r7 = r6
        L22:
            if (r6 >= r3) goto L74
            r8 = 0
            if (r6 >= r1) goto L30
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r9 = r13.secondaries
            java.lang.Object r9 = r9.get(r6)
            com.android.dx.cf.code.LocalsArray r9 = (com.android.dx.cf.code.LocalsArray) r9
            goto L31
        L30:
            r9 = r8
        L31:
            if (r6 >= r2) goto L3c
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r10 = r14.secondaries
            java.lang.Object r10 = r10.get(r6)
            com.android.dx.cf.code.LocalsArray r10 = (com.android.dx.cf.code.LocalsArray) r10
            goto L3d
        L3c:
            r10 = r8
        L3d:
            if (r9 != r10) goto L40
            goto L46
        L40:
            if (r9 != 0) goto L44
            r8 = r10
            goto L66
        L44:
            if (r10 != 0) goto L48
        L46:
            r8 = r9
            goto L66
        L48:
            com.android.dx.cf.code.LocalsArray r8 = r9.merge(r10)     // Catch: com.android.dx.cf.code.SimException -> L4d
            goto L66
        L4d:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Merging locals set for caller block "
            r11.append(r12)
            java.lang.String r12 = com.android.dx.util.Hex.u2(r6)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.addContext(r11)
        L66:
            if (r7 != 0) goto L6d
            if (r9 == r8) goto L6b
            goto L6d
        L6b:
            r7 = r5
            goto L6e
        L6d:
            r7 = 1
        L6e:
            r4.add(r8)
            int r6 = r6 + 1
            goto L22
        L74:
            com.android.dx.cf.code.OneLocalsArray r14 = r13.primary
            if (r14 != r0) goto L7b
            if (r7 != 0) goto L7b
            return r13
        L7b:
            com.android.dx.cf.code.LocalsArraySet r14 = new com.android.dx.cf.code.LocalsArraySet
            r14.<init>(r0, r4)
            return r14
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void annotate(com.android.dex.util.ExceptionWithContext r6) {
            r5 = this;
            java.lang.String r0 = "(locals array set; primary)"
            r6.addContext(r0)
            com.android.dx.cf.code.OneLocalsArray r0 = r5.primary
            r0.annotate(r6)
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r0 = r5.secondaries
            int r0 = r0.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L44
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r2 = r5.secondaries
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.cf.code.LocalsArray r2 = (com.android.dx.cf.code.LocalsArray) r2
            if (r2 == 0) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "(locals array set: primary for caller "
            r3.append(r4)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r1)
            r3.append(r4)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r6.addContext(r3)
            com.android.dx.cf.code.OneLocalsArray r2 = r2.getPrimary()
            r2.annotate(r6)
        L41:
            int r1 = r1 + 1
            goto L11
        L44:
            return
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.cf.code.LocalsArray copy() {
            r1 = this;
            com.android.dx.cf.code.LocalsArraySet r0 = new com.android.dx.cf.code.LocalsArraySet
            r0.<init>(r1)
            return r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.rop.type.TypeBearer get(int r2) {
            r1 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r1.primary
            com.android.dx.rop.type.TypeBearer r2 = r0.get(r2)
            return r2
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.rop.type.TypeBearer getCategory1(int r2) {
            r1 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r1.primary
            com.android.dx.rop.type.TypeBearer r2 = r0.getCategory1(r2)
            return r2
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.rop.type.TypeBearer getCategory2(int r2) {
            r1 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r1.primary
            com.android.dx.rop.type.TypeBearer r2 = r0.getCategory2(r2)
            return r2
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public int getMaxLocals() {
            r1 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r1.primary
            int r0 = r0.getMaxLocals()
            return r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.rop.type.TypeBearer getOrNull(int r2) {
            r1 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r1.primary
            com.android.dx.rop.type.TypeBearer r2 = r0.getOrNull(r2)
            return r2
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.cf.code.OneLocalsArray getPrimary() {
            r1 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r1.primary
            return r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void invalidate(int r3) {
            r2 = this;
            r2.throwIfImmutable()
            com.android.dx.cf.code.OneLocalsArray r0 = r2.primary
            r0.invalidate(r3)
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r0 = r2.secondaries
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.android.dx.cf.code.LocalsArray r1 = (com.android.dx.cf.code.LocalsArray) r1
            if (r1 == 0) goto Le
            r1.invalidate(r3)
            goto Le
        L20:
            return
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void makeInitialized(com.android.dx.rop.type.Type r3) {
            r2 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r2.primary
            int r0 = r0.getMaxLocals()
            if (r0 != 0) goto L9
            return
        L9:
            r2.throwIfImmutable()
            com.android.dx.cf.code.OneLocalsArray r0 = r2.primary
            r0.makeInitialized(r3)
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r0 = r2.secondaries
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            com.android.dx.cf.code.LocalsArray r1 = (com.android.dx.cf.code.LocalsArray) r1
            if (r1 == 0) goto L17
            r1.makeInitialized(r3)
            goto L17
        L29:
            return
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public /* bridge */ /* synthetic */ com.android.dx.cf.code.LocalsArray merge(com.android.dx.cf.code.LocalsArray r1) {
            r0 = this;
            com.android.dx.cf.code.LocalsArraySet r1 = r0.merge(r1)
            return r1
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.cf.code.LocalsArraySet merge(com.android.dx.cf.code.LocalsArray r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.android.dx.cf.code.LocalsArraySet     // Catch: com.android.dx.cf.code.SimException -> Lc
            if (r0 == 0) goto Le
            r0 = r3
            com.android.dx.cf.code.LocalsArraySet r0 = (com.android.dx.cf.code.LocalsArraySet) r0     // Catch: com.android.dx.cf.code.SimException -> Lc
            com.android.dx.cf.code.LocalsArraySet r3 = r2.mergeWithSet(r0)     // Catch: com.android.dx.cf.code.SimException -> Lc
            goto L15
        Lc:
            r0 = move-exception
            goto L19
        Le:
            r0 = r3
            com.android.dx.cf.code.OneLocalsArray r0 = (com.android.dx.cf.code.OneLocalsArray) r0     // Catch: com.android.dx.cf.code.SimException -> Lc
            com.android.dx.cf.code.LocalsArraySet r3 = r2.mergeWithOne(r0)     // Catch: com.android.dx.cf.code.SimException -> Lc
        L15:
            r3.setImmutable()
            return r3
        L19:
            java.lang.String r1 = "underlay locals:"
            r0.addContext(r1)
            r2.annotate(r0)
            java.lang.String r1 = "overlay locals:"
            r0.addContext(r1)
            r3.annotate(r0)
            throw r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.cf.code.LocalsArraySet mergeWithSubroutineCaller(com.android.dx.cf.code.LocalsArray r9, int r10) {
            r8 = this;
            com.android.dx.cf.code.LocalsArray r0 = r8.getSecondaryForLabel(r10)
            com.android.dx.cf.code.OneLocalsArray r1 = r8.primary
            com.android.dx.cf.code.OneLocalsArray r2 = r9.getPrimary()
            com.android.dx.cf.code.OneLocalsArray r1 = r1.merge(r2)
            if (r0 != r9) goto L12
            r9 = r0
            goto L19
        L12:
            if (r0 != 0) goto L15
            goto L19
        L15:
            com.android.dx.cf.code.LocalsArray r9 = r0.merge(r9)
        L19:
            if (r9 != r0) goto L20
            com.android.dx.cf.code.OneLocalsArray r0 = r8.primary
            if (r1 != r0) goto L20
            return r8
        L20:
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r0 = r8.secondaries
            int r0 = r0.size()
            int r1 = r10 + 1
            int r1 = java.lang.Math.max(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r3 = 0
            r4 = 0
            r5 = r3
        L34:
            if (r4 >= r1) goto L5d
            if (r4 != r10) goto L3a
            r6 = r9
            goto L46
        L3a:
            if (r4 >= r0) goto L45
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r6 = r8.secondaries
            java.lang.Object r6 = r6.get(r4)
            com.android.dx.cf.code.LocalsArray r6 = (com.android.dx.cf.code.LocalsArray) r6
            goto L46
        L45:
            r6 = r3
        L46:
            if (r6 == 0) goto L57
            if (r5 != 0) goto L4f
            com.android.dx.cf.code.OneLocalsArray r5 = r6.getPrimary()
            goto L57
        L4f:
            com.android.dx.cf.code.OneLocalsArray r7 = r6.getPrimary()
            com.android.dx.cf.code.OneLocalsArray r5 = r5.merge(r7)
        L57:
            r2.add(r6)
            int r4 = r4 + 1
            goto L34
        L5d:
            com.android.dx.cf.code.LocalsArraySet r9 = new com.android.dx.cf.code.LocalsArraySet
            r9.<init>(r5, r2)
            r9.setImmutable()
            return r9
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void set(int r3, com.android.dx.rop.type.TypeBearer r4) {
            r2 = this;
            r2.throwIfImmutable()
            com.android.dx.cf.code.OneLocalsArray r0 = r2.primary
            r0.set(r3, r4)
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r0 = r2.secondaries
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.android.dx.cf.code.LocalsArray r1 = (com.android.dx.cf.code.LocalsArray) r1
            if (r1 == 0) goto Le
            r1.set(r3, r4)
            goto Le
        L20:
            return
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void set(com.android.dx.rop.code.RegisterSpec r2) {
            r1 = this;
            int r0 = r2.getReg()
            r1.set(r0, r2)
            return
    }

    @Override // com.android.dx.util.MutabilityControl
    public void setImmutable() {
            r2 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r2.primary
            r0.setImmutable()
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r0 = r2.secondaries
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.android.dx.cf.code.LocalsArray r1 = (com.android.dx.cf.code.LocalsArray) r1
            if (r1 == 0) goto Lb
            r1.setImmutable()
            goto Lb
        L1d:
            super.setImmutable()
            return
    }

    public com.android.dx.cf.code.LocalsArray subArrayForLabel(int r1) {
            r0 = this;
            com.android.dx.cf.code.LocalsArray r1 = r0.getSecondaryForLabel(r1)
            return r1
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(locals array set; primary)\n"
            r0.append(r1)
            com.android.dx.cf.code.OneLocalsArray r1 = r7.getPrimary()
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r2 = r7.secondaries
            int r2 = r2.size()
            r3 = 0
        L21:
            if (r3 >= r2) goto L5b
            java.util.ArrayList<com.android.dx.cf.code.LocalsArray> r4 = r7.secondaries
            java.lang.Object r4 = r4.get(r3)
            com.android.dx.cf.code.LocalsArray r4 = (com.android.dx.cf.code.LocalsArray) r4
            if (r4 == 0) goto L58
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "(locals array set: primary for caller "
            r5.append(r6)
            java.lang.String r6 = com.android.dx.util.Hex.u2(r3)
            r5.append(r6)
            java.lang.String r6 = ")\n"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            com.android.dx.cf.code.OneLocalsArray r4 = r4.getPrimary()
            java.lang.String r4 = r4.toHuman()
            r0.append(r4)
            r0.append(r1)
        L58:
            int r3 = r3 + 1
            goto L21
        L5b:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
