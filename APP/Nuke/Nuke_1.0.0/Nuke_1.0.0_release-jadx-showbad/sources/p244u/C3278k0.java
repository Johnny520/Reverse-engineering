package p244u;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import me.dartcv.nuke.R;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p158f0.AbstractC2082n;
import p186k.C2409F;
import p205n1.C2688b;
import p211o0.C2750i;
import p229r1.AbstractC3069c;
import p229r1.AbstractC3087q;
import p229r1.AbstractC3088r;
import p229r1.AbstractC3092v;
import p229r1.C3064Z;
import p229r1.C3070c0;
import p229r1.C3071d;

/* JADX INFO: renamed from: u.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3278k0 {

    /* JADX INFO: renamed from: v */
    public static final WeakHashMap f10118v = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C3257a f10119a;

    /* JADX INFO: renamed from: b */
    public final C3257a f10120b;

    /* JADX INFO: renamed from: c */
    public final C3257a f10121c;

    /* JADX INFO: renamed from: d */
    public final C3257a f10122d;

    /* JADX INFO: renamed from: e */
    public final C3257a f10123e;

    /* JADX INFO: renamed from: f */
    public final C3257a f10124f;

    /* JADX INFO: renamed from: g */
    public final C3257a f10125g;

    /* JADX INFO: renamed from: h */
    public final C3257a f10126h;

    /* JADX INFO: renamed from: i */
    public final C3257a f10127i;

    /* JADX INFO: renamed from: j */
    public final C3274i0 f10128j;

    /* JADX INFO: renamed from: k */
    public final C1366i0 f10129k;

    /* JADX INFO: renamed from: l */
    public final C3274i0 f10130l;

    /* JADX INFO: renamed from: m */
    public final C3274i0 f10131m;

    /* JADX INFO: renamed from: n */
    public final C3274i0 f10132n;

    /* JADX INFO: renamed from: o */
    public final C3274i0 f10133o;

    /* JADX INFO: renamed from: p */
    public final C3274i0 f10134p;

    /* JADX INFO: renamed from: q */
    public final C3274i0 f10135q;

    /* JADX INFO: renamed from: r */
    public final C3274i0 f10136r;

    /* JADX INFO: renamed from: s */
    public final boolean f10137s;

    /* JADX INFO: renamed from: t */
    public int f10138t;

    /* JADX INFO: renamed from: u */
    public final RunnableC3237F f10139u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3278k0(View view) {
        C3257a c3257aM5508c = C3259b.m5508c("captionBar", 4);
        this.f10119a = c3257aM5508c;
        C3257a c3257aM5508c2 = C3259b.m5508c("displayCutout", 128);
        this.f10120b = c3257aM5508c2;
        C3257a c3257aM5508c3 = C3259b.m5508c("ime", 8);
        this.f10121c = c3257aM5508c3;
        C3257a c3257aM5508c4 = C3259b.m5508c("mandatorySystemGestures", 32);
        this.f10122d = c3257aM5508c4;
        C3257a c3257aM5508c5 = C3259b.m5508c("navigationBars", 2);
        this.f10123e = c3257aM5508c5;
        C3257a c3257aM5508c6 = C3259b.m5508c("statusBars", 1);
        this.f10124f = c3257aM5508c6;
        C3257a c3257aM5508c7 = C3259b.m5508c("systemBars", 519);
        this.f10125g = c3257aM5508c7;
        C3257a c3257aM5508c8 = C3259b.m5508c("systemGestures", 16);
        this.f10126h = c3257aM5508c8;
        C3257a c3257aM5508c9 = C3259b.m5508c("tappableElement", 64);
        this.f10127i = c3257aM5508c9;
        C3274i0 c3274i0 = new C3274i0(new C3240I(0, 0, 0, 0), "waterfall");
        this.f10128j = c3274i0;
        this.f10129k = AbstractC1385s.m2629s(null);
        new C3268f0(new C3268f0(c3257aM5508c7, c3257aM5508c3), c3257aM5508c2);
        new C3268f0(new C3268f0(new C3268f0(c3257aM5508c9, c3257aM5508c4), c3257aM5508c8), c3274i0);
        this.f10130l = C3259b.m5509d("captionBarIgnoringVisibility", 4);
        this.f10131m = C3259b.m5509d("navigationBarsIgnoringVisibility", 2);
        this.f10132n = C3259b.m5509d("statusBarsIgnoringVisibility", 1);
        this.f10133o = C3259b.m5509d("systemBarsIgnoringVisibility", 519);
        this.f10134p = C3259b.m5509d("tappableElementIgnoringVisibility", 64);
        this.f10135q = new C3274i0(new C3240I(0, 0, 0, 0), "imeAnimationTarget");
        this.f10136r = new C3274i0(new C3240I(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f10137s = bool != null ? bool.booleanValue() : false;
        this.f10139u = new RunnableC3237F(this);
        int i5 = AbstractC3092v.f9811a;
        C3070c0 c3070c0M5401a = AbstractC3088r.m5401a(view);
        if (c3070c0M5401a != null) {
            C3064Z c3064z = c3070c0M5401a.f9782a;
            c3257aM5508c.m5506f(c3064z.mo5374u(4));
            c3257aM5508c2.m5506f(c3064z.mo5374u(128));
            c3257aM5508c3.m5506f(c3064z.mo5374u(8));
            c3257aM5508c4.m5506f(c3064z.mo5374u(32));
            c3257aM5508c5.m5506f(c3064z.mo5374u(2));
            c3257aM5508c6.m5506f(c3064z.mo5374u(1));
            c3257aM5508c7.m5506f(c3064z.mo5374u(519));
            c3257aM5508c8.m5506f(c3064z.mo5374u(16));
            c3257aM5508c9.m5506f(c3064z.mo5374u(64));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m5556b(C3278k0 c3278k0, C3070c0 c3070c0) {
        boolean z5 = false;
        c3278k0.f10119a.m5507g(c3070c0, 0);
        c3278k0.f10121c.m5507g(c3070c0, 0);
        c3278k0.f10120b.m5507g(c3070c0, 0);
        c3278k0.f10123e.m5507g(c3070c0, 0);
        c3278k0.f10124f.m5507g(c3070c0, 0);
        c3278k0.f10125g.m5507g(c3070c0, 0);
        c3278k0.f10126h.m5507g(c3070c0, 0);
        c3278k0.f10127i.m5507g(c3070c0, 0);
        c3278k0.f10122d.m5507g(c3070c0, 0);
        c3278k0.f10130l.m5551f(AbstractC3261c.m5537x(c3070c0.f9782a.mo5368j(4)));
        c3278k0.f10131m.m5551f(AbstractC3261c.m5537x(c3070c0.f9782a.mo5368j(2)));
        c3278k0.f10132n.m5551f(AbstractC3261c.m5537x(c3070c0.f9782a.mo5368j(1)));
        c3278k0.f10133o.m5551f(AbstractC3261c.m5537x(c3070c0.f9782a.mo5368j(519)));
        c3278k0.f10134p.m5551f(AbstractC3261c.m5537x(c3070c0.f9782a.mo5368j(64)));
        C3071d c3071dMo5385h = c3070c0.f9782a.mo5385h();
        c3278k0.f10128j.m5551f(AbstractC3261c.m5537x(c3071dMo5385h != null ? c3071dMo5385h.m5395a() : C2688b.f8571e));
        C2750i c2750i = null;
        if (c3071dMo5385h != null) {
            Path pathM5391a = Build.VERSION.SDK_INT >= 31 ? AbstractC3069c.m5391a(c3071dMo5385h.f9783a) : null;
            if (pathM5391a != null) {
                c2750i = new C2750i(pathM5391a);
            }
        }
        c3278k0.f10129k.setValue(c2750i);
        synchronized (AbstractC2082n.f6972c) {
            C2409F c2409f = AbstractC2082n.f6979j.f6933h;
            if (c2409f != null) {
                if (c2409f.m4286h()) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            AbstractC2082n.m3825a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5557a(View view) {
        if (this.f10138t == 0) {
            int i5 = AbstractC3092v.f9811a;
            RunnableC3237F runnableC3237F = this.f10139u;
            AbstractC3087q.m5400b(view, runnableC3237F);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC3237F);
            AbstractC3092v.m5409c(view, runnableC3237F);
        }
        this.f10138t++;
    }
}
