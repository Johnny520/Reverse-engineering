package com.android.dx.dex.file;

import androidx.profileinstaller.AbstractC2442;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstCallSite;
import com.android.dx.rop.cst.CstCallSiteRef;
import com.android.dx.util.AnnotatedOutput;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class CallSiteIdItem extends IndexedItem implements Comparable<CallSiteIdItem> {
    private static final int ITEM_SIZE = 4;
    CallSiteItem data = null;
    final CstCallSiteRef invokeDynamicRef;

    public CallSiteIdItem(CstCallSiteRef cstCallSiteRef) {
        this.invokeDynamicRef = cstCallSiteRef;
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        CstCallSite callSite = this.invokeDynamicRef.getCallSite();
        CallSiteIdsSection callSiteIds = dexFile.getCallSiteIds();
        CallSiteItem callSiteItem = callSiteIds.getCallSiteItem(callSite);
        if (callSiteItem == null) {
            MixedItemSection byteData = dexFile.getByteData();
            callSiteItem = new CallSiteItem(callSite);
            byteData.add(callSiteItem);
            callSiteIds.addCallSiteItem(callSite, callSiteItem);
        }
        this.data = callSiteItem;
    }

    @Override // java.lang.Comparable
    public int compareTo(CallSiteIdItem callSiteIdItem) {
        return this.invokeDynamicRef.compareTo((Constant) callSiteIdItem.invokeDynamicRef);
    }

    @Override // com.android.dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_CALL_SITE_ID_ITEM;
    }

    @Override // com.android.dx.dex.file.Item
    public int writeSize() {
        return 4;
    }

    @Override // com.android.dx.dex.file.Item
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int absoluteOffset = this.data.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, indexString() + ' ' + this.invokeDynamicRef.toString());
            AbstractC2442.m4552(absoluteOffset, new StringBuilder("call_site_off: "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(absoluteOffset);
    }
}
