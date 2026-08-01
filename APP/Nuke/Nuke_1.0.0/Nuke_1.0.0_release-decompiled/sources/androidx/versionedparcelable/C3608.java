package androidx.versionedparcelable;

import androidx.window.area.reflectionguard.C3609;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import p031F2.C3544;
import p135b.C1809A;
import p135b.C1837y;
import p231r3.C3679;

/* JADX INFO: renamed from: androidx.versionedparcelable.ۣۤۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3608 {

    /* JADX INFO: renamed from: ۢ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static int f11072 = 33;

    /* JADX INFO: renamed from: ۟ۥۥۡۢ, reason: not valid java name and contains not printable characters */
    public static C1837y m6180(Object obj) {
        if (C3609.m6187() < 0) {
            return ((C1809A) obj).m3285a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۤ, reason: not valid java name and contains not printable characters */
    public static int m6181() {
        return 291 ^ C3679.f11145;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m6182(String str) {
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

    /* JADX INFO: renamed from: ۥ۟ۧ۠, reason: contains not printable characters */
    public static Iterator m6183(Object obj) {
        if (C3544.m5863() < 0) {
            return ((ArrayList) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۠ۡ, reason: contains not printable characters */
    public static int m6184(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static String m6179(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
