package p076P;

import p056K2.C0891q;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p112W2.InterfaceC1601c;
import p137b3.InterfaceC1855c;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: P.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1108u implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3616d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f3617e;

    public /* synthetic */ C1108u(String str, int i5) {
        this.f3616d = i5;
        this.f3617e = str;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        int i5 = this.f3616d;
        C0891q c0891q = C0891q.f2780a;
        String str = this.f3617e;
        InterfaceC1136w interfaceC1136w = (InterfaceC1136w) obj;
        switch (i5) {
            case 0:
                InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
                C1135v c1135v = AbstractC1132s.f3741d;
                InterfaceC1855c interfaceC1855c = AbstractC1134u.f3766a[2];
                interfaceC1136w.mo1128a(c1135v, str);
                break;
            default:
                InterfaceC1855c[] interfaceC1855cArr2 = AbstractC1134u.f3766a;
                interfaceC1136w.mo1128a(AbstractC1132s.f3738a, AbstractC2352g.m4211y(str));
                AbstractC1134u.m2189b(interfaceC1136w, 5);
                break;
        }
        return c0891q;
    }
}
