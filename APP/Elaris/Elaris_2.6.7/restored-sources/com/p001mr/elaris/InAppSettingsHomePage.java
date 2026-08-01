package com.p001mr.elaris;

import android.R;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsHomePage {
    private static final String HOME_MOTTO = "我本渔樵孟诸野，一生自是悠悠者";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsHomePage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addHome(InAppSettings inAppSettings, LinearLayout linearLayout) {
        linearLayout.addView(homeTopBar(inAppSettings));
        linearLayout.addView(homeModuleList(inAppSettings));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Drawable feedbackBubbleIcon(InAppSettings inAppSettings) {
        return new InAppSettingsFeedbackIconDrawable(inAppSettings, InAppSettings.SUB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TextView feedbackPill(final InAppSettings inAppSettings) {
        TextView textViewText = inAppSettings.text("交流与反馈", 12, InAppSettings.SUB, 1);
        textViewText.setGravity(17);
        textViewText.setSingleLine(true);
        textViewText.setEllipsize(TextUtils.TruncateAt.END);
        textViewText.setPadding(inAppSettings.m139dp(9.0f), 0, inAppSettings.m139dp(10.0f), 0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, inAppSettings.roundWithStroke(InAppSettingsWidgets.pressedRowColor(inAppSettings), inAppSettings.m139dp(17.0f), InAppSettings.STROKE, 1));
        stateListDrawable.addState(new int[0], inAppSettings.roundWithStroke(InAppSettings.CARD_SOFT, inAppSettings.m139dp(17.0f), InAppSettings.STROKE, 1));
        textViewText.setBackground(stateListDrawable);
        Drawable drawableFeedbackBubbleIcon = feedbackBubbleIcon(inAppSettings);
        drawableFeedbackBubbleIcon.setBounds(0, 0, inAppSettings.m139dp(16.0f), inAppSettings.m139dp(16.0f));
        textViewText.setCompoundDrawables(drawableFeedbackBubbleIcon, null, null, null);
        textViewText.setCompoundDrawablePadding(inAppSettings.m139dp(4.0f));
        textViewText.setClickable(true);
        textViewText.setFocusable(false);
        textViewText.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsHomePage.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                inAppSettings.showCategory("feedback");
            }
        });
        return textViewText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static View homeModuleList(InAppSettings inAppSettings) {
        return InAppSettingsHomeModules.create(inAppSettings);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View homeTopBar(InAppSettings inAppSettings) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(0, inAppSettings.m139dp(2.0f), 0, inAppSettings.m139dp(8.0f));
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(inAppSettings.m139dp(1.0f), 0, 0, 0);
        View viewText = inAppSettings.text("Elaris", 24, InAppSettingsSecondaryStyle.titleColor(inAppSettings), 1);
        TextView textViewText = inAppSettings.text(moduleVersion(inAppSettings), 12, InAppSettingsSecondaryStyle.subtitleColor(inAppSettings), 0);
        TextView textViewText2 = inAppSettings.text(HOME_MOTTO, 12, InAppSettingsSecondaryStyle.subtitleColor(inAppSettings), 0);
        textViewText.setPadding(0, inAppSettings.m139dp(2.0f), 0, 0);
        LinearLayout linearLayout3 = new LinearLayout(inAppSettings.activity);
        linearLayout3.setGravity(80);
        linearLayout3.setOrientation(0);
        TextView textViewMottoAudioButton = mottoAudioButton(inAppSettings);
        linearLayout3.addView(textViewText, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(inAppSettings.m139dp(16.0f), inAppSettings.m139dp(16.0f));
        layoutParams.leftMargin = inAppSettings.m139dp(3.0f);
        linearLayout3.addView(textViewMottoAudioButton, layoutParams);
        textViewText2.setSingleLine(true);
        textViewText2.setEllipsize(TextUtils.TruncateAt.END);
        textViewText2.setPadding(0, inAppSettings.m139dp(5.0f), inAppSettings.m139dp(12.0f), 0);
        linearLayout2.addView(viewText);
        linearLayout2.addView(linearLayout3);
        linearLayout2.addView(textViewText2);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(feedbackPill(inAppSettings), new LinearLayout.LayoutParams(-2, inAppSettings.m139dp(34.0f)));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String moduleVersion(InAppSettings inAppSettings) {
        return "版本 2.6.7";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static TextView mottoAudioButton(final InAppSettings inAppSettings) {
        TextView textViewText = inAppSettings.text("", 12, InAppSettingsSecondaryStyle.subtitleColor(inAppSettings), 0);
        textViewText.setGravity(17);
        textViewText.setTranslationY(inAppSettings.m139dp(1.0f));
        textViewText.setPadding(0, 0, 0, 0);
        textViewText.setBackground(null);
        textViewText.setClickable(true);
        textViewText.setFocusable(false);
        textViewText.setSoundEffectsEnabled(false);
        textViewText.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsHomePage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                inAppSettings.toggleMottoAudio();
            }
        });
        inAppSettings.bindMottoAudioButton(textViewText);
        return textViewText;
    }
}
