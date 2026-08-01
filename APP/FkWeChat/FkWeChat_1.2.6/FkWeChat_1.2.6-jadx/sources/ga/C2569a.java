package ga;

import ga.AbstractC2578d;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: ga.a */
/* JADX INFO: loaded from: classes2.dex */
public class C2569a implements InterfaceC0184l {

    /* JADX INFO: renamed from: q */
    public final AbstractC2578d f6839q;

    /* JADX INFO: renamed from: r */
    public final AbstractC2578d.a f6840r;

    public C2569a(AbstractC2578d abstractC2578d, AbstractC2578d.a aVar) {
        this.f6839q = abstractC2578d;
        this.f6840r = aVar;
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public Object mo27m(Object obj) {
        return Boolean.valueOf(AbstractC2578d.m9109i(this.f6839q, this.f6840r, obj));
    }
}
