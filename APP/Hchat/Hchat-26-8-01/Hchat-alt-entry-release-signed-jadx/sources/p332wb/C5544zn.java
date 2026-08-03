package p332wb;

import java.util.Iterator;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p174m.AbstractC2677y2;
import p267s1.AbstractC3913s;
import p267s1.C3903k;
import p267s1.C3904k0;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.zn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5544zn extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22518g;

    /* JADX INFO: renamed from: h */
    public C3914t f22519h;

    /* JADX INFO: renamed from: i */
    public int f22520i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f22521j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1231l f22522k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4767c0 f22523l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5544zn(InterfaceC1231l interfaceC1231l, C4767c0 c4767c0, InterfaceC5557c interfaceC5557c, int i9) {
        super(interfaceC5557c);
        this.f22518g = i9;
        this.f22522k = interfaceC1231l;
        this.f22523l = c4767c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f22518g) {
            case 0:
                C5544zn c5544zn = new C5544zn(this.f22522k, this.f22523l, interfaceC5557c, 0);
                c5544zn.f22521j = obj;
                return c5544zn;
            default:
                C5544zn c5544zn2 = new C5544zn(this.f22522k, this.f22523l, interfaceC5557c, 1);
                c5544zn2.f22521j = obj;
                return c5544zn2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C3904k0 c3904k0 = (C3904k0) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f22518g) {
        }
        return ((C5544zn) create(c3904k0, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (r11.f12837d == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:18:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x011c -> B:45:0x011f). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM6117b;
        C3914t c3914t;
        long j3;
        Object objM8102e;
        Iterator it;
        Object next;
        C3914t c3914t2;
        Object objM6117b2;
        C3914t c3914t3;
        Object objM8102e2;
        Iterator it2;
        Object next2;
        C3914t c3914t4;
        switch (this.f22518g) {
            case 0:
                float f3 = this.f22523l.f16176a;
                C3904k0 c3904k0 = (C3904k0) this.f22521j;
                int i9 = this.f22520i;
                InterfaceC1231l interfaceC1231l = this.f22522k;
                int i10 = 2;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        objM6117b = obj;
                    } else if (i9 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        c3914t = this.f22519h;
                        AbstractC1089i.m2732I0(obj);
                        objM8102e = obj;
                        j3 = 4294967295L;
                        it = ((C3903k) objM8102e).f12800a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (AbstractC3913s.m8112e(((C3914t) next).f12834a, c3914t.f12834a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        c3914t2 = (C3914t) next;
                        if (c3914t2 != null) {
                            long j4 = c3914t2.f12836c;
                            long j5 = c3904k0.f12811l.f12820E;
                            interfaceC1231l.invoke(AbstractC4955ho.m9713y4(f3, (int) (j5 >> 32), (int) (j5 & j3), j4));
                            c3914t2.m8118a();
                            if (c3914t2.f12837d) {
                                i10 = 2;
                                this.f22521j = c3904k0;
                                this.f22519h = c3914t;
                                this.f22520i = i10;
                                objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, this);
                                if (objM8102e == enumC5799a) {
                                }
                                it = ((C3903k) objM8102e).f12800a.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                c3914t2 = (C3914t) next;
                                if (c3914t2 != null) {
                                }
                            }
                        }
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    this.f22521j = c3904k0;
                    this.f22520i = 1;
                    objM6117b = AbstractC2677y2.m6117b(c3904k0, this, 2);
                    if (objM6117b == enumC5799a) {
                    }
                }
                c3914t = (C3914t) objM6117b;
                long j10 = c3914t.f12836c;
                long j11 = c3904k0.f12811l.f12820E;
                j3 = 4294967295L;
                interfaceC1231l.invoke(AbstractC4955ho.m9713y4(f3, (int) (j11 >> 32), (int) (j11 & 4294967295L), j10));
                this.f22521j = c3904k0;
                this.f22519h = c3914t;
                this.f22520i = i10;
                objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, this);
                if (objM8102e == enumC5799a) {
                }
                it = ((C3903k) objM8102e).f12800a.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                c3914t2 = (C3914t) next;
                if (c3914t2 != null) {
                }
                break;
            default:
                C4767c0 c4767c0 = this.f22523l;
                float f10 = c4767c0.f16178c;
                float f11 = c4767c0.f16177b;
                C3904k0 c3904k02 = (C3904k0) this.f22521j;
                int i11 = this.f22520i;
                InterfaceC1231l interfaceC1231l2 = this.f22522k;
                EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        objM6117b2 = obj;
                    } else if (i11 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        c3914t3 = this.f22519h;
                        AbstractC1089i.m2732I0(obj);
                        objM8102e2 = obj;
                        it2 = ((C3903k) objM8102e2).f12800a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = null;
                            } else {
                                next2 = it2.next();
                                if (AbstractC3913s.m8112e(((C3914t) next2).f12834a, c3914t3.f12834a)) {
                                }
                            }
                        }
                        c3914t4 = (C3914t) next2;
                        if (c3914t4 != null) {
                            interfaceC1231l2.invoke(AbstractC4955ho.m9705x4(f11, f10, Float.intBitsToFloat((int) (c3914t4.f12836c & 4294967295L)), (int) (c3904k02.f12811l.f12820E & 4294967295L)));
                            c3914t4.m8118a();
                        }
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    this.f22521j = c3904k02;
                    this.f22520i = 1;
                    objM6117b2 = AbstractC2677y2.m6117b(c3904k02, this, 2);
                    if (objM6117b2 == enumC5799a2) {
                    }
                }
                c3914t3 = (C3914t) objM6117b2;
                interfaceC1231l2.invoke(AbstractC4955ho.m9705x4(f11, f10, Float.intBitsToFloat((int) (c3914t3.f12836c & 4294967295L)), (int) (c3904k02.f12811l.f12820E & 4294967295L)));
                this.f22521j = c3904k02;
                this.f22519h = c3914t3;
                this.f22520i = 2;
                objM8102e2 = c3904k02.m8102e(EnumC3905l.f12813h, this);
                if (objM8102e2 == enumC5799a2) {
                }
                it2 = ((C3903k) objM8102e2).f12800a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                c3914t4 = (C3914t) next2;
                if (c3914t4 != null) {
                }
                break;
        }
        return C3967n.f12976a;
    }
}
