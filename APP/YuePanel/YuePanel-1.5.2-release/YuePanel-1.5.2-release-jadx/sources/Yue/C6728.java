package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: Yue.ۥۡۤۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6728 implements Spannable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final char f17317 = '\n';

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final Object f17318 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6391
    @InterfaceC5225("sLock")
    public static Executor f17319;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6391
    public final Spannable f17320;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6391
    public final C1075 f17321;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6391
    public final int[] f17322;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6490
    public final PrecomputedText f17323;

    /* JADX INFO: renamed from: Yue.ۥۡۤۦ۟$ۥ */
    @InterfaceC7113(28)
    public static class C1074 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Spannable m3211(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۦ۟$ۥ۟۟, reason: contains not printable characters */
    public static class C6730 extends FutureTask<C6728> {

        /* JADX INFO: renamed from: Yue.ۥۡۤۦ۟$ۥ۟۟$ۥ */
        public static class CallableC1076 implements Callable<C6728> {

            /* JADX INFO: renamed from: ۥ */
            public C1075 f2267;

            /* JADX INFO: renamed from: ۥ۟ */
            public CharSequence f2268;

            public CallableC1076(@InterfaceC6391 C1075 c1075, @InterfaceC6391 CharSequence charSequence) {
                this.f2267 = c1075;
                this.f2268 = charSequence;
            }

            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C6728 call() throws Exception {
                return C6728.m3209(this.f2268, this.f2267);
            }
        }

        public C6730(@InterfaceC6391 C1075 c1075, @InterfaceC6391 CharSequence charSequence) {
            super(new CallableC1076(c1075, charSequence));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6728(@InterfaceC6391 CharSequence charSequence, @InterfaceC6391 C1075 c1075, @InterfaceC6391 int[] iArr) {
        this.f17320 = new SpannableString(charSequence);
        this.f17321 = c1075;
        this.f17322 = iArr;
        this.f17323 = null;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ */
    public static C6728 m3209(@InterfaceC6391 CharSequence charSequence, @InterfaceC6391 C1075 c1075) {
        PrecomputedText.Params params;
        C6740.m21415(charSequence);
        C6740.m21415(c1075);
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = c1075.f17326) != null) {
                return new C6728(PrecomputedText.create(charSequence, params), c1075);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                i = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), c1075.m21403(), Integer.MAX_VALUE).setBreakStrategy(c1075.m3213()).setHyphenationFrequency(c1075.m21401()).setTextDirection(c1075.m21402()).build();
            return new C6728(charSequence, c1075, iArr);
        } finally {
            Trace.endSection();
        }
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Future<C6728> m21396(@InterfaceC6391 CharSequence charSequence, @InterfaceC6391 C1075 c1075, @InterfaceC6490 Executor executor) {
        C6730 c6730 = new C6730(c1075, charSequence);
        if (executor == null) {
            synchronized (f17318) {
                try {
                    if (f17319 == null) {
                        f17319 = Executors.newFixedThreadPool(1);
                    }
                    executor = f17319;
                } finally {
                }
            }
        }
        executor.execute(c6730);
        return c6730;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f17320.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f17320.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f17320.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f17320.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f17323.getSpans(i, i2, cls) : (T[]) this.f17320.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f17320.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f17320.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f17323.removeSpan(obj);
        } else {
            this.f17320.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f17323.setSpan(obj, i, i2, i3);
        } else {
            this.f17320.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f17320.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @InterfaceC6391
    public String toString() {
        return this.f17320.toString();
    }

    @InterfaceC5459(from = 0)
    /* JADX INFO: renamed from: ۥ۟ */
    public int m3210() {
        return Build.VERSION.SDK_INT >= 29 ? this.f17323.getParagraphCount() : this.f17322.length;
    }

    @InterfaceC5459(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m21397(@InterfaceC5459(from = 0) int i) {
        C6740.m21410(i, 0, m3210(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f17323.getParagraphEnd(i) : this.f17322[i];
    }

    @InterfaceC5459(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m21398(@InterfaceC5459(from = 0) int i) {
        C6740.m21410(i, 0, m3210(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f17323.getParagraphStart(i);
        }
        if (i == 0) {
            return 0;
        }
        return this.f17322[i - 1];
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C1075 m21399() {
        return this.f17321;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    @InterfaceC7113(28)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public PrecomputedText m21400() {
        if (C6720.m3201(this.f17320)) {
            return C6721.m3202(this.f17320);
        }
        return null;
    }

    @InterfaceC7113(28)
    public C6728(@InterfaceC6391 PrecomputedText precomputedText, @InterfaceC6391 C1075 c1075) {
        this.f17320 = C1074.m3211(precomputedText);
        this.f17321 = c1075;
        this.f17322 = null;
        this.f17323 = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۦ۟$ۥ۟ */
    public static final class C1075 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final TextPaint f2263;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public final TextDirectionHeuristic f2264;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f17324;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int f17325;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final PrecomputedText.Params f17326;

        /* JADX INFO: renamed from: Yue.ۥۡۤۦ۟$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C6729 {

            /* JADX INFO: renamed from: ۥ */
            @InterfaceC6391
            public final TextPaint f2265;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int f17327 = 1;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f17328 = 1;

            /* JADX INFO: renamed from: ۥ۟ */
            public TextDirectionHeuristic f2266 = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C6729(@InterfaceC6391 TextPaint textPaint) {
                this.f2265 = textPaint;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ */
            public C1075 m3214() {
                return new C1075(this.f2265, this.f2266, this.f17327, this.f17328);
            }

            @InterfaceC7113(23)
            /* JADX INFO: renamed from: ۥ۟ */
            public C6729 m3215(int i) {
                this.f17327 = i;
                return this;
            }

            @InterfaceC7113(23)
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public C6729 m21404(int i) {
                this.f17328 = i;
                return this;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public C6729 m21405(@InterfaceC6391 TextDirectionHeuristic textDirectionHeuristic) {
                this.f2266 = textDirectionHeuristic;
                return this;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1075(@InterfaceC6391 TextPaint textPaint, @InterfaceC6391 TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f17326 = C6739.m3225(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f17326 = null;
            }
            this.f2263 = textPaint;
            this.f2264 = textDirectionHeuristic;
            this.f17324 = i;
            this.f17325 = i2;
        }

        public boolean equals(@InterfaceC6490 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1075)) {
                return false;
            }
            C1075 c1075 = (C1075) obj;
            return m3212(c1075) && this.f2264 == c1075.m21402();
        }

        public int hashCode() {
            return C6499.m2996(Float.valueOf(this.f2263.getTextSize()), Float.valueOf(this.f2263.getTextScaleX()), Float.valueOf(this.f2263.getTextSkewX()), Float.valueOf(this.f2263.getLetterSpacing()), Integer.valueOf(this.f2263.getFlags()), this.f2263.getTextLocales(), this.f2263.getTypeface(), Boolean.valueOf(this.f2263.isElegantTextHeight()), this.f2264, Integer.valueOf(this.f17324), Integer.valueOf(this.f17325));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2263.getTextSize());
            sb.append(", textScaleX=" + this.f2263.getTextScaleX());
            sb.append(", textSkewX=" + this.f2263.getTextSkewX());
            sb.append(", letterSpacing=" + this.f2263.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f2263.isElegantTextHeight());
            sb.append(", textLocale=" + this.f2263.getTextLocales());
            sb.append(", typeface=" + this.f2263.getTypeface());
            sb.append(", variationSettings=" + this.f2263.getFontVariationSettings());
            sb.append(", textDir=" + this.f2264);
            sb.append(", breakStrategy=" + this.f17324);
            sb.append(", hyphenationFrequency=" + this.f17325);
            sb.append("}");
            return sb.toString();
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ */
        public boolean m3212(@InterfaceC6391 C1075 c1075) {
            if (this.f17324 == c1075.m3213() && this.f17325 == c1075.m21401() && this.f2263.getTextSize() == c1075.m21403().getTextSize() && this.f2263.getTextScaleX() == c1075.m21403().getTextScaleX() && this.f2263.getTextSkewX() == c1075.m21403().getTextSkewX() && this.f2263.getLetterSpacing() == c1075.m21403().getLetterSpacing() && TextUtils.equals(this.f2263.getFontFeatureSettings(), c1075.m21403().getFontFeatureSettings()) && this.f2263.getFlags() == c1075.m21403().getFlags() && this.f2263.getTextLocales().equals(c1075.m21403().getTextLocales())) {
                return this.f2263.getTypeface() == null ? c1075.m21403().getTypeface() == null : this.f2263.getTypeface().equals(c1075.m21403().getTypeface());
            }
            return false;
        }

        @InterfaceC7113(23)
        /* JADX INFO: renamed from: ۥ۟ */
        public int m3213() {
            return this.f17324;
        }

        @InterfaceC7113(23)
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m21401() {
            return this.f17325;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public TextDirectionHeuristic m21402() {
            return this.f2264;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public TextPaint m21403() {
            return this.f2263;
        }

        @InterfaceC7113(28)
        public C1075(@InterfaceC6391 PrecomputedText.Params params) {
            this.f2263 = params.getTextPaint();
            this.f2264 = params.getTextDirection();
            this.f17324 = params.getBreakStrategy();
            this.f17325 = params.getHyphenationFrequency();
            this.f17326 = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
