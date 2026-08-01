package p164g1;

import android.view.View;
import java.io.ByteArrayOutputStream;
import p015C2.C3535;
import p044H3.AbstractC0646a;
import p079P2.C3564;
import p090R3.C3569;
import p104U3.AbstractC1478b;

/* JADX INFO: renamed from: g1.ۣۣ۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3627 {

    /* JADX INFO: renamed from: ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static int f11090 = -967;

    /* JADX INFO: renamed from: ۟ۤۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m6267(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m6268(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i6 = 0; i6 < length; i6++) {
            byteArray[i6] = (byte) (byteArray[i6] ^ str2.charAt(i6 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m6269() {
        return (-451) ^ C3569.f11033;
    }

    /* JADX INFO: renamed from: ۧۡۦۦ, reason: not valid java name and contains not printable characters */
    public static AbstractC0646a[] m6270() {
        if (C3564.m5974() > 0) {
            return AbstractC1478b.f5169a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m6271(Object obj, int i5) {
        if (C3535.m5818() <= 0) {
            ((View) obj).setVisibility(i5);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m6266(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
