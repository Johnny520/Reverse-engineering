package p307v0;

import gg.AbstractC1428x;
import java.util.Arrays;
import p000a.AbstractC0000a;
import p036c9.C0475p0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p119i2.C1954y;
import p227p4.C3315t;
import p259r9.C3766p;
import sh.C4016i0;

/* JADX INFO: renamed from: v0.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4371k {

    /* JADX INFO: renamed from: a */
    public static final C3315t f14579a = new C3315t(new C1954y(27), 12, new C3766p(11));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final String m8803a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C3315t m8804b(InterfaceC1235p interfaceC1235p, InterfaceC1231l interfaceC1231l) {
        C4016i0 c4016i0 = new C4016i0(5, interfaceC1235p);
        AbstractC1428x.m3838c(1, interfaceC1231l);
        return new C3315t(c4016i0, 12, interfaceC1231l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final Object m8805c(Object[] objArr, InterfaceC1220a interfaceC1220a, C1836h0 c1836h0, int i9) {
        return m8806d(Arrays.copyOf(objArr, objArr.length), f14579a, interfaceC1220a, c1836h0, ((i9 << 6) & 7168) | 384);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final Object m8806d(Object[] objArr, InterfaceC4370j interfaceC4370j, InterfaceC1220a interfaceC1220a, C1836h0 c1836h0, int i9) {
        Object[] objArr2;
        InterfaceC4370j interfaceC4370j2;
        Object obj;
        Object objMo8039d;
        long j3 = c1836h0.f6095T;
        AbstractC0000a.m96w(36);
        String string = Long.toString(j3, 36);
        string.getClass();
        interfaceC4370j.getClass();
        InterfaceC4366f interfaceC4366f = (InterfaceC4366f) c1836h0.m4542j(AbstractC4368h.f14575a);
        Object objM4514P = c1836h0.m4514P();
        Object obj2 = C1851l.f6155a;
        if (objM4514P == obj2) {
            Object objMo4775e = (interfaceC4366f == null || (objMo8039d = interfaceC4366f.mo8039d(string)) == null) ? null : interfaceC4370j.mo4775e(objMo8039d);
            if (objMo4775e == null) {
                objMo4775e = interfaceC1220a.invoke();
            }
            objArr2 = objArr;
            interfaceC4370j2 = interfaceC4370j;
            Object c4362b = new C4362b(interfaceC4370j2, interfaceC4366f, string, objMo4775e, objArr2);
            c1836h0.m4545k0(c4362b);
            objM4514P = c4362b;
        } else {
            objArr2 = objArr;
            interfaceC4370j2 = interfaceC4370j;
        }
        C4362b c4362b2 = (C4362b) objM4514P;
        Object objInvoke = Arrays.equals(objArr2, c4362b2.f14564k) ? c4362b2.f14563j : null;
        if (objInvoke == null) {
            objInvoke = interfaceC1220a.invoke();
        }
        boolean zM4538h = c1836h0.m4538h(c4362b2) | ((((i9 & 112) ^ 48) > 32 && c1836h0.m4538h(interfaceC4370j2)) || (i9 & 48) == 32) | c1836h0.m4538h(interfaceC4366f) | c1836h0.m4534f(string) | c1836h0.m4538h(objInvoke) | c1836h0.m4538h(objArr2);
        Object objM4514P2 = c1836h0.m4514P();
        if (zM4538h || objM4514P2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object c0475p0 = new C0475p0(c4362b2, interfaceC4370j2, interfaceC4366f, string, obj, objArr3, 2);
            c1836h0.m4545k0(c0475p0);
            objM4514P2 = c0475p0;
        } else {
            obj = objInvoke;
        }
        AbstractC1874r.m4628j((InterfaceC1220a) objM4514P2, c1836h0);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final Object m8807e(Object[] objArr, InterfaceC4370j interfaceC4370j, InterfaceC1220a interfaceC1220a, C1836h0 c1836h0, int i9) {
        return m8806d(Arrays.copyOf(objArr, objArr.length), interfaceC4370j, interfaceC1220a, c1836h0, ((i9 << 3) & 7168) | 384);
    }
}
