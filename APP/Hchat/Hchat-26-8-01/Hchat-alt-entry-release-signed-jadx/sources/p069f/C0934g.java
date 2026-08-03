package p069f;

import ng.AbstractC3014l;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p131j0.C2048d;
import p136j8.C2104o;
import p276sf.C3967n;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: f.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0934g extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2926g;

    /* JADX INFO: renamed from: h */
    public long[] f2927h;

    /* JADX INFO: renamed from: i */
    public int f2928i;

    /* JADX INFO: renamed from: j */
    public int f2929j;

    /* JADX INFO: renamed from: k */
    public int f2930k;

    /* JADX INFO: renamed from: l */
    public int f2931l;

    /* JADX INFO: renamed from: m */
    public long f2932m;

    /* JADX INFO: renamed from: n */
    public int f2933n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f2934o;

    /* JADX INFO: renamed from: p */
    public Object f2935p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f2936q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0934g(Object obj, InterfaceC5557c interfaceC5557c, int i9) {
        super(interfaceC5557c);
        this.f2926g = i9;
        this.f2936q = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f2926g) {
            case 0:
                C0934g c0934g = new C0934g((C0936h) this.f2936q, interfaceC5557c, 0);
                c0934g.f2934o = obj;
                return c0934g;
            case 1:
                C0934g c0934g2 = new C0934g((C0936h) this.f2936q, interfaceC5557c, 1);
                c0934g2.f2934o = obj;
                return c0934g2;
            case 2:
                C0934g c0934g3 = new C0934g((C0963u0) this.f2936q, interfaceC5557c, 2);
                c0934g3.f2934o = obj;
                return c0934g3;
            default:
                C0934g c0934g4 = new C0934g((C2048d) this.f2936q, interfaceC5557c, 3);
                c0934g4.f2934o = obj;
                return c0934g4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        AbstractC3014l abstractC3014l = (AbstractC3014l) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f2926g) {
        }
        return ((C0934g) create(abstractC3014l, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:22:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:15:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:19:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f5 -> B:44:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00f7 -> B:37:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0111 -> B:41:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0191 -> B:66:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0193 -> B:59:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01ad -> B:63:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x022b -> B:88:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x022d -> B:81:0x023f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0248 -> B:85:0x0275). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC3014l abstractC3014l;
        C0936h c0936h;
        long[] jArr;
        int length;
        int i9;
        long j3;
        AbstractC3014l abstractC3014l2;
        Object[] objArr;
        long[] jArr2;
        int length2;
        int i10;
        long j4;
        AbstractC3014l abstractC3014l3;
        Object[] objArr2;
        long[] jArr3;
        int length3;
        int i11;
        long j5;
        AbstractC3014l abstractC3014l4;
        Object[] objArr3;
        long[] jArr4;
        int length4;
        int i12;
        long j10;
        switch (this.f2926g) {
            case 0:
                int i13 = this.f2933n;
                if (i13 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    abstractC3014l = (AbstractC3014l) this.f2934o;
                    c0936h = (C0936h) this.f2936q;
                    jArr = c0936h.f2946h.f2968a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i9 = 0;
                        j3 = jArr[i9];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i9 != length) {
                        }
                    }
                    break;
                } else if (i13 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i14 = this.f2931l;
                    int i15 = this.f2930k;
                    long j11 = this.f2932m;
                    i9 = this.f2929j;
                    int i16 = this.f2928i;
                    long[] jArr5 = this.f2927h;
                    C0936h c0936h2 = (C0936h) this.f2935p;
                    AbstractC3014l abstractC3014l5 = (AbstractC3014l) this.f2934o;
                    AbstractC1089i.m2732I0(obj);
                    j11 >>= 8;
                    i14++;
                    if (i14 < i15) {
                        if (i15 == 8) {
                            length = i16;
                            jArr = jArr5;
                            c0936h = c0936h2;
                            abstractC3014l = abstractC3014l5;
                            if (i9 != length) {
                                i9++;
                                j3 = jArr[i9];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    c0936h2 = c0936h;
                                    i15 = 8 - ((~(i9 - length)) >>> 31);
                                    abstractC3014l5 = abstractC3014l;
                                    i14 = 0;
                                    jArr5 = jArr;
                                    i16 = length;
                                    j11 = j3;
                                    if (i14 < i15) {
                                        if ((255 & j11) < 128) {
                                            int i17 = (i9 << 3) + i14;
                                            C0943k0 c0943k0 = c0936h2.f2946h;
                                            C0958s c0958s = new C0958s(c0943k0.f2969b[i17], 0, c0943k0.f2970c[i17]);
                                            this.f2934o = abstractC3014l5;
                                            this.f2935p = c0936h2;
                                            this.f2927h = jArr5;
                                            this.f2928i = i16;
                                            this.f2929j = i9;
                                            this.f2932m = j11;
                                            this.f2930k = i15;
                                            this.f2931l = i14;
                                            this.f2933n = 1;
                                            abstractC3014l5.mo6406a(c0958s, this);
                                        }
                                        j11 >>= 8;
                                        i14++;
                                        if (i14 < i15) {
                                        }
                                        break;
                                    }
                                }
                                if (i9 != length) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 1:
                int i18 = this.f2933n;
                if (i18 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    abstractC3014l2 = (AbstractC3014l) this.f2934o;
                    C0943k0 c0943k02 = ((C0936h) this.f2936q).f2946h;
                    objArr = c0943k02.f2969b;
                    jArr2 = c0943k02.f2968a;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i10 = 0;
                        j4 = jArr2[i10];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i10 != length2) {
                        }
                    }
                    break;
                } else if (i18 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i19 = this.f2931l;
                    int i20 = this.f2930k;
                    long j12 = this.f2932m;
                    i10 = this.f2929j;
                    int i21 = this.f2928i;
                    long[] jArr6 = this.f2927h;
                    Object[] objArr4 = (Object[]) this.f2935p;
                    AbstractC3014l abstractC3014l6 = (AbstractC3014l) this.f2934o;
                    AbstractC1089i.m2732I0(obj);
                    j12 >>= 8;
                    i19++;
                    if (i19 < i20) {
                        if (i20 == 8) {
                            length2 = i21;
                            jArr2 = jArr6;
                            objArr = objArr4;
                            abstractC3014l2 = abstractC3014l6;
                            if (i10 != length2) {
                                i10++;
                                j4 = jArr2[i10];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    abstractC3014l6 = abstractC3014l2;
                                    i19 = 0;
                                    jArr6 = jArr2;
                                    i21 = length2;
                                    i20 = 8 - ((~(i10 - length2)) >>> 31);
                                    objArr4 = objArr;
                                    j12 = j4;
                                    if (i19 < i20) {
                                        if ((255 & j12) < 128) {
                                            Object obj2 = objArr4[(i10 << 3) + i19];
                                            this.f2934o = abstractC3014l6;
                                            this.f2935p = objArr4;
                                            this.f2927h = jArr6;
                                            this.f2928i = i21;
                                            this.f2929j = i10;
                                            this.f2932m = j12;
                                            this.f2930k = i20;
                                            this.f2931l = i19;
                                            this.f2933n = 1;
                                            abstractC3014l6.mo6406a(obj2, this);
                                        }
                                        j12 >>= 8;
                                        i19++;
                                        if (i19 < i20) {
                                        }
                                        break;
                                    }
                                }
                                if (i10 != length2) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                int i22 = this.f2933n;
                if (i22 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    abstractC3014l3 = (AbstractC3014l) this.f2934o;
                    C0943k0 c0943k03 = (C0943k0) ((C0963u0) this.f2936q).f3034h;
                    objArr2 = c0943k03.f2970c;
                    jArr3 = c0943k03.f2968a;
                    length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        i11 = 0;
                        j5 = jArr3[i11];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i11 != length3) {
                        }
                    }
                    break;
                } else if (i22 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i23 = this.f2931l;
                    int i24 = this.f2930k;
                    long j13 = this.f2932m;
                    i11 = this.f2929j;
                    int i25 = this.f2928i;
                    long[] jArr7 = this.f2927h;
                    Object[] objArr5 = (Object[]) this.f2935p;
                    AbstractC3014l abstractC3014l7 = (AbstractC3014l) this.f2934o;
                    AbstractC1089i.m2732I0(obj);
                    j13 >>= 8;
                    i23++;
                    if (i23 < i24) {
                        if (i24 == 8) {
                            length3 = i25;
                            jArr3 = jArr7;
                            objArr2 = objArr5;
                            abstractC3014l3 = abstractC3014l7;
                            if (i11 != length3) {
                                i11++;
                                j5 = jArr3[i11];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    abstractC3014l7 = abstractC3014l3;
                                    i23 = 0;
                                    jArr7 = jArr3;
                                    i25 = length3;
                                    i24 = 8 - ((~(i11 - length3)) >>> 31);
                                    objArr5 = objArr2;
                                    j13 = j5;
                                    if (i23 < i24) {
                                        if ((255 & j13) < 128) {
                                            Object obj3 = objArr5[(i11 << 3) + i23];
                                            this.f2934o = abstractC3014l7;
                                            this.f2935p = objArr5;
                                            this.f2927h = jArr7;
                                            this.f2928i = i25;
                                            this.f2929j = i11;
                                            this.f2932m = j13;
                                            this.f2930k = i24;
                                            this.f2931l = i23;
                                            this.f2933n = 1;
                                            abstractC3014l7.mo6406a(obj3, this);
                                        }
                                        j13 >>= 8;
                                        i23++;
                                        if (i23 < i24) {
                                        }
                                        break;
                                    }
                                }
                                if (i11 != length3) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                int i26 = this.f2933n;
                if (i26 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    abstractC3014l4 = (AbstractC3014l) this.f2934o;
                    C0945l0 c0945l0 = ((C2048d) this.f2936q).f6894g;
                    objArr3 = c0945l0.f2976b;
                    jArr4 = c0945l0.f2975a;
                    length4 = jArr4.length - 2;
                    if (length4 >= 0) {
                        i12 = 0;
                        j10 = jArr4[i12];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i12 != length4) {
                        }
                    }
                    break;
                } else if (i26 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i27 = this.f2931l;
                    int i28 = this.f2930k;
                    long j14 = this.f2932m;
                    i12 = this.f2929j;
                    int i29 = this.f2928i;
                    long[] jArr8 = this.f2927h;
                    Object[] objArr6 = (Object[]) this.f2935p;
                    AbstractC3014l abstractC3014l8 = (AbstractC3014l) this.f2934o;
                    AbstractC1089i.m2732I0(obj);
                    j14 >>= 8;
                    i27++;
                    if (i27 < i28) {
                        if (i28 == 8) {
                            length4 = i29;
                            jArr4 = jArr8;
                            objArr3 = objArr6;
                            abstractC3014l4 = abstractC3014l8;
                            if (i12 != length4) {
                                i12++;
                                j10 = jArr4[i12];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    abstractC3014l8 = abstractC3014l4;
                                    i27 = 0;
                                    jArr8 = jArr4;
                                    i29 = length4;
                                    i28 = 8 - ((~(i12 - length4)) >>> 31);
                                    objArr6 = objArr3;
                                    j14 = j10;
                                    if (i27 < i28) {
                                        if ((255 & j14) < 128) {
                                            Object obj4 = objArr6[(i12 << 3) + i27];
                                            this.f2934o = abstractC3014l8;
                                            this.f2935p = objArr6;
                                            this.f2927h = jArr8;
                                            this.f2928i = i29;
                                            this.f2929j = i12;
                                            this.f2932m = j14;
                                            this.f2930k = i28;
                                            this.f2931l = i27;
                                            this.f2933n = 1;
                                            abstractC3014l8.mo6406a(obj4, this);
                                        }
                                        j14 >>= 8;
                                        i27++;
                                        if (i27 < i28) {
                                        }
                                        break;
                                    }
                                }
                                if (i12 != length4) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }
}
