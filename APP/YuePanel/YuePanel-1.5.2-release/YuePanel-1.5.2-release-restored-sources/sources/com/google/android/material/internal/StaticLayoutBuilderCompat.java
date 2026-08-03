package com.google.android.material.internal;

import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
final class StaticLayoutBuilderCompat {
    static final int DEFAULT_HYPHENATION_FREQUENCY = 1;
    static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    private static final String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final String TEXT_DIR_CLASS_LTR = "LTR";
    private static final String TEXT_DIR_CLASS_RTL = "RTL";

    @InterfaceC6490
    private static Constructor<StaticLayout> constructor;
    private static boolean initialized;

    @InterfaceC6490
    private static Object textDirection;
    private int end;
    private boolean isRtl;
    private final TextPaint paint;
    private CharSequence source;

    @InterfaceC6490
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private final int width;
    private int start = 0;
    private Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
    private int maxLines = Integer.MAX_VALUE;
    private float lineSpacingAdd = 0.0f;
    private float lineSpacingMultiplier = 1.0f;
    private int hyphenationFrequency = DEFAULT_HYPHENATION_FREQUENCY;
    private boolean includePad = true;

    @InterfaceC6490
    private TextUtils.TruncateAt ellipsize = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.source = charSequence;
        this.paint = textPaint;
        this.width = i;
        this.end = charSequence.length();
    }

    private void createConstructorWithReflection() throws StaticLayoutBuilderCompatException {
        if (initialized) {
            return;
        }
        try {
            textDirection = this.isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            constructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            initialized = true;
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    @InterfaceC6391
    public static StaticLayoutBuilderCompat obtain(@InterfaceC6391 CharSequence charSequence, @InterfaceC6391 TextPaint textPaint, @InterfaceC5459(from = 0) int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    public StaticLayout build() throws StaticLayoutBuilderCompatException {
        if (this.source == null) {
            this.source = "";
        }
        int iMax = Math.max(0, this.width);
        CharSequence charSequenceEllipsize = this.source;
        if (this.maxLines == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.paint, iMax, this.ellipsize);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.end);
        this.end = iMin;
        if (this.isRtl && this.maxLines == 1) {
            this.alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.start, iMin, this.paint, iMax);
        builderObtain.setAlignment(this.alignment);
        builderObtain.setIncludePad(this.includePad);
        builderObtain.setTextDirection(this.isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.ellipsize;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.maxLines);
        float f = this.lineSpacingAdd;
        if (f != 0.0f || this.lineSpacingMultiplier != 1.0f) {
            builderObtain.setLineSpacing(f, this.lineSpacingMultiplier);
        }
        if (this.maxLines > 1) {
            builderObtain.setHyphenationFrequency(this.hyphenationFrequency);
        }
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.staticLayoutBuilderConfigurer;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.configure(builderObtain);
        }
        return builderObtain.build();
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setAlignment(@InterfaceC6391 Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setEllipsize(@InterfaceC6490 TextUtils.TruncateAt truncateAt) {
        this.ellipsize = truncateAt;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setEnd(@InterfaceC5459(from = 0) int i) {
        this.end = i;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setHyphenationFrequency(int i) {
        this.hyphenationFrequency = i;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setIncludePad(boolean z) {
        this.includePad = z;
        return this;
    }

    public StaticLayoutBuilderCompat setIsRtl(boolean z) {
        this.isRtl = z;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setLineSpacing(float f, float f2) {
        this.lineSpacingAdd = f;
        this.lineSpacingMultiplier = f2;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setMaxLines(@InterfaceC5459(from = 0) int i) {
        this.maxLines = i;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setStart(@InterfaceC5459(from = 0) int i) {
        this.start = i;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(@InterfaceC6490 StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
        return this;
    }
}
