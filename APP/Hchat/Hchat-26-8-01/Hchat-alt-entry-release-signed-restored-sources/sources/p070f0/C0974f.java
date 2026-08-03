package p070f0;

import p041d1.C0676v;
import p085fg.InterfaceC1220a;
import p321w.C4629q0;
import p321w.C4642w;
import p339x1.AbstractC5618k;
import p357y1.C5892i1;
import p357y1.InterfaceC5885g2;

/* JADX INFO: renamed from: f0.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0974f implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3074g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0977i f3075h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0974f(C0977i c0977i, int i9) {
        this.f3074g = i9;
        this.f3075h = c0977i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f3074g) {
            case 0:
                AbstractC5618k.m10163s(this.f3075h);
                break;
            case 1:
                this.f3075h.f3081B.m4022h(true);
                break;
            case 2:
                this.f3075h.f3081B.m4019d(true);
                break;
            case 3:
                this.f3075h.f3081B.m4020f();
                break;
            case 4:
                AbstractC5618k.m10163s(this.f3075h);
                break;
            case 5:
                this.f3075h.f3081B.m4030p();
                break;
            case 6:
                C0977i c0977i = this.f3075h;
                C4642w c4642w = c0977i.f3086y.f15348w;
                c4642w.f15415h.f15343r.m795M(c0977i.f3082C.f9297e);
                break;
            default:
                C0977i c0977i2 = this.f3075h;
                C4629q0 c4629q0 = c0977i2.f3086y;
                C0676v c0676v = c0977i2.f3083D;
                if (c4629q0.m9049b()) {
                    InterfaceC5885g2 interfaceC5885g2 = c4629q0.f15328c;
                    if (interfaceC5885g2 != null) {
                        ((C5892i1) interfaceC5885g2).m10613b();
                    }
                } else {
                    C0676v.m1859a(c0676v);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
