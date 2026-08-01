package p000;

import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: renamed from: l3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0417l3 extends C0299hx implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3333d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0417l3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f3333d = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    @Override // p000.InterfaceC0298hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        mj0 mj0Var;
        int i = 2;
        switch (this.f3333d) {
            case 0:
                View view = (View) this.receiver;
                view.setImportantForContentCapture(1);
                ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
                if (contentCaptureSession == null) {
                    return null;
                }
                return new C0111d(i, contentCaptureSession, view);
            case 1:
                C0816uu c0816uu = (C0816uu) this.receiver;
                kh0 kh0Var = c0816uu.f6309c;
                kh0 kh0Var2 = c0816uu.f6310d;
                C1017zu c1017zu = c0816uu.f6307a;
                C0149dv c0149dvM5612f = c1017zu.m5612f();
                if (c0149dvM5612f == null) {
                    Object[] objArr = kh0Var2.f3151b;
                    long[] jArr = kh0Var2.f3150a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j & 255) < 128) {
                                        ((C0795u9) objArr[(i2 << 3) + i4]).m4291x0();
                                        throw null;
                                    }
                                    j >>= 8;
                                }
                                if (i3 == 8) {
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                        }
                    }
                } else if (c0149dvM5612f.f4542q) {
                    if (kh0Var.m1892c(c0149dvM5612f)) {
                        c0149dvM5612f.m728C0();
                    }
                    c0149dvM5612f.m727B0();
                    if (!c0149dvM5612f.f4529d.f4542q) {
                        w10.m4824b("visitAncestors called on an unattached node");
                    }
                    oe0 oe0Var = c0149dvM5612f.f4529d;
                    b60 b60VarM3039Q = pf1.m3039Q(c0149dvM5612f);
                    int i5 = 0;
                    while (b60VarM3039Q != null) {
                        if ((b60VarM3039Q.f395I.f3998f.f4532g & 5120) != 0) {
                            while (oe0Var != null) {
                                int i6 = oe0Var.f4531f;
                                if ((i6 & 5120) != 0) {
                                    if ((i6 & 1024) != 0) {
                                        i5++;
                                    }
                                    if ((oe0Var instanceof C0795u9) && kh0Var2.m1892c(oe0Var)) {
                                        if (i5 <= 1) {
                                            ((C0795u9) oe0Var).m4291x0();
                                            throw null;
                                        }
                                        ((C0795u9) oe0Var).m4291x0();
                                        throw null;
                                    }
                                }
                                oe0Var = oe0Var.f4533h;
                            }
                        }
                        b60VarM3039Q = b60VarM3039Q.m315v();
                        oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
                    }
                    Object[] objArr2 = kh0Var2.f3151b;
                    long[] jArr2 = kh0Var2.f3150a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j2 = jArr2[i7];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                for (int i9 = 0; i9 < i8; i9++) {
                                    if ((j2 & 255) < 128) {
                                        ((C0795u9) objArr2[(i7 << 3) + i9]).m4291x0();
                                        throw null;
                                    }
                                    j2 >>= 8;
                                }
                                if (i8 == 8) {
                                    if (i7 != length2) {
                                        i7++;
                                    }
                                }
                            }
                        }
                    }
                }
                if (c1017zu.m5612f() == null || c1017zu.f7998c.m727B0() == EnumC0106cv.f895f) {
                    c1017zu.m5609c();
                }
                kh0Var.m1891b();
                kh0Var2.m1891b();
                c0816uu.f6311e = false;
                return na1.f4229a;
            default:
                return Boolean.valueOf(((C0260gv) this.receiver).f2062y.m729D0(7));
        }
    }
}
