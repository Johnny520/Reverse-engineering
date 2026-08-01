package android.support.v4.graphics.drawable;

import androidx.versionedparcelable.C3608;
import java.io.ByteArrayOutputStream;
import p111W1.C3586;
import p117X2.AbstractC1665j;
import p135b.AbstractC1826n;
import p234s1.C3682;

/* JADX INFO: renamed from: android.support.v4.graphics.drawable.۠ۥۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3602 {

    /* JADX INFO: renamed from: ۣۧۦۨ, reason: not valid java name and contains not printable characters */
    public static int f11066 = 601;

    /* JADX INFO: renamed from: ۟۠ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static int m6147() {
        if (C3682.m6586() > 0) {
            return AbstractC1826n.f6223a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۡۤ, reason: not valid java name and contains not printable characters */
    public static String m6148(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m6149(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6150(Object obj, Object obj2) {
        if (C3608.m6181() < 0) {
            return AbstractC1665j.m2981a(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۢۦ, reason: contains not printable characters */
    public static int m6151() {
        return (-602) ^ C3586.f11050;
    }

    /* JADX INFO: renamed from: ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static String m6152(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
