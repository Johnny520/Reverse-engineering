package p166l2;

import java.util.ArrayList;
import java.util.List;
import p135j2.InterfaceC3566s;
import p166l2.C4554j0;
import p215oc.C5729x;
import p376zd.C9987e;

/* JADX INFO: renamed from: l2.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4603y0 {

    /* JADX INFO: renamed from: l2.y0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13631a;

        static {
            int[] iArr = new int[C4554j0.e.values().length];
            try {
                iArr[C4554j0.e.f13388r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C4554j0.e.f13390t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C4554j0.e.f13387q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C4554j0.e.f13389s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C4554j0.e.f13391u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13631a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final List m18447a(InterfaceC3566s interfaceC3566s) {
        interfaceC3566s.getClass();
        C4554j0 c4554j0Mo17689I1 = ((InterfaceC4600x0) interfaceC3566s).mo17689I1();
        boolean zM18448b = m18448b(c4554j0Mo17689I1);
        List listM17892T = c4554j0Mo17689I1.m17892T();
        ArrayList arrayList = new ArrayList(listM17892T.size());
        int size = listM17892T.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4554j0 c4554j0 = (C4554j0) listM17892T.get(i10);
            arrayList.add(zM18448b ? c4554j0.m17875N() : c4554j0.m17877O());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m18448b(C4554j0 c4554j0) {
        int i10 = a.f13631a[c4554j0.m17937i0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        if (i10 != 5) {
            C5729x.m23182a();
            return false;
        }
        C4554j0 c4554j0M17848B0 = c4554j0.m17848B0();
        if (c4554j0M17848B0 != null) {
            return m18448b(c4554j0M17848B0);
        }
        C9987e.m38645a("no parent for idle node");
        return false;
    }
}
