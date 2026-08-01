package p004a3;

import androidx.compose.runtime.InterfaceC0564p5;
import p024b9.AbstractC1043k;
import p215oc.C5725t;

/* JADX INFO: renamed from: a3.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0042h {

    /* JADX INFO: renamed from: b */
    public static final a f71b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final AbstractC0037e0 f72c = new C0038f();

    /* JADX INFO: renamed from: d */
    public static final C0058v f73d = new C0058v("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: e */
    public static final C0058v f74e = new C0058v("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: f */
    public static final C0058v f75f = new C0058v("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: g */
    public static final C0058v f76g = new C0058v("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: a */
    public final boolean f77a;

    /* JADX INFO: renamed from: a3.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: b */
        static /* synthetic */ InterfaceC0564p5 m155b(b bVar, AbstractC0042h abstractC0042h, C0054r c0054r, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
                return null;
            }
            if ((i12 & 1) != 0) {
                abstractC0042h = null;
            }
            if ((i12 & 2) != 0) {
                c0054r = C0054r.f120r.m207e();
            }
            if ((i12 & 4) != 0) {
                i10 = C0052p.f99b.m178b();
            }
            if ((i12 & 8) != 0) {
                i11 = C0053q.f103b.m190a();
            }
            return bVar.mo156a(abstractC0042h, c0054r, i10, i11);
        }

        /* JADX INFO: renamed from: a */
        InterfaceC0564p5 mo156a(AbstractC0042h abstractC0042h, C0054r c0054r, int i10, int i11);
    }

    public AbstractC0042h(boolean z10) {
        this.f77a = z10;
    }

    /* JADX INFO: renamed from: a3.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC0037e0 m152a() {
            return AbstractC0042h.f72c;
        }

        /* JADX INFO: renamed from: b */
        public final C0058v m153b() {
            return AbstractC0042h.f75f;
        }

        /* JADX INFO: renamed from: c */
        public final C0058v m154c() {
            return AbstractC0042h.f73d;
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC0042h(boolean z10, AbstractC1043k abstractC1043k) {
        this(z10);
    }
}
