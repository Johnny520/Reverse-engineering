package p332wb;

import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.List;
import p080fb.C1176t0;
import p085fg.InterfaceC1231l;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.l1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5062l1 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18543g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f18544h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f18545i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5062l1(InterfaceC1231l interfaceC1231l, List list) {
        this.f18543g = 3;
        this.f18545i = interfaceC1231l;
        this.f18544h = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Object next;
        switch (this.f18543g) {
            case 0:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19827n3, 3);
                C3623h.m7604a(c3623h, null, new C3874d(1996123040, new C5260r1(this.f18544h, this.f18545i, 0), true), 3);
                break;
            case 1:
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19835o3, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(322350627, new C5260r1(this.f18544h, this.f18545i, 2), true), 3);
                break;
            case 2:
                C4759bp c4759bp = (C4759bp) AbstractC4166m.m8425w1(((Integer) obj).intValue(), this.f18544h);
                if (c4759bp != null) {
                    this.f18545i.invoke(Integer.valueOf(c4759bp.f16109b));
                }
                return C3967n.f12976a;
            case 3:
                this.f18545i.invoke(((C5296s4) this.f18544h.get(((Integer) obj).intValue())).f20566a);
                break;
            case 4:
                C4825dq c4825dq = (C4825dq) AbstractC4166m.m8425w1(((Integer) obj).intValue(), this.f18544h);
                if (c4825dq != null) {
                    this.f18545i.invoke(c4825dq.f16694b);
                }
                return C3967n.f12976a;
            default:
                String str = (String) obj;
                str.getClass();
                Iterator it = this.f18544h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (AbstractC1416l.m3825a(((C1176t0) next).f3936a, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                C1176t0 c1176t0 = (C1176t0) next;
                if (c1176t0 != null) {
                    this.f18545i.invoke(c1176t0);
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5062l1(List list, InterfaceC1231l interfaceC1231l, int i9) {
        this.f18543g = i9;
        this.f18544h = list;
        this.f18545i = interfaceC1231l;
    }
}
