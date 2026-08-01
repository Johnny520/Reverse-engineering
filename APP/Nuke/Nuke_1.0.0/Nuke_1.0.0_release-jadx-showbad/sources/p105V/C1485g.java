package p105V;

import me.dartcv.nuke.BuildConfig;
import p029F0.C0417o0;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p119Y.C1717a;
import p127Z2.AbstractC1784a;
import p143c3.C1906h;
import p186k.C2408E;
import p186k.C2409F;
import p186k.C2425g;

/* JADX INFO: renamed from: V.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1485g extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f5184f;

    /* JADX INFO: renamed from: g */
    public long[] f5185g;

    /* JADX INFO: renamed from: h */
    public int f5186h;

    /* JADX INFO: renamed from: i */
    public int f5187i;

    /* JADX INFO: renamed from: j */
    public int f5188j;

    /* JADX INFO: renamed from: k */
    public int f5189k;

    /* JADX INFO: renamed from: l */
    public long f5190l;

    /* JADX INFO: renamed from: m */
    public int f5191m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object f5192n;

    /* JADX INFO: renamed from: o */
    public Object f5193o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f5194p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1485g(Object obj, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f5184f = i5;
        this.f5194p = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        C1906h c1906h = (C1906h) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f5184f) {
        }
        return ((C1485g) mo7n(interfaceC1046d, c1906h)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f5184f) {
            case 0:
                C1485g c1485g = new C1485g((C1486h) this.f5194p, interfaceC1046d, 0);
                c1485g.f5192n = obj;
                return c1485g;
            case BuildConfig.VERSION_CODE /* 1 */:
                C1485g c1485g2 = new C1485g((C2425g) this.f5194p, interfaceC1046d, 1);
                c1485g2.f5192n = obj;
                return c1485g2;
            case 2:
                C1485g c1485g3 = new C1485g((C2425g) this.f5194p, interfaceC1046d, 2);
                c1485g3.f5192n = obj;
                return c1485g3;
            default:
                C1485g c1485g4 = new C1485g((C0417o0) this.f5194p, interfaceC1046d, 3);
                c1485g4.f5192n = obj;
                return c1485g4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0280  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:23:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:16:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:20:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f5 -> B:46:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f7 -> B:39:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0111 -> B:43:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x018f -> B:69:0x01e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0191 -> B:62:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01ac -> B:66:0x01d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x023a -> B:92:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x023c -> B:85:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0256 -> B:89:0x0275). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        C1906h c1906h;
        Object[] objArr;
        long[] jArr;
        int length;
        int i5;
        long j5;
        C1906h c1906h2;
        C2425g c2425g;
        long[] jArr2;
        int length2;
        int i6;
        long j6;
        C1906h c1906h3;
        Object[] objArr2;
        long[] jArr3;
        int length3;
        int i7;
        long j7;
        C1906h c1906h4;
        Object[] objArr3;
        long[] jArr4;
        int length4;
        int i8;
        long j8;
        switch (this.f5184f) {
            case 0:
                int i9 = this.f5191m;
                if (i9 == 0) {
                    AbstractC1784a.m3205S(obj);
                    c1906h = (C1906h) this.f5192n;
                    C2409F c2409f = ((C1486h) this.f5194p).f5195d;
                    objArr = c2409f.f7794b;
                    jArr = c2409f.f7793a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i5 = 0;
                        j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i5 != length) {
                        }
                    }
                    return C0891q.f2780a;
                }
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = this.f5189k;
                int i11 = this.f5188j;
                long j9 = this.f5190l;
                i5 = this.f5187i;
                int i12 = this.f5186h;
                long[] jArr5 = this.f5185g;
                Object[] objArr4 = (Object[]) this.f5193o;
                C1906h c1906h5 = (C1906h) this.f5192n;
                AbstractC1784a.m3205S(obj);
                j9 >>= 8;
                i10++;
                if (i10 < i11) {
                    if (i11 == 8) {
                        length = i12;
                        jArr = jArr5;
                        objArr = objArr4;
                        c1906h = c1906h5;
                        if (i5 != length) {
                            i5++;
                            j5 = jArr[i5];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                c1906h5 = c1906h;
                                i10 = 0;
                                jArr5 = jArr;
                                i12 = length;
                                i11 = 8 - ((~(i5 - length)) >>> 31);
                                objArr4 = objArr;
                                j9 = j5;
                                if (i10 < i11) {
                                    if ((255 & j9) < 128) {
                                        Object obj2 = objArr4[(i5 << 3) + i10];
                                        this.f5192n = c1906h5;
                                        this.f5193o = objArr4;
                                        this.f5185g = jArr5;
                                        this.f5186h = i12;
                                        this.f5187i = i5;
                                        this.f5190l = j9;
                                        this.f5188j = i11;
                                        this.f5189k = i10;
                                        this.f5191m = 1;
                                        c1906h5.m3391b(this, obj2);
                                        return EnumC1152a.f3788d;
                                    }
                                    j9 >>= 8;
                                    i10++;
                                    if (i10 < i11) {
                                    }
                                }
                            }
                            if (i5 != length) {
                            }
                        }
                    }
                    return C0891q.f2780a;
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                int i13 = this.f5191m;
                if (i13 == 0) {
                    AbstractC1784a.m3205S(obj);
                    c1906h2 = (C1906h) this.f5192n;
                    c2425g = (C2425g) this.f5194p;
                    jArr2 = c2425g.f7842e.f7787a;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i6 = 0;
                        j6 = jArr2[i6];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i6 != length2) {
                        }
                    }
                    return C0891q.f2780a;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = this.f5189k;
                int i15 = this.f5188j;
                long j10 = this.f5190l;
                i6 = this.f5187i;
                int i16 = this.f5186h;
                long[] jArr6 = this.f5185g;
                C2425g c2425g2 = (C2425g) this.f5193o;
                C1906h c1906h6 = (C1906h) this.f5192n;
                AbstractC1784a.m3205S(obj);
                j10 >>= 8;
                i14++;
                if (i14 < i15) {
                    if (i15 == 8) {
                        length2 = i16;
                        jArr2 = jArr6;
                        c2425g = c2425g2;
                        c1906h2 = c1906h6;
                        if (i6 != length2) {
                            i6++;
                            j6 = jArr2[i6];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                c2425g2 = c2425g;
                                i15 = 8 - ((~(i6 - length2)) >>> 31);
                                c1906h6 = c1906h2;
                                i14 = 0;
                                jArr6 = jArr2;
                                i16 = length2;
                                j10 = j6;
                                if (i14 < i15) {
                                    if ((255 & j10) < 128) {
                                        int i17 = (i6 << 3) + i14;
                                        C2408E c2408e = c2425g2.f7842e;
                                        C1717a c1717a = new C1717a(1, c2408e.f7788b[i17], c2408e.f7789c[i17]);
                                        this.f5192n = c1906h6;
                                        this.f5193o = c2425g2;
                                        this.f5185g = jArr6;
                                        this.f5186h = i16;
                                        this.f5187i = i6;
                                        this.f5190l = j10;
                                        this.f5188j = i15;
                                        this.f5189k = i14;
                                        this.f5191m = 1;
                                        c1906h6.m3391b(this, c1717a);
                                        return EnumC1152a.f3788d;
                                    }
                                    j10 >>= 8;
                                    i14++;
                                    if (i14 < i15) {
                                    }
                                }
                            }
                            if (i6 != length2) {
                            }
                        }
                    }
                    return C0891q.f2780a;
                }
                break;
            case 2:
                int i18 = this.f5191m;
                if (i18 == 0) {
                    AbstractC1784a.m3205S(obj);
                    c1906h3 = (C1906h) this.f5192n;
                    C2408E c2408e2 = ((C2425g) this.f5194p).f7842e;
                    objArr2 = c2408e2.f7788b;
                    jArr3 = c2408e2.f7787a;
                    length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        i7 = 0;
                        j7 = jArr3[i7];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i7 != length3) {
                        }
                    }
                    return C0891q.f2780a;
                }
                if (i18 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i19 = this.f5189k;
                int i20 = this.f5188j;
                long j11 = this.f5190l;
                i7 = this.f5187i;
                int i21 = this.f5186h;
                long[] jArr7 = this.f5185g;
                Object[] objArr5 = (Object[]) this.f5193o;
                C1906h c1906h7 = (C1906h) this.f5192n;
                AbstractC1784a.m3205S(obj);
                j11 >>= 8;
                i19++;
                if (i19 < i20) {
                    if (i20 == 8) {
                        length3 = i21;
                        jArr3 = jArr7;
                        objArr2 = objArr5;
                        c1906h3 = c1906h7;
                        if (i7 != length3) {
                            i7++;
                            j7 = jArr3[i7];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                c1906h7 = c1906h3;
                                i19 = 0;
                                jArr7 = jArr3;
                                i21 = length3;
                                i20 = 8 - ((~(i7 - length3)) >>> 31);
                                objArr5 = objArr2;
                                j11 = j7;
                                if (i19 < i20) {
                                    if ((255 & j11) < 128) {
                                        Object obj3 = objArr5[(i7 << 3) + i19];
                                        this.f5192n = c1906h7;
                                        this.f5193o = objArr5;
                                        this.f5185g = jArr7;
                                        this.f5186h = i21;
                                        this.f5187i = i7;
                                        this.f5190l = j11;
                                        this.f5188j = i20;
                                        this.f5189k = i19;
                                        this.f5191m = 1;
                                        c1906h7.m3391b(this, obj3);
                                        return EnumC1152a.f3788d;
                                    }
                                    j11 >>= 8;
                                    i19++;
                                    if (i19 < i20) {
                                    }
                                }
                            }
                            if (i7 != length3) {
                            }
                        }
                    }
                    return C0891q.f2780a;
                }
                break;
            default:
                int i22 = this.f5191m;
                if (i22 == 0) {
                    AbstractC1784a.m3205S(obj);
                    c1906h4 = (C1906h) this.f5192n;
                    C2408E c2408e3 = (C2408E) ((C0417o0) this.f5194p).f1256e;
                    objArr3 = c2408e3.f7789c;
                    jArr4 = c2408e3.f7787a;
                    length4 = jArr4.length - 2;
                    if (length4 >= 0) {
                        i8 = 0;
                        j8 = jArr4[i8];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i8 != length4) {
                        }
                    }
                    return C0891q.f2780a;
                }
                if (i22 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i23 = this.f5189k;
                int i24 = this.f5188j;
                long j12 = this.f5190l;
                i8 = this.f5187i;
                int i25 = this.f5186h;
                long[] jArr8 = this.f5185g;
                Object[] objArr6 = (Object[]) this.f5193o;
                C1906h c1906h8 = (C1906h) this.f5192n;
                AbstractC1784a.m3205S(obj);
                j12 >>= 8;
                i23++;
                if (i23 < i24) {
                    if (i24 == 8) {
                        length4 = i25;
                        jArr4 = jArr8;
                        objArr3 = objArr6;
                        c1906h4 = c1906h8;
                        if (i8 != length4) {
                            i8++;
                            j8 = jArr4[i8];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                c1906h8 = c1906h4;
                                i23 = 0;
                                jArr8 = jArr4;
                                i25 = length4;
                                i24 = 8 - ((~(i8 - length4)) >>> 31);
                                objArr6 = objArr3;
                                j12 = j8;
                                if (i23 < i24) {
                                    if ((255 & j12) < 128) {
                                        Object obj4 = objArr6[(i8 << 3) + i23];
                                        this.f5192n = c1906h8;
                                        this.f5193o = objArr6;
                                        this.f5185g = jArr8;
                                        this.f5186h = i25;
                                        this.f5187i = i8;
                                        this.f5190l = j12;
                                        this.f5188j = i24;
                                        this.f5189k = i23;
                                        this.f5191m = 1;
                                        c1906h8.m3391b(this, obj4);
                                        return EnumC1152a.f3788d;
                                    }
                                    j12 >>= 8;
                                    i23++;
                                    if (i23 < i24) {
                                    }
                                }
                            }
                            if (i8 != length4) {
                            }
                        }
                    }
                    return C0891q.f2780a;
                }
                break;
        }
    }
}
