package p248u3;

import com.bumptech.glide.AbstractC1926h;
import java.io.ByteArrayOutputStream;
import p037G2.C3545;
import p203n.C3658;

/* JADX INFO: renamed from: u3.ۣ۟ۨۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3692 {

    /* JADX INFO: renamed from: ۥۣۧ۠, reason: contains not printable characters */
    public static int f11158 = -741;

    /* JADX INFO: renamed from: ۟۠ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m6637(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m6638() {
        return (-350) ^ C3545.f11009;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۦ, reason: not valid java name and contains not printable characters */
    public static void m6639(Object obj, boolean z5) {
        if (C3658.m6419() > 0) {
            ((AbstractC1926h) obj).mo3584C(z5);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۡ, reason: not valid java name and contains not printable characters */
    public static String m6640(String str) {
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

    /* JADX INFO: renamed from: ۥۣۢۢ, reason: contains not printable characters */
    public static String m6641(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
