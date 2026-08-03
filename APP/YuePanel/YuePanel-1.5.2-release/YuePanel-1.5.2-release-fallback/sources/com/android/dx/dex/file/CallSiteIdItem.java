package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class CallSiteIdItem extends com.android.dx.dex.file.IndexedItem implements java.lang.Comparable {
    private static final int ITEM_SIZE = 4;
    com.android.dx.dex.file.CallSiteItem data;
    final com.android.dx.rop.cst.CstCallSiteRef invokeDynamicRef;

    public CallSiteIdItem(com.android.dx.rop.cst.CstCallSiteRef r1) {
            r0 = this;
            r0.<init>()
            r0.invokeDynamicRef = r1
            r1 = 0
            r0.data = r1
            return
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r4) {
            r3 = this;
            com.android.dx.rop.cst.CstCallSiteRef r0 = r3.invokeDynamicRef
            com.android.dx.rop.cst.CstCallSite r0 = r0.getCallSite()
            com.android.dx.dex.file.CallSiteIdsSection r1 = r4.getCallSiteIds()
            com.android.dx.dex.file.CallSiteItem r2 = r1.getCallSiteItem(r0)
            if (r2 != 0) goto L1f
            com.android.dx.dex.file.MixedItemSection r4 = r4.getByteData()
            com.android.dx.dex.file.CallSiteItem r2 = new com.android.dx.dex.file.CallSiteItem
            r2.<init>(r0)
            r4.add(r2)
            r1.addCallSiteItem(r0, r2)
        L1f:
            r3.data = r2
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object r2) {
            r1 = this;
            com.android.dx.dex.file.CallSiteIdItem r2 = (com.android.dx.dex.file.CallSiteIdItem) r2
            com.android.dx.rop.cst.CstCallSiteRef r0 = r1.invokeDynamicRef
            com.android.dx.rop.cst.CstCallSiteRef r2 = r2.invokeDynamicRef
            int r2 = r0.compareTo2(r2)
            return r2
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_CALL_SITE_ID_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public int writeSize() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void writeTo(com.android.dx.dex.file.DexFile r3, com.android.dx.util.AnnotatedOutput r4) {
            r2 = this;
            com.android.dx.dex.file.CallSiteItem r3 = r2.data
            int r3 = r3.getAbsoluteOffset()
            boolean r0 = r4.annotates()
            if (r0 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.indexString()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            com.android.dx.rop.cst.CstCallSiteRef r1 = r2.invokeDynamicRef
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r4.annotate(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "call_site_off: "
            r0.append(r1)
            java.lang.String r1 = com.android.dx.util.Hex.u4(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r4.annotate(r1, r0)
        L47:
            r4.writeInt(r3)
            return
    }
}
