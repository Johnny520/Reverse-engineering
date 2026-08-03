package p154k9;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import gg.AbstractC1416l;
import gg.C1421q;
import gg.C1422r;
import gg.C1423s;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p002a1.RunnableC0006d;
import p015b0.RunnableC0133c;
import p085fg.InterfaceC1220a;
import p091g3.RunnableC1309g;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p136j8.C2104o;
import p172lg.C2563c;
import p172lg.C2564d;
import p218og.AbstractC3149m;
import p242q8.C3458m;
import p242q8.C3460o;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: k9.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2374r {

    /* JADX INFO: renamed from: c */
    public static SharedPreferences f7801c;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f7802d;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f7803e;

    /* JADX INFO: renamed from: f */
    public static volatile boolean f7804f;

    /* JADX INFO: renamed from: a */
    public static final C2374r f7799a = new C2374r();

    /* JADX INFO: renamed from: b */
    public static final Handler f7800b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    public static WeakReference f7805g = new WeakReference(null);

    /* JADX INFO: renamed from: h */
    public static WeakReference f7806h = new WeakReference(null);

    /* JADX INFO: renamed from: i */
    public static WeakReference f7807i = new WeakReference(null);

    /* JADX INFO: renamed from: j */
    public static WeakReference f7808j = new WeakReference(null);

    /* JADX INFO: renamed from: k */
    public static final SharedPreferencesOnSharedPreferenceChangeListenerC2367k f7809k = new SharedPreferencesOnSharedPreferenceChangeListenerC2367k();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static RippleDrawable m5672a(Context context, boolean z9, int[] iArr) {
        GradientDrawable gradientDrawable = null;
        if (!z9) {
            iArr = m5678g(context) ? new int[]{-231195840} : new int[]{-167772161};
        } else if (iArr == null) {
            int i9 = m5678g(context) ? -231195840 : -167772161;
            SharedPreferences sharedPreferences = f7801c;
            iArr = m5682k(i9, sharedPreferences != null ? sharedPreferences.getString("action_color", HttpUrl.FRAGMENT_ENCODE_SET) : null);
        }
        int iM5686o = m5686o(iArr);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArr.length > 1 ? iArr : null);
        if (z9) {
            gradientDrawable2.setShape(1);
        } else {
            gradientDrawable2.setCornerRadius(m5677f(context, 14));
        }
        if (iArr.length == 1) {
            gradientDrawable2.setColor(iArr[0]);
        }
        gradientDrawable2.setStroke(m5677f(context, 1), m5679h(iM5686o) ? 369098752 : 620756991);
        if (z9) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-1);
        }
        return new RippleDrawable(ColorStateList.valueOf(m5679h(iM5686o) ? 402653184 : 687865855), gradientDrawable2, gradientDrawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m5673b(Context context, FrameLayout.LayoutParams layoutParams, int i9, int i10, int i11, int i12) {
        if (i9 <= 0 || i10 <= 0 || i11 <= 0 || i12 <= 0) {
            return false;
        }
        int iM5677f = m5677f(context, 8);
        int i13 = i9 - i11;
        int i14 = iM5677f * 2;
        int i15 = i13 - i14;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = (i10 - i12) - i14;
        int i17 = i16 >= 0 ? i16 : 0;
        SharedPreferences sharedPreferences = f7801c;
        float fM7907q = sharedPreferences != null ? AbstractC3754e0.m7907q(sharedPreferences.getFloat("position_x", 1.0f), 0.0f, 1.0f) : 1.0f;
        SharedPreferences sharedPreferences2 = f7801c;
        float fM7907q2 = sharedPreferences2 != null ? AbstractC3754e0.m7907q(sharedPreferences2.getFloat("position_y", 0.46f), 0.0f, 1.0f) : 0.46f;
        layoutParams.leftMargin = ((int) (i15 * fM7907q)) + iM5677f;
        layoutParams.topMargin = iM5677f + ((int) (i17 * fM7907q2));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m5674c(Activity activity) {
        if (f7802d && m5688q(activity)) {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            final ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                View view = (View) f7806h.get();
                if (f7805g.get() == activity) {
                    if ((view != null ? view.getParent() : null) == viewGroup) {
                        view.bringToFront();
                        return;
                    }
                }
                m5676e(null);
                SharedPreferences sharedPreferences = f7801c;
                int iM7909r = sharedPreferences != null ? AbstractC3754e0.m7909r(sharedPreferences.getInt("bubble_size", 44), 36, 64) : 44;
                SharedPreferences sharedPreferences2 = f7801c;
                int[] iArrM5682k = m5682k(-1, sharedPreferences2 != null ? sharedPreferences2.getString("bubble_color", "#FFFFFF") : null);
                int iM5686o = m5686o(iArrM5682k);
                FrameLayout frameLayout = new FrameLayout(activity);
                frameLayout.setTag("Hchat:FloatingShortcut:Bubble");
                frameLayout.setContentDescription("展开或收起悬浮快捷菜单");
                frameLayout.setClickable(true);
                frameLayout.setFocusable(true);
                frameLayout.setElevation(m5677f(activity, 8));
                int iM5686o2 = m5686o(iArrM5682k);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArrM5682k.length > 1 ? iArrM5682k : null);
                gradientDrawable.setShape(1);
                if (iArrM5682k.length == 1) {
                    gradientDrawable.setColor(iArrM5682k[0]);
                }
                gradientDrawable.setStroke(m5677f(activity, 1), m5679h(iM5686o2) ? 402653184 : 687865855);
                frameLayout.setBackground(gradientDrawable);
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(m5679h(iM5686o) ? 402653184 : 687865855);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(1);
                gradientDrawable2.setColor(-1);
                frameLayout.setForeground(new RippleDrawable(colorStateListValueOf, null, gradientDrawable2));
                frameLayout.setClipToOutline(true);
                ImageView imageView = new ImageView(activity);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setContentDescription(null);
                imageView.setImageTintList(null);
                imageView.clearColorFilter();
                int i9 = (int) (iM7909r * 0.16f);
                if (i9 < 5) {
                    i9 = 5;
                }
                int iM5677f = m5677f(activity, i9);
                imageView.setPadding(iM5677f, iM5677f, iM5677f, iM5677f);
                int i10 = m5679h(iM5686o) ? -14671580 : -1;
                SharedPreferences sharedPreferences3 = f7801c;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                String string = sharedPreferences3 != null ? sharedPreferences3.getString("bubble_icon", HttpUrl.FRAGMENT_ENCODE_SET) : null;
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                SharedPreferences sharedPreferences4 = f7801c;
                String string2 = sharedPreferences4 != null ? sharedPreferences4.getString("bubble_dark_icon", HttpUrl.FRAGMENT_ENCODE_SET) : null;
                if (string2 != null) {
                    str = string2;
                }
                if (m5678g(activity) && !AbstractC3149m.m6721t0(str)) {
                    string = str;
                }
                Drawable drawableM5680i = m5680i(activity, string);
                if (drawableM5680i == null) {
                    drawableM5680i = new C2360d(EnumC2359c.f7748g, i10);
                }
                imageView.setImageDrawable(drawableM5680i);
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1, 17));
                frameLayout.setOnClickListener(new ViewOnClickListenerC2368l(activity, viewGroup, frameLayout, 0));
                final int scaledTouchSlop = ViewConfiguration.get(frameLayout.getContext()).getScaledTouchSlop();
                final C1422r c1422r = new C1422r();
                final C1422r c1422r2 = new C1422r();
                final C1423s c1423s = new C1423s();
                final C1423s c1423s2 = new C1423s();
                final C1423s c1423s3 = new C1423s();
                final C1423s c1423s4 = new C1423s();
                final C1421q c1421q = new C1421q();
                frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: k9.m
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        int iM5677f2;
                        C2374r c2374r = C2374r.f7799a;
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            int actionMasked = motionEvent.getActionMasked();
                            C1422r c1422r3 = c1422r;
                            C1422r c1422r4 = c1422r2;
                            C1423s c1423s5 = c1423s;
                            C1423s c1423s6 = c1423s2;
                            C1423s c1423s7 = c1423s3;
                            C1423s c1423s8 = c1423s4;
                            C1421q c1421q2 = c1421q;
                            if (actionMasked == 0) {
                                c1422r3.f4735g = motionEvent.getRawX();
                                c1422r4.f4735g = motionEvent.getRawY();
                                c1423s5.f4736g = layoutParams2.leftMargin;
                                c1423s6.f4736g = layoutParams2.topMargin;
                                View view3 = (View) C2374r.f7807i.get();
                                ViewGroup.LayoutParams layoutParams3 = view3 != null ? view3.getLayoutParams() : null;
                                FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                                c1423s7.f4736g = layoutParams4 != null ? layoutParams4.leftMargin : 0;
                                c1423s8.f4736g = layoutParams4 != null ? layoutParams4.topMargin : 0;
                                c1421q2.f4734g = false;
                                view2.setPressed(true);
                                return true;
                            }
                            ViewGroup viewGroup2 = viewGroup;
                            if (actionMasked == 1) {
                                view2.setPressed(false);
                                if (!c1421q2.f4734g) {
                                    view2.performClick();
                                    return true;
                                }
                                C2374r.m5683l(view2, viewGroup2);
                                C2374r.m5685n(view2, viewGroup2);
                                return true;
                            }
                            if (actionMasked == 2) {
                                float rawX = motionEvent.getRawX() - c1422r3.f4735g;
                                float rawY = motionEvent.getRawY() - c1422r4.f4735g;
                                if (!c1421q2.f4734g) {
                                    float fAbs = Math.abs(rawX);
                                    float f3 = scaledTouchSlop;
                                    if (fAbs > f3 || Math.abs(rawY) > f3) {
                                        c1421q2.f4734g = true;
                                        view2.setPressed(false);
                                    }
                                }
                                if (c1421q2.f4734g) {
                                    Context context = view2.getContext();
                                    context.getClass();
                                    int iM5677f3 = C2374r.m5677f(context, 8);
                                    int height = (viewGroup2.getHeight() - view2.getHeight()) - iM5677f3;
                                    if (height < iM5677f3) {
                                        height = iM5677f3;
                                    }
                                    View view4 = (View) C2374r.f7807i.get();
                                    if (view4 == null || view4.getParent() != viewGroup2) {
                                        view4 = null;
                                    }
                                    if (view4 != null) {
                                        int height2 = view4.getHeight() + iM5677f3;
                                        Context context2 = view2.getContext();
                                        context2.getClass();
                                        iM5677f2 = C2374r.m5677f(context2, 10) + height2;
                                        if (iM5677f2 > height) {
                                            iM5677f2 = height;
                                        }
                                    } else {
                                        iM5677f2 = iM5677f3;
                                    }
                                    int i11 = c1423s5.f4736g + ((int) rawX);
                                    int width = (viewGroup2.getWidth() - view2.getWidth()) - iM5677f3;
                                    if (width < iM5677f3) {
                                        width = iM5677f3;
                                    }
                                    layoutParams2.leftMargin = AbstractC3754e0.m7909r(i11, iM5677f3, width);
                                    layoutParams2.topMargin = AbstractC3754e0.m7909r(c1423s6.f4736g + ((int) rawY), iM5677f2, height);
                                    view2.setLayoutParams(layoutParams2);
                                    int i12 = layoutParams2.leftMargin - c1423s5.f4736g;
                                    int i13 = layoutParams2.topMargin - c1423s6.f4736g;
                                    int i14 = c1423s7.f4736g;
                                    int i15 = c1423s8.f4736g;
                                    View view5 = (View) C2374r.f7807i.get();
                                    if (view5 != null) {
                                        ViewGroup.LayoutParams layoutParams5 = view5.getLayoutParams();
                                        FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
                                        if (layoutParams6 != null) {
                                            Context context3 = view5.getContext();
                                            context3.getClass();
                                            int iM5677f4 = C2374r.m5677f(context3, 12);
                                            int i16 = i14 + i12;
                                            int width2 = (viewGroup2.getWidth() - view5.getWidth()) - iM5677f4;
                                            if (width2 < iM5677f4) {
                                                width2 = iM5677f4;
                                            }
                                            layoutParams6.leftMargin = AbstractC3754e0.m7909r(i16, iM5677f4, width2);
                                            int i17 = i15 + i13;
                                            int height3 = (viewGroup2.getHeight() - view5.getHeight()) - iM5677f4;
                                            if (height3 < iM5677f4) {
                                                height3 = iM5677f4;
                                            }
                                            layoutParams6.topMargin = AbstractC3754e0.m7909r(i17, iM5677f4, height3);
                                            view5.setLayoutParams(layoutParams6);
                                        }
                                    }
                                }
                            } else if (actionMasked == 3) {
                                view2.setPressed(false);
                                if (c1421q2.f4734g) {
                                    C2374r.m5683l(view2, viewGroup2);
                                    C2374r.m5685n(view2, viewGroup2);
                                    return true;
                                }
                            }
                            return true;
                        }
                        return false;
                    }
                });
                SharedPreferences sharedPreferences5 = f7801c;
                int iM5677f2 = m5677f(activity, sharedPreferences5 != null ? AbstractC3754e0.m7909r(sharedPreferences5.getInt("bubble_size", 44), 36, 64) : 44);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM5677f2, iM5677f2, 8388659);
                if (!m5673b(activity, layoutParams, viewGroup.getWidth(), viewGroup.getHeight(), iM5677f2, iM5677f2)) {
                    frameLayout.setVisibility(4);
                }
                viewGroup.addView(frameLayout, layoutParams);
                f7805g = new WeakReference(activity);
                f7806h = new WeakReference(frameLayout);
                frameLayout.post(new RunnableC0006d(frameLayout, 23, viewGroup));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m5675d(boolean z9) {
        View view = (View) f7808j.get();
        ViewParent parent = view != null ? view.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        f7808j.clear();
        View view2 = (View) f7807i.get();
        if (view2 != null) {
            ViewParent parent2 = view2.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (z9 && viewGroup2 != null && view2.getVisibility() == 0) {
                view2.setClickable(false);
                view2.animate().cancel();
                ViewPropertyAnimator viewPropertyAnimatorScaleY = view2.animate().alpha(0.0f).scaleX(0.88f).scaleY(0.88f);
                view2.getContext().getClass();
                viewPropertyAnimatorScaleY.translationY(m5677f(r1, 8)).setDuration(140L).withEndAction(new RunnableC1309g(view2, 1)).start();
                return;
            }
            view2.animate().cancel();
            if (viewGroup2 != null) {
                viewGroup2.removeView(view2);
            }
            if (f7807i.get() == view2) {
                f7807i.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m5676e(Activity activity) {
        Activity activity2 = (Activity) f7805g.get();
        if (activity == null || activity2 == activity) {
            m5675d(false);
            View view = (View) f7806h.get();
            ViewParent parent = view != null ? view.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            f7806h.clear();
            f7805g.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m5677f(Context context, int i9) {
        return (int) ((i9 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m5678g(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m5679h(int i9) {
        return ((Color.blue(i9) * 114) + ((Color.green(i9) * 587) + (Color.red(i9) * 299))) / 1000 >= 160;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static BitmapDrawable m5680i(Context context, String str) {
        Object c3959f;
        if (str == null) {
            return null;
        }
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!file.isFile()) {
            return null;
        }
        try {
            c3959f = BitmapFactory.decodeFile(file.getAbsolutePath());
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Bitmap bitmap = (Bitmap) c3959f;
        if (bitmap != null) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static int m5681j(int i9, String str) {
        String string;
        Object c3959f;
        if (str == null || (string = AbstractC3149m.m6703R0(str).toString()) == null) {
            return i9;
        }
        if (!(string.length() > 0)) {
            string = null;
        }
        if (string == null) {
            return i9;
        }
        try {
            c3959f = Integer.valueOf(Color.parseColor(string));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Integer num = (Integer) (c3959f instanceof C3959f ? null : c3959f);
        return num != null ? num.intValue() : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int[] m5682k(int i9, String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM8403L1 = AbstractC4166m.m8403L1(2, AbstractC3149m.m6691F0(str, new char[]{','}, 6));
        int iM5681j = m5681j(i9, (String) AbstractC4166m.m8425w1(0, listM8403L1));
        String str2 = (String) AbstractC4166m.m8425w1(1, listM8403L1);
        Integer numValueOf = str2 != null ? Integer.valueOf(m5681j(iM5681j, str2)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM5681j) ? new int[]{iM5681j} : new int[]{iM5681j, numValueOf.intValue()};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m5683l(View view, ViewGroup viewGroup) {
        SharedPreferences.Editor editorEdit;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            Context context = view.getContext();
            context.getClass();
            int iM5677f = m5677f(context, 8);
            int i9 = iM5677f * 2;
            int width = (viewGroup.getWidth() - view.getWidth()) - i9;
            if (width < 0) {
                width = 0;
            }
            int height = (viewGroup.getHeight() - view.getHeight()) - i9;
            int i10 = height >= 0 ? height : 0;
            layoutParams2.leftMargin = AbstractC3754e0.m7909r(layoutParams2.leftMargin, iM5677f, iM5677f + width);
            layoutParams2.topMargin = AbstractC3754e0.m7909r(layoutParams2.topMargin, iM5677f, iM5677f + i10);
            view.setLayoutParams(layoutParams2);
            SharedPreferences sharedPreferences = f7801c;
            if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
                return;
            }
            SharedPreferences.Editor editorPutFloat = editorEdit.putFloat("position_x", width == 0 ? 0.0f : (layoutParams2.leftMargin - iM5677f) / width);
            if (editorPutFloat != null) {
                SharedPreferences.Editor editorPutFloat2 = editorPutFloat.putFloat("position_y", i10 != 0 ? (layoutParams2.topMargin - iM5677f) / i10 : 0.0f);
                if (editorPutFloat2 != null) {
                    editorPutFloat2.apply();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5684m(Context context, ViewGroup viewGroup, View view, ScrollView scrollView, LinearLayout linearLayout) {
        int iM5677f;
        int iM5677f2;
        int width;
        int i9;
        Object next;
        Object next2;
        View view2 = scrollView;
        int iM5677f3 = m5677f(context, 12);
        int iM5677f4 = m5677f(context, 10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int width2 = (view.getWidth() / 2) + layoutParams2.leftMargin;
            int i10 = 0;
            boolean z9 = width2 >= viewGroup.getWidth() / 2;
            int childCount = linearLayout.getChildCount();
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = linearLayout.getChildAt(i11);
                LinearLayout linearLayout2 = childAt instanceof LinearLayout ? (LinearLayout) childAt : null;
                if (linearLayout2 != null) {
                    C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(0, linearLayout2.getChildCount());
                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(c2564dM7910r0));
                    Iterator it = c2564dM7910r0.iterator();
                    while (true) {
                        C2563c c2563c = (C2563c) it;
                        if (!c2563c.f8317i) {
                            break;
                        } else {
                            arrayList.add(linearLayout2.getChildAt(((Number) c2563c.next()).intValue()));
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (AbstractC1416l.m3825a(((View) next).getTag(), "Hchat:FloatingShortcut:Label")) {
                                break;
                            }
                        }
                    }
                    View view3 = (View) next;
                    C2564d c2564dM7910r02 = AbstractC3754e0.m7910r0(0, linearLayout2.getChildCount());
                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(c2564dM7910r02));
                    Iterator it3 = c2564dM7910r02.iterator();
                    while (true) {
                        C2563c c2563c2 = (C2563c) it3;
                        if (!c2563c2.f8317i) {
                            break;
                        } else {
                            arrayList2.add(linearLayout2.getChildAt(((Number) c2563c2.next()).intValue()));
                        }
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it4.next();
                            if (AbstractC1416l.m3825a(((View) next2).getTag(), "Hchat:FloatingShortcut:Icon")) {
                                break;
                            }
                        }
                    }
                    View view4 = (View) next2;
                    if (view3 != null && view4 != null) {
                        if (linearLayout2.getChildAt(0) != (z9 ? view3 : view4)) {
                            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                            layoutParams3.getClass();
                            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                            ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
                            layoutParams5.getClass();
                            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                            layoutParams4.setMarginStart(z9 ? 0 : m5677f(context, 8));
                            layoutParams6.setMarginStart(z9 ? m5677f(context, 8) : 0);
                            linearLayout2.removeAllViews();
                            if (z9) {
                                linearLayout2.addView(view3, layoutParams4);
                                linearLayout2.addView(view4, layoutParams6);
                            } else {
                                linearLayout2.addView(view4, layoutParams6);
                                linearLayout2.addView(view3, layoutParams4);
                            }
                        }
                    }
                }
                i11++;
                view2 = scrollView;
                i10 = 0;
            }
            SharedPreferences sharedPreferences = f7801c;
            int iM7909r = sharedPreferences != null ? AbstractC3754e0.m7909r(sharedPreferences.getInt("action_size", 44), 36, 64) : 44;
            int i12 = (layoutParams2.topMargin - iM5677f4) - iM5677f3;
            int iM5677f5 = m5677f(context, iM7909r);
            if (i12 < iM5677f5) {
                i12 = iM5677f5;
            }
            int i13 = iM5677f3 * 2;
            int height = ((viewGroup.getHeight() - view.getHeight()) - iM5677f4) - i13;
            int iM5677f6 = m5677f(context, iM7909r);
            if (height < iM5677f6) {
                height = iM5677f6;
            }
            if (i12 > height) {
                i12 = height;
            }
            int width3 = viewGroup.getWidth() - i13;
            int iM5677f7 = m5677f(context, 80);
            if (width3 < iM5677f7) {
                width3 = iM5677f7;
            }
            view2.measure(View.MeasureSpec.makeMeasureSpec(width3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE));
            ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
            FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams8 != null) {
                int measuredWidth = view2.getMeasuredWidth();
                if (measuredWidth <= width3) {
                    width3 = measuredWidth;
                }
                layoutParams8.width = width3;
                int measuredHeight = view2.getMeasuredHeight();
                if (measuredHeight <= i12) {
                    i12 = measuredHeight;
                }
                layoutParams8.height = i12;
                SharedPreferences sharedPreferences2 = f7801c;
                boolean zM3825a = AbstractC1416l.m3825a(sharedPreferences2 != null ? sharedPreferences2.getString("display_mode", "icon") : null, WeChatSnsPost.TYPE_TEXT);
                int i14 = zM3825a ? 1 : z9 ? 8388613 : 8388611;
                linearLayout.setGravity(i14);
                int childCount2 = linearLayout.getChildCount();
                int i15 = i10;
                while (i15 < childCount2) {
                    View childAt2 = linearLayout.getChildAt(i15);
                    ViewGroup.LayoutParams layoutParams9 = childAt2.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams10 = layoutParams9 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams9 : null;
                    if (layoutParams10 != null) {
                        layoutParams10.gravity = i14;
                        childAt2.setLayoutParams(layoutParams10);
                    }
                    i15++;
                    view2 = scrollView;
                    i10 = 0;
                }
                if (zM3825a) {
                    iM5677f = layoutParams8.width / 2;
                } else {
                    if (z9) {
                        iM5677f2 = (m5677f(context, iM7909r / 2) + width2) - layoutParams8.width;
                        width = (viewGroup.getWidth() - layoutParams8.width) - iM5677f3;
                        if (width < iM5677f3) {
                            width = iM5677f3;
                        }
                        layoutParams8.leftMargin = AbstractC3754e0.m7909r(iM5677f2, iM5677f3, width);
                        i9 = (layoutParams2.topMargin - layoutParams8.height) - iM5677f4;
                        if (i9 >= iM5677f3) {
                            iM5677f3 = i9;
                        }
                        layoutParams8.topMargin = iM5677f3;
                        view2.setLayoutParams(layoutParams8);
                        view2.setPivotX(AbstractC3754e0.m7909r(width2 - layoutParams8.leftMargin, i10, layoutParams8.width));
                        view2.setPivotY(layoutParams8.height);
                    }
                    iM5677f = m5677f(context, iM7909r / 2);
                }
                iM5677f2 = width2 - iM5677f;
                width = (viewGroup.getWidth() - layoutParams8.width) - iM5677f3;
                if (width < iM5677f3) {
                }
                layoutParams8.leftMargin = AbstractC3754e0.m7909r(iM5677f2, iM5677f3, width);
                i9 = (layoutParams2.topMargin - layoutParams8.height) - iM5677f4;
                if (i9 >= iM5677f3) {
                }
                layoutParams8.topMargin = iM5677f3;
                view2.setLayoutParams(layoutParams8);
                view2.setPivotX(AbstractC3754e0.m7909r(width2 - layoutParams8.leftMargin, i10, layoutParams8.width));
                view2.setPivotY(layoutParams8.height);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m5685n(View view, ViewGroup viewGroup) {
        Object obj = f7807i.get();
        ScrollView scrollView = obj instanceof ScrollView ? (ScrollView) obj : null;
        if (scrollView != null) {
            View childAt = scrollView.getChildAt(0);
            LinearLayout linearLayout = childAt instanceof LinearLayout ? (LinearLayout) childAt : null;
            if (linearLayout != null) {
                Context context = view.getContext();
                context.getClass();
                m5684m(context, viewGroup, view, scrollView, linearLayout);
                scrollView.bringToFront();
                view.bringToFront();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static int m5686o(int[] iArr) {
        if (iArr.length == 0) {
            C2104o.m5287l("Array is empty.");
            return 0;
        }
        int i9 = iArr[0];
        if (iArr.length == 0) {
            C2104o.m5287l("Array is empty.");
            return 0;
        }
        int i10 = iArr[iArr.length - 1];
        return Color.argb((Color.alpha(i10) + Color.alpha(i9)) / 2, (Color.red(i10) + Color.red(i9)) / 2, (Color.green(i10) + Color.green(i9)) / 2, (Color.blue(i10) + Color.blue(i9)) / 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m5687p(InterfaceC1220a interfaceC1220a) {
        RunnableC0133c runnableC0133c = new RunnableC0133c(interfaceC1220a, 2);
        if (AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
            runnableC0133c.run();
        } else {
            f7800b.post(runnableC0133c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m5688q(Activity activity) {
        boolean z9;
        String string;
        if (!activity.isFinishing() && !activity.isDestroyed() && AbstractC1416l.m3825a(activity.getPackageName(), "com.tencent.mm")) {
            SharedPreferences sharedPreferences = f7801c;
            String str = "home";
            if (sharedPreferences != null && (string = sharedPreferences.getString("scope", "home")) != null) {
                str = string;
            }
            if (!str.equals("all")) {
                if (!f7804f) {
                    C3458m c3458mChatPage = WeChatApis.chatPage();
                    if (c3458mChatPage != null) {
                        C3460o c3460o = c3458mChatPage.f11212b;
                        Activity activityM7263a = c3460o != null ? c3460o.m7263a() : null;
                        if (activityM7263a != null) {
                            String name = activityM7263a.getClass().getName();
                            if (!"com.tencent.mm.ui.chatting.ChattingUI".equals(name) && !name.contains(".ui.chatting.")) {
                            }
                        }
                        if (!TextUtils.isEmpty(c3458mChatPage.f11220j)) {
                        }
                        if (activity.getClass().getName().equals("com.tencent.mm.ui.LauncherUI") || z9) {
                        }
                    }
                    z9 = false;
                    if (activity.getClass().getName().equals("com.tencent.mm.ui.LauncherUI")) {
                    }
                }
                z9 = true;
                if (activity.getClass().getName().equals("com.tencent.mm.ui.LauncherUI")) {
                }
            }
            return true;
        }
        return false;
    }
}
