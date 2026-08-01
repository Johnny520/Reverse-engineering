package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.C0423t0;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p010a9.InterfaceC0184l;
import p119i1.AbstractC3137l;
import p135j2.InterfaceC3537j1;
import p172l8.C4700i0;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0411p0 implements InterfaceC3537j1, InterfaceC3537j1.a, C0423t0.a {

    /* JADX INFO: renamed from: a */
    public final Object f1173a;

    /* JADX INFO: renamed from: b */
    public final C0423t0 f1174b;

    /* JADX INFO: renamed from: d */
    public int f1176d;

    /* JADX INFO: renamed from: e */
    public InterfaceC3537j1.a f1177e;

    /* JADX INFO: renamed from: f */
    public boolean f1178f;

    /* JADX INFO: renamed from: c */
    public int f1175c = -1;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0512i2 f1179g = AbstractC0522j5.m1773e(null, null, 2, null);

    public C0411p0(Object obj, C0423t0 c0423t0) {
        this.f1173a = obj;
        this.f1174b = c0423t0;
    }

    @Override // p135j2.InterfaceC3537j1.a
    /* JADX INFO: renamed from: a */
    public void mo1310a() {
        if (this.f1178f) {
            return;
        }
        if (!(this.f1176d > 0)) {
            AbstractC6635e.m26320c("Release should only be called once");
        }
        int i10 = this.f1176d - 1;
        this.f1176d = i10;
        if (i10 == 0) {
            this.f1174b.m1403q(this);
            InterfaceC3537j1.a aVar = this.f1177e;
            if (aVar != null) {
                aVar.mo1310a();
            }
            this.f1177e = null;
        }
    }

    @Override // p135j2.InterfaceC3537j1
    /* JADX INFO: renamed from: b */
    public InterfaceC3537j1.a mo1311b() {
        if (this.f1178f) {
            AbstractC6635e.m26320c("Pin should not be called on an already disposed item ");
        }
        if (this.f1176d == 0) {
            this.f1174b.m1402p(this);
            InterfaceC3537j1 interfaceC3537j1M1312c = m1312c();
            this.f1177e = interfaceC3537j1M1312c != null ? interfaceC3537j1M1312c.mo1311b() : null;
        }
        this.f1176d++;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3537j1 m1312c() {
        return m1313d();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC3537j1 m1313d() {
        return (InterfaceC3537j1) this.f1179g.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m1314e() {
        this.f1178f = true;
    }

    /* JADX INFO: renamed from: f */
    public void m1315f(int i10) {
        this.f1175c = i10;
    }

    /* JADX INFO: renamed from: g */
    public final void m1316g(InterfaceC3537j1 interfaceC3537j1) {
        AbstractC3137l.a aVar = AbstractC3137l.f8345e;
        AbstractC3137l abstractC3137lM11765d = aVar.m11765d();
        InterfaceC0184l interfaceC0184lMo11676g = abstractC3137lM11765d != null ? abstractC3137lM11765d.mo11676g() : null;
        AbstractC3137l abstractC3137lM11767f = aVar.m11767f(abstractC3137lM11765d);
        try {
            if (interfaceC3537j1 != m1313d()) {
                m1317h(interfaceC3537j1);
                if (this.f1176d > 0) {
                    InterfaceC3537j1.a aVar2 = this.f1177e;
                    if (aVar2 != null) {
                        aVar2.mo1310a();
                    }
                    this.f1177e = interfaceC3537j1 != null ? interfaceC3537j1.mo1311b() : null;
                }
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
            aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
        } catch (Throwable th) {
            aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
            throw th;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.C0423t0.a
    public int getIndex() {
        return this.f1175c;
    }

    @Override // androidx.compose.foundation.lazy.layout.C0423t0.a
    public Object getKey() {
        return this.f1173a;
    }

    /* JADX INFO: renamed from: h */
    public final void m1317h(InterfaceC3537j1 interfaceC3537j1) {
        this.f1179g.setValue(interfaceC3537j1);
    }
}
