package gb;

import p010a9.InterfaceC0173a;
import p160kb.InterfaceC4230j;
import p160kb.InterfaceC4238r;

/* JADX INFO: renamed from: gb.f */
/* JADX INFO: loaded from: classes2.dex */
public class C2660f implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final C2713t1 f6983q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC4238r f6984r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC4230j f6985s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC4230j f6986t;

    public C2660f(C2713t1 c2713t1, InterfaceC4238r interfaceC4238r, InterfaceC4230j interfaceC4230j, InterfaceC4230j interfaceC4230j2) {
        this.f6983q = c2713t1;
        this.f6984r = interfaceC4238r;
        this.f6985s = interfaceC4230j;
        this.f6986t = interfaceC4230j2;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return Boolean.valueOf(C2664g.m9409y(this.f6983q, this.f6984r, this.f6985s, this.f6986t));
    }
}
