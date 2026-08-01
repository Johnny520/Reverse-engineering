package p000;

/* JADX INFO: renamed from: f */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0191f extends C0299hx implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1549d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0191f(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f1549d = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        int i2 = this.f1549d;
        na1 na1Var = na1.f4229a;
        switch (i2) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC0493n abstractC0493n = (AbstractC0493n) this.receiver;
                zg0 zg0Var = abstractC0493n.f4096F;
                if (!zBooleanValue) {
                    InterfaceC0322ik interfaceC0322ik = null;
                    if (abstractC0493n.f4104t != null) {
                        Object[] objArr3 = zg0Var.f7889c;
                        long[] jArr = zg0Var.f7887a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j) < 128) {
                                            i = i5;
                                            objArr2 = objArr3;
                                            AbstractC0307i4.m1547w(abstractC0493n.m2879k0(), null, new C0413l(abstractC0493n, (js0) objArr3[(i4 << 3) + i7], interfaceC0322ik, i3), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i5;
                                        }
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i6 == i5) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i4 != length) {
                                    i4++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        js0 js0Var = abstractC0493n.f4098H;
                        if (js0Var != null) {
                            AbstractC0307i4.m1547w(abstractC0493n.m2879k0(), null, new C0413l(abstractC0493n, js0Var, interfaceC0322ik, 1), 3);
                        }
                    }
                    zg0Var.m5586a();
                    abstractC0493n.f4098H = null;
                    abstractC0493n.mo690H0();
                } else {
                    abstractC0493n.m2616G0();
                }
                break;
            default:
                ((f40) this.receiver).mo19s((Throwable) obj);
                break;
        }
        return na1Var;
    }
}
