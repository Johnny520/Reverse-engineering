package p176i1;

import p000A.C0028O;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p153e1.EnumC2017m;

/* JADX INFO: renamed from: i1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2291g extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2310z f7467e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1599a f7468f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2283D f7469g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f7470h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ EnumC2017m f7471i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2291g(C2310z c2310z, InterfaceC1599a interfaceC1599a, C2283D c2283d, String str, EnumC2017m enumC2017m) {
        super(1);
        this.f7467e = c2310z;
        this.f7468f = interfaceC1599a;
        this.f7469g = c2283d;
        this.f7470h = str;
        this.f7471i = enumC2017m;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        C2310z c2310z = this.f7467e;
        c2310z.f7537r.addView(c2310z, c2310z.f7538s);
        c2310z.m4139k(this.f7468f, this.f7469g, this.f7470h, this.f7471i);
        return new C0028O(6, c2310z);
    }
}
