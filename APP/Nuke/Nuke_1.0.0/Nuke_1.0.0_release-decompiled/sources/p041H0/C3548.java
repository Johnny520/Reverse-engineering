package p041H0;

import java.io.ByteArrayOutputStream;
import p016C3.C0245b;
import p151e.C3622;
import p214o3.InterfaceC2798a;
import p259w3.C3697;

/* JADX INFO: renamed from: H0.ۤ۠ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3548 {

    /* JADX INFO: renamed from: ۤۦۤ۟, reason: not valid java name and contains not printable characters */
    public static int f11012 = 399;

    /* JADX INFO: renamed from: ۠ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m5881() {
        return (-530) ^ C3697.f11163;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m5882(String str) {
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

    /* JADX INFO: renamed from: ۢ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m5883(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۟ۦۤ, reason: contains not printable characters */
    public static void m5884(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C3622.m3665() > 0) {
            ((C0245b) obj).m450d((String) obj2, obj3, (InterfaceC2798a) obj4);
        }
    }

    /* JADX INFO: renamed from: ۧۤ۠۟, reason: not valid java name and contains not printable characters */
    public static String m5885(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
