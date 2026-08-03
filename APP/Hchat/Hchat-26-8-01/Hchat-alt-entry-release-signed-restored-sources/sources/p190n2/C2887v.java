package p190n2;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0119x;
import be.AbstractC0283h;
import gg.AbstractC1416l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import p002a1.RunnableC0003a;
import p015b0.C0153s;
import p020b5.C0184c;
import p020b5.C0192k;
import p041d1.C0655c0;
import p057e1.C0808c;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p117i0.C1815c;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p129ig.AbstractC2043a;
import p131j0.C2046b;
import p276sf.EnumC3957d;
import p321w.C4642w;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: n2.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2887v implements InterfaceC2879n {

    /* JADX INFO: renamed from: a */
    public final View f9326a;

    /* JADX INFO: renamed from: b */
    public final C0184c f9327b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC2888w f9328c;

    /* JADX INFO: renamed from: d */
    public boolean f9329d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1231l f9330e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1231l f9331f;

    /* JADX INFO: renamed from: g */
    public C2884s f9332g;

    /* JADX INFO: renamed from: h */
    public C2875j f9333h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f9334i;

    /* JADX INFO: renamed from: j */
    public final Object f9335j;

    /* JADX INFO: renamed from: k */
    public Rect f9336k;

    /* JADX INFO: renamed from: l */
    public final C2868c f9337l;

    /* JADX INFO: renamed from: m */
    public final C2046b f9338m;

    /* JADX INFO: renamed from: n */
    public RunnableC0003a f9339n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2887v(View view, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t) {
        C0184c c0184c = new C0184c();
        c0184c.f469a = view;
        c0184c.f470b = AbstractC0283h.m1127G(EnumC3957d.f12959h, new C0655c0(c0184c, 10));
        c0184c.f471c = new C0119x(view);
        ExecutorC2888w executorC2888w = new ExecutorC2888w(Choreographer.getInstance());
        this.f9326a = view;
        this.f9327b = c0184c;
        this.f9328c = executorC2888w;
        this.f9330e = C2867b.f9264j;
        this.f9331f = C2867b.f9265k;
        this.f9332g = new C2884s(4, HttpUrl.FRAGMENT_ENCODE_SET, C1939m0.f6573b);
        this.f9333h = C2875j.f9292g;
        this.f9334i = new ArrayList();
        this.f9335j = AbstractC0283h.m1127G(EnumC3957d.f12959h, new C0655c0(this, 11));
        this.f9337l = new C2868c(viewTreeObserverOnGlobalLayoutListenerC5934t, c0184c);
        this.f9338m = new C2046b(new EnumC2886u[16]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: a */
    public final void mo2394a(C2884s c2884s, C2875j c2875j, C0153s c0153s, C4642w c4642w) {
        this.f9329d = true;
        this.f9332g = c2884s;
        this.f9333h = c2875j;
        this.f9330e = c0153s;
        this.f9331f = c4642w;
        m6291i(EnumC2886u.f9321g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: b */
    public final void mo2395b() {
        m6291i(EnumC2886u.f9321g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: c */
    public final void mo2396c() {
        m6291i(EnumC2886u.f9323i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: d */
    public final void mo2397d() {
        this.f9329d = false;
        this.f9330e = C2867b.f9266l;
        this.f9331f = C2867b.f9267m;
        this.f9336k = null;
        m6291i(EnumC2886u.f9322h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, sf.c] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, sf.c] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, sf.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, sf.c] */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: e */
    public final void mo2398e(C2884s c2884s, C2884s c2884s2) {
        boolean z9 = (C1939m0.m4812b(this.f9332g.f9317b, c2884s2.f9317b) && AbstractC1416l.m3825a(this.f9332g.f9318c, c2884s2.f9318c)) ? false : true;
        this.f9332g = c2884s2;
        int size = this.f9334i.size();
        for (int i9 = 0; i9 < size; i9++) {
            InputConnectionC2880o inputConnectionC2880o = (InputConnectionC2880o) ((WeakReference) this.f9334i.get(i9)).get();
            if (inputConnectionC2880o != null) {
                inputConnectionC2880o.f9305d = c2884s2;
            }
        }
        C2868c c2868c = this.f9337l;
        synchronized (c2868c.f9271c) {
            c2868c.f9278j = null;
            c2868c.f9280l = null;
            c2868c.f9279k = null;
            c2868c.f9281m = C2867b.f9262h;
            c2868c.f9282n = null;
            c2868c.f9283o = null;
        }
        if (AbstractC1416l.m3825a(c2884s, c2884s2)) {
            if (z9) {
                C0184c c0184c = this.f9327b;
                int iM4816f = C1939m0.m4816f(c2884s2.f9317b);
                int iM4815e = C1939m0.m4815e(c2884s2.f9317b);
                C1939m0 c1939m0 = this.f9332g.f9318c;
                int iM4816f2 = c1939m0 != null ? C1939m0.m4816f(c1939m0.f6575a) : -1;
                C1939m0 c1939m02 = this.f9332g.f9318c;
                ((InputMethodManager) c0184c.f470b.getValue()).updateSelection((View) c0184c.f469a, iM4816f, iM4815e, iM4816f2, c1939m02 != null ? C1939m0.m4815e(c1939m02.f6575a) : -1);
                return;
            }
            return;
        }
        if (c2884s != null && (!AbstractC1416l.m3825a(c2884s.f9316a.f6529h, c2884s2.f9316a.f6529h) || (C1939m0.m4812b(c2884s.f9317b, c2884s2.f9317b) && !AbstractC1416l.m3825a(c2884s.f9318c, c2884s2.f9318c)))) {
            C0184c c0184c2 = this.f9327b;
            ((InputMethodManager) c0184c2.f470b.getValue()).restartInput((View) c0184c2.f469a);
            return;
        }
        int size2 = this.f9334i.size();
        for (int i10 = 0; i10 < size2; i10++) {
            InputConnectionC2880o inputConnectionC2880o2 = (InputConnectionC2880o) ((WeakReference) this.f9334i.get(i10)).get();
            if (inputConnectionC2880o2 != null) {
                C2884s c2884s3 = this.f9332g;
                C0184c c0184c3 = this.f9327b;
                if (inputConnectionC2880o2.f9309h) {
                    inputConnectionC2880o2.f9305d = c2884s3;
                    if (inputConnectionC2880o2.f9307f) {
                        ((InputMethodManager) c0184c3.f470b.getValue()).updateExtractedText((View) c0184c3.f469a, inputConnectionC2880o2.f9306e, AbstractC1184v0.m3187N(c2884s3));
                    }
                    C1939m0 c1939m03 = c2884s3.f9318c;
                    long j3 = c2884s3.f9317b;
                    int iM4816f3 = c1939m03 != null ? C1939m0.m4816f(c1939m03.f6575a) : -1;
                    C1939m0 c1939m04 = c2884s3.f9318c;
                    ((InputMethodManager) c0184c3.f470b.getValue()).updateSelection((View) c0184c3.f469a, C1939m0.m4816f(j3), C1939m0.m4815e(j3), iM4816f3, c1939m04 != null ? C1939m0.m4815e(c1939m04.f6575a) : -1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: f */
    public final void mo2399f() {
        m6291i(EnumC2886u.f9324j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: g */
    public final void mo2400g(C2884s c2884s, C0192k c0192k, C1935k0 c1935k0, C1815c c1815c, C0808c c0808c, C0808c c0808c2) {
        C2868c c2868c = this.f9337l;
        synchronized (c2868c.f9271c) {
            try {
                c2868c.f9278j = c2884s;
                c2868c.f9280l = c0192k;
                c2868c.f9279k = c1935k0;
                c2868c.f9281m = c1815c;
                c2868c.f9282n = c0808c;
                c2868c.f9283o = c0808c2;
                if (c2868c.f9273e || c2868c.f9272d) {
                    c2868c.m6284a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2879n
    /* JADX INFO: renamed from: h */
    public final void mo2401h(C0808c c0808c) {
        Rect rect;
        this.f9336k = new Rect(AbstractC2043a.m5018X(c0808c.f2416a), AbstractC2043a.m5018X(c0808c.f2417b), AbstractC2043a.m5018X(c0808c.f2418c), AbstractC2043a.m5018X(c0808c.f2419d));
        if (!this.f9334i.isEmpty() || (rect = this.f9336k) == null) {
            return;
        }
        this.f9326a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m6291i(EnumC2886u enumC2886u) {
        this.f9338m.m5056b(enumC2886u);
        if (this.f9339n == null) {
            RunnableC0003a runnableC0003a = new RunnableC0003a(this, 25);
            this.f9328c.execute(runnableC0003a);
            this.f9339n = runnableC0003a;
        }
    }
}
