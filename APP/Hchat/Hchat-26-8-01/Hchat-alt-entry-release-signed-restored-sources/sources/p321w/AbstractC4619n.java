package p321w;

import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p036c9.RunnableC0496w;
import p117i0.C1836h0;
import p117i0.C1858m2;
import p119i2.C1926g;
import p119i2.C1941n0;
import p144k.C2209s1;
import p177m2.InterfaceC2760d;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p357y1.AbstractC5888h1;

/* JADX INFO: renamed from: w.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4619n {

    /* JADX INFO: renamed from: a */
    public static final C1858m2 f15296a = new C1858m2(new C2209s1(18));

    /* JADX INFO: renamed from: b */
    public static Boolean f15297b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m9041a(C1926g c1926g, C1941n0 c1941n0, InterfaceC2760d interfaceC2760d, List list, C1836h0 c1836h0) {
        Executor executor = (Executor) c1836h0.m4542j(f15296a);
        if (executor == null || !m9042b(c1926g.f6529h.length())) {
            c1836h0.m4525a0(-517090505);
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4525a0(-518737659);
            try {
                executor.execute(new RunnableC0496w(c1941n0, (EnumC4243m) c1836h0.m4542j(AbstractC5888h1.f23932n), list, c1926g, (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h), interfaceC2760d));
            } catch (RejectedExecutionException unused) {
            }
            c1836h0.m4553p(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m9042b(int i9) {
        if (Build.VERSION.SDK_INT >= 28 && i9 >= 8 && i9 < 1000) {
            if (f15297b == null) {
                f15297b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = f15297b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
