package top.anjao2024.xp1whs;

import android.app.Application;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.AbstractC0619pl;
import p000.C0373jz;
import p000.C0439lp;
import p000.lf1;
import p000.mf1;
import p000.nf1;
import p000.of1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class App extends Application implements nf1 {

    /* JADX INFO: renamed from: f */
    private static volatile lf1 f6031f;

    /* JADX INFO: renamed from: d */
    public static final C0772a f6029d = new C0772a(null);

    /* JADX INFO: renamed from: e */
    public static final int f6030e = 8;

    /* JADX INFO: renamed from: g */
    private static final CopyOnWriteArraySet<InterfaceC0773b> f6032g = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: top.anjao2024.xp1whs.App$b */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public interface InterfaceC0773b {
        void onServiceStateChanged(lf1 lf1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final void m4215e(lf1 lf1Var) {
        Iterator<InterfaceC0773b> it = f6032g.iterator();
        it.getClass();
        while (it.hasNext()) {
            InterfaceC0773b next = it.next();
            C0772a c0772a = f6029d;
            next.getClass();
            c0772a.m4217c(next, lf1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nf1
    /* JADX INFO: renamed from: a */
    public void mo2700a(lf1 lf1Var) {
        lf1Var.getClass();
        f6031f = lf1Var;
        m4215e(f6031f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nf1
    /* JADX INFO: renamed from: b */
    public void mo2701b(lf1 lf1Var) {
        lf1Var.getClass();
        f6031f = null;
        m4215e(f6031f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        C0439lp.f3566a.m2047c(this);
        HashSet hashSet = of1.f4553a;
        synchronized (hashSet) {
            try {
                of1.f4554b = this;
                if (!hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        try {
                            lf1 lf1Var = (lf1) it.next();
                            ((C0373jz) lf1Var.f3481a).f2960a.linkToDeath(new mf1(lf1Var, 0), 0);
                            of1.f4554b.mo2700a(lf1Var);
                        } catch (Throwable th) {
                            Log.e("XposedServiceHelper", "registerListener", th);
                            it.remove();
                        }
                    }
                    of1.f4553a.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: top.anjao2024.xp1whs.App$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0772a {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: top.anjao2024.xp1whs.App.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0772a(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final void m4217c(InterfaceC0773b interfaceC0773b, lf1 lf1Var) {
            if (App.f6032g.contains(interfaceC0773b)) {
                interfaceC0773b.onServiceStateChanged(lf1Var);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final void m4218b(InterfaceC0773b interfaceC0773b, boolean z) {
            interfaceC0773b.getClass();
            App.f6032g.add(interfaceC0773b);
            if (z) {
                m4217c(interfaceC0773b, m4219d());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final lf1 m4219d() {
            return App.f6031f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final void m4220e(InterfaceC0773b interfaceC0773b) {
            interfaceC0773b.getClass();
            App.f6032g.remove(interfaceC0773b);
        }

        private C0772a() {
        }
    }
}
