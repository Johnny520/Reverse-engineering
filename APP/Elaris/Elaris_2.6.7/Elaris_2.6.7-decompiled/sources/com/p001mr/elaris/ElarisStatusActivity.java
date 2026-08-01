package com.p001mr.elaris;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;
import p000.AbstractC0539xe;
import p000.RunnableC0239h0;
import p000.ViewOnApplyWindowInsetsListenerC0448s3;
import p000.ViewOnClickListenerC0464t3;
import p000.ViewOnClickListenerC0480u3;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ElarisStatusActivity extends Activity {
    private static final int CARD = -1;
    private boolean firstResume = true;
    private static final int PAGE = Color.rgb(248, 250, 252);
    private static final int TEXT = Color.rgb(17, 24, 39);
    private static final int SUB = Color.rgb(107, 114, 128);
    private static final int LINE = Color.rgb(232, 236, 242);
    private static final int STROKE = Color.rgb(228, 232, 238);
    private static final int BLUE = Color.rgb(47, 139, 246);
    private static final int GREEN = Color.rgb(46, 173, 123);
    private static final int ORANGE = Color.rgb(255, 139, 34);
    private static final int PURPLE = Color.rgb(126, 92, 224);
    private static final int ROSE = Color.rgb(224, 78, 119);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void addDivider(LinearLayout linearLayout) {
        View view = new View(this);
        view.setBackgroundColor(LINE);
        linearLayout.addView(view, m120lp(CARD, 1, m119dp(33.0f), 0, m119dp(18.0f), 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void addLinkRow(LinearLayout linearLayout, int i, String str, String str2) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(m119dp(18.0f), 0, m119dp(18.0f), 0);
        linearLayout2.setMinimumHeight(m119dp(56.0f));
        linearLayout2.setClickable(true);
        linearLayout2.setFocusable(false);
        linearLayout2.setBackground(rowBackground());
        linearLayout2.setOnClickListener(new ViewOnClickListenerC0464t3(this, 1));
        View view = new View(this);
        view.setBackground(round(i, m119dp(2.0f), 0, 0));
        linearLayout2.addView(view, m120lp(m119dp(3.0f), m119dp(32.0f), 0, 0, m119dp(12.0f), 0));
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        TextView textViewText = text(str, 15, TEXT, false);
        TextView textViewText2 = text(str2, 12, SUB, false);
        textViewText2.setMaxLines(2);
        textViewText2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout3.addView(textViewText);
        linearLayout3.addView(textViewText2, m120lp(CARD, -2, 0, m119dp(4.0f), 0, 0));
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textViewText3 = text("›", 22, Color.rgb(148, 163, 184), false);
        textViewText3.setAlpha(0.55f);
        textViewText3.setGravity(17);
        linearLayout2.addView(textViewText3, m120lp(m119dp(24.0f), m119dp(36.0f), m119dp(8.0f), 0, 0, 0));
        linearLayout.addView(linearLayout2, m120lp(CARD, -2, 0, 0, 0, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void addStatusRow(LinearLayout linearLayout, int i, String str, String str2, String str3) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(m119dp(18.0f), 0, m119dp(18.0f), 0);
        linearLayout2.setMinimumHeight(m119dp(62.0f));
        View view = new View(this);
        view.setBackground(round(i, m119dp(2.0f), 0, 0));
        linearLayout2.addView(view, m120lp(m119dp(3.0f), m119dp(32.0f), 0, 0, m119dp(12.0f), 0));
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        TextView textViewText = text(str, 15, TEXT, false);
        int i2 = SUB;
        TextView textViewText2 = text(str2, 12, i2, false);
        textViewText2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewText2.setEllipsize(truncateAt);
        linearLayout3.addView(textViewText);
        linearLayout3.addView(textViewText2, m120lp(CARD, -2, 0, m119dp(4.0f), 0, 0));
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textViewText3 = text(str3, 13, i2, false);
        textViewText3.setGravity(21);
        textViewText3.setMaxLines(2);
        textViewText3.setEllipsize(truncateAt);
        textViewText3.setMaxWidth(m119dp(170.0f));
        linearLayout2.addView(textViewText3, m120lp(-2, -2, m119dp(12.0f), 0, 0, 0));
        linearLayout.addView(linearLayout2, m120lp(CARD, -2, 0, 0, 0, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String appendVersion(String str, String str2) {
        String strValueOr = valueOr(str, "未知框架");
        if (str2 == null || str2.trim().length() <= 0) {
            return strValueOr;
        }
        return strValueOr + " " + str2.trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void applySystemBarInsets(ScrollView scrollView, LinearLayout linearLayout, int i, int i2, int i3) {
        scrollView.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0448s3(linearLayout, i, i2, i3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private LinearLayout card() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setBackground(round(CARD, m119dp(16.0f), STROKE, m119dp(1.0f)));
        linearLayout.setElevation(0.0f);
        linearLayout.setTranslationZ(0.0f);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: dp */
    private int m119dp(float f) {
        return Math.round(f * getResources().getDisplayMetrics().density);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String frameworkDisplayName(String str, String str2) {
        String strValueOr = valueOr(str, "");
        if (strValueOr.length() > 0) {
            return strValueOr;
        }
        String lowerCase = valueOr(str2, "").toLowerCase(Locale.ROOT);
        return (lowerCase.contains("lsposed") || lowerCase.contains("lspd")) ? "LSPosed" : lowerCase.contains("lspatch") ? "LSPatch" : lowerCase.contains("npatch") ? "NPatch" : lowerCase.contains("nitsuya") ? "Nitsuya" : (lowerCase.contains("fankes") || lowerCase.contains("fpa")) ? "Fankes" : lowerCase.contains("libxposed") ? "LibXposed" : "未知框架";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private View header(boolean z) {
        int i;
        int i2;
        int i3;
        LinearLayout linearLayout = new LinearLayout(this);
        int i4 = 0;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        int i5 = TEXT;
        TextView textViewText = text("Elaris", 27, i5, true);
        int i6 = SUB;
        TextView textViewText2 = text("版本 2.6.7 (1220)", 12, i6, false);
        textViewText2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewText2.setEllipsize(truncateAt);
        linearLayout2.addView(textViewText);
        linearLayout2.addView(textViewText2, m120lp(CARD, -2, 0, m119dp(3.0f), 0, 0));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        String str = z ? "已激活" : "未检测到框架激活";
        if (z) {
            i6 = GREEN;
        }
        TextView textViewText3 = text(str, 12, i6, false);
        textViewText3.setGravity(17);
        textViewText3.setSingleLine(true);
        textViewText3.setEllipsize(truncateAt);
        textViewText3.setPadding(m119dp(14.0f), 0, m119dp(14.0f), 0);
        if (z) {
            i = 248;
            i2 = 240;
            i3 = 228;
        } else {
            i = 243;
            i2 = 246;
            i3 = 241;
        }
        textViewText3.setBackground(round(Color.rgb(i3, i, i2), m119dp(17.0f), 0, 0));
        linearLayout.addView(textViewText3, m120lp(-2, m119dp(34.0f), m119dp(12.0f), 0, 0, 0));
        TextView textViewText4 = text("⋮", 24, i5, false);
        textViewText4.setGravity(17);
        textViewText4.setContentDescription("更多选项");
        textViewText4.setOnClickListener(new ViewOnClickListenerC0464t3(this, i4));
        linearLayout.addView(textViewText4, m120lp(m119dp(44.0f), m119dp(44.0f), m119dp(4.0f), 0, 0, 0));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private View infoCard(boolean z, String str, String str2, int i) {
        LinearLayout linearLayoutCard = card();
        linearLayoutCard.setOrientation(1);
        linearLayoutCard.setPadding(0, m119dp(6.0f), 0, m119dp(6.0f));
        addStatusRow(linearLayoutCard, PURPLE, "激活框架", "当前框架", z ? appendVersion(str, str2) : "未检测到框架激活");
        addDivider(linearLayoutCard);
        addStatusRow(linearLayoutCard, ORANGE, "框架 API", "LibXposed API", (!z || i <= 0) ? "未记录" : String.valueOf(i));
        addDivider(linearLayoutCard);
        addStatusRow(linearLayoutCard, ROSE, "QQ 版本", "目标版本", z ? installedQqVersion() : "未记录");
        return linearLayoutCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Throwable added to exception handler: 'NameNotFoundException', keep only Throwable */
    private String installedQqVersion() {
        PackageInfo packageInfo;
        try {
            packageInfo = getPackageManager().getPackageInfo("com.tencent.mobileqq", 0);
        } catch (Throwable unused) {
        }
        if (packageInfo == null) {
            return "未记录";
        }
        String strValueOr = valueOr(packageInfo.versionName, "");
        long longVersionCode = packageInfo.getLongVersionCode();
        if (strValueOr.length() <= 0 || longVersionCode <= 0) {
            if (strValueOr.length() > 0) {
                return strValueOr;
            }
            if (longVersionCode > 0) {
                return String.valueOf(longVersionCode);
            }
            return "未记录";
        }
        return strValueOr + "(" + longVersionCode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isLauncherIconHidden() {
        return getPackageManager().getComponentEnabledSetting(launcherComponent()) == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ComponentName launcherComponent() {
        return new ComponentName(getPackageName(), "com.mr.elaris.DesktopLauncherActivityV30");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: lp */
    private LinearLayout.LayoutParams m120lp(int i, int i2, int i3, int i4, int i5, int i6) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        layoutParams.setMargins(i3, i4, i5, i6);
        return layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void openExternalLink(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            if (AbstractC0539xe.m1152e(str)) {
                System.currentTimeMillis();
            }
            startActivity(intent);
        } catch (Throwable unused) {
            Toast.makeText(this, "无法打开链接", 0).show();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void render() {
        boolean zIsActiveForQq = FrameworkActivationStatus.isActiveForQq();
        String strFrameworkDisplayName = frameworkDisplayName(FrameworkActivationStatus.frameworkName(), "");
        String strFrameworkVersion = FrameworkActivationStatus.frameworkVersion();
        int iApiVersion = FrameworkActivationStatus.apiVersion();
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        scrollView.setBackgroundColor(PAGE);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int iM119dp = m119dp(18.0f);
        int iM119dp2 = m119dp(20.0f);
        int iM119dp3 = m119dp(24.0f);
        linearLayout.setPadding(iM119dp, iM119dp2, iM119dp, iM119dp3);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(CARD, -2));
        applySystemBarInsets(scrollView, linearLayout, iM119dp, iM119dp2, iM119dp3);
        linearLayout.addView(header(zIsActiveForQq), m120lp(CARD, -2, 0, 0, 0, m119dp(18.0f)));
        linearLayout.addView(infoCard(zIsActiveForQq, strFrameworkDisplayName, strFrameworkVersion, iApiVersion), m120lp(CARD, -2, 0, 0, 0, m119dp(12.0f)));
        linearLayout.addView(telegramCard(), m120lp(CARD, -2, 0, 0, 0, 0));
        setContentView(scrollView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private GradientDrawable round(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        if (i4 > 0) {
            gradientDrawable.setStroke(i4, i3);
        }
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private StateListDrawable rowBackground(int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, round(Color.rgb(239, 241, 245), i, 0, 0));
        stateListDrawable.addState(new int[]{R.attr.state_selected}, round(Color.rgb(242, 244, 247), i, 0, 0));
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        return stateListDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void setLauncherIconHidden(boolean z) {
        try {
            getPackageManager().setComponentEnabledSetting(launcherComponent(), z ? 2 : 1, 1);
            Toast.makeText(this, z ? "桌面图标已隐藏" : "桌面图标已恢复", 0).show();
            render();
        } catch (Throwable unused) {
            Toast.makeText(this, z ? "隐藏失败" : "恢复失败", 0).show();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void showOverflowMenu(View view) {
        boolean zIsLauncherIconHidden = isLauncherIconHidden();
        PopupWindow popupWindow = new PopupWindow(this);
        TextView textViewText = text(zIsLauncherIconHidden ? "恢复桌面图标" : "隐藏桌面图标", 13, TEXT, false);
        textViewText.setGravity(17);
        textViewText.setSingleLine(true);
        textViewText.setEllipsize(TextUtils.TruncateAt.END);
        textViewText.setPadding(m119dp(10.0f), 0, m119dp(10.0f), 0);
        textViewText.setBackground(rowBackground(m119dp(18.0f)));
        textViewText.setOnClickListener(new ViewOnClickListenerC0480u3(this, popupWindow, zIsLauncherIconHidden));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackground(round(CARD, m119dp(18.0f), STROKE, m119dp(1.0f)));
        linearLayout.addView(textViewText, new LinearLayout.LayoutParams(CARD, m119dp(44.0f)));
        int iM119dp = m119dp(148.0f);
        popupWindow.setContentView(linearLayout);
        popupWindow.setWidth(iM119dp);
        popupWindow.setHeight(-2);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setElevation(m119dp(5.0f));
        popupWindow.showAsDropDown(view, view.getWidth() - iM119dp, m119dp(4.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private View telegramCard() {
        LinearLayout linearLayoutCard = card();
        linearLayoutCard.setOrientation(1);
        linearLayoutCard.setPadding(0, m119dp(6.0f), 0, m119dp(6.0f));
        addLinkRow(linearLayoutCard, BLUE, "Telegram 频道", "查看频道更新与反馈入口");
        return linearLayoutCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private TextView text(String str, int i, int i2, boolean z) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(i);
        textView.setTextColor(i2);
        textView.setIncludeFontPadding(true);
        if (z) {
            textView.setTypeface(Typeface.DEFAULT, 1);
        }
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String valueOr(String str, String str2) {
        return (str == null || str.trim().length() == 0) ? str2 : str.trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameworkActivationStatus.init(this);
        FrameworkActivationStatus.setListener(new RunnableC0239h0(2, this));
        Window window = getWindow();
        if (window != null) {
            int i = PAGE;
            window.setStatusBarColor(i);
            window.setNavigationBarColor(i);
            window.setBackgroundDrawable(new ColorDrawable(i));
        }
        render();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onDestroy() {
        FrameworkActivationStatus.setListener(null);
        super.onDestroy();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.firstResume) {
            this.firstResume = false;
        } else {
            render();
        }
    }

    private StateListDrawable rowBackground() {
        return rowBackground(m119dp(16.0f));
    }
}
