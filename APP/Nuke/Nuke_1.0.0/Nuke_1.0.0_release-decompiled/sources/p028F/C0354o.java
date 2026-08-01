package p028F;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import me.dartcv.nuke.BuildConfig;
import p023E0.AbstractC0277a;
import p040H.InterfaceC0546d;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p051J.C0822n;
import p056K2.C0891q;
import p059L0.AbstractC0955a;
import p059L0.AbstractC0956b;
import p112W2.InterfaceC1599a;
import p117X2.C1663h;
import p169h0.AbstractC2206o;
import p186k.C2409F;
import p198m0.C2567A;
import p198m0.C2578i;
import p198m0.C2584o;
import p198m0.EnumC2594y;
import p198m0.InterfaceC2576g;
import p216p.C2811D;

/* JADX INFO: renamed from: F.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0354o extends C1663h implements InterfaceC1599a {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f1117k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0354o(int i5, Object obj, Class cls, String str, String str2, int i6, int i7, int i8) {
        super(i5, obj, cls, str, str2, i6, i7);
        this.f1117k = i8;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        ContentCaptureSession contentCaptureSessionM1955a;
        C0590e0 c0590e0;
        char c5;
        char c6;
        switch (this.f1117k) {
            case 0:
                return ((InterfaceC0546d) this.f5693e).mo745r0();
            case BuildConfig.VERSION_CODE /* 1 */:
                View view = (View) this.f5693e;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 30) {
                    AbstractC0956b.m1968f(view);
                }
                if (i5 < 29 || (contentCaptureSessionM1955a = AbstractC0955a.m1955a(view)) == null) {
                    return null;
                }
                return new C0822n(contentCaptureSessionM1955a, view);
            case 2:
                C2578i c2578i = (C2578i) this.f5693e;
                C2409F c2409f = c2578i.f8215c;
                C2409F c2409f2 = c2578i.f8216d;
                C2584o c2584o = c2578i.f8213a;
                C2567A c2567aM4531f = c2584o.m4531f();
                EnumC2594y enumC2594y = EnumC2594y.f8254f;
                if (c2567aM4531f == null) {
                    Object[] objArr = c2409f2.f7794b;
                    long[] jArr = c2409f2.f7793a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        char c7 = 7;
                        while (true) {
                            long j5 = jArr[i6];
                            if ((((~j5) << c7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j5 & 255) < 128) {
                                        c6 = c7;
                                        ((InterfaceC2576g) objArr[(i6 << 3) + i8]).mo942W(enumC2594y);
                                    } else {
                                        c6 = c7;
                                    }
                                    j5 >>= 8;
                                    i8++;
                                    c7 = c6;
                                }
                                c5 = c7;
                                if (i7 == 8) {
                                }
                            } else {
                                c5 = c7;
                            }
                            if (i6 != length) {
                                i6++;
                                c7 = c5;
                            }
                        }
                    }
                } else if (c2567aM4531f.f7199q) {
                    if (c2409f.m4281c(c2567aM4531f)) {
                        c2567aM4531f.m4489P0();
                    }
                    EnumC2594y enumC2594yM4488O0 = c2567aM4531f.m4488O0();
                    if (!c2567aM4531f.f7186d.f7199q) {
                        AbstractC0277a.m483b("visitAncestors called on an unattached node");
                    }
                    AbstractC2206o abstractC2206o = c2567aM4531f.f7186d;
                    C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567aM4531f);
                    int i9 = 0;
                    while (c0564iM1044t != null) {
                        if ((c0564iM1044t.f1699J.f1896f.f7189g & 5120) != 0) {
                            while (abstractC2206o != null) {
                                int i10 = abstractC2206o.f7188f;
                                if ((i10 & 5120) != 0) {
                                    if ((i10 & 1024) != 0) {
                                        i9++;
                                    }
                                    if ((abstractC2206o instanceof InterfaceC2576g) && c2409f2.m4281c(abstractC2206o)) {
                                        if (i9 <= 1) {
                                            ((InterfaceC2576g) abstractC2206o).mo942W(enumC2594yM4488O0);
                                        } else {
                                            ((InterfaceC2576g) abstractC2206o).mo942W(EnumC2594y.f8253e);
                                        }
                                        c2409f2.m4290l(abstractC2206o);
                                    }
                                }
                                abstractC2206o = abstractC2206o.f7190h;
                            }
                        }
                        c0564iM1044t = c0564iM1044t.m839u();
                        abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
                    }
                    Object[] objArr2 = c2409f2.f7794b;
                    long[] jArr2 = c2409f2.f7793a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j6 = jArr2[i11];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j6 & 255) < 128) {
                                        ((InterfaceC2576g) objArr2[(i11 << 3) + i13]).mo942W(enumC2594y);
                                    }
                                    j6 >>= 8;
                                }
                                if (i12 == 8) {
                                }
                            }
                            if (i11 != length2) {
                                i11++;
                            }
                        }
                    }
                }
                if (c2584o.m4531f() == null || c2584o.f8224c.m4488O0() == enumC2594y) {
                    c2584o.m4528c();
                }
                c2409f.m4280b();
                c2409f2.m4280b();
                c2578i.f8217e = false;
                return C0891q.f2780a;
            default:
                return Boolean.valueOf(((C2811D) this.f5693e).f8858y.m4490Q0(7));
        }
    }
}
