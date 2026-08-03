package p332wb;

import java.util.Iterator;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p174m.AbstractC2677y2;
import p259r9.AbstractC3754e0;
import p267s1.AbstractC3913s;
import p267s1.C3903k;
import p267s1.C3904k0;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.mt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5123mt extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public C3914t f19073g;

    /* JADX INFO: renamed from: h */
    public float f19074h;

    /* JADX INFO: renamed from: i */
    public float f19075i;

    /* JADX INFO: renamed from: j */
    public int f19076j;

    /* JADX INFO: renamed from: k */
    public int f19077k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f19078l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ float f19079m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1220a f19080n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1220a f19081o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f19082p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5123mt(float f3, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1809a1 interfaceC1809a1, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f19079m = f3;
        this.f19080n = interfaceC1220a;
        this.f19081o = interfaceC1220a2;
        this.f19082p = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C5123mt c5123mt = new C5123mt(this.f19079m, this.f19080n, this.f19081o, this.f19082p, interfaceC5557c);
        c5123mt.f19078l = obj;
        return c5123mt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C5123mt) create((C3904k0) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r2 == r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r11 != r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        return r7;
     */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:17:0x0056). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM6117b;
        C3914t c3914t;
        int i9;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        Object objM8102e;
        Object next;
        float f3;
        InterfaceC1220a interfaceC1220a;
        C3904k0 c3904k0 = (C3904k0) this.f19078l;
        int i10 = this.f19077k;
        int i11 = 2;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            this.f19078l = c3904k0;
            this.f19077k = 1;
            objM6117b = AbstractC2677y2.m6117b(c3904k0, this, 2);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i9 = this.f19076j;
                fIntBitsToFloat = this.f19075i;
                fIntBitsToFloat2 = this.f19074h;
                c3914t = this.f19073g;
                AbstractC1089i.m2732I0(obj);
                objM8102e = obj;
                Iterator it = ((C3903k) objM8102e).f12800a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC3913s.m8112e(((C3914t) next).f12834a, c3914t.f12834a)) {
                        break;
                    }
                }
                C3914t c3914t2 = (C3914t) next;
                float f10 = this.f19079m;
                InterfaceC1809a1 interfaceC1809a1 = this.f19082p;
                if (c3914t2 != null) {
                    long j3 = c3914t2.f12840g;
                    long j4 = c3914t2.f12836c;
                    f3 = 0.0f;
                    C3904k0 c3904k02 = c3904k0;
                    int i12 = i9;
                    fIntBitsToFloat2 += Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
                    fIntBitsToFloat += Float.intBitsToFloat((int) (j4 & 4294967295L)) - Float.intBitsToFloat((int) (4294967295L & j3));
                    i9 = (i12 != 0 || Math.abs(fIntBitsToFloat2) <= c3904k02.m8099B().mo10228f() || Math.abs(fIntBitsToFloat2) <= Math.abs(fIntBitsToFloat) * 1.25f) ? i12 : 1;
                    if (i9 != 0) {
                        interfaceC1809a1.setValue(Float.valueOf(AbstractC3754e0.m7907q(fIntBitsToFloat2, -f10, f10)));
                        c3914t2.m8118a();
                    }
                    if (c3914t2.f12837d) {
                        c3904k0 = c3904k02;
                        i11 = 2;
                        this.f19078l = c3904k0;
                        this.f19073g = c3914t;
                        this.f19074h = fIntBitsToFloat2;
                        this.f19075i = fIntBitsToFloat;
                        this.f19076j = i9;
                        this.f19077k = i11;
                        objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, this);
                    }
                } else {
                    f3 = 0.0f;
                }
                byte b10 = ((Number) interfaceC1809a1.getValue()).floatValue() >= f10 * 0.58f ? (byte) 1 : ((Number) interfaceC1809a1.getValue()).floatValue() <= (-f10) * 0.58f ? (byte) -1 : (byte) 0;
                interfaceC1809a1.setValue(Float.valueOf(f3));
                if (b10 <= 0) {
                    if (b10 < 0) {
                        interfaceC1220a = this.f19081o;
                    }
                    return C3967n.f12976a;
                }
                interfaceC1220a = this.f19080n;
                interfaceC1220a.invoke();
                return C3967n.f12976a;
            }
            AbstractC1089i.m2732I0(obj);
            objM6117b = obj;
        }
        c3914t = (C3914t) objM6117b;
        i9 = 0;
        fIntBitsToFloat = 0.0f;
        fIntBitsToFloat2 = 0.0f;
        this.f19078l = c3904k0;
        this.f19073g = c3914t;
        this.f19074h = fIntBitsToFloat2;
        this.f19075i = fIntBitsToFloat;
        this.f19076j = i9;
        this.f19077k = i11;
        objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, this);
    }
}
