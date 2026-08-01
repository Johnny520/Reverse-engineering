package p265s1;

import android.graphics.Path;
import p215oc.C5729x;
import p265s1.InterfaceC7144t2;

/* JADX INFO: renamed from: s1.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7147u0 {

    /* JADX INFO: renamed from: s1.u0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23680a;

        static {
            int[] iArr = new int[InterfaceC7144t2.b.values().length];
            try {
                iArr[InterfaceC7144t2.b.f23676q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC7144t2.b.f23677r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23680a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7144t2 m28224a() {
        return new C7132r0(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC7144t2 m28226c(Path path) {
        return new C7132r0(path);
    }

    /* JADX INFO: renamed from: d */
    public static final void m28227d(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: e */
    public static final Path.Direction m28228e(InterfaceC7144t2.b bVar) {
        int i10 = a.f23680a[bVar.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        C5729x.m23182a();
        return null;
    }
}
