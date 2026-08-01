package p194l1;

import android.content.res.Configuration;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import p016C3.C0245b;
import p050I3.C3551;
import p062L3.C0990d;
import p110W0.C3584;
import p116X1.C3591;
import p214o3.InterfaceC2798a;

/* JADX INFO: renamed from: l1.۟ۤۨۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3649 {

    /* JADX INFO: renamed from: ۡ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static int f11111 = 538;

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m6375(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C3591.m6100() <= 0) {
            return ((C0245b) obj).m448b((String) obj2, (InterfaceC2798a) obj3, (C0990d) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۧ, reason: not valid java name and contains not printable characters */
    public static String m6376(String str) {
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

    /* JADX INFO: renamed from: ۣۡۨ۟, reason: not valid java name and contains not printable characters */
    public static void m6377(Object obj, Object obj2) {
        if (C3584.m6068() > 0) {
            ((Configuration) obj).setLocale((Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۢۦۧ, reason: not valid java name and contains not printable characters */
    public static int m6378() {
        return 310 ^ C3551.f11015;
    }

    /* JADX INFO: renamed from: ۤۨۢ۟, reason: not valid java name and contains not printable characters */
    public static int m6380(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۧۧۨ, reason: not valid java name and contains not printable characters */
    public static String m6379(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
