package p001A0;

import p043Y.AbstractC0454m;
import p043Y.InterfaceC0452k;
import p043Y.InterfaceC0453l;

/* JADX INFO: renamed from: A0.C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0017C implements InterfaceC0022H, InterfaceC0453l {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f52f;

    public /* synthetic */ C0017C(int r1) {
        this.f52f = r1;
    }

    @Override // p043Y.InterfaceC0453l
    /* JADX INFO: renamed from: a */
    public void mo54a(InterfaceC0452k r2, AbstractC0454m r3) {
        switch(this.f52f) {
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        r2.mo1044e();
        return;
    L6:
        r2.mo1040a();
        return;
    L8:
        r2.mo1042c(r3);
        return;
    L10:
        r2.mo1043d(r3);
        return;
    L12:
        r2.mo1068f(r3);
    }
}
