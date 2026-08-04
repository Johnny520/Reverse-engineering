package com.p000ss.android.ugc.awemes;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.simpleframework.xml.strategy.Name;
import yyds.AbstractC0055;
import yyds.AbstractC0185;
import yyds.AbstractC0333;
import yyds.AbstractC0347;
import yyds.AbstractC0405;
import yyds.AbstractC0473;
import yyds.AbstractC0578;
import yyds.AbstractC0598;
import yyds.AbstractC0897;
import yyds.AbstractC1529;
import yyds.AbstractC1544;
import yyds.AbstractC1595;
import yyds.AbstractC1640;
import yyds.AbstractC1655;
import yyds.AbstractC1897;
import yyds.AbstractC2328;
import yyds.AbstractC2366;
import yyds.AbstractC2709;
import yyds.AbstractC2725;
import yyds.C0078;
import yyds.C0114;
import yyds.C0119;
import yyds.C0135;
import yyds.C0156;
import yyds.C0188;
import yyds.C0539;
import yyds.C0548;
import yyds.C0558;
import yyds.C0685;
import yyds.C0798;
import yyds.C0803;
import yyds.C0954;
import yyds.C1016;
import yyds.C1109;
import yyds.C1125;
import yyds.C1213;
import yyds.C1300;
import yyds.C1335;
import yyds.C1416;
import yyds.C1480;
import yyds.C1633;
import yyds.C1703;
import yyds.C1860;
import yyds.C2001;
import yyds.C2014;
import yyds.C2039;
import yyds.C2123;
import yyds.C2248;
import yyds.C2393;
import yyds.C2471;
import yyds.C2645;
import yyds.C2658;
import yyds.EnumC0110;
import yyds.InterfaceC0770;
import yyds.InterfaceC1549;
import yyds.InterfaceC2324;
import yyds.RunnableC0309;
import yyds.RunnableC1671;
import yyds.RunnableC1730;
import yyds.RunnableC2555;
import yyds.RunnableC2696;
import yyds.ViewOnClickListenerC0573;
import yyds.ViewOnLayoutChangeListenerC2008;
import yyds.ViewTreeObserverOnGlobalLayoutListenerC0562;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends Activity implements InterfaceC2324 {

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static final List f451;

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public C0803 f452;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public View f453;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public TextView f454;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public TextView f455;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public boolean f456;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public LinearLayout f457;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C0798 f458;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public Thread f459;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public boolean f460;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public TextView f461;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public View f462;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public boolean f463;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public int f464;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public TextView f465;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public TextView f466;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public Set f467;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public C1416 f468;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public TextView f469;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public Switch f470;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public volatile boolean f473;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public View f474;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public LinearLayout f478;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public TextView f480;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0798 f481;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C1213 f482;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public volatile int f483;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public C1016 f477 = (C1016) f451.get(0);

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public EnumC0110 f472 = EnumC0110.f755;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final C0156 f475 = new C0156(this);

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final C0078 f476 = new C0078(new C0685(this, 5));

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public final C0954 f479 = new C0954(this, 0);

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final C0954 f471 = new C0954(this, 1);

    /* JADX INFO: renamed from: com.ss.android.ugc.awemes.MainActivity$ᛲᲈᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C0042 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        @InterfaceC0770(alternate = {Name.MARK}, value = "packageName")
        private final String f484;

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        @InterfaceC0770(alternate = {"versionCode"}, value = "updateVersionCode")
        private final String f485;

        public C0042() {
            String strM4341 = AbstractC2328.m4341(-1269381452170094L);
            String strM43412 = AbstractC2328.m4341(-1269385747137390L);
            AbstractC2328.m4341(-1269252603151214L);
            AbstractC2328.m4341(-1269304142758766L);
            this.f484 = strM4341;
            this.f485 = strM43412;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0042)) {
                return false;
            }
            C0042 c0042 = (C0042) obj;
            return AbstractC1544.m3188(this.f484, c0042.f484) && AbstractC1544.m3188(this.f485, c0042.f485);
        }

        public final int hashCode() {
            return this.f485.hashCode() + (this.f484.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1269518891123566L));
            AbstractC0897.m2002(sb, this.f484, -1269639150207854L);
            return AbstractC0897.m2000(sb, this.f485, ')');
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        public final String m341() {
            return this.f484;
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final String m342() {
            return this.f485;
        }
    }

    static {
        AbstractC2328.m4341(-273580399690606L);
        AbstractC2328.m4341(-273640529232750L);
        AbstractC2328.m4341(-273662004069230L);
        AbstractC2328.m4341(-273700658774894L);
        AbstractC2328.m4341(-273743608447854L);
        f451 = AbstractC2725.m4854(new C1016(-15818898, AbstractC2328.m4341(-273850982630254L), -2856184, AbstractC2328.m4341(-273885342368622L), AbstractC2328.m4341(-273902522237806L)), new C1016(-13664019, AbstractC2328.m4341(-273954061845358L), -878262, AbstractC2328.m4341(-273979831649134L), AbstractC2328.m4341(-273997011518318L)), new C1016(-7643914, AbstractC2328.m4341(-274044256158574L), -757066, AbstractC2328.m4341(-274074320929646L), AbstractC2328.m4341(-274091500798830L)), new C1016(-119723, AbstractC2328.m4341(-274138745439086L), -38091, AbstractC2328.m4341(-274164515242862L), AbstractC2328.m4341(-274181695112046L)), new C1016(-3562969, AbstractC2328.m4341(-274228939752302L), -10790042, AbstractC2328.m4341(-274250414588782L), AbstractC2328.m4341(-274267594457966L)));
    }

    private final boolean isLauncherIconShowing() {
        Object c2658;
        try {
            int componentEnabledSetting = getPackageManager().getComponentEnabledSetting((ComponentName) this.f476.getValue());
            c2658 = Boolean.valueOf((componentEnabledSetting == 2 || componentEnabledSetting == 3 || componentEnabledSetting == 4) ? false : true);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Object obj = Boolean.TRUE;
        if (c2658 instanceof C2658) {
            c2658 = obj;
        }
        return ((Boolean) c2658).booleanValue();
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static GradientDrawable m303(int i, float f, Integer num, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        if (num != null && i2 > 0) {
            gradientDrawable.setStroke(i2, num.intValue());
        }
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static int m304(MainActivity mainActivity) {
        int iM338 = mainActivity.m338(true);
        mainActivity.getClass();
        return (Math.max(m309(-1), m309(iM338)) + 0.05d) / (Math.min(m309(-1), m309(iM338)) + 0.05d) >= (Math.max(m309(-15261654), m309(iM338)) + 0.05d) / (Math.min(m309(-15261654), m309(iM338)) + 0.05d) ? -1 : -15261654;
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static final double m305(int i) {
        double d = ((double) i) / 255.0d;
        return d <= 0.03928d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static C2471 m306() {
        return new C2471(AbstractC2328.m4341(-270913224999790L), AbstractC2328.m4341(-270943289770862L), null, null);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final GradientDrawable m307(MainActivity mainActivity, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(mainActivity.m311(13));
        gradientDrawable.setSize(mainActivity.m315(48), mainActivity.m315(26));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static int m308(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return ((int) (((i2 & 255) * f2) + ((i & 255) * f))) | (-16777216) | (((int) ((((i2 >> 16) & 255) * f2) + (((i >> 16) & 255) * f))) << 16) | (((int) ((((i2 >> 8) & 255) * f2) + (((i >> 8) & 255) * f))) << 8);
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static double m309(int i) {
        return (m305(Color.blue(i)) * 0.0722d) + (m305(Color.green(i)) * 0.7152d) + (m305(Color.red(i)) * 0.2126d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.app.Activity, android.content.Context, com.ss.android.ugc.awemes.MainActivity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v21, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v26, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object next;
        ?? r13;
        C0798 c0798;
        List list = f451;
        super.onCreate(bundle);
        System.loadLibrary(AbstractC2328.m4341(-262413484721006L));
        Context applicationContext = getApplicationContext();
        WeakReference weakReference = AbstractC1655.f8450;
        if (applicationContext == null) {
            Log.e(">>>", "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki");
        } else {
            AbstractC1655.f8450 = new WeakReference(applicationContext);
            AbstractC0041.m261(applicationContext);
        }
        this.f472 = AbstractC1544.m3188(getPreferences(0).getString(AbstractC2328.m4341(-262443549492078L), null), AbstractC2328.m4341(-262503679034222L)) ? EnumC0110.f756 : EnumC0110.f755;
        String string = getPreferences(0).getString(AbstractC2328.m4341(-262525153870702L), null);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C1016) next).f4609.equals(string)) {
                    break;
                }
            }
        }
        C1016 c1016 = (C1016) next;
        if (c1016 == null) {
            c1016 = (C1016) list.get(0);
        }
        this.f477 = c1016;
        AbstractC0578.m1454(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setStatusBarContrastEnforced(false);
        getWindow().setNavigationBarContrastEnforced(false);
        Window window = getWindow();
        C0135 c0135 = new C0135(getWindow().getDecorView());
        C0119 c2393 = Build.VERSION.SDK_INT >= 35 ? new C2393(window, c0135) : new C0119(window, c0135);
        final int i = 1;
        c2393.mo568(!((getResources().getConfiguration().uiMode & 48) == 32));
        c2393.mo565(!((getResources().getConfiguration().uiMode & 48) == 32));
        C0156 c0156 = this.f475;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, m315(8), 0, 0);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f478 = linearLayout;
        int i2 = 3;
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0562(i2, this));
        LinearLayout linearLayout2 = this.f478;
        if (linearLayout2 == null) {
            AbstractC2328.m4341(-262714132431726L);
            linearLayout2 = null;
        }
        C2123 c2123 = new C2123(this);
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC2709.m4820(linearLayout2, c2123);
        LinearLayout linearLayout3 = this.f478;
        if (linearLayout3 == null) {
            AbstractC2328.m4341(-262735607268206L);
            linearLayout3 = null;
        }
        linearLayout3.requestApplyInsets();
        LinearLayout linearLayout4 = this.f478;
        ?? r3 = linearLayout4;
        if (linearLayout4 == null) {
            AbstractC2328.m4341(-262757082104686L);
            r3 = 0;
        }
        ?? linearLayout5 = new LinearLayout(this);
        linearLayout5.setOrientation(1);
        int iM315 = m315(16);
        linearLayout5.setPadding(iM315, iM315, iM315, iM315);
        linearLayout5.setBackground(m303(m316(R.color.card_bg), m311(16), Integer.valueOf(m316(R.color.divider_color)), m315(1)));
        linearLayout5.setElevation(m311(3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = m315(12);
        layoutParams.rightMargin = m315(12);
        layoutParams.bottomMargin = m315(4);
        linearLayout5.setLayoutParams(layoutParams);
        ?? linearLayout6 = new LinearLayout(this);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(16);
        ImageView imageView = new ImageView(this);
        imageView.setImageDrawable(getApplicationInfo().loadIcon(getPackageManager()));
        imageView.setLayoutParams(new LinearLayout.LayoutParams(m315(38), m315(38)));
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new C2645(this, i2));
        imageView.setClickable(true);
        imageView.setFocusable(true);
        TypedValue typedValue = new TypedValue();
        imageView.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
        imageView.setForeground(imageView.getContext().getDrawable(typedValue.resourceId));
        imageView.setOnClickListener(new ViewOnClickListenerC0573(this, imageView, 0));
        linearLayout6.addView(imageView);
        LinearLayout linearLayout7 = new LinearLayout(this);
        linearLayout7.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.leftMargin = m315(10);
        linearLayout7.setLayoutParams(layoutParams2);
        TextView textView = new TextView(this);
        textView.setText(AbstractC2328.m4341(-263083499619182L));
        textView.setTextSize(17.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setTextColor(m316(R.color.primary_text));
        linearLayout7.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setTextSize(12.0f);
        textView2.setTextColor(m316(R.color.secondary_text));
        textView2.setPadding(0, m315(3), 0, 0);
        textView2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f466 = textView2;
        linearLayout7.addView(textView2);
        LinearLayout linearLayout8 = new LinearLayout(this);
        linearLayout8.setOrientation(0);
        linearLayout8.setGravity(17);
        linearLayout8.setPadding(m315(10), m315(6), m315(10), m315(6));
        this.f457 = linearLayout8;
        View view = new View(this);
        view.setLayoutParams(new LinearLayout.LayoutParams(m315(6), m315(6)));
        this.f474 = view;
        TextView textView3 = new TextView(this);
        textView3.setTextSize(11.0f);
        textView3.setTypeface(typeface);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = m315(5);
        textView3.setLayoutParams(layoutParams3);
        this.f469 = textView3;
        LinearLayout linearLayout9 = this.f457;
        if (linearLayout9 == null) {
            AbstractC2328.m4341(-263190873801582L);
            linearLayout9 = null;
        }
        View view2 = this.f474;
        if (view2 == null) {
            AbstractC2328.m4341(-263293953016686L);
            view2 = null;
        }
        linearLayout9.addView(view2);
        LinearLayout linearLayout10 = this.f457;
        if (linearLayout10 == null) {
            AbstractC2328.m4341(-263371262428014L);
            linearLayout10 = null;
        }
        TextView textView4 = this.f469;
        if (textView4 == null) {
            AbstractC2328.m4341(-263474341643118L);
            textView4 = null;
        }
        linearLayout10.addView(textView4);
        linearLayout6.addView(linearLayout7);
        LinearLayout linearLayout11 = this.f457;
        if (linearLayout11 == null) {
            AbstractC2328.m4341(-263555946021742L);
            linearLayout11 = null;
        }
        linearLayout6.addView(linearLayout11);
        linearLayout5.addView(linearLayout6);
        LinearLayout linearLayout12 = new LinearLayout(this);
        linearLayout12.setOrientation(1);
        linearLayout12.setPadding(m315(12), m315(10), m315(12), m315(10));
        linearLayout12.setBackground(m303(m316(R.color.status_neutral_bg), m311(10), null, 0));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = m315(12);
        linearLayout12.setLayoutParams(layoutParams4);
        TextView textView5 = new TextView(this);
        textView5.setTextSize(12.0f);
        textView5.setTextColor(m316(R.color.secondary_text));
        final int i3 = 2;
        textView5.setLineSpacing(m311(2), 1.0f);
        this.f454 = textView5;
        linearLayout12.addView(textView5);
        linearLayout5.addView(linearLayout12);
        int iM3152 = m315(12);
        int iM3153 = m315(12);
        View view3 = new View(this);
        view3.setBackgroundColor(m316(R.color.divider_color));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, m315(1));
        layoutParams5.topMargin = iM3152;
        layoutParams5.bottomMargin = iM3153;
        view3.setLayoutParams(layoutParams5);
        linearLayout5.addView(view3);
        ?? linearLayout13 = new LinearLayout(this);
        linearLayout13.setOrientation(0);
        linearLayout13.setGravity(16);
        LinearLayout linearLayout14 = new LinearLayout(this);
        linearLayout14.setOrientation(1);
        linearLayout14.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView6 = new TextView(this);
        textView6.setText(AbstractC2328.m4341(-263744924582766L));
        textView6.setTextSize(14.0f);
        textView6.setTypeface(typeface);
        textView6.setTextColor(m316(R.color.primary_text));
        linearLayout14.addView(textView6);
        TextView textView7 = new TextView(this);
        textView7.setTextSize(12.0f);
        textView7.setTextColor(m316(R.color.secondary_text));
        textView7.setPadding(0, m315(4), 0, 0);
        this.f455 = textView7;
        linearLayout14.addView(textView7);
        Switch r6 = new Switch(this);
        r6.setText(AbstractC2328.m4341(-263865183667054L));
        r6.setThumbDrawable(r6.getResources().getDrawable(R.drawable.switch_thumb, getTheme()));
        r6.setTrackDrawable(m317());
        r6.setSplitTrack(false);
        r6.setPadding(m315(12), 0, 0, 0);
        r6.setOnCheckedChangeListener(new C1703(2, this));
        this.f470 = r6;
        linearLayout13.addView(linearLayout14);
        Switch r4 = this.f470;
        if (r4 == null) {
            AbstractC2328.m4341(-263869478634350L);
            r4 = null;
        }
        linearLayout13.addView(r4);
        linearLayout5.addView(linearLayout13);
        m334();
        r3.addView(linearLayout5);
        LinearLayout linearLayout15 = this.f478;
        if (linearLayout15 == null) {
            AbstractC2328.m4341(-262778556941166L);
            r13 = 0;
        } else {
            r13 = linearLayout15;
        }
        ?? linearLayout16 = new LinearLayout(this);
        linearLayout16.setOrientation(0);
        linearLayout16.setGravity(16);
        linearLayout16.setPadding(m315(16), m315(4), m315(12), m315(8));
        linearLayout16.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout17 = new LinearLayout(this);
        linearLayout17.setOrientation(1);
        linearLayout17.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView8 = new TextView(this);
        textView8.setText(AbstractC2328.m4341(-263951083012974L));
        textView8.setTextSize(15.0f);
        textView8.setTypeface(typeface);
        textView8.setTextColor(m316(R.color.primary_text));
        linearLayout17.addView(textView8);
        TextView textView9 = new TextView(this);
        textView9.setText(AbstractC2328.m4341(-263972557849454L));
        textView9.setTextSize(11.0f);
        textView9.setTextColor(m316(R.color.secondary_text));
        textView9.setPadding(0, m315(2), 0, 0);
        textView9.setMaxLines(1);
        textView9.setEllipsize(truncateAt);
        this.f465 = textView9;
        linearLayout17.addView(textView9);
        linearLayout16.addView(linearLayout17);
        FrameLayout frameLayout = new FrameLayout(this);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(m315(48), m315(48));
        layoutParams6.rightMargin = m315(6);
        frameLayout.setLayoutParams(layoutParams6);
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        frameLayout.setContentDescription(AbstractC2328.m4341(-264054162228078L));
        View view4 = new View(this);
        view4.setBackground(m327());
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(m315(30), m315(30));
        layoutParams7.gravity = 17;
        view4.setLayoutParams(layoutParams7);
        view4.setImportantForAccessibility(2);
        this.f462 = view4;
        frameLayout.addView(view4);
        final int i4 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: yyds.ᲇᛵᛱᲇ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ MainActivity f12056;

            {
                this.f12056 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                int i5;
                int i6 = i4;
                final MainActivity mainActivity = this.f12056;
                switch (i6) {
                    case 0:
                        View view6 = mainActivity.f462;
                        if (view6 == null) {
                            AbstractC2328.m4341(-272072866169710L);
                            view6 = null;
                        }
                        view6.animate().scaleX(0.82f).scaleY(0.82f).setDuration(100L).withEndAction(new RunnableC1730(mainActivity, 4)).start();
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(mainActivity).create();
                        C1016 c10162 = mainActivity.f477;
                        C1417 c1417 = new C1417();
                        LinearLayout linearLayout18 = new LinearLayout(mainActivity);
                        linearLayout18.setOrientation(1);
                        int i7 = 16;
                        linearLayout18.setPadding(mainActivity.m315(20), mainActivity.m315(18), mainActivity.m315(20), mainActivity.m315(16));
                        TextView textView10 = new TextView(mainActivity);
                        textView10.setText(AbstractC2328.m4341(-271411441206126L));
                        textView10.setTextSize(18.0f);
                        Typeface typeface2 = Typeface.DEFAULT_BOLD;
                        textView10.setTypeface(typeface2);
                        textView10.setTextColor(mainActivity.m316(R.color.primary_text));
                        linearLayout18.addView(textView10);
                        TextView textView11 = new TextView(mainActivity);
                        textView11.setText(AbstractC2328.m4341(-271432916042606L));
                        textView11.setTextSize(12.0f);
                        textView11.setTextColor(mainActivity.m316(R.color.secondary_text));
                        int i8 = 0;
                        textView11.setPadding(0, mainActivity.m315(4), 0, 0);
                        linearLayout18.addView(textView11);
                        ArrayList arrayList = new ArrayList();
                        TextView textView12 = new TextView(mainActivity);
                        textView12.setText(AbstractC2328.m4341(-271514520421230L));
                        textView12.setTextSize(14.0f);
                        textView12.setTypeface(typeface2);
                        textView12.setGravity(17);
                        textView12.setTextColor(MainActivity.m304(mainActivity));
                        int i9 = 12;
                        textView12.setPadding(0, mainActivity.m315(12), 0, mainActivity.m315(12));
                        textView12.setMinimumHeight(mainActivity.m315(48));
                        textView12.setBackground(mainActivity.m333());
                        LinearLayout linearLayout19 = new LinearLayout(mainActivity);
                        linearLayout19.setOrientation(1);
                        Iterator it2 = MainActivity.f451.iterator();
                        while (it2.hasNext()) {
                            C1016 c10163 = (C1016) it2.next();
                            C2368 c2368 = new C2368(mainActivity, arrayList, textView12);
                            LinearLayout linearLayout20 = new LinearLayout(mainActivity);
                            linearLayout20.setOrientation(i8);
                            linearLayout20.setGravity(i7);
                            Iterator it3 = it2;
                            linearLayout20.setPadding(mainActivity.m315(10), mainActivity.m315(10), mainActivity.m315(i9), mainActivity.m315(10));
                            linearLayout20.setClickable(true);
                            linearLayout20.setFocusable(true);
                            int iM316 = mainActivity.m316(R.color.card_bg);
                            FrameLayout frameLayout2 = new FrameLayout(mainActivity);
                            frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(mainActivity.m315(52), mainActivity.m315(52)));
                            frameLayout2.setClipChildren(false);
                            View view7 = new View(frameLayout2.getContext());
                            AlertDialog alertDialog = alertDialogCreate;
                            C1016 c10164 = c10162;
                            view7.setBackground(MainActivity.m303(c10163.f4608, mainActivity.m311(12), null, 0));
                            view7.setAlpha(0.85f);
                            view7.setRotation(-6.0f);
                            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(mainActivity.m315(38), mainActivity.m315(38));
                            layoutParams8.leftMargin = mainActivity.m315(8);
                            layoutParams8.topMargin = mainActivity.m315(9);
                            view7.setLayoutParams(layoutParams8);
                            frameLayout2.addView(view7);
                            View view8 = new View(frameLayout2.getContext());
                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
                            int i10 = c10163.f4612;
                            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i10, MainActivity.m308(i10, -1, 0.45f)});
                            gradientDrawable.setCornerRadius(mainActivity.m311(12));
                            view8.setBackground(gradientDrawable);
                            view8.setLayoutParams(new FrameLayout.LayoutParams(mainActivity.m315(38), mainActivity.m315(38)));
                            frameLayout2.addView(view8);
                            View view9 = new View(frameLayout2.getContext());
                            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{MainActivity.m308(i10, iM316, 0.25f), iM316});
                            gradientDrawable2.setCornerRadius(mainActivity.m311(11));
                            view9.setBackground(gradientDrawable2);
                            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(mainActivity.m315(36), mainActivity.m315(36));
                            layoutParams9.leftMargin = mainActivity.m315(1);
                            layoutParams9.topMargin = mainActivity.m315(1);
                            view9.setLayoutParams(layoutParams9);
                            frameLayout2.addView(view9);
                            View view10 = new View(frameLayout2.getContext());
                            GradientDrawable gradientDrawable3 = new GradientDrawable(orientation, new int[]{i10, MainActivity.m308(i10, -1, 0.4f)});
                            gradientDrawable3.setShape(1);
                            view10.setBackground(gradientDrawable3);
                            FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(mainActivity.m315(14), mainActivity.m315(14));
                            layoutParams10.leftMargin = mainActivity.m315(12);
                            layoutParams10.topMargin = mainActivity.m315(12);
                            view10.setLayoutParams(layoutParams10);
                            frameLayout2.addView(view10);
                            linearLayout20.addView(frameLayout2);
                            LinearLayout linearLayout21 = new LinearLayout(mainActivity);
                            linearLayout21.setOrientation(1);
                            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                            layoutParams11.leftMargin = mainActivity.m315(12);
                            linearLayout21.setLayoutParams(layoutParams11);
                            TextView textView13 = new TextView(mainActivity);
                            textView13.setText(c10163.f4610);
                            textView13.setTextSize(15.0f);
                            Typeface typeface3 = Typeface.DEFAULT_BOLD;
                            textView13.setTypeface(typeface3);
                            textView13.setTextColor(mainActivity.m316(R.color.primary_text));
                            linearLayout21.addView(textView13);
                            TextView textView14 = new TextView(mainActivity);
                            textView14.setText(c10163.f4611);
                            textView14.setTextSize(11.0f);
                            textView14.setTextColor(mainActivity.m316(R.color.secondary_text));
                            textView14.setPadding(0, mainActivity.m315(2), 0, 0);
                            linearLayout21.addView(textView14);
                            linearLayout20.addView(linearLayout21);
                            TextView textView15 = new TextView(mainActivity);
                            textView15.setTextSize(13.0f);
                            textView15.setTypeface(typeface3);
                            textView15.setGravity(17);
                            textView15.setLayoutParams(new LinearLayout.LayoutParams(mainActivity.m315(24), mainActivity.m315(24)));
                            linearLayout20.addView(textView15);
                            C1335 c1335 = new C1335(linearLayout20, textView15, c10163);
                            mainActivity.m335(c1335);
                            linearLayout20.setOnClickListener(new ViewOnClickListenerC1192(c2368, c10163, linearLayout20, 11));
                            arrayList.add(c1335);
                            LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams12.bottomMargin = mainActivity.m315(10);
                            linearLayout19.addView(c1335.f6183, layoutParams12);
                            it2 = it3;
                            c10162 = c10164;
                            alertDialogCreate = alertDialog;
                            c1417 = c1417;
                            i7 = 16;
                            i8 = 0;
                            i9 = 12;
                        }
                        AlertDialog alertDialog2 = alertDialogCreate;
                        final C1016 c10165 = c10162;
                        final C1417 c14172 = c1417;
                        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams13.topMargin = mainActivity.m315(16);
                        linearLayout18.addView(linearLayout19, layoutParams13);
                        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams14.topMargin = mainActivity.m315(4);
                        linearLayout18.addView(textView12, layoutParams14);
                        textView12.setOnClickListener(new ViewOnClickListenerC1192(c14172, mainActivity, alertDialog2, 10));
                        alertDialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yyds.ᛳᲇᛶ
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                List list2 = MainActivity.f451;
                                if (c14172.f6702) {
                                    return;
                                }
                                MainActivity mainActivity2 = mainActivity;
                                String str = mainActivity2.f477.f4609;
                                C1016 c10166 = c10165;
                                if (str.equals(c10166.f4609) || mainActivity2.isDestroyed()) {
                                    return;
                                }
                                mainActivity2.m322(c10166);
                            }
                        });
                        alertDialog2.setView(linearLayout18);
                        alertDialog2.show();
                        Window window2 = alertDialog2.getWindow();
                        if (window2 != null) {
                            i5 = 0;
                            window2.setBackgroundDrawable(MainActivity.m303(mainActivity.m316(R.color.card_bg), mainActivity.m311(24), null, 0));
                        } else {
                            i5 = 0;
                        }
                        linearLayout18.setAlpha(0.0f);
                        linearLayout18.setTranslationY(mainActivity.m311(36));
                        linearLayout18.animate().alpha(1.0f).translationY(0.0f).setDuration(280L).setInterpolator(new OvershootInterpolator(0.7f)).start();
                        int childCount = linearLayout19.getChildCount();
                        for (int i11 = i5; i11 < childCount; i11++) {
                            View childAt = linearLayout19.getChildAt(i11);
                            childAt.setAlpha(0.0f);
                            childAt.setTranslationX(mainActivity.m311(42));
                            childAt.animate().alpha(1.0f).translationX(0.0f).setStartDelay((((long) i11) * 60) + 140).setDuration(320L).setInterpolator(new OvershootInterpolator(0.8f)).start();
                        }
                        break;
                    case 1:
                        List list2 = MainActivity.f451;
                        mainActivity.m336(EnumC0110.f755);
                        break;
                    default:
                        List list3 = MainActivity.f451;
                        mainActivity.m336(EnumC0110.f756);
                        break;
                }
            }
        });
        linearLayout16.addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(this);
        frameLayout2.setBackground(m303(m316(R.color.status_neutral_bg), m311(999), null, 0));
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(m315(152), m315(40)));
        View view5 = new View(this);
        view5.setBackground(m303(m316(R.color.card_bg), m311(999), Integer.valueOf(m316(R.color.divider_color)), m315(1)));
        this.f453 = view5;
        frameLayout2.addView(view5);
        LinearLayout linearLayout18 = new LinearLayout(this);
        linearLayout18.setOrientation(0);
        linearLayout18.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        TextView textView10 = new TextView(this);
        textView10.setText(AbstractC2328.m4341(-264183011246958L));
        textView10.setTextSize(12.0f);
        textView10.setGravity(17);
        textView10.setClickable(true);
        textView10.setFocusable(true);
        textView10.setContentDescription(AbstractC2328.m4341(-264204486083438L));
        textView10.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        textView10.setOnClickListener(new View.OnClickListener(this) { // from class: yyds.ᲇᛵᛱᲇ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ MainActivity f12056;

            {
                this.f12056 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view52) {
                int i5;
                int i6 = i;
                final MainActivity mainActivity = this.f12056;
                switch (i6) {
                    case 0:
                        View view6 = mainActivity.f462;
                        if (view6 == null) {
                            AbstractC2328.m4341(-272072866169710L);
                            view6 = null;
                        }
                        view6.animate().scaleX(0.82f).scaleY(0.82f).setDuration(100L).withEndAction(new RunnableC1730(mainActivity, 4)).start();
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(mainActivity).create();
                        C1016 c10162 = mainActivity.f477;
                        C1417 c1417 = new C1417();
                        LinearLayout linearLayout182 = new LinearLayout(mainActivity);
                        linearLayout182.setOrientation(1);
                        int i7 = 16;
                        linearLayout182.setPadding(mainActivity.m315(20), mainActivity.m315(18), mainActivity.m315(20), mainActivity.m315(16));
                        TextView textView102 = new TextView(mainActivity);
                        textView102.setText(AbstractC2328.m4341(-271411441206126L));
                        textView102.setTextSize(18.0f);
                        Typeface typeface2 = Typeface.DEFAULT_BOLD;
                        textView102.setTypeface(typeface2);
                        textView102.setTextColor(mainActivity.m316(R.color.primary_text));
                        linearLayout182.addView(textView102);
                        TextView textView11 = new TextView(mainActivity);
                        textView11.setText(AbstractC2328.m4341(-271432916042606L));
                        textView11.setTextSize(12.0f);
                        textView11.setTextColor(mainActivity.m316(R.color.secondary_text));
                        int i8 = 0;
                        textView11.setPadding(0, mainActivity.m315(4), 0, 0);
                        linearLayout182.addView(textView11);
                        ArrayList arrayList = new ArrayList();
                        TextView textView12 = new TextView(mainActivity);
                        textView12.setText(AbstractC2328.m4341(-271514520421230L));
                        textView12.setTextSize(14.0f);
                        textView12.setTypeface(typeface2);
                        textView12.setGravity(17);
                        textView12.setTextColor(MainActivity.m304(mainActivity));
                        int i9 = 12;
                        textView12.setPadding(0, mainActivity.m315(12), 0, mainActivity.m315(12));
                        textView12.setMinimumHeight(mainActivity.m315(48));
                        textView12.setBackground(mainActivity.m333());
                        LinearLayout linearLayout19 = new LinearLayout(mainActivity);
                        linearLayout19.setOrientation(1);
                        Iterator it2 = MainActivity.f451.iterator();
                        while (it2.hasNext()) {
                            C1016 c10163 = (C1016) it2.next();
                            C2368 c2368 = new C2368(mainActivity, arrayList, textView12);
                            LinearLayout linearLayout20 = new LinearLayout(mainActivity);
                            linearLayout20.setOrientation(i8);
                            linearLayout20.setGravity(i7);
                            Iterator it3 = it2;
                            linearLayout20.setPadding(mainActivity.m315(10), mainActivity.m315(10), mainActivity.m315(i9), mainActivity.m315(10));
                            linearLayout20.setClickable(true);
                            linearLayout20.setFocusable(true);
                            int iM316 = mainActivity.m316(R.color.card_bg);
                            FrameLayout frameLayout22 = new FrameLayout(mainActivity);
                            frameLayout22.setLayoutParams(new ViewGroup.LayoutParams(mainActivity.m315(52), mainActivity.m315(52)));
                            frameLayout22.setClipChildren(false);
                            View view7 = new View(frameLayout22.getContext());
                            AlertDialog alertDialog = alertDialogCreate;
                            C1016 c10164 = c10162;
                            view7.setBackground(MainActivity.m303(c10163.f4608, mainActivity.m311(12), null, 0));
                            view7.setAlpha(0.85f);
                            view7.setRotation(-6.0f);
                            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(mainActivity.m315(38), mainActivity.m315(38));
                            layoutParams8.leftMargin = mainActivity.m315(8);
                            layoutParams8.topMargin = mainActivity.m315(9);
                            view7.setLayoutParams(layoutParams8);
                            frameLayout22.addView(view7);
                            View view8 = new View(frameLayout22.getContext());
                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
                            int i10 = c10163.f4612;
                            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i10, MainActivity.m308(i10, -1, 0.45f)});
                            gradientDrawable.setCornerRadius(mainActivity.m311(12));
                            view8.setBackground(gradientDrawable);
                            view8.setLayoutParams(new FrameLayout.LayoutParams(mainActivity.m315(38), mainActivity.m315(38)));
                            frameLayout22.addView(view8);
                            View view9 = new View(frameLayout22.getContext());
                            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{MainActivity.m308(i10, iM316, 0.25f), iM316});
                            gradientDrawable2.setCornerRadius(mainActivity.m311(11));
                            view9.setBackground(gradientDrawable2);
                            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(mainActivity.m315(36), mainActivity.m315(36));
                            layoutParams9.leftMargin = mainActivity.m315(1);
                            layoutParams9.topMargin = mainActivity.m315(1);
                            view9.setLayoutParams(layoutParams9);
                            frameLayout22.addView(view9);
                            View view10 = new View(frameLayout22.getContext());
                            GradientDrawable gradientDrawable3 = new GradientDrawable(orientation, new int[]{i10, MainActivity.m308(i10, -1, 0.4f)});
                            gradientDrawable3.setShape(1);
                            view10.setBackground(gradientDrawable3);
                            FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(mainActivity.m315(14), mainActivity.m315(14));
                            layoutParams10.leftMargin = mainActivity.m315(12);
                            layoutParams10.topMargin = mainActivity.m315(12);
                            view10.setLayoutParams(layoutParams10);
                            frameLayout22.addView(view10);
                            linearLayout20.addView(frameLayout22);
                            LinearLayout linearLayout21 = new LinearLayout(mainActivity);
                            linearLayout21.setOrientation(1);
                            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                            layoutParams11.leftMargin = mainActivity.m315(12);
                            linearLayout21.setLayoutParams(layoutParams11);
                            TextView textView13 = new TextView(mainActivity);
                            textView13.setText(c10163.f4610);
                            textView13.setTextSize(15.0f);
                            Typeface typeface3 = Typeface.DEFAULT_BOLD;
                            textView13.setTypeface(typeface3);
                            textView13.setTextColor(mainActivity.m316(R.color.primary_text));
                            linearLayout21.addView(textView13);
                            TextView textView14 = new TextView(mainActivity);
                            textView14.setText(c10163.f4611);
                            textView14.setTextSize(11.0f);
                            textView14.setTextColor(mainActivity.m316(R.color.secondary_text));
                            textView14.setPadding(0, mainActivity.m315(2), 0, 0);
                            linearLayout21.addView(textView14);
                            linearLayout20.addView(linearLayout21);
                            TextView textView15 = new TextView(mainActivity);
                            textView15.setTextSize(13.0f);
                            textView15.setTypeface(typeface3);
                            textView15.setGravity(17);
                            textView15.setLayoutParams(new LinearLayout.LayoutParams(mainActivity.m315(24), mainActivity.m315(24)));
                            linearLayout20.addView(textView15);
                            C1335 c1335 = new C1335(linearLayout20, textView15, c10163);
                            mainActivity.m335(c1335);
                            linearLayout20.setOnClickListener(new ViewOnClickListenerC1192(c2368, c10163, linearLayout20, 11));
                            arrayList.add(c1335);
                            LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams12.bottomMargin = mainActivity.m315(10);
                            linearLayout19.addView(c1335.f6183, layoutParams12);
                            it2 = it3;
                            c10162 = c10164;
                            alertDialogCreate = alertDialog;
                            c1417 = c1417;
                            i7 = 16;
                            i8 = 0;
                            i9 = 12;
                        }
                        AlertDialog alertDialog2 = alertDialogCreate;
                        final C1016 c10165 = c10162;
                        final C1417 c14172 = c1417;
                        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams13.topMargin = mainActivity.m315(16);
                        linearLayout182.addView(linearLayout19, layoutParams13);
                        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams14.topMargin = mainActivity.m315(4);
                        linearLayout182.addView(textView12, layoutParams14);
                        textView12.setOnClickListener(new ViewOnClickListenerC1192(c14172, mainActivity, alertDialog2, 10));
                        alertDialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yyds.ᛳᲇᛶ
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                List list2 = MainActivity.f451;
                                if (c14172.f6702) {
                                    return;
                                }
                                MainActivity mainActivity2 = mainActivity;
                                String str = mainActivity2.f477.f4609;
                                C1016 c10166 = c10165;
                                if (str.equals(c10166.f4609) || mainActivity2.isDestroyed()) {
                                    return;
                                }
                                mainActivity2.m322(c10166);
                            }
                        });
                        alertDialog2.setView(linearLayout182);
                        alertDialog2.show();
                        Window window2 = alertDialog2.getWindow();
                        if (window2 != null) {
                            i5 = 0;
                            window2.setBackgroundDrawable(MainActivity.m303(mainActivity.m316(R.color.card_bg), mainActivity.m311(24), null, 0));
                        } else {
                            i5 = 0;
                        }
                        linearLayout182.setAlpha(0.0f);
                        linearLayout182.setTranslationY(mainActivity.m311(36));
                        linearLayout182.animate().alpha(1.0f).translationY(0.0f).setDuration(280L).setInterpolator(new OvershootInterpolator(0.7f)).start();
                        int childCount = linearLayout19.getChildCount();
                        for (int i11 = i5; i11 < childCount; i11++) {
                            View childAt = linearLayout19.getChildAt(i11);
                            childAt.setAlpha(0.0f);
                            childAt.setTranslationX(mainActivity.m311(42));
                            childAt.animate().alpha(1.0f).translationX(0.0f).setStartDelay((((long) i11) * 60) + 140).setDuration(320L).setInterpolator(new OvershootInterpolator(0.8f)).start();
                        }
                        break;
                    case 1:
                        List list2 = MainActivity.f451;
                        mainActivity.m336(EnumC0110.f755);
                        break;
                    default:
                        List list3 = MainActivity.f451;
                        mainActivity.m336(EnumC0110.f756);
                        break;
                }
            }
        });
        this.f461 = textView10;
        TextView textView11 = new TextView(this);
        textView11.setText(AbstractC2328.m4341(-264243140789102L));
        textView11.setTextSize(12.0f);
        textView11.setGravity(17);
        textView11.setClickable(true);
        textView11.setFocusable(true);
        textView11.setContentDescription(AbstractC2328.m4341(-264264615625582L));
        textView11.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        textView11.setOnClickListener(new View.OnClickListener(this) { // from class: yyds.ᲇᛵᛱᲇ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ MainActivity f12056;

            {
                this.f12056 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view52) {
                int i5;
                int i6 = i3;
                final MainActivity mainActivity = this.f12056;
                switch (i6) {
                    case 0:
                        View view6 = mainActivity.f462;
                        if (view6 == null) {
                            AbstractC2328.m4341(-272072866169710L);
                            view6 = null;
                        }
                        view6.animate().scaleX(0.82f).scaleY(0.82f).setDuration(100L).withEndAction(new RunnableC1730(mainActivity, 4)).start();
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(mainActivity).create();
                        C1016 c10162 = mainActivity.f477;
                        C1417 c1417 = new C1417();
                        LinearLayout linearLayout182 = new LinearLayout(mainActivity);
                        linearLayout182.setOrientation(1);
                        int i7 = 16;
                        linearLayout182.setPadding(mainActivity.m315(20), mainActivity.m315(18), mainActivity.m315(20), mainActivity.m315(16));
                        TextView textView102 = new TextView(mainActivity);
                        textView102.setText(AbstractC2328.m4341(-271411441206126L));
                        textView102.setTextSize(18.0f);
                        Typeface typeface2 = Typeface.DEFAULT_BOLD;
                        textView102.setTypeface(typeface2);
                        textView102.setTextColor(mainActivity.m316(R.color.primary_text));
                        linearLayout182.addView(textView102);
                        TextView textView112 = new TextView(mainActivity);
                        textView112.setText(AbstractC2328.m4341(-271432916042606L));
                        textView112.setTextSize(12.0f);
                        textView112.setTextColor(mainActivity.m316(R.color.secondary_text));
                        int i8 = 0;
                        textView112.setPadding(0, mainActivity.m315(4), 0, 0);
                        linearLayout182.addView(textView112);
                        ArrayList arrayList = new ArrayList();
                        TextView textView12 = new TextView(mainActivity);
                        textView12.setText(AbstractC2328.m4341(-271514520421230L));
                        textView12.setTextSize(14.0f);
                        textView12.setTypeface(typeface2);
                        textView12.setGravity(17);
                        textView12.setTextColor(MainActivity.m304(mainActivity));
                        int i9 = 12;
                        textView12.setPadding(0, mainActivity.m315(12), 0, mainActivity.m315(12));
                        textView12.setMinimumHeight(mainActivity.m315(48));
                        textView12.setBackground(mainActivity.m333());
                        LinearLayout linearLayout19 = new LinearLayout(mainActivity);
                        linearLayout19.setOrientation(1);
                        Iterator it2 = MainActivity.f451.iterator();
                        while (it2.hasNext()) {
                            C1016 c10163 = (C1016) it2.next();
                            C2368 c2368 = new C2368(mainActivity, arrayList, textView12);
                            LinearLayout linearLayout20 = new LinearLayout(mainActivity);
                            linearLayout20.setOrientation(i8);
                            linearLayout20.setGravity(i7);
                            Iterator it3 = it2;
                            linearLayout20.setPadding(mainActivity.m315(10), mainActivity.m315(10), mainActivity.m315(i9), mainActivity.m315(10));
                            linearLayout20.setClickable(true);
                            linearLayout20.setFocusable(true);
                            int iM316 = mainActivity.m316(R.color.card_bg);
                            FrameLayout frameLayout22 = new FrameLayout(mainActivity);
                            frameLayout22.setLayoutParams(new ViewGroup.LayoutParams(mainActivity.m315(52), mainActivity.m315(52)));
                            frameLayout22.setClipChildren(false);
                            View view7 = new View(frameLayout22.getContext());
                            AlertDialog alertDialog = alertDialogCreate;
                            C1016 c10164 = c10162;
                            view7.setBackground(MainActivity.m303(c10163.f4608, mainActivity.m311(12), null, 0));
                            view7.setAlpha(0.85f);
                            view7.setRotation(-6.0f);
                            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(mainActivity.m315(38), mainActivity.m315(38));
                            layoutParams8.leftMargin = mainActivity.m315(8);
                            layoutParams8.topMargin = mainActivity.m315(9);
                            view7.setLayoutParams(layoutParams8);
                            frameLayout22.addView(view7);
                            View view8 = new View(frameLayout22.getContext());
                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
                            int i10 = c10163.f4612;
                            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i10, MainActivity.m308(i10, -1, 0.45f)});
                            gradientDrawable.setCornerRadius(mainActivity.m311(12));
                            view8.setBackground(gradientDrawable);
                            view8.setLayoutParams(new FrameLayout.LayoutParams(mainActivity.m315(38), mainActivity.m315(38)));
                            frameLayout22.addView(view8);
                            View view9 = new View(frameLayout22.getContext());
                            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{MainActivity.m308(i10, iM316, 0.25f), iM316});
                            gradientDrawable2.setCornerRadius(mainActivity.m311(11));
                            view9.setBackground(gradientDrawable2);
                            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(mainActivity.m315(36), mainActivity.m315(36));
                            layoutParams9.leftMargin = mainActivity.m315(1);
                            layoutParams9.topMargin = mainActivity.m315(1);
                            view9.setLayoutParams(layoutParams9);
                            frameLayout22.addView(view9);
                            View view10 = new View(frameLayout22.getContext());
                            GradientDrawable gradientDrawable3 = new GradientDrawable(orientation, new int[]{i10, MainActivity.m308(i10, -1, 0.4f)});
                            gradientDrawable3.setShape(1);
                            view10.setBackground(gradientDrawable3);
                            FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(mainActivity.m315(14), mainActivity.m315(14));
                            layoutParams10.leftMargin = mainActivity.m315(12);
                            layoutParams10.topMargin = mainActivity.m315(12);
                            view10.setLayoutParams(layoutParams10);
                            frameLayout22.addView(view10);
                            linearLayout20.addView(frameLayout22);
                            LinearLayout linearLayout21 = new LinearLayout(mainActivity);
                            linearLayout21.setOrientation(1);
                            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                            layoutParams11.leftMargin = mainActivity.m315(12);
                            linearLayout21.setLayoutParams(layoutParams11);
                            TextView textView13 = new TextView(mainActivity);
                            textView13.setText(c10163.f4610);
                            textView13.setTextSize(15.0f);
                            Typeface typeface3 = Typeface.DEFAULT_BOLD;
                            textView13.setTypeface(typeface3);
                            textView13.setTextColor(mainActivity.m316(R.color.primary_text));
                            linearLayout21.addView(textView13);
                            TextView textView14 = new TextView(mainActivity);
                            textView14.setText(c10163.f4611);
                            textView14.setTextSize(11.0f);
                            textView14.setTextColor(mainActivity.m316(R.color.secondary_text));
                            textView14.setPadding(0, mainActivity.m315(2), 0, 0);
                            linearLayout21.addView(textView14);
                            linearLayout20.addView(linearLayout21);
                            TextView textView15 = new TextView(mainActivity);
                            textView15.setTextSize(13.0f);
                            textView15.setTypeface(typeface3);
                            textView15.setGravity(17);
                            textView15.setLayoutParams(new LinearLayout.LayoutParams(mainActivity.m315(24), mainActivity.m315(24)));
                            linearLayout20.addView(textView15);
                            C1335 c1335 = new C1335(linearLayout20, textView15, c10163);
                            mainActivity.m335(c1335);
                            linearLayout20.setOnClickListener(new ViewOnClickListenerC1192(c2368, c10163, linearLayout20, 11));
                            arrayList.add(c1335);
                            LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams12.bottomMargin = mainActivity.m315(10);
                            linearLayout19.addView(c1335.f6183, layoutParams12);
                            it2 = it3;
                            c10162 = c10164;
                            alertDialogCreate = alertDialog;
                            c1417 = c1417;
                            i7 = 16;
                            i8 = 0;
                            i9 = 12;
                        }
                        AlertDialog alertDialog2 = alertDialogCreate;
                        final C1016 c10165 = c10162;
                        final C1417 c14172 = c1417;
                        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams13.topMargin = mainActivity.m315(16);
                        linearLayout182.addView(linearLayout19, layoutParams13);
                        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams14.topMargin = mainActivity.m315(4);
                        linearLayout182.addView(textView12, layoutParams14);
                        textView12.setOnClickListener(new ViewOnClickListenerC1192(c14172, mainActivity, alertDialog2, 10));
                        alertDialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yyds.ᛳᲇᛶ
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                List list2 = MainActivity.f451;
                                if (c14172.f6702) {
                                    return;
                                }
                                MainActivity mainActivity2 = mainActivity;
                                String str = mainActivity2.f477.f4609;
                                C1016 c10166 = c10165;
                                if (str.equals(c10166.f4609) || mainActivity2.isDestroyed()) {
                                    return;
                                }
                                mainActivity2.m322(c10166);
                            }
                        });
                        alertDialog2.setView(linearLayout182);
                        alertDialog2.show();
                        Window window2 = alertDialog2.getWindow();
                        if (window2 != null) {
                            i5 = 0;
                            window2.setBackgroundDrawable(MainActivity.m303(mainActivity.m316(R.color.card_bg), mainActivity.m311(24), null, 0));
                        } else {
                            i5 = 0;
                        }
                        linearLayout182.setAlpha(0.0f);
                        linearLayout182.setTranslationY(mainActivity.m311(36));
                        linearLayout182.animate().alpha(1.0f).translationY(0.0f).setDuration(280L).setInterpolator(new OvershootInterpolator(0.7f)).start();
                        int childCount = linearLayout19.getChildCount();
                        for (int i11 = i5; i11 < childCount; i11++) {
                            View childAt = linearLayout19.getChildAt(i11);
                            childAt.setAlpha(0.0f);
                            childAt.setTranslationX(mainActivity.m311(42));
                            childAt.animate().alpha(1.0f).translationX(0.0f).setStartDelay((((long) i11) * 60) + 140).setDuration(320L).setInterpolator(new OvershootInterpolator(0.8f)).start();
                        }
                        break;
                    case 1:
                        List list2 = MainActivity.f451;
                        mainActivity.m336(EnumC0110.f755);
                        break;
                    default:
                        List list3 = MainActivity.f451;
                        mainActivity.m336(EnumC0110.f756);
                        break;
                }
            }
        });
        this.f480 = textView11;
        TextView textView12 = this.f461;
        if (textView12 == null) {
            AbstractC2328.m4341(-264303270331246L);
            textView12 = null;
        }
        linearLayout18.addView(textView12);
        TextView textView13 = this.f480;
        if (textView13 == null) {
            AbstractC2328.m4341(-264402054579054L);
            textView13 = null;
        }
        linearLayout18.addView(textView13);
        frameLayout2.addView(linearLayout18);
        frameLayout2.post(new RunnableC1730(this, i));
        linearLayout16.addView(frameLayout2);
        r13.addView(linearLayout16);
        C1213 c1213 = new C1213(this, null);
        c1213.setAdapter(c0156);
        c1213.setOverScrollMode(2);
        c1213.setClipToPadding(false);
        c1213.setItemAnimator(null);
        c1213.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.f482 = c1213;
        c1213.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2008(1, this));
        m337();
        LinearLayout linearLayout19 = this.f478;
        if (linearLayout19 == null) {
            AbstractC2328.m4341(-262855866352494L);
            linearLayout19 = null;
        }
        C1213 c12132 = this.f482;
        if (c12132 == null) {
            AbstractC2328.m4341(-262877341188974L);
            c12132 = null;
        }
        linearLayout19.addView(c12132);
        c0156.m704(m306());
        C0798 c07982 = new C0798(this, 0);
        int[] iArrM330 = m330();
        AbstractC2328.m4341(-297958634062702L);
        c07982.f3664 = iArrM330;
        c07982.m1841();
        c07982.invalidate();
        c07982.setImportantForAccessibility(2);
        c07982.setClickable(false);
        this.f481 = c07982;
        C0798 c07983 = new C0798(this, 1);
        int[] iArrM3302 = m330();
        AbstractC2328.m4341(-1703022825210734L);
        c07983.f3664 = iArrM3302;
        c07983.setImportantForAccessibility(2);
        c07983.setClickable(false);
        this.f458 = c07983;
        FrameLayout frameLayout3 = new FrameLayout(this);
        int iM316 = m316(R.color.surface_bg);
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m308(m338(true), iM316, 0.04f), iM316, iM316}));
        C0798 c07984 = this.f481;
        if (c07984 == null) {
            AbstractC2328.m4341(-262933175763822L);
            c07984 = null;
        }
        frameLayout3.addView(c07984);
        LinearLayout linearLayout20 = this.f478;
        if (linearLayout20 == null) {
            AbstractC2328.m4341(-262993305305966L);
            linearLayout20 = null;
        }
        frameLayout3.addView(linearLayout20);
        C0798 c07985 = this.f458;
        if (c07985 == null) {
            AbstractC2328.m4341(-263014780142446L);
            c0798 = null;
        } else {
            c0798 = c07985;
        }
        frameLayout3.addView(c0798);
        setContentView(frameLayout3);
        m310();
        m324();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        this.f483++;
        Thread thread = this.f459;
        if (thread != null) {
            thread.interrupt();
        }
        C0798 c0798 = null;
        this.f459 = null;
        this.f473 = false;
        View view = this.f462;
        if (view != null) {
            view.animate().cancel();
            View view2 = this.f462;
            if (view2 == null) {
                AbstractC2328.m4341(-266837301035886L);
                view2 = null;
            }
            view2.setScaleX(1.0f);
            View view3 = this.f462;
            if (view3 == null) {
                AbstractC2328.m4341(-266875955741550L);
                view3 = null;
            }
            view3.setScaleY(1.0f);
        }
        C1213 c1213 = this.f482;
        if (c1213 != null) {
            if (c1213 == null) {
                AbstractC2328.m4341(-262568103543662L);
                c1213 = null;
            }
            c1213.animate().cancel();
        }
        C0798 c07982 = this.f458;
        if (c07982 != null) {
            if (c07982 == null) {
                AbstractC2328.m4341(-262623938118510L);
            } else {
                c0798 = c07982;
            }
            c0798.animate().cancel();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        this.f463 = false;
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f463 = true;
        if (this.f456) {
            m328();
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        C1416 c1416 = MainApp.f486;
        AbstractC2328.m4341(-1163381659304814L);
        CopyOnWriteArraySet copyOnWriteArraySet = MainApp.f487;
        copyOnWriteArraySet.add(this);
        C1416 c14162 = MainApp.f486;
        if (copyOnWriteArraySet.contains(this)) {
            runOnUiThread(new RunnableC2696(this, 7, c14162));
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        C1416 c1416 = MainApp.f486;
        AbstractC2328.m4341(-1163420314010478L);
        MainApp.f487.remove(this);
        super.onStop();
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final void m310() {
        if (this.f462 == null || this.f473) {
            return;
        }
        this.f473 = true;
        View view = this.f462;
        if (view == null) {
            AbstractC2328.m4341(-266759991624558L);
            view = null;
        }
        view.post(new RunnableC1730(this, 0));
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final float m311(int i) {
        return i * getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final void m312() {
        if (this.f470 == null) {
            return;
        }
        boolean zIsLauncherIconShowing = isLauncherIconShowing();
        this.f460 = true;
        Switch r2 = this.f470;
        TextView textView = null;
        if (r2 == null) {
            AbstractC2328.m4341(-269942562390894L);
            r2 = null;
        }
        r2.setChecked(zIsLauncherIconShowing);
        Switch r22 = this.f470;
        if (r22 == null) {
            AbstractC2328.m4341(-270024166769518L);
            r22 = null;
        }
        r22.setText(AbstractC2328.m4341(-270105771148142L));
        Switch r23 = this.f470;
        if (r23 == null) {
            AbstractC2328.m4341(-270110066115438L);
            r23 = null;
        }
        r23.setContentDescription(AbstractC2328.m4341(zIsLauncherIconShowing ? -270191670494062L : -270221735265134L));
        this.f460 = false;
        TextView textView2 = this.f455;
        if (textView2 == null) {
            AbstractC2328.m4341(-270251800036206L);
            textView2 = null;
        }
        textView2.setText(zIsLauncherIconShowing ? AbstractC2328.m4341(-270350584284014L) : AbstractC2328.m4341(-270423598728046L));
        TextView textView3 = this.f455;
        if (textView3 == null) {
            AbstractC2328.m4341(-270500908139374L);
        } else {
            textView = textView3;
        }
        textView.setTextColor(zIsLauncherIconShowing ? m338(true) : m316(R.color.status_warning));
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final TextView m313(Context context, String str, int i, int i2, Integer num, boolean z) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(12.0f);
        textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        textView.setGravity(17);
        textView.setTextColor(i);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(m315(10), m315(6), m315(10), m315(6));
        textView.setBackground(m303(i2, m311(999), num, m315(1)));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.rightMargin = m315(8);
        marginLayoutParams.bottomMargin = m315(8);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public final void m314() {
        C1213 c1213;
        if (this.f472 != EnumC0110.f756 || (c1213 = this.f482) == null) {
            return;
        }
        float height = c1213.getHeight() / 2.0f;
        if (height <= 0.0f) {
            return;
        }
        C1213 c12132 = this.f482;
        if (c12132 == null) {
            AbstractC2328.m4341(-266549538227054L);
            c12132 = null;
        }
        int childCount = c12132.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1213 c12133 = this.f482;
            if (c12133 == null) {
                AbstractC2328.m4341(-266605372801902L);
                c12133 = null;
            }
            View childAt = c12133.getChildAt(i);
            float fM1483 = AbstractC0598.m1483((((childAt.getBottom() + childAt.getTop()) / 2.0f) - height) / height, -1.0f, 1.0f);
            float fAbs = Math.abs(fM1483);
            childAt.setPivotX(childAt.getWidth() / 2.0f);
            childAt.setPivotY(childAt.getHeight() / 2.0f);
            childAt.setCameraDistance(getResources().getDisplayMetrics().density * 5200.0f);
            childAt.setRotationX(fM1483 * (-6.5f));
            float f = 1.0f - (fAbs * 0.05f);
            childAt.setScaleX(f);
            childAt.setScaleY(f);
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final int m315(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int m316(int i) {
        return getResources().getColor(i, getTheme());
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final StateListDrawable m317() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, m307(this, m338(true)));
        stateListDrawable.addState(new int[]{-16842912}, m307(this, m316(R.color.switch_track_off)));
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final void m318() {
        Object c2658;
        C1416 c1416 = this.f468;
        Set set = null;
        if (c1416 != null) {
            try {
                ArrayList arrayListM2881 = c1416.m2881();
                AbstractC2328.m4341(-269783648600942L);
                c2658 = AbstractC1595.m3267(arrayListM2881);
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            Throwable thM4249 = C2248.m4249(c2658);
            if (thM4249 != null) {
                String strM4341 = AbstractC2328.m4341(-269843778143086L);
                AbstractC2328.m4341(-262353355178862L);
                Log.d(AbstractC2328.m4341(-262387714917230L), strM4341, thM4249);
            }
            set = (Set) (c2658 instanceof C2658 ? null : c2658);
        }
        this.f467 = set;
        m334();
        if (this.f463) {
            m328();
        } else {
            this.f456 = true;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m319() {
        if (this.f482 == null) {
            return;
        }
        int iOrdinal = this.f472.ordinal();
        C1213 c1213 = null;
        if (iOrdinal == 0) {
            int iM329 = m329();
            C1213 c12132 = this.f482;
            if (c12132 == null) {
                AbstractC2328.m4341(-266047027053422L);
            } else {
                c1213 = c12132;
            }
            c1213.setPadding(iM329, m315(4), iM329, m315(16) + this.f464);
            return;
        }
        if (iOrdinal != 1) {
            C0188.m801();
            return;
        }
        C1213 c12133 = this.f482;
        if (c12133 == null) {
            AbstractC2328.m4341(-266102861628270L);
        } else {
            c1213 = c12133;
        }
        c1213.setPadding(m315(12), m315(4), m315(12), m315(22) + this.f464);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final List m320() {
        C1860 c1860 = C1860.f9345;
        try {
            InputStream inputStreamOpen = getAssets().open(AbstractC2328.m4341(-267786488808302L));
            AbstractC2328.m4341(-267846618350446L);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, AbstractC0347.f1806), 8192);
            try {
                String strM1455 = AbstractC0578.m1455(bufferedReader);
                bufferedReader.close();
                if (AbstractC0473.m1313(strM1455)) {
                    return c1860;
                }
                List list = (List) new C0114().m516(strM1455, new C0044().f13683);
                return list == null ? c1860 : list;
            } finally {
            }
        } catch (Throwable unused) {
            return c1860;
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final List m321(final LinkedHashMap linkedHashMap) {
        PackageManager packageManager = getPackageManager();
        final int i = 2;
        C1125 c1125 = new C1125(AbstractC1529.m3163(new C0558(1, Build.VERSION.SDK_INT >= 33 ? packageManager.getInstalledApplications(PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getInstalledApplications(128)), new InterfaceC1549(linkedHashMap, i) { // from class: yyds.ᛳᛴᛶᲇ

            /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
            public final /* synthetic */ int f2757;

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ LinkedHashMap f2758;

            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final native Object mo371(Object obj);
        }), new C2001(this, packageManager, linkedHashMap));
        C1109 c1109 = new C1109(5, new C1300(16));
        ArrayList arrayListM3162 = AbstractC1529.m3162(c1125);
        AbstractC0405.m1162(arrayListM3162, c1109);
        Iterator it = arrayListM3162.iterator();
        if (!it.hasNext()) {
            return C1860.f9345;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m322(C1016 c1016) {
        this.f477 = c1016;
        LinearLayout linearLayout = this.f478;
        if (linearLayout != null) {
            Object parent = linearLayout.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                int iM316 = m316(R.color.surface_bg);
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m308(m338(true), iM316, 0.04f), iM316, iM316}));
            }
        }
        Switch r6 = this.f470;
        if (r6 != null) {
            r6.setTrackDrawable(m317());
        }
        C0798 c0798 = this.f458;
        if (c0798 != null) {
            int[] iArrM330 = m330();
            AbstractC2328.m4341(-1703022825210734L);
            c0798.f3664 = iArrM330;
        }
        C0798 c07982 = this.f481;
        if (c07982 != null) {
            int[] iArrM3302 = m330();
            AbstractC2328.m4341(-297958634062702L);
            c07982.f3664 = iArrM3302;
            c07982.m1841();
            c07982.invalidate();
        }
        View view2 = this.f462;
        if (view2 != null) {
            view2.setBackground(m327());
        }
        m334();
        this.f475.m1058();
        C1213 c1213 = this.f482;
        if (c1213 != null) {
            c1213.post(new RunnableC1730(this, 9));
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final void m323(final boolean z) {
        View view = this.f453;
        if (view == null) {
            return;
        }
        Object parent = view.getParent();
        TextView textView = null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null) {
            return;
        }
        int width = view2.getWidth();
        if (width == 0) {
            view2.post(new Runnable() { // from class: yyds.ᛶᛸᛱᛳ
                @Override // java.lang.Runnable
                public final void run() {
                    List list = MainActivity.f451;
                    this.f6476.m323(z);
                }
            });
            return;
        }
        int iM315 = m315(3);
        View view3 = this.f453;
        if (view3 == null) {
            AbstractC2328.m4341(-264552378434414L);
            view3 = null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((width / 2) - iM315, -1);
        layoutParams.topMargin = iM315;
        layoutParams.bottomMargin = iM315;
        view3.setLayoutParams(layoutParams);
        EnumC0110 enumC0110 = this.f472;
        EnumC0110 enumC01102 = EnumC0110.f755;
        float f = enumC0110 == enumC01102 ? iM315 : width / 2.0f;
        View view4 = this.f453;
        if (z) {
            if (view4 == null) {
                AbstractC2328.m4341(-264621097911150L);
                view4 = null;
            }
            view4.animate().x(f).setDuration(240L).setInterpolator(new OvershootInterpolator(1.4f)).start();
        } else {
            if (view4 == null) {
                AbstractC2328.m4341(-264689817387886L);
                view4 = null;
            }
            view4.animate().cancel();
            View view5 = this.f453;
            if (view5 == null) {
                AbstractC2328.m4341(-264758536864622L);
                view5 = null;
            }
            view5.setX(f);
        }
        boolean z2 = this.f472 == enumC01102;
        TextView textView2 = this.f461;
        if (textView2 == null) {
            AbstractC2328.m4341(-264827256341358L);
            textView2 = null;
        }
        textView2.setSelected(z2);
        TextView textView3 = this.f480;
        if (textView3 == null) {
            AbstractC2328.m4341(-264926040589166L);
            textView3 = null;
        }
        textView3.setSelected(!z2);
        TextView textView4 = this.f461;
        if (textView4 == null) {
            AbstractC2328.m4341(-265007644967790L);
            textView4 = null;
        }
        int i = R.color.secondary_text;
        textView4.setTextColor(m316(z2 ? R.color.primary_text : R.color.secondary_text));
        TextView textView5 = this.f461;
        if (textView5 == null) {
            AbstractC2328.m4341(-265106429215598L);
            textView5 = null;
        }
        textView5.setTypeface(z2 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        TextView textView6 = this.f480;
        if (textView6 == null) {
            AbstractC2328.m4341(-265205213463406L);
            textView6 = null;
        }
        if (!z2) {
            i = R.color.primary_text;
        }
        textView6.setTextColor(m316(i));
        TextView textView7 = this.f480;
        if (textView7 == null) {
            AbstractC2328.m4341(-265286817842030L);
        } else {
            textView = textView7;
        }
        textView.setTypeface(z2 ? Typeface.DEFAULT : Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final void m324() {
        AbstractC0333 abstractC0333M3678 = AbstractC1897.m3678("com.android.permission.GET_INSTALLED_APPS");
        if (abstractC0333M3678 == null) {
            abstractC0333M3678 = new C1480();
            AbstractC1897.f9607.m2556("com.android.permission.GET_INSTALLED_APPS", abstractC0333M3678);
        }
        AbstractC2328.m4341(-267189488354158L);
        if (abstractC0333M3678.mo1020(this, true)) {
            m339();
            return;
        }
        this.f475.m704(new C2471(AbstractC2328.m4341(-267339812209518L), AbstractC2328.m4341(-267387056849774L), AbstractC2328.m4341(-267507315934062L), new C0685(this, 4)));
        C1633 c1633 = new C1633(this);
        ArrayList arrayList = (ArrayList) c1633.f8333;
        arrayList.remove(abstractC0333M3678);
        arrayList.add(abstractC0333M3678);
        c1633.m3331(new C2014(3, this));
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m325(View view) {
        if (this.f458 == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(new int[2]);
        C0798 c0798 = this.f458;
        C0798 c07982 = null;
        if (c0798 == null) {
            AbstractC2328.m4341(-267052049400686L);
            c0798 = null;
        }
        c0798.getLocationOnScreen(iArr);
        C0798 c07983 = this.f458;
        if (c07983 == null) {
            AbstractC2328.m4341(-267120768877422L);
        } else {
            c07982 = c07983;
        }
        c07982.m1842((view.getWidth() / 2.0f) + (r1[0] - iArr[0]), (view.getHeight() / 2.0f) + (r1[1] - iArr[1]));
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final void m326(ImageView imageView) {
        imageView.animate().rotation((((float) Math.ceil(imageView.getRotation() / 360.0f)) * 360.0f) + 360.0f).setDuration(650L).setInterpolator(new OvershootInterpolator(1.3f)).withEndAction(new RunnableC0309(10, imageView)).start();
        if (this.f458 == null) {
            return;
        }
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(new int[2]);
        C0798 c0798 = this.f458;
        C0798 c07982 = null;
        if (c0798 == null) {
            AbstractC2328.m4341(-266914610447214L);
            c0798 = null;
        }
        c0798.getLocationOnScreen(iArr);
        C0798 c07983 = this.f458;
        if (c07983 == null) {
            AbstractC2328.m4341(-266983329923950L);
        } else {
            c07982 = c07983;
        }
        c07982.m1842((imageView.getWidth() / 2.0f) + (r1[0] - iArr[0]), (imageView.getHeight() / 2.0f) + (r1[1] - iArr[1]));
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final GradientDrawable m327() {
        int iM338 = m338(true);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{iM338, m308(iM338, -1, 0.45f)});
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(m315(2), m308(iM338, m316(R.color.card_bg), 0.35f));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m328() {
        this.f456 = false;
        this.f475.m1058();
        C1213 c1213 = this.f482;
        if (c1213 != null) {
            c1213.post(new RunnableC1730(this, 10));
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final int m329() {
        int width;
        C1213 c1213 = this.f482;
        if (c1213 == null || c1213.getWidth() <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        } else {
            C1213 c12132 = this.f482;
            if (c12132 == null) {
                AbstractC2328.m4341(-266214530777966L);
                c12132 = null;
            }
            width = c12132.getWidth();
        }
        int i = (width - ((int) (getResources().getDisplayMetrics().widthPixels * 0.74f))) / 2;
        int iM315 = m315(10);
        return i < iM315 ? iM315 : i;
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final int[] m330() {
        int iM338 = m338(true);
        int iM3382 = m338(false);
        return new int[]{iM338, m308(iM338, -1, 0.4f), iM3382, m308(iM3382, -1, 0.4f), m316(R.color.douyin_secondary)};
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final void m331(String str, int i, int i2) {
        TextView textView = this.f469;
        if (textView == null) {
            AbstractC2328.m4341(-269349856904046L);
            textView = null;
        }
        textView.setText(str);
        TextView textView2 = this.f469;
        if (textView2 == null) {
            AbstractC2328.m4341(-269431461282670L);
            textView2 = null;
        }
        textView2.setTextColor(i);
        View view = this.f474;
        if (view == null) {
            AbstractC2328.m4341(-269513065661294L);
            view = null;
        }
        view.setBackground(m303(i, m311(999), null, 0));
        LinearLayout linearLayout = this.f457;
        if (linearLayout == null) {
            AbstractC2328.m4341(-269590375072622L);
            linearLayout = null;
        }
        linearLayout.setBackground(m303(i2, m311(999), null, 0));
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public final TextView m332(Context context, String str, boolean z, int i) {
        int i2;
        int iM316 = m316(R.color.card_bg);
        if (z) {
            i2 = -1;
            if ((Math.max(m309(-1), m309(i)) + 0.05d) / (Math.min(m309(-1), m309(i)) + 0.05d) < (Math.max(m309(-15261654), m309(i)) + 0.05d) / (Math.min(m309(-15261654), m309(i)) + 0.05d)) {
                i2 = -15261654;
            }
        } else {
            i2 = i;
        }
        TextView textViewM313 = m313(context, str, i2, z ? i : m308(i, iM316, 0.08f), z ? null : Integer.valueOf(m308(i, iM316, 0.3f)), z);
        textViewM313.setTypeface(Typeface.create(Typeface.MONOSPACE, z ? 1 : 0));
        return textViewM313;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final GradientDrawable m333() {
        int iM338 = m338(true);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{iM338, m308(-16777216, iM338, 0.12f)});
        gradientDrawable.setCornerRadius(m311(999));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public final void m334() {
        Object c2658;
        if (this.f466 != null) {
            C1416 c1416 = this.f468;
            TextView textView = null;
            if (c1416 == null) {
                m331(AbstractC2328.m4341(-268052776780654L), m316(R.color.status_warning), m316(R.color.status_warning_bg));
                TextView textView2 = this.f466;
                if (textView2 == null) {
                    AbstractC2328.m4341(-268069956649838L);
                    textView2 = null;
                }
                textView2.setText(AbstractC2328.m4341(-268155855995758L));
                TextView textView3 = this.f466;
                if (textView3 == null) {
                    AbstractC2328.m4341(-268220280505198L);
                    textView3 = null;
                }
                textView3.setTextColor(m316(R.color.status_warning));
                TextView textView4 = this.f454;
                if (textView4 == null) {
                    AbstractC2328.m4341(-268306179851118L);
                } else {
                    textView = textView4;
                }
                textView.setText(AbstractC2328.m4341(-268392079197038L));
            } else {
                try {
                    String strM2878 = c1416.m2878();
                    AbstractC2328.m4341(-268589647692654L);
                    String strM2882 = c1416.m2882();
                    AbstractC2328.m4341(-268684136973166L);
                    long jM2876 = c1416.m2876();
                    int iM2877 = c1416.m2877();
                    long jM2880 = c1416.m2880();
                    int size = c1416.m2881().size();
                    String str = strM2878 + ' ' + strM2882 + AbstractC2328.m4341(-268791511155566L) + jM2876 + ')';
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC2328.m4341(-268804396057454L));
                    sb.append(iM2877);
                    sb.append(AbstractC2328.m4341(-268825870893934L));
                    sb.append(size);
                    sb.append(AbstractC2328.m4341(-268860230632302L));
                    ArrayList arrayList = new ArrayList();
                    if ((jM2880 & 4) == 4) {
                        arrayList.add(AbstractC2328.m4341(-269693454287726L));
                    } else {
                        arrayList.add(AbstractC2328.m4341(-269727814026094L));
                    }
                    sb.append(AbstractC1595.m3285(arrayList, AbstractC2328.m4341(-269775058666350L), null, null, null, 62));
                    c2658 = new C0548(str, sb.toString());
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    String strM4341 = AbstractC2328.m4341(-268894590370670L);
                    String strM43412 = AbstractC2328.m4341(-268928950109038L);
                    String message = thM4249.getMessage();
                    if (message == null) {
                        message = AbstractC2328.m4341(-268971899781998L);
                    }
                    c2658 = new C0548(strM4341, strM43412.concat(message));
                }
                C0548 c0548 = (C0548) c2658;
                m331(AbstractC2328.m4341(-268993374618478L), m338(true), m308(m338(true), m316(R.color.card_bg), 0.1f));
                TextView textView5 = this.f466;
                if (textView5 == null) {
                    AbstractC2328.m4341(-269010554487662L);
                    textView5 = null;
                }
                textView5.setText(c0548.f2623);
                TextView textView6 = this.f466;
                if (textView6 == null) {
                    AbstractC2328.m4341(-269096453833582L);
                    textView6 = null;
                }
                textView6.setTextColor(m338(true));
                TextView textView7 = this.f454;
                if (textView7 == null) {
                    AbstractC2328.m4341(-269182353179502L);
                } else {
                    textView = textView7;
                }
                textView.setText(AbstractC2328.m4341(-269268252525422L).concat(c0548.f2624));
            }
        }
        m312();
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final void m335(C1335 c1335) {
        GradientDrawable gradientDrawable;
        C1016 c1016 = c1335.f6185;
        TextView textView = c1335.f6184;
        boolean zEquals = c1016.f4609.equals(this.f477.f4609);
        int i = c1335.f6185.f4612;
        int iM316 = m316(R.color.card_bg);
        c1335.f6183.setBackground(m303(zEquals ? m308(i, iM316, 0.08f) : iM316, m311(16), Integer.valueOf(zEquals ? i : m316(R.color.divider_color)), zEquals ? m315(2) : m315(1)));
        textView.setText(AbstractC2328.m4341(zEquals ? -271398556304238L : -271407146238830L));
        textView.setTextColor((Math.max(m309(-1), m309(i)) + 0.05d) / (Math.min(m309(-1), m309(i)) + 0.05d) >= (Math.max(m309(-15261654), m309(i)) + 0.05d) / (Math.min(m309(-15261654), m309(i)) + 0.05d) ? -1 : -15261654);
        if (zEquals) {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i, m308(-16777216, i, 0.12f)});
            gradientDrawable.setShape(1);
        } else {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(iM316);
            gradientDrawable2.setStroke(m315(2), m316(R.color.divider_color));
            gradientDrawable = gradientDrawable2;
        }
        textView.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final void m336(EnumC0110 enumC0110) {
        if (enumC0110 == this.f472 || this.f482 == null) {
            return;
        }
        this.f472 = enumC0110;
        getPreferences(0).edit().putString(AbstractC2328.m4341(-265368422220654L), AbstractC2328.m4341(enumC0110 == EnumC0110.f756 ? -265428551762798L : -265450026599278L)).apply();
        m323(true);
        C1213 c1213 = this.f482;
        C1213 c12132 = null;
        if (c1213 == null) {
            AbstractC2328.m4341(-265488681304942L);
            c1213 = null;
        }
        c1213.animate().cancel();
        C1213 c12133 = this.f482;
        if (c12133 == null) {
            AbstractC2328.m4341(-265544515879790L);
        } else {
            c12132 = c12133;
        }
        c12132.animate().alpha(0.0f).scaleX(0.92f).scaleY(0.92f).setDuration(150L).setInterpolator(new AccelerateInterpolator()).withEndAction(new RunnableC1730(this, 5)).start();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m337() {
        C0803 c0803 = this.f452;
        C1213 c1213 = null;
        if (c0803 != null) {
            c0803.m1850(null);
        }
        C1213 c12132 = this.f482;
        if (c12132 == null) {
            AbstractC2328.m4341(-265600350454638L);
            c12132 = null;
        }
        ArrayList arrayList = c12132.f5574;
        if (arrayList != null) {
            arrayList.clear();
        }
        int iOrdinal = this.f472.ordinal();
        if (iOrdinal == 0) {
            C1213 c12133 = this.f482;
            if (c12133 == null) {
                AbstractC2328.m4341(-265656185029486L);
                c12133 = null;
            }
            c12133.setLayoutManager(new LinearLayoutManager(0));
            C0803 c08032 = this.f452;
            if (c08032 == null) {
                c08032 = new C0803();
                this.f452 = c08032;
            }
            C1213 c12134 = this.f482;
            if (c12134 == null) {
                AbstractC2328.m4341(-265712019604334L);
                c12134 = null;
            }
            c08032.m1850(c12134);
            C1213 c12135 = this.f482;
            if (c12135 == null) {
                AbstractC2328.m4341(-265767854179182L);
                c12135 = null;
            }
            c12135.m2426(this.f479);
        } else {
            if (iOrdinal != 1) {
                C0188.m801();
                return;
            }
            C1213 c12136 = this.f482;
            if (c12136 == null) {
                AbstractC2328.m4341(-265823688754030L);
                c12136 = null;
            }
            c12136.setLayoutManager(new LinearLayoutManager(1));
            C1213 c12137 = this.f482;
            if (c12137 == null) {
                AbstractC2328.m4341(-265879523328878L);
                c12137 = null;
            }
            c12137.m2426(this.f471);
        }
        m319();
        C1213 c12138 = this.f482;
        if (c12138 == null) {
            AbstractC2328.m4341(-265935357903726L);
            c12138 = null;
        }
        c12138.m2464(0);
        C1213 c12139 = this.f482;
        if (c12139 == null) {
            AbstractC2328.m4341(-265991192478574L);
        } else {
            c1213 = c12139;
        }
        c1213.setAdapter(this.f475);
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public final int m338(boolean z) {
        C1016 c1016 = this.f477;
        return z ? c1016.f4612 : c1016.f4608;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m339() {
        this.f483++;
        final int i = this.f483;
        Thread thread = this.f459;
        if (thread != null) {
            thread.interrupt();
        }
        this.f475.m704(m306());
        Thread thread2 = new Thread(new Runnable() { // from class: com.ss.android.ugc.awemes.ᛲᲈᲁ
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity mainActivity = this.f526;
                int i2 = i;
                List list = MainActivity.f451;
                try {
                    List listM320 = mainActivity.m320();
                    if (!Thread.currentThread().isInterrupted() && i2 == mainActivity.f483) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listM320) {
                            MainActivity.C0042 c0042 = (MainActivity.C0042) obj;
                            if (!AbstractC0473.m1313(c0042.m341()) && !AbstractC0473.m1313(c0042.m342())) {
                                arrayList.add(obj);
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : arrayList) {
                            String strM341 = ((MainActivity.C0042) obj2).m341();
                            Object arrayList2 = linkedHashMap.get(strM341);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap.put(strM341, arrayList2);
                            }
                            ((List) arrayList2).add(obj2);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2366.m4382(linkedHashMap.size()));
                        for (Object obj3 : linkedHashMap.entrySet()) {
                            Object key = ((Map.Entry) obj3).getKey();
                            Iterable iterable = (Iterable) ((Map.Entry) obj3).getValue();
                            ArrayList arrayList3 = new ArrayList(AbstractC0055.m419(iterable, 10));
                            Iterator it = iterable.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((MainActivity.C0042) it.next()).m342());
                            }
                            linkedHashMap2.put(key, AbstractC1595.m3265(AbstractC1595.m3270(arrayList3)));
                        }
                        List listM321 = mainActivity.m321(linkedHashMap2);
                        if (!Thread.currentThread().isInterrupted() && i2 == mainActivity.f483) {
                            mainActivity.runOnUiThread(new RunnableC2555(i2, mainActivity, listM321, linkedHashMap2));
                        }
                    }
                } catch (Throwable th) {
                    if (Thread.currentThread().isInterrupted() || i2 != mainActivity.f483) {
                        return;
                    }
                    String strM4341 = AbstractC2328.m4341(-273009169040238L);
                    AbstractC2328.m4341(-262353355178862L);
                    Log.d(AbstractC2328.m4341(-262387714917230L), strM4341, th);
                    mainActivity.runOnUiThread(new RunnableC1671(i2, mainActivity, th));
                }
            }
        }, AbstractC2328.m4341(-267709179396974L) + i);
        thread2.start();
        this.f459 = thread2;
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final void m340() {
        C1213 c1213;
        if (this.f472 != EnumC0110.f755 || (c1213 = this.f482) == null) {
            return;
        }
        float width = c1213.getWidth() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        C1213 c12132 = this.f482;
        if (c12132 == null) {
            AbstractC2328.m4341(-266326199927662L);
            c12132 = null;
        }
        int childCount = c12132.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1213 c12133 = this.f482;
            if (c12133 == null) {
                AbstractC2328.m4341(-266382034502510L);
                c12133 = null;
            }
            View childAt = c12133.getChildAt(i);
            float fM1483 = AbstractC0598.m1483((((childAt.getRight() + childAt.getLeft()) / 2.0f) - width) / width, -1.0f, 1.0f);
            float fAbs = Math.abs(fM1483);
            childAt.setPivotX(childAt.getWidth() / 2.0f);
            childAt.setPivotY(childAt.getHeight() / 2.0f);
            childAt.setCameraDistance(getResources().getDisplayMetrics().density * 5600.0f);
            float f = -fM1483;
            childAt.setRotationY(40.0f * f);
            float f2 = 1.0f - (0.16f * fAbs);
            childAt.setScaleX(f2);
            childAt.setScaleY(f2);
            childAt.setAlpha(1.0f - (0.3f * fAbs));
            childAt.setTranslationX(f * childAt.getWidth() * 0.2f);
            childAt.setTranslationZ(m311(10) * (1.0f - fAbs));
            C1213 c12134 = this.f482;
            if (c12134 == null) {
                AbstractC2328.m4341(-266437869077358L);
                c12134 = null;
            }
            AbstractC0185 abstractC0185M2419 = c12134.m2419(childAt);
            if (abstractC0185M2419 instanceof C2039) {
                C0539 c0539 = ((C2039) abstractC0185M2419).f10149;
                float fAbs2 = 1.0f - Math.abs(fM1483);
                View view = c0539.f2590;
                view.setRotation((-3.0f) * fAbs2);
                MainActivity mainActivity = c0539.f2584;
                view.setTranslationY(mainActivity.m311(14) * fAbs2);
                View view2 = c0539.f2593;
                view2.setRotation((-1.5f) * fAbs2);
                view2.setTranslationY(mainActivity.m311(7) * fAbs2);
            }
        }
    }
}
