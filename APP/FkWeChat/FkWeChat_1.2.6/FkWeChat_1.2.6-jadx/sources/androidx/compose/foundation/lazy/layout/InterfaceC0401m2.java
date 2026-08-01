package androidx.compose.foundation.lazy.layout;

import java.util.List;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p117i.AbstractC3071m;
import p117i.AbstractC3073n;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.m2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0401m2 {

    /* JADX INFO: renamed from: a */
    public static final a f1143a = a.f1144a;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.m2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f1144a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC0401m2 f1145b = new C10045a();

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.m2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10045a implements InterfaceC0401m2 {
            @Override // androidx.compose.foundation.lazy.layout.InterfaceC0401m2
            /* JADX INFO: renamed from: a */
            public AbstractC3071m mo1277a(int i10, int i11, AbstractC3071m abstractC3071m) {
                int i12;
                if (i11 - i10 < 0 || (i12 = abstractC3071m.f8151b) == 0) {
                    return AbstractC3073n.m11431a();
                }
                C2363j c2363jM8592s = AbstractC2368o.m8592s(0, i12);
                int iM8560o = c2363jM8592s.m8560o();
                int iM8561p = c2363jM8592s.m8561p();
                int iM11417e = -1;
                if (iM8560o <= iM8561p) {
                    while (abstractC3071m.m11417e(iM8560o) <= i10) {
                        iM11417e = abstractC3071m.m11417e(iM8560o);
                        if (iM8560o == iM8561p) {
                            break;
                        }
                        iM8560o++;
                    }
                }
                return iM11417e == -1 ? AbstractC3073n.m11431a() : AbstractC3073n.m11432b(iM11417e);
            }

            @Override // androidx.compose.foundation.lazy.layout.InterfaceC0401m2
            /* JADX INFO: renamed from: b */
            public int mo1278b(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                Object obj;
                int size = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i17);
                    if (((InterfaceC0391k0) obj).getIndex() != i10) {
                        break;
                    }
                    i17++;
                }
                InterfaceC0391k0 interfaceC0391k0 = (InterfaceC0391k0) obj;
                int iM1273c = interfaceC0391k0 != null ? AbstractC0396l1.m1273c(interfaceC0391k0) : Integer.MIN_VALUE;
                int iMax = i12 == Integer.MIN_VALUE ? -i13 : Math.max(-i13, i12);
                return iM1273c != Integer.MIN_VALUE ? Math.min(iMax, iM1273c - i11) : iMax;
            }
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC0401m2 m1279a() {
            return f1145b;
        }
    }

    /* JADX INFO: renamed from: a */
    AbstractC3071m mo1277a(int i10, int i11, AbstractC3071m abstractC3071m);

    /* JADX INFO: renamed from: b */
    int mo1278b(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16);
}
