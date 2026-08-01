package androidx.compose.foundation.lazy.layout;

import p010a9.InterfaceC0184l;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0370f {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f1092a;

        /* JADX INFO: renamed from: b */
        public final int f1093b;

        /* JADX INFO: renamed from: c */
        public final Object f1094c;

        public a(int i10, int i11, Object obj) {
            this.f1092a = i10;
            this.f1093b = i11;
            this.f1094c = obj;
            if (!(i10 >= 0)) {
                AbstractC6635e.m26318a("startIndex should be >= 0");
            }
            if (i11 > 0) {
                return;
            }
            AbstractC6635e.m26318a("size should be > 0");
        }

        /* JADX INFO: renamed from: a */
        public final int m1198a() {
            return this.f1093b;
        }

        /* JADX INFO: renamed from: b */
        public final int m1199b() {
            return this.f1092a;
        }

        /* JADX INFO: renamed from: c */
        public final Object m1200c() {
            return this.f1094c;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo1196a();

    /* JADX INFO: renamed from: b */
    void mo1197b(int i10, int i11, InterfaceC0184l interfaceC0184l);

    a get(int i10);
}
