package p226p6;

import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1052o0;
import p098g9.InterfaceC2549c;
import p185m8.AbstractC5114x;
import p299ub.AbstractC8621f0;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: p6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5961d {

    /* JADX INFO: renamed from: a */
    public static final C5961d f18892a = new C5961d();

    /* JADX INFO: renamed from: b */
    public static final List f18893b = AbstractC5114x.m20803r("Kt$", "$");

    /* JADX INFO: renamed from: a */
    public final String m23950a(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        return m23951b(AbstractC1052o0.m3807b(interfaceC0173a.getClass()));
    }

    /* JADX INFO: renamed from: b */
    public final String m23951b(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        return m23952c(AbstractC9886a.m38367b(interfaceC2549c).getName());
    }

    /* JADX INFO: renamed from: c */
    public final String m23952c(String str) {
        Iterator it = f18893b.iterator();
        while (it.hasNext()) {
            String str2 = str;
            int iM33152n0 = AbstractC8621f0.m33152n0(str2, (String) it.next(), 0, false, 6, null);
            if (iM33152n0 != -1) {
                return str2.substring(0, iM33152n0);
            }
            str = str2;
        }
        return str;
    }
}
