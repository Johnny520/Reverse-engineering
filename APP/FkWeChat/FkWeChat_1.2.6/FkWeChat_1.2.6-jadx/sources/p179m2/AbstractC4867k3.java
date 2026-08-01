package p179m2;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p055e.AbstractC1960a;
import p166l2.InterfaceC4577p1;
import p172l8.C4700i0;

/* JADX INFO: renamed from: m2.k3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4867k3 extends View implements InterfaceC4577p1 {

    /* JADX INFO: renamed from: q */
    public static final c f14486q = new c(null);

    /* JADX INFO: renamed from: r */
    public static final int f14487r = 8;

    /* JADX INFO: renamed from: s */
    public static final InterfaceC0188p f14488s = b.f14491r;

    /* JADX INFO: renamed from: t */
    public static final ViewOutlineProvider f14489t = new a();

    /* JADX INFO: renamed from: u */
    public static boolean f14490u;

    /* JADX INFO: renamed from: m2.k3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            view.getClass();
            AbstractC1960a.m7104a(view);
            AbstractC1960a.m7104a(view);
            AbstractC4867k3.m19427m(null);
            throw null;
        }
    }

    /* JADX INFO: renamed from: m2.k3$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public static final b f14491r = new b();

        public b() {
            super(2);
        }

        /* JADX INFO: renamed from: a */
        public final void m19429a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m19429a((View) obj, (Matrix) obj2);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AbstractC4896q2 m19427m(AbstractC4867k3 abstractC4867k3) {
        throw null;
    }

    /* JADX INFO: renamed from: m2.k3$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {
        public /* synthetic */ c(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m19430a() {
            return AbstractC4867k3.f14490u;
        }

        public c() {
        }
    }
}
