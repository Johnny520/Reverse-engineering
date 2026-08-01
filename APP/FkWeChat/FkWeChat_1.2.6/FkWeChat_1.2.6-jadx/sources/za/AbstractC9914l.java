package za;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5114x;
import p213oa.C5695f;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6004h;
import p244qb.AbstractC6378i;
import p342x9.InterfaceC9468b;

/* JADX INFO: renamed from: za.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9914l implements InterfaceC9913k {
    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: a */
    public Collection mo5513a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return AbstractC5114x.m20800o();
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: b */
    public Set mo5514b() {
        Collection collectionMo5519g = mo5519g(C9906d.f33414v, AbstractC6378i.m25367k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo5519g) {
            if (obj instanceof InterfaceC6000f1) {
                C5695f name = ((InterfaceC6000f1) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: c */
    public Collection mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return AbstractC5114x.m20800o();
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: d */
    public Set mo5516d() {
        Collection collectionMo5519g = mo5519g(C9906d.f33415w, AbstractC6378i.m25367k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo5519g) {
            if (obj instanceof InterfaceC6000f1) {
                C5695f name = ((InterfaceC6000f1) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: e */
    public Set mo5517e() {
        return null;
    }

    @Override // za.InterfaceC9916n
    /* JADX INFO: renamed from: f */
    public InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return null;
    }

    @Override // za.InterfaceC9916n
    /* JADX INFO: renamed from: g */
    public Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        return AbstractC5114x.m20800o();
    }
}
