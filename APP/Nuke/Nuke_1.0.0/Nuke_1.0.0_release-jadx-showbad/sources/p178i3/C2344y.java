package p178i3;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1604f;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;

/* JADX INFO: renamed from: i3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2344y extends AbstractC1184i implements InterfaceC1604f {

    /* JADX INFO: renamed from: h */
    public int f7637h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC2324e f7638i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ int f7639j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2345z f7640k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2344y(C2345z c2345z, InterfaceC1046d interfaceC1046d) {
        super(3, interfaceC1046d);
        this.f7640k = c2345z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        C2344y c2344y = new C2344y(this.f7640k, (InterfaceC1046d) obj3);
        c2344y.f7638i = (InterfaceC2324e) obj;
        c2344y.f7639j = iIntValue;
        return c2344y.mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r0.mo9c(p178i3.EnumC2341v.f7630d, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r0.mo9c(p178i3.EnumC2341v.f7632f, r7) != r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[PHI: r0
  0x0062: PHI (r0v3 i3.e) = (r0v2 i3.e), (r0v6 i3.e) binds: [B:25:0x005f, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[PHI: r0
  0x0072: PHI (r0v4 i3.e) = (r0v3 i3.e), (r0v7 i3.e) binds: [B:28:0x006f, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        InterfaceC2324e interfaceC2324e;
        int i5 = this.f7637h;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            interfaceC2324e = this.f7638i;
            if (this.f7639j > 0) {
                this.f7637h = 1;
            } else {
                this.f7638i = interfaceC2324e;
                this.f7637h = 2;
                if (AbstractC2162v.m3983e(0L, this) != enumC1152a) {
                    this.f7638i = interfaceC2324e;
                    this.f7637h = 3;
                    if (interfaceC2324e.mo9c(EnumC2341v.f7631e, this) != enumC1152a) {
                    }
                }
            }
            return enumC1152a;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                interfaceC2324e = this.f7638i;
                AbstractC1784a.m3205S(obj);
                this.f7638i = interfaceC2324e;
                this.f7637h = 3;
                if (interfaceC2324e.mo9c(EnumC2341v.f7631e, this) != enumC1152a) {
                    this.f7638i = interfaceC2324e;
                    this.f7637h = 4;
                    if (AbstractC2162v.m3983e(Long.MAX_VALUE, this) != enumC1152a) {
                    }
                }
                return enumC1152a;
            }
            if (i5 == 3) {
                interfaceC2324e = this.f7638i;
                AbstractC1784a.m3205S(obj);
                this.f7638i = interfaceC2324e;
                this.f7637h = 4;
                if (AbstractC2162v.m3983e(Long.MAX_VALUE, this) != enumC1152a) {
                    this.f7638i = null;
                    this.f7637h = 5;
                }
                return enumC1152a;
            }
            if (i5 == 4) {
                interfaceC2324e = this.f7638i;
                AbstractC1784a.m3205S(obj);
                this.f7638i = null;
                this.f7637h = 5;
            } else if (i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        AbstractC1784a.m3205S(obj);
        return C0891q.f2780a;
    }
}
