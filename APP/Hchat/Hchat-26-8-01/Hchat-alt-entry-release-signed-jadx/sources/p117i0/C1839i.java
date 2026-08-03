package p117i0;

import gg.AbstractC1428x;
import ng.AbstractC3014l;
import p068eh.AbstractC0921a;
import p069f.C0933f0;
import p069f.C0964v;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1839i extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public int f6125g;

    /* JADX INFO: renamed from: h */
    public int f6126h;

    /* JADX INFO: renamed from: i */
    public int f6127i;

    /* JADX INFO: renamed from: j */
    public int f6128j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f6129k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1843j f6130l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1839i(C1843j c1843j, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f6130l = c1843j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C1839i c1839i = new C1839i(this.f6130l, interfaceC5557c);
        c1839i.f6129k = obj;
        return c1839i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1839i) create((AbstractC3014l) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        AbstractC3014l abstractC3014l;
        int i9;
        int i10;
        int i11;
        String strM2249l;
        int i12;
        int i13;
        String str;
        C1843j c1843j = this.f6130l;
        C0933f0 c0933f0 = c1843j.f6133g;
        C0964v c0964v = c1843j.f6135i;
        int i14 = this.f6128j;
        if (i14 == 0) {
            AbstractC1089i.m2732I0(obj);
            abstractC3014l = (AbstractC3014l) this.f6129k;
            i9 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            if (i14 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i9 = this.f6127i;
            i10 = this.f6126h;
            i11 = this.f6125g;
            abstractC3014l = (AbstractC3014l) this.f6129k;
            AbstractC1089i.m2732I0(obj);
        }
        if (i11 >= Math.min(c1843j.f6136j + 10, c0964v.f3036b)) {
            return C3967n.f12976a;
        }
        int i15 = i11 + 1;
        int iM2371c = c0964v.m2371c(i11);
        switch (iM2371c) {
            case 0:
                strM2249l = "up";
                break;
            case 1:
                Object objM2291f = c0933f0.m2291f(i10);
                i10++;
                strM2249l = "down " + objM2291f;
                break;
            case 2:
                strM2249l = "remove " + c0964v.m2371c(i15) + ' ' + c0964v.m2371c(i11 + 2);
                i15 = i11 + 3;
                break;
            case 3:
                strM2249l = "move " + c0964v.m2371c(i15) + ' ' + c0964v.m2371c(i11 + 2) + ' ' + c0964v.m2371c(i11 + 3);
                i15 = i11 + 4;
                break;
            case 4:
                strM2249l = "clear";
                break;
            case 5:
                i12 = i11 + 2;
                int iM2371c2 = c0964v.m2371c(i15);
                i13 = i10 + 1;
                str = "insertBottomUp " + iM2371c2 + ' ' + c0933f0.m2291f(i10);
                int i16 = i12;
                strM2249l = str;
                i15 = i16;
                i10 = i13;
                break;
            case 6:
                i12 = i11 + 2;
                int iM2371c3 = c0964v.m2371c(i15);
                i13 = i10 + 1;
                str = "insertTopDown " + iM2371c3 + ' ' + c0933f0.m2291f(i10);
                int i162 = i12;
                strM2249l = str;
                i15 = i162;
                i10 = i13;
                break;
            case 7:
                Object objM2291f2 = c0933f0.m2291f(i10);
                objM2291f2.getClass();
                AbstractC1428x.m3838c(2, objM2291f2);
                i10 += 2;
                strM2249l = "apply " + ((InterfaceC1235p) objM2291f2);
                break;
            case 8:
                strM2249l = "reuse " + c1843j.f6134h.m2291f(i9);
                i9++;
                break;
            case 9:
                strM2249l = "recompose pending";
                break;
            default:
                strM2249l = AbstractC0921a.m2249l(iM2371c, "unknown op: ");
                break;
        }
        this.f6129k = abstractC3014l;
        this.f6125g = i15;
        this.f6126h = i10;
        this.f6127i = i9;
        this.f6128j = 1;
        abstractC3014l.mo6406a(i11 + ": " + strM2249l, this);
        return EnumC5799a.f23547g;
    }
}
