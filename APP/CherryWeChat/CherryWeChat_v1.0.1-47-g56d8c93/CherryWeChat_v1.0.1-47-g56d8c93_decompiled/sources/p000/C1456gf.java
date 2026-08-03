package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AndroidAppHelper;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.application.MainApplication;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: gf */
/* JADX INFO: loaded from: classes.dex */
public class C1456gf implements InterfaceC1092Zb, InterfaceC1233bs, InterfaceC2819zw, InterfaceC2142kc, InterfaceC0120Cr, InterfaceC2394q0, InterfaceC0718Qn, InterfaceC0565N5, InterfaceC1440g6, InterfaceC0667Pf {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C1456gf f5158b = new C1456gf(1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C1456gf f5159c = new C1456gf(2);

    /* JADX INFO: renamed from: d */
    public static final C1456gf f5160d = new C1456gf(5);

    /* JADX INFO: renamed from: e */
    public static final C1456gf f5161e = new C1456gf(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ C1456gf f5162f = new C1456gf(7);

    /* JADX INFO: renamed from: g */
    public static final C1456gf f5163g = new C1456gf(8);

    /* JADX INFO: renamed from: h */
    public static final C1456gf f5164h = new C1456gf(9);

    /* JADX INFO: renamed from: i */
    public static final C1456gf f5165i = new C1456gf(11);

    /* JADX INFO: renamed from: j */
    public static final C1456gf f5166j = new C1456gf(12);

    /* JADX INFO: renamed from: k */
    public static final C1456gf f5167k = new C1456gf(13);

    /* JADX INFO: renamed from: l */
    public static final C1456gf f5168l = new C1456gf(14);

    /* JADX INFO: renamed from: m */
    public static final C1456gf f5169m = new C1456gf(15);

    /* JADX INFO: renamed from: n */
    public static final C1456gf f5170n = new C1456gf(16);

    /* JADX INFO: renamed from: o */
    public static int f5171o;

    /* JADX INFO: renamed from: p */
    public static Application f5172p;

    /* JADX INFO: renamed from: q */
    public static WeakReference f5173q;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5174a;

    public /* synthetic */ C1456gf(int i) {
        this.f5174a = i;
    }

    /* JADX INFO: renamed from: A */
    public static Application m2783A() {
        MainApplication mainApplication = MainApplication.f5549a;
        if (mainApplication != null) {
            return mainApplication;
        }
        Application application = f5172p;
        if (application != null) {
            return application;
        }
        Application applicationCurrentApplication = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
        return applicationCurrentApplication;
    }

    /* JADX INFO: renamed from: B */
    public static LinearLayout m2784B(Context context) {
        EditText editText = new EditText(context);
        editText.setTextColor(context.getColor(R.color.textTitle));
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        Drawable background = editText.getBackground();
        if (background != null) {
            background.setColorFilter(new PorterDuffColorFilter(-12417548, PorterDuff.Mode.SRC_ATOP));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24), 0);
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        return linearLayout;
    }

    /* JADX INFO: renamed from: C */
    public static Drawable m2785C(String str) {
        AbstractC0295Gu.m625r(-836646744356917L);
        C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-586748367206453L));
        Object obj = c1214bG != null ? c1214bG.f4146a : null;
        Object objNewInstance = (obj instanceof Class ? (Class) obj : null).getConstructor(String.class, Float.TYPE).newInstance(str, Float.valueOf(0.5f));
        if (objNewInstance instanceof Drawable) {
            return (Drawable) objNewInstance;
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static String m2786D() {
        return AbstractC0295Gu.m625r(-391967305365557L) + Build.FINGERPRINT + AbstractC0295Gu.m625r(-391473384126517L) + m2792J() + AbstractC0295Gu.m625r(-391512038832181L) + m2789G();
    }

    /* JADX INFO: renamed from: E */
    public static HashMap m2787E() throws IllegalAccessException, InvocationTargetException {
        C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-587212223674421L));
        Object obj = c1214bG != null ? c1214bG.f4146a : null;
        Object objInvoke = (obj instanceof Method ? (Method) obj : null).invoke(null, null);
        AbstractC0295Gu.m625r(-837707601279029L);
        return (HashMap) objInvoke;
    }

    /* JADX INFO: renamed from: F */
    public static View m2788F(ViewGroup viewGroup, int... iArr) {
        AbstractC0295Gu.m625r(-838416270882869L);
        if (viewGroup == null) {
            return null;
        }
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            View childAt = viewGroup.getChildAt(iArr[i]);
            if (i == iArr.length - 1) {
                return childAt;
            }
            if (!(childAt instanceof ViewGroup)) {
                throw new IllegalArgumentException(AbstractC0295Gu.m625r(-838450630621237L) + i + AbstractC0295Gu.m625r(-838515055130677L));
            }
            viewGroup = (ViewGroup) childAt;
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public static String m2789G() {
        Object obj = m2787E().get(AbstractC0295Gu.m625r(-836139938215989L));
        String strM625r = obj instanceof String ? (String) obj : null;
        if (strM625r == null) {
            strM625r = AbstractC0295Gu.m625r(-835671786780725L);
        }
        return strM625r.length() == 0 ? String.valueOf(Long.parseLong(strM625r) & 4294967295L) : strM625r;
    }

    /* JADX INFO: renamed from: H */
    public static Drawable m2790H() {
        Application applicationM2783A = m2783A();
        String str = m2783A().getApplicationInfo().packageName;
        AbstractC0295Gu.m625r(-837656061671477L);
        String string = applicationM2783A.getSharedPreferences(str.concat(AbstractC0295Gu.m625r(-835676081748021L)), 0).getString(AbstractC0295Gu.m625r(-835731916322869L), AbstractC0295Gu.m625r(-835804930766901L));
        AbstractC0295Gu.m625r(-835809225734197L);
        if (string.length() == 0) {
            return new ColorDrawable(0);
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(string);
        AbstractC0295Gu.m625r(-836578024880181L);
        Resources resources = m2783A().getResources();
        AbstractC0295Gu.m625r(-836955982002229L);
        return new BitmapDrawable(resources, bitmapDecodeFile);
    }

    /* JADX INFO: renamed from: I */
    public static String m2791I() {
        Object obj = m2787E().get(AbstractC0295Gu.m625r(-837419838470197L));
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? AbstractC0295Gu.m625r(-837514327750709L) : str;
    }

    /* JADX INFO: renamed from: J */
    public static String m2792J() {
        Object obj = m2787E().get(AbstractC0295Gu.m625r(-836036859000885L));
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? AbstractC0295Gu.m625r(-836135643248693L) : str;
    }

    /* JADX INFO: renamed from: K */
    public static String m2793K() {
        Object obj = m2787E().get(AbstractC0295Gu.m625r(-835942369720373L));
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? AbstractC0295Gu.m625r(-836032564033589L) : str;
    }

    /* JADX INFO: renamed from: L */
    public static String m2794L() {
        Object obj = m2787E().get(AbstractC0295Gu.m625r(-837518622718005L));
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? m2791I() : str;
    }

    /* JADX INFO: renamed from: M */
    public static void m2795M(ViewGroup viewGroup, int i, int i2, boolean z) {
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof TextView) {
                if (!z) {
                    TextView textView = (TextView) childAt;
                    if (textView.getTextSize() < AbstractC0295Gu.m616i(13) && i2 != 0) {
                        textView.setTextColor(i2);
                    } else if (i != 0) {
                        textView.setTextColor(i);
                    }
                } else if (i2 != 0) {
                    m2797O((TextView) childAt, i2);
                }
            }
            if (childAt instanceof ViewGroup) {
                m2795M((ViewGroup) childAt, i, i2, false);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m2796N(View view, Drawable drawable) {
        if (view != null) {
            view.setTag(R.id.tag_view_bg_ban, null);
            view.setBackground(drawable);
            view.setTag(R.id.tag_view_bg_ban, Object.class);
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m2797O(TextView textView, int i) {
        if (textView != null) {
            textView.setTag(R.id.tag_textview_color_ban, null);
            textView.setTextColor(i);
            textView.setTag(R.id.tag_textview_color_ban, TextView.class);
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m2798P(Context context, String str, String str2, String str3, InterfaceC0579Nd interfaceC0579Nd) {
        AbstractC0295Gu.m625r(-827906485909557L);
        AbstractC0295Gu.m625r(-827391089834037L);
        m2799Q(context, str, str2, AbstractC0295Gu.m625r(-827429744539701L), str3, interfaceC0579Nd);
    }

    /* JADX INFO: renamed from: Q */
    public static void m2799Q(Context context, String str, String str2, String str3, String str4, InterfaceC0579Nd interfaceC0579Nd) {
        AbstractC0295Gu.m625r(-827489874081845L);
        AbstractC0295Gu.m625r(-827524233820213L);
        AbstractC0295Gu.m625r(-827541413689397L);
        LinearLayout linearLayoutM2784B = m2784B(context);
        View childAt = linearLayoutM2784B.getChildAt(0);
        AbstractC0295Gu.m625r(-827580068395061L);
        EditText editText = (EditText) childAt;
        String strM1173b = AbstractC0599Nx.m1173b(str3, str4);
        editText.setText(strM1173b);
        editText.setSelection(strM1173b.length());
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(str).setMessage(str2).setView(linearLayoutM2784B).setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC0622Od(interfaceC0579Nd, editText)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0665Pd(context, editText)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        m2802T(alertDialogCreate, false);
    }

    /* JADX INFO: renamed from: R */
    public static void m2800R(final Context context, String str, String str2, String str3, String str4, List list, InterfaceC0579Nd interfaceC0579Nd) {
        Integer num = 10;
        AbstractC0295Gu.m625r(-843784980002869L);
        AbstractC0295Gu.m625r(-843819339741237L);
        AbstractC0295Gu.m625r(-843836519610421L);
        AbstractC0295Gu.m625r(-843875174316085L);
        LinearLayout linearLayoutM2784B = m2784B(context);
        int i = 1;
        linearLayoutM2784B.setOrientation(1);
        View childAt = linearLayoutM2784B.getChildAt(0);
        AbstractC0295Gu.m625r(-843359778240565L);
        final EditText editText = (EditText) childAt;
        String strM1173b = AbstractC0599Nx.m1173b(str3, str4);
        editText.setText(strM1173b);
        editText.setSelection(strM1173b.length());
        if (!list.isEmpty()) {
            TextView textView = new TextView(context);
            textView.setText(AbstractC0295Gu.m625r(-844171527059509L));
            textView.setTextSize(14.0f);
            textView.setTextColor(-16745729);
            textView.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8));
            textView.setClickable(true);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ScrollView scrollView = new ScrollView(context);
            scrollView.setVisibility(8);
            scrollView.addView(linearLayout);
            textView.setOnClickListener(new ViewOnClickListenerC2176l5(6, scrollView, textView));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0208Et c0208Et = (C0208Et) it.next();
                String str5 = (String) c0208Et.f613a;
                String str6 = (String) c0208Et.f614b;
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(i);
                EditText editText2 = editText;
                linearLayout2.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(num), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(num));
                linearLayout2.setClickable(true);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(285212672);
                gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(8));
                linearLayout2.setBackground(gradientDrawable);
                TextView textView2 = new TextView(context);
                textView2.setText(str5);
                textView2.setTextSize(15.0f);
                textView2.setTextColor(context.getColor(R.color.textTitle));
                textView2.setTypeface(Typeface.DEFAULT_BOLD);
                linearLayout2.addView(textView2);
                TextView textView3 = new TextView(context);
                textView3.setText(str6);
                textView3.setTextSize(12.0f);
                textView3.setTextColor(-7434605);
                linearLayout2.addView(textView3);
                editText = editText2;
                linearLayout2.setOnClickListener(new ViewOnClickListenerC1433g(editText, str6, context, str5, 1));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(24), 0);
                linearLayout.addView(linearLayout2, layoutParams);
                num = num;
                i = 1;
            }
            linearLayoutM2784B.addView(textView);
            linearLayoutM2784B.addView(scrollView, new LinearLayout.LayoutParams(-1, -2));
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(str).setMessage(str2).setView(linearLayoutM2784B).setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC0448Kb(1, interfaceC0579Nd, editText)).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: Ld
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object systemService = context.getSystemService(AbstractC0295Gu.m625r(-843969663596597L));
                AbstractC0295Gu.m625r(-844025498171445L);
                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 1);
            }
        }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        m2802T(alertDialogCreate, true);
    }

    /* JADX INFO: renamed from: S */
    public static void m2801S(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, boolean z) {
        AbstractC0295Gu.m625r(-827872126171189L);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(str).setMessage(str2).setPositiveButton(android.R.string.ok, onClickListener).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        m2802T(alertDialogCreate, z);
    }

    /* JADX INFO: renamed from: T */
    public static void m2802T(AlertDialog alertDialog, boolean z) {
        AbstractC0295Gu.m625r(-844334735816757L);
        TextView textView = (TextView) alertDialog.findViewById(android.R.id.title);
        if (textView != null) {
            textView.setTextSize(18.0f);
            textView.setTextColor(alertDialog.getContext().getColor(R.color.textTitle));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(16));
        }
        TextView textView2 = (TextView) alertDialog.findViewById(android.R.id.message);
        if (textView2 != null) {
            textView2.setTextSize(15.0f);
            textView2.setTextColor(-12829629);
            textView2.setLineSpacing(8.0f, 1.0f);
            textView2.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(24), 0);
            textView2.setTextIsSelectable(true);
        }
        Button button = alertDialog.getButton(-1);
        if (button != null) {
            button.setTextColor(-16745729);
            button.setTextSize(16.0f);
            button.setAllCaps(false);
        }
        Button button2 = alertDialog.getButton(-2);
        if (button2 != null) {
            button2.setTextColor(alertDialog.getContext().getColor(R.color.textTitle));
            button2.setTextSize(16.0f);
            button2.setAllCaps(false);
        }
        Window window = alertDialog.getWindow();
        if (window != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(window.getContext().getColor(R.color.colorBackground));
            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
            window.setBackgroundDrawable(gradientDrawable);
            if (z) {
                window.setLayout((int) (((double) window.getContext().getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m2803U(Context context, String str) {
        AbstractC0295Gu.m625r(-836191477823541L);
        AbstractC0295Gu.m625r(-836225837561909L);
        Intent intent = new Intent();
        intent.setAction(AbstractC0295Gu.m625r(-817242082113589L));
        intent.addCategory(AbstractC0295Gu.m625r(-817358046230581L));
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: n */
    public static final String m2804n(C1456gf c1456gf, Map map, long j, String str) throws NoSuchAlgorithmException {
        c1456gf.getClass();
        TreeMap treeMap = new TreeMap(map);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!AbstractC0585Nj.m1134a(str2, AbstractC0295Gu.m625r(-391533513668661L)) && !value.toString().startsWith(AbstractC0295Gu.m625r(-391554988505141L)) && !value.toString().startsWith(AbstractC0295Gu.m625r(-391563578439733L))) {
                sb.append(str2);
                sb.append(value);
            }
        }
        sb.append(j);
        sb.append(str);
        String string = sb.toString();
        AbstractC0295Gu.m625r(-391572168374325L);
        MessageDigest messageDigest = MessageDigest.getInstance(AbstractC0295Gu.m625r(-391885700986933L));
        byte[] bytes = string.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-391902880856117L);
        return AbstractC0650P4.m1313H(messageDigest.digest(bytes), AbstractC0295Gu.m625r(-391963010398261L), new C1197b(12));
    }

    /* JADX INFO: renamed from: o */
    public static void m2805o(ViewGroup viewGroup) {
        AbstractC0295Gu.m625r(-839734825842741L);
        m2807r(viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                m2805o((ViewGroup) childAt);
            } else {
                m2807r(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m2806q(ViewGroup viewGroup) {
        AbstractC0295Gu.m625r(-838128508074037L);
        m2807r(viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                m2806q((ViewGroup) childAt);
            } else if (!(childAt instanceof TextView)) {
                m2807r(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m2807r(View view) {
        if (view != null) {
            view.setBackground(null);
            view.setTag(R.id.tag_view_bg_ban, Object.class);
        }
    }

    /* JADX INFO: renamed from: t */
    public static ImageView m2808t(Context context, Drawable drawable) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        AbstractC0295Gu.m625r(-838635314214965L);
        AbstractC0295Gu.m625r(-837020406511669L);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    /* JADX INFO: renamed from: u */
    public static void m2809u(ViewGroup viewGroup) {
        RelativeLayout relativeLayout;
        Float fValueOf = Float.valueOf(6.0f);
        Float fValueOf2 = Float.valueOf(32.0f);
        AbstractC0295Gu.m625r(-525094111672373L);
        View viewFindViewById = viewGroup.findViewById(AbstractC0828TB.f2617i);
        if (viewFindViewById != null) {
            ViewParent parent = viewFindViewById.getParent();
            AbstractC0295Gu.m625r(-525137061345333L);
            relativeLayout = (RelativeLayout) parent;
            HashMap map = AbstractC0999XA.f3193a;
            Drawable drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-523775556712501L));
            if (drawableM2890b != null) {
                viewFindViewById.setAlpha(0.0f);
                Context context = viewGroup.getContext();
                AbstractC0295Gu.m625r(-523393304623157L);
                ImageView imageViewM2808t = m2808t(context, drawableM2890b);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(fValueOf2), AbstractC0295Gu.m616i(fValueOf2));
                layoutParams.addRule(15);
                layoutParams.leftMargin = AbstractC0295Gu.m616i(fValueOf);
                relativeLayout.addView(imageViewM2808t, layoutParams);
            }
        } else {
            relativeLayout = null;
        }
        ImageView imageViewM2813y = m2813y(viewGroup, AbstractC0295Gu.m625r(-523462024099893L));
        if (imageViewM2813y != null) {
            HashMap map2 = AbstractC0999XA.f3193a;
            if (C1517hw.m2890b(AbstractC0295Gu.m625r(-523547923445813L)) != null) {
                imageViewM2813y.setAlpha(0.0f);
                Context context2 = viewGroup.getContext();
                AbstractC0295Gu.m625r(-524265182984245L);
                ImageView imageViewM2808t2 = m2808t(context2, C1517hw.m2890b(AbstractC0295Gu.m625r(-524333902460981L)));
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(fValueOf2), AbstractC0295Gu.m616i(fValueOf2));
                layoutParams2.addRule(15);
                layoutParams2.addRule(11, 1);
                layoutParams2.rightMargin = AbstractC0295Gu.m616i(fValueOf);
                if (relativeLayout != null) {
                    relativeLayout.addView(imageViewM2808t2, layoutParams2);
                }
            }
        }
        ImageView imageViewM2813y2 = m2813y(viewGroup, AbstractC0295Gu.m625r(-523951650371637L));
        if (imageViewM2813y2 != null) {
            HashMap map3 = AbstractC0999XA.f3193a;
            Drawable drawableM2890b2 = C1517hw.m2890b(AbstractC0295Gu.m625r(-524067614488629L));
            if (drawableM2890b2 != null) {
                imageViewM2813y2.setAlpha(0.0f);
                Context context3 = viewGroup.getContext();
                AbstractC0295Gu.m625r(-522594440706101L);
                ImageView imageViewM2808t3 = m2808t(context3, drawableM2890b2);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(fValueOf2), AbstractC0295Gu.m616i(fValueOf2));
                layoutParams3.addRule(15);
                layoutParams3.addRule(11, 1);
                layoutParams3.rightMargin = AbstractC0295Gu.m616i(fValueOf);
                if (relativeLayout != null) {
                    relativeLayout.addView(imageViewM2808t3, layoutParams3);
                }
            }
        }
        TextView textView = relativeLayout != null ? (TextView) relativeLayout.findViewById(android.R.id.text1) : null;
        HashMap map4 = AbstractC0999XA.f3193a;
        m2797O(textView, C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-522663160182837L)));
    }

    /* JADX INFO: renamed from: v */
    public static View m2810v(ViewGroup viewGroup, String str) {
        View viewM2810v;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().equals(str)) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (viewM2810v = m2810v((ViewGroup) childAt, str)) != null) {
                return viewM2810v;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static TextView m2811w(ViewGroup viewGroup, String str) {
        TextView textViewM2811w;
        AbstractC0295Gu.m625r(-838171457746997L);
        AbstractC0295Gu.m625r(-838214407419957L);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (AbstractC0585Nj.m1134a(textView.getText().toString(), str)) {
                    return textView;
                }
            }
            if ((childAt instanceof ViewGroup) && (textViewM2811w = m2811w((ViewGroup) childAt, str)) != null) {
                return textViewM2811w;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static void m2812x(ViewGroup viewGroup, ArrayList arrayList) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getHeight() == 1) {
                arrayList.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                m2812x((ViewGroup) childAt, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static ImageView m2813y(ViewGroup viewGroup, String str) {
        ImageView imageViewM2813y;
        AbstractC0295Gu.m625r(-838235882256437L);
        AbstractC0295Gu.m625r(-838278831929397L);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ImageView) {
                ImageView imageView = (ImageView) childAt;
                if (str.equals(imageView.getTag(R.id.tag_we_img_name))) {
                    return imageView;
                }
            }
            if ((childAt instanceof ViewGroup) && (imageViewM2813y = m2813y((ViewGroup) childAt, str)) != null) {
                return imageViewM2813y;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static int m2814z(Activity activity) {
        int i = f5171o;
        return (i != 0 || activity == null) ? i : new C2262n5(activity).f7975b;
    }

    @Override // p000.InterfaceC1440g6
    /* JADX INFO: renamed from: a */
    public Class mo2751a() {
        switch (this.f5174a) {
            case 25:
                return ByteBuffer.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: b */
    public void mo193b(MenuC2204lr menuC2204lr, boolean z) {
    }

    @Override // p000.InterfaceC0667Pf
    /* JADX INFO: renamed from: c */
    public boolean mo892c(Object obj, File file, C2644vt c2644vt) throws Throwable {
        try {
            AbstractC2529t6.m5012d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p000.InterfaceC0718Qn
    /* JADX INFO: renamed from: d */
    public void mo1507d(InterfaceC0975Wn interfaceC0975Wn) {
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: e */
    public Bitmap mo51e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: g */
    public Bitmap mo52g(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: h */
    public void mo53h(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p000.InterfaceC2819zw
    /* JADX INFO: renamed from: i */
    public InterfaceC2389pw mo660i(InterfaceC2389pw interfaceC2389pw, C2644vt c2644vt) {
        return interfaceC2389pw;
    }

    @Override // p000.InterfaceC1440g6
    /* JADX INFO: renamed from: j */
    public Object mo2752j(byte[] bArr) {
        switch (this.f5174a) {
            case 25:
                return ByteBuffer.wrap(bArr);
            default:
                return new ByteArrayInputStream(bArr);
        }
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: k */
    public void mo54k(int i) {
    }

    @Override // p000.InterfaceC0718Qn
    /* JADX INFO: renamed from: l */
    public void mo1508l(InterfaceC0975Wn interfaceC0975Wn) {
        interfaceC0975Wn.mo401k();
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: m */
    public void mo55m() {
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs c2428qs) {
        switch (this.f5174a) {
            case 13:
                return C0872UC.f2757b;
            case 26:
                return new C1484h6(0, new C1456gf(25));
            default:
                return new C1484h6(0, new C1456gf(27));
        }
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: s */
    public boolean mo194s(MenuC2204lr menuC2204lr) {
        return false;
    }
}
