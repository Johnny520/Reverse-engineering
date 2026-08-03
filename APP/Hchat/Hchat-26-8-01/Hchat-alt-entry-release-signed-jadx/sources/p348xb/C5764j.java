package p348xb;

import gg.C1424t;
import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
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

/* JADX INFO: renamed from: xb.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5764j extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public C3914t f23468g;

    /* JADX INFO: renamed from: h */
    public C3904k0 f23469h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1235p f23470i;

    /* JADX INFO: renamed from: j */
    public C3904k0 f23471j;

    /* JADX INFO: renamed from: k */
    public C1424t f23472k;

    /* JADX INFO: renamed from: l */
    public long f23473l;

    /* JADX INFO: renamed from: m */
    public long f23474m;

    /* JADX INFO: renamed from: n */
    public long f23475n;

    /* JADX INFO: renamed from: o */
    public int f23476o;

    /* JADX INFO: renamed from: p */
    public int f23477p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f23478q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1231l f23479r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1235p f23480s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1220a f23481t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1231l f23482u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5764j(InterfaceC1231l interfaceC1231l, InterfaceC1235p interfaceC1235p, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l2, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f23479r = interfaceC1231l;
        this.f23480s = interfaceC1235p;
        this.f23481t = interfaceC1220a;
        this.f23482u = interfaceC1231l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C5764j c5764j = new C5764j(this.f23479r, this.f23480s, this.f23481t, this.f23482u, interfaceC5557c);
        c5764j.f23478q = obj;
        return c5764j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C5764j) create((C3904k0) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (r4 == r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        if (r3 == r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        if (p057e1.C0807b.m2039b(r1.f12840g, r1.f12836c) == false) goto L66;
     */
    /* JADX WARN: Path cross not found for [B:61:0x0148, B:50:0x0125], limit reached: 76 */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00df -> B:39:0x00e2). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM6116a;
        C3914t c3914t;
        Object objM6117b;
        InterfaceC1235p interfaceC1235p;
        long j3;
        Object obj2;
        int i9;
        long j4;
        C1424t c1424t;
        long j5;
        int i10;
        long j10;
        C3904k0 c3904k0;
        Object objM8102e;
        C3904k0 c3904k02;
        int i11;
        Object obj3;
        Object obj4;
        C3904k0 c3904k03 = (C3904k0) this.f23478q;
        int i12 = this.f23477p;
        int i13 = 3;
        C3914t c3914t2 = null;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i12 == 0) {
            AbstractC1089i.m2732I0(obj);
            this.f23478q = c3904k03;
            this.f23477p = 1;
            objM6116a = AbstractC2677y2.m6116a(c3904k03, false, EnumC3905l.f12812g, this);
            if (objM6116a != enumC5799a) {
            }
            return enumC5799a;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                c3914t = this.f23468g;
                AbstractC1089i.m2732I0(obj);
                objM6117b = obj;
                this.f23479r.invoke((C3914t) objM6117b);
                C0807b c0807b = new C0807b(0L);
                interfaceC1235p = this.f23480s;
                interfaceC1235p.invoke(c3914t, c0807b);
                j3 = c3914t.f12834a;
                ?? r2 = c3904k03.f12811l.f12826z.f12800a;
                int size = r2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        obj2 = null;
                        break;
                    }
                    obj2 = r2.get(i14);
                    if (AbstractC3913s.m8112e(((C3914t) obj2).f12834a, j3)) {
                        break;
                    }
                    i14++;
                }
                C3914t c3914t3 = (C3914t) obj2;
                int i15 = (c3914t3 == null || !c3914t3.f12837d) ? 0 : 1;
                i9 = i15 ^ 1;
                if (i15 != 0) {
                    j4 = j3;
                    C1424t c1424t2 = new C1424t();
                    c1424t2.f4737g = j3;
                    c1424t = c1424t2;
                    j5 = j4;
                    i10 = i9;
                    j10 = j3;
                    c3904k0 = c3904k03;
                    this.f23478q = c3914t2;
                    this.f23468g = c3914t2;
                    this.f23469h = c3904k03;
                    this.f23470i = interfaceC1235p;
                    this.f23471j = c3904k0;
                    this.f23472k = c1424t;
                    this.f23473l = j5;
                    this.f23476o = i10;
                    this.f23474m = j10;
                    this.f23475n = j3;
                    this.f23477p = i13;
                    objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, this);
                }
                if (c3914t2 != null) {
                }
                return C3967n.f12976a;
            }
            if (i12 != 3) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j11 = this.f23475n;
            long j12 = this.f23474m;
            i10 = this.f23476o;
            long j13 = this.f23473l;
            c1424t = this.f23472k;
            C3904k0 c3904k04 = this.f23471j;
            InterfaceC1235p interfaceC1235p2 = this.f23470i;
            C3904k0 c3904k05 = this.f23469h;
            AbstractC1089i.m2732I0(obj);
            objM8102e = obj;
            c3904k0 = c3904k04;
            c3904k03 = c3904k05;
            interfaceC1235p = interfaceC1235p2;
            j5 = j13;
            j3 = j11;
            j10 = j12;
            C3903k c3903k = (C3903k) objM8102e;
            ?? r72 = c3903k.f12800a;
            int size2 = r72.size();
            C3904k0 c3904k06 = c3904k03;
            int i16 = 0;
            while (true) {
                if (i16 >= size2) {
                    c3904k02 = c3904k0;
                    i11 = i10;
                    obj3 = null;
                    break;
                }
                obj3 = r72.get(i16);
                int i17 = i16;
                c3904k02 = c3904k0;
                i11 = i10;
                int i18 = size2;
                if (AbstractC3913s.m8112e(((C3914t) obj3).f12834a, c1424t.f4737g)) {
                    break;
                }
                i16 = i17 + 1;
                c3904k0 = c3904k02;
                i10 = i11;
                size2 = i18;
            }
            C3914t c3914t4 = (C3914t) obj3;
            if (c3914t4 == null) {
                c3914t4 = null;
            } else if (AbstractC3913s.m8111d(c3914t4)) {
                ?? r22 = c3903k.f12800a;
                int size3 = r22.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size3) {
                        obj4 = null;
                        break;
                    }
                    obj4 = r22.get(i19);
                    if (((C3914t) obj4).f12837d) {
                        break;
                    }
                    i19++;
                }
                C3914t c3914t5 = (C3914t) obj4;
                if (c3914t5 != null) {
                    c1424t.f4737g = c3914t5.f12834a;
                    c3904k03 = c3904k06;
                    c3904k0 = c3904k02;
                    i10 = i11;
                    i13 = 3;
                    c3914t2 = null;
                    this.f23478q = c3914t2;
                    this.f23468g = c3914t2;
                    this.f23469h = c3904k03;
                    this.f23470i = interfaceC1235p;
                    this.f23471j = c3904k0;
                    this.f23472k = c1424t;
                    this.f23473l = j5;
                    this.f23476o = i10;
                    this.f23474m = j10;
                    this.f23475n = j3;
                    this.f23477p = i13;
                    objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, this);
                }
            }
            if (c3914t4 == null || c3914t4.m8119b()) {
                c3914t2 = null;
            } else if (AbstractC3913s.m8111d(c3914t4)) {
                c3914t2 = c3914t4;
            } else {
                interfaceC1235p.invoke(c3914t4, new C0807b(AbstractC3913s.m8115h(c3914t4, false)));
                j3 = c3914t4.f12834a;
                c3904k03 = c3904k06;
                j4 = j5;
                i9 = i11;
                i13 = 3;
                c3914t2 = null;
                C1424t c1424t22 = new C1424t();
                c1424t22.f4737g = j3;
                c1424t = c1424t22;
                j5 = j4;
                i10 = i9;
                j10 = j3;
                c3904k0 = c3904k03;
                this.f23478q = c3914t2;
                this.f23468g = c3914t2;
                this.f23469h = c3904k03;
                this.f23470i = interfaceC1235p;
                this.f23471j = c3904k0;
                this.f23472k = c1424t;
                this.f23473l = j5;
                this.f23476o = i10;
                this.f23474m = j10;
                this.f23475n = j3;
                this.f23477p = i13;
                objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, this);
            }
            if (c3914t2 != null) {
                this.f23481t.invoke();
            } else {
                this.f23482u.invoke(c3914t2);
            }
            return C3967n.f12976a;
        }
        AbstractC1089i.m2732I0(obj);
        objM6116a = obj;
        c3914t = (C3914t) objM6116a;
        this.f23478q = c3904k03;
        this.f23468g = c3914t;
        this.f23477p = 2;
        objM6117b = AbstractC2677y2.m6117b(c3904k03, this, 2);
    }
}
