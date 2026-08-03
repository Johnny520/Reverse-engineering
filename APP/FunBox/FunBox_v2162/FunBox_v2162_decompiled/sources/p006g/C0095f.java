package p006g;

import p004e.InterfaceC0031h;
import p010k.AbstractC0171a;

/* JADX INFO: renamed from: g.f */
/* JADX INFO: loaded from: classes.dex */
final class C0095f implements InterfaceC0031h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0100k f356a;

    C0095f(C0100k c0100k) {
        this.f356a = c0100k;
    }

    @Override // p004e.InterfaceC0031h
    /* JADX INFO: renamed from: a */
    public final int mo119a(AbstractC0171a abstractC0171a) {
        AbstractC0107r abstractC0107rM292b = this.f356a.m292b(abstractC0171a);
        if (abstractC0107rM292b == null) {
            return -1;
        }
        return abstractC0107rM292b.m317e();
    }
}
