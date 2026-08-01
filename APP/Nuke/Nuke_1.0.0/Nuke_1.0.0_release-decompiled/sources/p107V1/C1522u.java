package p107V1;

import com.bumptech.glide.EnumC1928j;
import com.bumptech.glide.load.data.InterfaceC1933c;
import com.bumptech.glide.load.data.InterfaceC1934d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p088R1.C1224y;
import p195l2.AbstractC2503g;
import p223q1.InterfaceC2909c;

/* JADX INFO: renamed from: V1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1522u implements InterfaceC1934d, InterfaceC1933c {

    /* JADX INFO: renamed from: d */
    public final ArrayList f5275d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2909c f5276e;

    /* JADX INFO: renamed from: f */
    public int f5277f;

    /* JADX INFO: renamed from: g */
    public EnumC1928j f5278g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1933c f5279h;

    /* JADX INFO: renamed from: i */
    public List f5280i;

    /* JADX INFO: renamed from: j */
    public boolean f5281j;

    public C1522u(ArrayList arrayList, InterfaceC2909c interfaceC2909c) {
        this.f5276e = interfaceC2909c;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f5275d = arrayList;
        this.f5277f = 0;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        return ((InterfaceC1934d) this.f5275d.get(0)).mo2222a();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: b */
    public final void mo2223b() {
        List list = this.f5280i;
        if (list != null) {
            this.f5276e.mo97a(list);
        }
        this.f5280i = null;
        Iterator it = this.f5275d.iterator();
        while (it.hasNext()) {
            ((InterfaceC1934d) it.next()).mo2223b();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: c */
    public final int mo2224c() {
        return ((InterfaceC1934d) this.f5275d.get(0)).mo2224c();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    public final void cancel() {
        this.f5281j = true;
        Iterator it = this.f5275d.iterator();
        while (it.hasNext()) {
            ((InterfaceC1934d) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: d */
    public final void mo2225d(EnumC1928j enumC1928j, InterfaceC1933c interfaceC1933c) {
        this.f5278g = enumC1928j;
        this.f5279h = interfaceC1933c;
        this.f5280i = (List) this.f5276e.mo99c();
        ((InterfaceC1934d) this.f5275d.get(this.f5277f)).mo2225d(enumC1928j, this);
        if (this.f5281j) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1933c
    /* JADX INFO: renamed from: e */
    public final void mo36e(Exception exc) {
        List list = this.f5280i;
        AbstractC2503g.m4445c(list, "Argument must not be null");
        list.add(exc);
        m2788f();
    }

    /* JADX INFO: renamed from: f */
    public final void m2788f() {
        if (this.f5281j) {
            return;
        }
        if (this.f5277f < this.f5275d.size() - 1) {
            this.f5277f++;
            mo2225d(this.f5278g, this.f5279h);
        } else {
            AbstractC2503g.m4444b(this.f5280i);
            this.f5279h.mo36e(new C1224y("Fetch failed", new ArrayList(this.f5280i)));
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1933c
    /* JADX INFO: renamed from: l */
    public final void mo43l(Object obj) {
        if (obj != null) {
            this.f5279h.mo43l(obj);
        } else {
            m2788f();
        }
    }
}
