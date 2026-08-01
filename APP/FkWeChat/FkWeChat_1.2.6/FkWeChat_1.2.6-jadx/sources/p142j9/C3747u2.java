package p142j9;

import p010a9.InterfaceC0173a;
import p172l8.InterfaceC4705l;

/* JADX INFO: renamed from: j9.u2 */
/* JADX INFO: loaded from: classes2.dex */
public class C3747u2 implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final C3751v2 f10313q;

    /* JADX INFO: renamed from: r */
    public final int f10314r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC4705l f10315s;

    public C3747u2(C3751v2 c3751v2, int i10, InterfaceC4705l interfaceC4705l) {
        this.f10313q = c3751v2;
        this.f10314r = i10;
        this.f10315s = interfaceC4705l;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return C3751v2.m13875l(this.f10313q, this.f10314r, this.f10315s);
    }
}
