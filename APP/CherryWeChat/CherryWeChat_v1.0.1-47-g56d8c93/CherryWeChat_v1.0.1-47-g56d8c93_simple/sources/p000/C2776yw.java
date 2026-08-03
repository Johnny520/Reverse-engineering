package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import io.github.cherrywechat.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yw */
/* JADX INFO: loaded from: classes.dex */
public final class C2776yw {

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f9426f = null;

    /* JADX INFO: renamed from: g */
    public static C2776yw f9427g;

    /* JADX INFO: renamed from: h */
    public static final C2733xw f9428h = null;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f9429a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f9430b;

    /* JADX INFO: renamed from: c */
    public TypedValue f9431c;

    /* JADX INFO: renamed from: d */
    public boolean f9432d;

    /* JADX INFO: renamed from: e */
    public C0252Fu f9433e;

    static {
        f9426f = PorterDuff.Mode.SRC_IN;
        f9428h = new C2733xw(6);
    }

    public C2776yw() {
        this.f9430b = new WeakHashMap(0);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C2776yw m5347b() {
        monitor-enter(C2776yw.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f9427g != null) goto L9;
        f9427g = new C2776yw();     // Catch: Throwable -> L7
    L9:
        C2776yw r1 = f9427g;     // Catch: Throwable -> L7
        monitor-exit(C2776yw.class);
        return r1;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m5348e(int r4, PorterDuff.Mode r5) {
        monitor-enter(C2776yw.class);
        C2733xw r1 = f9428h;     // Catch: Throwable -> L8
        r1.getClass();     // Catch: Throwable -> L8
        int r3 = (31 + r4) * 31;     // Catch: Throwable -> L8
        PorterDuffColorFilter r2 = (PorterDuffColorFilter) r1.m307f(Integer.valueOf(r5.hashCode() + r3));     // Catch: Throwable -> L8
        if (r2 != null) goto L10;
        r2 = new PorterDuffColorFilter(r4, r5);     // Catch: Throwable -> L8
        PorterDuffColorFilter r42 = (PorterDuffColorFilter) r1.m311j(Integer.valueOf(r5.hashCode() + r3), r2);     // Catch: Throwable -> L8
    L10:
        monitor-exit(C2776yw.class);
        return r2;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m5349a(Context r7, int r8) {
        if (this.f9431c != null) goto L5;
        this.f9431c = new TypedValue();
    L5:
        TypedValue r0 = this.f9431c;
        r7.getResources().getValue(r8, r0, true);
        long r1 = (((long) r0.assetCookie) << 32) | ((long) r0.data);
        monitor-enter(this);
        C2640vp r3 = (C2640vp) this.f9430b.get(r7);     // Catch: Throwable -> L19
        Drawable r4 = null;
        if (r3 != null) goto L12;
        monitor-exit(this);
    L23:
        if (r4 == null) goto L25;
        return r4;
    L25:
        LayerDrawable r42 = null;
        if (this.f9433e != null) goto L29;
    L40:
        if (r42 == null) goto L57;
        r42.setChangingConfigurations(r0.changingConfigurations);
        monitor-enter(this);
        Drawable.ConstantState r82 = r42.getConstantState();     // Catch: Throwable -> L48
        if (r82 == null) goto L53;
        C2640vp r02 = (C2640vp) this.f9430b.get(r7);     // Catch: Throwable -> L48
        if (r02 != null) goto L50;
        r02 = new C2640vp();     // Catch: Throwable -> L48
        this.f9430b.put(r7, r02);     // Catch: Throwable -> L48
    L50:
        r02.m5170e(r1, new WeakReference(r82));     // Catch: Throwable -> L48
        monitor-exit(this);
    L54:
        return r42;
    L53:
        monitor-exit(this);
    L48:
        th = move-exception;
        throw th;
    L57:
        return r42;
    L29:
        if (r8 != R.drawable.abc_cab_background_top_material) goto L32;
        r42 = new LayerDrawable(new Drawable[]{m5350c(r7, R.drawable.abc_cab_background_internal_bg), m5350c(r7, R.drawable.abc_cab_background_top_mtrl_alpha)});
        goto L40
    L32:
        if (r8 != R.drawable.abc_ratingbar_material) goto L35;
        r42 = C0252Fu.m526f(this, r7, R.dimen.abc_star_big);
        goto L40
    L35:
        if (r8 != R.drawable.abc_ratingbar_indicator_material) goto L38;
        r42 = C0252Fu.m526f(this, r7, R.dimen.abc_star_medium);
        goto L40
    L38:
        if (r8 != R.drawable.abc_ratingbar_small_material) goto L40;
        r42 = C0252Fu.m526f(this, r7, R.dimen.abc_star_small);
        goto L40
    L12:
        WeakReference r5 = (WeakReference) r3.m5167b(r1);     // Catch: Throwable -> L19
        if (r5 == null) goto L22;
        Drawable.ConstantState r52 = (Drawable.ConstantState) r5.get();     // Catch: Throwable -> L19
        if (r52 == null) goto L21;
        r4 = r52.newDrawable(r7.getResources());     // Catch: Throwable -> L19
        monitor-exit(this);
        goto L23
    L21:
        r3.m5171f(r1);     // Catch: Throwable -> L19
    L22:
        monitor-exit(this);
    L19:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m5350c(Context r2, int r3) {
        monitor-enter(this);
        Drawable r22 = m5351d(r2, r3, false);     // Catch: Throwable -> L7
        monitor-exit(this);
        return r22;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m5351d(Context r3, int r4, boolean r5) {
        monitor-enter(this);
    L15:
        th = move-exception;
        throw th;
    L4:
        if (this.f9432d == true) goto L12;
        this.f9432d = true;     // Catch: Throwable -> L15
        Drawable r0 = m5350c(r3, R.drawable.abc_vector_test);     // Catch: Throwable -> L15
        if (r0 == null) goto L24;
        if ((r0 instanceof C0530MD) == true) goto L12;
        if ("android.graphics.drawable.VectorDrawable".equals(r0.getClass().getName()) == true) goto L12;
    L24:
        this.f9432d = false;     // Catch: Throwable -> L15
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");     // Catch: Throwable -> L15
    L12:
        Drawable r02 = m5349a(r3, r4);     // Catch: Throwable -> L15
        if (r02 != null) goto L17;
        r02 = r3.getDrawable(r4);     // Catch: Throwable -> L15
    L17:
        if (r02 == null) goto L19;
        r02 = m5353g(r3, r4, r5, r02);     // Catch: Throwable -> L15
    L19:
        if (r02 == null) goto L21;
        AbstractC0107Ce.m159a(r02);     // Catch: Throwable -> L15
    L21:
        monitor-exit(this);
        return r02;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized ColorStateList m5352f(Context r4, int r5) {
        monitor-enter(this);
        WeakHashMap r0 = this.f9429a;     // Catch: Throwable -> L23
        ColorStateList r1 = null;
        if (r0 == null) goto L8;
        C0471Ky r02 = (C0471Ky) r0.get(r4);     // Catch: Throwable -> L23
        if (r02 == null) goto L8;
        ColorStateList r03 = (ColorStateList) r02.m919b(r5);     // Catch: Throwable -> L23
    L9:
        if (r03 != null) goto L25;
        C0252Fu r04 = this.f9433e;     // Catch: Throwable -> L23
        if (r04 == null) goto L14;
        r1 = r04.m530g(r4, r5);     // Catch: Throwable -> L23
    L14:
        if (r1 != null) goto L16;
    L22:
        r03 = r1;
        goto L25
    L16:
        if (this.f9429a != null) goto L18;
        this.f9429a = new WeakHashMap();     // Catch: Throwable -> L23
    L18:
        C0471Ky r05 = (C0471Ky) this.f9429a.get(r4);     // Catch: Throwable -> L23
        if (r05 != null) goto L21;
        r05 = new C0471Ky();     // Catch: Throwable -> L23
        this.f9429a.put(r4, r05);     // Catch: Throwable -> L23
    L21:
        r05.m918a(r5, r1);     // Catch: Throwable -> L23
    L25:
        monitor-exit(this);
        return r03;
    L8:
        r03 = null;
    L23:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m5353g(Context r8, int r9, boolean r10, Drawable r11) {
        ColorStateList r0 = m5352f(r8, r9);
        PorterDuff.Mode r1 = null;
        if (r0 == null) goto L14;
        Drawable r82 = r11.mutate();
        r82.setTintList(r0);
        if (this.f9433e != null) goto L8;
    L10:
        if (r1 == null) goto L12;
        r82.setTintMode(r1);
    L12:
        return r82;
    L8:
        if (r9 != R.drawable.abc_switch_thumb_material) goto L10;
        r1 = PorterDuff.Mode.MULTIPLY;
        goto L10
    L14:
        if (this.f9433e != null) goto L16;
    L27:
        C0252Fu r02 = this.f9433e;
        boolean r2 = false;
        if (r02 == null) goto L53;
        PorterDuff.Mode r3 = C0262G3.f842b;
        if (C0252Fu.m523b((int[]) r02.f819a, r9) == false) goto L35;
        int r92 = R.attr.colorControlNormal;
    L32:
        boolean r4 = true;
    L33:
        int r03 = -1;
    L48:
        if (r4 == false) goto L53;
        Drawable r22 = r11.mutate();
        r22.setColorFilter(C0262G3.m540c(AbstractC1042YA.m1989c(r8, r92), r3));
        if (r03 == (-1)) goto L52;
        r22.setAlpha(r03);
    L52:
        r2 = true;
        goto L53
    L35:
        if (C0252Fu.m523b((int[]) r02.f821c, r9) == false) goto L38;
        r92 = R.attr.colorControlActivated;
        goto L32
    L38:
        if (C0252Fu.m523b((int[]) r02.f822d, r9) == false) goto L42;
        r3 = PorterDuff.Mode.MULTIPLY;
    L40:
        r92 = 16842801;
        goto L32
    L42:
        if (r9 != R.drawable.abc_list_divider_mtrl_alpha) goto L45;
        r03 = Math.round(40.8f);
        r92 = 16842800;
        r4 = true;
        goto L48
    L45:
        if (r9 == R.drawable.abc_dialog_material_background) goto L40;
        r92 = 0;
        r4 = false;
    L53:
        if (r2 == true) goto L56;
        if (r10 == false) goto L56;
        return null;
    L56:
        return r11;
    L16:
        if (r9 != R.drawable.abc_seekbar_track_material) goto L20;
        LayerDrawable r93 = (LayerDrawable) r11;
        Drawable r102 = r93.findDrawableByLayerId(android.R.id.background);
        int r04 = AbstractC1042YA.m1989c(r8, R.attr.colorControlNormal);
        PorterDuff.Mode r12 = C0262G3.f842b;
        C0252Fu.m527j(r102, r04, r12);
        C0252Fu.m527j(r93.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1042YA.m1989c(r8, R.attr.colorControlNormal), r12);
        C0252Fu.m527j(r93.findDrawableByLayerId(android.R.id.progress), AbstractC1042YA.m1989c(r8, R.attr.colorControlActivated), r12);
        return r11;
    L20:
        if (r9 != R.drawable.abc_ratingbar_material) goto L22;
    L25:
        LayerDrawable r94 = (LayerDrawable) r11;
        Drawable r103 = r94.findDrawableByLayerId(android.R.id.background);
        int r05 = AbstractC1042YA.m1988b(r8, R.attr.colorControlNormal);
        PorterDuff.Mode r13 = C0262G3.f842b;
        C0252Fu.m527j(r103, r05, r13);
        C0252Fu.m527j(r94.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1042YA.m1989c(r8, R.attr.colorControlActivated), r13);
        C0252Fu.m527j(r94.findDrawableByLayerId(android.R.id.progress), AbstractC1042YA.m1989c(r8, R.attr.colorControlActivated), r13);
        return r11;
    L22:
        if (r9 == R.drawable.abc_ratingbar_indicator_material) goto L25;
        if (r9 != R.drawable.abc_ratingbar_small_material) goto L27;
        goto L25
    }
}
