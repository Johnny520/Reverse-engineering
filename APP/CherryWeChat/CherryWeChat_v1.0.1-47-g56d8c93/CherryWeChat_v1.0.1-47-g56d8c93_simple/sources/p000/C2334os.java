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

    public C2334os(ArrayList r1, InterfaceC1024Xt r2) {
        this.f8197b = r2;
        if (r1.isEmpty() == true) goto L7;
        this.f8196a = r1;
        this.f8198c = 0;
        return;
    L7:
        throw new IllegalArgumentException("Must not be empty.");
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        return ((InterfaceC2541tc) this.f8196a.get(0)).mo912a();
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: b */
    public final void mo635b(Exception r3) {
        List r0 = this.f8201f;
        AbstractC0714Qj.m1488j("Argument must not be null", r0);
        r0.add(r3);
        m4740g();
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        List r0 = this.f8201f;
        if (r0 == null) goto L5;
        this.f8197b.mo1934a(r0);
    L5:
        this.f8201f = null;
        Iterator r02 = this.f8196a.iterator();
    L7:
        if (r02.hasNext() == false) goto L9;
        ((InterfaceC2541tc) r02.next()).mo914c();
        goto L7
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        this.f8202g = true;
        Iterator r0 = this.f8196a.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((InterfaceC2541tc) r0.next()).cancel();
        goto L4
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu r2, InterfaceC2498sc r3) {
        this.f8199d = r2;
        this.f8200e = r3;
        this.f8201f = (List) this.f8197b.mo1935c();
        ((InterfaceC2541tc) this.f8196a.get(this.f8198c)).mo915d(r2, this);
        if (this.f8202g == false) goto L6;
        cancel();
        return;
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: e */
    public final void mo638e(Object r2) {
        if (r2 == null) goto L5;
        this.f8200e.mo638e(r2);
        return;
    L5:
        m4740g();
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return ((InterfaceC2541tc) this.f8196a.get(0)).mo916f();
    }

    /* JADX INFO: renamed from: g */
    public final void m4740g() {
        if (this.f8202g == false) goto L6;
        return;
    L6:
        if (this.f8198c >= (this.f8196a.size() - 1)) goto L9;
        this.f8198c++;
        mo915d(this.f8199d, this.f8200e);
        return;
    L9:
        AbstractC0714Qj.m1487i(this.f8201f);
        this.f8200e.mo635b(new C0842Tj("Fetch failed", new ArrayList(this.f8201f)));
    }
}
