package p088s0;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.activity.RunnableC0371b;
import com.p055lu.wxmask.bean.OptionData;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import p001A0.RunnableC0045r;
import p003B0.AbstractC0055a;
import p004C.C0060d;
import p006D.AbstractC0079h;
import p009E0.C0103c;
import p009E0.C0107g;
import p011F0.AbstractC0120h;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p027N0.AbstractC0223g;
import p027N0.C0228l;
import p034R0.C0244c;
import p037T.C0261l;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0306p;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p067g0.AbstractC0575a;
import p077m0.ViewOnClickListenerC0770h;
import p081o0.C0781b;
import p084q0.DialogInterfaceOnClickListenerC0802b;
import p086r0.ViewOnClickListenerC0837F1;
import p086r0.ViewOnClickListenerC0853L;
import p090t0.AbstractC1008c;
import p102z0.AbstractC1126i;
import p102z0.C1119b;
import p102z0.C1124g;

/* JADX INFO: renamed from: s0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0976J extends AbstractC1008c {

    /* JADX INFO: renamed from: h */
    public final String f3490h;

    /* JADX INFO: renamed from: i */
    public boolean f3491i;

    /* JADX INFO: renamed from: j */
    public EditText f3492j;

    /* JADX INFO: renamed from: k */
    public EditText f3493k;

    /* JADX INFO: renamed from: l */
    public final OptionData f3494l;

    /* JADX INFO: renamed from: m */
    public Integer f3495m;

    /* JADX INFO: renamed from: n */
    public Integer f3496n;

    /* JADX INFO: renamed from: o */
    public Bitmap f3497o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0976J(Context context) {
        super(context, null, 0, 0);
        this.f3490h = "mask_manager_wechat_panel_first_enter_announcement_shown";
        OptionData.Companion companion = OptionData.Companion;
        boolean z2 = AbstractC1126i.f3786a;
        this.f3494l = companion.fromJson(companion.toJson(C1124g.m2435k()));
        setOnShowListener(new C1002x(this, 14));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final LinearLayout m2153A(C0976J c0976j) {
        c0976j.getClass();
        LinearLayout linearLayout = new LinearLayout(c0976j.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(8), AbstractC0055a.m101b(10), AbstractC0055a.m101b(14));
        linearLayout.setBackgroundColor(0);
        TextView textView = new TextView(linearLayout.getContext());
        AbstractC0174d.m358n(-1, -2, textView, "自定义名称");
        textView.setTextColor(c0976j.getTEXT_PRIMARY());
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 13.2f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams);
        textView2.setText("自定义长按菜单里“加入名单”的显示名称，留空默认加入名单");
        textView2.setTextColor(c0976j.getTEXT_SECONDARY());
        textView2.setTextSize(1, 10.5f);
        linearLayout.addView(textView2);
        String quickAddMenuTitle = c0976j.f3494l.getQuickAddMenuTitle();
        if (AbstractC0307q.m534d0(quickAddMenuTitle)) {
            quickAddMenuTitle = "加入名单";
        }
        EditText editTextM2186t = c0976j.m2186t(quickAddMenuTitle);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(38));
        layoutParams2.topMargin = AbstractC0055a.m101b(8);
        editTextM2186t.setLayoutParams(layoutParams2);
        c0976j.f3493k = editTextM2186t;
        editTextM2186t.setHint("加入名单");
        editTextM2186t.setInputType(1);
        linearLayout.addView(editTextM2186t);
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams3.topMargin = AbstractC0055a.m101b(8);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(c0976j.getDIVIDER_COLOR());
        linearLayout.addView(view);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final LinearLayout m2154B(C0976J c0976j) {
        c0976j.getClass();
        LinearLayout linearLayout = new LinearLayout(c0976j.getContext());
        List<C0103c> listM252Z = AbstractC0120h.m252Z(new C0103c[]{new C0103c("#add", "打开加入名单"), new C0103c("#del", "移除当前密友"), new C0103c("#hide", "隐藏聊天内容"), new C0103c("#show", "恢复聊天内容"), new C0103c("#copyId", "复制当前微信ID")});
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(8), AbstractC0055a.m101b(10), AbstractC0055a.m101b(14));
        linearLayout.setBackgroundColor(0);
        TextView textView = new TextView(linearLayout.getContext());
        AbstractC0174d.m358n(-1, -2, textView, "口令示例");
        textView.setTextColor(c0976j.getTEXT_PRIMARY());
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 13.2f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams);
        textView2.setText("在聊天输入框输入以下口令后自动触发");
        textView2.setTextColor(c0976j.getTEXT_SECONDARY());
        textView2.setTextSize(1, 10.5f);
        linearLayout.addView(textView2);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0055a.m101b(10);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setOrientation(1);
        for (C0103c c0103c : listM252Z) {
            String str = (String) c0103c.f394a;
            String str2 = (String) c0103c.f395b;
            LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.bottomMargin = AbstractC0055a.m101b(7);
            linearLayout3.setLayoutParams(layoutParams3);
            linearLayout3.setGravity(16);
            linearLayout3.setOrientation(0);
            TextView textView3 = new TextView(linearLayout3.getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(AbstractC0055a.m101b(70), AbstractC0055a.m101b(28));
            layoutParams4.setMarginEnd(AbstractC0055a.m101b(8));
            textView3.setLayoutParams(layoutParams4);
            textView3.setGravity(17);
            textView3.setText(str);
            textView3.setTextColor(c0976j.getACCENT_TEAL());
            textView3.setTypeface(Typeface.DEFAULT_BOLD);
            textView3.setTextSize(1, 11.0f);
            textView3.setBackground(m2160K(c0976j, m2161S(c0976j.getACCENT_TEAL()), AbstractC0055a.m101b(4), null, 8));
            linearLayout3.addView(textView3);
            TextView textView4 = new TextView(linearLayout3.getContext());
            textView4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            textView4.setText(str2);
            textView4.setTextColor(c0976j.getTEXT_SECONDARY());
            textView4.setTextSize(1, 11.2f);
            linearLayout3.addView(textView4);
            linearLayout2.addView(linearLayout3);
        }
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final LinearLayout m2155C(C0976J c0976j) {
        int i2 = 4;
        c0976j.getClass();
        LinearLayout linearLayout = new LinearLayout(c0976j.getContext());
        boolean z2 = AbstractC1126i.f3786a;
        String strM2437m = C1124g.m2437m();
        if (AbstractC0307q.m534d0(strM2437m)) {
            strM2437m = "未识别";
        }
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(8), AbstractC0055a.m101b(10), AbstractC0055a.m101b(10));
        linearLayout.setBackgroundColor(0);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        View viewM2184r = c0976j.m2184r("ID", c0976j.getACCENT_BLUE(), AbstractC0055a.m101b(22));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0055a.m101b(22), AbstractC0055a.m101b(22));
        layoutParams.gravity = 48;
        layoutParams.setMarginEnd(AbstractC0055a.m101b(10));
        viewM2184r.setLayoutParams(layoutParams);
        linearLayout2.addView(viewM2184r);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.setOrientation(1);
        TextView textView = new TextView(linearLayout3.getContext());
        AbstractC0174d.m358n(-1, -2, textView, "本机微信识别id：");
        textView.setTextColor(c0976j.getTEXT_PRIMARY());
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 13.2f);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(linearLayout3.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(strM2437m);
        textView2.setTextColor(c0976j.getTEXT_SECONDARY());
        textView2.setTextSize(1, 10.5f);
        textView2.setTextIsSelectable(true);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0770h(i2, strM2437m));
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams3.topMargin = AbstractC0055a.m101b(8);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(c0976j.getDIVIDER_COLOR());
        linearLayout.addView(view);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final FrameLayout m2156D(C0976J c0976j, String str, C0975I c0975i) {
        FrameLayout frameLayout = new FrameLayout(c0976j.getContext());
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, AbstractC0055a.m101b(48)));
        frameLayout.setBackgroundColor(c0976j.getHEADER_COLOR());
        TextView textView = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC0055a.m101b(52), -1);
        layoutParams.gravity = 8388611;
        layoutParams.setMarginStart(AbstractC0055a.m101b(4));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextColor(c0976j.getTEXT_PRIMARY());
        textView.setTextSize(1, 21.0f);
        textView.setText("‹");
        textView.setOnClickListener(new ViewOnClickListenerC0770h(3, c0975i));
        frameLayout.addView(textView);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        View viewM2184r = c0976j.m2184r(m2158H(str), c0976j.m2190y(str), AbstractC0055a.m101b(18));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(AbstractC0055a.m101b(18), AbstractC0055a.m101b(18));
        layoutParams3.gravity = 16;
        layoutParams3.setMarginEnd(AbstractC0055a.m101b(6));
        viewM2184r.setLayoutParams(layoutParams3);
        linearLayout.addView(viewM2184r);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView2.setTextColor(c0976j.getTEXT_PRIMARY());
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setTextSize(1, 18.5f);
        textView2.setText(str);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static String m2158H(String str) {
        return AbstractC0299i.m511i0(str, "名单", false) ? "≡" : AbstractC0299i.m511i0(str, "快捷", false) ? "⚡" : AbstractC0299i.m511i0(str, "密友", false) ? "♙" : AbstractC0299i.m511i0(str, "通讯录", false) ? "▣" : AbstractC0299i.m511i0(str, "聊天记录", false) ? "□" : AbstractC0299i.m511i0(str, "存储", false) ? "◎" : (AbstractC0299i.m511i0(str, "语音", false) || AbstractC0299i.m511i0(str, "视频", false)) ? "☎" : AbstractC0299i.m511i0(str, "搜索", false) ? "⌕" : AbstractC0299i.m511i0(str, "朋友圈", false) ? "☻" : (AbstractC0299i.m511i0(str, "点赞", false) || AbstractC0299i.m511i0(str, "评论", false)) ? "☰" : (AbstractC0299i.m511i0(str, "角标", false) || AbstractC0299i.m511i0(str, "消息", false)) ? "♢" : AbstractC0299i.m511i0(str, "震动", false) ? "≈" : AbstractC0299i.m511i0(str, "加粗", false) ? "B" : AbstractC0299i.m511i0(str, "密码", false) ? "▢" : "•";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static GradientDrawable m2159J(int i2, int i3, Integer num, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(i3);
        if (num != null) {
            gradientDrawable.setStroke(i4, num.intValue());
        }
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static /* synthetic */ GradientDrawable m2160K(C0976J c0976j, int i2, int i3, Integer num, int i4) {
        if ((i4 & 2) != 0) {
            i3 = AbstractC0055a.m101b(8);
        }
        if ((i4 & 4) != 0) {
            num = Integer.valueOf(c0976j.getDIVIDER_COLOR());
        }
        int iM101b = AbstractC0055a.m101b(1);
        c0976j.getClass();
        return m2159J(i2, i3, num, iM101b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static int m2161S(int i2) {
        return Color.argb(30, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getACCENT_BLUE() {
        getThemePalette().getClass();
        return -12812566;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getACCENT_GREEN() {
        getThemePalette().getClass();
        return -12999829;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getACCENT_ORANGE() {
        getThemePalette().getClass();
        return -2519774;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getACCENT_PINK() {
        getThemePalette().getClass();
        return -2466443;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getACCENT_PURPLE() {
        getThemePalette().getClass();
        return -8820520;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getACCENT_TEAL() {
        getThemePalette().getClass();
        return -15292005;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getCARD_COLOR() {
        return getThemePalette().f3501d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final View getContent() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        final int i2 = 1;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        final int i3 = 0;
        linearLayout.setPadding(0, 0, 0, AbstractC0055a.m101b(24));
        linearLayout.setBackgroundColor(getPAGE_BG_COLOR());
        boolean z2 = AbstractC1126i.f3786a;
        String str = C1124g.m2433i().size() + " 人";
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = AbstractC0055a.m101b(12);
        layoutParams2.rightMargin = AbstractC0055a.m101b(12);
        layoutParams2.topMargin = AbstractC0055a.m101b(4);
        layoutParams2.bottomMargin = AbstractC0055a.m101b(12);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setMinimumHeight(AbstractC0055a.m101b(68));
        linearLayout2.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(9), AbstractC0055a.m101b(10), AbstractC0055a.m101b(9));
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackground(m2160K(this, getCARD_COLOR(), 0, null, 14));
        linearLayout2.setElevation(AbstractC0055a.m100a(0.5f));
        View viewM2184r = m2184r(m2158H("名单管理"), m2190y("名单管理"), AbstractC0055a.m101b(30));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(AbstractC0055a.m101b(30), AbstractC0055a.m101b(30));
        layoutParams3.gravity = 16;
        layoutParams3.setMarginEnd(AbstractC0055a.m101b(8));
        viewM2184r.setLayoutParams(layoutParams3);
        linearLayout2.addView(viewM2184r);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams4.gravity = 16;
        layoutParams4.setMarginEnd(AbstractC0055a.m101b(8));
        linearLayout3.setLayoutParams(layoutParams4);
        linearLayout3.setGravity(16);
        linearLayout3.setOrientation(1);
        TextView textView = new TextView(linearLayout3.getContext());
        AbstractC0174d.m358n(-1, -2, textView, "名单管理");
        textView.setTextColor(getTEXT_PRIMARY());
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setTextSize(1, 14.6f);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(linearLayout3.getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = AbstractC0055a.m101b(2);
        textView2.setLayoutParams(layoutParams5);
        textView2.setText("管理需要隐藏的密友名单");
        textView2.setTextColor(getTEXT_SECONDARY());
        textView2.setTextSize(1, 10.0f);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(linearLayout2.getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(AbstractC0055a.m101b(58), -2);
        layoutParams6.gravity = 16;
        linearLayout4.setLayoutParams(layoutParams6);
        linearLayout4.setGravity(8388629);
        linearLayout4.setOrientation(1);
        TextView textView3 = new TextView(linearLayout4.getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, AbstractC0055a.m101b(22));
        layoutParams7.gravity = 8388613;
        textView3.setLayoutParams(layoutParams7);
        textView3.setMinWidth(AbstractC0055a.m101b(48));
        textView3.setPadding(AbstractC0055a.m101b(9), 0, AbstractC0055a.m101b(9), 0);
        textView3.setGravity(17);
        textView3.setText(str);
        textView3.setTextColor(getACCENT_TEAL());
        textView3.setTypeface(typeface);
        textView3.setTextSize(1, 10.2f);
        textView3.setBackground(m2160K(this, m2161S(getACCENT_TEAL()), AbstractC0055a.m101b(11), null, 8));
        linearLayout4.addView(textView3);
        TextView textView4 = new TextView(linearLayout4.getContext());
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(AbstractC0055a.m101b(24), AbstractC0055a.m101b(22));
        layoutParams8.gravity = 8388613;
        layoutParams8.topMargin = AbstractC0055a.m101b(3);
        textView4.setLayoutParams(layoutParams8);
        textView4.setText("›");
        textView4.setGravity(17);
        textView4.setTextColor(getTEXT_TERTIARY());
        textView4.setTextSize(1, 21.0f);
        linearLayout4.addView(textView4);
        linearLayout2.addView(linearLayout4);
        linearLayout2.setOnClickListener(new ViewOnClickListenerC1000v(this, 3));
        linearLayout.addView(linearLayout2);
        linearLayout.addView(m2187u("临时解除"));
        LinearLayout linearLayoutM2183q = m2183q();
        LinearLayout linearLayout5 = new LinearLayout(getContext());
        final C0228l c0228l = new C0228l();
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout5.setOrientation(1);
        linearLayout5.setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(linearLayout5.getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(AbstractC0055a.m101b(58));
        frameLayout.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(8), AbstractC0055a.m101b(10), AbstractC0055a.m101b(8));
        View viewM2184r2 = m2184r(m2158H("密友快捷显示"), m2190y("密友快捷显示"), AbstractC0055a.m101b(28));
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(28), AbstractC0055a.m101b(28));
        layoutParams9.gravity = 8388627;
        viewM2184r2.setLayoutParams(layoutParams9);
        frameLayout.addView(viewM2184r2);
        LinearLayout linearLayout6 = new LinearLayout(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams10.gravity = 16;
        layoutParams10.setMarginStart(AbstractC0055a.m101b(40));
        layoutParams10.setMarginEnd(AbstractC0055a.m101b(58));
        linearLayout6.setLayoutParams(layoutParams10);
        linearLayout6.setOrientation(1);
        LinearLayout linearLayout7 = new LinearLayout(linearLayout6.getContext());
        linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout7.setOrientation(0);
        linearLayout7.setGravity(16);
        TextView textView5 = new TextView(linearLayout7.getContext());
        AbstractC0174d.m358n(-2, -2, textView5, "密友快捷显示");
        textView5.setTextColor(getTEXT_PRIMARY());
        textView5.setTypeface(typeface);
        textView5.setTextSize(1, 14.8f);
        linearLayout7.addView(textView5);
        linearLayout7.addView(m2188v());
        linearLayout6.addView(linearLayout7);
        TextView textView6 = new TextView(linearLayout6.getContext());
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams11.topMargin = AbstractC0055a.m101b(3);
        textView6.setLayoutParams(layoutParams11);
        textView6.setText(m2172I());
        textView6.setTextColor(getTEXT_SECONDARY());
        textView6.setTextSize(1, 11.5f);
        c0228l.f568a = textView6;
        linearLayout6.addView(textView6);
        linearLayout6.setOnClickListener(new ViewOnClickListenerC0837F1(this, c0228l, 7));
        frameLayout.addView(linearLayout6);
        Switch r1 = new Switch(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 8388629;
        r1.setLayoutParams(layoutParams12);
        OptionData optionData = this.f3494l;
        r1.setChecked(optionData.getCloseFriendQuickDisplay());
        m2180T(r1);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s0.A
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                AbstractC0223g.m418e(compoundButton, "<unused var>");
                C0976J c0976j = this;
                c0976j.f3494l.setCloseFriendQuickDisplay(z3);
                if (z3) {
                    c0976j.m2177P(new C0968B(4, c0228l, c0976j));
                }
            }
        });
        frameLayout.addView(r1);
        linearLayout5.addView(frameLayout);
        View view = new View(linearLayout5.getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1)));
        view.setBackgroundColor(getDIVIDER_COLOR());
        linearLayout5.addView(view);
        linearLayoutM2183q.addView(linearLayout5);
        LinearLayout linearLayout8 = new LinearLayout(getContext());
        linearLayout8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout8.setOrientation(1);
        linearLayout8.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(8), AbstractC0055a.m101b(10), AbstractC0055a.m101b(10));
        linearLayout8.setBackgroundColor(0);
        LinearLayout linearLayout9 = new LinearLayout(linearLayout8.getContext());
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout9.setGravity(16);
        linearLayout9.setOrientation(0);
        View viewM2184r3 = m2184r(m2158H("解除密码"), m2190y("解除密码"), AbstractC0055a.m101b(28));
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(AbstractC0055a.m101b(28), AbstractC0055a.m101b(28));
        layoutParams13.gravity = 48;
        layoutParams13.setMarginEnd(AbstractC0055a.m101b(12));
        viewM2184r3.setLayoutParams(layoutParams13);
        linearLayout9.addView(viewM2184r3);
        LinearLayout linearLayout10 = new LinearLayout(linearLayout9.getContext());
        linearLayout10.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout10.setOrientation(1);
        TextView textView7 = new TextView(linearLayout10.getContext());
        AbstractC0174d.m358n(-1, -2, textView7, "解除密码");
        textView7.setTextColor(getTEXT_PRIMARY());
        textView7.setTypeface(typeface);
        textView7.setTextSize(1, 14.8f);
        linearLayout10.addView(textView7);
        TextView textView8 = new TextView(linearLayout10.getContext());
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams14.topMargin = AbstractC0055a.m101b(3);
        textView8.setLayoutParams(layoutParams14);
        textView8.setText("为空时不验证密码，直接临时解除隐藏");
        textView8.setTextColor(getTEXT_SECONDARY());
        textView8.setTextSize(1, 11.5f);
        linearLayout10.addView(textView8);
        linearLayout9.addView(linearLayout10);
        linearLayout8.addView(linearLayout9);
        EditText editTextM2186t = m2186t(optionData.getTripleTapPassword());
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(38));
        layoutParams15.setMarginStart(AbstractC0055a.m101b(40));
        layoutParams15.topMargin = AbstractC0055a.m101b(10);
        editTextM2186t.setLayoutParams(layoutParams15);
        this.f3492j = editTextM2186t;
        editTextM2186t.setHint("留空直接解除");
        editTextM2186t.setInputType(1);
        linearLayout8.addView(editTextM2186t);
        linearLayoutM2183q.addView(linearLayout8);
        linearLayout.addView(linearLayoutM2183q);
        linearLayout.addView(m2187u("功能开关"));
        LinearLayout linearLayoutM2183q2 = m2183q();
        View viewM2185s = m2185s("快捷功能", "快捷加入名单、聊天页面输入框口令监听");
        viewM2185s.setOnClickListener(new ViewOnClickListenerC1000v(this, 4));
        linearLayoutM2183q2.addView(viewM2185s);
        View viewM2185s2 = m2185s("密友功能", "隐藏密友、通讯录、聊天记录、存储空间和语音/视频通话");
        viewM2185s2.setOnClickListener(new ViewOnClickListenerC1000v(this, 5));
        linearLayoutM2183q2.addView(viewM2185s2);
        View viewM2185s3 = m2185s("搜索隐藏", "主页搜索隐藏、单聊搜索隐藏");
        viewM2185s3.setOnClickListener(new ViewOnClickListenerC1000v(this, 6));
        linearLayoutM2183q2.addView(viewM2185s3);
        final FrameLayout frameLayoutM2185s = m2185s("朋友圈隐藏", "隐藏密友朋友圈、分组图标、点赞和评论");
        frameLayoutM2185s.setOnClickListener(new View.OnClickListener(this) { // from class: s0.w

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C0976J f3592c;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3592c = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        FrameLayout frameLayout2 = frameLayoutM2185s;
                        AlertDialog.Builder negativeButton = new AlertDialog.Builder(frameLayout2.getContext()).setTitle("警告").setMessage("该操作会清空所有配置数据").setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                        C0976J c0976j = this.f3592c;
                        AlertDialog alertDialogCreate = negativeButton.setPositiveButton("确定", new DialogInterfaceOnClickListenerC0802b(frameLayout2, c0976j, 4)).create();
                        AbstractC0223g.m417d(alertDialogCreate, "create(...)");
                        c0976j.m2174M(alertDialogCreate, false);
                        break;
                    default:
                        C0976J c0976j2 = this.f3592c;
                        c0976j2.m2176O("朋友圈隐藏", AbstractC0120h.m252Z(new C0973G[]{new C0973G("隐藏密友朋友圈", "隐藏密友发布的朋友圈内容", new C1002x(c0976j2, 21), null, new C1002x(c0976j2, 22)), new C0973G("隐藏朋友圈分组图标", "隐藏朋友圈中的分组/可见范围图标", new C1002x(c0976j2, 23), null, new C1002x(c0976j2, 24)), new C0973G("隐藏朋友圈点赞评论", "隐藏密友在朋友圈中的点赞和评论", new C1002x(c0976j2, 25), null, new C1002x(c0976j2, 26)), new C0973G("隐藏自己朋友圈内容", "打开后可在自己的朋友圈内容详情页长按隐藏", new C1002x(c0976j2, 27), null, new C0781b(c0976j2, frameLayoutM2185s, 7)), new C0973G("关闭长按隐藏提示", "关闭后，长按不再弹出隐藏此条朋友圈提示", new C1002x(c0976j2, 28), null, new C1002x(c0976j2, 29))}));
                        break;
                }
            }
        });
        linearLayoutM2183q2.addView(frameLayoutM2185s);
        View viewM2185s4 = m2185s("消息提醒", "隐藏消息角标、密友消息震动和顶部加粗");
        viewM2185s4.setOnClickListener(new ViewOnClickListenerC1000v(this, i3));
        linearLayoutM2183q2.addView(viewM2185s4);
        View viewM2185s5 = m2185s("实验室", "防撤回等实验性功能");
        viewM2185s5.setOnClickListener(new ViewOnClickListenerC1000v(this, i2));
        linearLayoutM2183q2.addView(viewM2185s5);
        linearLayout.addView(linearLayoutM2183q2);
        linearLayout.addView(m2187u("数据管理"));
        LinearLayout linearLayoutM2183q3 = m2183q();
        final FrameLayout frameLayoutM2185s2 = m2185s("清空配置数据", "清除全部配置并退出当前设置页");
        frameLayoutM2185s2.setOnClickListener(new View.OnClickListener(this) { // from class: s0.w

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C0976J f3592c;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3592c = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        FrameLayout frameLayout2 = frameLayoutM2185s2;
                        AlertDialog.Builder negativeButton = new AlertDialog.Builder(frameLayout2.getContext()).setTitle("警告").setMessage("该操作会清空所有配置数据").setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                        C0976J c0976j = this.f3592c;
                        AlertDialog alertDialogCreate = negativeButton.setPositiveButton("确定", new DialogInterfaceOnClickListenerC0802b(frameLayout2, c0976j, 4)).create();
                        AbstractC0223g.m417d(alertDialogCreate, "create(...)");
                        c0976j.m2174M(alertDialogCreate, false);
                        break;
                    default:
                        C0976J c0976j2 = this.f3592c;
                        c0976j2.m2176O("朋友圈隐藏", AbstractC0120h.m252Z(new C0973G[]{new C0973G("隐藏密友朋友圈", "隐藏密友发布的朋友圈内容", new C1002x(c0976j2, 21), null, new C1002x(c0976j2, 22)), new C0973G("隐藏朋友圈分组图标", "隐藏朋友圈中的分组/可见范围图标", new C1002x(c0976j2, 23), null, new C1002x(c0976j2, 24)), new C0973G("隐藏朋友圈点赞评论", "隐藏密友在朋友圈中的点赞和评论", new C1002x(c0976j2, 25), null, new C1002x(c0976j2, 26)), new C0973G("隐藏自己朋友圈内容", "打开后可在自己的朋友圈内容详情页长按隐藏", new C1002x(c0976j2, 27), null, new C0781b(c0976j2, frameLayoutM2185s2, 7)), new C0973G("关闭长按隐藏提示", "关闭后，长按不再弹出隐藏此条朋友圈提示", new C1002x(c0976j2, 28), null, new C1002x(c0976j2, 29))}));
                        break;
                }
            }
        });
        linearLayoutM2183q3.addView(frameLayoutM2185s2);
        linearLayout.addView(linearLayoutM2183q3);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getDIVIDER_COLOR() {
        return getThemePalette().f3506i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getFIELD_BG_COLOR() {
        return getThemePalette().f3502e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getHEADER_COLOR() {
        return getThemePalette().f3499b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final int getPAGE_BG_COLOR() {
        return getThemePalette().f3500c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getTEXT_PRIMARY() {
        return getThemePalette().f3503f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getTEXT_SECONDARY() {
        return getThemePalette().f3504g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int getTEXT_TERTIARY() {
        return getThemePalette().f3505h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String getThemeMode() {
        Context context = getContext();
        AbstractC0223g.m417d(context, "getContext(...)");
        String string = context.getSharedPreferences("mask_manager_ui_theme", 0).getString("theme_mode", "light");
        return string == null ? "light" : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C0977K getThemePalette() {
        Context context = getContext();
        AbstractC0223g.m417d(context, "getContext(...)");
        return AbstractC0503h.m974J(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final View getTitleBar() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, AbstractC0055a.m101b(48)));
        frameLayout.setBackgroundColor(getHEADER_COLOR());
        TextView textView = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC0055a.m101b(52), -1);
        layoutParams.gravity = 8388611;
        layoutParams.setMarginStart(AbstractC0055a.m101b(4));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextColor(getTEXT_PRIMARY());
        textView.setTextSize(1, 21.0f);
        textView.setText("‹");
        textView.setOnClickListener(new ViewOnClickListenerC1000v(this, 2));
        frameLayout.addView(textView);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        View viewM2184r = m2184r("✓", getACCENT_TEAL(), AbstractC0055a.m101b(18));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(AbstractC0055a.m101b(18), AbstractC0055a.m101b(18));
        layoutParams3.gravity = 16;
        layoutParams3.setMarginEnd(AbstractC0055a.m101b(6));
        viewM2184r.setLayoutParams(layoutParams3);
        linearLayout.addView(viewM2184r);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView2.setTextColor(getTEXT_PRIMARY());
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setTextSize(1, 18.5f);
        textView2.setText("InkHide");
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
        TextView textView3 = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(52), -1);
        layoutParams4.gravity = 8388613;
        layoutParams4.setMarginEnd(AbstractC0055a.m101b(4));
        textView3.setLayoutParams(layoutParams4);
        textView3.setGravity(17);
        textView3.setTextColor(getTEXT_PRIMARY());
        textView3.setTextSize(1, 19.0f);
        textView3.setText("⋮");
        textView3.setOnClickListener(new ViewOnClickListenerC0837F1(this, textView3, 6));
        frameLayout.addView(textView3);
        return frameLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m2162k(C0976J c0976j, AbstractC1008c abstractC1008c) {
        Window window;
        AbstractC0223g.m418e(abstractC1008c, "it");
        Activity activity = c0976j.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            if (c0976j.f3496n == null) {
                c0976j.f3496n = Integer.valueOf(window.getDecorView().getSystemUiVisibility());
            }
            if (c0976j.f3495m == null) {
                c0976j.f3495m = Integer.valueOf(window.getStatusBarColor());
            }
            boolean z2 = c0976j.getThemePalette().f3498a;
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(!z2 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            window.setStatusBarColor(c0976j.getHEADER_COLOR());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0371b(9, c0976j), 350L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m2163l(C0228l c0228l, C0976J c0976j) {
        Object obj = c0228l.f568a;
        if (obj == null) {
            AbstractC0223g.m420g("popupWindow");
            throw null;
        }
        ((PopupWindow) obj).dismiss();
        List<C0107g> listM252Z = AbstractC0120h.m252Z(new C0107g[]{new C0107g("浅色", "白底黑字，保持当前默认样式", "light"), new C0107g("深色", "深色背景，降低夜间使用亮度", "dark"), new C0107g("跟随系统", "根据手机系统深浅色自动切换", "system")});
        String themeMode = c0976j.getThemeMode();
        C0228l c0228l2 = new C0228l();
        LinearLayout linearLayout = new LinearLayout(c0976j.getContext());
        int i2 = -1;
        int i3 = -2;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i4 = 1;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(14));
        linearLayout.setBackground(m2160K(c0976j, c0976j.getCARD_COLOR(), AbstractC0055a.m101b(20), null, 8));
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i5 = 16;
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        View viewM2184r = c0976j.m2184r("◐", c0976j.getACCENT_PURPLE(), AbstractC0055a.m101b(34));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0055a.m101b(34), AbstractC0055a.m101b(34));
        layoutParams.setMarginEnd(AbstractC0055a.m101b(10));
        viewM2184r.setLayoutParams(layoutParams);
        linearLayout2.addView(viewM2184r);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.setOrientation(1);
        TextView textView = new TextView(linearLayout3.getContext());
        AbstractC0174d.m358n(-1, -2, textView, "界面主题");
        textView.setTextColor(c0976j.getTEXT_PRIMARY());
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 17.0f);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(linearLayout3.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText("只影响配置页面显示，不影响微信隐藏功能");
        textView2.setTextColor(c0976j.getTEXT_SECONDARY());
        textView2.setTextSize(1, 11.5f);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams3.topMargin = AbstractC0055a.m101b(14);
        layoutParams3.bottomMargin = AbstractC0055a.m101b(10);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(c0976j.getDIVIDER_COLOR());
        linearLayout.addView(view);
        for (C0107g c0107g : listM252Z) {
            String str = (String) c0107g.f400a;
            String str2 = c0107g.f401b;
            String str3 = c0107g.f402c;
            boolean zEquals = str.equals(themeMode);
            int i6 = i4;
            LinearLayout linearLayout4 = new LinearLayout(linearLayout.getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i2, i3);
            layoutParams4.bottomMargin = AbstractC0055a.m101b(8);
            linearLayout4.setLayoutParams(layoutParams4);
            linearLayout4.setGravity(i5);
            linearLayout4.setOrientation(0);
            linearLayout4.setPadding(AbstractC0055a.m101b(12), AbstractC0055a.m101b(10), AbstractC0055a.m101b(12), AbstractC0055a.m101b(10));
            linearLayout4.setBackground(zEquals ? m2159J(m2161S(c0976j.getACCENT_PURPLE()), AbstractC0055a.m101b(14), Integer.valueOf(c0976j.getACCENT_PURPLE()), AbstractC0055a.m101b(i6)) : m2159J(c0976j.getFIELD_BG_COLOR(), AbstractC0055a.m101b(14), Integer.valueOf(c0976j.getDIVIDER_COLOR()), AbstractC0055a.m101b(i6)));
            View viewM2184r2 = c0976j.m2184r(zEquals ? "✓" : "◐", zEquals ? c0976j.getACCENT_PURPLE() : c0976j.getTEXT_TERTIARY(), AbstractC0055a.m101b(26));
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(AbstractC0055a.m101b(26), AbstractC0055a.m101b(26));
            layoutParams5.setMarginEnd(AbstractC0055a.m101b(10));
            viewM2184r2.setLayoutParams(layoutParams5);
            linearLayout4.addView(viewM2184r2);
            LinearLayout linearLayout5 = new LinearLayout(linearLayout4.getContext());
            linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout5.setOrientation(i6);
            TextView textView3 = new TextView(linearLayout5.getContext());
            AbstractC0174d.m358n(-1, -2, textView3, str2);
            textView3.setTextColor(zEquals ? c0976j.getACCENT_PURPLE() : c0976j.getTEXT_PRIMARY());
            textView3.setTypeface(Typeface.DEFAULT_BOLD);
            textView3.setTextSize(1, 14.2f);
            linearLayout5.addView(textView3);
            TextView textView4 = new TextView(linearLayout5.getContext());
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.topMargin = AbstractC0055a.m101b(3);
            textView4.setLayoutParams(layoutParams6);
            textView4.setText(str3);
            textView4.setTextColor(c0976j.getTEXT_SECONDARY());
            textView4.setTextSize(1, 10.8f);
            linearLayout5.addView(textView4);
            linearLayout4.addView(linearLayout5);
            linearLayout4.setOnClickListener(new ViewOnClickListenerC0853L(str, themeMode, c0976j, c0228l2));
            linearLayout.addView(linearLayout4);
            i3 = -2;
            i4 = 1;
            i2 = -1;
            i5 = 16;
        }
        TextView textView5 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(40));
        layoutParams7.topMargin = AbstractC0055a.m101b(2);
        textView5.setLayoutParams(layoutParams7);
        textView5.setGravity(17);
        textView5.setText("取消");
        textView5.setTextColor(c0976j.getTEXT_SECONDARY());
        textView5.setTypeface(Typeface.DEFAULT_BOLD);
        textView5.setTextSize(1, 13.5f);
        textView5.setBackground(m2159J(c0976j.getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(c0976j.getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        textView5.setOnClickListener(new ViewOnClickListenerC0999u(c0228l2, 4));
        linearLayout.addView(textView5);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(c0976j.getContext()).setView(linearLayout).create();
        c0228l2.f568a = alertDialogCreate;
        if (alertDialogCreate == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        alertDialogCreate.setOnShowListener(new DialogInterfaceOnShowListenerC0996r(c0228l2, 5));
        Object obj2 = c0228l2.f568a;
        if (obj2 == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        c0976j.m2174M((AlertDialog) obj2, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m2164m(String str, String str2, C0976J c0976j, C0228l c0228l) {
        if (!str.equals(str2)) {
            c0976j.setThemeMode(str);
            AbstractC0503h.m978P("已切换为" + (str.equals("dark") ? "深色" : str.equals("system") ? "跟随系统" : "浅色") + "主题，重新打开配置页后生效");
        }
        Object obj = c0228l.f568a;
        if (obj != null) {
            ((AlertDialog) obj).dismiss();
        } else {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m2165n(boolean z2, C0976J c0976j, C1119b c1119b) {
        if (z2) {
            c0976j.getContext().getSharedPreferences("app", 0).edit().putBoolean(c0976j.f3490h, true).apply();
        }
        boolean z3 = c1119b.f3767a;
        String str = z3 ? "软件公告" : "服务提示";
        String strConcat = c1119b.f3768b;
        if (z3) {
            Throwable th = c1119b.f3778l;
            if (th != null && c1119b.f3777k) {
                c0976j.getClass();
                if (AbstractC0307q.m534d0(strConcat)) {
                    strConcat = "暂无公告";
                }
                strConcat = "网络请求失败，已使用本地缓存。\n\n".concat(strConcat);
            } else if (th != null) {
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getSimpleName();
                }
                strConcat = "软件公告获取失败：".concat(message);
            } else {
                c0976j.getClass();
                if (AbstractC0307q.m534d0(strConcat)) {
                    strConcat = "暂无公告";
                }
            }
        } else if (AbstractC0307q.m534d0(strConcat)) {
            strConcat = "服务暂不可用";
        }
        c0976j.getClass();
        C0228l c0228l = new C0228l();
        LinearLayout linearLayout = new LinearLayout(c0976j.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(14));
        linearLayout.setBackground(m2160K(c0976j, c0976j.getCARD_COLOR(), AbstractC0055a.m101b(20), null, 8));
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        View viewM2184r = c0976j.m2184r("告", c0976j.getACCENT_BLUE(), AbstractC0055a.m101b(34));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0055a.m101b(34), AbstractC0055a.m101b(34));
        layoutParams.setMarginEnd(AbstractC0055a.m101b(10));
        viewM2184r.setLayoutParams(layoutParams);
        linearLayout2.addView(viewM2184r);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.setOrientation(1);
        TextView textView = new TextView(linearLayout3.getContext());
        AbstractC0174d.m358n(-1, -2, textView, str);
        textView.setTextColor(c0976j.getTEXT_PRIMARY());
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setTextSize(1, 17.0f);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(linearLayout3.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText("后台公告内容，可复制文字，链接可直接打开");
        textView2.setTextColor(c0976j.getTEXT_SECONDARY());
        textView2.setTextSize(1, 11.5f);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams3.topMargin = AbstractC0055a.m101b(14);
        layoutParams3.bottomMargin = AbstractC0055a.m101b(10);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(c0976j.getDIVIDER_COLOR());
        linearLayout.addView(view);
        View viewM2170F = c0976j.m2170F(strConcat);
        viewM2170F.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        viewM2170F.setBackground(m2159J(c0976j.getFIELD_BG_COLOR(), AbstractC0055a.m101b(14), Integer.valueOf(c0976j.getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        linearLayout.addView(viewM2170F);
        TextView textView3 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(42));
        layoutParams4.topMargin = AbstractC0055a.m101b(12);
        textView3.setLayoutParams(layoutParams4);
        textView3.setGravity(17);
        textView3.setText("我知道了");
        textView3.setTextColor(-1);
        textView3.setTypeface(typeface);
        textView3.setTextSize(1, 14.0f);
        textView3.setBackground(m2160K(c0976j, c0976j.getACCENT_TEAL(), AbstractC0055a.m101b(12), null, 8));
        textView3.setOnClickListener(new ViewOnClickListenerC0999u(c0228l, 0));
        linearLayout.addView(textView3);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(c0976j.getContext()).setView(linearLayout).create();
        c0228l.f568a = alertDialogCreate;
        if (alertDialogCreate == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        alertDialogCreate.setCancelable(false);
        Object obj = c0228l.f568a;
        if (obj == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        ((AlertDialog) obj).setCanceledOnTouchOutside(false);
        Object obj2 = c0228l.f568a;
        if (obj2 == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        ((AlertDialog) obj2).setOnShowListener(new DialogInterfaceOnShowListenerC0996r(c0228l, 1));
        Object obj3 = c0228l.f568a;
        if (obj3 != null) {
            c0976j.m2174M((AlertDialog) obj3, true);
        } else {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m2166o(C0976J c0976j, C1119b c1119b) {
        AbstractC0223g.m418e(c1119b, "result");
        if (!c1119b.f3767a) {
            String str = c1119b.f3768b;
            if (AbstractC0307q.m534d0(str)) {
                str = "服务暂不可用";
            }
            c0976j.m2179R("服务提示", "后台服务状态提醒", str, "!", c0976j.getACCENT_ORANGE(), "确定", null, true, null);
            return;
        }
        if (!c1119b.m2400b()) {
            AbstractC0503h.m978P(c1119b.f3778l == null ? "未检查到新版本" : "检查更新失败");
            return;
        }
        boolean z2 = c1119b.f3773g;
        String str2 = z2 ? "检测到必须更新的新版本" : "检测到可用的新版本";
        StringBuilder sb = new StringBuilder("检查到新版本：");
        String strValueOf = c1119b.f3772f;
        if (AbstractC0307q.m534d0(strValueOf)) {
            strValueOf = String.valueOf(c1119b.f3771e);
        }
        sb.append(strValueOf);
        sb.append("，是否更新？");
        String str3 = c1119b.f3774h;
        if (!AbstractC0307q.m534d0(str3)) {
            sb.append("\n\n");
            sb.append(str3);
        }
        String string = sb.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        c0976j.m2179R("更新提示", str2, string, "↑", c0976j.getACCENT_TEAL(), "立即更新", z2 ? null : "稍后再说", !z2, new C0781b(c0976j, c1119b, 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m2167p(C0976J c0976j, TextView textView) {
        int iM101b = AbstractC0055a.m101b(190);
        C0228l c0228l = new C0228l();
        LinearLayout linearLayout = new LinearLayout(c0976j.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(iM101b, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(8), AbstractC0055a.m101b(8), AbstractC0055a.m101b(8), AbstractC0055a.m101b(8));
        linearLayout.setBackground(m2159J(c0976j.getCARD_COLOR(), AbstractC0055a.m101b(16), Integer.valueOf(c0976j.getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        linearLayout.setElevation(AbstractC0055a.m100a(6.0f));
        linearLayout.addView(c0976j.m2189x("软件公告", "查看后台公告内容", "告", c0976j.getACCENT_BLUE(), new C0968B(0, c0228l, c0976j)));
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams.leftMargin = AbstractC0055a.m101b(6);
        layoutParams.rightMargin = AbstractC0055a.m101b(6);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(c0976j.getDIVIDER_COLOR());
        linearLayout.addView(view);
        linearLayout.addView(c0976j.m2189x("检查更新", "检测是否有新版本", "↑", c0976j.getACCENT_TEAL(), new C0968B(1, c0228l, c0976j)));
        View view2 = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams2.leftMargin = AbstractC0055a.m101b(6);
        layoutParams2.rightMargin = AbstractC0055a.m101b(6);
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(c0976j.getDIVIDER_COLOR());
        linearLayout.addView(view2);
        String themeMode = c0976j.getThemeMode();
        AbstractC0223g.m418e(themeMode, "mode");
        linearLayout.addView(c0976j.m2189x("界面主题", "当前：".concat(themeMode.equals("dark") ? "深色" : themeMode.equals("system") ? "跟随系统" : "浅色"), "◐", c0976j.getACCENT_PURPLE(), new C0968B(2, c0228l, c0976j)));
        PopupWindow popupWindow = new PopupWindow((View) linearLayout, iM101b, -2, true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setElevation(AbstractC0055a.m100a(6.0f));
        c0228l.f568a = popupWindow;
        popupWindow.showAsDropDown(textView, (textView.getWidth() - iM101b) - AbstractC0055a.m101b(6), -AbstractC0055a.m101b(2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setThemeMode(String str) {
        Context context = getContext();
        AbstractC0223g.m417d(context, "getContext(...)");
        AbstractC0223g.m418e(str, "mode");
        context.getSharedPreferences("mask_manager_ui_theme", 0).edit().putString("theme_mode", str).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static LinearLayout m2168w(C0976J c0976j, String str, String str2, boolean z2, InterfaceC0193a interfaceC0193a, final C0060d c0060d) {
        c0976j.getClass();
        String strM2158H = m2158H(str);
        int iM2190y = c0976j.m2190y(str);
        c0976j.getClass();
        LinearLayout linearLayout = new LinearLayout(c0976j.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(AbstractC0055a.m101b(58));
        frameLayout.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(8), AbstractC0055a.m101b(10), AbstractC0055a.m101b(8));
        View viewM2184r = c0976j.m2184r(strM2158H, iM2190y, AbstractC0055a.m101b(28));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC0055a.m101b(28), AbstractC0055a.m101b(28));
        layoutParams.gravity = 8388627;
        viewM2184r.setLayoutParams(layoutParams);
        frameLayout.addView(viewM2184r);
        LinearLayout linearLayout2 = new LinearLayout(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 16;
        layoutParams2.setMarginStart(AbstractC0055a.m101b(40));
        layoutParams2.setMarginEnd(AbstractC0055a.m101b(58));
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setOrientation(1);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        TextView textView = new TextView(linearLayout3.getContext());
        AbstractC0174d.m358n(-2, -2, textView, str);
        textView.setTextColor(c0976j.getTEXT_PRIMARY());
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 14.8f);
        linearLayout3.addView(textView);
        if (interfaceC0193a != null) {
            linearLayout3.addView(c0976j.m2188v());
        }
        linearLayout2.addView(linearLayout3);
        TextView textView2 = new TextView(linearLayout2.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = AbstractC0055a.m101b(3);
        textView2.setLayoutParams(layoutParams3);
        textView2.setText(str2);
        textView2.setTextColor(c0976j.getTEXT_SECONDARY());
        textView2.setTextSize(1, 11.5f);
        linearLayout2.addView(textView2);
        frameLayout.addView(linearLayout2);
        Switch r1 = new Switch(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388629;
        r1.setLayoutParams(layoutParams4);
        r1.setChecked(z2);
        c0976j.m2180T(r1);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s0.s
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) throws JSONException {
                AbstractC0223g.m418e(compoundButton, "<unused var>");
                c0060d.mo8c(Boolean.valueOf(z3));
            }
        });
        frameLayout.addView(r1);
        if (interfaceC0193a != null) {
            frameLayout.setOnClickListener(new ViewOnClickListenerC0998t(interfaceC0193a, 0));
        }
        linearLayout.addView(frameLayout);
        View view = new View(linearLayout.getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1)));
        view.setBackgroundColor(c0976j.getDIVIDER_COLOR());
        linearLayout.addView(view);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LinearLayout m2169z(C0976J c0976j, String str) {
        String str2;
        List<String> listM252Z;
        String str3 = str;
        c0976j.getClass();
        LinearLayout linearLayout = new LinearLayout(c0976j.getContext());
        switch (str3.hashCode()) {
            case -746556377:
                str2 = str3.equals("朋友圈隐藏") ? "隐藏密友朋友圈、自己指定朋友圈内容、分组图标、点赞和评论痕迹。" : "管理当前分组下的功能开关。";
                break;
            case 721212867:
                if (str3.equals("密友功能")) {
                    str2 = "控制密友在会话、通讯录、聊天记录、存储空间和通话提醒中的显示。";
                    break;
                }
                break;
            case 756676650:
                if (str3.equals("快捷功能")) {
                    str2 = "统一管理快捷加入名单和聊天页口令监听。";
                    break;
                }
                break;
            case 795497541:
                if (str3.equals("搜索隐藏")) {
                    str2 = "控制密友在主页搜索和单聊搜索中的搜索结果。";
                    break;
                }
                break;
            case 859893225:
                if (str3.equals("消息提醒")) {
                    str2 = "控制头像角标、顶部消息数量、震动和顶部加粗提醒。";
                    break;
                }
                break;
        }
        switch (str3.hashCode()) {
            case -746556377:
                listM252Z = str3.equals("朋友圈隐藏") ? AbstractC0120h.m252Z(new String[]{"内容", "分组", "互动"}) : AbstractC0079h.m167E("开关");
                break;
            case 721212867:
                if (str3.equals("密友功能")) {
                    listM252Z = AbstractC0120h.m252Z(new String[]{"会话", "通讯录", "聊天记录"});
                    break;
                }
                break;
            case 756676650:
                if (str3.equals("快捷功能")) {
                    listM252Z = AbstractC0120h.m252Z(new String[]{"菜单", "口令"});
                    break;
                }
                break;
            case 795497541:
                if (str3.equals("搜索隐藏")) {
                    listM252Z = AbstractC0120h.m252Z(new String[]{"主页搜索", "单聊搜索"});
                    break;
                }
                break;
            case 859893225:
                if (str3.equals("消息提醒")) {
                    listM252Z = AbstractC0120h.m252Z(new String[]{"角标", "震动", "加粗"});
                    break;
                }
                break;
        }
        int iM2190y = c0976j.m2190y(str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = AbstractC0055a.m101b(12);
        layoutParams.rightMargin = AbstractC0055a.m101b(12);
        layoutParams.bottomMargin = AbstractC0055a.m101b(14);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(12), AbstractC0055a.m101b(10), AbstractC0055a.m101b(12));
        linearLayout.setBackground(m2160K(c0976j, c0976j.getCARD_COLOR(), 0, null, 14));
        linearLayout.setElevation(AbstractC0055a.m100a(0.5f));
        View viewM2184r = c0976j.m2184r(m2158H(str3), iM2190y, AbstractC0055a.m101b(27));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC0055a.m101b(27), AbstractC0055a.m101b(27));
        layoutParams2.gravity = 48;
        layoutParams2.setMarginEnd(AbstractC0055a.m101b(10));
        viewM2184r.setLayoutParams(layoutParams2);
        linearLayout.addView(viewM2184r);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(linearLayout2.getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int iHashCode = str3.hashCode();
        if (iHashCode != -746556377) {
            if (iHashCode != 721212867) {
                if (iHashCode == 859893225 && str3.equals("消息提醒")) {
                    str3 = "提醒痕迹控制";
                }
            } else if (str3.equals("密友功能")) {
                str3 = "密友核心隐藏";
            }
        } else if (str3.equals("朋友圈隐藏")) {
            str3 = "朋友圈内容保护";
        }
        textView.setText(str3);
        textView.setTextColor(c0976j.getTEXT_PRIMARY());
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 15.5f);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(linearLayout2.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams3);
        textView2.setText(str2);
        textView2.setTextColor(c0976j.getTEXT_SECONDARY());
        textView2.setTextSize(1, 10.8f);
        linearLayout2.addView(textView2);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = AbstractC0055a.m101b(8);
        linearLayout3.setLayoutParams(layoutParams4);
        linearLayout3.setOrientation(0);
        for (String str4 : listM252Z) {
            TextView textView3 = new TextView(linearLayout3.getContext());
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, AbstractC0055a.m101b(22));
            layoutParams5.setMarginEnd(AbstractC0055a.m101b(6));
            textView3.setLayoutParams(layoutParams5);
            textView3.setGravity(17);
            textView3.setPadding(AbstractC0055a.m101b(8), 0, AbstractC0055a.m101b(8), 0);
            textView3.setText(str4);
            textView3.setTextColor(iM2190y);
            textView3.setTypeface(Typeface.DEFAULT_BOLD);
            textView3.setTextSize(1, 10.0f);
            textView3.setBackground(m2160K(c0976j, m2161S(iM2190y), AbstractC0055a.m101b(11), null, 8));
            linearLayout3.addView(textView3);
        }
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final ScrollView m2170F(String str) {
        SpannableString spannableString = new SpannableString(str);
        Linkify.addLinks(spannableString, 1);
        Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        AbstractC0223g.m417d(spans, "getSpans(...)");
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            int spanFlags = spannableString.getSpanFlags(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            String url = uRLSpan.getURL();
            AbstractC0223g.m417d(url, "getURL(...)");
            if (!AbstractC0307q.m538h0(url, true, "http://") && !AbstractC0307q.m538h0(url, true, "https://")) {
                url = "https://".concat(url);
            }
            spannableString.setSpan(new C0974H(this, url), spanStart, spanEnd, spanFlags);
        }
        ScrollView scrollView = new ScrollView(getContext());
        TextView textView = new TextView(scrollView.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setPadding(AbstractC0055a.m101b(24), AbstractC0055a.m101b(8), AbstractC0055a.m101b(24), 0);
        textView.setTextColor(getTEXT_PRIMARY());
        textView.setTextSize(1, 13.0f);
        textView.setText(spannableString);
        textView.setTextIsSelectable(true);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        scrollView.addView(textView);
        return scrollView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m2171G() {
        Window window;
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            Integer num = this.f3496n;
            Integer num2 = this.f3495m;
            if (num != null) {
                window.getDecorView().setSystemUiVisibility(num.intValue());
            }
            if (num2 != null) {
                window.setStatusBarColor(num2.intValue());
            }
            window.getDecorView().post(new RunnableC0045r(num, window, num2, 15));
            this.f3496n = null;
            this.f3495m = null;
        }
        super.mo2182a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final String m2172I() {
        OptionData optionData = this.f3494l;
        return "开启后点击顶部微信或长按快速显示隐藏密友，当前 " + AbstractC0079h.m183g(optionData.getQuickDisplayClickCount(), 2, 8) + " 次，长按 " + AbstractC0079h.m183g(optionData.getQuickDisplayLongPressMs(), 200, 3000) + "ms";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m2173L() {
        EditText editText = new EditText(getContext());
        editText.setInputType(2);
        editText.setSingleLine(true);
        OptionData optionData = this.f3494l;
        editText.setText(String.valueOf(AbstractC0079h.m183g(optionData.getChatHistoryQuickUnhideClickCount(), 2, 8)));
        editText.setSelectAllOnFocus(true);
        editText.setPadding(AbstractC0055a.m101b(14), AbstractC0055a.m101b(6), AbstractC0055a.m101b(14), AbstractC0055a.m101b(6));
        editText.setTextColor(getTEXT_PRIMARY());
        editText.setTextSize(1, 18.0f);
        editText.setGravity(17);
        editText.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        EditText editText2 = new EditText(getContext());
        editText2.setInputType(2);
        editText2.setSingleLine(true);
        editText2.setText(String.valueOf(AbstractC0079h.m183g(optionData.getChatHistoryQuickUnhideDurationMs(), 300, 5000)));
        editText2.setSelectAllOnFocus(true);
        editText2.setPadding(AbstractC0055a.m101b(14), AbstractC0055a.m101b(6), AbstractC0055a.m101b(14), AbstractC0055a.m101b(6));
        editText2.setTextColor(getTEXT_PRIMARY());
        editText2.setTextSize(1, 18.0f);
        editText2.setGravity(17);
        editText2.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        C0228l c0228l = new C0228l();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(14));
        linearLayout.setBackground(m2160K(this, getCARD_COLOR(), AbstractC0055a.m101b(20), null, 8));
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        View viewM2184r = m2184r("□", getACCENT_PURPLE(), AbstractC0055a.m101b(34));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0055a.m101b(34), AbstractC0055a.m101b(34));
        layoutParams.setMarginEnd(AbstractC0055a.m101b(10));
        viewM2184r.setLayoutParams(layoutParams);
        linearLayout2.addView(viewM2184r);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.setOrientation(1);
        TextView textView = new TextView(linearLayout3.getContext());
        AbstractC0174d.m358n(-1, -2, textView, "聊天记录快速解除");
        textView.setTextColor(getTEXT_PRIMARY());
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setTextSize(1, 17.0f);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(linearLayout3.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText("设置点击聊天页面解除隐藏聊天记录的次数和时间窗口");
        textView2.setTextColor(getTEXT_SECONDARY());
        textView2.setTextSize(1, 11.5f);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams3.topMargin = AbstractC0055a.m101b(14);
        layoutParams3.bottomMargin = AbstractC0055a.m101b(12);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(getDIVIDER_COLOR());
        linearLayout.addView(view);
        TextView textView3 = new TextView(linearLayout.getContext());
        AbstractC0174d.m358n(-1, -2, textView3, "快速解除点击次数（2-8 次）");
        textView3.setTextColor(getTEXT_SECONDARY());
        textView3.setTextSize(1, 12.0f);
        linearLayout.addView(textView3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(46));
        layoutParams4.topMargin = AbstractC0055a.m101b(8);
        editText.setLayoutParams(layoutParams4);
        linearLayout.addView(editText);
        TextView textView4 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = AbstractC0055a.m101b(12);
        textView4.setLayoutParams(layoutParams5);
        textView4.setText("点击时间窗口（300-5000ms）");
        textView4.setTextColor(getTEXT_SECONDARY());
        textView4.setTextSize(1, 12.0f);
        linearLayout.addView(textView4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(46));
        layoutParams6.topMargin = AbstractC0055a.m101b(8);
        editText2.setLayoutParams(layoutParams6);
        linearLayout.addView(editText2);
        LinearLayout linearLayout4 = new LinearLayout(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.topMargin = AbstractC0055a.m101b(14);
        linearLayout4.setLayoutParams(layoutParams7);
        linearLayout4.setOrientation(0);
        TextView textView5 = new TextView(linearLayout4.getContext());
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, AbstractC0055a.m101b(42), 1.0f);
        layoutParams8.setMarginEnd(AbstractC0055a.m101b(6));
        textView5.setLayoutParams(layoutParams8);
        textView5.setGravity(17);
        textView5.setText("取消");
        textView5.setTextColor(getTEXT_SECONDARY());
        textView5.setTypeface(typeface);
        textView5.setTextSize(1, 14.0f);
        textView5.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        textView5.setOnClickListener(new ViewOnClickListenerC0999u(c0228l, 1));
        linearLayout4.addView(textView5);
        TextView textView6 = new TextView(linearLayout4.getContext());
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, AbstractC0055a.m101b(42), 1.0f);
        layoutParams9.setMarginStart(AbstractC0055a.m101b(6));
        textView6.setLayoutParams(layoutParams9);
        textView6.setGravity(17);
        textView6.setText("保存");
        textView6.setTextColor(-1);
        textView6.setTypeface(typeface);
        textView6.setTextSize(1, 14.0f);
        textView6.setBackground(m2160K(this, getACCENT_TEAL(), AbstractC0055a.m101b(12), null, 8));
        textView6.setOnClickListener(new ViewOnClickListenerC0969C(editText, editText2, this, c0228l, 0));
        linearLayout4.addView(textView6);
        linearLayout.addView(linearLayout4);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setView(linearLayout).create();
        c0228l.f568a = alertDialogCreate;
        if (alertDialogCreate == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        alertDialogCreate.setOnShowListener(new DialogInterfaceOnShowListenerC0996r(c0228l, 2));
        Object obj = c0228l.f568a;
        if (obj != null) {
            m2174M((AlertDialog) obj, true);
        } else {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final void m2174M(AlertDialog alertDialog, boolean z2) {
        Window window;
        alertDialog.show();
        if (z2 && (window = alertDialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        boolean z3 = AbstractC1126i.f3786a;
        if (C1124g.m2446v()) {
            return;
        }
        int iM101b = getResources().getDisplayMetrics().widthPixels - AbstractC0055a.m101b(64);
        int iM101b2 = AbstractC0055a.m101b(260);
        if (iM101b < iM101b2) {
            iM101b = iM101b2;
        }
        int iM101b3 = iM101b - AbstractC0055a.m101b(32);
        int iM101b4 = AbstractC0055a.m101b(240);
        if (iM101b3 < iM101b4) {
            iM101b3 = iM101b4;
        }
        Window window2 = alertDialog.getWindow();
        if (window2 != null) {
            window2.setLayout(iM101b3, -2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final void m2175N() {
        int i2 = 0;
        int i3 = 1;
        List<C0107g> listM252Z = AbstractC0120h.m252Z(new C0107g[]{new C0107g("轻微", "很短的轻触提醒，适合安静环境", 0), new C0107g("默认", "单次标准震动，保持当前默认手感", 1), new C0107g("强烈", "双段较明显震动，更容易感知", 2), new C0107g("连续", "三段连续震动，提醒最明显", 3)});
        int iM183g = AbstractC0079h.m183g(this.f3494l.getHiddenMessageVibrateMode(), 0, 3);
        final C0228l c0228l = new C0228l();
        LinearLayout linearLayout = new LinearLayout(getContext());
        int i4 = -1;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(14));
        linearLayout.setBackground(m2160K(this, getCARD_COLOR(), AbstractC0055a.m101b(20), null, 8));
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i5 = 16;
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        View viewM2184r = m2184r("≈", getACCENT_TEAL(), AbstractC0055a.m101b(34));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0055a.m101b(34), AbstractC0055a.m101b(34));
        layoutParams.setMarginEnd(AbstractC0055a.m101b(10));
        viewM2184r.setLayoutParams(layoutParams);
        linearLayout2.addView(viewM2184r);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.setOrientation(1);
        TextView textView = new TextView(linearLayout3.getContext());
        AbstractC0174d.m358n(-1, -2, textView, "密友消息震动");
        textView.setTextColor(getTEXT_PRIMARY());
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 17.0f);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(linearLayout3.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText("选择隐藏密友来消息时的震动提醒方式");
        textView2.setTextColor(getTEXT_SECONDARY());
        textView2.setTextSize(1, 11.5f);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams3.topMargin = AbstractC0055a.m101b(14);
        layoutParams3.bottomMargin = AbstractC0055a.m101b(10);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(getDIVIDER_COLOR());
        linearLayout.addView(view);
        for (C0107g c0107g : listM252Z) {
            final int iIntValue = ((Number) c0107g.f400a).intValue();
            String str = c0107g.f401b;
            String str2 = c0107g.f402c;
            int i6 = iIntValue == iM183g ? i3 : i2;
            int i7 = i3;
            LinearLayout linearLayout4 = new LinearLayout(linearLayout.getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i4, -2);
            layoutParams4.bottomMargin = AbstractC0055a.m101b(8);
            linearLayout4.setLayoutParams(layoutParams4);
            linearLayout4.setGravity(i5);
            linearLayout4.setOrientation(i2);
            linearLayout4.setPadding(AbstractC0055a.m101b(12), AbstractC0055a.m101b(10), AbstractC0055a.m101b(12), AbstractC0055a.m101b(10));
            linearLayout4.setBackground(i6 != 0 ? m2159J(m2161S(getACCENT_TEAL()), AbstractC0055a.m101b(14), Integer.valueOf(getACCENT_TEAL()), AbstractC0055a.m101b(i7)) : m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(14), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(i7)));
            View viewM2184r2 = m2184r(i6 != 0 ? "✓" : "≈", i6 != 0 ? getACCENT_TEAL() : getTEXT_TERTIARY(), AbstractC0055a.m101b(26));
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(AbstractC0055a.m101b(26), AbstractC0055a.m101b(26));
            layoutParams5.setMarginEnd(AbstractC0055a.m101b(10));
            viewM2184r2.setLayoutParams(layoutParams5);
            linearLayout4.addView(viewM2184r2);
            LinearLayout linearLayout5 = new LinearLayout(linearLayout4.getContext());
            linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout5.setOrientation(i7);
            TextView textView3 = new TextView(linearLayout5.getContext());
            AbstractC0174d.m358n(-1, -2, textView3, str);
            textView3.setTextColor(i6 != 0 ? getACCENT_TEAL() : getTEXT_PRIMARY());
            textView3.setTypeface(Typeface.DEFAULT_BOLD);
            textView3.setTextSize(1, 14.2f);
            linearLayout5.addView(textView3);
            TextView textView4 = new TextView(linearLayout5.getContext());
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.topMargin = AbstractC0055a.m101b(3);
            textView4.setLayoutParams(layoutParams6);
            textView4.setText(str2);
            textView4.setTextColor(getTEXT_SECONDARY());
            textView4.setTextSize(1, 10.8f);
            linearLayout5.addView(textView4);
            linearLayout4.addView(linearLayout5);
            linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: s0.D
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C0976J c0976j = this;
                    int hiddenMessageVibrateMode = c0976j.f3494l.getHiddenMessageVibrateMode();
                    int i8 = iIntValue;
                    if (hiddenMessageVibrateMode != i8) {
                        OptionData optionData = c0976j.f3494l;
                        optionData.setHiddenMessageVibrateMode(i8);
                        boolean z2 = AbstractC1126i.f3786a;
                        C1124g.m2424O(optionData);
                        int iM183g2 = AbstractC0079h.m183g(i8, 0, 3);
                        AbstractC0503h.m978P("已保存震动方案：".concat(iM183g2 != 0 ? iM183g2 != 2 ? iM183g2 != 3 ? "默认" : "连续" : "强烈" : "轻微"));
                    }
                    Object obj = c0228l.f568a;
                    if (obj != null) {
                        ((AlertDialog) obj).dismiss();
                    } else {
                        AbstractC0223g.m420g("dialog");
                        throw null;
                    }
                }
            });
            linearLayout.addView(linearLayout4);
            i2 = 0;
            i3 = 1;
            i4 = -1;
            i5 = 16;
        }
        TextView textView5 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(40));
        layoutParams7.topMargin = AbstractC0055a.m101b(2);
        textView5.setLayoutParams(layoutParams7);
        textView5.setGravity(17);
        textView5.setText("取消");
        textView5.setTextColor(getTEXT_SECONDARY());
        textView5.setTypeface(Typeface.DEFAULT_BOLD);
        textView5.setTextSize(1, 13.5f);
        textView5.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        textView5.setOnClickListener(new ViewOnClickListenerC0999u(c0228l, 2));
        linearLayout.addView(textView5);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setView(linearLayout).create();
        c0228l.f568a = alertDialogCreate;
        if (alertDialogCreate == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        alertDialogCreate.setOnShowListener(new DialogInterfaceOnShowListenerC0996r(c0228l, 3));
        Object obj = c0228l.f568a;
        if (obj == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        m2174M((AlertDialog) obj, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final void m2176O(String str, List list) {
        new C0975I(this, str, list, getContext()).m2209g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m2177P(final InterfaceC0193a interfaceC0193a) {
        final EditText editText = new EditText(getContext());
        editText.setInputType(2);
        editText.setSingleLine(true);
        OptionData optionData = this.f3494l;
        editText.setText(String.valueOf(AbstractC0079h.m183g(optionData.getQuickDisplayClickCount(), 2, 8)));
        editText.setSelectAllOnFocus(true);
        editText.setPadding(AbstractC0055a.m101b(14), AbstractC0055a.m101b(6), AbstractC0055a.m101b(14), AbstractC0055a.m101b(6));
        editText.setTextColor(getTEXT_PRIMARY());
        editText.setTextSize(1, 18.0f);
        editText.setGravity(17);
        editText.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        final EditText editText2 = new EditText(getContext());
        editText2.setInputType(2);
        editText2.setSingleLine(true);
        editText2.setText(String.valueOf(AbstractC0079h.m183g(optionData.getQuickDisplayLongPressMs(), 200, 3000)));
        editText2.setSelectAllOnFocus(true);
        editText2.setPadding(AbstractC0055a.m101b(14), AbstractC0055a.m101b(6), AbstractC0055a.m101b(14), AbstractC0055a.m101b(6));
        editText2.setTextColor(getTEXT_PRIMARY());
        editText2.setTextSize(1, 18.0f);
        editText2.setGravity(17);
        editText2.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        final C0228l c0228l = new C0228l();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(14));
        linearLayout.setBackground(m2160K(this, getCARD_COLOR(), AbstractC0055a.m101b(20), null, 8));
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        View viewM2184r = m2184r("⚡", getACCENT_ORANGE(), AbstractC0055a.m101b(34));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0055a.m101b(34), AbstractC0055a.m101b(34));
        layoutParams.setMarginEnd(AbstractC0055a.m101b(10));
        viewM2184r.setLayoutParams(layoutParams);
        linearLayout2.addView(viewM2184r);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.setOrientation(1);
        TextView textView = new TextView(linearLayout3.getContext());
        AbstractC0174d.m358n(-1, -2, textView, "快捷显示点击次数");
        textView.setTextColor(getTEXT_PRIMARY());
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setTextSize(1, 17.0f);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(linearLayout3.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText("设置点击顶部微信的触发次数和长按时间");
        textView2.setTextColor(getTEXT_SECONDARY());
        textView2.setTextSize(1, 11.5f);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams3.topMargin = AbstractC0055a.m101b(14);
        layoutParams3.bottomMargin = AbstractC0055a.m101b(12);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(getDIVIDER_COLOR());
        linearLayout.addView(view);
        TextView textView3 = new TextView(linearLayout.getContext());
        AbstractC0174d.m358n(-1, -2, textView3, "快捷显示点击次数（2-8 次）");
        textView3.setTextColor(getTEXT_SECONDARY());
        textView3.setTextSize(1, 12.0f);
        linearLayout.addView(textView3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(46));
        layoutParams4.topMargin = AbstractC0055a.m101b(8);
        editText.setLayoutParams(layoutParams4);
        linearLayout.addView(editText);
        TextView textView4 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = AbstractC0055a.m101b(12);
        textView4.setLayoutParams(layoutParams5);
        textView4.setText("长按触发时间（200-3000ms）");
        textView4.setTextColor(getTEXT_SECONDARY());
        textView4.setTextSize(1, 12.0f);
        linearLayout.addView(textView4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(46));
        layoutParams6.topMargin = AbstractC0055a.m101b(8);
        editText2.setLayoutParams(layoutParams6);
        linearLayout.addView(editText2);
        LinearLayout linearLayout4 = new LinearLayout(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.topMargin = AbstractC0055a.m101b(14);
        linearLayout4.setLayoutParams(layoutParams7);
        linearLayout4.setOrientation(0);
        TextView textView5 = new TextView(linearLayout4.getContext());
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, AbstractC0055a.m101b(42), 1.0f);
        layoutParams8.setMarginEnd(AbstractC0055a.m101b(6));
        textView5.setLayoutParams(layoutParams8);
        textView5.setGravity(17);
        textView5.setText("取消");
        textView5.setTextColor(getTEXT_SECONDARY());
        textView5.setTypeface(typeface);
        textView5.setTextSize(1, 14.0f);
        textView5.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        textView5.setOnClickListener(new ViewOnClickListenerC0999u(c0228l, 6));
        linearLayout4.addView(textView5);
        TextView textView6 = new TextView(linearLayout4.getContext());
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, AbstractC0055a.m101b(42), 1.0f);
        layoutParams9.setMarginStart(AbstractC0055a.m101b(6));
        textView6.setLayoutParams(layoutParams9);
        textView6.setGravity(17);
        textView6.setText("保存");
        textView6.setTextColor(-1);
        textView6.setTypeface(typeface);
        textView6.setTextSize(1, 14.0f);
        textView6.setBackground(m2160K(this, getACCENT_TEAL(), AbstractC0055a.m101b(12), null, 8));
        textView6.setOnClickListener(new View.OnClickListener() { // from class: s0.F
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                String string2;
                String string3;
                String string4;
                Editable text = editText.getText();
                Integer numM530Z = (text == null || (string3 = text.toString()) == null || (string4 = AbstractC0299i.m507C0(string3).toString()) == null) ? null : AbstractC0306p.m530Z(string4);
                if (numM530Z == null || !new C0244c(2, 8, 1).m459a(numM530Z.intValue())) {
                    AbstractC0503h.m978P("请输入 2-8 之间的数字");
                    return;
                }
                Editable text2 = editText2.getText();
                Integer numM530Z2 = (text2 == null || (string = text2.toString()) == null || (string2 = AbstractC0299i.m507C0(string).toString()) == null) ? null : AbstractC0306p.m530Z(string2);
                if (numM530Z2 == null || !new C0244c(200, 3000, 1).m459a(numM530Z2.intValue())) {
                    AbstractC0503h.m978P("请输入 200-3000ms 之间的长按时间");
                    return;
                }
                C0976J c0976j = this;
                c0976j.f3494l.setQuickDisplayClickCount(numM530Z.intValue());
                int iIntValue = numM530Z2.intValue();
                OptionData optionData2 = c0976j.f3494l;
                optionData2.setQuickDisplayLongPressMs(iIntValue);
                boolean z2 = AbstractC1126i.f3786a;
                C1124g.m2424O(optionData2);
                interfaceC0193a.mo7b();
                AbstractC0503h.m978P("已保存快捷显示：" + numM530Z + " 次，长按 " + numM530Z2 + "ms");
                Object obj = c0228l.f568a;
                if (obj != null) {
                    ((AlertDialog) obj).dismiss();
                } else {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
            }
        });
        linearLayout4.addView(textView6);
        linearLayout.addView(linearLayout4);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setView(linearLayout).create();
        c0228l.f568a = alertDialogCreate;
        if (alertDialogCreate == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        alertDialogCreate.setOnShowListener(new DialogInterfaceOnShowListenerC0996r(c0228l, 0));
        Object obj = c0228l.f568a;
        if (obj != null) {
            m2174M((AlertDialog) obj, true);
        } else {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m2178Q() {
        EditText editText = new EditText(getContext());
        editText.setInputType(1);
        editText.setSingleLine(true);
        OptionData optionData = this.f3494l;
        String searchCommandText = optionData.getSearchCommandText();
        if (AbstractC0307q.m534d0(searchCommandText)) {
            searchCommandText = "#hide";
        }
        editText.setText(searchCommandText);
        editText.setSelectAllOnFocus(true);
        editText.setPadding(AbstractC0055a.m101b(14), AbstractC0055a.m101b(6), AbstractC0055a.m101b(14), AbstractC0055a.m101b(6));
        editText.setTextColor(getTEXT_PRIMARY());
        editText.setTextSize(1, 18.0f);
        editText.setGravity(17);
        editText.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        EditText editText2 = new EditText(getContext());
        editText2.setInputType(1);
        editText2.setSingleLine(true);
        String searchListCommandText = optionData.getSearchListCommandText();
        if (AbstractC0307q.m534d0(searchListCommandText)) {
            searchListCommandText = "#list";
        }
        editText2.setText(searchListCommandText);
        editText2.setSelectAllOnFocus(true);
        editText2.setPadding(AbstractC0055a.m101b(14), AbstractC0055a.m101b(6), AbstractC0055a.m101b(14), AbstractC0055a.m101b(6));
        editText2.setTextColor(getTEXT_PRIMARY());
        editText2.setTextSize(1, 18.0f);
        editText2.setGravity(17);
        editText2.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        C0228l c0228l = new C0228l();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(14));
        linearLayout.setBackground(m2160K(this, getCARD_COLOR(), AbstractC0055a.m101b(20), null, 8));
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        View viewM2184r = m2184r("#", getACCENT_BLUE(), AbstractC0055a.m101b(34));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0055a.m101b(34), AbstractC0055a.m101b(34));
        layoutParams.setMarginEnd(AbstractC0055a.m101b(10));
        viewM2184r.setLayoutParams(layoutParams);
        linearLayout2.addView(viewM2184r);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.setOrientation(1);
        TextView textView = new TextView(linearLayout3.getContext());
        AbstractC0174d.m358n(-1, -2, textView, "自定义搜索命令");
        textView.setTextColor(getTEXT_PRIMARY());
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setTextSize(1, 17.0f);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(linearLayout3.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText("设置在微信搜索框触发配置页面和名单管理的命令");
        textView2.setTextColor(getTEXT_SECONDARY());
        textView2.setTextSize(1, 11.5f);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams3.topMargin = AbstractC0055a.m101b(14);
        layoutParams3.bottomMargin = AbstractC0055a.m101b(12);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(getDIVIDER_COLOR());
        linearLayout.addView(view);
        TextView textView3 = new TextView(linearLayout.getContext());
        AbstractC0174d.m358n(-1, -2, textView3, "搜索框命令快捷打开配置面板");
        textView3.setTextColor(getTEXT_SECONDARY());
        textView3.setTextSize(1, 12.0f);
        linearLayout.addView(textView3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(46));
        layoutParams4.topMargin = AbstractC0055a.m101b(8);
        editText.setLayoutParams(layoutParams4);
        linearLayout.addView(editText);
        TextView textView4 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = AbstractC0055a.m101b(8);
        textView4.setLayoutParams(layoutParams5);
        textView4.setText("建议以 # 开头，例如 #hide");
        textView4.setTextColor(getTEXT_TERTIARY());
        textView4.setTextSize(1, 11.0f);
        linearLayout.addView(textView4);
        TextView textView5 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = AbstractC0055a.m101b(12);
        textView5.setLayoutParams(layoutParams6);
        textView5.setText("搜索框命令快捷打开管理名单");
        textView5.setTextColor(getTEXT_SECONDARY());
        textView5.setTextSize(1, 12.0f);
        linearLayout.addView(textView5);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(46));
        layoutParams7.topMargin = AbstractC0055a.m101b(8);
        editText2.setLayoutParams(layoutParams7);
        linearLayout.addView(editText2);
        TextView textView6 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.topMargin = AbstractC0055a.m101b(8);
        textView6.setLayoutParams(layoutParams8);
        textView6.setText("默认命令 #list");
        textView6.setTextColor(getTEXT_TERTIARY());
        textView6.setTextSize(1, 11.0f);
        linearLayout.addView(textView6);
        LinearLayout linearLayout4 = new LinearLayout(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams9.topMargin = AbstractC0055a.m101b(14);
        linearLayout4.setLayoutParams(layoutParams9);
        linearLayout4.setOrientation(0);
        TextView textView7 = new TextView(linearLayout4.getContext());
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(0, AbstractC0055a.m101b(42), 1.0f);
        layoutParams10.setMarginEnd(AbstractC0055a.m101b(6));
        textView7.setLayoutParams(layoutParams10);
        textView7.setGravity(17);
        textView7.setText("取消");
        textView7.setTextColor(getTEXT_SECONDARY());
        textView7.setTypeface(typeface);
        textView7.setTextSize(1, 14.0f);
        textView7.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        textView7.setOnClickListener(new ViewOnClickListenerC0999u(c0228l, 3));
        linearLayout4.addView(textView7);
        TextView textView8 = new TextView(linearLayout4.getContext());
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, AbstractC0055a.m101b(42), 1.0f);
        layoutParams11.setMarginStart(AbstractC0055a.m101b(6));
        textView8.setLayoutParams(layoutParams11);
        textView8.setGravity(17);
        textView8.setText("保存");
        textView8.setTextColor(-1);
        textView8.setTypeface(typeface);
        textView8.setTextSize(1, 14.0f);
        textView8.setBackground(m2160K(this, getACCENT_TEAL(), AbstractC0055a.m101b(12), null, 8));
        textView8.setOnClickListener(new ViewOnClickListenerC0969C(editText, editText2, this, c0228l, 1));
        linearLayout4.addView(textView8);
        linearLayout.addView(linearLayout4);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setView(linearLayout).create();
        c0228l.f568a = alertDialogCreate;
        if (alertDialogCreate == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        alertDialogCreate.setOnShowListener(new DialogInterfaceOnShowListenerC0996r(c0228l, 4));
        Object obj = c0228l.f568a;
        if (obj != null) {
            m2174M((AlertDialog) obj, true);
        } else {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m2179R(String str, String str2, String str3, String str4, int i2, String str5, String str6, boolean z2, C0781b c0781b) {
        int i3;
        int i4;
        int i5;
        int i6;
        C0228l c0228l = new C0228l();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(18), AbstractC0055a.m101b(14));
        linearLayout.setBackground(m2160K(this, getCARD_COLOR(), AbstractC0055a.m101b(20), null, 8));
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        View viewM2184r = m2184r(str4, i2, AbstractC0055a.m101b(34));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0055a.m101b(34), AbstractC0055a.m101b(34));
        layoutParams.setMarginEnd(AbstractC0055a.m101b(10));
        viewM2184r.setLayoutParams(layoutParams);
        linearLayout2.addView(viewM2184r);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.setOrientation(1);
        TextView textView = new TextView(linearLayout3.getContext());
        AbstractC0174d.m358n(-1, -2, textView, str);
        textView.setTextColor(getTEXT_PRIMARY());
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setTextSize(1, 17.0f);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(linearLayout3.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0055a.m101b(4);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(str2);
        textView2.setTextColor(getTEXT_SECONDARY());
        textView2.setTextSize(1, 11.5f);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams3.topMargin = AbstractC0055a.m101b(14);
        layoutParams3.bottomMargin = AbstractC0055a.m101b(10);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(getDIVIDER_COLOR());
        linearLayout.addView(view);
        View viewM2170F = m2170F(str3);
        viewM2170F.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        viewM2170F.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(14), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        linearLayout.addView(viewM2170F);
        LinearLayout linearLayout4 = new LinearLayout(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = AbstractC0055a.m101b(12);
        linearLayout4.setLayoutParams(layoutParams4);
        linearLayout4.setOrientation(0);
        if (str6 != null) {
            i4 = 12;
            i5 = 6;
            TextView textView3 = new TextView(linearLayout4.getContext());
            i6 = 42;
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, AbstractC0055a.m101b(42), 1.0f);
            layoutParams5.setMarginEnd(AbstractC0055a.m101b(6));
            textView3.setLayoutParams(layoutParams5);
            textView3.setGravity(17);
            textView3.setText(str6);
            textView3.setTextColor(getTEXT_SECONDARY());
            textView3.setTypeface(typeface);
            textView3.setTextSize(1, 14.0f);
            i3 = 1;
            textView3.setBackground(m2159J(getFIELD_BG_COLOR(), AbstractC0055a.m101b(12), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
            textView3.setOnClickListener(new ViewOnClickListenerC0999u(c0228l, 5));
            linearLayout4.addView(textView3);
        } else {
            i3 = 1;
            i4 = 12;
            i5 = 6;
            i6 = 42;
        }
        TextView textView4 = new TextView(linearLayout4.getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, AbstractC0055a.m101b(i6), 1.0f);
        if (str6 != null) {
            layoutParams6.setMarginStart(AbstractC0055a.m101b(i5));
        }
        textView4.setLayoutParams(layoutParams6);
        textView4.setGravity(17);
        textView4.setText(str5);
        textView4.setTextColor(-1);
        textView4.setTypeface(typeface);
        textView4.setTextSize(i3, 14.0f);
        textView4.setBackground(m2160K(this, i2, AbstractC0055a.m101b(i4), null, 8));
        textView4.setOnClickListener(new ViewOnClickListenerC0837F1(c0781b, c0228l, 8));
        linearLayout4.addView(textView4);
        linearLayout.addView(linearLayout4);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setView(linearLayout).create();
        c0228l.f568a = alertDialogCreate;
        if (alertDialogCreate == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        alertDialogCreate.setCancelable(z2);
        Object obj = c0228l.f568a;
        if (obj == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        ((AlertDialog) obj).setCanceledOnTouchOutside(z2);
        Object obj2 = c0228l.f568a;
        if (obj2 == null) {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
        ((AlertDialog) obj2).setOnShowListener(new DialogInterfaceOnShowListenerC0996r(c0228l, 6));
        Object obj3 = c0228l.f568a;
        if (obj3 != null) {
            m2174M((AlertDialog) obj3, true);
        } else {
            AbstractC0223g.m420g("dialog");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final void m2180T(Switch r5) {
        r5.setScaleX(0.78f);
        r5.setScaleY(0.78f);
        int[][] iArr = {new int[]{R.attr.state_checked}, new int[]{-16842912}};
        r5.setThumbTintList(new ColorStateList(iArr, new int[]{getACCENT_TEAL(), -789002}));
        r5.setTrackTintList(new ColorStateList(iArr, new int[]{-4198936, -3090726}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final View m2181U(LinearLayout linearLayout) {
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2446v()) {
            return linearLayout;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM101b = displayMetrics.widthPixels - AbstractC0055a.m101b(64);
        int iM101b2 = AbstractC0055a.m101b(260);
        if (iM101b < iM101b2) {
            iM101b = iM101b2;
        }
        int iM101b3 = displayMetrics.heightPixels - AbstractC0055a.m101b(120);
        int iM101b4 = AbstractC0055a.m101b(420);
        if (iM101b3 < iM101b4) {
            iM101b3 = iM101b4;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(iM101b, iM101b3, 17));
        linearLayout.setBackground(m2159J(getPAGE_BG_COLOR(), AbstractC0055a.m101b(20), Integer.valueOf(getDIVIDER_COLOR()), AbstractC0055a.m101b(1)));
        linearLayout.setElevation(AbstractC0055a.m100a(8.0f));
        linearLayout.setClipToOutline(true);
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p090t0.AbstractC1008c
    /* JADX INFO: renamed from: a */
    public final void mo2182a() {
        Editable text;
        int i2 = 0;
        boolean z2 = AbstractC1126i.f3786a;
        OptionData optionDataM2435k = C1124g.m2435k();
        EditText editText = this.f3492j;
        String string = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (string == null) {
            string = "";
        }
        OptionData optionData = this.f3494l;
        optionData.setTripleTapPassword(string);
        EditText editText2 = this.f3493k;
        if (editText2 != null) {
            Editable text2 = editText2.getText();
            String string2 = text2 != null ? text2.toString() : null;
            optionData.setQuickAddMenuTitle(string2 != null ? string2 : "");
        }
        HashMap map = AbstractC0055a.f298a;
        C0261l c0261l = AbstractC0575a.f1940a;
        String strM483f = c0261l.m483f(optionData);
        AbstractC0223g.m417d(strM483f, "toJson(...)");
        String strM483f2 = c0261l.m483f(optionDataM2435k);
        AbstractC0223g.m417d(strM483f2, "toJson(...)");
        if (strM483f.equals(strM483f2)) {
            m2171G();
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setTitle("提示").setIcon(getContext().getApplicationInfo().icon).setMessage("是否保存修改？").setNegativeButton("取消", new DialogInterfaceOnClickListenerC1003y(i2, this)).setPositiveButton("确定", new DialogInterfaceOnClickListenerC1003y(1, this)).create();
        AbstractC0223g.m417d(alertDialogCreate, "create(...)");
        m2174M(alertDialogCreate, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p090t0.AbstractC1008c
    /* JADX INFO: renamed from: e */
    public final View mo2152e(AbstractC1008c abstractC1008c) {
        if (Build.VERSION.SDK_INT >= 29) {
            setForceDarkAllowed(false);
        }
        boolean z2 = AbstractC1126i.f3786a;
        abstractC1008c.setBackgroundColor(C1124g.m2446v() ? getPAGE_BG_COLOR() : 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(getPAGE_BG_COLOR());
        linearLayout.addView(getTitleBar());
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        scrollView.setBackgroundColor(getPAGE_BG_COLOR());
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(getContent());
        linearLayout.addView(scrollView);
        return m2181U(linearLayout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OptionData getMOptionData() {
        return this.f3494l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EditText getMQuickAddMenuTitleEdit() {
        return this.f3493k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EditText getMTripleTapPasswordEdit() {
        return this.f3492j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final LinearLayout m2183q() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = AbstractC0055a.m101b(12);
        layoutParams.rightMargin = AbstractC0055a.m101b(12);
        layoutParams.bottomMargin = AbstractC0055a.m101b(14);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setBackground(m2160K(this, getCARD_COLOR(), 0, null, 14));
        linearLayout.setElevation(AbstractC0055a.m100a(0.5f));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final TextView m2184r(String str, int i2, int i3) {
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(i3, i3));
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i2);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, i3 >= AbstractC0055a.m101b(40) ? 16.0f : i3 >= AbstractC0055a.m101b(30) ? 13.0f : i3 >= AbstractC0055a.m101b(22) ? 11.0f : 8.0f);
        textView.setBackground(m2160K(this, m2161S(i2), AbstractC0055a.m101b(8), null, 8));
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final FrameLayout m2185s(String str, String str2) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setMinimumHeight(AbstractC0055a.m101b(AbstractC0307q.m534d0(str2) ? 46 : 60));
        frameLayout.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(8), AbstractC0055a.m101b(10), AbstractC0055a.m101b(8));
        frameLayout.setBackgroundColor(0);
        View viewM2184r = m2184r(m2158H(str), m2190y(str), AbstractC0055a.m101b(28));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(28), AbstractC0055a.m101b(28));
        layoutParams2.gravity = 8388627;
        viewM2184r.setLayoutParams(layoutParams2);
        frameLayout.addView(viewM2184r);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 8388627;
        layoutParams3.setMarginStart(AbstractC0055a.m101b(40));
        layoutParams3.setMarginEnd(AbstractC0055a.m101b(38));
        linearLayout.setLayoutParams(layoutParams3);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        AbstractC0174d.m358n(-1, -2, textView, str);
        textView.setTextColor(getTEXT_PRIMARY());
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 14.8f);
        linearLayout.addView(textView);
        if (!AbstractC0307q.m534d0(str2)) {
            TextView textView2 = new TextView(linearLayout.getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.topMargin = AbstractC0055a.m101b(3);
            textView2.setLayoutParams(layoutParams4);
            textView2.setText(str2);
            textView2.setTextColor(getTEXT_SECONDARY());
            textView2.setTextSize(1, 11.5f);
            linearLayout.addView(textView2);
        }
        frameLayout.addView(linearLayout);
        TextView textView3 = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 8388629;
        textView3.setLayoutParams(layoutParams5);
        textView3.setText("›");
        textView3.setTextSize(24.0f);
        int text_tertiary = getTEXT_TERTIARY();
        AbstractC0223g.m418e(textView3, "<this>");
        Context context = textView3.getContext();
        AbstractC0223g.m417d(context, "getContext(...)");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            textView3.setTextColor(Color.argb(Color.alpha(text_tertiary), 255 - Color.red(text_tertiary), 255 - Color.green(text_tertiary), 255 - Color.blue(text_tertiary)));
        } else {
            textView3.setTextColor(text_tertiary);
        }
        frameLayout.addView(textView3);
        View view = new View(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, AbstractC0055a.m101b(1));
        layoutParams6.gravity = 80;
        layoutParams6.setMarginStart(AbstractC0055a.m101b(40));
        view.setLayoutParams(layoutParams6);
        view.setBackgroundColor(getDIVIDER_COLOR());
        frameLayout.addView(view);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = 0;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(ColorStateList.valueOf(-1));
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(f);
        Drawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(866822826), gradientDrawable, gradientDrawable2);
        frameLayout.setClickable(true);
        frameLayout.setBackground(rippleDrawable);
        return frameLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMQuickAddMenuTitleEdit(EditText editText) {
        this.f3493k = editText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMTripleTapPasswordEdit(EditText editText) {
        this.f3492j = editText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final EditText m2186t(String str) {
        EditText editText = new EditText(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, AbstractC0055a.m101b(38));
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 16;
        editText.setLayoutParams(layoutParams);
        editText.setMinHeight(AbstractC0055a.m101b(38));
        editText.setGravity(16);
        editText.setSingleLine(true);
        editText.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(1), AbstractC0055a.m101b(10), AbstractC0055a.m101b(1));
        editText.setBackground(m2160K(this, getFIELD_BG_COLOR(), AbstractC0055a.m101b(4), Integer.valueOf(getDIVIDER_COLOR()), 8));
        editText.setTextColor(getTEXT_PRIMARY());
        editText.setHintTextColor(getTEXT_SECONDARY());
        editText.setTextSize(1, 10.8f);
        editText.setText(str);
        return editText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final TextView m2187u(String str) {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(24));
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        textView.setPadding(AbstractC0055a.m101b(16), 0, AbstractC0055a.m101b(16), 0);
        textView.setGravity(16);
        textView.setTextColor(getTEXT_SECONDARY());
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 10.8f);
        textView.setText(str);
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final ImageView m2188v() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0055a.m101b(15), AbstractC0055a.m101b(15));
        layoutParams.setMarginStart(AbstractC0055a.m101b(6));
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        Bitmap bitmapDecodeByteArray = this.f3497o;
        if (bitmapDecodeByteArray == null) {
            byte[] bArr = AbstractC0978L.f3507a;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (bitmapDecodeByteArray != null) {
                this.f3497o = bitmapDecodeByteArray;
            } else {
                bitmapDecodeByteArray = null;
            }
        }
        if (bitmapDecodeByteArray != null) {
            imageView.setImageBitmap(bitmapDecodeByteArray);
        }
        imageView.setColorFilter(Color.rgb(58, 58, 58), PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final LinearLayout m2189x(String str, String str2, String str3, int i2, InterfaceC0193a interfaceC0193a) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(52)));
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AbstractC0055a.m101b(8), AbstractC0055a.m101b(6), AbstractC0055a.m101b(8), AbstractC0055a.m101b(6));
        linearLayout.setBackground(m2160K(this, 0, AbstractC0055a.m101b(12), null, 8));
        View viewM2184r = m2184r(str3, i2, AbstractC0055a.m101b(28));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0055a.m101b(28), AbstractC0055a.m101b(28));
        layoutParams.setMarginEnd(AbstractC0055a.m101b(10));
        viewM2184r.setLayoutParams(layoutParams);
        linearLayout.addView(viewM2184r);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(linearLayout2.getContext());
        AbstractC0174d.m358n(-1, -2, textView, str);
        textView.setTextColor(getTEXT_PRIMARY());
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 14.0f);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(linearLayout2.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0055a.m101b(2);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(str2);
        textView2.setTextColor(getTEXT_SECONDARY());
        textView2.setTextSize(1, 10.5f);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0998t(interfaceC0193a, 1));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final int m2190y(String str) {
        return AbstractC0299i.m511i0(str, "快捷", false) ? getACCENT_ORANGE() : (AbstractC0299i.m511i0(str, "密友", false) || AbstractC0299i.m511i0(str, "通讯录", false)) ? getACCENT_PURPLE() : AbstractC0299i.m511i0(str, "搜索", false) ? getACCENT_GREEN() : (AbstractC0299i.m511i0(str, "朋友圈", false) || AbstractC0299i.m511i0(str, "点赞", false) || AbstractC0299i.m511i0(str, "评论", false)) ? getACCENT_PINK() : (AbstractC0299i.m511i0(str, "消息", false) || AbstractC0299i.m511i0(str, "震动", false) || AbstractC0299i.m511i0(str, "加粗", false) || AbstractC0299i.m511i0(str, "角标", false)) ? getACCENT_TEAL() : (AbstractC0299i.m511i0(str, "语音", false) || AbstractC0299i.m511i0(str, "视频", false)) ? getACCENT_PINK() : AbstractC0299i.m511i0(str, "密码", false) ? getACCENT_BLUE() : AbstractC0299i.m511i0(str, "名单", false) ? getACCENT_TEAL() : getACCENT_TEAL();
    }
}
