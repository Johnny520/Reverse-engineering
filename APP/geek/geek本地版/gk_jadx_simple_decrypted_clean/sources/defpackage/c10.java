package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c10 {
    public static final ThreadLocal a = null;
    public static final WeakHashMap b = null;
    public static final Object c = null;

    static {
        a = new ThreadLocal();
        b = new WeakHashMap(0);
        c = new Object();
    }

    public static Typeface a(Context r7, int r8) {
        if (r7.isRestricted() == false) goto L7;
        return null;
    L7:
        return b(r7, r8, new TypedValue(), 0, null, false, false);
    }

    public static Typeface b(Context r12, int r13, TypedValue r14, int r15, zt r16, boolean r17, boolean r18) {
        Resources r2 = r12.getResources();
        r2.getValue(r13, r14, true);
        CharSequence r0 = r14.string;
        if (r0 == null) goto L48;
        String r4 = r0.toString();
        Typeface r10 = null;
        if (r4.startsWith("res/") == true) goto L8;
        if (r16 == null) goto L40;
        r16.c(-3);
    L40:
        if (r10 != null) goto L46;
        if (r16 != null) goto L46;
        if (r18 == true) goto L46;
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(r13) + " could not be retrieved.");
    L46:
        return r10;
    L8:
        int r02 = r14.assetCookie;
        ds r6 = b80.b;
        Typeface r03 = (Typeface) r6.a(b80.b(r2, r13, r4, r02, r15));
        if (r03 == null) goto L13;
        if (r16 == null) goto L12;
        new Handler(Looper.getMainLooper()).post(new t5(r16, 9, r03));
    L12:
        r10 = r03;
        goto L40
    L13:
        if (r18 == true) goto L40;
    L22:
        e = move-exception;
        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(r4), e);
    L38:
        if (r16 == null) goto L40;
        r16.c(-3);
    L24:
        e = move-exception;
        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(r4), e);
        goto L38
    L16:
        if (r4.toLowerCase().endsWith(".xml") == false) goto L27;
        cl r1 = a80.x(r2.getXml(r13), r2);     // Catch: IOException -> L22 XmlPullParserException -> L24
        if (r1 != null) goto L26;
        Log.e("ResourcesCompat", "Failed to find font-family tag");     // Catch: IOException -> L22 XmlPullParserException -> L24
        if (r16 == null) goto L40;
        r16.c(-3);     // Catch: IOException -> L22 XmlPullParserException -> L24
        goto L40
    L26:
        r10 = b80.a(r12, r1, r2, r13, r4, r14.assetCookie, r15, r16, r17);     // Catch: IOException -> L22 XmlPullParserException -> L24
        goto L40
    L27:
        int r142 = r14.assetCookie;     // Catch: IOException -> L22 XmlPullParserException -> L24
        Typeface r122 = b80.a.i(r12, r2, r13, r4, r15);     // Catch: IOException -> L22 XmlPullParserException -> L24
        if (r122 == null) goto L30;
        r6.b(b80.b(r2, r13, r4, r142, r15), r122);     // Catch: IOException -> L22 XmlPullParserException -> L24
    L30:
        if (r16 == null) goto L33;
        if (r122 == null) goto L34;
        new Handler(Looper.getMainLooper()).post(new t5(r16, 9, r122));     // Catch: IOException -> L22 XmlPullParserException -> L24
        goto L33
    L34:
        r16.c(-3);     // Catch: IOException -> L22 XmlPullParserException -> L24
    L33:
        r10 = r122;
        goto L40
    L48:
        throw new Resources.NotFoundException("Resource \"" + r2.getResourceName(r13) + "\" (" + Integer.toHexString(r13) + ") is not a Font: " + r14);
    }
}
