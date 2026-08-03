package p057g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.luckypray.dexkit.C1031R;
import p045Z.AbstractC0469a;
import p063j.AbstractC0959d;
import p063j.C0960e;
import p063j.C0967l;
import p082t.AbstractC1080a;
import p087w.AbstractC1111a;

/* JADX INFO: renamed from: g.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0933v0 {

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f3307f = null;

    /* JADX INFO: renamed from: g */
    public static C0933v0 f3308g;

    /* JADX INFO: renamed from: h */
    public static final C0931u0 f3309h = null;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f3310a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f3311b;

    /* JADX INFO: renamed from: c */
    public TypedValue f3312c;

    /* JADX INFO: renamed from: d */
    public boolean f3313d;

    /* JADX INFO: renamed from: e */
    public C0924r f3314e;

    static {
        f3307f = PorterDuff.Mode.SRC_IN;
        f3309h = new C0931u0(6);
    }

    public C0933v0() {
        this.f3311b = new WeakHashMap(0);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C0933v0 m2263c() {
        monitor-enter(C0933v0.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f3308g != null) goto L9;
        f3308g = new C0933v0();     // Catch: Throwable -> L7
    L9:
        C0933v0 r1 = f3308g;     // Catch: Throwable -> L7
        monitor-exit(C0933v0.class);
        return r1;
    }

    /* JADX INFO: renamed from: g */
    public static synchronized PorterDuffColorFilter m2264g(int r4, PorterDuff.Mode r5) {
        monitor-enter(C0933v0.class);
        C0931u0 r1 = f3309h;     // Catch: Throwable -> L8
        r1.getClass();     // Catch: Throwable -> L8
        int r3 = (31 + r4) * 31;     // Catch: Throwable -> L8
        PorterDuffColorFilter r2 = (PorterDuffColorFilter) r1.m2313a(Integer.valueOf(r5.hashCode() + r3));     // Catch: Throwable -> L8
        if (r2 != null) goto L10;
        r2 = new PorterDuffColorFilter(r4, r5);     // Catch: Throwable -> L8
        PorterDuffColorFilter r42 = (PorterDuffColorFilter) r1.m2314b(Integer.valueOf(r5.hashCode() + r3), r2);     // Catch: Throwable -> L8
    L10:
        monitor-exit(C0933v0.class);
        return r2;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2265a(Context r3, long r4, Drawable r6) {
        monitor-enter(this);
        Drawable.ConstantState r62 = r6.getConstantState();     // Catch: Throwable -> L8
        if (r62 == null) goto L13;
        C0960e r02 = (C0960e) this.f3311b.get(r3);     // Catch: Throwable -> L8
        if (r02 != null) goto L10;
        r02 = new C0960e();     // Catch: Throwable -> L8
        this.f3311b.put(r3, r02);     // Catch: Throwable -> L8
    L10:
        r02.m2310e(r4, new WeakReference(r62));     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L13:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m2266b(Context r6, int r7) {
        if (this.f3312c != null) goto L5;
        this.f3312c = new TypedValue();
    L5:
        TypedValue r02 = this.f3312c;
        r6.getResources().getValue(r7, r02, true);
        long r1 = (((long) r02.assetCookie) << 32) | ((long) r02.data);
        Drawable r3 = m2267d(r6, r1);
        if (r3 == null) goto L8;
        return r3;
    L8:
        LayerDrawable r4 = null;
        if (this.f3314e != null) goto L12;
    L23:
        if (r4 == null) goto L25;
        r4.setChangingConfigurations(r02.changingConfigurations);
        m2265a(r6, r1, r4);
    L25:
        return r4;
    L12:
        if (r7 != C1031R.drawable.abc_cab_background_top_material) goto L15;
        r4 = new LayerDrawable(new Drawable[]{m2268e(r6, C1031R.drawable.abc_cab_background_internal_bg), m2268e(r6, C1031R.drawable.abc_cab_background_top_mtrl_alpha)});
        goto L23
    L15:
        if (r7 != C1031R.drawable.abc_ratingbar_material) goto L18;
        r4 = C0924r.m2255c(this, r6, C1031R.dimen.abc_star_big);
        goto L23
    L18:
        if (r7 != C1031R.drawable.abc_ratingbar_indicator_material) goto L21;
        r4 = C0924r.m2255c(this, r6, C1031R.dimen.abc_star_medium);
        goto L23
    L21:
        if (r7 != C1031R.drawable.abc_ratingbar_small_material) goto L23;
        r4 = C0924r.m2255c(this, r6, C1031R.dimen.abc_star_small);
        goto L23
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m2267d(Context r4, long r5) {
        monitor-enter(this);
        C0960e r02 = (C0960e) this.f3311b.get(r4);     // Catch: Throwable -> L15
        if (r02 != null) goto L8;
        monitor-exit(this);
        return null;
    L8:
        WeakReference r2 = (WeakReference) r02.m2309d(r5, null);     // Catch: Throwable -> L15
        if (r2 == null) goto L22;
        Drawable.ConstantState r22 = (Drawable.ConstantState) r2.get();     // Catch: Throwable -> L15
        if (r22 == null) goto L17;
        Drawable r42 = r22.newDrawable(r4.getResources());     // Catch: Throwable -> L15
        monitor-exit(this);
        return r42;
    L17:
        int r43 = AbstractC0959d.m2305b(r02.f3406b, r02.f3408d, r5);     // Catch: Throwable -> L15
        if (r43 < 0) goto L22;
        Object[] r52 = r02.f3407c;     // Catch: Throwable -> L15
        Object r6 = r52[r43];     // Catch: Throwable -> L15
        Object r23 = C0960e.f3404e;     // Catch: Throwable -> L15
        if (r6 == r23) goto L22;
        r52[r43] = r23;     // Catch: Throwable -> L15
        r02.f3405a = true;     // Catch: Throwable -> L15
    L22:
        monitor-exit(this);
        return null;
    L15:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized Drawable m2268e(Context r1, int r2) {
        monitor-enter(this);
        Drawable r12 = m2269f(r1, r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r12;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized Drawable m2269f(Context r9, int r10) {
        monitor-enter(this);
    L42:
        th = move-exception;
        throw th;
    L4:
        if (this.f3313d == true) goto L12;
        this.f3313d = true;     // Catch: Throwable -> L42
        Drawable r02 = m2268e(r9, C1031R.drawable.abc_vector_test);     // Catch: Throwable -> L42
        if (r02 == null) goto L47;
        if ((r02 instanceof AbstractC0469a) == true) goto L12;
        if ("android.graphics.drawable.VectorDrawable".equals(r02.getClass().getName()) == true) goto L12;
    L47:
        this.f3313d = false;     // Catch: Throwable -> L42
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");     // Catch: Throwable -> L42
    L12:
        Drawable r03 = m2266b(r9, r10);     // Catch: Throwable -> L42
        if (r03 != null) goto L15;
        r03 = AbstractC1080a.m2560b(r9, r10);     // Catch: Throwable -> L42
    L15:
        if (r03 == null) goto L39;
        ColorStateList r1 = m2270h(r9, r10);     // Catch: Throwable -> L42
        if (r1 == null) goto L27;
        r03 = r03.mutate();     // Catch: Throwable -> L42
        AbstractC1111a.m2626h(r03, r1);     // Catch: Throwable -> L42
        PorterDuff.Mode r12 = null;
        if (this.f3314e != null) goto L22;
    L24:
        if (r12 == null) goto L39;
        AbstractC1111a.m2627i(r03, r12);     // Catch: Throwable -> L42
        goto L39
    L22:
        if (r10 != C1031R.drawable.abc_switch_thumb_material) goto L24;
        r12 = PorterDuff.Mode.MULTIPLY;     // Catch: Throwable -> L42
        goto L24
    L27:
        if (this.f3314e != null) goto L29;
    L38:
        m2271i(r9, r10, r03);     // Catch: Throwable -> L42
        goto L39
    L29:
        if (r10 != C1031R.drawable.abc_seekbar_track_material) goto L32;
        LayerDrawable r102 = (LayerDrawable) r03;     // Catch: Throwable -> L42
        Drawable r13 = r102.findDrawableByLayerId(R.id.background);     // Catch: Throwable -> L42
        int r4 = AbstractC0849A0.m2161c(r9, C1031R.attr.colorControlNormal);     // Catch: Throwable -> L42
        PorterDuff.Mode r7 = C0926s.f3289b;     // Catch: Throwable -> L42
        C0924r.m2256e(r13, r4);     // Catch: Throwable -> L42
        C0924r.m2256e(r102.findDrawableByLayerId(R.id.secondaryProgress), AbstractC0849A0.m2161c(r9, C1031R.attr.colorControlNormal));     // Catch: Throwable -> L42
        C0924r.m2256e(r102.findDrawableByLayerId(R.id.progress), AbstractC0849A0.m2161c(r9, C1031R.attr.colorControlActivated));     // Catch: Throwable -> L42
        goto L39
    L32:
        if (r10 != C1031R.drawable.abc_ratingbar_material) goto L34;
    L37:
        LayerDrawable r103 = (LayerDrawable) r03;     // Catch: Throwable -> L42
        Drawable r14 = r103.findDrawableByLayerId(R.id.background);     // Catch: Throwable -> L42
        int r42 = AbstractC0849A0.m2160b(r9, C1031R.attr.colorControlNormal);     // Catch: Throwable -> L42
        PorterDuff.Mode r6 = C0926s.f3289b;     // Catch: Throwable -> L42
        C0924r.m2256e(r14, r42);     // Catch: Throwable -> L42
        C0924r.m2256e(r103.findDrawableByLayerId(R.id.secondaryProgress), AbstractC0849A0.m2161c(r9, C1031R.attr.colorControlActivated));     // Catch: Throwable -> L42
        C0924r.m2256e(r103.findDrawableByLayerId(R.id.progress), AbstractC0849A0.m2161c(r9, C1031R.attr.colorControlActivated));     // Catch: Throwable -> L42
        goto L39
    L34:
        if (r10 == C1031R.drawable.abc_ratingbar_indicator_material) goto L37;
        if (r10 != C1031R.drawable.abc_ratingbar_small_material) goto L38;
    L39:
        if (r03 == null) goto L44;
        AbstractC0886W.m2219a(r03);     // Catch: Throwable -> L42
    L44:
        monitor-exit(this);
        return r03;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized ColorStateList m2270h(Context r4, int r5) {
        monitor-enter(this);
        WeakHashMap r02 = this.f3310a;     // Catch: Throwable -> L23
        ColorStateList r1 = null;
        if (r02 == null) goto L8;
        C0967l r03 = (C0967l) r02.get(r4);     // Catch: Throwable -> L23
        if (r03 == null) goto L8;
        ColorStateList r04 = (ColorStateList) r03.m2327c(r5, null);     // Catch: Throwable -> L23
    L9:
        if (r04 != null) goto L25;
        C0924r r05 = this.f3314e;     // Catch: Throwable -> L23
        if (r05 == null) goto L14;
        r1 = r05.m2257d(r4, r5);     // Catch: Throwable -> L23
    L14:
        if (r1 != null) goto L16;
    L22:
        r04 = r1;
        goto L25
    L16:
        if (this.f3310a != null) goto L18;
        this.f3310a = new WeakHashMap();     // Catch: Throwable -> L23
    L18:
        C0967l r06 = (C0967l) this.f3310a.get(r4);     // Catch: Throwable -> L23
        if (r06 != null) goto L21;
        r06 = new C0967l();     // Catch: Throwable -> L23
        this.f3310a.put(r4, r06);     // Catch: Throwable -> L23
    L21:
        r06.m2325a(r5, r1);     // Catch: Throwable -> L23
    L25:
        monitor-exit(this);
        return r04;
    L8:
        r04 = null;
    L23:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2271i(Context r8, int r9, Drawable r10) {
        C0924r r02 = this.f3314e;
        if (r02 == null) goto L35;
        PorterDuff.Mode r2 = C0926s.f3289b;
        if (C0924r.m2253a(r02.f3283a, r9) == false) goto L10;
        int r92 = C1031R.attr.colorControlNormal;
    L7:
        boolean r3 = true;
    L8:
        int r03 = -1;
    L23:
        if (r3 == false) goto L38;
        Drawable r102 = r10.mutate();
        int r82 = AbstractC0849A0.m2161c(r8, r92);
        monitor-enter(C0926s.class);
        PorterDuffColorFilter r83 = m2264g(r82, r2);     // Catch: Throwable -> L32
        monitor-exit(C0926s.class);
        r102.setColorFilter(r83);
        if (r03 == (-1)) goto L39;
        r102.setAlpha(r03);
    L39:
        return true;
    L32:
        th = move-exception;
        throw th;
    L38:
        return false;
    L10:
        if (C0924r.m2253a(r02.f3285c, r9) == false) goto L13;
        r92 = C1031R.attr.colorControlActivated;
        goto L7
    L13:
        if (C0924r.m2253a(r02.f3286d, r9) == false) goto L17;
        r2 = PorterDuff.Mode.MULTIPLY;
    L15:
        r92 = 16842801;
        goto L7
    L17:
        if (r9 != C1031R.drawable.abc_list_divider_mtrl_alpha) goto L20;
        r3 = true;
        r03 = Math.round(40.8f);
        r92 = 16842800;
        goto L23
    L20:
        if (r9 == C1031R.drawable.abc_dialog_material_background) goto L15;
        r92 = 0;
        r3 = false;
        goto L8
    L35:
        return false;
    }
}
