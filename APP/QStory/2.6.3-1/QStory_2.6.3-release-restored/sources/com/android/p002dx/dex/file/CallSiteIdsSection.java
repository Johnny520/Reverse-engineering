package com.android.p002dx.dex.file;

import bsh.C3466;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstCallSite;
import com.android.p002dx.rop.cst.CstCallSiteRef;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallSiteIdsSection extends UniformItemSection {
    private final TreeMap<CstCallSiteRef, CallSiteIdItem> callSiteIds;
    private final TreeMap<CstCallSite, CallSiteItem> callSites;

    public CallSiteIdsSection(DexFile dexFile) {
        super("call_site_ids", dexFile, 4);
        this.callSiteIds = new TreeMap<>();
        this.callSites = new TreeMap<>();
    }

    public void addCallSiteItem(CstCallSite cstCallSite, CallSiteItem callSiteItem) {
        if (cstCallSite == null) {
            C3466.m5903("callSite == null");
        } else if (callSiteItem != null) {
            this.callSites.put(cstCallSite, callSiteItem);
        } else {
            C3466.m5903("callSiteItem == null");
        }
    }

    @Override // com.android.p002dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant == null) {
            C3466.m5903("cst == null");
            return null;
        }
        throwIfNotPrepared();
        CallSiteIdItem callSiteIdItem = this.callSiteIds.get((CstCallSiteRef) constant);
        if (callSiteIdItem != null) {
            return callSiteIdItem;
        }
        C6755.m11869("not found");
        return null;
    }

    public CallSiteItem getCallSiteItem(CstCallSite cstCallSite) {
        if (cstCallSite != null) {
            return this.callSites.get(cstCallSite);
        }
        C3466.m5903("callSite == null");
        return null;
    }

    public synchronized void intern(CstCallSiteRef cstCallSiteRef) {
        if (cstCallSiteRef == null) {
            throw new NullPointerException("cstRef");
        }
        throwIfPrepared();
        if (this.callSiteIds.get(cstCallSiteRef) == null) {
            this.callSiteIds.put(cstCallSiteRef, new CallSiteIdItem(cstCallSiteRef));
        }
    }

    @Override // com.android.p002dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.callSiteIds.values();
    }

    @Override // com.android.p002dx.dex.file.UniformItemSection
    public void orderItems() {
        Iterator<CallSiteIdItem> it = this.callSiteIds.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().setIndex(i);
            i++;
        }
    }
}
