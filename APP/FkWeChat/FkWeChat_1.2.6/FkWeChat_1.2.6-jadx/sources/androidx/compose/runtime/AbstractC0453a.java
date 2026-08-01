package androidx.compose.runtime;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.runtime.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0453a implements InterfaceC0474d {

    /* JADX INFO: renamed from: d */
    public static final int f1294d = 8;

    /* JADX INFO: renamed from: a */
    public final Object f1295a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1296b = AbstractC0557o5.m2112c(null, 1, null);

    /* JADX INFO: renamed from: c */
    public Object f1297c;

    public AbstractC0453a(Object obj) {
        this.f1295a = obj;
        this.f1297c = obj;
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: a */
    public Object mo1476a() {
        return this.f1297c;
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    public final void clear() {
        AbstractC0557o5.m2110a(this.f1296b);
        m1481n(this.f1295a);
        mo1480m();
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: d */
    public void mo1477d(Object obj) {
        AbstractC0557o5.m2119j(this.f1296b, mo1476a());
        m1481n(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: h */
    public void mo1478h() {
        m1481n(AbstractC0557o5.m2118i(this.f1296b));
    }

    /* JADX INFO: renamed from: l */
    public final Object m1479l() {
        return this.f1295a;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo1480m();

    /* JADX INFO: renamed from: n */
    public void m1481n(Object obj) {
        this.f1297c = obj;
    }
}
