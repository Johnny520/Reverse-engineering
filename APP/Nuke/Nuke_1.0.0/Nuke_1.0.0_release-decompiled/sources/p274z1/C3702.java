package p274z1;

import android.view.View;
import com.bumptech.glide.AbstractC1925g;
import java.io.ByteArrayOutputStream;
import me.dartcv.nuke.C3656;
import p002A1.AbstractC0116E;
import p002A1.InterfaceC0145r;
import p015C2.C3535;
import p107V1.C3583;
import p117X2.AbstractC1665j;
import p139c.C3614;

/* JADX INFO: renamed from: z1.ۣۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3702 {

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static int f11168 = 926;

    /* JADX INFO: renamed from: ۟ۤ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m6683(Object obj) {
        if (C3656.m6410() > 0) {
            AbstractC1665j.m2991k((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡۦۥ, reason: not valid java name and contains not printable characters */
    public static int m6684(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۦۦ, reason: not valid java name and contains not printable characters */
    public static void m6685(Object obj, Object obj2) {
        if (C3535.m5818() <= 0) {
            AbstractC1925g.m3537n((String) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۠ۨ, reason: contains not printable characters */
    public static String m6686(String str) {
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
        for (int i7 = 0; i7 < length; i7++) {
            byteArray[i7] = (byte) (byteArray[i7] ^ str2.charAt(i7 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m6687() {
        return 3 ^ C3614.f11078;
    }

    /* JADX INFO: renamed from: ۨۢۢۡ, reason: not valid java name and contains not printable characters */
    public static void m6688(Object obj, Object obj2) {
        if (C3583.m6066() >= 0) {
            AbstractC0116E.m165g((View) obj, (InterfaceC0145r) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m6682(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
