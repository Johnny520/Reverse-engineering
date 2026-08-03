package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p000a.C0332S6;

/* JADX INFO: renamed from: a.qd */
/* JADX INFO: loaded from: classes.dex */
public final class C0787qd {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f3107a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap<d, SparseArray<c>> f3108b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public static final Object f3109c = new Object();

    /* JADX INFO: renamed from: a.qd$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Drawable m1839a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* JADX INFO: renamed from: b */
        public static Drawable m1840b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* JADX INFO: renamed from: a.qd$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static int m1841a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* JADX INFO: renamed from: b */
        public static ColorStateList m1842b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* JADX INFO: renamed from: a.qd$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final ColorStateList f3110a;

        /* JADX INFO: renamed from: b */
        public final Configuration f3111b;

        /* JADX INFO: renamed from: c */
        public final int f3112c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f3110a = colorStateList;
            this.f3111b = configuration;
            this.f3112c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: a.qd$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final Resources f3113a;

        /* JADX INFO: renamed from: b */
        public final Resources.Theme f3114b;

        public d(Resources resources, Resources.Theme theme) {
            this.f3113a = resources;
            this.f3114b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f3113a.equals(dVar.f3113a) && Objects.equals(this.f3114b, dVar.f3114b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f3113a, this.f3114b);
        }
    }

    /* JADX INFO: renamed from: a.qd$e */
    public static abstract class e {
        /* JADX INFO: renamed from: a */
        public final void m1843a(int i) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0806rd(this, i, 0));
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo1036b(int i);

        /* JADX INFO: renamed from: c */
        public abstract void mo1037c(Typeface typeface);
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m1837a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m1838b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m1838b(Context context, int i, TypedValue typedValue, int i2, e eVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM626a = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C0407W9<String, Typeface> c0407w9 = C0234Mf.f778b;
            Typeface typefaceM1052a = c0407w9.m1052a(C0234Mf.m627b(resources, i, string, i3, i2));
            if (typefaceM1052a != null) {
                if (eVar != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0273P0(eVar, 14, typefaceM1052a));
                }
                typefaceM626a = typefaceM1052a;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        C0332S6.b bVarM916a = C0332S6.m916a(resources.getXml(i), resources);
                        if (bVarM916a == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (eVar != null) {
                                eVar.m1843a(-3);
                            }
                        } else {
                            typefaceM626a = C0234Mf.m626a(context, bVarM916a, resources, i, string, typedValue.assetCookie, i2, eVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceMo754c = C0234Mf.f777a.mo754c(context, resources, i, string, i2);
                        if (typefaceMo754c != null) {
                            c0407w9.m1053b(C0234Mf.m627b(resources, i, string, i4, i2), typefaceMo754c);
                        }
                        if (eVar != null) {
                            if (typefaceMo754c != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0273P0(eVar, 14, typefaceMo754c));
                            } else {
                                eVar.m1843a(-3);
                            }
                        }
                        typefaceM626a = typefaceMo754c;
                    }
                } catch (IOException e2) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e2);
                    if (eVar != null) {
                        eVar.m1843a(-3);
                    }
                } catch (XmlPullParserException e3) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e3);
                    if (eVar != null) {
                    }
                }
            }
        } else if (eVar != null) {
            eVar.m1843a(-3);
        }
        if (typefaceM626a != null || eVar != null || z2) {
            return typefaceM626a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
