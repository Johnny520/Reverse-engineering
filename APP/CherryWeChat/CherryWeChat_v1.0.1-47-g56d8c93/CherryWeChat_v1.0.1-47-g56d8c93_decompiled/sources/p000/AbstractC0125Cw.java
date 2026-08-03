package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Cw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0125Cw {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f295a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f296b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f297c = new Object();

    /* JADX INFO: renamed from: a */
    public static Typeface m201a(Context context, int i, TypedValue typedValue, int i2, AbstractC0585Nj abstractC0585Nj, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM1707a = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C0161Dp c0161Dp = AbstractC0871UB.f2755b;
            Typeface typeface = (Typeface) c0161Dp.m307f(AbstractC0871UB.m1708b(resources, i, string, i3, i2));
            if (typeface != null) {
                if (abstractC0585Nj != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(15, abstractC0585Nj, typeface));
                }
                typefaceM1707a = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC0883Uh interfaceC0883UhM2535N = AbstractC1293cr.m2535N(resources.getXml(i), resources);
                        if (interfaceC0883UhM2535N != null) {
                            typefaceM1707a = AbstractC0871UB.m1707a(context, interfaceC0883UhM2535N, resources, i, string, typedValue.assetCookie, i2, abstractC0585Nj, z);
                        } else if (abstractC0585Nj != null) {
                            abstractC0585Nj.m1161c(-3);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceMo1764t = AbstractC0871UB.f2754a.mo1764t(context, resources, i, string, i2);
                        if (typefaceMo1764t != null) {
                            c0161Dp.m311j(AbstractC0871UB.m1708b(resources, i, string, i4, i2), typefaceMo1764t);
                        }
                        if (abstractC0585Nj != null) {
                            if (typefaceMo1764t != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(15, abstractC0585Nj, typefaceMo1764t));
                            } else {
                                abstractC0585Nj.m1161c(-3);
                            }
                        }
                        typefaceM1707a = typefaceMo1764t;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (abstractC0585Nj != null) {
                        abstractC0585Nj.m1161c(-3);
                    }
                }
            }
        } else if (abstractC0585Nj != null) {
            abstractC0585Nj.m1161c(-3);
        }
        if (typefaceM1707a != null || abstractC0585Nj != null || z2) {
            return typefaceM1707a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
