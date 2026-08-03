package p083u;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.abc.core.features.RunnableC0714z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p000A.C0005f;
import p080s.AbstractC1066a;
import p085v.AbstractC1100a;

/* JADX INFO: renamed from: u.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1083b {

    /* JADX INFO: renamed from: a */
    public static final float[][] f4189a = null;

    /* JADX INFO: renamed from: b */
    public static final float[][] f4190b = null;

    /* JADX INFO: renamed from: c */
    public static final float[] f4191c = null;

    /* JADX INFO: renamed from: d */
    public static final float[][] f4192d = null;

    static {
        f4189a = new float[][]{new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
        f4190b = new float[][]{new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
        f4191c = new float[]{95.047f, 100.0f, 108.883f};
        f4192d = new float[][]{new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    }

    /* JADX INFO: renamed from: b */
    public static int m2568b(Context r2, int r3, int r4) {
        TypedValue r02 = new TypedValue();
        r2.getTheme().resolveAttribute(r3, r02, true);
        if (r02.resourceId == 0) goto L5;
        return r3;
    L5:
        return r4;
    }

    /* JADX INFO: renamed from: c */
    public static String m2569c(TypedArray r02, int r1, int r2) {
        String r12 = r02.getString(r1);
        if (r12 == null) goto L5;
        return r12;
    L5:
        return r02.getString(r2);
    }

    /* JADX INFO: renamed from: d */
    public static int m2570d(float r15) {
        if (r15 >= 1.0f) goto L7;
        return -16777216;
    L7:
        if (r15 <= 99.0f) goto L10;
        return -1;
    L10:
        float r1 = (r15 + 16.0f) / 116.0f;
        if (r15 <= 8.0f) goto L13;
        float r152 = (r1 * r1) * r1;
    L14:
        float r3 = (r1 * r1) * r1;
        if (r3 <= 0.008856452f) goto L17;
        boolean r5 = true;
    L18:
        if (r5 == false) goto L20;
        float r8 = r3;
    L21:
        if (r5 == true) goto L24;
        r3 = ((r1 * 116.0f) - 16.0f) / 903.2963f;
    L24:
        float[] r02 = f4191c;
        return AbstractC1100a.m2592a(r8 * r02[0], r152 * r02[1], r3 * r02[2]);
    L20:
        r8 = ((r1 * 116.0f) - 16.0f) / 903.2963f;
        goto L21
    L17:
        r5 = false;
        goto L18
    L13:
        r152 = r15 / 903.2963f;
        goto L14
    }

    /* JADX INFO: renamed from: e */
    public static float m2571e(int r6) {
        float r62 = r6 / 255.0f;
        if (r62 > 0.04045f) goto L7;
        float r63 = r62 / 12.92f;
    L6:
        return r63 * 100.0f;
    L7:
        r63 = (float) Math.pow((r62 + 0.055f) / 1.055f, 2.4000000953674316d);
        goto L6
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC1086e m2572h(XmlResourceParser r23, Resources r24) {
    L3:
        int r1 = r23.next();
        if (r1 == 2) goto L7;
        if (r1 != 1) goto L3;
    L7:
        if (r1 != 2) goto L64;
        r23.require(2, null, "font-family");
        if (r23.getName().equals("font-family") == false) goto L60;
        TypedArray r4 = r24.obtainAttributes(Xml.asAttributeSet(r23), AbstractC1066a.f4091b);
        String r7 = r4.getString(0);
        String r9 = r4.getString(4);
        String r11 = r4.getString(5);
        int r12 = r4.getResourceId(1, 0);
        int r13 = r4.getInteger(2, 1);
        int r15 = r4.getInteger(3, 500);
        String r8 = r4.getString(6);
        r4.recycle();
        if (r7 == null) goto L18;
        if (r9 == null) goto L18;
        if (r11 == null) goto L18;
    L15:
        if (r23.next() == 3) goto L78;
        m2574j(r23);
        goto L15
    L78:
        return new C1089h(new C0005f(r7, r9, r11, m2573i(r24, r12)), r13, r15, r8);
    L18:
        ArrayList r42 = new ArrayList();
    L20:
        if (r23.next() == 3) goto L57;
        if (r23.getEventType() != 2) goto L20;
        if (r23.getName().equals("font") == true) goto L26;
        m2574j(r23);
        goto L20
    L26:
        TypedArray r72 = r24.obtainAttributes(Xml.asAttributeSet(r23), AbstractC1066a.f4092c);
        int r82 = 8;
        if (r72.hasValue(8) == true) goto L30;
        r82 = 1;
    L30:
        int r17 = r72.getInt(r82, 400);
        if (r72.hasValue(6) == false) goto L33;
        int r83 = 6;
    L35:
        if (1 != r72.getInt(r83, 0)) goto L37;
        boolean r22 = true;
    L38:
        int r84 = 9;
        if (r72.hasValue(9) == true) goto L42;
        r84 = 3;
    L42:
        int r92 = 7;
        if (r72.hasValue(7) == true) goto L46;
        r92 = 4;
    L46:
        String r21 = r72.getString(r92);
        int r18 = r72.getInt(r84, 0);
        if (r72.hasValue(5) == false) goto L49;
        int r85 = 5;
    L50:
        int r19 = r72.getResourceId(r85, 0);
        String r20 = r72.getString(r85);
        r72.recycle();
    L52:
        if (r23.next() == 3) goto L54;
        m2574j(r23);
        goto L52
    L54:
        r42.add(new C1088g(r17, r18, r19, r20, r21, r22));
        goto L20
    L49:
        r85 = 0;
        goto L50
    L37:
        r22 = false;
        goto L38
    L33:
        r83 = 2;
        goto L35
    L57:
        if (r42.isEmpty() == false) goto L79;
    L61:
        return null;
    L79:
        return new C1087f((C1088g[]) r42.toArray(new C1088g[0]));
    L60:
        m2574j(r23);
        goto L61
    L64:
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: i */
    public static List m2573i(Resources r8, int r9) {
        if (r9 == 0) goto L4;
        TypedArray r02 = r8.obtainTypedArray(r9);
    L11:
        th = move-exception;
        r02.recycle();
        throw th;
    L7:
        if (r02.length() != 0) goto L13;
        List r82 = Collections.emptyList();     // Catch: Throwable -> L11
        r02.recycle();
        return r82;
    L13:
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L11
        if (AbstractC1085d.m2578a(r02, 0) != 1) goto L25;
        int r92 = 0;
    L17:
        if (r92 >= r02.length()) goto L29;
        int r3 = r02.getResourceId(r92, 0);     // Catch: Throwable -> L11
        if (r3 == 0) goto L24;
        String[] r32 = r8.getStringArray(r3);     // Catch: Throwable -> L11
        ArrayList r4 = new ArrayList();     // Catch: Throwable -> L11
        int r5 = r32.length;     // Catch: Throwable -> L11
        int r6 = 0;
    L21:
        if (r6 >= r5) goto L23;
        r4.add(Base64.decode(r32[r6], 0));     // Catch: Throwable -> L11
        r6 = r6 + 1;     // Catch: Throwable -> L11
        goto L21
    L23:
        r1.add(r4);     // Catch: Throwable -> L11
    L24:
        r92 = r92 + 1;     // Catch: Throwable -> L11
    L29:
        r02.recycle();
        return r1;
    L25:
        String[] r83 = r8.getStringArray(r9);     // Catch: Throwable -> L11
        ArrayList r93 = new ArrayList();     // Catch: Throwable -> L11
        int r33 = r83.length;     // Catch: Throwable -> L11
        int r42 = 0;
    L26:
        if (r42 >= r33) goto L28;
        r93.add(Base64.decode(r83[r42], 0));     // Catch: Throwable -> L11
        r42 = r42 + 1;     // Catch: Throwable -> L11
        goto L26
    L28:
        r1.add(r93);     // Catch: Throwable -> L11
        goto L29
    L4:
        return Collections.emptyList();
    }

    /* JADX INFO: renamed from: j */
    public static void m2574j(XmlResourceParser r3) {
        int r02 = 1;
    L3:
        if (r02 <= 0) goto L11;
        int r1 = r3.next();
        if (r1 != 2) goto L7;
        r02 = r02 + 1;
        goto L3
    L7:
        if (r1 != 3) goto L3;
        r02 = r02 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: k */
    public static float m2575k() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m2576a(int r4) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0714z0(this, r4, 2));
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo2163f(int r1);

    /* JADX INFO: renamed from: g */
    public abstract void mo2164g(Typeface r1);
}
