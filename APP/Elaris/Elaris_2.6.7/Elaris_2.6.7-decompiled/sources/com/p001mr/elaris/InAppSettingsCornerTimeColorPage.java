package com.p001mr.elaris;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.TextView;
import com.mr.elaris.InAppSettings.ToggleView;
import com.p001mr.elaris.InAppSettings;
import java.util.Locale;
import p000.AbstractC0000a;
import p000.AbstractC0224g1;
import p000.AbstractC0399p2;
import p000.AbstractC0429r0;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsCornerTimeColorPage {

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class ColorPaletteView extends View {
        private static final int[] RAINBOW = {-65536, -256, -16711936, -16711681, -16776961, -65281, -65536};
        private final RectF bounds;
        private float hue;
        private Shader hueShader;
        private Listener listener;
        private final Paint paint;
        private float saturation;
        private Shader saturationShader;

        /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
        public interface Listener {
            void onColorChanged(float f, float f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ColorPaletteView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.bounds = new RectF();
            setFocusable(true);
            setClickable(true);
            setContentDescription("时间颜色取色板");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: dp */
        private float m150dp(float f) {
            return f * getResources().getDisplayMetrics().density;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float width = getWidth();
            float height = getHeight();
            if (width <= 0.0f || height <= 0.0f) {
                return;
            }
            this.bounds.set(0.0f, 0.0f, width, height);
            this.paint.setShader(this.hueShader);
            canvas.drawRoundRect(this.bounds, m150dp(10.0f), m150dp(10.0f), this.paint);
            this.paint.setShader(this.saturationShader);
            canvas.drawRoundRect(this.bounds, m150dp(10.0f), m150dp(10.0f), this.paint);
            this.paint.setShader(null);
            float f = (this.hue / 360.0f) * width;
            float f2 = this.saturation * height;
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(m150dp(4.0f));
            this.paint.setColor(Color.argb(150, 0, 0, 0));
            canvas.drawCircle(f, f2, m150dp(8.0f), this.paint);
            this.paint.setStrokeWidth(m150dp(2.0f));
            this.paint.setColor(-1);
            canvas.drawCircle(f, f2, m150dp(8.0f), this.paint);
            this.paint.setStyle(Paint.Style.FILL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (i <= 0 || i2 <= 0) {
                this.hueShader = null;
                this.saturationShader = null;
            } else {
                int[] iArr = RAINBOW;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.hueShader = new LinearGradient(0.0f, 0.0f, i, 0.0f, iArr, (float[]) null, tileMode);
                this.saturationShader = new LinearGradient(0.0f, 0.0f, 0.0f, i2, -1, 0, tileMode);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0 && actionMasked != 2 && actionMasked != 1) {
                return super.onTouchEvent(motionEvent);
            }
            float fMax = Math.max(1.0f, getWidth());
            float fMax2 = Math.max(1.0f, getHeight());
            float fMax3 = Math.max(0.0f, Math.min(fMax, motionEvent.getX()));
            float fMax4 = Math.max(0.0f, Math.min(fMax2, motionEvent.getY()));
            float f = (fMax3 / fMax) * 360.0f;
            this.hue = f;
            if (f >= 360.0f) {
                this.hue = 359.999f;
            }
            this.saturation = fMax4 / fMax2;
            invalidate();
            Listener listener = this.listener;
            if (listener != null) {
                listener.onColorChanged(this.hue, this.saturation);
            }
            if (actionMasked == 1) {
                performClick();
            }
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setColor(int i) {
            float[] fArr = new float[3];
            Color.colorToHSV(i, fArr);
            this.hue = fArr[0];
            this.saturation = fArr[1];
            invalidate();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setListener(Listener listener) {
            this.listener = listener;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class PickerState {
        int alpha;
        final float[] hsv = new float[3];

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public PickerState(int i) {
            setColor(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int color() {
            return Color.HSVToColor(this.alpha, this.hsv);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setColor(int i) {
            Color.colorToHSV(i, this.hsv);
            this.alpha = Color.alpha(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsCornerTimeColorPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void applyDialogWindow(InAppSettings inAppSettings, AlertDialog alertDialog) {
        inAppSettings.applyDialogWindowStyle(alertDialog);
        try {
            Window window = alertDialog.getWindow();
            if (window != null) {
                window.setLayout(Math.max(inAppSettings.m139dp(264.0f), inAppSettings.dialogWidth() - inAppSettings.m139dp(24.0f)), -2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void applyFormatOptionStyle(InAppSettings inAppSettings, TextView textView, boolean z) {
        int iMixForSurface = z ? inAppSettings.mixForSurface(InAppSettings.BLUE, 0.88f) : InAppSettings.CARD_SOFT;
        int iMixForSurface2 = z ? inAppSettings.mixForSurface(InAppSettings.BLUE, 0.45f) : InAppSettings.STROKE;
        textView.setTextColor(z ? InAppSettings.BLUE : InAppSettings.TEXT);
        textView.setTypeface(Typeface.DEFAULT, z ? 1 : 0);
        textView.setBackground(inAppSettings.roundWithStroke(iMixForSurface, inAppSettings.m139dp(8.0f), iMixForSurface2, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static String colorHex(int i) {
        return String.format(Locale.US, "#%08X", Integer.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static View createHideOfficialRow(final InAppSettings inAppSettings) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setClickable(true);
        linearLayout.setPadding(0, inAppSettings.m139dp(7.0f), 0, inAppSettings.m139dp(7.0f));
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout2.addView(inAppSettings.text("隐藏官方时间", 14, InAppSettings.TEXT, 1));
        TextView textViewText = inAppSettings.text("隐藏聊天中间 QQ 自带的时间提示", 12, InAppSettings.NOTE, 0);
        textViewText.setPadding(0, inAppSettings.m139dp(2.0f), 0, 0);
        linearLayout2.addView(textViewText);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.rightMargin = inAppSettings.m139dp(8.0f);
        linearLayout.addView(linearLayout2, layoutParams);
        final InAppSettings.ToggleView toggleView = inAppSettings.new ToggleView(inAppSettings.activity);
        toggleView.setChecked(inAppSettings.getBool(Prefs.KEY_HIDE_OFFICIAL_CENTER_TIME));
        inAppSettings.addToggleSlot(linearLayout, toggleView);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                inAppSettings.toggleSwitchRow(toggleView, Prefs.KEY_HIDE_OFFICIAL_CENTER_TIME, view);
            }
        });
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View createTimeSwitchRow(final InAppSettings inAppSettings) {
        return InAppSettingsWidgets.switchDetailRow(inAppSettings, Prefs.KEY_CHAT_MESSAGE_CORNER_TIME, "显示精确消息时间", "在消息右下角显示时间，点击进入格式与颜色面板", new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsCornerTimeColorPage.showDialog(inAppSettings);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, android.widget.HorizontalScrollView] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.app.AlertDialog, android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r11v34, types: [android.view.View, android.widget.ScrollView] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v22, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v23 */
    public static void showDialog(final InAppSettings inAppSettings) {
        try {
            String string = inAppSettings.getString(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME_COLOR);
            int color = AbstractC0224g1.f286a;
            if (string != null && string.trim().length() != 0) {
                try {
                    color = Color.parseColor(string.trim());
                } catch (Throwable unused) {
                }
            }
            String string2 = inAppSettings.getString(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME_FORMAT);
            ThreadLocal threadLocal = AbstractC0399p2.f694a;
            String strTrim = string2 == null ? "" : string2.trim();
            if (!"HH:mm".equals(strTrim) && !"HH:mm:ss".equals(strTrim) && !"ah:mm".equals(strTrim)) {
                strTrim = "ah:mm";
            }
            final String[] strArr = {strTrim};
            final PickerState pickerState = new PickerState(color);
            ?? linearLayout = new LinearLayout(inAppSettings.activity);
            linearLayout.setOrientation(1);
            linearLayout.setTag("elaris_dialog_surface");
            int iM139dp = inAppSettings.m139dp(16.0f);
            linearLayout.setPadding(iM139dp, inAppSettings.m139dp(12.0f), iM139dp, inAppSettings.m139dp(10.0f));
            linearLayout.setBackground(inAppSettings.dialogPanel());
            linearLayout.addView(inAppSettings.text("时间样式", 17, InAppSettings.TEXT, 1));
            LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            String[] strArr2 = {"HH:mm", "HH:mm:ss", "ah:mm"};
            String[] strArr3 = {"H:mm", "H:mm:ss", "a h:mm"};
            final TextView[] textViewArr = new TextView[3];
            int i = 0;
            for (int i2 = 3; i < i2; i2 = 3) {
                TextView textViewText = inAppSettings.text(strArr3[i], 14, InAppSettings.TEXT, 0);
                textViewText.setTag(strArr2[i]);
                textViewText.setGravity(17);
                textViewText.setSingleLine(true);
                textViewText.setClickable(true);
                textViewText.setFocusable(false);
                applyFormatOptionStyle(inAppSettings, textViewText, strArr2[i].equals(strTrim));
                String[] strArr4 = strArr2;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, inAppSettings.m139dp(33.0f), 1.0f);
                if (i > 0) {
                    layoutParams.leftMargin = inAppSettings.m139dp(6.0f);
                }
                linearLayout2.addView(textViewText, layoutParams);
                textViewArr[i] = textViewText;
                i++;
                strArr2 = strArr4;
            }
            String[] strArr5 = strArr2;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = inAppSettings.m139dp(6.0f);
            layoutParams2.bottomMargin = inAppSettings.m139dp(8.0f);
            linearLayout.addView(linearLayout2, layoutParams2);
            linearLayout.addView(createHideOfficialRow(inAppSettings));
            LinearLayout linearLayout3 = new LinearLayout(inAppSettings.activity);
            linearLayout3.setOrientation(0);
            final TextView textViewText2 = inAppSettings.text("AM11:59", 15, color, 1);
            final TextView textViewText3 = inAppSettings.text("AM11:59", 15, color, 1);
            textViewText2.setSingleLine(true);
            textViewText3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textViewText2.setEllipsize(truncateAt);
            textViewText3.setEllipsize(truncateAt);
            textViewText2.setGravity(17);
            textViewText3.setGravity(17);
            textViewText2.setBackground(inAppSettings.roundWithStroke(Color.rgb(248, 250, 252), inAppSettings.m139dp(12.0f), Color.rgb(226, 232, 240), 1));
            textViewText3.setBackground(inAppSettings.roundWithStroke(Color.rgb(46, 52, 64), inAppSettings.m139dp(12.0f), Color.rgb(71, 79, 94), 1));
            linearLayout3.addView(textViewText2, new LinearLayout.LayoutParams(0, inAppSettings.m139dp(36.0f), 1.0f));
            linearLayout3.addView(new Space(inAppSettings.activity), new LinearLayout.LayoutParams(inAppSettings.m139dp(8.0f), 1));
            linearLayout3.addView(textViewText3, new LinearLayout.LayoutParams(0, inAppSettings.m139dp(36.0f), 1.0f));
            linearLayout.addView(linearLayout3, new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(36.0f)));
            final TextView textViewText4 = inAppSettings.text(colorHex(color), 12, InAppSettings.NOTE, 0);
            textViewText4.setGravity(1);
            textViewText4.setPadding(0, inAppSettings.m139dp(2.0f), 0, inAppSettings.m139dp(4.0f));
            linearLayout.addView(textViewText4);
            ColorPaletteView colorPaletteView = new ColorPaletteView(inAppSettings.activity);
            colorPaletteView.setColor(color);
            linearLayout.addView(colorPaletteView, new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(96.0f)));
            final TextView textViewText5 = inAppSettings.text("亮度", 13, InAppSettings.TEXT, 1);
            textViewText5.setPadding(0, inAppSettings.m139dp(3.0f), 0, 0);
            linearLayout.addView(textViewText5);
            SeekBar seekBar = new SeekBar(inAppSettings.activity);
            styleSeekBar(inAppSettings, seekBar);
            seekBar.setMax(100);
            seekBar.setProgress(Math.round(pickerState.hsv[2] * 100.0f));
            linearLayout.addView(seekBar, new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(26.0f)));
            final TextView textViewText6 = inAppSettings.text("透明度", 13, InAppSettings.TEXT, 1);
            linearLayout.addView(textViewText6);
            SeekBar seekBar2 = new SeekBar(inAppSettings.activity);
            styleSeekBar(inAppSettings, seekBar2);
            seekBar2.setMin(64);
            seekBar2.setMax(255);
            seekBar2.setProgress(pickerState.alpha);
            byte b = -1;
            linearLayout.addView(seekBar2, new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(26.0f)));
            boolean[] zArr = {false};
            final long jCurrentTimeMillis = System.currentTimeMillis();
            SeekBar seekBar3 = seekBar2;
            ?? r1 = linearLayout;
            int i3 = 16;
            Runnable runnable = new Runnable() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public void run() {
                    int iColor = pickerState.color();
                    String str = strArr[0];
                    long j = jCurrentTimeMillis;
                    int i4 = AbstractC0224g1.f286a;
                    String strM778a = AbstractC0399p2.m778a(j, str);
                    textViewText2.setText(strM778a);
                    textViewText3.setText(strM778a);
                    textViewText2.setTextColor(iColor);
                    textViewText3.setTextColor(iColor);
                    textViewText4.setText(InAppSettingsCornerTimeColorPage.colorHex(iColor));
                    TextView textView = textViewText5;
                    Locale locale = Locale.CHINA;
                    textView.setText(String.format(locale, "亮度 %d%%", Integer.valueOf(Math.round(pickerState.hsv[2] * 100.0f))));
                    textViewText6.setText(String.format(locale, "透明度 %d%%", Integer.valueOf(Math.round((pickerState.alpha * 100.0f) / 255.0f))));
                }
            };
            runnable.run();
            int i4 = 0;
            while (i4 < 3) {
                TextView textView = textViewArr[i4];
                final Runnable runnable2 = runnable;
                ?? r8 = r1;
                final String[] strArr6 = strArr;
                ColorPaletteView colorPaletteView2 = colorPaletteView;
                int i5 = i3;
                final int i6 = i4;
                final String[] strArr7 = strArr5;
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        strArr6[0] = strArr7[i6];
                        int i7 = 0;
                        while (true) {
                            TextView[] textViewArr2 = textViewArr;
                            if (i7 >= textViewArr2.length) {
                                runnable2.run();
                                return;
                            } else {
                                InAppSettingsCornerTimeColorPage.applyFormatOptionStyle(inAppSettings, textViewArr2[i7], i7 == i6);
                                i7++;
                            }
                        }
                    }
                });
                int i7 = i6 + 1;
                strArr = strArr6;
                r1 = r8;
                runnable = runnable2;
                seekBar = seekBar;
                strArr5 = strArr7;
                i3 = i5;
                seekBar3 = seekBar3;
                zArr = zArr;
                colorPaletteView = colorPaletteView2;
                i4 = i7;
                b = -1;
            }
            Runnable runnable3 = runnable;
            ?? r82 = r1;
            final String[] strArr8 = strArr;
            SeekBar seekBar4 = seekBar;
            final Runnable runnable4 = runnable3;
            final ColorPaletteView colorPaletteView3 = colorPaletteView;
            int i8 = i3;
            final boolean[] zArr2 = zArr;
            SeekBar seekBar5 = seekBar3;
            colorPaletteView3.setListener(new ColorPaletteView.Listener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // com.mr.elaris.InAppSettingsCornerTimeColorPage.ColorPaletteView.Listener
                public void onColorChanged(float f, float f2) {
                    if (zArr2[0]) {
                        return;
                    }
                    float[] fArr = pickerState.hsv;
                    fArr[0] = f;
                    fArr[1] = f2;
                    runnable4.run();
                }
            });
            seekBar4.setOnSeekBarChangeListener(new SimpleSeekListener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar6, int i9, boolean z) {
                    if (zArr2[0]) {
                        return;
                    }
                    pickerState.hsv[2] = i9 / 100.0f;
                    runnable4.run();
                }
            });
            seekBar5.setOnSeekBarChangeListener(new SimpleSeekListener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.6
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar6, int i9, boolean z) {
                    if (zArr2[0]) {
                        return;
                    }
                    pickerState.alpha = i9;
                    runnable4.run();
                }
            });
            ?? horizontalScrollView = new HorizontalScrollView(inAppSettings.activity);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.setFillViewport(true);
            LinearLayout linearLayout4 = new LinearLayout(inAppSettings.activity);
            linearLayout4.setOrientation(0);
            linearLayout4.setGravity(i8);
            int[] iArr = {AbstractC0224g1.f286a, -1, -16777216, Color.rgb(85, 90, 102), Color.rgb(52, 132, 255), Color.rgb(34, 190, 143), Color.rgb(239, 68, 68), Color.rgb(245, 158, 11)};
            int i9 = 0;
            while (i9 < 8) {
                final SeekBar seekBar6 = seekBar5;
                final int i10 = iArr[i9];
                View view = new View(inAppSettings.activity);
                view.setContentDescription("选择颜色 " + colorHex(i10));
                view.setBackground(swatchDrawable(inAppSettings, i10));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(inAppSettings.m139dp(24.0f), inAppSettings.m139dp(24.0f));
                layoutParams3.rightMargin = inAppSettings.m139dp(6.0f);
                linearLayout4.addView(view, layoutParams3);
                final Runnable runnable5 = runnable4;
                final PickerState pickerState2 = pickerState;
                final SeekBar seekBar7 = seekBar4;
                pickerState = pickerState2;
                runnable4 = runnable5;
                view.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.7
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        pickerState2.setColor(i10);
                        zArr2[0] = true;
                        colorPaletteView3.setColor(i10);
                        seekBar7.setProgress(Math.round(pickerState2.hsv[2] * 100.0f));
                        seekBar6.setProgress(pickerState2.alpha);
                        zArr2[0] = false;
                        runnable5.run();
                    }
                });
                i9++;
                seekBar4 = seekBar7;
                zArr2 = zArr2;
                iArr = iArr;
                seekBar5 = seekBar6;
            }
            horizontalScrollView.addView(linearLayout4, new FrameLayout.LayoutParams(-2, inAppSettings.m139dp(24.0f)));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(28.0f));
            layoutParams4.topMargin = inAppSettings.m139dp(4.0f);
            r82.addView(horizontalScrollView, layoutParams4);
            final ?? Create = new AlertDialog.Builder(inAppSettings.activity).create();
            LinearLayout linearLayout5 = new LinearLayout(inAppSettings.activity);
            linearLayout5.setOrientation(0);
            TextView textViewDialogButton = inAppSettings.dialogButton("恢复默认", false);
            TextView textViewDialogButton2 = inAppSettings.dialogButton("取消", false);
            TextView textViewDialogButton3 = inAppSettings.dialogButton("保存", true);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, inAppSettings.m139dp(36.0f), 1.0f);
            linearLayout5.addView(textViewDialogButton, layoutParams5);
            linearLayout5.addView(textViewDialogButton2, layoutParams5);
            linearLayout5.addView(textViewDialogButton3, layoutParams5);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.topMargin = inAppSettings.m139dp(6.0f);
            r82.addView(linearLayout5, layoutParams6);
            ?? scrollView = new ScrollView(inAppSettings.activity);
            scrollView.setFillViewport(true);
            scrollView.addView(r82, new FrameLayout.LayoutParams(-1, -2));
            Create.setView(scrollView, 0, 0, 0, 0);
            Create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.8
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    InAppSettingsCornerTimeColorPage.applyDialogWindow(inAppSettings, Create);
                }
            });
            textViewDialogButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.9
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    inAppSettings.saveString(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME_COLOR, "", false);
                    inAppSettings.saveString(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME_FORMAT, "ah:mm", false);
                    AbstractC0224g1.m414a();
                    AbstractC0429r0.m836p();
                    AbstractC0429r0.m836p();
                    Create.dismiss();
                    inAppSettings.refreshCurrentPage();
                }
            });
            textViewDialogButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.10
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Create.dismiss();
                }
            });
            textViewDialogButton3.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsCornerTimeColorPage.11
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    inAppSettings.saveString(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME_COLOR, InAppSettingsCornerTimeColorPage.colorHex(pickerState.color()), false);
                    inAppSettings.saveString(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME_FORMAT, strArr8[0], false);
                    AbstractC0224g1.m414a();
                    AbstractC0429r0.m836p();
                    AbstractC0429r0.m836p();
                    Create.dismiss();
                    inAppSettings.refreshCurrentPage();
                }
            });
            Create.show();
            applyDialogWindow(inAppSettings, Create);
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("corner time settings dialog failed: "), ": ");
            inAppSettings.toast("时间设置打开失败");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void styleSeekBar(InAppSettings inAppSettings, SeekBar seekBar) {
        try {
            seekBar.setProgressTintList(ColorStateList.valueOf(InAppSettings.BLUE));
            seekBar.setProgressBackgroundTintList(ColorStateList.valueOf(inAppSettings.isDarkUi() ? InAppSettings.STROKE : InAppSettingsSecondaryStyle.SWITCH_OFF_COLOR));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(InAppSettings.BLUE);
            gradientDrawable.setCornerRadius(inAppSettings.m139dp(2.5f));
            gradientDrawable.setSize(inAppSettings.m139dp(5.0f), inAppSettings.m139dp(20.0f));
            seekBar.setThumb(gradientDrawable);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static GradientDrawable swatchDrawable(InAppSettings inAppSettings, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(inAppSettings.m139dp(1.0f), InAppSettings.STROKE);
        return gradientDrawable;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static abstract class SimpleSeekListener implements SeekBar.OnSeekBarChangeListener {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.mr.elaris.InAppSettingsCornerTimeColorPage.SimpleSeekListener.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ SimpleSeekListener(int i) {
            this();
        }

        private SimpleSeekListener() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
