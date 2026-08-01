package p015C2;

import android.support.v4.graphics.drawable.C3602;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import p056K2.C0891q;
import p132a3.C3600;
import p231r3.C3678;
import p231r3.C3679;
import p269y2.C3492b;

/* JADX INFO: renamed from: C2.۟ۦۦۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3536 {

    /* JADX INFO: renamed from: ۨۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f11000 = 685;

    /* JADX INFO: renamed from: ۟۠ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5822(Object obj) {
        if (C3678.m6567() >= 0) {
            return ((C3492b) obj).f10870g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m5824(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۦ, reason: not valid java name and contains not printable characters */
    public static int m5825() {
        return 566 ^ C3602.f11066;
    }

    /* JADX INFO: renamed from: ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static int m5826(Object obj) {
        if (C3679.m6572() > 0) {
            return ((String) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۦۧ, reason: not valid java name and contains not printable characters */
    public static C0891q m5827() {
        if (C3600.m6142() < 0) {
            return C0891q.f2780a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۥ, reason: contains not printable characters */
    public static String m5828(String str) {
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

    /* JADX INFO: renamed from: ۟ۡ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m5823(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
