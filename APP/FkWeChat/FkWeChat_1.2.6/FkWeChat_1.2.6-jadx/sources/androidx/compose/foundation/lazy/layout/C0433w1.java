package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.InterfaceC0370f;
import p010a9.InterfaceC0184l;
import p263s.AbstractC6635e;
import p349y0.C9508c;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.w1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0433w1 implements InterfaceC0370f {

    /* JADX INFO: renamed from: a */
    public final C9508c f1264a = new C9508c(new InterfaceC0370f.a[16], 0);

    /* JADX INFO: renamed from: b */
    public int f1265b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0370f.a f1266c;

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0370f
    /* JADX INFO: renamed from: a */
    public int mo1196a() {
        return this.f1265b;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0370f
    /* JADX INFO: renamed from: b */
    public void mo1197b(int i10, int i11, InterfaceC0184l interfaceC0184l) {
        if (i10 < 0 || i10 >= mo1196a()) {
            AbstractC6635e.m26322e("Index " + i10 + ", size " + mo1196a());
        }
        if (i11 < 0 || i11 >= mo1196a()) {
            AbstractC6635e.m26322e("Index " + i11 + ", size " + mo1196a());
        }
        if (!(i11 >= i10)) {
            AbstractC6635e.m26318a("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')');
        }
        int iM1202b = AbstractC0374g.m1202b(this.f1264a, i10);
        int iM1199b = ((InterfaceC0370f.a) this.f1264a.f32299q[iM1202b]).m1199b();
        while (iM1199b <= i11) {
            InterfaceC0370f.a aVar = (InterfaceC0370f.a) this.f1264a.f32299q[iM1202b];
            interfaceC0184l.mo27m(aVar);
            iM1199b += aVar.m1198a();
            iM1202b++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1443c(int i10, Object obj) {
        if (!(i10 >= 0)) {
            AbstractC6635e.m26318a("size should be >=0");
        }
        if (i10 == 0) {
            return;
        }
        InterfaceC0370f.a aVar = new InterfaceC0370f.a(mo1196a(), i10, obj);
        this.f1265b = mo1196a() + i10;
        this.f1264a.m37029b(aVar);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1444d(InterfaceC0370f.a aVar, int i10) {
        return i10 < aVar.m1199b() + aVar.m1198a() && aVar.m1199b() <= i10;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0370f.a m1445e(int i10) {
        InterfaceC0370f.a aVar = this.f1266c;
        if (aVar != null && m1444d(aVar, i10)) {
            return aVar;
        }
        C9508c c9508c = this.f1264a;
        InterfaceC0370f.a aVar2 = (InterfaceC0370f.a) c9508c.f32299q[AbstractC0374g.m1202b(c9508c, i10)];
        this.f1266c = aVar2;
        return aVar2;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0370f
    public InterfaceC0370f.a get(int i10) {
        if (i10 < 0 || i10 >= mo1196a()) {
            AbstractC6635e.m26322e("Index " + i10 + ", size " + mo1196a());
        }
        return m1445e(i10);
    }
}
