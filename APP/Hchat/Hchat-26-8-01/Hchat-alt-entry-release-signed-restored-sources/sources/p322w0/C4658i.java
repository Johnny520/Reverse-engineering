package p322w0;

import ng.AbstractC3014l;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: w0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4658i extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public long[] f15495g;

    /* JADX INFO: renamed from: h */
    public int f15496h;

    /* JADX INFO: renamed from: i */
    public int f15497i;

    /* JADX INFO: renamed from: j */
    public int f15498j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f15499k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4659j f15500l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4658i(C4659j c4659j, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f15500l = c4659j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C4658i c4658i = new C4658i(this.f15500l, interfaceC5557c);
        c4658i.f15499k = obj;
        return c4658i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4658i) create((AbstractC3014l) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:26:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC3014l abstractC3014l;
        long[] jArr;
        int length;
        int i9;
        AbstractC3014l abstractC3014l2;
        int i10;
        AbstractC3014l abstractC3014l3;
        int i11;
        C4659j c4659j = this.f15500l;
        long j3 = c4659j.f15502g;
        long j4 = c4659j.f15504i;
        long j5 = c4659j.f15503h;
        int i12 = this.f15498j;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i12 == 0) {
            AbstractC1089i.m2732I0(obj);
            abstractC3014l = (AbstractC3014l) this.f15499k;
            jArr = c4659j.f15505j;
            if (jArr != null) {
                length = jArr.length;
                i9 = 0;
            }
            if (j5 != 0) {
                abstractC3014l2 = abstractC3014l;
                i10 = 0;
                if (i10 >= 64) {
                }
            }
            if (j3 != 0) {
            }
            return C3967n.f12976a;
        }
        if (i12 == 1) {
            length = this.f15497i;
            int i13 = this.f15496h;
            jArr = this.f15495g;
            abstractC3014l = (AbstractC3014l) this.f15499k;
            AbstractC1089i.m2732I0(obj);
            i9 = i13 + 1;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i14 = this.f15496h;
                abstractC3014l3 = (AbstractC3014l) this.f15499k;
                AbstractC1089i.m2732I0(obj);
                i11 = i14 + 1;
                if (i11 < 64) {
                    if (((1 << i11) & j3) != 0) {
                        Long l10 = new Long(j4 + ((long) i11) + ((long) 64));
                        this.f15499k = abstractC3014l3;
                        this.f15495g = null;
                        this.f15496h = i11;
                        this.f15498j = 3;
                        abstractC3014l3.mo6406a(l10, this);
                        return enumC5799a;
                    }
                    i14 = i11;
                    i11 = i14 + 1;
                    if (i11 < 64) {
                    }
                }
                return C3967n.f12976a;
            }
            i10 = this.f15496h;
            abstractC3014l2 = (AbstractC3014l) this.f15499k;
            AbstractC1089i.m2732I0(obj);
            i10++;
            if (i10 >= 64) {
                abstractC3014l = abstractC3014l2;
                if (j3 != 0) {
                    abstractC3014l3 = abstractC3014l;
                    i11 = 0;
                    if (i11 < 64) {
                    }
                }
                return C3967n.f12976a;
            }
            if ((j5 & (1 << i10)) != 0) {
                Long l11 = new Long(j4 + ((long) i10));
                this.f15499k = abstractC3014l2;
                this.f15495g = null;
                this.f15496h = i10;
                this.f15498j = 2;
                abstractC3014l2.mo6406a(l11, this);
                return enumC5799a;
            }
            i10++;
            if (i10 >= 64) {
            }
        }
        if (i9 < length) {
            Long l12 = new Long(jArr[i9]);
            this.f15499k = abstractC3014l;
            this.f15495g = jArr;
            this.f15496h = i9;
            this.f15497i = length;
            this.f15498j = 1;
            abstractC3014l.mo6406a(l12, this);
            return enumC5799a;
        }
        if (j5 != 0) {
        }
        if (j3 != 0) {
        }
        return C3967n.f12976a;
    }
}
