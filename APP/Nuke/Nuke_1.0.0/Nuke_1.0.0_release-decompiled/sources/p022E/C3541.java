package p022E;

import java.io.ByteArrayOutputStream;
import p019D1.C3538;
import p095T.InterfaceC1339T0;

/* JADX INFO: renamed from: E.۟ۨۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3541 {

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public static int f11005 = 650;

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m5846(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i7 = 0; i7 < length; i7++) {
            byteArray[i7] = (byte) (byteArray[i7] ^ str2.charAt(i7 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۥۦۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m5847(Object obj) {
        if (C3538.m5836() > 0) {
            return ((InterfaceC1339T0) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static int m5848() {
        return (-1015) ^ C3540.f11004;
    }

    /* JADX INFO: renamed from: ۤۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m5849(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5850(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
