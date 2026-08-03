package p041d1;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import be.AbstractC0283h;
import gg.AbstractC1417m;
import kh.AbstractC2407b;
import okhttp3.HttpUrl;
import p020b5.C0184c;
import p057e1.C0808c;
import p069f.C0929d0;
import p069f.C0943k0;
import p085fg.InterfaceC1220a;
import p090g2.C1293b;
import p099h.EnumC1456f0;
import p115hh.C1716a;
import p115hh.C1724i;
import p115hh.C1727l;
import p115hh.C1730o;
import p116i.C1765k1;
import p117i0.C1845j1;
import p117i0.C1871q;
import p131j0.C2046b;
import p173lh.C2567a;
import p173lh.C2568b;
import p173lh.C2569c;
import p173lh.C2570d;
import p176m1.C2739j0;
import p190n2.C2887v;
import p249qg.AbstractC3603v;
import p253r1.C3647d;
import p253r1.C3652i;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p278t0.C4079c;
import p291u0.AbstractC4228a;
import p293u2.C4242l;
import p308v1.C4376b0;
import p308v1.C4400j0;
import p308v1.C4401j1;
import p308v1.InterfaceC4428t;
import p339x1.C5602f0;
import p339x1.C5616j0;
import p339x1.C5640r0;
import p357y1.AbstractC5883g0;
import p357y1.C5880f1;
import p357y1.C5896j1;
import p357y1.C5899k0;
import p357y1.C5952x1;
import p358y2.C5989x;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: d1.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0655c0 extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2029g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2030h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0655c0(Object obj, int i9) {
        super(0);
        this.f2029g = i9;
        this.f2030h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        C1871q c1871q;
        switch (this.f2029g) {
            case 0:
                ((C0653b0) this.f2030h).m1799m1();
                return C3967n.f12976a;
            case 1:
                C1293b c1293b = (C1293b) this.f2030h;
                c1293b.f4321h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c1293b.m3434a();
                    Trace.endSection();
                    return C3967n.f12976a;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                C1765k1 c1765k1 = (C1765k1) this.f2030h;
                Object objM4414c = c1765k1.m4414c();
                EnumC1456f0 enumC1456f0 = EnumC1456f0.f4835i;
                return Boolean.valueOf(objM4414c == enumC1456f0 && c1765k1.f5892d.getValue() == enumC1456f0);
            case 3:
                return new C2567a(((C1716a) this.f2030h).f5704h);
            case 4:
                return new C2567a(((C1724i) this.f2030h).f5724j);
            case 5:
                return new C2568b(((C1727l) this.f2030h).f5741j);
            case 6:
                return new C2570d(((C1730o) this.f2030h).f5750j);
            case 7:
                return AbstractC2407b.m5749g(((C2568b) this.f2030h).f8330i);
            case 8:
                C2570d c2570d = (C2570d) this.f2030h;
                return "(" + AbstractC4166m.m8392A1(c2570d.f8335i, HttpUrl.FRAGMENT_ENCODE_SET, null, null, C2569c.f8332g, 30) + ")" + AbstractC2407b.m5749g(c2570d.f8336j);
            case 9:
                C1845j1 c1845j1 = ((C2739j0) this.f2030h).f8921h;
                C3967n c3967n = C3967n.f12976a;
                c1845j1.setValue(c3967n);
                return c3967n;
            case 10:
                Object systemService = ((View) ((C0184c) this.f2030h).f469a).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 11:
                return new BaseInputConnection(((C2887v) this.f2030h).f9326a, false);
            case 12:
                return ((C3647d) this.f2030h).f11832d;
            case 13:
                return ((C3652i) this.f2030h).m7632k1();
            case 14:
                C4376b0 c4376b0 = (C4376b0) this.f2030h;
                if (!((Boolean) c4376b0.f14591g.getValue()).booleanValue() && (c1871q = c4376b0.f14587c) != null) {
                    c1871q.m4599l();
                }
                return C3967n.f12976a;
            case 15:
                C4400j0 c4400j0M8855a = ((C4401j1) this.f2030h).m8855a();
                C5602f0 c5602f0 = c4400j0M8855a.f14648g;
                if (c4400j0M8855a.f14661t != ((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).f6893i) {
                    C0943k0 c0943k0 = c4400j0M8855a.f14653l;
                    Object[] objArr = c0943k0.f2970c;
                    long[] jArr = c0943k0.f2968a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j3 = jArr[i9];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((255 & j3) < 128) {
                                        ((C4376b0) objArr[(i9 << 3) + i11]).f14588d = true;
                                    }
                                    j3 >>= 8;
                                }
                                if (i10 == 8) {
                                    if (i9 != length) {
                                        i9++;
                                    }
                                }
                            }
                        }
                    }
                    if (c5602f0.f22797n != null) {
                        if (!c5602f0.f22779M.f22880e) {
                            C5602f0.m10000T(c5602f0, false, 7);
                        }
                    } else if (!c5602f0.m10045q()) {
                        C5602f0.m10001V(c5602f0, false, 7);
                    }
                }
                return C3967n.f12976a;
            case 16:
                C5616j0 c5616j0 = ((C5602f0) this.f2030h).f22779M;
                c5616j0.f22891p.f23016F = true;
                C5640r0 c5640r0 = c5616j0.f22892q;
                if (c5640r0 != null) {
                    c5640r0.f22974z = true;
                }
                return C3967n.f12976a;
            case 17:
                return (C0808c) this.f2030h;
            case 18:
                AbstractC3603v.m7549c(((C5899k0) this.f2030h).f23969i, null);
                return C3967n.f12976a;
            case 19:
                return C3967n.f12976a;
            case 20:
                C5880f1 c5880f1 = (C5880f1) this.f2030h;
                boolean zM8534a = C4242l.m8534a(0L, 0L);
                View view = c5880f1.f23857a;
                return zM8534a ? AbstractC5883g0.m10589e(view) : new C5896j1(0L, AbstractC0283h.m1147a(view.getContext()).mo1592K(AbstractC3754e0.m7908q0(0L)));
            case 21:
                C4079c c4079c = (C4079c) ((C5952x1) this.f2030h).f24181a.f23527b;
                if (!c4079c.f13518b) {
                    if (c4079c.f13519c) {
                        AbstractC4228a.m8492a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c4079c.m8263a();
                    c4079c.f13519c = true;
                }
                return C3967n.f12976a;
            default:
                C5989x c5989x = (C5989x) this.f2030h;
                InterfaceC4428t parentLayoutCoordinates = c5989x.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.mo8856C()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || c5989x.m11096getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }
}
