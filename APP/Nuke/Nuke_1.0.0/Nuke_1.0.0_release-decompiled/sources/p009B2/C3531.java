package p009B2;

import com.bumptech.glide.C3617;
import java.io.ByteArrayOutputStream;
import p011B4.AbstractC0231b;
import p047I0.AbstractC0713b;
import p095T.AbstractC1391v;
import p148d2.C3619;
import p220p4.C3673;

/* JADX INFO: renamed from: B2.ۡۦۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3531 {

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f10995 = -337;

    /* JADX INFO: renamed from: ۣ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m5794(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m5795(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m5796(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C3673.m6547() > 0) {
            return AbstractC0231b.m405p((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static void m5798(Object obj, Object obj2) {
        if (C3617.m6220() < 0) {
            ((AbstractC0713b) obj).setParentCompositionContext((AbstractC1391v) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m5799() {
        return (-478) ^ C3619.f11082;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m5797(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
