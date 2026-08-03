package p050c0;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p009E0.AbstractC0182m;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p049b0.AbstractC0567q;

/* JADX INFO: renamed from: c0.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0580D0 {

    /* JADX INFO: renamed from: A */
    public static volatile long f1720A;

    /* JADX INFO: renamed from: B */
    public static volatile boolean f1721B;

    /* JADX INFO: renamed from: d */
    public static volatile ClassLoader f1726d;

    /* JADX INFO: renamed from: e */
    public static volatile Context f1727e;

    /* JADX INFO: renamed from: f */
    public static volatile String f1728f;

    /* JADX INFO: renamed from: g */
    public static volatile WeakReference f1729g;

    /* JADX INFO: renamed from: h */
    public static volatile ImageView f1730h;

    /* JADX INFO: renamed from: i */
    public static volatile LinearLayout f1731i;

    /* JADX INFO: renamed from: j */
    public static volatile TextView f1732j;

    /* JADX INFO: renamed from: k */
    public static volatile TextView f1733k;

    /* JADX INFO: renamed from: m */
    public static volatile int f1735m;

    /* JADX INFO: renamed from: p */
    public static volatile boolean f1738p;

    /* JADX INFO: renamed from: q */
    public static volatile long f1739q;

    /* JADX INFO: renamed from: r */
    public static volatile Bitmap f1740r;

    /* JADX INFO: renamed from: s */
    public static volatile boolean f1741s;

    /* JADX INFO: renamed from: t */
    public static volatile Method f1742t;

    /* JADX INFO: renamed from: u */
    public static volatile Method f1743u;

    /* JADX INFO: renamed from: v */
    public static volatile Method f1744v;

    /* JADX INFO: renamed from: w */
    public static volatile int f1745w;

    /* JADX INFO: renamed from: x */
    public static volatile int f1746x;

    /* JADX INFO: renamed from: y */
    public static volatile int f1747y;

    /* JADX INFO: renamed from: z */
    public static volatile boolean f1748z;

    /* JADX INFO: renamed from: a */
    public static final C0580D0 f1723a = new C0580D0();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1724b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final Handler f1725c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l */
    public static volatile String f1734l = "";

    /* JADX INFO: renamed from: n */
    public static volatile String f1736n = "";

    /* JADX INFO: renamed from: o */
    public static volatile String f1737o = "";

    /* JADX INFO: renamed from: C */
    public static volatile String f1722C = "";

    static {
        new AtomicReference(null);
    }

    /* JADX INFO: renamed from: a */
    public static final Activity m1394a(Object obj) {
        Object objM116u;
        if (obj == null) {
            return null;
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField("f190364a");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            objM116u = obj2 instanceof Activity ? (Activity) obj2 : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (Activity) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: b */
    public static void m1395b(final ImageView imageView, boolean z2) {
        Object objM116u;
        String str;
        ClassLoader classLoader = f1726d;
        if (classLoader == null) {
            classLoader = imageView.getContext().getClassLoader();
        }
        AbstractC0307g.m700b(classLoader);
        String strM1409p = m1409p(classLoader);
        if (AbstractC0425j.m1013R0(strM1409p)) {
            strM1409p = f1736n;
        }
        if (AbstractC0425j.m1013R0(strM1409p)) {
            m1412s("username empty");
            return;
        }
        f1736n = strM1409p;
        Bitmap bitmap = f1740r;
        if (f1741s && AbstractC0307g.m699a(f1737o, strM1409p) && bitmap != null && !bitmap.isRecycled() && !m1402i(imageView)) {
            imageView.setImageBitmap(bitmap);
            final int i2 = 0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: c0.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Activity activity;
                    Activity activity2;
                    switch (i2) {
                        case 0:
                            ImageView imageView2 = imageView;
                            AbstractC0307g.m703e(imageView2, "$iv");
                            WeakReference weakReference = C0580D0.f1729g;
                            if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
                                Context context = imageView2.getContext();
                                activity = context instanceof Activity ? (Activity) context : null;
                            }
                            if (activity != null) {
                                AbstractC0358S.m913u0(activity);
                            }
                            break;
                        default:
                            ImageView imageView3 = imageView;
                            AbstractC0307g.m703e(imageView3, "$iv");
                            WeakReference weakReference2 = C0580D0.f1729g;
                            if (weakReference2 == null || (activity2 = (Activity) weakReference2.get()) == null) {
                                Context context2 = imageView3.getContext();
                                activity2 = context2 instanceof Activity ? (Activity) context2 : null;
                            }
                            if (activity2 != null) {
                                AbstractC0358S.m913u0(activity2);
                            }
                            break;
                    }
                }
            });
            return;
        }
        Bitmap bitmapM1403j = m1403j(classLoader, strM1409p);
        if (bitmapM1403j == null || bitmapM1403j.isRecycled()) {
            m1406m(imageView);
        } else {
            if (!bitmapM1403j.isRecycled()) {
                f1740r = bitmapM1403j;
                f1741s = true;
            }
            if (z2 || m1402i(imageView) || !AbstractC0307g.m699a(f1737o, strM1409p)) {
                imageView.setImageBitmap(bitmapM1403j);
            }
        }
        if (z2 || !AbstractC0307g.m699a(f1737o, strM1409p) || m1402i(imageView)) {
            try {
                Method methodM1408o = f1742t;
                if (methodM1408o == null && (methodM1408o = m1408o(classLoader)) == null) {
                    throw new IllegalStateException("factoryA unresolved");
                }
                methodM1408o.invoke(null, imageView, strM1409p);
                objM116u = Boolean.TRUE;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            if (thM465a == null) {
                str = "";
            } else {
                String message = thM465a.getMessage();
                if (message == null) {
                    message = thM465a.getClass().getSimpleName();
                }
                str = message;
                objM116u = Boolean.FALSE;
            }
            if (!((Boolean) objM116u).booleanValue()) {
                m1412s("factory bind fail user=" + strM1409p + " err=" + ((Object) str));
                f1725c.postDelayed(new RunnableC0705w0(imageView, 0), 800L);
                return;
            }
            f1737o = strM1409p;
            final int i3 = 1;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: c0.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Activity activity;
                    Activity activity2;
                    switch (i3) {
                        case 0:
                            ImageView imageView2 = imageView;
                            AbstractC0307g.m703e(imageView2, "$iv");
                            WeakReference weakReference = C0580D0.f1729g;
                            if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
                                Context context = imageView2.getContext();
                                activity = context instanceof Activity ? (Activity) context : null;
                            }
                            if (activity != null) {
                                AbstractC0358S.m913u0(activity);
                            }
                            break;
                        default:
                            ImageView imageView3 = imageView;
                            AbstractC0307g.m703e(imageView3, "$iv");
                            WeakReference weakReference2 = C0580D0.f1729g;
                            if (weakReference2 == null || (activity2 = (Activity) weakReference2.get()) == null) {
                                Context context2 = imageView3.getContext();
                                activity2 = context2 instanceof Activity ? (Activity) context2 : null;
                            }
                            if (activity2 != null) {
                                AbstractC0358S.m913u0(activity2);
                            }
                            break;
                    }
                }
            });
            f1746x++;
            final int i4 = f1746x;
            Handler handler = f1725c;
            final int i5 = 0;
            handler.postDelayed(new Runnable() { // from class: c0.v0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i5) {
                        case 0:
                            int i6 = i4;
                            ImageView imageView2 = imageView;
                            AbstractC0307g.m703e(imageView2, "$iv");
                            if (i6 == C0580D0.f1746x) {
                                C0580D0 c0580d0 = C0580D0.f1723a;
                                C0580D0.m1396c(imageView2);
                            }
                            break;
                        default:
                            int i7 = i4;
                            ImageView imageView3 = imageView;
                            AbstractC0307g.m703e(imageView3, "$iv");
                            if (i7 == C0580D0.f1746x) {
                                C0580D0 c0580d02 = C0580D0.f1723a;
                                C0580D0.m1396c(imageView3);
                            }
                            break;
                    }
                }
            }, 400L);
            final int i6 = 1;
            handler.postDelayed(new Runnable() { // from class: c0.v0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            int i62 = i4;
                            ImageView imageView2 = imageView;
                            AbstractC0307g.m703e(imageView2, "$iv");
                            if (i62 == C0580D0.f1746x) {
                                C0580D0 c0580d0 = C0580D0.f1723a;
                                C0580D0.m1396c(imageView2);
                            }
                            break;
                        default:
                            int i7 = i4;
                            ImageView imageView3 = imageView;
                            AbstractC0307g.m703e(imageView3, "$iv");
                            if (i7 == C0580D0.f1746x) {
                                C0580D0 c0580d02 = C0580D0.f1723a;
                                C0580D0.m1396c(imageView3);
                            }
                            break;
                    }
                }
            }, 1200L);
            m1412s("bound user=" + strM1409p + " force=" + z2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1396c(ImageView imageView) {
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null) {
                return;
            }
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap != null && !bitmap.isRecycled() && !bitmap.isRecycled()) {
                    f1740r = bitmap;
                    f1741s = true;
                    return;
                }
                return;
            }
            for (Class<?> superclass = drawable.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
                while (c0172cM714c.hasNext()) {
                    Field field = (Field) c0172cM714c.next();
                    if (AbstractC0307g.m699a(field.getType(), Bitmap.class)) {
                        field.setAccessible(true);
                        Object obj = field.get(drawable);
                        Bitmap bitmap2 = obj instanceof Bitmap ? (Bitmap) obj : null;
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            if (bitmap2.isRecycled()) {
                                return;
                            }
                            f1740r = bitmap2;
                            f1741s = true;
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m1397d(Context context, int i2) {
        return (int) ((i2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: e */
    public static View m1398e(final Activity activity) {
        LinearLayout linearLayout = f1731i;
        if (linearLayout != null) {
            if (linearLayout.isAttachedToWindow()) {
                return linearLayout;
            }
            try {
                ViewParent parent = linearLayout.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(linearLayout);
                }
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
            f1731i = null;
            f1730h = null;
            f1737o = "";
        }
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ?? r2 = decorView instanceof ViewGroup ? (ViewGroup) decorView : 0;
        if (r2 == 0) {
            View viewFindViewById = activity.findViewById(R.id.content);
            r2 = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : 0;
            if (r2 == 0) {
                return linearLayout == null ? new View(activity) : linearLayout;
            }
        }
        if (!(r2 instanceof FrameLayout)) {
            View viewFindViewById2 = r2.findViewById(R.id.content);
            ViewGroup viewGroup2 = viewFindViewById2 instanceof ViewGroup ? (ViewGroup) viewFindViewById2 : null;
            if (viewGroup2 != null) {
                r2 = viewGroup2;
            }
        }
        int iM1397d = m1397d(activity, 38);
        ?? linearLayout2 = new LinearLayout(activity);
        linearLayout2.setTag("achat_home_avatar_v3");
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClickable(false);
        linearLayout2.setFocusable(false);
        ImageView imageView = new ImageView(activity);
        imageView.setTag("achat_home_avatar_v3_avatar");
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setContentDescription("头像");
        imageView.setImportantForAccessibility(1);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#D0D0D0"));
        imageView.setBackground(gradientDrawable);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new C0571A0(0));
        final int i2 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: c0.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activity2 = activity;
                switch (i2) {
                    case 0:
                        AbstractC0307g.m703e(activity2, "$activity");
                        AbstractC0358S.m913u0(activity2);
                        break;
                    case 1:
                        AbstractC0307g.m703e(activity2, "$activity");
                        C0580D0 c0580d0 = C0580D0.f1723a;
                        C0580D0.m1405l(activity2);
                        break;
                    default:
                        AbstractC0307g.m703e(activity2, "$activity");
                        C0580D0 c0580d02 = C0580D0.f1723a;
                        C0580D0.m1405l(activity2);
                        break;
                }
            }
        });
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(iM1397d, iM1397d));
        f1730h = imageView;
        m1406m(imageView);
        ?? linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(16);
        linearLayout3.setClickable(true);
        linearLayout3.setFocusable(true);
        final int i3 = 1;
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: c0.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activity2 = activity;
                switch (i3) {
                    case 0:
                        AbstractC0307g.m703e(activity2, "$activity");
                        AbstractC0358S.m913u0(activity2);
                        break;
                    case 1:
                        AbstractC0307g.m703e(activity2, "$activity");
                        C0580D0 c0580d0 = C0580D0.f1723a;
                        C0580D0.m1405l(activity2);
                        break;
                    default:
                        AbstractC0307g.m703e(activity2, "$activity");
                        C0580D0 c0580d02 = C0580D0.f1723a;
                        C0580D0.m1405l(activity2);
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(m1397d(activity, 10));
        linearLayout2.addView(linearLayout3, layoutParams);
        TextView textView = new TextView(activity);
        textView.setTag("achat_home_avatar_v3_nick");
        textView.setTextSize(2, 14.0f);
        textView.setTextColor(Color.parseColor((activity.getResources().getConfiguration().uiMode & 48) == 32 ? "#F0F0F0" : "#191919"));
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxWidth(m1397d(activity, 130));
        textView.setIncludeFontPadding(false);
        linearLayout3.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        f1733k = textView;
        LinearLayout linearLayout4 = new LinearLayout(activity);
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        linearLayout4.setClickable(true);
        linearLayout4.setFocusable(true);
        final int i4 = 2;
        linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: c0.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activity2 = activity;
                switch (i4) {
                    case 0:
                        AbstractC0307g.m703e(activity2, "$activity");
                        AbstractC0358S.m913u0(activity2);
                        break;
                    case 1:
                        AbstractC0307g.m703e(activity2, "$activity");
                        C0580D0 c0580d0 = C0580D0.f1723a;
                        C0580D0.m1405l(activity2);
                        break;
                    default:
                        AbstractC0307g.m703e(activity2, "$activity");
                        C0580D0 c0580d02 = C0580D0.f1723a;
                        C0580D0.m1405l(activity2);
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = m1397d(activity, 2);
        linearLayout3.addView(linearLayout4, layoutParams2);
        View view = new View(activity);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.parseColor("#34C759"));
        view.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(m1397d(activity, 7), m1397d(activity, 7));
        layoutParams3.setMarginEnd(m1397d(activity, 4));
        layoutParams3.gravity = 16;
        linearLayout4.addView(view, layoutParams3);
        TextView textView2 = new TextView(activity);
        textView2.setTag("achat_home_avatar_v3_status");
        textView2.setTextSize(2, 11.5f);
        textView2.setTextColor(Color.parseColor((activity.getResources().getConfiguration().uiMode & 48) == 32 ? "#AAAAAA" : "#7F7F7F"));
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxWidth(m1397d(activity, 130));
        textView2.setIncludeFontPadding(false);
        linearLayout4.addView(textView2, new LinearLayout.LayoutParams(-2, -2));
        f1732j = textView2;
        m1407n(activity);
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int iM1397d2 = m1397d(activity, 8) + (identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : m1397d(activity, 28));
        int iM1397d3 = m1397d(activity, 12);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, 8388659);
        layoutParams4.topMargin = iM1397d2;
        layoutParams4.setMarginStart(iM1397d3);
        layoutParams4.leftMargin = iM1397d3;
        r2.addView(linearLayout2, layoutParams4);
        linearLayout2.setElevation(m1397d(activity, 12));
        linearLayout2.setTranslationZ(m1397d(activity, 12));
        f1731i = linearLayout2;
        m1412s("avatar container created");
        return linearLayout2;
    }

    /* JADX INFO: renamed from: f */
    public static Activity m1399f(Context context) {
        Object objM116u;
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        for (Class<?> superclass = context.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
            while (c0172cM714c.hasNext()) {
                Field field = (Field) c0172cM714c.next();
                if (Activity.class.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    try {
                        Object obj = field.get(context);
                        objM116u = obj instanceof Activity ? (Activity) obj : null;
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    if (objM116u instanceof C0140f) {
                        objM116u = null;
                    }
                    Activity activity = (Activity) objM116u;
                    if (activity != null) {
                        return activity;
                    }
                }
            }
        }
        WeakReference weakReference = f1729g;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static View m1400g(Object obj) {
        Object objM116u;
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
            while (c0172cM714c.hasNext()) {
                Field field = (Field) c0172cM714c.next();
                if (View.class.isAssignableFrom(field.getType())) {
                    String name = field.getName();
                    AbstractC0307g.m700b(name);
                    if (AbstractC0425j.m1005J0(name, "ViewPager", true) || AbstractC0425j.m1005J0(field.getType().getName(), "ViewPager", true)) {
                        field.setAccessible(true);
                        try {
                            Object obj2 = field.get(obj);
                            objM116u = obj2 instanceof View ? (View) obj2 : null;
                        } catch (Throwable th) {
                            objM116u = AbstractC0040p.m116u(th);
                        }
                        if (objM116u instanceof C0140f) {
                            objM116u = null;
                        }
                        View view = (View) objM116u;
                        if (view != null) {
                            return view;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1401h(boolean z2) {
        Object objM116u;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!z2 && f1739q > 0 && jUptimeMillis - f1739q < 4000) {
            return f1738p;
        }
        if (z2) {
            try {
                C0661h1 c0661h1 = C0661h1.f2048a;
                C0661h1.m1665i(true);
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
        }
        C0661h1 c0661h12 = C0661h1.f2048a;
        objM116u = Boolean.valueOf(C0661h1.m1661c("home_avatar_entry", true));
        Object obj = Boolean.TRUE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        f1738p = ((Boolean) objM116u).booleanValue();
        f1739q = jUptimeMillis;
        return f1738p;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1402i(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable == null || (drawable instanceof GradientDrawable)) {
            return true;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return false;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap == null || bitmap.isRecycled();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m1403j(ClassLoader classLoader, String str) {
        Object objM116u;
        Method method;
        Method method2;
        try {
            Method method3 = f1743u;
            if (method3 == null) {
                Method[] methods = Class.forName("com.tencent.mm.pluginsdk.ui.u", false, classLoader).getMethods();
                AbstractC0307g.m702d(methods, "getMethods(...)");
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method2 = null;
                        break;
                    }
                    method2 = methods[i2];
                    if (AbstractC0307g.m699a(method2.getName(), "c")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && Modifier.isStatic(method2.getModifiers())) {
                            break;
                        }
                    }
                    i2++;
                }
                if (method2 != null) {
                    method2.setAccessible(true);
                    f1743u = method2;
                    method3 = method2;
                } else {
                    method3 = null;
                }
                if (method3 == null) {
                    return null;
                }
            }
            Object objInvoke = method3.invoke(null, null);
            if (objInvoke == null) {
                return null;
            }
            Method method4 = f1744v;
            if (method4 == null) {
                Method[] methods2 = objInvoke.getClass().getMethods();
                AbstractC0307g.m702d(methods2, "getMethods(...)");
                int length2 = methods2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        method = null;
                        break;
                    }
                    method = methods2[i3];
                    if (AbstractC0307g.m699a(method.getName(), "loadBitmap") && method.getParameterTypes().length == 1 && AbstractC0307g.m699a(method.getParameterTypes()[0], String.class)) {
                        break;
                    }
                    i3++;
                }
                if (method != null) {
                    method.setAccessible(true);
                    f1744v = method;
                    method4 = method;
                } else {
                    method4 = null;
                }
                if (method4 == null) {
                    return null;
                }
            }
            Object objInvoke2 = method4.invoke(objInvoke, str);
            Bitmap bitmap = objInvoke2 instanceof Bitmap ? (Bitmap) objInvoke2 : null;
            if (bitmap != null) {
                boolean zIsRecycled = bitmap.isRecycled();
                objM116u = bitmap;
                if (zIsRecycled) {
                    objM116u = null;
                }
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (Bitmap) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: k */
    public static void m1404k(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        if (activity.isFinishing()) {
            return;
        }
        f1729g = new WeakReference(activity);
        m1410q(activity);
        f1747y++;
        f1725c.postDelayed(new RunnableC0711y0(f1747y, activity, 1), 350L);
    }

    /* JADX INFO: renamed from: l */
    public static void m1405l(Activity activity) {
        Object objM116u;
        int i2 = 0;
        for (String str : AbstractC0182m.m556h0("com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2", "com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity", "com.tencent.mm.plugin.textstatus.ui.TextStatusNewActivity", "com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivityV2", "com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity", "com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity")) {
            int i3 = i2 + 1;
            try {
                Intent intent = new Intent();
                intent.setClassName(activity, str);
                if (i2 == 0) {
                    intent.putExtra("KEY_IS_ENTER", true);
                }
                activity.startActivity(intent);
                objM116u = Boolean.TRUE;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Object obj = Boolean.FALSE;
            if (objM116u instanceof C0140f) {
                objM116u = obj;
            }
            if (((Boolean) objM116u).booleanValue()) {
                m1412s("opened status page via " + str);
                return;
            }
            i2 = i3;
        }
        m1412s("failed to open status page");
    }

    /* JADX INFO: renamed from: m */
    public static void m1406m(ImageView imageView) {
        Bitmap bitmap = f1740r;
        if (bitmap == null || bitmap.isRecycled() || !f1741s) {
            return;
        }
        if (imageView.getDrawable() == null || m1402i(imageView)) {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m1407n(Activity activity) {
        Object objM116u;
        ClassLoader classLoader = f1726d;
        if (classLoader == null) {
            classLoader = activity.getClassLoader();
        }
        String str = f1734l;
        if (AbstractC0425j.m1013R0(str)) {
            try {
                AtomicReference atomicReference = AbstractC0567q.f1676a;
                AbstractC0307g.m700b(classLoader);
                objM116u = AbstractC0567q.m1381d(f1727e, classLoader, f1728f);
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (objM116u instanceof C0140f) {
                objM116u = null;
            }
            str = (String) objM116u;
            if (str == null) {
                str = "";
            }
            f1734l = str;
        }
        if (AbstractC0425j.m1013R0(str)) {
            str = "我";
        }
        TextView textView = f1733k;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = f1732j;
        if (textView2 != null) {
            textView2.setText("在线");
        }
    }

    /* JADX INFO: renamed from: o */
    public static Method m1408o(ClassLoader classLoader) {
        Object objM116u;
        Method method;
        if (f1742t != null) {
            return f1742t;
        }
        try {
            Method[] declaredMethods = Class.forName("com.tencent.mm.pluginsdk.ui.u", false, classLoader).getDeclaredMethods();
            AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                Method method2 = declaredMethods[i2];
                if (AbstractC0307g.m699a(method2.getName(), "a") && method2.getParameterTypes().length == 2 && ImageView.class.isAssignableFrom(method2.getParameterTypes()[0]) && AbstractC0307g.m699a(method2.getParameterTypes()[1], String.class)) {
                    method = method2;
                    break;
                }
                i2++;
            }
            if (method != null) {
                method.setAccessible(true);
                f1742t = method;
                objM116u = method;
            } else {
                objM116u = null;
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (Method) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: p */
    public static String m1409p(ClassLoader classLoader) {
        if (!AbstractC0425j.m1013R0(f1736n)) {
            return f1736n;
        }
        AtomicReference atomicReference = AbstractC0567q.f1676a;
        Context context = f1727e;
        String str = f1728f;
        AbstractC0307g.m703e(classLoader, "classLoader");
        AtomicReference atomicReference2 = AbstractC0567q.f1676a;
        Object obj = atomicReference2.get();
        AbstractC0307g.m700b((String) obj);
        if (!(!AbstractC0425j.m1013R0(r4))) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        String strM1380c = AbstractC0567q.m1380c(context, classLoader, str);
        if (!(!AbstractC0425j.m1013R0(strM1380c))) {
            return "";
        }
        atomicReference2.set(strM1380c);
        AbstractC0567q.m1382e("resolved=".concat(strM1380c));
        return strM1380c;
    }

    /* JADX INFO: renamed from: q */
    public static void m1410q(Activity activity) {
        f1745w++;
        f1725c.post(new RunnableC0711y0(f1745w, activity, 0));
    }

    /* JADX INFO: renamed from: r */
    public static void m1411r(boolean z2) {
        View view = f1731i;
        if (view == null && (view = f1730h) == null) {
            return;
        }
        int i2 = z2 ? 0 : 4;
        if (view.getVisibility() == i2) {
            return;
        }
        if (AbstractC0307g.m699a(Looper.myLooper(), Looper.getMainLooper())) {
            view.setVisibility(i2);
        } else {
            f1725c.post(new RunnableC0714z0(view, i2, 0));
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m1412s(String str) {
        try {
            AbstractC0762d.m1954d("OKK-HomeAvatar: " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }
}
