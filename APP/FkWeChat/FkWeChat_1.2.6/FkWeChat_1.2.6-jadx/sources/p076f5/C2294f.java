package p076f5;

import p094g5.C2529l;
import p094g5.C2530m;
import p094g5.InterfaceC2519b;
import p094g5.InterfaceC2523f;
import p254r5.C6496e0;
import p254r5.C6521z;

/* JADX INFO: renamed from: f5.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2294f extends AbstractC2295g {

    /* JADX INFO: renamed from: f */
    public final C2530m f6291f;

    public C2294f(C2293e c2293e, C6496e0 c6496e0, int i10, AbstractC2290b abstractC2290b) {
        super(c2293e, c6496e0, i10, abstractC2290b);
        this.f6291f = new C2530m(m8389b());
    }

    @Override // p076f5.AbstractC2295g
    /* JADX INFO: renamed from: a */
    public int mo8385a() {
        return 1;
    }

    @Override // p076f5.AbstractC2295g
    /* JADX INFO: renamed from: e */
    public String mo8386e() {
        return "field";
    }

    @Override // p076f5.AbstractC2295g
    /* JADX INFO: renamed from: h */
    public InterfaceC2523f mo8387h(int i10, int i11, C6521z c6521z, InterfaceC2519b interfaceC2519b) {
        C2529l c2529l = new C2529l(m8390c(), i11, c6521z, interfaceC2519b);
        this.f6291f.m9035E(i10, c2529l);
        return c2529l;
    }

    /* JADX INFO: renamed from: j */
    public C2530m m8388j() {
        m8393g();
        return this.f6291f;
    }
}
