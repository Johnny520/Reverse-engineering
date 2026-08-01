package p158f0;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p143c3.C1906h;

/* JADX INFO: renamed from: f0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2079k extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public long[] f6956f;

    /* JADX INFO: renamed from: g */
    public int f6957g;

    /* JADX INFO: renamed from: h */
    public int f6958h;

    /* JADX INFO: renamed from: i */
    public int f6959i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f6960j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2080l f6961k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2079k(C2080l c2080l, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f6961k = c2080l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2079k) mo7n((InterfaceC1046d) obj2, (C1906h) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2079k c2079k = new C2079k(this.f6961k, interfaceC1046d);
        c2079k.f6960j = obj;
        return c2079k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:26:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bd -> B:37:0x00bf). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        C1906h c1906h;
        long[] jArr;
        int length;
        int i5;
        C1906h c1906h2;
        int i6;
        C1906h c1906h3;
        int i7;
        C2080l c2080l = this.f6961k;
        long j5 = c2080l.f6963d;
        long j6 = c2080l.f6965f;
        long j7 = c2080l.f6964e;
        int i8 = this.f6959i;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i8 == 0) {
            AbstractC1784a.m3205S(obj);
            c1906h = (C1906h) this.f6960j;
            jArr = c2080l.f6966g;
            if (jArr != null) {
                length = jArr.length;
                i5 = 0;
            }
            if (j7 != 0) {
                c1906h2 = c1906h;
                i6 = 0;
                if (i6 >= 64) {
                }
            }
            if (j5 != 0) {
            }
            return C0891q.f2780a;
        }
        if (i8 == 1) {
            length = this.f6958h;
            int i9 = this.f6957g;
            jArr = this.f6956f;
            c1906h = (C1906h) this.f6960j;
            AbstractC1784a.m3205S(obj);
            i5 = i9 + 1;
        } else {
            if (i8 != 2) {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = this.f6957g;
                c1906h3 = (C1906h) this.f6960j;
                AbstractC1784a.m3205S(obj);
                i7 = i10 + 1;
                if (i7 < 64) {
                    if (((1 << i7) & j5) != 0) {
                        Long l3 = new Long(j6 + ((long) i7) + ((long) 64));
                        this.f6960j = c1906h3;
                        this.f6956f = null;
                        this.f6957g = i7;
                        this.f6959i = 3;
                        c1906h3.m3391b(this, l3);
                        return enumC1152a;
                    }
                    i10 = i7;
                    i7 = i10 + 1;
                    if (i7 < 64) {
                    }
                }
                return C0891q.f2780a;
            }
            i6 = this.f6957g;
            c1906h2 = (C1906h) this.f6960j;
            AbstractC1784a.m3205S(obj);
            i6++;
            if (i6 >= 64) {
                c1906h = c1906h2;
                if (j5 != 0) {
                    c1906h3 = c1906h;
                    i7 = 0;
                    if (i7 < 64) {
                    }
                }
                return C0891q.f2780a;
            }
            if ((j7 & (1 << i6)) != 0) {
                Long l5 = new Long(j6 + ((long) i6));
                this.f6960j = c1906h2;
                this.f6956f = null;
                this.f6957g = i6;
                this.f6959i = 2;
                c1906h2.m3391b(this, l5);
                return enumC1152a;
            }
            i6++;
            if (i6 >= 64) {
            }
        }
        if (i5 < length) {
            Long l6 = new Long(jArr[i5]);
            this.f6960j = c1906h;
            this.f6956f = jArr;
            this.f6957g = i5;
            this.f6958h = length;
            this.f6959i = 1;
            c1906h.m3391b(this, l6);
            return enumC1152a;
        }
        if (j7 != 0) {
        }
        if (j5 != 0) {
        }
        return C0891q.f2780a;
    }
}
