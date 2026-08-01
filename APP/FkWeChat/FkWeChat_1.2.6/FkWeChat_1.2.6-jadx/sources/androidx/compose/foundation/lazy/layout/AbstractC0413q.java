package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.InterfaceC0370f;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0413q {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10046a implements InterfaceC0184l {

            /* JADX INFO: renamed from: q */
            public static final C10046a f1180q = new C10046a();

            /* JADX INFO: renamed from: a */
            public final Void m1322a(int i10) {
                return null;
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                return m1322a(((Number) obj).intValue());
            }
        }

        InterfaceC0184l getKey();

        default InterfaceC0184l getType() {
            return C10046a.f1180q;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m1318g(int i10) {
        InterfaceC0370f.a aVar = mo1319h().get(i10);
        return ((a) aVar.m1200c()).getType().mo27m(Integer.valueOf(i10 - aVar.m1199b()));
    }

    /* JADX INFO: renamed from: h */
    public abstract InterfaceC0370f mo1319h();

    /* JADX INFO: renamed from: i */
    public final int m1320i() {
        return mo1319h().mo1196a();
    }

    /* JADX INFO: renamed from: j */
    public final Object m1321j(int i10) {
        Object objMo27m;
        InterfaceC0370f.a aVar = mo1319h().get(i10);
        int iM1199b = i10 - aVar.m1199b();
        InterfaceC0184l key = ((a) aVar.m1200c()).getKey();
        return (key == null || (objMo27m = key.mo27m(Integer.valueOf(iM1199b))) == null) ? AbstractC0430v1.m1437a(i10) : objMo27m;
    }
}
