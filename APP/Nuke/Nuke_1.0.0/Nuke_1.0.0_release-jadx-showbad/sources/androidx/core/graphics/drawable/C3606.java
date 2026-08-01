package androidx.core.graphics.drawable;

import android.app.Activity;
import android.view.View;
import java.io.ByteArrayOutputStream;
import p050I3.AbstractC0808h;
import p059L0.C3557;
import p112W2.InterfaceC1599a;
import p194l1.C3650;
import p196l4.C3651;
import p227r.C3677;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.۟ۢۢۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3606 {

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static int f11070 = 926;

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m6167(Object obj, Object obj2) {
        if (C3557.m5938() >= 0) {
            return AbstractC0808h.m1407a((String) obj, (InterfaceC1599a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static int m6169() {
        return (-286) ^ C3651.f11113;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m6170(boolean z5) {
        if (C3650.m6384() < 0) {
            return String.valueOf(z5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m6171(Object obj, Object obj2) {
        if (C3677.m6563() > 0) {
            ((Activity) obj).setContentView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m6172(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۡۡۧ, reason: not valid java name and contains not printable characters */
    public static String m6173(String str) {
        String string = "";
        int i5 = 0;
        String str2 = "";
        while (i5 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i5)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i5).toString();
            i5++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i6 = 0; i6 < str.length(); i6 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i6)) << 4) | string.indexOf(str.charAt(i6 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۦۨۢ, reason: not valid java name and contains not printable characters */
    public static String m6168(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
