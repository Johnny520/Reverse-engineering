package com.android.dx.dex.file;

import bsh.C2632;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstCallSite;
import com.android.dx.rop.cst.CstCallSiteRef;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            C2632.m5298("callSite == null");
        } else if (callSiteItem != null) {
            this.callSites.put(cstCallSite, callSiteItem);
        } else {
            C2632.m5298("callSiteItem == null");
        }
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant == null) {
            C2632.m5298("cst == null");
            return null;
        }
        throwIfNotPrepared();
        CallSiteIdItem callSiteIdItem = this.callSiteIds.get((CstCallSiteRef) constant);
        if (callSiteIdItem != null) {
            return callSiteIdItem;
        }
        C5919.m11249("not found");
        return null;
    }

    public CallSiteItem getCallSiteItem(CstCallSite cstCallSite) {
        if (cstCallSite != null) {
            return this.callSites.get(cstCallSite);
        }
        C2632.m5298("callSite == null");
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

    @Override // com.android.dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.callSiteIds.values();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
        Iterator<CallSiteIdItem> it = this.callSiteIds.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().setIndex(i);
            i++;
        }
    }
}
