package p076f5;

import p094g5.C2532o;
import p094g5.C2533p;
import p094g5.InterfaceC2519b;
import p094g5.InterfaceC2523f;
import p254r5.C6496e0;
import p254r5.C6521z;

/* JADX INFO: renamed from: f5.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2296h extends AbstractC2295g {

    /* JADX INFO: renamed from: f */
    public final C2533p f6297f;

    public C2296h(C2293e c2293e, C6496e0 c6496e0, int i10, AbstractC2290b abstractC2290b) {
        super(c2293e, c6496e0, i10, abstractC2290b);
        this.f6297f = new C2533p(m8389b());
    }

    @Override // p076f5.AbstractC2295g
    /* JADX INFO: renamed from: a */
    public int mo8385a() {
        return 2;
    }

    @Override // p076f5.AbstractC2295g
    /* JADX INFO: renamed from: e */
    public String mo8386e() {
        return "method";
    }

    @Override // p076f5.AbstractC2295g
    /* JADX INFO: renamed from: h */
    public InterfaceC2523f mo8387h(int i10, int i11, C6521z c6521z, InterfaceC2519b interfaceC2519b) {
        C2532o c2532o = new C2532o(m8390c(), i11, c6521z, interfaceC2519b);
        this.f6297f.m9036E(i10, c2532o);
        return c2532o;
    }

    /* JADX INFO: renamed from: j */
    public C2533p m8395j() {
        m8393g();
        return this.f6297f;
    }
}
