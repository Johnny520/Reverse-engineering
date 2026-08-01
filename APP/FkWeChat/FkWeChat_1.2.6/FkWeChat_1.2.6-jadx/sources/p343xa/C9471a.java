package p343xa;

import ba.C1083k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p185m8.AbstractC5070c0;
import p213oa.C5695f;
import p229p9.InterfaceC5995e;
import p273s9.C7222k0;

/* JADX INFO: renamed from: xa.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9471a implements InterfaceC9477g {

    /* JADX INFO: renamed from: b */
    public final List f32183b;

    public C9471a(List list) {
        list.getClass();
        this.f32183b = list;
    }

    @Override // p343xa.InterfaceC9477g
    /* JADX INFO: renamed from: a */
    public List mo36886a(InterfaceC5995e interfaceC5995e, C1083k c1083k) {
        interfaceC5995e.getClass();
        c1083k.getClass();
        List list = this.f32183b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5070c0.m20492E(arrayList, ((InterfaceC9477g) it.next()).mo36886a(interfaceC5995e, c1083k));
        }
        return arrayList;
    }

    @Override // p343xa.InterfaceC9477g
    /* JADX INFO: renamed from: b */
    public List mo36887b(InterfaceC5995e interfaceC5995e, C1083k c1083k) {
        interfaceC5995e.getClass();
        c1083k.getClass();
        List list = this.f32183b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5070c0.m20492E(arrayList, ((InterfaceC9477g) it.next()).mo36887b(interfaceC5995e, c1083k));
        }
        return arrayList;
    }

    @Override // p343xa.InterfaceC9477g
    /* JADX INFO: renamed from: c */
    public C7222k0 mo36888c(InterfaceC5995e interfaceC5995e, C7222k0 c7222k0, C1083k c1083k) {
        interfaceC5995e.getClass();
        c7222k0.getClass();
        c1083k.getClass();
        Iterator it = this.f32183b.iterator();
        while (it.hasNext()) {
            c7222k0 = ((InterfaceC9477g) it.next()).mo36888c(interfaceC5995e, c7222k0, c1083k);
        }
        return c7222k0;
    }

    @Override // p343xa.InterfaceC9477g
    /* JADX INFO: renamed from: d */
    public void mo36889d(InterfaceC5995e interfaceC5995e, C5695f c5695f, Collection collection, C1083k c1083k) {
        interfaceC5995e.getClass();
        c5695f.getClass();
        collection.getClass();
        c1083k.getClass();
        Iterator it = this.f32183b.iterator();
        while (it.hasNext()) {
            ((InterfaceC9477g) it.next()).mo36889d(interfaceC5995e, c5695f, collection, c1083k);
        }
    }

    @Override // p343xa.InterfaceC9477g
    /* JADX INFO: renamed from: e */
    public void mo36890e(InterfaceC5995e interfaceC5995e, List list, C1083k c1083k) {
        interfaceC5995e.getClass();
        list.getClass();
        c1083k.getClass();
        Iterator it = this.f32183b.iterator();
        while (it.hasNext()) {
            ((InterfaceC9477g) it.next()).mo36890e(interfaceC5995e, list, c1083k);
        }
    }

    @Override // p343xa.InterfaceC9477g
    /* JADX INFO: renamed from: f */
    public List mo36891f(InterfaceC5995e interfaceC5995e, C1083k c1083k) {
        interfaceC5995e.getClass();
        c1083k.getClass();
        List list = this.f32183b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5070c0.m20492E(arrayList, ((InterfaceC9477g) it.next()).mo36891f(interfaceC5995e, c1083k));
        }
        return arrayList;
    }

    @Override // p343xa.InterfaceC9477g
    /* JADX INFO: renamed from: g */
    public void mo36892g(InterfaceC5995e interfaceC5995e, C5695f c5695f, List list, C1083k c1083k) {
        interfaceC5995e.getClass();
        c5695f.getClass();
        list.getClass();
        c1083k.getClass();
        Iterator it = this.f32183b.iterator();
        while (it.hasNext()) {
            ((InterfaceC9477g) it.next()).mo36892g(interfaceC5995e, c5695f, list, c1083k);
        }
    }

    @Override // p343xa.InterfaceC9477g
    /* JADX INFO: renamed from: h */
    public void mo36893h(InterfaceC5995e interfaceC5995e, C5695f c5695f, Collection collection, C1083k c1083k) {
        interfaceC5995e.getClass();
        c5695f.getClass();
        collection.getClass();
        c1083k.getClass();
        Iterator it = this.f32183b.iterator();
        while (it.hasNext()) {
            ((InterfaceC9477g) it.next()).mo36893h(interfaceC5995e, c5695f, collection, c1083k);
        }
    }
}
