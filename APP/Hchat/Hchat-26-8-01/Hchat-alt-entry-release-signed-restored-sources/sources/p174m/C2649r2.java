package p174m;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import p371yg.C6046b;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.r2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2649r2 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8648h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2656t1 f8649i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2649r2(C2656t1 c2656t1, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f8648h = i9;
        this.f8649i = c2656t1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f8648h) {
            case 0:
                return new C2649r2(this.f8649i, interfaceC5557c, 0);
            case 1:
                return new C2649r2(this.f8649i, interfaceC5557c, 1);
            case 2:
                return new C2649r2(this.f8649i, interfaceC5557c, 2);
            case 3:
                return new C2649r2(this.f8649i, interfaceC5557c, 3);
            case 4:
                return new C2649r2(this.f8649i, interfaceC5557c, 4);
            case 5:
                return new C2649r2(this.f8649i, interfaceC5557c, 5);
            case 6:
                return new C2649r2(this.f8649i, interfaceC5557c, 6);
            default:
                return new C2649r2(this.f8649i, interfaceC5557c, 7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f8648h) {
            case 0:
                C2649r2 c2649r2 = (C2649r2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c2649r2.invokeSuspend(c3967n);
                return c3967n;
            case 1:
                C2649r2 c2649r22 = (C2649r2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c2649r22.invokeSuspend(c3967n2);
                return c3967n2;
            case 2:
                C2649r2 c2649r23 = (C2649r2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n3 = C3967n.f12976a;
                c2649r23.invokeSuspend(c3967n3);
                return c3967n3;
            case 3:
                C2649r2 c2649r24 = (C2649r2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n4 = C3967n.f12976a;
                c2649r24.invokeSuspend(c3967n4);
                return c3967n4;
            case 4:
                C2649r2 c2649r25 = (C2649r2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n5 = C3967n.f12976a;
                c2649r25.invokeSuspend(c3967n5);
                return c3967n5;
            case 5:
                C2649r2 c2649r26 = (C2649r2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n6 = C3967n.f12976a;
                c2649r26.invokeSuspend(c3967n6);
                return c3967n6;
            case 6:
                C2649r2 c2649r27 = (C2649r2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n7 = C3967n.f12976a;
                c2649r27.invokeSuspend(c3967n7);
                return c3967n7;
            default:
                C2649r2 c2649r28 = (C2649r2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n8 = C3967n.f12976a;
                c2649r28.invokeSuspend(c3967n8);
                return c3967n8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f8648h;
        C3967n c3967n = C3967n.f12976a;
        C2656t1 c2656t1 = this.f8649i;
        switch (i9) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                c2656t1.f8670i = true;
                C6046b c6046b = c2656t1.f8671j;
                if (c6046b.m10805c()) {
                    c6046b.m10808f(null);
                }
                break;
            case 1:
                AbstractC1089i.m2732I0(obj);
                c2656t1.m6114e();
                break;
            case 2:
                AbstractC1089i.m2732I0(obj);
                c2656t1.m6114e();
                break;
            case 3:
                AbstractC1089i.m2732I0(obj);
                c2656t1.f8670i = true;
                C6046b c6046b2 = c2656t1.f8671j;
                if (c6046b2.m10805c()) {
                    c6046b2.m10808f(null);
                }
                break;
            case 4:
                AbstractC1089i.m2732I0(obj);
                c2656t1.m6114e();
                break;
            case 5:
                AbstractC1089i.m2732I0(obj);
                c2656t1.m6114e();
                break;
            case 6:
                AbstractC1089i.m2732I0(obj);
                c2656t1.f8670i = true;
                C6046b c6046b3 = c2656t1.f8671j;
                if (c6046b3.m10805c()) {
                    c6046b3.m10808f(null);
                }
                break;
            default:
                AbstractC1089i.m2732I0(obj);
                c2656t1.m6114e();
                break;
        }
        return c3967n;
    }
}
