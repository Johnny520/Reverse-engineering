package p154k9;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import bsh.org.objectweb.asm.Opcodes;
import ca.RunnableC0537x;
import gg.AbstractC1416l;
import gg.C1421q;
import gg.C1423s;
import gg.C1425u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p002a1.RunnableC0006d;
import p092g4.AbstractC1341a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p153k8.C2343g;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p222p.AbstractC3199a;
import p242q8.C3446a;
import p242q8.C3458m;
import p259r9.AbstractC3754e0;
import p259r9.C3750c0;
import p259r9.C3752d0;
import p259r9.C3756f0;
import p259r9.ViewOnClickListenerC3755f;
import p259r9.ViewOnLongClickListenerC3757g;

/* JADX INFO: renamed from: k9.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2368l implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7779a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7780b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7781c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f7782d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC2368l(Object obj, Object obj2, Object obj3, int i9) {
        this.f7779a = i9;
        this.f7780b = obj;
        this.f7781c = obj2;
        this.f7782d = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:175:0x01d7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [android.app.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v63, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, android.view.ViewGroup, android.widget.ScrollView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        String str;
        String str2;
        int i9;
        boolean z9;
        boolean z10;
        char c10;
        int iM7909r;
        ?? M99x0;
        LinearLayout linearLayout;
        final C1421q c1421q;
        Context context;
        ScrollView scrollView;
        C1425u c1425u;
        LinearLayout linearLayout2;
        int i10;
        TextView textView;
        TextView textView2;
        C1425u c1425u2;
        LinearLayout linearLayout3;
        int i11;
        C1425u c1425u3;
        EditText editText;
        C1423s c1423s;
        final TextView textView3;
        TextView textView4;
        final String str3;
        TextView textView5;
        TextView textView6;
        final String str4;
        C1425u c1425u4;
        int i12 = this.f7779a;
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        Object obj = this.f7782d;
        Object obj2 = this.f7781c;
        Object obj3 = this.f7780b;
        switch (i12) {
            case 0:
                Activity activity = (Activity) obj3;
                ?? r14 = (ViewGroup) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                C2374r c2374r = C2374r.f7799a;
                View view2 = (View) C2374r.f7807i.get();
                if ((view2 != null ? view2.getParent() : null) != null) {
                    C2374r.m5675d(true);
                    return;
                }
                C2374r.m5675d(false);
                List listM6760L = AbstractC3165h.m6760L(activity);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : listM6760L) {
                    if (((C2366j) obj4).f7778g) {
                        arrayList.add(obj4);
                    }
                }
                if (arrayList.isEmpty()) {
                    Toast.makeText(activity, "请先添加并启用快捷项", 0).show();
                    return;
                }
                SharedPreferences sharedPreferences = C2374r.f7801c;
                String str6 = "icon";
                if (sharedPreferences == null || (string = sharedPreferences.getString("display_mode", "icon")) == null) {
                    string = "icon";
                }
                ?? linearLayout4 = new LinearLayout(activity);
                linearLayout4.setOrientation(1);
                linearLayout4.setPadding(0, C2374r.m5677f(activity, 4), 0, C2374r.m5677f(activity, 4));
                Iterator it = arrayList.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    C2366j c2366j = (C2366j) next;
                    boolean zEquals = string.equals(WeChatSnsPost.TYPE_TEXT);
                    boolean zEquals2 = string.equals(str6);
                    SharedPreferences sharedPreferences2 = C2374r.f7801c;
                    int iM7909r2 = sharedPreferences2 != null ? AbstractC3754e0.m7909r(sharedPreferences2.getInt("action_size", 44), 36, 64) : 44;
                    int i15 = C2374r.m5678g(activity) ? -231195840 : -167772161;
                    SharedPreferences sharedPreferences3 = C2374r.f7801c;
                    String str7 = string;
                    int[] iArrM5682k = C2374r.m5682k(i15, sharedPreferences3 != null ? sharedPreferences3.getString("action_color", str5) : null);
                    int i16 = C2374r.m5678g(activity) ? -1 : -14671580;
                    SharedPreferences sharedPreferences4 = C2374r.f7801c;
                    Iterator it2 = it;
                    int[] iArrM5682k2 = C2374r.m5682k(i16, sharedPreferences4 != null ? sharedPreferences4.getString("label_color", str5) : null);
                    int i17 = C2374r.m5679h(C2374r.m5686o(iArrM5682k)) ? -14671580 : -1;
                    ?? linearLayout5 = new LinearLayout(activity);
                    String str8 = str5;
                    linearLayout5.setOrientation(0);
                    linearLayout5.setGravity(17);
                    linearLayout5.setClickable(true);
                    linearLayout5.setFocusable(true);
                    linearLayout5.setMinimumHeight(C2374r.m5677f(activity, iM7909r2));
                    String str9 = c2366j.f7773b;
                    FrameLayout frameLayout2 = frameLayout;
                    String str10 = c2366j.f7777f;
                    linearLayout5.setContentDescription(str9);
                    if (zEquals2) {
                        str = str10;
                        str2 = str6;
                        i9 = i14;
                        z9 = zEquals;
                        z10 = true;
                    } else {
                        TextView textView7 = new TextView(activity);
                        str = str10;
                        textView7.setTag("Hchat:FloatingShortcut:Label");
                        textView7.setText(c2366j.f7773b);
                        textView7.setGravity(17);
                        SharedPreferences sharedPreferences5 = C2374r.f7801c;
                        if (sharedPreferences5 != null) {
                            str2 = str6;
                            i9 = i14;
                            iM7909r = AbstractC3754e0.m7909r(sharedPreferences5.getInt("label_text_size", 14), 10, 24);
                        } else {
                            str2 = str6;
                            i9 = i14;
                            iM7909r = 14;
                        }
                        textView7.setTextSize(iM7909r);
                        textView7.setMaxLines(1);
                        textView7.setEllipsize(TextUtils.TruncateAt.END);
                        textView7.setMaxWidth(C2374r.m5677f(activity, Opcodes.GETFIELD));
                        textView7.setMinHeight(C2374r.m5677f(activity, iM7909r2));
                        z9 = zEquals;
                        textView7.setPadding(C2374r.m5677f(activity, 11), C2374r.m5677f(activity, 6), C2374r.m5677f(activity, 11), C2374r.m5677f(activity, 6));
                        textView7.getPaint().setShader(null);
                        textView7.setTextColor(iArrM5682k2[0]);
                        if (iArrM5682k2.length >= 2) {
                            textView7.post(new RunnableC0006d(textView7, 22, iArrM5682k2));
                        }
                        textView7.setBackground(C2374r.m5672a(activity, false, null));
                        z10 = true;
                        textView7.setDuplicateParentStateEnabled(true);
                        linearLayout5.addView(textView7, new LinearLayout.LayoutParams(-2, -2));
                    }
                    if (z9) {
                        c10 = 17;
                    } else {
                        FrameLayout frameLayout3 = new FrameLayout(activity);
                        frameLayout3.setTag("Hchat:FloatingShortcut:Icon");
                        frameLayout3.setBackground(C2374r.m5672a(activity, z10, iArrM5682k));
                        frameLayout3.setDuplicateParentStateEnabled(z10);
                        ImageView imageView = new ImageView(activity);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        Drawable drawableM5680i = C2374r.m5680i(activity, (!C2374r.m5678g(activity) || AbstractC3149m.m6721t0(str)) ? c2366j.f7776e : str);
                        if (drawableM5680i == null) {
                            drawableM5680i = AbstractC1416l.m3825a(c2366j.f7774c, "plugin_agent") ? new C3446a(i17, 2) : new C2360d(AbstractC1341a.m3599o(c2366j), i17);
                        }
                        imageView.setImageDrawable(drawableM5680i);
                        int i18 = (int) (iM7909r2 * 0.57f);
                        int iM5677f = C2374r.m5677f(activity, i18 < 20 ? 20 : i18);
                        if (i18 < 20) {
                            i18 = 20;
                        }
                        c10 = 17;
                        frameLayout3.addView(imageView, new FrameLayout.LayoutParams(iM5677f, C2374r.m5677f(activity, i18), 17));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C2374r.m5677f(activity, iM7909r2), C2374r.m5677f(activity, iM7909r2));
                        if (!zEquals2) {
                            layoutParams.setMarginStart(C2374r.m5677f(activity, 8));
                        }
                        linearLayout5.addView(frameLayout3, layoutParams);
                    }
                    linearLayout5.setOnClickListener(new ViewOnClickListenerC2371o(activity, c2366j));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    if (i13 > 0) {
                        layoutParams2.topMargin = C2374r.m5677f(activity, 5);
                    }
                    linearLayout4.addView(linearLayout5, layoutParams2);
                    frameLayout = frameLayout2;
                    string = str7;
                    it = it2;
                    str5 = str8;
                    str6 = str2;
                    i13 = i9;
                }
                FrameLayout frameLayout4 = frameLayout;
                ?? scrollView2 = new ScrollView(activity);
                scrollView2.setVisibility(4);
                scrollView2.setVerticalScrollBarEnabled(false);
                scrollView2.setClipToPadding(false);
                scrollView2.setElevation(C2374r.m5677f(activity, 10));
                scrollView2.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -2));
                View view3 = new View(activity);
                view3.setClickable(true);
                view3.setBackgroundColor(0);
                view3.setOnClickListener(new ViewOnClickListenerC2370n());
                r14.addView(view3, new FrameLayout.LayoutParams(-1, -1, 8388659));
                r14.addView(scrollView2, new FrameLayout.LayoutParams(-2, -2, 8388659));
                C2374r.f7808j = new WeakReference(view3);
                C2374r.f7807i = new WeakReference(scrollView2);
                frameLayout4.bringToFront();
                scrollView2.post(new RunnableC0537x(9, activity, (Object) r14, frameLayout4, (Object) scrollView2, (Object) linearLayout4));
                return;
            default:
                final C3752d0 c3752d0 = (C3752d0) obj;
                final C3756f0 c3756f0M7833X = c3752d0.m7833X(obj3, Integer.valueOf(((C3756f0) obj2).f12240a), true);
                Context context2 = view.getContext();
                context2.getClass();
                String strM7774L0 = C3752d0.m7774L0(c3756f0M7833X.f12245f);
                if (AbstractC3149m.m6721t0(strM7774L0)) {
                    strM7774L0 = c3756f0M7833X.f12246g;
                }
                if (AbstractC3149m.m6721t0(strM7774L0)) {
                    strM7774L0 = c3756f0M7833X.f12247h;
                }
                String strM6737a0 = (c3752d0.f12192c.getBoolean("message_details_format_content", false) || C3752d0.m7785U(strM7774L0)) ? AbstractC3156t.m6737a0(strM7774L0, "><", ">\n<", false) : strM7774L0;
                LinearLayout linearLayout6 = new LinearLayout(context2);
                linearLayout6.setOrientation(1);
                int iM7804l = C3752d0.m7804l(context2, 8.0f);
                linearLayout6.setPadding(iM7804l, C3752d0.m7804l(context2, 4.0f), iM7804l, 0);
                LinearLayout linearLayout7 = new LinearLayout(context2);
                linearLayout7.setOrientation(0);
                linearLayout7.setGravity(16);
                final TextView textView8 = new TextView(context2);
                textView8.setTextSize(11.0f);
                textView8.setTextColor(-7829368);
                textView8.setText("搜索");
                TextView textView9 = new TextView(context2);
                textView9.setText("×");
                textView9.setTextSize(16.0f);
                textView9.setGravity(17);
                textView9.setTextColor(Color.rgb(33, 150, 243));
                textView9.setVisibility(8);
                linearLayout7.addView(textView8, new LinearLayout.LayoutParams(0, -2, 1.0f));
                linearLayout7.addView(textView9, new LinearLayout.LayoutParams(C3752d0.m7804l(context2, 40.0f), -2));
                LinearLayout linearLayout8 = new LinearLayout(context2);
                linearLayout8.setOrientation(1);
                linearLayout8.setVisibility(8);
                linearLayout8.setPadding(0, C3752d0.m7804l(context2, 4.0f), 0, 0);
                linearLayout8.addView(linearLayout7);
                LinearLayout linearLayout9 = new LinearLayout(context2);
                linearLayout9.setOrientation(0);
                linearLayout9.setGravity(16);
                final EditText editText2 = new EditText(context2);
                editText2.setHint("搜索");
                editText2.setSingleLine(true);
                editText2.setTextSize(12.0f);
                final EditText editText3 = new EditText(context2);
                editText3.setHint("替换为");
                editText3.setSingleLine(true);
                editText3.setTextSize(12.0f);
                String str11 = strM7774L0;
                linearLayout9.addView(editText2, new LinearLayout.LayoutParams(0, -2, 1.0f));
                linearLayout9.addView(editText3, new LinearLayout.LayoutParams(0, -2, 1.0f));
                linearLayout8.addView(linearLayout9);
                LinearLayout linearLayout10 = new LinearLayout(context2);
                linearLayout10.setOrientation(0);
                linearLayout10.setGravity(16);
                TextView textViewM7767F0 = C3752d0.m7767F0(context2, c3752d0, "上一个");
                TextView textViewM7767F02 = C3752d0.m7767F0(context2, c3752d0, "下一个");
                TextView textViewM7767F03 = C3752d0.m7767F0(context2, c3752d0, "替换");
                TextView textViewM7767F04 = C3752d0.m7767F0(context2, c3752d0, "全部替换");
                linearLayout10.addView(textViewM7767F0, new LinearLayout.LayoutParams(0, -2, 1.0f));
                linearLayout10.addView(textViewM7767F02, new LinearLayout.LayoutParams(0, -2, 1.0f));
                linearLayout10.addView(textViewM7767F03, new LinearLayout.LayoutParams(0, -2, 1.0f));
                linearLayout10.addView(textViewM7767F04, new LinearLayout.LayoutParams(0, -2, 1.0f));
                linearLayout8.addView(linearLayout10);
                linearLayout6.addView(linearLayout8);
                int iOrdinal = C3752d0.m7793f(c3756f0M7833X).ordinal();
                if (iOrdinal == 2) {
                    M99x0 = AbstractC0000a.m99x0("@所有人（全体群成员）");
                } else if (iOrdinal != 3) {
                    List listM7794f0 = C3752d0.m7794f0(c3756f0M7833X.f12248i);
                    M99x0 = new ArrayList();
                    for (Object obj5 : listM7794f0) {
                        String str12 = (String) obj5;
                        if (!AbstractC1416l.m3825a(str12, "announcement@all") && !AbstractC1416l.m3825a(str12, "notify@all")) {
                            M99x0.add(obj5);
                        }
                    }
                } else {
                    M99x0 = AbstractC0000a.m99x0("群公告全体");
                }
                if (!M99x0.isEmpty()) {
                    TextView textView10 = new TextView(context2);
                    StringBuilder sb2 = new StringBuilder("艾特对象");
                    ?? r32 = M99x0;
                    for (String str13 : M99x0) {
                        sb2.append('\n');
                        sb2.append(str13);
                        r32 = r32;
                    }
                    ?? r21 = r32;
                    textView10.setText(sb2.toString());
                    textView10.setTextIsSelectable(true);
                    textView10.setTextSize(13.0f);
                    textView10.setTextColor(-7829368);
                    textView10.setIncludeFontPadding(true);
                    textView10.setPadding(0, C3752d0.m7804l(context2, 4.0f), 0, C3752d0.m7804l(context2, 8.0f));
                    ScrollView scrollView3 = new ScrollView(context2);
                    scrollView3.setVerticalScrollBarEnabled(r21.size() > 4);
                    scrollView3.setOverScrollMode(1);
                    scrollView3.addView(textView10, new ViewGroup.LayoutParams(-1, -2));
                    linearLayout6.addView(scrollView3, new LinearLayout.LayoutParams(-1, Math.min(C3752d0.m7804l(context2, 120.0f), C3752d0.m7804l(context2, (r21.size() * 20.0f) + 30.0f))));
                }
                int iMin = strM6737a0.length() > 600 ? Math.min(C3752d0.m7804l(context2, 720.0f), (int) (context2.getResources().getDisplayMetrics().heightPixels * 0.78f)) : -2;
                TextView textView11 = new TextView(context2);
                textView11.setText(strM6737a0);
                textView11.setTextIsSelectable(true);
                textView11.setTextSize(18.0f);
                Typeface typeface = Typeface.DEFAULT;
                textView11.setTypeface(typeface);
                textView11.setIncludeFontPadding(true);
                textView11.setPadding(0, 0, 0, 0);
                ScrollView scrollView4 = new ScrollView(context2);
                scrollView4.setFillViewport(false);
                scrollView4.setVerticalScrollBarEnabled(false);
                scrollView4.setOverScrollMode(1);
                scrollView4.addView(textView11, new ViewGroup.LayoutParams(-1, -2));
                final EditText editText4 = new EditText(context2);
                editText4.setText(strM6737a0);
                editText4.setSelectAllOnFocus(false);
                editText4.setHorizontallyScrolling(false);
                editText4.setMinLines(14);
                editText4.setMaxLines(24);
                editText4.setTextSize(18.0f);
                editText4.setTypeface(typeface);
                editText4.setBackground(null);
                editText4.setPadding(0, 0, 0, 0);
                editText4.setIncludeFontPadding(true);
                editText4.setVerticalScrollBarEnabled(false);
                editText4.setOverScrollMode(1);
                editText4.setInputType(655361);
                editText4.setGravity(8388659);
                linearLayout6.addView(scrollView4, new LinearLayout.LayoutParams(-1, iMin));
                final C1423s c1423s2 = new C1423s();
                c1423s2.f4736g = -1;
                C1421q c1421q2 = new C1421q();
                C1425u c1425u5 = new C1425u();
                c1425u5.f4738g = HttpUrl.FRAGMENT_ENCODE_SET;
                C1425u c1425u6 = new C1425u();
                int i19 = iMin;
                editText2.addTextChangedListener(new C3750c0(c1423s2, textView8, editText2, editText4));
                final int i20 = 0;
                textViewM7767F0.setOnClickListener(new View.OnClickListener() { // from class: r9.e
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        switch (i20) {
                            case 0:
                                C3752d0.m7771J0(editText2, textView8, c1423s2, editText4, false);
                                break;
                            default:
                                C3752d0.m7771J0(editText2, textView8, c1423s2, editText4, true);
                                break;
                        }
                    }
                });
                final int i21 = 1;
                textViewM7767F02.setOnClickListener(new View.OnClickListener() { // from class: r9.e
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        switch (i21) {
                            case 0:
                                C3752d0.m7771J0(editText2, textView8, c1423s2, editText4, false);
                                break;
                            default:
                                C3752d0.m7771J0(editText2, textView8, c1423s2, editText4, true);
                                break;
                        }
                    }
                });
                final int i22 = 0;
                textViewM7767F03.setOnClickListener(new View.OnClickListener() { // from class: r9.h
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        CharSequence charSequenceSubSequence;
                        switch (i22) {
                            case 0:
                                EditText editText5 = editText2;
                                Editable text = editText5.getText();
                                String string2 = text != null ? text.toString() : null;
                                String str14 = HttpUrl.FRAGMENT_ENCODE_SET;
                                if (string2 == null) {
                                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                int length = string2.length();
                                TextView textView12 = textView8;
                                if (length != 0) {
                                    EditText editText6 = editText4;
                                    int iMin2 = Math.min(editText6.getSelectionStart(), editText6.getSelectionEnd());
                                    if (iMin2 < 0) {
                                        iMin2 = 0;
                                    }
                                    int iMax = Math.max(editText6.getSelectionStart(), editText6.getSelectionEnd());
                                    if (iMax < iMin2) {
                                        iMax = iMin2;
                                    }
                                    Editable text2 = editText6.getText();
                                    String string3 = (text2 == null || (charSequenceSubSequence = text2.subSequence(iMin2, iMax)) == null) ? null : charSequenceSubSequence.toString();
                                    if (string3 == null) {
                                        string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    boolean zEquals3 = string3.equals(string2);
                                    C1423s c1423s3 = c1423s2;
                                    if (!zEquals3) {
                                        C3752d0.m7771J0(editText5, textView12, c1423s3, editText6, true);
                                    } else {
                                        Editable text3 = editText3.getText();
                                        String string4 = text3 != null ? text3.toString() : null;
                                        if (string4 != null) {
                                            str14 = string4;
                                        }
                                        Editable text4 = editText6.getText();
                                        if (text4 != null) {
                                            text4.replace(iMin2, iMax, str14);
                                        }
                                        c1423s3.f4736g = -1;
                                        textView12.setText("已替换 1 处");
                                        C3752d0.m7771J0(editText5, textView12, c1423s3, editText6, true);
                                    }
                                } else {
                                    textView12.setText("请输入搜索内容");
                                }
                                break;
                            default:
                                EditText editText7 = editText2;
                                Editable text5 = editText7.getText();
                                String string5 = text5 != null ? text5.toString() : null;
                                String str15 = HttpUrl.FRAGMENT_ENCODE_SET;
                                if (string5 == null) {
                                    string5 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                int length2 = string5.length();
                                TextView textView13 = textView8;
                                if (length2 != 0) {
                                    Editable text6 = editText4.getText();
                                    String string6 = text6 != null ? text6.toString() : null;
                                    if (string6 == null) {
                                        string6 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    EditText editText8 = editText3;
                                    Editable text7 = editText8.getText();
                                    String string7 = text7 != null ? text7.toString() : null;
                                    if (string7 != null) {
                                        str15 = string7;
                                    }
                                    int size = C3752d0.m7770I0(editText7, editText8).size();
                                    textView13.setText("搜索结果: " + size);
                                    if (size > 0) {
                                        editText8.setText(AbstractC3156t.m6737a0(str15, string5, string6, false));
                                        editText8.setSelection(0);
                                        c1423s2.f4736g = -1;
                                        textView13.setText("已替换 " + size + " 处");
                                    } else {
                                        textView13.setText("未找到: ".concat(string5));
                                    }
                                } else {
                                    textView13.setText("请输入搜索内容");
                                }
                                break;
                        }
                    }
                });
                final int i23 = 1;
                final EditText editText5 = editText4;
                final TextView textView12 = textView8;
                textViewM7767F04.setOnClickListener(new View.OnClickListener() { // from class: r9.h
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        CharSequence charSequenceSubSequence;
                        switch (i23) {
                            case 0:
                                EditText editText52 = editText2;
                                Editable text = editText52.getText();
                                String string2 = text != null ? text.toString() : null;
                                String str14 = HttpUrl.FRAGMENT_ENCODE_SET;
                                if (string2 == null) {
                                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                int length = string2.length();
                                TextView textView122 = textView8;
                                if (length != 0) {
                                    EditText editText6 = editText3;
                                    int iMin2 = Math.min(editText6.getSelectionStart(), editText6.getSelectionEnd());
                                    if (iMin2 < 0) {
                                        iMin2 = 0;
                                    }
                                    int iMax = Math.max(editText6.getSelectionStart(), editText6.getSelectionEnd());
                                    if (iMax < iMin2) {
                                        iMax = iMin2;
                                    }
                                    Editable text2 = editText6.getText();
                                    String string3 = (text2 == null || (charSequenceSubSequence = text2.subSequence(iMin2, iMax)) == null) ? null : charSequenceSubSequence.toString();
                                    if (string3 == null) {
                                        string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    boolean zEquals3 = string3.equals(string2);
                                    C1423s c1423s3 = c1423s2;
                                    if (!zEquals3) {
                                        C3752d0.m7771J0(editText52, textView122, c1423s3, editText6, true);
                                    } else {
                                        Editable text3 = editText4.getText();
                                        String string4 = text3 != null ? text3.toString() : null;
                                        if (string4 != null) {
                                            str14 = string4;
                                        }
                                        Editable text4 = editText6.getText();
                                        if (text4 != null) {
                                            text4.replace(iMin2, iMax, str14);
                                        }
                                        c1423s3.f4736g = -1;
                                        textView122.setText("已替换 1 处");
                                        C3752d0.m7771J0(editText52, textView122, c1423s3, editText6, true);
                                    }
                                } else {
                                    textView122.setText("请输入搜索内容");
                                }
                                break;
                            default:
                                EditText editText7 = editText2;
                                Editable text5 = editText7.getText();
                                String string5 = text5 != null ? text5.toString() : null;
                                String str15 = HttpUrl.FRAGMENT_ENCODE_SET;
                                if (string5 == null) {
                                    string5 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                int length2 = string5.length();
                                TextView textView13 = textView8;
                                if (length2 != 0) {
                                    Editable text6 = editText3.getText();
                                    String string6 = text6 != null ? text6.toString() : null;
                                    if (string6 == null) {
                                        string6 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    EditText editText8 = editText4;
                                    Editable text7 = editText8.getText();
                                    String string7 = text7 != null ? text7.toString() : null;
                                    if (string7 != null) {
                                        str15 = string7;
                                    }
                                    int size = C3752d0.m7770I0(editText7, editText8).size();
                                    textView13.setText("搜索结果: " + size);
                                    if (size > 0) {
                                        editText8.setText(AbstractC3156t.m6737a0(str15, string5, string6, false));
                                        editText8.setSelection(0);
                                        c1423s2.f4736g = -1;
                                        textView13.setText("已替换 " + size + " 处");
                                    } else {
                                        textView13.setText("未找到: ".concat(string5));
                                    }
                                } else {
                                    textView13.setText("请输入搜索内容");
                                }
                                break;
                        }
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(context2);
                String str14 = c3756f0M7833X.f12249j;
                if (AbstractC3149m.m6721t0(str14)) {
                    str14 = "消息详情";
                }
                AlertDialog alertDialogShow = builder.setTitle(str14).setView(linearLayout6).setNeutralButton("编辑", (DialogInterface.OnClickListener) null).setNegativeButton("复制", (DialogInterface.OnClickListener) null).setPositiveButton("关闭", (DialogInterface.OnClickListener) null).show();
                alertDialogShow.getClass();
                c1425u6.f4738g = alertDialogShow;
                Button button = alertDialogShow.getButton(-3);
                if (button != null) {
                    linearLayout = linearLayout8;
                    c1421q = c1421q2;
                    context = context2;
                    scrollView = scrollView4;
                    c1425u = c1425u5;
                    linearLayout2 = linearLayout6;
                    i10 = i19;
                    textView = textView9;
                    textView2 = textView11;
                    button.setOnLongClickListener(new ViewOnLongClickListenerC3757g(c1421q, linearLayout, textView, i10, editText5, c1425u, editText2, c1423s2, textView12, scrollView, c3752d0, textView2, linearLayout2, c1425u6, context, 1));
                } else {
                    linearLayout = linearLayout8;
                    c1421q = c1421q2;
                    context = context2;
                    scrollView = scrollView4;
                    c1425u = c1425u5;
                    linearLayout2 = linearLayout6;
                    i10 = i19;
                    textView = textView9;
                    textView2 = textView11;
                }
                Object obj6 = c1425u6.f4738g;
                if (obj6 == null) {
                    AbstractC1416l.m3831g("dialog");
                    throw null;
                }
                Button button2 = ((AlertDialog) obj6).getButton(-3);
                if (button2 != null) {
                    ViewOnClickListenerC3755f viewOnClickListenerC3755f = new ViewOnClickListenerC3755f(c1421q, linearLayout, textView, i10, editText5, c1425u, editText2, c1423s2, textView12, scrollView, c3752d0, textView2, linearLayout2, c1425u6, context, 1);
                    linearLayout3 = linearLayout;
                    i11 = i10;
                    c1425u3 = c1425u;
                    editText = editText2;
                    c1423s = c1423s2;
                    textView3 = textView2;
                    c1425u2 = c1425u6;
                    textView4 = textView;
                    button2.setOnClickListener(viewOnClickListenerC3755f);
                } else {
                    c1425u2 = c1425u6;
                    linearLayout3 = linearLayout;
                    i11 = i10;
                    c1425u3 = c1425u;
                    editText = editText2;
                    c1423s = c1423s2;
                    textView3 = textView2;
                    textView4 = textView;
                }
                Object obj7 = c1425u2.f4738g;
                if (obj7 == null) {
                    AbstractC1416l.m3831g("dialog");
                    throw null;
                }
                Button button3 = ((AlertDialog) obj7).getButton(-2);
                if (button3 != null) {
                    final C1425u c1425u7 = c1425u2;
                    final Context context3 = context;
                    str4 = str11;
                    final String str15 = strM6737a0;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: r9.i
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            boolean z11 = c1421q.f4734g;
                            Context context4 = context3;
                            C1425u c1425u8 = c1425u7;
                            String str16 = str4;
                            String str17 = HttpUrl.FRAGMENT_ENCODE_SET;
                            if (z11) {
                                EditText editText6 = editText5;
                                Editable text = editText6.getText();
                                String string2 = text != null ? text.toString() : null;
                                if (string2 != null) {
                                    str17 = string2;
                                }
                                int iMin2 = Math.min(editText6.getSelectionStart(), editText6.getSelectionEnd());
                                if (iMin2 < 0) {
                                    iMin2 = 0;
                                }
                                int iMax = Math.max(editText6.getSelectionStart(), editText6.getSelectionEnd());
                                int length = str17.length();
                                if (iMax > length) {
                                    iMax = length;
                                }
                                boolean z12 = iMax > iMin2;
                                C3752d0.m7798i(context4, z12 ? str17.substring(iMin2, iMax) : C3752d0.m7768G0(editText6, str15, str16, c3752d0));
                                if (z12) {
                                    textView12.setText("已复制选中内容");
                                    return;
                                }
                                Object obj8 = c1425u8.f4738g;
                                if (obj8 != null) {
                                    ((AlertDialog) obj8).dismiss();
                                    return;
                                } else {
                                    AbstractC1416l.m3831g("dialog");
                                    throw null;
                                }
                            }
                            TextView textView13 = textView3;
                            CharSequence text2 = textView13.getText();
                            String string3 = text2 != null ? text2.toString() : null;
                            if (string3 != null) {
                                str17 = string3;
                            }
                            int iMin3 = Math.min(textView13.getSelectionStart(), textView13.getSelectionEnd());
                            if (iMin3 < 0) {
                                iMin3 = 0;
                            }
                            int iMax2 = Math.max(textView13.getSelectionEnd(), textView13.getSelectionStart());
                            int length2 = str17.length();
                            if (iMax2 > length2) {
                                iMax2 = length2;
                            }
                            if (iMax2 > iMin3) {
                                C3752d0.m7798i(context4, str17.substring(iMin3, iMax2));
                                Toast.makeText(context4, "已复制选中内容", 0).show();
                                return;
                            }
                            C3752d0.m7798i(context4, str16);
                            Object obj9 = c1425u8.f4738g;
                            if (obj9 != null) {
                                ((AlertDialog) obj9).dismiss();
                            } else {
                                AbstractC1416l.m3831g("dialog");
                                throw null;
                            }
                        }
                    };
                    textView5 = textView4;
                    textView6 = textView3;
                    str3 = str15;
                    textView12 = textView12;
                    editText5 = editText5;
                    button3.setOnClickListener(onClickListener);
                } else {
                    TextView textView13 = textView3;
                    str3 = strM6737a0;
                    textView5 = textView4;
                    textView6 = textView13;
                    str4 = str11;
                }
                Object obj8 = c1425u2.f4738g;
                if (obj8 == null) {
                    AbstractC1416l.m3831g("dialog");
                    throw null;
                }
                Button button4 = ((AlertDialog) obj8).getButton(-1);
                if (button4 != null) {
                    final C1425u c1425u8 = c1425u2;
                    final EditText editText6 = editText5;
                    final Context context4 = context;
                    c1425u4 = c1425u8;
                    editText5 = editText6;
                    button4.setOnClickListener(new View.OnClickListener() { // from class: r9.j
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
                        /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
                        /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onClick(View view4) {
                            boolean z11 = c1421q.f4734g;
                            C1425u c1425u9 = c1425u8;
                            if (!z11) {
                                Object obj9 = c1425u9.f4738g;
                                if (obj9 != null) {
                                    ((AlertDialog) obj9).dismiss();
                                    return;
                                } else {
                                    AbstractC1416l.m3831g("dialog");
                                    throw null;
                                }
                            }
                            String string2 = AbstractC3149m.m6703R0(C3752d0.m7768G0(editText6, str3, str4, c3752d0)).toString();
                            String strM7258a = c3756f0M7833X.f12243d;
                            if (AbstractC3149m.m6721t0(strM7258a)) {
                                C3458m c3458mChatPage = WeChatApis.chatPage();
                                strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
                                if (strM7258a == null) {
                                    strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                            }
                            boolean zM6721t0 = AbstractC3149m.m6721t0(strM7258a);
                            boolean z12 = false;
                            Context context5 = context4;
                            if (zM6721t0 || AbstractC3149m.m6721t0(string2)) {
                                Toast.makeText(context5, "发送失败：会话或内容为空", 0).show();
                            } else {
                                String lowerCase = string2.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                if (!AbstractC3149m.m6709h0(lowerCase, "<img", false) || (AbstractC3149m.m6709h0(lowerCase, "<appmsg", false) && AbstractC3149m.m6709h0(lowerCase, "</appmsg>", false))) {
                                    C2343g c2343gM6844q = AbstractC3199a.m6844q();
                                    boolean z13 = true;
                                    if (AbstractC3149m.m6709h0(lowerCase, "<appmsg", false) && AbstractC3149m.m6709h0(lowerCase, "</appmsg>", false)) {
                                        if (c2343gM6844q == null || !c2343gM6844q.m5603z(strM7258a, string2)) {
                                        }
                                        Toast.makeText(context5, !z13 ? "已发送" : "发送失败", 0).show();
                                        z12 = z13;
                                    } else if (C3752d0.m7785U(string2)) {
                                        Toast.makeText(context5, "当前只支持 AppMsg 卡片 XML 发送", 0).show();
                                    } else {
                                        if (c2343gM6844q == null || !c2343gM6844q.m5601x(strM7258a, string2)) {
                                            z13 = false;
                                        }
                                        Toast.makeText(context5, !z13 ? "已发送" : "发送失败", 0).show();
                                        z12 = z13;
                                    }
                                } else {
                                    Toast.makeText(context5, "图片 XML 不能直接发送，请下载后走图片发送", 0).show();
                                }
                            }
                            if (z12) {
                                Object obj10 = c1425u9.f4738g;
                                if (obj10 != null) {
                                    ((AlertDialog) obj10).dismiss();
                                } else {
                                    AbstractC1416l.m3831g("dialog");
                                    throw null;
                                }
                            }
                        }
                    });
                } else {
                    c1425u4 = c1425u2;
                }
                EditText editText7 = editText;
                TextView textView14 = textView5;
                C1423s c1423s3 = c1423s;
                C1425u c1425u9 = c1425u3;
                int i24 = i11;
                C1421q c1421q3 = c1421q;
                LinearLayout linearLayout11 = linearLayout3;
                TextView textView15 = textView12;
                textView15.setOnClickListener(new ViewOnClickListenerC3755f(linearLayout11, c1421q3, textView14, i24, editText5, c1425u9, editText7, c1423s3, textView12, scrollView, c3752d0, textView6, linearLayout2, c1425u4, context));
                textView15.setOnLongClickListener(new ViewOnLongClickListenerC3757g(linearLayout11, c1421q3, textView14, i24, editText5, c1425u9, editText7, c1423s3, textView15, scrollView, c3752d0, textView6, linearLayout2, c1425u4, context));
                int i25 = 0;
                textView5.setOnClickListener(new ViewOnClickListenerC3755f(c1421q3, linearLayout11, textView14, i24, editText5, c1425u9, editText7, c1423s3, textView15, scrollView, c3752d0, textView6, linearLayout2, c1425u4, context, i25));
                textView5.setOnLongClickListener(new ViewOnLongClickListenerC3757g(c1421q3, linearLayout11, textView14, i24, editText5, c1425u9, editText7, c1423s3, textView15, scrollView, c3752d0, textView6, linearLayout2, c1425u4, context, i25));
                return;
        }
    }
}
