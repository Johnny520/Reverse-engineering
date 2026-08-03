package io.github.cherrywechat.lua.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Looper;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.LuaUiScheduler;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC2374ph;
import p000.AbstractC2453ra;
import p000.AbstractC2496sa;
import p000.C0181E8;
import p000.C0296Gv;
import p000.C0339Hv;
import p000.C0396J8;
import p000.C0439K8;
import p000.C0495Lf;
import p000.C0525M8;
import p000.C0568N8;
import p000.C0611O8;
import p000.C0654P8;
import p000.C0697Q8;
import p000.C0782S8;
import p000.C0829TC;
import p000.C0868U8;
import p000.C0954W8;
import p000.C0997X8;
import p000.C1040Y8;
import p000.C1083Z8;
import p000.C1127a9;
import p000.C1302d;
import p000.C1389f;
import p000.C2087j8;
import p000.C2265n8;
import p000.C2308o8;
import p000.DialogInterfaceOnClickListenerC0825T8;
import p000.DialogInterfaceOnClickListenerC0911V8;
import p000.DialogInterfaceOnClickListenerC2179l8;
import p000.InterfaceC0884Ui;
import p000.RunnableC2260n3;
import p000.ViewOnClickListenerC0482L8;
import p000.ViewOnTouchListenerC0739R8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClickableViewAccessibility", "StaticFieldLeak"})
public final class CherryViewAPI {
    public static final CherryViewAPI INSTANCE = null;
    private static final String TAG = null;
    private static final ConcurrentHashMap<String, FloatingWindowInfo> floatingWindows = null;
    private static final ExecutorService imageLoadExecutor = null;
    private static final AtomicLong viewIdCounter = null;
    private static final ConcurrentHashMap<String, View> viewRefs = null;
    private static final AtomicLong windowIdCounter = null;

    public static final class FloatingWindowInfo {
        private final FrameLayout container;

        /* JADX INFO: renamed from: id */
        private final String f5551id;
        private boolean isShowing;
        private final WindowManager.LayoutParams params;
        private final WindowManager windowManager;

        public FloatingWindowInfo(String r3, FrameLayout r4, WindowManager.LayoutParams r5, WindowManager r6, boolean r7) {
            AbstractC0295Gu.m625r(-545314817701941L);
            AbstractC0295Gu.m625r(-545327702603829L);
            AbstractC0295Gu.m625r(-544820896462901L);
            AbstractC0295Gu.m625r(-544850961233973L);
            this.f5551id = r3;
            this.container = r4;
            this.params = r5;
            this.windowManager = r6;
            this.isShowing = r7;
        }

        public static /* synthetic */ FloatingWindowInfo copy$default(FloatingWindowInfo r0, String r1, FrameLayout r2, WindowManager.LayoutParams r3, WindowManager r4, boolean r5, int r6, Object r7) {
            if ((r6 & 1) == 0) goto L6;
            r1 = r0.f5551id;
        L6:
            if ((r6 & 2) == 0) goto L9;
            r2 = r0.container;
        L9:
            if ((r6 & 4) == 0) goto L12;
            r3 = r0.params;
        L12:
            if ((r6 & 8) == 0) goto L15;
            r4 = r0.windowManager;
        L15:
            if ((r6 & 16) == 0) goto L17;
            r5 = r0.isShowing;
        L17:
            WindowManager r62 = r4;
            boolean r72 = r5;
            WindowManager.LayoutParams r52 = r3;
            String r32 = r1;
            return r0.copy(r32, r2, r52, r62, r72);
        }

        public final String component1() {
            return this.f5551id;
        }

        public final FrameLayout component2() {
            return this.container;
        }

        public final WindowManager.LayoutParams component3() {
            return this.params;
        }

        public final WindowManager component4() {
            return this.windowManager;
        }

        public final boolean component5() {
            return this.isShowing;
        }

