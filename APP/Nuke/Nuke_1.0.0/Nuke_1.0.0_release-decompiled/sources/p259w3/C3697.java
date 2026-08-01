package p259w3;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import p041H0.C3547;
import p099T3.C1423b;
import p099T3.C1427f;
import p106V0.C3582;
import p255w.C3696;

/* JADX INFO: renamed from: w3.ۣ۟ۡ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3697 {

    /* JADX INFO: renamed from: ۟ۥۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f11163 = -135;

    /* JADX INFO: renamed from: ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static C1423b m6659() {
        if (C3696.m6657() <= 0) {
            return C1427f.Companion;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۨ, reason: not valid java name and contains not printable characters */
    public static int m6660() {
        return 434 ^ C3547.f11011;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟۠, reason: not valid java name and contains not printable characters */
    public static Object[] m6661(Object obj, int i5) {
        if (C3582.m6063() > 0) {
            return Arrays.copyOf((Object[]) obj, i5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۡۦ, reason: not valid java name and contains not printable characters */
    public static String m6662(String str) {
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

    /* JADX INFO: renamed from: ۣۦۢۤ, reason: not valid java name and contains not printable characters */
    public static int m6663(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۥۣۨ, reason: contains not printable characters */
    public static String m6664(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
