package yyds;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: yyds.ᛸᛳᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1741 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final float[][] f8793 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final float[][] f8794 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final float[] f8795 = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final float[][] f8796 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final boolean[] f8792 = new boolean[3];

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static int m3462(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f8795;
        return AbstractC2138.m4077(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m3463(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo1926 = ((InterfaceC0849) arrayList.get(i)).mo1926(byteBuffer);
                AtomicReference atomicReference = AbstractC0282.f1527;
                if (imageHeaderParser$ImageTypeMo1926 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo1926;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC0282.f1527;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static int m3464(ArrayList arrayList, InputStream inputStream, C2267 c2267) throws IOException {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new C0839(inputStream, c2267);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    int iMo1925 = ((InterfaceC0849) arrayList.get(i)).mo1925(inputStream, c2267);
                    if (iMo1925 != -1) {
                        return iMo1925;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final boolean m3465(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C2326 m3466() {
        return new C2326(null);
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static C2766 m3467(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        C2766 c2766 = new C2766();
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "permission");
        while (true) {
            int next = xmlResourceParser.next();
            String name = xmlResourceParser.getName();
            if (next == 3 && AbstractC0879.m1959("receiver", name)) {
                return c2766;
            }
            if (next == 2 && AbstractC0879.m1959("intent-filter", name)) {
                ArrayList arrayList = c2766.f13499;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    c2766.f13499 = arrayList;
                }
                arrayList.add(m3474(xmlResourceParser));
            } else if (next == 2 && AbstractC0879.m1959("meta-data", name)) {
                ArrayList arrayList2 = c2766.f13500;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    c2766.f13500 = arrayList2;
                }
                arrayList2.add(m3473(xmlResourceParser));
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static C2766 m3468(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        C2766 c2766 = new C2766();
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        xmlResourceParser.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "supportsPictureInPicture", false);
        while (true) {
            int next = xmlResourceParser.next();
            String name = xmlResourceParser.getName();
            if (next == 3 && (AbstractC0879.m1959("activity", name) || AbstractC0879.m1959("activity-alias", name))) {
                break;
            }
            if (next == 2 && AbstractC0879.m1959("intent-filter", name)) {
                ArrayList arrayList = c2766.f13499;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    c2766.f13499 = arrayList;
                }
                arrayList.add(m3474(xmlResourceParser));
            } else if (next == 2 && AbstractC0879.m1959("meta-data", name)) {
                ArrayList arrayList2 = c2766.f13500;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    c2766.f13500 = arrayList2;
                }
                arrayList2.add(m3473(xmlResourceParser));
            }
        }
        return c2766;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m3469(C0859 c0859, C2296 c2296, C0944 c0944) {
        c0944.f4357 = -1;
        C2141 c2141 = c0944.f4385;
        int[] iArr = c0944.f4401;
        C2141 c21412 = c0944.f4341;
        C2141 c21413 = c0944.f4403;
        C2141 c21414 = c0944.f4344;
        C2141 c21415 = c0944.f4382;
        c0944.f4396 = -1;
        int[] iArr2 = c0859.f4401;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = c21415.f10575;
            int iM2072 = c0859.m2072() - c21414.f10575;
            c21415.f10571 = c2296.m4310(c21415);
            c21414.f10571 = c2296.m4310(c21414);
            c2296.m4317(c21415.f10571, i);
            c2296.m4317(c21414.f10571, iM2072);
            c0944.f4357 = 2;
            c0944.f4371 = i;
            int i2 = iM2072 - i;
            c0944.f4394 = i2;
            int i3 = c0944.f4361;
            if (i2 < i3) {
                c0944.f4394 = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = c21413.f10575;
        int iM2067 = c0859.m2067() - c21412.f10575;
        c21413.f10571 = c2296.m4310(c21413);
        c21412.f10571 = c2296.m4310(c21412);
        c2296.m4317(c21413.f10571, i4);
        c2296.m4317(c21412.f10571, iM2067);
        if (c0944.f4399 > 0 || c0944.f20 == 8) {
            C0972 c0972M4310 = c2296.m4310(c2141);
            c2141.f10571 = c0972M4310;
            c2296.m4317(c0972M4310, c0944.f4399 + i4);
        }
        c0944.f4396 = 2;
        c0944.f4354 = i4;
        int i5 = iM2067 - i4;
        c0944.f4355 = i5;
        int i6 = c0944.f4402;
        if (i5 < i6) {
            c0944.f4355 = i6;
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static float m3470() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static C2766 m3471(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        C2766 c2766 = new C2766();
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "permission");
        while (true) {
            int next = xmlResourceParser.next();
            String name = xmlResourceParser.getName();
            if (next == 3 && AbstractC0879.m1959("service", name)) {
                return c2766;
            }
            if (next == 2 && AbstractC0879.m1959("intent-filter", name)) {
                ArrayList arrayList = c2766.f13499;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    c2766.f13499 = arrayList;
                }
                arrayList.add(m3474(xmlResourceParser));
            } else if (next == 2 && AbstractC0879.m1959("meta-data", name)) {
                ArrayList arrayList2 = c2766.f13500;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    c2766.f13500 = arrayList2;
                }
                arrayList2.add(m3473(xmlResourceParser));
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static float m3472(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static C0152 m3473(XmlResourceParser xmlResourceParser) {
        C0152 c0152 = new C0152();
        c0152.f947 = "";
        c0152.f947 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        c0152.f948 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value");
        xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "resource", 0);
        return c0152;
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static C2766 m3474(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        C2766 c2766 = new C2766();
        c2766.f13499 = new ArrayList();
        c2766.f13500 = new ArrayList();
        while (true) {
            int next = xmlResourceParser.next();
            String name = xmlResourceParser.getName();
            if (next == 3 && AbstractC0879.m1959("intent-filter", name)) {
                return c2766;
            }
            if (next == 2) {
                if (AbstractC0879.m1959("action", name)) {
                    c2766.f13499.add(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name"));
                } else if (AbstractC0879.m1959("category", name)) {
                    c2766.f13500.add(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name"));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m3475(ArrayList arrayList, InputStream inputStream, C2267 c2267) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C0839(inputStream, c2267);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo1929 = ((InterfaceC0849) arrayList.get(i)).mo1929(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo1929 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo1929;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static C0913 m3476(Context context, int i) throws IOException {
        C1572 c1572;
        C0913 c0913 = new C0913();
        XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser(i, "AndroidManifest.xml");
        do {
            try {
                if (xmlResourceParserOpenXmlResourceParser.getEventType() == 2) {
                    String name = xmlResourceParserOpenXmlResourceParser.getName();
                    if (AbstractC0879.m1959("manifest", name)) {
                        String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(null, "package");
                        if (attributeValue == null) {
                            attributeValue = "";
                        }
                        c0913.f4163 = attributeValue;
                    }
                    if (AbstractC0879.m1959("uses-sdk", name)) {
                        xmlResourceParserOpenXmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minSdkVersion", 0);
                    }
                    if (AbstractC0879.m1959("uses-permission", name) || AbstractC0879.m1959("uses-permission-sdk-23", name) || AbstractC0879.m1959("uses-permission-sdk-m", name)) {
                        ArrayList arrayList = (ArrayList) c0913.f4165;
                        C1859 c1859 = new C1859();
                        c1859.f9344 = Integer.MAX_VALUE;
                        c1859.f9343 = xmlResourceParserOpenXmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
                        c1859.f9344 = xmlResourceParserOpenXmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxSdkVersion", Integer.MAX_VALUE);
                        xmlResourceParserOpenXmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "usesPermissionFlags", 0);
                        arrayList.add(c1859);
                    }
                    if (AbstractC0879.m1959("queries", name)) {
                        ArrayList arrayList2 = (ArrayList) c0913.f4161;
                        String attributeValue2 = xmlResourceParserOpenXmlResourceParser.getAttributeValue(null, "package");
                        arrayList2.add(attributeValue2 != null ? attributeValue2 : "");
                    }
                    if (AbstractC0879.m1959("application", name)) {
                        C1572 c15722 = new C1572();
                        xmlResourceParserOpenXmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
                        c15722.f7969 = xmlResourceParserOpenXmlResourceParser.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "requestLegacyExternalStorage", false);
                        c0913.f4160 = c15722;
                    }
                    if (AbstractC0879.m1959("activity", name) || AbstractC0879.m1959("activity-alias", name)) {
                        ((ArrayList) c0913.f4164).add(m3468(xmlResourceParserOpenXmlResourceParser));
                    }
                    if (AbstractC0879.m1959("service", name)) {
                        ((ArrayList) c0913.f4162).add(m3471(xmlResourceParserOpenXmlResourceParser));
                    }
                    if (AbstractC0879.m1959("receiver", name)) {
                        ((ArrayList) c0913.f4159).add(m3467(xmlResourceParserOpenXmlResourceParser));
                    }
                    if (AbstractC0879.m1959("meta-data", name) && (c1572 = (C1572) c0913.f4160) != null) {
                        if (((ArrayList) c1572.f7970) == null) {
                            c1572.f7970 = new ArrayList();
                        }
                        ((ArrayList) ((C1572) c0913.f4160).f7970).add(m3473(xmlResourceParserOpenXmlResourceParser));
                    }
                }
            } catch (Throwable th) {
                if (xmlResourceParserOpenXmlResourceParser != null) {
                    try {
                        xmlResourceParserOpenXmlResourceParser.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } while (xmlResourceParserOpenXmlResourceParser.next() != 1);
        xmlResourceParserOpenXmlResourceParser.close();
        return c0913;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m3477(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C2807(2, 36, 1));
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static boolean m3478(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static View m3479(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final boolean m3480(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static final void m3481(C1853 c1853, InterfaceC0274 interfaceC0274, boolean z) {
        Object objM3628 = c1853.m3628();
        Throwable thMo3627 = c1853.mo3627(objM3628);
        Object c2658 = thMo3627 != null ? new C2658(thMo3627) : c1853.mo3620(objM3628);
        if (!z) {
            interfaceC0274.mo812(c2658);
            return;
        }
        C1118 c1118 = (C1118) interfaceC0274;
        AbstractC1320 abstractC1320 = c1118.f5139;
        Object obj = c1118.f5138;
        InterfaceC2213 interfaceC2213 = abstractC1320.f6070;
        Object objM1832 = AbstractC0797.m1832(interfaceC2213, obj);
        C2101 c2101M981 = objM1832 != AbstractC0797.f3657 ? AbstractC0319.m981(abstractC1320, interfaceC2213, objM1832) : null;
        try {
            c1118.f5139.mo812(c2658);
            if (c2101M981 == null || c2101M981.m3995()) {
                AbstractC0797.m1826(interfaceC2213, objM1832);
            }
        } catch (Throwable th) {
            if (c2101M981 == null || c2101M981.m3995()) {
                AbstractC0797.m1826(interfaceC2213, objM1832);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public abstract Constructor mo2340(Class cls);

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public /* synthetic */ void m3482() {
        if (AbstractC1511.m3135(mo1373())) {
            return;
        }
        throw new IllegalArgumentException(("Failed to make the member \"" + this + "\" accessible. Please check if the member is accessible or if the security manager allows it.").toString());
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public abstract boolean mo2341(Class cls);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public abstract Method mo2342(Class cls, Field field);

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public abstract Member mo1373();

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public abstract String[] mo2343(Class cls);
}
