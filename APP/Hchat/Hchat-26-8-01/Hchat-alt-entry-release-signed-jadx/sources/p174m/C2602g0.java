package p174m;

import java.util.concurrent.CancellationException;
import p015b0.C0136d0;
import p036c9.C0479q0;
import p036c9.C0497w0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p267s1.AbstractC3913s;
import p267s1.C3904k0;
import p267s1.C3914t;
import p276sf.C3967n;
import p332wb.C4714ad;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2602g0 extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public int f8428g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f8429h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4714ad f8430i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0497w0 f8431j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0497w0 f8432k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0479q0 f8433l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2602g0(C4714ad c4714ad, C0497w0 c0497w0, C0497w0 c0497w02, C0479q0 c0479q0, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f8430i = c4714ad;
        this.f8431j = c0497w0;
        this.f8432k = c0497w02;
        this.f8433l = c0479q0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C2602g0 c2602g0 = new C2602g0(this.f8430i, this.f8431j, this.f8432k, this.f8433l, interfaceC5557c);
        c2602g0.f8429h = obj;
        return c2602g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2602g0) create((C3904k0) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r9 == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[Catch: CancellationException -> 0x001a, TryCatch #0 {CancellationException -> 0x001a, blocks: (B:8:0x0015, B:32:0x008e, B:34:0x0096, B:36:0x00a3, B:38:0x00af, B:39:0x00b2, B:40:0x00b5, B:41:0x00bb, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:46:0x0009 }] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C3904k0 c3904k0;
        C3914t c3914t;
        int i9 = this.f8428g;
        C0497w0 c0497w0 = this.f8432k;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        try {
            if (i9 == 0) {
                AbstractC1089i.m2732I0(obj);
                c3904k0 = (C3904k0) this.f8429h;
                this.f8429h = c3904k0;
                this.f8428g = 1;
                obj = AbstractC2677y2.m6117b(c3904k0, this, 2);
                if (obj == enumC5799a) {
                }
                return enumC5799a;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c3904k0 = (C3904k0) this.f8429h;
                    AbstractC1089i.m2732I0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ?? r92 = c3904k0.f12811l.f12826z.f12800a;
                        int size = r92.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            C3914t c3914t2 = (C3914t) r92.get(i10);
                            if (AbstractC3913s.m8110c(c3914t2)) {
                                c3914t2.m8118a();
                            }
                        }
                        this.f8431j.invoke();
                    } else {
                        c0497w0.invoke();
                    }
                    return C3967n.f12976a;
                }
                c3904k0 = (C3904k0) this.f8429h;
                AbstractC1089i.m2732I0(obj);
                c3914t = (C3914t) obj;
                if (c3914t != null) {
                    C4714ad c4714ad = this.f8430i;
                    InterfaceC1809a1 interfaceC1809a1 = c4714ad.f15750h;
                    InterfaceC1809a1 interfaceC1809a12 = c4714ad.f15751i;
                    InterfaceC1809a1 interfaceC1809a13 = c4714ad.f15752j;
                    interfaceC1809a1.setValue(Float.valueOf(0.0f));
                    Boolean bool = Boolean.TRUE;
                    interfaceC1809a12.setValue(bool);
                    ((InterfaceC1231l) interfaceC1809a13.getValue()).invoke(bool);
                    long j3 = c3914t.f12834a;
                    C0136d0 c0136d0 = new C0136d0(this.f8433l, 26);
                    this.f8429h = c3904k0;
                    this.f8428g = 3;
                    obj = AbstractC2615j0.m6067d(c3904k0, j3, c0136d0, this);
                }
                return C3967n.f12976a;
            }
            c3904k0 = (C3904k0) this.f8429h;
            AbstractC1089i.m2732I0(obj);
            long j4 = ((C3914t) obj).f12834a;
            this.f8429h = c3904k0;
            this.f8428g = 2;
            obj = AbstractC2615j0.m6065b(c3904k0, j4, this);
            if (obj != enumC5799a) {
                c3914t = (C3914t) obj;
                if (c3914t != null) {
                }
                return C3967n.f12976a;
            }
            return enumC5799a;
        } catch (CancellationException e6) {
            c0497w0.invoke();
            throw e6;
        }
    }
}
