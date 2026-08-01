package p051J;

import android.view.autofill.AutofillValue;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p000A.C0012G;
import p000A.C0036S0;
import p000A.C0038T0;
import p000A.C0078o0;
import p061L2.AbstractC0972l;
import p077P0.InterfaceC1136w;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p092S0.C1269g;
import p095T.C1366i0;
import p112W2.InterfaceC1601c;
import p115X0.C1623A;
import p115X0.C1626a;
import p115X0.C1634i;
import p115X0.C1646u;
import p115X0.InterfaceC1632g;
import p117X2.AbstractC1665j;
import p175i0.C2271f;

/* JADX INFO: renamed from: J.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0815g implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2622d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0816h f2623e;

    public /* synthetic */ C0815g(C0816h c0816h, int i5) {
        this.f2622d = i5;
        this.f2623e = c0816h;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        int i5 = this.f2622d;
        boolean z5 = true;
        C0816h c0816h = this.f2623e;
        switch (i5) {
            case 0:
                C1366i0 c1366i0 = c0816h.f2627v.f356t;
                Boolean bool = Boolean.TRUE;
                c1366i0.setValue(bool);
                c0816h.f2627v.f355s.setValue(bool);
                C0078o0 c0078o0 = c0816h.f2627v;
                AutofillValue autofillValue = ((C2271f) obj).f7424a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                AbstractC1665j.m2983c(textValue, "null cannot be cast to non-null type kotlin.String");
                C0816h.m1422M0(c0078o0, (String) textValue, c0816h.f2628w);
                return bool;
            case BuildConfig.VERSION_CODE /* 1 */:
                List list = (List) obj;
                if (c0816h.f2627v.m123d() != null) {
                    C0036S0 c0036s0M123d = c0816h.f2627v.m123d();
                    AbstractC1665j.m2982b(c0036s0M123d);
                    list.add(c0036s0M123d.f161a);
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 2:
                C0816h.m1422M0(c0816h.f2627v, ((C1269g) obj).f4563e, c0816h.f2628w);
                return Boolean.TRUE;
            default:
                C1269g c1269g = (C1269g) obj;
                if (c0816h.f2628w) {
                    C1623A c1623a = c0816h.f2627v.f341e;
                    if (c1623a != null) {
                        List listM1987K = AbstractC0972l.m1987K(new InterfaceC1632g[]{new C1634i(), new C1626a(c1269g, 1)});
                        C0078o0 c0078o02 = c0816h.f2627v;
                        C0038T0 c0038t0 = c0078o02.f340d;
                        C0012G c0012g = c0078o02.f358v;
                        C1646u c1646uM51t = c0038t0.m51t(listM1987K);
                        c1623a.m2927a(null, c1646uM51t);
                        c0012g.mo1h(c1646uM51t);
                    } else {
                        C1646u c1646u = c0816h.f2626u;
                        String str = c1646u.f5650a.f4563e;
                        long j5 = c1646u.f5651b;
                        int i6 = C1259L.f4537c;
                        int i7 = (int) (j5 >> 32);
                        int i8 = (int) (j5 & 4294967295L);
                        AbstractC1665j.m2985e(str, "<this>");
                        AbstractC1665j.m2985e(c1269g, "replacement");
                        if (i8 < i7) {
                            throw new IndexOutOfBoundsException("End index (" + i8 + ") is less than start index (" + i7 + ").");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append((CharSequence) str, 0, i7);
                        sb.append((CharSequence) c1269g);
                        sb.append((CharSequence) str, i8, str.length());
                        String string = sb.toString();
                        int length = c1269g.f4563e.length() + ((int) (c0816h.f2626u.f5651b >> 32));
                        c0816h.f2627v.f358v.mo1h(new C1646u(string, AbstractC1251D.m2313b(length, length), 4));
                    }
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
        }
    }

    public /* synthetic */ C0815g(C0816h c0816h, InterfaceC1136w interfaceC1136w) {
        this.f2622d = 3;
        this.f2623e = c0816h;
    }
}
