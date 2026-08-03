package p083u;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p034S.RunnableC0328h;
import p063j.C0961f;
import p085v.AbstractC1106g;

/* JADX INFO: renamed from: u.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1094m {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4210a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f4211b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f4212c = new Object();

    /* JADX INFO: renamed from: a */
    public static Typeface m2583a(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return m2584b(context, i2, new TypedValue(), 0, null, false, false);
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m2584b(Context context, int i2, TypedValue typedValue, int i3, AbstractC1083b abstractC1083b, boolean z2, boolean z3) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i2) + "\" (" + Integer.toHexString(i2) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM2604a = null;
        if (string.startsWith("res/")) {
            int i4 = typedValue.assetCookie;
            C0961f c0961f = AbstractC1106g.f4257b;
            Typeface typeface = (Typeface) c0961f.m2313a(AbstractC1106g.m2605b(resources, i2, string, i4, i3));
            if (typeface != null) {
                if (abstractC1083b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0328h(abstractC1083b, typeface, 8));
                }
                typefaceM2604a = typeface;
            } else if (!z3) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC1086e interfaceC1086eM2572h = AbstractC1083b.m2572h(resources.getXml(i2), resources);
                        if (interfaceC1086eM2572h != null) {
                            typefaceM2604a = AbstractC1106g.m2604a(context, interfaceC1086eM2572h, resources, i2, string, typedValue.assetCookie, i3, abstractC1083b, z2);
                        } else if (abstractC1083b != null) {
                            abstractC1083b.m2576a(-3);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceMo2072l = AbstractC1106g.f4256a.mo2072l(context, resources, i2, string, i3);
                        if (typefaceMo2072l != null) {
                            c0961f.m2314b(AbstractC1106g.m2605b(resources, i2, string, i5, i3), typefaceMo2072l);
                        }
                        if (abstractC1083b != null) {
                            if (typefaceMo2072l != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0328h(abstractC1083b, typefaceMo2072l, 8));
                            } else {
                                abstractC1083b.m2576a(-3);
                            }
                        }
                        typefaceM2604a = typefaceMo2072l;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (abstractC1083b != null) {
                        abstractC1083b.m2576a(-3);
                    }
                }
            }
        } else if (abstractC1083b != null) {
            abstractC1083b.m2576a(-3);
        }
        if (typefaceM2604a != null || abstractC1083b != null || z3) {
            return typefaceM2604a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }
}
