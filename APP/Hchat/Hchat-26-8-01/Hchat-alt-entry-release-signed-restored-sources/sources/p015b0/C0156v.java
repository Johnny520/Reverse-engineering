package p015b0;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import ca.C0519f0;
import gg.C1414j;
import p017b2.AbstractC0169a;
import p017b2.AbstractC0170b;
import p040d0.InterfaceC0647d;
import p041d1.C0653b0;
import p041d1.C0663i;
import p041d1.C0670p;
import p041d1.EnumC0680z;
import p041d1.InterfaceC0661g;
import p069f.C0945l0;
import p070f0.C0982n;
import p085fg.InterfaceC1220a;
import p144k.C2178i0;
import p276sf.C3967n;
import p292u1.AbstractC4229a;
import p339x1.AbstractC5618k;
import p339x1.C5587b1;
import p339x1.C5602f0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: b0.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0156v extends C1414j implements InterfaceC1220a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f414n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0156v(int i9, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i9, obj, cls, str, str2, i10, i11);
        this.f414n = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        C5587b1 c5587b1;
        char c10;
        char c11;
        ContentCaptureSession contentCaptureSessionM750a;
        switch (this.f414n) {
            case 0:
                return ((InterfaceC0647d) this.f4723h).mo1316j0();
            case 1:
                return Boolean.valueOf(((C0519f0) this.f4723h).f1601e.getBoolean("message_forward_sns_enable", false));
            case 2:
                C0663i c0663i = (C0663i) this.f4723h;
                C0945l0 c0945l0 = c0663i.f2045c;
                C0945l0 c0945l02 = c0663i.f2046d;
                C0670p c0670p = c0663i.f2043a;
                C0653b0 c0653b0M1848f = c0670p.m1848f();
                EnumC0680z enumC0680z = EnumC0680z.f2086i;
                if (c0653b0M1848f == null) {
                    Object[] objArr = c0945l02.f2976b;
                    long[] jArr = c0945l02.f2975a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        char c12 = 7;
                        while (true) {
                            long j3 = jArr[i9];
                            if ((((~j3) << c12) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((j3 & 255) < 128) {
                                        c11 = c12;
                                        ((InterfaceC0661g) objArr[(i9 << 3) + i11]).mo1835E(enumC0680z);
                                    } else {
                                        c11 = c12;
                                    }
                                    j3 >>= 8;
                                    i11++;
                                    c12 = c11;
                                }
                                c10 = c12;
                                if (i10 == 8) {
                                }
                            } else {
                                c10 = c12;
                            }
                            if (i9 != length) {
                                i9++;
                                c12 = c10;
                            }
                        }
                    }
                } else if (c0653b0M1848f.f23801t) {
                    if (c0945l0.m2330c(c0653b0M1848f)) {
                        c0653b0M1848f.m1804q1();
                    }
                    EnumC0680z enumC0680zM1803p1 = c0653b0M1848f.m1803p1();
                    if (!c0653b0M1848f.f23788g.f23801t) {
                        AbstractC4229a.m8494b("visitAncestors called on an unattached node");
                    }
                    AbstractC5852n abstractC5852n = c0653b0M1848f.f23788g;
                    C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0M1848f);
                    int i12 = 0;
                    while (c5602f0M10167w != null) {
                        if ((c5602f0M10167w.f22778L.f22719f.f23791j & 5120) != 0) {
                            while (abstractC5852n != null) {
                                int i13 = abstractC5852n.f23790i;
                                if ((i13 & 5120) != 0) {
                                    if ((i13 & 1024) != 0) {
                                        i12++;
                                    }
                                    if ((abstractC5852n instanceof InterfaceC0661g) && c0945l02.m2330c(abstractC5852n)) {
                                        if (i12 <= 1) {
                                            ((InterfaceC0661g) abstractC5852n).mo1835E(enumC0680zM1803p1);
                                        } else {
                                            ((InterfaceC0661g) abstractC5852n).mo1835E(EnumC0680z.f2085h);
                                        }
                                        c0945l02.m2339l(abstractC5852n);
                                    }
                                }
                                abstractC5852n = abstractC5852n.f23792k;
                            }
                        }
                        c5602f0M10167w = c5602f0M10167w.m10049u();
                        abstractC5852n = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
                    }
                    Object[] objArr2 = c0945l02.f2976b;
                    long[] jArr2 = c0945l02.f2975a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j4 = jArr2[i14];
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((j4 & 255) < 128) {
                                        ((InterfaceC0661g) objArr2[(i14 << 3) + i16]).mo1835E(enumC0680z);
                                    }
                                    j4 >>= 8;
                                }
                                if (i15 == 8) {
                                }
                            }
                            if (i14 != length2) {
                                i14++;
                            }
                        }
                    }
                }
                if (c0670p.m1848f() == null || c0670p.f2056c.m1803p1() == enumC0680z) {
                    c0670p.m1845c();
                }
                c0945l0.m2329b();
                c0945l02.m2329b();
                c0663i.f2047e = false;
                return C3967n.f12976a;
            case 3:
                return Boolean.valueOf(((C2178i0) this.f4723h).f7248B.m1805r1(7));
            default:
                View view = (View) this.f4723h;
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 30) {
                    AbstractC0170b.m762e(view);
                }
                if (i17 < 29 || (contentCaptureSessionM750a = AbstractC0169a.m750a(view)) == null) {
                    return null;
                }
                return new C0982n(contentCaptureSessionM750a, view);
        }
    }
}
