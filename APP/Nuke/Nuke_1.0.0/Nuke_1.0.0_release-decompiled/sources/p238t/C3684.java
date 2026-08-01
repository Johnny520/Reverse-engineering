package p238t;

import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.AbstractC1924f;
import java.io.ByteArrayOutputStream;
import p054K.C3553;
import p114X.C3588;
import p121Y1.C1753n;
import p135b.AbstractActivityC1823k;
import p166g3.C3629;
import p178i3.C3644;

/* JADX INFO: renamed from: t.ۣ۟ۦۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3684 {

    /* JADX INFO: renamed from: ۟ۧۥۤۡ, reason: not valid java name and contains not printable characters */
    public static int f11150 = -426;

    /* JADX INFO: renamed from: ۣۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m6594(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i7 = 0; i7 < length; i7++) {
            byteArray[i7] = (byte) (byteArray[i7] ^ str2.charAt(i7 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۢۦۤ, reason: not valid java name and contains not printable characters */
    public static int m6595() {
        return (-260) ^ C3644.f11106;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m6596(Object obj, Object obj2) {
        if (C3553.m5916() < 0) {
            ((View) obj).setTag(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۥۢ, reason: not valid java name and contains not printable characters */
    public static C1753n m6597(Object obj) {
        if (C3588.m6086() >= 0) {
            return AbstractC1924f.m3507u(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۢۥ, reason: contains not printable characters */
    public static int m6598(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۡۡۥ, reason: contains not printable characters */
    public static void m6599(Object obj, Object obj2, Object obj3) {
        if (C3629.m6279() > 0) {
            ((AbstractActivityC1823k) obj).setContentView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static String m6593(short[] sArr, int i5, int i6, int i7) {
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = (char) (sArr[i5 + i8] ^ i7);
        }
        return new String(cArr);
    }
}
