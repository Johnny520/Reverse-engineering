package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: os */
/* JADX INFO: loaded from: classes.dex */
public final class C2334os implements InterfaceC2541tc, InterfaceC2498sc {

    /* JADX INFO: renamed from: a */
    public final ArrayList f8196a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1024Xt f8197b;

    /* JADX INFO: renamed from: c */
    public int f8198c;

    /* JADX INFO: renamed from: d */
    public EnumC2688wu f8199d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2498sc f8200e;

    /* JADX INFO: renamed from: f */
    public List f8201f;

    /* JADX INFO: renamed from: g */
    public boolean f8202g;

    public C2334os(ArrayList arrayList, InterfaceC1024Xt interfaceC1024Xt) {
        this.f8197b = interfaceC1024Xt;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f8196a = arrayList;
        this.f8198c = 0;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        return ((InterfaceC2541tc) this.f8196a.get(0)).mo912a();
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: b */
    public final void mo635b(Exception exc) {
        List list = this.f8201f;
        AbstractC0714Qj.m1488j("Argument must not be null", list);
        list.add(exc);
        m4740g();
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        List list = this.f8201f;
        if (list != null) {
            this.f8197b.mo1934a(list);
        }
        this.f8201f = null;
        Iterator it = this.f8196a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2541tc) it.next()).mo914c();
        }
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        this.f8202g = true;
        Iterator it = this.f8196a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2541tc) it.next()).cancel();
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu enumC2688wu, InterfaceC2498sc interfaceC2498sc) {
        this.f8199d = enumC2688wu;
        this.f8200e = interfaceC2498sc;
        this.f8201f = (List) this.f8197b.mo1935c();
        ((InterfaceC2541tc) this.f8196a.get(this.f8198c)).mo915d(enumC2688wu, this);
        if (this.f8202g) {
            cancel();
        }
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: e */
    public final void mo638e(Object obj) {
        if (obj != null) {
            this.f8200e.mo638e(obj);
        } else {
            m4740g();
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return ((InterfaceC2541tc) this.f8196a.get(0)).mo916f();
    }

    /* JADX INFO: renamed from: g */
    public final void m4740g() {
        if (this.f8202g) {
            return;
        }
        if (this.f8198c < this.f8196a.size() - 1) {
            this.f8198c++;
            mo915d(this.f8199d, this.f8200e);
        } else {
            AbstractC0714Qj.m1487i(this.f8201f);
            this.f8200e.mo635b(new C0842Tj("Fetch failed", new ArrayList(this.f8201f)));
        }
    }
}
