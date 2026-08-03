package p017J;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.reflect.Field;
import p001A0.RunnableC0019E;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: J.g */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0218g implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    public static final int f444r = 0;

    /* JADX INFO: renamed from: a */
    public final C0212a f445a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f446b;

    /* JADX INFO: renamed from: c */
    public final View f447c;

    /* JADX INFO: renamed from: d */
    public RunnableC0019E f448d;

    /* JADX INFO: renamed from: e */
    public final float[] f449e;

    /* JADX INFO: renamed from: f */
    public final float[] f450f;

    /* JADX INFO: renamed from: g */
    public final int f451g;

    /* JADX INFO: renamed from: h */
    public final int f452h;

    /* JADX INFO: renamed from: i */
    public final float[] f453i;

    /* JADX INFO: renamed from: j */
    public final float[] f454j;

    /* JADX INFO: renamed from: k */
    public final float[] f455k;

    /* JADX INFO: renamed from: l */
    public boolean f456l;

    /* JADX INFO: renamed from: m */
    public boolean f457m;

    /* JADX INFO: renamed from: n */
    public boolean f458n;

    /* JADX INFO: renamed from: o */
    public boolean f459o;

    /* JADX INFO: renamed from: p */
    public boolean f460p;

    /* JADX INFO: renamed from: q */
    public final ListView f461q;

    static {
        f444r = ViewConfiguration.getTapTimeout();
    }

    public ViewOnTouchListenerC0218g(ListView r13) {
        C0212a r1 = new C0212a();
        r1.f439e = Long.MIN_VALUE;
        r1.f441g = -1;
        r1.f440f = 0;
        this.f445a = r1;
        this.f446b = new AccelerateInterpolator();
        float[] r2 = {0.0f, 0.0f};
        this.f449e = r2;
        float[] r4 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f450f = r4;
        float[] r5 = {0.0f, 0.0f};
        this.f453i = r5;
        float[] r6 = {0.0f, 0.0f};
        this.f454j = r6;
        float[] r02 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f455k = r02;
        this.f447c = r13;
        float r8 = ((int) ((1575.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f)) / 1000.0f;
        r02[0] = r8;
        r02[1] = r8;
        float r03 = ((int) ((r7 * 315.0f) + 0.5f)) / 1000.0f;
        r6[0] = r03;
        r6[1] = r03;
        this.f451g = 1;
        r4[0] = Float.MAX_VALUE;
        r4[1] = Float.MAX_VALUE;
        r2[0] = 0.2f;
        r2[1] = 0.2f;
        r5[0] = 0.001f;
        r5[1] = 0.001f;
        this.f452h = f444r;
        r1.f435a = 500;
        r1.f436b = 500;
        this.f461q = r13;
    }

    /* JADX INFO: renamed from: b */
    public static float m606b(float r1, float r2, float r3) {
        if (r1 <= r3) goto L6;
        return r3;
    L6:
        if (r1 >= r2) goto L8;
        return r2;
    L8:
        return r1;
    }

    /* JADX INFO: renamed from: a */
    public final float m607a(int r4, float r5, float r6, float r7) {
        float r02 = m606b(this.f449e[r4] * r6, 0.0f, this.f450f[r4]);
        float r52 = m608c(r6 - r5, r02) - m608c(r5, r02);
        AccelerateInterpolator r03 = this.f446b;
        if (r52 >= 0.0f) goto L6;
        float r53 = -r03.getInterpolation(-r52);
    L8:
        float r54 = m606b(r53, -1.0f, 1.0f);
    L11:
        if (r54 != 0.0f) goto L13;
        return 0.0f;
    L13:
        float r04 = this.f453i[r4];
        float r1 = this.f454j[r4];
        float r42 = this.f455k[r4];
        float r05 = r04 * r7;
        if (r54 <= 0.0f) goto L18;
        return m606b(r54 * r05, r1, r42);
    L18:
        return -m606b((-r54) * r05, r1, r42);
    L6:
        if (r52 <= 0.0f) goto L9;
        r53 = r03.getInterpolation(r52);
        goto L8
    L9:
        r54 = 0.0f;
        goto L11
    }

    /* JADX INFO: renamed from: c */
    public final float m608c(float r6, float r7) {
        if (r7 != 0.0f) goto L5;
        return 0.0f;
    L5:
        int r1 = this.f451g;
        if (r1 == 0) goto L16;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L12;
    L25:
        return 0.0f;
    L12:
        if (r6 >= 0.0f) goto L25;
        return r6 / (-r7);
    L16:
        if (r6 >= r7) goto L25;
        if (r6 < 0.0f) goto L22;
        return 1.0f - (r6 / r7);
    L22:
        if (this.f459o == false) goto L25;
        if (r1 != 1) goto L25;
        return 1.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m609d() {
        int r1 = 0;
        if (this.f457m == false) goto L5;
        this.f459o = false;
        return;
    L5:
        C0212a r02 = this.f445a;
        r02.getClass();
        long r2 = AnimationUtils.currentAnimationTimeMillis();
        int r4 = (int) (r2 - r02.f439e);
        int r5 = r02.f436b;
        if (r4 <= r5) goto L8;
        r1 = r5;
    L11:
        r02.f443i = r1;
        r02.f442h = r02.m592a(r2);
        r02.f441g = r2;
        return;
    L8:
        if (r4 < 0) goto L11;
        r1 = r4;
        goto L11
    }

    /* JADX INFO: renamed from: e */
    public final boolean m610e() {
        C0212a r02 = this.f445a;
        float r1 = r02.f438d;
        int r12 = (int) (r1 / Math.abs(r1));
        Math.abs(r02.f437c);
        if (r12 == 0) goto L20;
        ListView r2 = this.f461q;
        int r3 = r2.getCount();
        if (r3 == 0) goto L22;
        int r4 = r2.getChildCount();
        int r5 = r2.getFirstVisiblePosition();
        int r6 = r5 + r4;
        if (r12 <= 0) goto L13;
        if (r6 < r3) goto L19;
        if (r2.getChildAt(r4 - 1).getBottom() > r2.getHeight()) goto L19;
        return false;
    L19:
        return true;
    L13:
        if (r12 >= 0) goto L21;
        if (r5 > 0) goto L19;
        if (r2.getChildAt(0).getTop() < 0) goto L19;
        return false;
    L21:
        return false;
    L22:
        return false;
    L20:
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r8, MotionEvent r9) {
        int r02 = 1;
        if (this.f460p == true) goto L5;
        return false;
    L5:
        int r1 = r9.getActionMasked();
        if (r1 == 0) goto L14;
        if (r1 != 1) goto L9;
    L13:
        m609d();
    L29:
        return false;
    L9:
        if (r1 != 2) goto L11;
    L15:
        float r12 = r9.getX();
        float r3 = r8.getWidth();
        View r4 = this.f447c;
        float r13 = m607a(0, r12, r3, r4.getWidth());
        float r82 = m607a(1, r9.getY(), r8.getHeight(), r4.getHeight());
        C0212a r92 = this.f445a;
        r92.f437c = r13;
        r92.f438d = r82;
        if (this.f459o == true) goto L29;
        if (m610e() == false) goto L29;
        if (this.f448d != null) goto L22;
        this.f448d = new RunnableC0019E(r02, this);
    L22:
        this.f459o = true;
        this.f457m = true;
        if (this.f456l == true) goto L27;
        int r83 = this.f452h;
        if (r83 <= 0) goto L27;
        RunnableC0019E r93 = this.f448d;
        long r5 = r83;
        Field r84 = AbstractC0080Q.f219a;
        r4.postOnAnimationDelayed(r93, r5);
    L28:
        this.f456l = true;
    L27:
        this.f448d.run();
        goto L28
    L11:
        if (r1 == 3) goto L13;
    L14:
        this.f458n = true;
        this.f456l = false;
        goto L15
    }
}
