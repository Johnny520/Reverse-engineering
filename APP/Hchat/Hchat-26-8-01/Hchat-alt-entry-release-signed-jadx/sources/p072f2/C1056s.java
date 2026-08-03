package p072f2;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import gg.AbstractC1416l;
import p069f.AbstractC0942k;
import p069f.C0933f0;
import p069f.C0965w;
import p069f.C0966x;
import p102h2.EnumC1571a;
import p119i2.C1926g;
import p218og.AbstractC3149m;
import p339x1.C5602f0;
import p351xe.C5784e;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import p373z0.C6063c;
import p373z0.C6064d;
import p373z0.C6066f;
import p373z0.C6071k;

/* JADX INFO: renamed from: f2.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1056s {

    /* JADX INFO: renamed from: a */
    public final C5602f0 f3355a;

    /* JADX INFO: renamed from: b */
    public final C1043f f3356b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0942k f3357c;

    /* JADX INFO: renamed from: d */
    public final C0933f0 f3358d = new C0933f0(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1056s(C5602f0 c5602f0, C1043f c1043f, C0965w c0965w) {
        this.f3355a = c5602f0;
        this.f3356b = c1043f;
        this.f3357c = c0965w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1054q m2668a() {
        return new C1054q(this.f3356b, false, this.f3355a, new C1050m());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2669b(C5602f0 c5602f0, C1050m c1050m) {
        String str;
        String strM6701P0;
        EnumC1571a enumC1571a;
        EnumC1571a enumC1571a2;
        C6066f c6066f;
        C6066f c6066f2;
        C0933f0 c0933f0 = this.f3358d;
        Object[] objArr = c0933f0.f2923a;
        int i9 = c0933f0.f2924b;
        boolean z9 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            C6063c c6063c = (C6063c) objArr[i10];
            C5784e c5784e = c6063c.f24536g;
            AutofillManager autofillManager = (AutofillManager) c5784e.f23527b;
            ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = c6063c.f24538i;
            C1050m c1050mM10051w = c5602f0.m10051w();
            int i11 = c5602f0.f22791h;
            if (c1050m != null) {
                Object objM2320g = c1050m.f3341g.m2320g(AbstractC1058u.f3364E);
                if (objM2320g == null) {
                    objM2320g = null;
                }
                C1926g c1926g = (C1926g) objM2320g;
                str = c1926g != null ? c1926g.f6529h : null;
            }
            if (c1050mM10051w != null) {
                Object objM2320g2 = c1050mM10051w.f3341g.m2320g(AbstractC1058u.f3364E);
                if (objM2320g2 == null) {
                    objM2320g2 = null;
                }
                C1926g c1926g2 = (C1926g) objM2320g2;
                strM6701P0 = c1926g2 != null ? c1926g2.f6529h : null;
            }
            if (str != strM6701P0) {
                if (str == null) {
                    c5784e.m10467b(viewTreeObserverOnGlobalLayoutListenerC5934t, i11, true);
                } else if (strM6701P0 == null) {
                    c5784e.m10467b(viewTreeObserverOnGlobalLayoutListenerC5934t, i11, z9);
                } else if (AbstractC1416l.m3825a((C6064d) AbstractC1057t.m2675f(c1050mM10051w, AbstractC1058u.f3393r), C6071k.f24550a)) {
                    if (strM6701P0.length() >= 5000) {
                        strM6701P0 = (Character.isHighSurrogate(strM6701P0.charAt(4999)) && Character.isLowSurrogate(strM6701P0.charAt(5000))) ? AbstractC3149m.m6701P0(4999, strM6701P0) : AbstractC3149m.m6701P0(5000, strM6701P0);
                    }
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC5934t, i11, AutofillValue.forText(strM6701P0));
                }
            }
            if (c1050m != null) {
                Object objM2320g3 = c1050m.f3341g.m2320g(AbstractC1058u.f3369J);
                if (objM2320g3 == null) {
                    objM2320g3 = null;
                }
                enumC1571a = (EnumC1571a) objM2320g3;
            } else {
                enumC1571a = null;
            }
            if (c1050mM10051w != null) {
                Object objM2320g4 = c1050mM10051w.f3341g.m2320g(AbstractC1058u.f3369J);
                if (objM2320g4 == null) {
                    objM2320g4 = null;
                }
                enumC1571a2 = (EnumC1571a) objM2320g4;
            } else {
                enumC1571a2 = null;
            }
            if (enumC1571a != enumC1571a2) {
                if (enumC1571a == null) {
                    c5784e.m10467b(viewTreeObserverOnGlobalLayoutListenerC5934t, i11, true);
                } else if (enumC1571a2 == null) {
                    c5784e.m10467b(viewTreeObserverOnGlobalLayoutListenerC5934t, i11, false);
                } else if (AbstractC1416l.m3825a((C6064d) AbstractC1057t.m2675f(c1050mM10051w, AbstractC1058u.f3393r), C6071k.f24551b)) {
                    int iOrdinal = enumC1571a2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC5934t, i11, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            if (c1050m != null) {
                Object objM2320g5 = c1050m.f3341g.m2320g(AbstractC1058u.f3394s);
                if (objM2320g5 == null) {
                    objM2320g5 = null;
                }
                c6066f = (C6066f) objM2320g5;
            } else {
                c6066f = null;
            }
            if (c1050mM10051w != null) {
                Object objM2320g6 = c1050mM10051w.f3341g.m2320g(AbstractC1058u.f3394s);
                if (objM2320g6 == null) {
                    objM2320g6 = null;
                }
                c6066f2 = (C6066f) objM2320g6;
            } else {
                c6066f2 = null;
            }
            if (AbstractC1416l.m3825a(c6066f, c6066f2)) {
                z9 = false;
            } else if (c6066f == null) {
                c5784e.m10467b(viewTreeObserverOnGlobalLayoutListenerC5934t, i11, true);
                z9 = false;
            } else if (c6066f2 == null) {
                z9 = false;
                c5784e.m10467b(viewTreeObserverOnGlobalLayoutListenerC5934t, i11, false);
            } else {
                z9 = false;
                autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC5934t, i11, c6066f2.f24547a);
            }
            boolean z10 = (c1050m == null || !c1050m.f3341g.m2315b(AbstractC1058u.f3392q)) ? z9 : true;
            boolean z11 = (c1050mM10051w == null || !c1050mM10051w.f3341g.m2315b(AbstractC1058u.f3392q)) ? z9 : true;
            if (z10 != z11) {
                C0966x c0966x = c6063c.f24543n;
                if (z11) {
                    c0966x.m2380a(i11);
                } else {
                    c0966x.m2384e(i11);
                }
            }
        }
    }
}
