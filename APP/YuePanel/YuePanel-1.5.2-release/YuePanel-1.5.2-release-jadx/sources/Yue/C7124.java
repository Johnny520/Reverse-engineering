package Yue;

import Yue.C4043;
import Yue.C6944;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.widget.C1629;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۡۦۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class C7124 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f21490 = "ResourceManagerInternal";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f21491 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f21493 = "appcompat_skip_skip";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f21494 = "android.graphics.drawable.VectorDrawable";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static C7124 f21495;

    /* JADX INFO: renamed from: ۥ */
    public WeakHashMap<Context, C7533<ColorStateList>> f2690;

    /* JADX INFO: renamed from: ۥ۟ */
    public C7467<String, InterfaceC7127> f2691;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C7533<String> f21497;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final WeakHashMap<Context, C5885<WeakReference<Drawable.ConstantState>>> f21498 = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public TypedValue f21499;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f21500;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public InterfaceC7128 f21501;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final PorterDuff.Mode f21492 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final C7125 f21496 = new C7125(6);

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۢ$ۥ */
    public static class C1179 implements InterfaceC7127 {
        @Override // Yue.C7124.InterfaceC7127
        /* JADX INFO: renamed from: ۥ */
        public Drawable mo3412(@InterfaceC6391 Context context, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) {
            try {
                return C3229.m6587(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۢ$ۥ۟ */
    public static class C1180 implements InterfaceC7127 {
        @Override // Yue.C7124.InterfaceC7127
        /* JADX INFO: renamed from: ۥ */
        public Drawable mo3412(@InterfaceC6391 Context context, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) {
            try {
                return C3235.m6612(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۢ$ۥ۟۟, reason: contains not printable characters */
    public static class C7125 extends C5891<Integer, PorterDuffColorFilter> {
        public C7125(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static int m22268(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public PorterDuffColorFilter m22269(int i, PorterDuff.Mode mode) {
            return m18256(Integer.valueOf(m22268(i, mode)));
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public PorterDuffColorFilter m22270(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m18260(Integer.valueOf(m22268(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7126 implements InterfaceC7127 {
        @Override // Yue.C7124.InterfaceC7127
        /* JADX INFO: renamed from: ۥ */
        public Drawable mo3412(@InterfaceC6391 Context context, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C7126.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    C4043.C0313.m11460(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC7127 {
        /* JADX INFO: renamed from: ۥ */
        Drawable mo3412(@InterfaceC6391 Context context, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC7128 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo369(@InterfaceC6391 Context context, @InterfaceC4525 int i, @InterfaceC6391 Drawable drawable);

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟ */
        PorterDuff.Mode mo370(int i);

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ */
        ColorStateList mo6751(@InterfaceC6391 Context context, @InterfaceC4525 int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        boolean mo6752(@InterfaceC6391 Context context, @InterfaceC4525 int i, @InterfaceC6391 Drawable drawable);

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        Drawable mo6753(@InterfaceC6391 C7124 c7124, @InterfaceC6391 Context context, @InterfaceC4525 int i);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۢ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C7129 implements InterfaceC7127 {
        @Override // Yue.C7124.InterfaceC7127
        /* JADX INFO: renamed from: ۥ */
        public Drawable mo3412(@InterfaceC6391 Context context, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) {
            try {
                return C8162.m26914(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static long m22246(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static PorterDuffColorFilter m22247(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m22249(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static synchronized C7124 m22248() {
        try {
            if (f21495 == null) {
                C7124 c7124 = new C7124();
                f21495 = c7124;
                m22250(c7124);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f21495;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m22249(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM22269;
        C7125 c7125 = f21496;
        porterDuffColorFilterM22269 = c7125.m22269(i, mode);
        if (porterDuffColorFilterM22269 == null) {
            porterDuffColorFilterM22269 = new PorterDuffColorFilter(i, mode);
            c7125.m22270(i, mode, porterDuffColorFilterM22269);
        }
        return porterDuffColorFilterM22269;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m22250(@InterfaceC6391 C7124 c7124) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m22251(@InterfaceC6391 Drawable drawable) {
        return (drawable instanceof C8162) || f21494.equals(drawable.getClass().getName());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static void m22252(Drawable drawable, C7835 c7835, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d(f21490, "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c7835.f23447;
        if (z || c7835.f23446) {
            drawable.setColorFilter(m22247(z ? c7835.f3108 : null, c7835.f23446 ? c7835.f3109 : f21492, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3410(@InterfaceC6391 String str, @InterfaceC6391 InterfaceC7127 interfaceC7127) {
        if (this.f2691 == null) {
            this.f2691 = new C7467<>();
        }
        this.f2691.put(str, interfaceC7127);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final synchronized boolean m3411(@InterfaceC6391 Context context, long j, @InterfaceC6391 Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C5885<WeakReference<Drawable.ConstantState>> c5885 = this.f21498.get(context);
            if (c5885 == null) {
                c5885 = new C5885<>();
                this.f21498.put(context, c5885);
            }
            c5885.m18222(j, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m22253(@InterfaceC6391 Context context, @InterfaceC4525 int i, @InterfaceC6391 ColorStateList colorStateList) {
        if (this.f2690 == null) {
            this.f2690 = new WeakHashMap<>();
        }
        C7533<ColorStateList> c7533 = this.f2690.get(context);
        if (c7533 == null) {
            c7533 = new C7533<>();
            this.f2690.put(context, c7533);
        }
        c7533.m23556(i, colorStateList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m22254(@InterfaceC6391 Context context) {
        if (this.f21500) {
            return;
        }
        this.f21500 = true;
        Drawable drawableM22257 = m22257(context, C6944.C1120.f2520);
        if (drawableM22257 == null || !m22251(drawableM22257)) {
            this.f21500 = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Drawable m22255(@InterfaceC6391 Context context, @InterfaceC4525 int i) {
        if (this.f21499 == null) {
            this.f21499 = new TypedValue();
        }
        TypedValue typedValue = this.f21499;
        context.getResources().getValue(i, typedValue, true);
        long jM22246 = m22246(typedValue);
        Drawable drawableM22256 = m22256(context, jM22246);
        if (drawableM22256 != null) {
            return drawableM22256;
        }
        InterfaceC7128 interfaceC7128 = this.f21501;
        Drawable drawableMo6753 = interfaceC7128 == null ? null : interfaceC7128.mo6753(this, context, i);
        if (drawableMo6753 != null) {
            drawableMo6753.setChangingConfigurations(typedValue.changingConfigurations);
            m3411(context, jM22246, drawableMo6753);
        }
        return drawableMo6753;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final synchronized Drawable m22256(@InterfaceC6391 Context context, long j) {
        C5885<WeakReference<Drawable.ConstantState>> c5885 = this.f21498.get(context);
        if (c5885 == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceM18216 = c5885.m18216(j);
        if (weakReferenceM18216 != null) {
            Drawable.ConstantState constantState = weakReferenceM18216.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c5885.m18225(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public synchronized Drawable m22257(@InterfaceC6391 Context context, @InterfaceC4525 int i) {
        return m22258(context, i, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public synchronized Drawable m22258(@InterfaceC6391 Context context, @InterfaceC4525 int i, boolean z) {
        Drawable drawableM22262;
        try {
            m22254(context);
            drawableM22262 = m22262(context, i);
            if (drawableM22262 == null) {
                drawableM22262 = m22255(context, i);
            }
            if (drawableM22262 == null) {
                drawableM22262 = C4187.m12065(context, i);
            }
            if (drawableM22262 != null) {
                drawableM22262 = m22266(context, i, z, drawableM22262);
            }
            if (drawableM22262 != null) {
                C4533.m1469(drawableM22262);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM22262;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public synchronized ColorStateList m22259(@InterfaceC6391 Context context, @InterfaceC4525 int i) {
        ColorStateList colorStateListM22260;
        colorStateListM22260 = m22260(context, i);
        if (colorStateListM22260 == null) {
            InterfaceC7128 interfaceC7128 = this.f21501;
            colorStateListM22260 = interfaceC7128 == null ? null : interfaceC7128.mo6751(context, i);
            if (colorStateListM22260 != null) {
                m22253(context, i, colorStateListM22260);
            }
        }
        return colorStateListM22260;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final ColorStateList m22260(@InterfaceC6391 Context context, @InterfaceC4525 int i) {
        C7533<ColorStateList> c7533;
        WeakHashMap<Context, C7533<ColorStateList>> weakHashMap = this.f2690;
        if (weakHashMap == null || (c7533 = weakHashMap.get(context)) == null) {
            return null;
        }
        return c7533.m23563(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public PorterDuff.Mode m22261(int i) {
        InterfaceC7128 interfaceC7128 = this.f21501;
        if (interfaceC7128 == null) {
            return null;
        }
        return interfaceC7128.mo370(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final Drawable m22262(@InterfaceC6391 Context context, @InterfaceC4525 int i) {
        int next;
        C7467<String, InterfaceC7127> c7467 = this.f2691;
        if (c7467 == null || c7467.isEmpty()) {
            return null;
        }
        C7533<String> c7533 = this.f21497;
        if (c7533 != null) {
            String strM23563 = c7533.m23563(i);
            if (f21493.equals(strM23563) || (strM23563 != null && this.f2691.get(strM23563) == null)) {
                return null;
            }
        } else {
            this.f21497 = new C7533<>();
        }
        if (this.f21499 == null) {
            this.f21499 = new TypedValue();
        }
        TypedValue typedValue = this.f21499;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long jM22246 = m22246(typedValue);
        Drawable drawableM22256 = m22256(context, jM22246);
        if (drawableM22256 != null) {
            return drawableM22256;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(C1629.f26368)) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f21497.m23556(i, name);
                InterfaceC7127 interfaceC7127 = this.f2691.get(name);
                if (interfaceC7127 != null) {
                    drawableM22256 = interfaceC7127.mo3412(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM22256 != null) {
                    drawableM22256.setChangingConfigurations(typedValue.changingConfigurations);
                    m3411(context, jM22246, drawableM22256);
                }
            } catch (Exception e) {
                Log.e(f21490, "Exception while inflating drawable", e);
            }
        }
        if (drawableM22256 == null) {
            this.f21497.m23556(i, f21493);
        }
        return drawableM22256;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public synchronized void m22263(@InterfaceC6391 Context context) {
        C5885<WeakReference<Drawable.ConstantState>> c5885 = this.f21498.get(context);
        if (c5885 != null) {
            c5885.m18210();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public synchronized Drawable m22264(@InterfaceC6391 Context context, @InterfaceC6391 C8170 c8170, @InterfaceC4525 int i) {
        try {
            Drawable drawableM22262 = m22262(context, i);
            if (drawableM22262 == null) {
                drawableM22262 = c8170.m3428(i);
            }
            if (drawableM22262 == null) {
                return null;
            }
            return m22266(context, i, false, drawableM22262);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public synchronized void m22265(InterfaceC7128 interfaceC7128) {
        this.f21501 = interfaceC7128;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Drawable m22266(@InterfaceC6391 Context context, @InterfaceC4525 int i, boolean z, @InterfaceC6391 Drawable drawable) {
        ColorStateList colorStateListM22259 = m22259(context, i);
        if (colorStateListM22259 != null) {
            Drawable drawableM13239 = C4520.m13239(drawable.mutate());
            C4520.m13236(drawableM13239, colorStateListM22259);
            PorterDuff.Mode modeM22261 = m22261(i);
            if (modeM22261 == null) {
                return drawableM13239;
            }
            C4520.m13237(drawableM13239, modeM22261);
            return drawableM13239;
        }
        InterfaceC7128 interfaceC7128 = this.f21501;
        if ((interfaceC7128 == null || !interfaceC7128.mo6752(context, i, drawable)) && !m22267(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m22267(@InterfaceC6391 Context context, @InterfaceC4525 int i, @InterfaceC6391 Drawable drawable) {
        InterfaceC7128 interfaceC7128 = this.f21501;
        return interfaceC7128 != null && interfaceC7128.mo369(context, i, drawable);
    }
}
