package p029F0;

import java.util.Map;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p186k.C2408E;

/* JADX INFO: renamed from: F0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0368F implements InterfaceC0378P {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1158a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0378P f1159b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0373K f1160c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1161d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0378P f1162e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0368F(InterfaceC0378P interfaceC0378P, C0373K c0373k, int i5, InterfaceC0378P interfaceC0378P2, int i6) {
        this.f1158a = i6;
        this.f1160c = c0373k;
        this.f1161d = i5;
        this.f1162e = interfaceC0378P2;
        this.f1159b = interfaceC0378P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: a */
    public final Map mo607a() {
        switch (this.f1158a) {
        }
        return this.f1159b.mo607a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo608b() {
        int i5;
        switch (this.f1158a) {
            case 0:
                int i6 = this.f1161d;
                C0373K c0373k = this.f1160c;
                c0373k.f1175h = i6;
                this.f1162e.mo608b();
                C1483e c1483e = c0373k.f1183p;
                C2408E c2408e = c0373k.f1182o;
                long[] jArr = c2408e.f7787a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j5 = jArr[i7];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((255 & j5) < 128) {
                                    int i11 = (i7 << 3) + i10;
                                    Object obj = c2408e.f7788b[i11];
                                    InterfaceC0409k0 interfaceC0409k0 = (InterfaceC0409k0) c2408e.f7789c[i11];
                                    int iM2760i = c1483e.m2760i(obj);
                                    i5 = i8;
                                    if (iM2760i < 0 || iM2760i >= c0373k.f1175h) {
                                        if (iM2760i >= 0) {
                                            Object[] objArr = c1483e.f5181d;
                                            Object obj2 = objArr[iM2760i];
                                            objArr[iM2760i] = AbstractC0435z.f1308b;
                                        }
                                        if (c0373k.f1180m.m4267b(obj)) {
                                            interfaceC0409k0.mo612a();
                                        }
                                        c2408e.m4277l(i11);
                                    }
                                } else {
                                    i5 = i8;
                                }
                                j5 >>= i5;
                                i10++;
                                i8 = i5;
                            }
                            if (i9 == i8) {
                                if (i7 != length) {
                                    i7++;
                                }
                            }
                        }
                    }
                }
                c0373k.m621f(c0373k.f1174g);
                break;
            default:
                int i12 = this.f1161d;
                C0373K c0373k2 = this.f1160c;
                c0373k2.f1174g = i12;
                this.f1162e.mo608b();
                if (c0373k2.f1171d.f1719l == null) {
                    c0373k2.m621f(c0373k2.f1174g);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: c */
    public final int mo609c() {
        switch (this.f1158a) {
        }
        return this.f1159b.mo609c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: d */
    public final InterfaceC1601c mo610d() {
        switch (this.f1158a) {
        }
        return this.f1159b.mo610d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: e */
    public final int mo611e() {
        switch (this.f1158a) {
        }
        return this.f1159b.mo611e();
    }
}