        public final FloatingWindowInfo copy(String r9, FrameLayout r10, WindowManager.LayoutParams r11, WindowManager r12, boolean r13) {
            AbstractC0295Gu.m625r(-544911090776117L);
            AbstractC0295Gu.m625r(-544923975678005L);
            AbstractC0295Gu.m625r(-544966925350965L);
            AbstractC0295Gu.m625r(-544996990122037L);
            return new FloatingWindowInfo(r9, r10, r11, r12, r13);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof FloatingWindowInfo) == true) goto L8;
            return false;
        L8:
            FloatingWindowInfo r52 = (FloatingWindowInfo) r5;
            if (AbstractC0585Nj.m1134a(this.f5551id, r52.f5551id) == true) goto L12;
            return false;
        L12:
            if (AbstractC0585Nj.m1134a(this.container, r52.container) == true) goto L15;
            return false;
        L15:
            if (AbstractC0585Nj.m1134a(this.params, r52.params) == true) goto L18;
            return false;
        L18:
            if (AbstractC0585Nj.m1134a(this.windowManager, r52.windowManager) == true) goto L21;
            return false;
        L21:
            if (this.isShowing == r52.isShowing) goto L23;
            return false;
        L23:
            return true;
        }

        public final FrameLayout getContainer() {
            return this.container;
        }

        public final String getId() {
            return this.f5551id;
        }

        public final WindowManager.LayoutParams getParams() {
            return this.params;
        }

        public final WindowManager getWindowManager() {
            return this.windowManager;
        }

        public int hashCode() {
            int r0 = this.f5551id.hashCode() * 31;
            int r1 = (this.container.hashCode() + r0) * 31;
            int r02 = (this.params.hashCode() + r1) * 31;
            int r12 = (this.windowManager.hashCode() + r02) * 31;
            return Boolean.hashCode(this.isShowing) + r12;
        }

        public final boolean isShowing() {
            return this.isShowing;
        }

        public final void setShowing(boolean r1) {
            this.isShowing = r1;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append(AbstractC0295Gu.m625r(-545057119664181L));
            AbstractC2374ph.m4817n(r0, this.f5551id, -543506636470325L);
            r0.append(this.container);
            r0.append(AbstractC0295Gu.m625r(-543562471045173L));
            r0.append(this.params);
            r0.append(AbstractC0295Gu.m625r(-543605420718133L));
            r0.append(this.windowManager);
            r0.append(AbstractC0295Gu.m625r(-543678435162165L));
            r0.append(this.isShowing);
            r0.append(')');
            return r0.toString();
        }
    }

    static {
        TAG = AbstractC0295Gu.m625r(-304697864878133L);
        INSTANCE = new CherryViewAPI();
        floatingWindows = new ConcurrentHashMap();
        windowIdCounter = new AtomicLong(0);
        viewIdCounter = new AtomicLong(0);
        viewRefs = new ConcurrentHashMap();
        imageLoadExecutor = Executors.newFixedThreadPool(3);
    }

    private CherryViewAPI() {
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ C0829TC m3241A(String r0, Map r1, Lua r2) {
        return register$lambda$56$lambda$55(r0, r1, r2);
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ int m3242A0(Lua r0) {
        return register$lambda$32(r0);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C0829TC m3243B(String r0, Map r1) {
        return register$lambda$73$lambda$72(r0, r1);
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ int m3244B0(Lua r0) {
        return register$lambda$108(r0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m3245C(Lua r0) {
        return register$lambda$130(r0);
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ C0829TC m3246C0(Lua r0, int r1) {
        return register$lambda$11$lambda$10$lambda$7$lambda$6(r0, r1);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ C0829TC m3247D(String r0, String r1) {
        return register$lambda$79$lambda$78(r0, r1);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m3248D0(String r0, ImageView r1) {
        loadImageFromUrl$lambda$132(r0, r1);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ C0829TC m3249E(String r0, int r1, int r2) {
        return register$lambda$110$lambda$109(r0, r1, r2);
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ int m3250E0(Lua r0) {
        return register$lambda$28(r0);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ C0829TC m3251F(Lua r0, int r1) {
        return register$lambda$25$lambda$24$lambda$23$lambda$22(r0, r1);
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ C0829TC m3252F0(int r0, String r1) {
        return register$lambda$1$lambda$0(r1, r0);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m3253G(int r0, Lua r1, DialogInterface r2, int r3) {
        register$lambda$11$lambda$10$lambda$7(r1, r0, r2, r3);
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ boolean m3254G0(Context r0, C0339Hv r1, WindowManager.LayoutParams r2, C0339Hv r3, C0296Gv r4, C0296Gv r5, FrameLayout r6, View r7, MotionEvent r8) {
        return register$lambda$99$lambda$98$lambda$97(r0, r1, r2, r3, r4, r5, r6, r7, r8);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ C0829TC m3255H(String r0, Lua r1, int r2) {
        return m3326x1809f3c8(r1, r2, r0);
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ C0829TC m3256H0(String r0, Map r1) {
        return register$lambda$65$lambda$64(r0, r1);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ C0829TC m3257I(String r0) {
        return register$lambda$108$lambda$107(r0);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m3258I0(Lua r0, int r1, EditText r2, DialogInterface r3, int r4) {
        register$lambda$18$lambda$17$lambda$14(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ C0829TC m3259J(Lua r0, int r1) {
        return register$lambda$32$lambda$31(r0, r1);
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ int m3260J0(Lua r0) {
        return register$lambda$25(r0);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ int m3261K(Lua r0) {
        return register$lambda$84(r0);
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ int m3262K0(Lua r0) {
        return register$lambda$101(r0);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m3263L(int r0, Lua r1, DialogInterface r2, int r3) {
        register$lambda$25$lambda$24$lambda$23(r1, r0, r2, r3);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ C0829TC m3264L0(Lua r0, int r1, int r2, List r3) {
        return register$lambda$25$lambda$24$lambda$21$lambda$20(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ int m3265M(Lua r0) {
        return register$lambda$33(r0);
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ int m3266M0(Lua r0) {
        return register$lambda$29(r0);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ C0829TC m3267N(String r0, String r1, int r2, Lua r3) {
        return register$lambda$5$lambda$4(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ int m3268N0(Lua r0) {
        return register$lambda$92(r0);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ int m3269O(Lua r0) {
        return register$lambda$79(r0);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ int m3270O0(Lua r0) {
        return register$lambda$18(r0);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ C0829TC m3271P(String r0, Map r1) {
        return register$lambda$61$lambda$60(r0, r1);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m3272P0(Lua r0, int r1, List r2, DialogInterface r3, int r4) {
        register$lambda$25$lambda$24$lambda$21(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ int m3273Q(Lua r0) {
        return register$lambda$65(r0);
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m3274Q0(int r0, Lua r1, DialogInterface r2, int r3) {
        register$lambda$18$lambda$17$lambda$16(r1, r0, r2, r3);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ C0829TC m3275R(Lua r0, int r1) {
        return m3323x7dea6f2b(r0, r1);
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ C0829TC m3276R0() {
        return register$lambda$117$lambda$116();
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ C0829TC m3277S(String r0, ArrayList r1, Lua r2, int r3) {
        return register$lambda$25$lambda$24(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ int m3278T(Lua r0) {
        return register$lambda$103(r0);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ int m3279U(Lua r0) {
        return register$lambda$61(r0);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ C0829TC m3280V(Lua r0, int r1) {
        return register$lambda$18$lambda$17$lambda$16$lambda$15(r0, r1);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ int m3281W(Lua r0) {
        return register$lambda$49(r0);
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ C0829TC m3282X(String r0) {
        return register$lambda$92$lambda$91(r0);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ C0829TC m3283Y(String r0, String r1, int r2, Lua r3) {
        return register$lambda$11$lambda$10(r0, r1, r3, r2);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ C0829TC m3284Z(String r0, Map r1, Lua r2) {
        return register$lambda$49$lambda$48(r0, r1, r2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C0829TC m3285a(String r0, String r1, Map r2) {
        return register$lambda$77$lambda$76(r0, r1, r2);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ C0829TC m3286a0(String r0, String r1) {
        return register$lambda$81$lambda$80(r0, r1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0829TC m3287b(Map r0, Lua r1) {
        return register$lambda$130$lambda$129(r0, r1);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ int m3288b0(Lua r0) {
        return register$lambda$117(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3289c(Integer r0, Lua r1, DialogInterface r2, int r3) {
        register$lambda$130$lambda$129$lambda$124$lambda$123(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ int m3290c0(Lua r0) {
        return register$lambda$99(r0);
    }

    private static final C0829TC cleanup$lambda$135() {
        Collection<FloatingWindowInfo> r0 = floatingWindows.values();
        AbstractC0295Gu.m625r(-304620555466805L);
        Iterator<T> r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        FloatingWindowInfo r1 = (FloatingWindowInfo) r02.next();
        if (r1.isShowing() == false) goto L4;
        r1.getWindowManager().removeView(r1.getContainer());     // Catch: Exception -> L11
        goto L4
    L9:
        floatingWindows.clear();
        viewRefs.clear();
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3291d(Lua r0, int r1, String r2, View r3) {
        register$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ int m3292d0(Lua r0) {
        return register$lambda$82(r0);
    }

    /* JADX INFO: renamed from: dp */
    private final int m3294dp(int r3) {
        Context r0 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r0 != null) goto L6;
        return r3;
    L6:
        return (int) TypedValue.applyDimension(1, r3, r0.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C0829TC m3295e(String r0) {
        return register$lambda$105$lambda$104(r0);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ C0829TC m3296e0(String r0, Lua r1, int r2) {
        return m3325xed14eec4(r1, r2, r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3297f(Lua r0) {
        return register$lambda$110(r0);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ int m3298f0(Lua r0) {
        return register$lambda$5(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3299g(Lua r0) {
        return register$lambda$41(r0);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ int m3300g0(Lua r0) {
        return register$lambda$81(r0);
    }

    private final String generateViewId() {
        return AbstractC0295Gu.m625r(-540238166358069L) + viewIdCounter.incrementAndGet();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C0829TC m3301h(Lua r0, int r1) {
        return register$lambda$5$lambda$4$lambda$3$lambda$2(r0, r1);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ C0829TC m3302h0(String r0, String r1) {
        return register$lambda$101$lambda$100(r0, r1);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3303i(Lua r0) {
        return register$lambda$105(r0);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ C0829TC m3304i0(String r0) {
        return register$lambda$103$lambda$102(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3305j(Lua r0) {
        return register$lambda$26(r0);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ C0829TC m3306j0(String r0, Map r1) {
        return register$lambda$69$lambda$68(r0, r1);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m3307k(Lua r0, int r1, String r2, View r3) {
        register$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m3308k0(Lua r0, int r1, String r2, View r3) {
        register$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3309l(Lua r0) {
        return register$lambda$89(r0);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ C0829TC m3310l0(String r0, Map r1, Lua r2) {
        return register$lambda$41$lambda$40(r0, r1, r2);
    }

    private final void loadImageFromUrl(ImageView r4, String r5) {
        imageLoadExecutor.execute(new RunnableC2260n3(5, r5, r4));
    }

    private static final void loadImageFromUrl$lambda$132(String r4, ImageView r5) {
        URLConnection r42 = new URL(r4).openConnection();     // Catch: Exception -> L9
        AbstractC0295Gu.m625r(-306295592712245L);     // Catch: Exception -> L9
        HttpURLConnection r43 = (HttpURLConnection) r42;     // Catch: Exception -> L9
        r43.setConnectTimeout(10000);     // Catch: Exception -> L9
        r43.setReadTimeout(15000);     // Catch: Exception -> L9
        r43.setDoInput(true);     // Catch: Exception -> L9
        r43.connect();     // Catch: Exception -> L9
        if (r43.getResponseCode() != 200) goto L7;
        InputStream r0 = r43.getInputStream();     // Catch: Exception -> L9
        Bitmap r1 = BitmapFactory.decodeStream(r0);     // Catch: Exception -> L9
        r0.close();     // Catch: Exception -> L9
        if (r1 == null) goto L7;
        LuaUiScheduler.INSTANCE.runOnUiThread(new C1389f(4, r5, r1));     // Catch: Exception -> L9
    L7:
        r43.disconnect();     // Catch: Exception -> L9
        return;
    L9:
        AbstractC0295Gu.m625r(-304921203177525L);
        AbstractC0295Gu.m625r(-304981332719669L);
    }

    private static final C0829TC loadImageFromUrl$lambda$132$lambda$131(ImageView r0, Bitmap r1) {
        r0.setImageBitmap(r1);
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3311m(Lua r0) {
        return register$lambda$73(r0);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C0829TC m3312m0(ImageView r0, Bitmap r1) {
        return loadImageFromUrl$lambda$132$lambda$131(r0, r1);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C0829TC m3313n(String r0, Map r1) {
        return register$lambda$99$lambda$98(r1, r0);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ int m3314n0(Lua r0) {
        return register$lambda$27(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C0829TC m3315o(String r0, String r1, String r2, Lua r3, int r4) {
        return register$lambda$18$lambda$17(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ C0829TC m3316o0(String r0, boolean r1) {
        return register$lambda$84$lambda$83(r0, r1);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C0829TC m3317p() {
        return cleanup$lambda$135();
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ int m3318p0(Lua r0) {
        return register$lambda$56(r0);
    }

    private final int parseColor(String r1, int r2) {
        if (r1 != null) goto L7;
        return r2;
    L7:
        return Color.parseColor(r1);
    L6:
        return r2;
    }

    private final int parseGravity(String r3) {
        if (r3 == null) goto L4;
        String r32 = r3.toLowerCase(Locale.ROOT);
        AbstractC0295Gu.m625r(-541131519555637L);
    L5:
        if (r32 != null) goto L7;
        return 0;
    L7:
        switch(r32.hashCode()) {
            case -1699597560: goto L78;
            case -1698351794: goto L73;
            case -1682225977: goto L70;
            case -1383228885: goto L65;
            case -1364013995: goto L60;
            case -1139554575: goto L55;
            case -966253391: goto L50;
            case -609197669: goto L47;
            case -348726240: goto L42;
            case 100571: goto L37;
            case 115029: goto L32;
            case 3317767: goto L27;
            case 108511772: goto L24;
            case 109757538: goto L21;
            case 116576946: goto L18;
            case 117822712: goto L15;
            case 1063616078: goto L10;
            default: goto L90;
        };
    L90:
        return 0;
    L10:
        if (r32.equals(AbstractC0295Gu.m625r(-541943268374581L)) == false) goto L91;
        return 1;
    L91:
        return 0;
    L15:
        if (r32.equals(AbstractC0295Gu.m625r(-540195216685109L)) == false) goto L92;
        return 8388659;
    L92:
        return 0;
    L18:
        if (r32.equals(AbstractC0295Gu.m625r(-541204533999669L)) == false) goto L93;
        return 8388661;
    L93:
        return 0;
    L21:
        if (r32.equals(AbstractC0295Gu.m625r(-541891728767029L)) == false) goto L94;
        return 8388611;
    L94:
        return 0;
    L24:
        if (r32.equals(AbstractC0295Gu.m625r(-541917498570805L)) == false) goto L95;
        return 8388613;
    L95:
        return 0;
    L27:
        if (r32.equals(AbstractC0295Gu.m625r(-541595376023605L)) == false) goto L96;
        return 8388611;
    L96:
        return 0;
    L32:
        if (r32.equals(AbstractC0295Gu.m625r(-541578196154421L)) == false) goto L97;
        return 48;
    L97:
        return 0;
    L37:
        if (r32.equals(AbstractC0295Gu.m625r(-541724225042485L)) == false) goto L98;
        return 8388613;
    L98:
        return 0;
    L42:
        if (r32.equals(AbstractC0295Gu.m625r(-541616850860085L)) == false) goto L99;
        return 16;
    L99:
        return 0;
    L47:
        if (r32.equals(AbstractC0295Gu.m625r(-542020577785909L)) == false) goto L100;
        return 8388691;
    L100:
        return 0;
    L50:
        if (r32.equals(AbstractC0295Gu.m625r(-541685570336821L)) == false) goto L101;
        return 8388659;
    L101:
        return 0;
    L55:
        if (r32.equals(AbstractC0295Gu.m625r(-541797239486517L)) == false) goto L102;
        return 8388661;
    L102:
        return 0;
    L60:
        if (r32.equals(AbstractC0295Gu.m625r(-541861663995957L)) == false) goto L103;
        return 17;
    L103:
        return 0;
    L65:
        if (r32.equals(AbstractC0295Gu.m625r(-541831599224885L)) == false) goto L104;
        return 80;
    L104:
        return 0;
    L70:
        if (r32.equals(AbstractC0295Gu.m625r(-540147972044853L)) == false) goto L105;
        return 8388693;
    L105:
        return 0;
    L73:
        if (r32.equals(AbstractC0295Gu.m625r(-541522361579573L)) == false) goto L106;
        return 8388691;
    L106:
        return 0;
    L78:
        if (r32.equals(AbstractC0295Gu.m625r(-541741404911669L)) == false) goto L107;
        return 8388693;
    L107:
        return 0;
    L4:
        r32 = null;
        goto L5
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3319q(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m3320q0(Integer r0, Lua r1, DialogInterface r2, int r3) {
        register$lambda$130$lambda$129$lambda$128$lambda$127(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m3321r(Lua r0) {
        return register$lambda$112(r0);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ int m3322r0(Lua r0) {
        return register$lambda$87(r0);
    }

    private final Map<String, Object> readConfig(Lua r6, int r7) {
        LinkedHashMap r0 = new LinkedHashMap();
        r6.pushValue(r7);
        r6.pushNil();
    L4:
        if (r6.next(-2) == 0) goto L21;
        String r72 = r6.toString(-2);
        if (r6.isString(-1) == false) goto L9;
        Object r1 = r6.toString(-1);
    L18:
        if (r72 == null) goto L20;
        r0.put(r72, r1);
    L20:
        r6.pop(1);
        goto L4
    L9:
        if (r6.isNumber(-1) == false) goto L12;
        r1 = Double.valueOf(r6.toNumber(-1));
        goto L18
    L12:
        if (r6.isBoolean(-1) == false) goto L15;
        r1 = Boolean.valueOf(r6.toBoolean(-1));
        goto L18
    L15:
        if (r6.isFunction(-1) == false) goto L17;
        r6.pushValue(-1);
        r1 = Integer.valueOf(r6.ref());
        goto L18
    L17:
        r1 = null;
        goto L18
    L21:
        r6.pop(1);
        return r0;
    }

    private static final int register$lambda$1(Lua r6) {
        AbstractC0295Gu.m625r(-540697727858741L);
        int r0 = 1;
        String r1 = r6.toString(1);
        if (r1 != null) goto L6;
        r1 = AbstractC0295Gu.m625r(-540706317793333L);
    L6:
        if (r6.getTop() > 1) goto L8;
    L10:
        r0 = 0;
    L11:
        INSTANCE.runOnUiThread(new C2308o8(r1, r0, 3));
        return 0;
    L8:
        if (((int) r6.toNumber(2)) <= 0) goto L10;
        goto L10
    }

    private static final C0829TC register$lambda$1$lambda$0(String r2, int r3) {
        CherryGlobalAPI r0 = CherryGlobalAPI.INSTANCE;
        Context r1 = r0.getCurrentActivity();
        if (r1 != null) goto L6;
        r1 = r0.getCurrentContext();
    L6:
        if (r1 == null) goto L9;
        Toast.makeText(r1, r2, r3).show();
    L9:
        return C0829TC.f2620a;
    }

    private static final int register$lambda$101(Lua r5) {
        AbstractC0295Gu.m625r(-307824601069621L);
        String r0 = r5.toString(1);
        if (r0 == null) goto L7;
        String r52 = r5.toString(2);
        if (r52 == null) goto L7;
        INSTANCE.runOnUiThread(new C0611O8(1, r0, r52));
        return 0;
    L7:
        return 0;
    }

    private static final C0829TC register$lambda$101$lambda$100(String r3, String r4) {
        FloatingWindowInfo r32 = floatingWindows.get(r3);
        C0829TC r0 = C0829TC.f2620a;
        if (r32 != null) goto L5;
        return r0;
    L5:
        View r42 = viewRefs.get(r4);
        if (r42 != null) goto L8;
        return r0;
    L8:
        r32.getContainer().removeAllViews();
        ViewParent r1 = r42.getParent();
        if ((r1 instanceof ViewGroup) == false) goto L11;
        ViewGroup r12 = (ViewGroup) r1;
    L12:
        if (r12 == null) goto L14;
        r12.removeView(r42);
    L14:
        r32.getContainer().addView(r42, new FrameLayout.LayoutParams(-1, -1));
        return r0;
    L11:
        r12 = null;
        goto L12
    }

    private static final int register$lambda$103(Lua r4) {
        AbstractC0295Gu.m625r(-307446643947573L);
        String r42 = r4.toString(1);
        if (r42 != null) goto L5;
        return 0;
    L5:
        INSTANCE.runOnUiThread(new C0782S8(r42, 2));
        return 0;
    }

    private static final C0829TC register$lambda$103$lambda$102(String r5) {
        FloatingWindowInfo r52 = floatingWindows.get(r5);
        C0829TC r0 = C0829TC.f2620a;
        if (r52 != null) goto L6;
        return r0;
    L6:
        if (r52.isShowing() == false) goto L12;
    L11:
        return r0;
    L12:
        r52.getWindowManager().addView(r52.getContainer(), r52.getParams());     // Catch: Exception -> L9
        r52.setShowing(true);     // Catch: Exception -> L9
    L9:
        e = move-exception;
        AbstractC0213Ey.m411i(-307833191004213L, -307343564732469L, e);
        goto L11
    }

    private static final int register$lambda$105(Lua r4) {
        AbstractC0295Gu.m625r(-305969175197749L);
        String r42 = r4.toString(1);
        if (r42 != null) goto L5;
        return 0;
    L5:
        INSTANCE.runOnUiThread(new C0782S8(r42, 3));
        return 0;
    }

    private static final C0829TC register$lambda$105$lambda$104(String r5) {
        FloatingWindowInfo r52 = floatingWindows.get(r5);
        C0829TC r0 = C0829TC.f2620a;
        if (r52 != null) goto L6;
        return r0;
    L6:
        if (r52.isShowing() == true) goto L12;
    L11:
        return r0;
    L12:
        r52.getWindowManager().removeView(r52.getContainer());     // Catch: Exception -> L9
        r52.setShowing(false);     // Catch: Exception -> L9
    L9:
        e = move-exception;
        AbstractC0213Ey.m411i(-307455233882165L, -307515363424309L, e);
        goto L11
    }

    private static final int register$lambda$108(Lua r4) {
        AbstractC0295Gu.m625r(-306153858791477L);
        String r42 = r4.toString(1);
        if (r42 != null) goto L5;
        return 0;
    L5:
        INSTANCE.runOnUiThread(new C0782S8(r42, 0));
        return 0;
    }

    private static final C0829TC register$lambda$108$lambda$107(String r4) {
        FloatingWindowInfo r42 = floatingWindows.remove(r4);
        if (r42 == null) goto L11;
        if (r42.isShowing() == false) goto L11;
        r42.getWindowManager().removeView(r42.getContainer());     // Catch: Exception -> L8
    L8:
        e = move-exception;
        AbstractC0213Ey.m411i(-305977765132341L, -306037894674485L, e);
    L11:
        return C0829TC.f2620a;
    }

    private static final int register$lambda$11(Lua r6) {
        AbstractC0295Gu.m625r(-540766447335477L);
        String r0 = r6.toString(1);
        if (r0 != null) goto L5;
        r0 = AbstractC0295Gu.m625r(-540775037270069L);
    L5:
        String r1 = r6.toString(2);
        if (r1 != null) goto L9;
        r1 = AbstractC0295Gu.m625r(-540779332237365L);
    L9:
        if (r6.isFunction(3) == true) goto L11;
        return 0;
    L11:
        r6.pushValue(3);
        int r2 = r6.ref();
        INSTANCE.runOnUiThread(new C2265n8(r0, r1, r2, r6));
        return 0;
    }

    private static final C0829TC register$lambda$11$lambda$10(String r2, String r3, Lua r4, int r5) {
        Activity r0 = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        if (r0 == null) goto L8;
        if (r0.isFinishing() == true) goto L8;
        new AlertDialog.Builder(r0).setTitle(r2).setMessage(r3).setPositiveButton(AbstractC0295Gu.m625r(-540740677531701L), new DialogInterfaceOnClickListenerC2179l8(r4, r5, 4)).setNegativeButton(AbstractC0295Gu.m625r(-540753562433589L), new DialogInterfaceOnClickListenerC2179l8(r4, r5, 5)).show();
    L8:
        return C0829TC.f2620a;
    }

    private static final void register$lambda$11$lambda$10$lambda$7(Lua r1, int r2, DialogInterface r3, int r4) {
        r3.dismiss();
        LuaLocks.INSTANCE.withLock(r1, new C1083Z8(r1, r2, 2));
    }

    private static final C0829TC register$lambda$11$lambda$10$lambda$7$lambda$6(Lua r2, int r3) {
        r2.refGet(r3);
        r2.push(true);
        r2.pCall(1, 0);
        r2.unref(r3);
        return C0829TC.f2620a;
    }

    private static final void register$lambda$11$lambda$10$lambda$9(Lua r1, int r2, DialogInterface r3, int r4) {
        r3.dismiss();
        LuaLocks.INSTANCE.withLock(r1, new C2087j8(r1, r2, 29));
    }

    private static final C0829TC register$lambda$11$lambda$10$lambda$9$lambda$8(Lua r2, int r3) {
        r2.refGet(r3);
        r2.push(false);
        r2.pCall(1, 0);
        r2.unref(r3);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$110(Lua r6) {
        AbstractC0295Gu.m625r(-306162448726069L);
        String r0 = r6.toString(1);
        if (r0 != null) goto L5;
        return 0;
    L5:
        int r2 = (int) r6.toNumber(2);
        int r62 = (int) r6.toNumber(3);
        INSTANCE.runOnUiThread(new C0868U8(r0, r2, r62, 1));
        return 0;
    }

    private static final C0829TC register$lambda$110$lambda$109(String r2, int r3, int r4) {
        FloatingWindowInfo r22 = floatingWindows.get(r2);
        C0829TC r0 = C0829TC.f2620a;
        if (r22 != null) goto L5;
        return r0;
    L5:
        r22.getParams().x = r3;
        r22.getParams().y = r4;
        if (r22.isShowing() == false) goto L8;
        r22.getWindowManager().updateViewLayout(r22.getContainer(), r22.getParams());
    L8:
        return r0;
    }

    private static final int register$lambda$112(Lua r6) {
        AbstractC0295Gu.m625r(-306171038660661L);
        String r0 = r6.toString(1);
        if (r0 != null) goto L5;
        return 0;
    L5:
        int r2 = (int) r6.toNumber(2);
        CherryViewAPI r3 = INSTANCE;
        r3.runOnUiThread(new C0868U8(r0, r3.m3294dp(r2), r3.m3294dp((int) r6.toNumber(3)), 0));
        return 0;
    }

    private static final C0829TC register$lambda$112$lambda$111(String r2, int r3, int r4) {
        FloatingWindowInfo r22 = floatingWindows.get(r2);
        C0829TC r0 = C0829TC.f2620a;
        if (r22 != null) goto L5;
        return r0;
    L5:
        r22.getParams().width = r3;
        r22.getParams().height = r4;
        if (r22.isShowing() == false) goto L8;
        r22.getWindowManager().updateViewLayout(r22.getContainer(), r22.getParams());
    L8:
        return r0;
    }

    private static final int register$lambda$114(Lua r4) {
        AbstractC0295Gu.m625r(-306179628595253L);
        Set<String> r0 = floatingWindows.keySet();
        AbstractC0295Gu.m625r(-306188218529845L);
        List r02 = AbstractC2453ra.m4908r0(r0);
        int r2 = 0;
        r4.createTable(r02.size(), 0);
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L10;
        Object r1 = r03.next();
        int r3 = r2 + 1;
        if (r2 < 0) goto L8;
        r4.push((String) r1);
        r4.rawSetI(-2, r3);
        r2 = r3;
        goto L4
    L8:
        AbstractC2496sa.m4978c0();
        throw null;
    L10:
        return 1;
    }

    private static final int register$lambda$117(Lua r2) {
        AbstractC0295Gu.m625r(-306510341077045L);
        INSTANCE.runOnUiThread(new C1302d(6));
        return 0;
    }

    private static final C0829TC register$lambda$117$lambda$116() {
        Collection<FloatingWindowInfo> r0 = floatingWindows.values();
        AbstractC0295Gu.m625r(-305707182192693L);
        Iterator<T> r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L11;
        FloatingWindowInfo r1 = (FloatingWindowInfo) r02.next();
        if (r1.isShowing() == false) goto L4;
        r1.getWindowManager().removeView(r1.getContainer());     // Catch: Exception -> L9
    L9:
        e = move-exception;
        AbstractC0213Ey.m411i(-305784491604021L, -305844621146165L, e);
        goto L4
    L11:
        floatingWindows.clear();
        return C0829TC.f2620a;
    }

    private static final int register$lambda$130(Lua r4) {
        AbstractC0295Gu.m625r(-306287002777653L);
        if (r4.isTable(1) == false) goto L5;
        Map<String, Object> r0 = INSTANCE.readConfig(r4, 1);
    L6:
        INSTANCE.runOnUiThread(new C1389f(3, r0, r4));
        return 0;
    L5:
        r0 = C0495Lf.f1620a;
        goto L6
    }

    private static final C0829TC register$lambda$130$lambda$129(Map r7, final Lua r8) {
        Activity r0 = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        C0829TC r1 = C0829TC.f2620a;
        if (r0 != null) goto L5;
    L48:
        return r1;
    L5:
        if (r0.isFinishing() == true) goto L48;
        Object r2 = r7.get(AbstractC0295Gu.m625r(-306518931011637L));
        final Integer r4 = null;
        if ((r2 instanceof String) == false) goto L10;
        String r22 = (String) r2;
    L11:
        Object r3 = r7.get(AbstractC0295Gu.m625r(-306544700815413L));
        if ((r3 instanceof String) == false) goto L14;
        String r32 = (String) r3;
    L15:
        boolean r5 = !AbstractC0585Nj.m1134a(r7.get(AbstractC0295Gu.m625r(-306566175651893L)), Boolean.FALSE);
        AlertDialog.Builder r6 = new AlertDialog.Builder(r0);
        if (r22 == null) goto L18;
        r6.setTitle(r22);
    L18:
        if (r32 == null) goto L28;
        View r02 = viewRefs.get(r32);
        if (r02 == null) goto L28;
        ViewParent r23 = r02.getParent();
        if ((r23 instanceof ViewGroup) == false) goto L24;
        ViewGroup r24 = (ViewGroup) r23;
    L25:
        if (r24 == null) goto L27;
        r24.removeView(r02);
    L27:
        r6.setView(r02);
        goto L28
    L24:
        r24 = null;
    L28:
        r6.setCancelable(r5);
        Object r03 = r7.get(AbstractC0295Gu.m625r(-306613420292149L));
        if ((r03 instanceof String) == false) goto L31;
        String r04 = (String) r03;
    L32:
        if (r04 == null) goto L38;
        Object r25 = r7.get(AbstractC0295Gu.m625r(-306677844801589L));
        if ((r25 instanceof Integer) == false) goto L36;
        final Integer r26 = (Integer) r25;
    L37:
        final int r52 = 0;
        r6.setPositiveButton(r04, new DialogInterfaceOnClickListenerC0911V8(r26, r8, r52));
        goto L38
    L36:
        r26 = null;
    L38:
        Object r05 = r7.get(AbstractC0295Gu.m625r(-306725089441845L));
        if ((r05 instanceof String) == false) goto L41;
        String r06 = (String) r05;
    L42:
        if (r06 == null) goto L47;
        Object r72 = r7.get(AbstractC0295Gu.m625r(-306239758137397L));
        if ((r72 instanceof Integer) == false) goto L46;
        r4 = (Integer) r72;
    L46:
        final int r27 = 1;
        r6.setNegativeButton(r06, new DialogInterfaceOnClickListenerC0911V8(r4, r8, r27));
    L47:
        r6.show();
        goto L48
    L41:
        r06 = null;
        goto L42
    L31:
        r04 = null;
        goto L32
    L14:
        r32 = null;
        goto L15
    L10:
        r22 = null;
        goto L11
    }

    private static final void register$lambda$130$lambda$129$lambda$124$lambda$123(Integer r1, Lua r2, DialogInterface r3, int r4) {
        r3.dismiss();
        if (r1 == null) goto L6;
        int r12 = r1.intValue();
        LuaLocks.INSTANCE.withLock(r2, new C1083Z8(r2, r12, 0));
        return;
    }

    /* JADX INFO: renamed from: register$lambda$130$lambda$129$lambda$124$lambda$123$lambda$122$lambda$121 */
    private static final C0829TC m3323x7dea6f2b(Lua r0, int r1) {
        r0.refGet(r1);
        r0.pCall(0, 0);
        return C0829TC.f2620a;
    }

    private static final void register$lambda$130$lambda$129$lambda$128$lambda$127(Integer r1, Lua r2, DialogInterface r3, int r4) {
        r3.dismiss();
        if (r1 == null) goto L6;
        int r12 = r1.intValue();
        LuaLocks.INSTANCE.withLock(r2, new C2087j8(r2, r12, 25));
        return;
    }

    /* JADX INFO: renamed from: register$lambda$130$lambda$129$lambda$128$lambda$127$lambda$126$lambda$125 */
    private static final C0829TC m3324xb9f67a2b(Lua r0, int r1) {
        r0.refGet(r1);
        r0.pCall(0, 0);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$18(final Lua r9) {
        AbstractC0295Gu.m625r(-540809397008437L);
        String r0 = r9.toString(1);
        if (r0 != null) goto L5;
        r0 = AbstractC0295Gu.m625r(-540817986943029L);
    L5:
        final String r2 = r0;
        String r02 = r9.toString(2);
        if (r02 != null) goto L8;
        r02 = AbstractC0295Gu.m625r(-540822281910325L);
    L8:
        final String r3 = r02;
        int r1 = 3;
        if (r9.getTop() < 4) goto L14;
        String r03 = r9.toString(3);
        if (r03 != null) goto L16;
        long r5 = -540826576877621L;
    L13:
        r03 = AbstractC0295Gu.m625r(r5);
    L16:
        if (r9.getTop() < 4) goto L19;
        r1 = 4;
    L19:
        if (r9.isFunction(r1) == true) goto L21;
        return 0;
    L21:
        r9.pushValue(r1);
        final int r6 = r9.ref();
        final String r4 = r03;
        INSTANCE.runOnUiThread(new C0697Q8(r2, r3, r4, r9, r6));
        return 0;
    L14:
        r5 = -540830871844917L;
        goto L13
    }

    private static final C0829TC register$lambda$18$lambda$17(String r2, String r3, String r4, Lua r5, int r6) {
        Activity r0 = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        if (r0 == null) goto L8;
        if (r0.isFinishing() == true) goto L8;
        EditText r1 = new EditText(r0);
        r1.setText(r4);
        new AlertDialog.Builder(r0).setTitle(r2).setMessage(r3).setView(r1).setPositiveButton(AbstractC0295Gu.m625r(-540783627204661L), new DialogInterfaceOnClickListenerC0825T8(r5, r6, r1, 1)).setNegativeButton(AbstractC0295Gu.m625r(-540796512106549L), new DialogInterfaceOnClickListenerC2179l8(r5, r6, 7)).show();
    L8:
        return C0829TC.f2620a;
    }

    private static final void register$lambda$18$lambda$17$lambda$14(Lua r1, int r2, EditText r3, DialogInterface r4, int r5) {
        r4.dismiss();
        LuaLocks.INSTANCE.withLock(r1, new C0396J8(r1, r2, r3, 2));
    }

    private static final C0829TC register$lambda$18$lambda$17$lambda$14$lambda$13(Lua r1, int r2, EditText r3) {
        r1.refGet(r2);
        r1.push(r3.getText().toString());
        r1.pCall(1, 0);
        r1.unref(r2);
        return C0829TC.f2620a;
    }

    private static final void register$lambda$18$lambda$17$lambda$16(Lua r1, int r2, DialogInterface r3, int r4) {
        r3.dismiss();
        LuaLocks.INSTANCE.withLock(r1, new C1083Z8(r1, r2, 3));
    }

    private static final C0829TC register$lambda$18$lambda$17$lambda$16$lambda$15(Lua r2, int r3) {
        r2.refGet(r3);
        r2.pushNil();
        r2.pCall(1, 0);
        r2.unref(r3);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$25(Lua r6) {
        AbstractC0295Gu.m625r(-540848051714101L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L6;
        r1 = AbstractC0295Gu.m625r(-540856641648693L);
    L6:
        if (r6.isTable(2) == true) goto L8;
    L18:
        return 0;
    L8:
        if (r6.isFunction(3) == false) goto L18;
        ArrayList r5 = new ArrayList();
        r6.pushValue(2);
        r6.pushNil();
    L12:
        if (r6.next(-2) == 0) goto L17;
        String r2 = r6.toString(-1);
        if (r2 == null) goto L16;
        r5.add(r2);
    L16:
        r6.pop(1);
        goto L12
    L17:
        r6.pop(1);
        r6.pushValue(3);
        int r0 = r6.ref();
        INSTANCE.runOnUiThread(new C1127a9(r1, r5, r6, r0));
        goto L18
    }

    private static final C0829TC register$lambda$25$lambda$24(String r3, List r4, Lua r5, int r6) {
        Activity r0 = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        if (r0 == null) goto L8;
        if (r0.isFinishing() == true) goto L8;
        new AlertDialog.Builder(r0).setTitle(r3).setItems((CharSequence[]) r4.toArray(new String[0]), new DialogInterfaceOnClickListenerC0825T8(r5, r6, r4, 0)).setNegativeButton(AbstractC0295Gu.m625r(-540835166812213L), new DialogInterfaceOnClickListenerC2179l8(r5, r6, 3)).show();
    L8:
        return C0829TC.f2620a;
    }

    private static final void register$lambda$25$lambda$24$lambda$21(final Lua r1, final int r2, final List r3, DialogInterface r4, final int r5) {
        r4.dismiss();
        LuaLocks.INSTANCE.withLock(r1, new C0997X8(r1, r2, r5, r3));
    }

    private static final C0829TC register$lambda$25$lambda$24$lambda$21$lambda$20(Lua r2, int r3, int r4, List r5) {
        r2.refGet(r3);
        r2.push(Double.valueOf(r4 + 1));
        r2.push((String) r5.get(r4));
        r2.pCall(2, 0);
        r2.unref(r3);
        return C0829TC.f2620a;
    }

    private static final void register$lambda$25$lambda$24$lambda$23(Lua r1, int r2, DialogInterface r3, int r4) {
        r3.dismiss();
        LuaLocks.INSTANCE.withLock(r1, new C1083Z8(r1, r2, 1));
    }

    private static final C0829TC register$lambda$25$lambda$24$lambda$23$lambda$22(Lua r2, int r3) {
        r2.refGet(r3);
        r2.pushNil();
        r2.pushNil();
        r2.pCall(2, 0);
        r2.unref(r3);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$26(Lua r7) {
        AbstractC0295Gu.m625r(-540860936615989L);
        String r1 = r7.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        CherryGlobalAPI r3 = CherryGlobalAPI.INSTANCE;
        Context r4 = r3.getCurrentActivity();
        if (r4 != null) goto L9;
        r4 = r3.getCurrentContext();
    L9:
        if (r4 != null) goto L15;
        r7.push(false);
    L14:
        return 1;
    L15:
        Intent r32 = new Intent(AbstractC0295Gu.m625r(-540869526550581L), Uri.parse(r1));     // Catch: Exception -> L12
        r32.addFlags(268435456);     // Catch: Exception -> L12
        r4.startActivity(r32);     // Catch: Exception -> L12
        r7.push(true);     // Catch: Exception -> L12
    L12:
        r7.push(false);
        goto L14
    }

    private static final int register$lambda$27(Lua r6) {
        AbstractC0295Gu.m625r(-540435734853685L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        CherryGlobalAPI r3 = CherryGlobalAPI.INSTANCE;
        Context r4 = r3.getCurrentActivity();
        if (r4 != null) goto L9;
        r4 = r3.getCurrentContext();
    L9:
        if (r4 != null) goto L15;
        r6.push(false);
    L14:
        return 1;
    L15:
        Intent r32 = new Intent();     // Catch: Exception -> L12
        r32.setClassName(r4.getPackageName(), r1);     // Catch: Exception -> L12
        r32.addFlags(268435456);     // Catch: Exception -> L12
        r4.startActivity(r32);     // Catch: Exception -> L12
        r6.push(true);     // Catch: Exception -> L12
    L12:
        r6.push(false);
        goto L14
    }

    private static final int register$lambda$28(Lua r2) {
        AbstractC0295Gu.m625r(-540444324788277L);
        Activity r0 = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        if (r0 == null) goto L5;
        r2.push(r0, Lua.Conversion.SEMI);
        return 1;
    L5:
        r2.pushNil();
        return 1;
    }

    private static final int register$lambda$29(Lua r2) {
        AbstractC0295Gu.m625r(-540452914722869L);
        CherryGlobalAPI r0 = CherryGlobalAPI.INSTANCE;
        Context r1 = r0.getCurrentActivity();
        if (r1 != null) goto L6;
        r1 = r0.getCurrentContext();
    L6:
        if (r1 == null) goto L8;
        r2.push(r1, Lua.Conversion.SEMI);
        return 1;
    L8:
        r2.pushNil();
        return 1;
    }

    private static final int register$lambda$32(Lua r5) {
        AbstractC0295Gu.m625r(-540461504657461L);
        if (r5.isFunction(1) == true) goto L5;
        return 0;
    L5:
        r5.pushValue(1);
        int r0 = r5.ref();
        INSTANCE.runOnUiThread(new C2087j8(r5, r0, 26));
        return 0;
    }

    private static final C0829TC register$lambda$32$lambda$31(Lua r3, int r4) {
        LuaLocks.INSTANCE.withLock(r3, new C2087j8(r3, r4, 27));
        return C0829TC.f2620a;
    }

    private static final C0829TC register$lambda$32$lambda$31$lambda$30(Lua r1, int r2) {
        r1.refGet(r2);
        r1.pCall(0, 0);
        r1.unref(r2);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$33(Lua r2) {
        AbstractC0295Gu.m625r(-540470094592053L);
        r2.push(AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper()));
        return 1;
    }

    private static final int register$lambda$41(Lua r6) {
        AbstractC0295Gu.m625r(-539168719501365L);
        if (r6.isTable(1) == false) goto L5;
        Map<String, Object> r1 = INSTANCE.readConfig(r6, 1);
    L6:
        CherryViewAPI r2 = INSTANCE;
        String r3 = r2.generateViewId();
        r2.runOnUiThread(new C0654P8(r3, r1, r6, 1));
        r6.push(r3);
        return 1;
    L5:
        r1 = C0495Lf.f1620a;
        goto L6
    }

    private static final C0829TC register$lambda$41$lambda$40(String r8, Map r9, Lua r10) {
        CherryGlobalAPI r0 = CherryGlobalAPI.INSTANCE;
        Context r1 = r0.getCurrentActivity();
        C0829TC r2 = C0829TC.f2620a;
        if (r1 != null) goto L8;
        r1 = r0.getCurrentContext();
        if (r1 != null) goto L8;
        return r2;
    L8:
        TextView r02 = new TextView(r1);
        Object r12 = r9.get(AbstractC0295Gu.m625r(-540478684526645L));
        Integer r4 = null;
        if ((r12 instanceof String) == false) goto L11;
        String r13 = (String) r12;
    L12:
        if (r13 != null) goto L15;
        r13 = AbstractC0295Gu.m625r(-540500159363125L);
    L15:
        r02.setText(r13);
        Object r14 = r9.get(AbstractC0295Gu.m625r(-540504454330421L));
        if ((r14 instanceof Number) == false) goto L18;
        Number r15 = (Number) r14;
    L19:
        if (r15 == null) goto L21;
        float r16 = r15.floatValue();
    L22:
        r02.setTextSize(r16);
        CherryViewAPI r17 = INSTANCE;
        Object r3 = r9.get(AbstractC0295Gu.m625r(-540543109036085L));
        if ((r3 instanceof String) == false) goto L25;
        String r32 = (String) r3;
    L26:
        r02.setTextColor(r17.parseColor(r32, -1));
        Object r33 = r9.get(AbstractC0295Gu.m625r(-540586058709045L));
        if ((r33 instanceof String) == false) goto L29;
        String r34 = (String) r33;
    L30:
        r02.setGravity(r17.parseGravity(r34));
        Object r35 = r9.get(AbstractC0295Gu.m625r(-540620418447413L));
        if ((r35 instanceof String) == false) goto L33;
        String r36 = (String) r35;
    L34:
        int r5 = 0;
        if (r36 == null) goto L37;
        r02.setBackgroundColor(r17.parseColor(r36, 0));
    L37:
        Object r37 = r9.get(AbstractC0295Gu.m625r(-539039870482485L));
        if ((r37 instanceof Number) == false) goto L40;
        Number r38 = (Number) r37;
    L41:
        if (r38 == null) goto L43;
        r5 = r17.m3294dp(r38.intValue());
    L43:
        r02.setPadding(r5, r5, r5, r5);
        if (AbstractC0585Nj.m1134a(r9.get(AbstractC0295Gu.m625r(-539074230220853L)), Boolean.TRUE) == false) goto L46;
        r02.setTypeface(Typeface.DEFAULT_BOLD);
    L46:
        Object r18 = r9.get(AbstractC0295Gu.m625r(-539095705057333L));
        if ((r18 instanceof Number) == false) goto L49;
        Number r19 = (Number) r18;
    L50:
        if (r19 == null) goto L52;
        r02.setMaxLines(r19.intValue());
    L52:
        Object r92 = r9.get(AbstractC0295Gu.m625r(-539134359762997L));
        if ((r92 instanceof Integer) == false) goto L55;
        r4 = (Integer) r92;
    L55:
        if (r4 == null) goto L57;
        r02.setOnClickListener(new ViewOnClickListenerC0482L8(r10, r4.intValue(), r8, 2));
    L57:
        viewRefs.put(r8, r02);
        return r2;
    L49:
        r19 = null;
        goto L50
    L40:
        r38 = null;
        goto L41
    L33:
        r36 = null;
        goto L34
    L29:
        r34 = null;
        goto L30
    L25:
        r32 = null;
        goto L26
    L21:
        r16 = 14.0f;
        goto L22
    L18:
        r15 = null;
        goto L19
    L11:
        r13 = null;
        goto L12
    }

    private static final void register$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37(Lua r2, int r3, String r4, View r5) {
        LuaLocks.INSTANCE.withLock(r2, new C0181E8(r2, r3, r4, 2));
    }

    /* JADX INFO: renamed from: register$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36 */
    private static final C0829TC m3325xed14eec4(Lua r0, int r1, String r2) {
        r0.refGet(r1);
        r0.push(r2);
        r0.pCall(1, 0);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$49(Lua r6) {
        AbstractC0295Gu.m625r(-539615396100149L);
        if (r6.isTable(1) == false) goto L5;
        Map<String, Object> r1 = INSTANCE.readConfig(r6, 1);
    L6:
        CherryViewAPI r2 = INSTANCE;
        String r3 = r2.generateViewId();
        r2.runOnUiThread(new C0654P8(r3, r1, r6, 0));
        r6.push(r3);
        return 1;
    L5:
        r1 = C0495Lf.f1620a;
        goto L6
    }

    private static final C0829TC register$lambda$49$lambda$48(String r7, Map r8, Lua r9) {
        CherryGlobalAPI r0 = CherryGlobalAPI.INSTANCE;
        Context r1 = r0.getCurrentActivity();
        C0829TC r2 = C0829TC.f2620a;
        if (r1 != null) goto L8;
        r1 = r0.getCurrentContext();
        if (r1 != null) goto L8;
        return r2;
    L8:
        ImageView r02 = new ImageView(r1);
        Object r12 = r8.get(AbstractC0295Gu.m625r(-539177309435957L));
        Integer r4 = null;
        if ((r12 instanceof String) == false) goto L11;
        String r13 = (String) r12;
    L12:
        if (r13 != null) goto L14;
    L22:
        Object r14 = r8.get(AbstractC0295Gu.m625r(-539267503749173L));
        if ((r14 instanceof String) == false) goto L25;
        String r15 = (String) r14;
    L26:
        if (r15 != null) goto L28;
    L50:
        ImageView.ScaleType r16 = ImageView.ScaleType.FIT_CENTER;
    L51:
        r02.setScaleType(r16);
        Object r17 = r8.get(AbstractC0295Gu.m625r(-538962561071157L));
        if ((r17 instanceof String) == false) goto L54;
        String r18 = (String) r17;
    L55:
        if (r18 == null) goto L57;
        r02.setBackgroundColor(INSTANCE.parseColor(r18, 0));
    L57:
        Object r82 = r8.get(AbstractC0295Gu.m625r(-539031280547893L));
        if ((r82 instanceof Integer) == false) goto L60;
        r4 = (Integer) r82;
    L60:
        if (r4 == null) goto L62;
        r02.setOnClickListener(new ViewOnClickListenerC0482L8(r9, r4.intValue(), r7, 1));
    L62:
        viewRefs.put(r7, r02);
        return r2;
    L54:
        r18 = null;
        goto L55
    L28:
        switch(r15.hashCode()) {
            case -1364013995: goto L47;
            case -340708175: goto L43;
            case 97441490: goto L39;
            case 520762310: goto L35;
            case 1161480325: goto L31;
            default: goto L50;
        };
    L31:
        if (r15.equals(AbstractC0295Gu.m625r(-538915316430901L)) == false) goto L50;
        r16 = ImageView.ScaleType.CENTER_CROP;
        goto L51
    L35:
        if (r15.equals(AbstractC0295Gu.m625r(-538846596954165L)) == false) goto L50;
        r16 = ImageView.ScaleType.FIT_CENTER;
        goto L51
    L39:
        if (r15.equals(AbstractC0295Gu.m625r(-538889546627125L)) == false) goto L50;
        r16 = ImageView.ScaleType.FIT_XY;
        goto L51
    L43:
        if (r15.equals(AbstractC0295Gu.m625r(-539310453422133L)) == false) goto L50;
        r16 = ImageView.ScaleType.CENTER_INSIDE;
        goto L51
    L47:
        if (r15.equals(AbstractC0295Gu.m625r(-538816532183093L)) == false) goto L50;
        r16 = ImageView.ScaleType.CENTER;
        goto L51
    L25:
        r15 = null;
        goto L26
    L14:
        if (r13.startsWith(AbstractC0295Gu.m625r(-539194489305141L)) == false) goto L16;
    L21:
        INSTANCE.loadImageFromUrl(r02, r13);
        goto L22
    L16:
        if (r13.startsWith(AbstractC0295Gu.m625r(-539228849043509L)) == true) goto L21;
        if (new File(r13).exists() == false) goto L22;
        r02.setImageBitmap(BitmapFactory.decodeFile(r13));
        goto L22
    L11:
        r13 = null;
        goto L12
    }

    private static final void register$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45(Lua r2, int r3, String r4, View r5) {
        LuaLocks.INSTANCE.withLock(r2, new C0181E8(r2, r3, r4, 3));
    }

    /* JADX INFO: renamed from: register$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44 */
    private static final C0829TC m3326x1809f3c8(Lua r0, int r1, String r2) {
        r0.refGet(r1);
        r0.push(r2);
        r0.pCall(1, 0);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$5(Lua r7) {
        AbstractC0295Gu.m625r(-540723497662517L);
        String r0 = r7.toString(1);
        if (r0 != null) goto L5;
        r0 = AbstractC0295Gu.m625r(-540732087597109L);
    L5:
        String r2 = r0;
        String r02 = r7.toString(2);
        if (r02 != null) goto L8;
        r02 = AbstractC0295Gu.m625r(-540736382564405L);
    L8:
        String r3 = r02;
        if (r7.getTop() >= 3) goto L11;
    L14:
        int r03 = -1;
    L13:
        int r4 = r03;
        INSTANCE.runOnUiThread(new C2265n8(r2, r3, r4, r7, 3));
        return 0;
    L11:
        if (r7.isFunction(3) == false) goto L14;
        r7.pushValue(3);
        r03 = r7.ref();
        goto L13
    }

    private static final C0829TC register$lambda$5$lambda$4(String r2, String r3, int r4, Lua r5) {
        Activity r0 = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        if (r0 == null) goto L8;
        if (r0.isFinishing() == true) goto L8;
        new AlertDialog.Builder(r0).setTitle(r2).setMessage(r3).setPositiveButton(AbstractC0295Gu.m625r(-540710612760629L), new DialogInterfaceOnClickListenerC2179l8(r4, r5, 6)).show();
    L8:
        return C0829TC.f2620a;
    }

    private static final void register$lambda$5$lambda$4$lambda$3(int r1, Lua r2, DialogInterface r3, int r4) {
        r3.dismiss();
        if (r1 == (-1)) goto L6;
        LuaLocks.INSTANCE.withLock(r2, new C2087j8(r2, r1, 28));
        return;
    }

    private static final C0829TC register$lambda$5$lambda$4$lambda$3$lambda$2(Lua r2, int r3) {
        r2.refGet(r3);
        r2.push(true);
        r2.pCall(1, 0);
        r2.unref(r3);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$56(Lua r6) {
        AbstractC0295Gu.m625r(-539435007473717L);
        if (r6.isTable(1) == false) goto L5;
        Map<String, Object> r1 = INSTANCE.readConfig(r6, 1);
    L6:
        CherryViewAPI r2 = INSTANCE;
        String r3 = r2.generateViewId();
        r2.runOnUiThread(new C0654P8(r3, r1, r6, 2));
        r6.push(r3);
        return 1;
    L5:
        r1 = C0495Lf.f1620a;
        goto L6
    }

    private static final C0829TC register$lambda$56$lambda$55(String r7, Map r8, Lua r9) {
        CherryGlobalAPI r0 = CherryGlobalAPI.INSTANCE;
        Context r1 = r0.getCurrentActivity();
        C0829TC r2 = C0829TC.f2620a;
        if (r1 != null) goto L8;
        r1 = r0.getCurrentContext();
        if (r1 != null) goto L8;
        return r2;
    L8:
        Button r02 = new Button(r1);
        Object r12 = r8.get(AbstractC0295Gu.m625r(-539623986034741L));
        Integer r4 = null;
        if ((r12 instanceof String) == false) goto L11;
        String r13 = (String) r12;
    L12:
        if (r13 != null) goto L15;
        r13 = AbstractC0295Gu.m625r(-539645460871221L);
    L15:
        r02.setText(r13);
        Object r14 = r8.get(AbstractC0295Gu.m625r(-539675525642293L));
        if ((r14 instanceof Number) == false) goto L18;
        Number r15 = (Number) r14;
    L19:
        if (r15 == null) goto L21;
        float r16 = r15.floatValue();
    L22:
        r02.setTextSize(r16);
        CherryViewAPI r17 = INSTANCE;
        Object r3 = r8.get(AbstractC0295Gu.m625r(-539714180347957L));
        if ((r3 instanceof String) == false) goto L25;
        String r32 = (String) r3;
    L26:
        r02.setTextColor(r17.parseColor(r32, -1));
        Object r33 = r8.get(AbstractC0295Gu.m625r(-539757130020917L));
        if ((r33 instanceof String) == false) goto L29;
        String r34 = (String) r33;
    L30:
        int r35 = r17.parseColor(r34, Color.parseColor(AbstractC0295Gu.m625r(-539825849497653L)));
        Object r5 = r8.get(AbstractC0295Gu.m625r(-539860209236021L));
        if ((r5 instanceof Number) == false) goto L33;
        Number r52 = (Number) r5;
    L34:
        if (r52 == null) goto L37;
        float r53 = r52.floatValue();
    L36:
        float r54 = r17.m3293dp(r53);
        GradientDrawable r6 = new GradientDrawable();
        r6.setColor(r35);
        r6.setCornerRadius(r54);
        r02.setBackground(r6);
        Object r36 = r8.get(AbstractC0295Gu.m625r(-539366287996981L));
        if ((r36 instanceof Number) == false) goto L41;
        Number r37 = (Number) r36;
    L42:
        if (r37 == null) goto L45;
        int r38 = r37.intValue();
    L44:
        int r18 = r17.m3294dp(r38);
        int r39 = r18 / 2;
        r02.setPadding(r18, r39, r18, r39);
        r02.setAllCaps(false);
        Object r82 = r8.get(AbstractC0295Gu.m625r(-539400647735349L));
        if ((r82 instanceof Integer) == false) goto L49;
        r4 = (Integer) r82;
    L49:
        if (r4 == null) goto L51;
        r02.setOnClickListener(new ViewOnClickListenerC0482L8(r9, r4.intValue(), r7, 0));
    L51:
        viewRefs.put(r7, r02);
        return r2;
    L45:
        r38 = 12;
        goto L44
    L41:
        r37 = null;
        goto L42
    L37:
        r53 = 8.0f;
        goto L36
    L33:
        r52 = null;
        goto L34
    L29:
        r34 = null;
        goto L30
    L25:
        r32 = null;
        goto L26
    L21:
        r16 = 14.0f;
        goto L22
    L18:
        r15 = null;
        goto L19
    L11:
        r13 = null;
        goto L12
    }

    private static final void register$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52(Lua r2, int r3, String r4, View r5) {
        LuaLocks.INSTANCE.withLock(r2, new C0181E8(r2, r3, r4, 4));
    }

    /* JADX INFO: renamed from: register$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$lambda$51 */
    private static final C0829TC m3327xcffa3770(Lua r0, int r1, String r2) {
        r0.refGet(r1);
        r0.push(r2);
        r0.pCall(1, 0);
        return C0829TC.f2620a;
    }

    private static final int register$lambda$61(Lua r6) {
        AbstractC0295Gu.m625r(-538159402186805L);
        if (r6.isTable(1) == false) goto L5;
        Map<String, Object> r1 = INSTANCE.readConfig(r6, 1);
    L6:
        CherryViewAPI r2 = INSTANCE;
        String r3 = r2.generateViewId();
        r2.runOnUiThread(new C0568N8(r3, r1, 4));
        r6.push(r3);
        return 1;
    L5:
        r1 = C0495Lf.f1620a;
        goto L6
    }

    private static final C0829TC register$lambda$61$lambda$60(String r7, Map r8) {
        CherryGlobalAPI r0 = CherryGlobalAPI.INSTANCE;
        Context r1 = r0.getCurrentActivity();
        C0829TC r2 = C0829TC.f2620a;
        if (r1 != null) goto L8;
        r1 = r0.getCurrentContext();
        if (r1 != null) goto L8;
        return r2;
    L8:
        EditText r02 = new EditText(r1);
        Object r12 = r8.get(AbstractC0295Gu.m625r(-539443597408309L));
        Number r4 = null;
        if ((r12 instanceof String) == false) goto L11;
        String r13 = (String) r12;
    L12:
        if (r13 != null) goto L14;
        r13 = AbstractC0295Gu.m625r(-539465072244789L);
    L14:
        r02.setText(r13);
        Object r14 = r8.get(AbstractC0295Gu.m625r(-539469367212085L));
        if ((r14 instanceof String) == false) goto L17;
        String r15 = (String) r14;
    L18:
        if (r15 != null) goto L21;
        r15 = AbstractC0295Gu.m625r(-539490842048565L);
    L21:
        r02.setHint(r15);
        Object r16 = r8.get(AbstractC0295Gu.m625r(-539495137015861L));
        if ((r16 instanceof Number) == false) goto L24;
        Number r17 = (Number) r16;
    L25:
        if (r17 == null) goto L27;
        float r18 = r17.floatValue();
    L28:
        r02.setTextSize(r18);
        CherryViewAPI r19 = INSTANCE;
        Object r3 = r8.get(AbstractC0295Gu.m625r(-539533791721525L));
        if ((r3 instanceof String) == false) goto L31;
        String r32 = (String) r3;
    L32:
        r02.setTextColor(r19.parseColor(r32, -1));
        Object r33 = r8.get(AbstractC0295Gu.m625r(-539576741394485L));
        if ((r33 instanceof String) == false) goto L35;
        String r34 = (String) r33;
    L36:
        r02.setHintTextColor(r19.parseColor(r34, -7829368));
        Object r35 = r8.get(AbstractC0295Gu.m625r(-537970423625781L));
        if ((r35 instanceof String) == false) goto L39;
        String r36 = (String) r35;
    L40:
        if (r36 == null) goto L42;
        r02.setBackgroundColor(r19.parseColor(r36, 0));
    L42:
        Object r37 = r8.get(AbstractC0295Gu.m625r(-538039143102517L));
        if ((r37 instanceof Number) == false) goto L45;
        Number r38 = (Number) r37;
    L46:
        if (r38 == null) goto L49;
        int r39 = r38.intValue();
    L48:
        int r110 = r19.m3294dp(r39);
        r02.setPadding(r110, r110, r110, r110);
        Object r111 = r8.get(AbstractC0295Gu.m625r(-538073502840885L));
        if ((r111 instanceof Number) == false) goto L53;
        r4 = (Number) r111;
    L53:
        if (r4 == null) goto L55;
        r02.setMaxLines(r4.intValue());
    L55:
        r02.setSingleLine(AbstractC0585Nj.m1134a(r8.get(AbstractC0295Gu.m625r(-538112157546549L)), Boolean.TRUE));
        viewRefs.put(r7, r02);
        return r2;
    L49:
        r39 = 8;
        goto L48
    L45:
        r38 = null;
        goto L46
    L39:
        r36 = null;
        goto L40
    L35:
        r34 = null;
        goto L36
    L31:
        r32 = null;
        goto L32
    L27:
        r18 = 14.0f;
        goto L28
    L24:
        r17 = null;
        goto L25
    L17:
        r15 = null;
        goto L18
    L11:
        r13 = null;
        goto L12
    }

    private static final int register$lambda$65(Lua r6) {
        AbstractC0295Gu.m625r(-537854459508789L);
        if (r6.isTable(1) == false) goto L5;
        Map<String, Object> r1 = INSTANCE.readConfig(r6, 1);
    L6:
        CherryViewAPI r2 = INSTANCE;
        String r3 = r2.generateViewId();
        r2.runOnUiThread(new C0568N8(r3, r1, 3));
        r6.push(r3);
        return 1;
    L5:
        r1 = C0495Lf.f1620a;
        goto L6
    }

    private static final C0829TC register$lambda$65$lambda$64(String r8, Map r9) {
        CherryGlobalAPI r0 = CherryGlobalAPI.INSTANCE;
        Context r1 = r0.getCurrentActivity();
        C0829TC r2 = C0829TC.f2620a;
        if (r1 != null) goto L8;
        r1 = r0.getCurrentContext();
        if (r1 != null) goto L8;
        return r2;
    L8:
        LinearLayout r02 = new LinearLayout(r1);
        r02.setOrientation(!AbstractC0585Nj.m1134a(r9.get(AbstractC0295Gu.m625r(-538167992121397L)), AbstractC0295Gu.m625r(-537669775915061L)) ? 1 : 0);
        CherryViewAPI r12 = INSTANCE;
        Object r3 = r9.get(AbstractC0295Gu.m625r(-537717020555317L));
        Number r5 = null;
        if ((r3 instanceof String) == false) goto L11;
        String r32 = (String) r3;
    L12:
        r02.setGravity(r12.parseGravity(r32));
        Object r33 = r9.get(AbstractC0295Gu.m625r(-537751380293685L));
        if ((r33 instanceof String) == false) goto L15;
        String r34 = (String) r33;
    L16:
        int r4 = 0;
        if (r34 == null) goto L19;
        r02.setBackgroundColor(r12.parseColor(r34, 0));
    L19:
        Object r92 = r9.get(AbstractC0295Gu.m625r(-537820099770421L));
        if ((r92 instanceof Number) == false) goto L22;
        r5 = (Number) r92;
    L22:
        if (r5 == null) goto L24;
        r4 = r12.m3294dp(r5.intValue());
    L24:
        r02.setPadding(r4, r4, r4, r4);
        viewRefs.put(r8, r02);
        return r2;
    L15:
        r34 = null;
        goto L16
    L11:
        r32 = null;
        goto L12
    }

    private static final int register$lambda$69(Lua r6) {
        AbstractC0295Gu.m625r(-538515884472373L);
        if (r6.isTable(1) == false) goto L5;
        Map<String, Object> r1 = INSTANCE.readConfig(r6, 1);
    L6:
        CherryViewAPI r2 = INSTANCE;
        String r3 = r2.generateViewId();
        r2.runOnUiThread(new C0568N8(r3, r1, 2));
        r6.push(r3);
        return 1;
    L5:
        r1 = C0495Lf.f1620a;
        goto L6
    }

    private static final C0829TC register$lambda$69$lambda$68(String r7, Map r8) {
        CherryGlobalAPI r0 = CherryGlobalAPI.INSTANCE;
        Context r1 = r0.getCurrentActivity();
        C0829TC r2 = C0829TC.f2620a;
        if (r1 != null) goto L8;
        r1 = r0.getCurrentContext();
        if (r1 != null) goto L8;
        return r2;
    L8:
        FrameLayout r02 = new FrameLayout(r1);
        Object r12 = r8.get(AbstractC0295Gu.m625r(-537863049443381L));
        Number r4 = null;
        if ((r12 instanceof String) == false) goto L11;
        String r13 = (String) r12;
    L12:
        int r3 = 0;
        if (r13 == null) goto L15;
        r02.setBackgroundColor(INSTANCE.parseColor(r13, 0));
    L15:
        Object r82 = r8.get(AbstractC0295Gu.m625r(-537931768920117L));
        if ((r82 instanceof Number) == false) goto L18;
        r4 = (Number) r82;
    L18:
        if (r4 == null) goto L20;
        r3 = INSTANCE.m3294dp(r4.intValue());
    L20:
        r02.setPadding(r3, r3, r3, r3);
        viewRefs.put(r7, r02);
        return r2;
    L11:
        r13 = null;
        goto L12
    }

    private static final int register$lambda$73(Lua r6) {
        AbstractC0295Gu.m625r(-538649028458549L);
        if (r6.isTable(1) == false) goto L5;
        Map<String, Object> r1 = INSTANCE.readConfig(r6, 1);
    L6:
        CherryViewAPI r2 = INSTANCE;
        String r3 = r2.generateViewId();
        r2.runOnUiThread(new C0568N8(r3, r1, 0));
        r6.push(r3);
        return 1;
    L5:
        r1 = C0495Lf.f1620a;
        goto L6
    }

    private static final C0829TC register$lambda$73$lambda$72(String r5, Map r6) {
        CherryGlobalAPI r0 = CherryGlobalAPI.INSTANCE;
        Context r1 = r0.getCurrentActivity();
        C0829TC r2 = C0829TC.f2620a;
        if (r1 != null) goto L8;
        r1 = r0.getCurrentContext();
        if (r1 != null) goto L8;
        return r2;
    L8:
        ScrollView r02 = new ScrollView(r1);
        r02.setFillViewport(!AbstractC0585Nj.m1134a(r6.get(AbstractC0295Gu.m625r(-538524474406965L)), Boolean.FALSE));
        Object r62 = r6.get(AbstractC0295Gu.m625r(-538580308981813L));
        if ((r62 instanceof String) == false) goto L11;
        String r63 = (String) r62;
    L12:
        if (r63 == null) goto L14;
        r02.setBackgroundColor(INSTANCE.parseColor(r63, 0));
    L14:
        viewRefs.put(r5, r02);
        return r2;
    L11:
        r63 = null;
        goto L12
    }

    private static final int register$lambda$77(Lua r6) {
        AbstractC0295Gu.m625r(-537485092321333L);
        String r0 = r6.toString(1);
        if (r0 == null) goto L7;
        String r2 = r6.toString(2);
        if (r2 == null) goto L7;
        if (r6.getTop() >= 3) goto L11;
    L13:
        Map<String, Object> r62 = C0495Lf.f1620a;
    L14:
        INSTANCE.runOnUiThread(new C0525M8(r0, r2, r62, 0));
        return 0;
    L11:
        if (r6.isTable(3) == false) goto L13;
        r62 = INSTANCE.readConfig(r6, 3);
    L7:
        return 0;
    }

    private static final C0829TC register$lambda$77$lambda$76(String r8, String r9, Map r10) {
        ConcurrentHashMap<String, View> r0 = viewRefs;
        View r82 = r0.get(r8);
        ViewGroup r2 = null;
        if ((r82 instanceof ViewGroup) == false) goto L5;
        ViewGroup r83 = (ViewGroup) r82;
    L6:
        C0829TC r1 = C0829TC.f2620a;
        if (r83 != null) goto L9;
        return r1;
    L9:
        View r92 = r0.get(r9);
        if (r92 != null) goto L12;
        return r1;
    L12:
        Object r02 = r10.get(AbstractC0295Gu.m625r(-538657618393141L));
        int r4 = -1;
        if (AbstractC0585Nj.m1134a(r02, AbstractC0295Gu.m625r(-538683388196917L)) == false) goto L15;
    L26:
        int r03 = -1;
    L27:
        Object r3 = r10.get(AbstractC0295Gu.m625r(-536888091867189L));
        if (AbstractC0585Nj.m1134a(r3, AbstractC0295Gu.m625r(-536918156638261L)) == false) goto L30;
    L41:
        int r5 = 0;
        if ((r83 instanceof LinearLayout) == false) goto L62;
        LinearLayout.LayoutParams r32 = new LinearLayout.LayoutParams(r03, r4);
        Object r04 = r10.get(AbstractC0295Gu.m625r(-536776422717493L));
        if ((r04 instanceof Number) == false) goto L46;
        Number r05 = (Number) r04;
    L47:
        if (r05 == null) goto L49;
        float r06 = r05.floatValue();
    L50:
        r32.weight = r06;
        Object r07 = r10.get(AbstractC0295Gu.m625r(-536806487488565L));
        if ((r07 instanceof Number) == false) goto L53;
        Number r08 = (Number) r07;
    L54:
        if (r08 == null) goto L56;
        r5 = INSTANCE.m3294dp(r08.intValue());
    L56:
        r32.setMargins(r5, r5, r5, r5);
        CherryViewAPI r09 = INSTANCE;
        Object r102 = r10.get(AbstractC0295Gu.m625r(-536836552259637L));
        if ((r102 instanceof String) == false) goto L59;
        String r103 = (String) r102;
    L60:
        r32.gravity = r09.parseGravity(r103);
        ViewGroup.LayoutParams r33 = r32;
    L75:
        ViewParent r104 = r92.getParent();
        if ((r104 instanceof ViewGroup) == false) goto L78;
        r2 = (ViewGroup) r104;
    L78:
        if (r2 == null) goto L80;
        r2.removeView(r92);
    L80:
        r83.addView(r92, r33);
        return r1;
    L59:
        r103 = null;
        goto L60
    L53:
        r08 = null;
        goto L54
    L49:
        r06 = 0.0f;
        goto L50
    L46:
        r05 = null;
        goto L47
    L62:
        if ((r83 instanceof FrameLayout) == false) goto L74;
        FrameLayout.LayoutParams r34 = new FrameLayout.LayoutParams(r03, r4);
        Object r010 = r10.get(AbstractC0295Gu.m625r(-537420667811893L));
        if ((r010 instanceof Number) == false) goto L66;
        Number r011 = (Number) r010;
    L67:
        if (r011 == null) goto L69;
        r5 = INSTANCE.m3294dp(r011.intValue());
    L69:
        r34.setMargins(r5, r5, r5, r5);
        CherryViewAPI r012 = INSTANCE;
        Object r105 = r10.get(AbstractC0295Gu.m625r(-537450732582965L));
        if ((r105 instanceof String) == false) goto L72;
        String r106 = (String) r105;
    L73:
        r34.gravity = r012.parseGravity(r106);
        r33 = r34;
        goto L75
    L72:
        r106 = null;
        goto L73
    L66:
        r011 = null;
        goto L67
    L74:
        r33 = new ViewGroup.LayoutParams(r03, r4);
        goto L75
    L30:
        if (AbstractC0585Nj.m1134a(r3, AbstractC0295Gu.m625r(-536943926442037L)) == true) goto L41;
        if (AbstractC0585Nj.m1134a(r3, AbstractC0295Gu.m625r(-536999761016885L)) == false) goto L35;
    L40:
        r4 = -2;
        goto L41
    L35:
        if (AbstractC0585Nj.m1134a(r3, AbstractC0295Gu.m625r(-537021235853365L)) == true) goto L40;
        if ((r3 instanceof Number) == false) goto L40;
        CherryViewAPI r35 = INSTANCE;
        Object r42 = r10.get(AbstractC0295Gu.m625r(-537077070428213L));
        AbstractC0295Gu.m625r(-537107135199285L);
        r4 = r35.m3294dp(((Number) r42).intValue());
        goto L41
    L15:
        if (AbstractC0585Nj.m1134a(r02, AbstractC0295Gu.m625r(-538709158000693L)) == true) goto L26;
        if (AbstractC0585Nj.m1134a(r02, AbstractC0295Gu.m625r(-538215236761653L)) == false) goto L20;
    L25:
        r03 = -2;
        goto L27
    L20:
        if (AbstractC0585Nj.m1134a(r02, AbstractC0295Gu.m625r(-538236711598133L)) == true) goto L25;
        if ((r02 instanceof Number) == false) goto L25;
        CherryViewAPI r013 = INSTANCE;
        Object r36 = r10.get(AbstractC0295Gu.m625r(-538292546172981L));
        AbstractC0295Gu.m625r(-538318315976757L);
        r03 = r013.m3294dp(((Number) r36).intValue());
        goto L27
    L5:
        r83 = null;
        goto L6
    }

    private static final int register$lambda$79(Lua r5) {
        AbstractC0295Gu.m625r(-537493682255925L);
        String r0 = r5.toString(1);
        if (r0 == null) goto L7;
        String r52 = r5.toString(2);
        if (r52 == null) goto L7;
        INSTANCE.runOnUiThread(new C0611O8(4, r0, r52));
        return 0;
    L7:
        return 0;
    }

    private static final C0829TC register$lambda$79$lambda$78(String r2, String r3) {
        ConcurrentHashMap<String, View> r0 = viewRefs;
        View r22 = r0.get(r2);
        if ((r22 instanceof ViewGroup) == false) goto L5;
        ViewGroup r23 = (ViewGroup) r22;
    L6:
        C0829TC r1 = C0829TC.f2620a;
        if (r23 != null) goto L9;
        return r1;
    L9:
        View r32 = r0.get(r3);
        if (r32 != null) goto L12;
        return r1;
    L12:
        r23.removeView(r32);
        return r1;
    L5:
        r23 = null;
        goto L6
    }

    private static final int register$lambda$81(Lua r5) {
        AbstractC0295Gu.m625r(-537502272190517L);
        String r0 = r5.toString(1);
        if (r0 != null) goto L5;
        return 0;
    L5:
        String r52 = r5.toString(2);
        if (r52 != null) goto L8;
        r52 = AbstractC0295Gu.m625r(-537510862125109L);
    L8:
        INSTANCE.runOnUiThread(new C0611O8(3, r0, r52));
        return 0;
    }

    private static final C0829TC register$lambda$81$lambda$80(String r1, String r2) {
        View r12 = viewRefs.get(r1);
        if ((r12 instanceof TextView) == false) goto L6;
        ((TextView) r12).setText(r2);
    L6:
        return C0829TC.f2620a;
    }

    private static final int register$lambda$82(Lua r3) {
        AbstractC0295Gu.m625r(-537515157092405L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        View r12 = viewRefs.get(r1);
        if ((r12 instanceof TextView) == false) goto L9;
        r3.push(((TextView) r12).getText().toString());
    L10:
        return 1;
    L9:
        r3.pushNil();
        goto L10
    }

    private static final int register$lambda$84(Lua r4) {
        AbstractC0295Gu.m625r(-537523747026997L);
        final String r0 = r4.toString(1);
        if (r0 != null) goto L5;
        return 0;
    L5:
        final boolean r42 = r4.toBoolean(2);
        INSTANCE.runOnUiThread(new C1040Y8(r0, r42));
        return 0;
    }

    private static final C0829TC register$lambda$84$lambda$83(String r1, boolean r2) {
        View r12 = viewRefs.get(r1);
        if (r12 == null) goto L9;
        if (r2 == false) goto L6;
        int r22 = 0;
    L7:
        r12.setVisibility(r22);
        goto L9
    L6:
        r22 = 8;
    L9:
        return C0829TC.f2620a;
    }

    private static final int register$lambda$86(Lua r5) {
        AbstractC0295Gu.m625r(-537532336961589L);
        String r0 = r5.toString(1);
        if (r0 != null) goto L5;
        return 0;
    L5:
        String r52 = r5.toString(2);
        if (r52 != null) goto L8;
        r52 = AbstractC0295Gu.m625r(-537540926896181L);
    L8:
        INSTANCE.runOnUiThread(new C0611O8(2, r0, r52));
        return 0;
    }

    private static final C0829TC register$lambda$86$lambda$85(String r2, String r3) {
        View r22 = viewRefs.get(r2);
        if (r22 == null) goto L6;
        r22.setBackgroundColor(INSTANCE.parseColor(r3, -1));
    L6:
        return C0829TC.f2620a;
    }

    private static final int register$lambda$87(Lua r3) {
        AbstractC0295Gu.m625r(-537575286634549L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        View r12 = viewRefs.get(r1);
        if (r12 == null) goto L9;
        r3.push(r12, Lua.Conversion.SEMI);
    L10:
        return 1;
    L9:
        r3.pushNil();
        goto L10
    }

    private static final int register$lambda$89(Lua r5) {
        AbstractC0295Gu.m625r(-537656891013173L);
        String r0 = r5.toString(1);
        if (r0 == null) goto L7;
        String r52 = r5.toString(2);
        if (r52 == null) goto L7;
        INSTANCE.runOnUiThread(new C0611O8(5, r0, r52));
        return 0;
    L7:
        return 0;
    }

    private static final C0829TC register$lambda$89$lambda$88(String r3, String r4) {
        View r32 = viewRefs.get(r3);
        if ((r32 instanceof ImageView) == false) goto L5;
        ImageView r33 = (ImageView) r32;
    L6:
        C0829TC r0 = C0829TC.f2620a;
        if (r33 != null) goto L10;
    L17:
        return r0;
    L10:
        if (r4.startsWith(AbstractC0295Gu.m625r(-537583876569141L)) == false) goto L12;
    L18:
        INSTANCE.loadImageFromUrl(r33, r4);
        return r0;
    L12:
        if (r4.startsWith(AbstractC0295Gu.m625r(-537618236307509L)) == true) goto L18;
        if (new File(r4).exists() == false) goto L17;
        r33.setImageBitmap(BitmapFactory.decodeFile(r4));
        goto L17
    L5:
        r33 = null;
        goto L6
    }

    private static final int register$lambda$92(Lua r4) {
        AbstractC0295Gu.m625r(-537115725133877L);
        String r42 = r4.toString(1);
        if (r42 != null) goto L5;
        return 0;
    L5:
        INSTANCE.runOnUiThread(new C0782S8(r42, 1));
        return 0;
    }

    private static final C0829TC register$lambda$92$lambda$91(String r2) {
        View r22 = viewRefs.remove(r2);
        if (r22 == null) goto L11;
        ViewParent r0 = r22.getParent();
        if ((r0 instanceof ViewGroup) == false) goto L7;
        ViewGroup r02 = (ViewGroup) r0;
    L8:
        if (r02 == null) goto L11;
        r02.removeView(r22);
        goto L11
    L7:
        r02 = null;
    L11:
        return C0829TC.f2620a;
    }

    private static final int register$lambda$99(Lua r5) {
        AbstractC0295Gu.m625r(-307781651396661L);
        if (r5.isTable(1) == false) goto L5;
        Map<String, Object> r1 = INSTANCE.readConfig(r5, 1);
    L6:
        String r2 = AbstractC0295Gu.m625r(-307790241331253L) + windowIdCounter.incrementAndGet();
        INSTANCE.runOnUiThreadSync(new C0568N8(r2, r1));
        r5.push(r2);
        return 1;
    L5:
        r1 = C0495Lf.f1620a;
        goto L6
    }

    private static final C0829TC register$lambda$99$lambda$98(Map r19, String r20) {
        CherryGlobalAPI r1 = CherryGlobalAPI.INSTANCE;
        Context r2 = r1.getCurrentActivity();
        C0829TC r3 = C0829TC.f2620a;
        if (r2 == null) goto L5;
    L4:
        final Context r5 = r2;
        Object r12 = r19.get(AbstractC0295Gu.m625r(-307081571727413L));
        String r4 = null;
        if ((r12 instanceof Number) == false) goto L11;
        Number r13 = (Number) r12;
    L12:
        int r22 = -2;
        if (r13 == null) goto L15;
        int r7 = INSTANCE.m3294dp(r13.intValue());
    L16:
        Object r14 = r19.get(AbstractC0295Gu.m625r(-307107341531189L));
        if ((r14 instanceof Number) == false) goto L19;
        Number r15 = (Number) r14;
    L20:
        if (r15 == null) goto L22;
        r22 = INSTANCE.m3294dp(r15.intValue());
    L22:
        int r8 = r22;
        Object r16 = r19.get(AbstractC0295Gu.m625r(-307137406302261L));
        if ((r16 instanceof Number) == false) goto L25;
        Number r17 = (Number) r16;
    L26:
        if (r17 == null) goto L28;
        int r18 = r17.intValue();
    L29:
        Object r23 = r19.get(AbstractC0295Gu.m625r(-307145996236853L));
        if ((r23 instanceof Number) == false) goto L32;
        Number r24 = (Number) r23;
    L33:
        if (r24 == null) goto L35;
        int r25 = r24.intValue();
    L36:
        boolean r122 = AbstractC0585Nj.m1134a(r19.get(AbstractC0295Gu.m625r(-307154586171445L)), Boolean.FALSE);
        final WindowManager.LayoutParams r162 = new WindowManager.LayoutParams(r7, r8, 2038, 520, -3);
        r162.gravity = 8388659;
        r162.x = r18;
        r162.y = r25;
        final FrameLayout r152 = new FrameLayout(r5);
        Object r110 = r19.get(AbstractC0295Gu.m625r(-307197535844405L));
        if ((r110 instanceof String) == false) goto L39;
        String r111 = (String) r110;
    L40:
        if (r111 == null) goto L42;
        r152.setBackgroundColor(INSTANCE.parseColor(r111, Color.parseColor(AbstractC0295Gu.m625r(-307266255321141L))));
    L42:
        Object r112 = r19.get(AbstractC0295Gu.m625r(-307309204994101L));
        if ((r112 instanceof Number) == false) goto L45;
        Number r113 = (Number) r112;
    L46:
        if (r113 == null) goto L48;
        float r114 = INSTANCE.m3293dp(r113.floatValue());
    L49:
        GradientDrawable r26 = new GradientDrawable();
        CherryViewAPI r72 = INSTANCE;
        Object r0 = r19.get(AbstractC0295Gu.m625r(-306815283755061L));
        if ((r0 instanceof String) == false) goto L52;
        r4 = (String) r0;
    L52:
        r26.setColor(r72.parseColor(r4, Color.parseColor(AbstractC0295Gu.m625r(-306884003231797L))));
        r26.setCornerRadius(r114);
        r152.setBackground(r26);
        if (r122 == true) goto L55;
        final C0339Hv r6 = new C0339Hv();
        final C0339Hv r82 = new C0339Hv();
        final C0296Gv r9 = new C0296Gv();
        final C0296Gv r10 = new C0296Gv();
        r152.setOnTouchListener(new ViewOnTouchListenerC0739R8(r5, r6, r162, r82, r9, r10, r152));
    L55:
        Object r02 = r5.getSystemService(AbstractC0295Gu.m625r(-306926952904757L));
        AbstractC0295Gu.m625r(-306957017675829L);
        floatingWindows.put(r20, new FloatingWindowInfo(r20, r152, r162, (WindowManager) r02, false));
        return r3;
    L48:
        r114 = INSTANCE.m3293dp(12.0f);
        goto L49
    L45:
        r113 = null;
        goto L46
    L39:
        r111 = null;
        goto L40
    L35:
        r25 = 100;
        goto L36
    L32:
        r24 = null;
        goto L33
    L28:
        r18 = 0;
        goto L29
    L25:
        r17 = null;
        goto L26
    L19:
        r15 = null;
        goto L20
    L15:
        r7 = -2;
        goto L16
    L11:
        r13 = null;
        goto L12
    L5:
        r2 = r1.getCurrentContext();
        if (r2 != null) goto L4;
        return r3;
    }

    private static final boolean register$lambda$99$lambda$98$lambda$97(Context r2, C0339Hv r3, WindowManager.LayoutParams r4, C0339Hv r5, C0296Gv r6, C0296Gv r7, FrameLayout r8, View r9, MotionEvent r10) {
        Object r22 = r2.getSystemService(AbstractC0295Gu.m625r(-537124315068469L));
        AbstractC0295Gu.m625r(-537154379839541L);
        WindowManager r23 = (WindowManager) r22;
        int r92 = r10.getAction();
        if (r92 != 0) goto L5;
        r3.f1147a = r4.x;
        r5.f1147a = r4.y;
        r6.f1009a = r10.getRawX();
        r7.f1009a = r10.getRawY();
        return true;
    L5:
        if (r92 == 2) goto L8;
        return false;
    L8:
        r4.x = r3.f1147a + ((int) (r10.getRawX() - r6.f1009a));
        r4.y = r5.f1147a + ((int) (r10.getRawY() - r7.f1009a));
        r23.updateViewLayout(r8, r4);
        return true;
    }

    private final void runOnUiThread(InterfaceC0884Ui r2) {
        LuaUiScheduler.INSTANCE.runOnUiThread(r2);
    }

    private final void runOnUiThreadSync(InterfaceC0884Ui r3) {
        if (LuaUiScheduler.INSTANCE.runOnUiThreadSync(r3) == true) goto L6;
        AbstractC0295Gu.m625r(-540263936161845L);
        AbstractC0295Gu.m625r(-540324065703989L);
        return;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C0829TC m3328s(Lua r0, int r1) {
        return register$lambda$32$lambda$31$lambda$30(r0, r1);
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ int m3329s0(Lua r0) {
        return register$lambda$11(r0);
    }

    private static final C0829TC setImageSource$lambda$133(String r3, String r4) {
        View r32 = viewRefs.get(r3);
        if ((r32 instanceof ImageView) == false) goto L5;
        ImageView r33 = (ImageView) r32;
    L6:
        C0829TC r0 = C0829TC.f2620a;
        if (r33 != null) goto L10;
    L17:
        return r0;
    L10:
        if (r4.startsWith(AbstractC0295Gu.m625r(-305097296836661L)) == false) goto L12;
    L18:
        INSTANCE.loadImageFromUrl(r33, r4);
        return r0;
    L12:
        if (r4.startsWith(AbstractC0295Gu.m625r(-304581900761141L)) == true) goto L18;
        if (new File(r4).exists() == false) goto L17;
        r33.setImageBitmap(BitmapFactory.decodeFile(r4));
        goto L17
    L5:
        r33 = null;
        goto L6
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m3330t(Lua r0) {
        return register$lambda$114(r0);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ C0829TC m3331t0(String r0, String r1) {
        return register$lambda$89$lambda$88(r0, r1);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ C0829TC m3332u(Lua r0, int r1, EditText r2) {
        return register$lambda$18$lambda$17$lambda$14$lambda$13(r0, r1, r2);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ C0829TC m3333u0(Lua r0, int r1) {
        return register$lambda$11$lambda$10$lambda$9$lambda$8(r0, r1);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m3334v(Lua r0) {
        return register$lambda$77(r0);
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m3335v0(int r0, Lua r1, DialogInterface r2, int r3) {
        register$lambda$11$lambda$10$lambda$9(r1, r0, r2, r3);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C0829TC m3336w(String r0, String r1) {
        return register$lambda$86$lambda$85(r0, r1);
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ int m3337w0(Lua r0) {
        return register$lambda$69(r0);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ C0829TC m3338x(String r0, Lua r1, int r2) {
        return m3327xcffa3770(r1, r2, r0);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ int m3339x0(Lua r0) {
        return register$lambda$86(r0);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C0829TC m3340y(Lua r0, int r1) {
        return m3324xb9f67a2b(r0, r1);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ C0829TC m3341y0(String r0, String r1) {
        return setImageSource$lambda$133(r0, r1);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ C0829TC m3342z(String r0, int r1, int r2) {
        return register$lambda$112$lambda$111(r0, r1, r2);
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m3343z0(int r0, Lua r1, DialogInterface r2, int r3) {
        register$lambda$5$lambda$4$lambda$3(r0, r1, r2, r3);
    }

    public final void cleanup() {
        runOnUiThread(new C1302d(7));
        AbstractC0295Gu.m625r(-539950403549237L);
        AbstractC0295Gu.m625r(-540010533091381L);
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-543184513923125L);
        r5.createTable(0, 50);
        r5.push(new C0439K8(18));
        r5.setField(-2, AbstractC0295Gu.m625r(-543201693792309L));
        r5.push(new C0439K8(29));
        r5.setField(-2, AbstractC0295Gu.m625r(-543227463596085L));
        r5.push(new C0954W8(10));
        r5.setField(-2, AbstractC0295Gu.m625r(-543270413269045L));
        r5.push(new C0954W8(18));
        r5.setField(-2, AbstractC0295Gu.m625r(-543321952876597L));
        r5.push(new C0954W8(19));
        r5.setField(-2, AbstractC0295Gu.m625r(-543369197516853L));
        r5.push(new C0954W8(20));
        r5.setField(-2, AbstractC0295Gu.m625r(-543416442157109L));
        r5.push(new C0954W8(21));
        r5.setField(-2, AbstractC0295Gu.m625r(-544000557709365L));
        r5.push(new C0954W8(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-544060687251509L));
        r5.push(new C0954W8(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-544112226859061L));
        r5.push(new C0954W8(24));
        r5.setField(-2, AbstractC0295Gu.m625r(-544159471499317L));
        r5.push(new C0439K8(19));
        r5.setField(-2, AbstractC0295Gu.m625r(-544219601041461L));
        r5.push(new C0439K8(20));
        r5.setField(-2, AbstractC0295Gu.m625r(-543717089867829L));
        r5.push(new C0439K8(21));
        r5.setField(-2, AbstractC0295Gu.m625r(-543781514377269L));
        r5.push(new C0439K8(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-543850233854005L));
        r5.push(new C0439K8(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-543906068428853L));
        r5.push(new C0439K8(24));
        r5.setField(-2, AbstractC0295Gu.m625r(-543970492938293L));
        r5.push(new C0439K8(25));
        r5.setField(-2, AbstractC0295Gu.m625r(-542402829875253L));
        r5.push(new C0439K8(26));
        r5.setField(-2, AbstractC0295Gu.m625r(-542480139286581L));
        r5.push(new C0439K8(27));
        r5.setField(-2, AbstractC0295Gu.m625r(-542553153730613L));
        r5.push(new C0439K8(28));
        r5.setField(-2, AbstractC0295Gu.m625r(-542591808436277L));
        r5.push(new C0954W8(0));
        r5.setField(-2, AbstractC0295Gu.m625r(-542093592229941L));
        r5.push(new C0954W8(1));
        r5.setField(-2, AbstractC0295Gu.m625r(-542127951968309L));
        r5.push(new C0954W8(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-542162311706677L));
        r5.push(new C0954W8(3));
        r5.setField(-2, AbstractC0295Gu.m625r(-542209556346933L));
        r5.push(new C0954W8(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-542291160725557L));
        r5.push(new C0954W8(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-542325520463925L));
        r5.push(new C0954W8(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-542926815885365L));
        r5.push(new C0954W8(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-542978355492917L));
        r5.push(new C0954W8(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-543068549806133L));
        r5.push(new C0954W8(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-543141564250165L));
        r5.push(new C0954W8(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-542639053076533L));
        r5.push(new C0954W8(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-542686297716789L));
        r5.push(new C0954W8(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-542746427258933L));
        r5.push(new C0954W8(14));
        r5.setField(-2, AbstractC0295Gu.m625r(-542836621572149L));
        r5.push(new C0954W8(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-541260368574517L));
        r5.push(new C0954W8(16));
        r5.setField(-2, AbstractC0295Gu.m625r(-541333383018549L));
        r5.push(new C0954W8(17));
        r5.setField(-2, AbstractC0295Gu.m625r(-541410692429877L));
        AbstractC0295Gu.m625r(-541483706873909L);
        AbstractC0295Gu.m625r(-540994080602165L);
    }

    public final void setImageSource(String r3, String r4) {
        AbstractC0295Gu.m625r(-539903158908981L);
        AbstractC0295Gu.m625r(-539933223680053L);
        runOnUiThread(new C0611O8(0, r3, r4));
    }

    /* JADX INFO: renamed from: dp */
    private final float m3293dp(float r3) {
        Context r0 = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (r0 != null) goto L6;
        return r3;
    L6:
        return TypedValue.applyDimension(1, r3, r0.getResources().getDisplayMetrics());
    }
}
