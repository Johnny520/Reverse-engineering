package p227r;

import java.util.concurrent.CancellationException;
import me.dartcv.nuke.BuildConfig;
import p034G.C0466k;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p172h3.C2243c;
import p216p.EnumC2824Q;

/* JADX INFO: renamed from: r.I */
/* JADX INFO: loaded from: classes.dex */
public final class C2955I extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9348h = 0;

    /* JADX INFO: renamed from: i */
    public C1675t f9349i;

    /* JADX INFO: renamed from: j */
    public C1675t f9350j;

    /* JADX INFO: renamed from: k */
    public int f9351k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f9352l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C3015t0 f9353m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2955I(C1675t c1675t, C3015t0 c3015t0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9350j = c1675t;
        this.f9353m = c3015t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f9348h) {
            case 0:
                return ((C2955I) mo7n((InterfaceC1046d) obj2, (InterfaceC1601c) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C2955I) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f9348h) {
            case 0:
                C2955I c2955i = new C2955I(this.f9350j, this.f9353m, interfaceC1046d);
                c2955i.f9352l = obj;
                return c2955i;
            default:
                C2955I c2955i2 = new C2955I(this.f9353m, interfaceC1046d);
                c2955i2.f9352l = obj;
                return c2955i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (p227r.C3015t0.m5209M0(r2, r10) != r4) goto L13;
     */
    /* JADX WARN: Path cross not found for [B:49:0x00d9, B:45:0x00c7], limit reached: 88 */
    /* JADX WARN: Path cross not found for [B:51:0x00dd, B:21:0x005d], limit reached: 88 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[PHI: r0 r5
  0x0039: PHI (r0v14 X2.t) = (r0v6 X2.t), (r0v18 X2.t) binds: [B:15:0x0036, B:41:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r5v6 f3.t) = (r5v4 f3.t), (r5v7 f3.t) binds: [B:15:0x0036, B:41:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[PHI: r6
  0x005d: PHI (r6v8 f3.t) = (r6v0 f3.t), (r6v3 f3.t), (r6v3 f3.t), (r6v3 f3.t), (r6v6 f3.t), (r6v9 f3.t) binds: [B:20:0x0055, B:50:0x00db, B:52:0x00e8, B:46:0x00d4, B:32:0x0089, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:43:0x00c1, B:45:0x00c7, B:49:0x00d9, B:51:0x00dd), top: B:91:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:43:0x00c1, B:45:0x00c7, B:49:0x00d9, B:51:0x00dd), top: B:91:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0089 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d4 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00db -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e8 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00f6 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x014a -> B:81:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x014f -> B:83:0x0150). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) throws Throwable {
        InterfaceC1601c interfaceC1601c;
        Object obj2;
        InterfaceC2160t interfaceC2160t;
        C1675t c1675t;
        C1675t c1675t2;
        C1675t c1675t3;
        InterfaceC2160t interfaceC2160t2;
        InterfaceC2160t interfaceC2160t3;
        Object obj3;
        Object objM5146f;
        AbstractC3020w abstractC3020w;
        Object obj4;
        switch (this.f9348h) {
            case 0:
                C1675t c1675t4 = this.f9350j;
                int i5 = this.f9351k;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    interfaceC1601c = (InterfaceC1601c) this.f9352l;
                    obj2 = c1675t4.f5710e;
                    if (obj2 instanceof C3018v) {
                    }
                    return C0891q.f2780a;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1675t c1675t5 = this.f9349i;
                interfaceC1601c = (InterfaceC1601c) this.f9352l;
                AbstractC1784a.m3205S(obj);
                AbstractC3020w abstractC3020w2 = (AbstractC3020w) obj;
                c1675t5.f5710e = abstractC3020w2;
                obj2 = c1675t4.f5710e;
                if (!(obj2 instanceof C3018v) || (obj2 instanceof C3012s)) {
                    return C0891q.f2780a;
                }
                abstractC3020w2 = null;
                C3014t c3014t = obj2 instanceof C3014t ? (C3014t) obj2 : null;
                if (c3014t != null) {
                    interfaceC1601c.mo1h(c3014t);
                }
                C2243c c2243c = this.f9353m.f9563x;
                if (c2243c == null) {
                    c1675t5 = c1675t4;
                    c1675t5.f5710e = abstractC3020w2;
                    obj2 = c1675t4.f5710e;
                    if (obj2 instanceof C3018v) {
                    }
                    return C0891q.f2780a;
                }
                this.f9352l = interfaceC1601c;
                this.f9349i = c1675t4;
                this.f9351k = 1;
                obj = c2243c.mo4091p(this);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (obj == enumC1152a) {
                    return enumC1152a;
                }
                c1675t5 = c1675t4;
                AbstractC3020w abstractC3020w22 = (AbstractC3020w) obj;
                c1675t5.f5710e = abstractC3020w22;
                obj2 = c1675t4.f5710e;
                if (obj2 instanceof C3018v) {
                }
                return C0891q.f2780a;
            default:
                int i6 = this.f9351k;
                C0891q c0891q = C0891q.f2780a;
                C3015t0 c3015t0 = this.f9353m;
                InterfaceC1046d interfaceC1046d = null;
                EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                switch (i6) {
                    case 0:
                        AbstractC1784a.m3205S(obj);
                        interfaceC2160t = (InterfaceC2160t) this.f9352l;
                        if (!AbstractC2162v.m3993o(interfaceC2160t)) {
                            c1675t = new C1675t();
                            C2243c c2243c2 = c3015t0.f9563x;
                            if (c2243c2 == null) {
                                c1675t2 = c1675t;
                                abstractC3020w = null;
                                c1675t.f5710e = abstractC3020w;
                                obj4 = c1675t2.f5710e;
                                if (obj4 instanceof C3016u) {
                                }
                                return enumC1152a2;
                            }
                            this.f9352l = interfaceC2160t;
                            this.f9349i = c1675t;
                            this.f9350j = c1675t;
                            this.f9351k = 1;
                            obj = c2243c2.mo4091p(this);
                            if (obj != enumC1152a2) {
                                c1675t2 = c1675t;
                                abstractC3020w = (AbstractC3020w) obj;
                                c1675t.f5710e = abstractC3020w;
                                obj4 = c1675t2.f5710e;
                                if (obj4 instanceof C3016u) {
                                    this.f9352l = interfaceC2160t;
                                    this.f9349i = c1675t2;
                                    this.f9350j = null;
                                    this.f9351k = 2;
                                    if (C3015t0.m5210N0(c3015t0, (C3016u) obj4, this) != enumC1152a2) {
                                        c1675t3 = c1675t2;
                                        interfaceC2160t2 = interfaceC2160t;
                                        C2955I c2955i = new C2955I(c1675t3, c3015t0, null);
                                        this.f9352l = interfaceC2160t2;
                                        this.f9349i = c1675t3;
                                        this.f9351k = 3;
                                        C2940A0 c2940a0 = c3015t0.f9552Q;
                                        objM5146f = c2940a0.m5146f(EnumC2824Q.f8891e, new C0466k(c2955i, c2940a0, interfaceC1046d, 12), this);
                                        if (objM5146f != enumC1152a2) {
                                            objM5146f = c0891q;
                                        }
                                        if (objM5146f != enumC1152a2) {
                                            interfaceC2160t = interfaceC2160t2;
                                            try {
                                            } catch (CancellationException unused) {
                                                interfaceC2160t3 = interfaceC2160t;
                                                this.f9352l = interfaceC2160t3;
                                                this.f9349i = null;
                                                this.f9351k = 6;
                                                break;
                                            }
                                            obj3 = c1675t3.f5710e;
                                            if (obj3 instanceof C3018v) {
                                                this.f9352l = interfaceC2160t;
                                                this.f9349i = null;
                                                this.f9351k = 4;
                                                if (C3015t0.m5211O0(c3015t0, (C3018v) obj3, this) != enumC1152a2) {
                                                    if (!AbstractC2162v.m3993o(interfaceC2160t)) {
                                                    }
                                                }
                                            } else {
                                                if (obj3 instanceof C3012s) {
                                                    this.f9352l = interfaceC2160t;
                                                    this.f9349i = null;
                                                    this.f9351k = 5;
                                                    if (C3015t0.m5209M0(c3015t0, this) != enumC1152a2) {
                                                    }
                                                }
                                                if (!AbstractC2162v.m3993o(interfaceC2160t)) {
                                                    return c0891q;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return enumC1152a2;
                        }
                        break;
                    case BuildConfig.VERSION_CODE /* 1 */:
                        c1675t = this.f9350j;
                        c1675t2 = this.f9349i;
                        interfaceC2160t = (InterfaceC2160t) this.f9352l;
                        AbstractC1784a.m3205S(obj);
                        abstractC3020w = (AbstractC3020w) obj;
                        c1675t.f5710e = abstractC3020w;
                        obj4 = c1675t2.f5710e;
                        if (obj4 instanceof C3016u) {
                        }
                        return enumC1152a2;
                    case 2:
                        c1675t3 = this.f9349i;
                        interfaceC2160t2 = (InterfaceC2160t) this.f9352l;
                        AbstractC1784a.m3205S(obj);
                        C2955I c2955i2 = new C2955I(c1675t3, c3015t0, null);
                        this.f9352l = interfaceC2160t2;
                        this.f9349i = c1675t3;
                        this.f9351k = 3;
                        C2940A0 c2940a02 = c3015t0.f9552Q;
                        objM5146f = c2940a02.m5146f(EnumC2824Q.f8891e, new C0466k(c2955i2, c2940a02, interfaceC1046d, 12), this);
                        if (objM5146f != enumC1152a2) {
                        }
                        if (objM5146f != enumC1152a2) {
                        }
                        return enumC1152a2;
                    case 3:
                        c1675t3 = this.f9349i;
                        interfaceC2160t2 = (InterfaceC2160t) this.f9352l;
                        try {
                            AbstractC1784a.m3205S(obj);
                        } catch (CancellationException unused2) {
                            interfaceC2160t3 = interfaceC2160t2;
                            this.f9352l = interfaceC2160t3;
                            this.f9349i = null;
                            this.f9351k = 6;
                        }
                        interfaceC2160t = interfaceC2160t2;
                        obj3 = c1675t3.f5710e;
                        if (obj3 instanceof C3018v) {
                        }
                        break;
                    case 4:
                        interfaceC2160t3 = (InterfaceC2160t) this.f9352l;
                        try {
                            AbstractC1784a.m3205S(obj);
                        } catch (CancellationException unused3) {
                            this.f9352l = interfaceC2160t3;
                            this.f9349i = null;
                            this.f9351k = 6;
                        }
                        interfaceC2160t = interfaceC2160t3;
                        if (!AbstractC2162v.m3993o(interfaceC2160t)) {
                        }
                        break;
                    case 5:
                        interfaceC2160t3 = (InterfaceC2160t) this.f9352l;
                        AbstractC1784a.m3205S(obj);
                        interfaceC2160t = interfaceC2160t3;
                        if (!AbstractC2162v.m3993o(interfaceC2160t)) {
                        }
                        break;
                    case 6:
                        interfaceC2160t3 = (InterfaceC2160t) this.f9352l;
                        AbstractC1784a.m3205S(obj);
                        interfaceC2160t = interfaceC2160t3;
                        if (!AbstractC2162v.m3993o(interfaceC2160t)) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2955I(C3015t0 c3015t0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9353m = c3015t0;
    }
}
