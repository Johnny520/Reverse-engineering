package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ExternalNameSpace extends bsh.NameSpace {
    private java.util.Map<java.lang.String, java.lang.Object> externalMap;

    public ExternalNameSpace() {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "External Map Namespace"
            r2.<init>(r0, r1, r0)
            return
    }

    public ExternalNameSpace(bsh.NameSpace r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r3 != 0) goto La
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        La:
            r0.externalMap = r3
            return
    }

    public static /* synthetic */ java.lang.String[] h(int r0) {
            java.lang.String[] r0 = lambda$getVariableNames$0(r0)
            return r0
    }

    private static /* synthetic */ java.lang.String[] lambda$getVariableNames$0(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    @Override // bsh.NameSpace
    public void clear() {
            r1 = this;
            super.clear()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.externalMap
            r0.clear()
            return
    }

    @Override // bsh.NameSpace
    public bsh.Variable createVariable(java.lang.String r2, java.lang.Class r3, java.lang.Object r4, bsh.Modifiers r5) {
            r1 = this;
            bsh.LHS r5 = new bsh.LHS
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.externalMap
            r5.<init>(r0, r2)
            r0 = 0
            r5.assign(r4, r0)     // Catch: bsh.UtilEvalError -> L11
            bsh.Variable r4 = new bsh.Variable
            r4.<init>(r2, r3, r5)
            return r4
        L11:
            r2 = move-exception
            bsh.InterpreterError r3 = new bsh.InterpreterError
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMap() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.externalMap
            return r0
    }

    @Override // bsh.NameSpace
    public bsh.Variable getVariableImpl(java.lang.String r3, boolean r4) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.externalMap
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L12
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.externalMap
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L12
            bsh.Primitive r0 = bsh.Primitive.NULL
        L12:
            if (r0 != 0) goto L1c
            super.unsetVariable(r3)
            bsh.Variable r3 = super.getVariableImpl(r3, r4)
            return r3
        L1c:
            r4 = 0
            bsh.Variable r4 = super.getVariableImpl(r3, r4)
            if (r4 != 0) goto L29
            r4 = 0
            bsh.Variable r3 = r2.createVariable(r3, r4, r0, r4)
            return r3
        L29:
            return r4
    }

    @Override // bsh.NameSpace
    public java.lang.String[] getVariableNames() {
            r3 = this;
            java.lang.String[] r0 = super.getVariableNames()
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.externalMap
            java.util.Set r1 = r1.keySet()
            java.util.stream.Stream r1 = r1.stream()
            java.util.stream.Stream r0 = java.util.stream.Stream.concat(r0, r1)
            bsh.e r1 = new bsh.e
            r2 = 2
            r1.<init>(r2)
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public void setMap(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.clear()
            r0.externalMap = r1
            return
    }

    @Override // bsh.NameSpace
    public void unsetVariable(java.lang.String r2) {
            r1 = this;
            super.unsetVariable(r2)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.externalMap
            r0.remove(r2)
            return
    }
}
