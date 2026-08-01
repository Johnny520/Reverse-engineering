package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w00 {
    public static final PorterDuff.Mode f = null;
    public static w00 g;
    public static final v00 h = null;
    public WeakHashMap a;
    public final WeakHashMap b;
    public TypedValue c;
    public boolean d;
    public t3 e;

    static {
        f = PorterDuff.Mode.SRC_IN;
        h = new v00(6);
    }

    public w00() {
        this.b = new WeakHashMap(0);
    }

    public static synchronized w00 b() {
        monitor-enter(w00.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (g != null) goto L9;
        g = new w00();     // Catch: Throwable -> L7
    L9:
        w00 r1 = g;     // Catch: Throwable -> L7
        monitor-exit(w00.class);
        return r1;
    }

    public static synchronized PorterDuffColorFilter e(int r4, PorterDuff.Mode r5) {
        monitor-enter(w00.class);
        v00 r1 = h;     // Catch: Throwable -> L8
        r1.getClass();     // Catch: Throwable -> L8
        int r3 = (31 + r4) * 31;     // Catch: Throwable -> L8
        PorterDuffColorFilter r2 = (PorterDuffColorFilter) r1.a(Integer.valueOf(r5.hashCode() + r3));     // Catch: Throwable -> L8
        if (r2 != null) goto L10;
        r2 = new PorterDuffColorFilter(r4, r5);     // Catch: Throwable -> L8
        PorterDuffColorFilter r42 = (PorterDuffColorFilter) r1.b(Integer.valueOf(r5.hashCode() + r3), r2);     // Catch: Throwable -> L8
    L10:
        monitor-exit(w00.class);
        return r2;
    L8:
        th = move-exception;
        throw th;
    }

    public final Drawable a(Context r10, int r11) {
        if (this.c != null) goto L5;
        this.c = new TypedValue();
    L5:
        TypedValue r0 = this.c;
        r10.getResources().getValue(r11, r0, true);
        long r1 = (((long) r0.assetCookie) << 32) | ((long) r0.data);
        monitor-enter(this);
        bs r3 = (bs) this.b.get(r10);     // Catch: Throwable -> L19
        Drawable r4 = null;
        if (r3 != null) goto L12;
        monitor-exit(this);
    L27:
        if (r4 == null) goto L29;
        return r4;
    L29:
        LayerDrawable r42 = null;
        if (this.e != null) goto L33;
    L44:
        if (r42 == null) goto L61;
        r42.setChangingConfigurations(r0.changingConfigurations);
        monitor-enter(this);
        Drawable.ConstantState r112 = r42.getConstantState();     // Catch: Throwable -> L52
        if (r112 == null) goto L57;
        bs r02 = (bs) this.b.get(r10);     // Catch: Throwable -> L52
        if (r02 != null) goto L54;
        r02 = new bs();     // Catch: Throwable -> L52
        this.b.put(r10, r02);     // Catch: Throwable -> L52
    L54:
        r02.d(r1, new WeakReference(r112));     // Catch: Throwable -> L52
        monitor-exit(this);
    L58:
        return r42;
    L57:
        monitor-exit(this);
    L52:
        th = move-exception;
        throw th;
    L61:
        return r42;
    L33:
        if (r11 != R.drawable.abc_cab_background_top_material) goto L36;
        r42 = new LayerDrawable(new Drawable[]{c(r10, R.drawable.abc_cab_background_internal_bg), c(r10, R.drawable.abc_cab_background_top_mtrl_alpha)});
        goto L44
    L36:
        if (r11 != R.drawable.abc_ratingbar_material) goto L39;
        r42 = t3.c(this, r10, R.dimen.abc_star_big);
        goto L44
    L39:
        if (r11 != R.drawable.abc_ratingbar_indicator_material) goto L42;
        r42 = t3.c(this, r10, R.dimen.abc_star_medium);
        goto L44
    L42:
        if (r11 != R.drawable.abc_ratingbar_small_material) goto L44;
        r42 = t3.c(this, r10, R.dimen.abc_star_small);
        goto L44
    L12:
        WeakReference r5 = (WeakReference) r3.c(r1, null);     // Catch: Throwable -> L19
        if (r5 == null) goto L26;
        Drawable.ConstantState r52 = (Drawable.ConstantState) r5.get();     // Catch: Throwable -> L19
        if (r52 == null) goto L21;
        r4 = r52.newDrawable(r10.getResources());     // Catch: Throwable -> L19
        monitor-exit(this);
        goto L27
    L21:
        int r53 = ff.d(r3.b, r3.d, r1);     // Catch: Throwable -> L19
        if (r53 < 0) goto L26;
        Object[] r6 = r3.c;     // Catch: Throwable -> L19
        Object r7 = r6[r53];     // Catch: Throwable -> L19
        Object r8 = bs.e;     // Catch: Throwable -> L19
        if (r7 == r8) goto L26;
        r6[r53] = r8;     // Catch: Throwable -> L19
        r3.a = true;     // Catch: Throwable -> L19
    L26:
        monitor-exit(this);
    L19:
        th = move-exception;
        throw th;
    }

    public final synchronized Drawable c(Context r2, int r3) {
        monitor-enter(this);
        Drawable r22 = d(r2, r3, false);     // Catch: Throwable -> L7
        monitor-exit(this);
        return r22;
    L7:
        th = move-exception;
        throw th;
    }

    public final synchronized Drawable d(Context r3, int r4, boolean r5) {
        monitor-enter(this);
    L15:
        th = move-exception;
        throw th;
    L4:
        if (this.d == true) goto L12;
        this.d = true;     // Catch: Throwable -> L15
        Drawable r0 = c(r3, R.drawable.abc_vector_test);     // Catch: Throwable -> L15
        if (r0 == null) goto L24;
        if ((r0 instanceof e90) == true) goto L12;
        if ("android.graphics.drawable.VectorDrawable".equals(r0.getClass().getName()) == true) goto L12;
    L24:
        this.d = false;     // Catch: Throwable -> L15
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");     // Catch: Throwable -> L15
    L12:
        Drawable r02 = a(r3, r4);     // Catch: Throwable -> L15
        if (r02 != null) goto L17;
        r02 = gd.b(r3, r4);     // Catch: Throwable -> L15
    L17:
        if (r02 == null) goto L19;
        r02 = g(r3, r4, r5, r02);     // Catch: Throwable -> L15
    L19:
        if (r02 == null) goto L21;
        eh.a(r02);     // Catch: Throwable -> L15
    L21:
        monitor-exit(this);
        return r02;
    }

    public final synchronized ColorStateList f(Context r4, int r5) {
        monitor-enter(this);
        WeakHashMap r0 = this.a;     // Catch: Throwable -> L23
        ColorStateList r1 = null;
        if (r0 == null) goto L8;
        e40 r02 = (e40) r0.get(r4);     // Catch: Throwable -> L23
        if (r02 == null) goto L8;
        ColorStateList r03 = (ColorStateList) r02.b(r5, null);     // Catch: Throwable -> L23
    L9:
        if (r03 != null) goto L25;
        t3 r04 = this.e;     // Catch: Throwable -> L23
        if (r04 == null) goto L14;
        r1 = r04.d(r4, r5);     // Catch: Throwable -> L23
    L14:
        if (r1 != null) goto L16;
    L22:
        r03 = r1;
        goto L25
    L16:
        if (this.a != null) goto L18;
        this.a = new WeakHashMap();     // Catch: Throwable -> L23
    L18:
        e40 r05 = (e40) this.a.get(r4);     // Catch: Throwable -> L23
        if (r05 != null) goto L21;
        r05 = new e40();     // Catch: Throwable -> L23
        this.a.put(r4, r05);     // Catch: Throwable -> L23
    L21:
        r05.a(r5, r1);     // Catch: Throwable -> L23
    L25:
        monitor-exit(this);
        return r03;
    L8:
        r03 = null;
    L23:
        th = move-exception;
        throw th;
    }

    public final Drawable g(Context r10, int r11, boolean r12, Drawable r13) {
        ColorStateList r0 = f(r10, r11);
        PorterDuff.Mode r1 = null;
        if (r0 == null) goto L13;
        int[] r102 = eh.a;
        Drawable r103 = r13.mutate();
        ch.h(r103, r0);
        if (this.e != null) goto L8;
    L10:
        if (r1 == null) goto L12;
        ch.i(r103, r1);
    L12:
        return r103;
    L8:
        if (r11 != R.drawable.abc_switch_thumb_material) goto L10;
        r1 = PorterDuff.Mode.MULTIPLY;
        goto L10
    L13:
        t3 r02 = this.e;
        int r2 = R.attr.colorControlNormal;
        if (r02 != null) goto L16;
    L27:
        t3 r03 = this.e;
        boolean r4 = false;
        if (r03 == null) goto L51;
        PorterDuff.Mode r5 = u3.b;
        if (t3.a(r03.a, r11) == false) goto L34;
    L31:
        boolean r04 = true;
    L32:
        int r112 = -1;
    L46:
        if (r04 == false) goto L51;
        int[] r05 = eh.a;
        Drawable r06 = r13.mutate();
        r06.setColorFilter(u3.c(r60.c(r10, r2), r5));
        if (r112 == (-1)) goto L50;
        r06.setAlpha(r112);
    L50:
        r4 = true;
        goto L51
    L34:
        if (t3.a(r03.c, r11) == false) goto L36;
        r2 = R.attr.colorControlActivated;
        goto L31
    L36:
        boolean r07 = t3.a(r03.d, r11);
        r2 = android.R.attr.colorBackground;
        if (r07 == false) goto L40;
        r5 = PorterDuff.Mode.MULTIPLY;
        goto L31
    L40:
        if (r11 != R.drawable.abc_list_divider_mtrl_alpha) goto L43;
        r112 = Math.round(40.8f);
        r2 = android.R.attr.colorForeground;
        r04 = true;
        goto L46
    L43:
        if (r11 == R.drawable.abc_dialog_material_background) goto L31;
        r04 = false;
        r2 = 0;
    L51:
        if (r4 == true) goto L54;
        if (r12 == false) goto L54;
        return null;
    L54:
        return r13;
    L16:
        if (r11 != R.drawable.abc_seekbar_track_material) goto L20;
        LayerDrawable r113 = (LayerDrawable) r13;
        Drawable r122 = r113.findDrawableByLayerId(android.R.id.background);
        int r08 = r60.c(r10, R.attr.colorControlNormal);
        PorterDuff.Mode r14 = u3.b;
        t3.e(r122, r08, r14);
        t3.e(r113.findDrawableByLayerId(android.R.id.secondaryProgress), r60.c(r10, R.attr.colorControlNormal), r14);
        t3.e(r113.findDrawableByLayerId(android.R.id.progress), r60.c(r10, R.attr.colorControlActivated), r14);
        return r13;
    L20:
        if (r11 != R.drawable.abc_ratingbar_material) goto L22;
    L25:
        LayerDrawable r114 = (LayerDrawable) r13;
        Drawable r123 = r114.findDrawableByLayerId(android.R.id.background);
        int r09 = r60.b(r10, R.attr.colorControlNormal);
        PorterDuff.Mode r15 = u3.b;
        t3.e(r123, r09, r15);
        t3.e(r114.findDrawableByLayerId(android.R.id.secondaryProgress), r60.c(r10, R.attr.colorControlActivated), r15);
        t3.e(r114.findDrawableByLayerId(android.R.id.progress), r60.c(r10, R.attr.colorControlActivated), r15);
        return r13;
    L22:
        if (r11 == R.drawable.abc_ratingbar_indicator_material) goto L25;
        if (r11 != R.drawable.abc_ratingbar_small_material) goto L27;
        goto L25
    }
}
