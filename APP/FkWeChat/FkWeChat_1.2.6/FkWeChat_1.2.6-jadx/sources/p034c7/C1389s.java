package p034c7;

import p010a9.InterfaceC0188p;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5977g;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: c7.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1389s implements InterfaceC5977g {

    /* JADX INFO: renamed from: q */
    public static final C1389s f4136q = new C1389s();

    /* JADX INFO: renamed from: r */
    public static final InterfaceC5980j.c f4137r = InterfaceC5977g.f18915n;

    /* JADX INFO: renamed from: c7.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC5976f {

        /* JADX INFO: renamed from: q */
        public final InterfaceC5980j f4138q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC5976f f4139r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ ClassLoader f4140s;

        public a(InterfaceC5976f interfaceC5976f, ClassLoader classLoader) {
            this.f4139r = interfaceC5976f;
            this.f4140s = classLoader;
            this.f4138q = interfaceC5976f.getContext();
        }

        @Override // p228p8.InterfaceC5976f
        public InterfaceC5980j getContext() {
            return this.f4138q;
        }

        @Override // p228p8.InterfaceC5976f
        public void resumeWith(Object obj) {
            Thread.currentThread().setContextClassLoader(this.f4140s);
            this.f4139r.resumeWith(obj);
        }
    }

    @Override // p228p8.InterfaceC5977g
    /* JADX INFO: renamed from: F0 */
    public void mo5456F0(InterfaceC5976f interfaceC5976f) {
        InterfaceC5977g.a.m23980e(this, interfaceC5976f);
    }

    @Override // p228p8.InterfaceC5977g
    /* JADX INFO: renamed from: G */
    public InterfaceC5976f mo5457G(InterfaceC5976f interfaceC5976f) {
        interfaceC5976f.getClass();
        return new a(interfaceC5976f, Thread.currentThread().getContextClassLoader());
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        return InterfaceC5977g.a.m23978c(this, cVar);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: c0 */
    public InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
        return InterfaceC5977g.a.m23979d(this, interfaceC5980j);
    }

    @Override // p228p8.InterfaceC5980j.b
    public InterfaceC5980j.c getKey() {
        return f4137r;
    }

    @Override // p228p8.InterfaceC5980j.b, p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        return InterfaceC5977g.a.m23977b(this, cVar);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: q */
    public Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
        return InterfaceC5977g.a.m23976a(this, obj, interfaceC0188p);
    }
}
