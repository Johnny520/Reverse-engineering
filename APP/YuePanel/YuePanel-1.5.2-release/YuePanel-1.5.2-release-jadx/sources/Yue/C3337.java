package Yue;

import Yue.C6898;
import Yue.C7130;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3337 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f5264 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f5265 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f5266 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f5267 = 3;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final TextView f231;

    /* JADX INFO: renamed from: ۥ۟ */
    public C7835 f232;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C7835 f5268;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C7835 f5269;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C7835 f5270;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C7835 f5271;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C7835 f5272;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C7835 f5273;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final C3346 f5274;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f5275 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f5276 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Typeface f5277;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean f5278;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ */
    public class C0111 extends C7130.AbstractC7134 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ int f233;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ int f234;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ WeakReference f5279;

        public C0111(int i, int i2, WeakReference weakReference) {
            this.f233 = i;
            this.f234 = i2;
            this.f5279 = weakReference;
        }

        @Override // Yue.C7130.AbstractC7134
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public void m22286(int i) {
        }

        @Override // Yue.C7130.AbstractC7134
        /* JADX INFO: renamed from: onFontRetrieved */
        public void m22287(@InterfaceC6391 Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f233) != -1) {
                typeface = C3341.m416(typeface, i, (this.f234 & 2) != 0);
            }
            C3337.this.m6820(this.f5279, typeface);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ۟ */
    public class RunnableC0112 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ TextView f5281;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Typeface f5282;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ int f5283;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC0112(TextView textView, Typeface typeface, int i) {
            this.f5281 = textView;
            this.f5282 = typeface;
            this.f5283 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5281.setTypeface(this.f5282, this.f5283);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(21)
    public static class C3338 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Locale m411(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C3339 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static LocaleList m412(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m413(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C3340 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m414(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m415(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m6836(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m6837(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C3341 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Typeface m416(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C3337(@InterfaceC6391 TextView textView) {
        this.f231 = textView;
        this.f5274 = new C3346(textView);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C7835 m6809(Context context, C3304 c3304, int i) {
        ColorStateList colorStateListM6747 = c3304.m6747(context, i);
        if (colorStateListM6747 == null) {
            return null;
        }
        C7835 c7835 = new C7835();
        c7835.f23447 = true;
        c7835.f3108 = colorStateListM6747;
        return c7835;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m409(Drawable drawable, C7835 c7835) {
        if (drawable == null || c7835 == null) {
            return;
        }
        C3304.m6744(drawable, c7835, this.f231.getDrawableState());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m410() {
        if (this.f232 != null || this.f5268 != null || this.f5269 != null || this.f5270 != null) {
            Drawable[] compoundDrawables = this.f231.getCompoundDrawables();
            m409(compoundDrawables[0], this.f232);
            m409(compoundDrawables[1], this.f5268);
            m409(compoundDrawables[2], this.f5269);
            m409(compoundDrawables[3], this.f5270);
        }
        if (this.f5271 == null && this.f5272 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f231.getCompoundDrawablesRelative();
        m409(compoundDrawablesRelative[0], this.f5271);
        m409(compoundDrawablesRelative[2], this.f5272);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m6810() {
        this.f5274.m421();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m6811() {
        return this.f5274.m6847();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m6812() {
        return this.f5274.m6848();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m6813() {
        return this.f5274.m6849();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int[] m6814() {
        return this.f5274.m6850();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m6815() {
        return this.f5274.m6851();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public ColorStateList m6816() {
        C7835 c7835 = this.f5273;
        if (c7835 != null) {
            return c7835.f3108;
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public PorterDuff.Mode m6817() {
        C7835 c7835 = this.f5273;
        if (c7835 != null) {
            return c7835.f3109;
        }
        return null;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m6818() {
        return this.f5274.m6853();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m6819(@InterfaceC6490 AttributeSet attributeSet, int i) {
        boolean zM3933;
        boolean z;
        String strM24890;
        String strM248902;
        float fM24874;
        int iM25332;
        Context context = this.f231.getContext();
        C3304 c3304M368 = C3304.m368();
        C7837 c7837M24869 = C7837.m24869(context, attributeSet, C6898.C6909.f19430, i, 0);
        TextView textView = this.f231;
        C8273.m27437(textView, textView.getContext(), C6898.C6909.f19430, attributeSet, c7837M24869.m24895(), i, 0);
        int iM24888 = c7837M24869.m24888(C6898.C6909.f19431, -1);
        if (c7837M24869.m24896(C6898.C6909.f19434)) {
            this.f232 = m6809(context, c3304M368, c7837M24869.m24888(C6898.C6909.f19434, 0));
        }
        if (c7837M24869.m24896(C6898.C6909.f19432)) {
            this.f5268 = m6809(context, c3304M368, c7837M24869.m24888(C6898.C6909.f19432, 0));
        }
        if (c7837M24869.m24896(C6898.C6909.f19435)) {
            this.f5269 = m6809(context, c3304M368, c7837M24869.m24888(C6898.C6909.f19435, 0));
        }
        if (c7837M24869.m24896(C6898.C6909.f19433)) {
            this.f5270 = m6809(context, c3304M368, c7837M24869.m24888(C6898.C6909.f19433, 0));
        }
        if (c7837M24869.m24896(C6898.C6909.f19436)) {
            this.f5271 = m6809(context, c3304M368, c7837M24869.m24888(C6898.C6909.f19436, 0));
        }
        if (c7837M24869.m24896(C6898.C6909.f19437)) {
            this.f5272 = m6809(context, c3304M368, c7837M24869.m24888(C6898.C6909.f19437, 0));
        }
        c7837M24869.m24899();
        boolean z2 = this.f231.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z3 = true;
        if (iM24888 != -1) {
            C7837 c7837M24867 = C7837.m24867(context, iM24888, C6898.C6909.f19729);
            if (z2 || !c7837M24867.m24896(C6898.C6909.f19744)) {
                zM3933 = false;
                z = false;
            } else {
                zM3933 = c7837M24867.m3933(C6898.C6909.f19744, false);
                z = true;
            }
            m6835(context, c7837M24867);
            strM24890 = c7837M24867.m24896(C6898.C6909.f19745) ? c7837M24867.m24890(C6898.C6909.f19745) : null;
            strM248902 = c7837M24867.m24896(C6898.C6909.f19743) ? c7837M24867.m24890(C6898.C6909.f19743) : null;
            c7837M24867.m24899();
        } else {
            zM3933 = false;
            z = false;
            strM24890 = null;
            strM248902 = null;
        }
        C7837 c7837M248692 = C7837.m24869(context, attributeSet, C6898.C6909.f19729, i, 0);
        if (z2 || !c7837M248692.m24896(C6898.C6909.f19744)) {
            z3 = z;
        } else {
            zM3933 = c7837M248692.m3933(C6898.C6909.f19744, false);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (c7837M248692.m24896(C6898.C6909.f19745)) {
            strM24890 = c7837M248692.m24890(C6898.C6909.f19745);
        }
        if (c7837M248692.m24896(C6898.C6909.f19743)) {
            strM248902 = c7837M248692.m24890(C6898.C6909.f19743);
        }
        if (i2 >= 28 && c7837M248692.m24896(C6898.C6909.f19730) && c7837M248692.m24874(C6898.C6909.f19730, -1) == 0) {
            this.f231.setTextSize(0, 0.0f);
        }
        m6835(context, c7837M248692);
        c7837M248692.m24899();
        if (!z2 && z3) {
            m6825(zM3933);
        }
        Typeface typeface = this.f5277;
        if (typeface != null) {
            if (this.f5276 == -1) {
                this.f231.setTypeface(typeface, this.f5275);
            } else {
                this.f231.setTypeface(typeface);
            }
        }
        if (strM248902 != null) {
            C3340.m6837(this.f231, strM248902);
        }
        if (strM24890 != null) {
            C3339.m413(this.f231, C3339.m412(strM24890));
        }
        this.f5274.m6854(attributeSet, i);
        if (C8370.f24972 && this.f5274.m6851() != 0) {
            int[] iArrM6850 = this.f5274.m6850();
            if (iArrM6850.length > 0) {
                if (C3340.m414(this.f231) != -1.0f) {
                    C3340.m415(this.f231, this.f5274.m6848(), this.f5274.m6847(), this.f5274.m6849(), 0);
                } else {
                    C3340.m6836(this.f231, iArrM6850, 0);
                }
            }
        }
        C7837 c7837M24868 = C7837.m24868(context, attributeSet, C6898.C6909.f19438);
        int iM248882 = c7837M24868.m24888(C6898.C6909.f19447, -1);
        Drawable drawableM6745 = iM248882 != -1 ? c3304M368.m6745(context, iM248882) : null;
        int iM248883 = c7837M24868.m24888(C6898.C6909.f19452, -1);
        Drawable drawableM67452 = iM248883 != -1 ? c3304M368.m6745(context, iM248883) : null;
        int iM248884 = c7837M24868.m24888(C6898.C6909.f19448, -1);
        Drawable drawableM67453 = iM248884 != -1 ? c3304M368.m6745(context, iM248884) : null;
        int iM248885 = c7837M24868.m24888(C6898.C6909.f19445, -1);
        Drawable drawableM67454 = iM248885 != -1 ? c3304M368.m6745(context, iM248885) : null;
        int iM248886 = c7837M24868.m24888(C6898.C6909.f19449, -1);
        Drawable drawableM67455 = iM248886 != -1 ? c3304M368.m6745(context, iM248886) : null;
        int iM248887 = c7837M24868.m24888(C6898.C6909.f19446, -1);
        m6831(drawableM6745, drawableM67452, drawableM67453, drawableM67454, drawableM67455, iM248887 != -1 ? c3304M368.m6745(context, iM248887) : null);
        if (c7837M24868.m24896(C6898.C6909.f19450)) {
            C7759.m24665(this.f231, c7837M24868.m24871(C6898.C6909.f19450));
        }
        if (c7837M24868.m24896(C6898.C6909.f19451)) {
            C7759.m24666(this.f231, C4533.m13289(c7837M24868.m24882(C6898.C6909.f19451, -1), null));
        }
        int iM24874 = c7837M24868.m24874(C6898.C6909.f19454, -1);
        int iM248742 = c7837M24868.m24874(C6898.C6909.f19457, -1);
        if (c7837M24868.m24896(C6898.C6909.f19458)) {
            TypedValue typedValueM24898 = c7837M24868.m24898(C6898.C6909.f19458);
            if (typedValueM24898 != null && typedValueM24898.type == 5) {
                iM25332 = C8022.m25332(typedValueM24898.data);
                fM24874 = TypedValue.complexToFloat(typedValueM24898.data);
                c7837M24868.m24899();
                if (iM24874 != -1) {
                    C7759.m24671(this.f231, iM24874);
                }
                if (iM248742 != -1) {
                    C7759.m24672(this.f231, iM248742);
                }
                if (fM24874 == -1.0f) {
                    if (iM25332 == -1) {
                        C7759.m24673(this.f231, (int) fM24874);
                        return;
                    } else {
                        C7759.m24674(this.f231, iM25332, fM24874);
                        return;
                    }
                }
                return;
            }
            fM24874 = c7837M24868.m24874(C6898.C6909.f19458, -1);
        } else {
            fM24874 = -1.0f;
        }
        iM25332 = -1;
        c7837M24868.m24899();
        if (iM24874 != -1) {
        }
        if (iM248742 != -1) {
        }
        if (fM24874 == -1.0f) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m6820(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f5278) {
            this.f5277 = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0112(textView, typeface, this.f5275));
                } else {
                    textView.setTypeface(typeface, this.f5275);
                }
            }
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m6821(boolean z, int i, int i2, int i3, int i4) {
        if (C8370.f24972) {
            return;
        }
        m6810();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m6822() {
        m410();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m6823(Context context, int i) {
        String strM24890;
        C7837 c7837M24867 = C7837.m24867(context, i, C6898.C6909.f19729);
        if (c7837M24867.m24896(C6898.C6909.f19744)) {
            m6825(c7837M24867.m3933(C6898.C6909.f19744, false));
        }
        if (c7837M24867.m24896(C6898.C6909.f19730) && c7837M24867.m24874(C6898.C6909.f19730, -1) == 0) {
            this.f231.setTextSize(0, 0.0f);
        }
        m6835(context, c7837M24867);
        if (c7837M24867.m24896(C6898.C6909.f19743) && (strM24890 = c7837M24867.m24890(C6898.C6909.f19743)) != null) {
            C3340.m6837(this.f231, strM24890);
        }
        c7837M24867.m24899();
        Typeface typeface = this.f5277;
        if (typeface != null) {
            this.f231.setTypeface(typeface, this.f5275);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m6824(@InterfaceC6391 TextView textView, @InterfaceC6490 InputConnection inputConnection, @InterfaceC6391 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C4597.m13663(editorInfo, textView.getText());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m6825(boolean z) {
        this.f231.setAllCaps(z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m6826(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f5274.m6855(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m6827(@InterfaceC6391 int[] iArr, int i) throws IllegalArgumentException {
        this.f5274.m6856(iArr, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m6828(int i) {
        this.f5274.m6857(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m6829(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.f5273 == null) {
            this.f5273 = new C7835();
        }
        C7835 c7835 = this.f5273;
        c7835.f3108 = colorStateList;
        c7835.f23447 = colorStateList != null;
        m6832();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m6830(@InterfaceC6490 PorterDuff.Mode mode) {
        if (this.f5273 == null) {
            this.f5273 = new C7835();
        }
        C7835 c7835 = this.f5273;
        c7835.f3109 = mode;
        c7835.f23446 = mode != null;
        m6832();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m6831(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f231.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f231;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f231.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f231.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f231.getCompoundDrawables();
        TextView textView2 = this.f231;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m6832() {
        C7835 c7835 = this.f5273;
        this.f232 = c7835;
        this.f5268 = c7835;
        this.f5269 = c7835;
        this.f5270 = c7835;
        this.f5271 = c7835;
        this.f5272 = c7835;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m6833(int i, float f) {
        if (C8370.f24972 || m6818()) {
            return;
        }
        m6834(i, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m6834(int i, float f) {
        this.f5274.m6859(i, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m6835(Context context, C7837 c7837) {
        String strM24890;
        this.f5275 = c7837.m24882(C6898.C6909.f19732, this.f5275);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iM24882 = c7837.m24882(C6898.C6909.f19741, -1);
            this.f5276 = iM24882;
            if (iM24882 != -1) {
                this.f5275 &= 2;
            }
        }
        if (!c7837.m24896(C6898.C6909.f19740) && !c7837.m24896(C6898.C6909.f19742)) {
            if (c7837.m24896(C6898.C6909.f19731)) {
                this.f5278 = false;
                int iM248822 = c7837.m24882(C6898.C6909.f19731, 1);
                if (iM248822 == 1) {
                    this.f5277 = Typeface.SANS_SERIF;
                    return;
                } else if (iM248822 == 2) {
                    this.f5277 = Typeface.SERIF;
                    return;
                } else {
                    if (iM248822 != 3) {
                        return;
                    }
                    this.f5277 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f5277 = null;
        int i2 = c7837.m24896(C6898.C6909.f19742) ? C6898.C6909.f19742 : C6898.C6909.f19740;
        int i3 = this.f5276;
        int i4 = this.f5275;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM24878 = c7837.m24878(i2, this.f5275, new C0111(i3, i4, new WeakReference(this.f231)));
                if (typefaceM24878 != null) {
                    if (i < 28 || this.f5276 == -1) {
                        this.f5277 = typefaceM24878;
                    } else {
                        this.f5277 = C3341.m416(Typeface.create(typefaceM24878, 0), this.f5276, (this.f5275 & 2) != 0);
                    }
                }
                this.f5278 = this.f5277 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f5277 != null || (strM24890 = c7837.m24890(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f5276 == -1) {
            this.f5277 = Typeface.create(strM24890, this.f5275);
        } else {
            this.f5277 = C3341.m416(Typeface.create(strM24890, 0), this.f5276, (this.f5275 & 2) != 0);
        }
    }
}
