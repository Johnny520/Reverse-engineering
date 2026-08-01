package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class pt0 implements InterfaceC0643q8 {

    /* JADX INFO: renamed from: a */
    public final tg0 f4964a = new tg0();

    /* JADX INFO: renamed from: b */
    public final dh0 f4965b = new dh0();

    /* JADX INFO: renamed from: c */
    public final Object f4966c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pt0(Object obj) {
        this.f4966c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: a */
    public final void mo1681a(int i, Object obj) {
        tg0 tg0Var = this.f4964a;
        tg0Var.m4198a(5);
        tg0Var.m4198a(i);
        this.f4965b.m697a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: b */
    public final void mo1682b(Object obj) {
        this.f4964a.m4198a(1);
        this.f4965b.m697a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: c */
    public final void mo1683c() {
        this.f4964a.m4198a(8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: d */
    public final void mo1684d(int i, Object obj) {
        tg0 tg0Var = this.f4964a;
        tg0Var.m4198a(6);
        tg0Var.m4198a(i);
        this.f4965b.m697a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: f */
    public final void mo1686f(int i, int i2, int i3) {
        tg0 tg0Var = this.f4964a;
        tg0Var.m4198a(3);
        tg0Var.m4198a(i);
        tg0Var.m4198a(i2);
        tg0Var.m4198a(i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: g */
    public final Object mo1687g() {
        return this.f4966c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: h */
    public final void mo1688h(int i, int i2) {
        tg0 tg0Var = this.f4964a;
        tg0Var.m4198a(2);
        tg0Var.m4198a(i);
        tg0Var.m4198a(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: i */
    public final void mo3141i(InterfaceC0904ww interfaceC0904ww, Object obj) {
        this.f4964a.m4198a(7);
        dh0 dh0Var = this.f4965b;
        dh0Var.m697a(interfaceC0904ww);
        dh0Var.m697a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: j */
    public final void mo1689j() {
        this.f4964a.m4198a(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m3159k(ja1 ja1Var, iu0 iu0Var) {
        Exception exc;
        tg0 tg0Var = this.f4964a;
        int i = tg0Var.f6001b;
        dh0 dh0Var = new dh0();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            dh0 dh0Var2 = this.f4965b;
            if (i2 >= i) {
                if (i3 != dh0Var2.f1109b) {
                    AbstractC0653qi.m3252a("Applier operation size mismatch");
                }
                dh0Var2.m700d();
                tg0Var.f6001b = 0;
                ja1Var.mo1685e();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (tg0Var.m4199b(i2)) {
                        case 0:
                            ja1Var.mo1689j();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            ja1Var.mo1682b(dh0Var2.m702f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            ja1Var.mo1688h(tg0Var.m4199b(i4), tg0Var.m4199b(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    ja1Var.mo1686f(tg0Var.m4199b(i4), tg0Var.m4199b(i7), tg0Var.m4199b(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            ja1Var.m1690k();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            ja1Var.mo1681a(tg0Var.m4199b(i4), dh0Var2.m702f(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                tg0Var.m4199b(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objM702f = dh0Var2.m702f(i3);
                            objM702f.getClass();
                            s91.m4048m(2, objM702f);
                            i3 += 2;
                            ja1Var.mo3141i((InterfaceC0904ww) objM702f, dh0Var2.m702f(i11));
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = ja1Var.f2781c;
                            if (obj instanceof InterfaceC0852vh) {
                                InterfaceC0852vh interfaceC0852vh = (InterfaceC0852vh) obj;
                                if (iu0Var.f2623f.m4080j(interfaceC0852vh)) {
                                    interfaceC0852vh.mo289b();
                                }
                            }
                            dh0Var.m697a(obj);
                            ja1Var.mo1683c();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Throwable th) {
                    ja1Var.mo1685e();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new C0926xh(dh0Var2, dh0Var, tg0Var, i2 - 1, exc);
        }
    }
}
