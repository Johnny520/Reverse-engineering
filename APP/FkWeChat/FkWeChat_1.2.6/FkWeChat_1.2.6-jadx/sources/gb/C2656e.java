package gb;

import gb.C2713t1;
import java.util.Collection;
import p010a9.InterfaceC0184l;
import p160kb.InterfaceC4230j;
import p160kb.InterfaceC4238r;

/* JADX INFO: renamed from: gb.e */
/* JADX INFO: loaded from: classes2.dex */
public class C2656e implements InterfaceC0184l {

    /* JADX INFO: renamed from: q */
    public final Collection f6978q;

    /* JADX INFO: renamed from: r */
    public final C2713t1 f6979r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC4238r f6980s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC4230j f6981t;

    public C2656e(Collection collection, C2713t1 c2713t1, InterfaceC4238r interfaceC4238r, InterfaceC4230j interfaceC4230j) {
        this.f6978q = collection;
        this.f6979r = c2713t1;
        this.f6980s = interfaceC4238r;
        this.f6981t = interfaceC4230j;
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public Object mo27m(Object obj) {
        return C2664g.m9408x(this.f6978q, this.f6979r, this.f6980s, this.f6981t, (C2713t1.a) obj);
    }
}
