package p150d4;

import java.io.ByteArrayOutputStream;
import p057K3.C3555;
import p121Y1.C1753n;
import p252v2.C3693;
import p269y2.C3492b;

/* JADX INFO: renamed from: d4.ۢۤ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3621 {

    /* JADX INFO: renamed from: ۥۣۣۧ, reason: contains not printable characters */
    public static int f11084 = -366;

    /* JADX INFO: renamed from: ۟۠ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m6239() {
        return 746 ^ C3693.f11159;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static C3492b m6240(Object obj) {
        if (C3555.m5928() > 0) {
            return ((C1753n) obj).m3111E();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۨ, reason: not valid java name and contains not printable characters */
    public static String m6241(String str) {
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

    /* JADX INFO: renamed from: ۨ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m6242(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m6238(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
