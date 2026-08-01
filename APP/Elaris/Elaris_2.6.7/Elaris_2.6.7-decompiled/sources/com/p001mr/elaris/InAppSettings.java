package com.p001mr.elaris;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.p001mr.elaris.InAppSettingsWidgets;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.callbacks.XCallback;
import java.lang.ref.WeakReference;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.AbstractC0008a7;
import p000.AbstractC0198e7;
import p000.C0244h5;
import p000.C0263i8;
import p000.C0282j8;
import p000.C0298k8;
import p000.C0547y6;
import p000.C0563z6;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettings {
    static final String TELEGRAM_URL = "https://t.me/Elaris_mod";
    static final String THEME_DARK = "dark";
    static final String THEME_LIGHT = "light";
    static final String THEME_SYSTEM = "system";
    final Activity activity;
    private ViewGroup content;
    private boolean darkUi;
    private int originalNavigationBarColor;
    private int originalStatusBarColor;
    private int pageTransitionGeneration;
    TextView repeaterModeSummaryView;
    private boolean secondaryPageVisible;

    /* JADX INFO: renamed from: sp */
    private final SharedPreferences f116sp;
    private final InAppSettingsToast toastHelper;

    /* JADX INFO: renamed from: BG */
    static int f115BG = Color.rgb(250, 251, 253);
    static int CARD = Color.rgb(255, 255, 255);
    static int CARD_SOFT = Color.rgb(250, 251, 253);
    static int TEXT = Color.rgb(24, 25, 29);
    static int SUB = Color.rgb(105, 108, 116);
    private static int LINE = Color.rgb(235, 237, 241);
    static int BLUE = Color.rgb(52, 132, 255);
    static int GREEN = Color.rgb(34, 190, 143);
    static int NOTE = Color.rgb(118, 126, 140);
    private static int OFF_BG = Color.rgb(232, 234, 238);
    static int STROKE = Color.rgb(228, 232, 238);
    static int MENU_GLOW_TOP = Color.rgb(255, 255, 255);
    static int MENU_GLOW_MID = Color.rgb(252, 253, 255);
    static int MENU_GLOW_BOTTOM = Color.rgb(247, 249, 252);
    private static volatile WeakReference<InAppSettings> activeInstance = new WeakReference<>(null);
    private static volatile boolean sActivityBackHookInstalled = false;
    private static final Set<XC_MethodHook.Unhook> ACTIVITY_BACK_UNHOOKS = new LinkedHashSet();
    private final List<View> originalChildren = new ArrayList();
    private volatile boolean manualClockInRunning = false;
    private volatile boolean manualKeepFireRunning = false;
    private boolean active = false;
    private boolean originalWindowCaptured = false;
    private Drawable originalContentBackground = null;
    private Drawable originalDecorBackground = null;
    private int originalSystemUiVisibility = 0;
    private int originalWindowFlags = 0;
    private final InAppSettingsBackNavigator backNavigator = new InAppSettingsBackNavigator(this);
    private final InAppSettingsMottoAudioPlayer mottoAudioPlayer = new InAppSettingsMottoAudioPlayer(this);

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public final class BackAwareEditText extends InAppSettingsBackAwareEditText {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BackAwareEditText(Context context) {
            super(InAppSettings.this, context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public final class GuardedScrollView extends InAppSettingsGuardedScrollView {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public GuardedScrollView(Context context) {
            super(InAppSettings.this, context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class HostBackHook extends XC_MethodHook {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public HostBackHook(int i) {
            super(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            Object[] objArr;
            InAppSettings inAppSettingsActiveInstance;
            if (methodHookParam != null) {
                try {
                    Member member = methodHookParam.method;
                    if (member == null) {
                        return;
                    }
                    String name = member.getName();
                    if ("onBackPressed".equals(name)) {
                        InAppSettings inAppSettingsActiveInstance2 = InAppSettings.activeInstance();
                        if (inAppSettingsActiveInstance2 != null && inAppSettingsActiveInstance2.shouldSuppressLegacyBack()) {
                            methodHookParam.setResult(null);
                            return;
                        } else {
                            if (InAppSettings.handleHostBack("onBackPressed")) {
                                methodHookParam.setResult(null);
                                return;
                            }
                            return;
                        }
                    }
                    if (!"dispatchKeyEvent".equals(name) || (objArr = methodHookParam.args) == null || objArr.length == 0) {
                        return;
                    }
                    Object obj = objArr[0];
                    if (obj instanceof KeyEvent) {
                        KeyEvent keyEvent = (KeyEvent) obj;
                        if (keyEvent.getKeyCode() != 4) {
                            if ((keyEvent.getKeyCode() == 25 || keyEvent.getKeyCode() == 24) && (inAppSettingsActiveInstance = InAppSettings.activeInstance()) != null && inAppSettingsActiveInstance.handleVolumeKey(keyEvent.getKeyCode(), keyEvent, null)) {
                                methodHookParam.setResult(Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        if (InAppSettings.hasActivePage()) {
                            InAppSettings inAppSettingsActiveInstance3 = InAppSettings.activeInstance();
                            if (keyEvent.getAction() == 1 && (inAppSettingsActiveInstance3 == null || !inAppSettingsActiveInstance3.shouldSuppressLegacyBack())) {
                                InAppSettings.handleHostBack("dispatchKeyEvent");
                            }
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                    }
                } catch (Throwable th) {
                    AbstractC0198e7.m343a(Prefs.PREFS_NAME, "host-back", th);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public final class ToggleView extends InAppSettingsToggleView {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ToggleView(Context context) {
            super(InAppSettings.this, context);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettings(Activity activity) {
        this.activity = activity;
        this.toastHelper = new InAppSettingsToast(activity);
        this.f116sp = activity.getSharedPreferences(Prefs.PREFS_NAME, 0);
        applyThemePalette();
        int i = f115BG;
        this.originalStatusBarColor = i;
        this.originalNavigationBarColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static InAppSettings activeInstance() {
        WeakReference<InAppSettings> weakReference = activeInstance;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private GradientDrawable activePageBackground() {
        return this.secondaryPageVisible ? InAppSettingsSecondaryStyle.pageBackground(this) : pageBackground();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int activePageColor() {
        return InAppSettingsSecondaryStyle.pageColor(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void adjustSystemVolume(boolean z) {
        try {
            Object systemService = this.activity.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                ((AudioManager) systemService).adjustStreamVolume(3, z ? 1 : -1, 5);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void attach() {
        try {
            ViewGroup viewGroup = (ViewGroup) this.activity.findViewById(R.id.content);
            if (viewGroup == null || findTaggedPage(viewGroup) != null) {
                return;
            }
            this.secondaryPageVisible = false;
            View viewBuildHome = buildHome();
            this.content = viewGroup;
            this.originalChildren.clear();
            for (int i = 0; i < this.content.getChildCount(); i++) {
                this.originalChildren.add(this.content.getChildAt(i));
            }
            this.content.removeAllViews();
            captureOriginalWindowState();
            this.active = true;
            activeInstance = new WeakReference<>(this);
            ensureActivityBackHook(this.activity);
            this.content.setBackground(pageBackground());
            registerBackCallback();
            keepElarisPageFocused();
            this.backNavigator.resetForAttach();
            replacePage(viewBuildHome, 1);
        } catch (Throwable unused) {
            restoreQQ();
            toast("Elaris 页面打开失败");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private View buildCategory(String str) {
        return InAppSettingsNavigationPage.buildCategory(this, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private View buildErrorPage(String str, Throwable th) {
        return InAppSettingsNavigationPage.buildErrorPage(this, str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private View buildHome() {
        return InAppSettingsNavigationPage.buildHome(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void captureOriginalWindowState() {
        try {
            if (this.originalWindowCaptured) {
                return;
            }
            ViewGroup viewGroup = this.content;
            if (viewGroup != null) {
                this.originalContentBackground = viewGroup.getBackground();
            }
            Window window = this.activity.getWindow();
            if (window != null) {
                this.originalStatusBarColor = window.getStatusBarColor();
                this.originalNavigationBarColor = window.getNavigationBarColor();
                this.originalWindowFlags = window.getAttributes() != null ? window.getAttributes().flags : 0;
                View decorView = window.getDecorView();
                if (decorView != null) {
                    this.originalDecorBackground = decorView.getBackground();
                    this.originalSystemUiVisibility = decorView.getSystemUiVisibility();
                }
            }
            this.originalWindowCaptured = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean consumeFocusedInputBack() {
        return InAppSettingsInputHelpers.consumeFocusedInputBack(this, this.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void ensureActivityBackHook(Activity activity) {
        if (sActivityBackHookInstalled) {
            return;
        }
        synchronized (InAppSettings.class) {
            if (sActivityBackHookInstalled) {
                return;
            }
            try {
                HostBackHook hostBackHook = new HostBackHook(XCallback.PRIORITY_HIGHEST);
                hookMostSpecificActivityMethod(activity, "onBackPressed", hostBackHook);
                hookMostSpecificActivityMethod(activity, "dispatchKeyEvent", hostBackHook);
                Set<XC_MethodHook.Unhook> set = ACTIVITY_BACK_UNHOOKS;
                sActivityBackHookInstalled = !set.isEmpty();
                HookEntry.log("Elaris host back hook installed count=" + set.size());
            } catch (Throwable th) {
                HookEntry.log("settings back hook failed: " + th);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Class<?> findActivityMethodOwner(Class<?> cls, String str) {
        if (cls == null) {
            cls = Activity.class;
        }
        while (cls != null && Activity.class.isAssignableFrom(cls)) {
            try {
                for (Method method : cls.getDeclaredMethods()) {
                    if (str.equals(method.getName())) {
                        return cls;
                    }
                }
            } catch (Throwable unused) {
            }
            if (cls == Activity.class) {
                return null;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private View findTaggedPage(View view) {
        return InAppSettingsFocusHelpers.findTaggedPage(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void goBack(String str) {
        this.backNavigator.goBack(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void handleBackInsideElaris(String str) {
        if (consumeFocusedInputBackOnly(str)) {
            return;
        }
        goBack(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean handleHostBack(String str) {
        InAppSettings inAppSettingsActiveInstance = activeInstance();
        if (inAppSettingsActiveInstance == null || !inAppSettingsActiveInstance.hasElarisPage()) {
            return false;
        }
        inAppSettingsActiveInstance.handleBackInsideElaris(str);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasActivePage() {
        InAppSettings inAppSettingsActiveInstance = activeInstance();
        return inAppSettingsActiveInstance != null && inAppSettingsActiveInstance.hasElarisPage();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean hasElarisPage() {
        ViewGroup viewGroup;
        return (!this.active || (viewGroup = this.content) == null || findTaggedPage(viewGroup) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void hookMostSpecificActivityMethod(Activity activity, String str, XC_MethodHook xC_MethodHook) {
        Class<?> clsFindActivityMethodOwner = findActivityMethodOwner(activity == null ? Activity.class : activity.getClass(), str);
        if (clsFindActivityMethodOwner != null) {
            ACTIVITY_BACK_UNHOOKS.addAll(XposedBridge.hookAllMethods(clsFindActivityMethodOwner, str, xC_MethodHook));
            return;
        }
        HookEntry.log("settings back hook skipped inherited " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int lineColor() {
        return LINE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private GradientDrawable pageBackground() {
        return InAppSettingsSecondaryStyle.pageBackground(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void registerBackCallback() {
        this.backNavigator.registerBackCallback();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void replacePage(final View view, int i) {
        if (this.content == null) {
            return;
        }
        keepElarisPageFocused();
        final int i2 = this.pageTransitionGeneration + 1;
        this.pageTransitionGeneration = i2;
        InAppSettingsInputHelpers.clearFocusedInputForPageTransition(this);
        view.setTag("ELARIS_FULL_PAGE");
        view.setFocusableInTouchMode(true);
        view.setBackground(activePageBackground());
        view.setDefaultFocusHighlightEnabled(false);
        view.setOnKeyListener(new View.OnKeyListener() { // from class: com.mr.elaris.InAppSettings.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view2, int i3, KeyEvent keyEvent) {
                return InAppSettings.this.handlePageBackKey(view2, i3, keyEvent);
            }
        });
        this.content.setBackground(activePageBackground());
        if (i == 0) {
            this.content.removeAllViews();
            this.content.addView(view, new ViewGroup.LayoutParams(-1, -1));
        } else {
            final ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < this.content.getChildCount(); i3++) {
                arrayList.add(this.content.getChildAt(i3));
            }
            view.setAlpha(arrayList.isEmpty() ? 1.0f : 0.94f);
            view.setTranslationX(m139dp(22.0f) * i);
            this.content.addView(view, new ViewGroup.LayoutParams(-1, -1));
            view.bringToFront();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                View view2 = (View) arrayList.get(i4);
                view2.animate().cancel();
                view2.animate().translationX((-i) * m139dp(8.0f)).setDuration(220L).setInterpolator(new DecelerateInterpolator(1.45f)).start();
            }
            view.animate().cancel();
            ViewPropertyAnimator interpolator = view.animate().alpha(1.0f).translationX(0.0f).setDuration(310L).setInterpolator(new DecelerateInterpolator(1.75f));
            interpolator.withEndAction(new Runnable() { // from class: com.mr.elaris.InAppSettings.3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    if (InAppSettings.this.active && i2 == InAppSettings.this.pageTransitionGeneration) {
                        InAppSettings.this.removePreviousPagesAfterTransition(arrayList, view);
                    }
                }
            });
            interpolator.start();
        }
        refocusElarisPageNow(view);
        try {
            view.postDelayed(new Runnable() { // from class: com.mr.elaris.InAppSettings.4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public void run() {
                    if (InAppSettings.this.active && i2 == InAppSettings.this.pageTransitionGeneration) {
                        InAppSettings.this.keepElarisPageFocused();
                    }
                }
            }, 320L);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void restoreQQ() {
        try {
            if (this.content != null) {
                this.active = false;
                this.pageTransitionGeneration++;
                if (activeInstance() == this) {
                    activeInstance = new WeakReference<>(null);
                }
                unregisterBackCallback();
                this.content.removeAllViews();
                for (View view : this.originalChildren) {
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    this.content.addView(view);
                }
                restoreWindowState();
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void restoreWindowState() {
        try {
            if (this.originalWindowCaptured) {
                Window window = this.activity.getWindow();
                if (window != null) {
                    window.clearFlags((~this.originalWindowFlags) & (-1946155520));
                    window.addFlags(this.originalWindowFlags & (-1946155520));
                    window.setStatusBarColor(this.originalStatusBarColor);
                    window.setNavigationBarColor(this.originalNavigationBarColor);
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        decorView.setSystemUiVisibility(this.originalSystemUiVisibility);
                        decorView.setBackground(this.originalDecorBackground);
                    }
                }
                ViewGroup viewGroup = this.content;
                if (viewGroup != null) {
                    viewGroup.setBackground(this.originalContentBackground);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void runClockInNow(final TextView textView) {
        final String strM68y = AbstractC0008a7.m68y(getGroups());
        final ArrayList arrayListM64u = AbstractC0008a7.m64u(strM68y);
        if (arrayListM64u.isEmpty()) {
            toast("请先选择群");
            return;
        }
        if (this.manualClockInRunning) {
            toast("群打卡正在运行");
            return;
        }
        this.manualClockInRunning = true;
        toast("开始打卡：" + arrayListM64u.size() + " 个群");
        new Thread(new Runnable() { // from class: com.mr.elaris.InAppSettings.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                InAppSettings.this.runManualClockInWorker(strM68y, arrayListM64u, textView);
            }
        }, "Elaris-ClockInNow").start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setThemePalette(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        f115BG = i;
        CARD = i2;
        CARD_SOFT = i3;
        TEXT = i4;
        SUB = i5;
        LINE = i6;
        BLUE = i7;
        GREEN = i8;
        NOTE = i9;
        OFF_BG = i10;
        STROKE = i11;
        MENU_GLOW_TOP = i12;
        MENU_GLOW_MID = i13;
        MENU_GLOW_BOTTOM = i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldSuppressLegacyBack() {
        return this.active && this.backNavigator.wasBackHandledRecently();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void show(Activity activity, String str) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        InAppSettings inAppSettings = new InAppSettings(activity);
        inAppSettings.attach();
        if (str == null || str.length() <= 0) {
            return;
        }
        inAppSettings.showCategory(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void showCategory(String str, boolean z) {
        this.backNavigator.showCategory(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int toggleOffBackgroundColor() {
        return OFF_BG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static synchronized void uninstallActivityBackHook() {
        Set<XC_MethodHook.Unhook> set = ACTIVITY_BACK_UNHOOKS;
        ArrayList arrayList = new ArrayList(set);
        set.clear();
        sActivityBackHookInstalled = false;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                ((XC_MethodHook.Unhook) arrayList.get(i)).unhook();
            } catch (Throwable th) {
                AbstractC0198e7.m343a(Prefs.PREFS_NAME, "unhook-host-back", th);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void unregisterBackCallback() {
        this.backNavigator.unregisterBackCallback();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int accentOf(String str) {
        return InAppSettingsVisuals.accentOf(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View accentStrip(int i) {
        return InAppSettingsVisuals.accentStrip(this, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View actionRow(String str, String str2, View.OnClickListener onClickListener) {
        return InAppSettingsWidgets.actionRow(this, str, str2, onClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addToggleSlot(LinearLayout linearLayout, ToggleView toggleView) {
        InAppSettingsWidgets.addToggleSlot(this, linearLayout, toggleView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void applyDialogWindowStyle(AlertDialog alertDialog) {
        InAppSettingsDialogStyle.apply(this, alertDialog);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void applyThemePalette() {
        InAppSettingsVisuals.applyThemePalette(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View backHeader(String str, String str2) {
        return InAppSettingsLayoutHelpers.backHeader(this, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScrollView baseScroll() {
        return InAppSettingsLayoutHelpers.baseScroll(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void bindMottoAudioButton(TextView textView) {
        this.mottoAudioPlayer.bindButton(textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextView button(String str) {
        return InAppSettingsWidgets.button(this, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View card(String str, View[] viewArr) {
        return InAppSettingsWidgets.card(this, str, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View categoryHeader(String str) {
        return InAppSettingsWidgets.categoryHeader(this, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable checkCircleDrawable(boolean z) {
        return InAppSettingsWidgets.checkCircleDrawable(this, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View clockInCard() {
        return InAppSettingsClockInPage.create(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String clockInCountText() {
        String groups = getGroups();
        StringBuilder sb = new StringBuilder("今日 ");
        Iterator it = AbstractC0008a7.m64u(groups).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (AbstractC0008a7.m42D().equals(AbstractC0008a7.m50g((String) it.next()))) {
                i++;
            }
        }
        sb.append(i);
        sb.append("/");
        sb.append(AbstractC0008a7.m64u(groups).size());
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean consumeFocusedInputBackOnly(String str) {
        boolean zConsumeFocusedInputBack = consumeFocusedInputBack();
        if (zConsumeFocusedInputBack) {
            this.backNavigator.recordBackHandled();
            View viewFindTaggedPage = findTaggedPage(this.content);
            if (viewFindTaggedPage == null) {
                viewFindTaggedPage = this.content;
            }
            refocusElarisPage(viewFindTaggedPage);
        }
        return zConsumeFocusedInputBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InAppSettingsGuardedScrollView createGuardedScrollView() {
        return new GuardedScrollView(this.activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextView dialogButton(String str, boolean z) {
        return InAppSettingsWidgets.dialogButton(this, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GradientDrawable dialogPanel() {
        return InAppSettingsWidgets.dialogPanel(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int dialogWidth() {
        return InAppSettingsLayoutHelpers.dialogWidth(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View divider() {
        return InAppSettingsWidgets.divider(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: dp */
    public int m139dp(float f) {
        return InAppSettingsLayoutHelpers.m154dp(this, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void finishManualClockIn(C0547y6 c0547y6, TextView textView) {
        try {
            toast("群打卡完成：" + c0547y6.f1091b + "/" + c0547y6.f1090a);
            if (textView != null && textView.getWindowToken() != null) {
                textView.setText(clockInCountText());
            }
        } finally {
            this.manualClockInRunning = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void finishManualKeepFire(C0282j8 c0282j8, TextView textView, TextView textView2) {
        String str;
        if (c0282j8 == null) {
            str = "续火发送失败";
        } else {
            try {
                str = c0282j8.f472a;
            } catch (Throwable th) {
                this.manualKeepFireRunning = false;
                throw th;
            }
        }
        toast(str);
        if (textView != null && textView.getWindowToken() != null) {
            textView.setText(AbstractC0152f.m229z());
        }
        if (textView2 != null && textView2.getWindowToken() != null) {
            textView2.setText("下次 ".concat(AbstractC0152f.m215l()));
        }
        this.manualKeepFireRunning = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getBool(String str) {
        return Prefs.readBoolean(this.f116sp, str, Prefs.defaultBoolean(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getGroups() {
        return Prefs.readString(this.f116sp, Prefs.KEY_CLOCK_IN_GROUPS, HookEntry.runtimeString(Prefs.KEY_CLOCK_IN_GROUPS, ""));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getKeepFireGroups() {
        return getKeepFireTargets();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getKeepFireTargets() {
        return AbstractC0152f.m213j(AbstractC0152f.m217n(AbstractC0152f.m219p(Prefs.KEY_KEEP_FIRE_GROUPS, "")));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getString(String str) {
        return Prefs.readString(this.f116sp, str, HookEntry.runtimeString(str, Prefs.defaultString(str)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object handleBackCallbackInvocation(Object obj, Method method, Object[] objArr) {
        return this.backNavigator.handleBackCallbackInvocation(method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void handleBackInsideElarisFromNavigation(String str) {
        if (hasElarisPage()) {
            handleBackInsideElaris(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean handlePageBackKey(View view, int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return handleVolumeKey(i, keyEvent, view);
        }
        if (i != 4 || keyEvent == null || keyEvent.getAction() != 1) {
            return false;
        }
        handleBackInsideElaris("pageKey");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean handleVolumeKey(int i, KeyEvent keyEvent, View view) {
        if (i != 25 && i != 24) {
            return false;
        }
        releaseFocusedInputForSystemKey(view);
        if (keyEvent == null || keyEvent.getAction() == 0) {
            adjustSystemVolume(i == 24);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View homeTopBar() {
        return InAppSettingsHomePage.homeTopBar(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LinearLayout innerBox() {
        return InAppSettingsLayoutHelpers.innerBox(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EditText input(String str, String str2) {
        return InAppSettingsInputHelpers.input(this, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isBackNavigationEligible() {
        return hasElarisPage();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isDarkUi() {
        return this.darkUi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void keepCategoryBackTarget(String str) {
        this.backNavigator.keepCategoryBackTarget(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void keepElarisPageFocused() {
        Window window;
        try {
            if (!this.active || (window = this.activity.getWindow()) == null) {
                return;
            }
            window.clearFlags(201328128);
            window.addFlags(Integer.MIN_VALUE);
            int iActivePageColor = activePageColor();
            window.setStatusBarColor(iActivePageColor);
            window.setNavigationBarColor(iActivePageColor);
            window.setBackgroundDrawable(activePageBackground());
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setBackground(activePageBackground());
                decorView.setSystemUiVisibility(!this.darkUi ? 8464 : 8448);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View keepFireCard() {
        return InAppSettingsKeepFirePage.create(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String keepFireTargetsCompactPreview() {
        return InAppSettingsTargetSummary.keepFireTargetsCompactPreview(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GradientDrawable menuSoftPanel() {
        return InAppSettingsVisuals.menuSoftPanel(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int mixForSurface(int i, float f) {
        return InAppSettingsVisuals.mixForSurface(this, i, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View moduleListCard(View[] viewArr) {
        return InAppSettingsWidgets.moduleListCard(this, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StateListDrawable moduleListRowBackground(int i, int i2) {
        return InAppSettingsVisuals.moduleListRowBackground(this, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View moduleRow(String str, String str2, int i, int i2, View.OnClickListener onClickListener) {
        return InAppSettingsWidgets.moduleRow(this, str, str2, i, i2, onClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openCleanseFeatures(View view) {
        InAppSettingsCategoryNavigator.openCleanse(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openClockInGroupPicker(TextView textView, TextView textView2, View view) {
        InAppSettingsTargetPickerBridge.openClockInGroupPicker(this, textView, textView2, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openExternalLink(String str) {
        InAppSettingsFeedbackPage.openExternalLink(this, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openGroupFeatures(View view) {
        InAppSettingsCategoryNavigator.openGroup(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openKeepFireFriendPicker(TextView textView, TextView textView2, View view) {
        InAppSettingsTargetPickerBridge.openKeepFireFriendPicker(this, textView, textView2, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openKeepFireGroupPicker(TextView textView, TextView textView2, View view) {
        InAppSettingsTargetPickerBridge.openKeepFireGroupPicker(this, textView, textView2, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openMessageFeatures(View view) {
        InAppSettingsCategoryNavigator.openMessage(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openMiscFeatures(View view) {
        InAppSettingsCategoryNavigator.openMisc(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openPictureFeatures(View view) {
        InAppSettingsCategoryNavigator.openPicture(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void openRepeaterFeatures(View view) {
        InAppSettingsCategoryNavigator.openRepeater(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void refocusAfterBackDebounce() {
        refocusElarisPageNow(this.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void refocusElarisPage(View view) {
        InAppSettingsFocusHelpers.refocusElarisPage(this, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void refocusElarisPageNow(View view) {
        InAppSettingsFocusHelpers.refocusElarisPageNow(this, view, this.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void refreshCurrentPage() {
        this.backNavigator.refreshCurrentPage();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void releaseFocusedInputForSystemKey(View view) {
        InAppSettingsInputHelpers.releaseFocusedInputForSystemKey(this, view);
        View viewFindTaggedPage = findTaggedPage(this.content);
        if (viewFindTaggedPage == null) {
            viewFindTaggedPage = this.content;
        }
        refocusElarisPageNow(viewFindTaggedPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void removePreviousPagesAfterTransition(List<View> list, View view) {
        try {
            ViewGroup viewGroup = this.content;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    View view2 = list.get(i);
                    if (view2 != null) {
                        view2.animate().cancel();
                        if (view2.getParent() == viewGroup) {
                            viewGroup.removeView(view2);
                        }
                        view2.setAlpha(1.0f);
                        view2.setTranslationX(0.0f);
                    }
                }
            }
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View repeaterIconImageCard() {
        return InAppSettingsRepeaterIconPage.create(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String repeaterModeSummary() {
        return InAppSettingsRepeaterModePage.summary(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resetAllSettingsToDefaultOff() {
        InAppSettingsResetPage.resetAll(this, this.f116sp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void restoreQQFromNavigation() {
        restoreQQ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LinearLayout rootOf(ScrollView scrollView) {
        return InAppSettingsLayoutHelpers.rootOf(scrollView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GradientDrawable round(int i, int i2) {
        return InAppSettingsVisuals.round(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GradientDrawable roundWithStroke(int i, int i2, int i3, int i4) {
        return InAppSettingsVisuals.roundWithStroke(this, i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StateListDrawable rowBackground() {
        return InAppSettingsVisuals.rowBackground(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void runManualClockInWorker(String str, List list, final TextView textView) {
        final C0547y6 c0547y6;
        try {
            c0547y6 = AbstractC0008a7.m67x(AbstractC0008a7.m64u(str), true);
        } catch (Throwable th) {
            HookEntry.log("manual clock-in failed: " + th);
            c0547y6 = new C0547y6(list.size(), 0);
        }
        this.activity.runOnUiThread(new Runnable() { // from class: com.mr.elaris.InAppSettings.7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                InAppSettings.this.finishManualClockIn(c0547y6, textView);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void runManualKeepFireWorker(final TextView textView, final TextView textView2) {
        final C0282j8 c0282j8;
        try {
            c0282j8 = AbstractC0152f.m222s();
        } catch (Throwable th) {
            HookEntry.log("manual keep-fire failed: " + th.getClass().getSimpleName() + ": " + th.getMessage());
            c0282j8 = new C0282j8("续火发送失败");
        }
        this.activity.runOnUiThread(new Runnable() { // from class: com.mr.elaris.InAppSettings.6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public void run() {
                InAppSettings.this.finishManualKeepFire(c0282j8, textView, textView2);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void saveBool(String str, boolean z, boolean z2) {
        SharedPreferences.Editor editorEdit = this.f116sp.edit();
        Prefs.putBoolean(editorEdit, str, z);
        editorEdit.putLong(Prefs.KEY_CONFIG_VERSION, System.currentTimeMillis()).commit();
        HookEntry.setRuntimeBool(str, z);
        if (Prefs.KEY_CLOCK_IN_ENABLED.equals(str) && z) {
            AbstractC0008a7.m69z();
        }
        if (Prefs.KEY_KEEP_FIRE_ENABLED.equals(str) && z) {
            AbstractC0152f.m224u();
        }
        if (z2) {
            if (Prefs.KEY_CLOCK_IN_ENABLED.equals(str) && z) {
                toast("自动群打卡已开启：".concat(AbstractC0008a7.m63t()));
            } else if (Prefs.KEY_KEEP_FIRE_ENABLED.equals(str) && z) {
                toast("续火定时消息已开启：".concat(AbstractC0152f.m215l()));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean saveKeepFireConfig(EditText editText, EditText editText2, TextView textView, TextView textView2, TextView textView3, View view) {
        keepCategoryBackTarget("chat_message");
        String strTextOf = textOf(editText);
        String strTextOf2 = textOf(editText2);
        String keepFireTargets = getKeepFireTargets();
        C0263i8 c0263i8M209f = AbstractC0152f.m209f();
        C0263i8 c0263i8M207d = AbstractC0152f.m207d(keepFireTargets, strTextOf2, strTextOf);
        AbstractC0152f.m221r(Prefs.KEY_KEEP_FIRE_GROUPS, AbstractC0152f.m213j(c0263i8M207d.f404a));
        AbstractC0152f.m221r(Prefs.KEY_KEEP_FIRE_MESSAGE, c0263i8M207d.f405b);
        String strReplace = c0263i8M207d.f406c;
        if (strReplace.length() == 0) {
            strReplace = strTextOf == null ? "" : strTextOf.trim().replace((char) 65306, ':');
        }
        AbstractC0152f.m221r(Prefs.KEY_KEEP_FIRE_TIME, strReplace);
        if (AbstractC0152f.m206c(c0263i8M209f, c0263i8M207d)) {
            AbstractC0152f.m221r(Prefs.KEY_KEEP_FIRE_LAST_SENT_DAY, "");
        }
        AbstractC0152f.m224u();
        if (textView != null) {
            textView.setText(AbstractC0152f.m229z());
        }
        if (textView2 != null) {
            textView2.setText("下次 ".concat(AbstractC0152f.m215l()));
        }
        if (textView3 != null) {
            textView3.setText(keepFireTargetsCompactPreview());
        }
        if (editText != null) {
            editText.setText(AbstractC0152f.m200A());
        }
        if (editText2 != null) {
            editText2.setText(AbstractC0152f.m219p(Prefs.KEY_KEEP_FIRE_MESSAGE, ""));
        }
        settleTextInput(editText2, view);
        refocusElarisPage(view);
        C0263i8 c0263i8M209f2 = AbstractC0152f.m209f();
        if (c0263i8M209f2.m676a()) {
            toast("续火配置已保存：".concat(AbstractC0152f.m215l()));
            return true;
        }
        toast(c0263i8M209f2.f409f);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void saveString(String str, String str2, boolean z) {
        SharedPreferences.Editor editorEdit = this.f116sp.edit();
        Prefs.putString(editorEdit, str, str2);
        editorEdit.putLong(Prefs.KEY_CONFIG_VERSION, System.currentTimeMillis()).commit();
        HookEntry.setRuntimeString(str, str2);
        if (z) {
            if (Prefs.KEY_PIC_SUMMARY_TEXT.equals(str)) {
                toastRestartHint("已保存，发送图片将使用新外显");
            } else if (Prefs.KEY_MESSAGE_REPEATER_ICON_PATH.equals(str)) {
                toastRestartHint("已保存，重进聊天后使用新复读图标");
            } else {
                toastRestartHint("已保存，建议重启 QQ 生效");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScrollView secondaryScroll() {
        return InAppSettingsLayoutHelpers.secondaryScroll(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String selectedGroupsPreview() {
        return InAppSettingsTargetSummary.selectedGroupsPreview(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String selectedTargetsCompactPreview(List<C0298k8> list, List<C0563z6> list2, List<C0244h5> list3) {
        return InAppSettingsTargetSummary.selectedTargetsCompactPreview(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDarkUi(boolean z) {
        this.darkUi = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View settingItem(String str, String str2, boolean z, InAppSettingsWidgets.CheckedChangeListener checkedChangeListener) {
        return InAppSettingsWidgets.settingItem(this, str, str2, z, checkedChangeListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void settleTextInput(EditText editText, View view) {
        InAppSettingsInputHelpers.settleTextInput(this, editText, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void showCategoryErrorFromNavigation(String str, Throwable th, int i) {
        this.secondaryPageVisible = true;
        replacePage(buildErrorPage(str, th), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void showCategoryFromNavigation(String str, int i) {
        this.secondaryPageVisible = true;
        replacePage(buildCategory(str), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void showHomeFromNavigation(int i) {
        this.secondaryPageVisible = false;
        replacePage(buildHome(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void showRepeaterModeDialog(ToggleView toggleView, View view) {
        InAppSettingsRepeaterModePage.showDialog(this, toggleView, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void startManualClockIn(TextView textView, View view) {
        runClockInNow(textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void startManualKeepFire(final TextView textView, final TextView textView2, View view) {
        if (this.manualKeepFireRunning) {
            toast("续火发送正在运行");
            return;
        }
        C0263i8 c0263i8M209f = AbstractC0152f.m209f();
        if (!c0263i8M209f.m676a()) {
            toast(c0263i8M209f.f409f);
            return;
        }
        this.manualKeepFireRunning = true;
        toast("开始续火发送");
        new Thread(new Runnable() { // from class: com.mr.elaris.InAppSettings.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public void run() {
                InAppSettings.this.runManualKeepFireWorker(textView, textView2);
            }
        }, "Elaris-KeepFireNow").start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextView statPill(String str, int i) {
        return InAppSettingsWidgets.statPill(this, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String summaryOf(String str) {
        return InAppSettingsCategoryText.summaryOf(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View switchRow(String str, String str2, String str3) {
        return InAppSettingsWidgets.switchRow(this, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View switchRowCompactDescription(String str, String str2, String str3) {
        return InAppSettingsWidgets.switchRowCompactDescription(this, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextView text(String str, int i, int i2, int i3) {
        return InAppSettingsWidgets.text(this, str, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String textOf(EditText editText) {
        return InAppSettingsInputHelpers.textOf(editText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View themeCard() {
        return InAppSettingsThemePage.create(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String themeMode() {
        String string = getString(Prefs.KEY_UI_THEME_MODE);
        return (THEME_LIGHT.equals(string) || THEME_DARK.equals(string) || THEME_SYSTEM.equals(string)) ? string : THEME_SYSTEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String titleOf(String str) {
        return InAppSettingsCategoryText.titleOf(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void toast(String str) {
        this.toastHelper.toast(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void toastRestartHint(String str) {
        this.toastHelper.toastRestartHint(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void toggleMottoAudio() {
        this.mottoAudioPlayer.toggle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void toggleSwitchRow(ToggleView toggleView, String str, View view) {
        if (!Prefs.KEY_MESSAGE_REPEATER.equals(str) || toggleView.isChecked()) {
            boolean z = !toggleView.isChecked();
            toggleView.setChecked(z);
            saveBool(str, z, true);
        } else {
            saveString(Prefs.KEY_MESSAGE_REPEATER_MODE, Prefs.REPEATER_MODE_SINGLE, false);
            toggleView.setChecked(true);
            saveBool(str, true, true);
            updateRepeaterModeSummaryView();
            showRepeaterModeDialog(toggleView, view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void updateRepeaterModeSummaryView() {
        InAppSettingsRepeaterModePage.updateSummaryView(this);
    }

    public String selectedGroupsPreview(List<String> list, List<C0563z6> list2) {
        return InAppSettingsTargetSummary.selectedGroupsPreview(list, list2);
    }

    public void showCategory(String str) {
        showCategory(str, true);
    }

    public static void show(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        new InAppSettings(activity).attach();
    }

    public boolean handleVolumeKey(KeyEvent keyEvent, View view) {
        return handleVolumeKey(keyEvent == null ? 0 : keyEvent.getKeyCode(), keyEvent, view);
    }
}
