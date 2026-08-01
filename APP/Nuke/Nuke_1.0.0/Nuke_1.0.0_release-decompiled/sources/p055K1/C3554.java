package p055K1;

import com.bumptech.glide.load.C3616;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import me.dartcv.nuke.C3655;
import p000A.C3527;
import p044H3.AbstractC0646a;

/* JADX INFO: renamed from: K1.ۥۨۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3554 {

    /* JADX INFO: renamed from: ۟ۤۢۢۨ, reason: not valid java name and contains not printable characters */
    public static int f11018 = 384;

    /* JADX INFO: renamed from: ۟۠ۢۨۥ, reason: not valid java name and contains not printable characters */
    public static void m5923(Object obj) {
        if (C3527.m5776() > 0) {
            ((AbstractC0646a) obj).mo1120e();
        }
    }

    /* JADX INFO: renamed from: ۡۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m5924(Object obj, Object obj2) {
        if (C3616.m6216() > 0) {
            return ((MessageDigest) obj).digest((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static String m5925(String str) {
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

    /* JADX INFO: renamed from: ۤۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m5926() {
        return 86 ^ C3655.f11118;
    }

    /* JADX INFO: renamed from: ۨۡۦۥ, reason: not valid java name and contains not printable characters */
    public static int m5927(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static String m5922(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
