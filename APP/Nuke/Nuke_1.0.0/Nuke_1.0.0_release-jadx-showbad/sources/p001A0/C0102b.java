package p001A0;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import me.dartcv.nuke.BuildConfig;
import p000A.C0072l0;
import p029F0.C0365C;
import p029F0.C0373K;
import p029F0.C0413m0;
import p029F0.InterfaceC0430v;
import p041H0.C0564I;
import p041H0.C0568M;
import p041H0.C0576V;
import p047I0.C0666D0;
import p047I0.C0696T;
import p056K2.C0891q;
import p061L2.AbstractC0973m;
import p082Q0.C1168b;
import p095T.C1366i0;
import p095T.C1397y;
import p105V.C1480b;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p115X0.C1649x;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p140c0.C1886c;
import p146d0.AbstractC1950a;
import p160f3.AbstractC2162v;
import p176i1.C2310z;
import p186k.C2408E;
import p197m.EnumC2517B;
import p198m0.C2567A;
import p203n.C2642Z;
import p204n0.C2684c;
import p245u0.C3302I;
import p254v4.C3354a;
import p254v4.C3362i;
import p254v4.C3365l;
import p254v4.C3368o;
import p271y4.AbstractC3501c;
import p277z4.C3523a;
import p277z4.C3524b;
import p277z4.C3525c;
import p277z4.C3526d;

/* JADX INFO: renamed from: A0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0102b extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f462e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f463f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0102b(int i5, Object obj) {
        super(0);
        this.f462e = i5;
        this.f463f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b2  */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6a() {
        C1397y c1397y;
        switch (this.f462e) {
            case 0:
                return ((C0105e) this.f463f).f473d;
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0110j) this.f463f).m145J0();
            case 2:
                C0365C c0365c = (C0365C) this.f463f;
                if (!((Boolean) c0365c.f1145g.getValue()).booleanValue() && (c1397y = c0365c.f1141c) != null) {
                    c1397y.m2658l();
                }
                return C0891q.f2780a;
            case 3:
                C0373K c0373kM675a = ((C0413m0) this.f463f).m675a();
                C0564I c0564i = c0373kM675a.f1171d;
                if (c0373kM675a.f1184q != ((C1483e) ((C1480b) c0564i.m833o()).f5173e).f5183f) {
                    C2408E c2408e = c0373kM675a.f1176i;
                    Object[] objArr = c2408e.f7789c;
                    long[] jArr = c2408e.f7787a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j5 = jArr[i5];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((255 & j5) < 128) {
                                        ((C0365C) objArr[(i5 << 3) + i7]).f1142d = true;
                                    }
                                    j5 >>= 8;
                                }
                                if (i6 == 8) {
                                    if (i5 != length) {
                                        i5++;
                                    }
                                }
                            }
                        }
                    }
                    if (c0564i.f1719l != null) {
                        if (!c0564i.f1700K.f1749e) {
                            C0564I.m789T(c0564i, false, 7);
                        }
                    } else if (!c0564i.m835q()) {
                        C0564I.m790V(c0564i, false, 7);
                    }
                }
                return C0891q.f2780a;
            case 4:
                C0568M c0568m = ((C0564I) this.f463f).f1700K;
                c0568m.f1760p.f1834B = true;
                C0576V c0576v = c0568m.f1761q;
                if (c0576v != null) {
                    c0576v.f1814v = true;
                }
                return C0891q.f2780a;
            case 5:
                AbstractC2162v.m3981c(((C0696T) this.f463f).f2226f, null);
                return C0891q.f2780a;
            case 6:
                return C0891q.f2780a;
            case 7:
                C1886c c1886c = (C1886c) ((C0666D0) this.f463f).f2106a.f297e;
                if (!c1886c.f6409e) {
                    if (c1886c.f6410f) {
                        AbstractC1950a.m3618a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c1886c.m3373a();
                    c1886c.f6410f = true;
                }
                return C0891q.f2780a;
            case 8:
                C1168b c1168b = (C1168b) this.f463f;
                c1168b.f3826g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c1168b.m2207a();
                    Trace.endSection();
                    return C0891q.f2780a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 9:
                Object systemService = ((View) ((C0072l0) this.f463f).f307e).getContext().getSystemService("input_method");
                AbstractC1665j.m2983c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 10:
                return new BaseInputConnection(((C1649x) this.f463f).f5660a, false);
            case 11:
                return (C2684c) this.f463f;
            case 12:
                C2310z c2310z = (C2310z) this.f463f;
                InterfaceC0430v parentLayoutCoordinates = c2310z.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.mo632D()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || c2310z.m6328getPopupContentSizebOM6tXw() == null) ? false : true);
            case 13:
                C2642Z c2642z = (C2642Z) this.f463f;
                Object objM4593c = c2642z.m4593c();
                EnumC2517B enumC2517B = EnumC2517B.f8041f;
                return Boolean.valueOf(objM4593c == enumC2517B && c2642z.f8404d.getValue() == enumC2517B);
            case 14:
                ((C2567A) this.f463f).m4485L0();
                return C0891q.f2780a;
            case 15:
                C1366i0 c1366i0 = ((C3302I) this.f463f).f10212h;
                C0891q c0891q = C0891q.f2780a;
                c1366i0.setValue(c0891q);
                return c0891q;
            case 16:
                return new C3523a(((C3354a) this.f463f).f10421e);
            case 17:
                return new C3523a(((C3362i) this.f463f).f10438f);
            case 18:
                return new C3524b(((C3365l) this.f463f).f10452g);
            case 19:
                return new C3526d(((C3368o) this.f463f).f10462g);
            case 20:
                return AbstractC3501c.m5757e(((C3524b) this.f463f).f10983c);
            default:
                C3526d c3526d = (C3526d) this.f463f;
                String str = "(" + AbstractC0973m.m2016W(c3526d.f10988c, "", null, null, C3525c.f10985e, 30) + ")" + AbstractC3501c.m5757e(c3526d.f10989d);
                AbstractC1665j.m2984d(str, "StringBuilder().apply(builderAction).toString()");
                return str;
        }
    }
}
