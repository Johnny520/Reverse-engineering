package com.p001mr.elaris;

import android.R;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mr.elaris.InAppSettings.ToggleView;
import com.p001mr.elaris.InAppSettings;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsWidgets {

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public interface CheckedChangeListener {
        void onCheckedChange(boolean z, View view);
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public interface ToggleClickHandler {
        void onClick(InAppSettings.ToggleView toggleView, View view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsWidgets() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View actionRow(InAppSettings inAppSettings, String str, String str2, View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(inAppSettings.m139dp(18.0f), inAppSettings.m139dp(6.0f), inAppSettings.m139dp(18.0f), inAppSettings.m139dp(6.0f));
        linearLayout.setMinimumHeight(inAppSettings.m139dp(61.0f));
        linearLayout.setClickable(true);
        linearLayout.setFocusable(false);
        linearLayout.setBackground(inAppSettings.rowBackground());
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout2.addView(inAppSettings.text(str, 15, InAppSettingsSecondaryStyle.titleColor(inAppSettings), 1));
        if (str2 != null && str2.length() > 0) {
            TextView textViewText = inAppSettings.text(str2, 12, InAppSettingsSecondaryStyle.subtitleColor(inAppSettings), 0);
            textViewText.setMaxLines(2);
            textViewText.setPadding(0, inAppSettings.m139dp(4.0f), 0, 0);
            linearLayout2.addView(textViewText);
        }
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.setOnClickListener(onClickListener);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addToggleSlot(InAppSettings inAppSettings, LinearLayout linearLayout, InAppSettings.ToggleView toggleView) {
        FrameLayout frameLayout = new FrameLayout(inAppSettings.activity);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(inAppSettings.m139dp(40.0f), inAppSettings.m139dp(22.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(toggleView, layoutParams);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(inAppSettings.m139dp(40.0f), inAppSettings.m139dp(22.0f)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TextView button(InAppSettings inAppSettings, String str) {
        TextView textViewText = inAppSettings.text(str, 14, inAppSettings.isDarkUi() ? InAppSettings.BLUE : InAppSettingsSecondaryStyle.BUTTON_TEXT_COLOR, 0);
        textViewText.setGravity(17);
        textViewText.setSingleLine(true);
        textViewText.setEllipsize(TextUtils.TruncateAt.END);
        textViewText.setMinHeight(inAppSettings.m139dp(36.0f));
        textViewText.setBackground(buttonStateBackground(inAppSettings));
        textViewText.setElevation(0.0f);
        textViewText.setTranslationZ(0.0f);
        textViewText.setClickable(true);
        return textViewText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static StateListDrawable buttonStateBackground(InAppSettings inAppSettings) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, pressedButtonBackground(inAppSettings));
        stateListDrawable.addState(new int[0], InAppSettingsSecondaryStyle.buttonBackground(inAppSettings));
        return stateListDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View card(InAppSettings inAppSettings, String str, View[] viewArr) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = inAppSettings.m139dp(10.0f);
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        linearLayout2.setBackground(InAppSettingsSecondaryStyle.cardBackground(inAppSettings));
        linearLayout2.setElevation(inAppSettings.activity.getResources().getDisplayMetrics().density * 1.0f);
        linearLayout2.setOutlineAmbientShadowColor(InAppSettingsSecondaryStyle.CARD_AMBIENT_SHADOW_COLOR);
        linearLayout2.setOutlineSpotShadowColor(InAppSettingsSecondaryStyle.CARD_SPOT_SHADOW_COLOR);
        linearLayout2.setTranslationZ(0.0f);
        linearLayout2.setPadding(0, 0, 0, 0);
        for (View view : viewArr) {
            linearLayout2.addView(view);
        }
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View categoryHeader(InAppSettings inAppSettings, String str) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        linearLayout.setPadding(0, inAppSettings.m139dp(18.0f), 0, inAppSettings.m139dp(5.0f));
        TextView textViewText = inAppSettings.text(inAppSettings.titleOf(str), 24, InAppSettingsSecondaryStyle.titleColor(inAppSettings), 1);
        TextView textViewText2 = inAppSettings.text(inAppSettings.summaryOf(str), 13, InAppSettingsSecondaryStyle.subtitleColor(inAppSettings), 0);
        textViewText2.setPadding(0, inAppSettings.m139dp(4.0f), 0, 0);
        linearLayout.addView(textViewText, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textViewText2, new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Drawable checkCircleDrawable(InAppSettings inAppSettings, boolean z) {
        return inAppSettings.roundWithStroke(z ? inAppSettings.mixForSurface(InAppSettings.BLUE, 0.88f) : InAppSettings.CARD_SOFT, inAppSettings.m139dp(14.0f), z ? inAppSettings.mixForSurface(InAppSettings.BLUE, 0.45f) : InAppSettings.STROKE, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int clickableRowCount(View[] viewArr) {
        int i = 0;
        for (View view : viewArr) {
            if (isClickableRow(view)) {
                i++;
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static View createSettingItem(InAppSettings inAppSettings, String str, String str2, boolean z, ToggleClickHandler toggleClickHandler, boolean z2, float f, float f2, float f3) {
        return createSettingItemSized(inAppSettings, str, str2, z, toggleClickHandler, z2, f, f2, f3, 61.0f, 72.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static View createSettingItemSized(final InAppSettings inAppSettings, String str, String str2, boolean z, final ToggleClickHandler toggleClickHandler, boolean z2, float f, float f2, float f3, final float f4, final float f5) {
        final LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(inAppSettings.m139dp(f2), inAppSettings.m139dp(6.0f), inAppSettings.m139dp(f2), inAppSettings.m139dp(6.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setMinimumHeight(inAppSettings.m139dp(f4));
        linearLayout.setClickable(true);
        linearLayout.setBackground(inAppSettings.rowBackground());
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        linearLayout2.setMinimumWidth(0);
        linearLayout2.setPadding(0, 0, inAppSettings.m139dp(f3), 0);
        TextView textViewText = inAppSettings.text(str, 15, InAppSettingsSecondaryStyle.titleColor(inAppSettings), 1);
        textViewText.setSingleLine(false);
        textViewText.setHorizontallyScrolling(false);
        linearLayout2.addView(textViewText);
        if (str2 != null && str2.length() > 0) {
            final TextView textViewText2 = inAppSettings.text(str2, (int) f, InAppSettingsSecondaryStyle.subtitleColor(inAppSettings), 0);
            textViewText2.setSingleLine(false);
            textViewText2.setMaxLines(2);
            textViewText2.setHorizontallyScrolling(false);
            textViewText2.setPadding(0, inAppSettings.m139dp(4.0f), 0, 0);
            linearLayout2.addView(textViewText2);
            if (z2) {
                inAppSettings.repeaterModeSummaryView = textViewText2;
            }
            textViewText2.post(new Runnable() { // from class: com.mr.elaris.InAppSettingsWidgets.6
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public void run() {
                    linearLayout.setMinimumHeight(inAppSettings.m139dp(textViewText2.getLineCount() > 1 ? f5 : f4));
                }
            });
        }
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        final InAppSettings.ToggleView toggleView = inAppSettings.new ToggleView(inAppSettings.activity);
        toggleView.setChecked(z);
        addToggleSlot(inAppSettings, linearLayout, toggleView);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsWidgets.7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ToggleClickHandler toggleClickHandler2 = toggleClickHandler;
                if (toggleClickHandler2 != null) {
                    toggleClickHandler2.onClick(toggleView, view);
                }
            }
        });
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TextView dialogButton(InAppSettings inAppSettings, String str, boolean z) {
        return InAppSettingsDialogWidgets.button(inAppSettings, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GradientDrawable dialogPanel(InAppSettings inAppSettings) {
        return InAppSettingsDialogWidgets.panel(inAppSettings);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View divider(InAppSettings inAppSettings) {
        View view = new View(inAppSettings.activity);
        view.setBackgroundColor(InAppSettingsSecondaryStyle.dividerColor(inAppSettings));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.leftMargin = inAppSettings.m139dp(18.0f);
        layoutParams.rightMargin = inAppSettings.m139dp(18.0f);
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isClickableRow(View view) {
        return (view instanceof LinearLayout) && view.isClickable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View moduleListCard(InAppSettings inAppSettings, View[] viewArr) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(1);
        linearLayout.setBackground(inAppSettings.menuSoftPanel());
        linearLayout.setPadding(inAppSettings.m139dp(8.0f), inAppSettings.m139dp(10.0f), inAppSettings.m139dp(8.0f), inAppSettings.m139dp(10.0f));
        linearLayout.setElevation(inAppSettings.activity.getResources().getDisplayMetrics().density * 1.0f);
        linearLayout.setOutlineAmbientShadowColor(InAppSettingsSecondaryStyle.CARD_AMBIENT_SHADOW_COLOR);
        linearLayout.setOutlineSpotShadowColor(InAppSettingsSecondaryStyle.CARD_SPOT_SHADOW_COLOR);
        linearLayout.setTranslationZ(0.0f);
        int iClickableRowCount = clickableRowCount(viewArr);
        int i = 0;
        for (View view : viewArr) {
            boolean zIsClickableRow = isClickableRow(view);
            if (zIsClickableRow) {
                view.setBackground(inAppSettings.moduleListRowBackground(i, iClickableRowCount));
                i++;
            }
            linearLayout.addView(view);
            if (zIsClickableRow && i < iClickableRowCount) {
                linearLayout.addView(moduleMenuDivider(inAppSettings));
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = inAppSettings.m139dp(8.0f);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static View moduleMenuDivider(InAppSettings inAppSettings) {
        View view = new View(inAppSettings.activity);
        view.setBackgroundColor(InAppSettingsSecondaryStyle.dividerColor(inAppSettings));
        view.setAlpha(inAppSettings.isDarkUi() ? 0.72f : 0.55f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.leftMargin = inAppSettings.m139dp(30.0f);
        layoutParams.rightMargin = inAppSettings.m139dp(18.0f);
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View moduleRow(InAppSettings inAppSettings, String str, String str2, int i, int i2, View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(inAppSettings.m139dp(14.0f), inAppSettings.m139dp(8.0f), inAppSettings.m139dp(10.0f), inAppSettings.m139dp(8.0f));
        linearLayout.setMinimumHeight(inAppSettings.m139dp(68.0f));
        linearLayout.setClickable(true);
        linearLayout.setFocusable(false);
        linearLayout.setOnClickListener(onClickListener);
        linearLayout.setBackground(inAppSettings.rowBackground());
        linearLayout.addView(inAppSettings.accentStrip(i2), new LinearLayout.LayoutParams(inAppSettings.m139dp(3.0f), inAppSettings.m139dp(36.0f)));
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(inAppSettings.m139dp(13.0f), 0, inAppSettings.m139dp(8.0f), 0);
        linearLayout2.addView(inAppSettings.text(str, 15, InAppSettingsSecondaryStyle.titleColor(inAppSettings), 1));
        if (str2 != null && str2.length() > 0) {
            TextView textViewText = inAppSettings.text(str2, 12, InAppSettingsSecondaryStyle.subtitleColor(inAppSettings), 0);
            textViewText.setPadding(0, inAppSettings.m139dp(4.0f), 0, 0);
            linearLayout2.addView(textViewText);
        }
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        FrameLayout frameLayout = new FrameLayout(inAppSettings.activity);
        frameLayout.setAlpha(0.55f);
        InAppSettingsChevronRightView inAppSettingsChevronRightView = new InAppSettingsChevronRightView(inAppSettings);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(inAppSettings.m139dp(20.0f), inAppSettings.m139dp(20.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(inAppSettingsChevronRightView, layoutParams);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(inAppSettings.m139dp(22.0f), -1));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static GradientDrawable pressedButtonBackground(InAppSettings inAppSettings) {
        int iMixForSurface = inAppSettings.isDarkUi() ? inAppSettings.mixForSurface(InAppSettings.BLUE, 0.8f) : Color.rgb(232, 242, 255);
        int iMixForSurface2 = inAppSettings.isDarkUi() ? inAppSettings.mixForSurface(InAppSettings.BLUE, 0.62f) : InAppSettingsSecondaryStyle.CONTROL_STROKE_COLOR;
        GradientDrawable gradientDrawableRound = InAppSettingsVisuals.round(iMixForSurface, inAppSettings.m139dp(12.0f));
        gradientDrawableRound.setStroke(1, iMixForSurface2);
        return gradientDrawableRound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int pressedRowColor(InAppSettings inAppSettings) {
        int i;
        int i2;
        int i3;
        if (inAppSettings.isDarkUi()) {
            i = 47;
            i2 = 56;
            i3 = 43;
        } else {
            i = 241;
            i2 = 245;
            i3 = 239;
        }
        return Color.rgb(i3, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View settingItem(InAppSettings inAppSettings, String str, String str2, boolean z, final CheckedChangeListener checkedChangeListener) {
        return createSettingItem(inAppSettings, str, str2, z, new ToggleClickHandler() { // from class: com.mr.elaris.InAppSettingsWidgets.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // com.mr.elaris.InAppSettingsWidgets.ToggleClickHandler
            public void onClick(InAppSettings.ToggleView toggleView, View view) {
                boolean z2 = !toggleView.isChecked();
                toggleView.setChecked(z2);
                CheckedChangeListener checkedChangeListener2 = checkedChangeListener;
                if (checkedChangeListener2 != null) {
                    checkedChangeListener2.onCheckedChange(z2, view);
                }
            }
        }, false, 12.0f, 18.0f, 8.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TextView statPill(InAppSettings inAppSettings, String str, int i) {
        boolean z = i == InAppSettings.GREEN;
        if (!inAppSettings.isDarkUi()) {
            i = z ? InAppSettingsSecondaryStyle.STATUS_GREEN_TEXT_COLOR : InAppSettingsSecondaryStyle.BUTTON_TEXT_COLOR;
        }
        TextView textViewText = inAppSettings.text(str, 14, i, 0);
        textViewText.setGravity(17);
        textViewText.setSingleLine(true);
        textViewText.setEllipsize(TextUtils.TruncateAt.END);
        textViewText.setMinHeight(inAppSettings.m139dp(36.0f));
        textViewText.setPadding(inAppSettings.m139dp(10.0f), 0, inAppSettings.m139dp(10.0f), 0);
        textViewText.setBackground(InAppSettingsSecondaryStyle.statusBackground(inAppSettings, z));
        return textViewText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View switchDetailRow(InAppSettings inAppSettings, String str, String str2, String str3, View.OnClickListener onClickListener) {
        return switchDetailRowInternal(inAppSettings, str, str2, str3, onClickListener, true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static View switchDetailRowInternal(final InAppSettings inAppSettings, final String str, final String str2, String str3, final View.OnClickListener onClickListener, final boolean z, final boolean z2) {
        LinearLayout linearLayout = (LinearLayout) createSettingItem(inAppSettings, str2, str3, inAppSettings.getBool(str), new ToggleClickHandler() { // from class: com.mr.elaris.InAppSettingsWidgets.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // com.mr.elaris.InAppSettingsWidgets.ToggleClickHandler
            public void onClick(InAppSettings.ToggleView toggleView, View view) {
                if (toggleView.isChecked()) {
                    View.OnClickListener onClickListener2 = onClickListener;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                        return;
                    }
                    return;
                }
                toggleView.setChecked(true);
                inAppSettings.saveBool(str, true, z);
                if (z2) {
                    inAppSettings.refreshCurrentPage();
                }
            }
        }, false, 12.0f, 18.0f, 8.0f);
        View childAt = linearLayout.getChildCount() == 0 ? null : linearLayout.getChildAt(linearLayout.getChildCount() - 1);
        if (childAt instanceof FrameLayout) {
            final FrameLayout frameLayout = (FrameLayout) childAt;
            if (frameLayout.getChildCount() > 0 && (frameLayout.getChildAt(0) instanceof InAppSettings.ToggleView)) {
                final InAppSettings.ToggleView toggleView = (InAppSettings.ToggleView) frameLayout.getChildAt(0);
                frameLayout.setClickable(true);
                frameLayout.setFocusable(false);
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(toggleView.isChecked() ? "，已开启" : "，已关闭");
                frameLayout.setContentDescription(sb.toString());
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsWidgets.3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        boolean z3 = !toggleView.isChecked();
                        toggleView.setChecked(z3);
                        inAppSettings.saveBool(str, z3, z);
                        FrameLayout frameLayout2 = frameLayout;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(toggleView.isChecked() ? "，已开启" : "，已关闭");
                        frameLayout2.setContentDescription(sb2.toString());
                        if (z2) {
                            inAppSettings.refreshCurrentPage();
                        }
                    }
                });
            }
        }
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View switchDetailRowSilent(InAppSettings inAppSettings, String str, String str2, String str3, View.OnClickListener onClickListener) {
        return switchDetailRowInternal(inAppSettings, str, str2, str3, onClickListener, false, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View switchRow(final InAppSettings inAppSettings, final String str, String str2, String str3) {
        return createSettingItem(inAppSettings, str2, str3, inAppSettings.getBool(str), new ToggleClickHandler() { // from class: com.mr.elaris.InAppSettingsWidgets.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // com.mr.elaris.InAppSettingsWidgets.ToggleClickHandler
            public void onClick(InAppSettings.ToggleView toggleView, View view) {
                inAppSettings.toggleSwitchRow(toggleView, str, view);
            }
        }, Prefs.KEY_MESSAGE_REPEATER.equals(str), 12.0f, 18.0f, 8.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View switchRowCompactDescription(final InAppSettings inAppSettings, final String str, String str2, String str3) {
        return createSettingItem(inAppSettings, str2, str3, inAppSettings.getBool(str), new ToggleClickHandler() { // from class: com.mr.elaris.InAppSettingsWidgets.4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // com.mr.elaris.InAppSettingsWidgets.ToggleClickHandler
            public void onClick(InAppSettings.ToggleView toggleView, View view) {
                inAppSettings.toggleSwitchRow(toggleView, str, view);
            }
        }, false, 12.0f, 16.0f, 6.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TextView text(InAppSettings inAppSettings, String str, int i, int i2, int i3) {
        TextView textView = new TextView(inAppSettings.activity);
        textView.setTag("ELARIS_SETTINGS_VIEW");
        textView.setText(str);
        textView.setTextSize(2, i);
        textView.setTextColor(i2);
        textView.setTypeface(i3 == 1 ? Typeface.create("sans-serif-medium", 0) : Typeface.create("sans-serif", 0));
        textView.setIncludeFontPadding(false);
        textView.setHorizontallyScrolling(false);
        return textView;
    }
}
