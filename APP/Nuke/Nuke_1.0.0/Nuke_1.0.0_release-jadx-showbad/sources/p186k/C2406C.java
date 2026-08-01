package p186k;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p124Z.C1779c;
import p127Z2.AbstractC1784a;
import p143c3.C1906h;

/* JADX INFO: renamed from: k.C */
/* JADX INFO: loaded from: classes.dex */
public final class C2406C extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public C1779c f7777f;

    /* JADX INFO: renamed from: g */
    public C2407D f7778g;

    /* JADX INFO: renamed from: h */
    public long[] f7779h;

    /* JADX INFO: renamed from: i */
    public int f7780i;

    /* JADX INFO: renamed from: j */
    public int f7781j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f7782k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2407D f7783l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1779c f7784m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2406C(C2407D c2407d, C1779c c1779c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f7783l = c2407d;
        this.f7784m = c1779c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2406C) mo7n((InterfaceC1046d) obj2, (C1906h) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2406C c2406c = new C2406C(this.f7783l, this.f7784m, interfaceC1046d);
        c2406c.f7782k = obj;
        return c2406c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        C1906h c1906h;
        C2407D c2407d;
        long[] jArr;
        int i5;
        C1779c c1779c;
        int i6 = this.f7781j;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj);
            c1906h = (C1906h) this.f7782k;
            c2407d = this.f7783l;
            C2405B c2405b = c2407d.f7786e;
            jArr = c2405b.f7771c;
            i5 = c2405b.f7773e;
            c1779c = this.f7784m;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i5 = this.f7780i;
            jArr = this.f7779h;
            c2407d = this.f7778g;
            c1779c = this.f7777f;
            c1906h = (C1906h) this.f7782k;
            AbstractC1784a.m3205S(obj);
        }
        if (i5 == Integer.MAX_VALUE) {
            return C0891q.f2780a;
        }
        int i7 = (int) ((jArr[i5] >> 31) & 2147483647L);
        c1779c.f6086f = i5;
        Object obj2 = c2407d.f7786e.f7770b[i5];
        this.f7782k = c1906h;
        this.f7777f = c1779c;
        this.f7778g = c2407d;
        this.f7779h = jArr;
        this.f7780i = i7;
        this.f7781j = 1;
        c1906h.m3391b(this, obj2);
        return EnumC1152a.f3788d;
    }
}
