package p222p;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import p018b3.C0171a;
import p069f.C0945l0;
import p071f1.C1009j;
import p091g3.AbstractC1301c;
import p091g3.AbstractC1321m;
import p091g3.AbstractC1323n;
import p091g3.AbstractC1329q;
import p091g3.C1303d;
import p091g3.C1324n0;
import p091g3.C1332r0;
import p099h.Hchat.R;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p322w0.AbstractC4662m;

/* JADX INFO: renamed from: p.s1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3255s1 {

    /* JADX INFO: renamed from: v */
    public static final WeakHashMap f10360v = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C3202b f10361a;

    /* JADX INFO: renamed from: b */
    public final C3202b f10362b;

    /* JADX INFO: renamed from: c */
    public final C3202b f10363c;

    /* JADX INFO: renamed from: d */
    public final C3202b f10364d;

    /* JADX INFO: renamed from: e */
    public final C3202b f10365e;

    /* JADX INFO: renamed from: f */
    public final C3202b f10366f;

    /* JADX INFO: renamed from: g */
    public final C3202b f10367g;

    /* JADX INFO: renamed from: h */
    public final C3202b f10368h;

    /* JADX INFO: renamed from: i */
    public final C3202b f10369i;

    /* JADX INFO: renamed from: j */
    public final C3243o1 f10370j;

    /* JADX INFO: renamed from: k */
    public final C1845j1 f10371k;

    /* JADX INFO: renamed from: l */
    public final C3243o1 f10372l;

    /* JADX INFO: renamed from: m */
    public final C3243o1 f10373m;

    /* JADX INFO: renamed from: n */
    public final C3243o1 f10374n;

    /* JADX INFO: renamed from: o */
    public final C3243o1 f10375o;

    /* JADX INFO: renamed from: p */
    public final C3243o1 f10376p;

    /* JADX INFO: renamed from: q */
    public final C3243o1 f10377q;

    /* JADX INFO: renamed from: r */
    public final C3243o1 f10378r;

    /* JADX INFO: renamed from: s */
    public final boolean f10379s;

    /* JADX INFO: renamed from: t */
    public int f10380t;

    /* JADX INFO: renamed from: u */
    public final RunnableC3215f0 f10381u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3255s1(View view) {
        C3202b c3202bM6866c = C3205c.m6866c(4, "captionBar");
        this.f10361a = c3202bM6866c;
        C3202b c3202bM6866c2 = C3205c.m6866c(128, "displayCutout");
        this.f10362b = c3202bM6866c2;
        C3202b c3202bM6866c3 = C3205c.m6866c(8, "ime");
        this.f10363c = c3202bM6866c3;
        C3202b c3202bM6866c4 = C3205c.m6866c(32, "mandatorySystemGestures");
        this.f10364d = c3202bM6866c4;
        C3202b c3202bM6866c5 = C3205c.m6866c(2, "navigationBars");
        this.f10365e = c3202bM6866c5;
        C3202b c3202bM6866c6 = C3205c.m6866c(1, "statusBars");
        this.f10366f = c3202bM6866c6;
        C3202b c3202bM6866c7 = C3205c.m6866c(519, "systemBars");
        this.f10367g = c3202bM6866c7;
        C3202b c3202bM6866c8 = C3205c.m6866c(16, "systemGestures");
        this.f10368h = c3202bM6866c8;
        C3202b c3202bM6866c9 = C3205c.m6866c(64, "tappableElement");
        this.f10369i = c3202bM6866c9;
        C3243o1 c3243o1 = new C3243o1(new C3230k0(0, 0, 0, 0), "waterfall");
        this.f10370j = c3243o1;
        this.f10371k = AbstractC1874r.m4639u(null);
        new C3234l1(new C3234l1(new C3234l1(c3202bM6866c7, c3202bM6866c3), c3202bM6866c2), new C3234l1(new C3234l1(new C3234l1(c3202bM6866c9, c3202bM6866c4), c3202bM6866c8), c3243o1));
        this.f10372l = C3205c.m6867d(4, "captionBarIgnoringVisibility");
        this.f10373m = C3205c.m6867d(2, "navigationBarsIgnoringVisibility");
        this.f10374n = C3205c.m6867d(1, "statusBarsIgnoringVisibility");
        this.f10375o = C3205c.m6867d(519, "systemBarsIgnoringVisibility");
        this.f10376p = C3205c.m6867d(64, "tappableElementIgnoringVisibility");
        this.f10377q = new C3243o1(new C3230k0(0, 0, 0, 0), "imeAnimationTarget");
        this.f10378r = new C3243o1(new C3230k0(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f10379s = bool != null ? bool.booleanValue() : false;
        this.f10381u = new RunnableC3215f0(this);
        int i9 = AbstractC1329q.f4395a;
        C1332r0 c1332r0M3525a = AbstractC1323n.m3525a(view);
        if (c1332r0M3525a != null) {
            C1324n0 c1324n0 = c1332r0M3525a.f4398a;
            c3202bM6866c.m6859f(c1324n0.mo3506q(4));
            c3202bM6866c2.m6859f(c1324n0.mo3506q(128));
            c3202bM6866c3.m6859f(c1324n0.mo3506q(8));
            c3202bM6866c4.m6859f(c1324n0.mo3506q(32));
            c3202bM6866c5.m6859f(c1324n0.mo3506q(2));
            c3202bM6866c6.m6859f(c1324n0.mo3506q(1));
            c3202bM6866c7.m6859f(c1324n0.mo3506q(519));
            c3202bM6866c8.m6859f(c1324n0.mo3506q(16));
            c3202bM6866c9.m6859f(c1324n0.mo3506q(64));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m6936b(C3255s1 c3255s1, C1332r0 c1332r0) {
        boolean z9 = false;
        c3255s1.f10361a.m6860g(c1332r0, 0);
        c3255s1.f10363c.m6860g(c1332r0, 0);
        c3255s1.f10362b.m6860g(c1332r0, 0);
        c3255s1.f10365e.m6860g(c1332r0, 0);
        c3255s1.f10366f.m6860g(c1332r0, 0);
        c3255s1.f10367g.m6860g(c1332r0, 0);
        c3255s1.f10368h.m6860g(c1332r0, 0);
        c3255s1.f10369i.m6860g(c1332r0, 0);
        c3255s1.f10364d.m6860g(c1332r0, 0);
        c3255s1.f10372l.m6932f(AbstractC3208d.m6887q(c1332r0.f4398a.mo3502h(4)));
        c3255s1.f10373m.m6932f(AbstractC3208d.m6887q(c1332r0.f4398a.mo3502h(2)));
        c3255s1.f10374n.m6932f(AbstractC3208d.m6887q(c1332r0.f4398a.mo3502h(1)));
        c3255s1.f10375o.m6932f(AbstractC3208d.m6887q(c1332r0.f4398a.mo3502h(519)));
        c3255s1.f10376p.m6932f(AbstractC3208d.m6887q(c1332r0.f4398a.mo3502h(64)));
        C1303d c1303dMo3518f = c1332r0.f4398a.mo3518f();
        c3255s1.f10370j.m6932f(AbstractC3208d.m6887q(c1303dMo3518f != null ? c1303dMo3518f.m3456a() : C0171a.f444e));
        C1009j c1009j = null;
        if (c1303dMo3518f != null) {
            Path pathM3451a = Build.VERSION.SDK_INT >= 31 ? AbstractC1301c.m3451a(c1303dMo3518f.f4362a) : null;
            if (pathM3451a != null) {
                c1009j = new C1009j(pathM3451a);
            }
        }
        c3255s1.f10371k.setValue(c1009j);
        synchronized (AbstractC4662m.f15512c) {
            C0945l0 c0945l0 = AbstractC4662m.f15519j.f15477h;
            if (c0945l0 != null) {
                if (c0945l0.m2335h()) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            AbstractC4662m.m9120a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6937a(View view) {
        if (this.f10380t == 0) {
            int i9 = AbstractC1329q.f4395a;
            RunnableC3215f0 runnableC3215f0 = this.f10381u;
            AbstractC1321m.m3524b(view, runnableC3215f0);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC3215f0);
            AbstractC1329q.m3555b(view, runnableC3215f0);
        }
        this.f10380t++;
    }
}
