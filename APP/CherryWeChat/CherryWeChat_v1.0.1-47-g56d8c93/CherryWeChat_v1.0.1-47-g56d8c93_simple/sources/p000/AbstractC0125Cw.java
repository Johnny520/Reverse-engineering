package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Cw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0125Cw {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f295a = null;

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f296b = null;

    /* JADX INFO: renamed from: c */
    public static final Object f297c = null;

    static {
        f295a = new ThreadLocal();
        f296b = new WeakHashMap(0);
        f297c = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m201a(Context r11, int r12, TypedValue r13, int r14, AbstractC0585Nj r15, boolean r16, boolean r17) {
        Resources r2 = r11.getResources();
        r2.getValue(r12, r13, true);
        CharSequence r0 = r13.string;
        if (r0 == null) goto L41;
        String r4 = r0.toString();
        Typeface r9 = null;
        if (r4.startsWith("res/") == true) goto L8;
        if (r15 == null) goto L33;
        r15.m1161c(-3);
    L33:
        if (r9 != null) goto L39;
        if (r15 != null) goto L39;
        if (r17 == true) goto L39;
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(r12) + " could not be retrieved.");
    L39:
        return r9;
    L8:
        int r02 = r13.assetCookie;
        C0161Dp r6 = AbstractC0871UB.f2755b;
        Typeface r03 = (Typeface) r6.m307f(AbstractC0871UB.m1708b(r2, r12, r4, r02, r14));
        if (r03 == null) goto L13;
        if (r15 == null) goto L12;
        new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(15, r15, r03));
    L12:
        r9 = r03;
        goto L33
    L13:
        if (r17 == true) goto L33;
    L31:
        if (r15 == null) goto L33;
        r15.m1161c(-3);
        goto L33
    L16:
        if (r4.toLowerCase().endsWith(".xml") == false) goto L22;
        InterfaceC0883Uh r1 = AbstractC1293cr.m2535N(r2.getXml(r12), r2);     // Catch: Throwable -> L31
        if (r1 != null) goto L21;
        if (r15 == null) goto L33;
        r15.m1161c(-3);     // Catch: Throwable -> L31
        goto L33
    L21:
        r9 = AbstractC0871UB.m1707a(r11, r1, r2, r12, r4, r13.assetCookie, r14, r15, r16);     // Catch: Throwable -> L31
        goto L33
    L22:
        int r132 = r13.assetCookie;     // Catch: Throwable -> L31
        Typeface r112 = AbstractC0871UB.f2754a.mo1764t(r11, r2, r12, r4, r14);     // Catch: Throwable -> L31
        if (r112 == null) goto L25;
        r6.m311j(AbstractC0871UB.m1708b(r2, r12, r4, r132, r14), r112);     // Catch: Throwable -> L31
    L25:
        if (r15 == null) goto L28;
        if (r112 == null) goto L29;
        new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(15, r15, r112));     // Catch: Throwable -> L31
        goto L28
    L29:
        r15.m1161c(-3);     // Catch: Throwable -> L31
    L28:
        r9 = r112;
        goto L33
    L41:
        throw new Resources.NotFoundException("Resource \"" + r2.getResourceName(r12) + "\" (" + Integer.toHexString(r12) + ") is not a Font: " + r13);
    }
}
