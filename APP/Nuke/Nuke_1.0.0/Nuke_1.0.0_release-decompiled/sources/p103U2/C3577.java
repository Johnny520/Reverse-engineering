package p103U2;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.io.ByteArrayOutputStream;
import java.util.List;
import me.dartcv.nuke.C3655;
import p019D1.C3538;
import p061L2.AbstractC0972l;
import p200m2.C3654;

/* JADX INFO: renamed from: U2.ۣۡۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3577 {

    /* JADX INFO: renamed from: ۥۨ۟ۨ, reason: contains not printable characters */
    public static int f11041 = 381;

    /* JADX INFO: renamed from: ۟ۢۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m6035(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۢۦۤ, reason: not valid java name and contains not printable characters */
    public static List m6036(Object obj) {
        if (C3538.m5836() >= 0) {
            return AbstractC0972l.m1987K((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۦۢ, reason: not valid java name and contains not printable characters */
    public static Signature[] m6037(Object obj) {
        if (C3654.m6403() > 0) {
            return ((SigningInfo) obj).getApkContentsSigners();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static int m6038(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۥ */
    public static int m2749() {
        return 486 ^ C3655.f11118;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۤ, reason: contains not printable characters */
    public static String m6039(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
