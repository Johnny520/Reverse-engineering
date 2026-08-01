package p176i1;

import p000A.C0028O;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: i1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2285a extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7443e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DialogC2308x f7444f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2285a(DialogC2308x dialogC2308x, int i5) {
        super(1);
        this.f7443e = i5;
        this.f7444f = dialogC2308x;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f7443e) {
            case 0:
                DialogC2308x dialogC2308x = this.f7444f;
                dialogC2308x.show();
                return new C0028O(5, dialogC2308x);
            default:
                DialogC2308x dialogC2308x2 = this.f7444f;
                if (dialogC2308x2.f7517i.f7506a) {
                    dialogC2308x2.f7516h.mo6a();
                }
                return C0891q.f2780a;
        }
    }
}
