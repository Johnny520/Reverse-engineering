package p069f;

import ng.AbstractC3014l;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: f.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0937h0 extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public C0939i0 f2947g;

    /* JADX INFO: renamed from: h */
    public C0941j0 f2948h;

    /* JADX INFO: renamed from: i */
    public long[] f2949i;

    /* JADX INFO: renamed from: j */
    public int f2950j;

    /* JADX INFO: renamed from: k */
    public int f2951k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f2952l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0941j0 f2953m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0939i0 f2954n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0937h0(C0941j0 c0941j0, C0939i0 c0939i0, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f2953m = c0941j0;
        this.f2954n = c0939i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C0937h0 c0937h0 = new C0937h0(this.f2953m, this.f2954n, interfaceC5557c);
        c0937h0.f2952l = obj;
        return c0937h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0937h0) create((AbstractC3014l) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        AbstractC3014l abstractC3014l;
        C0941j0 c0941j0;
        long[] jArr;
        int i9;
        C0939i0 c0939i0;
        int i10 = this.f2951k;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            abstractC3014l = (AbstractC3014l) this.f2952l;
            c0941j0 = this.f2953m;
            C0935g0 c0935g0 = c0941j0.f2962h;
            jArr = c0935g0.f2939c;
            i9 = c0935g0.f2941e;
            c0939i0 = this.f2954n;
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i9 = this.f2950j;
            jArr = this.f2949i;
            c0941j0 = this.f2948h;
            c0939i0 = this.f2947g;
            abstractC3014l = (AbstractC3014l) this.f2952l;
            AbstractC1089i.m2732I0(obj);
        }
        if (i9 == Integer.MAX_VALUE) {
            return C3967n.f12976a;
        }
        int i11 = (int) ((jArr[i9] >> 31) & 2147483647L);
        c0939i0.f2957h = i9;
        Object obj2 = c0941j0.f2962h.f2938b[i9];
        this.f2952l = abstractC3014l;
        this.f2947g = c0939i0;
        this.f2948h = c0941j0;
        this.f2949i = jArr;
        this.f2950j = i11;
        this.f2951k = 1;
        abstractC3014l.mo6406a(obj2, this);
        return EnumC5799a.f23547g;
    }
}
