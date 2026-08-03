package p174m;

import gg.C1425u;
import java.util.concurrent.CancellationException;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import sg.C3971c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2635o0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8577h = 0;

    /* JADX INFO: renamed from: i */
    public C1425u f8578i;

    /* JADX INFO: renamed from: j */
    public C1425u f8579j;

    /* JADX INFO: renamed from: k */
    public int f8580k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f8581l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ AbstractC2639p0 f8582m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2635o0(C1425u c1425u, AbstractC2639p0 abstractC2639p0, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f8579j = c1425u;
        this.f8582m = abstractC2639p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f8577h) {
            case 0:
                C2635o0 c2635o0 = new C2635o0(this.f8579j, this.f8582m, interfaceC5557c);
                c2635o0.f8581l = obj;
                return c2635o0;
            default:
                C2635o0 c2635o02 = new C2635o0(this.f8582m, interfaceC5557c);
                c2635o02.f8581l = obj;
                return c2635o02;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8577h) {
            case 0:
                return ((C2635o0) create((InterfaceC1231l) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            default:
                return ((C2635o0) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(7:35|36|(0)|15|87|39|(2:45|(2:47|(0)))(2:41|(1:43))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:39:0x00b0, B:41:0x00b6, B:45:0x00c8, B:47:0x00cc), top: B:87:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:39:0x00b0, B:41:0x00b6, B:45:0x00c8, B:47:0x00cc), top: B:87:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0087 -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c3 -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ca -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d7 -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e5 -> B:12:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x013b -> B:77:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0140 -> B:79:0x0141). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1231l interfaceC1231l;
        Object obj2;
        InterfaceC3599t interfaceC3599t;
        C1425u c1425u;
        C1425u c1425u2;
        C1425u c1425u3;
        InterfaceC3599t interfaceC3599t2;
        InterfaceC3599t interfaceC3599t3;
        Object obj3;
        C2635o0 c2635o0;
        AbstractC2577b0 abstractC2577b0;
        Object obj4;
        switch (this.f8577h) {
            case 0:
                C1425u c1425u4 = this.f8579j;
                int i9 = this.f8580k;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    interfaceC1231l = (InterfaceC1231l) this.f8581l;
                    obj2 = c1425u4.f4738g;
                    if (obj2 instanceof C2572a0) {
                    }
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C1425u c1425u5 = this.f8578i;
                    interfaceC1231l = (InterfaceC1231l) this.f8581l;
                    AbstractC1089i.m2732I0(obj);
                    AbstractC2577b0 abstractC2577b02 = (AbstractC2577b0) obj;
                    c1425u5.f4738g = abstractC2577b02;
                    obj2 = c1425u4.f4738g;
                    if ((obj2 instanceof C2572a0) && !(obj2 instanceof C2670x)) {
                        abstractC2577b02 = null;
                        C2674y c2674y = obj2 instanceof C2674y ? (C2674y) obj2 : null;
                        if (c2674y != null) {
                            interfaceC1231l.invoke(c2674y);
                        }
                        C3971c c3971c = this.f8582m.f8604B;
                        if (c3971c == null) {
                            c1425u5 = c1425u4;
                            c1425u5.f4738g = abstractC2577b02;
                            obj2 = c1425u4.f4738g;
                            if (obj2 instanceof C2572a0) {
                            }
                        } else {
                            this.f8581l = interfaceC1231l;
                            this.f8578i = c1425u4;
                            this.f8580k = 1;
                            obj = c3971c.mo8198f(this);
                            EnumC5799a enumC5799a = EnumC5799a.f23547g;
                            if (obj != enumC5799a) {
                                c1425u5 = c1425u4;
                                AbstractC2577b0 abstractC2577b022 = (AbstractC2577b0) obj;
                                c1425u5.f4738g = abstractC2577b022;
                                obj2 = c1425u4.f4738g;
                                if (obj2 instanceof C2572a0) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
                int i10 = this.f8580k;
                AbstractC2639p0 abstractC2639p0 = this.f8582m;
                EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                switch (i10) {
                    case 0:
                        AbstractC1089i.m2732I0(obj);
                        interfaceC3599t = (InterfaceC3599t) this.f8581l;
                        if (AbstractC3603v.m7561o(interfaceC3599t)) {
                            c1425u = new C1425u();
                            C3971c c3971c2 = abstractC2639p0.f8604B;
                            if (c3971c2 != null) {
                                this.f8581l = interfaceC3599t;
                                this.f8578i = c1425u;
                                this.f8579j = c1425u;
                                this.f8580k = 1;
                                obj = c3971c2.mo8198f(this);
                                if (obj != enumC5799a2) {
                                    c1425u2 = c1425u;
                                    abstractC2577b0 = (AbstractC2577b0) obj;
                                    c1425u.f4738g = abstractC2577b0;
                                    obj4 = c1425u2.f4738g;
                                    if (obj4 instanceof C2678z) {
                                        this.f8581l = interfaceC3599t;
                                        this.f8578i = c1425u2;
                                        this.f8579j = null;
                                        this.f8580k = 2;
                                        if (AbstractC2639p0.m6098o1(abstractC2639p0, (C2678z) obj4, this) != enumC5799a2) {
                                            c1425u3 = c1425u2;
                                            interfaceC3599t2 = interfaceC3599t;
                                            c2635o0 = new C2635o0(c1425u3, abstractC2639p0, null);
                                            this.f8581l = interfaceC3599t2;
                                            this.f8578i = c1425u3;
                                            this.f8580k = 3;
                                            if (abstractC2639p0.mo6061r1(c2635o0, this) == enumC5799a2) {
                                            }
                                            interfaceC3599t = interfaceC3599t2;
                                            obj3 = c1425u3.f4738g;
                                            if (obj3 instanceof C2572a0) {
                                                this.f8581l = interfaceC3599t;
                                                this.f8578i = null;
                                                this.f8580k = 4;
                                                if (AbstractC2639p0.m6099p1(abstractC2639p0, (C2572a0) obj3, this) == enumC5799a2) {
                                                }
                                                break;
                                            } else if (obj3 instanceof C2670x) {
                                                this.f8581l = interfaceC3599t;
                                                this.f8578i = null;
                                                this.f8580k = 5;
                                                if (AbstractC2639p0.m6097n1(abstractC2639p0, this) == enumC5799a2) {
                                                }
                                            }
                                        }
                                    }
                                    if (AbstractC3603v.m7561o(interfaceC3599t)) {
                                        break;
                                    }
                                }
                            } else {
                                c1425u2 = c1425u;
                                abstractC2577b0 = null;
                                c1425u.f4738g = abstractC2577b0;
                                obj4 = c1425u2.f4738g;
                                if (obj4 instanceof C2678z) {
                                }
                                if (AbstractC3603v.m7561o(interfaceC3599t)) {
                                }
                            }
                        }
                        break;
                    case 1:
                        c1425u = this.f8579j;
                        c1425u2 = this.f8578i;
                        interfaceC3599t = (InterfaceC3599t) this.f8581l;
                        AbstractC1089i.m2732I0(obj);
                        abstractC2577b0 = (AbstractC2577b0) obj;
                        c1425u.f4738g = abstractC2577b0;
                        obj4 = c1425u2.f4738g;
                        if (obj4 instanceof C2678z) {
                        }
                        if (AbstractC3603v.m7561o(interfaceC3599t)) {
                        }
                        break;
                    case 2:
                        c1425u3 = this.f8578i;
                        interfaceC3599t2 = (InterfaceC3599t) this.f8581l;
                        AbstractC1089i.m2732I0(obj);
                        c2635o0 = new C2635o0(c1425u3, abstractC2639p0, null);
                        this.f8581l = interfaceC3599t2;
                        this.f8578i = c1425u3;
                        this.f8580k = 3;
                        if (abstractC2639p0.mo6061r1(c2635o0, this) == enumC5799a2) {
                        }
                        interfaceC3599t = interfaceC3599t2;
                        obj3 = c1425u3.f4738g;
                        if (obj3 instanceof C2572a0) {
                        }
                        if (AbstractC3603v.m7561o(interfaceC3599t)) {
                        }
                        break;
                    case 3:
                        c1425u3 = this.f8578i;
                        interfaceC3599t2 = (InterfaceC3599t) this.f8581l;
                        try {
                            AbstractC1089i.m2732I0(obj);
                        } catch (CancellationException unused) {
                            interfaceC3599t3 = interfaceC3599t2;
                            this.f8581l = interfaceC3599t3;
                            this.f8578i = null;
                            this.f8580k = 6;
                            if (AbstractC2639p0.m6097n1(abstractC2639p0, this) == enumC5799a2) {
                            }
                            interfaceC3599t = interfaceC3599t3;
                            if (AbstractC3603v.m7561o(interfaceC3599t)) {
                            }
                        }
                        interfaceC3599t = interfaceC3599t2;
                        obj3 = c1425u3.f4738g;
                        if (obj3 instanceof C2572a0) {
                        }
                        if (AbstractC3603v.m7561o(interfaceC3599t)) {
                        }
                        break;
                    case 4:
                        interfaceC3599t3 = (InterfaceC3599t) this.f8581l;
                        try {
                            AbstractC1089i.m2732I0(obj);
                        } catch (CancellationException unused2) {
                            this.f8581l = interfaceC3599t3;
                            this.f8578i = null;
                            this.f8580k = 6;
                            if (AbstractC2639p0.m6097n1(abstractC2639p0, this) == enumC5799a2) {
                                return enumC5799a2;
                            }
                        }
                        interfaceC3599t = interfaceC3599t3;
                        if (AbstractC3603v.m7561o(interfaceC3599t)) {
                        }
                        break;
                    case 5:
                        interfaceC3599t3 = (InterfaceC3599t) this.f8581l;
                        AbstractC1089i.m2732I0(obj);
                        interfaceC3599t = interfaceC3599t3;
                        if (AbstractC3603v.m7561o(interfaceC3599t)) {
                        }
                        break;
                    case 6:
                        interfaceC3599t3 = (InterfaceC3599t) this.f8581l;
                        AbstractC1089i.m2732I0(obj);
                        interfaceC3599t = interfaceC3599t3;
                        if (AbstractC3603v.m7561o(interfaceC3599t)) {
                        }
                        break;
                    default:
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2635o0(AbstractC2639p0 abstractC2639p0, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f8582m = abstractC2639p0;
    }
}
