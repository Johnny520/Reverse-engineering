package p077P0;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import p041H0.C0564I;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p087R0.EnumC1190a;
import p092S0.C1269g;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p175i0.C2268c;
import p175i0.C2269d;
import p175i0.C2271f;
import p175i0.C2276k;
import p186k.AbstractC2428j;
import p186k.C2404A;
import p186k.C2439u;
import p186k.C2440v;

/* JADX INFO: renamed from: P0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1130q {

    /* JADX INFO: renamed from: a */
    public final C0564I f3717a;

    /* JADX INFO: renamed from: b */
    public final C1118e f3718b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2428j f3719c;

    /* JADX INFO: renamed from: d */
    public final C2404A f3720d = new C2404A(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1130q(C0564I c0564i, C1118e c1118e, C2439u c2439u) {
        this.f3717a = c0564i;
        this.f3718b = c1118e;
        this.f3719c = c2439u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1128o m2180a() {
        return new C1128o(this.f3718b, false, this.f3717a, new C1125l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2181b(C0564I c0564i, C1125l c1125l) {
        String str;
        String str2;
        EnumC1190a enumC1190a;
        EnumC1190a enumC1190a2;
        C2271f c2271f;
        C2271f c2271f2;
        C2404A c2404a = this.f3720d;
        Object[] objArr = c2404a.f7766a;
        int i5 = c2404a.f7767b;
        boolean z5 = false;
        for (int i6 = 0; i6 < i5; i6++) {
            C2268c c2268c = (C2268c) objArr[i6];
            C2440v c2440v = c2268c.f7420k;
            ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = c2268c.f7415f;
            C1753n c1753n = c2268c.f7413d;
            AutofillManager autofillManager = (AutofillManager) c1753n.f6028e;
            C1125l c1125lM841w = c0564i.m841w();
            int i7 = c0564i.f1712e;
            if (c1125l != null) {
                Object objM4272g = c1125l.f3702d.m4272g(AbstractC1132s.f3726E);
                if (objM4272g == null) {
                    objM4272g = null;
                }
                C1269g c1269g = (C1269g) objM4272g;
                str = c1269g != null ? c1269g.f4563e : null;
            }
            if (c1125lM841w != null) {
                Object objM4272g2 = c1125lM841w.f3702d.m4272g(AbstractC1132s.f3726E);
                if (objM4272g2 == null) {
                    objM4272g2 = null;
                }
                C1269g c1269g2 = (C1269g) objM4272g2;
                str2 = c1269g2 != null ? c1269g2.f4563e : null;
            }
            if (str != str2) {
                if (str == null) {
                    c1753n.m3112F(viewTreeObserverOnGlobalLayoutListenerC0772y, i7, true);
                } else if (str2 == null) {
                    c1753n.m3112F(viewTreeObserverOnGlobalLayoutListenerC0772y, i7, z5);
                } else if (AbstractC1665j.m2981a((C2269d) AbstractC1131r.m2185d(c1125lM841w, AbstractC1132s.f3755r), C2276k.f7427a)) {
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0772y, i7, AutofillValue.forText(str2));
                }
            }
            if (c1125l != null) {
                Object objM4272g3 = c1125l.f3702d.m4272g(AbstractC1132s.f3731J);
                if (objM4272g3 == null) {
                    objM4272g3 = null;
                }
                enumC1190a = (EnumC1190a) objM4272g3;
            } else {
                enumC1190a = null;
            }
            if (c1125lM841w != null) {
                Object objM4272g4 = c1125lM841w.f3702d.m4272g(AbstractC1132s.f3731J);
                if (objM4272g4 == null) {
                    objM4272g4 = null;
                }
                enumC1190a2 = (EnumC1190a) objM4272g4;
            } else {
                enumC1190a2 = null;
            }
            if (enumC1190a != enumC1190a2) {
                if (enumC1190a == null) {
                    c1753n.m3112F(viewTreeObserverOnGlobalLayoutListenerC0772y, i7, true);
                } else if (enumC1190a2 == null) {
                    c1753n.m3112F(viewTreeObserverOnGlobalLayoutListenerC0772y, i7, false);
                } else if (AbstractC1665j.m2981a((C2269d) AbstractC1131r.m2185d(c1125lM841w, AbstractC1132s.f3755r), C2276k.f7428b)) {
                    int iOrdinal = enumC1190a2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0772y, i7, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            if (c1125l != null) {
                Object objM4272g5 = c1125l.f3702d.m4272g(AbstractC1132s.f3756s);
                if (objM4272g5 == null) {
                    objM4272g5 = null;
                }
                c2271f = (C2271f) objM4272g5;
            } else {
                c2271f = null;
            }
            if (c1125lM841w != null) {
                Object objM4272g6 = c1125lM841w.f3702d.m4272g(AbstractC1132s.f3756s);
                if (objM4272g6 == null) {
                    objM4272g6 = null;
                }
                c2271f2 = (C2271f) objM4272g6;
            } else {
                c2271f2 = null;
            }
            if (AbstractC1665j.m2981a(c2271f, c2271f2)) {
                z5 = false;
            } else if (c2271f == null) {
                c1753n.m3112F(viewTreeObserverOnGlobalLayoutListenerC0772y, i7, true);
                z5 = false;
            } else if (c2271f2 == null) {
                z5 = false;
                c1753n.m3112F(viewTreeObserverOnGlobalLayoutListenerC0772y, i7, false);
            } else {
                z5 = false;
                autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0772y, i7, c2271f2.f7424a);
            }
            boolean z6 = (c1125l == null || !c1125l.f3702d.m4267b(AbstractC1132s.f3754q)) ? z5 : true;
            boolean z7 = (c1125lM841w == null || !c1125lM841w.f3702d.m4267b(AbstractC1132s.f3754q)) ? z5 : true;
            if (z6 != z7) {
                if (z7) {
                    c2440v.m4345a(i7);
                } else {
                    c2440v.m4349e(i7);
                }
            }
        }
    }
}
