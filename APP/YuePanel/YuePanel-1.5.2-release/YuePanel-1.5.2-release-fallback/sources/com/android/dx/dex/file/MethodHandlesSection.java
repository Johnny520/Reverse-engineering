package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class MethodHandlesSection extends com.android.dx.dex.file.UniformItemSection {
    private final java.util.TreeMap<com.android.dx.rop.cst.CstMethodHandle, com.android.dx.dex.file.MethodHandleItem> methodHandles;

    public MethodHandlesSection(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            java.lang.String r0 = "method_handles"
            r1 = 8
            r2.<init>(r0, r3, r1)
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r2.methodHandles = r3
            return
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public com.android.dx.dex.file.IndexedItem get(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            if (r2 == 0) goto L1a
            r1.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.cst.CstMethodHandle, com.android.dx.dex.file.MethodHandleItem> r0 = r1.methodHandles
            com.android.dx.rop.cst.CstMethodHandle r2 = (com.android.dx.rop.cst.CstMethodHandle) r2
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.dex.file.IndexedItem r2 = (com.android.dx.dex.file.IndexedItem) r2
            if (r2 == 0) goto L12
            return r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "not found"
            r2.<init>(r0)
            throw r2
        L1a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "cst == null"
            r2.<init>(r0)
            throw r2
    }

    public int indexOf(com.android.dx.rop.cst.CstMethodHandle r2) {
            r1 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstMethodHandle, com.android.dx.dex.file.MethodHandleItem> r0 = r1.methodHandles
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.dex.file.MethodHandleItem r2 = (com.android.dx.dex.file.MethodHandleItem) r2
            int r2 = r2.getIndex()
            return r2
    }

    public synchronized void intern(com.android.dx.rop.cst.CstMethodHandle r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L1f
            r2.throwIfPrepared()     // Catch: java.lang.Throwable -> L1b
            java.util.TreeMap<com.android.dx.rop.cst.CstMethodHandle, com.android.dx.dex.file.MethodHandleItem> r0 = r2.methodHandles     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1b
            com.android.dx.dex.file.MethodHandleItem r0 = (com.android.dx.dex.file.MethodHandleItem) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            com.android.dx.dex.file.MethodHandleItem r0 = new com.android.dx.dex.file.MethodHandleItem     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            java.util.TreeMap<com.android.dx.rop.cst.CstMethodHandle, com.android.dx.dex.file.MethodHandleItem> r1 = r2.methodHandles     // Catch: java.lang.Throwable -> L1b
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L27
        L1d:
            monitor-exit(r2)
            return
        L1f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "methodHandle == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L1b
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    @Override // com.android.dx.dex.file.Section
    public java.util.Collection<? extends com.android.dx.dex.file.Item> items() {
            r1 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstMethodHandle, com.android.dx.dex.file.MethodHandleItem> r0 = r1.methodHandles
            java.util.Collection r0 = r0.values()
            return r0
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
            r4 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstMethodHandle, com.android.dx.dex.file.MethodHandleItem> r0 = r4.methodHandles
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r0.next()
            com.android.dx.dex.file.MethodHandleItem r2 = (com.android.dx.dex.file.MethodHandleItem) r2
            int r3 = r1 + 1
            r2.setIndex(r1)
            r1 = r3
            goto Lb
        L1e:
            return
    }
}
