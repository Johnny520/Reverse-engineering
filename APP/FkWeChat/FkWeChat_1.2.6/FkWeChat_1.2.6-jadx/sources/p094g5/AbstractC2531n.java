package p094g5;

import bsh.C1259t2;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p254r5.C6521z;

/* JADX INFO: renamed from: g5.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2531n implements InterfaceC2523f {

    /* JADX INFO: renamed from: a */
    public final C6496e0 f6790a;

    /* JADX INFO: renamed from: b */
    public final int f6791b;

    /* JADX INFO: renamed from: c */
    public final C6521z f6792c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2519b f6793d;

    public AbstractC2531n(C6496e0 c6496e0, int i10, C6521z c6521z, InterfaceC2519b interfaceC2519b) {
        if (c6496e0 == null) {
            C1259t2.m5095a("definingClass == null");
            throw null;
        }
        if (c6521z == null) {
            C1259t2.m5095a("nat == null");
            throw null;
        }
        if (interfaceC2519b == null) {
            C1259t2.m5095a("attributes == null");
            throw null;
        }
        this.f6790a = c6496e0;
        this.f6791b = i10;
        this.f6792c = c6521z;
        this.f6793d = interfaceC2519b;
    }

    @Override // p094g5.InterfaceC2523f
    /* JADX INFO: renamed from: a */
    public final C6492c0 mo6749a() {
        return this.f6792c.m25812k();
    }

    @Override // p094g5.InterfaceC2523f
    /* JADX INFO: renamed from: b */
    public final int mo6750b() {
        return this.f6791b;
    }

    @Override // p094g5.InterfaceC2523f
    /* JADX INFO: renamed from: d */
    public final C6496e0 mo6752d() {
        return this.f6790a;
    }

    @Override // p094g5.InterfaceC2523f
    /* JADX INFO: renamed from: e */
    public final C6521z mo6753e() {
        return this.f6792c;
    }

    @Override // p094g5.InterfaceC2523f
    public final InterfaceC2519b getAttributes() {
        return this.f6793d;
    }

    @Override // p094g5.InterfaceC2523f
    public final C6492c0 getName() {
        return this.f6792c.m25814p();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(getClass().getName());
        sb2.append('{');
        sb2.append(this.f6792c.mo6828g());
        sb2.append('}');
        return sb2.toString();
    }
}
