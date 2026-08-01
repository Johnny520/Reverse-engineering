package p031F2;

import android.graphics.C3601;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import me.dartcv.nuke.ProtectedMainEntry;
import p091S.C3571;
import p097T1.C3574;
import p135b.C1809A;

/* JADX INFO: renamed from: F2.۟ۡۥۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3543 {

    /* JADX INFO: renamed from: ۟ۡۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int f11007 = -768;

    /* JADX INFO: renamed from: ۣ۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static C1809A m5857() {
        if (C3571.m6009() <= 0) {
            return ProtectedMainEntry.f8324a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static int m5858(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m5860(Object obj) {
        if (C3601.m6143() > 0) {
            return ((Iterable) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m5861(String str) {
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

    /* JADX INFO: renamed from: ۧ۠۠۟, reason: not valid java name and contains not printable characters */
    public static int m5862() {
        return 927 ^ C3574.f11038;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۧ, reason: not valid java name and contains not printable characters */
    public static String m5859(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
