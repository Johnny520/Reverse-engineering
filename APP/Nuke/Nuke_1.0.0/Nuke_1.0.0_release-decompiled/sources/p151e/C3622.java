package p151e;

import android.view.Window;
import com.bumptech.glide.AbstractC1922d;
import java.io.ByteArrayOutputStream;
import p135b.C1827o;
import p147d1.C3618;
import p214o3.InterfaceC2798a;
import p222q0.C3675;
import p248u3.C3691;

/* JADX INFO: renamed from: e.۟۠ۧ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3622 {

    /* JADX INFO: renamed from: ۟ۡۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f11085 = -714;

    /* JADX INFO: renamed from: ۟ۡۧۢۨ, reason: not valid java name and contains not printable characters */
    public static void m6243(Object obj, Object obj2) {
        if (C3618.m6229() >= 0) {
            ((C1827o) obj).mo3296a((Window) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2798a m6244(Object obj) {
        if (C3675.m6556() > 0) {
            return AbstractC1922d.m3431l((InterfaceC2798a) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ */
    public static int m3665() {
        return 527 ^ C3691.f11157;
    }

    /* JADX INFO: renamed from: ۡۢۧ۠, reason: not valid java name and contains not printable characters */
    public static String m6245(String str) {
        String string = "";
        int i5 = 0;
        String str2 = "";
        while (i5 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i5)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i5).toString();
            i5++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i6 = 0; i6 < str.length(); i6 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i6)) << 4) | string.indexOf(str.charAt(i6 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i7 = 0; i7 < length; i7++) {
            byteArray[i7] = (byte) (byteArray[i7] ^ str2.charAt(i7 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۨۨۦۧ, reason: not valid java name and contains not printable characters */
    public static int m6247(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static String m6246(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
