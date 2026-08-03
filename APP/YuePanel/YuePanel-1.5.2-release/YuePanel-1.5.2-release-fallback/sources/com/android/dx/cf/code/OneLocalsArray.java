package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public class OneLocalsArray extends com.android.dx.cf.code.LocalsArray {
    private final com.android.dx.rop.type.TypeBearer[] locals;

    public OneLocalsArray(int r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.<init>(r0)
            com.android.dx.rop.type.TypeBearer[] r2 = new com.android.dx.rop.type.TypeBearer[r2]
            r1.locals = r2
            return
    }

    private static com.android.dx.rop.type.TypeBearer throwSimException(int r3, java.lang.String r4) {
            com.android.dx.cf.code.SimException r0 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "local "
            r1.append(r2)
            java.lang.String r3 = com.android.dx.util.Hex.u2(r3)
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void annotate(com.android.dex.util.ExceptionWithContext r5) {
            r4 = this;
            r0 = 0
        L1:
            com.android.dx.rop.type.TypeBearer[] r1 = r4.locals
            int r2 = r1.length
            if (r0 >= r2) goto L34
            r1 = r1[r0]
            if (r1 != 0) goto Ld
            java.lang.String r1 = "<invalid>"
            goto L11
        Ld:
            java.lang.String r1 = r1.toString()
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "locals["
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u2(r0)
            r2.append(r3)
            java.lang.String r3 = "]: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.addContext(r1)
            int r0 = r0 + 1
            goto L1
        L34:
            return
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public /* bridge */ /* synthetic */ com.android.dx.cf.code.LocalsArray copy() {
            r1 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = r1.copy()
            return r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.cf.code.OneLocalsArray copy() {
            r5 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = new com.android.dx.cf.code.OneLocalsArray
            com.android.dx.rop.type.TypeBearer[] r1 = r5.locals
            int r1 = r1.length
            r0.<init>(r1)
            com.android.dx.rop.type.TypeBearer[] r1 = r5.locals
            com.android.dx.rop.type.TypeBearer[] r2 = r0.locals
            int r3 = r1.length
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            return r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.rop.type.TypeBearer get(int r2) {
            r1 = this;
            com.android.dx.rop.type.TypeBearer[] r0 = r1.locals
            r0 = r0[r2]
            if (r0 != 0) goto Ld
            java.lang.String r0 = "invalid"
            com.android.dx.rop.type.TypeBearer r2 = throwSimException(r2, r0)
            return r2
        Ld:
            return r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.rop.type.TypeBearer getCategory1(int r4) {
            r3 = this;
            com.android.dx.rop.type.TypeBearer r0 = r3.get(r4)
            com.android.dx.rop.type.Type r1 = r0.getType()
            boolean r2 = r1.isUninitialized()
            if (r2 == 0) goto L15
            java.lang.String r0 = "uninitialized instance"
            com.android.dx.rop.type.TypeBearer r4 = throwSimException(r4, r0)
            return r4
        L15:
            boolean r1 = r1.isCategory2()
            if (r1 == 0) goto L22
            java.lang.String r0 = "category-2"
            com.android.dx.rop.type.TypeBearer r4 = throwSimException(r4, r0)
            return r4
        L22:
            return r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.rop.type.TypeBearer getCategory2(int r3) {
            r2 = this;
            com.android.dx.rop.type.TypeBearer r0 = r2.get(r3)
            com.android.dx.rop.type.Type r1 = r0.getType()
            boolean r1 = r1.isCategory1()
            if (r1 == 0) goto L15
            java.lang.String r0 = "category-1"
            com.android.dx.rop.type.TypeBearer r3 = throwSimException(r3, r0)
            return r3
        L15:
            return r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public int getMaxLocals() {
            r1 = this;
            com.android.dx.rop.type.TypeBearer[] r0 = r1.locals
            int r0 = r0.length
            return r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.rop.type.TypeBearer getOrNull(int r2) {
            r1 = this;
            com.android.dx.rop.type.TypeBearer[] r0 = r1.locals
            r2 = r0[r2]
            return r2
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.cf.code.OneLocalsArray getPrimary() {
            r0 = this;
            return r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void invalidate(int r3) {
            r2 = this;
            r2.throwIfImmutable()
            com.android.dx.rop.type.TypeBearer[] r0 = r2.locals
            r1 = 0
            r0[r3] = r1
            return
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void makeInitialized(com.android.dx.rop.type.Type r6) {
            r5 = this;
            com.android.dx.rop.type.TypeBearer[] r0 = r5.locals
            int r0 = r0.length
            if (r0 != 0) goto L6
            return
        L6:
            r5.throwIfImmutable()
            com.android.dx.rop.type.Type r1 = r6.getInitializedType()
            r2 = 0
        Le:
            if (r2 >= r0) goto L1b
            com.android.dx.rop.type.TypeBearer[] r3 = r5.locals
            r4 = r3[r2]
            if (r4 != r6) goto L18
            r3[r2] = r1
        L18:
            int r2 = r2 + 1
            goto Le
        L1b:
            return
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.cf.code.LocalsArray merge(com.android.dx.cf.code.LocalsArray r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.cf.code.OneLocalsArray
            if (r0 == 0) goto Lb
            com.android.dx.cf.code.OneLocalsArray r2 = (com.android.dx.cf.code.OneLocalsArray) r2
            com.android.dx.cf.code.OneLocalsArray r2 = r1.merge(r2)
            return r2
        Lb:
            com.android.dx.cf.code.LocalsArray r2 = r2.merge(r1)
            return r2
    }

    public com.android.dx.cf.code.OneLocalsArray merge(com.android.dx.cf.code.OneLocalsArray r3) {
            r2 = this;
            com.android.dx.cf.code.OneLocalsArray r3 = com.android.dx.cf.code.Merger.mergeLocals(r2, r3)     // Catch: com.android.dx.cf.code.SimException -> L5
            return r3
        L5:
            r0 = move-exception
            java.lang.String r1 = "underlay locals:"
            r0.addContext(r1)
            r2.annotate(r0)
            java.lang.String r1 = "overlay locals:"
            r0.addContext(r1)
            r3.annotate(r0)
            throw r0
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public com.android.dx.cf.code.LocalsArraySet mergeWithSubroutineCaller(com.android.dx.cf.code.LocalsArray r3, int r4) {
            r2 = this;
            com.android.dx.cf.code.LocalsArraySet r0 = new com.android.dx.cf.code.LocalsArraySet
            int r1 = r2.getMaxLocals()
            r0.<init>(r1)
            com.android.dx.cf.code.LocalsArraySet r3 = r0.mergeWithSubroutineCaller(r3, r4)
            return r3
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void set(int r4, com.android.dx.rop.type.TypeBearer r5) {
            r3 = this;
            r3.throwIfImmutable()
            com.android.dx.rop.type.TypeBearer r5 = r5.getFrameType()     // Catch: java.lang.NullPointerException -> L3d
            if (r4 < 0) goto L35
            com.android.dx.rop.type.Type r0 = r5.getType()
            boolean r0 = r0.isCategory2()
            r1 = 0
            if (r0 == 0) goto L1a
            com.android.dx.rop.type.TypeBearer[] r0 = r3.locals
            int r2 = r4 + 1
            r0[r2] = r1
        L1a:
            com.android.dx.rop.type.TypeBearer[] r0 = r3.locals
            r0[r4] = r5
            if (r4 == 0) goto L34
            int r4 = r4 + (-1)
            r5 = r0[r4]
            if (r5 == 0) goto L34
            com.android.dx.rop.type.Type r5 = r5.getType()
            boolean r5 = r5.isCategory2()
            if (r5 == 0) goto L34
            com.android.dx.rop.type.TypeBearer[] r5 = r3.locals
            r5[r4] = r1
        L34:
            return
        L35:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = "idx < 0"
            r4.<init>(r5)
            throw r4
        L3d:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "type == null"
            r4.<init>(r5)
            throw r4
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void set(com.android.dx.rop.code.RegisterSpec r2) {
            r1 = this;
            int r0 = r2.getReg()
            r1.set(r0, r2)
            return
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            com.android.dx.rop.type.TypeBearer[] r2 = r5.locals
            int r3 = r2.length
            if (r1 >= r3) goto L3e
            r2 = r2[r1]
            if (r2 != 0) goto L12
            java.lang.String r2 = "<invalid>"
            goto L16
        L12:
            java.lang.String r2 = r2.toString()
        L16:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "locals["
            r3.append(r4)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r1)
            r3.append(r4)
            java.lang.String r4 = "]: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "\n"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L3e:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
