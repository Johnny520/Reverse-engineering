package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class l60 implements yd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3360a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yd0 f3361b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q60 f3362c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3363d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ yd0 f3364e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ l60(yd0 yd0Var, q60 q60Var, int i, yd0 yd0Var2, int i2) {
        this.f3360a = i2;
        this.f3362c = q60Var;
        this.f3363d = i;
        this.f3364e = yd0Var2;
        this.f3361b = yd0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: a */
    public final Map mo667a() {
        switch (this.f3360a) {
        }
        return this.f3361b.mo667a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    @Override // p000.yd0
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo668b() {
        int i;
        int i2 = this.f3360a;
        yd0 yd0Var = this.f3364e;
        int i3 = this.f3363d;
        q60 q60Var = this.f3362c;
        switch (i2) {
            case 0:
                q60Var.f5060h = i3;
                yd0Var.mo668b();
                sh0 sh0Var = q60Var.f5068p;
                jh0 jh0Var = q60Var.f5067o;
                long[] jArr = jh0Var.f2878a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = jh0Var.f2879b[i8];
                                    v41 v41Var = (v41) jh0Var.f2880c[i8];
                                    int iM4079i = sh0Var.m4079i(obj);
                                    if (iM4079i < 0 || iM4079i >= q60Var.f5060h) {
                                        if (iM4079i >= 0) {
                                            Object obj2 = AbstractC0307i4.f2437r;
                                            i = i5;
                                            Object[] objArr = sh0Var.f5768d;
                                            Object obj3 = objArr[iM4079i];
                                            objArr[iM4079i] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (q60Var.f5065m.m1696b(obj)) {
                                            v41Var.mo2633a();
                                        }
                                        jh0Var.m1706l(i8);
                                    } else {
                                        i = i5;
                                    }
                                }
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 == i5) {
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                    }
                }
                q60Var.m3199g(q60Var.f5059g);
                break;
            default:
                q60Var.f5059g = i3;
                yd0Var.mo668b();
                if (q60Var.f5056d.f413l == null) {
                    q60Var.m3199g(q60Var.f5059g);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: c */
    public final int mo669c() {
        switch (this.f3360a) {
        }
        return this.f3361b.mo669c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: d */
    public final InterfaceC0742sw mo1678d() {
        switch (this.f3360a) {
        }
        return this.f3361b.mo1678d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: e */
    public final int mo670e() {
        switch (this.f3360a) {
        }
        return this.f3361b.mo670e();
    }
}
