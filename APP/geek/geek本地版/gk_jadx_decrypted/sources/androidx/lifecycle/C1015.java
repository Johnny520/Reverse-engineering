package androidx.lifecycle;

import com.google.android.material.carousel.C1040;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: androidx.lifecycle.۟۟ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1015 {

    /* JADX INFO: renamed from: ۟ۥ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static int f5659 = -242;

    /* JADX INFO: renamed from: ۠ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int m2962(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۣ۟ۦ, reason: contains not printable characters */
    public static int m2964() {
        return 681 ^ C1040.f5684;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۦ, reason: contains not printable characters */
    public static String m2965(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m2963(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
