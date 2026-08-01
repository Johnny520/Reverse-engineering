package p152e0;

import android.app.PendingIntent;
import com.bumptech.glide.AbstractC1926h;
import java.util.Arrays;
import p000A.C0038T0;
import p000A.C0072l0;
import p056K2.C0891q;
import p092S0.C1286x;
import p092S0.C1287y;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: e0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2004k {

    /* JADX INFO: renamed from: a */
    public static final C0038T0 f6725a;

    static {
        int i5 = 29;
        f6725a = new C0038T0(i5, new C1287y((byte) 0, 15), new C1286x(22));
    }

    /* JADX INFO: renamed from: a */
    public static final String m3669a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX INFO: renamed from: b */
    public static final Object m3670b(Object[] objArr, InterfaceC1599a interfaceC1599a, InterfaceC1373m interfaceC1373m, int i5) {
        return m3671c(Arrays.copyOf(objArr, objArr.length), f6725a, interfaceC1599a, interfaceC1373m, ((i5 << 6) & 7168) | 384);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m3671c(Object[] objArr, InterfaceC2003j interfaceC2003j, InterfaceC1599a interfaceC1599a, InterfaceC1373m interfaceC1373m, int i5) {
        Object[] objArr2;
        InterfaceC2003j interfaceC2003j2;
        final Object obj;
        Object objMo1277c;
        C1383r c1383r = (C1383r) interfaceC1373m;
        long j5 = c1383r.f4882T;
        AbstractC1926h.m3565h(36);
        final String string = Long.toString(j5, 36);
        AbstractC1665j.m2984d(string, "toString(...)");
        AbstractC1665j.m2983c(interfaceC2003j, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final InterfaceC1999f interfaceC1999f = (InterfaceC1999f) c1383r.m2590j(AbstractC2001h.f6721a);
        Object objM2558L = c1383r.m2558L();
        C1357e c1357e = C1371l.f4833a;
        if (objM2558L == c1357e) {
            Object objMo42k = (interfaceC1999f == null || (objMo1277c = interfaceC1999f.mo1277c(string)) == null) ? null : interfaceC2003j.mo42k(objMo1277c);
            if (objMo42k == null) {
                objMo42k = interfaceC1599a.mo6a();
            }
            objArr2 = objArr;
            interfaceC2003j2 = interfaceC2003j;
            C1995b c1995b = new C1995b(interfaceC2003j2, interfaceC1999f, string, objMo42k, objArr2);
            c1383r.m2585g0(c1995b);
            objM2558L = c1995b;
        } else {
            objArr2 = objArr;
            interfaceC2003j2 = interfaceC2003j;
        }
        final C1995b c1995b2 = (C1995b) objM2558L;
        Object objMo6a = Arrays.equals(objArr2, c1995b2.f6710h) ? c1995b2.f6709g : null;
        if (objMo6a == null) {
            objMo6a = interfaceC1599a.mo6a();
        }
        boolean zM2586h = c1383r.m2586h(c1995b2) | ((((i5 & 112) ^ 48) > 32 && c1383r.m2586h(interfaceC2003j2)) || (i5 & 48) == 32) | c1383r.m2586h(interfaceC1999f) | c1383r.m2582f(string) | c1383r.m2586h(objMo6a) | c1383r.m2586h(objArr2);
        Object objM2558L2 = c1383r.m2558L();
        if (zM2586h || objM2558L2 == c1357e) {
            final Object[] objArr3 = objArr2;
            obj = objMo6a;
            final InterfaceC2003j interfaceC2003j3 = interfaceC2003j2;
            InterfaceC1599a interfaceC1599a2 = new InterfaceC1599a() { // from class: e0.a
                @Override // p112W2.InterfaceC1599a
                /* JADX INFO: renamed from: a */
                public final Object mo6a() throws PendingIntent.CanceledException {
                    boolean z5;
                    C1995b c1995b3 = c1995b2;
                    InterfaceC1999f interfaceC1999f2 = c1995b3.f6707e;
                    InterfaceC1999f interfaceC1999f3 = interfaceC1999f;
                    boolean z6 = true;
                    if (interfaceC1999f2 != interfaceC1999f3) {
                        c1995b3.f6707e = interfaceC1999f3;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    String str = c1995b3.f6708f;
                    String str2 = string;
                    if (AbstractC1665j.m2981a(str, str2)) {
                        z6 = z5;
                    } else {
                        c1995b3.f6708f = str2;
                    }
                    c1995b3.f6706d = interfaceC2003j3;
                    c1995b3.f6709g = obj;
                    c1995b3.f6710h = objArr3;
                    InterfaceC1998e interfaceC1998e = c1995b3.f6711i;
                    if (interfaceC1998e != null && z6) {
                        ((C0072l0) interfaceC1998e).m96B();
                        c1995b3.f6711i = null;
                        c1995b3.m3666b();
                    }
                    return C0891q.f2780a;
                }
            };
            c1383r.m2585g0(interfaceC1599a2);
            objM2558L2 = interfaceC1599a2;
        } else {
            obj = objMo6a;
        }
        AbstractC1385s.m2617g((InterfaceC1599a) objM2558L2, c1383r);
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m3672d(Object[] objArr, InterfaceC2003j interfaceC2003j, InterfaceC1599a interfaceC1599a, InterfaceC1373m interfaceC1373m, int i5) {
        return m3671c(Arrays.copyOf(objArr, objArr.length), interfaceC2003j, interfaceC1599a, interfaceC1373m, ((i5 << 3) & 7168) | 384);
    }
}
