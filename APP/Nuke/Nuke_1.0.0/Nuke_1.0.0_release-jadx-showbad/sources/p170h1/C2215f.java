package p170h1;

import p001A0.C0105e;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p153e1.C2021q;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: h1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2215f extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public int f7218h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f7219i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC2218i f7220j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f7221k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2215f(boolean z5, AbstractC2218i abstractC2218i, long j5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f7219i = z5;
        this.f7220j = abstractC2218i;
        this.f7221k = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2215f) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        return new C2215f(this.f7219i, this.f7220j, this.f7221k, interfaceC1046d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r11 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r11 == r3) goto L18;
     */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        int i5 = this.f7218h;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            boolean z5 = this.f7219i;
            AbstractC2218i abstractC2218i = this.f7220j;
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (z5) {
                C0105e c0105e = abstractC2218i.f7231d;
                this.f7218h = 2;
                obj = c0105e.m137a(this.f7221k, 0L, this);
            } else {
                C0105e c0105e2 = abstractC2218i.f7231d;
                this.f7218h = 1;
                obj = c0105e2.m137a(0L, this.f7221k, this);
            }
            return enumC1152a;
        }
        if (i5 == 1) {
            AbstractC1784a.m3205S(obj);
            ((C2021q) obj).getClass();
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
            ((C2021q) obj).getClass();
        }
        return C0891q.f2780a;
    }
}
