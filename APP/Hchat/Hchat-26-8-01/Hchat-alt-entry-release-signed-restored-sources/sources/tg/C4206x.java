package tg;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1236q;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4206x extends AbstractC6044i implements InterfaceC1236q {

    /* JADX INFO: renamed from: h */
    public int f13800h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC4187e f13801i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ int f13802j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4207y f13803k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4206x(C4207y c4207y, InterfaceC5557c interfaceC5557c) {
        super(3, interfaceC5557c);
        this.f13803k = c4207y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        C4206x c4206x = new C4206x(this.f13803k, (InterfaceC5557c) obj3);
        c4206x.f13801i = (InterfaceC4187e) obj;
        c4206x.f13802j = iIntValue;
        return c4206x.invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.mo1602e(tg.EnumC4203u.f13793g, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r0.mo1602e(tg.EnumC4203u.f13795i, r7) != r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[PHI: r0
  0x0061: PHI (r0v3 tg.e) = (r0v2 tg.e), (r0v6 tg.e) binds: [B:25:0x005e, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[PHI: r0
  0x0071: PHI (r0v4 tg.e) = (r0v3 tg.e), (r0v7 tg.e) binds: [B:28:0x006e, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC4187e interfaceC4187e;
        int i9 = this.f13800h;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            interfaceC4187e = this.f13801i;
            if (this.f13802j > 0) {
                this.f13800h = 1;
            } else {
                this.f13801i = interfaceC4187e;
                this.f13800h = 2;
                if (AbstractC3603v.m7552f(0L, this) != enumC5799a) {
                    this.f13801i = interfaceC4187e;
                    this.f13800h = 3;
                    if (interfaceC4187e.mo1602e(EnumC4203u.f13794h, this) != enumC5799a) {
                    }
                }
            }
            return enumC5799a;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                interfaceC4187e = this.f13801i;
                AbstractC1089i.m2732I0(obj);
                this.f13801i = interfaceC4187e;
                this.f13800h = 3;
                if (interfaceC4187e.mo1602e(EnumC4203u.f13794h, this) != enumC5799a) {
                    this.f13801i = interfaceC4187e;
                    this.f13800h = 4;
                    if (AbstractC3603v.m7552f(Long.MAX_VALUE, this) != enumC5799a) {
                    }
                }
                return enumC5799a;
            }
            if (i9 == 3) {
                interfaceC4187e = this.f13801i;
                AbstractC1089i.m2732I0(obj);
                this.f13801i = interfaceC4187e;
                this.f13800h = 4;
                if (AbstractC3603v.m7552f(Long.MAX_VALUE, this) != enumC5799a) {
                    this.f13801i = null;
                    this.f13800h = 5;
                }
                return enumC5799a;
            }
            if (i9 == 4) {
                interfaceC4187e = this.f13801i;
                AbstractC1089i.m2732I0(obj);
                this.f13801i = null;
                this.f13800h = 5;
            } else if (i9 != 5) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        AbstractC1089i.m2732I0(obj);
        return C3967n.f12976a;
    }
}
