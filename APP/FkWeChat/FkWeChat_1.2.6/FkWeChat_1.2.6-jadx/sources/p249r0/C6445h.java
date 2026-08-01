package p249r0;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p049d9.AbstractC1927c;
import p248r.InterfaceC6436l;
import p250r1.C6455e;
import p250r1.C6461k;

/* JADX INFO: renamed from: r0.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6445h extends View {

    /* JADX INFO: renamed from: v */
    public static final a f20264v = new a(null);

    /* JADX INFO: renamed from: w */
    public static final int f20265w = 8;

    /* JADX INFO: renamed from: x */
    public static final int[] f20266x = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: y */
    public static final int[] f20267y = new int[0];

    /* JADX INFO: renamed from: q */
    public C6450m f20268q;

    /* JADX INFO: renamed from: r */
    public Boolean f20269r;

    /* JADX INFO: renamed from: s */
    public Long f20270s;

    /* JADX INFO: renamed from: t */
    public Runnable f20271t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0173a f20272u;

    public C6445h(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static void m25490a(C6445h c6445h) {
        C6450m c6450m = c6445h.f20268q;
        if (c6450m != null) {
            c6450m.setState(f20267y);
        }
        c6445h.f20271t = null;
    }

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f20271t;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f20270s;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f20266x : f20267y;
            C6450m c6450m = this.f20268q;
            if (c6450m != null) {
                c6450m.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: r0.g
                @Override // java.lang.Runnable
                public final void run() {
                    C6445h.m25490a(this.f20263q);
                }
            };
            this.f20271t = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f20270s = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: renamed from: b */
    public final void m25491b(InterfaceC6436l.b bVar, boolean z10, long j10, int i10, long j11, float f10, InterfaceC0173a interfaceC0173a) {
        if (this.f20268q == null || !AbstractC1061t.m3842c(Boolean.valueOf(z10), this.f20269r)) {
            m25492c(z10);
            this.f20269r = Boolean.valueOf(z10);
        }
        C6450m c6450m = this.f20268q;
        c6450m.getClass();
        this.f20272u = interfaceC0173a;
        m25495f(j10, i10, j11, f10);
        if (z10) {
            c6450m.setHotspot(C6455e.m25559m(bVar.m25468a()), C6455e.m25560n(bVar.m25468a()));
        } else {
            c6450m.setHotspot(c6450m.getBounds().centerX(), c6450m.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m25492c(boolean z10) {
        C6450m c6450m = new C6450m(z10);
        setBackground(c6450m);
        this.f20268q = c6450m;
    }

    /* JADX INFO: renamed from: d */
    public final void m25493d() {
        this.f20272u = null;
        Runnable runnable = this.f20271t;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f20271t;
            runnable2.getClass();
            runnable2.run();
        } else {
            C6450m c6450m = this.f20268q;
            if (c6450m != null) {
                c6450m.setState(f20267y);
            }
        }
        C6450m c6450m2 = this.f20268q;
        if (c6450m2 == null) {
            return;
        }
        c6450m2.setVisible(false, false);
        unscheduleDrawable(c6450m2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m25493d();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m25494e() {
        setRippleState(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m25495f(long j10, int i10, long j11, float f10) {
        C6450m c6450m = this.f20268q;
        if (c6450m == null) {
            return;
        }
        c6450m.m25524c(i10);
        c6450m.m25523b(j11, f10);
        Rect rect = new Rect(0, 0, AbstractC1927c.m6980d(C6461k.m25621i(j10)), AbstractC1927c.m6980d(C6461k.m25619g(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c6450m.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        InterfaceC0173a interfaceC0173a = this.f20272u;
        if (interfaceC0173a != null) {
            interfaceC0173a.invoke();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: r0.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
