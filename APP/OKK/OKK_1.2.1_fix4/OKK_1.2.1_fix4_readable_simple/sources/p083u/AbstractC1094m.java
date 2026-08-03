package p083u;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p034S.RunnableC0328h;
import p063j.C0961f;
import p085v.AbstractC1106g;

/* JADX INFO: renamed from: u.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1094m {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4210a = null;

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f4211b = null;

    /* JADX INFO: renamed from: c */
    public static final Object f4212c = null;

    static {
        f4210a = new ThreadLocal();
        f4211b = new WeakHashMap(0);
        f4212c = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m2583a(Context r7, int r8) {
        if (r7.isRestricted() == false) goto L7;
        return null;
    L7:
        return m2584b(r7, r8, new TypedValue(), 0, null, false, false);
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m2584b(Context r15, int r16, TypedValue r17, int r18, AbstractC1083b r19, boolean r20, boolean r21) {
        Resources r7 = r15.getResources();
        r7.getValue(r16, r17, true);
        CharSequence r1 = r17.string;
        if (r1 == null) goto L40;
        String r8 = r1.toString();
        Typeface r11 = null;
        if (r8.startsWith("res/") == true) goto L8;
        if (r19 == null) goto L32;
        r19.m2576a(-3);
    L32:
        if (r11 != null) goto L38;
        if (r19 != null) goto L38;
        if (r21 == true) goto L38;
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(r16) + " could not be retrieved.");
    L38:
        return r11;
    L8:
        int r12 = r17.assetCookie;
        C0961f r13 = AbstractC1106g.f4257b;
        Typeface r14 = (Typeface) r13.m2313a(AbstractC1106g.m2605b(r7, r16, r8, r12, r18));
        if (r14 == null) goto L13;
        if (r19 == null) goto L12;
        new Handler(Looper.getMainLooper()).post(new RunnableC0328h(r19, r14, 8));
    L12:
        r11 = r14;
        goto L32
    L13:
        if (r21 == true) goto L32;
    L30:
        if (r19 == null) goto L32;
        r19.m2576a(-3);
        goto L32
    L16:
        if (r8.toLowerCase().endsWith(".xml") == false) goto L22;
        InterfaceC1086e r110 = AbstractC1083b.m2572h(r7.getXml(r16), r7);     // Catch: Throwable -> L30
        if (r110 != null) goto L21;
        if (r19 == null) goto L32;
        r19.m2576a(-3);     // Catch: Throwable -> L30
        goto L32
    L21:
        r11 = AbstractC1106g.m2604a(r15, r110, r7, r16, r8, r17.assetCookie, r18, r19, r20);     // Catch: Throwable -> L30
        goto L32
    L22:
        int r142 = r17.assetCookie;     // Catch: Throwable -> L30
        Typeface r02 = AbstractC1106g.f4256a.mo2072l(r15, r7, r16, r8, r18);     // Catch: Throwable -> L30
        if (r02 == null) goto L25;
        r13.m2314b(AbstractC1106g.m2605b(r7, r16, r8, r142, r18), r02);     // Catch: Throwable -> L30
    L25:
        if (r19 == null) goto L29;
        if (r02 == null) goto L28;
        new Handler(Looper.getMainLooper()).post(new RunnableC0328h(r19, r02, 8));     // Catch: Throwable -> L30
        goto L29
    L28:
        r19.m2576a(-3);     // Catch: Throwable -> L30
    L29:
        r11 = r02;
        goto L32
    L40:
        throw new Resources.NotFoundException("Resource \"" + r7.getResourceName(r16) + "\" (" + Integer.toHexString(r16) + ") is not a Font: " + r17);
    }
}
