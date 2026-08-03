package p332wb;

import java.util.Iterator;
import p000a.AbstractC0000a;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p174m.AbstractC2677y2;
import p218og.C3147k;
import p259r9.AbstractC3754e0;
import p267s1.AbstractC3913s;
import p267s1.C3903k;
import p267s1.C3904k0;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import p385zf.C6143b;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.go */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4922go extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public C3914t f17472g;

    /* JADX INFO: renamed from: h */
    public float f17473h;

    /* JADX INFO: renamed from: i */
    public float f17474i;

    /* JADX INFO: renamed from: j */
    public int f17475j;

    /* JADX INFO: renamed from: k */
    public int f17476k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f17477l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ EnumC5329t4 f17478m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1231l f17479n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4922go(EnumC5329t4 enumC5329t4, InterfaceC1231l interfaceC1231l, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f17478m = enumC5329t4;
        this.f17479n = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C4922go c4922go = new C4922go(this.f17478m, this.f17479n, interfaceC5557c);
        c4922go.f17477l = obj;
        return c4922go;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4922go) create((C3904k0) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r2 == r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r12 != r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        return r8;
     */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Iterable, java.lang.Object] */
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
        int i10;
        int iOrdinal;
        int iM54b0;
        C3904k0 c3904k0 = (C3904k0) this.f17477l;
        int i11 = this.f17476k;
        int i12 = 2;
        int i13 = 1;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i11 == 0) {
            AbstractC1089i.m2732I0(obj);
            this.f17477l = c3904k0;
            this.f17476k = 1;
            objM6117b = AbstractC2677y2.m6117b(c3904k0, this, 2);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i9 = this.f17475j;
                fIntBitsToFloat = this.f17474i;
                fIntBitsToFloat2 = this.f17473h;
                c3914t = this.f17472g;
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
                if (c3914t2 != null) {
                    long j3 = c3914t2.f12840g;
                    long j4 = c3914t2.f12836c;
                    int i14 = i13;
                    f3 = 0.0f;
                    fIntBitsToFloat2 += Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
                    fIntBitsToFloat += Float.intBitsToFloat((int) (j4 & 4294967295L)) - Float.intBitsToFloat((int) (j3 & 4294967295L));
                    if (i9 == 0 && Math.abs(fIntBitsToFloat2) > 24.0f && Math.abs(fIntBitsToFloat2) > Math.abs(fIntBitsToFloat) * 1.35f) {
                        i9 = i14;
                    }
                    if (i9 != 0) {
                        c3914t2.m8118a();
                    }
                    if (c3914t2.f12837d) {
                        i13 = i14;
                        i12 = 2;
                        this.f17477l = c3904k0;
                        this.f17472g = c3914t;
                        this.f17473h = fIntBitsToFloat2;
                        this.f17474i = fIntBitsToFloat;
                        this.f17475j = i9;
                        this.f17476k = i12;
                        objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, this);
                    }
                } else {
                    f3 = 0.0f;
                }
                if (i9 != 0 && Math.abs(fIntBitsToFloat2) > 86.0f && Math.abs(fIntBitsToFloat2) > Math.abs(fIntBitsToFloat) * 1.2f) {
                    C6143b c6143b = EnumC5329t4.f20750l;
                    EnumC5329t4 enumC5329t4 = this.f17478m;
                    if (fIntBitsToFloat2 < f3) {
                        C3147k c3147k = AbstractC4955ho.f17686a;
                        iOrdinal = enumC5329t4.ordinal() + 1;
                        iM54b0 = AbstractC0000a.m54b0(c6143b);
                        i10 = 0;
                    } else {
                        i10 = 0;
                        C3147k c3147k2 = AbstractC4955ho.f17686a;
                        iOrdinal = enumC5329t4.ordinal() - 1;
                        iM54b0 = AbstractC0000a.m54b0(c6143b);
                    }
                    EnumC5329t4 enumC5329t42 = (EnumC5329t4) c6143b.get(AbstractC3754e0.m7909r(iOrdinal, i10, iM54b0));
                    if (enumC5329t42 != enumC5329t4) {
                        this.f17479n.invoke(enumC5329t42);
                    }
                }
                return C3967n.f12976a;
            }
            AbstractC1089i.m2732I0(obj);
            objM6117b = obj;
        }
        c3914t = (C3914t) objM6117b;
        i9 = 0;
        fIntBitsToFloat = 0.0f;
        fIntBitsToFloat2 = 0.0f;
        this.f17477l = c3904k0;
        this.f17472g = c3914t;
        this.f17473h = fIntBitsToFloat2;
        this.f17474i = fIntBitsToFloat;
        this.f17475j = i9;
        this.f17476k = i12;
        objM8102e = c3904k0.m8102e(EnumC3905l.f12813h, this);
    }
}
